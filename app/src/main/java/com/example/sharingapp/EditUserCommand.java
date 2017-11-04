package com.example.sharingapp;

import android.content.Context;

public class EditUserCommand extends Command {
    private UserList userList;
    private User newUser;
    private User oldUser;
    private Context context;

    public EditUserCommand(UserList userList, User oldUser, User newUser, Context context) {
        this.userList = userList;
        this.oldUser = oldUser;
        this.newUser = newUser;
        this.context = context;
    }

    @Override
    public void execute() {
        userList.removeUser(oldUser);
        userList.addUser(newUser);
        setIsExecuted(userList.saveUsers(context));
    }
}
