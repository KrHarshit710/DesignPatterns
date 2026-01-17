package Structural.CompositeDesignPattern.FileSystemWithCompositeDesign;

public class File implements FileSystemComponent{
    String fileName;

    public File(String name){
        this.fileName = name;
    }

    public void ls(){
        System.out.println("file name " + fileName);
    }
}
