package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0214z;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22721g;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22722h;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.antiaddic.lock.api.ParentalPlatformApi;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1355a.C22704a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1356b.C22712a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.BaseLockActivity;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.C22733e;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2.C22770h.C22773a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.viewmodel.C22781a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.viewmodel.SetLockParamViewModel;
import com.p683ss.android.ugc.aweme.antiaddic.lock.viewmodel.TimeLockOptionViewModel;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.p1420ui.session.C23706b;
import com.p683ss.android.ugc.aweme.base.p1420ui.session.C23707c;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.a */
public abstract class C22753a extends C23526a implements C22712a {

    /* renamed from: a */
    protected Button f60984a;

    /* renamed from: b */
    protected View f60985b;

    /* renamed from: c */
    protected DmtTextView f60986c;

    /* renamed from: d */
    protected C22704a f60987d;

    /* renamed from: e */
    private DmtStatusView f60988e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo47204a();

    /* renamed from: g */
    public final void mo47116g() {
        m56066k();
    }

    /* renamed from: k */
    private void m56066k() {
        if (this.f60988e != null) {
            this.f60988e.mo19209d();
        }
    }

    /* renamed from: e */
    public final int mo47212e() {
        return ((C22781a) ((SetLockParamViewModel) C0214z.m440a(getActivity()).mo359a(SetLockParamViewModel.class)).f61035a.getValue()).f61037a;
    }

    /* renamed from: h */
    public final void mo47117h() {
        m56066k();
        C22721g.f60930d.mo47164a(getActivity(), mo47212e(), false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final LiveData<C22781a> mo47213i() {
        if (getActivity() == null) {
            return null;
        }
        return ((SetLockParamViewModel) C0214z.m440a(getActivity()).mo359a(SetLockParamViewModel.class)).f61035a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo47214j() {
        if (mo47213i() == null || ((C22781a) mo47213i().getValue()).f61038b == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo47205f() {
        boolean z;
        Fragment fragment;
        if (mo47214j()) {
            HashMap hashMap = new HashMap();
            if (mo47212e() == 0) {
                hashMap.put("screen_time_management", String.valueOf(((C22773a) ((TimeLockOptionViewModel) C0214z.m440a(getActivity()).mo359a(TimeLockOptionViewModel.class)).f61036a.getValue()).f61019b));
            } else {
                hashMap.put("teen_mode", "1");
            }
            if (mo47213i() != null) {
                C17832m a = ParentalPlatformApi.m55930a(((C22781a) mo47213i().getValue()).f61038b.f61039a, hashMap);
                if (a != null) {
                    C17825i.m43739a(a, new C17824h<BaseResponse>() {
                        public final void onFailure(final Throwable th) {
                            C0013i.m18a((Callable<TResult>) new Callable<Object>() {
                                public final Object call() throws Exception {
                                    C22971a.m56493a(C22753a.this.getContext(), th);
                                    return null;
                                }
                            }, C0013i.f25b);
                        }

                        public final /* synthetic */ void onSuccess(Object obj) {
                            BaseResponse baseResponse = (BaseResponse) obj;
                            C0013i.m18a((Callable<TResult>) new Callable<Object>() {
                                public final Object call() throws Exception {
                                    FragmentActivity activity = C22753a.this.getActivity();
                                    int e = C22753a.this.mo47212e();
                                    if (e == 0) {
                                        C10691a.m21533a((Context) activity, (int) R.string.dzf).mo19066a();
                                    } else {
                                        C10691a.m21533a((Context) activity, (int) R.string.dwq).mo19066a();
                                    }
                                    C22722h.m55980a(activity, e);
                                    return null;
                                }
                            }, C0013i.f25b);
                        }
                    });
                }
            }
            return;
        }
        if (C22721g.m55965e()) {
            if (!C22721g.f60930d.mo47169f()) {
                fragment = C22733e.m56031a(false);
            } else {
                fragment = C22733e.m56029a();
                C23707c.m58177a().mo49140a("TimeLockEnterFragmentV2", Boolean.class).mo49136a((C0184k) fragment).mo49138a(this, new C23706b() {
                    /* renamed from: a */
                    public final void mo47089a(Object obj) {
                        C22721g.f60930d.mo47164a(C22753a.this.getActivity(), C22753a.this.mo47212e(), false);
                    }
                });
            }
            m56065a(fragment);
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (TimeLockRuler.getUserSetting() == null) {
                m56065a(C22733e.m56031a(false));
                return;
            }
            Fragment a2 = C22733e.m56029a();
            C23707c.m58177a().mo49140a("TimeLockEnterFragmentV2", Boolean.class).mo49136a((C0184k) a2).mo49138a(this, new C23706b() {
                /* renamed from: a */
                public final void mo47089a(Object obj) {
                    C22722h.m55981a(C22753a.this.getActivity(), C22753a.this.mo47212e(), TimeLockRuler.getUserSetting());
                }
            });
            m56065a(a2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo47211a(View view) {
        mo47205f();
    }

    /* renamed from: a */
    private void m56065a(Fragment fragment) {
        ((BaseLockActivity) getActivity()).mo47173a(fragment);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f60984a = (Button) view.findViewById(R.id.o7);
        this.f60986c = (DmtTextView) view.findViewById(R.id.d0a);
        this.f60985b = view.findViewById(R.id.ik);
        this.f60985b.setOnClickListener(new C22759b(this));
        this.f60984a.setOnClickListener(new C22760c(this));
        this.f60988e = (DmtStatusView) view.findViewById(R.id.csv);
        this.f60988e.setBuilder(C10719a.m21676a((Context) getActivity()));
        this.f60987d = new C22704a();
        this.f60987d.mo47092a((C22712a) this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(mo47204a(), viewGroup, false);
    }
}
