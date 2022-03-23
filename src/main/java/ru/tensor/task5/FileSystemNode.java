package ru.tensor.task5;

public interface FileSystemNode {
    FileSystemNode getParent();
    String getName();
    String getPath();
}
