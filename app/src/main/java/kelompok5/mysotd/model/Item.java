package kelompok5.mysotd.model;

import android.media.Image;

import com.orm.SugarRecord;
import com.orm.dsl.Ignore;

import java.sql.Blob;
import java.util.Date;

/**
 * Created by Mira on 7/5/2015.
 */
public class Item extends SugarRecord<Item> {
    private String idItem;
    private String itemName;

    @Ignore
    private String itemBrand;
    private Blob itemPicture;
    private int timeUsed;
    private Date datePurchased;
    private Date dateExpired;
    private Date dateLastUsed;
    private String note;

    public Item(){
    }

    public Item(String idItem, String itemName){
        this.idItem = idItem;
        this.itemName = itemName;
    }

    public String getIdItem() {
        return idItem;
    }

    public void setIdItem(String newIdItem) {
        idItem = newIdItem;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String newItemName) {
        itemName = newItemName;
    }

    public String getItemBrand() {
        return itemBrand;
    }

    public void setItemBrand(String newItemBrand) {
        itemBrand = newItemBrand;
    }

    public Blob getItemPicture() {
        return itemPicture;
    }

    public void setItemPicture(Blob newItemPicture) {
        itemPicture = newItemPicture;
    }

    public int getTimeUsed() {
        return timeUsed;
    }

    public void setTimeUsed(int newTimeUsed) {
        timeUsed = newTimeUsed;
    }

    public Date getDatePurchased() {
        return datePurchased;
    }

    public void setDatePurchased(Date newDatePurchased) {
        datePurchased = newDatePurchased;
    }

    public Date getDateExpired() {
        return dateExpired;
    }

    public void setDateExpired(Date newDateExpired) {
        dateExpired = newDateExpired;
    }

    public Date getDateLastUsed() {
        return dateLastUsed;
    }

    public void setDateLastUsed(Date newDateLastUsed) {
        dateLastUsed = newDateLastUsed;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String newNote) {
        note = newNote;
    }

}
