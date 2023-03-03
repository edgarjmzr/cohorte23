
function numbers(){
    let num1 = parseInt(prompt("1st number"));
    let num2 = parseInt(prompt("2nd number"));
    let num3 = parseInt(prompt("3rd number"));
    
    let arraynums = [num1, num2, num3];

    arraynums.sort(function
             (a,b) {
                 return a-b;
             }            
             );    
    document.write("De menor a mayor: " + arraynums);

    document.write("/ . . / . . . . . . . . / . . / ");

    arraynums.sort(function
        (a,b) {
            return b-a;
        }            
        );    
document.write("De mayor a menor: " + arraynums);

if (num1 === num2 && num2 === num3) {
    document.write(".............tus tres numeros son iguales o:")
};


}


numbers()


// arraynums.sort(function
//     (a,b) {
//         return a-b;
//     });
