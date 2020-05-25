package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.JsonReader;
import com.airbnb.lottie.p108c.C2400g;
import com.airbnb.lottie.p112d.C2405c;
import com.airbnb.lottie.p114f.C2454f;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.airbnb.lottie.f */
public final class C2442f {

    /* renamed from: a */
    public static final Map<String, C2476l<C2408e>> f7539a = new HashMap();

    /* renamed from: a */
    static String m7138a(int i) {
        StringBuilder sb = new StringBuilder("rawRes_");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public static C2476l<C2408e> m7134a(Context context, String str) {
        return C2405c.m7062a(context, str);
    }

    /* renamed from: b */
    public static C2475k<C2408e> m7141b(InputStream inputStream, String str) {
        return m7132a(inputStream, str, true);
    }

    /* renamed from: a */
    public static C2475k<C2408e> m7133a(ZipInputStream zipInputStream, String str) {
        try {
            return m7142b(zipInputStream, str);
        } finally {
            C2454f.m7180a((Closeable) zipInputStream);
        }
    }

    /* renamed from: b */
    public static C2475k<C2408e> m7139b(Context context, String str) {
        return new C2405c(context, str).mo6775a();
    }

    /* renamed from: c */
    public static C2476l<C2408e> m7143c(Context context, final String str) {
        final Context applicationContext = context.getApplicationContext();
        return m7137a(str, (Callable<C2475k<C2408e>>) new Callable<C2475k<C2408e>>() {
            public final /* synthetic */ Object call() throws Exception {
                return C2442f.m7144d(applicationContext, str);
            }
        });
    }

    /* renamed from: a */
    public static C2475k<C2408e> m7131a(Context context, int i) {
        try {
            return m7141b(context.getResources().openRawResource(i), m7138a(i));
        } catch (NotFoundException e) {
            return new C2475k<>((Throwable) e);
        }
    }

    /* renamed from: a */
    private static C2472h m7130a(C2408e eVar, String str) {
        for (C2472h hVar : eVar.f7517c.values()) {
            if (hVar.f7633d.equals(str)) {
                return hVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static C2475k<C2408e> m7144d(Context context, String str) {
        try {
            StringBuilder sb = new StringBuilder("asset_");
            sb.append(str);
            String sb2 = sb.toString();
            if (str.endsWith(".zip")) {
                return m7133a(new ZipInputStream(context.getAssets().open(str)), sb2);
            }
            return m7141b(context.getAssets().open(str), sb2);
        } catch (IOException e) {
            return new C2475k<>((Throwable) e);
        }
    }

    /* renamed from: a */
    public static C2476l<C2408e> m7135a(final JsonReader jsonReader, final String str) {
        return m7137a(str, (Callable<C2475k<C2408e>>) new Callable<C2475k<C2408e>>() {
            public final /* synthetic */ Object call() throws Exception {
                return C2442f.m7140b(jsonReader, str);
            }
        });
    }

    /* renamed from: b */
    private static C2475k<C2408e> m7142b(ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C2408e eVar = null;
            while (nextEntry != null) {
                if (!nextEntry.getName().contains("__MACOSX")) {
                    if (nextEntry.getName().contains(".json")) {
                        eVar = (C2408e) m7132a(zipInputStream, str, false).f7660a;
                    } else if (nextEntry.getName().contains(".png")) {
                        String[] split = nextEntry.getName().split("/");
                        hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            if (eVar == null) {
                return new C2475k<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Entry entry : hashMap.entrySet()) {
                C2472h a = m7130a(eVar, (String) entry.getKey());
                if (a != null) {
                    a.f7635f = (Bitmap) entry.getValue();
                }
            }
            for (Entry entry2 : eVar.f7517c.entrySet()) {
                if (((C2472h) entry2.getValue()).f7635f == null) {
                    StringBuilder sb = new StringBuilder("There is no image for ");
                    sb.append(((C2472h) entry2.getValue()).f7633d);
                    return new C2475k<>((Throwable) new IllegalStateException(sb.toString()));
                }
            }
            C2400g.m7054a().mo6767a(str, eVar);
            return new C2475k<>(eVar);
        } catch (IOException e) {
            return new C2475k<>((Throwable) e);
        }
    }

    /* renamed from: a */
    public static C2476l<C2408e> m7136a(final InputStream inputStream, final String str) {
        return m7137a(str, (Callable<C2475k<C2408e>>) new Callable<C2475k<C2408e>>() {
            public final /* synthetic */ Object call() throws Exception {
                return C2442f.m7141b(inputStream, str);
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cd, code lost:
        r20 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cf, code lost:
        r21 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x013e, code lost:
        r6 = r20;
        r7 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0142, code lost:
        r0 = r22;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0104 A[Catch:{ Exception -> 0x0182 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.airbnb.lottie.C2475k<com.airbnb.lottie.C2408e> m7140b(android.util.JsonReader r22, java.lang.String r23) {
        /*
            r0 = r22
            float r1 = com.airbnb.lottie.p114f.C2454f.m7176a()     // Catch:{ Exception -> 0x0182 }
            android.support.v4.f.g r2 = new android.support.v4.f.g     // Catch:{ Exception -> 0x0182 }
            r2.<init>()     // Catch:{ Exception -> 0x0182 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0182 }
            r3.<init>()     // Catch:{ Exception -> 0x0182 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ Exception -> 0x0182 }
            r4.<init>()     // Catch:{ Exception -> 0x0182 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ Exception -> 0x0182 }
            r5.<init>()     // Catch:{ Exception -> 0x0182 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ Exception -> 0x0182 }
            r6.<init>()     // Catch:{ Exception -> 0x0182 }
            android.support.v4.f.o r7 = new android.support.v4.f.o     // Catch:{ Exception -> 0x0182 }
            r7.<init>()     // Catch:{ Exception -> 0x0182 }
            com.airbnb.lottie.e r8 = new com.airbnb.lottie.e     // Catch:{ Exception -> 0x0182 }
            r8.<init>()     // Catch:{ Exception -> 0x0182 }
            r22.beginObject()     // Catch:{ Exception -> 0x0182 }
            r9 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x0032:
            boolean r15 = r22.hasNext()     // Catch:{ Exception -> 0x0182 }
            if (r15 == 0) goto L_0x0146
            java.lang.String r15 = r22.nextName()     // Catch:{ Exception -> 0x0182 }
            r16 = -1
            int r17 = r15.hashCode()     // Catch:{ Exception -> 0x0182 }
            r18 = 2
            r19 = 1
            switch(r17) {
                case -1408207997: goto L_0x00a7;
                case -1109732030: goto L_0x009d;
                case 104: goto L_0x0093;
                case 118: goto L_0x0089;
                case 119: goto L_0x007f;
                case 3276: goto L_0x0075;
                case 3367: goto L_0x006b;
                case 3553: goto L_0x0061;
                case 94623709: goto L_0x0056;
                case 97615364: goto L_0x004b;
                default: goto L_0x0049;
            }     // Catch:{ Exception -> 0x0182 }
        L_0x0049:
            goto L_0x00b1
        L_0x004b:
            java.lang.String r10 = "fonts"
            boolean r10 = r15.equals(r10)     // Catch:{ Exception -> 0x0182 }
            if (r10 == 0) goto L_0x00b1
            r10 = 8
            goto L_0x00b2
        L_0x0056:
            java.lang.String r10 = "chars"
            boolean r10 = r15.equals(r10)     // Catch:{ Exception -> 0x0182 }
            if (r10 == 0) goto L_0x00b1
            r10 = 9
            goto L_0x00b2
        L_0x0061:
            java.lang.String r10 = "op"
            boolean r10 = r15.equals(r10)     // Catch:{ Exception -> 0x0182 }
            if (r10 == 0) goto L_0x00b1
            r10 = 3
            goto L_0x00b2
        L_0x006b:
            java.lang.String r10 = "ip"
            boolean r10 = r15.equals(r10)     // Catch:{ Exception -> 0x0182 }
            if (r10 == 0) goto L_0x00b1
            r10 = 2
            goto L_0x00b2
        L_0x0075:
            java.lang.String r10 = "fr"
            boolean r10 = r15.equals(r10)     // Catch:{ Exception -> 0x0182 }
            if (r10 == 0) goto L_0x00b1
            r10 = 4
            goto L_0x00b2
        L_0x007f:
            java.lang.String r10 = "w"
            boolean r10 = r15.equals(r10)     // Catch:{ Exception -> 0x0182 }
            if (r10 == 0) goto L_0x00b1
            r10 = 0
            goto L_0x00b2
        L_0x0089:
            java.lang.String r10 = "v"
            boolean r10 = r15.equals(r10)     // Catch:{ Exception -> 0x0182 }
            if (r10 == 0) goto L_0x00b1
            r10 = 5
            goto L_0x00b2
        L_0x0093:
            java.lang.String r10 = "h"
            boolean r10 = r15.equals(r10)     // Catch:{ Exception -> 0x0182 }
            if (r10 == 0) goto L_0x00b1
            r10 = 1
            goto L_0x00b2
        L_0x009d:
            java.lang.String r10 = "layers"
            boolean r10 = r15.equals(r10)     // Catch:{ Exception -> 0x0182 }
            if (r10 == 0) goto L_0x00b1
            r10 = 6
            goto L_0x00b2
        L_0x00a7:
            java.lang.String r10 = "assets"
            boolean r10 = r15.equals(r10)     // Catch:{ Exception -> 0x0182 }
            if (r10 == 0) goto L_0x00b1
            r10 = 7
            goto L_0x00b2
        L_0x00b1:
            r10 = -1
        L_0x00b2:
            switch(r10) {
                case 0: goto L_0x0136;
                case 1: goto L_0x012d;
                case 2: goto L_0x0123;
                case 3: goto L_0x0114;
                case 4: goto L_0x010a;
                case 5: goto L_0x00d3;
                case 6: goto L_0x00ca;
                case 7: goto L_0x00c6;
                case 8: goto L_0x00c2;
                case 9: goto L_0x00be;
                default: goto L_0x00b5;
            }     // Catch:{ Exception -> 0x0182 }
        L_0x00b5:
            r20 = r6
            r21 = r7
            r22.skipValue()     // Catch:{ Exception -> 0x0182 }
            goto L_0x013e
        L_0x00be:
            com.airbnb.lottie.p113e.C2433r.m7118a(r0, r8, r7)     // Catch:{ Exception -> 0x0182 }
            goto L_0x00cd
        L_0x00c2:
            com.airbnb.lottie.p113e.C2433r.m7121a(r0, r6)     // Catch:{ Exception -> 0x0182 }
            goto L_0x00cd
        L_0x00c6:
            com.airbnb.lottie.p113e.C2433r.m7120a(r0, r8, r4, r5)     // Catch:{ Exception -> 0x0182 }
            goto L_0x00cd
        L_0x00ca:
            com.airbnb.lottie.p113e.C2433r.m7119a(r0, r8, r3, r2)     // Catch:{ Exception -> 0x0182 }
        L_0x00cd:
            r20 = r6
        L_0x00cf:
            r21 = r7
            goto L_0x013e
        L_0x00d3:
            java.lang.String r10 = r22.nextString()     // Catch:{ Exception -> 0x0182 }
            java.lang.String r15 = "\\."
            java.lang.String[] r10 = r10.split(r15)     // Catch:{ Exception -> 0x0182 }
            r15 = 0
            r16 = r10[r15]     // Catch:{ Exception -> 0x0182 }
            int r15 = java.lang.Integer.parseInt(r16)     // Catch:{ Exception -> 0x0182 }
            r16 = r10[r19]     // Catch:{ Exception -> 0x0182 }
            int r0 = java.lang.Integer.parseInt(r16)     // Catch:{ Exception -> 0x0182 }
            r10 = r10[r18]     // Catch:{ Exception -> 0x0182 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ Exception -> 0x0182 }
            r20 = r6
            r6 = 4
            if (r15 < r6) goto L_0x0100
            if (r15 <= r6) goto L_0x00f8
            goto L_0x0102
        L_0x00f8:
            if (r0 < r6) goto L_0x0100
            if (r0 <= r6) goto L_0x00fd
            goto L_0x0102
        L_0x00fd:
            if (r10 < 0) goto L_0x0100
            goto L_0x0102
        L_0x0100:
            r19 = 0
        L_0x0102:
            if (r19 != 0) goto L_0x00cf
            java.lang.String r0 = "Lottie only supports bodymovin >= 4.4.0"
            r8.mo6779a(r0)     // Catch:{ Exception -> 0x0182 }
            goto L_0x00cf
        L_0x010a:
            r20 = r6
            double r14 = r22.nextDouble()     // Catch:{ Exception -> 0x0182 }
            float r14 = (float) r14     // Catch:{ Exception -> 0x0182 }
            r6 = r20
            goto L_0x0142
        L_0x0114:
            r20 = r6
            r21 = r7
            double r6 = r22.nextDouble()     // Catch:{ Exception -> 0x0182 }
            float r0 = (float) r6     // Catch:{ Exception -> 0x0182 }
            r6 = 1008981770(0x3c23d70a, float:0.01)
            float r13 = r0 - r6
            goto L_0x013e
        L_0x0123:
            r20 = r6
            r21 = r7
            double r6 = r22.nextDouble()     // Catch:{ Exception -> 0x0182 }
            float r12 = (float) r6     // Catch:{ Exception -> 0x0182 }
            goto L_0x013e
        L_0x012d:
            r20 = r6
            r21 = r7
            int r11 = r22.nextInt()     // Catch:{ Exception -> 0x0182 }
            goto L_0x013e
        L_0x0136:
            r20 = r6
            r21 = r7
            int r9 = r22.nextInt()     // Catch:{ Exception -> 0x0182 }
        L_0x013e:
            r6 = r20
            r7 = r21
        L_0x0142:
            r0 = r22
            goto L_0x0032
        L_0x0146:
            r20 = r6
            r21 = r7
            r22.endObject()     // Catch:{ Exception -> 0x0182 }
            float r0 = (float) r9     // Catch:{ Exception -> 0x0182 }
            float r0 = r0 * r1
            int r0 = (int) r0     // Catch:{ Exception -> 0x0182 }
            float r6 = (float) r11     // Catch:{ Exception -> 0x0182 }
            float r6 = r6 * r1
            int r1 = (int) r6     // Catch:{ Exception -> 0x0182 }
            android.graphics.Rect r6 = new android.graphics.Rect     // Catch:{ Exception -> 0x0182 }
            r7 = 0
            r6.<init>(r7, r7, r0, r1)     // Catch:{ Exception -> 0x0182 }
            r8.f7522h = r6     // Catch:{ Exception -> 0x0182 }
            r8.f7523i = r12     // Catch:{ Exception -> 0x0182 }
            r8.f7524j = r13     // Catch:{ Exception -> 0x0182 }
            r8.f7525k = r14     // Catch:{ Exception -> 0x0182 }
            r8.f7521g = r3     // Catch:{ Exception -> 0x0182 }
            r8.f7520f = r2     // Catch:{ Exception -> 0x0182 }
            r8.f7516b = r4     // Catch:{ Exception -> 0x0182 }
            r8.f7517c = r5     // Catch:{ Exception -> 0x0182 }
            r0 = r21
            r8.f7519e = r0     // Catch:{ Exception -> 0x0182 }
            r0 = r20
            r8.f7518d = r0     // Catch:{ Exception -> 0x0182 }
            com.airbnb.lottie.c.g r0 = com.airbnb.lottie.p108c.C2400g.m7054a()     // Catch:{ Exception -> 0x0182 }
            r1 = r23
            r0.mo6767a(r1, r8)     // Catch:{ Exception -> 0x0182 }
            com.airbnb.lottie.k r0 = new com.airbnb.lottie.k     // Catch:{ Exception -> 0x0182 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0182 }
            return r0
        L_0x0182:
            r0 = move-exception
            com.airbnb.lottie.k r1 = new com.airbnb.lottie.k
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.C2442f.m7140b(android.util.JsonReader, java.lang.String):com.airbnb.lottie.k");
    }

    /* renamed from: a */
    static C2476l<C2408e> m7137a(final String str, Callable<C2475k<C2408e>> callable) {
        if (f7539a.containsKey(str)) {
            return (C2476l) f7539a.get(str);
        }
        C2476l<C2408e> lVar = new C2476l<>(callable);
        lVar.mo6869a((C2473i<T>) new C2473i<C2408e>() {
            /* renamed from: a */
            public final /* synthetic */ void mo6703a(Object obj) {
                C2408e eVar = (C2408e) obj;
                C2442f.f7539a.remove(str);
            }
        });
        lVar.mo6874c(new C2473i<Throwable>() {
            /* renamed from: a */
            public final /* synthetic */ void mo6703a(Object obj) {
                Throwable th = (Throwable) obj;
                C2442f.f7539a.remove(str);
            }
        });
        f7539a.put(str, lVar);
        return lVar;
    }

    /* renamed from: a */
    private static C2475k<C2408e> m7132a(InputStream inputStream, String str, boolean z) {
        try {
            return m7140b(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z) {
                C2454f.m7180a((Closeable) inputStream);
            }
        }
    }
}
