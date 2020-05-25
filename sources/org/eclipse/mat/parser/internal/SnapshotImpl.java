package org.eclipse.mat.parser.internal;

import com.p683ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.eclipse.mat.SnapshotException;
import org.eclipse.mat.collect.ArrayInt;
import org.eclipse.mat.collect.ArrayIntBig;
import org.eclipse.mat.collect.BitField;
import org.eclipse.mat.collect.HashMapIntObject;
import org.eclipse.mat.collect.IteratorInt;
import org.eclipse.mat.collect.SetInt;
import org.eclipse.mat.parser.IObjectReader;
import org.eclipse.mat.parser.index.IIndexReader.IOne2ManyIndex;
import org.eclipse.mat.parser.index.IIndexReader.IOne2OneIndex;
import org.eclipse.mat.parser.index.IndexManager;
import org.eclipse.mat.parser.internal.snapshot.MultiplePathsFromGCRootsComputerImpl;
import org.eclipse.mat.parser.internal.snapshot.ObjectCache;
import org.eclipse.mat.parser.internal.snapshot.ObjectMarker;
import org.eclipse.mat.parser.internal.snapshot.PathsFromGCRootsTreeBuilder;
import org.eclipse.mat.parser.internal.snapshot.RetainedSizeCache;
import org.eclipse.mat.parser.internal.util.IntStack;
import org.eclipse.mat.parser.model.ClassImpl;
import org.eclipse.mat.parser.model.XGCRootInfo;
import org.eclipse.mat.parser.model.XSnapshotInfo;
import org.eclipse.mat.snapshot.DominatorsSummary;
import org.eclipse.mat.snapshot.DominatorsSummary.ClassDominatorRecord;
import org.eclipse.mat.snapshot.ExcludedReferencesDescriptor;
import org.eclipse.mat.snapshot.IMultiplePathsFromGCRootsComputer;
import org.eclipse.mat.snapshot.IPathsFromGCRootsComputer;
import org.eclipse.mat.snapshot.ISnapshot;
import org.eclipse.mat.snapshot.PathsFromGCRootsTree;
import org.eclipse.mat.snapshot.model.GCRootInfo;
import org.eclipse.mat.snapshot.model.IClass;
import org.eclipse.mat.snapshot.model.IObject;
import org.eclipse.mat.snapshot.model.IThreadStack;
import org.eclipse.mat.snapshot.model.NamedReference;
import org.eclipse.mat.util.IProgressListener;
import org.eclipse.mat.util.IProgressListener.OperationCanceledException;
import org.eclipse.mat.util.MessageUtil;
import org.eclipse.mat.util.VoidProgressListener;

public final class SnapshotImpl implements ISnapshot {
    private BitField arrayObjects;
    private HashMapIntObject<ClassImpl> classCache;
    private Map<String, List<IClass>> classCacheByName = new HashMap(this.classCache.size());
    private boolean dominatorTreeCalculated;
    public IObjectReader heapObjectReader;
    public IndexManager indexManager;
    private HashMapIntObject<String> loaderLabels;
    private ObjectCache<IObject> objectCache;
    private boolean parsedThreads;
    private RetainedSizeCache retainedSizeCache;
    public HashMapIntObject<XGCRootInfo[]> roots;
    private HashMapIntObject<HashMapIntObject<XGCRootInfo[]>> rootsPerThread;
    private XSnapshotInfo snapshotInfo;
    HashMapIntObject<IThreadStack> threadId2stack;

    static final class HeapObjectCache extends ObjectCache<IObject> {
        SnapshotImpl snapshot;

