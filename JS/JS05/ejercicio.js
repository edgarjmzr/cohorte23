//Optimizar los codigos de abajo

//ejercicio 1
// if (GPIAcomulativo>2.0){
//     if(Unidadestotales>=120){
//         console.log("Puede graduarse!");
//     }
// }

if (GPIAcomulativo>2.0){
    if(Unidadestotales>=120){
        console.log("Puede graduarse!");
    }
}


//ejercicio 2
if(cspCalificacion>=75){
    console.log ("Eres elegible para la graduacion!");
}
if (progCalificacion>=75){
    console.log("Eres elegible para la graduacion!");
}


//ejercicio 3
let texto = "Hola Mundo";

let newTexto = texto.split(" ").map(
    (word)=>{
        return word.split("")
    }
)

let result = newTexto.map((word2)=>{return word2.join(".")}).join(" ")

console.log(result)
//
