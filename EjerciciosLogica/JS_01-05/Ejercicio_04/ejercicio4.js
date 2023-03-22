// Prompt the user
while (true) {  
    const n = parseInt(prompt('Which Fibonacci number do you want? '))
    console.log(findFibonacciOf(n))
}

// Calculate the fibonacci sequence of a given number
function findFibonacciOf(number) {
    console.log('Ive been given the ' + number + 'th number')
    if(number < 2) return number
    else return findFibonacciOf(number-1) + findFibonacciOf(number-2)
}







// let fibonacciV = parseInt(prompt("Ingresa numero pa q veas que pasa: "));

// if (!isNaN(factorialde)) {
//     function fibonacci (n) {
//         if (n == 0) {
//             return 1;
//         }
//         else {
//             return n*factorial(n-1);
//         }
//     }
//     let result = factorial(factorialde);
//     document.write("El resultado es: " + result);
               
// } else {
//     document.write("nombre menso pon numeros");

// }