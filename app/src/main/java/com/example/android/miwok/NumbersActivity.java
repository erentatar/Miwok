package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

//        ArrayList<String> words = new ArrayList<String>(
//                Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")
//        );

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine", "wo'e"));
        words.add(new Word("ten", "na'aacha"));

        //ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
        //ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, R.layout.list_item, words);
        //ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);
        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
