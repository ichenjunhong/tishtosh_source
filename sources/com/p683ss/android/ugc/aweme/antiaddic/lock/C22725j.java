package com.p683ss.android.ugc.aweme.antiaddic.lock;

import android.app.Activity;
import android.content.Context;
import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.C22745c;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.j */
public final class C22725j implements C22711b {
    /* renamed from: b */
    public final boolean mo47105b() {
        return TimeLockRuler.isContentFilterOn();
    }

    /* renamed from: c */
    public final boolean mo47106c() {
        return TimeLockRuler.isInTeenagerModeNewVersion();
    }

    /* renamed from: d */
    public final int mo47107d() {
        return TimeLockRuler.getContentFilterFlag();
    }

    /* renamed from: e */
    public final int mo47108e() {
        return TimeLockRuler.getLockTimeInMin();
    }

    /* renamed from: f */
    public final TimeLockUserSetting mo47109f() {
        return TimeLockRuler.getUserSetting();
    }

    /* renamed from: g */
    public final boolean mo47110g() {
        return TimeLockRuler.isParentalPlatformContentFilterOn();
    }

    /* renamed from: h */
    public final boolean mo47111h() {
        return TimeLockRuler.isTimeLockOn();
    }

    /* renamed from: i */
    public final boolean mo47112i() {
        return TimeLockRuler.isRuleValid();
    }

    /* renamed from: j */
    public final boolean mo47113j() {
        return TimeLockRuler.isSelfTimeLockOn();
    }

    /* renamed from: k */
    public final boolean mo47114k() {
        return TimeLockRuler.isSelfContentFilterOn();
    }

    /* renamed from: l */
    public final Fragment mo47115l() {
        return new C22745c();
    }

    /* renamed from: a */
    public final boolean mo47103a() {
        return TimeLockRuler.isTeenModeON();
    }

    /* renamed from: a */
    public final void mo47101a(Activity activity) {
        TimeLockRuler.disableStartActivityIfNeeded(activity);
    }

    /* renamed from: a */
    public final boolean mo47104a(int i) {
        return TimeLockRuler.isEnableShowTeenageTip(i);
    }

    /* renamed from: a */
    public final void mo47102a(Context context, String str, Runnable runnable) {
        TimeLockRuler.doTeenagerModeAction(context, str, runnable);
    }
}
