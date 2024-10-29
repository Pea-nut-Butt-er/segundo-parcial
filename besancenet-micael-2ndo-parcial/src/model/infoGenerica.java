package model;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class infoGenerica<T>{
    private ArrayList<T> informacion = new ArrayList<>();

    public void aniadirInfo(T t){
        informacion.add(t);
    }

    public ArrayList<T> recibirInfo(){
        return informacion;
    }
}
