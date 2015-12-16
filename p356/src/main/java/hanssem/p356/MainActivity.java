package hanssem.p356;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements AdapterView.OnItemSelectedListener {


    TextView textView1;

    String[] items = { "mike", "angel", "crow", "john", "ginnie", "sally", "cohen", "rice" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 텍스트뷰 객체 참조
        textView1 = (TextView) findViewById(R.id.textView1);

        // 스피너 객체 참조
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        // 어댑터 객체 생성
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // 어댑터 설정
        spin.setAdapter(adapter);
    }

    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
        textView1.setText(items[position]);
    }

    public void onNothingSelected(AdapterView<?> parent) {
        textView1.setText("");
    }

}