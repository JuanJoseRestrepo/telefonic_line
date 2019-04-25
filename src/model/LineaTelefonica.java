package model;

public abstract class LineaTelefonica{

public final static String LOCAL = "local";
public static final String CELULAR = "celular";
public static final String DISTANCIA = "distancia";
public static final int M_LOCAL = 35;
public static final int M_CELULAR = 80;
public static final int M_DISTANCIA = 7;
public static final int M_OTRO = 10;

protected int minutes;
protected double valor;
protected int llamada;
protected String servicio;


public LineaTelefonica(int minutes,double valor,int llamada ,String servicio){

this.minutes = minutes;
this.valor = valor;
this.llamada = llamada;
this.servicio = servicio;

}

public abstract double calculatedCostPerMinute();



public abstract String toString();

}
