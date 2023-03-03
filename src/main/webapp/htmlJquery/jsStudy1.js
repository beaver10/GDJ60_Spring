
//css 선택자 유형 (한개는 #, 여러개는 .)
const btn1 = document.querySelector("#btn1") //document.getElementById("btn1");

//querySelector == querySelectorAll[0];

const buttons =document.querySelectorAll(".buttons"); //document.getElementsByClassName("buttons"); 

const d1 = document.querySelector("#d1 > .buttons li")



let ar =[1,2,3];

//1. 구방법
for(let i =0; i<ar.length;i++){
    console.log(ar[i]);
}

//2. 신방법
console.log('For of');
for(let a of ar){
    console.log(a);
}

//3.인덱스 번호가 들어감 (0부터 시작)
//클래스의 멤버들을 순환해서 뽑아올때 사용
console.log('For in');
for(let j in ar){
    console.log(j)
    //이렇게 하면 원래대로 됨
    console.log(ar[j])
}

//foreach
console.log('For each')
ar.forEach(function(v, i, list){
    //배열에는 ,로 구분해서 사용
    console.log('v :',v, 'i : ', i, 'ar : ',list);
});






btn1.addEventListener("click", function(){
    console.log("버튼 1 클릭");
    
})

// for(let i of buttons){
    //     i.addEventListener("click", function(){
        
        //         console.log("버튼들 클릭")
        
        //     })
        // }
        
        
        
        
        
// alert(buttons);
// alert(ar);
// console.log(buttons)
// console.log(ar); 

// buttons.forEach(function(v, i){
//     v.addEventListener('click', function(){
//         console.log('click')

//     })
// })
        
        
        
console.log(parseInt('1')+1);
console.log('1'-1+1);





