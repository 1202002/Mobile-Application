package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

      private Button btnSearch ;
      private Spinner spnBooks ;
      private TextView txtRes ;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSearch = findViewById(R.id.btnSearch) ;
        spnBooks  = findViewById(R.id.spnBooks) ;
        txtRes    = findViewById(R.id.txtRes) ;

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cat = spnBooks.getSelectedItem().toString() ;
                Database db = new Database() ;
                List<Book> list = db.getBooks(cat) ;
                String str = "" ;

                for(Book b:list){
                    str+=b.getTitle()+ "\n" ;
                }
                txtRes.setText(str);
            }
        });

    }
}