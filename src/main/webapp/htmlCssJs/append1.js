const list = document.getElementById("list")
const add = document.getElementById("add")

add.addEventListener('click', function(){
    //<li>d</li> 만들기
    // let li = document.createElement('li');
    // let text = document.createTextNode('d');
    // li.appendChild(text)
    // list.append(li); 
    
    
    //<li><button>Click</button></li> 만들기
    let li = document.createElement('li');
    let button = document.createElement('button')
    let txt = document.createTextNode('Click')

    //클릭버튼 글씨 빨간색+배경색 노란색 만들기
    let attr = document.createAttribute("class");
    attr.value='btn'; //"btn bg"
    button.setAttributeNode(attr)

    attr.value= attr.value+' bg'

    button.appendChild(txt)
    li.appendChild(button)
    list.append(li);
    //list.prepend(li)
    //list.before(li)
    //list.after(li)
})