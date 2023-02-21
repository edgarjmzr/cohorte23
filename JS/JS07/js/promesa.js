const myURL = document.URL.toString(); //document llama al DOM. La URL se entrega a la promesa = fetch
const promesa = fetch(myURL);
promesa.then(resultado => console.log(resultado), e => console.log(`error callback ${e}`));
