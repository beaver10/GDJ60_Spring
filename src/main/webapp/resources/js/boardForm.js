//BoardForm.js

//딜리트 누르면 post 

const del = document.getElementById("delete")
const frm = document.getElementById("frm")


del.addEventListener("click",function(){
    let check = confirm("정말 삭제하시겠습니까?");
    if(check){
        frm.setAttribute("action","./delete");
        frm.setAttribute("method", "post");
        frm.submit();

    }


})