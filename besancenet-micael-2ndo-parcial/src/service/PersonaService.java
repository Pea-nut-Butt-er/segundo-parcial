package service;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.*;

import java.util.*;

public class PersonaService {
    private LinkedHashSet<Persona> personas = new LinkedHashSet<>();

    public Boolean añadirPersona(Persona p, Integer reactivos) throws noHayReactivosException {
            if(reactivos < 1){
                throw new noHayReactivosException();
            }
            for (Persona p2 : personas) {
                if (p.getDni().equals(p2.getDni())) {
                    return false;
                }
            }
            return true;
    }
    public LinkedHashSet devolverPersonas(){
        return personas;
    }

    public LinkedHashMap <Integer, Registro> testear(LinkedHashSet<Persona> personas){
        Random random = new Random();

        LinkedHashMap <Integer, Registro> tests = new LinkedHashMap<>();
        for (Persona p: personas) {
            Integer temperatura = random.nextInt(4) + 36;
            Registro registro = new Registro(p.getDni(), temperatura);
            tests.put(p.getKit(), registro);
        }
        return tests;
    }

    public void aislar(LinkedHashMap <Integer, Registro> testeados) throws muyEnfermoException, IOException {
        for (Map.Entry<Integer, Registro> campos : testeados.entrySet()) {
            if(campos.getValue().getTemperatura() >= 37){
                File file = new File("urgente.txt");
                PrintWriter printWriter = new PrintWriter(file);
                printWriter.println(campos.getKey());
                printWriter.close();
                throw new muyEnfermoException();
            }
        }
    }

    public void añadirAJson(LinkedHashSet <Persona> personas) throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("personas.json");

        infoGenerica<Persona> info = new infoGenerica<>();
        for (Persona p: personas) {
            info.aniadirInfo(p);
        }

        mapper.writeValue(file, info.recibirInfo());
    }

}
