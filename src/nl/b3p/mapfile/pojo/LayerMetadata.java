package nl.b3p.mapfile.pojo;

/**
 *
 * @author Boy de Wit, B3Partners
 */
public class LayerMetadata {
    
    private String wmsTitle;
    private String wfsTitle;
    private String owsTitle;
    private String owsIncludeItems = "all";
    
    public LayerMetadata() {
        
    }

    public String getWmsTitle() {
        return wmsTitle;
    }

    public void setWmsTitle(String wmsTitle) {
        this.wmsTitle = wmsTitle;
    }

    public String getWfsTitle() {
        return wfsTitle;
    }

    public void setWfsTitle(String wfsTitle) {
        this.wfsTitle = wfsTitle;
    }

    public String getOwsTitle() {
        return owsTitle;
    }

    public void setOwsTitle(String owsTitle) {
        this.owsTitle = owsTitle;
    }

    public String getOwsIncludeItems() {
        return owsIncludeItems;
    }

    public void setOwsIncludeItems(String owsIncludeItems) {
        this.owsIncludeItems = owsIncludeItems;
    }
}
