package kr.ac.gnu.yg398.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ItemView extends AppCompatActivity{
    private TextView textViewSubject;
    private TextView textViewNick;
    private TextView textViewDate;
    private TextView textViewHits;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_view);

    }
}
