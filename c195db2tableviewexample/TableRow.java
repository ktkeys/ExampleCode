/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c195db2tableviewexample;

import javafx.beans.value.ObservableValue;

/**
 *
 * @author amy.antonucci
 */
public class TableRow {
    private ObservableValue<String> city;
    private ObservableValue<String> country;
    private ObservableValue<String> start;
    private ObservableValue<String> detail;

    public TableRow(ObservableValue<String> city, ObservableValue<String> country, ObservableValue<String> start,ObservableValue<String> detail) {
        this.city = city;
        this.country = country;
        this.start = start;
        this.detail = detail;
    }

    public ObservableValue<String> getCity() {
        return city;
    }

    public void setCity(ObservableValue<String> city) {
        this.city = city;
    }

    public ObservableValue<String> getCountry() {
        return country;
    }

    public void setCountry(ObservableValue<String> country) {
        this.country = country;
    }

    public ObservableValue<String> getDetail() {
        return detail;
    }

    public void setDetail(ObservableValue<String> detail) {
        this.detail = detail;
    }

    public ObservableValue<String> getStart() {
        return start;
    }

    public void setStart(ObservableValue<String> start) {
        this.start = start;
    }
    
    
}
