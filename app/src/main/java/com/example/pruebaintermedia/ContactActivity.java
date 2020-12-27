package com.example.pruebaintermedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.pruebaintermedia.databinding.ActivityContactBinding;

public class ContactActivity extends AppCompatActivity {
private ActivityContactBinding mbinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mbinding=ActivityContactBinding.inflate(getLayoutInflater());
        setContentView(mbinding.getRoot());

        mbinding.imageViewLinkedIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkedIN= new Intent(Intent.ACTION_VIEW);
                linkedIN.setData(Uri.parse("https://www.linkedin.com/in/joaqu%C3%ADn-adri%C3%A1n-astorga-s%C3%A1ez-599496178/"));
                startActivity(linkedIN);
            }
        });


         mbinding.imageFcebook.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent facebook=new Intent(Intent.ACTION_VIEW);
                 facebook.setData(Uri.parse("https://www.facebook.com/joaquin.astorga11"));
                 startActivity(facebook);
             }
         });

    }

    public void  shareWitWsp(String message){
        Intent sendIntent= new Intent(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT,message);
        sendIntent.setType("text/plain");
        sendIntent.setPackage("com.whatsapp");
        startActivity(sendIntent);
    }
}