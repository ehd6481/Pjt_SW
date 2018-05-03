package kr.ac.gnu.yg398.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemView extends AppCompatActivity{
    private TextView textViewSubject;
    private TextView textViewNick;
    private TextView textViewDate;
    private TextView textViewHits;

    ArrayList<HashMap<String,String>> itemElement;

    JSONArray list = null;
    String myJson;

    private static final String TAG_RESULT = "result";
    private static final String TAG_SUBJECT = "subject";
    private static final String TAG_WRITER = "writer";
    private static final String TAG_DESCRIPTION = "description";
    private static final String TAG_HITS = "hits";
    private static final String TAG_DATE = "date";

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_view);

        TextView itemContentView = (TextView)findViewById(R.id.textViewContent);
        itemElement = new ArrayList<HashMap<String, String>>();
    }
}
