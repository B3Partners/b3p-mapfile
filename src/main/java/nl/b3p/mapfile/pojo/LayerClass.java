package nl.b3p.mapfile.pojo;

/**
 *
 * @author Boy de Wit, B3Partners
 */
public class LayerClass {
    
    private String expression;
    private String name;
    private ClassStyle style;  
    
    public LayerClass() {
        
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassStyle getStyle() {
        return style;
    }

    public void setStyle(ClassStyle style) {
        this.style = style;
    }    
}
