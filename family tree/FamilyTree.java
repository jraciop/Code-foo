
package family.tree;


/**
 *
 * @author Jonathan Racioppo
 * This program is for IGN's code-foo.  We made a member class to easily create attributes for each 
 * family member.  The program will display parents and descendants names, then it will find who 
 * they share a name with.
 */
public class FamilyTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
{
    //Lets make some the first generation
    Member father = new Member("Jon", null, null);
    Member mother = new Member("Sally", null, null);

    //Give them some kids
    Member.addChild("Renee", mother, father);
    Member.addChild("Thomas", mother, father);
    Member.addChild("Gerald", mother, father);
    Member.addChild("Micheal", mother, father);
    Member.addChild("Carolyn", mother, father);
    Member.addChild("Julia", mother, father);
    Member.addChild("Jon", mother, father);
    Member.addChild("David", mother, father);

    //Make some kids for the kids
    Member father2 = father.Child(1);
    Member mother2 = new Member("Karen", null, null);
    Member.addChild("Emily", mother2, father2);
    Member.addChild("Jon", mother2, father2);
    Member.addChild("Anne", mother2, father2);

    Member children[] = null;
    int number_of_children = 0;
    
    //Show the first generation
    System.out.println();
    System.out.printf("%s has %d children\n", father.Name(), father.numberOfChildren());
    System.out.printf("%s has %d children\n", mother.Name(), mother.numberOfChildren());
    children = father.Children();
    number_of_children = father.numberOfChildren();
    
    //Lets see if they have matching names with their parents
    for(int i = 0; i < number_of_children; i++)
    {
        System.out.println(children[i].Name());
        if(children[i].Name() == father.Name())
            System.out.println(children[i].Name() + " has the same name as their father" );
    }
    
    //Now the second generation
    System.out.println();
    System.out.printf("%s has %d children\n", father2.Name(), father2.numberOfChildren());
    System.out.printf("%s has %d children\n", mother2.Name(), mother2.numberOfChildren());
    children = mother2.Children();
    number_of_children = mother2.numberOfChildren();
    
    //Now the last generation and lets find similar names
    for(int i = 0; i < number_of_children; i++)
    {
        System.out.println(children[i].Name());
        if(children[i].Name() == father2.Name())
            System.out.println(children[i].Name() + " has the same name as their father" );
        else if(children[i].Name() == mother2.Name())
            System.out.println(children[i].Name() + " has the same name as their mother" );
        if(children[i].Name() == father.Name())
            System.out.println(children[i].Name() + " has the same name as their grandfather" );
        else if(children[i].Name() == mother.Name())
            System.out.println(children[i].Name() + " has the same name as their grandmother" );
     }
    
    //Show how many descendants the father has and the ancestors of the youngest
    System.out.printf("\n%s has %d descendants\n", father.Name(), father.numberOfDescendants());
    Member child = mother2.Child(2);
    System.out.printf("\n%s has %d ancestors\n", child.Name(), child.numberOfAncestors());
    }

}
}
