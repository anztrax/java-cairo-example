#java cairo graphics : 

##how to run : 
because there's no official maven repo for cairo, so we must added manually 

- prerequisite :
  1. install cairo to your supported OS : 
      - ```sudo apt-get install libcairo2-dev```  [link](https://www.cairographics.org/download/)
  2. install cairo java library (jar)
      - ```sudo apt-get install libjava-gnome-java```  [link](https://www.cairographics.org/cairo-java/)
     
-add jar to intellij idea :
  1. menu bar : file -> project structure -> modules --> maven --> maven_main 
  2. go to depedencies tab 
  3. click + sign 
  4. go to downloaded (cairo / gtk) jar directory (https://packages.debian.org/sid/all/libjava-gnome-java/filelist)
  5. and the run the project 
  
  