package org.example.newconcept;

import javax.swing.text.html.Option;
import java.util.Optional;

public class TestBlock {
    public static void main(String[] args) {
        Optional<String> opt=Optional.ofNullable("sneha");
        System.out.println("->>>>data"+opt.orElse(""));
    }
}
