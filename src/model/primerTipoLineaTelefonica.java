package model;


public class primerTipoLineaTelefonica extends LineaTelefonica{

public primerTipoLineaTelefonica(int minutes,double valor,int llamada ,String servicio){
  super(minutes,valor,llamada,servicio);
}

public double calculatedCostPerMinute(){
double m = 0.0;

if(servicio.equals(LineaTelefonica.LOCAL)){

m =(minutes * LineaTelefonica.M_LOCAL)/llamada;

}
return m;
}



public String toString(){

String msj = "";

msj = "Los minutos son:" + minutes;
msj = "El calculo es:" + calculatedCostPerMinute();
msj = "El numero de llamadas es:" + llamada;
msj = "El servicio es:" + servicio;

  return msj;

  }















}
