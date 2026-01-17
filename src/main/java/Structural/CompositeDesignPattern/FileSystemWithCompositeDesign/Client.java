package Structural.CompositeDesignPattern.FileSystemWithCompositeDesign;

public class Client {
    public static void main(String args[]){

       Directory movieDirectory = new Directory("Movie");

       FileSystemComponent border = new File("Border");
       movieDirectory.add(border);

       Directory comedyMovieDirectory = new Directory("ComedyMovie");
       File welcome = new File("Welcome");
       comedyMovieDirectory.add(welcome);
       movieDirectory.add(comedyMovieDirectory);

       movieDirectory.ls();

    }
}
