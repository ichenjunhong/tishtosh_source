package com.p683ss.sys.ces;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12757k;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.ttnet.p887e.C13333g;
import com.p683ss.sys.ces.p2582c.C51397a;
import com.p683ss.sys.ces.p2582c.C51400d;
import com.p683ss.sys.ces.p2582c.C51401e;
import com.p683ss.sys.p2576a.C51372b;
import java.util.ArrayList;
import java.util.Calendar;
import org.json.JSONObject;

/* renamed from: com.ss.sys.ces.e */
public final class C51408e {
    /* renamed from: a */
    private static JSONObject m110566a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_id", C51393c.m110536b());
            jSONObject.put("did", C51393c.m110538d());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m110567a(int i, String str, Object obj) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", i);
            jSONObject.put("event", str);
            StringBuilder sb = new StringBuilder();
            sb.append(Calendar.getInstance().getTimeInMillis());
            jSONObject.put("ts", sb.toString());
            jSONObject.put("common_info", m110566a());
            jSONObject.put("custom_info", obj);
            z = false;
        } catch (Throwable unused) {
            z = true;
        }
        if (!z && jSONObject.length() > 0) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            C51372b a = C51372b.m110481a();
            if (a != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(currentTimeMillis);
                a.mo102050a(sb2.toString(), currentTimeMillis, jSONObject.toString());
            }
        }
    }

    /* renamed from: a */
    public static void m110568a(boolean z) {
        boolean z2;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long currentTimeMillis2 = (System.currentTimeMillis() / 1000) - 25200;
        String str = "";
        try {
            C51372b a = C51372b.m110481a();
            if (a != null) {
                str = a.mo102048a(currentTimeMillis2, ">?", 100);
            }
            z2 = false;
        } catch (Throwable unused) {
            z2 = true;
        }
        if (!z2 && str.length() > 0) {
            m110569a(str.getBytes());
        }
        try {
            C51372b a2 = C51372b.m110481a();
            if (a2 != null) {
                a2.mo102049a(currentTimeMillis2, "<?");
                a2.mo102049a(currentTimeMillis, "<?");
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    static void m110569a(byte[] bArr) {
        if (C51393c.f128502b) {
            try {
                C51401e eVar = new C51401e(C51393c.m110533a().f128514c, C51393c.m110540f(), 0);
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder("sessionid=");
                sb.append(eVar.f128531a);
                arrayList.add(new C12685b("Cookie", sb.toString()));
                ((C51400d) C13333g.m26867b(eVar.f128533c).mo23937a(C51400d.class)).mo102120a(eVar.f128533c, arrayList, new TypedByteArray("application/octet-stream", bArr, new String[0])).enqueue(new C12757k<TypedInput>() {
                    /* renamed from: a */
                    public final void mo19942a(C12690b<TypedInput> bVar, C12799u<TypedInput> uVar) {
                    }

                    /* renamed from: a */
                    public final void mo19943a(C12690b<TypedInput> bVar, Throwable th) {
                    }

                    /* JADX WARNING: Failed to process nested try/catch */
                    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003d */
                    /* JADX WARNING: Removed duplicated region for block: B:30:0x0052 A[SYNTHETIC, Splitter:B:30:0x0052] */
                    /* JADX WARNING: Removed duplicated region for block: B:34:0x0059 A[SYNTHETIC, Splitter:B:34:0x0059] */
                    /* JADX WARNING: Removed duplicated region for block: B:41:0x0060 A[SYNTHETIC, Splitter:B:41:0x0060] */
                    /* JADX WARNING: Removed duplicated region for block: B:45:0x0067 A[SYNTHETIC, Splitter:B:45:0x0067] */
                    /* renamed from: b */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void mo23905b(com.bytedance.retrofit2.C12690b<com.bytedance.retrofit2.mime.TypedInput> r6, com.bytedance.retrofit2.C12799u<com.bytedance.retrofit2.mime.TypedInput> r7) {
                        /*
                            r5 = this;
                            r6 = 0
                            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x005d, all -> 0x004c }
                            r0.<init>()     // Catch:{ Throwable -> 0x005d, all -> 0x004c }
                            r1 = 1024(0x400, float:1.435E-42)
                            byte[] r2 = new byte[r1]     // Catch:{ Throwable -> 0x004a, all -> 0x0045 }
                            T r7 = r7.f33552b     // Catch:{ Throwable -> 0x004a, all -> 0x0045 }
                            com.bytedance.retrofit2.mime.TypedInput r7 = (com.bytedance.retrofit2.mime.TypedInput) r7     // Catch:{ Throwable -> 0x004a, all -> 0x0045 }
                            java.io.InputStream r7 = r7.mo9554in()     // Catch:{ Throwable -> 0x004a, all -> 0x0045 }
                        L_0x0012:
                            r6 = 0
                            int r3 = r7.read(r2, r6, r1)     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
                            if (r3 <= 0) goto L_0x001d
                            r0.write(r2, r6, r3)     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
                            goto L_0x0012
                        L_0x001d:
                            byte[] r6 = r0.toByteArray()     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
                            if (r6 == 0) goto L_0x0038
                            java.lang.String r1 = new java.lang.String     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
                            r1.<init>(r6)     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
                            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
                            r6.<init>(r1)     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
                            java.lang.String r1 = "result"
                            java.lang.Object r6 = r6.get(r1)     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
                            java.lang.String r1 = "success"
                            r6.equals(r1)     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
                        L_0x0038:
                            if (r7 == 0) goto L_0x003d
                            r7.close()     // Catch:{ Throwable -> 0x003d }
                        L_0x003d:
                            r0.close()     // Catch:{ Throwable -> 0x0040 }
                        L_0x0040:
                            return
                        L_0x0041:
                            r6 = move-exception
                            goto L_0x0050
                        L_0x0043:
                            r6 = r7
                            goto L_0x005e
                        L_0x0045:
                            r7 = move-exception
                            r4 = r7
                            r7 = r6
                            r6 = r4
                            goto L_0x0050
                        L_0x004a:
                            goto L_0x005e
                        L_0x004c:
                            r7 = move-exception
                            r0 = r6
                            r6 = r7
                            r7 = r0
                        L_0x0050:
                            if (r7 == 0) goto L_0x0057
                            r7.close()     // Catch:{ Throwable -> 0x0056 }
                            goto L_0x0057
                        L_0x0056:
                        L_0x0057:
                            if (r0 == 0) goto L_0x005c
                            r0.close()     // Catch:{ Throwable -> 0x005c }
                        L_0x005c:
                            throw r6
                        L_0x005d:
                            r0 = r6
                        L_0x005e:
                            if (r6 == 0) goto L_0x0065
                            r6.close()     // Catch:{ Throwable -> 0x0064 }
                            goto L_0x0065
                        L_0x0064:
                        L_0x0065:
                            if (r0 == 0) goto L_0x006a
                            r0.close()     // Catch:{ Throwable -> 0x006a }
                        L_0x006a:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.sys.ces.p2582c.C51401e.C514021.mo23905b(com.bytedance.retrofit2.b, com.bytedance.retrofit2.u):void");
                    }
                });
            } catch (Throwable unused) {
            }
            return;
        }
        new C51397a(C51393c.m110533a().f128514c, C51393c.m110540f(), 0).mo37726a(1, 1, bArr);
    }
}
