  //implementing class function
  class car{
        String company;
        int year;

        car(String c , int y){
            this.company = c;
            this.year = y;
        }

        void display(){
            System.out.println(company + " " + year);
        }
    }
public class variables {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println(a+b);

        car Mycar = new car("Toyota" , 2020);
        Mycar.display();
    }
}