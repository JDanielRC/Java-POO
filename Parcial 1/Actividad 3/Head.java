//actividad realizada Juan Daniel Rubio Camacho A01633924
public class Head {

    private Eye left, right;

    public Eye getLeft() { return left; }
    private void setLeft(Eye left) {this.left = left;}

    public Eye getRight() { return right; }
    private void setRight(Eye right) {this.right = right;}

    public Head(Eye left, Eye right) {
        this.left = left;
        this.right = right;
    }
}
