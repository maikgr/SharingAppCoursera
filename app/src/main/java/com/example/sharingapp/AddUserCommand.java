package com.example.sharingapp;

import android.content.Context;

public class AddUserCommand extends Command {
    private UserList user_list;
    private User new_user;
    private Context context;

    public AddUserCommand(UserList user_list, User new_item, Context context) {
        this.user_list = user_list;
        this.new_user = new_item;
        this.context = context;
    }

    public void execute() {
        user_list.addUser(new_user);
        setIsExecuted(user_list.saveUsers(context));
    }
}
