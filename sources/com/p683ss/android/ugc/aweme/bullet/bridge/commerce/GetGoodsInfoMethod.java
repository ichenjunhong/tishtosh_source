package com.p683ss.android.ugc.aweme.bullet.bridge.commerce;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.GetGoodsInfoMethod */
public final class GetGoodsInfoMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24130a f64024b = new C24130a(null);

    /* renamed from: c */
    private final String f64025c = "getGoodsInfo";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.GetGoodsInfoMethod$a */
    public static final class C24130a {
        private C24130a() {
        }

        public /* synthetic */ C24130a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64025c;
    }

    public GetGoodsInfoMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        if (r12 == null) goto L_0x0048;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49906a(org.json.JSONObject r12, com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a r13) {
        /*
            r11 = this;
            java.lang.String r0 = "params"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
            java.lang.String r12 = "iReturn"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r12)
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = com.p683ss.android.ugc.aweme.commercialize.utils.C26404av.m63870a()
            if (r12 == 0) goto L_0x0015
            com.ss.android.ugc.aweme.commerce.model.e r12 = r12.getPromotion()
            goto L_0x0016
        L_0x0015:
            r12 = 0
        L_0x0016:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r12 != 0) goto L_0x0024
            java.lang.String r12 = "code"
            r1 = 0
            r0.put(r12, r1)
            goto L_0x0069
        L_0x0024:
            java.lang.String r1 = "code"
            r2 = 1
            r0.put(r1, r2)
            com.ss.android.ugc.aweme.commerce.model.PromotionVisitor r1 = r12.getVisitor()
            java.lang.String r2 = "goodsInfo"
            java.lang.String r4 = r12.getElasticTitle()
            java.lang.String r5 = r12.getTitle()
            java.util.List r6 = r12.getElasticImages()
            java.util.List r8 = r12.getLabels()
            if (r1 == 0) goto L_0x0048
            java.util.List r12 = r1.getAvatars()
            if (r12 != 0) goto L_0x004c
        L_0x0048:
            java.util.List r12 = p2628d.p2629a.C52575l.m112097a()
        L_0x004c:
            if (r1 == 0) goto L_0x0053
            long r9 = r1.getCount()
            goto L_0x0055
        L_0x0053:
            r9 = 0
        L_0x0055:
            com.ss.android.ugc.aweme.commerce.model.PromotionVisitor r1 = new com.ss.android.ugc.aweme.commerce.model.PromotionVisitor
            r1.<init>(r12, r9)
            com.ss.android.ugc.aweme.commerce.service.models.c r12 = new com.ss.android.ugc.aweme.commerce.service.models.c
            r7 = 0
            r3 = r12
            r9 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.String r12 = com.alibaba.fastjson.JSON.toJSONString(r12)
            r0.put(r2, r12)
        L_0x0069:
            r13.mo49913a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.bridge.commerce.GetGoodsInfoMethod.mo49906a(org.json.JSONObject, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a):void");
    }
}
