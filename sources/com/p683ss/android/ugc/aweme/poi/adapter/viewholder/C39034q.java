package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.SquareImageView;
import com.p683ss.android.ugc.aweme.effect.C29094ad;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.utils.C39443d;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.q */
public final class C39034q {

    /* renamed from: a */
    public final Context f99502a;

    /* renamed from: b */
    private final SquareImageView f99503b;

    /* renamed from: c */
    private final DmtTextView f99504c;

    /* renamed from: d */
    private final DmtTextView f99505d;

    /* renamed from: e */
    private final DmtTextView f99506e;

    /* renamed from: f */
    private final View f99507f;

    /* renamed from: g */
    private final DmtTextView f99508g;

    /* renamed from: h */
    private final View f99509h;

    /* renamed from: i */
    private final DmtTextView f99510i;

    /* renamed from: j */
    private final View f99511j;

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.q$a */
    static final class C39035a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39034q f99512a;

        /* renamed from: b */
        final /* synthetic */ C39067g f99513b;

        /* renamed from: c */
        final /* synthetic */ AwemeRawAd f99514c;

        C39035a(C39034q qVar, C39067g gVar, AwemeRawAd awemeRawAd) {
            this.f99512a = qVar;
            this.f99513b = gVar;
            this.f99514c = awemeRawAd;
        }

