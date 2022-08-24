package beum.kand.theatre.service.role.impls;

import beum.kand.theatre.model.Performance;
import beum.kand.theatre.model.Role;
import beum.kand.theatre.repository.role.RoleMongoRepository;
import beum.kand.theatre.service.role.interfaces.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    RoleMongoRepository repository;

    private LocalDateTime now = LocalDateTime.now();
    Performance red =   new Performance("1", "red Riding Hood", 1697, 14000, "little girl who brings grandma pies", now, now);
    Performance pig = new Performance("2", "Three Pig", 1843, 10000, "3 pig build own houses", now, now);
    Performance masha = new Performance("3", "Masha and Three Bear", 1875, 12000, "little girl lost in forest", now, now);

    private List<Role> roles = new ArrayList<>(
            Arrays.asList(
                    new Role("1", "red Riding Hood", red,"little girl who brings grandma pies", "Role text: Why you have so big eyes? ....", now, now),
                    new Role("2", "Wolf",  red,"bad hero", "I gonna eat you", now, now),
                    new Role("3", "woodcutter",  red,"man who safe girl", "I am safe you...", now, now),
                    new Role("4", "mama",  red,"She start story", "Go ro your granny", now, now),
                    new Role("5", "Masha",  masha,"Main hero", "I'm lost", now, now),
                    new Role("6", "mama bear",  masha,"Mama of little bear", "Whe sit in my sofa?", now, now),
                    new Role("7", "Papa bear",  masha,"Father of little bear", "Who eat from my plate?", now, now),
                    new Role("8", "son bear",  masha,"little bear", "Who sleep in my bed?", now, now),
                    new Role("9", "Oldest Pig", pig,"", "", now, now),
                    new Role("10", "Wolf", pig,"", "", now, now)
                    ));

    @PostConstruct
    void init(){
        repository.saveAll(roles);
    }

    @Override
    public Role create(Role role) {
        role.setCreatedAt(LocalDateTime.now());
        return repository.save(role);
    }

    @Override
    public Role update(Role role) {
        role.setUpdatedAt(LocalDateTime.now());
        return repository.save(role);
    }

    @Override
    public Role get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Role> getAll() {
        return repository.findAll();
    }
}
