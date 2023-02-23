
const add = document.getElementById("add");
const fileList = document.getElementById("fileList")

let count = 0;
let max =1;
let param='pic';

function setName(p){
    param=p
}

function setMax(m){
    max=m;
}

add.addEventListener('click', function(){

    if(count>=max){
        alert('첨부파일은 '+max+'개 까지만 가능합니다')
        return;
    }else{
        count++;
        
    //div만들기
        let d = document.createElement('div')
        let c= document.createAttribute('class')
        c.value="col-12"
        d.setAttributeNode(c);
        
        //라벨 속성
        let label1 = document.createElement('label')
        
        let for1 = document.createAttribute('for')
        for1.value ='files';
        label1.setAttributeNode(for1)
        
        c= document.createAttribute('class')
        c.value='form-label'
        label1.setAttributeNode(c)
        
        let txt = document.createTextNode("이미지 첨부")
        label1.appendChild(txt)

        //인풋 속성
        let input = document.createElement('input')
        
        let type = document.createAttribute('type')
        type.value='file'
        input.setAttributeNode(type)
        
        c = document.createAttribute('class')
        c.value='form-control'
        input.setAttributeNode(c)
        
        let id = document.createAttribute('id')
        id.value='files'
        input.setAttributeNode(id)
        
        let name1 = document.createAttribute('name')
        name1.value=param
        input.setAttributeNode(name1)
        
        //조합
        d.appendChild(label1)
        d.appendChild(input)
        
        fileList.prepend(d);
        
        }
    })
