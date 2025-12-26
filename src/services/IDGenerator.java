package services;

import java.util.List;

public abstract class IDGenerator<T> {
    protected Boolean isUsing = false;
    protected abstract void setUsageStatus(List<T> entities, Integer generatedId);
    public abstract Integer generateId(List<T> entities);
}