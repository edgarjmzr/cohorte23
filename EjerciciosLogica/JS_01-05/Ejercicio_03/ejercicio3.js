// must ask the user a number by prompt or by input
// must calculate factorial out of the received number
// must print the result by console or by DOM
// must be capable of identifying if the input data es number,
// else it must prompt an error message and ask again.


let factorialde = parseInt(prompt("Ingresa numero pa q veas que pasa: "));

function factorial (n) {
    if (n == 0) {
        return 1;
    }
    else {
        return n*factorial(n-1);
    }
}
if (!isNaN(factorialde)) {
    let result = factorial(factorialde);
    document.write("El resultado es: " + result);
               
} else {
    alert("nombre menso era numerooo, a ver dale refresh y empieza otra vez");
}

