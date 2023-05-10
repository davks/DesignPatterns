package adapter.adapter;

import adapter.thirtparty.SlovakiaVocativ;

// Adapter for SlovakVocativ - implements methods of our interface.
public class SlovakiaVocativAdapter implements VocativAPIAdapter {

    @Override
    public String getVocativ(String name, String gender) {
        var slovakiaVocativ = new SlovakiaVocativ();
        slovakiaVocativ.setName(name);
        slovakiaVocativ.setGender(gender);
        return slovakiaVocativ.getVocativ();
    }
}
