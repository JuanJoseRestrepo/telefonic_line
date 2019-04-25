package model;

import java.util.ArrayList;


public class Empresa{

//Atributos
private String nombre;

//Relacion
private ArrayList<LineaTelefonica> serviciosTelefonicos;

public Empresa(String nombre){

  this.nombre = nombre;
  serviciosTelefonicos = new ArrayList<LineaTelefonica>();

}


public void addTypeOfCellPhone(LineaTelefonica m){

serviciosTelefonicos.add(m);

}

public String toString(){
String msj = "";

msj = "" + nombre;

return msj;

}







}
