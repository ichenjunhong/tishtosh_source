package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewStub;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.MtEmptyView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.detail.p1621c.C27326a;
import com.p683ss.android.ugc.aweme.detail.p1626h.C27339a;
import com.p683ss.android.ugc.aweme.discover.mob.C28411p;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4.Companion;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter;
import com.p683ss.android.ugc.aweme.experiment.DiscoveryV4Experiment;
import com.p683ss.android.ugc.aweme.experiment.NewDiscoverV4Experiment;
import com.p683ss.android.ugc.aweme.feed.C30180e;
import com.p683ss.android.ugc.aweme.feed.adapter.C30016ag;
import com.p683ss.android.ugc.aweme.feed.adapter.C30056b;
import com.p683ss.android.ugc.aweme.feed.guide.p1722a.C30276a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p683ss.android.ugc.aweme.feed.p1719e.C30198m;
import com.p683ss.android.ugc.aweme.feed.p1719e.C30200o.C30208a;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23200ag;
import com.p683ss.android.ugc.aweme.p1382aq.C23253w;
import com.ss.android.ugc.trill.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.y */
public final class C28716y extends C27339a implements C30276a {

    /* renamed from: s */
    public long f75353s;

    /* renamed from: t */
    public final Set<String> f75354t = new LinkedHashSet();

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.y$a */
    static final class C28717a implements C30208a {

        /* renamed from: a */
        final /* synthetic */ C28716y f75355a;

        C28717a(C28716y yVar) {
            this.f75355a = yVar;
        }

        /* renamed from: a */
        public final void mo58364a(long j, String str) {
            Set<String> set = this.f75355a.f75354t;
            C52711k.m112236a((Object) str, "aid");
            set.add(str);
            this.f75355a.f75353s += j;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.y$b */
    static final class C28718b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C28716y f75356a;

        C28718b(C28716y yVar) {
            this.f75356a = yVar;
        }

        public final void run() {
            this.f75356a.mo60515ag();
            C27326a.m65854a().edit().putBoolean("shouldShowDiscoveryV3Guide", false).apply();
        }
    }

    /* renamed from: H */
    public final String mo58357H() {
        return "playlist_id";
    }

    /* renamed from: I */
    public final String mo58358I() {
        C30669b bVar = this.f79987ae;
        C52711k.m112236a((Object) bVar, "param");
        String cellId = bVar.getCellId();
        C52711k.m112236a((Object) cellId, "param.cellId");
        return cellId;
    }

    /* renamed from: K */
    public final void mo58360K() {
        if (C27326a.m65854a().getBoolean("shouldShowDiscoveryV3Guide", true)) {
            this.f72095b.postDelayed(new C28718b(this), 2000);
        }
    }

    public final void aJ_() {
        if (this.f72096c != null) {
            this.f72096c.mo51231c();
        }
        DmtStatusView o = mo62895o(true);
        if (o != null) {
            o.setVisibility(0);
            o.mo19213g();
        }
    }

    /* renamed from: J */
    public final String mo58359J() {
        if (C10181b.m20511a().mo18168a(DiscoveryV4Experiment.class, true, "discover_v4_type", 31744, 0) == 1) {
            return DiscoverPlayListStructV4.Companion.getPlayListType(2);
        }
        Companion companion = DiscoverPlayListStructV4.Companion;
        C30669b bVar = this.f79987ae;
        C52711k.m112236a((Object) bVar, "param");
        return companion.getPlayListType(bVar.getType());
    }

