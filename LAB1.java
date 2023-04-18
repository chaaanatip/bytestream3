
package bytesstreams3;


public class LAB1 {

    public static void main(String[] args) {
        Circle circle = new Circle();
        
        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        
        circle.draw();
        
        redCircle.draw();
        redRectangle.draw();
    
    }
    
}
