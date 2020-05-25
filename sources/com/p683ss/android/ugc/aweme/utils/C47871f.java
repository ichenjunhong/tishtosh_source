package com.p683ss.android.ugc.aweme.utils;

import android.app.Application;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.LruCache;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.utils.f */
public final class C47871f {

    /* renamed from: a */
    public static final C47871f f120459a = C47873b.f120462a;

    /* renamed from: b */
    public static final C47872a f120460b = new C47872a(null);

    /* renamed from: c */
    private final LruCache<String, String> f120461c;

    /* renamed from: com.ss.android.ugc.aweme.utils.f$a */
    public static final class C47872a {
        private C47872a() {
        }

        /* renamed from: a */
        public static C47871f m103566a() {
            return C47871f.f120459a;
        }

        public /* synthetic */ C47872a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.f$b */
    static final class C47873b {

        /* renamed from: a */
        static final C47871f f120462a = new C47871f(null);

        /* renamed from: b */
        public static final C47873b f120463b = new C47873b();

        private C47873b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.f$c */
    static final class C47874c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C47871f f120464a;

        /* renamed from: b */
        final /* synthetic */ String f120465b;

        /* renamed from: c */
        final /* synthetic */ C47804db f120466c;

        C47874c(C47871f fVar, String str, C47804db dbVar) {
            this.f120464a = fVar;
            this.f120465b = str;
            this.f120466c = dbVar;
        }

        public final /* synthetic */ Object call() {
            return this.f120464a.mo95088b(this.f120465b, this.f120466c);
        }
    }

    /* renamed from: a */
    public static final C47871f m103559a() {
        return f120459a;
    }

    private C47871f() {
        this.f120461c = new LruCache<>(30);
    }

    public /* synthetic */ C47871f(C52707g gVar) {
        this();
    }

