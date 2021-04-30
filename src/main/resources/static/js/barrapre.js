var input = document.querySelector("input[type=range]");
  actualizarInput(input);

input.addEventListener("input", function(evt) {actualizarInput(input);},false);

function actualizarInput(input) {
  input.style.setProperty("--value", input.value);
}