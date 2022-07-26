function game(){
let rng = Math.floor(Math.random()* (7-1))+1
let rng2 = Math.floor(Math.random()* (7-1))+1

switch (rng){
  case 1:
document.querySelector(".img1").setAttribute("src","images/dice1.png")
break;
  case 2:
document.querySelector(".img1").setAttribute("src","images/dice2.png")
break;
  case 3:
document.querySelector(".img1").setAttribute("src","images/dice3.png")
break;
  case 4:
document.querySelector(".img1").setAttribute("src","images/dice4.png")
break;
  case 5 :
document.querySelector(".img1").setAttribute("src","images/dice5.png")
break;
  case 6 :
document.querySelector(".img1").setAttribute("src","images/dice6.png")
break;
}

switch (rng2){
  case 1:
document.querySelector(".img2").setAttribute("src","images/dice1.png");
break;
  case 2:
document.querySelector(".img2").setAttribute("src","images/dice2.png");
break;
  case 3 :
document.querySelector(".img2").setAttribute("src","images/dice3.png");
break;
  case 4 :
document.querySelector(".img2").setAttribute("src","images/dice4.png");
break;
  case 5 :
document.querySelector(".img2").setAttribute("src","images/dice5.png");
break;
  case 6 :
document.querySelector(".img2").setAttribute("src","images/dice6.png");
break;
}

                  /*********Result*********/
if (rng > rng2){
document.querySelector(".big-text").innerHTML = "🚩Player 1 Wins !";
}else if(rng < rng2){
document.querySelector(".big-text").innerHTML = "Player 2 Wins !🚩";
}else
document.querySelector(".big-text").innerHTML = "🚩DRAW !🚩";
}
window.onload = function() {
    var reloading = sessionStorage.getItem("reloading");
    if (reloading) {
        sessionStorage.removeItem("reloading");
        game();
    }
}
                /*********Reload Function*********/
function reloadP() {
    sessionStorage.setItem("reloading", "true");
    document.location.reload();
}