        /* JADX WARNING: type inference failed for: r0v4, types: [org.eclipse.mat.snapshot.model.IObject] */
        /* JADX WARNING: type inference failed for: r8v3 */
        /* JADX WARNING: type inference failed for: r1v5, types: [org.eclipse.mat.parser.model.InstanceImpl] */
        /* JADX WARNING: type inference failed for: r1v6, types: [org.eclipse.mat.parser.model.ClassLoaderImpl] */
        /* JADX WARNING: type inference failed for: r8v5, types: [org.eclipse.mat.snapshot.model.IObject] */
        /* JADX WARNING: type inference failed for: r0v13 */
        /* JADX WARNING: type inference failed for: r1v8, types: [org.eclipse.mat.parser.model.InstanceImpl] */
        /* JADX WARNING: type inference failed for: r1v9, types: [org.eclipse.mat.parser.model.ClassLoaderImpl] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v13
          assigns: [?[OBJECT, ARRAY], org.eclipse.mat.parser.model.InstanceImpl, org.eclipse.mat.parser.model.ClassLoaderImpl]
          uses: [?[OBJECT, ARRAY], org.eclipse.mat.snapshot.model.IObject, org.eclipse.mat.parser.model.InstanceImpl, org.eclipse.mat.parser.model.ClassLoaderImpl]
          mth insns count: 40
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 5 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final org.eclipse.mat.snapshot.model.IObject load(int r8) {
            /*
                r7 = this;
                org.eclipse.mat.parser.internal.SnapshotImpl r0 = r7.snapshot     // Catch:{ IOException -> 0x0056, SnapshotException -> 0x004f }
                boolean r0 = r0.isArray(r8)     // Catch:{ IOException -> 0x0056, SnapshotException -> 0x004f }
                if (r0 == 0) goto L_0x0014
                org.eclipse.mat.parser.internal.SnapshotImpl r0 = r7.snapshot     // Catch:{ IOException -> 0x0056, SnapshotException -> 0x004f }
                org.eclipse.mat.parser.IObjectReader r0 = r0.heapObjectReader     // Catch:{ IOException -> 0x0056, SnapshotException -> 0x004f }
                org.eclipse.mat.parser.internal.SnapshotImpl r1 = r7.snapshot     // Catch:{ IOException -> 0x0056, SnapshotException -> 0x004f }
                org.eclipse.mat.snapshot.model.IObject r8 = r0.read(r8, r1)     // Catch:{ IOException -> 0x0056, SnapshotException -> 0x004f }
                r0 = r8
                goto L_0x0046
            L_0x0014:
                org.eclipse.mat.parser.internal.SnapshotImpl r0 = r7.snapshot     // Catch:{ IOException -> 0x0056, SnapshotException -> 0x004f }
                org.eclipse.mat.parser.internal.SnapshotImpl r1 = r7.snapshot     // Catch:{ IOException -> 0x0056, SnapshotException -> 0x004f }
                org.eclipse.mat.parser.index.IndexManager r1 = r1.indexManager     // Catch:{ IOException -> 0x0056, SnapshotException -> 0x004f }
                org.eclipse.mat.parser.index.IIndexReader$IOne2OneIndex r1 = r1.o2class()     // Catch:{ IOException -> 0x0056, SnapshotException -> 0x004f }
                int r1 = r1.get(r8)     // Catch:{ IOException -> 0x0056, SnapshotException -> 0x004f }
                org.eclipse.mat.snapshot.model.IObject r0 = r0.getObject(r1)     // Catch:{ IOException -> 0x0056, SnapshotException -> 0x004f }
                r5 = r0
                org.eclipse.mat.parser.model.ClassImpl r5 = (org.eclipse.mat.parser.model.ClassImpl) r5     // Catch:{ IOException -> 0x0056, SnapshotException -> 0x004f }
                org.eclipse.mat.parser.internal.SnapshotImpl r0 = r7.snapshot     // Catch:{ IOException -> 0x0056, SnapshotException -> 0x004f }
                boolean r0 = r0.isClassLoader(r8)     // Catch:{ IOException -> 0x0056, SnapshotException -> 0x004f }
                if (r0 == 0) goto L_0x003c
                org.eclipse.mat.parser.model.ClassLoaderImpl r0 = new org.eclipse.mat.parser.model.ClassLoaderImpl     // Catch:{ IOException -> 0x0056, SnapshotException -> 0x004f }
                r3 = -9223372036854775808
                r6 = 0
                r1 = r0
                r2 = r8
                r1.<init>(r2, r3, r5, r6)     // Catch:{ IOException -> 0x0056, SnapshotException -> 0x004f }
                goto L_0x0046
            L_0x003c:
                org.eclipse.mat.parser.model.InstanceImpl r0 = new org.eclipse.mat.parser.model.InstanceImpl     // Catch:{ IOException -> 0x0056, SnapshotException -> 0x004f }
                r3 = -9223372036854775808
                r6 = 0
                r1 = r0
                r2 = r8
                r1.<init>(r2, r3, r5, r6)     // Catch:{ IOException -> 0x0056, SnapshotException -> 0x004f }
            L_0x0046:
                r8 = r0
                org.eclipse.mat.parser.model.AbstractObjectImpl r8 = (org.eclipse.mat.parser.model.AbstractObjectImpl) r8     // Catch:{ IOException -> 0x0056, SnapshotException -> 0x004f }
                org.eclipse.mat.parser.internal.SnapshotImpl r1 = r7.snapshot     // Catch:{ IOException -> 0x0056, SnapshotException -> 0x004f }
                r8.setSnapshot(r1)     // Catch:{ IOException -> 0x0056, SnapshotException -> 0x004f }
                return r0
            L_0x004f:
                r8 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r8)
                throw r0
            L_0x0056:
                r8 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.eclipse.mat.parser.internal.SnapshotImpl.HeapObjectCache.load(int):org.eclipse.mat.snapshot.model.IObject");
        }

        private HeapObjectCache(SnapshotImpl snapshotImpl, int i) {
            super(i);
            this.snapshot = snapshotImpl;
        }
    }

    static class Path {
        int index;
        Path next;

        public int getIndex() {
            return this.index;
        }

        public Path getNext() {
            return this.next;
        }

        public boolean contains(long j) {
            for (Path path = this; path != null; path = path.next) {
                if (((long) path.index) == j) {
                    return true;
                }
            }
            return false;
        }

        public Path(int i, Path path) {
            this.index = i;
            this.next = path;
        }
    }

    class PathsFromGCRootsComputerImpl implements IPathsFromGCRootsComputer {
        int currentId;
        Path currentPath;
        int[] currentReferrers;
        int currentReferringThread;
        BitField excludeInstances;
        Map<IClass, Set<String>> excludeMap;
        LinkedList<Path> fifo = new LinkedList<>();
        int[] foundPath;
        IOne2ManyIndex inboundIndex;
        int lastReadReferrer;
        private int nextState;
        int objectId;
        int[] referringThreads;
        private int state;
        BitField visited = new BitField(SnapshotImpl.this.indexManager.o2address().size());

        private void initExcludeInstances() throws SnapshotException {
            this.excludeInstances = new BitField(SnapshotImpl.this.indexManager.o2address().size());
            for (IClass objectIds : this.excludeMap.keySet()) {
                for (int i : objectIds.getObjectIds()) {
                    this.excludeInstances.set(i);
                }
            }
        }

        public int[] getNextShortestPath() throws SnapshotException {
            switch (this.state) {
                case 0:
                    if (SnapshotImpl.this.roots.containsKey(this.currentId)) {
                        this.referringThreads = null;
                        this.state = 2;
                        this.nextState = 1;
                        this.foundPath = new int[]{this.currentId};
                        return getNextShortestPath();
                    }
                    this.state = 3;
                    return getNextShortestPath();
                case 1:
                    return null;
                case 2:
                    if (this.referringThreads == null) {
                        this.referringThreads = getReferringTreads(SnapshotImpl.this.getGCRootInfo(this.foundPath[this.foundPath.length - 1]));
                        this.currentReferringThread = 0;
                        if (this.referringThreads.length == 0) {
                            this.state = this.nextState;
                            return this.foundPath;
                        }
                    }
                    if (this.currentReferringThread < this.referringThreads.length) {
                        int[] iArr = new int[(this.foundPath.length + 1)];
                        System.arraycopy(this.foundPath, 0, iArr, 0, this.foundPath.length);
                        iArr[iArr.length - 1] = this.referringThreads[this.currentReferringThread];
                        this.currentReferringThread++;
                        return iArr;
                    }
                    this.state = this.nextState;
                    return getNextShortestPath();
                case 3:
                    if (this.currentReferrers != null) {
                        int[] processCurrentReferrefs = processCurrentReferrefs(this.lastReadReferrer + 1);
                        if (processCurrentReferrefs != null) {
                            return processCurrentReferrefs;
                        }
                    }
                    while (this.fifo.size() > 0) {
                        this.currentPath = (Path) this.fifo.getFirst();
                        this.fifo.removeFirst();
                        this.currentId = this.currentPath.getIndex();
                        this.currentReferrers = this.inboundIndex.get(this.currentId);
                        if (this.currentReferrers != null) {
                            int[] processCurrentReferrefs2 = processCurrentReferrefs(0);
                            if (processCurrentReferrefs2 != null) {
                                return processCurrentReferrefs2;
                            }
                        }
                    }
                    return null;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append(Messages.SnapshotImpl_Error_UnrecognizedState);
                    sb.append(this.state);
                    throw new RuntimeException(sb.toString());
            }
        }

        private int[] getReferringTreads(GCRootInfo[] gCRootInfoArr) {
            SetInt setInt = new SetInt();
            for (GCRootInfo gCRootInfo : gCRootInfoArr) {
                if (!(gCRootInfo.getContextAddress() == 0 || gCRootInfo.getObjectAddress() == gCRootInfo.getContextAddress())) {
                    setInt.add(gCRootInfo.getContextId());
                }
            }
            return setInt.toArray();
        }

        private int[] path2Int(Path path) {
            IntStack intStack = new IntStack();
            while (path != null) {
                intStack.push(path.getIndex());
                path = path.getNext();
            }
            int[] iArr = new int[intStack.size()];
            for (int i = 0; i < iArr.length; i++) {
                iArr[i] = intStack.pop();
            }
            return iArr;
        }

        public PathsFromGCRootsTree getTree(Collection<int[]> collection) {
            PathsFromGCRootsTreeBuilder pathsFromGCRootsTreeBuilder = new PathsFromGCRootsTreeBuilder(this.objectId);
            for (int[] iArr : collection) {
                PathsFromGCRootsTreeBuilder pathsFromGCRootsTreeBuilder2 = pathsFromGCRootsTreeBuilder;
                for (int i = 1; i < iArr.length; i++) {
                    int i2 = iArr[i];
                    PathsFromGCRootsTreeBuilder pathsFromGCRootsTreeBuilder3 = (PathsFromGCRootsTreeBuilder) pathsFromGCRootsTreeBuilder2.getObjectReferers().get(Integer.valueOf(i2));
                    if (pathsFromGCRootsTreeBuilder3 == null) {
                        pathsFromGCRootsTreeBuilder3 = new PathsFromGCRootsTreeBuilder(i2);
                        pathsFromGCRootsTreeBuilder2.addObjectReferer(pathsFromGCRootsTreeBuilder3);
                    }
                    pathsFromGCRootsTreeBuilder2 = pathsFromGCRootsTreeBuilder3;
                }
            }
            return pathsFromGCRootsTreeBuilder.toPathsFromGCRootsTree();
        }

        private int[] processCurrentReferrefs(int i) throws SnapshotException {
            int[] iArr;
            while (i < this.currentReferrers.length) {
                if (((GCRootInfo[]) SnapshotImpl.this.roots.get(this.currentReferrers[i])) != null) {
                    if (this.excludeMap == null) {
                        this.lastReadReferrer = i;
                        Path path = new Path(this.currentReferrers[i], this.currentPath);
                        this.referringThreads = null;
                        this.state = 2;
                        this.nextState = 3;
                        this.foundPath = path2Int(path);
                        return getNextShortestPath();
                    } else if (!refersOnlyThroughExcluded(this.currentReferrers[i], this.currentId)) {
                        this.lastReadReferrer = i;
                        Path path2 = new Path(this.currentReferrers[i], this.currentPath);
                        this.referringThreads = null;
                        this.state = 2;
                        this.nextState = 3;
                        this.foundPath = path2Int(path2);
                        return getNextShortestPath();
                    }
                }
                i++;
            }
            for (int i2 : this.currentReferrers) {
                if (i2 >= 0 && !this.visited.get(i2) && !SnapshotImpl.this.roots.containsKey(i2)) {
                    if (this.excludeMap == null) {
                        this.fifo.add(new Path(i2, this.currentPath));
                        this.visited.set(i2);
                    } else if (!refersOnlyThroughExcluded(i2, this.currentId)) {
                        this.fifo.add(new Path(i2, this.currentPath));
                        this.visited.set(i2);
                    }
                }
            }
            return null;
        }

        private boolean refersOnlyThroughExcluded(int i, int i2) throws SnapshotException {
            if (!this.excludeInstances.get(i)) {
                return false;
            }
            IObject object = SnapshotImpl.this.getObject(i);
            Set set = (Set) this.excludeMap.get(object.getClazz());
            if (set == null) {
                return true;
            }
            long mapIdToAddress = SnapshotImpl.this.mapIdToAddress(i2);
            for (NamedReference namedReference : object.getOutboundReferences()) {
                if (mapIdToAddress == namedReference.getObjectAddress() && !set.contains(namedReference.getName())) {
                    return false;
                }
            }
            return true;
        }

        public PathsFromGCRootsComputerImpl(int i, Map<IClass, Set<String>> map) throws SnapshotException {
            this.objectId = i;
            this.excludeMap = map;
            this.inboundIndex = SnapshotImpl.this.indexManager.inbound();
            if (map != null) {
                initExcludeInstances();
            }
            this.currentId = i;
            this.visited.set(i);
            if (SnapshotImpl.this.roots.get(i) == null) {
                this.fifo.add(new Path(i, null));
            }
        }
    }

    private boolean isDominatorTreeCalculated() {
        return this.dominatorTreeCalculated;
    }

    public final IObjectReader getHeapObjectReader() {
        return this.heapObjectReader;
    }

    public final IndexManager getIndexManager() {
        return this.indexManager;
    }

    public final RetainedSizeCache getRetainedSizeCache() {
        return this.retainedSizeCache;
    }

    public final HashMapIntObject<HashMapIntObject<XGCRootInfo[]>> getRootsPerThread() {
        return this.rootsPerThread;
    }

    public final XSnapshotInfo getSnapshotInfo() {
        return this.snapshotInfo;
    }

    public final int[] getGCRoots() throws SnapshotException {
        return this.roots.getAllKeys();
    }

    public final void dispose() {
        try {
            this.heapObjectReader.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        try {
            this.indexManager.close();
        } catch (IOException e2) {
            e = e2;
        }
        this.retainedSizeCache.close();
        if (e != null) {
            throw new RuntimeException(e);
        }
    }

    public final Collection<IClass> getClasses() throws SnapshotException {
        return Arrays.asList(this.classCache.getAllValues(new IClass[this.classCache.size()]));
    }

    private void calculateLoaderLabels() throws SnapshotException {
        int[] objectIds;
        String str;
        String str2;
        this.loaderLabels = new HashMapIntObject<>();
        int reverse = this.indexManager.o2address().reverse(0);
        Object[] allValues = this.classCache.getAllValues();
        long j = 0;
        for (Object obj : allValues) {
            ClassImpl classImpl = (ClassImpl) obj;
            j += classImpl.getTotalSize();
            int classLoaderId = classImpl.getClassLoaderId();
            if (((String) this.loaderLabels.get(classLoaderId)) == null) {
                if (classLoaderId == reverse) {
                    str2 = "<system class loader>";
                } else {
                    str2 = getObject(classLoaderId).getClassSpecificName();
                    if (str2 == null) {
                        str2 = "__none__";
                    }
                }
                this.loaderLabels.put(classLoaderId, str2);
            }
        }
        Collection<IClass> classesByName = getClassesByName("java.lang.ClassLoader", true);
        if (classesByName != null) {
            for (IClass objectIds2 : classesByName) {
                for (int i : objectIds2.getObjectIds()) {
                    if (((String) this.loaderLabels.get(i)) == null) {
                        if (i == reverse) {
                            str = "<system class loader>";
                        } else {
                            str = getObject(i).getClassSpecificName();
                            if (str == null) {
                                str = "__none__";
                            }
                        }
                        this.loaderLabels.put(i, str);
                    }
                }
            }
        }
        this.snapshotInfo.setUsedHeapSize(j);
        this.snapshotInfo.setNumberOfObjects(this.indexManager.idx.size());
        this.snapshotInfo.setNumberOfClassLoaders(this.loaderLabels.size());
        this.snapshotInfo.setNumberOfGCRoots(this.roots.size());
        this.snapshotInfo.setNumberOfClasses(this.classCache.size());
        this.objectCache.clear();
    }

    public final <A> A getSnapshotAddons(Class<A> cls) throws SnapshotException {
        return this.heapObjectReader.getAddon(cls);
    }

    public final boolean isClass(int i) {
        return this.classCache.containsKey(i);
    }

    public final boolean isClassLoader(int i) {
        return this.loaderLabels.containsKey(i);
    }

    public final boolean isGCRoot(int i) {
        return this.roots.containsKey(i);
    }

    public final String getClassLoaderLabel(int i) {
        return (String) this.loaderLabels.get(i);
    }

    public final GCRootInfo[] getGCRootInfo(int i) throws SnapshotException {
        return (GCRootInfo[]) this.roots.get(i);
    }

    public final int[] getInboundRefererIds(int i) throws SnapshotException {
        return this.indexManager.inbound().get(i);
    }

    public final int[] getOutboundReferentIds(int i) throws SnapshotException {
        return this.indexManager.outbound().get(i);
    }

    public final long mapIdToAddress(int i) throws SnapshotException {
        return this.indexManager.o2address().get(i);
    }

    public final IClass getClassOf(int i) throws SnapshotException {
        if (isClass(i)) {
            return getObject(i).getClazz();
        }
        return (IClass) getObject(this.indexManager.o2class().get(i));
    }

    public final int[] getImmediateDominatedIds(int i) throws SnapshotException {
        if (isDominatorTreeCalculated()) {
            return this.indexManager.dominated().get(i + 1);
        }
        throw new SnapshotException(Messages.SnapshotImpl_Error_DomTreeNotAvailable);
    }

    public final int getImmediateDominatorId(int i) throws SnapshotException {
        if (isDominatorTreeCalculated()) {
            return this.indexManager.dominator().get(i) - 2;
        }
        throw new SnapshotException(Messages.SnapshotImpl_Error_DomTreeNotAvailable);
    }

    public final IObject getObject(int i) throws SnapshotException {
        IObject iObject = (IObject) this.classCache.get(i);
        if (iObject != null) {
            return iObject;
        }
        return (IObject) this.objectCache.get(i);
    }

    public final long getRetainedHeapSize(int i) throws SnapshotException {
        if (isDominatorTreeCalculated()) {
            return this.indexManager.o2retained().get(i);
        }
        return 0;
    }

    public final IThreadStack getThreadStack(int i) throws SnapshotException {
        if (!this.parsedThreads) {
            this.threadId2stack = ThreadStackHelper.loadThreadsData(this);
            this.parsedThreads = true;
        }
        if (this.threadId2stack != null) {
            return (IThreadStack) this.threadId2stack.get(i);
        }
        return null;
    }

    private int[] getSingleObjectRetainedSet(int i) throws SnapshotException {
        ArrayIntBig arrayIntBig = new ArrayIntBig();
        IntStack intStack = new IntStack();
        intStack.push(i);
        while (intStack.size() > 0) {
            int pop = intStack.pop();
            arrayIntBig.add(pop);
            for (int push : getImmediateDominatedIds(pop)) {
                intStack.push(push);
            }
        }
        return arrayIntBig.toArray();
    }

    public final void calculateDominatorTree(IProgressListener iProgressListener) throws SnapshotException, OperationCanceledException {
        boolean z;
        try {
            DominatorTree.calculate(this, iProgressListener);
            if (this.indexManager.dominated() == null || this.indexManager.o2retained() == null || this.indexManager.dominator() == null) {
                z = false;
            } else {
                z = true;
            }
            this.dominatorTreeCalculated = z;
        } catch (IOException e) {
            throw new SnapshotException((Throwable) e);
        }
    }

    public final int getHeapSize(int i) throws SnapshotException {
        if (this.arrayObjects.get(i)) {
            return this.indexManager.a2size().get(i);
        }
        IClass iClass = (IClass) this.classCache.get(i);
        if (iClass != null) {
            return iClass.getUsedHeapSize();
        }
        return ((IClass) this.classCache.get(this.indexManager.o2class().get(i))).getHeapSizePerInstance();
    }

    public final boolean isArray(int i) {
        if (!this.arrayObjects.get(i) || !((IClass) this.classCache.get(this.indexManager.o2class().get(i))).isArrayType()) {
            return false;
        }
        return true;
    }

    public final int mapAddressToId(long j) throws SnapshotException {
        int reverse = this.indexManager.o2address().reverse(j);
        if (reverse >= 0) {
            return reverse;
        }
        String str = Messages.SnapshotImpl_Error_ObjectNotFound;
        StringBuilder sb = new StringBuilder("0x");
        sb.append(Long.toHexString(j));
        throw new SnapshotException(MessageUtil.format(str, sb.toString()));
    }

    public final List<IClass> resolveClassHierarchy(int i) {
        IClass iClass = (IClass) this.classCache.get(i);
        if (iClass == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(iClass);
        while (iClass.hasSuperClass()) {
            iClass = (IClass) this.classCache.get(iClass.getSuperClassId());
            if (iClass == null) {
                return null;
            }
            arrayList.add(iClass);
        }
        return arrayList;
    }

    public final long getHeapSize(int[] iArr) throws UnsupportedOperationException, SnapshotException {
        int i;
        IOne2OneIndex o2class = this.indexManager.o2class();
        IOne2OneIndex a2size = this.indexManager.a2size();
        long j = 0;
        for (int i2 : iArr) {
            if (this.arrayObjects.get(i2)) {
                i = a2size.get(i2);
            } else {
                IClass iClass = (IClass) this.classCache.get(i2);
                if (iClass != null) {
                    i = iClass.getUsedHeapSize();
                } else {
                    i = ((IClass) this.classCache.get(o2class.get(i2))).getHeapSizePerInstance();
                }
            }
            j += (long) i;
        }
        return j;
    }

    public final IMultiplePathsFromGCRootsComputer getMultiplePathsFromGCRoots(int[] iArr, Map<IClass, Set<String>> map) throws SnapshotException {
        return new MultiplePathsFromGCRootsComputerImpl(iArr, map, this);
    }

    public final IPathsFromGCRootsComputer getPathsFromGCRoots(int i, Map<IClass, Set<String>> map) throws SnapshotException {
        return new PathsFromGCRootsComputerImpl(i, map);
    }

    public final int[] getRetainedSet(int[] iArr, IProgressListener iProgressListener) throws SnapshotException {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors > 1) {
            return getRetainedSetMultiThreaded(iArr, availableProcessors, iProgressListener);
        }
        return getRetainedSetSingleThreaded(iArr, iProgressListener);
    }

    public final void setClassLoaderLabel(int i, String str) {
        if (str == null) {
            throw new NullPointerException(Messages.SnapshotImpl_Label);
        } else if (((String) this.loaderLabels.put(i, str)) == null) {
            throw new RuntimeException(Messages.SnapshotImpl_Error_ReplacingNonExistentClassLoader);
        }
    }

    public final Collection<IClass> getClassesByName(String str, boolean z) throws SnapshotException {
        List<IClass> list = (List) this.classCacheByName.get(str);
        if (list == null) {
            return null;
        }
        if (!z) {
            return Collections.unmodifiableCollection(list);
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(list);
        for (IClass allSubclasses : list) {
            hashSet.addAll(allSubclasses.getAllSubclasses());
        }
        return hashSet;
    }

    public final long getMinRetainedSize(int[] iArr, IProgressListener iProgressListener) throws UnsupportedOperationException, SnapshotException {
        if (iArr.length == 1) {
            return getRetainedHeapSize(iArr[0]);
        }
        long j = 0;
        if (iArr.length == 0) {
            return 0;
        }
        for (int retainedHeapSize : getTopAncestorsInDominatorTree(iArr, iProgressListener)) {
            j += getRetainedHeapSize(retainedHeapSize);
        }
        return j;
    }

    public final Collection<IClass> getClassesByName(Pattern pattern, boolean z) throws SnapshotException {
        HashSet hashSet = new HashSet();
        Object[] allValues = this.classCache.getAllValues();
        for (Object obj : allValues) {
            IClass iClass = (IClass) obj;
            if (pattern.matcher(iClass.getName()).matches()) {
                hashSet.add(iClass);
                if (z) {
                    hashSet.addAll(iClass.getAllSubclasses());
                }
            }
        }
        return hashSet;
    }

    public final int[] getInboundRefererIds(int[] iArr, IProgressListener iProgressListener) throws SnapshotException {
        if (iProgressListener == null) {
            iProgressListener = new VoidProgressListener();
        }
        IOne2ManyIndex inbound = this.indexManager.inbound();
        SetInt setInt = new SetInt();
        iProgressListener.beginTask(Messages.SnapshotImpl_ReadingInboundReferrers, iArr.length / 100);
        for (int i = 0; i < iArr.length; i++) {
            for (int add : inbound.get(iArr[i])) {
                setInt.add(add);
            }
            if (i % 100 == 0) {
                if (iProgressListener.isCanceled()) {
                    return null;
                }
                iProgressListener.worked(1);
            }
        }
        int[] array = setInt.toArray();
        iProgressListener.done();
        return array;
    }

    public final int[] getOutboundReferentIds(int[] iArr, IProgressListener iProgressListener) throws SnapshotException {
        if (iProgressListener == null) {
            iProgressListener = new VoidProgressListener();
        }
        IOne2ManyIndex outbound = this.indexManager.outbound();
        SetInt setInt = new SetInt();
        iProgressListener.beginTask(Messages.SnapshotImpl_ReadingOutboundReferrers, iArr.length / 100);
        for (int i = 0; i < iArr.length; i++) {
            for (int add : outbound.get(iArr[i])) {
                setInt.add(add);
            }
            if (i % 100 == 0) {
                if (iProgressListener.isCanceled()) {
                    return null;
                }
                iProgressListener.worked(1);
            }
        }
        int[] array = setInt.toArray();
        iProgressListener.done();
        return array;
    }

    /* access modifiers changed from: 0000 */
    public final int[] getRetainedSetSingleThreaded(int[] iArr, IProgressListener iProgressListener) throws SnapshotException {
        if (iArr.length == 0) {
            return new int[0];
        }
        if (iArr.length == 1) {
            return getSingleObjectRetainedSet(iArr[0]);
        }
        int numberOfObjects = this.snapshotInfo.getNumberOfObjects();
        if (iProgressListener == null) {
            iProgressListener = new VoidProgressListener();
        }
        boolean[] zArr = new boolean[numberOfObjects];
        for (int i : iArr) {
            zArr[i] = true;
        }
        try {
            int[] iArr2 = new int[(numberOfObjects - new ObjectMarker(this.roots.getAllKeys(), zArr, this.indexManager.outbound(), iProgressListener).markSingleThreaded())];
            for (int i2 : iArr) {
                zArr[i2] = false;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < numberOfObjects; i4++) {
                if (!zArr[i4]) {
                    int i5 = i3 + 1;
                    iArr2[i3] = i4;
                    i3 = i5;
                }
            }
            return iArr2;
        } catch (OperationCanceledException unused) {
            return null;
        }
    }

