package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.port.internal.C39666o;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.ad */
public final class C23376ad implements C39666o {

    /* renamed from: a */
    private Context f62390a;

    /* renamed from: b */
    private SharedPreferences f62391b = C35807d.m80935a(this.f62390a, "VideoRecord", 0);

    /* renamed from: a */
    public final int mo48448a() {
        return this.f62391b.getInt("resources_version", 0);
    }

    /* renamed from: b */
    public final String mo48454b() {
        return this.f62391b.getString("uploadRecoverPath", "");
    }

    /* renamed from: a */
    public final float mo48447a(float f) {
        return this.f62391b.getFloat("ulikebeauty_sharp_default", -1.0f);
    }

    /* renamed from: b */
    public final long mo48453b(long j) {
        return this.f62391b.getLong("ZT_Last_Insert_Time", 0);
    }

    /* renamed from: c */
    public final int mo48458c(int i) {
        return this.f62391b.getInt("hdr_resource_model_version", -1);
    }

    /* renamed from: d */
    public final void mo48461d(int i) {
        Editor edit = this.f62391b.edit();
        edit.putInt("count_down_mode", i);
        edit.apply();
    }

    /* renamed from: e */
    public final int mo48463e(int i) {
        return this.f62391b.getInt("count_down_mode", 3);
    }

    /* renamed from: f */
    public final void mo48465f(boolean z) {
        Editor edit = this.f62391b.edit();
        edit.putBoolean("has_click_blessing_tag", true);
        edit.apply();
    }

    /* renamed from: g */
    public final boolean mo48466g(boolean z) {
        return this.f62391b.getBoolean("has_click_blessing_tag", false);
    }

    public C23376ad(Context context) {
        this.f62390a = context;
    }

    /* renamed from: c */
    public final void mo48459c(String str) {
        Editor edit = this.f62391b.edit();
        edit.putString("ulikebeauty_download_data", str);
        edit.apply();
    }

    /* renamed from: d */
    public final boolean mo48462d(boolean z) {
        return this.f62391b.getBoolean("is_first_enter_record_page", true);
    }

    /* renamed from: e */
    public final void mo48464e(boolean z) {
        Editor edit = this.f62391b.edit();
        edit.putBoolean("is_first_enter_record_page", false);
        edit.apply();
    }

    /* renamed from: a */
    public final String mo48449a(String str) {
        Editor edit = this.f62391b.edit();
        edit.putString("uploadRecoverPath", str);
        edit.apply();
        return "";
    }

    /* renamed from: b */
    public final String mo48455b(String str) {
        return this.f62391b.getString("ulikebeauty_download_data", str);
    }

    /* renamed from: c */
    public final void mo48460c(boolean z) {
        Editor edit = this.f62391b.edit();
        edit.putBoolean("is_duration_mode_manually_change", true);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo48450a(int i) {
        Editor edit = this.f62391b.edit();
        edit.putInt("resources_version", i);
        edit.apply();
    }

    /* renamed from: b */
    public final void mo48456b(int i) {
        Editor edit = this.f62391b.edit();
        edit.putInt("hdr_resource_model_version", 3);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo48451a(long j) {
        Editor edit = this.f62391b.edit();
        edit.putLong("ZT_Last_Insert_Time", j);
        edit.apply();
    }

    /* renamed from: b */
    public final boolean mo48457b(boolean z) {
        return this.f62391b.getBoolean("is_duration_mode_manually_change", false);
    }

    /* renamed from: a */
    public final void mo48452a(boolean z) {
        Editor edit = this.f62391b.edit();
        edit.putBoolean("count_down_new_tag", false);
        edit.apply();
    }
}
