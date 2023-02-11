// var nombre= "Edgar";
// var edad=30;
// var tengomascotas=true;
// var tengotrabajo=false;
// var tengosueldo; //undefined


// let nombre= "Edgar";
// let edad=30;
// let tengomascotas=true;
// let tengotrabajo=false;
// let tengosueldo; //undefined

function programa1(){
    let hrTrabajadas = parseInt(prompt ("Escribe las horas que trabajaste: "));
    let sueldoXHora = parseInt(prompt ("Escribe cuánto te pagan por hora: "));
    let sueldoTotal = (hrTrabajadas * sueldoXHora);
    alert (sueldoTotal);
}

function programa2(){
    let resultado = (3+2)/(2*5);
    alert (resultado);
}

function imc(){
    let peso = parseInt(prompt("Ingrese su peso en libras: "))
    let altura = parseInt(prompt("Ingrese su altura en centímetros: "))
    let pesoKg = peso * 0.453592
    let alturaM = altura/100
    let imc = pesoKg/(alturaM*alturaM)
    alert (imc);

     switch(imc){
         case (imc<16):
             alert("El peso es: "+pesoKg+" Su IMC es de: "+imc+
             "Se encuentra en criterio de ingreso")
             break;
         case (imc>=16 && imc<=16.9):
             alert("El peso es: "+pesoKg+" Su IMC es de: "+imc+
             "Se encuentra en infrapeso")
             break;
         case (imc>=17 && imc<=18.4):
             alert("El peso es: "+pesoKg+" Su IMC es de: "+imc+
             "Se encuentra en bajo peso")
             break;
         case (imc>=18.5 && imc<=24.9):
             alert("El peso es: "+pesoKg+" Su IMC es de: "+imc+
             "Se encuentra en peso normal")
             break;
         case (imc>=25 && imc<=29.9):
             alert("El peso es: "+pesoKg+" Su IMC es de: "+imc+
             "Se encuentra en sobrepeso")
             break;
         case (imc>=30 && imc<=34.9):
             alert("El peso es: "+pesoKg+" Su IMC es de: "+imc+
             "Se encuentra en lobesidad premórbida")
             break;
         case (imc>=40 && imc<=45):
             alert("El peso es: "+pesoKg+" Su IMC es de: "+imc+
             "Se encuentra en obesidad mórbida")
             break;
         case (imc>45):
             alert("El peso es: "+pesoKg+" Su IMC es de: "+imc+
             "Se encuentra en obesidad hipermórbida")
         break;
     }
    
}