    /* renamed from: m */
    public final void mo55813m() {
        String str;
        super.mo55813m();
        if (NewDiscoverV4Experiment.m69619c()) {
            C30669b bVar = this.f79987ae;
            C52711k.m112236a((Object) bVar, "param");
            if (bVar.getCellDetailType() != 2) {
                if (mo55829q() != null) {
                    C30669b bVar2 = this.f79987ae;
                    C52711k.m112236a((Object) bVar2, "param");
                    if (bVar2.getIndex() >= 0) {
                        C30669b bVar3 = this.f79987ae;
                        C52711k.m112236a((Object) bVar3, "param");
                        if (bVar3.getIndex() < mo55829q().size()) {
                            List q = mo55829q();
                            C30669b bVar4 = this.f79987ae;
                            C52711k.m112236a((Object) bVar4, "param");
                            Object obj = q.get(bVar4.getIndex());
                            C52711k.m112236a(obj, "awemeItems[param.index]");
                            str = ((Aweme) obj).getAid();
                        }
                    }
                }
                str = "";
            } else if (mo55829q() == null || mo55829q().size() <= 0) {
                str = "";
            } else {
                Aweme aweme = (Aweme) mo55829q().get(0);
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
            }
            String str2 = str;
            C30669b bVar5 = this.f79987ae;
            C52711k.m112236a((Object) bVar5, "param");
            String cellId = bVar5.getCellId();
            Companion companion = DiscoverPlayListStructV4.Companion;
            C30669b bVar6 = this.f79987ae;
            C52711k.m112236a((Object) bVar6, "param");
            C28411p pVar = new C28411p(str2, cellId, companion.getPlayListType(bVar6.getType()), this.f75354t.size(), Long.valueOf(this.f75353s));
            C0013i.m18a((Callable<TResult>) pVar, (Executor) C26890h.m65003a());
        }
    }

    /* renamed from: a */
    public final void mo58362a(View view) {
        this.f79992aj = this;
    }

    /* renamed from: a */
    public final void mo58361a(Bundle bundle) {
        super.mo58361a(bundle);
        if (NewDiscoverV4Experiment.m69619c()) {
            this.f79988af.f78853v = new C28717a(this);
        }
    }

    /* renamed from: b */
    public final void mo55798b(List<Aweme> list) {
        super.mo55798b(list);
        C30180e eVar = this.f79986ad;
        String J = mo58359J();
        String H = mo58357H();
        String I = mo58358I();
        C30669b bVar = this.f79987ae;
        C52711k.m112236a((Object) bVar, "param");
        eVar.mo60467a(J, H, I, bVar.getTabName());
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        if (this.f72096c != null) {
            this.f72096c.mo51231c();
        }
        C22971a.m56493a(C11010c.m22280a(), (Throwable) exc);
        DmtStatusView o = mo62895o(true);
        if (o != null) {
            o.setVisibility(0);
            o.mo19214h();
        }
    }

    /* renamed from: a */
    public final void mo47018a(List<Object> list, boolean z) {
        super.mo47018a((List) list, z);
        C30669b bVar = this.f79987ae;
        C52711k.m112236a((Object) bVar, "param");
        if (bVar.getCellDetailType() == 2 && this.f72101g != null) {
            this.f72101g.mo55941g();
        }
    }

