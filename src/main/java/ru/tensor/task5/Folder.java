package ru.tensor.task5;

import java.util.List;

public class Folder extends AbstractFileSystemNode {
    private List<AbstractFileSystemNode> childs;

    public Folder(String name, AbstractFileSystemNode... childs) {
        super(name);
        this.childs = List.of(childs);
        for (AbstractFileSystemNode child : childs) {
            child.setParent(this);
        }
    }

    public void addChild(AbstractFileSystemNode child) {
        childs.add(child);
    }

    public List<AbstractFileSystemNode> getChilds() {
        return childs;
    }
}
