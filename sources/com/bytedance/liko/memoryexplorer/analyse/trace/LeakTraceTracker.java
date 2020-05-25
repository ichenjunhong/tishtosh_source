package com.bytedance.liko.memoryexplorer.analyse.trace;

import com.bytedance.liko.memoryexplorer.analyse.trace.LeakTraceElement.Holder;
import com.bytedance.liko.memoryexplorer.analyse.trace.LeakTraceElement.Type;
import com.bytedance.liko.memoryexplorer.util.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import leakcanary.internal.LeakCanaryFileProvider;
import org.eclipse.mat.SnapshotException;
import org.eclipse.mat.snapshot.IPathsFromGCRootsComputer;
import org.eclipse.mat.snapshot.ISnapshot;
import org.eclipse.mat.snapshot.PathsFromGCRootsTree;
import org.eclipse.mat.snapshot.model.IArray;
import org.eclipse.mat.snapshot.model.IClass;
import org.eclipse.mat.snapshot.model.IObject;
import org.eclipse.mat.snapshot.model.NamedReference;
import org.eclipse.mat.snapshot.model.PrettyPrinter;
import org.eclipse.mat.snapshot.model.ThreadToLocalReference;

public class LeakTraceTracker {
    private String getThreadName(IObject iObject) throws SnapshotException {
        return PrettyPrinter.objectAsString((IObject) iObject.resolveValue(LeakCanaryFileProvider.f132049i), Integer.MAX_VALUE);
    }

