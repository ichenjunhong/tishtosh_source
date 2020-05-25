package com.p683ss.android.newmedia.redbadge;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.message.log.C19492c;
import com.p683ss.android.newmedia.redbadge.p1200b.C19598a;
import com.p683ss.android.pushmanager.C19698d;
import com.p683ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ss.android.newmedia.redbadge.d */
public class C19602d implements C9382a {

    /* renamed from: p */
    private static volatile C19602d f53998p;

    /* renamed from: a */
    public boolean f53999a;

    /* renamed from: b */
    public C19698d f54000b;

    /* renamed from: c */
    public Context f54001c;

    /* renamed from: d */
    public final C9381g f54002d = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: e */
    public boolean f54003e;

    /* renamed from: f */
    public int f54004f;

    /* renamed from: g */
    public String f54005g;

    /* renamed from: h */
    public String f54006h;

    /* renamed from: i */
    public String f54007i;

    /* renamed from: j */
    public long f54008j;

    /* renamed from: k */
    public long f54009k;

    /* renamed from: l */
    public long f54010l;

    /* renamed from: m */
    public int f54011m;

    /* renamed from: n */
    final BroadcastReceiver f54012n = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            if (context != null && intent != null) {
                try {
                    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && C19608e.m47953a(context) && C19602d.this.f53999a) {
                        C19602d.this.f54002d.sendEmptyMessage(0);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    };

    /* renamed from: o */
    public AtomicBoolean f54013o = new AtomicBoolean(false);

    /* renamed from: q */
    private int f54014q;

    /* renamed from: r */
    private long f54015r;

    /* renamed from: s */
    private boolean f54016s = false;

    /* renamed from: t */
    private ContentObserver f54017t = new ContentObserver(this.f54002d) {
        public final void onChange(boolean z) {
            C19602d.this.mo40857a(C19602d.this.f54001c);
        }
    };

    /* renamed from: u */
    private ContentObserver f54018u = new ContentObserver(this.f54002d) {
        public final void onChange(boolean z) {
            C19602d.this.mo40857a(C19602d.this.f54001c);
        }
    };

    /* renamed from: v */
    private ContentObserver f54019v = new ContentObserver(this.f54002d) {
        public final void onChange(boolean z) {
            C19602d.this.mo40859b(C19602d.this.f54001c);
        }
    };

    /* JADX WARNING: Can't wrap try/catch for region: R(4:29|(1:36)(1:35)|37|38) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00f1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40856a() {
        /*
            r13 = this;
            android.content.Context r0 = r13.f54001c
            com.ss.android.newmedia.redbadge.b.a r0 = com.p683ss.android.newmedia.redbadge.p1200b.C19598a.m47924a(r0)
            com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$b r0 = r0.f53996a
            java.lang.String r1 = "red_badge_last_valid_response"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.mo41081a(r1, r2)
            android.content.Context r1 = r13.f54001c
            com.ss.android.newmedia.redbadge.b.a r1 = com.p683ss.android.newmedia.redbadge.p1200b.C19598a.m47924a(r1)
            com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$b r1 = r1.f53996a
            java.lang.String r2 = "red_badge_is_use_last_valid_response"
            r3 = 1
            boolean r1 = r1.mo41082a(r2, r3)
            if (r1 == 0) goto L_0x0113
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0113
            android.content.Context r1 = r13.f54001c     // Catch:{ Exception -> 0x0113 }
            com.ss.android.newmedia.redbadge.b.a r1 = com.p683ss.android.newmedia.redbadge.p1200b.C19598a.m47924a(r1)     // Catch:{ Exception -> 0x0113 }
            int r1 = r1.mo40854h()     // Catch:{ Exception -> 0x0113 }
            long r4 = r13.f54009k     // Catch:{ Exception -> 0x0113 }
            boolean r2 = android.text.format.DateUtils.isToday(r4)     // Catch:{ Exception -> 0x0113 }
            r4 = 0
            if (r2 != 0) goto L_0x003d
            if (r1 <= 0) goto L_0x003d
            r1 = 0
        L_0x003d:
            int r2 = r13.f54004f     // Catch:{ Exception -> 0x0113 }
            if (r1 < r2) goto L_0x0051
            android.content.Context r5 = r13.f54001c     // Catch:{ Exception -> 0x0113 }
            java.lang.String r6 = "umeng"
            java.lang.String r7 = "red_badge"
            java.lang.String r8 = "outdo_max_show_times"
            long r9 = (long) r1     // Catch:{ Exception -> 0x0113 }
            int r0 = r13.f54004f     // Catch:{ Exception -> 0x0113 }
            long r11 = (long) r0     // Catch:{ Exception -> 0x0113 }
            com.p683ss.android.message.log.C19492c.m47723a(r5, r6, r7, r8, r9, r11)     // Catch:{ Exception -> 0x0113 }
            return
        L_0x0051:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0113 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0113 }
            java.lang.String r0 = "success"
            java.lang.String r2 = "reason"
            java.lang.String r2 = r1.getString(r2)     // Catch:{ Exception -> 0x0113 }
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0113 }
            if (r0 == 0) goto L_0x0107
            java.lang.String r0 = "content"
            int r0 = r1.optInt(r0, r4)     // Catch:{ Exception -> 0x0113 }
            java.lang.String r2 = "content"
            int r0 = r0 + r3
            r1.put(r2, r0)     // Catch:{ Exception -> 0x0113 }
            android.content.Context r0 = r13.f54001c     // Catch:{ Exception -> 0x0113 }
            java.lang.String r2 = "red_badge"
            java.lang.String r5 = "use_last_valid_response"
            org.json.JSONObject[] r6 = new org.json.JSONObject[r3]     // Catch:{ Exception -> 0x0113 }
            r6[r4] = r1     // Catch:{ Exception -> 0x0113 }
            com.p683ss.android.message.log.C19492c.m47725a(r0, r2, r5, r6)     // Catch:{ Exception -> 0x0113 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0113 }
            r13.f54010l = r5     // Catch:{ Exception -> 0x0113 }
            java.lang.String r0 = "next_query_interval"
            int r0 = r1.optInt(r0, r4)     // Catch:{ Exception -> 0x0113 }
            int r0 = r0 + 600
            r13.f54011m = r0     // Catch:{ Exception -> 0x0113 }
            android.content.Context r0 = r13.f54001c     // Catch:{ Throwable -> 0x00f1 }
            com.ss.android.newmedia.redbadge.b.a r0 = com.p683ss.android.newmedia.redbadge.p1200b.C19598a.m47924a(r0)     // Catch:{ Throwable -> 0x00f1 }
            java.lang.String r2 = r1.toString()     // Catch:{ Throwable -> 0x00f1 }
            r0.mo40851e(r2)     // Catch:{ Throwable -> 0x00f1 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Throwable -> 0x00f1 }
            java.lang.String r2 = "com.ss.android.redbadge.message"
            r0.<init>(r2)     // Catch:{ Throwable -> 0x00f1 }
            java.lang.String r2 = "message_data"
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x00f1 }
            r0.putExtra(r2, r1)     // Catch:{ Throwable -> 0x00f1 }
            android.content.Context r1 = r13.f54001c     // Catch:{ Throwable -> 0x00f1 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ Throwable -> 0x00f1 }
            r0.setPackage(r1)     // Catch:{ Throwable -> 0x00f1 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x00f1 }
            r2 = 26
            if (r1 < r2) goto L_0x00dc
            int r1 = com.p683ss.android.message.C19408a.m47502b()     // Catch:{ Throwable -> 0x00f1 }
            if (r1 < r2) goto L_0x00dc
            android.content.Context r1 = r13.f54001c     // Catch:{ Throwable -> 0x00f1 }
            com.ss.android.newmedia.redbadge.k r2 = new com.ss.android.newmedia.redbadge.k     // Catch:{ Throwable -> 0x00f1 }
            android.content.Context r4 = r13.f54001c     // Catch:{ Throwable -> 0x00f1 }
            r2.<init>(r0, r3, r4)     // Catch:{ Throwable -> 0x00f1 }
            if (r1 == 0) goto L_0x00d8
            boolean r4 = r1 instanceof android.content.Context     // Catch:{ Throwable -> 0x00f1 }
            if (r4 == 0) goto L_0x00d8
            r4 = r1
            android.content.Context r4 = (android.content.Context) r4     // Catch:{ Throwable -> 0x00f1 }
            boolean r4 = com.p683ss.android.ugc.aweme.push.downgrade.C40895d.m90464a(r4, r0)     // Catch:{ Throwable -> 0x00f1 }
            if (r4 == 0) goto L_0x00d8
            goto L_0x00f1
        L_0x00d8:
            r1.bindService(r0, r2, r3)     // Catch:{ Throwable -> 0x00f1 }
            goto L_0x00f1
        L_0x00dc:
            android.content.Context r1 = r13.f54001c     // Catch:{ Throwable -> 0x00f1 }
            if (r1 == 0) goto L_0x00ee
            boolean r2 = r1 instanceof android.content.Context     // Catch:{ Throwable -> 0x00f1 }
            if (r2 == 0) goto L_0x00ee
            r2 = r1
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ Throwable -> 0x00f1 }
            boolean r2 = com.p683ss.android.ugc.aweme.push.downgrade.C40895d.m90464a(r2, r0)     // Catch:{ Throwable -> 0x00f1 }
            if (r2 == 0) goto L_0x00ee
            goto L_0x00f1
        L_0x00ee:
            r1.startService(r0)     // Catch:{ Throwable -> 0x00f1 }
        L_0x00f1:
            android.content.Context r0 = r13.f54001c     // Catch:{ Exception -> 0x0113 }
            com.ss.android.newmedia.redbadge.b.a r0 = com.p683ss.android.newmedia.redbadge.p1200b.C19598a.m47924a(r0)     // Catch:{ Exception -> 0x0113 }
            long r1 = r13.f54010l     // Catch:{ Exception -> 0x0113 }
            r0.mo40839a(r1)     // Catch:{ Exception -> 0x0113 }
            android.content.Context r0 = r13.f54001c     // Catch:{ Exception -> 0x0113 }
            com.ss.android.newmedia.redbadge.b.a r0 = com.p683ss.android.newmedia.redbadge.p1200b.C19598a.m47924a(r0)     // Catch:{ Exception -> 0x0113 }
            int r1 = r13.f54011m     // Catch:{ Exception -> 0x0113 }
            r0.mo40838a(r1)     // Catch:{ Exception -> 0x0113 }
        L_0x0107:
            android.content.Context r0 = r13.f54001c     // Catch:{ Exception -> 0x0113 }
            com.ss.android.newmedia.redbadge.b.a r0 = com.p683ss.android.newmedia.redbadge.p1200b.C19598a.m47924a(r0)     // Catch:{ Exception -> 0x0113 }
            long r1 = r13.f54010l     // Catch:{ Exception -> 0x0113 }
            r0.mo40839a(r1)     // Catch:{ Exception -> 0x0113 }
            return
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.newmedia.redbadge.C19602d.mo40856a():void");
    }

    /* renamed from: a */
    public static C19602d m47945a(C19698d dVar) {
        if (f53998p == null) {
            synchronized (C19602d.class) {
                if (f53998p == null) {
                    f53998p = new C19602d(dVar);
                }
            }
        }
        return f53998p;
    }

    /* renamed from: b */
    public static long m47947b(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return new JSONObject(str).optLong("rule_id");
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public final JSONObject mo40855a(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (C9431p.m18664a(str)) {
            return jSONObject2;
        }
        try {
            jSONObject = new JSONObject(str);
            try {
                m47946a(jSONObject, "launch");
                m47946a(jSONObject, "leave");
                m47946a(jSONObject, "badge");
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            jSONObject = jSONObject2;
        }
        return jSONObject;
    }

    /* renamed from: b */
    public final void mo40859b(Context context) {
        if (context != null) {
            try {
                this.f54010l = C19598a.m47924a(this.f54001c).mo40845c();
                this.f54011m = C19598a.m47924a(this.f54001c).mo40848d();
                this.f54006h = C19598a.m47924a(this.f54001c).mo40850e();
                this.f54007i = C19598a.m47924a(this.f54001c).mo40852f();
                if (!C9431p.m18664a(this.f54006h)) {
                    JSONObject jSONObject = new JSONObject(this.f54006h);
                    this.f54008j = jSONObject.optLong("launch");
                    this.f54015r = jSONObject.optLong("leave");
                    this.f54009k = jSONObject.optLong("badge");
                }
            } catch (Throwable unused) {
            }
        }
    }

    private C19602d(C19698d dVar) {
        this.f54000b = dVar;
        this.f54001c = dVar.mo41047a().getApplicationContext();
        mo40857a(this.f54001c);
        Context context = this.f54001c;
        if (context != null) {
            try {
                context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.m48145a(context, "is_desktop_red_badge_show", "boolean"), true, this.f54017t);
                context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.m48145a(context, "desktop_red_badge_args", "string"), true, this.f54018u);
                context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.m48145a(context, "red_badge_last_time_paras", "string"), true, this.f54019v);
            } catch (Throwable unused) {
            }
        }
        if (this.f54003e) {
            this.f54001c.registerReceiver(this.f54012n, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            mo40859b(this.f54001c);
            this.f54002d.sendEmptyMessageDelayed(0, 10000);
        }
        this.f53999a = true;
    }

    /* renamed from: a */
    public final void mo40857a(Context context) {
        if (context != null) {
            try {
                this.f54003e = C19598a.m47924a(this.f54001c).mo40841a();
                String b = C19598a.m47924a(this.f54001c).mo40842b();
                if (!C9431p.m18664a(b)) {
                    JSONObject jSONObject = new JSONObject(b);
                    this.f54004f = jSONObject.optInt("max_show_times", 5);
                    this.f54014q = jSONObject.optInt("query_waiting_duration", 30);
                    this.f54005g = jSONObject.optString("strategy");
                    if (!this.f54003e) {
                        this.f54002d.removeMessages(0);
                        this.f54002d.removeMessages(1);
                        this.f54002d.removeMessages(2);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0113, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMsg(android.os.Message r10) {
        /*
            r9 = this;
            if (r10 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r10.what     // Catch:{ Throwable -> 0x0114 }
            r1 = 1
            r2 = 0
            switch(r0) {
                case 0: goto L_0x0072;
                case 1: goto L_0x0058;
                case 2: goto L_0x0041;
                case 3: goto L_0x002e;
                case 4: goto L_0x000c;
                default: goto L_0x000a;
            }     // Catch:{ Throwable -> 0x0114 }
        L_0x000a:
            goto L_0x0113
        L_0x000c:
            java.lang.Object r10 = r10.obj     // Catch:{ Throwable -> 0x0114 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ Throwable -> 0x0114 }
            long r0 = r10.longValue()     // Catch:{ Throwable -> 0x0114 }
            int r10 = r9.f54011m     // Catch:{ Throwable -> 0x0114 }
            int r10 = r10 * 1000
            long r3 = (long) r10     // Catch:{ Throwable -> 0x0114 }
            long r5 = r9.f54010l     // Catch:{ Throwable -> 0x0114 }
            int r10 = r9.f54011m     // Catch:{ Throwable -> 0x0114 }
            int r10 = r10 * 1000
            long r7 = (long) r10     // Catch:{ Throwable -> 0x0114 }
            long r5 = r5 + r7
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r10 > 0) goto L_0x0027
            long r3 = r5 - r0
        L_0x0027:
            com.bytedance.common.utility.b.g r10 = r9.f54002d     // Catch:{ Throwable -> 0x0114 }
            r10.sendEmptyMessageDelayed(r2, r3)     // Catch:{ Throwable -> 0x0114 }
            goto L_0x0114
        L_0x002e:
            java.lang.Object r10 = r10.obj     // Catch:{ Throwable -> 0x0114 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ Throwable -> 0x0114 }
            r10.longValue()     // Catch:{ Throwable -> 0x0114 }
            int r10 = r9.f54011m     // Catch:{ Throwable -> 0x0114 }
            int r10 = r10 * 1000
            long r0 = (long) r10     // Catch:{ Throwable -> 0x0114 }
            com.bytedance.common.utility.b.g r10 = r9.f54002d     // Catch:{ Throwable -> 0x0114 }
            r10.sendEmptyMessageDelayed(r2, r0)     // Catch:{ Throwable -> 0x0114 }
            goto L_0x0113
        L_0x0041:
            boolean r10 = r9.f54003e     // Catch:{ Throwable -> 0x0114 }
            if (r10 == 0) goto L_0x0114
            r9.f54016s = r2     // Catch:{ Throwable -> 0x0114 }
            com.bytedance.common.utility.b.g r10 = r9.f54002d     // Catch:{ Throwable -> 0x0114 }
            r10.removeMessages(r2)     // Catch:{ Throwable -> 0x0114 }
            com.bytedance.common.utility.b.g r10 = r9.f54002d     // Catch:{ Throwable -> 0x0114 }
            int r0 = r9.f54014q     // Catch:{ Throwable -> 0x0114 }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ Throwable -> 0x0114 }
            r10.sendEmptyMessageDelayed(r2, r0)     // Catch:{ Throwable -> 0x0114 }
            goto L_0x0114
        L_0x0058:
            boolean r10 = r9.f54003e     // Catch:{ Throwable -> 0x0114 }
            if (r10 == 0) goto L_0x0114
            r9.f54016s = r1     // Catch:{ Throwable -> 0x0114 }
            com.bytedance.common.utility.b.g r10 = r9.f54002d     // Catch:{ Throwable -> 0x0114 }
            boolean r10 = r10.hasMessages(r2)     // Catch:{ Throwable -> 0x0114 }
            if (r10 != 0) goto L_0x0114
            com.bytedance.common.utility.b.g r10 = r9.f54002d     // Catch:{ Throwable -> 0x0114 }
            int r0 = r9.f54011m     // Catch:{ Throwable -> 0x0114 }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ Throwable -> 0x0114 }
            r10.sendEmptyMessageDelayed(r2, r0)     // Catch:{ Throwable -> 0x0114 }
            goto L_0x0114
        L_0x0072:
            boolean r10 = r9.f54003e     // Catch:{ Throwable -> 0x0114 }
            if (r10 == 0) goto L_0x0114
            com.bytedance.common.utility.b.g r10 = r9.f54002d     // Catch:{ Throwable -> 0x0114 }
            r10.removeMessages(r2)     // Catch:{ Throwable -> 0x0114 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0114 }
            long r5 = r9.f54010l     // Catch:{ Throwable -> 0x0114 }
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x0099
            int r10 = r9.f54011m     // Catch:{ Throwable -> 0x0114 }
            int r10 = r10 * 1000
            long r5 = (long) r10     // Catch:{ Throwable -> 0x0114 }
            long r5 = r3 - r5
            r9.f54010l = r5     // Catch:{ Throwable -> 0x0114 }
            android.content.Context r10 = r9.f54001c     // Catch:{ Throwable -> 0x0114 }
            com.ss.android.newmedia.redbadge.b.a r10 = com.p683ss.android.newmedia.redbadge.p1200b.C19598a.m47924a(r10)     // Catch:{ Throwable -> 0x0114 }
            long r5 = r9.f54010l     // Catch:{ Throwable -> 0x0114 }
            r10.mo40839a(r5)     // Catch:{ Throwable -> 0x0114 }
        L_0x0099:
            com.ss.android.pushmanager.setting.a r10 = com.p683ss.android.pushmanager.setting.C19709a.m48167a()     // Catch:{ Throwable -> 0x0114 }
            boolean r10 = r10.mo41087c()     // Catch:{ Throwable -> 0x0114 }
            r0 = 4
            if (r10 == 0) goto L_0x00be
            com.ss.android.pushmanager.a.c$b r10 = com.p683ss.android.pushmanager.p1204a.C19664c.m48034b()     // Catch:{ Throwable -> 0x0114 }
            boolean r10 = r10.mo41016g()     // Catch:{ Throwable -> 0x0114 }
            if (r10 == 0) goto L_0x00be
            com.bytedance.common.utility.b.g r10 = r9.f54002d     // Catch:{ Throwable -> 0x0114 }
            com.bytedance.common.utility.b.g r1 = r9.f54002d     // Catch:{ Throwable -> 0x0114 }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ Throwable -> 0x0114 }
            android.os.Message r0 = r1.obtainMessage(r0, r2)     // Catch:{ Throwable -> 0x0114 }
            r10.sendMessage(r0)     // Catch:{ Throwable -> 0x0114 }
            goto L_0x0114
        L_0x00be:
            long r5 = r9.f54015r     // Catch:{ Throwable -> 0x0114 }
            long r7 = r9.f54008j     // Catch:{ Throwable -> 0x0114 }
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 >= 0) goto L_0x00d0
            long r5 = r9.f54008j     // Catch:{ Throwable -> 0x0114 }
            r10 = 0
            long r5 = r3 - r5
            r7 = 900000(0xdbba0, double:4.44659E-318)
            long r5 = r5 - r7
            goto L_0x00d5
        L_0x00d0:
            long r5 = r9.f54015r     // Catch:{ Throwable -> 0x0114 }
            r10 = 0
            long r5 = r3 - r5
        L_0x00d5:
            int r10 = r9.f54014q     // Catch:{ Throwable -> 0x0114 }
            int r10 = r10 * 1000
            long r7 = (long) r10     // Catch:{ Throwable -> 0x0114 }
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 < 0) goto L_0x0104
            long r5 = r9.f54010l     // Catch:{ Throwable -> 0x0114 }
            r10 = 0
            long r5 = r3 - r5
            int r10 = r9.f54011m     // Catch:{ Throwable -> 0x0114 }
            int r10 = r10 * 1000
            long r7 = (long) r10     // Catch:{ Throwable -> 0x0114 }
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 < 0) goto L_0x0104
            java.util.concurrent.atomic.AtomicBoolean r10 = r9.f54013o     // Catch:{ Throwable -> 0x0114 }
            boolean r10 = r10.get()     // Catch:{ Throwable -> 0x0114 }
            if (r10 != 0) goto L_0x0114
            java.util.concurrent.atomic.AtomicBoolean r10 = r9.f54013o     // Catch:{ Throwable -> 0x0114 }
            r10.getAndSet(r1)     // Catch:{ Throwable -> 0x0114 }
            com.ss.android.newmedia.redbadge.d$2 r10 = new com.ss.android.newmedia.redbadge.d$2     // Catch:{ Throwable -> 0x0114 }
            r10.<init>(r3)     // Catch:{ Throwable -> 0x0114 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x0114 }
            com.bytedance.common.utility.p523c.C9384a.m18565a(r10, r0)     // Catch:{ Throwable -> 0x0114 }
            goto L_0x0114
        L_0x0104:
            com.bytedance.common.utility.b.g r10 = r9.f54002d     // Catch:{ Throwable -> 0x0114 }
            com.bytedance.common.utility.b.g r1 = r9.f54002d     // Catch:{ Throwable -> 0x0114 }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ Throwable -> 0x0114 }
            android.os.Message r0 = r1.obtainMessage(r0, r2)     // Catch:{ Throwable -> 0x0114 }
            r10.sendMessage(r0)     // Catch:{ Throwable -> 0x0114 }
        L_0x0113:
            return
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.newmedia.redbadge.C19602d.handleMsg(android.os.Message):void");
    }

    /* renamed from: a */
    private static void m47946a(JSONObject jSONObject, String str) {
        if (!C9431p.m18664a(str)) {
            try {
                jSONObject.put(str, jSONObject.optLong(str) / 1000);
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo40858a(String str, Bundle bundle) {
        if (!C9431p.m18664a(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_event_v3", 1);
                for (String str2 : bundle.keySet()) {
                    jSONObject.put(str2, bundle.get(str2));
                }
            } catch (Throwable unused) {
            }
            C19492c.m47724a(this.f54001c, "event_v3", str, null, 0, 0, jSONObject);
        }
    }
}
