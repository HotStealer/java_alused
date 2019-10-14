import java.util.ArrayList;

public class AmountList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Lars");
        list.add("Karl");
        list.add("Edgar");
        list.add("Martin");
        System.out.println("There are this many items in the list: ");
        System.out.print(countItems(list));
    }

    private static int countItems(ArrayList<String> list) {
        int i = 0;
        for (String item : list){
            i++;
        }
        return i;
    }
}
