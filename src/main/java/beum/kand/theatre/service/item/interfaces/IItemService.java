package beum.kand.theatre.service.item.interfaces;

import beum.kand.theatre.model.Item;

import java.util.List;

public interface IItemService {
    Item create(Item item);
    Item update(Item item);
    Item get(String id);
    void delete(String id);
    List<Item> getAll();
}
