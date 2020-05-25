package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0214z;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22722h;
import com.p683ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager.C22694b;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.antiaddic.lock.api.ParentalPlatformApi;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.BaseLockActivity;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.C22733e;
import com.p683ss.android.ugc.aweme.antiaddic.lock.viewmodel.C22781a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.viewmodel.SetLockParamViewModel;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.p1420ui.session.C23706b;
import com.p683ss.android.ugc.aweme.base.p1420ui.session.C23707c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p685s.C10917a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlinx.coroutines.C53256be;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.d */
public abstract class C22761d extends C23526a {

    /* renamed from: a */
    protected Button f60997a;

    /* renamed from: b */
    protected Button f60998b;

    /* renamed from: c */
    protected View f60999c;

    /* renamed from: d */
    protected TimeLockUserSetting f61000d;

    /* renamed from: e */
    private DmtStatusView f61001e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo47206a();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final LiveData<C22781a> mo47222e() {
        if (getActivity() == null) {
            return null;
        }
        return ((SetLockParamViewModel) C0214z.m440a(getActivity()).mo359a(SetLockParamViewModel.class)).f61035a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo47223f() {
        if (mo47222e() == null || ((C22781a) mo47222e().getValue()).f61038b == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo47220a(Fragment fragment) {
        ((BaseLockActivity) getActivity()).mo47173a(fragment);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47219a(final int i) {
        HashMap hashMap = new HashMap();
        if (i == 1) {
            hashMap.put("teen_mode", "0");
        } else {
            hashMap.put("screen_time_management", "0");
        }
        if (mo47222e() != null) {
            C17832m a = ParentalPlatformApi.m55930a(((C22781a) mo47222e().getValue()).f61038b.f61039a, hashMap);
            if (a != null) {
                C17825i.m43739a(a, new C17824h<BaseResponse>() {
                    public final void onFailure(final Throwable th) {
                        C0013i.m18a((Callable<TResult>) new Callable<Object>() {
                            public final Object call() throws Exception {
                                C22971a.m56493a(C22761d.this.getContext(), th);
                                return null;
                            }
                        }, C0013i.f25b);
                    }

                    public final /* synthetic */ void onSuccess(Object obj) {
                        BaseResponse baseResponse = (BaseResponse) obj;
                        C0013i.m18a((Callable<TResult>) new Callable<Object>() {
                            public final Object call() throws Exception {
                                int i;
                                if (i == 1) {
                                    i = R.string.d8d;
                                } else {
                                    i = R.string.dyw;
                                }
                                String string = C11010c.m22280a().getString(i);
                                if (C22761d.this.getActivity() != null) {
                                    string = C22761d.this.getActivity().getString(i);
                                }
                                C10691a.m21537a(C11010c.m22280a(), string).mo19066a();
                                C22722h.m55985b(C22761d.this.getActivity(), i);
                                return null;
                            }
                        }, C0013i.f25b);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo47221a(View view) {
        String str;
        C17832m mVar;
        if (mo47223f()) {
            if (mo47222e() != null) {
                String str2 = ((C22781a) mo47222e().getValue()).f61038b.f61039a;
                Context context = getContext();
                C52711k.m112240b(str2, "uid");
                C52711k.m112240b(context, "context");
                if (TextUtils.isEmpty(str2)) {
                    mVar = null;
                } else {
                    mVar = ParentalPlatformApi.f60910b.getDynamicPassword(str2);
                }
                if (mVar != null) {
                    C53301g.m113291a(C53256be.f131885a, C10917a.m22170a(), null, new C22694b(mVar, context, null), 2, null);
                }
            }
            return;
        }
        String str3 = "qa_enter_change_passport";
        C23089d a = C23089d.m56640a();
        String str4 = "enter_method";
        if (mo47222e() == null) {
            str = "";
        } else if (((C22781a) mo47222e().getValue()).f61037a == 0) {
            str = "time_lock";
        } else {
            str = "teen_mode";
        }
        C26890h.m65011a(str3, a.mo47829a(str4, str).f61491a);
        Fragment b = C22733e.m56032b(2);
        C23707c.m58177a().mo49140a("TimeLockEnterFragmentV2", Boolean.class).mo49136a((C0184k) b).mo49138a(this, new C23706b<Boolean>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo47089a(Object obj) {
                Boolean bool = (Boolean) obj;
                C22761d.this.mo47220a(C22733e.m56031a(true));
            }
        });
        mo47220a(b);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f60997a = (Button) view.findViewById(R.id.o7);
        this.f60999c = view.findViewById(R.id.ik);
        this.f60999c.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C22761d.this.getActivity().onBackPressed();
            }
        });
        this.f61001e = (DmtStatusView) view.findViewById(R.id.csv);
        this.f61001e.setBuilder(C10719a.m21676a((Context) getActivity()));
        this.f61000d = TimeLockRuler.getUserSetting();
        this.f60998b = (Button) view.findViewById(R.id.o6);
        this.f60997a.setOnClickListener(new C22767e(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(mo47206a(), viewGroup, false);
    }
}
