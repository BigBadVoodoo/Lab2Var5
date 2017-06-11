package dao;

import model.User;

import javax.ejb.Singleton;

/**
 * Created by BigBadVoodooDaddy on 07.06.2017.
 */
@Singleton
public class UserDAO extends AbstractDAO<User>{
    @Override
    protected String fileName() {
        return "user.csv";
    }

    @Override
    protected Object parse(String string) {
        return User.userParse(string);
    }
}
