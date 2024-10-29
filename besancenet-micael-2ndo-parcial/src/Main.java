import model.Persona;
import model.Registro;
import model.muyEnfermoException;
import model.noHayReactivosException;
import service.PersonaService;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws muyEnfermoException, IOException, noHayReactivosException{

        try {
            PersonaService personaService = new PersonaService();

            LinkedHashSet<Persona> personas = new LinkedHashSet<>();
            Integer reactivos = 10;

            Persona p1 = new Persona();
            Persona p2 = new Persona();
            Persona p3 = new Persona();

            personaService.añadirPersona(p1, reactivos);
            personaService.añadirPersona(p2, reactivos);
            personaService.añadirPersona(p3, reactivos);

            LinkedHashMap<Integer, Registro> testeados = personaService.testear(personas);

            personaService.aislar(testeados);

            personaService.añadirAJson(personas);



        }catch (muyEnfermoException e){
            e.printStackTrace();
        }catch (noHayReactivosException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}