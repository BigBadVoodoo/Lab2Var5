package dao;

import model.Task;
import model.User;

import javax.ejb.Singleton;

/**
 * Created by BigBadVoodooDaddy on 07.06.2017.
 */
@Singleton
public class TaskDAO extends AbstractDAO<User>{
    @Override
    protected String fileName() {
        return "task.csv";
    }

    @Override
    protected Object parse(String string) {
        return Task.parseTask(string);
    }
}
