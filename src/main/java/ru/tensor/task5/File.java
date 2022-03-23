package ru.tensor.task5;

public class File extends AbstractFileSystemNode {
    private String extension;

    public File(String name, String extension) {
        super(name);
        setParent(this);
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }

    @Override
    public String getName() {
        return super.getName() + "." + extension;
    }
}