    private int[] getTopAncestorsWithBooleanCache(int[] iArr, IProgressListener iProgressListener) {
        int i;
        boolean z;
        int[] iArr2 = iArr;
        boolean[] zArr = new boolean[this.snapshotInfo.getNumberOfObjects()];
        boolean[] zArr2 = new boolean[this.snapshotInfo.getNumberOfObjects()];
        int length = iArr2.length;
        int i2 = 0;
        while (true) {
            i = 1;
            if (i2 >= length) {
                break;
            }
            zArr2[iArr2[i2]] = true;
            i2++;
        }
        ArrayInt arrayInt = new ArrayInt();
        int[] iArr3 = new int[VideoPreloadSizeExperiment.DEFAULT];
        IOne2OneIndex dominator = this.indexManager.dominator();
        int length2 = iArr2.length;
        int[] iArr4 = iArr3;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = VideoPreloadSizeExperiment.DEFAULT;
        while (i3 < length2) {
            int i7 = iArr2[i3];
            i4 += i;
            if ((65535 & i4) != 0 || !iProgressListener.isCanceled()) {
                int i8 = dominator.get(i7) - 2;
                while (true) {
                    if (i8 >= 0) {
                        if (i5 == i6) {
                            int i9 = i6 << 1;
                            int[] iArr5 = new int[i9];
                            System.arraycopy(iArr4, 0, iArr5, 0, i6);
                            iArr4 = iArr5;
                            i6 = i9;
                        }
                        int i10 = i5 + 1;
                        iArr4[i5] = i8;
                        if (!zArr2[i8]) {
                            if (zArr[i8]) {
                                i5 = i10;
                                break;
                            }
                            i8 = dominator.get(i8) - 2;
                            i5 = i10;
                        } else {
                            i5 = i10;
                            while (i5 > 0) {
                                i5--;
                                zArr2[iArr4[i5]] = true;
                            }
                            z = false;
                        }
                    } else {
                        break;
                    }
                }
                z = true;
                if (z) {
                    arrayInt.add(i7);
                    while (i5 > 0) {
                        i5--;
                        zArr[iArr4[i5]] = true;
                    }
                }
                i = 1;
                i3++;
            } else {
                throw new OperationCanceledException();
            }
        }
        return arrayInt.toArray();
    }

