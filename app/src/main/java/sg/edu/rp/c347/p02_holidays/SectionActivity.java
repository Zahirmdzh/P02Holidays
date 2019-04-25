package sg.edu.rp.c347.p02_holidays;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SectionActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<Holiday> alHoliday;
    //custom array adapter no need <class>
    ArrayAdapter aa;
    TextView tvSection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section);

        lv = findViewById(R.id.lvSection);
        Intent i = getIntent();
        String section = i.getStringExtra("section");
        tvSection = findViewById(R.id.textView2);
        // set TextView to the section based on the position user clicked in MainActivity
        tvSection.setText(section);

        int pos = i.getIntExtra("pos",0);
        alHoliday = new ArrayList<>();
        aa = new SectionAdapter(this,R.layout.section_row,alHoliday);

        if (pos == 0) {
            alHoliday.add(new Holiday("New Year's Day", "1 Jan 2019"));
            alHoliday.add(new Holiday("Labour Day", "1 May 2019"));
            alHoliday.add(new Holiday("National Day", "9 Aug 2019"));

        } else {
            alHoliday.add(new Holiday("Chinese New Year","5-6 Feb 2019"));
            alHoliday.add(new Holiday("Good Friday", "19 April 2019"));
            alHoliday.add(new Holiday("Vesak Day", "19 May 2019"));
            alHoliday.add(new Holiday("Hari Raya Puasa", "5 June 2019"));
            alHoliday.add(new Holiday("Hari Raya Haji", "11 Aug 2019"));
            alHoliday.add(new Holiday("Deepavali", "27 Oct 2019"));
            alHoliday.add(new Holiday("Christmas Day", "25 Dec 2019"));

        }
        lv.setAdapter(aa);



        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            }
        });
    }

    private void addSecular(){

    }
    private void addEthnic(){

    }
}
