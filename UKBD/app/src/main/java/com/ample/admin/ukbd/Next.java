package com.ample.admin.ukbd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Next extends AppCompatActivity {
    Button DonorBT,PostBT,SeacrchBT,ContactsBT,AboutusBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);


        DonorBT= (Button) findViewById(R.id.donorBT);
        PostBT= (Button) findViewById(R.id.postBt);
        SeacrchBT= (Button) findViewById(R.id.searchdonorBT);
        ContactsBT= (Button) findViewById(R.id.contactsBT);
        AboutusBT= (Button) findViewById(R.id.aboutBT);


        DonorBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent  intent=new Intent(Next.this,Donor.class);
                startActivity(intent);

            }
        });


        PostBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent  intent=new Intent(Next.this,Post.class);
                startActivity(intent);

            }
        });

        SeacrchBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent  intent=new Intent(Next.this,Search.class);
                startActivity(intent);

            }
        });

        ContactsBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent  intent=new Intent(Next.this,Contact.class);
                startActivity(intent);

            }
        });

        AboutusBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent  intent=new Intent(Next.this,About.class);
                startActivity(intent);

            }
        });

    }
}