    public final int[] getTopAncestorsInDominatorTree(int[] iArr, IProgressListener iProgressListener) throws SnapshotException {
        IProgressListener iProgressListener2;
        boolean z;
        int[] iArr2 = iArr;
        if (isDominatorTreeCalculated()) {
            if (iProgressListener == null) {
                iProgressListener2 = new VoidProgressListener();
            } else {
                iProgressListener2 = iProgressListener;
            }
            if (iArr2.length > 1000000) {
                return getTopAncestorsWithBooleanCache(iArr2, iProgressListener2);
            }
            SetInt setInt = new SetInt(iArr2.length);
            SetInt setInt2 = new SetInt(iArr2.length * 2);
            for (int add : iArr2) {
                setInt2.add(add);
            }
            ArrayInt arrayInt = new ArrayInt();
            int[] iArr3 = new int[VideoPreloadSizeExperiment.DEFAULT];
            IOne2OneIndex dominator = this.indexManager.dominator();
            int length = iArr2.length;
            int[] iArr4 = iArr3;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = VideoPreloadSizeExperiment.DEFAULT;
            while (i < length) {
                int i5 = iArr2[i];
                i2++;
                if ((i2 & 65535) != 0 || !iProgressListener2.isCanceled()) {
                    int[] iArr5 = iArr4;
                    int i6 = dominator.get(i5) - 2;
                    while (true) {
                        if (i6 >= 0) {
                            if (i3 == i4) {
                                int i7 = i4 << 1;
                                int[] iArr6 = new int[i7];
                                System.arraycopy(iArr5, 0, iArr6, 0, i4);
                                i4 = i7;
                                iArr5 = iArr6;
                            }
                            int i8 = i3 + 1;
                            iArr5[i3] = i6;
                            if (!setInt2.contains(i6)) {
                                if (setInt.contains(i6)) {
                                    i3 = i8;
                                    break;
                                }
                                i6 = dominator.get(i6) - 2;
                                i3 = i8;
                                int[] iArr7 = iArr;
                            } else {
                                i3 = i8;
                                while (i3 > 0) {
                                    i3--;
                                    setInt2.add(iArr5[i3]);
                                }
                                iArr4 = iArr5;
                                z = false;
                            }
                        } else {
                            break;
                        }
                    }
                    iArr4 = iArr5;
                    z = true;
                    if (z) {
                        arrayInt.add(i5);
                        while (i3 > 0) {
                            i3--;
                            setInt.add(iArr4[i3]);
                        }
                    }
                    i++;
                    iArr2 = iArr;
                } else {
                    throw new OperationCanceledException();
                }
            }
            return arrayInt.toArray();
        }
        throw new SnapshotException(Messages.SnapshotImpl_Error_DomTreeNotAvailable);
    }

