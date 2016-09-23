/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.util;

import ec.edu.espe.graphics.forms.MainMenu;
import ec.edu.espe.math.geometry.shape.Shape;
import ec.edu.espe.math.geometry.solids.solids.SolidInterface;
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
    public static void showAreaPerimeter(Shape a,JTextField area,JTextField perimeter){
        area.setText(Float.toString(a.CalculateArea()));
        perimeter.setText(Float.toString(a.CalculatePerimeter()));
    }
    public static void showAreaVolume(SolidInterface a,JTextField area,JTextField volume){
        area.setText(Float.toString(a.CalculateArea()));
        volume.setText(Float.toString(a.CalculateVolume()));
    }
    public static void MaxMinComparison(float max,float min){
        if(max<=min){
            throw new NumberFormatException();
        }
    }
}
