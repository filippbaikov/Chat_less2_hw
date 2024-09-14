package Server;

import Client.ClientGUI;
import RepositoryPack.RepositoryFile;


public class ServerHandling  {
    RepositoryFile repositoryFile=new RepositoryFile();




    public String serverAnswer() {
        return repositoryFile.readFromFileByRow(repositoryFile.createFile("src/RepositoryPack/history"));
    }
    public String readFromFile(){
        return repositoryFile.readFromFile(repositoryFile.createFile("src/RepositoryPack/history"));
    }


    public void appendTextFromClient(String text) {
        repositoryFile.fileAppendText(repositoryFile.createFile("src/RepositoryPack/history"),text+"\n");

    }
    public void addClient(){
        ClientGUI clientGUI=new ClientGUI();
        clientGUI.setVisible(true);
    }
}
