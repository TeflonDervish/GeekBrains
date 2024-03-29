package Picnic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {

    private String fileIn, fileOut;

    public WordCounter(String fileIn, String fileOut) {
        this.fileIn = fileIn;
        this.fileOut = fileOut;
    }

    public void countWords() throws IOException {
        Scanner scanner = new Scanner(new File(fileIn));
        Map<String, Integer> wordFrequency = new HashMap<>();

        int count = 0;
        int max_len_word = -1;
        String max_len = null;

        while (scanner.hasNext()) {
            String word = scanner.next();
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);


            if (max_len_word < word.length()) {
                max_len = word;
                max_len_word = word.length();
            }

            count++;
        }

        scanner.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut));
        writer.write("Общее кол-во слов: " + count + "\n");
        writer.write("Самое длинное слово: " + max_len + "\n");

        for (String iterable_element : wordFrequency.keySet()) {
            writer.write(iterable_element + " : " + wordFrequency.get(iterable_element) + "\n");
        }

        writer.close();

    }

    public static void main(String[] args) {
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        WordCounter wordCounter = new WordCounter(inputFileName, outputFileName);
        try {
            wordCounter.countWords();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + inputFileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
