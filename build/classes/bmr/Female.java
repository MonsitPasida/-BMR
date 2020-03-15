
package bmr;


public class Female {
    public double r = 9.6;
    public double t = 1.8;
    public double o = 4.7;
    public double w,a,b ;
    
    
    public double Weight(double r,  double w){
        return r*w;
    }//น้ำหนัก
    
    public double Height(double t,  double a){
        return t*a;
    }//ความสูง
    
    public double Age(double o,  double b){
        return o*b;
    }//อายุ
}
