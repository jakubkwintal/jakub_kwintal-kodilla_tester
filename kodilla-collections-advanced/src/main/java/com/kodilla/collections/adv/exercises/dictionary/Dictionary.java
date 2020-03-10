package com.kodilla.collections.adv.exercises.dictionary;

import jdk.internal.jline.internal.TestAccessible;

import java.util.*;

public class Dictionary {

    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord(String polishWord, EnglishWord englishWord) {
        List<EnglishWord> englishWords = dictionary.getOrDefault(polishWord, new ArrayList<>());
        englishWords.add(englishWord);
        dictionary.put(polishWord, englishWords);

    }

    public List<EnglishWord> findEnglishWords(String polishword) {
        return dictionary.getOrDefault(polishword, Collections.emptyList());
    }

    public List<EnglishWord> findEnglishWords(String polishWords, PartOfSpeech partOfSpeech) {
        List<EnglishWord> result = new ArrayList<>();
        for (EnglishWord englishWord: dictionary.getOrDefault(polishWords, Collections.emptyList())) {
            if (englishWord.getPartOfSpeech().equals(partOfSpeech))
                result.add(englishWord);
                    }
        return result;
    }

    public int size() {
        return dictionary.size();
    }


}
