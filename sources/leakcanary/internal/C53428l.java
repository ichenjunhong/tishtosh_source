package leakcanary.internal;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: leakcanary.internal.l */
public final class C53428l {

    /* renamed from: c */
    public static final List<String> f132127c = new ArrayList();

    /* renamed from: d */
    public static final List<String> f132128d = new ArrayList();

    /* renamed from: e */
    public static final List<String> f132129e = new ArrayList();

    /* renamed from: f */
    public static final C53429a f132130f = new C53429a(null);

    /* renamed from: a */
    final C52670a<Integer> f132131a;

    /* renamed from: b */
    final C52670a<Boolean> f132132b;

    /* renamed from: g */
    private final Context f132133g;

    /* renamed from: h */
    private volatile boolean f132134h;

    /* renamed from: leakcanary.internal.l$a */
    public static final class C53429a {
        private C53429a() {
        }

        public /* synthetic */ C53429a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: leakcanary.internal.l$b */
    static final class C53430b<T> implements Comparator<File> {

        /* renamed from: a */
        public static final C53430b f132135a = new C53430b();

        C53430b() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return (((File) obj).lastModified() > ((File) obj2).lastModified() ? 1 : (((File) obj).lastModified() == ((File) obj2).lastModified() ? 0 : -1));
        }
    }

    /* renamed from: leakcanary.internal.l$c */
    static final class C53431c implements FilenameFilter {

        /* renamed from: a */
        public static final C53431c f132136a = new C53431c();

        C53431c() {
        }

        public final boolean accept(File file, String str) {
            C52711k.m112236a((Object) str, LeakCanaryFileProvider.f132049i);
            return C52830p.m112412c(str, ".hprof", false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final File mo111053c() {
        return new File(this.f132133g.getFilesDir(), "leakcanary");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final File mo111052b() {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        StringBuilder sb = new StringBuilder("leakcanary-");
        sb.append(this.f132133g.getPackageName());
        return new File(externalStoragePublicDirectory, sb.toString());
    }

    /* renamed from: a */
    public final boolean mo111051a() {
        boolean z = true;
        if (VERSION.SDK_INT < 23 || this.f132134h) {
            return true;
        }
        if (this.f132133g.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            z = false;
        }
        this.f132134h = z;
        return this.f132134h;
    }

    /* renamed from: a */
    static boolean m113484a(File file) {
        if ((file.mkdirs() || file.exists()) && file.canWrite()) {
            return true;
        }
        return false;
    }

    public C53428l(Context context, C52670a<Integer> aVar, C52670a<Boolean> aVar2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "maxStoredHeapDumps");
        C52711k.m112240b(aVar2, "requestExternalStoragePermission");
        this.f132131a = aVar;
        this.f132132b = aVar2;
        Context applicationContext = context.getApplicationContext();
        C52711k.m112236a((Object) applicationContext, "context.applicationContext");
        this.f132133g = applicationContext;
    }
}
