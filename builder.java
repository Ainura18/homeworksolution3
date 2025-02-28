import java.util.ArrayList;
import java.util.List;

public interface IDungeonBuilder {
    IDungeonBuilder setDungeonName(String name);
    IDungeonBuilder addRoom(Room room);
    IDungeonBuilder addNPC(NPC npc);
    Dungeon build();
}

class SimpleDungeonBuilder implements IDungeonBuilder {
    private String name;
    private List<Room> rooms = new ArrayList<>();
    private List<NPC> npcs = new ArrayList<>();

    public IDungeonBuilder setDungeonName(String name) {
        this.name = name;
        return this;
    }

    public IDungeonBuilder addRoom(Room room) {
        rooms.add(room);
        return this;
    }

    public IDungeonBuilder addNPC(NPC npc) {
        npcs.add(npc);
        return this;
    }

    public Dungeon build() {
        return new Dungeon(name, rooms, npcs);
    }
}

class Dungeon {
    private String name;
    private List<Room> rooms;
    private List<NPC> npcs;

    public Dungeon(String name, List<Room> rooms, List<NPC> npcs) {
        this.name = name;
        this.rooms = new ArrayList<>(rooms);
        this.npcs = new ArrayList<>(npcs);
    }

    public void showDungeon() {
        System.out.println("Dungeon: " + name);
        System.out.println("Rooms: " + rooms.size());
        System.out.println("NPCs: " + npcs.size());
    }
}

interface CloneableGameEntity {
    CloneableGameEntity cloneEntity();
}

class Room implements CloneableGameEntity {
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CloneableGameEntity cloneEntity() {
        return new Room(this.name + " Clone", this.description);
    }

    public String toString() {
        return "Room{name='" + name + "', description='" + description + "'}";
    }
}

class NPC implements CloneableGameEntity {
    private String name;
    private String description;

    public NPC(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CloneableGameEntity cloneEntity() {
        return new NPC(this.name + " Clone", this.description);
    }

    public String toString() {
        return "NPC{name='" + name + "', description='" + description + "'}";
    }
}

class MUDBuilderDemo {
    public static void main(String[] args) {
        SimpleDungeonBuilder builder = new SimpleDungeonBuilder();
        Dungeon dungeon = builder.setDungeonName("Dark Cave")
                .addRoom(new Room("Entrance", "A dark and damp entrance"))
                .addNPC(new NPC("Goblin", "A sneaky little goblin"))
                .build();
        dungeon.showDungeon();
    }
}

class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room prototypeRoom = new Room("Hallway", "A long corridor");
        Room clonedRoom1 = (Room) prototypeRoom.cloneEntity();
        Room clonedRoom2 = (Room) prototypeRoom.cloneEntity();

        System.out.println("Original Room: " + prototypeRoom);
        System.out.println("Cloned Room 1: " + clonedRoom1);
        System.out.println("Cloned Room 2: " + clonedRoom2);
    }
}
