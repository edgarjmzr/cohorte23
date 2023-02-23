Object.prototype

let persona = {
    nombre : 'Juan',
    apellido : 'Perez',
    nombreCompleto : function () {
        return 'el nombre es ' + this.nombre + ' ' + this.apellido; //this es un metodo que hace referencia a los atributos del objeto. Se refiere al dueno de la funcion, que en este caso es persona. no se usan funciones flecha para los metodos porque this hace referencia al objeto global

    }
}
//Todo esto anterior es un objeto. Es declarado como variable, pero a esta se le asigna una estructura, por lo cual el objeto es una estructura de datos, donde tenemos propiedades (nombre) y funcion
console.log(persona);
console.log(persona.nombre);
console.log(persona.nombreCompleto());