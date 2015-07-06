package kelompok5.mysotd;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import kelompok5.mysotd.model.Category;

/**
 * Created by Mira on 7/5/2015.
 */
public class ShaveDenFragments extends Fragment {
    View rootview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        List<Category> categories = Category.listAll(Category.class);
        for (Category c: categories){
            System.out.print("ID: " + c.getIdCategory() + "Nama: " + c.getCategoryName());
        }
        rootview = inflater.inflate(R.layout.fragment_try, container, false);
        return rootview;
    }
}
