package sg.edu.rp.c347.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class SectionAdapter extends ArrayAdapter<Holiday> {

    private ArrayList<Holiday> holidays;
    private Context context;
    private TextView tvHol, tvDate;
    private ImageView ivIcon;

    public SectionAdapter(Context context, int resource, ArrayList<Holiday> objects) {
        super(context, resource, objects);

         holidays = objects;

        // store context object as we need to use it later
        this.context = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //inflate xml file into view object

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //"inflate" row.xml as layout for view object
        View rowView = inflater.inflate(R.layout.section_row, parent, false);

        //tv object
        tvHol = rowView.findViewById(R.id.textView3);
        tvDate = rowView.findViewById(R.id.textView4);
        ivIcon = rowView.findViewById(R.id.imageView);

        //Based on class
        Holiday currPosition = holidays.get(position);
        tvHol.setText(currPosition.getName());
        tvDate.setText(currPosition.getDate());

        if (currPosition.getName() == "New Year's Day") {
            ivIcon.setImageResource(R.drawable.new_year);

        } else if (currPosition.getName() == "Labour Day") {
            ivIcon.setImageResource(R.drawable.labour_day);

        } else if (currPosition.getName() == "National Day") {
            ivIcon.setImageResource(R.drawable.national_day);

        } else if (currPosition.getName() == "New Year's Day") {
            ivIcon.setImageResource(R.drawable.new_year);

        }  else if (currPosition.getName() == "Chinese New Year") {
            ivIcon.setImageResource(R.drawable.cny);

        } else if (currPosition.getName() == "Good Friday") {
            ivIcon.setImageResource(R.drawable.good_friday);

        } else if (currPosition.getName() == "Hari Raya Puasa") {
            ivIcon.setImageResource(R.drawable.hari_raya_puasa);

        } else if (currPosition.getName() == "Hari Raya Haji") {
            ivIcon.setImageResource(R.drawable.hari_raya_haji);

        } else if (currPosition.getName() == "Vesak Day") {
            ivIcon.setImageResource(R.drawable.vesak_day);

        } else if (currPosition.getName() == "Deepavali") {
            ivIcon.setImageResource(R.drawable.deepavali);

        } else {
            ivIcon.setImageResource(R.drawable.christmas);
        }


        return rowView;
    }
}
