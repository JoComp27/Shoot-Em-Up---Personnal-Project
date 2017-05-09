/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shootemup;
import java.util.Vector;
/**
 *
 * @author Administrateur
 */
public class Projectile {
    private Vector Vvelocity;
    private Vector position;
    Projectile(Vector position, boolean IsPlayer){
        if(IsPlayer){
            this.Vvelocity.set(0,-1);
        }
        else{
            this.Vvelocity.set(0,1);
        }
        
        this.position.set(0,(int)(position.get(0))+1);
        this.position.set(1,(int)(position.get(0))+1);
        
    }
    public void AniMove(){
        //Move According to velocity w/ Animation
    }
    public void move(int x, int y){
        this.position.set(0,x);
        this.position.set(1,y);
    }
}
