package com.p683ss.sys.p2584ck;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12743e;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.ttnet.p887e.C13333g;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p683ss.p1096a.p1097a.C18477a;
import com.p683ss.sys.p2584ck.C51438b;
import com.p683ss.sys.p2584ck.p2585a.C51426a;
import com.p683ss.sys.p2584ck.p2585a.C51434g;
import com.p683ss.sys.p2584ck.p2585a.C51435h;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.ss.sys.ck.b */
public final class C51438b {

    /* renamed from: a */
    public static String f128619a = "SCCheckLog";

    /* renamed from: b */
    public static String f128620b;

    /* renamed from: c */
    public static float f128621c = -1.0f;

    /* renamed from: d */
    public static HashMap<Integer, C51441a> f128622d = new HashMap<>();

    /* renamed from: e */
    public static boolean f128623e = false;

    /* renamed from: f */
    public static long f128624f = 5000;

    /* renamed from: g */
    public static long f128625g = 3600000;

    /* renamed from: h */
    private static int f128626h = 0;

    /* renamed from: com.ss.sys.ck.b$a */
    public static class C51441a {

        /* renamed from: a */
        public Integer f128627a;

        /* renamed from: b */
        public float f128628b;

        /* renamed from: c */
        public int f128629c;

        C51441a() {
        }

