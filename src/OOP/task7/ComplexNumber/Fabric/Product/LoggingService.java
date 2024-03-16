package OOP.task7.ComplexNumber.Fabric.Product;

import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Сервис для ведения журнала событий.
 */
public class LoggingService {
    private static final Logger logger = Logger.getLogger(LoggingService.class.getName());

    /**
     * Записывает информационное сообщение в журнал событий.
     * @param message информационное сообщение для записи.
     */
    public static void logInfo(String message) {
        logger.log(Level.INFO, message);
    }

    /**
     * Записывает сообщение об ошибке в журнал событий.
     * @param message сообщение об ошибке для записи.
     */
    public static void logError(String message){
        logger.log(Level.SEVERE, message);
    }
}

