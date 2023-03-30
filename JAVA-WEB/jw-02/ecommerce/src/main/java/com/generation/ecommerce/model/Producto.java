package com.generation.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //indico que mi clase Producto se convierte en una entidad JPA (Persistencia de datos)

@Table (name = "Producto") //CASE SENSITIVE

public class Producto {
	
	@Id//el campo id es la primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //el campo id sera generado automaticamente por la DB
    @Column(name="id", unique = true, nullable = false) //especifica el nombre de la columna en la DB
	
    //Atributos
    private Long id;
    private String nombre;
    private String descripcion;
    private String URL_Imagen;
    private double precio;
    
    
    //Contructor vacio para el Jackson(serealizar y deserealizar un objeto JAVA a JSON
    public Producto() {    
    }

    //Constructor con todos los fields
    public Producto(Long id, String nombre, String descripcion, String URL_Imagen, double precio) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.URL_Imagen = URL_Imagen;
        this.precio = precio;
    } //Constructor con todos los fields
    
    
    //Getters and Setters
	public Long getId() {
        return id;
    }//Get Id


    public void setId(Long id) {
        this.id = id;
    }//Set Id


    public String getNombre() {
        return nombre;
    }//Get Nombre


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//Set Nombre


    public String getDescripcion() {
        return descripcion;
    }//Get Descripcion


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }//Set Descripcion


    public String getURL_Imagen() {
        return URL_Imagen;
    }//Get Imagen


    public void setURL_Imagen(String uRL_Imagen) {
        URL_Imagen = uRL_Imagen;
    }//Set Imagen


    public double getPrecio() {
        return precio;
    }//Get Precio


    public void setPrecio(double precio) {
        this.precio = precio;
    }//Set Precio
    
    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", URL_Imagen="
                + URL_Imagen + ", precio=" + precio + "]";
    }
    
    
}