package com.company;

import java.util.ArrayList;
import java.util.List;

public class HashNode {
    List<String> values;

    Integer key;

    HashNode(String value){
        this.values = new ArrayList<>();
        this.values.add(value);
        this.key = value.hashCode();
    }

    void add(String value) {
        if(!this.values.contains(value)){
            this.values.add(value);
        }
    }
}

