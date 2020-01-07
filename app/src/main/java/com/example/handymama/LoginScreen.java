package com.example.handymama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

public class LoginScreen extends AppCompatActivity {
    private BroadcastReceiver mNetworkReceiver;
    //    static TextView tv_check_connection;
    EditText editTextEmail;
    EditText editTextPassword;

    TextInputLayout textInputLayoutEmail;
    TextInputLayout textInputLayoutPassword;

    Button buttonLogin;

    SqliteHelper sqliteHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        sqliteHelper = new SqliteHelper(this);
        initCreateAccountTextView();
        initViews();

        mNetworkReceiver = new BroadCastReceiverClass();
//        registerNetworkBroadcastForNougat();
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (validate()) {

                    String Email = editTextEmail.getText().toString();
                    String Password = editTextPassword.getText().toString();

                    User currentUser = sqliteHelper.Authenticate(new User(null, null, Email, Password));

                    if (Email.isEmpty()){
                        Snackbar.make(buttonLogin, "Please Enter Email!", Snackbar.LENGTH_LONG).show();
                    } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(Email).matches()) {
                        Snackbar.make(buttonLogin, "Please enter valid email!", Snackbar.LENGTH_LONG).show();

                    }
                    else if (!sqliteHelper.isEmailExists(Email)){
                        Snackbar.make(buttonLogin,"Not Registered!! Register Here",Snackbar.LENGTH_LONG)
                                .setAction("Ok", new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        startActivity(new Intent(LoginScreen.this,RegistrationScreen.class));
                                    }
                                })
                                .show();


                    }  else  if (currentUser != null) {
                        if (MyApplication.getInstance().getNetworkConnected()) {
                            editTextEmail.setText("");
                            editTextPassword.setText("");
                            startActivity(new Intent(LoginScreen.this, HandyMamaSelectingScreen.class));
                        }else{
                            Snackbar.make(buttonLogin, "Network not Connected", Snackbar.LENGTH_LONG).show();
                        }

                    }

                    else {

                        Snackbar.make(buttonLogin, "Enter valid Password", Snackbar.LENGTH_LONG).show();

                    }
                }
            }
        });
    }
    private void initCreateAccountTextView() {
        TextView textViewCreateAccount = (TextView) findViewById(R.id.textView4);
        textViewCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginScreen.this, RegistrationScreen.class);
                startActivity(intent);
            }
        });
    }

    private void initViews() {
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        textInputLayoutEmail = findViewById(R.id.textInputLayoutEmail);
        textInputLayoutPassword =findViewById(R.id.textInputLayoutPassword);
        buttonLogin = findViewById(R.id.imageButton2);

    }

    public boolean validate() {
        boolean valid = false;

        String Email = editTextEmail.getText().toString();
        String Password = editTextPassword.getText().toString();

        if (Email.isEmpty()){
            valid = false;
            textInputLayoutEmail.setError("Please enter  email!");
        }
        else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(Email).matches()) {
            valid = false;
            textInputLayoutEmail.setError("Please enter valid email!");
        }
        else {
            valid = true;
            textInputLayoutEmail.setError(null);


//            ------------------------------password  condition---------------------
            if (Password.isEmpty()) {
                valid = false;
                textInputLayoutPassword.setError("Please enter valid password!");
            } else {
                if (Password.length() < 7) {
                    valid = false;
                    textInputLayoutPassword.setError("Password is to short!");

                }
                else if (!Password.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$")){
                    textInputLayoutPassword.setError("Password  must contain special characters!");
                }else {
                    valid = true;
                    textInputLayoutPassword.setError(null);
                }
            }
        }

        return valid;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
//        unregisterNetworkChanges();
    }

}
























//    TextView v2=findViewById(R.id.textView4);
//
//
//        v2.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View view) {
//
//        Intent second= new Intent(MainActivity.this, SecondActivity.class);
//        startActivity(second);
//        }
//        });
//    public void dialog(boolean value){
//
////        if(value){
////            tv_check_connection.setText("We are back !!!");
////            tv_check_connection.setBackgroundColor(Color.GREEN);
////            tv_check_connection.setTextColor(Color.WHITE);
//
////            Handler handler = new Handler();
////            Runnable delayrunnable = new Runnable() {
////                @Override
////                public void run() {
////                    tv_check_connection.setVisibility(View.GONE);
////                }
////            };
////            handler.postDelayed(delayrunnable, 3000);
////        }else {
////            tv_check_connection.setVisibility(View.VISIBLE);
////            tv_check_connection.setText("Could not Connect to internet");
////            tv_check_connection.setBackgroundColor(Color.RED);
////            tv_check_connection.setTextColor(Color.WHITE);
////        }
//    }

