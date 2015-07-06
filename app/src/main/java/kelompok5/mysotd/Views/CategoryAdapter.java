package kelompok5.mysotd.Views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import kelompok5.mysotd.R;
import kelompok5.mysotd.model.Category;

/**
 * Created by Mira on 7/6/2015.
 */
public class CategoryAdapter extends ArrayAdapter<Category> {
    private Context context;

    public CategoryAdapter(Context context, int resource, List<Category> objects) {
        super(context, resource, objects);
        this.context = context;
    }

    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        final Category category = getItem(position);
        final Long id = getItemId(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.fragment_category_adapter, null);
            holder = new ViewHolder();
            holder.categoryNameTextView = (TextView) convertView.findViewById(R.id.categoryName);
            holder.categoryNoteTextView = (TextView) convertView.findViewById(R.id.categoryNote);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.categoryNameTextView.setText(category.getCategoryName());
        holder.categoryNoteTextView.setText(category.getNote());

        return convertView;
    }

    /*private view holder class*/
    private class ViewHolder {
        TextView categoryNameTextView;
        TextView categoryNoteTextView;
    }
}
