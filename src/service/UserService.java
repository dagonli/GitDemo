package service;

import domain.User;

/**
 * Created by Dagon on 2018/12/9 - 11:50
 */
public class UserService {


    private User user;

    public User getUserByAge(int age){
        User user=new User();
        user.setAge(age);
        user.setName("NeverMore");
        return user;
    }

}
