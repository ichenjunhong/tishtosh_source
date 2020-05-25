package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.C10722c;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p683ss.android.ugc.aweme.discover.p1645g.C28127h;
import com.p683ss.android.ugc.aweme.discover.p1645g.C28128i;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28525az.C28526a;
import com.p683ss.android.ugc.aweme.discover.p1659ui.p1661b.C28534c;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.search.model.SearchResultParamProvider.C41433a;
import com.p683ss.android.ugc.aweme.search.p2122b.C41406a;
import com.p683ss.android.ugc.aweme.search.p2124d.C41412a;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.by */
public abstract class C28604by<D> extends C28550bj<D> implements C41406a {

    /* renamed from: a */
    private HashMap f75129a;

    /* renamed from: b */
    protected C28128i<?> f75130b;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.by$a */
    static final class C28605a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C28604by f75131a;

        C28605a(C28604by byVar) {
            this.f75131a = byVar;
        }

        public final void run() {
            if (this.f75131a.isViewValid()) {
                this.f75131a.mo58232E();
            }
        }
    }

    /* renamed from: a */
    public View mo56545a(int i) {
        if (this.f75129a == null) {
            this.f75129a = new HashMap();
        }
        View view = (View) this.f75129a.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f75129a.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: j */
    public void mo56548j() {
        if (this.f75129a != null) {
            this.f75129a.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final C28128i<?> mo58297J() {
        C28128i<?> iVar = this.f75130b;
        if (iVar == null) {
            C52711k.m112237a("mPresenter");
        }
        return iVar;
    }

    public void onDestroyView() {
        super.onDestroyView();
        C28128i<?> iVar = this.f75130b;
        if (iVar == null) {
            C52711k.m112237a("mPresenter");
        }
        iVar.mo46991S_();
        mo56548j();
    }

    public void aJ_() {
        C28128i<?> iVar = this.f75130b;
        if (iVar == null) {
            C52711k.m112237a("mPresenter");
        }
        if (iVar.mo54803n() instanceof C28127h) {
            C28534c z = mo58252z();
            C28128i<?> iVar2 = this.f75130b;
            if (iVar2 == null) {
                C52711k.m112237a("mPresenter");
            }
            C28127h hVar = (C28127h) iVar2.mo54803n();
            C52711k.m112236a((Object) hVar, "mPresenter.model");
            C10722c a = C28534c.m67702a(z, (SearchApiResult) hVar.getData(), null, 2, null);
            if (a != null) {
                mo58238a(a);
                return;
            }
        }
        mo58233F();
        mo58236I();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo56568m() {
        C41412a aVar;
        if ((this.f74963o == 2 || this.f74963o == 5) && TextUtils.equals(this.f74960l, this.f74961m)) {
            C28128i<?> iVar = this.f75130b;
            if (iVar == null) {
                C52711k.m112237a("mPresenter");
            }
            iVar.mo56544b(C28526a.m67668a());
        } else {
            C28128i<?> iVar2 = this.f75130b;
            if (iVar2 == null) {
                C52711k.m112237a("mPresenter");
            }
            iVar2.mo56544b(0);
        }
        C28128i<?> iVar3 = this.f75130b;
        if (iVar3 == null) {
            C52711k.m112237a("mPresenter");
        }
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(4);
        objArr[1] = mo58234G();
        objArr[2] = Integer.valueOf(1);
        objArr[3] = Integer.valueOf(this.f74967s);
        C41440e eVar = this.f74957e;
        if (eVar != null) {
            aVar = eVar.getFilterOption();
        } else {
            aVar = null;
        }
        objArr[4] = aVar;
        iVar3.mo44934a_(objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58298a(C28128i<?> iVar) {
        C52711k.m112240b(iVar, "<set-?>");
        this.f75130b = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo56556b(int i) {
        C28128i<?> iVar = this.f75130b;
        if (iVar == null) {
            C52711k.m112237a("mPresenter");
        }
        iVar.mo44934a_(Integer.valueOf(1), this.f74960l, Integer.valueOf(i), Integer.valueOf(this.f74967s));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo56664b(boolean z) {
        String str;
        if (getContext() != null) {
            Context context = getContext();
            if (context == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) context, "context!!");
            C41440e a = C41433a.m91252a(context);
            if (a != null) {
                C41440e eVar = this.f75030G;
                if (eVar != null) {
                    str = eVar.getKeyword();
                } else {
                    str = null;
                }
                a.setCurrentSearchKeyword(str);
            }
        }
        String l = mo56549l();
        C28128i<?> iVar = this.f75130b;
        if (iVar == null) {
            C52711k.m112237a("mPresenter");
        }
        C28127h hVar = (C28127h) iVar.mo54803n();
        if (hVar != null) {
            mo58242a(l, hVar.f73863j, this.f74960l, z, hVar.mo56540g());
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchBaseModel<*, *>");
    }

    /* renamed from: a */
    public void mo56552a(int i, C41412a aVar) {
        super.mo56552a(i, aVar);
        if (C28606bz.m67853a(getActivity())) {
            if ((this.f74963o == 2 || this.f74963o == 5) && TextUtils.equals(this.f74960l, this.f74961m)) {
                C28128i<?> iVar = this.f75130b;
                if (iVar == null) {
                    C52711k.m112237a("mPresenter");
                }
                iVar.mo56544b(C28526a.m67668a());
            } else {
                C28128i<?> iVar2 = this.f75130b;
                if (iVar2 == null) {
                    C52711k.m112237a("mPresenter");
                }
                iVar2.mo56544b(0);
            }
            C28128i<?> iVar3 = this.f75130b;
            if (iVar3 == null) {
                C52711k.m112237a("mPresenter");
            }
            iVar3.mo56543a(this.f74964p);
            mo56556b(i);
            return;
        }
        C18842a.m45933a(new C28605a(this), 100);
    }
}
