package meaningfulname;

import java.util.ArrayList;
import java.util.List;

public class Page22Naming {
    
    final int STATUS_VALUE = 0;
    final int FLAGGED = 1;
    
    public List<Cell> getFlaggedCells() {
        List<Cell> flaggedCells = new ArrayList<>();
        List<Cell> gameBoard = new ArrayList<>();

        for(Cell cell : gameBoard)
            if(cell.isFlagged())
                flaggedCells.add(cell);
        return flaggedCells;
    }
}

class Cell {
    public boolean isFlagged(){
        return true;
    }
}
