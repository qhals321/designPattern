package designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class FolderContainer extends Subject{
    private List<String> folderList = new ArrayList<>();

    public void createFolder(String folderName){
        folderList.add(folderName);
        notifyObservers();
    }

    public List<String> getFolderList(){
        return folderList;
    }
}
