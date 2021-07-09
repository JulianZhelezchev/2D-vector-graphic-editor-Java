


package editor.com;
//Create a Factory to generate object of concrete class based on given information.
public interface IFactory {
    //use createShape method to create object of type shape
    public Shape createShape(String shape);
}