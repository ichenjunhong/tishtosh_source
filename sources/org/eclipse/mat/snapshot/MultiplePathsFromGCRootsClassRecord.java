package org.eclipse.mat.snapshot;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.eclipse.mat.SnapshotException;
import org.eclipse.mat.collect.HashMapIntObject;
import org.eclipse.mat.collect.SetInt;
import org.eclipse.mat.snapshot.model.IClass;

public class MultiplePathsFromGCRootsClassRecord {
    private IClass clazz;
    private SetInt distinctObjects;
    private boolean fromRoots;
    private int level;
    public List<int[]> paths = new ArrayList();
    private long referencedSize = -1;
    private ISnapshot snapshot;

    public IClass getClazz() {
        return this.clazz;
    }

    public int getLevel() {
        return this.level;
    }

    public List<int[]> getPaths() {
        return this.paths;
    }

    public boolean isFromRoots() {
        return this.fromRoots;
    }

    public static Comparator<MultiplePathsFromGCRootsClassRecord> getComparatorByNumberOfReferencedObjects() {
        return new Comparator<MultiplePathsFromGCRootsClassRecord>() {
            public final int compare(MultiplePathsFromGCRootsClassRecord multiplePathsFromGCRootsClassRecord, MultiplePathsFromGCRootsClassRecord multiplePathsFromGCRootsClassRecord2) {
                if (multiplePathsFromGCRootsClassRecord.paths.size() < multiplePathsFromGCRootsClassRecord2.paths.size()) {
                    return 1;
                }
                if (multiplePathsFromGCRootsClassRecord.paths.size() > multiplePathsFromGCRootsClassRecord2.paths.size()) {
                    return -1;
                }
                return 0;
            }
        };
    }

    public static Comparator<MultiplePathsFromGCRootsClassRecord> getComparatorByReferencedHeapSize() {
        return new Comparator<MultiplePathsFromGCRootsClassRecord>() {
            public final int compare(MultiplePathsFromGCRootsClassRecord multiplePathsFromGCRootsClassRecord, MultiplePathsFromGCRootsClassRecord multiplePathsFromGCRootsClassRecord2) {
                try {
                    if (multiplePathsFromGCRootsClassRecord.getReferencedHeapSize() < multiplePathsFromGCRootsClassRecord2.getReferencedHeapSize()) {
                        return 1;
                    }
                    if (multiplePathsFromGCRootsClassRecord.getReferencedHeapSize() > multiplePathsFromGCRootsClassRecord2.getReferencedHeapSize()) {
                        return -1;
                    }
                    return 0;
                } catch (SnapshotException unused) {
                    return 0;
                }
            }
        };
    }

    public int getCount() {
        return this.paths.size();
    }

    public long getReferencedHeapSize() throws SnapshotException {
        if (this.referencedSize == -1) {
            this.referencedSize = this.snapshot.getHeapSize(getReferencedObjects());
        }
        return this.referencedSize;
    }

    public int getDistinctCount() {
        int i;
        if (this.distinctObjects == null) {
            this.distinctObjects = new SetInt();
            for (int[] iArr : this.paths) {
                if (this.fromRoots) {
                    i = (iArr.length - this.level) - 1;
                } else {
                    i = this.level;
                }
                this.distinctObjects.add(iArr[i]);
            }
        }
        return this.distinctObjects.size();
    }

    public int[] getReferencedObjects() {
        int[] iArr = new int[this.paths.size()];
        int i = 0;
        for (int[] iArr2 : this.paths) {
            int i2 = i + 1;
            iArr[i] = iArr2[0];
            i = i2;
        }
        return iArr;
    }

    public MultiplePathsFromGCRootsClassRecord[] nextLevel() throws SnapshotException {
        int i;
        int i2 = this.level + 1;
        if (i2 < 0) {
            return null;
        }
        HashMapIntObject hashMapIntObject = new HashMapIntObject();
        for (int[] iArr : this.paths) {
            if (iArr != null) {
                if (this.fromRoots) {
                    i = (iArr.length - i2) - 1;
                } else {
                    i = i2;
                }
                if (i >= 0 && i < iArr.length) {
                    IClass classOf = this.snapshot.getClassOf(iArr[i]);
                    MultiplePathsFromGCRootsClassRecord multiplePathsFromGCRootsClassRecord = (MultiplePathsFromGCRootsClassRecord) hashMapIntObject.get(classOf.getObjectId());
                    if (multiplePathsFromGCRootsClassRecord == null) {
                        multiplePathsFromGCRootsClassRecord = new MultiplePathsFromGCRootsClassRecord(classOf, i2, this.fromRoots, this.snapshot);
                        hashMapIntObject.put(classOf.getObjectId(), multiplePathsFromGCRootsClassRecord);
                    }
                    multiplePathsFromGCRootsClassRecord.addPath(iArr);
                }
            }
        }
        return (MultiplePathsFromGCRootsClassRecord[]) hashMapIntObject.getAllValues(new MultiplePathsFromGCRootsClassRecord[0]);
    }

    public void addPath(int[] iArr) {
        this.paths.add(iArr);
    }

    public MultiplePathsFromGCRootsClassRecord(IClass iClass, int i, boolean z, ISnapshot iSnapshot) {
        this.clazz = iClass;
        this.level = i;
        this.fromRoots = z;
        this.snapshot = iSnapshot;
    }
}