    /* renamed from: a */
    private final boolean m103561a(String str) {
        if (!C39629l.m88232a().mo58583n().mo83103a(C40790a.OpenSDKQAdaption) || ((VERSION.SDK_INT <= 28 && !C39629l.m88232a().mo58583n().mo83103a(C40790a.SDKQAdaptionConfig)) || m103562b(str))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m103562b(String str) {
        boolean z;
        File externalFilesDir = C39629l.m88233b().getExternalFilesDir(null);
        if (externalFilesDir != null) {
            String absolutePath = externalFilesDir.getAbsolutePath();
            C52711k.m112236a((Object) absolutePath, "it.absolutePath");
            z = C52830p.m112411b(str, absolutePath, false, 2, null);
        } else {
            z = false;
        }
        if (!z) {
            Application b = C39629l.m88233b();
            C52711k.m112236a((Object) b, "CameraClient.getApplication()");
            File filesDir = b.getFilesDir();
            C52711k.m112236a((Object) filesDir, "CameraClient.getApplication().filesDir");
            String absolutePath2 = filesDir.getAbsolutePath();
            C52711k.m112236a((Object) absolutePath2, "CameraClient.getApplicat…n().filesDir.absolutePath");
            if (!C52830p.m112411b(str, absolutePath2, false, 2, null)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo95087a(String str, C47804db dbVar) {
        C52711k.m112240b(str, "filePath");
        C52711k.m112240b(dbVar, "type");
        C0013i.m16a((Callable<TResult>) new C47874c<TResult>(this, str, dbVar));
    }

    /* renamed from: a */
    public static List<String> m103560a(List<String> list, C47804db dbVar) {
        C52711k.m112240b(list, "filePaths");
        C52711k.m112240b(dbVar, "type");
        List<String> arrayList = new ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(f120459a.mo95088b((String) list.get(i), dbVar));
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009b, code lost:
        if (r10 != null) goto L_0x009d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.net.Uri m103563c(java.lang.String r10, com.p683ss.android.ugc.aweme.utils.C47804db r11) {
        /*
            r9 = this;
            java.lang.System.currentTimeMillis()
            r0 = 0
            int[] r1 = com.p683ss.android.ugc.aweme.utils.C47908g.f120504a     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
            int r2 = r11.ordinal()     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
            r1 = r1[r2]     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
            switch(r1) {
                case 1: goto L_0x0019;
                case 2: goto L_0x0016;
                case 3: goto L_0x0013;
                default: goto L_0x000f;
            }     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
        L_0x000f:
            d.l r10 = new d.l     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
            goto L_0x008f
        L_0x0013:
            java.lang.String r1 = "_data= ?"
            goto L_0x001b
        L_0x0016:
            java.lang.String r1 = "_data= ?"
            goto L_0x001b
        L_0x0019:
            java.lang.String r1 = "_data= ?"
        L_0x001b:
            r5 = r1
            r1 = 1
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
            r8 = 0
            r6[r8] = r10     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
            java.lang.String r10 = "_id"
            r4[r8] = r10     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
            android.app.Application r10 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88233b()     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
            java.lang.String r1 = "CameraClient.getApplication()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r1)     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
            android.content.ContentResolver r2 = r10.getContentResolver()     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
            int[] r10 = com.p683ss.android.ugc.aweme.utils.C47908g.f120505b     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
            int r11 = r11.ordinal()     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
            r10 = r10[r11]     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
            switch(r10) {
                case 1: goto L_0x0053;
                case 2: goto L_0x004b;
                case 3: goto L_0x0043;
                default: goto L_0x0040;
            }     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
        L_0x0040:
            d.l r10 = new d.l     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
            goto L_0x008b
        L_0x0043:
            android.net.Uri r10 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
            java.lang.String r11 = "MediaStore.Audio.Media.EXTERNAL_CONTENT_URI"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
            goto L_0x005a
        L_0x004b:
            android.net.Uri r10 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
            java.lang.String r11 = "MediaStore.Video.Media.EXTERNAL_CONTENT_URI"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
            goto L_0x005a
        L_0x0053:
            android.net.Uri r10 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
            java.lang.String r11 = "MediaStore.Images.Media.EXTERNAL_CONTENT_URI"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
        L_0x005a:
            r3 = r10
            r7 = 0
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
            if (r10 != 0) goto L_0x006a
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x009b, all -> 0x0066 }
            goto L_0x006a
        L_0x0066:
            r11 = move-exception
            r0 = r10
            r10 = r11
            goto L_0x0094
        L_0x006a:
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x009b, all -> 0x0066 }
            if (r11 == 0) goto L_0x009d
            java.lang.String r11 = r10.getString(r8)     // Catch:{ Exception -> 0x009b, all -> 0x0066 }
            java.lang.String r1 = "external"
            android.net.Uri r1 = android.provider.MediaStore.Files.getContentUri(r1)     // Catch:{ Exception -> 0x009b, all -> 0x0066 }
            java.lang.String r2 = "id"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r2)     // Catch:{ Exception -> 0x009b, all -> 0x0066 }
            long r2 = java.lang.Long.parseLong(r11)     // Catch:{ Exception -> 0x009b, all -> 0x0066 }
            android.net.Uri r11 = android.content.ContentUris.withAppendedId(r1, r2)     // Catch:{ Exception -> 0x009b, all -> 0x0066 }
            r10.close()
            return r11
        L_0x008b:
            r10.<init>()     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
            throw r10     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
        L_0x008f:
            r10.<init>()     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
            throw r10     // Catch:{ Exception -> 0x009a, all -> 0x0093 }
        L_0x0093:
            r10 = move-exception
        L_0x0094:
            if (r0 == 0) goto L_0x0099
            r0.close()
        L_0x0099:
            throw r10
        L_0x009a:
            r10 = r0
        L_0x009b:
            if (r10 == 0) goto L_0x00a0
        L_0x009d:
            r10.close()
        L_0x00a0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.utils.C47871f.m103563c(java.lang.String, com.ss.android.ugc.aweme.utils.db):android.net.Uri");
    }

    /* renamed from: b */
    public final String mo95088b(String str, C47804db dbVar) {
        boolean z;
        String str2;
        boolean z2;
        C52711k.m112240b(str, "filePath");
        C52711k.m112240b(dbVar, "type");
        if (!m103561a(str)) {
            return str;
        }
        String str3 = (String) this.f120461c.get(str);
        CharSequence charSequence = str3;
        boolean z3 = false;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Uri c = m103563c(str, dbVar);
            if (c != null) {
                str2 = c.toString();
            } else {
                str2 = null;
            }
            CharSequence charSequence2 = str2;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                this.f120461c.put(str, str2);
            }
        } else {
            str2 = str3;
        }
        CharSequence charSequence3 = str2;
        if (charSequence3 == null || charSequence3.length() == 0) {
            z3 = true;
        }
        if (!z3) {
            return str2;
        }
        return str;
    }
}
