package com.p683ss.android.ugc.awemepushlib.manager;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bytedance.common.utility.p525e.C9402b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.pushmanager.client.C19697g;
import com.p683ss.android.pushmanager.p1204a.C19659a;
import com.p683ss.android.pushmanager.p1204a.C19659a.C19661a;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32463a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.awemepushlib.interaction.C48441a;
import java.text.SimpleDateFormat;

/* renamed from: com.ss.android.ugc.awemepushlib.manager.a */
public class C48479a {

    /* renamed from: n */
    private static String f121871n = "is_allow_oppo_push";

    /* renamed from: s */
    private static volatile C48479a f121872s;

    /* renamed from: t */
    private static final SimpleDateFormat f121873t = new SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: v */
    private static int f121874v = 0;

    /* renamed from: w */
    private static boolean f121875w = false;

    /* renamed from: a */
    public String f121876a;

    /* renamed from: b */
    public boolean f121877b;

    /* renamed from: c */
    public String f121878c;

    /* renamed from: d */
    public long f121879d;

    /* renamed from: e */
    public int f121880e;

    /* renamed from: f */
    public int f121881f;

    /* renamed from: g */
    public int f121882g;

    /* renamed from: h */
    protected C19659a f121883h;

    /* renamed from: i */
    public int f121884i;

    /* renamed from: j */
    public int f121885j;

    /* renamed from: k */
    public int f121886k;

    /* renamed from: l */
    protected boolean f121887l;

    /* renamed from: m */
    public int f121888m;

    /* renamed from: o */
    private int f121889o = -1;

    /* renamed from: p */
    private boolean f121890p;

    /* renamed from: q */
    private volatile boolean f121891q;

    /* renamed from: r */
    private volatile boolean f121892r;

    /* renamed from: u */
    private SharedPreferences f121893u;

    /* renamed from: g */
    private SharedPreferences m104896g() {
        m104898h();
        return this.f121893u;
    }

    /* renamed from: b */
    public final int mo95941b() {
        if (this.f121877b) {
            return f121874v;
        }
        return 1;
    }

    /* renamed from: a */
    public static C48479a m104895a() {
        if (f121872s == null) {
            synchronized (C48479a.class) {
                if (f121872s == null) {
                    f121872s = new C48479a();
                }
            }
        }
        return f121872s;
    }

    /* renamed from: h */
    private void m104898h() {
        if (!this.f121892r) {
            synchronized (this) {
                if (!this.f121892r) {
                    this.f121893u = C35807d.m80935a(C32463a.m75161a(), "app_setting", 0);
                    this.f121892r = true;
                }
            }
        }
    }

    /* renamed from: d */
    public final String mo95946d() {
        if (this.f121876a == null) {
            this.f121876a = C48441a.m104825a().getDefaultUninstallQuestionUrl();
        }
        return this.f121876a;
    }

    public C48479a() {
        int i = 1;
        this.f121877b = true;
        this.f121890p = true;
        this.f121878c = "";
        this.f121879d = 6000;
        this.f121883h = new C19659a(20);
        this.f121884i = 1;
        this.f121885j = 1;
        this.f121886k = -1;
        this.f121887l = true;
        if (mo95941b() != 1) {
            i = 0;
        }
        this.f121888m = i;
    }

    /* renamed from: e */
    public final boolean mo95948e() {
        if (!this.f121891q) {
            synchronized (this) {
                if (!this.f121891q) {
                    this.f121890p = C23859b.m58575b().mo49472b(C11010c.m22280a(), f121871n, true);
                    this.f121891q = true;
                }
            }
        }
        return this.f121890p;
    }

    /* renamed from: f */
    public void mo95950f() {
        Editor edit = m104896g().edit();
        edit.putInt("keep_notify_count", this.f121881f);
        edit.putInt("max_notify_count", this.f121880e);
        edit.putInt("notify_fresh_period", this.f121882g);
        edit.putString("notify_message_ids", this.f121883h.mo40998a());
        C9402b.m18594a(edit);
    }

    /* renamed from: c */
    public void mo95945c() {
        this.f121881f = m104896g().getInt("keep_notify_count", 0);
        this.f121880e = m104896g().getInt("max_notify_count", 0);
        this.f121882g = m104896g().getInt("notify_fresh_period", 0);
        this.f121883h.mo40999a(m104896g().getString("notify_message_ids", ""));
    }

    /* renamed from: a */
    public final C48479a mo95936a(boolean z) {
        this.f121890p = z;
        return this;
    }

