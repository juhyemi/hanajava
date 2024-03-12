package org.example.app.dao;

import org.example.app.data.ItemDto;
import org.example.app.frame.Dao;

import java.util.ArrayList;
import java.util.List;

public class ItemDao implements Dao<String, ItemDto> {

    @Override
    public int insert(ItemDto itemDto) {
        System.out.println("Oracle DB : Inserted"+itemDto);
        return 0;
    }

    @Override
    public int delete(String s) {
        System.out.println("Oracle DB : deleted"+s);
        return 0;
    }

    @Override
    public int update(ItemDto itemDto) {
        System.out.println("Oracle DB : updated"+itemDto);
        return 0;
    }

    @Override
    public ItemDto select(String s) {
        return ItemDto.builder().id(100001).name("cleaner1").price(2000).build();
    }

    @Override
    public List<ItemDto> select() {
        ArrayList<ItemDto> list = new ArrayList<>();
        list.add(ItemDto.builder().id(100001).name("cleaner1").price(2000).build());
        list.add(ItemDto.builder().id(100002).name("cleaner2").price(2000).build());
        list.add(ItemDto.builder().id(100003).name("cleaner3").price(2000).build());
        return list;
    }
}
