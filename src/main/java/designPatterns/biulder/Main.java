package designPatterns.biulder;

import designPatterns.InfoRetun;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        FrameWork frameWork;

        List<String> parametros = new ArrayList<>();
        parametros.add("name New_project");
        parametros.add("DB MySQL");
        BiulderFrameWorkStart frameStart = new BiulderFrameWorkStart();
        InfoRetun inf = frameStart.runNewFrameWork(frameStart._getNewFramework(parametros));
//        System.out.println(inf.getMenssagem().equals("sucess") ? "projeto criado" : "Algo deu errado");
        if(inf.getTipo().equals("succes")){
            frameWork = (FrameWork) inf.getObj();
            System.out.println("projeto criado");
        }else {
            System.out.println("Algo deu errado");
        }

    }
}
