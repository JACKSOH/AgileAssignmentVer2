/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;
import java.util.List;
/**
 *
 * @author boonk
 */
public class CustomizeProduct extends Product{
    
    private String style;
    private String size;
    private String priority;
    
    
    public CustomizeProduct() {
        super();
    }

    public CustomizeProduct(String style, String size, String priority) {
        this.style = style;
        this.size = size;
        this.priority = priority;
    }

    public CustomizeProduct(String style, String size, String priority, String prodID, double prodPrice) {
        super(prodID, prodPrice);
        this.style = style;
        this.size = size;
        this.priority = priority;
    }

   

  
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "CustomizeProduct{" + "style=" + style + ", size=" + size + ", priority=" + priority + '}';
    }
    
}
