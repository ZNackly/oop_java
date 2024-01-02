import java.lang.String;
class Human{
    public String Name = "Миран";
    public boolean Sleep = true;
    public String clothes = "Нет";

    void recloth(String newcloth){
        clothes = newcloth;
    }
    void Sleeping(){
        Sleep = false;
    }

}
public class Main {
        public static void main(String[] args) {
            Human Miran = new Human();
            System.out.println(Miran.Sleep);
            System.out.println(Miran.clothes);
            Miran.Sleeping();
            Miran.recloth("синяя футболка");
            System.out.println(Miran.Name);
            System.out.println(Miran.Sleep);
            System.out.println(Miran.clothes);
        }
}
