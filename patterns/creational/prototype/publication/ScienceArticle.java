package patterns.creational.prototype.publication;

public class ScienceArticle extends Publication {
    private final String author;
    private final String content;

    public ScienceArticle(String publicationName, String publicationYear, String author, String content) {
        super(publicationName, publicationYear);
        this.author = author;
        this.content = content;
    }

    private ScienceArticle(ScienceArticle article) {
        super(article);
        this.author = article.author;
        this.content = article.content;
    }

    @Override
    public Publication getCopy() {
        return new ScienceArticle(this);
    }

    @Override
    public String toString() {
        return super.getPublicationName()
                + " "
                + super.getPublicationYear()
                + "\n"
                + "Science article from "
                + author
                + "\n"
                + content;
    }
}
