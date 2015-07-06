package kelompok5.mysotd.Views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

import kelompok5.mysotd.R;
import kelompok5.mysotd.model.Category;

/**
 * Created by Mira on 7/5/2015.
 */
public class ShaveDenFragments extends Fragment {
    View rootview;
    CategoryAdapter categoryAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Ini buat select All
        rootview = inflater.inflate(R.layout.fragment_category_list, container, false);
        List<Category> categories = Category.listAll(Category.class);
        categoryAdapter = new CategoryAdapter(getActivity(),R.layout.fragment_category_adapter,
                categories);

        ListView shavingItemListView = (ListView) rootview.findViewById(R.id.categorylistView);
        shavingItemListView.setAdapter(categoryAdapter);

        return rootview;
    }
}
