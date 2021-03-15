package com.example.hash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView hash, tree;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.text);
        hash = findViewById(R.id.textHash);
        tree = findViewById(R.id.textTree);
        button = findViewById(R.id.button);
        TreeSet<String> treeSet = new TreeSet<>();
        HashSet<String> hashSet = new HashSet<>();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hashSet.add(editText.getText().toString());
                Iterator<String> iteratorH = hashSet.iterator();
                hash.setText("");
                while (iteratorH.hasNext()) {
                    hash.append(iteratorH.next() + "\n");
                }

                treeSet.add(editText.getText().toString());
                Iterator<String> iteratorT = treeSet.iterator();
                tree.setText("");
                while (iteratorT.hasNext()) {
                    tree.append(iteratorT.next() + "\n");
                }

                editText.setText("");
            }
        });
    }
}