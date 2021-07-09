package editor.com.mvc;

        import editor.com.mvc.controller.MainController;
        import editor.com.mvc.model.MyDrawingEngine;
        import editor.com.mvc.model.ShapeFactory;
        import editor.com.mvc.view.GUI;
/**
 * Главен клас на програмата с входната й точка.
 */
public class MainClass {
    /**
     * Входна точка на програмата.
     */
    public static void main(String[] args){
        MyDrawingEngine engine = new MyDrawingEngine();
        ShapeFactory factory = new ShapeFactory(engine);
        final GUI Paint = new GUI();
        MainController  main = new MainController(engine, factory, Paint);
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Paint.setVisible(true);;
            }
        });

    }
}
