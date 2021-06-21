package ro.ctrln.profile;

public class AccountUsage {


    public static void main(String[] args) {

        UserAccount userAccount = new UserAccount();
        userAccount.setUserEmail("email@gmail.com");
        userAccount.setUserName("Maria Ion");
        userAccount.setPassword(123456);
        userAccount.setHomeAddress("Str. ----, Nr. 000, ...");
        System.out.println("The account details are: " + userAccount);

        ShoppingActivity shoppingActivity = new ShoppingActivity();
        shoppingActivity.setOrderNumber(14);
        int orderNumber = 14;// cum pot proceda sa scap de aceasta linie, int fiind definit in clasa ShoppingActivity cu 14?
        System.out.println("Your order number is now: " + orderNumber);

        Wishlist wishlist = new Wishlist();
        wishlist.setWishlist("T-shirt, shoes, skirt");
        System.out.println("Your wishlist contains: " + wishlist);

        shoppingActivity.returnOrder();
    }
}
