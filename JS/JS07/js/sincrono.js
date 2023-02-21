alert("cohorte 23");  //este pedo bloquea el resto de operaciones, no continua hasta que se le de en aceptar
console.log("holaaa");   
alert("dia del gatito");
console.log("bye");

/*
setTimeout(  //es una function asincrona, que hace ese timer entregue el resultado de esa funcion

    function (){
        console.log("hola guape");
    }, 1000)
    console.log("sorpresa");

*/

const myCallback = () => console.log("Hola mundoxXx con retraso");
setTimeout(myCallback); //(myCallback,1000); para agregar tiempo en ms de retraso

console.log("sorpresa"); //buscar mas sobre funciones flecha, es menos texto, mejores practicas
//todo esto hace lo mismo que la funcion de arribita