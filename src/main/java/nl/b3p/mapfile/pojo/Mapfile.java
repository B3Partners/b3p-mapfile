package nl.b3p.mapfile.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Boy de Wit, B3Partners
 */
public class Mapfile {
    
    private String createDate;
    private String name;
    private int sizeW = 1000;
    private int sizeH = 1000;
    private String units = "meters";
    private String fontSet = "./fonts/fonts.txt";
    private String symbolSet = "./symbols/symbols.txt";
    private String shapePath;
    private Extent extent = new Extent();
    private String projection = "init=epsg:28992";
    private int imageColorR = 255;
    private int imageColorG = 255;
    private int imageColorB = 255;
    private int imageQuality = 95;
    private String imageType = "png";
    private Outputformat outputFormat = new Outputformat(); 
    private Legend legend = new Legend();
    private Web web = new Web();
    private List<Layer> layers;
    private String databaseType;
    
    public Mapfile() {
        
    }
    
    public void addLayer(Layer l) {
        if (layers == null) {
            layers = new ArrayList<Layer>();
        }
        
        layers.add(l);
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSizeW() {
        return sizeW;
    }

    public void setSizeW(int sizeW) {
        this.sizeW = sizeW;
    }

    public int getSizeH() {
        return sizeH;
    }

    public void setSizeH(int sizeH) {
        this.sizeH = sizeH;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getFontSet() {
        return fontSet;
    }

    public void setFontSet(String fontSet) {
        this.fontSet = fontSet;
    }

    public String getSymbolSet() {
        return symbolSet;
    }

    public void setSymbolSet(String symbolSet) {
        this.symbolSet = symbolSet;
    }

    public String getShapePath() {
        return shapePath;
    }

    public void setShapePath(String shapePath) {
        this.shapePath = shapePath;
    }

    public Extent getExtent() {
        return extent;
    }

    public void setExtent(Extent extent) {
        this.extent = extent;
    }

    public String getProjection() {
        return projection;
    }

    public void setProjection(String projection) {
        this.projection = projection;
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

    public int getImageQuality() {
        return imageQuality;
    }

    public void setImageQuality(int imageQuality) {
        this.imageQuality = imageQuality;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public Outputformat getOutputFormat() {
        return outputFormat;
    }

    public void setOutputFormat(Outputformat outputFormat) {
        this.outputFormat = outputFormat;
    }

    public Legend getLegend() {
        return legend;
    }

    public void setLegend(Legend legend) {
        this.legend = legend;
    }

    public Web getWeb() {
        return web;
    }

    public void setWeb(Web web) {
        this.web = web;
    }

    public List<Layer> getLayers() {
        return layers;
    }

    public void setLayers(List<Layer> layers) {
        this.layers = layers;
    }

    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }
}
