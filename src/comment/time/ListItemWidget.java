package comment.time;

public class ListItemWidget {
    String contents;
    Importancy importancy;
    int itemNumber;

    public ListItemWidget(Importancy importancy, String contents, int itemNumber) {
        this.contents = contents;
        this.importancy = importancy;
        this.itemNumber = itemNumber;
    }
}
