package org.eclipse.mat.snapshot.model;

import java.io.Serializable;
import org.eclipse.mat.SnapshotException;
import org.eclipse.mat.snapshot.ISnapshot;

public class ObjectReference implements Serializable {
    private static final long serialVersionUID = 1;
    private long address;
    private transient ISnapshot snapshot;

    public long getObjectAddress() {
        return this.address;
    }

    public IObject getObject() throws SnapshotException {
        return this.snapshot.getObject(getObjectId());
    }

    public int getObjectId() throws SnapshotException {
        return this.snapshot.mapAddressToId(this.address);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("0x");
        sb.append(Long.toHexString(this.address));
        return sb.toString();
    }

    public ObjectReference(ISnapshot iSnapshot, long j) {
        this.snapshot = iSnapshot;
        this.address = j;
    }
}
