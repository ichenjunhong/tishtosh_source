package leakcanary;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

public final class KeyedWeakReference extends WeakReference<Object> {
    public static final C53361a Companion = new C53361a(null);
    public static volatile long heapDumpUptimeMillis;
    private final String key;
    private final String name;
    private volatile long retainedUptimeMillis = -1;
    private final long watchUptimeMillis;

    /* renamed from: leakcanary.KeyedWeakReference$a */
    public static final class C53361a {
        private C53361a() {
        }

        /* renamed from: a */
        public static void m113428a(long j) {
            KeyedWeakReference.heapDumpUptimeMillis = j;
        }

        public /* synthetic */ C53361a(C52707g gVar) {
            this();
        }
    }

    public static final long getHeapDumpUptimeMillis() {
        return heapDumpUptimeMillis;
    }

    public static final void setHeapDumpUptimeMillis(long j) {
        heapDumpUptimeMillis = j;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public final long getRetainedUptimeMillis() {
        return this.retainedUptimeMillis;
    }

    public final long getWatchUptimeMillis() {
        return this.watchUptimeMillis;
    }

    public final void setRetainedUptimeMillis(long j) {
        this.retainedUptimeMillis = j;
    }

    public KeyedWeakReference(Object obj, String str, String str2, long j, ReferenceQueue<Object> referenceQueue) {
        C52711k.m112240b(obj, "referent");
        C52711k.m112240b(str, "key");
        C52711k.m112240b(str2, LeakCanaryFileProvider.f132049i);
        C52711k.m112240b(referenceQueue, "referenceQueue");
        super(obj, referenceQueue);
        this.key = str;
        this.name = str2;
        this.watchUptimeMillis = j;
    }
}
