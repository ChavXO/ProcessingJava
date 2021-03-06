import java.awt.BasicStroke;
import java.awt.Color;

/**
 * Summer 2015 - Processing-inspired Java Graphics Library
 * ShapeAttributes.java
 * Purpose: Creates a class that holds a shape's attributes.
 *
 * @author Duy Tran
 * @version 1.0 6/10/2015
 */

public class ShapeAttributes{
    private BasicStroke strokeStyle;
    private float strokeWeight = 1;
    private int strokeCap = BasicStroke.CAP_BUTT;
    private int strokeJoin = BasicStroke.JOIN_MITER;
    private Color strokeColor = Color.BLACK;
    private Color fillColor = Color.WHITE;
    private boolean fill = true;
    private boolean stroke = true;
    private boolean smooth = true;
    
    public ShapeAttributes(){
        setStrokeStyle();
    }
    
    public ShapeAttributes copy(){
        ShapeAttributes newAtt = new ShapeAttributes();
        newAtt.setSmooth(this.getSmooth());
        newAtt.setFill(this.getFill());
        newAtt.setStroke(this.getStroke());
        newAtt.setFillColor(this.getFillColor());
        newAtt.setStrokeColor(this.getStrokeColor());
        newAtt.setStrokeWeight(this.getStrokeWeight());
        newAtt.setStrokeCap(this.getStrokeCap());
        newAtt.setStrokeJoin(this.getStrokeJoin());
        newAtt.setStrokeStyle();
        return newAtt;
    }
    
    public boolean getSmooth(){
    	return smooth;
    }
    
    public boolean getFill(){
        return fill;
    }
    
    public Color getFillColor(){
        return fillColor;
    }
    
    public boolean getStroke(){
        return stroke;
    }
    
    public Color getStrokeColor(){
        return strokeColor;
    }
       
    public BasicStroke getStrokeStyle(){
        return strokeStyle;
    }
    
    public int getStrokeCap(){
        return strokeCap;
    }
    
    public int getStrokeJoin(){
        return strokeJoin;
    }
    
    public float getStrokeWeight(){
        return strokeWeight;
    }
    
    public void setSmooth(boolean b){
        smooth = b;
    }
    
    public void setFill(boolean b){
        fill = b;
    }
    
    public void setFillColor(Color c){
        fillColor = c;
    }
    
    public void setStroke(boolean b){
        stroke = b;
    }
    
    public void setStrokeColor(Color c){
        strokeColor = c;
    }
    
    public void setStrokeCap(int i){
        strokeCap = i;
        setStrokeStyle();
    }
    
    public void setStrokeJoin(int i){
        strokeJoin = i;
        setStrokeStyle();
    }
    
    public void setStrokeWeight(float w){
        strokeWeight = w;
        setStrokeStyle();
    }
    
    public void setStrokeStyle(){
        strokeStyle = new BasicStroke(strokeWeight, strokeCap, strokeJoin);
    }
    
    @Override
    public String toString(){
        return ("stroke weight: " + strokeStyle.getLineWidth() +
                "stroke join: " + strokeStyle.getLineJoin() +
                "stroke cap: " + strokeStyle.getEndCap() +
                " strokeColor: " + strokeColor +
                " fillColor: " + fillColor +
                " fill: " + fill + " stroke: " + stroke +
        		" smooth: " + smooth);
    }
}