        public final void onClick(View view) {
            String str;
            CharSequence charSequence;
            String str2;
            CharSequence charSequence2;
            String str3;
            ClickInstrumentation.onClick(view);
            C39067g gVar = this.f99513b;
            String str4 = "click_poi_product";
            C23089d a = C23089d.m56640a().mo47829a("enter_from", "poi_page");
            String str5 = "poi_id";
            C39067g gVar2 = this.f99513b;
            String str6 = null;
            if (gVar2 != null) {
                str = gVar2.getPoiId();
            } else {
                str = null;
            }
            C39452l.m87730a(gVar, str4, a.mo47829a(str5, str).mo47829a("product_id", this.f99514c.getCreativeIdStr()).mo47829a("poi_posititon", "poi_page"));
            Context context = this.f99512a.f99502a;
            String openUrl = this.f99514c.getOpenUrl();
            C52711k.m112236a((Object) openUrl, "ad.openUrl");
            if (!C39443d.m87705a(context, openUrl, false)) {
                Context context2 = this.f99512a.f99502a;
                String webUrl = this.f99514c.getWebUrl();
                C52711k.m112236a((Object) webUrl, "ad.webUrl");
                String webTitle = this.f99514c.getWebTitle();
                C52711k.m112236a((Object) webTitle, "ad.webTitle");
                if (C39443d.m87704a(context2, webUrl, webTitle)) {
                    C39067g gVar3 = this.f99513b;
                    if (gVar3 != null) {
                        charSequence2 = gVar3.getAwemeId();
                    } else {
                        charSequence2 = null;
                    }
                    if (TextUtils.isEmpty(charSequence2)) {
                        Context context3 = this.f99512a.f99502a;
                        AwemeRawAd awemeRawAd = this.f99514c;
                        C39067g gVar4 = this.f99513b;
                        if (gVar4 != null) {
                            str3 = gVar4.getPoiId();
                        } else {
                            str3 = null;
                        }
                        C39443d.m87707b(context3, awemeRawAd, str3);
                        Context context4 = this.f99512a.f99502a;
                        AwemeRawAd awemeRawAd2 = this.f99514c;
                        C39067g gVar5 = this.f99513b;
                        if (gVar5 != null) {
                            str6 = gVar5.getPoiId();
                        }
                        C39443d.m87710d(context4, awemeRawAd2, str6);
                    }
                }
            } else {
                C39067g gVar6 = this.f99513b;
                if (gVar6 != null) {
                    charSequence = gVar6.getAwemeId();
                } else {
                    charSequence = null;
                }
                if (TextUtils.isEmpty(charSequence)) {
                    Context context5 = this.f99512a.f99502a;
                    AwemeRawAd awemeRawAd3 = this.f99514c;
                    C39067g gVar7 = this.f99513b;
                    if (gVar7 != null) {
                        str2 = gVar7.getPoiId();
                    } else {
                        str2 = null;
                    }
                    C39443d.m87707b(context5, awemeRawAd3, str2);
                    Context context6 = this.f99512a.f99502a;
                    AwemeRawAd awemeRawAd4 = this.f99514c;
                    C39067g gVar8 = this.f99513b;
                    if (gVar8 != null) {
                        str6 = gVar8.getPoiId();
                    }
                    C39443d.m87709c(context6, awemeRawAd4, str6);
                }
            }
        }
    }

    public C39034q(View view) {
        C52711k.m112240b(view, "itemView");
        this.f99511j = view;
        Context context = this.f99511j.getContext();
        C52711k.m112236a((Object) context, "itemView.context");
        this.f99502a = context;
        View findViewById = this.f99511j.findViewById(R.id.c2r);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.poi_tour_img)");
        this.f99503b = (SquareImageView) findViewById;
        View findViewById2 = this.f99511j.findViewById(R.id.c33);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.poi_tour_title)");
        this.f99504c = (DmtTextView) findViewById2;
        View findViewById3 = this.f99511j.findViewById(R.id.c30);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.poi_tour_tag1)");
        this.f99505d = (DmtTextView) findViewById3;
        View findViewById4 = this.f99511j.findViewById(R.id.c31);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.poi_tour_tag2)");
        this.f99506e = (DmtTextView) findViewById4;
        View findViewById5 = this.f99511j.findViewById(R.id.c32);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.poi_tour_tag2_divider)");
        this.f99507f = findViewById5;
        View findViewById6 = this.f99511j.findViewById(R.id.c2t);
        C52711k.m112236a((Object) findViewById6, "itemView.findViewById(R.id.poi_tour_price)");
        this.f99508g = (DmtTextView) findViewById6;
        View findViewById7 = this.f99511j.findViewById(R.id.c2v);
        C52711k.m112236a((Object) findViewById7, "itemView.findViewById(R.id.poi_tour_price_end)");
        this.f99509h = findViewById7;
        View findViewById8 = this.f99511j.findViewById(R.id.c2u);
        C52711k.m112236a((Object) findViewById8, "itemView.findViewById(R.….poi_tour_price_discount)");
        this.f99510i = (DmtTextView) findViewById8;
    }

    /* renamed from: a */
    public final void mo79170a(AwemeRawAd awemeRawAd, C39067g gVar) {
        String str;
        C52711k.m112240b(awemeRawAd, C29094ad.f76264a);
        String str2 = "show_poi_product";
        C23089d a = C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("enter_method", "show");
        String str3 = "poi_id";
        if (gVar != null) {
            str = gVar.getPoiId();
        } else {
            str = null;
        }
        C39452l.m87730a(gVar, str2, a.mo47829a(str3, str).mo47829a("poi_posititon", "poi_page").mo47829a("product_id", awemeRawAd.getCreativeIdStr()));
        this.f99511j.setOnClickListener(new C39035a(this, gVar, awemeRawAd));
        if (!C9376b.m18558a((Collection<T>) awemeRawAd.getImageList())) {
            C23515d.m57669a((RemoteImageView) this.f99503b, (UrlModel) awemeRawAd.getImageList().get(0));
        }
        this.f99504c.setText(awemeRawAd.getTitle());
        this.f99505d.setVisibility(8);
        this.f99506e.setVisibility(8);
        this.f99507f.setVisibility(8);
        if (!TextUtils.isEmpty(awemeRawAd.getFeatureLabel())) {
            try {
                String featureLabel = awemeRawAd.getFeatureLabel();
                C52711k.m112236a((Object) featureLabel, "ad.featureLabel");
                List b = C52830p.m112452b((CharSequence) featureLabel, new String[]{"|"}, false, 0, 6, (Object) null);
                if (!C9376b.m18558a((Collection<T>) b)) {
                    this.f99505d.setVisibility(0);
                    this.f99505d.setText((CharSequence) b.get(0));
                    if (b.size() > 1) {
                        this.f99507f.setVisibility(0);
                        this.f99506e.setVisibility(0);
                        this.f99506e.setText((CharSequence) b.get(1));
                    }
                }
            } catch (Exception e) {
                C32458a.m75143a(e);
            }
        }
        if (TextUtils.isEmpty(awemeRawAd.getPrice())) {
            this.f99508g.setVisibility(8);
            this.f99509h.setVisibility(8);
        } else {
            this.f99508g.setVisibility(0);
            this.f99509h.setVisibility(0);
            this.f99508g.setText(awemeRawAd.getPrice());
        }
        if (TextUtils.isEmpty(awemeRawAd.getPromotionLabel())) {
            this.f99510i.setVisibility(8);
            return;
        }
        this.f99510i.setVisibility(0);
        this.f99510i.setText(awemeRawAd.getPromotionLabel());
    }
}
