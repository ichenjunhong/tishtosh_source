package com.p683ss.android.ugc.aweme.base.p1420ui.anchor;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b;
import com.p683ss.android.ugc.aweme.commerce.service.C25539a;
import com.p683ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.p683ss.android.ugc.aweme.commerce.service.models.C25560e;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.SimpleShopSeedingModel;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.util.C47620d;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.w */
public final class C23682w extends C23649b {

    /* renamed from: a */
    public C30313ae<C30332aw> f63153a;

    /* renamed from: b */
    public final Activity f63154b;

    /* renamed from: s */
    public final String f63155s;

    /* renamed from: u */
    private Aweme f63156u;

    /* renamed from: v */
    private SimpleShopSeedingModel f63157v;

    /* renamed from: b */
    public final void mo49077b() {
        Aweme aweme = this.f63156u;
        if (aweme != null) {
            C25539a.m62079a().logCommerceTag(this.f63154b, aweme, this.f63155s);
        }
    }

    /* renamed from: a */
    public final void mo49074a() {
        CharSequence charSequence;
        String str;
        Aweme aweme = this.f63156u;
        if (aweme != null) {
            SimpleShopSeedingModel simpleShopSeedingModel = this.f63157v;
            String str2 = null;
            if (simpleShopSeedingModel != null) {
                charSequence = simpleShopSeedingModel.getTitle();
            } else {
                charSequence = null;
            }
            if (!(!TextUtils.isEmpty(charSequence))) {
                aweme = null;
            }
            if (aweme != null) {
                ICommerceService a = C25539a.m62079a();
                String str3 = "ec_seed_entrance_show";
                C25560e eVar = new C25560e();
                eVar.f67570c = aweme.getAid();
                eVar.f67571d = aweme.getAuthorUid();
                SimpleShopSeedingModel simpleShopSeedingModel2 = this.f63157v;
                if (simpleShopSeedingModel2 != null) {
                    str = simpleShopSeedingModel2.getSeedId();
                } else {
                    str = null;
                }
                eVar.f67580m = str;
                SimpleShopSeedingModel simpleShopSeedingModel3 = this.f63157v;
                if (simpleShopSeedingModel3 != null) {
                    str2 = simpleShopSeedingModel3.getTitle();
                }
                eVar.f67581n = str2;
                eVar.f67569b = this.f63155s;
                a.logCommerceEvents(str3, eVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo49075a(View view) {
        super.mo49075a(view);
        JSONObject jSONObject = this.f63072r;
        if (jSONObject != null) {
            String optString = jSONObject.optString("request_id");
            if (optString != null) {
                if (!C24678b.m60182a(optString)) {
                    optString = null;
                }
                if (optString != null) {
                    Aweme aweme = this.f63156u;
                    if (aweme != null) {
                        aweme.setRequestId(optString);
                    }
                }
            }
        }
        C30313ae<C30332aw> aeVar = this.f63153a;
        if (aeVar != null) {
            aeVar.mo60714a(new C30332aw(41, this.f63156u));
        }
    }

    /* renamed from: a */
    public final void mo49076a(Aweme aweme, JSONObject jSONObject) {
        SimpleShopSeedingModel simpleShopSeedingModel;
        CharSequence charSequence;
        super.mo49076a(aweme, jSONObject);
        this.f63156u = aweme;
        String str = null;
        if (aweme != null) {
            simpleShopSeedingModel = C47620d.m103097a(aweme);
        } else {
            simpleShopSeedingModel = null;
        }
        this.f63157v = simpleShopSeedingModel;
        C23515d.m57668a(this.f63057c, (int) R.drawable.dgi);
        DmtTextView dmtTextView = this.f63058d;
        SimpleShopSeedingModel simpleShopSeedingModel2 = this.f63157v;
        if (simpleShopSeedingModel2 != null) {
            charSequence = simpleShopSeedingModel2.getSeedTag();
        } else {
            charSequence = null;
        }
        dmtTextView.setText(charSequence);
        this.f63066l.setVisibility(0);
        DmtTextView dmtTextView2 = this.f63065k;
        dmtTextView2.setVisibility(0);
        SimpleShopSeedingModel simpleShopSeedingModel3 = this.f63157v;
        if (simpleShopSeedingModel3 != null) {
            str = simpleShopSeedingModel3.getTitle();
        }
        dmtTextView2.setText(str);
    }

    public C23682w(ViewGroup viewGroup, Activity activity, String str) {
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(activity, "activity");
        super(viewGroup);
        this.f63154b = activity;
        this.f63155s = str;
    }
}
