package com.p683ss.android.ugc.aweme.base.p1420ui.anchor;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.bullet.p628b.p632d.C10251a;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.p683ss.android.ugc.aweme.commerce.model.C25519e;
import com.p683ss.android.ugc.aweme.commerce.service.C25539a;
import com.p683ss.android.ugc.aweme.commerce.service.models.C25560e;
import com.p683ss.android.ugc.aweme.commerce.service.p1543i.C25550a;
import com.p683ss.android.ugc.aweme.commerce.shoptag.C25573a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.param.FeedParamProvider.C30666a;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.utils.C47793cy;
import com.ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.z */
public final class C23686z extends C23652c {

    /* renamed from: e */
    public C30313ae<C30332aw> f63171e;

    /* renamed from: f */
    public final Activity f63172f;

    /* renamed from: g */
    public final String f63173g;

    /* renamed from: h */
    public final int f63174h;

    /* renamed from: i */
    private C25519e f63175i;

    /* renamed from: b */
    public final void mo49087b() {
        C10290i iVar = this.f63078c;
        if (iVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expand", false);
            iVar.onEvent(new C10251a(jSONObject));
        }
    }

    /* renamed from: f */
    public final void mo49088f() {
        C10290i iVar = this.f63078c;
        if (iVar != null) {
            iVar.onEvent(new C10251a(mo49086a()));
        }
    }

    /* renamed from: h */
    public final void mo49090h() {
        Aweme aweme = this.f63076a;
        if (aweme != null) {
            C25539a.m62079a().logCommerceTag(this.f63172f, aweme, this.f63173g);
        }
    }

    /* renamed from: a */
    public final JSONObject mo49086a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("icon", C47793cy.m103423a(R.drawable.aj4));
        C25519e eVar = this.f63175i;
        if (eVar != null) {
            String shortTitle = eVar.getShortTitle();
            if (shortTitle != null) {
                jSONObject.put("title", shortTitle);
            }
            jSONObject.put("price", this.f63172f.getString(R.string.fx0, new Object[]{C25550a.m62084a(eVar.getPrice())}));
            String str2 = "sale";
            if (eVar.getSales() >= 10) {
                str = this.f63172f.getString(R.string.fx1, new Object[]{C33095b.m76068a((long) eVar.getSales())});
            } else {
                str = "";
            }
            jSONObject.put(str2, str);
        }
        return jSONObject;
    }

    /* renamed from: g */
    public final void mo49089g() {
        Aweme aweme = this.f63076a;
        if (aweme != null) {
            C25519e promotion = aweme.getPromotion();
            if (promotion != null) {
                C52711k.m112236a((Object) promotion, "aweme?.promotion ?: return");
                String fromGroupId = C30666a.m71942a(this.f63172f).getFromGroupId();
                String referCommodityId = C30666a.m71942a(this.f63172f).getReferCommodityId();
                Aweme aweme2 = this.f63076a;
                if (aweme2 != null) {
                    if (!C31190f.m72831a(aweme2)) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (aweme2.getAid() != null) {
                                jSONObject.put("group_id", aweme2.getAid());
                            }
                            C26890h.m65008a((Context) this.f63172f, "product_entrance_show", this.f63173g, "0", "0", jSONObject);
                        } catch (Exception unused) {
                        }
                    }
                    Long a = C25573a.m62093a(Integer.valueOf(this.f63174h));
                    String a2 = C25573a.m62094a(this.f63076a, Integer.valueOf(this.f63174h));
                    C25560e eVar = new C25560e();
                    eVar.f67571d = aweme2.getAuthorUid();
                    eVar.f67576i = "video_cart_tag";
                    eVar.f67573f = promotion.getPromotionId();
                    eVar.f67574g = Long.valueOf((long) promotion.getPromotionSource());
                    eVar.f67569b = this.f63173g;
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
                    eVar2.f67569b = this.f63173g;
                    eVar2.f67570c = aweme2.getAid();
                    eVar2.f67577j = "video_play";
                    eVar2.f67575h = this.f63173g;
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
        JSONObject jSONObject = this.f63077b;
        if (jSONObject != null) {
            String str2 = "";
            try {
                str = jSONObject.getString("request_id");
                C52711k.m112236a((Object) str, "it.getString(Mob.Key.REQUEST_ID)");
            } catch (JSONException unused) {
                str = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                Aweme aweme = this.f63076a;
                if (aweme != null) {
                    aweme.setRequestId(str);
                }
            }
        }
        C30313ae<C30332aw> aeVar = this.f63171e;
        if (aeVar != null) {
            aeVar.mo60714a(new C30332aw(30, this.f63076a));
        }
    }

    /* renamed from: a */
    public final void mo49076a(Aweme aweme, JSONObject jSONObject) {
        if (aweme != null) {
            C25519e promotion = aweme.getPromotion();
            if (promotion != null) {
                this.f63175i = promotion;
                super.mo49076a(aweme, jSONObject);
            }
        }
    }

    public C23686z(ViewGroup viewGroup, Activity activity, String str, int i) {
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(activity, "activity");
        super(viewGroup);
        this.f63172f = activity;
        this.f63173g = str;
        this.f63174h = i;
    }
}
