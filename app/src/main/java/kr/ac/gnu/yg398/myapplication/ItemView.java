package kr.ac.gnu.yg398.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemView extends AppCompatActivity{
    private TextView textViewSubject;
    private TextView textViewNick;
    private TextView textViewDate;
    private TextView textViewHits;

    ArrayList<HashMap<String,String>> itemElement;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_view);

        TextView itemContentView = (TextView)findViewById(R.id.textViewContent);
        itemElement = new ArrayList<HashMap<String, String>>();
    }
}
