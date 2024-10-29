import model.Persona;
import model.Registro;
import model.muyEnfermoException;
import model.noHayReactivosException;
import service.PersonaService;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args){

        try {
            PersonaService personaService = new PersonaService();

            //se crea la coleccion para guardar personas
            LinkedHashSet<Persona> personas = new LinkedHashSet<>();
            //se establece el numero actual de reactivos en el sistema
            Integer reactivos = 10;

            //se crean personas
            Persona p1 = new Persona("mariano", "arias", 17, 4798923, "general pueyrredon", "estudiante");
            Persona p2 = new Persona("mario", "gonzales", 18, 47673423, "general pueyrredon", "estudiante");
            Persona p3 = new Persona("maria", "bergonzi", 45, 4609830, "general pueyrredon", "profesora");

            //se añaden personas a la coleccion de personas con condiciones
            personaService.añadirPersona(p1, reactivos);
            personaService.añadirPersona(p2, reactivos);
            personaService.añadirPersona(p3, reactivos);

            //luego de añadir las personas a un set se actualizan al set del main
            personas = personaService.devolverPersonas();

            //se genera un map con informacion de los tests realizados a las personas
            LinkedHashMap<Integer, Registro> testeados = personaService.testear(personas);

            //se aislian las personas testeadas
            personaService.aislar(testeados);

            //se pasan las personas a un json
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