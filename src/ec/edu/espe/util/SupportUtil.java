/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.util;

import ec.edu.espe.graphics.forms.MainMenu;
import ec.edu.espe.math.geometry.shape.Shape;
import ec.edu.espe.math.geometry.solids.solids.SolidInterface;
import ec.edu.espe.metrictransformation.Transformator;
import static ec.edu.espe.util.TransformationTable.transT;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author alexander
 */
public class SupportUtil {
    //Validations and control suport
    public static void openMainMenu(JFrame a){
        MainMenu objMenu=new MainMenu();
        objMenu.show();
        a.dispose();
    }
    public static void showAreaPerimeter(Shape a,JTextField area,JTextField perimeter,int index1,int index2){
        float ar=(float) Math.sqrt(a.CalculateArea());
        float pe=a.CalculatePerimeter();
        area.setText(Float.toString((float)Math.pow(Transformator.transformation(ar,transT[index1],transT[index2]),2)));
        perimeter.setText(Float.toString((float)Transformator.transformation(pe,transT[index1],transT[index2])));
    }
    public static void showAreaVolume(SolidInterface a,JTextField area,JTextField volume,int index1,int index2){
        float ar=(float) Math.sqrt(a.CalculateArea());
        float vol=(float)Math.cbrt(a.CalculateVolume());
        area.setText(Float.toString((float)Math.pow(Transformator.transformation(ar,transT[index1],transT[index2]),2)));
        volume.setText(Float.toString((float)Math.pow(Transformator.transformation(vol,transT[index1],transT[index2]),3)));
    }
    public static void MaxMinComparison(float max,float min){
        if(max<=min){
            throw new NumberFormatException();
        }
    }
}
