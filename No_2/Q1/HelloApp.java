// 卯木 優大
// 316025 
// 課題2 (1) HelloApp

public class HelloApp
{
    public static void main(String[] args)
    {
        java.awt.Frame frame;
        java.awt.Label label;
    
        frame = new java.awt.Frame();
        label = new java.awt.Label("こんにちは！");
    
        frame.add(label);
        frame.setSize(300,150);
        frame.setVisible(true);
    }
}