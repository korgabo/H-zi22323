import java.util.List;

public class TestVerem{
    public static void main(String[] args){
        givenValue_append_storesValue();
        veremHasData_size_returnsItemCount();
        veremHasData_pop_returnItemOnTopAndRemovesItFromVerem();
        verem_isEmpty_retirnsIfVeremIsEmpty();
        givenVerem_ToString_returnsCorrectString();
    }

    public static void givenValue_append_storesValue(){
        //Arrange itt szoktuk létrehozni az adatokat, amik alapján tesztelünk
        Verem verem = new Verem();

        //Act metódust meghívjuk, amit szeretnénk letesztelni
        verem.append(10);

        //Asser itt fogjuk megvizsgálni, hogy jól működik-e
        assert verem.size() == 1;
        assert verem.isEmpty() == false;
        assert verem.pop() == 10;

        System.out.println("OK");

    }

    public static void veremHasData_size_returnsItemCount(){
        //Arrange
        Verem verem = new Verem();
        verem.append(10);
        verem.append(11);

        //Act + Assert
        assert verem.size() == 2;
        System.out.println("OK");

    }

    public static void veremHasData_pop_returnItemOnTopAndRemovesItFromVerem(){
        //Arrange
        Verem verem = new Verem();
        verem.append(10);
        verem.append(15);

        //Act + Assert
        assert verem.pop() == 15;
        assert verem.size() == 1;

        System.out.println("OK");

    }

    public static void verem_isEmpty_retirnsIfVeremIsEmpty(){
        //Arrange
        Verem verem = new Verem(List.of(2,3));

        //Act + Assert
        assert verem.isEmpty() == false;

        verem.pop();
        verem.pop();

        assert verem.isEmpty() == true;
        System.out.println("OK");
    }

    public static void givenVerem_ToString_returnsCorrectString(){
        //Arrange
        Verem verem = new Verem(List.of(2,3));

        //Act
        String s = verem.toString();

        //Assert
        assert s.equals("[2,3");

        System.out.println("OK");

    }


}