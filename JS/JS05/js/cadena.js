let texto = "Hola Mundo"; //texto se puede tratar tanto como variable como objeto y como arreglo

// let mensaje = "El texto tiene " + texto.length + "caracteres";

let mensaje = "";

for (let index = 0; index < texto.length; index++) {
    mensaje += texto[index] + "";
}
mensaje = mensaje.trim()
console.log(mensaje);


/************** */
let texto = "Hola Mundo";
let mensaje = texto.toUpperCase();
console.log(mensaje);


/************** */
let texto = "Hola Mundo";
let palabra = texto.substr(5); //el primer parametro es el indice desde donde quiero que tome caracteres, y el segundo hasta donde. Ese rango es lo que te mostrara la consola. -5 seria lo mismo pero contando la reves
console.log(palabra);

/************** */
let texto = "Hola Mundo";
let palabra = texto.substring(5,9); //el 7 no lo toma, es uno pa atras
console.log(palabra);

/************** */
let texto = "Hola Mundo";
let palabra = texto.split(" "); // HAY QUE VER ESTO
console.log(palabra[0]+ " / "+ palabra[1]);

/************** */
let texto = "Hola Mundo";  //MUY IMPORTANTEEEEEEEEEEEEEEEEE
if (texto.includes("l")) {
    console.log("---> L");
}else {
    console.log("Ese caracter no esta en texto");
}





 