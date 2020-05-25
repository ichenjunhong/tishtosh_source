package com.p683ss.android.sdk.activity.p1208a;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.sdk.activity.a.a */
public class C19723a implements Serializable {
    @C17952c(mo34828a = "ad_landing_page_auto_jump_control_enabled")

    /* renamed from: a */
    boolean f54333a = true;
    @C17952c(mo34828a = "ad_landing_page_click_jump_control_enabled")

    /* renamed from: b */
    boolean f54334b = true;
    @C17952c(mo34828a = "ad_landing_page_auto_jump_allow_list")

    /* renamed from: c */
    List<String> f54335c;
    @C17952c(mo34828a = "ad_landing_page_auto_jump_intercept_list")

    /* renamed from: d */
    List<String> f54336d;
    @C17952c(mo34828a = "ad_landing_page_click_jump_interval")

    /* renamed from: e */
    int f54337e;
    @C17952c(mo34828a = "ad_landing_page_click_jump_interval_tips")

    /* renamed from: f */
    String f54338f;
    @C17952c(mo34828a = "ad_landing_page_click_jump_allow_list")

    /* renamed from: g */
    List<String> f54339g;
    @C17952c(mo34828a = "ad_landing_page_pause_list")

    /* renamed from: h */
    List<String> f54340h;

    public List<String> getAutoJumpAllowList() {
        return this.f54335c;
    }

    public List<String> getAutoJumpInterceptList() {
        return this.f54336d;
    }

    public int getAutoJumpInterval() {
        return this.f54337e;
    }

    public String getAutoJumpIntervalTips() {
        return this.f54338f;
    }

    public List<String> getClickJumpAllowList() {
        return this.f54339g;
    }

    public List<String> getPauseList() {
        return this.f54340h;
    }

    public boolean isClickControlEnabled() {
        return this.f54334b;
    }

    public boolean isJumpControlEnabled() {
        return this.f54333a;
    }

    public void setAutoJumpAllowList(List<String> list) {
        this.f54335c = list;
    }

    public void setAutoJumpInterceptList(List<String> list) {
        this.f54336d = list;
    }

    public void setAutoJumpInterval(int i) {
        this.f54337e = i;
    }

    public void setAutoJumpIntervalTips(String str) {
        this.f54338f = str;
    }

    public void setClickControlEnabled(boolean z) {
        this.f54334b = z;
    }

    public void setClickJumpAllowList(List<String> list) {
        this.f54339g = list;
    }

    public void setJumpControlEnabled(boolean z) {
        this.f54333a = z;
    }

    public void setPauseList(List<String> list) {
        this.f54340h = list;
    }
}
