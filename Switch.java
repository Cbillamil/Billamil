
public class Switch {
    public static void main(String[] args) {
        var estacion = "Verano";

        switch(estacion) {
            case "Verano":
            case "Invierno":
            case "Otoño":
            case "Primavera":
                System.out.println("Es una estacion");
                break;
            default:
                System.out.println("No es una estacion");
           
        }
    }
    
}