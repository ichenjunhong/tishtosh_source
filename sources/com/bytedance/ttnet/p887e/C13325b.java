package com.bytedance.ttnet.p887e;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.C53678w;
import okhttp3.C53682y;

/* renamed from: com.bytedance.ttnet.e.b */
public class C13325b {

    /* renamed from: a */
    public static String f34768a = "https://crash.snssdk.com";

    /* renamed from: l */
    static AtomicBoolean f34769l = new AtomicBoolean(false);

    /* renamed from: m */
    private static volatile C13325b f34770m;

    /* renamed from: b */
    final C53678w f34771b = C53678w.m114225a("multipart/form-data");

    /* renamed from: c */
    C53682y f34772c = new C53682y();

    /* renamed from: d */
    String f34773d;

    /* renamed from: e */
    public long f34774e = 10000;

    /* renamed from: f */
    int f34775f = 10;

    /* renamed from: g */
    long f34776g = 30;

    /* renamed from: h */
    long f34777h = 30;

    /* renamed from: i */
    long f34778i = 30;

    /* renamed from: j */
    String f34779j;

    /* renamed from: k */
    Context f34780k;

    /* renamed from: com.bytedance.ttnet.e.b$a */
    static class C13327a implements Comparator<File> {
        C13327a() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            if (((File) obj).lastModified() < ((File) obj2).lastModified()) {
                return 1;
            }
            return -1;
        }
    }

    /* renamed from: a */
    static void m26837a(String str) {
        new File(str).delete();
    }

    /* renamed from: a */
    public static C13325b m26836a(Context context) {
        if (f34770m == null) {
            synchronized (C13325b.class) {
                if (f34770m == null) {
                    f34770m = new C13325b(context);
                }
            }
        }
        return f34770m;
    }

    private C13325b(Context context) {
        this.f34780k = context;
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getPath());
        sb.append("/Android/data/");
        sb.append(packageName);
        sb.append("/cache/");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("minidump");
        this.f34773d = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(f34768a);
        sb4.append("/ttnet_crash/upload");
        this.f34779j = sb4.toString();
    }
}
