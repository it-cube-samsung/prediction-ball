package com.example.predictionball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Prediction {
    public String text;

    Prediction(String text) {
        this.text = text;
    }

    private static Random random = new Random();
    private static ArrayList<Prediction> list = new ArrayList<Prediction>();
    static {
        list.add(new Prediction("бла-бла-бла,\n предсказание"));
        list.add(new Prediction("ууу,\n предсказываю"));
    };

    public static Prediction getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
