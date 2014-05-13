package nl.b3p.mapfile.pojo;

/**
 *
 * @author Boy de Wit, B3Partners
 */
public class ClassStyle {
    
    private String symbol;
    private int colorR;
    private int colorG;
    private int colorB;
    private int outlineColorR = 0;
    private int outlineColorG = 0;
    private int outlineColorB = 0;
    private double width;
    
    public ClassStyle() {
        
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getColorR() {
        return colorR;
    }

    public void setColorR(int colorR) {
        this.colorR = colorR;
    }

    public int getColorG() {
        return colorG;
    }

    public void setColorG(int colorG) {
        this.colorG = colorG;
    }

    public int getColorB() {
        return colorB;
    }

    public void setColorB(int colorB) {
        this.colorB = colorB;
    }

    public int getOutlineColorR() {
        return outlineColorR;
    }

    public void setOutlineColorR(int outlineColorR) {
        this.outlineColorR = outlineColorR;
    }

    public int getOutlineColorG() {
        return outlineColorG;
    }

    public void setOutlineColorG(int outlineColorG) {
        this.outlineColorG = outlineColorG;
    }

    public int getOutlineColorB() {
        return outlineColorB;
    }

    public void setOutlineColorB(int outlineColorB) {
        this.outlineColorB = outlineColorB;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
