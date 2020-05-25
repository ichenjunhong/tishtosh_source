package com.p683ss.android.ugc.aweme.poi.p2074ui.p2075a;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.agilelogger.p1136f.C18822d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.feed.C30228f;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.flowfeed.p1753b.C31753a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import com.p683ss.android.ugc.aweme.poi.C39065f.C39066a;
import com.p683ss.android.ugc.aweme.poi.adapter.C38971c;
import com.p683ss.android.ugc.aweme.poi.adapter.C38973e;
import com.p683ss.android.ugc.aweme.poi.experiment.PoiQuestionPosExperiment;
import com.p683ss.android.ugc.aweme.poi.model.C39085a;
import com.p683ss.android.ugc.aweme.poi.model.C39105ak;
import com.p683ss.android.ugc.aweme.poi.model.C39135s;
import com.p683ss.android.ugc.aweme.poi.model.C39140x;
import com.p683ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38956a;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38957b;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38965j;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38968l;
import com.p683ss.android.ugc.aweme.poi.p2074ui.C39384j;
import com.p683ss.android.ugc.aweme.poi.p2074ui.C39384j.C39386a;
import com.p683ss.android.ugc.aweme.poi.p2074ui.C39387k;
import com.p683ss.android.ugc.aweme.poi.p2074ui.PoiContentActivity;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import com.p683ss.android.ugc.aweme.poi.utils.C39456o;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.a.b */
public final class C39279b extends C39387k implements C9382a, C38971c, C39284g, C39287j, C39292n {

    /* renamed from: A */
    protected C9381g f100409A;

    /* renamed from: B */
    private C39283f f100410B;

    /* renamed from: C */
    private C39290l f100411C;

    /* renamed from: D */
    private C39286i f100412D;

    /* renamed from: E */
    private List<C37859b> f100413E;

    /* renamed from: F */
    private C39291m f100414F;

    /* renamed from: G */
    private C39135s f100415G;

    /* renamed from: H */
    private boolean f100416H;

    /* renamed from: I */
    private boolean f100417I;

    /* renamed from: J */
    private boolean f100418J = true;

    /* renamed from: K */
    private PoiDetail f100419K;

    /* renamed from: L */
    private long f100420L;

    /* renamed from: M */
    private long f100421M;

    /* renamed from: N */
    private boolean f100422N;

    /* renamed from: O */
    private boolean f100423O;

    /* renamed from: w */
    protected View f100424w;

    /* renamed from: x */
    boolean f100425x;

    /* renamed from: y */
    boolean f100426y;

    /* renamed from: z */
    boolean f100427z;

    /* renamed from: j */
    public final C38971c mo80102j() {
        return this;
    }

