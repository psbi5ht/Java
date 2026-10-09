import java.util.Scanner;

// ==========================================
// 1. CLASSES FOR SINGLE INHERITANCE
// ==========================================
class ParentSingle {
    String parentName;
    void showParent() {
        System.out.println("[Single] Hello from Parent: " + parentName);
    }
}
class ChildSingle extends ParentSingle {
    String childName;
    void showChild() {
        System.out.println("[Single] Hello from Child: " + childName);
    }
}

// ==========================================
// 2. CLASSES FOR MULTILEVEL INHERITANCE
// ==========================================
class GrandparentMulti {
    String gpName;
    void showGrandparent() {
        System.out.println("[Multilevel] Grandparent Name: " + gpName);
    }
}
class ParentMulti extends GrandparentMulti {
    String pName;
    void showParent() {
        System.out.println("[Multilevel] Parent Name: " + pName);
    }
}
class ChildMulti extends ParentMulti {
    String cName;
    void showChild() {
        System.out.println("[Multilevel] Child Name: " + cName);
    }
}

// ==========================================
// 3. CLASSES FOR HIERARCHICAL INHERITANCE
// ==========================================
class SharedParent {
    String familyName;
    void showFamily() {
        System.out.println("[Hierarchical] Shared Family Surname: " + familyName);
    }
}
class SiblingA extends SharedParent {
    String nameA;
    void showA() {
        System.out.println("[Hierarchical] Sibling A First Name: " + nameA);
    }
}
class SiblingB extends SharedParent {
    String nameB;
    void showB() {
        System.out.println("[Hierarchical] Sibling B First Name: " + nameB);
    }
}

// ==========================================
// MAIN EXECUTION CLASS (RENAMED TO INHERITANCE)
// ==========================================
public class Inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ------------------------------------------
        // STEP 1: SINGLE INHERITANCE INPUT
        // ------------------------------------------
        System.out.println("=== 1. SETUP SINGLE INHERITANCE ===");
        ChildSingle singleObj = new ChildSingle();
        System.out.print("Enter Parent's Name: ");
        singleObj.parentName = scanner.nextLine();
        System.out.print("Enter Child's Name: ");
        singleObj.childName = scanner.nextLine();

        // ------------------------------------------
        // STEP 2: MULTILEVEL INHERITANCE INPUT
        // ------------------------------------------
        System.out.println("\n=== 2. SETUP MULTILEVEL INHERITANCE ===");
        ChildMulti multiObj = new ChildMulti();
        System.out.print("Enter Grandparent's Name: ");
        multiObj.gpName = scanner.nextLine();
        System.out.print("Enter Parent's Name: ");
        multiObj.pName = scanner.nextLine();
        System.out.print("Enter Child's Name: ");
        multiObj.cName = scanner.nextLine();

        // ------------------------------------------
        // STEP 3: HIERARCHICAL INHERITANCE INPUT
        // ------------------------------------------
        System.out.println("\n=== 3. SETUP HIERARCHICAL INHERITANCE ===");
        SiblingA sibA = new SiblingA();
        SiblingB sibB = new SiblingB();
        
        System.out.print("Enter Shared Family Surname: ");
        String sharedSurname = scanner.nextLine();
        sibA.familyName = sharedSurname; 
        sibB.familyName = sharedSurname; 
        
        System.out.print("Enter Sibling A's First Name: ");
        sibA.nameA = scanner.nextLine();
        System.out.print("Enter Sibling B's First Name: ");
        sibB.nameB = scanner.nextLine();

        // ------------------------------------------
        // RUNTIME OUTPUT EXTRACTION
        // ------------------------------------------
        System.out.println("\n================ RUNTIME OUTPUT ================");

        System.out.println("\n👉 EXECUTION OF SINGLE INHERITANCE:");
        singleObj.showParent();  
        singleObj.showChild();   

        System.out.println("\n👉 EXECUTION OF MULTILEVEL INHERITANCE:");
        multiObj.showGrandparent(); 
        multiObj.showParent();      
        multiObj.showChild();       

        System.out.println("\n👉 EXECUTION OF HIERARCHICAL INHERITANCE:");
        sibA.showFamily(); 
        sibA.showA();
        System.out.println("-----------------------");
        sibB.showFamily(); 
        sibB.showB();

        System.out.println("\n=================================================");
        scanner.close();
    }
}

