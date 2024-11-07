package service;


import aspects.ToLog;
import lombok.extern.java.Log;
import model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());


    @ToLog
    public String publishComment(Comment comment) {
        System.out.println("Publishing comment: " + comment.getText());
        return "SUCCESS";
    }

//    public void method1() {
//        System.out.println("Вызван метод 1");
//    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

}
