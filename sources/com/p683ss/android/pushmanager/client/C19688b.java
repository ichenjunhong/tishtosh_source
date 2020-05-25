package com.p683ss.android.pushmanager.client;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.message.C19487k;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.pushmanager.client.b */
public final class C19688b implements C9382a {

    /* renamed from: b */
    static C19688b f54195b;

    /* renamed from: a */
    public Messenger f54196a;

    /* renamed from: c */
    private WeakReference<Context> f54197c;

    /* renamed from: d */
    private Handler f54198d;

    /* renamed from: e */
    private Messenger f54199e;

    /* renamed from: f */
    private long f54200f;

    /* renamed from: g */
    private ServiceConnection f54201g = new ServiceConnection() {
        public final void onServiceDisconnected(ComponentName componentName) {
            C19688b.this.f54196a = null;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C19688b.this.f54196a = new Messenger(iBinder);
            C19688b.this.mo41041b();
        }
    };

    /* renamed from: a */
    public static void m48089a(Context context) {
        C19690c.m48095a(context);
    }

    /* renamed from: d */
    private void m48092d() {
        if (this.f54196a != null) {
            try {
                mo41040a();
                this.f54196a = null;
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo41040a() {
        try {
            if (!(this.f54196a == null || this.f54197c.get() == null)) {
                ((Context) this.f54197c.get()).unbindService(this.f54201g);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private void m48091c() {
        if (this.f54197c != null && this.f54197c.get() != null) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName((Context) this.f54197c.get(), "com.ss.android.message.log.LogService"));
                C19690c.m48096a((Context) this.f54197c.get(), intent, this.f54201g, 1);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo41041b() {
        try {
            Message obtain = Message.obtain(null, 0);
            obtain.replyTo = this.f54199e;
            Bundle bundle = new Bundle();
            bundle.putLong("start_id", this.f54200f);
            obtain.obj = bundle;
            this.f54196a.send(obtain);
        } catch (Throwable unused) {
            m48092d();
        }
    }

    /* renamed from: b */
    public static void m48090b(Context context) {
        if (context != null) {
            if (f54195b == null) {
                f54195b = new C19688b(context);
                return;
            }
            if (f54195b.f54196a == null) {
                f54195b.m48091c();
            }
        }
    }

    private C19688b(Context context) {
        this.f54197c = new WeakReference<>(context.getApplicationContext());
        Looper looper = C19487k.m47712a().f53817a;
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        this.f54198d = new C9381g(looper, this);
        this.f54199e = new Messenger(this.f54198d);
        m48091c();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00cc */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095 A[Catch:{ Throwable -> 0x00d8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            int r2 = r1.what     // Catch:{ Throwable -> 0x00d8 }
            if (r2 == 0) goto L_0x0010
            r1 = 2
            if (r2 == r1) goto L_0x000c
            goto L_0x000f
        L_0x000c:
            r19.m48092d()     // Catch:{ Throwable -> 0x00d8 }
        L_0x000f:
            return
        L_0x0010:
            com.ss.android.pushmanager.a.c$b r2 = com.p683ss.android.pushmanager.p1204a.C19664c.m48034b()     // Catch:{ Throwable -> 0x00d8 }
            if (r2 != 0) goto L_0x0017
            return
        L_0x0017:
            java.lang.Object r1 = r1.obj     // Catch:{ Throwable -> 0x00d8 }
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch:{ Throwable -> 0x00d8 }
            java.lang.String r2 = "events"
            java.lang.String r2 = r1.getString(r2)     // Catch:{ Throwable -> 0x00d8 }
            java.lang.String r3 = "has_more"
            boolean r1 = r1.getBoolean(r3)     // Catch:{ Throwable -> 0x00d8 }
            boolean r3 = com.bytedance.common.utility.C9431p.m18664a(r2)     // Catch:{ Throwable -> 0x00d8 }
            if (r3 != 0) goto L_0x00cf
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Throwable -> 0x00d8 }
            r3.<init>()     // Catch:{ Throwable -> 0x00d8 }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ Throwable -> 0x00d8 }
            r4.<init>(r2)     // Catch:{ Throwable -> 0x00d8 }
            int r2 = r4.length()     // Catch:{ Throwable -> 0x00d8 }
            r5 = 0
        L_0x003c:
            r6 = 0
            if (r5 >= r2) goto L_0x00a1
            org.json.JSONObject r7 = r4.optJSONObject(r5)     // Catch:{ Throwable -> 0x00d8 }
            if (r7 == 0) goto L_0x009e
            java.lang.String r8 = "category"
            java.lang.String r11 = r7.optString(r8)     // Catch:{ Throwable -> 0x00d8 }
            java.lang.String r8 = "tag"
            java.lang.String r12 = r7.optString(r8)     // Catch:{ Throwable -> 0x00d8 }
            java.lang.String r8 = "label"
            java.lang.String r13 = r7.optString(r8)     // Catch:{ Throwable -> 0x00d8 }
            java.lang.String r8 = "value"
            long r14 = r7.optLong(r8)     // Catch:{ Throwable -> 0x00d8 }
            java.lang.String r8 = "ext_value"
            long r16 = r7.optLong(r8)     // Catch:{ Throwable -> 0x00d8 }
            java.lang.String r8 = "ext_json"
            java.lang.String r8 = r7.optString(r8)     // Catch:{ Throwable -> 0x00d8 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Throwable -> 0x00d8 }
            if (r9 != 0) goto L_0x0077
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x0077 }
            r9.<init>(r8)     // Catch:{ Exception -> 0x0077 }
            r18 = r9
            goto L_0x0079
        L_0x0077:
            r18 = r6
        L_0x0079:
            com.ss.android.pushmanager.a.c$b r9 = com.p683ss.android.pushmanager.p1204a.C19664c.m48034b()     // Catch:{ Throwable -> 0x00d8 }
            java.lang.ref.WeakReference<android.content.Context> r6 = r0.f54197c     // Catch:{ Throwable -> 0x00d8 }
            java.lang.Object r6 = r6.get()     // Catch:{ Throwable -> 0x00d8 }
            r10 = r6
            android.content.Context r10 = (android.content.Context) r10     // Catch:{ Throwable -> 0x00d8 }
            r9.mo41010a(r10, r11, r12, r13, r14, r16, r18)     // Catch:{ Throwable -> 0x00d8 }
            java.lang.String r6 = "_id"
            long r6 = r7.optLong(r6)     // Catch:{ Throwable -> 0x00d8 }
            long r8 = r0.f54200f     // Catch:{ Throwable -> 0x00d8 }
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0097
            r0.f54200f = r6     // Catch:{ Throwable -> 0x00d8 }
        L_0x0097:
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Throwable -> 0x00d8 }
            r3.add(r6)     // Catch:{ Throwable -> 0x00d8 }
        L_0x009e:
            int r5 = r5 + 1
            goto L_0x003c
        L_0x00a1:
            int r2 = r3.size()     // Catch:{ Throwable -> 0x00d8 }
            if (r2 <= 0) goto L_0x00cf
            int r2 = r3.size()     // Catch:{ Throwable -> 0x00d8 }
            if (r2 <= 0) goto L_0x00cf
            r2 = 1
            android.os.Message r2 = android.os.Message.obtain(r6, r2)     // Catch:{ Throwable -> 0x00cc }
            android.os.Messenger r4 = r0.f54199e     // Catch:{ Throwable -> 0x00cc }
            r2.replyTo = r4     // Catch:{ Throwable -> 0x00cc }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ Throwable -> 0x00cc }
            r4.<init>()     // Catch:{ Throwable -> 0x00cc }
            java.lang.String r5 = "event_ids"
            long[] r3 = com.bytedance.common.utility.p522b.C9375a.m18556a(r3)     // Catch:{ Throwable -> 0x00cc }
            r4.putLongArray(r5, r3)     // Catch:{ Throwable -> 0x00cc }
            r2.obj = r4     // Catch:{ Throwable -> 0x00cc }
            android.os.Messenger r3 = r0.f54196a     // Catch:{ Throwable -> 0x00cc }
            r3.send(r2)     // Catch:{ Throwable -> 0x00cc }
            goto L_0x00cf
        L_0x00cc:
            r19.m48092d()     // Catch:{ Throwable -> 0x00d8 }
        L_0x00cf:
            if (r1 == 0) goto L_0x00d5
            r19.mo41041b()     // Catch:{ Throwable -> 0x00d8 }
            goto L_0x00d8
        L_0x00d5:
            r19.m48092d()     // Catch:{ Throwable -> 0x00d8 }
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.pushmanager.client.C19688b.handleMsg(android.os.Message):void");
    }
}
