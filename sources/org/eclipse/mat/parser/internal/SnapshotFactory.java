package org.eclipse.mat.parser.internal;

import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.eclipse.mat.SnapshotException;
import org.eclipse.mat.parser.IIndexBuilder;
import org.eclipse.mat.parser.internal.util.ParserRegistry;
import org.eclipse.mat.parser.internal.util.ParserRegistry.Parser;
import org.eclipse.mat.parser.model.XSnapshotInfo;
import org.eclipse.mat.snapshot.ISnapshot;
import org.eclipse.mat.util.IProgressListener;
import org.eclipse.mat.util.MessageUtil;

public class SnapshotFactory {
    private Map<File, SnapshotEntry> snapshotCache = new HashMap();

    static class SnapshotEntry {
        public WeakReference<ISnapshot> snapshot;
        public int usageCount;

        public SnapshotEntry(int i, ISnapshot iSnapshot) {
            this.usageCount = i;
            this.snapshot = new WeakReference<>(iSnapshot);
        }
    }

    private void deleteIndexFiles(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            parentFile = new File(ClassUtils.PACKAGE_SEPARATOR);
        }
        final String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            name = name.substring(0, lastIndexOf);
        }
        final Pattern compile = Pattern.compile("\\.(.*\\.)?index$");
        final Pattern compile2 = Pattern.compile("\\.inbound\\.index.*\\.log$");
        File[] listFiles = parentFile.listFiles(new FileFilter() {
            public boolean accept(File file) {
                if (file.isDirectory()) {
                    return false;
                }
                String name = file.getName();
                if (!name.startsWith(name) || (!compile.matcher(name).matches() && !compile2.matcher(name).matches())) {
                    return false;
                }
                return true;
            }
        });
        if (listFiles != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void dispose(org.eclipse.mat.snapshot.ISnapshot r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Map<java.io.File, org.eclipse.mat.parser.internal.SnapshotFactory$SnapshotEntry> r0 = r3.snapshotCache     // Catch:{ all -> 0x0040 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0040 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0040 }
        L_0x000b:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x0039
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0040 }
            org.eclipse.mat.parser.internal.SnapshotFactory$SnapshotEntry r1 = (org.eclipse.mat.parser.internal.SnapshotFactory.SnapshotEntry) r1     // Catch:{ all -> 0x0040 }
            java.lang.ref.WeakReference<org.eclipse.mat.snapshot.ISnapshot> r2 = r1.snapshot     // Catch:{ all -> 0x0040 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0040 }
            org.eclipse.mat.snapshot.ISnapshot r2 = (org.eclipse.mat.snapshot.ISnapshot) r2     // Catch:{ all -> 0x0040 }
            if (r2 != 0) goto L_0x0025
            r0.remove()     // Catch:{ all -> 0x0040 }
            goto L_0x000b
        L_0x0025:
            if (r2 != r4) goto L_0x000b
            int r2 = r1.usageCount     // Catch:{ all -> 0x0040 }
            int r2 = r2 + -1
            r1.usageCount = r2     // Catch:{ all -> 0x0040 }
            int r1 = r1.usageCount     // Catch:{ all -> 0x0040 }
            if (r1 != 0) goto L_0x0037
            r4.dispose()     // Catch:{ all -> 0x0040 }
            r0.remove()     // Catch:{ all -> 0x0040 }
        L_0x0037:
            monitor-exit(r3)
            return
        L_0x0039:
            if (r4 == 0) goto L_0x003e
            r4.dispose()     // Catch:{ all -> 0x0040 }
        L_0x003e:
            monitor-exit(r3)
            return
        L_0x0040:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.mat.parser.internal.SnapshotFactory.dispose(org.eclipse.mat.snapshot.ISnapshot):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.eclipse.mat.snapshot.ISnapshot openSnapshot(java.io.File r13, java.util.Map<java.lang.String, java.lang.String> r14, org.eclipse.mat.util.IProgressListener r15) throws org.eclipse.mat.SnapshotException {
        /*
            r12 = this;
            java.util.Map<java.io.File, org.eclipse.mat.parser.internal.SnapshotFactory$SnapshotEntry> r0 = r12.snapshotCache
            java.lang.Object r0 = r0.get(r13)
            org.eclipse.mat.parser.internal.SnapshotFactory$SnapshotEntry r0 = (org.eclipse.mat.parser.internal.SnapshotFactory.SnapshotEntry) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001c
            java.lang.ref.WeakReference<org.eclipse.mat.snapshot.ISnapshot> r3 = r0.snapshot
            java.lang.Object r3 = r3.get()
            org.eclipse.mat.snapshot.ISnapshot r3 = (org.eclipse.mat.snapshot.ISnapshot) r3
            if (r3 == 0) goto L_0x001d
            int r13 = r0.usageCount
            int r13 = r13 + r2
            r0.usageCount = r13
            return r3
        L_0x001c:
            r3 = r1
        L_0x001d:
            java.lang.String r0 = r13.getAbsolutePath()
            r4 = 46
            int r4 = r0.lastIndexOf(r4)
            r5 = 0
            if (r4 < 0) goto L_0x0030
            int r4 = r4 + r2
            java.lang.String r0 = r0.substring(r5, r4)
            goto L_0x0041
        L_0x0030:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = "."
            r4.append(r0)
            java.lang.String r0 = r4.toString()
        L_0x0041:
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x00a6 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a6 }
            r6.<init>()     // Catch:{ IOException -> 0x00a6 }
            r6.append(r0)     // Catch:{ IOException -> 0x00a6 }
            java.lang.String r7 = "index"
            r6.append(r7)     // Catch:{ IOException -> 0x00a6 }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x00a6 }
            r4.<init>(r6)     // Catch:{ IOException -> 0x00a6 }
            boolean r6 = r4.exists()     // Catch:{ IOException -> 0x00a6 }
            if (r6 == 0) goto L_0x00cc
            long r6 = r13.lastModified()     // Catch:{ IOException -> 0x00a6 }
            long r8 = r4.lastModified()     // Catch:{ IOException -> 0x00a6 }
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x006e
            org.eclipse.mat.parser.internal.SnapshotImpl r1 = org.eclipse.mat.parser.internal.SnapshotImpl.readFromFile(r13, r0, r15)     // Catch:{ IOException -> 0x00a6 }
            goto L_0x00cd
        L_0x006e:
            java.lang.String r6 = org.eclipse.mat.parser.internal.Messages.SnapshotFactoryImpl_ReparsingHeapDumpAsIndexOutOfDate     // Catch:{ IOException -> 0x00a6 }
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x00a6 }
            java.lang.String r8 = r13.getPath()     // Catch:{ IOException -> 0x00a6 }
            r7[r5] = r8     // Catch:{ IOException -> 0x00a6 }
            java.util.Date r8 = new java.util.Date     // Catch:{ IOException -> 0x00a6 }
            long r9 = r13.lastModified()     // Catch:{ IOException -> 0x00a6 }
            r8.<init>(r9)     // Catch:{ IOException -> 0x00a6 }
            r7[r2] = r8     // Catch:{ IOException -> 0x00a6 }
            r8 = 2
            java.lang.String r9 = r4.getPath()     // Catch:{ IOException -> 0x00a6 }
            r7[r8] = r9     // Catch:{ IOException -> 0x00a6 }
            r8 = 3
            java.util.Date r9 = new java.util.Date     // Catch:{ IOException -> 0x00a6 }
            long r10 = r4.lastModified()     // Catch:{ IOException -> 0x00a6 }
            r9.<init>(r10)     // Catch:{ IOException -> 0x00a6 }
            r7[r8] = r9     // Catch:{ IOException -> 0x00a6 }
            java.lang.String r4 = org.eclipse.mat.util.MessageUtil.format(r6, r7)     // Catch:{ IOException -> 0x00a6 }
            org.eclipse.mat.util.IProgressListener$Severity r6 = org.eclipse.mat.util.IProgressListener.Severity.INFO     // Catch:{ IOException -> 0x00a6 }
            r15.sendUserMessage(r6, r4, r1)     // Catch:{ IOException -> 0x00a6 }
            java.lang.String r1 = org.eclipse.mat.parser.internal.Messages.SnapshotFactoryImpl_ReparsingHeapDumpWithOutOfDateIndex     // Catch:{ IOException -> 0x00a6 }
            r15.subTask(r1)     // Catch:{ IOException -> 0x00a6 }
            goto L_0x00cc
        L_0x00a6:
            r1 = move-exception
            java.lang.String r4 = r1.getMessage()
            if (r4 == 0) goto L_0x00b2
            java.lang.String r4 = r1.getMessage()
            goto L_0x00ba
        L_0x00b2:
            java.lang.Class r4 = r1.getClass()
            java.lang.String r4 = r4.getName()
        L_0x00ba:
            java.lang.String r6 = org.eclipse.mat.parser.internal.Messages.SnapshotFactoryImpl_Error_ReparsingHeapDump
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r5] = r4
            java.lang.String r4 = org.eclipse.mat.util.MessageUtil.format(r6, r7)
            org.eclipse.mat.util.IProgressListener$Severity r5 = org.eclipse.mat.util.IProgressListener.Severity.WARNING
            r15.sendUserMessage(r5, r4, r1)
            r15.subTask(r4)
        L_0x00cc:
            r1 = r3
        L_0x00cd:
            if (r1 != 0) goto L_0x00d6
            r12.deleteIndexFiles(r13)
            org.eclipse.mat.snapshot.ISnapshot r1 = r12.parse(r13, r0, r14, r15)
        L_0x00d6:
            org.eclipse.mat.parser.internal.SnapshotFactory$SnapshotEntry r14 = new org.eclipse.mat.parser.internal.SnapshotFactory$SnapshotEntry
            r14.<init>(r2, r1)
            java.util.Map<java.io.File, org.eclipse.mat.parser.internal.SnapshotFactory$SnapshotEntry> r15 = r12.snapshotCache
            r15.put(r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.mat.parser.internal.SnapshotFactory.openSnapshot(java.io.File, java.util.Map, org.eclipse.mat.util.IProgressListener):org.eclipse.mat.snapshot.ISnapshot");
    }

    private final ISnapshot parse(File file, String str, Map<String, String> map, IProgressListener iProgressListener) throws SnapshotException {
        List<Parser> matchParser = ParserRegistry.matchParser(file.getName());
        if (matchParser.isEmpty()) {
            matchParser.addAll(ParserRegistry.allParsers());
        }
        ArrayList arrayList = new ArrayList();
        for (Parser parser : matchParser) {
            IIndexBuilder indexBuilder = parser.getIndexBuilder();
            if (indexBuilder != null) {
                try {
                    indexBuilder.init(file, str);
                    XSnapshotInfo xSnapshotInfo = new XSnapshotInfo();
                    xSnapshotInfo.setPath(file.getAbsolutePath());
                    xSnapshotInfo.setPrefix(str);
                    xSnapshotInfo.setProperty("$heapFormat", parser.getId());
                    if (Boolean.parseBoolean((String) map.get("keep_unreachable_objects"))) {
                        xSnapshotInfo.setProperty("keep_unreachable_objects", Integer.valueOf(2048));
                    }
                    PreliminaryIndexImpl preliminaryIndexImpl = new PreliminaryIndexImpl(xSnapshotInfo);
                    indexBuilder.fill(preliminaryIndexImpl, iProgressListener);
                    SnapshotImplBuilder snapshotImplBuilder = new SnapshotImplBuilder(preliminaryIndexImpl.getSnapshotInfo());
                    indexBuilder.clean(GarbageCleaner.clean(preliminaryIndexImpl, snapshotImplBuilder, map, iProgressListener), iProgressListener);
                    SnapshotImpl create = snapshotImplBuilder.create(parser, iProgressListener);
                    create.calculateDominatorTree(iProgressListener);
                    return create;
                } catch (IOException e) {
                    arrayList.add(e);
                    indexBuilder.cancel();
                } catch (Exception e2) {
                    indexBuilder.cancel();
                    throw SnapshotException.rethrow(e2);
                }
            }
        }
        throw new SnapshotException(MessageUtil.format(Messages.SnapshotFactoryImpl_Error_NoParserRegistered, file.getName()));
    }
}
