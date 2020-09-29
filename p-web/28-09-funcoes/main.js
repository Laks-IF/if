const buttonAlert = document.querySelector("#q5 > button");

function showMessage() {
  alert("Disciplina: Programação Web");
}

buttonAlert.addEventListener("click", (e) => showMessage());

const randomNumberBtn = document.querySelector("#q6 > button");

function randomNumber() {
  const random = Math.round(Math.random() * (100 - 1) + 1);

  return alert(`Random number ${random}`);
}

randomNumberBtn.addEventListener("click", (e) => randomNumber());
