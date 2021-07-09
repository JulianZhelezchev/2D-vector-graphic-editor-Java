package editor.com;

import editor.com.Shape;


public interface ICommand {

    public void execute();
    public Shape getNewShape();
    public Shape getOldShape();
    public void unexecute();

}
