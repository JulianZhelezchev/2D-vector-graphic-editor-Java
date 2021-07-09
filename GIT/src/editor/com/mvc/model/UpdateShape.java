package editor.com.mvc.model;




        import java.util.ArrayList;

        import editor.com.ICommand;
        import editor.com.Shape;

public class UpdateShape implements ICommand {

    private ArrayList<Shape> shapes;
    private Shape oldShape;
    private Shape newShape;
    public UpdateShape(ArrayList<Shape> shapes, Shape oldShape, Shape newShape){
        this.shapes = shapes;
        this.oldShape = oldShape;
        this.newShape = newShape;
    }
    @Override
    public void execute() {

        int index = this.shapes.indexOf(oldShape);
        this.shapes.remove(oldShape);
        this.shapes.add(index, newShape);



    }

    @Override
    public void unexecute() {
        int index = this.shapes.indexOf(newShape);
        this.shapes.remove(newShape);
        this.shapes.add(index, oldShape);
    }
    @Override
    public Shape getNewShape() {
        // TODO Auto-generated method stub
        return newShape;
    }
    @Override
    public Shape getOldShape() {
        // TODO Auto-generated method stub
        return oldShape;
    }

}
