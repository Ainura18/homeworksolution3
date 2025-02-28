Here’s a **simple** version of the README:  

---

# **Week 4 Homework: Builder & Prototype Patterns**  

## **Overview**  
This project demonstrates two design patterns:  
- **Builder**: Helps create complex objects step by step.  
- **Prototype**: Allows cloning objects easily.  

## **Tasks**  

### **1. Builder Pattern**  
- Builds a **Dungeon** with:  
  - Name  
  - Rooms  
  - NPCs (Non-Player Characters)  
- Uses `SimpleDungeonBuilder` to construct the dungeon.  
- Run `MUDBuilderDemo.java` to see the builder in action.  

### **2. Prototype Pattern**  
- Allows **cloning** of `Room` and `NPC` objects.  
- Uses `cloneEntity()` method to make copies.  
- Run `MUDPrototypeDemo.java` to see object cloning.  

### **3. Combining Both**  
- Uses Builder to create a **Dungeon**.  
- Uses Prototype to **clone** rooms and add them.  
- Run `MUDCombinedDemo.java` for both features together.  

## **How to Run**  
1. Open the project in **IntelliJ IDEA**.  
2. Run `MUDBuilderDemo.java` for the **Builder Pattern**.  
3. Run `MUDPrototypeDemo.java` for the **Prototype Pattern**.  
4. Run `MUDCombinedDemo.java` for both together.  

## **Example Output**  

### **Builder Output**  
```
Dungeon: Dark Cave  
Rooms: 1  
NPCs: 1  
```

### **Prototype Output**  
```
Original Room: Hallway  
Cloned Room 1: Hallway Clone  
Cloned Room 2: Hallway Clone  
```

Done! 🚀
