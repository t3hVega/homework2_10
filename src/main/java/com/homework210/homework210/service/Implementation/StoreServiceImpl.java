package com.homework210.homework210.service.Implementation;

import com.homework210.homework210.exceptions.ItemAlreadyAddedException;
import com.homework210.homework210.model.Item;
import com.homework210.homework210.service.StoreService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
@Scope("session")
public class StoreServiceImpl implements StoreService {
    private final Map<String, Item> cart = new HashMap<>();
    @Override
    public Item add(String id) {
        if (cart.containsKey(id)) {
            throw new ItemAlreadyAddedException("Товар уже в корзине");
        }
        cart.put(id, new Item(id));
        return cart.get(id);
    }
    @Override
    public Map<String, Item> get() {
        return cart;
    }
}
