let miVariable = 5;
//let miArray = new Array();

console.log("miArray" + miArray[0]);
console.log("miArray " + miArray[1]);


console.log("miArray " + miArray[0][1]);
console.log("miArray " + miArray[0][2]);
console.log("miArray " + miArray[2][1]);
console.log("miArray " + miArray[1][2]);
console.log("miArray " + miArray[1][0]);

console.log("todo el indice " + miArray1 [0]);
console.log("todo el indice " + miArray1 [1]);
console.log("todo el indice " + miArray1 [2]);

/************************loop for************** */

let miArray = [2,3,4,5,6,7];

for(let i=0; i < 10; i++){   //se puede tambien al reves (let i=10; 1 > 0; i--)
    //console.log("imprimiendo i -> " + i);
    console.log("imprimiendo miArray -> " + miArray[i]);
}

// i = indice, el 0 en i=0 hace referencia al indice 0 en mi Array "miArray"

let miArray1 = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
];

let matrizR= [
    [],[],[]
]
for (let i = 0; i < 3; i++){ // en lugar de 3, se puede poner variable.length
    for(let j=0; j < 3; j++){
console.log("Imprimiendo la matriz1 -> " + miArray1[i][j]);
    }
}


for (let i = 0; i < 3; i++){
    for(let j=0; j < 3; j++){
matrizR[i][j] = miArray1[i][j] * miArray1[i][j];
    }

}

console.log("MatrizR->"+matrizR);

/**********while loop****** 
 * let variable inicio
 * while (condicion){
 * 
 * }
*/

let contador = 0;
while(contador < 10){
    console.log(contador);
    contador++;
}