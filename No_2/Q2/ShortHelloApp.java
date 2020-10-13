// 卯木 優大
// 316025 
// 課題2 (2) ShortHelloApp

import java.awt.Frame;
import java.awt.Label;

public class ShortHelloApp
{
    public static void main(String[] args)
    {
        Frame frame = new Frame();
        Label label = new Label("こんにちは！");
    
        frame.add(label);
        frame.setSize(300,150);
        frame.setVisible(true);
    }
}