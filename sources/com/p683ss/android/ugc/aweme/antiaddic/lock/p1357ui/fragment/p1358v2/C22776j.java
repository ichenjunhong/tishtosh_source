package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22721g;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1355a.C22704a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1356b.C22712a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.C22743b;
import com.p683ss.android.ugc.aweme.base.p1420ui.session.C23705a;
import com.p683ss.android.ugc.aweme.base.p1420ui.session.C23707c;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.j */
public class C22776j extends C22743b implements C22712a {

    /* renamed from: k */
    private C22704a f61025k;

    /* renamed from: l */
    private int f61026l;

    /* renamed from: g */
    public final void mo47116g() {
        super.mo47116g();
    }

    /* renamed from: h */
    public final void mo47117h() {
        super.mo47117h();
        m56089a(Boolean.valueOf(false));
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f61025k != null) {
            this.f61025k.mo47091a();
        }
    }

    /* renamed from: a */
    private void m56089a(Boolean bool) {
        mo47187a((View) this.f60947a);
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
        C23705a b = C23707c.m58177a().mo49142b("TimeLockEnterFragmentV2", Boolean.class);
        if (b != null) {
            b.mo49139a(bool);
        }
    }

    /* renamed from: b */
    public final void mo47183b(String str) {
        if (C22721g.m55965e()) {
            C52711k.m112240b(str, "<set-?>");
            C22721g.f60928b = str;
            if (!TextUtils.isEmpty(str) && this.f61025k != null && getActivity() != null && this.f60961j != null) {
                mo47197f();
                if (this.f61026l == 2) {
                    this.f61025k.mo47093a(str);
                } else if (this.f61026l == 1) {
                    this.f61025k.mo47094b(C22721g.f60930d.mo47163a(mo47196e(), false, str, false, getActivity()));
                } else {
                    if (this.f61026l == 0) {
                        this.f61025k.mo47094b(C22721g.f60930d.mo47163a(mo47196e(), true, str, false, getActivity()));
                    }
                }
            }
        } else {
            TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
            if (str == null || userSetting == null || !str.equals(userSetting.getPassword())) {
                C10691a.m21542b(getContext(), (int) R.string.dzx).mo19066a();
            } else {
                m56089a(Boolean.valueOf(false));
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.cyw);
        TextView textView2 = (TextView) view.findViewById(R.id.cyv);
        this.f60961j = (DmtStatusView) view.findViewById(R.id.csv);
        this.f60961j.setBuilder(C10719a.m21676a((Context) getActivity()));
        mo47196e();
        this.f61026l = getArguments().getInt("type_close", 0);
        if (this.f61026l == 1) {
            C23729p.m58261a(false, textView2);
            if (mo47196e() == 0) {
                i = R.string.aq4;
            } else {
                i = R.string.aq2;
            }
            textView.setText(getString(i));
        } else if (this.f61026l == 2) {
            textView.setText(getString(R.string.dyz));
            textView2.setText(getString(R.string.dyv));
        } else if (this.f61026l == 0) {
            textView.setText(getString(R.string.brw));
            textView2.setText(getString(R.string.brv));
        }
        this.f61025k = new C22704a();
        this.f61025k.mo47092a((C22712a) this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.px, viewGroup, false);
    }
}
