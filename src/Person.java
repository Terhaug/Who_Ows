import java.util.ArrayList;

public class Person {
    private final String firstName;
    private final String lastName;
    private ArrayList<Payment> payments;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.payments = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }
    public void addPayment(Payment newPayment){
        payments.add(newPayment);
    }

    public void removePaymentByItem(String item){
        for(int i = 0; i<payments.size(); i++){
            if(item.equals(payments.get(i).getItem())){
                payments.remove(i);
            }
        }
    }

    public int getTotalCost(){
        int totCost = 0;
        for(int i = 0; i<payments.size(); i++){
            totCost += payments.get(i).getCost();
        }
        return totCost;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", payments=" + payments +
                '}' + '\n';
    }
}
