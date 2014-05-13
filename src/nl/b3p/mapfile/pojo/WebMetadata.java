package nl.b3p.mapfile.pojo;

/**
 *
 * @author Boy de Wit, B3Partners
 */
public class WebMetadata {
    
    private String wmsTitle;
    private String wmsOnlineResource;
    private String wmsSrs = "EPSG:28992";
    private String wfsTitle;
    private String wfsOnlineResource;
    private String wfsSrs = "EPSG:28992";
    private String owsTitle;
    private String owsOnlineResource;
    private String owsSrs = "EPSG:28992";
    private String owsEnableRequest = "*";

    public WebMetadata() {
        
    }

    public String getWmsTitle() {
        return wmsTitle;
    }

    public void setWmsTitle(String wmsTitle) {
        this.wmsTitle = wmsTitle;
    }

    public String getWmsOnlineResource() {
        return wmsOnlineResource;
    }

    public void setWmsOnlineResource(String wmsOnlineResource) {
        this.wmsOnlineResource = wmsOnlineResource;
    }

    public String getWmsSrs() {
        return wmsSrs;
    }

    public void setWmsSrs(String wmsSrs) {
        this.wmsSrs = wmsSrs;
    }

    public String getWfsTitle() {
        return wfsTitle;
    }

    public void setWfsTitle(String wfsTitle) {
        this.wfsTitle = wfsTitle;
    }

    public String getWfsOnlineResource() {
        return wfsOnlineResource;
    }

    public void setWfsOnlineResource(String wfsOnlineResource) {
        this.wfsOnlineResource = wfsOnlineResource;
    }

    public String getWfsSrs() {
        return wfsSrs;
    }

    public void setWfsSrs(String wfsSrs) {
        this.wfsSrs = wfsSrs;
    }

    public String getOwsTitle() {
        return owsTitle;
    }

    public void setOwsTitle(String owsTitle) {
        this.owsTitle = owsTitle;
    }

    public String getOwsOnlineResource() {
        return owsOnlineResource;
    }

    public void setOwsOnlineResource(String owsOnlineResource) {
        this.owsOnlineResource = owsOnlineResource;
    }

    public String getOwsSrs() {
        return owsSrs;
    }

    public void setOwsSrs(String owsSrs) {
        this.owsSrs = owsSrs;
    }

    public String getOwsEnableRequest() {
        return owsEnableRequest;
    }

    public void setOwsEnableRequest(String owsEnableRequest) {
        this.owsEnableRequest = owsEnableRequest;
    }
}
