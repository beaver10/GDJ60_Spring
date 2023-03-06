const replyAdd = document.getElementById('replyAdd')
const replyContent = document.getElementById('replyContent')
const commentListResult = document.getElementById('commentListResult')
const replyUpdate = document.getElementById('replyUpdate')
// const pageLink = document.querySelectorAll("page-Link");


//add
replyAdd.addEventListener('click', function(){
    
    let xhttp = new XMLHttpRequest();
    
    xhttp.open("POST", "../bankbookComment/add")
    
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    
    xhttp.send("contents="+replyContent.value+"&bookNumber="+replyAdd.getAttribute('data-book-bookNumber'));
    
    xhttp.addEventListener('readystatechange', function(){
        if(this.readyState==4&&this.status==200){
            if(this.responseText.trim()==1){
                console.log(this.responseText)
                alert("댓글 등록")
                replyContent.value=''
                getList(1);
            }else{
                alert("댓글 등록 실패")
            }
        }
    })
    
})

getList(1);

//리스트 하단 숫자

function getList(page){
    let xhttp = new XMLHttpRequest();
    
    xhttp.open("GET", "/bankbookComment/list?bookNumber="+replyAdd.getAttribute('data-book-bookNumber')+"&page="+page);

    xhttp.send();

    xhttp.addEventListener('readystatechange', function(){
        if(this.readyState==4&&this.status==200){
            commentListResult.innerHTML=this.responseText.trim();

        }
    })

    //0이 출력 : 비동기 방식이기 때문에 
    //console.log("count:",count);


}

//nodeList일때 forEach 사용가능 하지만 여기서 의미없음...
// pageLink.forEach(function(){
//     console.log("p:",p);
// })


//page
    commentListResult.addEventListener("click",function(e) {
        let pageLink = e.target;
        if(pageLink.classList.contains("page-link")){
            let page = pageLink.getAttribute("data-board-page");
            getList(page);
        }
        e.preventDefault();
    
    });

//delete
    commentListResult.addEventListener("click",function(e) {
        let del = e.target;
        if(del.classList.contains("del")){
            let xhttp = new XMLHttpRequest();
            xhttp.open("POST", "/bankbookComment/delete");
            xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
            xhttp.send("num="+del.getAttribute("data-comment-num"));

            xhttp.addEventListener('readystatechange', function(){
                if(this.readyState==4&&this.status==200){
                    let result = this.responseText.trim();
                    if(result>0){
                        alert("댓글이 삭제되었습니다.")
                        getList(1);
                    }else{
                        alert("댓글 삭제에 실패했습니다")

                    }
                }
            })

        }
        e.preventDefault();

    });


    //update
    commentListResult.addEventListener("click",function(e) {
        let update = e.target;
        if(update.classList.contains("update")){
          //console.log(update.parentNode.previousSibling.previousSibling.previousSibling.previousSibling.previousSibling)
            let num = update.getAttribute("data-comment-num");
            let contents= document.getElementById("contents"+num)
            //contents.innerHTML='<textarea>'+contents.innerHTML+'</textarea>'
            contents.firstChild.removeAttribute("readonly");

            //update 버튼 누르면 확인 버튼 나오게
            let btn = document.createElement("button");
            let attr = document.createAttribute("class");
            attr.value = "btn btn-outline-primary";
            btn.setAttributeNode(attr);
            contents.appendChild(btn);
            attr = document.createTextNode("확인");
            btn.appendChild(attr);

            btn.addEventListener("click",function(){
                console.log(contents.firstChild.value)
                console.log(num)

                let xhttp = new XMLHttpRequest();
                xhttp.open("POST", "../bankbookComment/update");
                xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
                xhttp.send("num="+num+"&contents="+contents.firstChild.value)

                xhttp.addEventListener('readystatechange', function(){
                    if(this.readyState==4&&this.status==200){
                        let result = this.responseText.trim();
                        if(result>0){
                            alert("댓글이 수정되었습니다.")
                            getList(1);
                        }else{
                            alert("댓글 수정에 실패했습니다")
    
                        }
                    }
                })

            })

        }
        e.preventDefault();

    });



