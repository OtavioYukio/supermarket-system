package services;

import java.util.List;

public abstract class IDGenerator<T> {
    protected Boolean isUsing = false;
    protected abstract void setUsageStatus(List<T> entities, Integer generatedId);
    protected abstract Integer generateId();
    public abstract void defineId(T entity);
}