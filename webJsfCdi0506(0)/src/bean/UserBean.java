package bean;

import dao.UserDAO;
import model.User;

import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by BigBadVoodooDaddy on 07.06.2017.
 */
@Named    // Управляющий bean
@SessionScoped    //bean "живет" в пределах сессии
public class UserBean implements Serializable{
    @EJB
    UserDAO userDAO;         // СОСТОЯНИЕ КЛАССА

    User user = new User();

    public User getUser() {
        return user;
    }   //getter

    public void setUser() {
        this.user = user;
    }   //setter

    public String check() {           //метод для проверки пользователя по id
        User found = userDAO.find(user.getId());
        if (found==null || !found.getPassword().equals(user.getPassword())) return "error";
        else {
            return "ok";
        }
    }
}
