package kelompok5.mysotd.Views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kelompok5.mysotd.R;

/**
 * Created by Mira on 7/7/2015.
 */
public class MySOTD extends Fragment {
    View rootview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.fragment_mysotd, container, false);
        return rootview;
    }
}
