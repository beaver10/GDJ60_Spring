
//css 선택자 유형 (한개는 #, 여러개는 .)
const btn1 = document.querySelector("#btn1") //document.getElementById("btn1");

//querySelector == querySelectorAll[0];

const buttons = document.querySelectorAll(".buttons") //document.getElementsByClassName("buttons");

const d1 = document.querySelector("#d1 > .buttons li")

btn1.addEventListener("click", function(){
    console.log("버튼 1 클릭");

})

for(let i of buttons){
    i.addEventListener("click", function(){

        console.log("버튼들 클릭")
        
    })
}