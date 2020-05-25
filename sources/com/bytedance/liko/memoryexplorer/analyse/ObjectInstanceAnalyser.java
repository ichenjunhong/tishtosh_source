package com.bytedance.liko.memoryexplorer.analyse;

import com.bytedance.liko.memoryexplorer.MemoryConfig;
import com.bytedance.liko.memoryexplorer.assemble.IAssembler;
import com.bytedance.liko.memoryexplorer.assemble.ObjectInstanceAssembler;
import com.bytedance.liko.memoryexplorer.report.ObjectInstanceReporter;
import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult;
import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult.InstanceTraces;
import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult.ResultClassNode;
import com.bytedance.liko.memoryexplorer.util.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.eclipse.mat.SnapshotException;
import org.eclipse.mat.parser.model.ClassImpl;
import org.eclipse.mat.snapshot.ISnapshot;
import org.eclipse.mat.snapshot.MultiplePathsFromGCRootsRecord;
import org.eclipse.mat.snapshot.model.IClass;
import org.eclipse.mat.util.IProgressListener;

public class ObjectInstanceAnalyser implements HprofAnalyser {
    private String[] excludes = {"java.lang.Object[]", "java.lang.ref.FinalizerReference"};
    private List<String> excludesList;
    private final ObjectInstanceAssembler mInstanceAssembler;
    private MemoryConfig mMemoryConfig;

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

    public void analysis(ISnapshot iSnapshot, IProgressListener iProgressListener) {
        ISnapshot iSnapshot2 = iSnapshot;
        try {
            Collection<IClass> classes = iSnapshot.getClasses();
            if (classes != null) {
                if (classes.size() != 0) {
                    ArrayList<ResultClassNode> arrayList = new ArrayList<>();
                    Map buildClassExcludeMap = buildClassExcludeMap(iSnapshot2, this.mMemoryConfig.excludedRefs.excludeFieldMap);
                    for (IClass iClass : classes) {
                        if ((iClass instanceof ClassImpl) && !"java.lang.ref.FinalizerReference".equals(iClass.getName()) && !iClass.getName().startsWith("org.eclipse.mat") && !"sun.misc.Cleaner".equals(iClass.getName())) {
                            if (!this.mMemoryConfig.objectInstanceFilterSystem || (!iClass.getName().startsWith("java") && !iClass.getName().endsWith("[]"))) {
                                ResultClassNode resultClassNode = new ResultClassNode();
                                ClassImpl classImpl = (ClassImpl) iClass;
                                int[] objectIds = classImpl.getObjectIds();
                                long j = 0;
                                for (int object : objectIds) {
                                    j += iSnapshot2.getObject(object).getRetainedHeapSize();
                                }
                                if (objectIds.length > 500 && j > 2097152 && j < 524288000) {
                                    StringBuilder sb = new StringBuilder("----");
                                    sb.append(iClass.getName());
                                    sb.append("----instance_count:");
                                    sb.append(objectIds.length);
                                    Logger.m24776i(sb.toString(), new Object[0]);
                                    if (this.mMemoryConfig.supportObjectInstanceAnalysis) {
                                        Logger.m24776i("start auto ObjectInstanceAnalyser", new Object[0]);
                                        findMultiplePathsFromGCRootsRecord(resultClassNode.instance_traces, iSnapshot2.getMultiplePathsFromGCRoots(objectIds, buildClassExcludeMap).getPathsByGCRoot(iProgressListener), objectIds.length, iSnapshot, this.mMemoryConfig.objectInstanceLatitude, iProgressListener);
                                    }
                                    resultClassNode.retained_heap_size = (double) j;
                                    resultClassNode.object_class = classImpl.getName();
                                    resultClassNode.instance_count = classImpl.getNumberOfObjects();
                                    arrayList.add(resultClassNode);
                                }
                            }
                        }
                    }
                    for (ResultClassNode onAssemble : arrayList) {
                        this.mInstanceAssembler.onAssemble(onAssemble);
                    }
                }
            }
        } catch (Exception unused) {
            System.out.println("ObjectInstanceAnalyser's SnapshotException ");
        }
    }

    public ObjectInstanceAnalyser(MemoryConfig memoryConfig, IAssembler iAssembler, ExplorerAnalysisResult explorerAnalysisResult) {
        this.mMemoryConfig = memoryConfig;
        this.mInstanceAssembler = new ObjectInstanceAssembler(iAssembler, new ObjectInstanceReporter(explorerAnalysisResult), memoryConfig.packageName);
        this.excludesList = Arrays.asList(this.excludes);
    }

    private void findMultiplePathsFromGCRootsRecord(List<InstanceTraces> list, MultiplePathsFromGCRootsRecord[] multiplePathsFromGCRootsRecordArr, int i, ISnapshot iSnapshot, int i2, IProgressListener iProgressListener) {
        MultiplePathsFromGCRootsRecord[] multiplePathsFromGCRootsRecordArr2 = multiplePathsFromGCRootsRecordArr;
        ISnapshot iSnapshot2 = iSnapshot;
        if (i2 > 0) {
            for (MultiplePathsFromGCRootsRecord multiplePathsFromGCRootsRecord : multiplePathsFromGCRootsRecordArr2) {
                int count = multiplePathsFromGCRootsRecord.getCount();
                if (count > i / 20) {
                    InstanceTraces instanceTraces = new InstanceTraces();
                    instanceTraces.instance_count = count;
                    try {
                        try {
                            instanceTraces.retained_heap_size = (double) iSnapshot2.getMinRetainedSize(multiplePathsFromGCRootsRecord.getReferencedObjects(), iProgressListener);
                            instanceTraces.object_class = iSnapshot2.getObject(multiplePathsFromGCRootsRecord.getObjectId()).getTechnicalName();
                        } catch (SnapshotException unused) {
                        }
                    } catch (SnapshotException unused2) {
                        IProgressListener iProgressListener2 = iProgressListener;
                    }
                    List<InstanceTraces> list2 = list;
                    list.add(instanceTraces);
                    findMultiplePathsFromGCRootsRecord(instanceTraces.instanceTraces, multiplePathsFromGCRootsRecord.nextLevel(), i, iSnapshot, i2 - 1, iProgressListener);
                } else {
                    List<InstanceTraces> list3 = list;
                    IProgressListener iProgressListener3 = iProgressListener;
                }
            }
        }
    }
}
