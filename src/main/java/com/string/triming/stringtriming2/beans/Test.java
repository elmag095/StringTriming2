package com.string.triming.stringtriming2.beans;

import com.string.triming.stringtriming2.anotations.Trimmed;
import org.springframework.stereotype.Component;

@Component
public class Test {
    @Trimmed
    public String trString(String str){
        return str;
    }
}
