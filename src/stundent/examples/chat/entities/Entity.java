package stundent.examples.chat.entities;

import java.util.UUID;

public class Entity {
    private UUID id;

    public Entity (){}

    public Entity(UUID id) {
        setId(this.id);

    }
    public void setId(UUID id) {
       this.id = id;

    }
    public UUID getId(){
        return id;
    }
}
