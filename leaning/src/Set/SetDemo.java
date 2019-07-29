package Set;

import java.util.HashSet;

public class SetDemo {
  public static void main(String[] args) {
    HashSet<Animal> set = new HashSet<Animal>();

    Animal a1 = new Animal("Dog", 2);
    Animal a2 = new Animal("Cat", 3);
    Animal a3 = new Animal("Cat", 3);
    set.add(a1);
    set.add(a2);
    set.add(a3);

    for (Animal a : set) {
      System.out.println(a.getAge() + "---" + a.getName());
    }
  }
}
