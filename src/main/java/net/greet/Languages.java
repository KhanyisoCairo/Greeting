package net.greet;

public enum Languages {
    Afrikaans("Hallo"),
    English("Hello"),
    Isixhosa("Molo");

  private final String language;
    Languages(String language) {
this.language =language;
    }

    public String getLanguage() {
        return language;
    }
}
