package com.bytedance.liko.memoryexplorer.analyse;

import com.bytedance.liko.memoryexplorer.MemoryConfig;
import com.bytedance.liko.memoryexplorer.analyse.trace.LeakTrace;
import com.bytedance.liko.memoryexplorer.analyse.trace.LeakTraceTracker;
import com.bytedance.liko.memoryexplorer.assemble.IAssembler;
import com.bytedance.liko.memoryexplorer.assemble.LeakAssembler;
import com.bytedance.liko.memoryexplorer.report.LeakReporter;
import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult;
import com.bytedance.liko.memoryexplorer.util.Logger;
import org.eclipse.mat.snapshot.ISnapshot;
import org.eclipse.mat.snapshot.model.IObject;

public class LeakAnalyser implements HprofAnalyser {
    private final MemoryConfig mAnalysisConfig;
    private final LeakAssembler mLeakReport;

    private boolean isFragment(String str) {
        if ("android.app.Fragment".equals(str) || "android.support.v4.app.Fragment".equals(str)) {
            return true;
        }
        return false;
    }

    private boolean canIgnore(LeakTrace leakTrace, String str) {
        if (leakTrace == null) {
            return true;
        }
        String format = leakTrace.format(false);
        if ("android.support.v4.app.Fragment".equals(str)) {
            if (format.contains("android.support.v4.app.FragmentManagerImpl.mAdded") || format.contains("Activity")) {
                return true;
            }
            return false;
        } else if (!"android.app.Fragment".equals(str)) {
            return false;
        } else {
            if (format.contains("android.app.FragmentManagerImpl.mAdded") || format.contains("Activity")) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0125 A[SYNTHETIC, Splitter:B:57:0x0125] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00a5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void analysis(org.eclipse.mat.snapshot.ISnapshot r10, org.eclipse.mat.util.IProgressListener r11) {
        /*
            r9 = this;
            r11 = 1
            r0 = 0
            java.lang.String r1 = "com.facebook.common.references.SharedReference"
            java.util.Collection r1 = r10.getClassesByName(r1, r11)     // Catch:{ Exception -> 0x015e }
            if (r1 == 0) goto L_0x0052
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x015e }
        L_0x000e:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x015e }
            if (r2 == 0) goto L_0x0052
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x015e }
            org.eclipse.mat.snapshot.model.IClass r2 = (org.eclipse.mat.snapshot.model.IClass) r2     // Catch:{ Exception -> 0x015e }
            int[] r2 = r2.getObjectIds()     // Catch:{ Exception -> 0x015e }
            int r3 = r2.length     // Catch:{ Exception -> 0x015e }
            r4 = 0
        L_0x0020:
            if (r4 >= r3) goto L_0x000e
            r5 = r2[r4]     // Catch:{ Exception -> 0x015e }
            org.eclipse.mat.snapshot.model.IObject r5 = r10.getObject(r5)     // Catch:{ Exception -> 0x015e }
            org.eclipse.mat.parser.model.InstanceImpl r5 = (org.eclipse.mat.parser.model.InstanceImpl) r5     // Catch:{ Exception -> 0x015e }
            java.lang.String r6 = "mRefCount"
            org.eclipse.mat.snapshot.model.Field r5 = r5.getField(r6)     // Catch:{ Exception -> 0x015e }
            if (r5 == 0) goto L_0x004f
            java.lang.Object r5 = r5.getValue()     // Catch:{ Exception -> 0x015e }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x015e }
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x015e }
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ Exception -> 0x015e }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015e }
            java.lang.String r8 = "mRefCount "
            r7.<init>(r8)     // Catch:{ Exception -> 0x015e }
            r7.append(r5)     // Catch:{ Exception -> 0x015e }
            java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x015e }
            r6.println(r5)     // Catch:{ Exception -> 0x015e }
        L_0x004f:
            int r4 = r4 + 1
            goto L_0x0020
        L_0x0052:
            com.bytedance.liko.memoryexplorer.MemoryConfig r1 = r9.mAnalysisConfig     // Catch:{ Exception -> 0x015e }
            java.util.List<java.lang.String> r1 = r1.detectedClasses     // Catch:{ Exception -> 0x015e }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x015e }
        L_0x005a:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x015e }
            if (r2 == 0) goto L_0x0156
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x015e }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x015e }
            java.util.Collection r3 = r10.getClassesByName(r2, r11)     // Catch:{ Exception -> 0x015e }
            boolean r4 = com.bytedance.liko.memoryexplorer.util.CollectionsUtil.isEmpty(r3)     // Catch:{ Exception -> 0x015e }
            if (r4 != 0) goto L_0x005a
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x015e }
            r4.<init>()     // Catch:{ Exception -> 0x015e }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x015e }
        L_0x0079:
            boolean r5 = r3.hasNext()     // Catch:{ Exception -> 0x015e }
            if (r5 == 0) goto L_0x0099
            java.lang.Object r5 = r3.next()     // Catch:{ Exception -> 0x015e }
            org.eclipse.mat.snapshot.model.IClass r5 = (org.eclipse.mat.snapshot.model.IClass) r5     // Catch:{ Exception -> 0x015e }
            int[] r5 = r5.getObjectIds()     // Catch:{ Exception -> 0x015e }
            int r6 = r5.length     // Catch:{ Exception -> 0x015e }
            r7 = 0
        L_0x008b:
            if (r7 >= r6) goto L_0x0079
            r8 = r5[r7]     // Catch:{ Exception -> 0x015e }
            org.eclipse.mat.snapshot.model.IObject r8 = r10.getObject(r8)     // Catch:{ Exception -> 0x015e }
            r4.add(r8)     // Catch:{ Exception -> 0x015e }
            int r7 = r7 + 1
            goto L_0x008b
        L_0x0099:
            com.bytedance.liko.memoryexplorer.analyse.LeakAnalyser$1 r3 = new com.bytedance.liko.memoryexplorer.analyse.LeakAnalyser$1     // Catch:{ Exception -> 0x015e }
            r3.<init>()     // Catch:{ Exception -> 0x015e }
            java.util.Collections.sort(r4, r3)     // Catch:{ Exception -> 0x015e }
            java.util.Iterator r3 = r4.iterator()     // Catch:{ Exception -> 0x015e }
        L_0x00a5:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x015e }
            if (r4 == 0) goto L_0x005a
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x015e }
            org.eclipse.mat.snapshot.model.IObject r4 = (org.eclipse.mat.snapshot.model.IObject) r4     // Catch:{ Exception -> 0x015e }
            java.lang.String r5 = "android.app.Activity"
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x015e }
            if (r5 == 0) goto L_0x00d6
            boolean r5 = r4 instanceof org.eclipse.mat.parser.model.InstanceImpl     // Catch:{ Exception -> 0x015e }
            if (r5 == 0) goto L_0x00d6
            r5 = r4
            org.eclipse.mat.parser.model.InstanceImpl r5 = (org.eclipse.mat.parser.model.InstanceImpl) r5     // Catch:{ Exception -> 0x015e }
            java.lang.String r6 = "mDestroyed"
            org.eclipse.mat.snapshot.model.Field r5 = r5.getField(r6)     // Catch:{ Exception -> 0x015e }
            if (r5 == 0) goto L_0x00d6
            java.lang.Object r5 = r5.getValue()     // Catch:{ Exception -> 0x015e }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ Exception -> 0x015e }
            boolean r5 = r5.booleanValue()     // Catch:{ Exception -> 0x015e }
            if (r5 != 0) goto L_0x00d6
            r5 = 0
            goto L_0x00d7
        L_0x00d6:
            r5 = 1
        L_0x00d7:
            boolean r6 = r9.isFragment(r2)     // Catch:{ Exception -> 0x015e }
            if (r6 == 0) goto L_0x0123
            boolean r6 = r4 instanceof org.eclipse.mat.parser.model.InstanceImpl     // Catch:{ Exception -> 0x015e }
            if (r6 == 0) goto L_0x0123
            r6 = r4
            org.eclipse.mat.parser.model.InstanceImpl r6 = (org.eclipse.mat.parser.model.InstanceImpl) r6     // Catch:{ Exception -> 0x015e }
            java.lang.String r7 = "mCalled"
            org.eclipse.mat.snapshot.model.Field r6 = r6.getField(r7)     // Catch:{ Exception -> 0x015e }
            if (r6 == 0) goto L_0x00f9
            java.lang.Object r6 = r6.getValue()     // Catch:{ Exception -> 0x015e }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ Exception -> 0x015e }
            boolean r6 = r6.booleanValue()     // Catch:{ Exception -> 0x015e }
            if (r6 != 0) goto L_0x00f9
            r5 = 0
        L_0x00f9:
            r6 = r4
            org.eclipse.mat.parser.model.InstanceImpl r6 = (org.eclipse.mat.parser.model.InstanceImpl) r6     // Catch:{ Exception -> 0x015e }
            java.lang.String r7 = "mState"
            org.eclipse.mat.snapshot.model.Field r6 = r6.getField(r7)     // Catch:{ Exception -> 0x015e }
            if (r6 == 0) goto L_0x0111
            java.lang.Object r6 = r6.getValue()     // Catch:{ Exception -> 0x015e }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Exception -> 0x015e }
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x015e }
            if (r6 == 0) goto L_0x0111
            r5 = 0
        L_0x0111:
            r6 = r4
            org.eclipse.mat.parser.model.InstanceImpl r6 = (org.eclipse.mat.parser.model.InstanceImpl) r6     // Catch:{ Exception -> 0x015e }
            java.lang.String r7 = "mChildFragmentManager"
            org.eclipse.mat.snapshot.model.Field r6 = r6.getField(r7)     // Catch:{ Exception -> 0x015e }
            if (r6 == 0) goto L_0x0123
            java.lang.Object r6 = r6.getValue()     // Catch:{ Exception -> 0x015e }
            if (r6 == 0) goto L_0x0123
            r5 = 0
        L_0x0123:
            if (r5 == 0) goto L_0x00a5
            r9.findMemoryLeak(r10, r4, r2)     // Catch:{ Exception -> 0x012a }
            goto L_0x00a5
        L_0x012a:
            r5 = move-exception
            java.lang.String r6 = "findMemoryLeak() exception %s"
            java.lang.Object[] r7 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x015e }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015e }
            r8.<init>()     // Catch:{ Exception -> 0x015e }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x015e }
            r8.append(r5)     // Catch:{ Exception -> 0x015e }
            java.lang.String r5 = " className:"
            r8.append(r5)     // Catch:{ Exception -> 0x015e }
            org.eclipse.mat.snapshot.model.IClass r4 = r4.getClazz()     // Catch:{ Exception -> 0x015e }
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x015e }
            r8.append(r4)     // Catch:{ Exception -> 0x015e }
            java.lang.String r4 = r8.toString()     // Catch:{ Exception -> 0x015e }
            r7[r0] = r4     // Catch:{ Exception -> 0x015e }
            com.bytedance.liko.memoryexplorer.util.Logger.m24776i(r6, r7)     // Catch:{ Exception -> 0x015e }
            goto L_0x00a5
        L_0x0156:
            com.bytedance.liko.memoryexplorer.assemble.LeakAssembler r10 = r9.mLeakReport
            r10.onFinish()
            return
        L_0x015c:
            r10 = move-exception
            goto L_0x016d
        L_0x015e:
            r10 = move-exception
            java.lang.String r1 = "LeakAnalyser exception %s"
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ all -> 0x015c }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x015c }
            r11[r0] = r10     // Catch:{ all -> 0x015c }
            com.bytedance.liko.memoryexplorer.util.Logger.m24776i(r1, r11)     // Catch:{ all -> 0x015c }
            goto L_0x0156
        L_0x016d:
            com.bytedance.liko.memoryexplorer.assemble.LeakAssembler r11 = r9.mLeakReport
            r11.onFinish()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.liko.memoryexplorer.analyse.LeakAnalyser.analysis(org.eclipse.mat.snapshot.ISnapshot, org.eclipse.mat.util.IProgressListener):void");
    }

    public LeakAnalyser(MemoryConfig memoryConfig, IAssembler iAssembler, ExplorerAnalysisResult explorerAnalysisResult) {
        this.mAnalysisConfig = memoryConfig;
        this.mLeakReport = new LeakAssembler(iAssembler, new LeakReporter(explorerAnalysisResult), memoryConfig.packageName);
    }

    private void findMemoryLeak(ISnapshot iSnapshot, IObject iObject, String str) throws Exception {
        LeakTrace findLeakTrace = new LeakTraceTracker().findLeakTrace(iSnapshot, iObject, this.mAnalysisConfig.excludedRefs);
        Logger.m24776i("LeakAnalyser LeakTrace %s", findLeakTrace.format(false));
        if (!canIgnore(findLeakTrace, str)) {
            this.mLeakReport.onAssemble(findLeakTrace);
        }
    }
}
