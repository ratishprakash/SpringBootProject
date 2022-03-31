var count=0
function sayhello(){
    if( chktick.checked){
        count++
    }
    else{
        count--
    }


}
function display(){
    document.write(count)
}