package com.bytedance.crash.p551k;

import android.content.Context;
import com.bytedance.crash.C9577e;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p555n.C9695g;
import com.bytedance.crash.p555n.C9705m;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.k.h */
public final class C9652h {

    /* renamed from: c */
    private static C9652h f26345c;

    /* renamed from: a */
    File f26346a;

    /* renamed from: b */
    public File f26347b;

    /* renamed from: d */
    private File f26348d;

    /* renamed from: e */
    private Context f26349e;

    /* renamed from: f */
    private C9654a f26350f;

    /* renamed from: com.bytedance.crash.k.h$a */
    static class C9654a {

        /* renamed from: a */
        public long f26352a;

        /* renamed from: b */
        public long f26353b;

        /* renamed from: c */
        public File f26354c;

        /* renamed from: d */
        private JSONObject f26355d;

        /* renamed from: a */
        public final JSONObject mo17506a() {
            if (this.f26355d == null) {
                try {
                    this.f26355d = new JSONObject(C9695g.m19362c(this.f26354c.getAbsolutePath()));
                } catch (Throwable unused) {
                }
                if (this.f26355d == null) {
                    this.f26355d = new JSONObject();
                }
            }
            return this.f26355d;
        }

        private C9654a(File file) {
            this.f26354c = file;
            String[] split = file.getName().split("-|\\.");
            this.f26352a = Long.parseLong(split[0]);
            this.f26353b = Long.parseLong(split[1]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo17504b() {
        try {
            return C9695g.m19362c(this.f26346a.getAbsolutePath());
        } catch (Throwable unused) {
            return "0";
        }
    }

    /* renamed from: a */
    public static C9652h m19252a() {
        if (f26345c == null) {
            f26345c = new C9652h(C9616k.m19154f());
        }
        return f26345c;
    }

    /* renamed from: c */
    private ArrayList<C9654a> m19255c() {
        File[] listFiles = this.f26348d.listFiles(new FilenameFilter() {
            public final boolean accept(File file, String str) {
                return Pattern.compile("^\\d{1,13}-\\d{1,13}.ctx$").matcher(str).matches();
            }
        });
        ArrayList<C9654a> arrayList = new ArrayList<>();
        if (listFiles == null) {
            return arrayList;
        }
        C9654a aVar = null;
        for (File aVar2 : listFiles) {
            try {
                C9654a aVar3 = new C9654a(aVar2);
                arrayList.add(aVar3);
                if (this.f26350f == null && (aVar == null || aVar3.f26353b >= aVar.f26353b)) {
                    aVar = aVar3;
                }
            } catch (Throwable th) {
                C9577e.m18999a().mo17384a("NPTH_CATCH", th);
            }
        }
        if (this.f26350f == null && aVar != null) {
            this.f26350f = aVar;
        }
        return arrayList;
    }

    /* renamed from: a */
    public final String mo17501a(String str) {
        try {
            return C9695g.m19362c(this.f26347b.getAbsolutePath());
        } catch (Throwable unused) {
            return null;
        }
    }

    private C9652h(Context context) {
        File file = new File(C9705m.m19403f(context), "RuntimeContext");
        if (!file.exists() || (!file.isDirectory() && file.delete())) {
            file.mkdirs();
        }
        this.f26348d = file;
        this.f26346a = new File(file, "did");
        this.f26347b = new File(file, "device_uuid");
        this.f26349e = context;
    }

    /* renamed from: b */
    private void m19254b(long j) {
        boolean z;
        try {
            ArrayList c = m19255c();
            if (c.size() > 3) {
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    C9654a aVar = (C9654a) it.next();
                    if ((aVar.f26352a <= j || aVar.f26352a - j <= 604800000) && ((aVar.f26353b >= j || j - aVar.f26353b <= 604800000) && (aVar.f26354c.lastModified() >= j || j - aVar.f26354c.lastModified() <= 604800000))) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        aVar.f26354c.delete();
                    }
                }
            }
        } catch (Throwable th) {
            C9577e.m18999a().mo17384a("NPTH_CATCH", th);
        }
    }

