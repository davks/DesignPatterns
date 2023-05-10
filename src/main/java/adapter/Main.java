package adapter;

import adapter.adapter.CzechVocavitAdapter;
import adapter.adapter.SlovakiaVocativAdapter;

public class Main {
    public static void main(String[] args) {
        var myVocativApp = new MyVocativApp(new CzechVocavitAdapter()); // The same with SlovakVocativAdapter()

        System.out.println(myVocativApp.getVocativ("Radek", "Man"));
    }
}