    public final int[] getMinRetainedSet(int[] iArr, IProgressListener iProgressListener) throws UnsupportedOperationException, SnapshotException {
        int i;
        boolean z;
        int i2;
        int[] iArr2;
        int i3;
        int[] iArr3 = iArr;
        int i4 = 1;
        if (iArr3.length == 1) {
            return getSingleObjectRetainedSet(iArr3[0]);
        }
        SetInt setInt = new SetInt(iArr3.length * 2);
        for (int add : iArr3) {
            setInt.add(add);
        }
        SetInt setInt2 = new SetInt(iArr3.length * 2);
        int[] iArr4 = new int[VideoPreloadSizeExperiment.DEFAULT];
        IOne2OneIndex dominator = this.indexManager.dominator();
        IOne2ManyIndex dominated = this.indexManager.dominated();
        int[] iArr5 = new int[VideoPreloadSizeExperiment.DEFAULT];
        int length = iArr3.length;
        int[] iArr6 = iArr4;
        int[] iArr7 = iArr5;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = VideoPreloadSizeExperiment.DEFAULT;
        int i9 = 0;
        int i10 = VideoPreloadSizeExperiment.DEFAULT;
        while (i5 < length) {
            int i11 = iArr3[i5];
            i6 += i4;
            if ((i6 & 65535) != 0 || !iProgressListener.isCanceled()) {
                int[] iArr8 = iArr6;
                int i12 = i8;
                int i13 = i7;
                int i14 = dominator.get(i11) - 2;
                while (true) {
                    if (i14 >= 0) {
                        if (i13 == i12) {
                            int i15 = i12 << 1;
                            int[] iArr9 = new int[i15];
                            int i16 = i15;
                            System.arraycopy(iArr8, 0, iArr9, 0, i12);
                            iArr8 = iArr9;
                            i12 = i16;
                        }
                        int i17 = i13 + 1;
                        iArr8[i13] = i14;
                        if (!setInt.contains(i14)) {
                            if (setInt2.contains(i14)) {
                                i13 = i17;
                                break;
                            }
                            i14 = dominator.get(i14) - 2;
                            i13 = i17;
                            int[] iArr10 = iArr;
                        } else {
                            i13 = i17;
                            i = i12;
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i = i12;
                z = true;
                iArr6 = iArr8;
                if (z) {
                    while (i13 > 0) {
                        i13--;
                        setInt2.add(iArr6[i13]);
                    }
                    int i18 = i9 + 1;
                    iArr7[i9] = i11;
                    while (i18 > 0) {
                        int i19 = i18 - 1;
                        int i20 = iArr7[i19];
                        setInt.add(i20);
                        int[] iArr11 = dominated.get(i20 + 1);
                        int length2 = iArr11.length;
                        int i21 = i19;
                        int[] iArr12 = iArr7;
                        int i22 = i10;
                        int i23 = 0;
                        while (i23 < length2) {
                            int i24 = iArr11[i23];
                            if (i21 == i22) {
                                i3 = i;
                                int i25 = i22 << 1;
                                iArr2 = iArr11;
                                int[] iArr13 = new int[i25];
                                int i26 = i25;
                                System.arraycopy(iArr12, 0, iArr13, 0, i22);
                                iArr12 = iArr13;
                                i22 = i26;
                            } else {
                                i3 = i;
                                iArr2 = iArr11;
                            }
                            int i27 = i21 + 1;
                            iArr12[i21] = i24;
                            i23++;
                            i21 = i27;
                            i = i3;
                            iArr11 = iArr2;
                        }
                        int i28 = i;
                        i18 = i21;
                        i10 = i22;
                        iArr7 = iArr12;
                    }
                    i2 = i;
                    i9 = i18;
                } else {
                    i2 = i;
                }
                i7 = i13;
                i5++;
                i8 = i2;
                iArr3 = iArr;
                i4 = 1;
            } else {
                throw new OperationCanceledException();
            }
        }
        return setInt.toArray();
    }

    private int[] getRetainedSetMultiThreaded(int[] iArr, int i, IProgressListener iProgressListener) throws SnapshotException {
        if (iArr.length == 0) {
            return new int[0];
        }
        if (iArr.length == 1) {
            return getSingleObjectRetainedSet(iArr[0]);
        }
        int numberOfObjects = this.snapshotInfo.getNumberOfObjects();
        if (iProgressListener == null) {
            iProgressListener = new VoidProgressListener();
        }
        boolean[] zArr = new boolean[numberOfObjects];
        for (int i2 : iArr) {
            zArr[i2] = true;
        }
        try {
            new ObjectMarker(this.roots.getAllKeys(), zArr, this.indexManager.outbound(), iProgressListener).markMultiThreaded(i);
            for (int i3 : iArr) {
                zArr[i3] = false;
            }
            ArrayIntBig arrayIntBig = new ArrayIntBig();
            for (int i4 = 0; i4 < numberOfObjects; i4++) {
                if (!zArr[i4]) {
                    arrayIntBig.add(i4);
                }
            }
            return arrayIntBig.toArray();
        } catch (InterruptedException e) {
            throw new SnapshotException((Throwable) e);
        }
    }

    public final int[] getRetainedSet(int[] iArr, String[] strArr, IProgressListener iProgressListener) throws SnapshotException {
        if (iArr.length == 0) {
            return new int[0];
        }
        int size = this.indexManager.o2address().size();
        if (iProgressListener == null) {
            iProgressListener = new VoidProgressListener();
        }
        BitField bitField = new BitField(size);
        for (int i : iArr) {
            bitField.set(i);
        }
        if (iProgressListener.isCanceled()) {
            return null;
        }
        BitField bitField2 = new BitField(size);
        int[] iArr2 = new int[(size - dfs2(bitField2, bitField, strArr))];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (!bitField2.get(i3)) {
                int i4 = i2 + 1;
                iArr2[i2] = i3;
                i2 = i4;
            }
        }
        return iArr2;
    }

    private int dfs2(BitField bitField, BitField bitField2, String[] strArr) throws SnapshotException {
        int i;
        int[] iArr;
        int[] iArr2;
        BitField bitField3 = bitField;
        String[] strArr2 = strArr;
        HashSet hashSet = new HashSet(strArr2.length);
        for (String add : strArr2) {
            hashSet.add(add);
        }
        IOne2ManyIndex outbound = this.indexManager.outbound();
        IntStack intStack = new IntStack();
        IteratorInt keys = this.roots.keys();
        int i2 = 0;
        while (keys.hasNext()) {
            int next = keys.next();
            intStack.push(next);
            bitField3.set(next);
            i2 = i + 1;
        }
        while (intStack.size() > 0) {
            int pop = intStack.pop();
            if (bitField2.get(pop)) {
                int i3 = i;
                for (int i4 : outbound.get(pop)) {
                    IObject object = getObject(pop);
                    long mapIdToAddress = mapIdToAddress(i4);
                    for (NamedReference namedReference : object.getOutboundReferences()) {
                        if (!bitField3.get(i4) && namedReference.getObjectAddress() == mapIdToAddress && !hashSet.contains(namedReference.getName())) {
                            intStack.push(i4);
                            bitField3.set(i4);
                            i3++;
                        }
                    }
                }
                i = i3;
            } else {
                int i5 = i;
                for (int i6 : outbound.get(pop)) {
                    if (!bitField3.get(i6)) {
                        intStack.push(i6);
                        bitField3.set(i6);
                        i5++;
                    }
                }
                i = i5;
            }
        }
        return i;
    }

    public final int[] getRetainedSet(int[] iArr, ExcludedReferencesDescriptor[] excludedReferencesDescriptorArr, IProgressListener iProgressListener) throws SnapshotException {
        boolean[] zArr = new boolean[getSnapshotInfo().getNumberOfObjects()];
        for (int i : iArr) {
            zArr[i] = true;
        }
        new ObjectMarker(getGCRoots(), zArr, getIndexManager().outbound, new VoidProgressListener()).markSingleThreaded(excludedReferencesDescriptorArr, this);
        for (int i2 : iArr) {
            zArr[i2] = false;
        }
        boolean[] zArr2 = new boolean[zArr.length];
        System.arraycopy(zArr, 0, zArr2, 0, zArr.length);
        new ObjectMarker(iArr, zArr2, getIndexManager().outbound, new VoidProgressListener()).markSingleThreaded();
        int numberOfObjects = getSnapshotInfo().getNumberOfObjects();
        ArrayIntBig arrayIntBig = new ArrayIntBig();
        for (int i3 = 0; i3 < numberOfObjects; i3++) {
            if (!zArr[i3] && zArr2[i3]) {
                arrayIntBig.add(i3);
            }
        }
        return arrayIntBig.toArray();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.eclipse.mat.parser.internal.SnapshotImpl readFromFile(java.io.File r16, java.lang.String r17, org.eclipse.mat.util.IProgressListener r18) throws org.eclipse.mat.SnapshotException, java.io.IOException {
        /*
            r0 = r17
            r1 = r18
            java.lang.String r2 = org.eclipse.mat.parser.internal.Messages.SnapshotImpl_ReopeningParsedHeapDumpFile
            r3 = 9
            r1.beginTask(r2, r3)
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ ClassNotFoundException -> 0x0102, ClassCastException -> 0x00f4 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0102, ClassCastException -> 0x00f4 }
            r4.<init>()     // Catch:{ ClassNotFoundException -> 0x0102, ClassCastException -> 0x00f4 }
            r4.append(r0)     // Catch:{ ClassNotFoundException -> 0x0102, ClassCastException -> 0x00f4 }
            java.lang.String r5 = "index"
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x0102, ClassCastException -> 0x00f4 }
            java.lang.String r4 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x0102, ClassCastException -> 0x00f4 }
            r3.<init>(r4)     // Catch:{ ClassNotFoundException -> 0x0102, ClassCastException -> 0x00f4 }
            r2 = 1
            r1.worked(r2)     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r5.<init>(r3)     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r4.<init>(r5)     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            java.lang.String r5 = r4.readUTF()     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            java.lang.String r6 = "MAT_01"
            boolean r6 = r6.equals(r5)     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            if (r6 == 0) goto L_0x00d8
            java.lang.String r5 = r4.readUTF()     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            org.eclipse.mat.parser.internal.util.ParserRegistry$Parser r6 = org.eclipse.mat.parser.internal.util.ParserRegistry.lookupParser(r5)     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            if (r6 == 0) goto L_0x00c1
            r1.worked(r2)     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            org.eclipse.mat.parser.IObjectReader r9 = r6.getObjectReader()     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            java.lang.Object r5 = r4.readObject()     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r8 = r5
            org.eclipse.mat.parser.model.XSnapshotInfo r8 = (org.eclipse.mat.parser.model.XSnapshotInfo) r8     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            java.lang.String r5 = "$heapFormat"
            java.lang.String r6 = r6.getId()     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r8.setProperty(r5, r6)     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            java.lang.Object r5 = r4.readObject()     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r10 = r5
            org.eclipse.mat.collect.HashMapIntObject r10 = (org.eclipse.mat.collect.HashMapIntObject) r10     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            boolean r5 = r18.isCanceled()     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            if (r5 != 0) goto L_0x00bb
            java.lang.Object r5 = r4.readObject()     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r11 = r5
            org.eclipse.mat.collect.HashMapIntObject r11 = (org.eclipse.mat.collect.HashMapIntObject) r11     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            java.lang.Object r5 = r4.readObject()     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r12 = r5
            org.eclipse.mat.collect.HashMapIntObject r12 = (org.eclipse.mat.collect.HashMapIntObject) r12     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r1.worked(r2)     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            boolean r2 = r18.isCanceled()     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            if (r2 != 0) goto L_0x00b5
            java.lang.Object r2 = r4.readObject()     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r13 = r2
            org.eclipse.mat.collect.HashMapIntObject r13 = (org.eclipse.mat.collect.HashMapIntObject) r13     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            java.lang.Object r2 = r4.readObject()     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r14 = r2
            org.eclipse.mat.collect.BitField r14 = (org.eclipse.mat.collect.BitField) r14     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r2 = 3
            r1.worked(r2)     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r8.setPrefix(r0)     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            java.lang.String r4 = r16.getAbsolutePath()     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r8.setPath(r4)     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            org.eclipse.mat.parser.index.IndexManager r15 = new org.eclipse.mat.parser.index.IndexManager     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r15.<init>()     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r15.init(r0)     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            org.eclipse.mat.parser.internal.SnapshotImpl r0 = new org.eclipse.mat.parser.internal.SnapshotImpl     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r1.worked(r2)     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r3.close()
            r18.done()
            return r0
        L_0x00b5:
            org.eclipse.mat.util.IProgressListener$OperationCanceledException r0 = new org.eclipse.mat.util.IProgressListener$OperationCanceledException     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r0.<init>()     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
        L_0x00bb:
            org.eclipse.mat.util.IProgressListener$OperationCanceledException r0 = new org.eclipse.mat.util.IProgressListener$OperationCanceledException     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r0.<init>()     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
        L_0x00c1:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r2.<init>()     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            java.lang.String r4 = org.eclipse.mat.parser.internal.Messages.SnapshotImpl_Error_ParserNotFound     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r2.append(r4)     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r2.append(r5)     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            java.lang.String r2 = r2.toString()     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r0.<init>(r2)     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
        L_0x00d8:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            java.lang.String r4 = org.eclipse.mat.parser.internal.Messages.SnapshotImpl_Error_UnknownVersion     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r6 = 0
            r2[r6] = r5     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            java.lang.String r2 = org.eclipse.mat.util.MessageUtil.format(r4, r2)     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            r0.<init>(r2)     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x00ee, ClassCastException -> 0x00eb, all -> 0x00e9 }
        L_0x00e9:
            r0 = move-exception
            goto L_0x0110
        L_0x00eb:
            r0 = move-exception
            r2 = r3
            goto L_0x00f5
        L_0x00ee:
            r0 = move-exception
            r2 = r3
            goto L_0x0103
        L_0x00f1:
            r0 = move-exception
            r3 = r2
            goto L_0x0110
        L_0x00f4:
            r0 = move-exception
        L_0x00f5:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x00f1 }
            java.lang.String r4 = r0.getMessage()     // Catch:{ all -> 0x00f1 }
            r3.<init>(r4)     // Catch:{ all -> 0x00f1 }
            r3.initCause(r0)     // Catch:{ all -> 0x00f1 }
            throw r3     // Catch:{ all -> 0x00f1 }
        L_0x0102:
            r0 = move-exception
        L_0x0103:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x00f1 }
            java.lang.String r4 = r0.getMessage()     // Catch:{ all -> 0x00f1 }
            r3.<init>(r4)     // Catch:{ all -> 0x00f1 }
            r3.initCause(r0)     // Catch:{ all -> 0x00f1 }
            throw r3     // Catch:{ all -> 0x00f1 }
        L_0x0110:
            if (r3 == 0) goto L_0x0115
            r3.close()
        L_0x0115:
            r18.done()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.mat.parser.internal.SnapshotImpl.readFromFile(java.io.File, java.lang.String, org.eclipse.mat.util.IProgressListener):org.eclipse.mat.parser.internal.SnapshotImpl");
    }

    public final DominatorsSummary getDominatorsOf(int[] iArr, Pattern pattern, IProgressListener iProgressListener) throws SnapshotException {
        IProgressListener iProgressListener2;
        String str;
        int i;
        IClass iClass;
        String str2;
        int i2;
        int[] iArr2 = iArr;
        Pattern pattern2 = pattern;
        if (isDominatorTreeCalculated()) {
            if (iProgressListener == null) {
                iProgressListener2 = new VoidProgressListener();
            } else {
                iProgressListener2 = iProgressListener;
            }
            IOne2OneIndex dominator = this.indexManager.dominator();
            IOne2OneIndex o2class = this.indexManager.o2class();
            SetInt setInt = new SetInt();
            SetInt setInt2 = new SetInt();
            iProgressListener2.beginTask(Messages.SnapshotImpl_RetrievingDominators, iArr2.length / 10);
            HashMap hashMap = new HashMap();
            for (int i3 = 0; i3 < iArr2.length; i3++) {
                int i4 = iArr2[i3];
                int i5 = dominator.get(i4) - 2;
                if (i5 == -1) {
                    str = "<ROOT>";
                    iClass = null;
                    i = -1;
                } else {
                    i = o2class.get(i5);
                    iClass = (IClass) this.classCache.get(i);
                    str = iClass.getName();
                }
                if (pattern2 == null || i5 < 0) {
                    str2 = str;
                } else {
                    int i6 = i5;
                    str2 = str;
                    boolean z = true;
                    while (z) {
                        if (iProgressListener2.isCanceled()) {
                            throw new OperationCanceledException();
                        } else if (setInt.contains(i)) {
                            i6 = dominator.get(i6) - 2;
                            if (i6 == -1) {
                                str2 = "<ROOT>";
                                iClass = null;
                                i = -1;
                            } else {
                                i = o2class.get(i6);
                                iClass = (IClass) this.classCache.get(i);
                                str2 = iClass.getName();
                            }
                        } else {
                            if (!setInt2.contains(i)) {
                                if (!pattern2.matcher(str2).matches() || i6 < 0) {
                                    setInt2.add(i);
                                } else {
                                    setInt.add(i);
                                }
                            }
                            z = false;
                        }
                    }
                    i5 = i6;
                }
                ClassDominatorRecord classDominatorRecord = (ClassDominatorRecord) hashMap.get(iClass);
                if (classDominatorRecord == null) {
                    classDominatorRecord = new ClassDominatorRecord();
                    hashMap.put(iClass, classDominatorRecord);
                    classDominatorRecord.setClassName(str2);
                    classDominatorRecord.setClassId(i);
                    if (i5 == -1 || iClass == null) {
                        i2 = -1;
                    } else {
                        i2 = iClass.getClassLoaderId();
                    }
                    classDominatorRecord.setClassloaderId(i2);
                }
                if (classDominatorRecord.addDominator(i5) && i5 != -1) {
                    classDominatorRecord.addDominatorNetSize((long) getHeapSize(i5));
                }
                if (classDominatorRecord.addDominated(i4)) {
                    classDominatorRecord.addDominatedNetSize((long) getHeapSize(i4));
                }
                if (i3 % 10 == 0) {
                    if (!iProgressListener2.isCanceled()) {
                        iProgressListener2.worked(1);
                    } else {
                        throw new OperationCanceledException();
                    }
                }
            }
            ClassDominatorRecord[] classDominatorRecordArr = (ClassDominatorRecord[]) hashMap.values().toArray(new ClassDominatorRecord[0]);
            iProgressListener2.done();
            return new DominatorsSummary(classDominatorRecordArr, this);
        }
        throw new SnapshotException(Messages.SnapshotImpl_Error_DomTreeNotAvailable);
    }

    private SnapshotImpl(XSnapshotInfo xSnapshotInfo, IObjectReader iObjectReader, HashMapIntObject<ClassImpl> hashMapIntObject, HashMapIntObject<XGCRootInfo[]> hashMapIntObject2, HashMapIntObject<HashMapIntObject<XGCRootInfo[]>> hashMapIntObject3, HashMapIntObject<String> hashMapIntObject4, BitField bitField, IndexManager indexManager2) throws SnapshotException, IOException {
        boolean z;
        this.snapshotInfo = xSnapshotInfo;
        this.heapObjectReader = iObjectReader;
        this.classCache = hashMapIntObject;
        this.roots = hashMapIntObject2;
        this.rootsPerThread = hashMapIntObject3;
        this.loaderLabels = hashMapIntObject4;
        this.arrayObjects = bitField;
        this.indexManager = indexManager2;
        this.retainedSizeCache = new RetainedSizeCache(xSnapshotInfo);
        Iterator values = this.classCache.values();
        while (values.hasNext()) {
            ClassImpl classImpl = (ClassImpl) values.next();
            classImpl.setSnapshot(this);
            List list = (List) this.classCacheByName.get(classImpl.getName());
            if (list == null) {
                Map<String, List<IClass>> map = this.classCacheByName;
                String name = classImpl.getName();
                List arrayList = new ArrayList();
                map.put(name, arrayList);
                list = arrayList;
            }
            list.add(classImpl);
        }
        if (indexManager2.dominated() == null || indexManager2.o2retained() == null || indexManager2.dominator() == null) {
            z = false;
        } else {
            z = true;
        }
        this.dominatorTreeCalculated = z;
        this.objectCache = new HeapObjectCache(1000);
        this.heapObjectReader.open(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.eclipse.mat.parser.internal.SnapshotImpl create(org.eclipse.mat.parser.model.XSnapshotInfo r10, java.lang.String r11, org.eclipse.mat.parser.IObjectReader r12, org.eclipse.mat.collect.HashMapIntObject<org.eclipse.mat.parser.model.ClassImpl> r13, org.eclipse.mat.collect.HashMapIntObject<org.eclipse.mat.parser.model.XGCRootInfo[]> r14, org.eclipse.mat.collect.HashMapIntObject<org.eclipse.mat.collect.HashMapIntObject<org.eclipse.mat.parser.model.XGCRootInfo[]>> r15, org.eclipse.mat.collect.BitField r16, org.eclipse.mat.parser.index.IndexManager r17, org.eclipse.mat.util.IProgressListener r18) throws java.io.IOException, org.eclipse.mat.SnapshotException {
        /*
            org.eclipse.mat.parser.internal.SnapshotImpl r0 = new org.eclipse.mat.parser.internal.SnapshotImpl
            r7 = 0
            r1 = r0
            r2 = r10
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.calculateLoaderLabels()
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x0083 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r3.<init>()     // Catch:{ all -> 0x0083 }
            java.lang.String r4 = r10.getPrefix()     // Catch:{ all -> 0x0083 }
            r3.append(r4)     // Catch:{ all -> 0x0083 }
            java.lang.String r4 = "index"
            r3.append(r4)     // Catch:{ all -> 0x0083 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0083 }
            r2.<init>(r3)     // Catch:{ all -> 0x0083 }
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0080 }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0080 }
            r4.<init>(r2)     // Catch:{ all -> 0x0080 }
            r3.<init>(r4)     // Catch:{ all -> 0x0080 }
            java.lang.String r1 = "MAT_01"
            r3.writeUTF(r1)     // Catch:{ all -> 0x007e }
            r1 = r11
            r3.writeUTF(r11)     // Catch:{ all -> 0x007e }
            org.eclipse.mat.parser.model.XSnapshotInfo r1 = r0.snapshotInfo     // Catch:{ all -> 0x007e }
            r3.writeObject(r1)     // Catch:{ all -> 0x007e }
            org.eclipse.mat.collect.HashMapIntObject<org.eclipse.mat.parser.model.ClassImpl> r1 = r0.classCache     // Catch:{ all -> 0x007e }
            r3.writeObject(r1)     // Catch:{ all -> 0x007e }
            boolean r1 = r18.isCanceled()     // Catch:{ all -> 0x007e }
            if (r1 != 0) goto L_0x0078
            org.eclipse.mat.collect.HashMapIntObject<org.eclipse.mat.parser.model.XGCRootInfo[]> r1 = r0.roots     // Catch:{ all -> 0x007e }
            r3.writeObject(r1)     // Catch:{ all -> 0x007e }
            org.eclipse.mat.collect.HashMapIntObject<org.eclipse.mat.collect.HashMapIntObject<org.eclipse.mat.parser.model.XGCRootInfo[]>> r1 = r0.rootsPerThread     // Catch:{ all -> 0x007e }
            r3.writeObject(r1)     // Catch:{ all -> 0x007e }
            boolean r1 = r18.isCanceled()     // Catch:{ all -> 0x007e }
            if (r1 != 0) goto L_0x0072
            org.eclipse.mat.collect.HashMapIntObject<java.lang.String> r1 = r0.loaderLabels     // Catch:{ all -> 0x007e }
            r3.writeObject(r1)     // Catch:{ all -> 0x007e }
            org.eclipse.mat.collect.BitField r1 = r0.arrayObjects     // Catch:{ all -> 0x007e }
            r3.writeObject(r1)     // Catch:{ all -> 0x007e }
            r3.close()
            r2.close()
            return r0
        L_0x0072:
            org.eclipse.mat.util.IProgressListener$OperationCanceledException r0 = new org.eclipse.mat.util.IProgressListener$OperationCanceledException     // Catch:{ all -> 0x007e }
            r0.<init>()     // Catch:{ all -> 0x007e }
            throw r0     // Catch:{ all -> 0x007e }
        L_0x0078:
            org.eclipse.mat.util.IProgressListener$OperationCanceledException r0 = new org.eclipse.mat.util.IProgressListener$OperationCanceledException     // Catch:{ all -> 0x007e }
            r0.<init>()     // Catch:{ all -> 0x007e }
            throw r0     // Catch:{ all -> 0x007e }
        L_0x007e:
            r0 = move-exception
            goto L_0x0086
        L_0x0080:
            r0 = move-exception
            r3 = r1
            goto L_0x0086
        L_0x0083:
            r0 = move-exception
            r2 = r1
            r3 = r2
        L_0x0086:
            if (r3 == 0) goto L_0x008b
            r3.close()
        L_0x008b:
            if (r2 == 0) goto L_0x0090
            r2.close()
        L_0x0090:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.mat.parser.internal.SnapshotImpl.create(org.eclipse.mat.parser.model.XSnapshotInfo, java.lang.String, org.eclipse.mat.parser.IObjectReader, org.eclipse.mat.collect.HashMapIntObject, org.eclipse.mat.collect.HashMapIntObject, org.eclipse.mat.collect.HashMapIntObject, org.eclipse.mat.collect.BitField, org.eclipse.mat.parser.index.IndexManager, org.eclipse.mat.util.IProgressListener):org.eclipse.mat.parser.internal.SnapshotImpl");
    }
}
