package org.sinksky.datetools;

/**
 * 无效的时间格式异常
 */
public class InvalidPatternException extends RuntimeException{

    public InvalidPatternException(String message) {
        super(message);
    }

}
