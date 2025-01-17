package org.example.autowiredLab;

public class MovieCatalog {
    private String type;
    private String review;

    public MovieCatalog() {
    }

    public MovieCatalog(String type, String review) {
        this.type = type;
        this.review = review;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "MovieCatalog{" +
                "type='" + type + '\'' +
                ", review='" + review + '\'' +
                '}';
    }
}
