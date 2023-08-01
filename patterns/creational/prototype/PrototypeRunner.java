package patterns.creational.prototype;

import patterns.creational.prototype.publication.MagazineClipping;
import patterns.creational.prototype.publication.Publication;
import patterns.creational.prototype.publication.ScienceArticle;

public class PrototypeRunner {
    public static void main(String[] args) {
        Publication clipping = new MagazineClipping("Time magazine",
                "1935",
                "Henry Ford",
                "With the help of C. Harold Wills, Ford designed, built, and successfully raced a 26-horsepower automobile in October 1901.");
        Publication article = new ScienceArticle("Universum",
                "2023",
                "Гуламов М.И.",
                "В данной работе рассматривается проблема принятия решений в теории познания");
        Publication clipping2 = new MagazineClipping("GQ",
                "2023",
                "Angus Cloud",
                "Angus Cloud, the 25 year-old actor best known for his starring role on HBO's teen drama Euphoria, has died.");

        FrequentlyUsedPublications rack = new FrequentlyUsedPublications();

        rack.put("Time magazine 1935",clipping);
        rack.put("Universum 2023", article);
        rack.put("GQ 2023", clipping2);

        System.out.println(rack.get("Time magazine 1935"));

    }
}
