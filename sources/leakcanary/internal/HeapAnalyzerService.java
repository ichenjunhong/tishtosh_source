package leakcanary.internal;

import android.content.Intent;
import android.os.Process;
import com.bytedance.liko.memoryexplorer.AnalyzerEngine;
import com.bytedance.liko.memoryexplorer.MemoryConfig;
import java.io.File;
import java.io.Serializable;
import leakcanary.C53367d;
import leakcanary.C53371g;
import leakcanary.internal.C53428l.C53429a;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2673h.C53173a;
import p2673h.C53173a.C53174a;

public final class HeapAnalyzerService extends ForegroundService {
    public HeapAnalyzerService() {
        String simpleName = HeapAnalyzerService.class.getSimpleName();
        C52711k.m112236a((Object) simpleName, "HeapAnalyzerService::class.java.simpleName");
        super(simpleName, "Analyzing Heap Dump", -1000010);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo110987a(Intent intent) {
        String str;
        C53371g.m113445a();
        if (intent == null) {
            C53174a a = C53173a.m112969a();
            if (a != null) {
                a.mo110681a("HeapAnalyzerService received a null intent, ignoring.");
                return;
            }
            return;
        }
        Process.setThreadPriority(10);
        Serializable serializableExtra = intent.getSerializableExtra("HEAPDUMP_FILE_EXTRA");
        if (serializableExtra != null) {
            File file = (File) serializableExtra;
            if (!file.exists()) {
                C53174a a2 = C53173a.m112969a();
                if (a2 != null) {
                    StringBuilder sb = new StringBuilder("Hprof file missing due to: [");
                    C53429a aVar = C53428l.f132130f;
                    C52711k.m112240b(file, "file");
                    String absolutePath = file.getAbsolutePath();
                    if (C53428l.f132127c.contains(absolutePath)) {
                        str = "Older than all other hprof files";
                    } else if (C53428l.f132128d.contains(absolutePath)) {
                        str = "Hprof directory cleared";
                    } else if (C53428l.f132129e.contains(absolutePath)) {
                        str = "Leak manually removed";
                    } else {
                        str = "Unknown";
                    }
                    sb.append(str);
                    sb.append("] ");
                    sb.append(file);
                    a2.mo110681a(sb.toString());
                    return;
                }
                return;
            }
            C53174a a3 = C53173a.m112969a();
            if (a3 != null) {
                StringBuilder sb2 = new StringBuilder("start Analysis:hprof path:");
                sb2.append(file.getAbsolutePath());
                a3.mo110681a(sb2.toString());
            }
            try {
                C53367d.m113438a(true);
                new AnalyzerEngine().runAnalysis(file, MemoryConfig.getMemoryConfig());
            } catch (Throwable th) {
                C53174a a4 = C53173a.m112969a();
                if (a4 != null) {
                    a4.mo110682a(th, "runAnalysis fail! delete heapDumpFile");
                }
                file.delete();
            }
            C53174a a5 = C53173a.m112969a();
            if (a5 != null) {
                a5.mo110681a("end Analysis");
            }
            C53367d.m113438a(false);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type java.io.File");
    }
}
