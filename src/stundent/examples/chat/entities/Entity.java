package stundent.examples.chat.entities;

public class Entity {
    private int id;

    public Entity (){}

    public Entity(int id) {
        setId(this.id);


    }
    public void setId(int id) {
        if (id <= 1  || id >= 1000000) {
            this.id = id;
        }else {
            System.out.println(" The id is out of range ");
        }

    }
    public int getId(){
        return id;
    }
}
