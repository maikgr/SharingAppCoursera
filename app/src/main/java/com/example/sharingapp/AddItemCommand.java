package com.example.sharingapp;

import android.content.Context;

public class AddItemCommand extends Command {
    private ItemList item_list;
    private Item new_item;
    private Context context;

    public AddItemCommand(ItemList item_list, Item new_item, Context context) {
        this.item_list = item_list;
        this.new_item = new_item;
        this.context = context;
    }

    public void execute() {
        item_list.addItem(new_item);
        setIsExecuted(item_list.saveItems(context));
    }
}