    /* renamed from: a */
    public final boolean mo95940a(Context context) {
        if (!m104897g(context) || this.f121888m > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo95949e(Context context) {
        if (m104897g(context)) {
            return this.f121887l;
        }
        return false;
    }

    /* renamed from: f */
    public final synchronized void mo95951f(Context context) {
        if (m104897g(context)) {
            this.f121877b = true;
        } else {
            this.f121877b = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        return java.lang.Boolean.TRUE.booleanValue();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0028 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m104897g(android.content.Context r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.f121886k     // Catch:{ Exception -> 0x0028 }
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L_0x0017
            java.lang.String r0 = "push_setting"
            android.content.SharedPreferences r4 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r4, r0, r2)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "allow_settings_notify_enable"
            boolean r1 = r3.f121877b     // Catch:{ Exception -> 0x0028 }
            int r4 = r4.getInt(r0, r1)     // Catch:{ Exception -> 0x0028 }
            r3.f121886k = r4     // Catch:{ Exception -> 0x0028 }
        L_0x0017:
            int r4 = r3.f121886k     // Catch:{ Exception -> 0x0028 }
            if (r4 <= 0) goto L_0x001c
            r2 = 1
        L_0x001c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x0028 }
            boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x0028 }
            monitor-exit(r3)
            return r4
        L_0x0026:
            r4 = move-exception
            goto L_0x0030
        L_0x0028:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0026 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0026 }
            monitor-exit(r3)
            return r4
        L_0x0030:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.awemepushlib.manager.C48479a.m104897g(android.content.Context):boolean");
    }

    /* renamed from: a */
    public final void mo95937a(long j) {
        m104896g().edit().putLong("last_notify_time", j).apply();
    }

    /* renamed from: c */
    public final Editor mo95944c(Context context) {
        if (context == null) {
            return null;
        }
        Editor edit = C35807d.m80935a(context, "push_setting", 0).edit();
        if (edit != null) {
            edit.putInt("shut_push_on_stop_service", this.f121888m);
            edit.putInt("allow_settings_notify_enable", this.f121886k);
            edit.putBoolean("notify_enabled", this.f121887l);
            edit.putString("uninstall_question_url", this.f121876a);
        }
        return edit;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        return java.lang.Boolean.TRUE.booleanValue();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002f */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo95947d(android.content.Context r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f121889o     // Catch:{ Exception -> 0x002f }
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x001d
            boolean r0 = f121875w     // Catch:{ Exception -> 0x002f }
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = "push_setting"
            android.content.SharedPreferences r5 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r5, r0, r3)     // Catch:{ Exception -> 0x002f }
            java.lang.String r0 = "confirm_push"
            int r5 = r5.getInt(r0, r3)     // Catch:{ Exception -> 0x002f }
            r4.f121889o = r5     // Catch:{ Exception -> 0x002f }
            goto L_0x001d
        L_0x001b:
            r4.f121889o = r2     // Catch:{ Exception -> 0x002f }
        L_0x001d:
            int r5 = r4.f121889o     // Catch:{ Exception -> 0x002f }
            if (r5 <= 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x002f }
            boolean r5 = r5.booleanValue()     // Catch:{ Exception -> 0x002f }
            monitor-exit(r4)
            return r5
        L_0x002d:
            r5 = move-exception
            goto L_0x0037
        L_0x002f:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x002d }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x002d }
            monitor-exit(r4)
            return r5
        L_0x0037:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.awemepushlib.manager.C48479a.mo95947d(android.content.Context):boolean");
    }

    /* renamed from: b */
    public void mo95942b(Context context) {
        if (context != null) {
            int i = 0;
            SharedPreferences a = C35807d.m80935a(context, "push_setting", 0);
            if (a != null) {
                String str = "shut_push_on_stop_service";
                if (mo95941b() == 1) {
                    i = 1;
                }
                this.f121888m = a.getInt(str, i);
                this.f121886k = a.getInt("allow_settings_notify_enable", this.f121877b ? 1 : 0);
                this.f121887l = a.getBoolean("notify_enabled", true);
                this.f121876a = a.getString("uninstall_question_url", C48441a.m104825a().getDefaultUninstallQuestionUrl());
                this.f121885j = a.getInt("push_clear_switch", 1);
            }
        }
    }

    /* renamed from: b */
    public final void mo95943b(Context context, boolean z) {
        this.f121887l = z;
        Editor edit = C35807d.m80935a(context, "push_setting", 0).edit();
        edit.putBoolean("notify_enabled", this.f121887l);
        C9402b.m18594a(edit);
    }

    /* renamed from: a */
    public final synchronized void mo95938a(Context context, boolean z) {
        try {
            if (this.f121889o != z) {
                this.f121889o = z ? 1 : 0;
                boolean z2 = false;
                Editor edit = C35807d.m80935a(context, "push_setting", 0).edit();
                edit.putInt("confirm_push", this.f121889o);
                C9402b.m18594a(edit);
                C19697g.m48105a();
                if (this.f121889o > 0) {
                    z2 = true;
                }
                C19697g.m48107a(context, z2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo95939a(int i, long j) {
        long j2 = (long) i;
        C19659a aVar = this.f121883h;
        aVar.getClass();
        C19661a aVar2 = new C19661a();
        aVar2.f54161a = Long.valueOf(j2);
        aVar2.f54162b = j;
        boolean a = this.f121883h.mo41000a(aVar2);
        if (a) {
            C19661a b = this.f121883h.mo41001b(aVar2);
            if (b != null && aVar2.f54162b - b.f54162b > 43200000) {
                a = false;
            }
        }
        this.f121883h.mo41002c(aVar2);
        mo95950f();
        return a;
    }
}
