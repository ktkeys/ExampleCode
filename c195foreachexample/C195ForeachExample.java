/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c195foreachexample;

import java.time.LocalDateTime;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author amy.antonucci
 */
public class C195ForeachExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ObservableList<LocalDateTime> timelist = FXCollections.observableArrayList();
        timelist.add(LocalDateTime.now());
        timelist.add(LocalDateTime.now().plusHours(1));
        timelist.add(LocalDateTime.now().minusHours(1));
        timelist.add(LocalDateTime.now().plusHours(3));
        timelist.add(LocalDateTime.now().minusHours(3));
        
        //timelist.forEach(t->System.out.println(t));
        timelist.forEach(
                t-> {
                    if (t.isAfter(LocalDateTime.now()))
                        System.out.println(t);
                }
        );
        

    }

}
