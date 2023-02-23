const d1 = document.getElementById("d1") //div
const add = document.getElementById("add") //button
const d1_1 = document.getElementById("d1_1")
const result = document.getElementById("result")
const dels = document.getElementsByClassName("dels")

let idx = 0;



result.addEventListener('click',function(e){
    // console.log(e.currentTarget, e.target)
    // console.log(e.target.classList.contains('dels'))
    if(e.target.classList.contains('dels')){
       let id=  e.target.getAttribute('data-delete-id')
       document.getElementById(id).remove()
       console.log('delete : '+id)
    }
})



add.addEventListener('click', function(){
    let d = document.createElement("div")
    let btn = document.createElement("button")

    //button
    let n = document.createTextNode("DELETE")

    let attr = document.createAttribute("class")
    attr.value="dels";
    
    btn.setAttributeNode(attr);
    btn.append(n)
    d.appendChild(btn)

    attr = document.createAttribute("data-delete-id")
    attr.value="del"+idx;

    btn.setAttributeNode(attr);

    //id
    attr=document.createAttribute("id")
    attr.value='del'+idx
    d.setAttributeNode(attr)
    idx++;


    result.append(d);


    for(let i =0; i<dels.length;i++){
        dels[i].addEventListener('click', function(){
          //  console.log("dels")
        })
    }
    
})