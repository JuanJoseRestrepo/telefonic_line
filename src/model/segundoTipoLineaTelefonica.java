package model;

public class segundoTipoLineaTelefonica extends LineaTelefonica{


public segundoTipoLineaTelefonica(int minutes,double valor,int llamada ,String servicio){
  super(minutes,valor,llamada,servicio);
}


public double calculatedCostPerMinute(){
double m = 0.0;

if(servicio.equals(LineaTelefonica.LOCAL)){

m = (minutes * LineaTelefonica.M_OTRO)/llamada;

}else if(servicio.equals(LineaTelefonica.CELULAR)){

m = (minutes * LineaTelefonica.M_OTRO)/ llamada;
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
