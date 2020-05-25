package org.eclipse.mat.snapshot.model;

import java.io.Serializable;
import java.util.List;
import org.eclipse.mat.SnapshotException;
import org.eclipse.mat.snapshot.ISnapshot;

public interface IObject extends Serializable {

    public interface Type {
    }

    String getClassSpecificName();

    IClass getClazz();

    String getDisplayName();

    GCRootInfo[] getGCRootInfo() throws SnapshotException;

    long getObjectAddress();

    int getObjectId();

    List<NamedReference> getOutboundReferences();

    long getRetainedHeapSize();

    ISnapshot getSnapshot();

    String getTechnicalName();

    int getUsedHeapSize();

    Object resolveValue(String str) throws SnapshotException;
}
