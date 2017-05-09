/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shootemup;
import javafx.scene.shape.Polygon;
/**
 *
 * @author Administrateur
 */
public class Player extends Polygon{
    private Polygon player;
    Player(){
       player = new Polygon(0,0,
                                                       8,8,
                                                       4,11,
                                                      15,15,
                                                      39,11,
                                                      29,6,
                                                      34,3,
                                                      34,-3,
                                                      29,-6,
                                                     39,-11,
                                                     15,-15,
                                                     4,-11,
                                                     8,-8,
                                                     0,0);
    }
    public void  goBoom(){
        
    }
    public void aniMovement(int Vertical, int horizontal){
        
    }
    public void move(int X, int Y){
        
    }
}
