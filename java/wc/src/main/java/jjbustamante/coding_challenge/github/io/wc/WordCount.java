package jjbustamante.coding_challenge.github.io.wc;

import org.springframework.cglib.core.Local;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.Locale;

@ShellComponent
public class WordCount {

    @ShellMethod(key = "wc")
    public String helloWorld(@ShellOption(defaultValue = "CO") String country, @ShellOption(defaultValue = "es") String language) {

        Locale locale = new Locale.Builder()
                .setLanguage(language)
                .setRegion(country)
                .setVariant("POSIX")
                .setScript("Latn")
                .build();

        return locale.getDisplayCountry(locale);
    }
}
