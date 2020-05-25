package com.p683ss.android.ugc.aweme.poi.p2074ui.detail.p2077b;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Message;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0677p;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.ies.dmt.p664ui.widget.C10720a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.base.p1411c.C23481a;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.C24637c;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.detail.C27311a;
import com.p683ss.android.ugc.aweme.detail.C27365i;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.location.C36282r;
import com.p683ss.android.ugc.aweme.location.C36285u.C36286a;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.poi.C39065f.C39066a;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.C39067g.C39068a;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter.C38999a;
import com.p683ss.android.ugc.aweme.poi.map.C39078j;
import com.p683ss.android.ugc.aweme.poi.map.C39079k;
import com.p683ss.android.ugc.aweme.poi.map.MapLayout;
import com.p683ss.android.ugc.aweme.poi.model.C39128l;
import com.p683ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.p2059b.C39043c;
import com.p683ss.android.ugc.aweme.poi.p2074ui.PoiRouteActivity;
import com.p683ss.android.ugc.aweme.poi.p2074ui.coupon.C39312e;
import com.p683ss.android.ugc.aweme.poi.p2074ui.detail.component.PoiHeaderWidgetGroup;
import com.p683ss.android.ugc.aweme.poi.p2074ui.p2075a.C39288k;
import com.p683ss.android.ugc.aweme.poi.p2074ui.p2075a.C39290l;
import com.p683ss.android.ugc.aweme.poi.p2074ui.p2075a.C39291m;
import com.p683ss.android.ugc.aweme.poi.p2074ui.p2075a.C39292n;
import com.p683ss.android.ugc.aweme.poi.utils.C39440a;
import com.p683ss.android.ugc.aweme.poi.utils.C39444e;
import com.p683ss.android.ugc.aweme.poi.utils.C39456o;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40320dc;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a.C47939a;
import com.p683ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48675k;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.b.c */
public final class C39325c extends C24637c implements C38999a, C39078j, C39079k, C39292n, C39312e {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f100526d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C39325c.class), "mHandler", "getMHandler()Lcom/bytedance/common/utility/collection/WeakHandler;"))};

    /* renamed from: J */
    private DetailAwemeListFragment f100527J;

    /* renamed from: K */
    private C39335e f100528K;

    /* renamed from: L */
    private C39290l f100529L;

    /* renamed from: M */
    private C39291m f100530M;

    /* renamed from: O */
    private float f100531O;

    /* renamed from: P */
    private float f100532P;

    /* renamed from: Q */
    private final C52668f f100533Q = C52732g.m112285a(new C39326a(this));

    /* renamed from: R */
    private HashMap f100534R;

    /* renamed from: e */
    private C39128l f100535e;

    /* renamed from: j */
    private C39067g f100536j;

    /* renamed from: k */
    private String f100537k = "";

    /* renamed from: l */
    private String f100538l;

    /* renamed from: m */
    private String f100539m;

    /* renamed from: n */
    private PoiDetail f100540n;

    /* renamed from: o */
    private PoiStruct f100541o;

    /* renamed from: p */
    private String f100542p;

    /* renamed from: q */
    private boolean f100543q;

    /* renamed from: r */
    private boolean f100544r;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.b.c$a */
    static final class C39326a extends C52712l implements C52670a<C9381g> {

        /* renamed from: a */
        final /* synthetic */ C39325c f100545a;

        C39326a(C39325c cVar) {
            this.f100545a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C9381g(this.f100545a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.b.c$b */
    static final class C39327b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39325c f100546a;

        C39327b(C39325c cVar) {
            this.f100546a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f100546a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.b.c$c */
    static final class C39328c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39325c f100547a;

        C39328c(C39325c cVar) {
            this.f100547a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f100547a.mo79150a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.b.c$d */
    static final class C39329d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39325c f100548a;

        C39329d(C39325c cVar) {
            this.f100548a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C39325c cVar = this.f100548a;
            C36286a.m81926a(cVar.getActivity(), new C39333h(cVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.b.c$e */
    static final class C39330e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39325c f100549a;

        C39330e(C39325c cVar) {
            this.f100549a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f100549a.mo80164a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.b.c$f */
    static final class C39331f implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ C39325c f100550a;

        C39331f(C39325c cVar) {
            this.f100550a = cVar;
        }

        public final boolean onLongClick(View view) {
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.b.c$g */
    static final class C39332g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39325c f100551a;

        C39332g(C39325c cVar) {
            this.f100551a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f100551a.mo80164a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.b.c$h */
    public static final class C39333h implements C47939a {

        /* renamed from: a */
        final /* synthetic */ C39325c f100552a;

        /* renamed from: b */
        public final void mo60069b() {
            this.f100552a.mo80164a();
        }

        /* renamed from: a */
        public final void mo60068a() {
            if (C36286a.m81925a().mo75120b(null) != null) {
                C36286a.m81925a().mo75121b();
            }
            this.f100552a.mo80164a();
        }

        C39333h(C39325c cVar) {
            this.f100552a = cVar;
        }
    }

    /* renamed from: b */
    private View m87421b(int i) {
        if (this.f100534R == null) {
            this.f100534R = new HashMap();
        }
        View view = (View) this.f100534R.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f100534R.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: f */
    private final C9381g m87422f() {
        return (C9381g) this.f100533Q.getValue();
    }

    /* renamed from: G */
    public final Fragment mo80015G() {
        return this;
    }

    /* renamed from: a */
    public final C27365i mo55746a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "viewGroup");
        return null;
    }

    /* renamed from: a */
    public final String mo50606a(int i) {
        return "poi_page";
    }

    /* renamed from: a */
    public final void mo80022a(String str, int i) {
        C52711k.m112240b(str, "poiId");
    }

    /* renamed from: d */
    public final CheckableImageView mo79152d() {
        return null;
    }

    /* renamed from: n */
    public final int mo50618n() {
        return R.layout.bmw;
    }

    /* renamed from: o */
    public final String mo50619o() {
        return this.f100537k;
    }

    @C53771m
    public final void onVideoEvent(C30332aw awVar) {
        C52711k.m112240b(awVar, "event");
    }

    /* renamed from: t */
    public final boolean mo55750t() {
        return false;
    }

    /* renamed from: c */
    public final C39128l mo79151c() {
        C39128l lVar = this.f100535e;
        if (lVar == null) {
            C52711k.m112234a();
        }
        return lVar;
    }

    public final void bG_() {
        this.f100544r = true;
        if (this.f100541o != null && isViewValid()) {
            C39335e eVar = this.f100528K;
            if (eVar == null) {
                C52711k.m112237a("mPoiRoutePresenter");
            }
            eVar.mo80173a(this.f100541o);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        if (m87422f() != null) {
            m87422f().removeCallbacksAndMessages(null);
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        MapLayout mapLayout = (MapLayout) m87421b(R.id.ep6);
        if (mapLayout != null) {
            mapLayout.mo79274e();
        }
        if (this.f100534R != null) {
            this.f100534R.clear();
        }
    }

    public final void onLowMemory() {
        MapLayout mapLayout = (MapLayout) m87421b(R.id.ep6);
        if (mapLayout != null) {
            mapLayout.mo79275f();
        }
        super.onLowMemory();
    }

    public final void onPause() {
        super.onPause();
        MapLayout mapLayout = (MapLayout) m87421b(R.id.ep6);
        if (mapLayout != null) {
            mapLayout.mo79271c();
        }
        C39043c.pageKey = this.f100542p;
    }

    public final void onResume() {
        super.onResume();
        MapLayout mapLayout = (MapLayout) m87421b(R.id.ep6);
        if (mapLayout != null) {
            mapLayout.mo79264a();
        }
    }

    public final void onStart() {
        super.onStart();
        MapLayout mapLayout = (MapLayout) m87421b(R.id.ep6);
        if (mapLayout != null) {
            mapLayout.mo79270b();
        }
    }

    public final void onStop() {
        super.onStop();
        MapLayout mapLayout = (MapLayout) m87421b(R.id.ep6);
        if (mapLayout != null) {
            mapLayout.mo79272d();
        }
    }

    /* renamed from: l */
    public final void mo80104l() {
        C39456o.m87754a();
        if (isViewValid()) {
            m87422f().removeMessages(TextExtraStruct.TYPE_CUSTOM);
            ((DmtStatusView) m87421b(R.id.csl)).mo19214h();
        }
    }

    /* renamed from: a */
    public final void mo80164a() {
        String str;
        if (isViewValid()) {
            if (!C39334d.m87441a(getContext())) {
                ((DmtStatusView) m87421b(R.id.csl)).mo19214h();
                return;
            }
            m87422f().sendEmptyMessageDelayed(TextExtraStruct.TYPE_CUSTOM, 500);
            String str2 = "";
            String str3 = "";
            C36282r a = C36286a.m81925a().mo75118a();
            if (a != null) {
                String[] a2 = C39440a.m87682a(a);
                String str4 = a2[0];
                str3 = a2[1];
                str2 = str4;
            }
            C39290l lVar = this.f100529L;
            if (lVar == null) {
                C52711k.m112237a("mPoiDetailPresenter");
            }
            if (lVar != null) {
                Object[] objArr = new Object[1];
                C39066a aVar = new C39066a();
                C39128l lVar2 = this.f100535e;
                String str5 = null;
                if (lVar2 != null) {
                    str = lVar2.poiId;
                } else {
                    str = null;
                }
                C39066a a3 = aVar.mo79225a(str);
                if (str2 == null) {
                    str2 = "";
                }
                C39066a b = a3.mo79229b(str2);
                if (str3 == null) {
                    str3 = "";
                }
                C39066a c = b.mo79230c(str3);
                C39128l lVar3 = this.f100535e;
                if (lVar3 != null) {
                    str5 = lVar3.awemeid;
                }
                objArr[0] = c.mo79231d(str5).mo79227a();
                lVar.mo44934a_(objArr);
            }
        }
    }

    /* renamed from: r */
    public final C0677p mo50625r() {
        this.f72039E = new ArrayList();
        this.f72040F = new ArrayList();
        this.f65201a = new ArrayList();
        C0654k childFragmentManager = getChildFragmentManager();
        StringBuilder sb = new StringBuilder();
        sb.append(C27311a.f72034s);
        boolean z = false;
        sb.append(0);
        Fragment a = childFragmentManager.mo2224a(sb.toString());
        if (!(a instanceof DetailAwemeListFragment)) {
            a = DetailAwemeListFragment.m60071a(4, "poi_page", this.f100537k, false, "", "poi_page", new C39323a(this.f100536j));
            DetailAwemeListFragment detailAwemeListFragment = (DetailAwemeListFragment) a;
            if (this.f72037C == 0) {
                z = true;
            }
            detailAwemeListFragment.f65150o = z;
            detailAwemeListFragment.f65151p = true;
        }
        if (a != null) {
            this.f100527J = (DetailAwemeListFragment) a;
            List list = this.f72039E;
            DetailAwemeListFragment detailAwemeListFragment2 = this.f100527J;
            if (detailAwemeListFragment2 == null) {
                C52711k.m112237a("mListFragment");
            }
            list.add(detailAwemeListFragment2);
            List list2 = this.f72040F;
            DetailAwemeListFragment detailAwemeListFragment3 = this.f100527J;
            if (detailAwemeListFragment3 == null) {
                C52711k.m112237a("mListFragment");
            }
            list2.add(detailAwemeListFragment3);
            this.f65201a.add(Integer.valueOf(4));
            return new C40320dc(getChildFragmentManager(), this.f72040F, this.f65201a);
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C52711k.m112240b(bundle, "outState");
        super.onSaveInstanceState(bundle);
        MapLayout mapLayout = (MapLayout) m87421b(R.id.ep6);
        if (mapLayout != null) {
            mapLayout.mo79268a(bundle);
        }
    }

    /* renamed from: a */
    public final void mo79150a(boolean z) {
        String str;
        int i;
        Context context = getContext();
        PoiStruct poiStruct = this.f100541o;
        String str2 = "poi_page";
        C39128l lVar = this.f100535e;
        if (lVar != null) {
            str = lVar.awemeid;
        } else {
            str = null;
        }
        String str3 = str;
        PoiDetail poiDetail = this.f100540n;
        if (poiDetail != null) {
            i = poiDetail.aroundHotPoiCount;
        } else {
            i = 0;
        }
        PoiRouteActivity.m87292a(context, poiStruct, str2, str3, true, i);
    }

    public final void handleMsg(Message message) {
        Integer num;
        if (message != null) {
            num = Integer.valueOf(message.what);
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 65281) {
            ((DmtStatusView) m87421b(R.id.csl)).mo19212f();
            View b = m87421b(R.id.ex1);
            C52711k.m112236a((Object) b, "statusBg");
            b.setVisibility(8);
        }
    }

    @C53771m
    public final void onAntiCrawlerEvent(C23481a aVar) {
        C52711k.m112240b(aVar, "event");
        String str = aVar.f62554a;
        if (isVisible() && isViewValid() && str != null && C52830p.m112456b((CharSequence) str, (CharSequence) "/aweme/v1/poi/aweme/?", false, 2, (Object) null)) {
            C47718bf.m103293f(aVar);
            DetailAwemeListFragment detailAwemeListFragment = this.f100527J;
            if (detailAwemeListFragment == null) {
                C52711k.m112237a("mListFragment");
            }
            detailAwemeListFragment.mo50473n();
        }
    }

    /* renamed from: a */
    public final void mo50609a(Bundle bundle) {
        C39067g gVar;
        if (bundle != null) {
            Serializable serializable = bundle.getSerializable("poi_bundle");
            if (serializable != null) {
                this.f100535e = (C39128l) serializable;
                C39128l lVar = this.f100535e;
                if (lVar != null) {
                    this.f100536j = new C39068a().mo79255a(lVar.poiId).mo79257b(lVar.poiType).mo79258c(C23198ae.m56852b()).mo79261f(lVar.from).mo79260e(lVar.awemeid).mo79259d(lVar.activityId).mo79262g(lVar.backendType).mo79263h(lVar.cityCode).mo79256a();
                    gVar = this.f100536j;
                } else {
                    gVar = null;
                }
                this.f100536j = gVar;
                C39128l lVar2 = this.f100535e;
                if (lVar2 != null) {
                    String str = lVar2.poiId;
                    C52711k.m112236a((Object) str, "poiId");
                    this.f100537k = str;
                    this.f100538l = lVar2.poiName;
                    this.f100539m = lVar2.poiType;
                    lVar2.fromQrScan = this.f100543q;
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.model.PoiBundle");
        }
    }

    /* renamed from: a */
    public final void mo80097a(C39291m mVar) {
        long j;
        int i;
        boolean z;
        if (isViewValid()) {
            if (mVar != null && !C9376b.m18558a((Collection<T>) mVar.f100440a) && (mVar.f100440a.get(0) instanceof PoiDetail)) {
                m87422f().removeCallbacksAndMessages(null);
                this.f100530M = mVar;
                C39291m mVar2 = this.f100530M;
                if (mVar2 != null) {
                    C39291m mVar3 = this.f100530M;
                    if (mVar3 != null) {
                        i = mVar3.mo80108a();
                    } else {
                        i = 0;
                    }
                    if (i > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        mVar2 = null;
                    }
                    if (mVar2 != null) {
                        Object obj = mVar2.f100440a.get(0);
                        if (obj != null) {
                            PoiDetail poiDetail = (PoiDetail) obj;
                            C39067g gVar = this.f100536j;
                            if (gVar != null) {
                                gVar.setPoiType(poiDetail.getPoiTypeStr());
                                gVar.setBackendType(poiDetail.getBackendType());
                                gVar.setPoiCity(poiDetail.getCityCode());
                            }
                            PoiHeaderWidgetGroup poiHeaderWidgetGroup = (PoiHeaderWidgetGroup) m87421b(R.id.ep8);
                            List<C37859b> list = mVar2.f100440a;
                            C52711k.m112236a((Object) list, "feeds");
                            poiHeaderWidgetGroup.mo80176a(list, this.f100536j, this, this);
                            if (poiDetail != null) {
                                TextView textView = this.f72047v;
                                C52711k.m112236a((Object) textView, "mTitle");
                                textView.setText(poiDetail.getPoiName());
                                this.f100540n = poiDetail;
                                this.f100541o = poiDetail.poiStruct;
                                if (this.f100544r) {
                                    C39335e eVar = this.f100528K;
                                    if (eVar == null) {
                                        C52711k.m112237a("mPoiRoutePresenter");
                                    }
                                    eVar.mo80173a(poiDetail.poiStruct);
                                }
                            }
                        } else {
                            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.model.PoiDetail");
                        }
                    }
                }
                PoiDetail poiDetail2 = this.f100540n;
                PoiDetail poiDetail3 = this.f100540n;
                if (poiDetail3 != null) {
                    j = poiDetail3.getDuration();
                } else {
                    j = 0;
                }
                C39456o.m87755a(poiDetail2, j);
                if (isViewValid()) {
                    View b = m87421b(R.id.ex1);
                    C52711k.m112236a((Object) b, "statusBg");
                    b.setVisibility(8);
                    ((DmtStatusView) m87421b(R.id.csl)).mo19209d();
                }
            } else if (isViewValid()) {
                m87422f().removeMessages(TextExtraStruct.TYPE_CUSTOM);
                ((DmtStatusView) m87421b(R.id.csl)).mo19214h();
            }
        }
    }

    /* renamed from: b */
    public final void mo50613b(int i, int i2) {
        super.mo50613b(i, i2);
        if (this.f100532P == 0.0f) {
            TextView textView = this.f72047v;
            C52711k.m112236a((Object) textView, "mTitle");
            if (textView.getVisibility() == 0) {
                TextView textView2 = this.f72047v;
                C52711k.m112236a((Object) textView2, "mTitle");
                int bottom = textView2.getBottom();
                View view = this.f72048w;
                C52711k.m112236a((Object) view, "mTitleColorCtrl");
                this.f100532P = (float) (bottom - view.getBottom());
            }
        }
        if (this.f100531O == 0.0f) {
            LinearLayout linearLayout = (LinearLayout) m87421b(R.id.ans);
            C52711k.m112236a((Object) linearLayout, "head_layout");
            int bottom2 = linearLayout.getBottom();
            View view2 = this.f72048w;
            C52711k.m112236a((Object) view2, "mTitleColorCtrl");
            this.f100531O = (float) (bottom2 - view2.getBottom());
        }
        float f = (float) i;
        float f2 = (f - this.f100532P) / (this.f100531O - this.f100532P);
        if (((double) f2) <= 0.2d) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        View view3 = this.f72048w;
        C52711k.m112236a((Object) view3, "mTitleColorCtrl");
        view3.setAlpha(f2);
        View b = m87421b(R.id.csm);
        C52711k.m112236a((Object) b, "status_bar");
        b.setAlpha(f2);
        TextView textView3 = this.f72047v;
        C52711k.m112236a((Object) textView3, "mTitle");
        textView3.setAlpha(f2);
        LinearLayout linearLayout2 = (LinearLayout) m87421b(R.id.ans);
        C52711k.m112236a((Object) linearLayout2, "head_layout");
        linearLayout2.setAlpha(1.0f - (f / this.f100531O));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        if (TextUtils.isEmpty(this.f100537k)) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            View b = m87421b(R.id.csm);
            C52711k.m112236a((Object) b, "status_bar");
            LayoutParams layoutParams = b.getLayoutParams();
            FragmentActivity activity2 = getActivity();
            if (activity2 == null) {
                C52711k.m112234a();
            }
            layoutParams.height = C11065a.m22390a((Context) activity2);
        }
        this.f100529L = new C39290l();
        C39290l lVar = this.f100529L;
        if (lVar == null) {
            C52711k.m112237a("mPoiDetailPresenter");
        }
        lVar.mo54800a(this);
        C39290l lVar2 = this.f100529L;
        if (lVar2 == null) {
            C52711k.m112237a("mPoiDetailPresenter");
        }
        lVar2.mo54799a(new C39288k(65441));
        ((AutoRTLImageView) m87421b(R.id.ik)).setOnClickListener(new C39327b(this));
        Context context = getContext();
        if (context == null) {
            C52711k.m112234a();
        }
        ((DmtStatusView) m87421b(R.id.csl)).setBuilder(C10719a.m21676a(getContext()).mo19232b(new C10723a(context).mo19277a((int) R.drawable.dgk).mo19280b((int) R.string.f5o).mo19282c(R.string.f5k).mo19278a(C10720a.BORDER, R.string.f5u, new C39332g(this)).f28711a));
        this.f100528K = new C39335e();
        C39335e eVar = this.f100528K;
        if (eVar == null) {
            C52711k.m112237a("mPoiRoutePresenter");
        }
        C23526a aVar = this;
        MapLayout mapLayout = (MapLayout) m87421b(R.id.ep6);
        C52711k.m112236a((Object) mapLayout, "poiMap");
        C52711k.m112240b(aVar, "fragment");
        C52711k.m112240b(mapLayout, "mapLayout");
        eVar.f100554b = aVar;
        eVar.f100553a = mapLayout;
        eVar.f100555c = mapLayout.getContext();
        ((MapLayout) m87421b(R.id.ep6)).mo79269a(bundle, this);
        ((MapLayout) m87421b(R.id.ep6)).f99666a = this;
        m87421b(R.id.ep7).setOnClickListener(new C39328c(this));
        String str = this.f100538l;
        if (str != null) {
            TextView textView = this.f72047v;
            C52711k.m112236a((Object) textView, "mTitle");
            textView.setText(str);
        }
        StringBuilder sb = new StringBuilder(this.f100537k);
        sb.append(System.currentTimeMillis());
        this.f100542p = C48675k.m105342a(sb.toString());
        if (!C36286a.m81927a(C11010c.m22280a())) {
            if (!C39444e.m87713a()) {
                C39444e.m87712a(true);
                ((DmtStatusView) m87421b(R.id.csl)).mo19212f();
                C39444e.m87711a(getContext(), new C39329d(this), new C39330e(this));
                ((RelativeLayout) m87421b(R.id.epk)).setOnLongClickListener(new C39331f(this));
            }
        } else if (C36286a.m81925a().mo75120b(null) != null) {
            C36286a.m81925a().mo75121b();
        }
        mo80164a();
        ((RelativeLayout) m87421b(R.id.epk)).setOnLongClickListener(new C39331f(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C26894c.m65022a(m87421b(R.id.csm));
        return onCreateView;
    }
}
