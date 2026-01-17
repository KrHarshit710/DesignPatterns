package Structural.CompositeDesignPattern.FileSystemWithCompositeDesign;

import java.util.ArrayList;
import java.util.List;

// Structural Design Pattern
public class Directory implements FileSystemComponent {

    String directoryName;
    List<FileSystemComponent> fileSystemList;

    public Directory(String name){
        this.directoryName = name;
        fileSystemList = new ArrayList<>();
    }

    public void add(FileSystemComponent fileSystemObj) {
        fileSystemList.add(fileSystemObj);
    }

    public void ls(){
        System.out.println("Directory name " + directoryName);

        for(FileSystemComponent fileSystemObj : fileSystemList){
            fileSystemObj.ls();
        }
    }
}
