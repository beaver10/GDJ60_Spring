

let xthttp = new XMLHttpRequest();

xthttp.open('GET', '/notice/listTop?');

xthttp.send();

xthttp.addEventListener('readystatechange' , function(){
    if(this.readyState==4 && this.status==200){
        console.log(this.responseText);
        document.getElementById("noticeList").innerHTML = this.responseText.trim();
    }
})

