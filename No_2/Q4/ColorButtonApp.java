// 卯木 優大
// 316025 
// 課題2 (4) ColorButtonApp

import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Color;

public class ColorButtonApp
{
    public static void main(String[] args)
    {
        Frame frame = new Frame();
        Panel panel = new Panel();
        Button okButton = new Button("OK");
        Button cancelButton = new Button("CANCEL");
        Button nameButton = new Button("卯木優大");
        
        //パネルにボタンを3つ配置
        panel.add(okButton);
        panel.add(cancelButton);
        panel.add(nameButton);

        //色をセット
        okButton.setForeground(Color.red);
        cancelButton.setForeground(Color.blue);

        //フレームにパネルを配置
        frame.add(panel);

        frame.setSize(300,150);
        frame.setVisible(true);
    }
}
