package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22721g;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22722h;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.C22743b;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.i */
public final class C22774i extends C22743b {

    /* renamed from: k */
    ViewGroup f61020k;

    /* renamed from: l */
    ViewGroup f61021l;

    /* renamed from: m */
    DmtTextView f61022m;

    /* renamed from: n */
    private String f61023n;

    /* renamed from: a */
    public final int mo47186a() {
        return R.string.dyu;
    }

    /* renamed from: h */
    public final void mo47117h() {
        super.mo47117h();
        C22721g.f60930d.mo47164a(getActivity(), mo47196e(), this.f60959d);
    }

    /* renamed from: b */
    public final void mo47183b(String str) {
        boolean z;
        TimeLockUserSetting timeLockUserSetting;
        if (!this.f61023n.equals(str)) {
            C10691a.m21542b(getContext(), (int) R.string.dyt).mo19066a();
            return;
        }
        mo47187a((View) this.f60947a);
        boolean z2 = this.f60959d;
        if (!C22721g.m55965e() || this.f60960e == null || getActivity() == null) {
            z = false;
        } else {
            mo47197f();
            this.f60960e.mo47094b(C22721g.f60930d.mo47163a(mo47196e(), true, str, z2, getActivity()));
            z = true;
        }
        if (!z) {
            C17825i.m43739a(UploadTimeLockPasswordApi.f60983b.upload(str, C20902b.m53242a().getCurUserId()), new C17824h<BaseResponse>() {
                public final void onFailure(Throwable th) {
                }

                public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                }
            });
            if (this.f60959d) {
                timeLockUserSetting = TimeLockRuler.getUserSetting();
            } else {
                timeLockUserSetting = new TimeLockUserSetting();
            }
            timeLockUserSetting.setUserId(C20902b.m53242a().getCurUserId());
            timeLockUserSetting.setLastSetTime(System.currentTimeMillis());
            timeLockUserSetting.setPassword(str);
            if (this.f60959d) {
                TimeLockRuler.applyUserSetting(timeLockUserSetting);
                C10691a.m21533a((Context) getActivity(), (int) R.string.dyr).mo19066a();
                C22722h.m55980a(getActivity(), mo47196e());
                return;
            }
            C22722h.m55981a(getActivity(), mo47196e(), timeLockUserSetting);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f61023n = getArguments().getString("password");
        this.f61020k = (ViewGroup) view.findViewById(R.id.cfc);
        this.f61021l = (ViewGroup) view.findViewById(R.id.d1b);
        this.f61020k.setBackgroundColor(getResources().getColor(R.color.a3i));
        this.f61021l.setBackgroundColor(getResources().getColor(R.color.a2j));
        this.f61022m = (DmtTextView) view.findViewById(R.id.cyw);
        this.f61022m.setText(R.string.ahj);
        this.f60961j = (DmtStatusView) view.findViewById(R.id.csv);
        this.f60961j.setBuilder(C10719a.m21676a((Context) getActivity()));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.q1, viewGroup, false);
    }
}
