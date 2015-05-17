package nl.b3p.mapfile.pojo;

/**
 *
 * @author Boy de Wit, B3Partners
 */
public class Extent {
    private String minX = "12000";
    private String minY = "304000";
    private String maxX = "280000";
    private String maxY = "620000";
    
    public Extent() {
        
    }

    public String getMinX() {
        return minX;
    }

    public void setMinX(String minX) {
        this.minX = minX;
    }

    public String getMinY() {
        return minY;
    }

    public void setMinY(String minY) {
        this.minY = minY;
    }

    public String getMaxX() {
        return maxX;
    }

    public void setMaxX(String maxX) {
        this.maxX = maxX;
    }

    public String getMaxY() {
        return maxY;
    }

    public void setMaxY(String maxY) {
        this.maxY = maxY;
    }
    
}
