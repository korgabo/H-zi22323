public class TestMyUtils {
    public static void main(String[] args){ //Given_WHhen_Then mit akarunk átadni, (melyik) metódus neve, mit várunk
        givenNumber_duplaz_returnsDuplicate();
        givenString_strlen_returnsLength();
}

public static void givenNumber_duplaz_returnsDuplicate(){
    assert MyUtils.duplaz(0) == 0;
    assert MyUtils.duplaz(1) == 2;
    assert MyUtils.duplaz(2) == 4;
    assert MyUtils.duplaz(10) == 20;
    System.out.println("OK");
}

public static void  givenString_strlen_returnsLength(){
assert MyUtils.strlen("") == 0;
assert MyUtils.strlen("a") == 1;
assert MyUtils.strlen("hellóka") == 7;
System.out.println("OK");
}

}