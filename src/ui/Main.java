package ui;
import model.*;
import java.util.Scanner;

public class Main{

//Relacion
private Empresa principal;


public Main(){

}



public static void main(String[] args) {
Main m = new Main();

Scanner reader = new Scanner(System.in);

Empresa mamerto = new Empresa("Empresas municipales de Emcali");
System.out.println(mamerto);

primerTipoLineaTelefonica n1 = new primerTipoLineaTelefonica(450,130.0,20,LineaTelefonica.LOCAL);
mamerto.addTypeOfCellPhone(n1);
System.out.println(n1.calculatedCostPerMinute());
System.out.println(n1);

primerTipoLineaTelefonica n2 = new primerTipoLineaTelefonica(165,130.0,20,LineaTelefonica.LOCAL);
mamerto.addTypeOfCellPhone(n2);
System.out.println(n2.calculatedCostPerMinute());
System.out.println(n2);

segundoTipoLineaTelefonica m1 = new segundoTipoLineaTelefonica(100,130.0,35,LineaTelefonica.LOCAL);
mamerto.addTypeOfCellPhone(m1);
System.out.println(m1.calculatedCostPerMinute());
System.out.println(m1);

segundoTipoLineaTelefonica m2 =  new segundoTipoLineaTelefonica(30,130.0,35,LineaTelefonica.CELULAR);
mamerto.addTypeOfCellPhone(m2);
System.out.println(m2.calculatedCostPerMinute());
System.out.println(m2);

segundoTipoLineaTelefonica m3 = new segundoTipoLineaTelefonica(200,130.0,25,LineaTelefonica.LOCAL);
mamerto.addTypeOfCellPhone(m3);
System.out.println(m3.calculatedCostPerMinute());
System.out.println(m3);

segundoTipoLineaTelefonica m4 =  new segundoTipoLineaTelefonica(1200,130.0,25,LineaTelefonica.CELULAR);
mamerto.addTypeOfCellPhone(m4);
System.out.println(m4.calculatedCostPerMinute());
System.out.println(m4);

vozIp v1 = new vozIp(55,130.0,40,LineaTelefonica.LOCAL);
mamerto.addTypeOfCellPhone(v1);
System.out.println(v1.calculatedCostPerMinute());
System.out.println(v1);

vozIp v2 = new vozIp(75,130.0,40,LineaTelefonica.DISTANCIA);
mamerto.addTypeOfCellPhone(v2);
System.out.println(v2.calculatedCostPerMinute());
System.out.println(v2);

vozIp v3 = new vozIp(39,130.0,40,LineaTelefonica.CELULAR);
mamerto.addTypeOfCellPhone(v3);
System.out.println(v3.calculatedCostPerMinute());
System.out.println(v3);

}





}
