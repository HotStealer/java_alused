import java.util.ArrayList;

public class RemoveLast {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Lars");
        list.add("Karl");
        list.add("Edgar");
        list.add("Martin");
        System.out.println("There are this many items in the list: ");
        System.out.print(removeLast(list));
    }

    private static ArrayList<String> removeLast(ArrayList<String> list) {
        int i = 0;
        for (String item : list){
            i++;
        }
        list.remove(i-1);
        return list;
    }
}

