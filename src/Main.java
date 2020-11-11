import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running 3 very simple tests from Person and Payment-class");

        Payment payOla1 = new Payment("Mat", 200);
        Payment payOla2 = new Payment("Teknologi", 1000);
        Payment payKari1 = new Payment("Mat", 300);
        Payment payKari2 = new Payment("Teknologi", 500);
        Payment payPetter1 = new Payment("Mat", 100);
        Payment payPetter2 = new Payment("Teknologi", 2000);

        Person ola = new Person("Ola", "Nordmann");
        Person kari = new Person("Kari", "Svensken");
        Person petter = new Person("Petter", "Dansken");

        ola.addPayment(payOla1);
        if(ola.getTotalCost() == 200){
            System.out.println("Test 1 succesfull: getTotalCost");
        }else{
            System.out.println("Test 1 failed: getTotalCost");
        }
        ola.addPayment(payOla2);
        if(ola.getTotalCost() == 1200){
            System.out.println("Test 2 succesfull: addPayment");
        }else{
            System.out.println("Test 2 failed: addPayment");
        }
        ola.removePaymentByItem("Teknologi");
        if(ola.getTotalCost() == 200){
            System.out.println("Test 3 succesfull: removePaymentByItem");
        }else{
            System.out.println("Test 3 failed: removePaymentByItem");
        }

        kari.addPayment(payKari1);
        petter.addPayment(payPetter1);

        Transaction t1 = new Transaction();
        t1.addPerson(ola);
        t1.addPerson(kari);
        t1.addPerson(petter);

        System.out.println("-------------------------------------------");
        System.out.println("Running 3 simple tests from the Transaction-class:");

        if(t1.getTotAmount() == 600){
            System.out.println("Test 1 successful: getTotAmount()");
        }else{
            System.out.println("Test 1 failed: getTotAmount();");
        }
        System.out.println(t1.findWhoOwsOrNeeds());
        System.out.println(t1.getTotAmount());
        System.out.println(t1.toString());
    }
}
