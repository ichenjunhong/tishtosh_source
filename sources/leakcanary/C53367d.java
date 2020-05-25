package leakcanary;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import java.io.File;
import leakcanary.internal.HeapAnalyzerService;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: leakcanary.d */
public final class C53367d {

    /* renamed from: a */
    public static volatile boolean f131999a;

    /* renamed from: b */
    public static final C53367d f132000b = new C53367d();

    private C53367d() {
    }

    /* renamed from: a */
    public static void m113438a(boolean z) {
        f131999a = z;
    }

    /* renamed from: a */
    public final void mo110955a(Context context, File file) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(file, "heapDumpFile");
        Intent intent = new Intent(context, HeapAnalyzerService.class);
        intent.putExtra("HEAPDUMP_FILE_EXTRA", file);
        C52711k.m112240b(context, "context");
        C52711k.m112240b(intent, "intent");
        if (VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            C53368e.m113440a(context, intent);
        }
    }
}
