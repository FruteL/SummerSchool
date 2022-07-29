package beum.kand.theatre.service.item.impls;

import beum.kand.theatre.model.Item;
import beum.kand.theatre.repository.ItemFakeRepository;
import beum.kand.theatre.service.item.interfaces.IItemService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class ItemServiceImpl implements IItemService {
    ItemFakeRepository repository = new ItemFakeRepository();

    @Override
    public Item create(Item item) {
        return null;
    }

    @Override
    public Item update(Item item) {
        return null;
    }

    @Override
    public Item get(String id) {
        return null;
    }

    @Override
    public void delete(String id) {
    }

    @Override
    public List<Item> getAll() {
        return repository.getAll();
    }
}