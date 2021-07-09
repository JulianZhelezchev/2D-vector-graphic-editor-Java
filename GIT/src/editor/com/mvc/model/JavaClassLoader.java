package editor.com.mvc.model;

        import editor.com.Shape;

public class JavaClassLoader extends ClassLoader{

    public Class<? extends Shape> loadExtraClass(String classBinName){

        ClassLoader classLoader = this.getClass().getClassLoader();

        Class<?> loadedClass = null;
        try {
            loadedClass =  classLoader.loadClass(classBinName);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (Class<? extends Shape>) loadedClass;
    }
}
