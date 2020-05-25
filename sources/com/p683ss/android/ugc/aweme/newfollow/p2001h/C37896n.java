package com.p683ss.android.ugc.aweme.newfollow.p2001h;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.content.C0732g;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.p125a.C2667b;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.base.p1411c.C23481a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26878d;
import com.p683ss.android.ugc.aweme.common.p1594f.C26882h;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.C26990b.C26991a;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30508z;
import com.p683ss.android.ugc.aweme.flowfeed.p1757f.C31777f;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.C31835c;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40266bq.C40267a;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40321dd;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47863eu;
import com.ss.android.ugc.trill.R;
import java.util.List;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.newfollow.h.n */
public class C37896n extends C40321dd implements C26878d, C26991a {

    /* renamed from: a */
    public C37888h f96467a;

    /* renamed from: b */
    public boolean f96468b;

    /* renamed from: c */
    public C40267a f96469c;

    /* renamed from: d */
    protected long f96470d = -1;

    /* renamed from: e */
    public String f96471e;

    /* renamed from: j */
    public int f96472j;

    /* renamed from: k */
    public String f96473k;

    /* renamed from: l */
    protected String f96474l;

    /* renamed from: m */
    public boolean f96475m = true;

    /* renamed from: n */
    private C37887g f96476n;

    /* renamed from: o */
    private C37882b f96477o;

    /* renamed from: p */
    private C31777f f96478p;

    /* renamed from: q */
    private BroadcastReceiver f96479q;

    /* renamed from: r */
    private boolean f96480r;

    /* renamed from: s */
    private boolean f96481s;

    /* renamed from: t */
    private boolean f96482t;

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo50461a(List list, int i) {
    }

    /* renamed from: a */
    public final boolean mo50463a(C26882h hVar) {
        return false;
    }

    public final boolean aT_() {
        return this.f96475m;
    }

    public final void aX_() {
    }

    /* renamed from: c_ */
    public final void mo50466c_(int i) {
    }

    public void onDetach() {
        super.onDetach();
    }

    /* renamed from: e */
    public final boolean mo77336e() {
        return TextUtils.equals(this.f96473k, C20902b.m53242a().getCurUserId());
    }

    public void onStop() {
        super.onStop();
        if (this.f96467a != null) {
            this.f96467a.mo64891g();
        }
        this.f96468b = false;
    }

    /* renamed from: l */
    public final View mo50471l() {
        if (!isViewValid() || this.f96467a == null) {
            return null;
        }
        return this.f96467a.f83135b;
    }

    public void onPause() {
        super.onPause();
        this.f29769b_ = false;
        if (this.f96467a != null) {
            this.f96467a.mo64893h();
        }
        if (!mo77336e()) {
            C2667b.m7668c("profile", "dongtai", 0);
        }
        this.f96468b = false;
    }

    public void onResume() {
        super.onResume();
        if (getUserVisibleHint() && !C47863eu.m103535a()) {
            if (this.f96467a != null) {
                this.f96467a.mo64890f();
            }
            this.f96468b = true;
        }
    }

    /* renamed from: h */
    private boolean m84692h() {
        if (!isViewValid() || TimeLockRuler.isTeenModeON()) {
            return false;
        }
        if (!C37898o.m84703a(getActivity())) {
            if (!this.f96475m) {
                C10691a.m21542b((Context) getActivity(), (int) R.string.cg1).mo19066a();
            }
            this.f96475m = true;
            return false;
        }
        this.f96475m = false;
        boolean z = !this.f96476n.mo54804o();
        if (!TextUtils.isEmpty(C20902b.m53242a().getCurUserId()) && this.f96467a != null) {
            this.f96467a.mo47048a();
        }
        return z;
    }

