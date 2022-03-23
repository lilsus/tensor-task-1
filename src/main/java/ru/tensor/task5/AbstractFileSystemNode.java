package ru.tensor.task5;

public abstract class AbstractFileSystemNode implements FileSystemNode {
    private String name;
    private FileSystemNode parent;

    public AbstractFileSystemNode(String name) {
        this.name = name;
    }

    @Override
    public final FileSystemNode getParent() {
        return parent;
    }

    public void setParent(FileSystemNode parent) {
        this.parent = parent;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public final String getPath() {
        if (parent != null) {
            return parent.getPath() + "/" + getName();
        }
        return "/" + getName();
    }
}
