package ro.ctrln.profile;

public class Wishlist {

    private String wishlist = "T-shirt, shoes, skirt";

    public String getWishlist() {
        return wishlist;
    }

    public void setWishlist(String wishlist) {
        this.wishlist = wishlist;
    }

    @Override
    public String toString() {
        return "Wishlist{" +
                "wishlist='" + wishlist + '\'' +
                '}';
    }
}
