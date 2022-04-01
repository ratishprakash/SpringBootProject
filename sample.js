var count=0
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
    // var mydiv=document.createElementById("mydiv")
    // var checkbox = document.createElement('input');
    // checkbox.type = "checkbox";
    // checkbox.name = "name";
    // checkbox.value = "value";
    // checkbox.id = "id";  
    // var label=document.createElement("label")
    // label.htmlFor="id"
    // label.appendchild(document.createTextNode("Theory Of Computation"))
    // mydiv.appendChild(checkbox);
    // mydiv.appendChild(label)
    alert(count)
}