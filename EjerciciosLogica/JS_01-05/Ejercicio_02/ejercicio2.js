function temperatura () {
    let celsius = parseFloat(prompt("Ingresa grados celsius: "));
 
        if (!isNaN(celsius)) {
            let fahrenheit = (parseFloat(celsius * 1.8)) + 32;
            let kelvin = (parseFloat(celsius + 273.15));
            document.write("Los " + celsius + " grados que ingresaste equivalen a " + fahrenheit
            + " grados fahrenheit y a " + kelvin + " grados kelvin.");           
        } else {
            document.write("nombre menso pon numeros");

        }

        //en caso contrario debe mandar un mensaje de error y volver a solicitar los datos. PENDIENTE HACER ESTO CON UM WHILE
    }
    
temperatura();