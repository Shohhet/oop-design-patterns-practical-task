package patterns.creational.prototype.publication;

public abstract class Publication {
    private final String publicationName;
    private final String publicationYear;

    public Publication(String publicationName, String publicationYear) {
        this.publicationName = publicationName;
        this.publicationYear = publicationYear;
    }

    protected Publication(Publication publication) {
        this.publicationName = publication.getPublicationName();
        this.publicationYear = publication.getPublicationYear();
    }


    protected String getPublicationName() {
        return publicationName;
    }

    protected String getPublicationYear() {
        return publicationYear;
    }

    abstract public Publication getCopy();
}
