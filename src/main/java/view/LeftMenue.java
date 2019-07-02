package view;

import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;

public class LeftMenue extends StackPane {
    private TreeView<String> mTreeView;

    public LeftMenue(){
        TreeItem<String> rootItem = new TreeItem<String>("Модули");

        rootItem.setExpanded(true);

        TreeItem<String> clientsItem = new TreeItem<String>("Клиенты");
        TreeItem<String> resortsItem = new TreeItem<String>("Курорты");
        TreeItem<String> toursItem = new TreeItem<String>("Туры");
        rootItem.getChildren().addAll(clientsItem, resortsItem, toursItem);

        mTreeView = new TreeView<>(rootItem);
        this.getChildren().add(mTreeView);

    }

    public TreeView<String> getTreeView() {
        return mTreeView;
    }
}
