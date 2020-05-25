package com.bytedance.liko.memoryexplorer.analyse;

import com.bytedance.liko.memoryexplorer.MemoryConfig;
import com.bytedance.liko.memoryexplorer.analyse.trace.LeakInfo;
import com.bytedance.liko.memoryexplorer.analyse.trace.LeakTrace;
import com.bytedance.liko.memoryexplorer.analyse.trace.LeakTraceTracker;
import com.bytedance.liko.memoryexplorer.assemble.BigObjectAssembler;
import com.bytedance.liko.memoryexplorer.assemble.IAssembler;
import com.bytedance.liko.memoryexplorer.report.BigObjectReporter;
import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult;
import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult.ObjectRefs;
import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult.ResultBigObjectNode;
import com.bytedance.liko.memoryexplorer.util.Logger;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.eclipse.mat.SnapshotException;
import org.eclipse.mat.parser.model.ClassImpl;
import org.eclipse.mat.snapshot.ISnapshot;
import org.eclipse.mat.snapshot.model.IClass;
import org.eclipse.mat.snapshot.model.IObject;
import org.eclipse.mat.snapshot.model.NamedReference;
import org.eclipse.mat.util.IProgressListener;

public class BigObjectAnalyser implements HprofAnalyser {
    private String[] excludes = {"java.lang.Object[]", "java.lang.ref.FinalizerReference"};
    private List<String> excludesList;
    private final BigObjectAssembler mBigObjectAssembler;
    private MemoryConfig mMemoryConfig;

    public void analysis(ISnapshot iSnapshot, IProgressListener iProgressListener) {
        try {
            Collection classes = iSnapshot.getClasses();
            if (classes != null) {
                if (classes.size() != 0) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = classes.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        IClass iClass = (IClass) it.next();
                        if ((iClass instanceof ClassImpl) && ((!iClass.getName().contains(ClassUtils.INNER_CLASS_SEPARATOR) || (!iClass.getName().startsWith("java") && !iClass.getName().startsWith("android"))) && !iClass.getName().startsWith("org.eclipse.mat"))) {
                            if (!this.mMemoryConfig.bigObjectFilterSystem || (!iClass.getName().startsWith("java.util") && !iClass.getName().endsWith("[]"))) {
                                for (int object : ((ClassImpl) iClass).getObjectIds()) {
                                    IObject object2 = iSnapshot.getObject(object);
                                    if (object2 != null && object2.getRetainedHeapSize() > 1048576 && !this.excludesList.contains(object2.getClazz().getName()) && !object2.getClazz().getName().startsWith("org.eclipse.mat")) {
                                        arrayList.add(object2);
                                    }
                                }
                            }
                        }
                    }
                    Collections.sort(arrayList, new Comparator<IObject>() {
                        public int compare(IObject iObject, IObject iObject2) {
                            return (int) (iObject2.getRetainedHeapSize() - iObject.getRetainedHeapSize());
                        }
                    });
                    int i = 50;
                    if (arrayList.size() <= 50) {
                        i = arrayList.size();
                    }
                    for (IObject iObject : arrayList.subList(0, i)) {
                        ResultBigObjectNode resultBigObjectNode = new ResultBigObjectNode();
                        LeakTrace findMemoryLeak = findMemoryLeak(iSnapshot, iObject, iObject.getClazz().getName());
                        if (findMemoryLeak != null) {
                            if (this.mMemoryConfig.supportBigObjectAnalysis) {
                                Logger.m24776i("start auto BigObjectAnalyser", new Object[0]);
                                findOutboundReferences(resultBigObjectNode.object_refs, iObject, iSnapshot, this.mMemoryConfig.bigObjectLatitude, iObject.getRetainedHeapSize());
                            }
                            this.mBigObjectAssembler.onAssemble(new LeakInfo(findMemoryLeak, resultBigObjectNode));
                        }
                    }
                }
            }
        } catch (Exception unused) {
            System.out.println("BigObjectAnalyser's SnapshotException ");
        }
    }

    public BigObjectAnalyser(MemoryConfig memoryConfig, IAssembler iAssembler, ExplorerAnalysisResult explorerAnalysisResult) {
        this.mMemoryConfig = memoryConfig;
        this.mBigObjectAssembler = new BigObjectAssembler(iAssembler, new BigObjectReporter(explorerAnalysisResult), memoryConfig.packageName);
        this.excludesList = Arrays.asList(this.excludes);
    }

    private LeakTrace findMemoryLeak(ISnapshot iSnapshot, IObject iObject, String str) throws Exception {
        LeakTrace findLeakTrace = new LeakTraceTracker().findLeakTrace(iSnapshot, iObject, this.mMemoryConfig.excludedRefs);
        if (findLeakTrace == null || findLeakTrace.elements.size() <= 1 || str.startsWith("android.graphics") || this.excludesList.contains(str)) {
            return null;
        }
        String format = findLeakTrace.format(false);
        if ((!"byte[]".equals(str) || !format.contains("android.graphics.Bitmap.mBuffer")) && !format.startsWith("org.eclipse.mat") && findLeakTrace != null) {
            return findLeakTrace;
        }
        return null;
    }

    private void findOutboundReferences(List<ObjectRefs> list, IObject iObject, ISnapshot iSnapshot, int i, long j) {
        List<NamedReference> outboundReferences = iObject.getOutboundReferences();
        ArrayList arrayList = new ArrayList();
        for (NamedReference objectId : outboundReferences) {
            try {
                try {
                    IObject object = iSnapshot.getObject(objectId.getObjectId());
                    if (!object.getClazz().getName().contains("dalvik.system")) {
                        arrayList.add(object);
                    }
                } catch (SnapshotException e) {
                    e = e;
                    Logger.m24776i("findOutOutboundReferences SnapshotException:%s", e.toString());
                }
            } catch (SnapshotException e2) {
                e = e2;
                ISnapshot iSnapshot2 = iSnapshot;
                Logger.m24776i("findOutOutboundReferences SnapshotException:%s", e.toString());
            }
        }
        ISnapshot iSnapshot3 = iSnapshot;
        arrayList.sort(new Comparator<IObject>() {
            public int compare(IObject iObject, IObject iObject2) {
                return (int) (iObject2.getRetainedHeapSize() - iObject.getRetainedHeapSize());
            }
        });
        int i2 = 3;
        if (arrayList.size() <= 3) {
            i2 = arrayList.size();
        }
        List<IObject> subList = arrayList.subList(0, i2);
        if (i > 0) {
            for (IObject iObject2 : subList) {
                ObjectRefs objectRefs = new ObjectRefs();
                objectRefs.ref_class = iObject2.getTechnicalName();
                objectRefs.retained_heap_size = (double) iObject2.getRetainedHeapSize();
                if (objectRefs.retained_heap_size > ((double) (j / 20))) {
                    List<ObjectRefs> list2 = list;
                    list.add(objectRefs);
                    findOutboundReferences(objectRefs.object_refs, iObject2, iSnapshot, i - 1, j);
                } else {
                    List<ObjectRefs> list3 = list;
                }
            }
        }
    }
}
