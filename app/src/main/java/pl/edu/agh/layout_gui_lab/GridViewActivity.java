package pl.edu.agh.layout_gui_lab;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;


public class GridViewActivity extends AppCompatActivity {
    GridView gridView;

    static String[] numbers = new String[] {
            "0", "1", "2", "3", "4", "5","6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.grid_view_layout);
        //TO DO set adapter in gridview and add on click listener to items in gridview

    }
}
