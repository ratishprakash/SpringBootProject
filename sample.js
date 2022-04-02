var count=0
var inner_count=0
function sayhello(){
    if( chktick.checked)
        count++
    else 
        count--
}
function sayhello1(){
    if(chktick1.checked)
        count++
    else
        count--
}
function sayhello2(){
    if(chktick2.checked)
        count++
    else 
        count--
}

function location1(){
    // if (inner_count>0){ 
    //     var ul=document.getElementById("list")
    //     ul.remove()
    //     var terms=document.createElement("ul")
    //     terms.setAttribute('id','list')
    // }
    var ul=document.getElementById("list")
    if(chktick.checked){
        var li=document.createElement("li")
        li.appendChild(document.createTextNode(chktick.name))
        ul.appendChild(li)
    }
    if(chktick1.checked){
        var li=document.createElement("li")
        li.appendChild(document.createTextNode(chktick1.name))
        ul.appendChild(li)
    }
    if(chktick2.checked){
        var li=document.createElement("li")
        li.appendChild(document.createTextNode(chktick2.name))
        ul.appendChild(li)
    }
    inner_count++
    
    
}