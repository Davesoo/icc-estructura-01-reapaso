
import Controllers.PersonaController;
import Models.Persona;
import Views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26),
        };

        PersonaController pC = new PersonaController();
        ViewConsole vC = new ViewConsole();

        vC.printMessage("Arreglo Original: ");
        vC.printPersonsArray(personas);
        vC.printMessage(" ");
        vC.printMessage("Arreglo ordenado: ");
        pC.ordenarPorEdad(personas);
        vC.printMessage("");
        vC.printPersonsArray(personas);

        vC.printMessage("\nBuscar persona con edad 40:");
        Persona bP = pC.buscarPorEdad(personas, 40);
        if (bP == null){
            vC.printMessage("No se encontró la persona.");
        }else{
            vC.printMessage("Se encontró persona con edad 40");
            vC.printMessage(bP.toString());
        }

        vC.printMessage("\nBuscar persona con edad 99:");
        bP = pC.buscarPorEdad(personas, 90);
        if (bP == null){
            vC.printMessage("No se encontró la persona.");
        }else{
            vC.printMessage("Se encontró persona con edad 99");
            vC.printMessage(bP.toString());
        }

        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD

    }
}
