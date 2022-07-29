package beum.kand.theatre.repository;

import beum.kand.theatre.model.Item;

import java.time.LocalDateTime;
import java.util.List;

public class ItemFakeRepository {
    private LocalDateTime now = LocalDateTime.now();
    private List<Item> items = List.of(
            new Item("1","item1"," desc1", now, now),
            new Item("2","item2"," desc2", now, now),
            new Item("3","item3"," desc3", now, now),
            new Item("4","item4"," desc4", now, now)
    );

    public List<Item> getAll() {
        return this.items;
    }
}
