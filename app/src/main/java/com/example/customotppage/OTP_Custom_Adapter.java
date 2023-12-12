package com.example.customotppage;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class OTP_Custom_Adapter implements TextWatcher {
    private EditText currentEditText;
    private EditText nextEditText;

    public OTP_Custom_Adapter(EditText currentEditText, EditText nextEditText) {
        this.currentEditText = currentEditText;
        this.nextEditText = nextEditText;
    }
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void afterTextChanged(Editable s) {

        if (s.length() == 1 && nextEditText != null) {
            nextEditText.requestFocus(); // Move focus to the next EditText
        }
          }
    }

