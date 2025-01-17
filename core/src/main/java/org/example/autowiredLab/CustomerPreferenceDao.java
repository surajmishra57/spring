package org.example.autowiredLab;

import org.springframework.stereotype.Component;

@Component
public class CustomerPreferenceDao {
    private String rating = "4";

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
