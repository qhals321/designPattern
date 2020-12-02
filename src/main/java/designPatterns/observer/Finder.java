package designPatterns.observer;

import java.util.List;

public class Finder implements Observer{
    private FolderContainer folderContainer;

    public Finder(FolderContainer folderContainer) {
        this.folderContainer = folderContainer;
    }

    @Override
    public void update() {
        List<String> folderList =
                folderContainer.getFolderList();
        display(folderList);
    }

    private void display(List<String> folderList) {
        folderList.forEach(System.out::println);
    }
}
