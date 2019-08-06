import java.util.Arrays;
import java.util.Scanner;

public class TreeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tree[] trees = new Tree[3];


        for (int i = 0; i < trees.length; i++) {
            do {
                System.out.println("Podaj gatunek i wysokość drzewa");
                Tree tree = new Tree(scanner.nextLine(), scanner.nextDouble());
                scanner.nextLine();

                if (isDuplicate(trees, tree)) {
                    trees[i] = tree;
                } else {
                    System.out.println("Duplikat");
                }
            } while (trees[i] == null);
        }
        System.out.println(Arrays.toString(trees));
        scanner.close();
    }

    private static boolean isDuplicate(Tree[] trees, Tree tree) {

        for (Tree value : trees) {
            if (tree.equals(value)) {
                return false;
            }
        }
        return true;
    }
}
