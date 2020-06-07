package com.kodilla.stream.sii;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbersSii {


    public static void main(String[] args) {
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 101; i++) {
            randomNumbers.add(random.nextInt());
        }
    }
}
