package comment.time;

public class Importancy {
    final int level = 100;
    String text = "test text";

    Match match = new Match();

    public int howImportant() {
        String listItemContent = match.group(3).trim();
        //여기서 trim은 정말 중요하다. trim 함수는 문자열에서 시작 공백을 제거한다.
        //문자열에 시작 공백이 있으면 다른 문자열로 인식되기 때문이다.
        new ListItemWidget(this, listItemContent, this.level + 1);
        return buildList(text.substring(match.end()));
    }

    public int buildList(String buildText) {
        if (buildText != null) {
            return 200;
        } else {
            return 404;
        }
    }
}
