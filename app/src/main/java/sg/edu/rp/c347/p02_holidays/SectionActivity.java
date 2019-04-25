package sg.edu.rp.c347.p02_holidays;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SectionActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<Holiday> alHoliday;
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section);

        lv = findViewById(R.id.lvSection);

        alHoliday = new ArrayList<>();
        alHoliday.add(new Holiday("Chinese New Year","5-6 Feb 2019"));
        alHoliday.add(new Holiday("Good Friday", "19 April 2019"));
        alHoliday.add(new Holiday("New Year's Day", "1 Jan 2019"));
        alHoliday.add(new Holiday("Labour Day", "1 May 2019"));
        alHoliday.add(new Holiday("Vesak Day", "19 May 2019"));
        alHoliday.add(new Holiday("Hari Raya Puasa", "5 June 2019"));
        alHoliday.add(new Holiday("National Day", "9 Aug 2019"));
        alHoliday.add(new Holiday("Hari Raya Haji", "11 Aug 2019"));
        alHoliday.add(new Holiday("Deepavali", "27 Oct 2019"));
        alHoliday.add(new Holiday("Christmas Day", "25 Dec 2019"));

//        aa = new SectionAdapter(this,R.layout.section_row,alHoliday);

    }
}
