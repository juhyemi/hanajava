import org.example.app.data.CustDto;
import org.example.app.data.ItemDto;
import org.example.app.frame.Service;
import org.example.app.service.CustService;
import org.example.app.service.ItemService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        CustDto custDto = CustDto.builder().id("id01").pwd("pwd01").build();
//        System.out.println(custDto);

        Service<String, CustDto> service;
        service = new CustService();

        //Insert
        CustDto custDto = CustDto.builder().id("id01").pwd("pwd01").name("james").build();
        service.add(custDto);

        List<CustDto> list = null;
        list = service.get();
        for(CustDto cust:list){
            System.out.println(cust);
        }

        //Item Test
        Service<String, ItemDto> iService;
        iService = new ItemService();

        //Insert
        ItemDto itemDto = ItemDto.builder().id(100001).name("supercleaner").price(2500).build();
        iService.add(itemDto);
        List<ItemDto> ls = null;
        ls = iService.get();
        for(ItemDto item:ls) System.out.println(item);
    }
}