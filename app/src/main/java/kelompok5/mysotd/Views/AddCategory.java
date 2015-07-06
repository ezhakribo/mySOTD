package kelompok5.mysotd.Views;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import kelompok5.mysotd.R;
import kelompok5.mysotd.model.Category;

/**
 * Created by gifary on 7/7/2015.
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

        long count = Category.count(Category.class, null, null)+1;
        Category c = new Category (String.valueOf(count), namaCategory, noteCategory);
        c.save();
        this.finish();
       //lakukan cara insert pake sugar gimana disini
        //lakukan diret ke halaman berikutnya gatau sy cara direct ke fragment gimana
    }
}
