/*
 * This program is for class, I think. It can make a name list to be some group. 
 */

/**
 *
 * @author Kevin_lkf
 */
import java.util.*;

public class NameListGrouping {
    //Make some ArrayList. Classes number is number of a group people's number.
    ArrayList<String> class0 = new ArrayList<>(); 
    ArrayList<String> class1 = new ArrayList<>();
    ArrayList<String> class2 = new ArrayList<>(); 
    ArrayList<String> class3 = new ArrayList<>();
    
    //Add name into list. I use scanner to make user input name. 
    Scanner sc = new Scanner(System.in);
    
    //Create a String to input.
    String name;
    /* void DoAdd() {
        //yyl is my classmate's name(I'm a chinese....)......change the number"28" to modify total name number.
        for(int yyl = 1;yyl != 29;yyl++){
            //because I have to make 4 group,so it has 7 prople in each class.
            if(yyl == 1 || yyl <= 7){
                
                System.out.println("Please enter the number of " + yyl + "'s name:");
                name = sc.next();
                class0.add(name);
                
            }
            //Second group:
            if(yyl == 8 || yyl <= 15){
                
                System.out.println("Please enter the number of " + yyl + "'s name:");
                name = sc.next();
                class1.add(name);
                
            }
            
            //Third group:
            if(yyl == 16 || yyl <= 22){
                
                System.out.println("Please enter the number of " + yyl + "'s name:");
                name = sc.next();
                class2.add(name);
                
            }
            
            //The forth:
            if(yyl == 23 || yyl <= 29){
                
                System.out.println("Please enter the number of " + yyl + "'s name:");
                name = sc.next();
                class3.add(name);
                
            }
        }
    } */
    void DoAdd() {
		for(int y=1;y!=29;y++) {
			System.out.println("请输入第" + y + "名学生的姓名:");
			if(y <= 7) {
				name = sc.next();
				class0.add(name);
			}
			
			if(y > 7 && y <= 14) {
				name = sc.next();
				class1.add(name);
			}
			
			if(y > 14 && y <= 21) {
				name = sc.next();
				class2.add(name);
			}
			
			if(y > 21 && y <= 28) {
				name = sc.next();
				class3.add(name);
			}
			System.out.println("");
		}
	}
    
    void DoGrouping() {
    //get the length of list
    int length0 = class0.size();
    int length1 = class1.size();
    int length2 = class2.size();
    int length3 = class3.size();
    
    //make a random number of each list
    length0 = (int) (Math.random() * length0);
    length1 = (int) (Math.random() * length1);
    length2 = (int) (Math.random() * length2);
    length3 = (int) (Math.random() * length3);
    
    //catch these name 
    String Name0 = class0.get(length0);
    String Name1 = class0.get(length1);
    String Name2 = class0.get(length2);
    String Name3 = class0.get(length3);
    
    //print them
    System.out.println("The group is: " + Name0 + Name1 + Name2 + Name3);
    
    //remove them from list
    class0.remove(length0);
    class1.remove(length1);
    class2.remove(length2);
    class3.remove(length3);
    }
}


class Launcher {
    public static void main(String[] args) {
       //To prapare of Polymorphism...
    NameListGrouping nlg = new NameListGrouping();
    
    //do add
    nlg.DoAdd();
    
    //start grouping.I have to make 7 group.(wyn is my classmate.....)
    for(int wyn = 0;wyn!=7;wyn++){
     //start grouping.
     nlg.DoGrouping();
        }
    }
}