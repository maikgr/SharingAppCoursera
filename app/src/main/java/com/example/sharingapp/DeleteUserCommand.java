package com.example.sharingapp;


import android.content.Context;

public class DeleteUserCommand extends Command {
    private UserList userList;
    private User user;
    private Context context;

    public DeleteUserCommand(UserList userList, User user, Context context) {
        this.userList = userList;
        this.user = user;
        this.context = context;
    }

    @Override
    public void execute() {
        userList.removeUser(user);
        setIsExecuted(userList.saveUsers(context));
    }
}
