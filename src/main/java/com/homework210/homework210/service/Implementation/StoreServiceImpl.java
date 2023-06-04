package com.homework210.homework210.service.Implementation;

import com.homework210.homework210.exceptions.ItemAlreadyAddedException;
import com.homework210.homework210.model.Item;
import com.homework210.homework210.service.StoreService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Scope("session")
public class StoreServiceImpl implements StoreService {
    private final Set<Integer> cart = new HashSet<>();
    @Override
    public List<Integer> add(List<Integer> id) {
        cart.addAll(id);
        return id;
    }
    @Override
    public Set<Integer> get() {
        return new HashSet<>(cart);
    }
}
