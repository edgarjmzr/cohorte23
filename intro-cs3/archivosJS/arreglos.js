let miVariable = 34;

let miArreglo = []; //declaracion literal
let miArreglo01 = new Array(); // declaracion por instancia

let miArreglo02 = [31,32,33,34]
console.log("dato de miArreglo en el indice 0 - " + miArreglo02[0]);
console.log("dato de miArreglo en el indice 1 - " + miArreglo02[1]);
console.log("dato de miArreglo en el indice 2 - " + miArreglo02[2]);
console.log("dato de miArreglo en el indice 3 - " + miArreglo02[3]);
console.log("el tamaño o numero de elementos del arreglo02 es: " + miArreglo02.length);


let miArreglo03 = ["Hola", "que", "tal"];
console.log (miArreglo03[0]);
console.log (miArreglo03[1]);
console.log (miArreglo03[2]);
console.log("el tamaño o numero de elementos del arreglo03 es: " + miArreglo03.length);

let miArreglo04 = [{nombre: "Hugo"}, {apellido: "Fernandez"}, {edad: 23}];
console.log("Elemento del arreglo de tipo objeto miArreglo04 " + miArreglo04[0].nombre);
console.log("Elemento del arreglo de tipo objeto miArreglo04 " + miArreglo04[1].apellido);
console.log("Elemento del arreglo de tipo objeto miArreglo04 " + miArreglo04[2].edad);
console.log("el tamaño o numero de elementos del arreglo04 es: " + miArreglo04.length);

let nuevoArreglo00 = [3,6,1,4]
console.log("Orden de mi arregloNuevo con sort: " + nuevoArreglo00.sort());
console.log("Orden de mi arregloNuevo método pop(): " + nuevoArreglo00.pop());
console.log("Orden de mi arregloNuevo método push: " + nuevoArreglo00.push(10));
console.log("Orden de mi arregloNuevo método reverse(): " + nuevoArreglo00.reverse());

let otroArreglo = ["que", "hola", "como", "tal"]
console.log(" con sort: " + otroArreglo.sort());
console.log("método pop(): " + otroArreglo.pop());
console.log("método push: " + otroArreglo.push("estas"));
console.log("método reverse(): " + otroArreglo.reverse());

console.log("javascript"[2]); // javascript es solo una palabra, el número [2] se refiere a la asignación 2, el cual sería al caracter (posicion 3) v
console.log("javascript".length); // cantidad de caracteres que tiene nuestra string

let matriz = [
            [1,2,3],
            [4,5,6],
            [7,8,9]
            ]; //tres elementos, asign 0 y 1 y 2
console.log("tamaño: " + matriz.length);
console.log(matriz[1][1])
console.log(matriz[2][1])
console.log(matriz[0][2])


