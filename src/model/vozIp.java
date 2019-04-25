package model;

public class vozIp extends segundoTipoLineaTelefonica{

  public vozIp(int minutes,double valor,int llamada ,String servicio){
    super(minutes,valor,llamada,servicio);
  }

public double calculatedCostPerMinute(){
double m = 0.0;

if(servicio.equals(LineaTelefonica.CELULAR)){

m = (minutes * LineaTelefonica.M_CELULAR)/llamada;

}else if(servicio.equals(LineaTelefonica.DISTANCIA)){

m = (minutes * LineaTelefonica.M_DISTANCIA)/llamada;

}else if(servicio.equals(LineaTelefonica.LOCAL)){

m = (minutes * LineaTelefonica.M_LOCAL)/llamada;
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
