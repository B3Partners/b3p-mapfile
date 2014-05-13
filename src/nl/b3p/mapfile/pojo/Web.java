package nl.b3p.mapfile.pojo;

/**
 *
 * @author Boy de Wit, B3Partners
 */
public class Web {
    private String imagePath = "/tmp/";
    private String imageUrl = "/tmp/";
    private WebMetadata metadata = new WebMetadata();
    private String template = "fooOnlyForWMSGetFeatureInfo";

    public Web() {
        
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public WebMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(WebMetadata metadata) {
        this.metadata = metadata;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
}
