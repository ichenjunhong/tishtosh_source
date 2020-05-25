package org.eclipse.mat.snapshot;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.eclipse.mat.collect.SetInt;
import org.eclipse.mat.snapshot.model.IObject;

public final class DominatorsSummary {
    public static final Comparator<Object> COMPARE_BY_DOMINATED = new Comparator<Object>() {
        public final int compare(Object obj, Object obj2) {
            int i;
            int i2;
            if (obj instanceof ClassDominatorRecord) {
                i2 = ((ClassDominatorRecord) obj).getDominatedCount();
                i = ((ClassDominatorRecord) obj2).getDominatedCount();
            } else {
                i2 = ((ClassloaderDominatorRecord) obj).getDominatedCount();
                i = ((ClassloaderDominatorRecord) obj2).getDominatedCount();
            }
            if (i2 > i) {
                return 1;
            }
            if (i2 == i) {
                return 0;
            }
            return -1;
        }
    };
    public static final Comparator<Object> COMPARE_BY_DOMINATED_HEAP_SIZE = new Comparator<Object>() {
        public final int compare(Object obj, Object obj2) {
            long j;
            long j2;
            if (obj instanceof ClassDominatorRecord) {
                j2 = ((ClassDominatorRecord) obj).getDominatedNetSize();
                j = ((ClassDominatorRecord) obj2).getDominatedNetSize();
            } else {
                j2 = ((ClassloaderDominatorRecord) obj).getDominatedNetSize();
                j = ((ClassloaderDominatorRecord) obj2).getDominatedNetSize();
            }
            if (j2 > j) {
                return 1;
            }
            if (j2 == j) {
                return 0;
            }
            return -1;
        }
    };
    public static final Comparator<Object> COMPARE_BY_DOMINATED_RETAINED_HEAP_SIZE = new Comparator<Object>() {
        public final int compare(Object obj, Object obj2) {
            long j;
            long j2;
            if (obj instanceof ClassDominatorRecord) {
                j2 = ((ClassDominatorRecord) obj).getDominatedRetainedSize();
                j = ((ClassDominatorRecord) obj2).getDominatedRetainedSize();
            } else {
                j2 = ((ClassloaderDominatorRecord) obj).getDominatedRetainedSize();
                j = ((ClassloaderDominatorRecord) obj2).getDominatedRetainedSize();
            }
            if (j2 > j) {
                return 1;
            }
            if (j2 == j) {
                return 0;
            }
            return -1;
        }
    };
    public static final Comparator<Object> COMPARE_BY_DOMINATORS = new Comparator<Object>() {
        public final int compare(Object obj, Object obj2) {
            int i;
            int i2;
            if (obj instanceof ClassDominatorRecord) {
                i2 = ((ClassDominatorRecord) obj).getDominatorCount();
                i = ((ClassDominatorRecord) obj2).getDominatorCount();
            } else {
                i2 = ((ClassloaderDominatorRecord) obj).getDominatorCount();
                i = ((ClassloaderDominatorRecord) obj2).getDominatorCount();
            }
            if (i2 > i) {
                return 1;
            }
            if (i2 == i) {
                return 0;
            }
            return -1;
        }
    };
    public static final Comparator<Object> COMPARE_BY_DOMINATOR_HEAP_SIZE = new Comparator<Object>() {
        public final int compare(Object obj, Object obj2) {
            long j;
            long j2;
            if (obj instanceof ClassDominatorRecord) {
                j2 = ((ClassDominatorRecord) obj).getDominatorNetSize();
                j = ((ClassDominatorRecord) obj2).getDominatorNetSize();
            } else {
                j2 = ((ClassloaderDominatorRecord) obj).getDominatorNetSize();
                j = ((ClassloaderDominatorRecord) obj2).getDominatorNetSize();
            }
            if (j2 > j) {
                return 1;
            }
            if (j2 == j) {
                return 0;
            }
            return -1;
        }
    };
    public static final Comparator<Object> COMPARE_BY_DOMINATOR_RETAINED_HEAP_SIZE = new Comparator<Object>() {
        public final int compare(Object obj, Object obj2) {
            long j;
            long j2;
            if (obj instanceof ClassDominatorRecord) {
                j2 = ((ClassDominatorRecord) obj).getDominatorRetainedSize();
                j = ((ClassDominatorRecord) obj2).getDominatorRetainedSize();
            } else {
                j2 = ((ClassloaderDominatorRecord) obj).getDominatorRetainedSize();
                j = ((ClassloaderDominatorRecord) obj2).getDominatorRetainedSize();
            }
            if (j2 > j) {
                return 1;
            }
            if (j2 == j) {
                return 0;
            }
            return -1;
        }
    };
    public static final Comparator<Object> COMPARE_BY_NAME = new Comparator<Object>() {
        public final int compare(Object obj, Object obj2) {
            if (obj instanceof ClassDominatorRecord) {
                return ((ClassDominatorRecord) obj).getClassName().compareTo(((ClassDominatorRecord) obj2).getClassName());
            }
            return ((ClassloaderDominatorRecord) obj).getName().compareTo(((ClassloaderDominatorRecord) obj2).getName());
        }
    };
    private ClassDominatorRecord[] classDominatorRecords;
    private ClassloaderDominatorRecord[] classloaderDominatorRecords;
    private Object data;
    private ISnapshot snapshot;