        C51441a(Integer num, float f, int i) {
            this.f128627a = num;
            this.f128628b = f;
            this.f128629c = 200;
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C18477a.m44714b());
        sb.append("/view");
        f128620b = sb.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(2:5|3)|15|6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x00a5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m110621a(java.lang.String r7) {
        /*
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x00a8 }
            r1.<init>(r7)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r7 = "challenge_setting"
            org.json.JSONArray r7 = r1.getJSONArray(r7)     // Catch:{ Exception -> 0x00a8 }
            r2 = 0
        L_0x000d:
            int r3 = r7.length()     // Catch:{ Exception -> 0x00a8 }
            if (r2 >= r3) goto L_0x0043
            org.json.JSONObject r3 = r7.getJSONObject(r2)     // Catch:{ Exception -> 0x00a8 }
            com.ss.sys.ck.b$a r4 = new com.ss.sys.ck.b$a     // Catch:{ Exception -> 0x00a8 }
            r4.<init>()     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r5 = "mode"
            int r5 = r3.getInt(r5)     // Catch:{ Exception -> 0x00a8 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x00a8 }
            r4.f128627a = r5     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r5 = "percent"
            double r5 = r3.getDouble(r5)     // Catch:{ Exception -> 0x00a8 }
            float r5 = (float) r5     // Catch:{ Exception -> 0x00a8 }
            r4.f128628b = r5     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r5 = "min_width"
            int r3 = r3.getInt(r5)     // Catch:{ Exception -> 0x00a8 }
            r4.f128629c = r3     // Catch:{ Exception -> 0x00a8 }
            java.util.HashMap<java.lang.Integer, com.ss.sys.ck.b$a> r3 = f128622d     // Catch:{ Exception -> 0x00a8 }
            java.lang.Integer r5 = r4.f128627a     // Catch:{ Exception -> 0x00a8 }
            r3.put(r5, r4)     // Catch:{ Exception -> 0x00a8 }
            int r2 = r2 + 1
            goto L_0x000d
        L_0x0043:
            java.lang.String r7 = "h5_url"
            java.lang.String r7 = r1.getString(r7)     // Catch:{ Exception -> 0x00a8 }
            f128620b = r7     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r7 = "alpha"
            double r2 = r1.getDouble(r7)     // Catch:{ Exception -> 0x00a8 }
            float r7 = (float) r2     // Catch:{ Exception -> 0x00a8 }
            f128621c = r7     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r7 = "vs_wait"
            r2 = 5000(0x1388, double:2.4703E-320)
            long r2 = r1.optLong(r7, r2)     // Catch:{ Exception -> 0x00a8 }
            f128624f = r2     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r7 = "vs_loop"
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            long r1 = r1.optLong(r7, r2)     // Catch:{ Exception -> 0x00a8 }
            f128625g = r1     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r7 = "[+]read package vs_wait=%d vs_loop=%d"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00a8 }
            long r2 = f128624f     // Catch:{ Exception -> 0x00a8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x00a8 }
            r1[r0] = r2     // Catch:{ Exception -> 0x00a8 }
            long r2 = f128625g     // Catch:{ Exception -> 0x00a8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x00a8 }
            r3 = 1
            r1[r3] = r2     // Catch:{ Exception -> 0x00a8 }
            com.C2240a.m6772a(r7, r1)     // Catch:{ Exception -> 0x00a8 }
            com.ss.sys.ck.SCCheckUtils r7 = com.p683ss.sys.p2584ck.SCCheckUtils.getInstance()     // Catch:{ Throwable -> 0x00a5 }
            android.content.Context r7 = r7.ctx     // Catch:{ Throwable -> 0x00a5 }
            java.lang.String r1 = "vs_wait"
            long r4 = f128624f     // Catch:{ Throwable -> 0x00a5 }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ Throwable -> 0x00a5 }
            java.lang.String r4 = "sdk_config"
            android.content.SharedPreferences r7 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r7, r4, r0)     // Catch:{ Throwable -> 0x00a5 }
            android.content.SharedPreferences$Editor r7 = r7.edit()     // Catch:{ Throwable -> 0x00a5 }
            long r4 = r2.longValue()     // Catch:{ Throwable -> 0x00a5 }
            android.content.SharedPreferences$Editor r7 = r7.putLong(r1, r4)     // Catch:{ Throwable -> 0x00a5 }
            r7.apply()     // Catch:{ Throwable -> 0x00a5 }
        L_0x00a5:
            f128623e = r3     // Catch:{ Exception -> 0x00a8 }
            return r3
        L_0x00a8:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = com.p683ss.p1096a.p1097a.C18477a.m44714b()
            r7.append(r1)
            java.lang.String r1 = "/view"
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            f128620b = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.sys.p2584ck.C51438b.m110621a(java.lang.String):boolean");
    }

    /* renamed from: a */
    public static void m110620a() {
        SCCheckUtils instance = SCCheckUtils.getInstance();
        if (instance != null) {
            StringBuilder sb = new StringBuilder();
            try {
                for (Entry entry : SCCheckUtils.sCallback.getRequestParams().entrySet()) {
                    if (entry.getValue() != null) {
                        try {
                            sb.append("&");
                            sb.append((String) entry.getKey());
                            sb.append("=");
                            sb.append(URLEncoder.encode((String) entry.getValue(), "utf-8"));
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            StringBuilder sb2 = new StringBuilder("?aid=");
            sb2.append(instance.appID);
            sb2.append("&lang=");
            sb2.append(instance.language);
            sb2.append("&app_name=");
            sb2.append(instance.appName);
            sb2.append("&iid=");
            sb2.append(instance.iid);
            sb2.append("&vc=");
            sb2.append(instance.versionCode);
            sb2.append("&did=");
            sb2.append(instance.deviceID);
            sb2.append("&ch=");
            sb2.append(instance.channel);
            sb2.append("&os=0");
            sb2.append(sb.toString());
            String sb3 = sb2.toString();
            try {
                C51435h hVar = new C51435h(instance.ctx, instance.session, sb3);
                ArrayList arrayList = new ArrayList();
                StringBuilder sb4 = new StringBuilder("sessionid=");
                sb4.append(hVar.f128614a);
                arrayList.add(new C12685b("Cookie", sb4.toString()));
                ((C51434g) C13333g.m26867b(hVar.f128616c).mo23937a(C51434g.class)).mo102185a(hVar.f128616c, (List<C12685b>) arrayList).enqueue(new C12743e<TypedInput>() {
                    /* renamed from: a */
                    public final void mo19942a(C12690b<TypedInput> bVar, C12799u<TypedInput> uVar) {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
                            InputStream in = ((TypedInput) uVar.f33552b).mo9554in();
                            while (true) {
                                int read = in.read(bArr, 0, PreloadTask.BYTE_UNIT_NUMBER);
                                if (read <= 0) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            if (byteArray != null) {
                                C51438b.m110621a(new String(byteArray));
                            }
                        } catch (Throwable unused) {
                        }
                    }

                    /* renamed from: a */
                    public final void mo19943a(C12690b<TypedInput> bVar, Throwable th) {
                    }
                });
            } catch (Throwable unused3) {
                new C51426a(instance.ctx, instance.session, sb3).mo37726a(2, 2, null);
            }
        }
    }
}
