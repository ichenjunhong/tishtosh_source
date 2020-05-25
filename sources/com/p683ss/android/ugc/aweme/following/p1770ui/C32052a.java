package com.p683ss.android.ugc.aweme.following.p1770ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.C10722c;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.MtEmptyView;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.arch.C23462b;
import com.p683ss.android.ugc.aweme.feed.utils.C31187c;
import com.p683ss.android.ugc.aweme.following.repository.C32041i;
import com.p683ss.android.ugc.aweme.friends.adapter.C32540o;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.views.C48190g;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.following.ui.a */
public abstract class C32052a extends C23462b implements C32540o {

    /* renamed from: j */
    public static final C32053a f83662j = new C32053a(null);

    /* renamed from: b */
    public String f83663b;

    /* renamed from: c */
    public User f83664c;

    /* renamed from: d */
    public boolean f83665d;

    /* renamed from: e */
    protected C10719a f83666e;

    /* renamed from: k */
    private HashMap f83667k;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.a$a */
    public static final class C32053a {
        private C32053a() {
        }

        public /* synthetic */ C32053a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.a$b */
    static final class C32054b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32052a f83668a;

        C32054b(C32052a aVar) {
            this.f83668a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f83668a.mo65265r();
        }
    }

    /* renamed from: a */
    public View mo48632a(int i) {
        if (this.f83667k == null) {
            this.f83667k = new HashMap();
        }
        View view = (View) this.f83667k.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f83667k.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public void mo48633e() {
        if (this.f83667k != null) {
            this.f83667k.clear();
        }
    }

    /* renamed from: j */
    public abstract int mo65257j();

    /* renamed from: l */
    public int mo65259l() {
        return 0;
    }

    /* renamed from: m */
    public String mo65260m() {
        return "";
    }

    /* renamed from: o */
    public boolean mo65262o() {
        return false;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo48633e();
    }

    /* renamed from: p */
    public final boolean mo65263p() {
        return this.f83665d;
    }

    /* renamed from: r */
    public abstract void mo65265r();

    /* renamed from: s */
    public abstract int mo65266s();

    /* renamed from: t */
    public abstract int mo65267t();

    /* renamed from: u */
    public abstract int mo65268u();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C10719a mo65256g() {
        C10719a aVar = this.f83666e;
        if (aVar == null) {
            C52711k.m112237a("mStatusViewBuilder");
        }
        return aVar;
    }

    /* renamed from: n */
    public final String mo65261n() {
        if (mo65258k()) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    /* renamed from: q */
    public final void mo65264q() {
        if (isViewValid()) {
            mo65265r();
            this.f83665d = false;
        }
    }

    /* renamed from: k */
    public final boolean mo65258k() {
        CharSequence charSequence = this.f83663b;
        IAccountUserService a = C20902b.m53242a();
        C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
        return TextUtils.equals(charSequence, a.getCurUserId());
    }

    /* renamed from: a */
    public final void mo65254a(boolean z) {
        this.f83665d = z;
    }

    /* renamed from: a */
    public final boolean mo65255a(ListState<Object, C32041i> listState) {
        C52711k.m112240b(listState, "listState");
        mo65258k();
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f83663b = arguments.getString("uid");
        }
        this.f83664c = C31187c.m72824c();
    }

    /* renamed from: a */
    public final void mo65252a(DmtStatusView dmtStatusView) {
        C52711k.m112240b(dmtStatusView, "statusView");
        C10719a b = C10719a.m21676a(getContext()).mo19232b(C48190g.m104428a(getContext(), new C32054b(this)));
        C52711k.m112236a((Object) b, "DmtStatusView.Builder.cr…orViewStatus(errorStatus)");
        this.f83666e = b;
        MtEmptyView a = MtEmptyView.m21697a(getContext());
        Context context = getContext();
        if (context == null) {
            C52711k.m112234a();
        }
        a.setStatus(new C10723a(context).mo19277a(mo65266s()).mo19280b(mo65268u()).mo19282c(mo65267t()).f28711a);
        C10719a aVar = this.f83666e;
        if (aVar == null) {
            C52711k.m112237a("mStatusViewBuilder");
        }
        aVar.mo19231b((View) a);
        C52711k.m112236a((Object) getString(R.string.hv3), "getString(R.string.vcd_follow_empty_title)");
        C10719a aVar2 = this.f83666e;
        if (aVar2 == null) {
            C52711k.m112237a("mStatusViewBuilder");
        }
        dmtStatusView.setBuilder(aVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65253a(DmtStatusView dmtStatusView, Exception exc) {
        C52711k.m112240b(dmtStatusView, "statusView");
        C52711k.m112240b(exc, "e");
        if (!mo65258k() && getContext() != null) {
            String str = "";
            if (exc instanceof C23459a) {
                User user = this.f83664c;
                if (user != null) {
                    C23459a aVar = (C23459a) exc;
                    if (aVar.getErrorCode() == 2077 && user.isBlock) {
                        str = getString(R.string.tk);
                        C52711k.m112236a((Object) str, "getString(R.string.block_user_empty_info)");
                    } else if (aVar.getErrorCode() == 2078 && user.isBlocked()) {
                        str = getString(R.string.bth);
                        C52711k.m112236a((Object) str, "getString(R.string.is_blocked_empty_info)");
                    } else if (aVar.getErrorCode() == 2096) {
                        str = getString(mo65259l());
                        C52711k.m112236a((Object) str, "getString(getPermissionErrorTextId())");
                    } else if (!TextUtils.isEmpty(aVar.getErrorMsg())) {
                        String errorMsg = aVar.getErrorMsg();
                        C52711k.m112236a((Object) errorMsg, "exception.errorMsg");
                        str = errorMsg;
                    }
                }
            }
            if (!TextUtils.isEmpty(str)) {
                dmtStatusView.mo19209d();
                C10719a aVar2 = this.f83666e;
                if (aVar2 == null) {
                    C52711k.m112237a("mStatusViewBuilder");
                }
                Context context = getContext();
                if (context == null) {
                    C52711k.m112234a();
                }
                C10722c cVar = new C10723a(context).mo19277a((int) R.drawable.aqw).mo19280b((int) R.string.t9).mo19281b(str).f28711a;
                C52711k.m112236a((Object) cVar, "DmtDefaultStatus.Builder… .desc(errorText).build()");
                aVar2.mo19232b(cVar);
                C10719a aVar3 = this.f83666e;
                if (aVar3 == null) {
                    C52711k.m112237a("mStatusViewBuilder");
                }
                dmtStatusView.setBuilder(aVar3);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(mo65257j(), viewGroup, false);
    }
}
