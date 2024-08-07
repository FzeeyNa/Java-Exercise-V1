package blocking1;
public class Main {
    public static void main(String []args){
        SepedaMotor motor = new SepedaMotor();
        motor.setMerk("Suzuki");
        System.out.println("Motor ini bermerk " + motor.getMerk());
        System.out.println("Motor ini berharga " + motor.Harga(11000000));
    }
}
