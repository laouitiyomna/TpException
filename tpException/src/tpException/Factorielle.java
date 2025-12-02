package tpException;

class Factorielle {
    public static void main(String[] args) {
        try {
            int nbEntiers = Integer.parseInt(args[0]); 

            if (nbEntiers < 0) {
                throw new NegativeNumberException(nbEntiers + " Le nombre ne doit pas etre negatif");
            }
            if (nbEntiers >= 20) {
                throw new superNumberException(nbEntiers + " Le nombre est trop grand < 20");
            }

            int factorielle = 1;
            int ancien;
            for (int i = 2; i <= nbEntiers; i++) {
                ancien = factorielle;
                factorielle *= i;
            }

            System.out.println("Voila la factorielle des " + nbEntiers +
                    " premiers entiers : " + factorielle);

        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        } catch (superNumberException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            if (e instanceof ArrayIndexOutOfBoundsException)
                System.out.println("donner un parametre de factorielle");
            else if (e instanceof NumberFormatException)
                System.out.println("doit etre entier");

        }
    }
}