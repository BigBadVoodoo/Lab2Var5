package dao;

import model.Element;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by BigBadVoodooDaddy on 05.06.2017.
 */
@Singleton  // аннотация, показывающая, что для каждого приложения у нас будет существовать только один bean
public abstract class AbstractDAO<T extends Element> {

    private String dir = "E:/Documents2/Programming/Berkunskiy-programming/Projects/Trainning/webJsfCdi0506(0)"; //поле (путь)

    protected abstract String fileName();    // абстрактные методы
    protected abstract Object parse(String string);

    private List elements = new ArrayList(); // поле - список elements

    @PostConstruct              // действия перед созанием bean
    public void init() {
        try {
            BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(dir, fileName())); //читаем файл
            elements = bufferedReader.lines().map(this::parse).collect(Collectors.toList());  //конвертируем то, что прочитали в список
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public T find(Object id) {                    // метод для нахождения пользователя по id
        List<T> els = elements;
        return els.stream().filter(e->e.getId().equals(id)).findFirst().orElse(null);
    }
}
