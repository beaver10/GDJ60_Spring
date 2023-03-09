// //const replyAdd = document.getElementById('replyAdd')
// const replyContent = document.getElementById('replyContent')
// const commentListResult = document.getElementById('commentListResult')
// const replyUpdate = document.getElementById('replyUpdate')
// // const pageLink = document.querySelectorAll("page-Link");
// const contentsConfirm = document.getElementById("contentsConfirm")
// const closeModal = document.getElementById("closeModal");


//이벤트 - jquery로 . 속성도 jquery로

//댓글등록 NEW버전 요즘 방식
$("#replyAdd").click(function(){
    alert('add')
    //JS에서 사용할 가상의 Form태그 생성
    const form1 = new FormData(); //<form></form>
    form1.append("contents",$("#replyContent").val()); 
    // <form><input type="text" name="contents" value="aaa"></input></form>
    form1.append("bookNumber",$("#replyAdd").attr("data-book-bookNumber"))
        //<form><input type="text" name="bookNumber" value="bbb"></input></form>

        fetch('../bankbookComment/add',{
            method:'POST',
            //headers:{},
            body:form1,//body: 요청시 전달할 값      
        }).then((response)=> response.text())
        .then((res)=>{
            if(res.trim()==1){
                alert("댓글 등록");
                console.log(res.trim());
                $("#replyContent").val("");
                getList(1);
            }else{
                alert("댓글 등록 실패");
                console.log(res.trim());
            }
        }).catch(()=>{
            console.log("에러발생");
        });
});






// //------------------------------add 예전 방식
// replyAdd.addEventListener('click', function(){
    
//     let xhttp = new XMLHttpRequest();
    
//     xhttp.open("POST", "../bankbookComment/add")
    
//     xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    
//     xhttp.send("contents="+replyContent.value+"&bookNumber="+replyAdd.getAttribute('data-book-bookNumber'));
    
//     xhttp.addEventListener('readystatechange', function(){
//         if(this.readyState==4&&this.status==200){
//             if(this.responseText.trim()==1){
//                 console.log(this.responseText)
//                 alert("댓글 등록")
//                 replyContent.value=''
//                 getList(1);
//             }else{
//                 alert("댓글 등록 실패")
//             }
//         }
//     })
    
// })





//리스트
getList(1);

function getList(page){

    fetch("/bankbookComment/list?bookNumber="+replyAdd.getAttribute('data-book-bookNumber')+"&page="+page, {
        method:'GET',
        //GET과 HEAD메서드는 body속성을 가질 수 없음
        })
        .then((response)=>response.text())
        .then((res)=>{
            
                $("#commentListResult").html(res.trim());
            }   
        )


    //--------------------------------예전 방식
    // let count =0;

    // let xhttp = new XMLHttpRequest();
    
    // xhttp.open("GET", "/bankbookComment/list?bookNumber="+replyAdd.getAttribute('data-book-bookNumber')+"&page="+page);

    // xhttp.send();

    // xhttp.addEventListener('readystatechange', function(){
    //     if(this.readyState==4&&this.status==200){
    //         commentListResult.innerHTML=this.responseText.trim();

    //     }
    // })

    //0이 출력 : 비동기 방식이기 때문에 
    //console.log("count:",count);


}

//nodeList일때 forEach 사용가능 하지만 여기서 의미없음...
// pageLink.forEach(function(){
//     console.log("p:",p);
// })


//page
    $("#commentListResult").on("click", ".page-link",function(e) {
        let page = $(this).attr("data-board-page");
        getList(page);
        e.preventDefault();
    
    });

    
// delete
$("#commentListResult").on('click','.del',function(e){

    fetch("../bankbookComment/delete", {
        method:'POST',
         headers:{
             "Content-type":"application/x-www-form-urlencoded"
         },
         body:"num="+$(this).attr("data-comment-num")
         //응답객체에서 Data 추출
    }).then((response)=>{return response.text()}) //then(function(response){return response.text()})   
            //추출한 Data 사용
         .then((res)=>{
          if(res.trim()>0){
              alert('댓글이 삭제 되었습니다');
              getList(1);
           }else {
              alert('삭제 실패');
           }
      })
           .catch(()=>{
              alert('에러 발생');
           });

    e.preventDefault();
    }
)




    //update Modal 띄우기
    $("#commentListResult").on("click",".update" ,function(e) {
            let num = $(this).attr("data-comment-num");
            $("#contents").val($("#contents"+num).text());

            $("#contentsConfirm").attr("data-comment-num", num);
            
        e.preventDefault();
        
    });
    
    
    //update Post
   $("#contentsConfirm").click(function(){
        let num = $(this).attr("data-comment-num");

        fetch("../bankbookComment/update", {
            method: 'POST',
            headers:{"Content-type":"application/x-www-form-urlencoded"},
            body:"num="+$(this).attr("data-comment-num")+"&contents="+$("#contents").val()
        }).then((response)=>response.text())
            .then((res)=>{
                if(res.trim()>0){
                    alert("댓글수정완료");  
                    $("#closeModal").click();
                    getList(1);
                }else{
                    alert("댓글수정실패");
                }
            }).catch(()=>{
                alert("에러발생");
                })

   })
      


