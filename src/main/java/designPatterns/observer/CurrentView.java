package designPatterns.observer;

import java.util.List;

public class CurrentView implements Observer{
    private FolderContainer folderContainer;

    public CurrentView(FolderContainer folderContainer) {
        this.folderContainer = folderContainer;
    }

    @Override
    public void update() {
        List<String> folderList =
                folderContainer.getFolderList();

        folderList.forEach(System.out::println);
    }
}