    /* renamed from: a */
    public final JSONObject mo17502a(long j) {
        File file;
        File file2;
        boolean z;
        JSONObject jSONObject;
        String str;
        Iterator it = m19255c().iterator();
        while (true) {
            if (!it.hasNext()) {
                file = null;
                break;
            }
            C9654a aVar = (C9654a) it.next();
            if (j >= aVar.f26352a && j <= aVar.f26353b) {
                file = aVar.f26354c;
                break;
            }
        }
        if (file2 == null) {
            Iterator it2 = m19255c().iterator();
            C9654a aVar2 = null;
            while (it2.hasNext()) {
                C9654a aVar3 = (C9654a) it2.next();
                if (aVar2 == null || Math.abs(aVar2.f26353b - j) > Math.abs(aVar3.f26353b - j)) {
                    aVar2 = aVar3;
                }
            }
            if (aVar2 == null) {
                file2 = null;
            } else {
                file2 = aVar2.f26354c;
            }
            z = true;
        } else {
            z = false;
        }
        if (file2 != null) {
            try {
                str = C9695g.m19362c(file2.getAbsolutePath());
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                str = null;
                StringBuilder sb = new StringBuilder("content :");
                sb.append(str);
                C9577e.m18999a().mo17384a("NPTH_CATCH", new IOException(sb.toString(), th));
                jSONObject = null;
                jSONObject.put("unauthentic_version", 1);
                return jSONObject;
            }
            if (jSONObject != null && z) {
                jSONObject.put("unauthentic_version", 1);
            }
            return jSONObject;
        }
        jSONObject = null;
        try {
            jSONObject.put("unauthentic_version", 1);
        } catch (JSONException e) {
            C9577e.m18999a().mo17384a("NPTH_CATCH", e);
        }
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17503a(java.util.Map<java.lang.String, java.lang.Object> r10) {
        /*
            r9 = this;
            if (r10 != 0) goto L_0x0003
            return
        L_0x0003:
            android.content.Context r0 = r9.f26349e
            com.bytedance.crash.f.c r0 = com.bytedance.crash.p546f.C9586c.m19047a(r0)
            org.json.JSONObject r6 = r0.mo17410a(r10)
            boolean r10 = com.bytedance.crash.p546f.C9586c.m19058e(r6)
            if (r10 == 0) goto L_0x0014
            return
        L_0x0014:
            long r7 = java.lang.System.currentTimeMillis()
            com.bytedance.crash.k.h$a r10 = r9.f26350f
            if (r10 != 0) goto L_0x001f
            r9.m19255c()
        L_0x001f:
            com.bytedance.crash.k.h$a r10 = r9.f26350f
            if (r10 != 0) goto L_0x002a
            r1 = r9
            r2 = r7
            r4 = r7
            r1.m19253a(r2, r4, r6)
            return
        L_0x002a:
            org.json.JSONObject r0 = r10.mo17506a()
            boolean r1 = com.bytedance.crash.p546f.C9586c.m19058e(r0)
            if (r1 != 0) goto L_0x0060
            boolean r1 = com.bytedance.crash.p546f.C9586c.m19058e(r6)
            if (r1 == 0) goto L_0x003c
            r0 = 0
            goto L_0x0061
        L_0x003c:
            java.lang.String r1 = "update_version_code"
            java.lang.Object r1 = r6.opt(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "update_version_code"
            java.lang.Object r2 = r0.opt(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0060
            boolean r0 = com.bytedance.crash.p546f.C9586c.m19059f(r0)
            if (r0 == 0) goto L_0x005e
            r0 = 1
            goto L_0x0061
        L_0x005e:
            r0 = 3
            goto L_0x0061
        L_0x0060:
            r0 = 2
        L_0x0061:
            switch(r0) {
                case 1: goto L_0x009c;
                case 2: goto L_0x0095;
                case 3: goto L_0x0065;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x00a8
        L_0x0065:
            r10.f26353b = r7
            java.io.File r0 = new java.io.File
            java.io.File r1 = r10.f26354c
            java.lang.String r1 = r1.getParent()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r3 = r10.f26352a
            r2.append(r3)
            java.lang.String r3 = "-"
            r2.append(r3)
            long r3 = r10.f26353b
            r2.append(r3)
            java.lang.String r3 = ".ctx"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            java.io.File r10 = r10.f26354c
            r10.renameTo(r0)
            goto L_0x00a8
        L_0x0095:
            r1 = r9
            r2 = r7
            r4 = r7
            r1.m19253a(r2, r4, r6)
            goto L_0x00a8
        L_0x009c:
            long r2 = r10.f26352a
            r1 = r9
            r4 = r7
            r1.m19253a(r2, r4, r6)
            java.io.File r10 = r10.f26354c
            com.bytedance.crash.p555n.C9695g.m19357a(r10)
        L_0x00a8:
            r9.m19254b(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p551k.C9652h.mo17503a(java.util.Map):void");
    }

    /* renamed from: a */
    private void m19253a(long j, long j2, JSONObject jSONObject) {
        File file = this.f26348d;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("-");
        sb.append(j2);
        sb.append(".ctx");
        File file2 = new File(file, sb.toString());
        try {
            C9695g.m19353a(file2, jSONObject, false);
            this.f26350f = new C9654a(file2);
        } catch (IOException e) {
            C9577e.m18999a().mo17384a("NPTH_CATCH", e);
        }
    }
}
