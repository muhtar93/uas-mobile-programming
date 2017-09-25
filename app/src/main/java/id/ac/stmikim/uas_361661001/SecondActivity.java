package id.ac.stmikim.uas_361661001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button button = (Button)findViewById(R.id.btnSubmit);
        final EditText editText = (EditText) findViewById(R.id.edit_text);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ImageView Img = (ImageView)
                        findViewById(R.id.image_view);

                String strURL = editText.getText().toString();
                //new ThreadGambar(Img).execute("http://script.id/images/edu-brand.jpg");
                new ThreadGambar(Img).execute(strURL);

                Toast.makeText(SecondActivity.this, strURL, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
