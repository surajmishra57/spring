package org.example.autowiredLab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MovieRecommender {
    private CustomerPreferenceDao customerPreferenceDao;

    @Autowired(required = false)
    private MovieCatalog[] movieCatalogs;

    public MovieRecommender(CustomerPreferenceDao customerPreferenceDao) {
        this.customerPreferenceDao = customerPreferenceDao;
    }

    public void getRating() {
        System.out.println(customerPreferenceDao.getRating());
        System.out.println(Arrays.toString(Arrays.stream(movieCatalogs).toArray()));
    }
}
