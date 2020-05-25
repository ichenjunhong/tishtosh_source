package com.p683ss.android.ugc.aweme.base.p1420ui.anchor;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.commerce.model.C25519e;
import com.p683ss.android.ugc.aweme.commerce.service.C25539a;
import com.p683ss.android.ugc.aweme.commerce.service.models.C25560e;
import com.p683ss.android.ugc.aweme.commerce.service.p1543i.C25550a;
import com.p683ss.android.ugc.aweme.commerce.service.p1543i.C25551b.C25552a;
import com.p683ss.android.ugc.aweme.commerce.shoptag.C25573a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.param.FeedParamProvider.C30666a;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.x */
public final class C23683x extends C23649b {

    /* renamed from: a */
    public C30313ae<C30332aw> f63158a;

    /* renamed from: b */
    public final Activity f63159b;

    /* renamed from: s */
    public final String f63160s;

    /* renamed from: u */
    public final int f63161u;

    /* renamed from: v */
    private Aweme f63162v;

    /* renamed from: w */
    private C25519e f63163w;

    /* renamed from: x */
    private final DmtTextView f63164x;

    /* renamed from: y */
    private final ImageView f63165y;

    /* renamed from: z */
    private final DmtTextView f63166z;

    /* renamed from: b */
    public final void mo49077b() {
        Aweme aweme = this.f63162v;
        if (aweme != null) {
            C25539a.m62079a().logCommerceTag(this.f63159b, aweme, this.f63160s);
        }
    }

    /* renamed from: a */
    public final void mo49074a() {
        Aweme aweme = this.f63162v;
        if (aweme != null) {
            C25519e promotion = aweme.getPromotion();
            if (promotion != null) {
                C52711k.m112236a((Object) promotion, "mAweme?.promotion ?: return");
                String fromGroupId = C30666a.m71942a(this.f63159b).getFromGroupId();
                String referCommodityId = C30666a.m71942a(this.f63159b).getReferCommodityId();
                Long a = C25573a.m62093a(Integer.valueOf(this.f63161u));
                String a2 = C25573a.m62094a(this.f63071q, Integer.valueOf(this.f63161u));
                Aweme aweme2 = this.f63162v;
                if (aweme2 != null) {
                    if (!C31190f.m72831a(aweme2)) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (aweme2.getAid() != null) {
                                jSONObject.put("group_id", aweme2.getAid());
                            }
                            C26890h.m65008a((Context) this.f63159b, "product_entrance_show", this.f63160s, "0", "0", jSONObject);
                        } catch (Exception unused) {
                        }
                    }
                    C25560e eVar = new C25560e();
                    eVar.f67571d = aweme2.getAuthorUid();
                    eVar.f67576i = "video_cart_tag";
                    eVar.f67573f = promotion.getPromotionId();
                    eVar.f67574g = Long.valueOf((long) promotion.getPromotionSource());
                    eVar.f67569b = this.f63160s;
                    eVar.f67570c = aweme2.getAid();
                    eVar.f67572e = fromGroupId;
                    eVar.f67579l = referCommodityId;
                    eVar.f67578k = Integer.valueOf(aweme2.getFollowStatus());
                    eVar.f67588u = a;
                    eVar.f67589v = a2;
                    C25539a.m62079a().logCommerceEvents("product_entrance_show", eVar);
                    C25560e eVar2 = new C25560e();
                    eVar2.f67571d = aweme2.getAuthorUid();
                    eVar2.f67576i = "video_cart_tag";
                    eVar2.f67573f = promotion.getPromotionId();
                    eVar2.f67574g = Long.valueOf((long) promotion.getPromotionSource());
                    eVar2.f67569b = this.f63160s;
                    eVar2.f67570c = aweme2.getAid();
                    eVar2.f67577j = "video_play";
                    eVar2.f67575h = this.f63160s;
                    eVar2.f67578k = Integer.valueOf(aweme2.getFollowStatus());
                    C25539a.m62079a().logCommerceEvents("show_product", eVar2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo49075a(View view) {
        String str;
        super.mo49075a(view);
        JSONObject jSONObject = this.f63072r;
        if (jSONObject != null) {
            String str2 = "";
            try {
                str = jSONObject.getString("request_id");
                C52711k.m112236a((Object) str, "it.getString(Mob.Key.REQUEST_ID)");
            } catch (JSONException unused) {
                str = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                Aweme aweme = this.f63162v;
                if (aweme != null) {
                    aweme.setRequestId(str);
                }
            }
        }
        C30313ae<C30332aw> aeVar = this.f63158a;
        if (aeVar != null) {
            aeVar.mo60714a(new C30332aw(30, this.f63162v));
        }
    }

    /* renamed from: a */
    public final void mo49076a(Aweme aweme, JSONObject jSONObject) {
        String str;
        super.mo49076a(aweme, jSONObject);
        if (aweme != null) {
            this.f63162v = aweme;
            this.f63163w = aweme.getPromotion();
            C23515d.m57668a(this.f63057c, (int) R.drawable.aj4);
            this.f63164x.setVisibility(0);
            this.f63166z.setVisibility(0);
            this.f63165y.setVisibility(0);
            this.f63067m.setVisibility(8);
            this.f63069o.setVisibility(0);
            this.f63068n.setVisibility(8);
            DmtTextView dmtTextView = this.f63058d;
            C25519e eVar = this.f63163w;
            if (eVar != null) {
                str = eVar.getShortTitle();
            } else {
                str = null;
            }
            dmtTextView.setText(str);
            C25519e eVar2 = this.f63163w;
            if (eVar2 != null) {
                int sales = eVar2.getSales();
                if (sales >= 10) {
                    this.f63166z.setText(C25552a.m62086a(this.f63159b, R.string.fx1, C33095b.m76068a((long) sales)));
                } else {
                    this.f63166z.setVisibility(8);
                    this.f63165y.setVisibility(8);
                }
                int price = eVar2.getPrice();
                this.f63164x.setText(C25552a.m62086a(this.f63159b, R.string.fx0, C25550a.m62084a(price)));
            }
        }
    }

    public C23683x(ViewGroup viewGroup, Activity activity, String str, int i) {
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(activity, "activity");
        super(viewGroup);
        this.f63159b = activity;
        this.f63160s = str;
        this.f63161u = i;
        View findViewById = viewGroup.findViewById(R.id.eui);
        C52711k.m112236a((Object) findViewById, "parent.findViewById(R.id.second_price)");
        this.f63164x = (DmtTextView) findViewById;
        View findViewById2 = viewGroup.findViewById(R.id.eud);
        C52711k.m112236a((Object) findViewById2, "parent.findViewById(R.id.second_divider)");
        this.f63165y = (ImageView) findViewById2;
        View findViewById3 = viewGroup.findViewById(R.id.euj);
        C52711k.m112236a((Object) findViewById3, "parent.findViewById(R.id.second_sales)");
        this.f63166z = (DmtTextView) findViewById3;
    }
}