    private static Map<IClass, Set<String>> buildClassExcludeMap(ISnapshot iSnapshot, Map<String, Set<String>> map) throws SnapshotException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            Collection classesByName = iSnapshot.getClassesByName((String) entry.getKey(), false);
            if (classesByName != null && classesByName.size() == 1) {
                linkedHashMap.put((IClass) classesByName.iterator().next(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    private PathsFromGCRootsTree shortestPathToGcRoots(ISnapshot iSnapshot, IObject iObject, ExcludedRefs excludedRefs) throws SnapshotException {
        return shortestValidPath(iSnapshot, iSnapshot.getPathsFromGCRoots(iObject.getObjectId(), buildClassExcludeMap(iSnapshot, excludedRefs.excludeFieldMap)), excludedRefs);
    }

    private PathsFromGCRootsTree shortestValidPath(ISnapshot iSnapshot, IPathsFromGCRootsComputer iPathsFromGCRootsComputer, ExcludedRefs excludedRefs) throws SnapshotException {
        PathsFromGCRootsTree tree;
        Map buildClassExcludeMap = buildClassExcludeMap(iSnapshot, excludedRefs.excludeStaticFieldMap);
        do {
            int[] nextShortestPath = iPathsFromGCRootsComputer.getNextShortestPath();
            if (nextShortestPath == null) {
                return null;
            }
            tree = iPathsFromGCRootsComputer.getTree(Collections.singletonList(nextShortestPath));
        } while (!validPath(iSnapshot, tree, buildClassExcludeMap, excludedRefs));
        return tree;
    }

    private LeakTrace buildLeakTrace(ISnapshot iSnapshot, PathsFromGCRootsTree pathsFromGCRootsTree, ExcludedRefs excludedRefs) throws SnapshotException {
        ArrayList arrayList = new ArrayList();
        IObject iObject = null;
        while (pathsFromGCRootsTree != null) {
            IObject object = iSnapshot.getObject(pathsFromGCRootsTree.getOwnId());
            arrayList.add(0, buildLeakElement(iObject, object, excludedRefs));
            int[] objectIds = pathsFromGCRootsTree.getObjectIds();
            if (objectIds.length > 0) {
                pathsFromGCRootsTree = pathsFromGCRootsTree.getBranch(objectIds[0]);
            } else {
                pathsFromGCRootsTree = null;
            }
            iObject = object;
        }
        return new LeakTrace(arrayList);
    }

    private NamedReference findChildInParent(IObject iObject, IObject iObject2, ExcludedRefs excludedRefs) throws SnapshotException {
        if (iObject == null) {
            return null;
        }
        Set set = (Set) excludedRefs.excludeFieldMap.get(iObject2.getClazz());
        try {
            for (NamedReference namedReference : iObject2.getOutboundReferences()) {
                if (namedReference.getObjectId() == iObject.getObjectId() && (set == null || !set.contains(namedReference.getName()))) {
                    return namedReference;
                }
            }
        } catch (Exception e) {
            Logger.m24776i("findChildInParent Exception:%s", e.toString());
        }
        return null;
    }

    public LeakTrace findLeakTrace(ISnapshot iSnapshot, IObject iObject, ExcludedRefs excludedRefs) throws SnapshotException {
        PathsFromGCRootsTree shortestPathToGcRoots = shortestPathToGcRoots(iSnapshot, iObject, excludedRefs);
        if (shortestPathToGcRoots == null) {
            return null;
        }
        LeakTrace buildLeakTrace = buildLeakTrace(iSnapshot, shortestPathToGcRoots, excludedRefs);
        if (buildLeakTrace.getLeakedElement() != null && !buildLeakTrace.isEmpty()) {
            buildLeakTrace.getLeakedElement().retainedHeapSize = iObject.getRetainedHeapSize();
            LeakTraceElement leakedElement = buildLeakTrace.getLeakedElement();
            StringBuilder sb = new StringBuilder("0x");
            sb.append(Long.toHexString(iSnapshot.mapIdToAddress(iObject.getObjectId())));
            leakedElement.address = sb.toString();
        }
        return buildLeakTrace;
    }

    private LeakTraceElement buildLeakElement(IObject iObject, IObject iObject2, ExcludedRefs excludedRefs) throws SnapshotException {
        Type type;
        String str;
        String str2;
        String str3;
        Holder holder;
        Holder holder2;
        Holder holder3;
        String name;
        Type type2;
        NamedReference findChildInParent = findChildInParent(iObject, iObject2, excludedRefs);
        String str4 = null;
        if (findChildInParent != null) {
            String name2 = findChildInParent.getName();
            if (iObject2 instanceof IClass) {
                type2 = Type.STATIC_FIELD;
            } else if (findChildInParent instanceof ThreadToLocalReference) {
                type2 = Type.LOCAL;
            } else {
                type2 = Type.INSTANCE_FIELD;
            }
            type = type2;
            str = name2;
        } else {
            str = null;
            type = null;
        }
        if (iObject2 instanceof IClass) {
            IClass iClass = (IClass) iObject2;
            holder3 = Holder.CLASS;
            name = iClass.getName();
        } else if (iObject2 instanceof IArray) {
            holder3 = Holder.ARRAY;
            name = iObject2.getClazz().getName();
        } else {
            IClass clazz = iObject2.getClazz();
            String name3 = clazz.getName();
            if (clazz.doesExtend(Thread.class.getName())) {
                holder2 = Holder.THREAD;
                String threadName = getThreadName(iObject2);
                StringBuilder sb = new StringBuilder("(named '");
                sb.append(threadName);
                sb.append("')");
                str4 = sb.toString();
            } else if (name3.matches("^.+\\$\\d+$")) {
                String name4 = clazz.getSuperClass().getName();
                if (Object.class.getName().equals(name4)) {
                    Holder holder4 = Holder.OBJECT;
                    try {
                        Class cls = Class.forName(clazz.getName()).getInterfaces()[0];
                        StringBuilder sb2 = new StringBuilder("(anonymous class implements ");
                        sb2.append(cls.getName());
                        sb2.append(")");
                        str2 = sb2.toString();
                        holder = holder4;
                    } catch (ClassNotFoundException unused) {
                        holder = holder4;
                    }
                    str3 = name3;
                    LeakTraceElement leakTraceElement = new LeakTraceElement(str, type, holder, str3, str2);
                    return leakTraceElement;
                }
                holder2 = Holder.OBJECT;
                StringBuilder sb3 = new StringBuilder("(anonymous class extends ");
                sb3.append(name4);
                sb3.append(")");
                str4 = sb3.toString();
            } else {
                holder2 = Holder.OBJECT;
            }
            holder = holder2;
            str2 = str4;
            str3 = name3;
            LeakTraceElement leakTraceElement2 = new LeakTraceElement(str, type, holder, str3, str2);
            return leakTraceElement2;
        }
        holder = holder3;
        str3 = name;
        str2 = null;
        LeakTraceElement leakTraceElement22 = new LeakTraceElement(str, type, holder, str3, str2);
        return leakTraceElement22;
    }

    private LeakTrace buildLeakTrace(ISnapshot iSnapshot, PathsFromGCRootsTree pathsFromGCRootsTree, ExcludedRefs excludedRefs, int i) throws SnapshotException {
        List arrayList = new ArrayList();
        IObject iObject = null;
        while (pathsFromGCRootsTree != null) {
            IObject object = iSnapshot.getObject(pathsFromGCRootsTree.getOwnId());
            arrayList.add(0, buildLeakElement(iObject, object, excludedRefs));
            int[] objectIds = pathsFromGCRootsTree.getObjectIds();
            if (objectIds.length > 0) {
                pathsFromGCRootsTree = pathsFromGCRootsTree.getBranch(objectIds[0]);
            } else {
                pathsFromGCRootsTree = null;
            }
            iObject = object;
        }
        if (arrayList.size() > i) {
            arrayList = arrayList.subList(0, i);
        }
        return new LeakTrace(arrayList);
    }

    private boolean validPath(ISnapshot iSnapshot, PathsFromGCRootsTree pathsFromGCRootsTree, Map<IClass, Set<String>> map, ExcludedRefs excludedRefs) throws SnapshotException {
        if (map.isEmpty() && excludedRefs.excludedThreads.isEmpty()) {
            return true;
        }
        IObject iObject = null;
        while (pathsFromGCRootsTree != null) {
            IObject object = iSnapshot.getObject(pathsFromGCRootsTree.getOwnId());
            if (object instanceof IClass) {
                Set set = (Set) map.get((IClass) object);
                if (set != null) {
                    NamedReference findChildInParent = findChildInParent(iObject, object, excludedRefs);
                    if (findChildInParent != null && set.contains(findChildInParent.getName())) {
                        return false;
                    }
                }
            } else if (object.getClazz().doesExtend(Thread.class.getName()) && excludedRefs.excludedThreads.contains(getThreadName(object))) {
                return false;
            }
            int[] objectIds = pathsFromGCRootsTree.getObjectIds();
            if (objectIds.length > 0) {
                pathsFromGCRootsTree = pathsFromGCRootsTree.getBranch(objectIds[0]);
            } else {
                pathsFromGCRootsTree = null;
            }
            iObject = object;
        }
        return true;
    }

    public LeakTrace findLeakTrace(ISnapshot iSnapshot, IObject iObject, ExcludedRefs excludedRefs, int i) throws SnapshotException {
        PathsFromGCRootsTree shortestPathToGcRoots = shortestPathToGcRoots(iSnapshot, iObject, excludedRefs);
        if (shortestPathToGcRoots == null) {
            return null;
        }
        LeakTrace buildLeakTrace = buildLeakTrace(iSnapshot, shortestPathToGcRoots, excludedRefs, i);
        if (buildLeakTrace.getLeakedElement() != null && !buildLeakTrace.isEmpty()) {
            buildLeakTrace.getLeakedElement().retainedHeapSize = iObject.getRetainedHeapSize();
            LeakTraceElement leakedElement = buildLeakTrace.getLeakedElement();
            StringBuilder sb = new StringBuilder("0x");
            sb.append(Long.toHexString(iSnapshot.mapIdToAddress(iObject.getObjectId())));
            leakedElement.address = sb.toString();
        }
        return buildLeakTrace;
    }
}
