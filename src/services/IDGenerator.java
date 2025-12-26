package services;

import java.util.List;

public abstract class IDGenerator<T> {
    protected Boolean isUsing = false;
    public abstract Integer generateId(List<T> entities);
}