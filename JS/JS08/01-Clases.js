class Persona { //es clase padre de empleado, tambien esta heredando

    constructor(nombre, apellido) {
        this._nombre = nombre;
        this.apellido = apellido;
    }
    set nombre(nombre){   //set metodo que me permite acceder al atributo nombre, que voy a redefinir
        this._nombre = nombre;
    }

    get nombre(){
        return this._nombre;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }

    get apellido(){
        return this._apellido;
    }

    nombreCompleto(){
        return this._nombre + ' ' + this._apellido;
    }


    toString(){ //voy a sobreescribir el method de la clase Padre Object
        return this.nombreCompleto();
    }
}


class Empleado extends Persona{  //la clase, empieza con Mayuscula. Con el extend, se indica de cual clase se esta siendo heredado
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }
    set  departamento(departamento){
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento //el get siempre lleva un return
    }

    //sobreescritura Overwrite: es redefinir el metodo
    nombreCompleto(){
        return super.nombreCompleto + ' ' + this._departamento;
    }
    
    //polimorfismo reutilizar el codigo, o sea el metodo
}

let personaA = new Persona('arturo B', 'de la garza');
console.log(personaA.toString());

let empleadoA = new Empleado('Maria', 'Perez', 'Sistema');
console.log(empleadoA);
console.log(empleadoA.nombreCompleto());
console.log(empleadoA.toString());









/*
let persona3 = new Persona('Masayoshi', 'Takanaka');

persona3.nombre = 'Juan';
console.log(persona3.nombre);

persona3.apellido = 'Jimenez';
console.log(persona3.apellido);

let persona2 = new Persona('Maria', 'Jimenez');
console.log(persona2);

let persona1 = new Persona('Juan', 'Perez');
console.log(persona1.nombre);
console.log(persona1.apellido);
*/