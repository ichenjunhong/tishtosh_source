package com.aweme.storage;

import android.content.Context;
import android.os.FileObserver;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.aweme.storage.b */
final class C2549b {

    /* renamed from: a */
    static int f7921a;

    /* renamed from: b */
    static long f7922b;

    /* renamed from: c */
    static int f7923c;

    /* renamed from: d */
    static List<String> f7924d;

    /* renamed from: e */
    static List<FileObserver> f7925e;

    /* renamed from: f */
    static C2566i f7926f;

    /* renamed from: g */
    static C2565h f7927g;

    /* renamed from: h */
    static volatile boolean f7928h;

    /* renamed from: com.aweme.storage.b$a */
    static class C2551a extends FileObserver {

        /* renamed from: a */
        public C2575n f7929a;

        /* renamed from: b */
        public Context f7930b;

        public final void onEvent(int i, String str) {
            new StringBuilder("event path ").append(this.f7929a.f7973b);
            C0013i.m18a((Callable<TResult>) new Callable<Object>() {
                public final Object call() {
                    if (C2551a.this.f7930b != null) {
                        C2568k a = C2573m.m7520a(C2551a.this.f7930b);
                        if (a != null) {
                            a.mo7079b(C2551a.this.f7929a);
                        }
                    }
                    return null;
                }
            }, (Executor) C24076h.m58902c());
        }

        C2551a(Context context, C2575n nVar, int i) {
            super(nVar.f7973b, 547);
            this.f7929a = nVar;
            this.f7930b = context;
        }
    }

    /* renamed from: a */
    static List<C2575n> m7462a(Context context) {
        if (f7921a <= 0 || context == null) {
            return null;
        }
        C2568k a = C2573m.m7520a(context);
        if (a == null) {
            return null;
        }
        List<C2575n> a2 = a.mo7077a();
        if (a2.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C2575n nVar : a2) {
            if (!(nVar == null || nVar.f7973b == null)) {
                StringBuilder sb = new StringBuilder("black path ");
                sb.append(nVar.f7973b);
                sb.append("  ");
                sb.append(new Date(nVar.f7975d));
                sb.append(" ");
                sb.append(nVar.f7976e);
            }
            if (nVar == null || nVar.f7976e < f7923c || nVar.f7975d + f7922b >= System.currentTimeMillis()) {
                arrayList2.add(nVar);
            } else {
                new StringBuilder("expired files ").append(nVar.f7973b);
                arrayList.add(nVar);
            }
        }
        if (arrayList.size() > 0) {
            C2575n[] nVarArr = new C2575n[arrayList.size()];
            arrayList.toArray(nVarArr);
            a.mo7079b(nVarArr);
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb2 = new StringBuilder();
            for (C2575n nVar2 : nVarArr) {
                if (!(nVar2 == null || nVar2.f7973b == null)) {
                    sb2.append(nVar2.f7973b);
                    sb2.append(";");
                }
            }
            try {
                jSONObject.put("files", sb2.toString());
            } catch (JSONException unused) {
            }
            new StringBuilder("delete files ").append(jSONObject.toString());
            if (f7927g != null) {
                f7927g.mo7072a("delete_files", jSONObject);
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    static void m7463a(Context context, List<C2560a> list) {
        if (f7921a > 0 && context != null && list.size() > 0) {
            ArrayList<File> arrayList = new ArrayList<>();
            for (C2560a aVar : list) {
                if (!(aVar == null || aVar.mo7069b() == null)) {
                    new StringBuilder("get node path: ").append(aVar.mo7069b());
                    String b = aVar.mo7069b();
                    if (b.startsWith(C2561b.e.name()) && context.getExternalCacheDir() != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(context.getExternalCacheDir().getParent());
                        sb.append(b.substring(1));
                        b = sb.toString();
                    } else if (b.startsWith(C2561b.p.name()) && context.getCacheDir() != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(context.getCacheDir().getParent());
                        sb2.append(b.substring(1));
                        b = sb2.toString();
                    }
                    new StringBuilder("get node file path ").append(b);
                    File file = new File(b);
                    if (file.exists()) {
                        C2559e.m7484a(file, arrayList);
                    }
                }
            }
            Collections.sort(arrayList, new Comparator<File>() {
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    long j;
                    File file = (File) obj;
                    File file2 = (File) obj2;
                    long j2 = 0;
                    if (file == null) {
                        j = 0;
                    } else {
                        j = file.length();
                    }
                    if (file2 != null) {
                        j2 = file2.length();
                    }
                    if (j < j2) {
                        return 1;
                    }
                    if (j == j2) {
                        return 0;
                    }
                    return -1;
                }
            });
            ArrayList<C2575n> arrayList2 = new ArrayList<>();
            for (File file2 : arrayList) {
                if (file2 != null && arrayList2.size() < f7921a) {
                    if (f7924d != null) {
                        int i = 0;
                        while (i < f7924d.size() && !file2.getAbsolutePath().contains((CharSequence) f7924d.get(i))) {
                            i++;
                        }
                        if (i >= f7924d.size() && (f7926f == null || f7926f.mo7074a() == null || !f7926f.mo7074a().contains(file2.getAbsolutePath()))) {
                            arrayList2.add(new C2575n(file2.getAbsolutePath(), System.currentTimeMillis(), 1));
                        }
                    } else if (f7926f == null || f7926f.mo7074a() == null || !f7926f.mo7074a().contains(file2.getAbsolutePath())) {
                        arrayList2.add(new C2575n(file2.getAbsolutePath(), System.currentTimeMillis(), 1));
                    }
                }
            }
            for (C2575n nVar : arrayList2) {
                new StringBuilder("black list: ").append(nVar.f7973b);
            }
            C2573m.m7521a(context, arrayList2, f7921a);
        }
    }
}
