package com.open_bootcamp;

public class Personados {

    public static void main(String [] args) {
        String nombre;
        int telefono, edad;
        
        nombre = "Alex";
        telefono = 25664254;
        edad = 25;

        System.out.println("El nombre es: " + nombre );
        System.out.println("El Telefono es: " + telefono);
        System.out.println("La edad es: " + edad);
        

        Cliente credito = new Cliente();
        credito.setCredito("1000 USD");
        System.out.println("El credito de la persona es: " + credito.getCredito());
        Trabajador salario = new Trabajador();
        salario.setSalario("5000 USD");
        System.out.println("El salario de la persona es: " + salario.getSalario());
    }
}
class Cliente extends Personados {
    String credito ;

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }
    
}
class Trabajador extends Personados {
    String salario;

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
} 
