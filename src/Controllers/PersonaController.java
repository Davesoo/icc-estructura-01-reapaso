package Controllers;

import Models.Persona;

public class PersonaController {
    public void ordenarPorEdad(Persona[] personas) {
        for (int i=1; i < personas.length; i++){
            Persona act = personas[i];
            int j = i-1;
            while (j>=0 && personas[j].getEdad() > act.getEdad()) {
                personas[j+1] = personas[j];
                j--;
            }
            personas[j+1] = act;
        }
    }

    public Persona buscarPorEdad(Persona[] personas, int edad) {
        int alto = personas.length-1;
        int bajo = 0;
        while (alto >= bajo) {
            int central = (alto+bajo)/2;
            if (personas[central].getEdad()==edad){
                return personas[central];
            }
            if (personas[central].getEdad() < edad) {
                alto = central - 1;
            }else{
                bajo = central + 1;
            }
        }
        return null;
    }
}
