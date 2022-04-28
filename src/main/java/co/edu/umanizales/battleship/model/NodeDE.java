package co.edu.umanizales.battleship.model;

import lombok.Data;

@Data
public class NodeDE {
    private Ship data;
    private NodeDE next;
    private NodeDE previous;

    public NodeDE(Ship data) {
        this.data = data;
    }
}
