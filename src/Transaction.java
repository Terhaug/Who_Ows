import java.util.ArrayList;

public class Transaction {
    private ArrayList<Person> persons;

    public Transaction() {
        this.persons = new ArrayList<>();
    }

    public void addPerson(Person newPerson){
        persons.add(newPerson);
    }

    // TODO: 11.11.2020 Change divide method to -findIfOws && -findIfNeeds
    // TODO: 11.11.2020 Use methods above to find who ows who

    public String findWhoOwsOrNeeds() {
        int avgDivided = getTotAmount() / persons.size();
        StringBuilder res = new StringBuilder();
        for (Person person : persons) {
            if (person.getTotalCost() < avgDivided) {
                double ows = avgDivided - person.getTotalCost();
                res.append(person.getFirstName()).append(" ").append(person.getLastName()).append(" ows ").append(ows).append("\n");
            } else if (person.getTotalCost() > avgDivided) {
                double needs = person.getTotalCost() - avgDivided;
                res.append(person.getFirstName()).append(" ").append(person.getLastName()).append(" needs ").append(needs).append("\n");
            } else {
                res.append(person.getFirstName()).append(" ").append(person.getLastName()).append(" does not owe anything\n");
            }
        }
        return res.toString();
    }


    public int getTotAmount(){
        int totAmount = 0;
        for(int i = 0; i < persons.size(); i++){
            totAmount += persons.get(i).getTotalCost();
        }
        return totAmount;
    }


    @Override
    public String toString() {
        return "Transaction{" +
                "persons=" + persons +
                ", totAmount=" + getTotAmount() +
                '}' + '\n';
    }
}
