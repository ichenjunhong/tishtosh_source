package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22714d;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22721g;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22722h;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.antiaddic.lock.api.ParentalPlatformApi;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.p1420ui.session.C23705a;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.TimeUnlockFragment */
public class TimeUnlockFragment extends C22747d {

    /* renamed from: d */
    private String f60943d;
    TextView desc;
    TextView title;

    /* renamed from: h */
    public final void mo47117h() {
        super.mo47117h();
        mo47184e();
    }

    /* renamed from: i */
    private boolean m56034i() {
        if (TextUtils.equals(this.f60943d, "logout") || TextUtils.equals(this.f60943d, "add_account") || TextUtils.equals(this.f60943d, "switch_account")) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo47184e() {
        if (getActivity() != null) {
            getActivity().finish();
        }
        mo47187a((View) this.f60947a);
        C23705a b = C22722h.m55984b();
        if (b != null) {
            b.mo49139a(Boolean.valueOf(true));
            return;
        }
        if (m56034i()) {
            C10691a.m21533a(C11010c.m22280a(), (int) R.string.dzp).mo19066a();
            SharePrefCache.inst().getLastUnlockTime().mo47776a(Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo47183b(String str) {
        if (C22714d.f60914a.mo47119b() == C22687a.CHILD) {
            C17825i.m43739a(ParentalPlatformApi.f60910b.verifyPassword(str), new C17824h<BaseResponse>() {
                /* renamed from: a */
                static final /* synthetic */ Object m56038a() throws Exception {
                    C23705a b = C22722h.m55984b();
                    if (b != null) {
                        b.mo49139a(Boolean.valueOf(true));
                    } else {
                        C10691a.m21533a(C11010c.m22280a(), (int) R.string.dzp).mo19066a();
                        SharePrefCache.inst().getLastUnlockTime().mo47776a(Long.valueOf(System.currentTimeMillis()));
                    }
                    return null;
                }

                public final void onFailure(Throwable th) {
                    C0013i.m18a((Callable<TResult>) new C22749f<TResult>(this, th), C0013i.f25b);
                }

                public final /* synthetic */ void onSuccess(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    TimeUnlockFragment.this.getActivity().finish();
                    TimeUnlockFragment.this.mo47187a((View) TimeUnlockFragment.this.f60947a);
                    C0013i.m18a(C22748e.f60969a, C0013i.f25b);
                }
            });
        } else if (C22721g.m55965e()) {
            mo47201c(str);
        } else if (str == null || TimeLockRuler.getUserSetting() == null || !str.equals(TimeLockRuler.getUserSetting().getPassword())) {
            C10691a.m21542b(C11010c.m22280a(), (int) R.string.dzx).mo19066a();
        } else {
            mo47184e();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        int i;
        int i2;
        super.onViewCreated(view, bundle);
        C23705a b = C22722h.m55984b();
        if (b != null) {
            boolean isContentFilterOn = TimeLockRuler.isContentFilterOn();
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("from");
        } else {
            str = "";
        }
        this.f60943d = str;
        if (b != null) {
            boolean isContentFilterOn2 = TimeLockRuler.isContentFilterOn();
            TextView textView = this.desc;
            if (!isContentFilterOn2) {
                i = R.string.dzs;
            } else if (TextUtils.equals(this.f60943d, "add_account")) {
                i = R.string.e2;
            } else if (TextUtils.equals(this.f60943d, "switch_account")) {
                i = R.string.duw;
            } else if (!C20902b.m53242a().isLogin()) {
                i = R.string.df2;
            } else {
                i = R.string.dzr;
            }
            textView.setText(getString(i));
            TextView textView2 = this.title;
            if (isContentFilterOn2) {
                i2 = R.string.dzv;
            } else {
                i2 = R.string.dzw;
            }
            textView2.setText(getString(i2));
            ImageView imageView = (ImageView) view.findViewById(R.id.d0j);
            imageView.setVisibility(0);
            imageView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (TimeUnlockFragment.this.f60947a != null) {
                        TimeUnlockFragment.this.mo47187a((View) TimeUnlockFragment.this.f60947a);
                    }
                    if (TimeUnlockFragment.this.getActivity() != null) {
                        TimeUnlockFragment.this.getActivity().finish();
                    }
                }
            });
            return;
        }
        this.desc.setText(getString(R.string.dzt, getString(R.string.dz9, Integer.valueOf(TimeLockRuler.getLockTimeInMin()))));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.nz, viewGroup, false);
    }
}
