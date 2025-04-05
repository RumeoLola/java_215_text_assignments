public class GraphicObject {
    protected int posX;
    protected int posY;
    protected String fillColor;
    protected String lineColor;

    public GraphicObject(int posX, int posY, String fillColor, String lineColor) {
        this.posX = posX;
        this.posY = posY;
        this.fillColor = fillColor;
        this.lineColor = lineColor;
    }

    public void moveTo(int newX, int newY) {
        this.posX = newX;
        this.posY = newY;
    }

    public void draw() {

    }

    protected void resize(double scaleFactor) {

    }
}