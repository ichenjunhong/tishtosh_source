package com.bytedance.liko.leakdetector.strategy;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.crash.C9610j;
import com.bytedance.liko.leakdetector.C12279a;
import com.bytedance.liko.leakdetector.p774a.C12280a;
import com.bytedance.liko.leakdetector.p774a.C12281b;
import com.bytedance.liko.leakdetector.p774a.C12282c;
import com.bytedance.liko.memoryexplorer.MemoryConfig;
import com.bytedance.liko.p771a.C12267c;
import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.liko.leakdetector.strategy.a */
public final class C12284a {

    /* renamed from: a */
    static volatile boolean f32396a;

    /* renamed from: b */
    public static final HandlerThread f32397b = new HandlerThread("MemoryPeakThread");

    /* renamed from: c */
    public static Handler f32398c;

    /* renamed from: d */
    public static Context f32399d;

    /* renamed from: e */
    public static volatile boolean f32400e;

    /* renamed from: f */
    static boolean f32401f;

    /* renamed from: g */
    static final List<String> f32402g = new ArrayList();

    /* renamed from: h */
    public static final C12284a f32403h = new C12284a();

    /* renamed from: i */
    private static final List<String> f32404i = new ArrayList();

    /* renamed from: j */
    private static final List<String> f32405j = new ArrayList();

    /* renamed from: com.bytedance.liko.leakdetector.strategy.a$a */
    static final class C12285a<T> implements Comparator<File> {

        /* renamed from: a */
        public static final C12285a f32406a = new C12285a();

        C12285a() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return (((File) obj).lastModified() > ((File) obj2).lastModified() ? 1 : (((File) obj).lastModified() == ((File) obj2).lastModified() ? 0 : -1));
        }
    }

    /* renamed from: com.bytedance.liko.leakdetector.strategy.a$b */
    static final class C12286b implements FilenameFilter {

        /* renamed from: a */
        public static final C12286b f32407a = new C12286b();

        C12286b() {
        }

        public final boolean accept(File file, String str) {
            C52711k.m112236a((Object) str, LeakCanaryFileProvider.f132049i);
            return C52830p.m112413c(str, ".hprof", false, 2, null);
        }
    }

    /* renamed from: com.bytedance.liko.leakdetector.strategy.a$c */
    public static final class C12287c extends Handler {

        /* renamed from: a */
        final /* synthetic */ C12284a f32408a;

        public final void handleMessage(Message message) {
            boolean z;
            File file;
            C12284a aVar = C12284a.f32403h;
            boolean z2 = false;
            if (!C12284a.f32401f) {
                if (C12281b.m24763a() > C12267c.f32372b) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if ("local_test".equals(MemoryConfig.getMemoryConfig().channel)) {
                        FilenameFilter filenameFilter = C12286b.f32407a;
                        C52711k.m112240b(filenameFilter, "filter");
                        ArrayList arrayList = new ArrayList();
                        File[] listFiles = C12284a.m24768a().listFiles(filenameFilter);
                        if (listFiles != null) {
                            C52575l.m112109a((Collection) arrayList, (Object[]) listFiles);
                        }
                        File[] listFiles2 = C12284a.m24771b().listFiles(filenameFilter);
                        if (listFiles2 != null) {
                            C52575l.m112109a((Collection) arrayList, (Object[]) listFiles2);
                        }
                        List list = arrayList;
                        int size = list.size() - 7;
                        if (size > 0) {
                            StringBuilder sb = new StringBuilder("Removing ");
                            sb.append(size);
                            sb.append(" heap dumps");
                            C12279a.m24757a(sb.toString());
                            C52575l.m112105a(list, C12285a.f32406a);
                            for (int i = 0; i < size; i++) {
                                String absolutePath = ((File) list.get(i)).getAbsolutePath();
                                if (((File) list.get(i)).delete()) {
                                    C12284a.f32402g.add(absolutePath);
                                } else {
                                    StringBuilder sb2 = new StringBuilder("Could not delete old hprof file ");
                                    sb2.append(((File) list.get(i)).getPath());
                                    C12279a.m24757a(sb2.toString());
                                }
                            }
                        }
                        File a = C12284a.m24768a();
                        if (!C12284a.m24770a(a)) {
                            if (VERSION.SDK_INT >= 23 && !C12284a.f32396a) {
                                Context context = C12284a.f32399d;
                                if (context == null) {
                                    C52711k.m112237a("context");
                                }
                                if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                                    z2 = true;
                                }
                                C12284a.f32396a = z2;
                            } else {
                                z2 = true;
                            }
                            if (!z2) {
                                C12279a.m24757a("WRITE_EXTERNAL_STORAGE permission not granted, ignoring");
                            } else {
                                String externalStorageState = Environment.getExternalStorageState();
                                if (true ^ C52711k.m112239a((Object) "mounted", (Object) externalStorageState)) {
                                    StringBuilder sb3 = new StringBuilder("External storage not mounted, state: ");
                                    sb3.append(externalStorageState);
                                    C12279a.m24757a(sb3.toString());
                                } else {
                                    StringBuilder sb4 = new StringBuilder("Could not create heap dump directory in external storage: [");
                                    sb4.append(a.getAbsolutePath());
                                    sb4.append(']');
                                    C12279a.m24757a(sb4.toString());
                                }
                            }
                            a = C12284a.m24771b();
                            if (!C12284a.m24770a(a)) {
                                StringBuilder sb5 = new StringBuilder("Could not create heap dump directory in app storage: [");
                                sb5.append(a.getAbsolutePath());
                                sb5.append(']');
                                C12279a.m24757a(sb5.toString());
                                file = null;
                            }
                        }
                        file = new File(a, new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss_SSS'.hprof'", Locale.US).format(new Date()));
                    } else {
                        boolean z3 = MemoryConfig.getMemoryConfig().oversea;
                        Context context2 = C12284a.f32399d;
                        if (context2 == null) {
                            C52711k.m112237a("context");
                        }
                        file = C12280a.m24759a(z3, context2);
                    }
                    if (file != null) {
                        try {
                            Context context3 = C12284a.f32399d;
                            if (context3 == null) {
                                C52711k.m112237a("context");
                            }
                            C12282c.m24764a(context3, file.getAbsolutePath());
                            C9610j.m19134a(file.getAbsolutePath());
                            C12279a.m24757a("Npth dump heap");
                            return;
                        } catch (Exception unused) {
                            C12279a.m24757a("Could not dump heap");
                            return;
                        }
                    }
                }
            }
            Handler handler = C12284a.f32398c;
            if (handler != null) {
                handler.sendEmptyMessageDelayed(0, C12267c.m24748b());
            }
        }

        public C12287c(C12284a aVar, Looper looper) {
            this.f32408a = aVar;
            super(looper);
        }
    }

    private C12284a() {
    }

    /* renamed from: b */
    static File m24771b() {
        Context context = f32399d;
        if (context == null) {
            C52711k.m112237a("context");
        }
        return new File(context.getFilesDir(), "leakcanary");
    }

    /* renamed from: a */
    static File m24768a() {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        StringBuilder sb = new StringBuilder("leakcanary-");
        Context context = f32399d;
        if (context == null) {
            C52711k.m112237a("context");
        }
        sb.append(context.getPackageName());
        return new File(externalStoragePublicDirectory, sb.toString());
    }

    /* renamed from: a */
    public static void m24769a(boolean z) {
        f32401f = z;
    }

    /* renamed from: a */
    static boolean m24770a(File file) {
        if ((file.mkdirs() || file.exists()) && file.canWrite()) {
            return true;
        }
        return false;
    }
}
