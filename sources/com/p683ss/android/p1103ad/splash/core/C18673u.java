package com.p683ss.android.p1103ad.splash.core;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.SystemClock;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18608f;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18617n;
import com.p683ss.android.p1103ad.splash.p1123g.C18736b;
import com.p683ss.android.p1103ad.splash.p1123g.C18738d;
import com.p683ss.android.p1103ad.splash.p1123g.C18747l;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.Calendar;

/* renamed from: com.ss.android.ad.splash.core.u */
public class C18673u {

    /* renamed from: a */
    static final String f51605a;

    /* renamed from: c */
    private static volatile C18673u f51606c;

    /* renamed from: g */
    private static Calendar f51607g = Calendar.getInstance();

    /* renamed from: b */
    SharedPreferences f51608b = C35807d.m80935a(C18642g.m45184L(), "splash_ad_sp", 0);

    /* renamed from: d */
    private long f51609d;

    /* renamed from: e */
    private long f51610e;

    /* renamed from: f */
    private Editor f51611f;

    /* renamed from: h */
    public final void mo38164h() {
        this.f51611f.apply();
    }

    /* renamed from: w */
    private int m45403w() {
        return this.f51608b.getInt("show_splash_ad_day", 0);
    }

    /* renamed from: x */
    private String m45404x() {
        return this.f51608b.getString("key_last_show_sequence_day", "");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final C18673u mo38157e() {
        mo38177t().putInt("splash_ad_show_count", mo38171n() + 1);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final C18673u mo38159f() {
        mo38177t().putInt("key_splash_ad_show_sequence", mo38172o() + 1);
        return this;
    }

    /* renamed from: j */
    public final long mo38167j() {
        return this.f51608b.getLong("splash_ad_leave_interval", 0);
    }

    /* renamed from: k */
    public final long mo38168k() {
        return this.f51608b.getLong("splash_ad_splash_interval", 0);
    }

    /* renamed from: l */
    public final int mo38169l() {
        return this.f51608b.getInt("splash_ad_show_limit", 0);
    }

    /* renamed from: m */
    public final boolean mo38170m() {
        return this.f51608b.getBoolean("key_splash_ad_need_ack", false);
    }

    /* renamed from: p */
    public final boolean mo38173p() {
        return this.f51608b.getBoolean("key_splash_ad_empty", false);
    }

    /* renamed from: q */
    public final String mo38174q() {
        return this.f51608b.getString("key_splash_ad_rt_necessary_device_params", "");
    }

    /* renamed from: r */
    public final String mo38175r() {
        return this.f51608b.getString("key_splash_ad_penalty_period", "");
    }

    /* renamed from: s */
    public final String mo38176s() {
        return this.f51608b.getString("key_empty_log_extra_substitute", "");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public Editor mo38177t() {
        if (this.f51611f == null) {
            this.f51611f = this.f51608b.edit();
        }
        return this.f51611f;
    }

    private C18673u() {
    }

    /* renamed from: a */
    public static C18673u m45399a() {
        if (f51606c == null) {
            synchronized (C18673u.class) {
                if (f51606c == null) {
                    f51606c = new C18673u();
                }
            }
        }
        return f51606c;
    }

    /* renamed from: v */
    private void m45402v() {
        mo38177t().putString("key_last_show_sequence_day", m45405y()).apply();
    }

    /* renamed from: b */
    public final long mo38147b() {
        if (this.f51610e == 0) {
            this.f51610e = this.f51608b.getLong("key_pre_remote_time", 0);
        }
        return this.f51610e;
    }

    /* renamed from: c */
    public final long mo38151c() {
        if (this.f51609d == 0) {
            this.f51609d = this.f51608b.getLong("key_pre_launch_time", 0);
        }
        return this.f51609d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final String mo38162g() {
        return this.f51608b.getString("splash_ad_local_cache_data", "");
    }

    /* renamed from: i */
    public final String mo38166i() {
        return this.f51608b.getString("splash_ad_full_data", "");
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C18642g.m45184L().getFilesDir());
        sb.append("/SplashData/");
        f51605a = sb.toString();
    }

    /* renamed from: u */
    private void m45401u() {
        f51607g.setTimeInMillis(System.currentTimeMillis());
        mo38177t().putInt("show_splash_ad_day", f51607g.get(5) + f51607g.get(2) + f51607g.get(1)).apply();
    }

    /* renamed from: y */
    private static String m45405y() {
        f51607g.setTimeInMillis(System.currentTimeMillis());
        StringBuilder sb = new StringBuilder();
        sb.append(f51607g.get(1));
        sb.append("/");
        sb.append(f51607g.get(2));
        sb.append("/");
        sb.append(f51607g.get(5));
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo38156d() {
        f51607g.setTimeInMillis(System.currentTimeMillis());
        if (f51607g.get(5) + f51607g.get(2) + f51607g.get(1) == m45403w()) {
            return this.f51608b.getBoolean("splash_ad_has_first_refresh", false);
        }
        m45401u();
        mo38150b(false).mo38164h();
        return false;
    }

    /* renamed from: o */
    public final int mo38172o() {
        if (m45405y().equals(m45404x())) {
            return this.f51608b.getInt("key_splash_ad_show_sequence", 0);
        }
        mo38177t().putInt("key_splash_ad_show_sequence", 0).apply();
        m45402v();
        return 0;
    }

    /* renamed from: n */
    public final int mo38171n() {
        f51607g.setTimeInMillis(System.currentTimeMillis());
        if (f51607g.get(5) + f51607g.get(2) + f51607g.get(1) == m45403w()) {
            return this.f51608b.getInt("splash_ad_show_count", 0);
        }
        mo38177t().putInt("splash_ad_show_count", 0).apply();
        m45401u();
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C18673u mo38141a(int i) {
        mo38177t().putInt("splash_ad_show_limit", i);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C18673u mo38148b(long j) {
        mo38177t().putLong("splash_ad_splash_interval", j);
        return this;
    }

    /* renamed from: c */
    public final C18673u mo38153c(String str) {
        mo38177t().putString("splash_ad_did", str);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final C18673u mo38155d(String str) {
        mo38177t().putString("splash_ad_first_show_data", str);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final C18673u mo38161g(String str) {
        mo38177t().putString("splash_ad_local_cache_data", str);
        return this;
    }

    /* renamed from: h */
    public final C18673u mo38163h(String str) {
        mo38177t().putString("key_splash_ad_penalty_period", str);
        return this;
    }

    /* renamed from: i */
    public final C18673u mo38165i(String str) {
        mo38177t().putString("key_empty_log_extra_substitute", str);
        return this;
    }

    /* renamed from: j */
    private synchronized void m45400j(String str) {
        if (!C18747l.m45742a(str)) {
            Editor t = mo38177t();
            StringBuilder sb = new StringBuilder("splash_ad_url_has_download_");
            sb.append(C18736b.m45672a(str));
            t.putBoolean(sb.toString(), true).apply();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C18673u mo38142a(long j) {
        mo38177t().putLong("splash_ad_leave_interval", j);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C18673u mo38149b(String str) {
        mo38177t().putString("splash_ad_full_data", str);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C18673u mo38152c(long j) {
        this.f51609d = SystemClock.elapsedRealtime();
        this.f51610e = j;
        mo38177t().putLong("key_pre_remote_time", j).putLong("key_pre_launch_time", this.f51609d).apply();
        return this;
    }

    /* renamed from: e */
    public final synchronized void mo38158e(String str) {
        if (!C18747l.m45742a(str)) {
            Editor t = mo38177t();
            StringBuilder sb = new StringBuilder("splash_ad_url_has_download_");
            sb.append(C18736b.m45672a(str));
            t.remove(sb.toString()).apply();
        }
    }

    /* renamed from: f */
    public final synchronized boolean mo38160f(String str) {
        if (C18747l.m45742a(str)) {
            return false;
        }
        SharedPreferences sharedPreferences = this.f51608b;
        StringBuilder sb = new StringBuilder("splash_ad_url_has_download_");
        sb.append(C18736b.m45672a(str));
        return sharedPreferences.getBoolean(sb.toString(), false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C18673u mo38143a(String str) {
        if (C18642g.m45214ad()) {
            C18738d.m45688a(str, f51605a, "splash_ad_ordered_data");
        } else {
            mo38177t().putString("splash_ad_data", str);
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C18673u mo38150b(boolean z) {
        mo38177t().putBoolean("splash_ad_has_first_refresh", z);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C18673u mo38154c(boolean z) {
        mo38177t().putBoolean("key_splash_ad_need_ack", z);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C18673u mo38144a(boolean z) {
        mo38177t().putBoolean("key_splash_ad_empty", z);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo38145a(C18608f fVar) {
        if (fVar != null && !C18747l.m45742a(fVar.f51375d)) {
            m45400j(fVar.f51375d);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo38146a(C18617n nVar) {
        if (nVar != null && !C18747l.m45742a(nVar.f51405d)) {
            m45400j(nVar.f51405d);
        }
    }
}
