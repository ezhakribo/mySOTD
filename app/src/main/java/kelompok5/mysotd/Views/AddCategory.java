package kelompok5.mysotd.Views;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import kelompok5.mysotd.R;

/**
 * Created by gifary on 7/7/2015.
 */

//tambahkan file ini ke android manifest
        /*<activity android:label=”Add Category”
            android:name=”.AddCategory” >
            <intent-filter >
                <action android:name=”kelompok5.mysotd.AddCategory” />
                <category android:name="android.intent.category.DEFAULT" />
             </intent-filter>
        </activity>
        */
    /* cara pindah ke activiity saat klik tombol yg floating tambah code di bawah
    startActivity(new Intent("kelompok5.mysotd.AddCategory"));
     */
public class AddCategory extends Activity {

    TextView name ;
    TextView note;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_category);
        name = (TextView) findViewById(R.id.editTextNameCategory);
        note = (TextView) findViewById(R.id.editTextNote);
    }

    public void run(View view)
    {
        Bundle extras = getIntent().getExtras();
        String namaCategory=name.getText().toString();
        String noteCategory=note.getText().toString();
       //lakukan cara insert pake sugar gimana disini
        //lakukan diret ke halaman berikutnya gatau sy cara direct ke fragment gimana
    }
}
