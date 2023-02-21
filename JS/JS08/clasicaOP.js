class OperacionesAritmeticas{
    // al declarar la clase, se crea el constructor
    numero0 = 0; //estos son atributos de la clase.   Tambien son propiedades de la clase, y son privadas, y no se puede acceder a esas propiedades mas que la clase
    numero1 = 0;

    constructor (valor0, valor1){ //con ellos quiero que me visualices mis numeros
        this.numero0 = valor0;
        this.numero1 = valor1;
    }

    sumar(){
        return this.numero0 + this.numero1;

    }

}


// Hay que terminar las operaciones aritmeticas





let obj4 = new OperacionesAritmeticas(8, 6);
console.log("el resultado es " +obj4.sumar());

let obj3 = new OperacionesAritmeticas(); //los obj vienen siendo los objetos, que acceden a atributos de la clase
obj3.numero0 = 11; 
obj3.numero1 = 9;
console.log(obj3.sumar(obj3.numero0, obj3.numero1));



let obj2 = new OperacionesAritmeticas();
console.log(obj2.sumar(5,6));

let obj1;
obj1 = new OperacionesAritmeticas();
let a = obj1.numero0;
console.log(obj1.numero0);  //estas tres lineas son la instancia (instance)
