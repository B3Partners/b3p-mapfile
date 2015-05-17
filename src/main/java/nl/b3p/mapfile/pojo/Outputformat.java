package nl.b3p.mapfile.pojo;

/**
 *
 * @author Boy de Wit, B3Partners
 */
public class Outputformat {
    
    private String name = "AGG";
    private String driver = "AGG/PNG";
    private String mimeType = "image/png";
    private String imageMode = "RGBA";
    private String extension = "png";
    private String formatOption = "GAMMA=0.75";

    public Outputformat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getImageMode() {
        return imageMode;
    }

    public void setImageMode(String imageMode) {
        this.imageMode = imageMode;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getFormatOption() {
        return formatOption;
    }

    public void setFormatOption(String formatOption) {
        this.formatOption = formatOption;
    }
}
