class Programmer {
    private String name;
    private String language;

    public Programmer(String name, String language) {
        this.name = name;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    /**
     * Returns a string representation of the Programmer object.
     * The string includes the name and language fields.
     *
     * @return a string describing the Programmer instance
     */
    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer("Alice", "Java");
        System.out.println(programmer);
    }
}