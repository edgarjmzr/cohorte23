let stringxd = "pistos"
const myArray = ['insecto', 'bootcamp', 'mangos', 'reptil', 'mosca', 'escritorio'];
let myNewArray = []

function pistoxxx (stringxd, myArray) {
 for (let i = 0; i<myArray.length; i++) {
     if (stringxd.length < myArray[i].length) {myNewArray.push(myArray[i]);
 }
}
return myNewArray;
}

//console.log(pistoxxx(stringxd, myArray)); //ahuevo le tengo que poner los atributos, si no no jala
document.write("ahi ta tu nuevo array: ", pistoxxx(stringxd, myArray));

