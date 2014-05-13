package nl.b3p.mapfile.pojo;

/**
 *
 * @author Boy de Wit, B3Partners
 */
public class Legend {
    
    private int imageColorR = 255;
    private int imageColorG = 255;
    private int imageColorB = 255;
    private String status = "ON";
    private String keySize = "18 12";
    private Label label = new Label();
    
    public Legend() {
        
    }

    public int getImageColorR() {
        return imageColorR;
    }

    public void setImageColorR(int imageColorR) {
        this.imageColorR = imageColorR;
    }

    public int getImageColorG() {
        return imageColorG;
    }

    public void setImageColorG(int imageColorG) {
        this.imageColorG = imageColorG;
    }

    public int getImageColorB() {
        return imageColorB;
    }

    public void setImageColorB(int imageColorB) {
        this.imageColorB = imageColorB;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getKeySize() {
        return keySize;
    }

    public void setKeySize(String keySize) {
        this.keySize = keySize;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }
}