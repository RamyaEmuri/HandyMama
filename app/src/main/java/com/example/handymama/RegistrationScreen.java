package com.example.handymama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

public class RegistrationScreen extends AppCompatActivity {

    EditText editTextUserName;
    EditText editTextEmail;
    EditText editTextPassword;

    TextInputLayout textInputLayoutUserName;
    TextInputLayout textInputLayoutEmail;
    TextInputLayout textInputLayoutPassword;

    Button buttonRegister;

    SqliteHelper sqliteHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_screen);
        sqliteHelper = new SqliteHelper(this);
        initTextViewLogin();
        initViews();
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate()) {
                    String UserName = editTextUserName.getText().toString();
                    String Email = editTextEmail.getText().toString();
                    String Password = editTextPassword.getText().toString();


                    if (Email.isEmpty()){
                        Snackbar.make(buttonRegister, "Please enter Email", Snackbar.LENGTH_LONG).show();
                    }
                    else if(!android.util.Patterns.EMAIL_ADDRESS.matcher(Email).matches()){
                        Snackbar.make(buttonRegister, "Please enter valid Email", Snackbar.LENGTH_LONG).show();
                    }
                    else if (!sqliteHelper.isEmailExists(Email)) {

                        if (MyApplication.getInstance().getNetworkConnected()) {
                            sqliteHelper.addUser(new User(null, UserName, Email, Password));
                            Snackbar.make(buttonRegister, "User created successfully! Please Login ", Snackbar.LENGTH_LONG).show();
                            Handler handler = new Handler();
                            Runnable delayrunnable = new Runnable() {
                                @Override
                                public void run() {
                                    finish();
                                }
                            };
                            handler.postDelayed(delayrunnable, 3000);
                        } else {
                            Snackbar.make(buttonRegister, "Network not Connected", Snackbar.LENGTH_LONG).show();
                        }
                    }
                    else {

                        Snackbar.make(buttonRegister, "User already exists with same email ", Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
    }

    private void initTextViewLogin() {
        TextView textViewLogin =  findViewById(R.id.textView8);
        textViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void initViews() {
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextUserName = (EditText) findViewById(R.id.editTextUserName);
        textInputLayoutEmail = (TextInputLayout) findViewById(R.id.textInputLayoutEmail);
        textInputLayoutPassword = (TextInputLayout) findViewById(R.id.textInputLayoutPassword);
        textInputLayoutUserName = (TextInputLayout) findViewById(R.id.textInputLayoutUserName);
        buttonRegister = (Button) findViewById(R.id.imageButton);

    }

    public boolean validate() {
        boolean valid = false;

        String UserName = editTextUserName.getText().toString();
        String Email = editTextEmail.getText().toString();
        String Password = editTextPassword.getText().toString();

        if (UserName.isEmpty()) {
            valid = false;
            textInputLayoutUserName.setError("Please enter username!");
        } else {
            if (UserName.length() < 5) {

                valid = false;
                textInputLayoutUserName.setError("Username is to short!");
//                --------------email condition-----------------


            } else {
                valid = true;
                textInputLayoutUserName.setError(null);

                if (Email.isEmpty()){
                    valid = false;
                    textInputLayoutEmail.setError("Please enter email!");
                }

                else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(Email).matches()) {
                    valid = false;
                    textInputLayoutEmail.setError("Please enter valid email!");
                } else {
                    valid = true;
                    textInputLayoutEmail.setError(null);

//                    -------------------------password condition----------------
                    if (Password.isEmpty()) {
                        valid = false;
                        textInputLayoutPassword.setError("Please enter valid password!");
                    } else  {
                        if (Password.length() < 7) {
                            valid = false;
                            textInputLayoutPassword.setError("Password is to short!");

                        }else if (!Password.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$")){
                            valid = false;
                            textInputLayoutPassword.setError("Password  must contain 1 special character, 1 number, 1 caps");
                        }
                        else {
                            valid = true;
                            textInputLayoutPassword.setError(null);
                        }
                    }
                }
            }
        }
        return valid;
    }
}
