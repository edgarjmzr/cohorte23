class HolaMundo{
	public static void main (String [] ch23){
		//System.out.print("Hola mundo desde Java");

		Saludo objSaludo; //aqui lo declaro al objeto que siempre es de tipo clase. Le tengo que decir a Java el tipo de dato. Esto tambien es una referencia.
		objSaludo = new Saludo(); //Aqui creo un objeto. new es operador, Constructor es metodo es este ()
		objSaludo.saludar(); // tercer paso: llamar, pedir solicitar la accion de esa misma clase con el operador punto. Le dice al metodo que me entrege un resultado
}

}

