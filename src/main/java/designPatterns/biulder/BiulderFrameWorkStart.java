package designPatterns.biulder;

import designPatterns.InfoRetun;

import java.util.List;

public class BiulderFrameWorkStart {

    public FrameWork _getNewFramework(List<String> parametros){
        FrameWork frameWork = new FrameWork("Meu Projeto","MongoDB", "root", "root", "localHost",true, true, true );
        frameWork = setParametros(frameWork, parametros);
        return frameWork;
    }

    public InfoRetun runNewFrameWork(FrameWork frameWork){
        InfoRetun infoRetun = new InfoRetun();
        try{
            //todo aqui ficaria a chamada para o metodo que cria o BD/Project
            infoRetun.setTipo("succes");
            infoRetun.setObj(frameWork);
        }catch (Exception e){
            infoRetun.setTipo("danger");
            infoRetun.setObj(null);
        }
        return infoRetun;
    }

    public FrameWork setParametros(FrameWork frameWork, List<String> list){

        for(String parametro : list){
            String[] paramSplit = parametro.split(" ");
            switch (paramSplit[0].toUpperCase()){
                case "NAME":
                    frameWork.setName(paramSplit[1]);
                    break;
                case "DB":
                    frameWork.setBancoDados(paramSplit[1]);
                    break;
                case "DBUSER":
                    frameWork.setDbUser(paramSplit[1]);
                    break;
                case "DBPASSWORD":
                    frameWork.setDbPassword(paramSplit[1]);
                    break;
                case "DBHOST":
                    frameWork.setDbHost(paramSplit[1]);
                    break;
                case "TESTS":
                    frameWork.setTests(paramSplit[1]== "true" ? true : false);
                    break;
                case "WEBPACK":
                    frameWork.setWebPack(paramSplit[1]== "true" ? true : false);
                    break;
                case "FULL":
                    frameWork.setFull(paramSplit[1]== "true" ? true : false);
                    break;
            }
        }
        return frameWork;
    }

}
