package org.example.autowiredLab;

import org.springframework.stereotype.Component;

@Component
public class MovieFinder {
    private String result = "amazing";

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }
}
