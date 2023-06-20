public class Shape {
    public int publicMember = 0;
    private int privateMember = 10;
    protected int protectedMember = 100;

    public void setPrivateMember(int privateMember) {
        this.privateMember = privateMember;
    }

    public int getPrivateMember() {
        return privateMember;
    }

    Shape() {
        System.out.println("in shape constructor");
    }
}
