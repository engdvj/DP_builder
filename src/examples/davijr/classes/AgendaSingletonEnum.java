package examples.davijr.classes;

import java.util.ArrayList;
import java.util.List;

public enum AgendaSingletonEnum {

    INSTANCE;

    private List<Cliente> agenda = new ArrayList<>();

    public static AgendaSingletonEnum getInstance(){
        return INSTANCE;
    }

    public List<Cliente> getAgenda() {
        return agenda;
    }

    public void addCliente(Cliente cliente){
        INSTANCE.getAgenda().add(cliente);
        }
}
