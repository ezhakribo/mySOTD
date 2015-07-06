package kelompok5.mysotd.Views;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;

import java.util.List;

import kelompok5.mysotd.R;
import kelompok5.mysotd.model.Category;

/**
 * Created by Ezha on 06/07/2015.
 */
public class MySOTDFragments extends Fragment {
    View rootview;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Ini buat select All
        rootview = inflater.inflate(R.layout.fragment_mysotd, container, false);
        FloatingActionButton floatingActionButton = (FloatingActionButton) rootview.findViewById(R.id.add_button);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Add button selected", Toast.LENGTH_SHORT).show();
                FragmentManager fragmentManager = getFragmentManager();
                /*fragmentManager.beginTransaction()
                        .replace(R.id.container, new AddShavingItemFragment())
                        .addToBackStack(null).commit();*/
            }
        });

        return rootview;
    }
}
