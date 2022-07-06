public class PersonaPrivada {

    public static void main(String [] args) {
        Persona nombre = new Persona();
        nombre.setDato("Pedro");
        
        Persona edad = new Persona();
        edad.setDato("18");
        
        Persona telefono = new Persona();
        telefono.setDato("5256547");
        
        System.out.println("Nombre de la persona: " + nombre.getDato()); 
        System.out.println("Edad de la persona: " + edad.getDato());
        System.out.println("Telefono de la persona: " + telefono.getDato());
    }
}

class Persona {
        private String dato;

        public void setDato(String dato) {
            this.dato = dato;
        }  
        public String getDato() {
            return this.dato;
        }  
 }
