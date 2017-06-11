package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BigBadVoodooDaddy on 05.06.2017.
 */
public class User implements Element{

    private String id;    //Поля
    private String name;
    private String password;
    private String position;
    private String eMail;
    private String telNumber;
    private List<Task> tasks;

    @Override
    public Object getId() {   // Имплементация метода getId
        return null;
    }

    {
        tasks = new ArrayList<>();   // Блок инициализации
    }

    public User() {         // Конструктор по умолчанию
    }

    public User(String id, String name, String password, String position, String eMail, String telNumber) {    // Конструктора 2
        this.id = id;
        this.name = name;
        this.password = password;
        this.position = position;
        this.eMail = eMail;
        this.telNumber = telNumber;
    }

    public void setId(String id) {      // Getters and Setters (инкапсуляция)
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public static User userParse(String s) {               // Дополнительный метод для чтения полей из БД пользователей
        String [] split = s.split(";");
        return new User(split[0], split[1], split[2], split[3], split[4], split[5]);
    }

    public List<Task> getTasks () {return tasks;}       // Дополнительный метод для получения списка ТЗ из БД ТЗ
}
