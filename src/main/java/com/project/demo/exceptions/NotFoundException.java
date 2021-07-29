package com.project.demo.exceptions;

import com.project.demo.util.MessageUtils;

public class NotFoundException extends  RuntimeException {
    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
