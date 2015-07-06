package kelompok5.mysotd.model;

import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by Mira on 7/5/2015.
 */
public class Category  extends SugarRecord<Category> {
    private String idCategory;
    private String categoryName;
    private String note;

    //defining relationship
    List<Item> itemList;

    public Category(){}
    public Category (String idCategory, String categoryName){
        this.idCategory = idCategory;
        this.categoryName = categoryName;
    }

    /** @pdRoleInfo migr=no name=Item assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
    public java.util.Collection<Item> item;

    public String getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(String newIdCategory) {
        idCategory = newIdCategory;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String newCategoryName) {
        categoryName = newCategoryName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String newNote) {
        note = newNote;
    }


    /** @pdGenerated default getter */
    public java.util.Collection<Item> getItem() {
        if (item == null)
            item = new java.util.HashSet<Item>();
        return item;
    }

    /** @pdGenerated default iterator getter */
    public java.util.Iterator getIteratorItem() {
        if (item == null)
            item = new java.util.HashSet<Item>();
        return item.iterator();
    }

    /** @pdGenerated default setter
     * @param newItem */
    public void setItem(java.util.Collection<Item> newItem) {
        removeAllItem();
        for (java.util.Iterator iter = newItem.iterator(); iter.hasNext();)
            addItem((Item)iter.next());
    }

    /** @pdGenerated default add
     * @param newItem */
    public void addItem(Item newItem) {
        if (newItem == null)
            return;
        if (this.item == null)
            this.item = new java.util.HashSet<Item>();
        if (!this.item.contains(newItem))
            this.item.add(newItem);
    }

    /** @pdGenerated default remove
     * @param oldItem */
    public void removeItem(Item oldItem) {
        if (oldItem == null)
            return;
        if (this.item != null)
            if (this.item.contains(oldItem))
                this.item.remove(oldItem);
    }

    /** @pdGenerated default removeAll */
    public void removeAllItem() {
        if (item != null)
            item.clear();
    }
}
