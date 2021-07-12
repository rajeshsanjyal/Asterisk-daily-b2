package com.asterisk.daily.adapter;

public class NepaliClient {
    public static void main(String[] args) {

        EnglishAdaptee englishAdaptee=new EnglishAdaptee();
        TranslatorAdaptor translatorAdaptor=new TranslatorAdaptor(englishAdaptee);
        String words="Nepali Words";
        String englishWords=translatorAdaptor.translate(translatorAdaptor.readDescription(words));
        englishAdaptee.performInstruction(englishWords);
    }
}
