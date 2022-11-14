import java.util.ArrayList;
import java.util.List;

public class Verem {
    private List<Integer> szamok;

    // +++++++++++++++++++++++

    public Verem() {
        this.szamok = new ArrayList<>();
    }

    /*
     public Verem(List<Integer> szamok){
        this.szamok = new ArrayList<>(szamok);
    }
     */


    public Verem(List<Integer> szamok){
        this(); //konstruktort fogja meghívni: Verem()
        this.szamok.addAll(szamok); //feltöltés

        /* Másik feltöltés:
         for(int i : szamok){
            this.szamok.add(i);
         }
         */
    }

    // +++++++++++++++++++++++

    public int size() {
        return this.szamok.size();
    }

    public boolean isEmpty() {
        return this.szamok.isEmpty();
    }

    public void append(int szam) {
        this.szamok.add(szam);
    }

    public int pop() {
        return this.szamok.remove(this.szamok.size() - 1);
    }

    public String toString() {
        return this.szamok.toString().replace("]", "");
    }
}