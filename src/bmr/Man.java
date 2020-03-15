
package bmr;


public class Man {
    public double r = 13.7;
    public double t = 5;
    public double o = 6.8;
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
