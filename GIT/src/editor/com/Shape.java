package editor.com;

public interface Shape {
    // method that sets a new position of the projection. The position is in the central body's fixed reference frame. The input is a one-dimensional array which contains three elements X, Y and Z that define the new position
    public void setPosition(java.awt.Point position);
    //  method that gets a new position of the projection.
    public java.awt.Point getPosition();

    /* update shape specific properties (e.g., radius) */
    public void setProperties(java.util.Map<String, Double> properties);

    public java.util.Map<String, Double> getProperties();

    public void setColor(java.awt.Color color);

    public java.awt.Color getColor();

    public void setFillColor(java.awt.Color color);

    public java.awt.Color getFillColor();

    /* redraw the shape on the canvas */
    public void draw(java.awt.Graphics canvas);
  //  A class implements the Cloneable interface to indicate to the Object.clone() method that it is legal for that method to make a field-for-field copy of instances of that class.
    /* create a deep clone of the shape */
    public Object clone() throws CloneNotSupportedException;
}
