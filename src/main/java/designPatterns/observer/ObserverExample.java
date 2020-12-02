package designPatterns.observer;

public class ObserverExample {
    public static void main(String[] args) {
        FolderContainer folderContainer = new FolderContainer();
        folderContainer.attach(new Finder(folderContainer));
        folderContainer.attach(new CurrentView(folderContainer));
        folderContainer.createFolder("hello-world");
    }
}
