package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String string, PoemDecorator poemDecorator) {
        return poemDecorator.decorate(string);
    }
}

