// 卯木 優大
// 316025 
// 課題2 (3) TwoButtonApp

import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;

public class TwoButtonApp
{
    public static void main(String[] args)
    {
        Frame frame = new Frame();
        Panel panel = new Panel();
        Button okButton = new Button("OK");
        Button calcelButton = new Button("CANCEL");
        
        //パネルにボタンを二つ配置
        panel.add(okButton);
        panel.add(calcelButton);
        //フレームにパネルを配置
        frame.add(panel);

        frame.setSize(300,150);
        frame.setVisible(true);
    }
}