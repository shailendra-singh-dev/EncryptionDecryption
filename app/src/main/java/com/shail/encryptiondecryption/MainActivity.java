package com.shail.encryptiondecryption;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private static final CryptoHandler crypto = new CryptoHandler(CryptoHandler.PASSWORD);
    public static String seedValue = "I AM UNBREAKABLE";
    public static String MESSAGE = "No one can read this message without decrypting me.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final String filename = getFilesDir().getPath() + "/" + "temp.text";

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.encrypt).setOnClickListener(new View.OnClickListener() {
                                                          @Override
                                                          public void onClick(View view) {
                                                              try {
                                                                  crypto.saveToFile(filename,"Hello");
                                                              } catch (Exception ex) {
                                                                  ex.printStackTrace();
                                                              }
                                                          }
                                                      }

        );
        findViewById(R.id.decrypt).setOnClickListener(new View.OnClickListener() {
                                                          @Override
                                                          public void onClick(View view) {
                                                              try {
                                                                  String data = crypto.readFromFile(filename);
                                                                  Log.i(TAG, "EncryptionDecryption# data:" + data);
                                                              } catch (Exception ex) {
                                                                  ex.printStackTrace();
                                                              }
                                                          }
                                                      }

        );
        try {
            String encryptedData = AESHelper.encrypt(seedValue, MESSAGE);
            Log.v(TAG, "EncryptionDecryption# Encoded String " + encryptedData);
            String decryptedData = AESHelper.decrypt(seedValue, encryptedData);
            Log.v(TAG, "EncryptionDecryption# Decoded String " + decryptedData);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
