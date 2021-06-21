package ro.ctrln.profile;

import java.util.Objects;

public class UserAccount extends ShoppingActivity implements ReturnOrder{

    private String userEmail;
    private String userName;
    private int password;
    private String homeAddress;

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "userEmail= '" + userEmail + '\'' +
                ", userName= '" + userName + '\'' +
                ", password= " + password +
                ", homeAddress= '" + homeAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAccount that = (UserAccount) o;
        return password == that.password &&
                userEmail.equals(that.userEmail) &&
                userName.equals(that.userName) &&
                homeAddress.equals(that.homeAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userEmail, userName, password, homeAddress);
    }

    @Override
    public void returnOrder() {

    }

    @Override
    public void orderNumber(int productSeries) {

    }
}
