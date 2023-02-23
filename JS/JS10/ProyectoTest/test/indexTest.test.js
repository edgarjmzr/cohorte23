//prueba efectiva
// const indexTest = require ("../calculadora/");  // esta es para js 5  //declaramos variable para indicarle que es lo que quiero que pruebe
import { indexTest } from "../calculadora"; // cambie como traer el artefacto, esta es para js6 (artefacto es el .js)
test('test suma', () => {

    //lo que haya encontrado en calculadora, quiero que lo pruebe
    const r = indexTest.suma(1,2);  //aqui testeamos la funcion suma especificamente
    expect (r).toBe(3); //se espera que 1+2 = 3, esto es un ejemplo que le damos a jest

});
test.todo('test resta');
test.todo('test multiplicacion');
test.todo('test division');