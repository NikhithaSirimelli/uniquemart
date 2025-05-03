package com.example.uniquemart.service;

import org.springframework.stereotype.Service;

import com.example.uniquemart.model.Item;
import com.example.uniquemart.repository.ItemRepository;

import templates.ItemService;
@Service
public class ItemServiceImpl implements ItemService {

	ItemRepository itemRepository;
	private Item theItem;
	
	
	@Override
	public Iterable<Item> findAll() {
		// TODO Auto-generated method stub
		return itemRepository.findAll();
	}

	@Override
	public Item save(Item item) {
		// TODO Auto-generated method stub
		return itemRepository.save(item);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		itemRepository.deleteById(id);
	}

	@Override
	public Item findById(int id) {
		// TODO Auto-generated method stub
		return theItem;
	}

}
