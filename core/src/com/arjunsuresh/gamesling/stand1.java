package com.arjunsuresh.gamesling;

import com.nilunder.bdx.*;
import javax.vecmath.*;


public class stand1 extends GameObject{
 public void init()
 {
//maxy=scene.objects.get("maxn").position().z;
//miny=scene.objects.get("minn").position().z;
 
 }
float maxy,miny;
float yinc=4f;
float angle=0f;




    public void main(){
    
     
orientation(Matrix3f.rotation(new Vector3f(-1,1,-1),(yinc+angle)*3.14f/180f));
angle=(angle+yinc)%360;
 
      
            
         
         
           
    }
    
}