    public static class ClassDominatorRecord {
        int classId;
        String className;
        int classloaderId;
        SetInt dominated = new SetInt(500);
        long dominatedNetSize;
        long dominatedRetainedSize;
        SetInt dominator = new SetInt(500);
        long dominatorNetSize;
        long dominatorRetainedSize;
        DominatorsSummary summary;

        public int getClassId() {
            return this.classId;
        }

        public String getClassName() {
            return this.className;
        }

        public int getClassloaderId() {
            return this.classloaderId;
        }

        public long getDominatedNetSize() {
            return this.dominatedNetSize;
        }

        public long getDominatedRetainedSize() {
            return this.dominatedRetainedSize;
        }

        public long getDominatorNetSize() {
            return this.dominatorNetSize;
        }

        public long getDominatorRetainedSize() {
            return this.dominatorRetainedSize;
        }

        public DominatorsSummary getSummary() {
            return this.summary;
        }

        public int[] getDominated() {
            return this.dominated.toArray();
        }

        public int getDominatedCount() {
            return this.dominated.size();
        }

        public int getDominatorCount() {
            return this.dominator.size();
        }

        public int[] getDominators() {
            return this.dominator.toArray();
        }

        public void setClassId(int i) {
            this.classId = i;
        }

        public void setClassName(String str) {
            this.className = str;
        }

        public void setClassloaderId(int i) {
            this.classloaderId = i;
        }

        public void setDominatedRetainedSize(long j) {
            this.dominatedRetainedSize = j;
        }

        public void setDominatorRetainedSize(long j) {
            this.dominatorRetainedSize = j;
        }

        public boolean addDominated(int i) {
            return this.dominated.add(i);
        }

        public void addDominatedNetSize(long j) {
            this.dominatedNetSize += j;
        }

        public boolean addDominator(int i) {
            return this.dominator.add(i);
        }

        public void addDominatorNetSize(long j) {
            this.dominatorNetSize += j;
        }
    }

    public static class ClassloaderDominatorRecord {
        int dominated;
        long dominatedNetSize;
        long dominatedRetainedSize;
        int dominator;
        long dominatorNetSize;
        long dominatorRetainedSize;

        /* renamed from: id */
        protected int f133291id;
        protected String name;
        protected List<ClassDominatorRecord> records = new ArrayList();

        public int getDominatedCount() {
            return this.dominated;
        }

        public long getDominatedNetSize() {
            return this.dominatedNetSize;
        }

        public long getDominatedRetainedSize() {
            return this.dominatedRetainedSize;
        }

        public int getDominatorCount() {
            return this.dominator;
        }

