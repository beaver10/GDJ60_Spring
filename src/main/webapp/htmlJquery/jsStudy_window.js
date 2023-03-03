const btn1 = document.getElementById("btn1");

btn1.addEventListener('click', function(){
   // open("./new.html", 'test', 'width=200, height=170, top=100, left=100');
    clearInterval(st)
})

//setTimeOut
setTimeout(function(){
    alert('timeout');
},1000);

let st = setInterval(function(){
    console.log('interval')
}, 1000);