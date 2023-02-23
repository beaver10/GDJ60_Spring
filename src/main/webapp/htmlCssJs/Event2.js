const b1 = document.getElementById("b1");
const p1 = document.getElementById("p1");
const b2 = document.getElementById("b2");
const p2 = document.getElementById("p2");

const naver = document.getElementById("naver"); //a tag


//엘리먼트 기본동작 중단 
//preventDefualt()
naver.addEventListener('click',function(event){
    console.log("click naver")
    event.preventDefault();
})

//////////////////캡쳐링과 중단
//버튼
b1.addEventListener('click',function(e){
    console.log('button click');
    console.log(e)
}, true)
//div
p1.addEventListener('click',function(event){
    console.log('div click');
    console.log(event)
    event.stopPropagation();
}, true)

//////////////////버블링과 중단
//버튼
b2.addEventListener('click',function(e){
    console.log('button2 click');
    console.log(e)
    //e.stopPropagation();
    console.log("Button This :", this)
},false)
//div
p2.addEventListener('click',function(event){
    console.log('div2 click');
    console.log(event)
    console.log("CurrentTarget : ", event.currentTarget);
    console.log("Target : ", event.target);
    console.log("this : ",this)
},false)
