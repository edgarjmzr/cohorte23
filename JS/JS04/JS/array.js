// slice
let lista = [12,5,80,34];
let listaNueva = lista.slice(1, 3); //slice dice "uno antes del limite fijado (en este caso 3)"
console.log (listaNueva);

// join
let lista = [12,5,80,34];
let msj = lista.join("-");
console.log (msj);

// push      PUSH omodifica el array original; CONCAT no
let lista = [12,5,80,34];
lista.push(100);
console.log (lista);

// concat
let lista = [12,5,80,34];
let masE = lista.concat(100, 200, 300);
console.log (masE);

// pop
let lista = [12,5,80,34];
lista.pop(); //quita el ultimo elemento del array
console.log(lista);

// shift
let lista = [12,5,80,34];
lista.shift(); //quita el primer elemento del array
console.log(lista);

// splice  
let lista = [12,5,80,34];
let remover = lista.splice(1, 2); // POSICION 1, se remueven 2
console.log (remover); //muestra lo que se removio
console.log (lista); //muestra lista ya sin lo removido
lista.splice(2,0, 100, 200, 300);
console.log(lista);

//reverse
let lista = [12,5,80,34];
lista.reverse(); //acomoda en sentido contrario
console.log(lista);


//sort
let lista = [12,5,80,34]; 
lista.sort(
    function(valor1, valor2){
        return valor1 - valor2;
    }
); //acomoda en orden alfabetico
console.log(lista);


//map
let lista = [12,5,80,34]; 
let 1Nueva = lista.map(
    function(valor){
        return valor * 2
    }
);
console.log(1Nueva);


//sort
lista.sort(
    function(valor1, valor2){
        return valor1 - valor2;
    }
); //acomoda en orden alfabetico
console.log(lista);


//length
for (let i = 0; i< lista.length; i++){
    console.log(lista[i]);

}
console.log(lista);

