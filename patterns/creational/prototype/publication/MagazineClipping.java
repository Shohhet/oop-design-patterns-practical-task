package patterns.creational.prototype.publication;

public class MagazineClipping extends Publication {
    private final String personAbout;
    private final String content;

    public MagazineClipping(String publicationName, String publicationYear, String personAbout, String content) {
        super(publicationName, publicationYear);
        this.personAbout = personAbout;
        this.content = content;
    }

    public MagazineClipping(MagazineClipping clipping) {
        super(clipping);
        this.personAbout = clipping.personAbout;
        this.content = clipping.content;
    }

    @Override
    public Publication getCopy() {
        return new MagazineClipping(this);
    }

    @Override
    public String toString() {
        return super.getPublicationName()
                + " "
                + super.getPublicationYear()
                + "\n"
                +   "Magazine clipping about "
                + personAbout
                + "\n"
                + content;
    }
}