        public long getDominatorNetSize() {
            return this.dominatorNetSize;
        }

        public long getDominatorRetainedSize() {
            return this.dominatorRetainedSize;
        }

        public int getId() {
            return this.f133291id;
        }

        public String getName() {
            return this.name;
        }

        public List<ClassDominatorRecord> getRecords() {
            return this.records;
        }

        public void setDominatedRetainedSize(long j) {
            this.dominatedRetainedSize = j;
        }

        public void setDominatorRetainedSize(long j) {
            this.dominatorRetainedSize = j;
        }

        public void setId(int i) {
            this.f133291id = i;
        }
    }

    public final ClassDominatorRecord[] getClassDominatorRecords() {
        return this.classDominatorRecords;
    }

    public final Object getData() {
        return this.data;
    }

    public final ClassloaderDominatorRecord[] getClassloaderDominatorRecords() {
        return getClassloaderDominatorRecords(ClassloaderDominatorRecord.class);
    }

    public final void setData(Object obj) {
        this.data = obj;
    }

    public static Comparator<Object> reverseComparator(final Comparator<Object> comparator) {
        return new Comparator<Object>() {
            public final int compare(Object obj, Object obj2) {
                return comparator.compare(obj2, obj);
            }
        };
    }

    public final <C extends ClassloaderDominatorRecord> C[] getClassloaderDominatorRecords(Class<C> cls) {
        synchronized (this) {
            if (this.classloaderDominatorRecords == null) {
                this.classloaderDominatorRecords = load(cls);
            }
        }
        return (ClassloaderDominatorRecord[]) this.classloaderDominatorRecords;
    }

    private ClassloaderDominatorRecord[] load(Class<ClassloaderDominatorRecord> cls) {
        ClassDominatorRecord[] classDominatorRecordArr;
        try {
            HashMap hashMap = new HashMap();
            for (ClassDominatorRecord classDominatorRecord : this.classDominatorRecords) {
                ClassloaderDominatorRecord classloaderDominatorRecord = (ClassloaderDominatorRecord) hashMap.get(Integer.valueOf(classDominatorRecord.getClassloaderId()));
                if (classloaderDominatorRecord == null) {
                    ClassloaderDominatorRecord classloaderDominatorRecord2 = (ClassloaderDominatorRecord) cls.newInstance();
                    hashMap.put(Integer.valueOf(classDominatorRecord.getClassloaderId()), classloaderDominatorRecord2);
                    classloaderDominatorRecord2.setId(classDominatorRecord.getClassloaderId());
                    if (classloaderDominatorRecord2.getId() == -1) {
                        classloaderDominatorRecord2.name = "<ROOT>";
                    } else {
                        IObject object = this.snapshot.getObject(classloaderDominatorRecord2.f133291id);
                        classloaderDominatorRecord2.name = object.getClassSpecificName();
                        if (classloaderDominatorRecord2.name == null) {
                            classloaderDominatorRecord2.name = object.getTechnicalName();
                        }
                    }
                    classloaderDominatorRecord = classloaderDominatorRecord2;
                }
                classloaderDominatorRecord.dominated += classDominatorRecord.getDominatedCount();
                classloaderDominatorRecord.dominator += classDominatorRecord.getDominatorCount();
                classloaderDominatorRecord.dominatedNetSize += classDominatorRecord.getDominatedNetSize();
                classloaderDominatorRecord.dominatorNetSize += classDominatorRecord.getDominatorNetSize();
                classloaderDominatorRecord.records.add(classDominatorRecord);
            }
            return (ClassloaderDominatorRecord[]) hashMap.values().toArray(new ClassloaderDominatorRecord[hashMap.size()]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public DominatorsSummary(ClassDominatorRecord[] classDominatorRecordArr, ISnapshot iSnapshot) {
        this.classDominatorRecords = classDominatorRecordArr;
        this.snapshot = iSnapshot;
        for (ClassDominatorRecord classDominatorRecord : classDominatorRecordArr) {
            classDominatorRecord.summary = this;
        }
    }
}
