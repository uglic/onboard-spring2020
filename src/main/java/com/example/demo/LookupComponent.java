package com.example.demo;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LookupComponent {
    @Lookup
    @Qualifier("someName")
    public String getMe() {
        return null;
    }
}
