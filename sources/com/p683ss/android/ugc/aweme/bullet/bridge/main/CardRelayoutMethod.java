package com.p683ss.android.ugc.aweme.bullet.bridge.main;

import android.view.ViewGroup.LayoutParams;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10269a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p653ui.common.BulletContainerView;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.main.CardRelayoutMethod */
public final class CardRelayoutMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24231a f64292b = new C24231a(null);

    /* renamed from: c */
    private final String f64293c = "cardRelayout";

    /* renamed from: d */
    private C10269a f64294d = C10269a.PRIVATE;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.main.CardRelayoutMethod$a */
    public static final class C24231a {
        private C24231a() {
        }

        public /* synthetic */ C24231a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public final C10269a mo18297b() {
        return this.f64294d;
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64293c;
    }

    /* renamed from: a */
    public final void mo18296a(C10269a aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f64294d = aVar;
    }

    public CardRelayoutMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        BulletContainerView bulletContainerView = (BulletContainerView) this.f27647a.mo18401c(BulletContainerView.class);
        if (bulletContainerView != null) {
            int optInt = jSONObject.optInt("height", 0);
            if (optInt >= 0) {
                LayoutParams layoutParams = bulletContainerView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = optInt;
                }
                bulletContainerView.requestLayout();
                bulletContainerView.invalidate();
                aVar.mo49912a(new JSONObject(), 1, "");
                return;
            }
            StringBuilder sb = new StringBuilder("invalid height: ");
            sb.append(optInt);
            aVar.mo49910a(-1, sb.toString());
            return;
        }
        aVar.mo49910a(-1, "BulletContainerView not found");
    }
}
