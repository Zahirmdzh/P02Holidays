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

    public SectionAdapter(Context context, int resource, ArrayList<Holiday> holidays) {
        super(context, resource, holidays);

//        holidays = objects;

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
        Holiday currHoliday = holidays.get(position);

        tvHol.setText(currHoliday.getName());

        return null;
    }
}
