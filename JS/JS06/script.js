/* 

Que encontramos en el arbol del DOM?

-Node: Unidad más básica dentro del documento. Puede ser una etiqueta, un texto dentro de una etiqueta, o un comentario, etc.

<title> NODO
Manipulacion DOM  //Es un nodo, pero es hijo del title
</title>

-Document: Tambien es un nodo, del tipo documento, es el nodo raiz a partir del cual se desarrollan o generan todos los demas nodos.

-Element: son todos aquellos definidos por etiquetas div, img, h1, p

-Attributes: img: width, src, alt
                a: href
                NODOS que dan informacion asociada al tipo de elemento

- comentario: comentarios y otros elementos que estan dentro del HTML, son considerados nodos.

*/

/*Como leer nodos de mi DOM

Metodos tradicionales (que se usan en versiones antiguas de JS)

    - documen.ElementById (botonSuma)
    - documen.ElementByTagName (<button>)
    - documen.ElementByClassName (botones)

*/

/*var elementoID = document.getElementById("botonSuma");
console.log(elementoID);

var elementoEtiqueta = document.getElementsByTagName("button");
console.log(elementoEtiqueta);
console.log("Este es el primer elemento de mi coleccion de botones", elementoEtiqueta[0]);

var elementoClaseName = documento.getElementsByClassName("botones");
console.log(elementoClassName);
*/

/*
Metodos recientes 

    - document.querySelector(#botonSuma) SOLO el primer resultado de la busqueda 
     - document.querySelectorAll(.botones) TODOS los resultados de la busqueda

     # es ID
     . es clase
 

     var unElemento = document.querySelector("#input1");
console.log(unElemento);

    var variosElementos = document.querySelectorAll(".botones");
    console.log(variosElementos);



Creacion de nodos

- document.createElement(tipoNodo)

*/

//Creacion de una etiqueta del tipo imagen
var ImagenPerrito = document.createElement("img");

//Creamos atributos a la etiqueta
// imagenPerrito.src = "https://www.petdarling.com/wp-content/uploads/2021/01/cachorros.jpg"
// imagenPerrito.alt = "Foto de perrito tierno"
// imagenPerrito.style.width = "150px";
// imagenPerrito.style.borderRadius = "100px"

//Poner elementos o nodos en el html
// document.body.append(imagenPerrito);

//actualizar nodos
//1er paso: identificar el nodo que quiero cambiar (outer)
//2do paso: modificar el nodo (inner)

var resultadoQueCambia = document.getElementById("resultado");

resultadoQueCambia.innerHTML = "Saludos, cambie el texto xd";


//CREACION DE NODOS

//DE AQUI SACAS LOS NUMEROS
var input1 = document.getElementById("input1");
var input2 = document.getElementById("input2");

// AQUI LIGAS BOTONES
var botonSuma = document.getElementById("botonSuma");
var botonResta = document.getElementById("botonResta");
var botonMultiplicacion = document.getElementById("botonMultiplicacion");
var botonDivision = document.getElementById("botonDivision");

// AQUI VA A APARECER EL RESULTADO
var resultado = document.getElementById("resultado");



//Construimos las funciones de nuestra calculadora

function suma(){
    let valor1 = parseInt(input1.value);  //numero 1
    let valor2 = parseInt(input2.value); //numero 2
    let suma = valor1 + valor2; //calculo la suma
    resultado.innerHTML = suma; //pongo el resultado en su lugar
}

function resta(){
    let valor1 = parseInt(input1.value);  //numero 1
    let valor2 = parseInt(input2.value); //numero 2
    let resta = valor1 - valor2; //calculo la resta
    resultado.innerHTML = resta; //pongo el resultado en su lugar
    
}

function multiplicacion(){
    let valor1 = parseInt(input1.value);  //numero 1
    let valor2 = parseInt(input2.value); //numero 2
    let multiplicacion = valor1 * valor2; //calculo la multiplicacion
    resultado.innerHTML = multiplicacion; //pongo el resultado en su lugar
    
}

function division(){
    let valor1 = parseInt(input1.value);  //numero 1
    let valor2 = parseInt(input2.value); //numero 2
    let division = valor1 / valor2; //calculo la division
    resultado.innerHTML = division; //pongo el resultado en su lugar
    
}

/*Como se crea un evento (addEventListener)

    - node.addEventListener ("evento a escuchar", lo que quiero que haga cuandoi se escuche)
    
        -node (nodo donde aterrizo el evento)
        -addEventListener (palabra reservada para usar el evento)
        - evento para escuchar (click, mouseover, etc)
        - Lo que quiero que haga (la llamada de la funcion)

    */

botonSuma.addEventListener("click", suma);
botonResta.addEventListener("click", resta);
botonMultiplicacion.addEventListener("click", multiplicacion);
botonDivision.addEventListener("click", division);

/*

Manipulacion del DOM


    - Metodos para acceder a elementos 

        - document.getElementById
        - document.getElementsByTagName
        - document.getElementosByClassName


    - Metodos para crear elementos  

        - document.createElement(etiqueta)
        - document.createTextNode(texto) - Investigar


    - Metodos para insertar elementos

        - parentElement.append
        - parentElement.insertBefore
        - parentElement.insertAdjacentElement


    - Metodos para modificar elementos

        - node.outerHTML (leer o referenciar el elemento)
        - node.innerHTML (modificar el elemento)


*/

//Primer paso: definir con que voy a interactuar (almaceno en una variable)
const textoAModificar = document.querySelector("#h1")

function cambiarColor(color){
    textoAModificar.style.color = color;
}




