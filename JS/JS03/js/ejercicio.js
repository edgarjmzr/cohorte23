let diaNumero = parseInt(prompt("Escribe qué número de día es hoy (donde 0 es domingo y 6 es sábado)"));

if (diaNumero == 0){
    document.write("<h2>El día de hoy es domingo uwu</h2>");
} else if (diaNumero == 1){
    document.write("<h2>El día de hoy es lunes uwu</h2>");
} else if (diaNumero == 2){
    document.write("<h2>El día de hoy es martes uwu</h2>");
} else if (diaNumero == 3){
    document.write("<h2>El día de hoy es miércoles uwu</h2>");
} else if (diaNumero == 4){
    document.write("<h2>El día de hoy es jueves uwu</h2>");
} else if (diaNumero == 5){
    document.write("<h2>El día de hoy es viernes uwu</h2>");
} else if (diaNumero == 6){
    document.write("<h2>El día de hoy es sábado uwu</h2>");
} else {
    document.write(" <h2>número de día inválido :( </h2> ");
 }

 // ver ejemplo de Vic para otra solución