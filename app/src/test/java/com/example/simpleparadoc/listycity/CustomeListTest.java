package com.example.simpleparadoc.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomeListTest {

    private CustomList list;

    @BeforeEach
    public void  createlist(){
        list=new CustomList(null, new ArrayList<City>());
    }
    @Test
    public void addCitytest(){
        int listSize=list.getCount();
        list.addCity(new City("Edmonton","Alberta"));
        assertEquals(listSize+1,list.getCount());
    }
    @Test
    public void hascitytest(){
        int listSize=list.getCount();
        list.addCity(new City("Edmonton","Alberta"));
        String newcity= "Edmonton";
        assertTrue(list.hascity(newcity));
    }

}
