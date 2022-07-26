var started = false;
$(document).keypress(function() {
  if (!started) {
    $("#level-title").text("Level " + level);
    nextSequence();
    started = true;
  }
});
  let level = 0
  let gamePattern = []
  let buttonColors = ["green","red","yellow","blue"]
  let userClickedPattern = []

function nextSequence(){
    userClickedPattern = []
  unbind()
  let randomNumber = Math.floor(Math.random() * 4)
  let randomChosenColor = buttonColors[randomNumber]
  gamePattern.push(randomChosenColor)
  level++
  $("h1").text("Level "+level)

    $("#"+randomChosenColor).fadeOut(100).fadeIn(100).fadeOut(100).fadeIn(100);
    playSound(randomChosenColor)

}

$(".btn").click(function(){
  let userChosenColor = this.id
 userClickedPattern.push(userChosenColor)
 console.log(gamePattern)
  playSound(userChosenColor)
  animatePress(userChosenColor)
  checkAnswer(userClickedPattern.length-1)
})
function checkAnswer(currentLevel){
  if (userClickedPattern[currentLevel] == gamePattern[currentLevel]){
    if (userClickedPattern.length === gamePattern.length){

      setTimeout(function () {
        nextSequence();
      }, 1000);

    }

}else{
console.log("fail")
$("body").addClass("game-over")
setTimeout(function(){
  $("body").removeClass("game-over")
},200)
$("h1").text("Game Over, Press Any Key to Restart")
$("body").keypress(startOver)
}
}



function playSound(name){
  if(name == "green"){
   new Audio("sounds/green.mp3").play()
 }else if (name == "red"){
   new Audio("sounds/red.mp3").play()
 }else if (name == "yellow"){
   new Audio("sounds/yellow.mp3").play()
 }else if (name == "blue"){
   new Audio("sounds/blue.mp3").play()
 }
}

function animatePress(currentColor){
  $("#"+currentColor).addClass("pressed")
  setTimeout(function (){
      $("#"+currentColor).removeClass("pressed")
  }, 100)
}
function unbind(){
  $("body").unbind()
}
function startOver(){
  level = 0
  gamePattern =[]
  started = false

}
