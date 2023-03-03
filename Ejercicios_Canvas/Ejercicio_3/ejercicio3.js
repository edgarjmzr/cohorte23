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