    public final void aV_() {
        if (this.f96480r) {
            if (isViewValid()) {
                if (this.f96467a != null) {
                    this.f96467a.mo77332k();
                }
                if (this.f96469c != null) {
                    this.f96469c.mo82252a("personal_homepage".equals(this.f96471e), 5);
                }
                if (!mo77336e()) {
                    C2667b.m7667b("profile", "dongtai", 0);
                }
            }
            return;
        }
        if (!this.f96482t && !TimeLockRuler.isTeenModeON()) {
            m84692h();
        } else if (this.f96467a != null) {
            this.f96467a.mo77331j();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f96476n != null) {
            this.f96476n.mo46991S_();
            this.f96476n.aq_();
            this.f96476n.mo64717g();
            this.f96476n.mo64716f();
        }
        if (this.f96478p != null) {
            this.f96478p.mo46991S_();
            this.f96478p.aq_();
            this.f96478p.mo64734g();
        }
        if (this.f96467a != null) {
            this.f96467a.mo64894i();
        }
        C0732g.m2130a(getContext()).mo2402a(this.f96479q);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    /* renamed from: c_ */
    public final void mo76536c_(boolean z) {
        this.f96482t = z;
    }

    /* renamed from: b */
    public final void mo77334b(boolean z) {
        this.f96480r = z;
        if (this.f96467a != null) {
            this.f96467a.f96454q = z;
        }
    }

    /* renamed from: c */
    public final void mo77335c(boolean z) {
        this.f96481s = z;
        if (this.f96467a != null) {
            this.f96467a.f96455r = z;
        }
    }

    @C53771m
    public void onAntiCrawlerEvent(C23481a aVar) {
        String str = aVar.f62554a;
        if (str != null && str.contains("/aweme/v1/forward/list/?")) {
            C47718bf.m103293f(aVar);
            m84692h();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f96471e = arguments.getString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE");
        this.f96473k = arguments.getString("uid");
        this.f96474l = arguments.getString("sec_user_id");
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (this.f96467a != null) {
            this.f96467a.mo64887c(z);
        }
        if (!z) {
            if (this.f96467a != null) {
                this.f96467a.mo64893h();
            }
            if (!mo77336e()) {
                C2667b.m7668c("profile", "dongtai", 0);
            }
        } else if (this.f96467a != null) {
            this.f96467a.mo64890f();
        }
    }

    /* renamed from: a */
    public final void mo53807a(String str, String str2) {
        if (!TextUtils.isEmpty(str) || this.f96467a != null) {
            this.f96473k = str;
            this.f96474l = str2;
            if (this.f96467a != null) {
                this.f96467a.mo77330b(str, str2);
            }
            this.f96475m = true;
            if (this.f96476n != null) {
                this.f96476n.f96447q = this.f96473k;
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f96478p = new C31777f(this.f96471e, this.f96472j);
        this.f96478p.mo64733f();
        this.f96467a = new C37888h(this.f96473k, this.f96474l, mo77336e());
        this.f96478p.mo54799a(new C30508z());
        this.f96478p.mo54800a((C31835c) this.f96467a);
        this.f96479q = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction()) && C37896n.this.getUserVisibleHint() && C37896n.this.f29769b_ && !C37896n.this.f96468b) {
                    if (C37896n.this.f96467a != null) {
                        C37896n.this.f96467a.mo64890f();
                    }
                    C37896n.this.f96468b = true;
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        C0732g.m2130a(getContext()).mo2403a(this.f96479q, intentFilter);
        if (this.f96476n == null) {
            this.f96476n = new C37887g(this);
            this.f96476n.f96446p = this.f96471e;
            this.f96476n.f96447q = this.f96473k;
        }
        this.f96476n = this.f96476n;
        this.f96476n.mo64702a((Fragment) this, this.f96472j);
        this.f96476n.mo54800a(this.f96467a);
        this.f96467a.mo77327a(this, view, this.f96476n, this.f96478p);
        this.f96477o = new C37882b();
        this.f96476n.mo54799a(this.f96477o);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.qv, viewGroup, false);
    }
}
