
package bmr;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        Man m = new Man();
        Female f = new Female();
        
        double weight,height,age,bmr,td;
       
        System.out.println("================================================");
        System.out.println("****** ยินต้อนรับสู่ โปรแกรมคำนวน ค่าเผาผลาญ *******");
        System.out.println("================================================");
        System.out.println(" กด 1 ผู้ชาย");
        System.out.println(" กด 2 ผู้หญิง");
        System.out.println("================================================");
        System.out.print("กรุณากรอกตัวเลข ");
        int Select = sc.nextInt();
        System.out.println("================================================");
        
        if (Select == 1){
            System.out.println("****** ผู้ชาย *****");
            System.out.println("================================================");
            System.out.print("กรอกน้ำหนัก: ");
            weight = sc.nextInt();
            m.w = weight;
            System.out.print("กรอกส่วนสูง: ");
            height = sc.nextInt();
            m.a = height;
            System.out.print("กรอกอายุ: ");
            age = sc.nextInt();
            m.b = age;
            bmr = 66 + m.Weight(m.r, m.w) + m.Height(m.t, m.a) - m.Age(m.o, m.b) ;
            System.out.println("================================================");
            System.out.println("***เลือกกิจกรรม***");
            System.out.println("================================================");
            System.out.println("1. นั่งทำงานอยู่กับที่ และไม่ได้ออกกำลังกายเลย");
            System.out.println("2. ออกกำลังกายหรือเล่นกีฬาเล็กน้อย ประมาณอาทิตย์ละ 1-3 วัน");
            System.out.println("3. ออกกำลังกายหรือเล่นกีฬาปานกลาง ประมาณอาทิตย์ละ 3-5 วัน");
            System.out.println("4.ออกกำลังกายหรือเล่นกีฬาอย่างหนัก ประมาณอาทิตย์ละ 6-7 วัน");
            System.out.println("5. ออกกำลังกายหรือเล่นกีฬาอย่างหนักทุกวันเช้าเย็น");
            System.out.println("================================================");
            System.out.print("กรุณากรอกตัวเลข ");
            int Tdee = sc.nextInt();
            System.out.println("================================================");
            if( Tdee == 1)
            {
                td = bmr * 1.2;
                System.out.println("พลังงานที่จำเป็นพื้นฐานในการมีชีวิต คือ: "+bmr+" กิโลแคลอรี่");
                System.out.println("พลังงานที่คุณใช้ในแต่ละวัน คือ: "+td+" กิโลแคลอรี่");
            }
            else if( Tdee == 2)
            {
                td = bmr * 1.375;
                System.out.println("พลังงานที่จำเป็นพื้นฐานในการมีชีวิต คือ: "+bmr+" กิโลแคลอรี่");
                System.out.println("พลังงานที่คุณใช้ในแต่ละวัน คือ: "+td+" กิโลแคลอรี่");
            }
            else if( Tdee == 3)
            {
                td = bmr * 1.55;
                System.out.println("พลังงานที่จำเป็นพื้นฐานในการมีชีวิต คือ: "+bmr+" กิโลแคลอรี่");
                System.out.println("พลังงานที่คุณใช้ในแต่ละวัน คือ: "+td+" กิโลแคลอรี่");
            }
            else if( Tdee == 4)
            {
                td = bmr * 1.725;
                System.out.println("พลังงานที่จำเป็นพื้นฐานในการมีชีวิต คือ: "+bmr+" กิโลแคลอรี่");
                System.out.println("พลังงานที่คุณใช้ในแต่ละวัน คือ: "+td+" กิโลแคลอรี่");
            }
            else if( Tdee == 5)
            {
                td = bmr * 1.9;
                System.out.println("พลังงานที่จำเป็นพื้นฐานในการมีชีวิต คือ: "+bmr+" กิโลแคลอรี่");
                System.out.println("พลังงานที่คุณใช้ในแต่ละวัน คือ: "+td+" กิโลแคลอรี่");
            }
            
            System.out.println("================================================");
            
        }
        
        else if (Select == 2){
            System.out.println("****** ผู้หญิง *****");
            System.out.println("================================================");
            System.out.print("กรอกน้ำหนัก: ");
            weight = sc.nextInt();
            f.w = weight;
            System.out.print("กรอกส่วนสูง: ");
            height = sc.nextInt();
            f.a = height;
            System.out.print("กรอกอายุ: ");
            age = sc.nextInt();
            f.b = age;
            bmr = 655 + f.Weight(f.r, f.w) + f.Height(f.t, f.a) - f.Age(f.o, f.b) ;
            System.out.println("================================================");
            System.out.println("***เลือกกิจกรรม***");
            System.out.println("================================================");
            System.out.println("1. นั่งทำงานอยู่กับที่ และไม่ได้ออกกำลังกายเลย");
            System.out.println("2. ออกกำลังกายหรือเล่นกีฬาเล็กน้อย ประมาณอาทิตย์ละ 1-3 วัน");
            System.out.println("3. ออกกำลังกายหรือเล่นกีฬาปานกลาง ประมาณอาทิตย์ละ 3-5 วัน");
            System.out.println("4.ออกกำลังกายหรือเล่นกีฬาอย่างหนัก ประมาณอาทิตย์ละ 6-7 วัน");
            System.out.println("5. ออกกำลังกายหรือเล่นกีฬาอย่างหนักทุกวันเช้าเย็น");
            System.out.println("================================================");
            System.out.print("กรุณากรอกตัวเลข ");
            int Tdee = sc.nextInt();
            System.out.println("================================================");
            if( Tdee == 1)
            {
                td = bmr * 1.2;
                System.out.println("พลังงานที่จำเป็นพื้นฐานในการมีชีวิต คือ: "+bmr+" กิโลแคลอรี่");
                System.out.println("พลังงานที่คุณใช้ในแต่ละวัน คือ: "+td+" กิโลแคลอรี่");
            }
            else if( Tdee == 2)
            {
                td = bmr * 1.375;
                System.out.println("พลังงานที่จำเป็นพื้นฐานในการมีชีวิต คือ: "+bmr+" กิโลแคลอรี่");
                System.out.println("พลังงานที่คุณใช้ในแต่ละวัน คือ: "+td+" กิโลแคลอรี่");
            }
            else if( Tdee == 3)
            {
                td = bmr * 1.55;
                System.out.println("พลังงานที่จำเป็นพื้นฐานในการมีชีวิต คือ: "+bmr+" กิโลแคลอรี่");
                System.out.println("พลังงานที่คุณใช้ในแต่ละวัน คือ: "+td+" กิโลแคลอรี่");
            }
            else if( Tdee == 4)
            {
                td = bmr * 1.725;
                System.out.println("พลังงานที่จำเป็นพื้นฐานในการมีชีวิต คือ: "+bmr+" กิโลแคลอรี่");
                System.out.println("พลังงานที่คุณใช้ในแต่ละวัน คือ: "+td+" กิโลแคลอรี่");
            }
            else if( Tdee == 5)
            {
                td = bmr * 1.9;
                System.out.println("พลังงานที่จำเป็นพื้นฐานในการมีชีวิต คือ: "+bmr+" กิโลแคลอรี่");
                System.out.println("พลังงานที่คุณใช้ในแต่ละวัน คือ: "+td+" กิโลแคลอรี่");
            }
            
            System.out.println("================================================");
        }
        else
        {
        System.exit(0);
        }
    }
    
}
