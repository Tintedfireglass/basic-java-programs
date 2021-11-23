import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math;
class geometry extends JFrame  implements ActionListener
{
    static JFrame frame;
    static JPanel dimensionpanel,shapepanel2D,shapepanel3D,propertyset,propertyset2D,propertyset3D,inputpanel,responsepanel;
    static JRadioButton dimension1,dimension2;
    static JRadioButton sphere,cube,cuboid,cone,cylinder;
    static JRadioButton circle,triangle,square,rectangle,rhombus;
    static JRadioButton faces,edges,vertices;
    static JRadioButton side,diameter,diagonal,circumference,perimeter,area;
    static JRadioButton slantheight,diam,diag,circum,perim,facearea,LSA,CSA,TSA,volume;
    static Button button;
    static TextField textbox1,textbox2,textbox3;
    static JLabel label;
    geometry()
    {
       frame=new JFrame("GEOMETRICAL INFORMATICS");
       
       
       responsepanel=new JPanel();
       inputpanel=new JPanel();
       dimensionpanel=new JPanel();
       shapepanel2D=new JPanel();
       shapepanel3D=new JPanel();
       propertyset=new JPanel();
       propertyset2D=new JPanel();
       propertyset3D=new JPanel();
       
       // button and textbox for response panel
       button= new Button("FIND");
       textbox1= new TextField();
       inputpanel.add(textbox1);
        textbox2= new TextField();
       inputpanel.add(textbox2);
        textbox3= new TextField();
       inputpanel.add(textbox3);
       inputpanel.add(button);
       
       inputpanel.setBorder(BorderFactory.createTitledBorder(
                   BorderFactory.createEtchedBorder(),"Enter value"));
       inputpanel.setLayout(new GridLayout(2,2));
       
      // label to give response.
      label=new JLabel("solution is :");
      responsepanel.add(label);
       //radio buttons for dimension panel
       ButtonGroup dimensiongroup = new ButtonGroup();
       dimension1=new JRadioButton("2D");
       dimension2=new JRadioButton("3D");
       dimensiongroup.add(dimension1);
       dimensiongroup.add(dimension2);
       dimensionpanel.add(dimension1);
       dimensionpanel.add(dimension2);
       
       //Add a titled border to the button panel.
       dimensionpanel.setBorder(BorderFactory.createTitledBorder(
                   BorderFactory.createEtchedBorder(), "Select Dimension"));
       dimensionpanel.setLayout(new GridLayout(2,1));
       dimensionpanel.setEnabled(false);
       //radio buttons for shape panel 2D
       ButtonGroup shape2Dgroup = new ButtonGroup();
       circle=new JRadioButton("Circle");
       triangle=new JRadioButton("Triangle");
       square=new JRadioButton("Square");
       rectangle=new JRadioButton("Rectangle");
       rhombus=new JRadioButton("Rhombus");
       shape2Dgroup.add(circle);
       shape2Dgroup.add(triangle);
       shape2Dgroup.add(square);
       shape2Dgroup.add(rectangle);
       shape2Dgroup.add(rhombus);
       shapepanel2D.add(circle);
       shapepanel2D.add(triangle);
       shapepanel2D.add(square);
       shapepanel2D.add(rectangle);
       shapepanel2D.add(rhombus);
        //Add a titled border to the button panel.
       shapepanel2D.setBorder(BorderFactory.createTitledBorder(
                  BorderFactory.createEtchedBorder(), "Select Shape"));
       shapepanel2D.setLayout(new GridLayout(5,1));
       
       
       //radio buttons for shape panel 3D
       ButtonGroup shape3Dgroup = new ButtonGroup();
       sphere=new JRadioButton("Sphere");
       cube=new JRadioButton("Cube");
       cuboid=new JRadioButton("Cuboid");
       cone=new JRadioButton("Cone");
       cylinder=new JRadioButton("Cylinder");
       shape3Dgroup.add(sphere);
       shape3Dgroup.add(cube);
       shape3Dgroup.add(cuboid);
       shape3Dgroup.add(cone);
       shape3Dgroup.add(cylinder);
       shapepanel3D.add(sphere);
       shapepanel3D.add(cube);
       shapepanel3D.add(cuboid);
       shapepanel3D.add(cone);
       shapepanel3D.add(cylinder);
       //Add a titled border to the button panel.
       shapepanel3D.setBorder(BorderFactory.createTitledBorder(
                  BorderFactory.createEtchedBorder(), "Select Shape"));
       shapepanel3D.setLayout(new GridLayout(5,1));
       
       
       
       //radio buttons for property set -1
       ButtonGroup propertysetgroup = new ButtonGroup();
       faces=new JRadioButton("Faces");
       edges=new JRadioButton("Edges");
       vertices=new JRadioButton("Vertices");
       propertysetgroup.add(faces);
       propertysetgroup.add(edges);
       propertysetgroup.add(vertices);
       propertyset.add(faces);
       propertyset.add(edges);
       propertyset.add(vertices);
       propertyset.setBorder(BorderFactory.createTitledBorder(
                  BorderFactory.createEtchedBorder(), "Select Measure"));
       propertyset.setLayout(new GridLayout(3,1));
       
       //radio buttons for property set -2 2D
       ButtonGroup propertyset2Dgroup = new ButtonGroup();
       side=new JRadioButton("Side");
       diameter=new JRadioButton("Diameter");
       diagonal=new JRadioButton("Diagonal");
       circumference=new JRadioButton("Circumference");
       perimeter=new JRadioButton("Perimeter");
       area=new JRadioButton("Area");
       propertyset2Dgroup.add(side);
       propertyset2Dgroup.add(diameter);
       propertyset2Dgroup.add(diagonal);
       propertyset2Dgroup.add(circumference);
       propertyset2Dgroup.add(perimeter);
       propertyset2Dgroup.add(area);
       propertyset2D.add(side);
       propertyset2D.add(diameter);
       propertyset2D.add(diagonal);
       propertyset2D.add(circumference);
       propertyset2D.add(perimeter);
       propertyset2D.add(area);
       propertyset2D.setBorder(BorderFactory.createTitledBorder(
                  BorderFactory.createEtchedBorder(), "Select Measure"));
       propertyset2D.setLayout(new GridLayout(6,1));
       
       //radio buttons for property set -2 3D
       ButtonGroup propertyset3Dgroup = new ButtonGroup();
       slantheight=new JRadioButton("SlantHeight");
       diam=new JRadioButton("Diameter");
       diag=new JRadioButton("Diagonal");
       circum=new JRadioButton("Circumference");
       perim=new JRadioButton("Perimeter");
       facearea=new JRadioButton("FaceArea");
       LSA=new JRadioButton("LSA");
       CSA=new JRadioButton("CSA");
       TSA=new JRadioButton("TSA");
       volume=new JRadioButton("Volume");
       propertyset3Dgroup.add(slantheight);
       propertyset3Dgroup.add(diam);
       propertyset3Dgroup.add(diag);
       propertyset3Dgroup.add(circum);
       propertyset3Dgroup.add(perim);
       propertyset3Dgroup.add(facearea);
       propertyset3Dgroup.add(LSA);
       propertyset3Dgroup.add(CSA);
       propertyset3Dgroup.add(TSA);
       propertyset3Dgroup.add(volume);
       propertyset3D.add(slantheight);
       propertyset3D.add(diam);
       propertyset3D.add(diag);
       propertyset3D.add(circum);
       propertyset3D.add(perim);
       propertyset3D.add(facearea);
       propertyset3D.add(LSA);
       propertyset3D.add(CSA);
       propertyset3D.add(TSA);
       propertyset3D.add(volume);
       propertyset3D.setBorder(BorderFactory.createTitledBorder(
                  BorderFactory.createEtchedBorder(), "Select Measure"));
       propertyset3D.setLayout(new GridLayout(6,1));
       
       
       frame.setLayout(new GridLayout(3,3));  
       
       
       //adding panel to frame
       
       
       frame.add(dimensionpanel);
       frame.add(propertyset);
       frame.add(shapepanel2D);
       frame.add(propertyset2D);
       frame.add(shapepanel3D);
       frame.add(propertyset3D);
       frame.add(inputpanel);
       frame.add(responsepanel);
       frame.setSize(750,750);
       frame.setVisible(true);
       //dimensionpanel.setEnabled(false);
       
       dimension1.addActionListener(this); 
       dimension2.addActionListener(this);
       circle.addActionListener(this);
       triangle.addActionListener(this);
       square.addActionListener(this);
       rectangle.addActionListener(this);
       rhombus.addActionListener(this);
       sphere.addActionListener(this);
       cuboid.addActionListener(this);
       cube.addActionListener(this);
       cone.addActionListener(this);
       cylinder.addActionListener(this);
       button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){    
     if((dimension2.isSelected())){  
     slantheight.setEnabled(true);diam.setEnabled(true);diag.setEnabled(true);circum.setEnabled(true);perim.setEnabled(true);
     facearea.setEnabled(true);LSA.setEnabled(true);CSA.setEnabled(true);TSA.setEnabled(true);volume.setEnabled(true);
     shapepanel2D.setEnabled(false);
     shapepanel3D.setEnabled(true);
     propertyset.setEnabled(false);
     propertyset2D.setEnabled(false);
     sphere.setEnabled(true); cuboid.setEnabled(true); cube.setEnabled(true); cone.setEnabled(true); cylinder.setEnabled(true);
     circle.setEnabled(false); triangle.setEnabled(false); square.setEnabled(false); rectangle.setEnabled(false); rhombus.setEnabled(false);
     faces.setEnabled(false);edges.setEnabled(false);vertices.setEnabled(false);
     
     side.setEnabled(false);diameter.setEnabled(false);diagonal.setEnabled(false);circumference.setEnabled(false);perimeter.setEnabled(false);
     area.setEnabled(false);
     revalidate();
    } 
     if(dimension1.isSelected()){ 
     faces.setEnabled(false);edges.setEnabled(false);vertices.setEnabled(false);
     propertyset.setEnabled(false);
     propertyset.setEnabled(false);
     propertyset2D.setEnabled(true);
     propertyset3D.setEnabled(false);
     slantheight.setEnabled(false);diam.setEnabled(false);diag.setEnabled(false);circum.setEnabled(false);perim.setEnabled(false);
     facearea.setEnabled(false);LSA.setEnabled(false);CSA.setEnabled(false);TSA.setEnabled(false);volume.setEnabled(false);
     shapepanel3D.setEnabled(false);
     shapepanel2D.setEnabled(true);
     circle.setEnabled(true); triangle.setEnabled(true); square.setEnabled(true); rectangle.setEnabled(true); rhombus.setEnabled(true);
     sphere.setEnabled(false); cuboid.setEnabled(false); cube.setEnabled(false); cone.setEnabled(false); cylinder.setEnabled(false);
     
     side.setEnabled(true);diameter.setEnabled(true);diagonal.setEnabled(true);circumference.setEnabled(true);perimeter.setEnabled(true);
     area.setEnabled(true);
     revalidate();
     
    } 
    if ((circle.isSelected())&&  (dimension1.isSelected())){
        side.setEnabled(false);diameter.setEnabled(true);diagonal.setEnabled(false);circumference.setEnabled(true);
        perimeter.setEnabled(false);
        area.setEnabled(true); 
        revalidate();
    }
    if ((triangle.isSelected())&&  (dimension1.isSelected())){
        side.setEnabled(false);diameter.setEnabled(false);diagonal.setEnabled(false);circumference.setEnabled(false);
        perimeter.setEnabled(true);
        area.setEnabled(true); 
        revalidate();
    }
    if ((square.isSelected())&&  (dimension1.isSelected())){
        side.setEnabled(false);diameter.setEnabled(false);diagonal.setEnabled(true);circumference.setEnabled(false);
        perimeter.setEnabled(true);
        area.setEnabled(true); 
        revalidate();
    }
    if ((rectangle.isSelected())&&  (dimension1.isSelected())){
        side.setEnabled(false);diameter.setEnabled(false);diagonal.setEnabled(true);circumference.setEnabled(false);
        perimeter.setEnabled(true);
        area.setEnabled(true); 
        revalidate();
    }
        if ((rhombus.isSelected())&&  (dimension1.isSelected())){
        side.setEnabled(false);diameter.setEnabled(false);diagonal.setEnabled(false);circumference.setEnabled(false);
        perimeter.setEnabled(true);
        area.setEnabled(true); 
        revalidate();
    }
       if ((sphere.isSelected())&&  (dimension2.isSelected())){
        slantheight.setEnabled(false);diam.setEnabled(true);diag.setEnabled(false);circum.setEnabled(false);perim.setEnabled(false);
     facearea.setEnabled(false);LSA.setEnabled(false);CSA.setEnabled(false);TSA.setEnabled(true);volume.setEnabled(true);
        
        
        revalidate();
    }

       if ((cube.isSelected())&&  (dimension2.isSelected())){
        slantheight.setEnabled(false);diam.setEnabled(false);diag.setEnabled(false);circum.setEnabled(false);perim.setEnabled(false);
     facearea.setEnabled(true);LSA.setEnabled(true);CSA.setEnabled(false);TSA.setEnabled(true);volume.setEnabled(true);
        
        
        revalidate();
    }
       if ((cuboid.isSelected())&&  (dimension2.isSelected())){
        slantheight.setEnabled(false);diam.setEnabled(false);diag.setEnabled(false);circum.setEnabled(false);perim.setEnabled(false);
     facearea.setEnabled(false);LSA.setEnabled(true);CSA.setEnabled(false);TSA.setEnabled(true);volume.setEnabled(true);
        
        
        revalidate();
    }
       if ((cone.isSelected())&&  (dimension2.isSelected())){
        slantheight.setEnabled(true);diam.setEnabled(true);diag.setEnabled(false);circum.setEnabled(false);perim.setEnabled(false);
     facearea.setEnabled(false);LSA.setEnabled(false);CSA.setEnabled(true);TSA.setEnabled(true);volume.setEnabled(true);
        
        
        revalidate();
    }
       if ((cylinder.isSelected())&&  (dimension2.isSelected())){
        slantheight.setEnabled(false);diam.setEnabled(true);diag.setEnabled(false);circum.setEnabled(false);perim.setEnabled(false);
     facearea.setEnabled(false);LSA.setEnabled(false);CSA.setEnabled(true);TSA.setEnabled(true);volume.setEnabled(true);
        
        
        revalidate();
    }
           if ((sphere.isSelected()) &&  (dimension2.isSelected()) && (diam.isSelected())){
         int radius = Integer.valueOf(textbox1.getText());
         label.setText("the answer is " +String.valueOf(radius*2));
         
        revalidate();
    }
      if ((sphere.isSelected()) &&  (dimension2.isSelected()) && (TSA.isSelected())){
         int radius = Integer.valueOf(textbox1.getText());
         label.setText("the answer is " +String.valueOf(4*3.141*radius*radius));
         
        revalidate();
    }
      if ((sphere.isSelected()) &&  (dimension2.isSelected()) && (volume.isSelected())){
         int radius = Integer.valueOf(textbox1.getText());
         label.setText("the answer is " +String.valueOf((4/3)*3.141*radius*radius*radius));
         
        revalidate();
    }
      if ((cube.isSelected()) &&  (dimension2.isSelected()) && (facearea.isSelected())){
         int side = Integer.valueOf(textbox1.getText());
         label.setText("the answer is " +String.valueOf(side*side));
         
        revalidate();
    }
     if ((cube.isSelected()) &&  (dimension2.isSelected()) && (LSA.isSelected())){
         int side = Integer.valueOf(textbox1.getText());
         label.setText("the answer is " +String.valueOf(4*side*side));
         
        revalidate();
    }
     if ((cube.isSelected()) &&  (dimension2.isSelected()) && (TSA.isSelected())){
         int side = Integer.valueOf(textbox1.getText());
         label.setText("the answer is " +String.valueOf(6*side*side));
         
        revalidate();
    }
    if ((cube.isSelected()) &&  (dimension2.isSelected()) && (volume.isSelected())){
         int side = Integer.valueOf(textbox1.getText());
         label.setText("the answer is " +String.valueOf(side*side*side));
         
        revalidate();
    }
    if ((cuboid.isSelected()) &&  (dimension2.isSelected()) && (volume.isSelected())){
         int l= Integer.valueOf(textbox1.getText());
         int b= Integer.valueOf(textbox2.getText());
         int h= Integer.valueOf(textbox3.getText());
         label.setText("the answer is " +String.valueOf(l*b*h));
         
        revalidate();
    }
    if ((cuboid.isSelected()) &&  (dimension2.isSelected()) && (TSA.isSelected())){
         int l= Integer.valueOf(textbox1.getText());
         int b= Integer.valueOf(textbox2.getText());
         int h= Integer.valueOf(textbox3.getText());
         label.setText("the answer is " +String.valueOf(2*((l*b)+(b*h)+(l*h))));
         
        revalidate();
    }
    if ((cuboid.isSelected()) &&  (dimension2.isSelected()) && (LSA.isSelected())){
         int l= Integer.valueOf(textbox1.getText());
         int b= Integer.valueOf(textbox2.getText());
         int h= Integer.valueOf(textbox3.getText());
         label.setText("the answer is " +String.valueOf(2*h*(l+b)));
         
        revalidate();
    }
    if ((cone.isSelected()) &&  (dimension2.isSelected()) && (volume.isSelected())){
         int r = Integer.valueOf(textbox1.getText());
         int h = Integer.valueOf(textbox2.getText());
         double l = Math.sqrt((r*r)+(h*h));
         label.setText("the answer is " +String.valueOf(1/3*3.141*r*r*h));
         
        revalidate();
    }
    if ((cone.isSelected()) &&  (dimension2.isSelected()) && (CSA.isSelected())){
         int r = Integer.valueOf(textbox1.getText());
         int h = Integer.valueOf(textbox2.getText());
         double l = Math.sqrt((r*r)+(h*h));
         label.setText("the answer is " +String.valueOf(3.141*r*l));
         
        revalidate();
    }
    if ((cone.isSelected()) &&  (dimension2.isSelected()) && (CSA.isSelected())){
         int r = Integer.valueOf(textbox1.getText());
         int h = Integer.valueOf(textbox2.getText());
         double l = Math.sqrt((r*r)+(h*h));
         label.setText("the answer is " +String.valueOf(l));
         
        revalidate();
    }
    if ((cone.isSelected()) &&  (dimension2.isSelected()) && (TSA.isSelected())){
         int r = Integer.valueOf(textbox1.getText());
         int h = Integer.valueOf(textbox2.getText());
         double l = Math.sqrt((r*r)+(h*h));
         label.setText("the answer is " +String.valueOf(3.141*r*(r+l)));
         
        revalidate();
    }
           if ((cone.isSelected()) &&  (dimension2.isSelected()) && (diam.isSelected())){
         int radius = Integer.valueOf(textbox1.getText());
         label.setText("the answer is " +String.valueOf(radius*2));
         
        revalidate();
    }
    if ((cylinder.isSelected()) &&  (dimension2.isSelected()) && (CSA.isSelected())){
         int r = Integer.valueOf(textbox1.getText());
         int h = Integer.valueOf(textbox2.getText());
         label.setText("the answer is " +String.valueOf(2*3.141*r*h));
         
        revalidate();
    }
    if ((cylinder.isSelected()) &&  (dimension2.isSelected()) && (TSA.isSelected())){
         int r = Integer.valueOf(textbox1.getText());
         int h = Integer.valueOf(textbox2.getText());
         label.setText("the answer is " +String.valueOf(2*3.141*r*(r+h)));
         
        revalidate();
    }
    if ((cylinder.isSelected()) &&  (dimension2.isSelected()) && (volume.isSelected())){
         int r = Integer.valueOf(textbox1.getText());
         int h = Integer.valueOf(textbox2.getText());
         label.setText("the answer is " +String.valueOf(3.141*r*r*h));
         
        revalidate();
    }
    if ((cylinder.isSelected()) &&  (dimension2.isSelected()) && (diam.isSelected())){
         int radius = Integer.valueOf(textbox1.getText());
         label.setText("the answer is " +String.valueOf(radius*2));
         
        revalidate();
    }
    if ((circle.isSelected()) &&  (dimension1.isSelected()) && (diameter.isSelected())){
         int radius = Integer.valueOf(textbox1.getText());
         label.setText("the answer is " +String.valueOf(radius*2));
         
        revalidate();
    }
    if ((circle.isSelected()) &&  (dimension1.isSelected()) && (circumference.isSelected())){
         int radius = Integer.valueOf(textbox1.getText());
         label.setText("the answer is " +String.valueOf(3.141*radius*2));
         
        revalidate();
    }
    if ((circle.isSelected()) &&  (dimension1.isSelected()) && (area.isSelected())){
         int radius = Integer.valueOf(textbox1.getText());
         label.setText("the answer is " +String.valueOf(3.141*radius*radius));
         
        revalidate();
    }
    if ((triangle.isSelected()) &&  (dimension1.isSelected()) && (area.isSelected())){
         int b = Integer.valueOf(textbox1.getText());
         int h = Integer.valueOf(textbox2.getText()); 
         label.setText("the answer is " +String.valueOf(0.5*b*h));
         
        revalidate();
    }
    if ((triangle.isSelected()) &&  (dimension1.isSelected()) && (perimeter.isSelected())){
         int a = Integer.valueOf(textbox1.getText());
         int b = Integer.valueOf(textbox2.getText());
         int c = Integer.valueOf(textbox3.getText());
         label.setText("the answer is " +String.valueOf(a+b+c));
         
        revalidate();
    }
    if ((rectangle.isSelected()) &&  (dimension1.isSelected()) && (perimeter.isSelected())){
         int b = Integer.valueOf(textbox1.getText());
         int l = Integer.valueOf(textbox2.getText()); 
         label.setText("the answer is " +String.valueOf(2*(b+l)));
         
        revalidate();
    }
    if ((rectangle.isSelected()) &&  (dimension1.isSelected()) && (area.isSelected())){
         int l = Integer.valueOf(textbox1.getText());
         int b = Integer.valueOf(textbox2.getText()); 
         label.setText("the answer is " +String.valueOf(b*l));
         
        revalidate();
    }
    if ((rhombus.isSelected()) &&  (dimension1.isSelected()) && (area.isSelected())){
         int b = Integer.valueOf(textbox1.getText());
         int h = Integer.valueOf(textbox2.getText());
         label.setText("the answer is " +String.valueOf(b*h));
         
        revalidate();
    }
    if ((rhombus.isSelected()) &&  (dimension1.isSelected()) && (perimeter.isSelected())){
         int s = Integer.valueOf(textbox1.getText());
         label.setText("the answer is " +String.valueOf(4*s));
         
        revalidate();
    }
   } 
}
public class areafinder{
      public static void main(){
          System.out.println("hello world");
        geometry obj = new geometry();
    }
}
