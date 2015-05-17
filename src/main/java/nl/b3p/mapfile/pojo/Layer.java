package nl.b3p.mapfile.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Boy de Wit, B3Partners
 */
public class Layer {

    private String name;
    private String type;
    private int maxScaleDenom = 5000;
    private int minScaleDenom = 0;
    private String connectionType;
    private String connectionUser;
    private String connectionPassword;
    private String connectionHost;
    private int connectionPort;
    private String connectionDatabase;
    private String dataGeomColumn;
    private String dataTableName;
    private String dataPrimaryKeyColumn;
    private int dataSrid;
    private String filter;
    private String status = "OFF";
    private String dump = "TRUE";
    private String template = "fooOnlyForWMSGetFeatureInfo";
    private LayerMetadata metadata = new LayerMetadata();
    private int opacity = 100;
    private List<LayerClass> classes;
    
    public Layer() {
        
    }
    
    public void addLayerClass(LayerClass lc) {
        if (classes == null) {
            classes = new ArrayList<LayerClass>();
        }
        
        classes.add(lc);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxScaleDenom() {
        return maxScaleDenom;
    }

    public void setMaxScaleDenom(int maxScaleDenom) {
        this.maxScaleDenom = maxScaleDenom;
    }

    public int getMinScaleDenom() {
        return minScaleDenom;
    }

    public void setMinScaleDenom(int minScaleDenom) {
        this.minScaleDenom = minScaleDenom;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public String getConnectionUser() {
        return connectionUser;
    }

    public void setConnectionUser(String connectionUser) {
        this.connectionUser = connectionUser;
    }

    public String getConnectionPassword() {
        return connectionPassword;
    }

    public void setConnectionPassword(String connectionPassword) {
        this.connectionPassword = connectionPassword;
    }

    public String getConnectionHost() {
        return connectionHost;
    }

    public void setConnectionHost(String connectionHost) {
        this.connectionHost = connectionHost;
    }

    public int getConnectionPort() {
        return connectionPort;
    }

    public void setConnectionPort(int connectionPort) {
        this.connectionPort = connectionPort;
    }

    public String getConnectionDatabase() {
        return connectionDatabase;
    }

    public void setConnectionDatabase(String connectionDatabase) {
        this.connectionDatabase = connectionDatabase;
    }

    public String getDataGeomColumn() {
        return dataGeomColumn;
    }

    public void setDataGeomColumn(String dataGeomColumn) {
        this.dataGeomColumn = dataGeomColumn;
    }

    public String getDataTableName() {
        return dataTableName;
    }

    public void setDataTableName(String dataTableName) {
        this.dataTableName = dataTableName;
    }

    public String getDataPrimaryKeyColumn() {
        return dataPrimaryKeyColumn;
    }

    public void setDataPrimaryKeyColumn(String dataPrimaryKeyColumn) {
        this.dataPrimaryKeyColumn = dataPrimaryKeyColumn;
    }

    public int getDataSrid() {
        return dataSrid;
    }

    public void setDataSrid(int dataSrid) {
        this.dataSrid = dataSrid;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDump() {
        return dump;
    }

    public void setDump(String dump) {
        this.dump = dump;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public LayerMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(LayerMetadata metadata) {
        this.metadata = metadata;
    }

    public int getOpacity() {
        return opacity;
    }

    public void setOpacity(int opacity) {
        this.opacity = opacity;
    }

    public List<LayerClass> getClasses() {
        return classes;
    }

    public void setClasses(List<LayerClass> classes) {
        this.classes = classes;
    }
}
