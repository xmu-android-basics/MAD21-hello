package io.github.xmu_android_basics.hello2021;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import io.github.xmu_android_basics.hello2021.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    String[] data = {
            "1",
            "2",
            "2",
            "2",
            "2",
            "2",
            "2",
            "2",
            "3",
            "3",
            "3",
            "3",
            "3",
            "3",
            "3",
            "3",
            "2"
    };

    ActivityMainBinding _binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        _binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(_binding.getRoot());

        MyAdapter myAdapter = new MyAdapter(data);
        _binding.recyclerView.setAdapter(myAdapter);
    }

    public void hello(View view) {
        _binding.helloButton.setText(_binding.inputName.getText());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        _binding = null;
    }
}