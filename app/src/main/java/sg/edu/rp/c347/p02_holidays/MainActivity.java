package sg.edu.rp.c347.p02_holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter<String> aa;
    ArrayList<String> aL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lvPH);

        aL = new ArrayList<>();
        aL.add("Secular");
        aL.add("Ethnic & Religion");

        aa = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,aL);
        lv.setAdapter(aa);

        //want to pass data no need condition just use putExtra
        //inside onitemclick get position of listview clicked
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemSelected = aL.get(position);
                Intent i = new Intent(MainActivity.this,SectionActivity.class);
                i.putExtra("section",itemSelected);

                startActivity(i);
            }
        });

    }
}