    /* renamed from: a */
    public final void mo55784a(View view, Bundle bundle) {
        super.mo55784a(view, bundle);
        String str = null;
        View inflate = LayoutInflater.from(mo96010bw()).inflate(R.layout.auo, null);
        if (inflate != null) {
            DmtTextView dmtTextView = (DmtTextView) inflate;
            if (TextUtils.equals(mo55772A(), DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
                Context bw = mo96010bw();
                if (bw != null) {
                    str = bw.getString(R.string.g66);
                }
                dmtTextView.setText(str);
            }
            this.f80029x.setLoadMoreEmptyView(dmtTextView);
            C30669b bVar = this.f79987ae;
            C52711k.m112236a((Object) bVar, "param");
            if (!TextUtils.isEmpty(bVar.getTabText())) {
                ViewStub viewStub = (ViewStub) this.f72095b.findViewById(R.id.e9x);
                if (viewStub != null) {
                    viewStub.inflate();
                }
                View findViewById = this.f72095b.findViewById(R.id.e9w);
                C52711k.m112236a((Object) findViewById, "mLayout.findViewById<Dmt…id.fragment_detail_title)");
                DmtTextView dmtTextView2 = (DmtTextView) findViewById;
                C30669b bVar2 = this.f79987ae;
                C52711k.m112236a((Object) bVar2, "param");
                dmtTextView2.setText(bVar2.getTabText());
            }
            DmtStatusView o = mo62895o(true);
            MtEmptyView a = MtEmptyView.m21697a((Context) this.f121964aK);
            a.setStatus(new C10723a(this.f121964aK).mo19282c(R.string.gvp).f28711a);
            if (o != null) {
                o.setBuilder(C10719a.m21676a(mo96010bw()).mo19233c(1).mo19231b((View) a));
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtTextView");
    }

    /* renamed from: a */
    public final void mo55786a(C30016ag agVar, String str) {
        C52711k.m112240b(agVar, "baseHolder");
        C52711k.m112240b(str, "eventType");
        C23200ag e = new C23200ag().mo47960a(str).mo47962b(str).mo47972t(mo58358I()).mo47971s(mo58357H()).mo47970h(mo58359J()).mo47954f(agVar.mo53999e()).mo47967e(String.valueOf(this.f72111q));
        C30669b bVar = this.f79987ae;
        C52711k.m112236a((Object) bVar, "param");
        ((C23200ag) ((C23200ag) e.mo48100j(bVar.getTabName())).mo48101k(C23198ae.m56854b(agVar.mo53999e(), mo60502X()))).mo48076e();
    }

    /* renamed from: a */
    public final void mo58363a(Aweme aweme, String str) {
        String str2;
        String str3;
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "uid");
        C23253w b = new C23253w().mo48161b(mo60874g(true));
        if (TextUtils.isEmpty(mo60491M())) {
            str2 = ay_();
        } else {
            str2 = mo60491M();
        }
        C23253w d = b.mo48164d(str2);
        if (TextUtils.isEmpty(mo60491M())) {
            str3 = "follow_button";
        } else {
            str3 = mo62870bj();
        }
        C23253w e = d.mo48165e(str3);
        e.f62145c = mo58358I();
        e.f62144b = mo58357H();
        e.f62137a = mo58359J();
        C23253w c = e.mo48163c("follow_button").mo48166f(str).mo48162c(aweme, mo60502X());
        C30669b bVar = this.f79987ae;
        C52711k.m112236a((Object) bVar, "param");
        ((C23253w) ((C23253w) c.mo48100j(bVar.getTabName())).mo48101k(C23198ae.m56854b(aweme, mo60502X()))).mo48076e();
    }

    /* renamed from: a */
    public final C30056b mo55779a(Context context, LayoutInflater layoutInflater, C30313ae<C30332aw> aeVar, Fragment fragment, OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, C30198m mVar) {
        Context context2 = context;
        C52711k.m112240b(context, "context");
        LayoutInflater layoutInflater2 = layoutInflater;
        C52711k.m112240b(layoutInflater, "inflater");
        C30313ae<C30332aw> aeVar2 = aeVar;
        C52711k.m112240b(aeVar, "listener");
        Fragment fragment2 = fragment;
        C52711k.m112240b(fragment, "fragment");
        OnTouchListener onTouchListener2 = onTouchListener;
        C52711k.m112240b(onTouchListener, "tapTouchListener");
        BaseFeedPageParams baseFeedPageParams2 = baseFeedPageParams;
        C52711k.m112240b(baseFeedPageParams, "baseFeedPageParams");
        C30198m mVar2 = mVar;
        C52711k.m112240b(mVar2, "iHandlePlay");
        C28714x xVar = new C28714x(context2, layoutInflater2, aeVar2, fragment2, onTouchListener2, baseFeedPageParams2, mVar2);
        String J = mo58359J();
        String H = mo58357H();
        String I = mo58358I();
        C30669b bVar = this.f79987ae;
        C52711k.m112236a((Object) bVar, "param");
        String tabName = bVar.getTabName();
        C52711k.m112236a((Object) tabName, "param.tabName");
        C52711k.m112240b(J, "playListType");
        C52711k.m112240b(H, "playListIdKey");
        C52711k.m112240b(I, "playListId");
        C52711k.m112240b(tabName, "tabName");
        xVar.f75350c = I;
        xVar.f75348a = J;
        xVar.f75349b = H;
        xVar.f75351d = tabName;
        return xVar;
    }
}
