package examples.davijr.view;

import examples.davijr.classes.AgendaSingletonEnum;
import examples.davijr.classes.Cliente;
import examples.davijr.classes.ClienteTiposEnum;


public class Main {
    public static void main(String[] args) {

        AgendaSingletonEnum agenda = AgendaSingletonEnum.INSTANCE;

        Cliente cliente1 = new Cliente("1"
                ,"Davi"
                ,"12345678910"
                ,"davi@gmail.com"
                , ClienteTiposEnum.PESSOA_FISICA);

        Cliente cliente2 = new Cliente("2"
                ,"Maria"
                ,"98765432101"
                ,"maria@gmail.com"
                , ClienteTiposEnum.PESSOA_FISICA);

        agenda.addCliente(cliente1);
        agenda.addCliente(cliente2);


        for (Cliente cliente: agenda.getAgenda()){
            System.out.println(cliente);
        }

    }
}