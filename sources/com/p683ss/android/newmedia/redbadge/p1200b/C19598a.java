package com.p683ss.android.newmedia.redbadge.p1200b;

import android.content.Context;
import com.p683ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import com.p683ss.android.pushmanager.setting.PushMultiProcessSharedProvider.C19708b;

/* renamed from: com.ss.android.newmedia.redbadge.b.a */
public final class C19598a {

    /* renamed from: b */
    private static C19598a f53995b;

    /* renamed from: a */
    public C19708b f53996a = PushMultiProcessSharedProvider.m48146a(this.f53997c);

    /* renamed from: c */
    private Context f53997c;

    /* renamed from: b */
    public final String mo40842b() {
        return this.f53996a.mo41081a("desktop_red_badge_args", "");
    }

    /* renamed from: c */
    public final long mo40845c() {
        return this.f53996a.mo41079a("red_badge_last_request_time", 0);
    }

    /* renamed from: d */
    public final int mo40848d() {
        return this.f53996a.mo41078a("red_badge_next_query_interval", 600);
    }

    /* renamed from: e */
    public final String mo40850e() {
        return this.f53996a.mo41081a("red_badge_last_time_paras", "");
    }

    /* renamed from: f */
    public final String mo40852f() {
        return this.f53996a.mo41081a("red_badge_last_last_time_paras", "");
    }

    /* renamed from: g */
    public final int mo40853g() {
        return this.f53996a.mo41078a("red_badge_launch_times", 0);
    }

    /* renamed from: h */
    public final int mo40854h() {
        return this.f53996a.mo41078a("red_badge_show_times", 0);
    }

    /* renamed from: a */
    public final boolean mo40841a() {
        return this.f53996a.mo41082a("is_desktop_red_badge_show", false);
    }

    /* renamed from: a */
    public final void mo40838a(int i) {
        this.f53996a.mo41080a().mo41072a("red_badge_next_query_interval", i).mo41076a();
    }

    private C19598a(Context context) {
        this.f53997c = context.getApplicationContext();
    }

    /* renamed from: a */
    public static synchronized C19598a m47924a(Context context) {
        C19598a aVar;
        synchronized (C19598a.class) {
            if (f53995b == null) {
                f53995b = new C19598a(context);
            }
            aVar = f53995b;
        }
        return aVar;
    }

    /* renamed from: b */
    public final void mo40843b(int i) {
        this.f53996a.mo41080a().mo41072a("red_badge_launch_times", i).mo41076a();
    }

    /* renamed from: c */
    public final void mo40846c(int i) {
        this.f53996a.mo41080a().mo41072a("red_badge_show_times", i).mo41076a();
    }

    /* renamed from: d */
    public final void mo40849d(String str) {
        this.f53996a.mo41080a().mo41074a("rom", str).mo41076a();
    }

    /* renamed from: e */
    public final void mo40851e(String str) {
        this.f53996a.mo41080a().mo41074a("red_badge_last_valid_response", str).mo41076a();
    }

    /* renamed from: a */
    public final void mo40839a(long j) {
        this.f53996a.mo41080a().mo41073a("red_badge_last_request_time", j).mo41076a();
    }

    /* renamed from: b */
    public final void mo40844b(String str) {
        this.f53996a.mo41080a().mo41074a("red_badge_last_last_time_paras", str).mo41076a();
    }

    /* renamed from: c */
    public final void mo40847c(String str) {
        this.f53996a.mo41080a().mo41074a("session_key", str).mo41076a();
    }

    /* renamed from: a */
    public final void mo40840a(String str) {
        this.f53996a.mo41080a().mo41074a("red_badge_last_time_paras", str).mo41076a();
    }
}
