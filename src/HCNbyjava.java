import java.util.Scanner;

public class HCNbyjava {
    double wid,hei;
    public HCNbyjava(double wid,double hei){
        this.wid = wid;
        this.hei = hei;
    }
    public double getArea(){
        return this.wid * this.hei;
    }
    public double getPerimeter(){
        return (this.wid + this.hei) * 2;
    }
    public String display(){
        return "HNC{" + "width= " + wid + " , height= " + hei + "}";
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("nhập chiều cao vào: ");
            double wid = sc.nextDouble();
            System.out.print("nhập chiều rộng vào: ");
            double hei = sc.nextDouble();
            HCNbyjava rec = new HCNbyjava(wid,hei);
            double area = rec.getArea();
            double perimeter = rec.getPerimeter();
        System.out.println("HCN là: \n" + rec.display());
        System.out.println("chu vi HCN: " + rec.getPerimeter());
        System.out.println("Diện tích HCn: "+ rec.getArea());
    }
}
