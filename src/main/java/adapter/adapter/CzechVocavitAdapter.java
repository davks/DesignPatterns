package adapter.adapter;

import adapter.thirtparty.CzechVocativ;

// Adapter for CzechVocativ - implements methods of our interface.
public class CzechVocavitAdapter implements VocativAPIAdapter {
    @Override
    public String getVocativ(String name, String gender) {
        var czechVocativ = new CzechVocativ();
        return czechVocativ.getCzechVocativ(gender, name);
    }
}
