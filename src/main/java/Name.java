import java.util.ArrayList;
import java.util.Collection;

public class Name {
    private ArrayList<String>names;

public Name(){
    this.names = new ArrayList();

    names.add("Fred");
    names.add("Gilles");
    names.add("Dorothee");
    names.add("Pascale");
    names.add("Alain");
    names.add("Michel");



}

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

    public ArrayList<String> add(String name) {
    this.names = add(name);
    }

    public String randomise(){
        Collection.shuffle(names);
        return names.get(0);

    }
}
