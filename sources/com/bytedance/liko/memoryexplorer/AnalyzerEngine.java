package com.bytedance.liko.memoryexplorer;

import com.C2240a;
import com.bytedance.liko.memoryexplorer.android.AndroidOS;
import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult;
import com.bytedance.liko.memoryexplorer.upload.AnalysisUploader;
import com.bytedance.liko.memoryexplorer.util.FileUtils;
import com.bytedance.liko.memoryexplorer.util.Logger;
import com.bytedance.liko.memoryexplorer.util.ProcessUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import org.eclipse.mat.json.JSONObject;
import org.eclipse.mat.parser.internal.SnapshotFactory;
import org.eclipse.mat.snapshot.ISnapshot;
import org.eclipse.mat.util.ConsoleProgressListener;
import org.eclipse.mat.util.IProgressListener;

public class AnalyzerEngine {
    private void deleteLeftFiles() {
        File[] listFiles = FileUtils.getHeapDumpDir().listFiles(AnalyzerEngine$$Lambda$0.$instance);
        if (listFiles != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
    }

    private void runMonkey(MemoryConfig memoryConfig) {
        if (memoryConfig != null && memoryConfig.canRunMonkey()) {
            Logger.m24776i("run monkey", new Object[0]);
            ProcessUtil.executeCommand(memoryConfig.monkeyCommand);
        }
    }

    private void deleteLeftFiles(File file) {
        File[] listFiles = file.listFiles(AnalyzerEngine$$Lambda$1.$instance);
        if (listFiles != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
    }

    public boolean start(AnalyzerArgs analyzerArgs) throws IOException, InterruptedException, IllegalArgumentException {
        long currentTimeMillis = System.currentTimeMillis();
        if (analyzerArgs != null) {
            FileUtils.setProjectDir(analyzerArgs.projectDir);
            FileUtils.clearHeapDumpDir();
            JSONObject readJson = FileUtils.readJson(analyzerArgs.jsonConfigFile);
            System.out.println(readJson.toString());
            MemoryConfig.initJsonConfig(readJson.toString());
            try {
                runAnalysis(analyzerArgs, MemoryConfig.getMemoryConfig());
                Logger.m24776i("Memory Explorer succeed in %ds: please check with file://%s", Long.valueOf((System.currentTimeMillis() - currentTimeMillis) / 1000), FileUtils.getReportDir().getAbsolutePath());
            } catch (RuntimeException unused) {
                Logger.m24776i("The analysis failed, please try it again", new Object[0]);
            }
            return true;
        }
        throw new IllegalArgumentException("AnalyzerArgs is null, please check!");
    }

    private void runAnalysis(AnalyzerArgs analyzerArgs, MemoryConfig memoryConfig) throws FileNotFoundException, RuntimeException {
        ConsoleProgressListener consoleProgressListener = new ConsoleProgressListener((OutputStream) System.out);
        ISnapshot openHprof = openHprof(analyzerArgs.hprofFile, consoleProgressListener);
        if (openHprof != null) {
            System.out.println(openHprof.getSnapshotInfo());
            AndroidOS.parse(openHprof);
            ExplorerAnalysisResult explorerAnalysisResult = new ExplorerAnalysisResult();
            analysisHprof(memoryConfig, openHprof, consoleProgressListener, explorerAnalysisResult);
            AnalysisUploader.uploadAnalysis(memoryConfig, explorerAnalysisResult);
            deleteLeftFiles();
            return;
        }
        throw new RuntimeException("The analysis failed, please try it again");
    }

    private ISnapshot openHprof(File file, IProgressListener iProgressListener) throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException(C2240a.m6772a("%s file not found!", new Object[]{file.getAbsolutePath()}));
        } else if (file.length() != 0) {
            Logger.m24776i("opening hprof, the path is %s", file.getAbsolutePath());
            try {
                return new SnapshotFactory().openSnapshot(file, new HashMap(), iProgressListener);
            } catch (Exception unused) {
                return null;
            }
        } else {
            throw new IllegalStateException(C2240a.m6772a("%s length is 0, please check if your app is debuggable", new Object[]{file.getAbsolutePath()}));
        }
    }

    public void runAnalysis(File file, MemoryConfig memoryConfig) throws FileNotFoundException, RuntimeException {
        FileUtils.setProjectDir(file.getAbsoluteFile().getParentFile());
        FileUtils.clearHeapDumpDir();
        ConsoleProgressListener consoleProgressListener = new ConsoleProgressListener((OutputStream) System.out);
        ISnapshot openHprof = openHprof(file, consoleProgressListener);
        if (openHprof != null) {
            System.out.println(openHprof.getSnapshotInfo());
            AndroidOS.parse(openHprof);
            ExplorerAnalysisResult explorerAnalysisResult = new ExplorerAnalysisResult();
            analysisHprof(memoryConfig, openHprof, consoleProgressListener, explorerAnalysisResult);
            AnalysisUploader.uploadAnalysis(memoryConfig, explorerAnalysisResult);
            deleteLeftFiles(file.getAbsoluteFile().getParentFile());
            if (MemoryConfig.getMemoryConfig().deleteDumpFile) {
                StringBuilder sb = new StringBuilder("delete:");
                sb.append(file.getAbsolutePath());
                Logger.m24776i(sb.toString(), new Object[0]);
                file.delete();
                return;
            }
            return;
        }
        throw new RuntimeException("The analysis failed, please try it again");
    }

