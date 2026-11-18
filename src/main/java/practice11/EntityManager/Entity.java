package practice11.EntityManager;

import java.util.Objects;

public abstract class Entity {
    private int age;
    private String name;
    private boolean active;

    public Entity(int age, String name, boolean active) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException();
        }
        this.age = age;

        this.name = name;
        this.active = active;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return name + ", " + age + ", active=" + active;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return age == entity.age && active == entity.active && Objects.equals(name, entity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, active);
    }
}
