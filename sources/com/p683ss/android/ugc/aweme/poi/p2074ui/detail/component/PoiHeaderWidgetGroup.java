package com.p683ss.android.ugc.aweme.poi.p2074ui.detail.component;

import android.content.Context;
import android.support.p030v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.ies.uikit.base.C11079a;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter.C38999a;
import com.p683ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p683ss.android.ugc.aweme.poi.p2074ui.C39389l;
import com.p683ss.android.ugc.aweme.poi.p2074ui.coupon.C39312e;
import com.p683ss.android.ugc.aweme.poi.p2074ui.detail.component.PoiStructureInfoWidget.C39343d;
import com.p683ss.android.ugc.aweme.poi.widget.PoiHeaderLayout;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiHeaderWidgetGroup */
public final class PoiHeaderWidgetGroup extends LinearLayout {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f100562a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PoiHeaderWidgetGroup.class), "mPoiStructureInfoWidget", "getMPoiStructureInfoWidget()Lcom/ss/android/ugc/aweme/poi/ui/detail/component/PoiStructureInfoWidget;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PoiHeaderWidgetGroup.class), "mPoiContentContainer", "getMPoiContentContainer()Landroid/widget/LinearLayout;"))};

    /* renamed from: b */
    private C39352a f100563b;

    /* renamed from: c */
    private final C52668f f100564c;

    /* renamed from: d */
    private final C52668f f100565d;

    /* renamed from: e */
    private HashMap f100566e;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiHeaderWidgetGroup$a */
    static final class C39338a extends C52712l implements C52670a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ PoiHeaderWidgetGroup f100567a;

        C39338a(PoiHeaderWidgetGroup poiHeaderWidgetGroup) {
            this.f100567a = poiHeaderWidgetGroup;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (LinearLayout) this.f100567a.mo80175a(R.id.epf);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiHeaderWidgetGroup$b */
    static final class C39339b extends C52712l implements C52670a<PoiStructureInfoWidget> {

        /* renamed from: a */
        final /* synthetic */ PoiHeaderWidgetGroup f100568a;

        C39339b(PoiHeaderWidgetGroup poiHeaderWidgetGroup) {
            this.f100568a = poiHeaderWidgetGroup;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (PoiStructureInfoWidget) this.f100568a.mo80175a(R.id.epg);
        }
    }

    public PoiHeaderWidgetGroup(Context context) {
        this(context, null, 0, 6, null);
    }

    public PoiHeaderWidgetGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final LinearLayout getMPoiContentContainer() {
        return (LinearLayout) this.f100565d.getValue();
    }

    private final PoiStructureInfoWidget getMPoiStructureInfoWidget() {
        return (PoiStructureInfoWidget) this.f100564c.getValue();
    }

    /* renamed from: a */
    public final View mo80175a(int i) {
        if (this.f100566e == null) {
            this.f100566e = new HashMap();
        }
        View view = (View) this.f100566e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f100566e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public PoiHeaderWidgetGroup(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.bn1, this);
        this.f100564c = C52732g.m112285a(new C39339b(this));
        this.f100565d = C52732g.m112285a(new C39338a(this));
    }

    /* renamed from: a */
    public final void mo80176a(List<? extends C37859b> list, C39067g gVar, C38999a aVar, C39312e eVar) {
        C52711k.m112240b(list, "data");
        C52711k.m112240b(aVar, "iCollectionInfoGetter");
        C52711k.m112240b(eVar, "joinCouponCallback");
        Context context = getContext();
        C52711k.m112236a((Object) context, "context");
        this.f100563b = new C39352a(context, getMPoiContentContainer());
        for (C37859b bVar : list) {
            switch (bVar.getFeedType()) {
                case 65441:
                    PoiStructureInfoWidget mPoiStructureInfoWidget = getMPoiStructureInfoWidget();
                    C52711k.m112240b(aVar, "iCollectionInfoGetter");
                    C52711k.m112240b(eVar, "joinCouponCallback");
                    mPoiStructureInfoWidget.f100571c = aVar;
                    mPoiStructureInfoWidget.f100570b = new C39389l();
                    mPoiStructureInfoWidget.f100574f = eVar;
                    PoiHeaderLayout poiHeaderLayout = (PoiHeaderLayout) mPoiStructureInfoWidget.mo80177a((int) R.id.c0w);
                    Fragment G = eVar.mo80015G();
                    if (G != null) {
                        poiHeaderLayout.mo80449a((C11079a) G, aVar, mPoiStructureInfoWidget.f100570b, null);
                        ((LinearLayout) mPoiStructureInfoWidget.mo80177a((int) R.id.bzs)).setOnClickListener(new C39341b(mPoiStructureInfoWidget));
                        ((ImageView) mPoiStructureInfoWidget.mo80177a((int) R.id.c02)).setOnClickListener(new C39342c(mPoiStructureInfoWidget));
                        ((ImageView) mPoiStructureInfoWidget.mo80177a((int) R.id.ep_)).setOnClickListener(new C39343d(mPoiStructureInfoWidget));
                        ((RelativeLayout) mPoiStructureInfoWidget.mo80177a((int) R.id.bzu)).setOnClickListener(new C39344e(mPoiStructureInfoWidget));
                        ((LinearLayout) mPoiStructureInfoWidget.mo80177a((int) R.id.bzm)).setOnClickListener(new C39345f(mPoiStructureInfoWidget));
                        ((LinearLayout) mPoiStructureInfoWidget.mo80177a((int) R.id.c0l)).setOnClickListener(new C39346g(mPoiStructureInfoWidget));
                        ((LinearLayout) mPoiStructureInfoWidget.mo80177a((int) R.id.bzh)).setOnClickListener(new C39347h(mPoiStructureInfoWidget));
                        ((LinearLayout) mPoiStructureInfoWidget.mo80177a((int) R.id.c17)).setOnClickListener(new C39348i(mPoiStructureInfoWidget));
                        ((RelativeLayout) mPoiStructureInfoWidget.mo80177a((int) R.id.epo)).setOnClickListener(new C39349j(mPoiStructureInfoWidget));
                        PoiStructureInfoWidget mPoiStructureInfoWidget2 = getMPoiStructureInfoWidget();
                        if (bVar != null) {
                            PoiDetail poiDetail = (PoiDetail) bVar;
                            C52711k.m112240b(poiDetail, "data");
                            mPoiStructureInfoWidget2.f100573e = gVar;
                            mPoiStructureInfoWidget2.mo80178a(poiDetail);
                            break;
                        } else {
                            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.model.PoiDetail");
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.uikit.base.AbsFragment");
                    }
                case 65446:
                    if (this.f100563b == null) {
                        C52711k.m112237a("componentBuilder");
                    }
                    C52711k.m112240b(bVar, C22858c.f61207c);
                    break;
                case 65448:
                    if (this.f100563b == null) {
                        C52711k.m112237a("componentBuilder");
                    }
                    C52711k.m112240b(bVar, C22858c.f61207c);
                    break;
                case 65449:
                    if (this.f100563b == null) {
                        C52711k.m112237a("componentBuilder");
                    }
                    C52711k.m112240b(bVar, C22858c.f61207c);
                    break;
                case 65453:
                    if (this.f100563b == null) {
                        C52711k.m112237a("componentBuilder");
                    }
                    C52711k.m112240b(bVar, C22858c.f61207c);
                    break;
            }
        }
    }

    public /* synthetic */ PoiHeaderWidgetGroup(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
