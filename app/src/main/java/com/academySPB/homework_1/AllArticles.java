package com.academySPB.homework_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AllArticles extends AppCompatActivity {
    private Button mAndroidArticle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_articles);

        mAndroidArticle = (Button) findViewById(R.id.androidArticle);
        mAndroidArticle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AllArticles.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
