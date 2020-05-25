package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22721g;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22722h;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.TeenageModeSetting;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.C22733e;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2.C22770h.C22773a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.widget.TimeLockDesc;
import com.p683ss.android.ugc.aweme.antiaddic.lock.viewmodel.C22781a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.viewmodel.TimeLockOptionViewModel;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.session.C23706b;
import com.p683ss.android.ugc.aweme.base.p1420ui.session.C23707c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.k */
public class C22777k extends C22761d {

    /* renamed from: e */
    private TimeLockDesc f61027e;

    /* renamed from: j */
    private TimeLockDesc f61028j;

    /* renamed from: k */
    private TimeLockDesc f61029k;

    /* renamed from: l */
    private int f61030l;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo47206a() {
        return R.layout.qn;
    }

    /* renamed from: g */
    public final boolean mo47231g() {
        if (!C22721g.m55965e()) {
            return false;
        }
        C22721g gVar = C22721g.f60930d;
        FragmentActivity activity = getActivity();
        TeenageModeSetting teenageModeSetting = C22721g.f60927a;
        if (teenageModeSetting != null) {
            teenageModeSetting.setTimeLockSelfInMin(0);
        }
        C26890h.m65011a("close_time_lock_finish", C23089d.m56640a().f61491a);
        C10691a.m21533a(C11010c.m22280a(), (int) R.string.dyw).mo19066a();
        if (activity != null) {
            C22722h.m55985b(activity, 0);
        }
        C22721g.m55964a(C22721g.f60927a);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo47230b(View view) {
        C26890h.m65011a("close_time_lock", C23089d.m56640a().f61491a);
        if (mo47223f()) {
            mo47219a(0);
            return;
        }
        Fragment b = C22733e.m56032b(1);
        C23707c.m58177a().mo49140a("TimeLockEnterFragmentV2", Boolean.class).mo49136a((C0184k) b).mo49138a(this, new C23706b() {
            /* renamed from: a */
            public final void mo47089a(Object obj) {
                if (!C22777k.this.mo47231g()) {
                    C10691a.m21533a((Context) C22777k.this.getActivity(), (int) R.string.dyw).mo19066a();
                    TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
                    userSetting.setTimeLockOn(false);
                    if (userSetting.isTimeLockOn() || userSetting.isContentFilterOn()) {
                        TimeLockRuler.applyUserSetting(userSetting);
                    } else {
                        TimeLockRuler.removeUserSetting();
                    }
                    C26890h.m65011a("close_time_lock_finish", C23089d.m56640a().f61491a);
                    C22722h.m55985b(C22777k.this.getActivity(), 0);
                }
            }
        });
        mo47220a(b);
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        this.f61027e = (TimeLockDesc) view.findViewById(R.id.d0f);
        this.f61028j = (TimeLockDesc) view.findViewById(R.id.d0g);
        this.f61029k = (TimeLockDesc) view.findViewById(R.id.d0e);
        TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
        if (mo47223f() || userSetting != null || C22721g.m55965e()) {
            if (mo47223f()) {
                i = ((C22773a) ((TimeLockOptionViewModel) C0214z.m440a(getActivity()).mo359a(TimeLockOptionViewModel.class)).f61036a.getValue()).f61019b;
            } else if (C22721g.m55965e()) {
                i = C22721g.f60930d.mo47168d();
            } else {
                i = userSetting.getLockTimeInMin();
            }
            this.f61030l = i;
            this.f61027e.setText(getString(R.string.dyg, Integer.valueOf(this.f61030l)));
            this.f61028j.setText(getString(R.string.gcv));
            this.f60998b.setOnClickListener(new C22779l(this));
            if (mo47223f()) {
                this.f60997a.setText(getString(R.string.b8f));
                this.f61027e.setText(getString(R.string.cmw, Integer.valueOf(this.f61030l)));
                this.f61028j.setText(getString(R.string.gcv));
                this.f61029k.setVisibility(0);
                this.f61029k.setText(getString(R.string.gcw));
                String str = ((C22781a) mo47222e().getValue()).f61038b.f61040b;
                if (!TextUtils.isEmpty(str)) {
                    this.f60998b.setText(getString(R.string.gcs, str));
                    return;
                }
                this.f60998b.setText(getString(R.string.gcr));
            }
        }
    }
}
