package com.example.uniquemart.service;

import com.example.uniquemart.model.Item;

public interface ItemService {
Iterable<Item>findAll();
Item save(Item item);
void delete(int id);
Item findById(int id);
}
