import java.awt.Frame;
class mygui extends Frame{
    mygui(){
        setVisible(true);
        setSize(800,800);
    }
}


class test{
    public static void main(String args[]){
        new mygui();
    }
}