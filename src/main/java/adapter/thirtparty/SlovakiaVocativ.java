package adapter.thirtparty;

// Something like thirdparty plugin SlovakiaVocativ
public class SlovakiaVocativ {
    private String name;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getVocativ() {
        return gender + " " + name;
    }
}
