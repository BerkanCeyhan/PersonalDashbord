package com.example.webanwendung_teil1.ApplicationService;


import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class Date {
    public String getDate() {
      Locale german = new Locale("de","de");
        return LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL,german);
    }
}
