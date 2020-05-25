package com.p683ss.android.pushmanager.thirdparty;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.p683ss.android.message.C19487k;
import com.p683ss.android.pushmanager.setting.C19710b;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.pushmanager.thirdparty.b */
public class C19712b implements Runnable {

    /* renamed from: a */
    private static final String f54265a = IPushDepend.SEND_PUSH_TOKEN_URL;

    /* renamed from: c */
    private static final Map<Integer, String> f54266c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final Map<Integer, Object> f54267d = new HashMap();

    /* renamed from: b */
    private final ISendTokenCallBack f54268b;

    /* renamed from: e */
    private int f54269e = 10;

    /* renamed from: f */
    private Context f54270f;

    /* renamed from: g */
    private final Handler f54271g = new Handler(C19487k.m47712a().f53817a) {
        public final void handleMessage(Message message) {
            String str;
            super.handleMessage(message);
            C19712b bVar = C19712b.this;
            if (message.what == 1) {
                try {
                    boolean z = false;
                    switch (message.arg1) {
                        case 10:
                            break;
                        case 11:
                            z = true;
                            break;
                    }
                    StringBuilder sb = new StringBuilder("Send token ");
                    if (z) {
                        str = "success";
                    } else {
                        str = "fail";
                    }
                    sb.append(str);
                    if (z) {
                        int i = message.arg2;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        StringBuilder sb2 = new StringBuilder("push_token_sent_");
                        sb2.append(i);
                        linkedHashMap.put(sb2.toString(), Boolean.valueOf(true));
                        if (message.obj instanceof String) {
                            linkedHashMap.put(C19712b.m48200a(i), message.obj);
                        }
                        C19710b.m48173a().mo41091b((Map<String, ?>) linkedHashMap);
                    } else {
                        bVar.mo41111a((String) message.obj);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    };

    /* renamed from: h */
    private int f54272h = 0;

    public void run() {
        Object obj;
        if (this.f54270f != null && this.f54268b != null) {
            synchronized (C19712b.class) {
                obj = f54267d.get(Integer.valueOf(this.f54268b.getType()));
                if (obj == null) {
                    obj = new Object();
                    f54267d.put(Integer.valueOf(this.f54268b.getType()), obj);
                }
            }
            synchronized (obj) {
                m48201a(this.f54268b);
            }
        }
    }

    /* renamed from: a */
    static String m48200a(int i) {
        StringBuilder sb = new StringBuilder("push_token_");
        sb.append(i);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo41111a(String str) {
        try {
            this.f54272h++;
            if (this.f54272h <= 3 && !TextUtils.isEmpty(str)) {
                C19487k.m47712a().mo40630a(new Runnable() {
                    public final void run() {
                        C19712b.this.run();
                    }
                }, TimeUnit.SECONDS.toMillis(4) * ((long) this.f54272h));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d3 A[Catch:{ Throwable -> 0x00e2 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m48201a(com.p683ss.android.pushmanager.thirdparty.ISendTokenCallBack r10) {
        /*
            r9 = this;
            if (r10 != 0) goto L_0x0003
            return
        L_0x0003:
            android.content.Context r0 = r9.f54270f
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            r0 = 0
            r1 = 10
            r2 = 0
            r3 = 1
            android.content.Context r4 = r9.f54270f     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String r4 = r10.getToken(r4)     // Catch:{ Throwable -> 0x00e0 }
            int r10 = r10.getType()     // Catch:{ Throwable -> 0x00e1 }
            boolean r0 = com.p683ss.android.pushmanager.C19702h.m48132a(r10)     // Catch:{ Throwable -> 0x00e2 }
            if (r0 != 0) goto L_0x001e
            return
        L_0x001e:
            java.util.Map<java.lang.Integer, java.lang.String> r0 = f54266c     // Catch:{ Throwable -> 0x00e2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x00e2 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ Throwable -> 0x00e2 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Throwable -> 0x00e2 }
            boolean r0 = android.text.TextUtils.equals(r4, r0)     // Catch:{ Throwable -> 0x00e2 }
            if (r0 == 0) goto L_0x0034
            com.p683ss.android.pushmanager.p1205b.C19679d.m48079b(r10)     // Catch:{ Throwable -> 0x00e2 }
            return
        L_0x0034:
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x00e2 }
            if (r0 != 0) goto L_0x00d6
            com.ss.android.pushmanager.a.d r0 = com.p683ss.android.pushmanager.p1204a.C19667d.m48045a()     // Catch:{ Throwable -> 0x00e2 }
            java.util.Map r0 = r0.mo41019c()     // Catch:{ Throwable -> 0x00e2 }
            java.lang.String r5 = f54265a     // Catch:{ Throwable -> 0x00e2 }
            java.lang.String r0 = com.p683ss.android.message.p1191b.C19470k.m47653a(r5, r0)     // Catch:{ Throwable -> 0x00e2 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Throwable -> 0x00e2 }
            r5.<init>()     // Catch:{ Throwable -> 0x00e2 }
            android.util.Pair r6 = new android.util.Pair     // Catch:{ Throwable -> 0x00e2 }
            java.lang.String r7 = "token"
            r6.<init>(r7, r4)     // Catch:{ Throwable -> 0x00e2 }
            r5.add(r6)     // Catch:{ Throwable -> 0x00e2 }
            android.util.Pair r6 = new android.util.Pair     // Catch:{ Throwable -> 0x00e2 }
            java.lang.String r7 = "type"
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch:{ Throwable -> 0x00e2 }
            r6.<init>(r7, r8)     // Catch:{ Throwable -> 0x00e2 }
            r5.add(r6)     // Catch:{ Throwable -> 0x00e2 }
            java.lang.String r0 = com.p683ss.android.message.p1191b.C19470k.m47652a(r0, r5)     // Catch:{ Throwable -> 0x00e2 }
            r6 = 103(0x67, float:1.44E-43)
            com.bytedance.common.utility.k r7 = com.bytedance.common.utility.C9423k.m18637a()     // Catch:{ Throwable -> 0x00a3 }
            java.lang.String r0 = r7.mo17061a(r0, r5)     // Catch:{ Throwable -> 0x00a3 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00a3 }
            r5.<init>(r0)     // Catch:{ Throwable -> 0x00a3 }
            java.lang.String r0 = "success"
            java.lang.String r7 = "message"
            java.lang.String r5 = r5.optString(r7)     // Catch:{ Throwable -> 0x00a3 }
            boolean r0 = r0.equals(r5)     // Catch:{ Throwable -> 0x00a3 }
            if (r0 == 0) goto L_0x0099
            r0 = 200(0xc8, float:2.8E-43)
            java.util.Map<java.lang.Integer, java.lang.String> r2 = f54266c     // Catch:{ Throwable -> 0x0096 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x0096 }
            r2.put(r5, r4)     // Catch:{ Throwable -> 0x0096 }
            com.p683ss.android.pushmanager.p1205b.C19679d.m48079b(r10)     // Catch:{ Throwable -> 0x0096 }
            r2 = 1
            goto L_0x00ae
        L_0x0096:
            r0 = move-exception
            r2 = 1
            goto L_0x00a4
        L_0x0099:
            r0 = -200(0xffffffffffffff38, float:NaN)
            java.lang.String r5 = "-200"
            java.lang.String r7 = "server 返回更新失败"
            com.p683ss.android.pushmanager.p1205b.C19679d.m48075a(r10, r6, r5, r7)     // Catch:{ Throwable -> 0x00a3 }
            goto L_0x00ae
        L_0x00a3:
            r0 = move-exception
        L_0x00a4:
            java.lang.String r5 = "1"
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch:{ Throwable -> 0x00e2 }
            com.p683ss.android.pushmanager.p1205b.C19679d.m48075a(r10, r6, r5, r0)     // Catch:{ Throwable -> 0x00e2 }
            r0 = 1
        L_0x00ae:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00cc }
            r5.<init>()     // Catch:{ Throwable -> 0x00cc }
            java.lang.String r6 = "label"
            java.lang.String r7 = "send_token"
            r5.put(r6, r7)     // Catch:{ Throwable -> 0x00cc }
            java.lang.String r6 = "status"
            r5.put(r6, r0)     // Catch:{ Throwable -> 0x00cc }
            java.lang.String r0 = "token"
            r5.put(r0, r4)     // Catch:{ Throwable -> 0x00cc }
            java.lang.String r0 = "type"
            r5.put(r0, r10)     // Catch:{ Throwable -> 0x00cc }
            com.p683ss.android.pushmanager.C19700f.m48124a()     // Catch:{ Throwable -> 0x00cc }
        L_0x00cc:
            if (r2 == 0) goto L_0x00d3
            r0 = 11
            r9.f54269e = r0     // Catch:{ Throwable -> 0x00e2 }
            goto L_0x00e4
        L_0x00d3:
            r9.f54269e = r1     // Catch:{ Throwable -> 0x00e2 }
            goto L_0x00e4
        L_0x00d6:
            r0 = 102(0x66, float:1.43E-43)
            java.lang.String r2 = "0"
            java.lang.String r5 = "token 为空"
            com.p683ss.android.pushmanager.p1205b.C19679d.m48075a(r10, r0, r2, r5)     // Catch:{ Throwable -> 0x00e2 }
            goto L_0x00e4
        L_0x00e0:
            r4 = r0
        L_0x00e1:
            r10 = 0
        L_0x00e2:
            r9.f54269e = r1
        L_0x00e4:
            android.os.Handler r0 = r9.f54271g
            int r1 = r9.f54269e
            android.os.Message r10 = r0.obtainMessage(r3, r1, r10, r4)
            r10.sendToTarget()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.pushmanager.thirdparty.C19712b.m48201a(com.ss.android.pushmanager.thirdparty.ISendTokenCallBack):void");
    }

    C19712b(Context context, ISendTokenCallBack iSendTokenCallBack) {
        this.f54270f = context;
        this.f54268b = iSendTokenCallBack;
    }
}
