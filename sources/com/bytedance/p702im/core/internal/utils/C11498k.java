package com.bytedance.p702im.core.internal.utils;

import android.app.Application;
import android.content.SharedPreferences;
import com.bytedance.p702im.core.p703a.C11165c;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.bytedance.im.core.internal.utils.k */
public class C11498k {

    /* renamed from: b */
    private static volatile long f30836b;

    /* renamed from: c */
    private static C11498k f30837c;

    /* renamed from: a */
    public SharedPreferences f30838a;

    /* renamed from: b */
    public final long mo21122b() {
        return this.f30838a.getLong(m23545a("im_reset_time"), 0);
    }

    /* renamed from: c */
    public final int mo21124c() {
        return this.f30838a.getInt(m23545a("im_reset_count"), 0);
    }

    /* renamed from: d */
    public final long mo21126d() {
        return this.f30838a.getLong("conversation_check_time", 0);
    }

    private C11498k() {
        f30836b = C11165c.m22588a().f30108c.mo20490a();
        Application application = C11165c.m22588a().f30106a;
        StringBuilder sb = new StringBuilder("imsdk_");
        sb.append(f30836b);
        this.f30838a = C35807d.m80935a(application, sb.toString(), 0);
        StringBuilder sb2 = new StringBuilder("SPUtils constructor, uid:");
        sb2.append(f30836b);
        C11467e.m23462a(sb2.toString());
    }

    /* renamed from: a */
    public static synchronized C11498k m23543a() {
        C11498k kVar;
        synchronized (C11498k.class) {
            long a = C11165c.m22588a().f30108c.mo20490a();
            if (f30837c == null || a != f30836b) {
                synchronized (C11498k.class) {
                    if (f30837c == null || a != f30836b) {
                        f30837c = new C11498k();
                    }
                }
            }
            kVar = f30837c;
        }
        return kVar;
    }

    /* renamed from: a */
    public final void mo21121a(long j) {
        this.f30838a.edit().putLong("conversation_check_time", j).commit();
    }

    /* renamed from: a */
    public static String m23545a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C11165c.m22588a().f30108c.mo20490a());
        sb.append("_");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: b */
    public final long mo21123b(int i) {
        return this.f30838a.getLong(m23544a(i, "msg_by_user_report_cursor"), -1);
    }

    /* renamed from: c */
    public final boolean mo21125c(int i) {
        return this.f30838a.getBoolean(m23544a(i, "im_init"), false);
    }

    /* renamed from: a */
    public final long mo21119a(int i) {
        String a = m23544a(i, "msg_by_user_cursor");
        long j = this.f30838a.getLong(a, -1);
        StringBuilder sb = new StringBuilder("SPUtils getCursor, key:");
        sb.append(a);
        sb.append(", cursor:");
        sb.append(j);
        sb.append(", inbox:");
        sb.append(i);
        sb.append(", uid:");
        sb.append(f30836b);
        C11467e.m23462a(sb.toString());
        return j;
    }

    /* renamed from: a */
    public static String m23544a(int i, String str) {
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(C11165c.m22588a().f30108c.mo20490a());
            sb.append("_");
            sb.append(str);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C11165c.m22588a().f30108c.mo20490a());
        sb2.append("_");
        sb2.append(str);
        sb2.append("_");
        sb2.append(i);
        return sb2.toString();
    }

    /* renamed from: a */
    public final void mo21120a(int i, long j) {
        String a = m23544a(i, "msg_by_user_cursor");
        this.f30838a.edit().putLong(a, j).commit();
        StringBuilder sb = new StringBuilder("SPUtils setCursor, key:");
        sb.append(a);
        sb.append(", cursor:");
        sb.append(j);
        sb.append(", inbox:");
        sb.append(i);
        sb.append(", uid:");
        sb.append(f30836b);
        C11467e.m23462a(sb.toString());
        if (j <= 0) {
            StringBuilder sb2 = new StringBuilder("SPUtils setCursor=");
            sb2.append(j);
            C11467e.m23464a("imsdk", sb2.toString(), new Throwable());
        }
    }
}
