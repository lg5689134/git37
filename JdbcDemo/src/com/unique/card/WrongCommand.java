/**
 * @filename WrongCommand.java
 * @author lg
 * @date 2019年3月18日 下午5:14:38
 * @version 1.0
 * Copyright (C) 2019 
 */

package com.unique.card;

public class WrongCommand extends Exception {
    public WrongCommand(){

    }
    public WrongCommand(String message){
        super(message);
    }

}
