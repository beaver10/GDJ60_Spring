const id = document.getElementById("id");
const pw = document.getElementById("pw");

const iderror=document.getElementById("idError")
const pwerror=document.getElementById("pwError")
const pw2error=document.getElementById("pw2Error")
const nameerror=document.getElementById("nameError")

const btn = document.getElementById("btn");
const frm = document.getElementById("form");

// let idcheck=false
// let pwNullcheck=false
// let pwLengthcheck=false
// let pw2check=false
// let namecheck=false

let checks =[false,false,false,false,false]


//id 필수 입력
id.addEventListener('blur',function(){
    if(id.value){
        iderror.innerHTML=""
        //idcheck=true
        checks[0]=true;
    }else{
        iderror.innerHTML="ID는 필수입니다"
        checks[0]=false;
    }
})

//비밀번호 길이 입력
pw.addEventListener('keyup',function(){
    if(!pw.value.length<6||!pw.value.length>12){
        pwerror.innerHTML=""
        //pwLengthcheck=true
        checks[1]=true;
    }else{
        pwerror.innerHTML="비밀번호는 최소6자리, 최대 12자리로 입력해주세요"
        checks[1]=false;
    }
})

//비밀번호 필수 입력
pw.addEventListener('blur',function(){
    if(pw.value){
        //pwNullcheck=true
        checks[2]=true;
    }else{
        pwerror.innerHTML="PW는 필수입니다"
        checks[2]=false;
    }
})

pw.addEventListener("change", function(){
    checks[3]=false;
    pw2.value='';
    pw2error.innerHTML="비밀번호가 일치하지 않습니다"
    pw2error.classList.replace('blueResult','redResult')

})


//비밀번호 일치 확인
pw2.addEventListener("blur", function(){
    if(pw2.value==pw.value){
        pw2error.classList.replace('redResult', 'blueResult')
        pw2error.innerHTML="비밀번호가 일치합니다"
        //pw2check=true
        checks[3]=true;
    }else{
        pw2error.innerHTML="비밀번호가 일치하지 않습니다."
        pw2error.classList.replace('blueResult','redResult')

        checks[3]=false;
    }
})

const name1 = document.getElementById("memberName")

//이름 필수 입력
name1.addEventListener('keyup',function(){
    if(name1.value){
        nameerror.innerHTML=""
        //namecheck=true
        checks[4]=true;
    }else{
        nameerror.innerHTML="이름은 필수입니다"
        checks[4]=false;
    }
})

//form 전송



// btn.addEventListener("click",function(){
//    if(idcheck&&pwLengthcheck&&pwNullcheck&&pw2check&&namecheck){
//     alert("성공")
//    }else{
//     alert("필수 항목을 입력하세요")
//    }
// })    

btn.addEventListener("click",function(){
    if(!checks.includes(false)){
        alert("회원가입 성공")
    }else{
        alert("필수 항목을 입력하세요")
    }
})
