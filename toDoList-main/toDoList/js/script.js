var list = document.querySelector('#list');

function gizle(){
  "this.parentElement.style.display = 'none';"
}
function newElement (event){

    
    if (document.querySelector("#task").value !==''){
      list.innerHTML += "<li>" + '<span onclick="this.parentElement.style.display ='+ "'none';"+ '"'+">"+document.querySelector("#task").value + " <a class=" + "'close'" + "onclick=" + "'closed()'" +">" + "X"+ "</span>"+"</a></li>"; 
    }else{
      alert("Hatalı Giriş")
    }
}

 const kapat = document.querySelectorAll(".close")
function closed() {
    var x = document.getElementsByClassName("close").parentElement.nodeName;
    var div = this.parentElement;
    div.style.display = "none";
  }


list.addEventListener('click', function(ev) {
  if (ev.target.tagName === 'LI') {
    ev.target.classList.toggle('checked');
  }
}, false);


