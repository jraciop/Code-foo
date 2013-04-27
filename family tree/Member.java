
package family.tree;

/**
 *
 * @author Jonathan Racioppo
 * This class is to make finding and making family members easy
 */
public class Member {
    static final int delta_capacity = 4;

    //instance variables
    private String name;
    private Member children[];
    private int population;
    private int capacity;

    private Member mother;
    private Member father;

    //Lets make some constructors
    public Member()
    {
        name = "no name";
        population = 0;
        capacity = 0;

        mother = null;
        father = null;
        children = null;
    }
    public Member(String name, Member mother, Member father)
    {
        name = name.trim();
        assert(name.length() > 0);

        population = 0;
        capacity = 0;

        this.name = name;
        this.mother = mother;
        this.father = father;
        children = null;
    }

    //Now for the accessors
    public String Name()
    {
        return name;
    }
    
    public void Name(String name)
    {
        name = name.trim();
        assert(name.length() > 0);
        this.name = name;
    }


    //custom methods
    public int numberOfChildren()
    {
        return population;
    }
    
    //Find the amount of children and granchildren
    public int numberOfDescendants()
    {
        int number_of_descendants = population;
        for(int index = 0; index < population; index++)
        number_of_descendants = number_of_descendants
        + children[index].numberOfDescendants();
        return number_of_descendants;
    }
    
    //Find the number of parents and grandparents
    public int numberOfAncestors()
    {
        int number_of_ancestors = 0;
        if(mother != null) number_of_ancestors = number_of_ancestors + 1 + mother.numberOfAncestors();
        if(father != null) number_of_ancestors = number_of_ancestors + 1 + father.numberOfAncestors();
        return number_of_ancestors;
    }
    
    public Member Child(int index)
    {
        assert(0 <= index && index < population);
        return children[index];
    }
    
    public Member[] Children()
    {
        return children;
    }
    
    //Use this to add children on the fly
    public void addChild(Member child)
        {
            if(population == capacity)
            {
                capacity = capacity + delta_capacity;
                Member t[] = new Member[capacity];
                for(int i = 0; i < population; i++)
                t[i] = children[i];
                children = t;
                t = null;
            }
            children[population] = child;
            population = population + 1;
        }
    public static void addChild(String name, Member mother, Member father)
        {
            Member child = new Member(name, mother, father);
            if(mother != null) mother.addChild(child);
            if(father != null) father.addChild(child);
        }
}