    /* renamed from: a */
    public final void mo64876a(List<C37859b> list, boolean z) {
        if (isViewValid()) {
            this.f100748o = true;
            this.f100418J = z;
            if (!m87333o()) {
                if (this.f100413E == null) {
                    this.f100413E = new ArrayList();
                }
                if (list != null) {
                    this.f100413E.addAll(list);
                }
                return;
            }
            this.f100409A.removeMessages(TextExtraStruct.TYPE_CUSTOM_COLOR_CLICK_SPAN);
            if (this.f83139f != null) {
                List a = ((C38973e) this.f83139f).mo50673a();
                m87331a(a, list);
                ((C39278a) this.f100747n).mo80090a(a);
                ((C38973e) this.f83139f).mo50303a(((C39278a) this.f100747n).mo54803n().getItems());
                if (this.f100409A != null) {
                    this.f100409A.post(new C39280c(this, z));
                    return;
                }
                mo64884b(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo80099a(boolean z, String str, String str2, boolean z2) {
        if (this.f100409A != null) {
            this.f100424w.setVisibility(0);
            this.f100409A.sendEmptyMessageDelayed(TextExtraStruct.TYPE_CUSTOM, 500);
        } else {
            this.f83136c.mo19212f();
        }
        this.f100420L = System.currentTimeMillis();
        if (this.f100747n != null) {
            this.f100747n.mo44934a_(Integer.valueOf(1), new C39066a().mo79225a(this.f100746m.getPoiId()).mo79231d(this.f100746m.getAwemeId()).mo79228b(3).mo79227a());
        }
        if (this.f100411C != null) {
            this.f100411C.mo44934a_(new C39066a().mo79225a(this.f100746m.getPoiId()).mo79229b(str).mo79230c(str2).mo79223a(z ? 1 : 0).mo79231d(this.f100746m.getAwemeId()).mo79227a());
        }
        if (z2 && this.f100410B == null) {
            this.f100410B = new C39283f();
            this.f100410B.mo54800a(this);
            this.f100410B.mo54799a(new C39282e());
        }
        if (this.f100410B != null) {
            this.f100410B.mo44934a_(new C39066a().mo79225a(this.f100746m.getPoiId()).mo79226a(this.f100753t.mo80027f()).mo79232e(this.f100753t.mo80028g()).mo79227a());
        }
        if (this.f100412D != null) {
            String f = TextUtils.isEmpty(C30228f.m70979c()) ? C30228f.m70982f() : C30228f.m70979c();
            long j = 0;
            try {
                if (!TextUtils.isEmpty(f)) {
                    j = Long.parseLong(f);
                }
            } catch (Exception unused) {
            }
            this.f100412D.mo44934a_(new C39066a().mo79225a(this.f100746m.getPoiId()).mo79224a(j).mo79227a());
            return;
        }
        this.f100417I = true;
    }

    /* renamed from: a */
    public final void mo79129a(String str, String str2, boolean z, int i) {
        C38956a aVar = new C38956a(2, 0);
        if (z) {
            C39452l.m87730a(this.f100746m, "click_poi_page_more_video", C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("poi_id", this.f100746m.getPoiId()).mo47829a("enter_method", "click_video_more").mo47829a("poi_channel", this.f100746m.getPoiChannel()));
            Context context = getContext();
            String poiId = this.f100746m.getPoiId();
            Intent intent = new Intent(context, PoiContentActivity.class);
            intent.putExtra("id", poiId);
            intent.putExtra(LeakCanaryFileProvider.f132049i, null);
            intent.putExtra("aweme_id", str);
            intent.putExtra("EXTRA_POI_AWEME_POSITION", aVar);
            context.startActivity(intent);
        }
    }

    /* renamed from: e */
    public final void mo64889e() {
        this.f100423O = true;
        m87332n();
    }

    /* renamed from: o */
    private boolean m87333o() {
        if (!this.f100417I || !this.f100416H) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final void mo80103k() {
        ((C39278a) this.f100747n).mo80089a((C39105ak) null);
    }

    /* renamed from: m */
    public final void mo80105m() {
        this.f100417I = true;
        this.f100421M = System.currentTimeMillis() - this.f100420L;
        m87334p();
    }

    /* renamed from: n */
    private void m87332n() {
        if (this.f100422N && this.f100423O) {
            ((C38973e) this.f83139f).am_();
            ar_();
        }
    }

    /* renamed from: l */
    public final void mo80104l() {
        if (this.f100409A != null) {
            this.f100409A.removeMessages(TextExtraStruct.TYPE_CUSTOM);
        }
        this.f83136c.mo19214h();
        C39456o.m87754a();
    }

    /* renamed from: p */
    private void m87334p() {
        if (isViewValid() && m87333o()) {
            if (this.f100409A != null) {
                this.f100424w.setVisibility(8);
                this.f100409A.removeMessages(TextExtraStruct.TYPE_CUSTOM);
                this.f100409A.sendEmptyMessageDelayed(TextExtraStruct.TYPE_CUSTOM_COLOR_CLICK_SPAN, 300);
            }
            List<C37859b> list = this.f100414F.f100440a;
            this.f100419K = (PoiDetail) list.get(0);
            this.f100753t.mo80023a(this.f100419K);
            this.f100753t.mo80040q();
            mo80353a(this.f100419K);
            if (this.f100415G != null && this.f100415G.mo79765a() > 0) {
                this.f100419K.setActs(new C38957b(this.f100415G.f99868a).setPoiId(this.f100419K.getPoiId()));
            }
            this.f83136c.mo19209d();
            if (this.f83139f != null) {
                if (this.f100413E != null) {
                    m87331a(list, this.f100413E);
                    this.f100413E.clear();
                }
                ((C39278a) this.f100747n).mo80090a(list);
                ((C38973e) this.f83139f).mo50303a(((C39278a) this.f100747n).mo80093v());
            }
            if (this.f100409A == null || this.f100413E != null) {
                mo64884b(this.f100418J);
                if (((C39278a) this.f100747n).f100407p) {
                    ((C38973e) this.f83139f).co_();
                }
            }
            C39456o.m87755a(this.f100419K, Math.max(this.f100419K.getDuration(), this.f100421M));
            this.f100422N = true;
            m87332n();
        }
    }

    public final void ar_() {
        if (isViewValid() && this.f100747n != null && this.f100747n.mo54803n() != null) {
            if (((C39140x) this.f100747n.mo54803n()).isDataEmpty()) {
                if (((C39278a) this.f100747n).f100407p) {
                    this.f100747n.mo44934a_(Integer.valueOf(1), new C39066a().mo79225a(this.f100746m.getPoiId()).mo79231d(this.f100746m.getAwemeId()).mo79228b(3).mo79227a());
                }
            } else if (((C39140x) this.f100747n.mo54803n()).isHasMore()) {
                this.f100747n.mo44934a_(Integer.valueOf(4), new C39066a().mo79225a(this.f100746m.getPoiId()).mo79231d(this.f100746m.getAwemeId()).mo79228b(3).mo79227a());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo80100d(boolean z) {
        mo64884b(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo80101e(boolean z) {
        mo64884b(z);
    }

    /* renamed from: a */
    public final void mo80095a(C39105ak akVar) {
        ((C39278a) this.f100747n).mo80089a(akVar);
    }

    /* renamed from: a */
    public final void mo64862a(View view) {
        super.mo64862a(view);
        this.f100424w = view.findViewById(R.id.csp);
    }

    /* renamed from: a */
    public final void mo80096a(C39135s sVar) {
        this.f100417I = true;
        this.f100415G = sVar;
        this.f100421M = System.currentTimeMillis() - this.f100420L;
        m87334p();
    }

    /* renamed from: a */
    public final void mo64861a(int i) {
        if (isViewValid()) {
            switch (i) {
                case 1:
                    if (this.f83139f != null) {
                        ((C38973e) this.f83139f).co_();
                        return;
                    }
                    break;
                case 2:
                    if (this.f83139f != null && this.f100748o) {
                        ((C38973e) this.f83139f).am_();
                        return;
                    }
                case 3:
                    if (this.f83139f != null) {
                        ((C38973e) this.f83139f).an_();
                        break;
                    }
                    break;
            }
        }
    }

    public final void handleMsg(Message message) {
        switch (message.what) {
            case TextExtraStruct.TYPE_CUSTOM /*65281*/:
                this.f83136c.mo19212f();
                this.f100424w.setVisibility(8);
                return;
            case TextExtraStruct.TYPE_CUSTOM_COLOR_CLICK_SPAN /*65282*/:
                if (!this.f100748o) {
                    mo64884b(this.f100418J);
                    if (((C39278a) this.f100747n).f100407p) {
                        ((C38973e) this.f83139f).co_();
                        return;
                    }
                    if (this.f100418J) {
                        ((C38973e) this.f83139f).am_();
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo80097a(C39291m mVar) {
        if (mVar == null || C9376b.m18558a((Collection<T>) mVar.f100440a) || !(mVar.f100440a.get(0) instanceof PoiDetail)) {
            if (this.f100409A != null) {
                this.f100409A.removeMessages(TextExtraStruct.TYPE_CUSTOM);
            }
            this.f83136c.mo19214h();
            return;
        }
        this.f100414F = mVar;
        this.f100416H = true;
        m87334p();
    }

    /* renamed from: b */
    public final void mo64883b(List<C37859b> list, boolean z) {
        if (isViewValid()) {
            if (this.f83139f != null) {
                ((C38973e) this.f83139f).mo50304b(list);
            }
            if (this.f100409A != null) {
                this.f100409A.post(new C39281d(this, z));
            } else {
                mo64884b(z);
            }
        }
    }

    /* renamed from: a */
    private static C38968l m87330a(PoiDetail poiDetail, boolean z) {
        if (poiDetail.getPoiActivityInfo() == null || poiDetail.getPoiActivityInfo().getAdCard() == null) {
            return null;
        }
        C39085a adCard = poiDetail.getPoiActivityInfo().getAdCard();
        if (C9376b.m18558a((Collection<T>) adCard.getRawDatas())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<AwemeRawAd> awemeRawAds = poiDetail.getAwemeRawAds();
        if (C18822d.m45910a(awemeRawAds)) {
            return null;
        }
        for (AwemeRawAd awemeRawAd : awemeRawAds) {
            if (awemeRawAd.isNewStyleAd()) {
                arrayList.add(awemeRawAd);
            }
        }
        if (C9376b.m18558a((Collection<T>) arrayList)) {
            return null;
        }
        C38968l lVar = new C38968l(arrayList, adCard.getTitle(), z);
        lVar.f99253a = arrayList;
        return lVar;
    }

    /* renamed from: a */
    private void m87331a(List<C37859b> list, List<C37859b> list2) {
        boolean z = true;
        boolean z2 = false;
        if (!C9376b.m18558a((Collection<T>) list2)) {
            ArrayList arrayList = new ArrayList();
            boolean isCertificated = this.f100419K.isCertificated();
            C10181b.m20511a().mo18168a(PoiQuestionPosExperiment.class, true, "poi_question_answering_position", 31744, 0);
            boolean z3 = false;
            int i = 0;
            boolean z4 = false;
            int i2 = 0;
            boolean z5 = false;
            for (C37859b bVar : list2) {
                if (C31753a.m73748h(bVar.getAweme())) {
                    if (this.f100427z) {
                        if (isCertificated) {
                            if (i == 10) {
                                C38965j a = m87329a(this.f100419K, C38965j.Companion.getTYPE_NEARBY(), arrayList);
                                if (a != null) {
                                    a.setHideTopDivider(false);
                                    i2 = i + 1;
                                }
                                C38965j a2 = m87329a(this.f100419K, C38965j.Companion.getTYPE_EXPLORE(), arrayList);
                                if (!(a2 == null || i2 == i + 1)) {
                                    a2.setHideTopDivider(false);
                                }
                                z3 = true;
                            }
                        } else if ((i == 1 && this.f100425x) || (i == 2 && this.f100426y)) {
                            C38965j a3 = m87329a(this.f100419K, C38965j.Companion.getTYPE_NEARBY(), arrayList);
                            if (a3 != null) {
                                a3.setHideTopDivider(false);
                            }
                            z3 = true;
                        } else if ((i == 3 && this.f100425x) || (i == 6 && this.f100426y)) {
                            C38965j a4 = m87329a(this.f100419K, C38965j.Companion.getTYPE_EXPLORE(), arrayList);
                            if (a4 != null) {
                                a4.setHideTopDivider(false);
                            }
                        }
                        z4 = true;
                    }
                    this.f100419K.isQuestionShow();
                    arrayList.add(bVar);
                    if (!z5 && i == 2) {
                        C38968l a5 = m87330a(this.f100419K, true);
                        if (a5 != null) {
                            arrayList.add(a5);
                            z5 = true;
                        }
                    }
                    i++;
                }
            }
            list.addAll(arrayList);
            if (this.f100427z) {
                if (!z3) {
                    C38965j a6 = m87329a(this.f100419K, C38965j.Companion.getTYPE_NEARBY(), list);
                    if (a6 != null) {
                        a6.setHideTopDivider(false);
                        i2 = i + 1;
                    }
                }
                if (!z4) {
                    C38965j a7 = m87329a(this.f100419K, C38965j.Companion.getTYPE_EXPLORE(), list);
                    if (!(a7 == null || i2 == i + 1)) {
                        a7.setHideTopDivider(false);
                    }
                }
            }
            z2 = z5;
        } else {
            z = false;
        }
        if (this.f100427z && !z) {
            m87329a(this.f100419K, C38965j.Companion.getTYPE_NEARBY(), list);
            m87329a(this.f100419K, C38965j.Companion.getTYPE_EXPLORE(), list);
        }
        if (!z2) {
            C38968l a8 = m87330a(this.f100419K, z);
            if (a8 != null) {
                list.add(a8);
            }
        }
    }

    /* renamed from: a */
    private static C38965j m87329a(PoiDetail poiDetail, int i, List<C37859b> list) {
        C38965j jVar;
        if (i == C38965j.Companion.getTYPE_NEARBY()) {
            if (poiDetail.hasRecomemndNearbyPoi()) {
                jVar = new C38965j(Integer.valueOf(C38965j.Companion.getTYPE_NEARBY()), poiDetail.recommendPoiNearby);
                list.add(jVar);
                if (jVar != null && jVar.hasMore()) {
                    jVar.addNullItem();
                }
                return jVar;
            }
        } else if (i == C38965j.Companion.getTYPE_EXPLORE()) {
            if (poiDetail.hasRecomemndExplorePoi()) {
                jVar = new C38965j(Integer.valueOf(C38965j.Companion.getTYPE_EXPLORE()), poiDetail.recommendPoiExplore);
                list.add(jVar);
                jVar.addNullItem();
                return jVar;
            }
        } else if (i == C38965j.Companion.getTYPE_HOTEL()) {
            if (poiDetail.hasRecomemndHotelPoi()) {
                jVar = new C38965j(Integer.valueOf(C38965j.Companion.getTYPE_HOTEL()), poiDetail.recommendPoiHotel);
                list.add(jVar);
                jVar.addNullItem();
                return jVar;
            }
        } else if (i == C38965j.Companion.getTYPE_SCENE()) {
            if (poiDetail.hasRecomemndScenePoi()) {
                jVar = new C38965j(Integer.valueOf(C38965j.Companion.getTYPE_SCENE()), poiDetail.recommendPoiScene);
                list.add(jVar);
                jVar.addNullItem();
                return jVar;
            }
        } else if (i == C38965j.Companion.getTYPE_FOOD() && poiDetail.hasRecomemndFoodPoi()) {
            jVar = new C38965j(Integer.valueOf(C38965j.Companion.getTYPE_FOOD()), poiDetail.recommendPoiFood);
            list.add(jVar);
            jVar.addNullItem();
            return jVar;
        }
        jVar = null;
        jVar.addNullItem();
        return jVar;
    }

    /* renamed from: a */
    public final void mo80098a(C39386a aVar, View view, C39384j jVar, C31754a aVar2) {
        super.mo80098a(aVar, view, jVar, aVar2);
        if (this.f100411C == null) {
            this.f100411C = new C39290l();
            this.f100411C.mo54800a(this);
            this.f100411C.mo54799a(new C39288k(this.f100753t.mo80030i()));
        }
        boolean z = false;
        this.f100425x = false;
        this.f100426y = false;
        if (this.f100425x || this.f100426y) {
            z = true;
        }
        this.f100427z = z;
        this.f100409A = new C9381g(this);
    }
}
