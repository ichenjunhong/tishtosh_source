package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.main.C36606dx;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.w */
final class C23409w implements C36606dx {

    /* renamed from: a */
    private Context f62444a;

    /* renamed from: b */
    private SharedPreferences f62445b = C35807d.m80935a(this.f62444a, "MainTabPreferences", 0);

    /* renamed from: a */
    public final boolean mo48513a() {
        return this.f62445b.getBoolean("hasReadPhoneStateRequested", false);
    }

    /* renamed from: b */
    public final boolean mo48517b() {
        return this.f62445b.getBoolean("secondTabLastLandFollowTab", false);
    }

    /* renamed from: a */
    public final long mo48510a(long j) {
        return this.f62445b.getLong("cleanEffectsLastTime", 0);
    }

    /* renamed from: b */
    public final void mo48514b(long j) {
        Editor edit = this.f62445b.edit();
        edit.putLong("cleanEffectsLastTime", j);
        edit.apply();
    }

    /* renamed from: c */
    public final String mo48518c(String str) {
        return this.f62445b.getString("hasClickActivityDot", str);
    }

    /* renamed from: d */
    public final void mo48520d(String str) {
        Editor edit = this.f62445b.edit();
        edit.putString("hasClickActivityDot", str);
        edit.apply();
    }

    /* renamed from: e */
    public final void mo48522e(String str) {
        Editor edit = this.f62445b.edit();
        edit.putString("unloginContentLanguage", str);
        edit.apply();
    }

    /* renamed from: f */
    public final String mo48524f(String str) {
        return this.f62445b.getString("unloginContentLanguage", str);
    }

    /* renamed from: g */
    public final void mo48526g(String str) {
        Editor edit = this.f62445b.edit();
        edit.putString("consumedFeedsCountForLocationPop", str);
        edit.apply();
    }

    /* renamed from: h */
    public final String mo48528h(String str) {
        return this.f62445b.getString("consumedFeedsCountForLocationPop", str);
    }

    /* renamed from: i */
    public final boolean mo48530i(boolean z) {
        return this.f62445b.getBoolean("hasShowUnloginContentLanguageDialog", false);
    }

    /* renamed from: j */
    public final boolean mo48531j(boolean z) {
        return this.f62445b.getBoolean("isCheckContentLanguageDialogWhenFirstLaunch", false);
    }

    /* renamed from: k */
    public final void mo48532k(boolean z) {
        Editor edit = this.f62445b.edit();
        edit.putBoolean("isCheckContentLanguageDialogWhenFirstLaunch", z);
        edit.apply();
    }

    /* renamed from: l */
    public final void mo48533l(boolean z) {
        Editor edit = this.f62445b.edit();
        edit.putBoolean("hasLocationPopupShown", z);
        edit.apply();
    }

    /* renamed from: m */
    public final boolean mo48534m(boolean z) {
        return this.f62445b.getBoolean("hasLocationPopupShown", false);
    }

    public C23409w(Context context) {
        this.f62444a = context;
    }

    /* renamed from: a */
    public final void mo48511a(String str) {
        Editor edit = this.f62445b.edit();
        edit.putString("hasClickActivityLink", str);
        edit.apply();
    }

    /* renamed from: b */
    public final void mo48515b(String str) {
        Editor edit = this.f62445b.edit();
        edit.putString("activityLinkFirstLaunchTime", str);
        edit.apply();
    }

    /* renamed from: c */
    public final boolean mo48519c(boolean z) {
        return this.f62445b.getBoolean("shouldCleanEffectsAtFirstLaunch", true);
    }

    /* renamed from: d */
    public final void mo48521d(boolean z) {
        Editor edit = this.f62445b.edit();
        edit.putBoolean("shouldCleanEffectsAtFirstLaunch", false);
        edit.apply();
    }

    /* renamed from: e */
    public final boolean mo48523e(boolean z) {
        return this.f62445b.getBoolean("shouldShowNewFollowLocationGuide", true);
    }

    /* renamed from: f */
    public final void mo48525f(boolean z) {
        Editor edit = this.f62445b.edit();
        edit.putBoolean("hasClosedActivityLink", z);
        edit.apply();
    }

    /* renamed from: g */
    public final void mo48527g(boolean z) {
        Editor edit = this.f62445b.edit();
        edit.putBoolean("secondTabLastLandFollowTab", z);
        edit.apply();
    }

    /* renamed from: h */
    public final void mo48529h(boolean z) {
        Editor edit = this.f62445b.edit();
        edit.putBoolean("hasShowUnloginContentLanguageDialog", z);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo48512a(boolean z) {
        Editor edit = this.f62445b.edit();
        edit.putBoolean("hasReadPhoneStateRequested", true);
        edit.apply();
    }

    /* renamed from: b */
    public final void mo48516b(boolean z) {
        Editor edit = this.f62445b.edit();
        edit.putBoolean("hasClickSearch", true);
        edit.apply();
    }
}
