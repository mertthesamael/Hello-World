let guessNumber = Math.floor(Math.random() * (11 - 0))
console.log(guessNumber+" //Hello There Developer !")
let heart = 3
let state = 1


function guess(guessNumber, heart) {
  let input = document.querySelector("#input")

  if (input.value == guessNumber) {
    document.querySelector("body").classList.add("success")
    document.querySelector(".number").innerHTML = guessNumber;
    document.querySelector(".win").innerHTML = "You are RNG God ! <img src='image/refresh-yellow.png' onclick='refresh()'>"
  } else if (input.value != guessNumber && state == 1) {
    document.querySelector("body").classList.add("fail")

    heart -= 1
    heartFunc(heart)
    console.log(heart)
    state = 2
    const myTimeout = setTimeout(removeClass, 150)

  } else if (input.value != guessNumber && state == 2) {
    document.querySelector("body").classList.add("fail")
    heart -= 2
    heartFunc(heart)
    console.log(heart)
    state = 3
    const myTimeout = setTimeout(removeClass, 150)
  } else if (input.value != guessNumber && state == 3) {
    document.querySelector("body").classList.add("fail")
    heart -= 3
    heartFunc(heart)
    console.log(heart)
    document.querySelector("body").classList.add("lose")
    showUp()
    goinDark()
    state = 4

  }


}

function removeClass() {
  document.querySelector("body").classList.remove("fail")
}

function showUp() {
  document.querySelector(".try-again").classList.add("block")
}

function refresh() {
  window.location.reload()
}

function goinDark() {
  document.querySelector(".full").classList.add("filter")
}

function heartFunc(heart) {
  let h1 = document.querySelector(".heart-1")
  let h2 = document.querySelector(".heart-2")
  let h3 = document.querySelector(".heart-3")
  if (heart == 3) {


  } else if (heart == 2) {

    h3.src = ("image/resized-white.png")
  } else if (heart == 1) {
    h3.src = ("image/resized-white.png")
    h2.src = ("image/resized-white.png")
  } else if (heart === 0) {
    h3.src = ("image/resized-white.png")
    h2.src = ("image/resized-white.png")
    h1.src = ("image/resized-white.png")
  }
}
