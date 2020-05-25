package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2;

import android.arch.lifecycle.C0184k;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22721g;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22722h;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.TeenageModeSetting;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.C22733e;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.widget.TimeLockDesc;
import com.p683ss.android.ugc.aweme.antiaddic.lock.viewmodel.C22781a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.session.C23706b;
import com.p683ss.android.ugc.aweme.base.p1420ui.session.C23707c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.protection.C40869c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TeenagerLockOptionsFragmentV2 */
public class TeenagerLockOptionsFragmentV2 extends C22761d {
    TimeLockDesc desc1;
    TimeLockDesc desc2;
    TimeLockDesc desc3;
    Button mAppealCloseTeenagerMode;
    View mBetaDes;
    View mBottom;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo47206a() {
        return R.layout.qf;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo47207b(View view) {
        C26890h.m65011a("close_teen_mode", C23089d.m56640a().f61491a);
        if (mo47223f()) {
            mo47219a(1);
            return;
        }
        Fragment b = C22733e.m56032b(1);
        C23707c.m58177a().mo49140a("TimeLockEnterFragmentV2", Boolean.class).mo49136a((C0184k) b).mo49138a(this, new C23706b() {
            /* renamed from: a */
            public final void mo47089a(Object obj) {
                Boolean bool = (Boolean) obj;
                if (!TeenagerLockOptionsFragmentV2.m56060a(bool)) {
                    C10691a.m21533a(C11010c.m22280a(), (int) R.string.d8d).mo19066a();
                    TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
                    userSetting.setContentFilterOn(false);
                    if (!C20902b.m53242a().isLogin() || bool.booleanValue()) {
                        userSetting.setTimeLockOn(false);
                    }
                    if (userSetting.isTimeLockOn() || userSetting.isContentFilterOn()) {
                        TimeLockRuler.applyUserSetting(userSetting);
                    } else {
                        TimeLockRuler.removeUserSetting();
                    }
                    C26890h.m65011a("close_teen_mode_finish", C23089d.m56640a().f61491a);
                    C22722h.m55978a();
                }
            }
        });
        mo47220a(b);
    }

    /* renamed from: a */
    public static boolean m56060a(Boolean bool) {
        if (!C22721g.m55965e()) {
            return false;
        }
        C22721g gVar = C22721g.f60930d;
        boolean booleanValue = bool.booleanValue();
        TeenageModeSetting teenageModeSetting = C22721g.f60927a;
        if (teenageModeSetting != null) {
            teenageModeSetting.setTeenageModeSelf(false);
        }
        if (booleanValue) {
            TeenageModeSetting teenageModeSetting2 = C22721g.f60927a;
            if (teenageModeSetting2 != null) {
                teenageModeSetting2.setTimeLockSelfInMin(0);
            }
            C26890h.m65011a("close_time_lock_finish", C23089d.m56640a().f61491a);
        }
        C26890h.m65011a("close_teen_mode_finish", C23089d.m56640a().f61491a);
        C22722h.m55978a();
        C10691a.m21533a(C11010c.m22280a(), (int) R.string.d8d).mo19066a();
        C22721g.m55964a(C22721g.f60927a);
        C40869c.m90378c();
        return true;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!TimeLockRuler.isTeenagerAbEnable()) {
            this.desc2.setVisibility(8);
        }
        this.mBetaDes.setVisibility(4);
        this.desc1.setText(getString(R.string.hg8));
        this.desc2.setText(getString(R.string.hg_));
        this.desc2.setImageDrawable(getResources().getDrawable(R.drawable.av3));
        this.f60998b.setOnClickListener(new C22768f(this));
        if (mo47223f()) {
            this.f60997a.setVisibility(8);
            this.f60998b.setBackgroundResource(R.drawable.c9s);
            this.f60998b.setTextColor(getResources().getColor(R.color.a4f));
            String str = ((C22781a) mo47222e().getValue()).f61038b.f61040b;
            if (!TextUtils.isEmpty(str)) {
                this.f60998b.setText(getString(R.string.gcl, str));
            } else {
                this.f60998b.setText(getString(R.string.gck));
            }
            this.desc1.setText(getString(R.string.hg8));
            this.desc1.setImageDrawable(getResources().getDrawable(R.drawable.av0));
            this.desc3.setVisibility(8);
            this.desc2.setText(getString(R.string.gcp));
            this.desc2.setImageDrawable(getResources().getDrawable(R.drawable.av3));
        }
        this.mAppealCloseTeenagerMode.setOnClickListener(new C22769g(this));
    }
}
