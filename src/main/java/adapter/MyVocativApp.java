package adapter;

import adapter.adapter.VocativAPIAdapter;

// It uses our adapters instead of the actual classes.
public class MyVocativApp {
    private VocativAPIAdapter vocativAPIAdapter;

    public MyVocativApp(VocativAPIAdapter vocativAPIAdapter) {
        this.vocativAPIAdapter = vocativAPIAdapter;
    }

    public String getVocativ(String name, String gender) {
        return vocativAPIAdapter.getVocativ(name, gender);
    }
}
