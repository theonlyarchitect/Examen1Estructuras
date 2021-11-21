package com.company;

import java.util.ArrayList;
import java.util.List;

public class HashTable{
    List<HashNode> nodeList;

    HashTable(){
        nodeList = new ArrayList<>();
    }

    void add(String value){
        for (HashNode node : nodeList) {
            if (node.hashCode() == value.hashCode()){
                node.add(value);
                return;
            }
        }
        nodeList.add(new HashNode(value));
    }

    String print(){
        if(this.nodeList.isEmpty()) return null;

        String result = "";
        for (HashNode node : nodeList) {
            result += "Nodo clave: " + node.key + " Valores: ";
            for (String value : node.values) {
                result += " " + value;
            }
            result += '\n';
        }
        return  result;
    }

}