    public boolean start(File file, File file2, File file3) throws IOException, InterruptedException, IllegalArgumentException {
        return start(new AnalyzerArgs(file, file2, file3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void analysisHprof(com.bytedance.liko.memoryexplorer.MemoryConfig r6, org.eclipse.mat.snapshot.ISnapshot r7, org.eclipse.mat.util.IProgressListener r8, com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult r9) {
        /*
            r5 = this;
            java.util.List r0 = org.eclipse.mat.parser.internal.util.ParserRegistry.allParsers()
            r0.clear()
            java.lang.String r0 = r6.channel
            java.lang.String r1 = "local_test"
            boolean r0 = r0.equals(r1)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0027
            com.bytedance.liko.memoryexplorer.assemble.HtmlAssembler r3 = new com.bytedance.liko.memoryexplorer.assemble.HtmlAssembler     // Catch:{ Throwable -> 0x0025 }
            r3.<init>()     // Catch:{ Throwable -> 0x0025 }
            r3.onStart()     // Catch:{ Throwable -> 0x0020, all -> 0x001d }
            r2 = r3
            goto L_0x0027
        L_0x001d:
            r6 = move-exception
            r2 = r3
            goto L_0x0070
        L_0x0020:
            r6 = move-exception
            r2 = r3
            goto L_0x005b
        L_0x0023:
            r6 = move-exception
            goto L_0x0070
        L_0x0025:
            r6 = move-exception
            goto L_0x005b
        L_0x0027:
            com.bytedance.liko.memoryexplorer.analyse.LeakAnalyser r3 = new com.bytedance.liko.memoryexplorer.analyse.LeakAnalyser     // Catch:{ Throwable -> 0x0025 }
            r3.<init>(r6, r2, r9)     // Catch:{ Throwable -> 0x0025 }
            r3.analysis(r7, r8)     // Catch:{ Throwable -> 0x0025 }
            boolean r3 = r6.supportBitmapAnalysis     // Catch:{ Throwable -> 0x0025 }
            if (r3 == 0) goto L_0x0042
            java.lang.String r3 = "start BitmapAnalyser"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x0025 }
            com.bytedance.liko.memoryexplorer.util.Logger.m24776i(r3, r4)     // Catch:{ Throwable -> 0x0025 }
            com.bytedance.liko.memoryexplorer.analyse.BitmapAnalyser r3 = new com.bytedance.liko.memoryexplorer.analyse.BitmapAnalyser     // Catch:{ Throwable -> 0x0025 }
            r3.<init>(r6, r2, r9)     // Catch:{ Throwable -> 0x0025 }
            r3.analysis(r7, r8)     // Catch:{ Throwable -> 0x0025 }
        L_0x0042:
            com.bytedance.liko.memoryexplorer.analyse.BigObjectAnalyser r3 = new com.bytedance.liko.memoryexplorer.analyse.BigObjectAnalyser     // Catch:{ Throwable -> 0x0025 }
            r3.<init>(r6, r2, r9)     // Catch:{ Throwable -> 0x0025 }
            r3.analysis(r7, r8)     // Catch:{ Throwable -> 0x0025 }
            com.bytedance.liko.memoryexplorer.analyse.ObjectInstanceAnalyser r3 = new com.bytedance.liko.memoryexplorer.analyse.ObjectInstanceAnalyser     // Catch:{ Throwable -> 0x0025 }
            r3.<init>(r6, r2, r9)     // Catch:{ Throwable -> 0x0025 }
            r3.analysis(r7, r8)     // Catch:{ Throwable -> 0x0025 }
            r7.dispose()     // Catch:{ Throwable -> 0x0025 }
            if (r0 == 0) goto L_0x006f
            r2.onFinish()
            return
        L_0x005b:
            java.lang.String r7 = "analysisHprof Throwable：%s"
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x0023 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0023 }
            r8[r1] = r6     // Catch:{ all -> 0x0023 }
            com.bytedance.liko.memoryexplorer.util.Logger.m24776i(r7, r8)     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x006f
            r2.onFinish()
            return
        L_0x006f:
            return
        L_0x0070:
            if (r0 == 0) goto L_0x0075
            r2.onFinish()
        L_0x0075:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.liko.memoryexplorer.AnalyzerEngine.analysisHprof(com.bytedance.liko.memoryexplorer.MemoryConfig, org.eclipse.mat.snapshot.ISnapshot, org.eclipse.mat.util.IProgressListener, com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult):void");
    }
}
