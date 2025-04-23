// Seleccionamos el input donde se muestra la operación y el resultado
const display = document.getElementById("text_calc");

// Seleccionamos todos los botones
const buttons = document.querySelectorAll("button");

// Variable para guardar la operación actual
let currentInput = "";

// Recorremos todos los botones y les asignamos una función al hacer clic
buttons.forEach(button => {
  button.addEventListener("click", () => {
    const value = button.id; // Obtenemos el ID del botón (es el mismo que el valor que representa)

    switch (value) {
      case "C":  // Borra todo
      case "Delete":
        currentInput = "";
        break;

      case "CE": // Borra el último carácter
        currentInput = currentInput.slice(0, -1);
        break;

      case "=": // Evalúa la expresión
        try {
          // Reemplazamos símbolos no válidos para JavaScript
          const expression = currentInput.replace(/x/g, "*").replace(/,/g, ".");
          currentInput = eval(expression).toString(); // Calculamos y convertimos a string
        } catch (e) {
          currentInput = "Error"; // Si hay un error en la operación
        }
        break;

      default: // Cualquier otro botón se añade a la operación actual
        currentInput += value;
    }

    // Mostramos la operación o resultado en pantalla
    display.value = currentInput;
  });
});
