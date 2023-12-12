package com.example.customotppage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.customotppage.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.box1.addTextChangedListener(new OTP_Custom_Adapter(binding.box1,binding.box2));
        binding.box2.addTextChangedListener(new OTP_Custom_Adapter(binding.box2,binding.box3));
        binding.box3.addTextChangedListener(new OTP_Custom_Adapter(binding.box3,binding.box4));
        binding.box4.addTextChangedListener(new OTP_Custom_Adapter(binding.box4,binding.box5));
        binding.box5.addTextChangedListener(new OTP_Custom_Adapter(binding.box5,binding.box6));
        binding.box6.addTextChangedListener(new OTP_Custom_Adapter(binding.box6,null));

        binding.button.setOnClickListener(v -> {
            Toast.makeText(this, "Successfully enter Number", Toast.LENGTH_SHORT).show();
        });

    }
}