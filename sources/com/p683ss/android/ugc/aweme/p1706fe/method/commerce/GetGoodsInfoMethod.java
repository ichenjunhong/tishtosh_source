package com.p683ss.android.ugc.aweme.p1706fe.method.commerce;

import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.GetGoodsInfoMethod */
public final class GetGoodsInfoMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29868a f77969a = new C29868a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.GetGoodsInfoMethod$a */
    public static final class C29868a {
        private C29868a() {
        }

        public /* synthetic */ C29868a(C52707g gVar) {
            this();
        }
    }

    public GetGoodsInfoMethod() {
        this(null, 1, null);
    }

    public GetGoodsInfoMethod(C10757a aVar) {
        super(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        if (r12 == null) goto L_0x003e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49914a(org.json.JSONObject r12, com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a r13) {
        /*
            r11 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = com.p683ss.android.ugc.aweme.commercialize.utils.C26404av.m63870a()
            if (r12 == 0) goto L_0x000b
            com.ss.android.ugc.aweme.commerce.model.e r12 = r12.getPromotion()
            goto L_0x000c
        L_0x000b:
            r12 = 0
        L_0x000c:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r12 != 0) goto L_0x001a
            java.lang.String r12 = "code"
            r1 = 0
            r0.put(r12, r1)
            goto L_0x005f
        L_0x001a:
            java.lang.String r1 = "code"
            r2 = 1
            r0.put(r1, r2)
            com.ss.android.ugc.aweme.commerce.model.PromotionVisitor r1 = r12.getVisitor()
            java.lang.String r2 = "goodsInfo"
            java.lang.String r4 = r12.getElasticTitle()
            java.lang.String r5 = r12.getTitle()
            java.util.List r6 = r12.getElasticImages()
            java.util.List r8 = r12.getLabels()
            if (r1 == 0) goto L_0x003e
            java.util.List r12 = r1.getAvatars()
            if (r12 != 0) goto L_0x0042
        L_0x003e:
            java.util.List r12 = p2628d.p2629a.C52575l.m112097a()
        L_0x0042:
            if (r1 == 0) goto L_0x0049
            long r9 = r1.getCount()
            goto L_0x004b
        L_0x0049:
            r9 = 0
        L_0x004b:
            com.ss.android.ugc.aweme.commerce.model.PromotionVisitor r1 = new com.ss.android.ugc.aweme.commerce.model.PromotionVisitor
            r1.<init>(r12, r9)
            com.ss.android.ugc.aweme.commerce.service.models.c r12 = new com.ss.android.ugc.aweme.commerce.service.models.c
            r7 = 0
            r3 = r12
            r9 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.String r12 = com.alibaba.fastjson.JSON.toJSONString(r12)
            r0.put(r2, r12)
        L_0x005f:
            r13.mo60041a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1706fe.method.commerce.GetGoodsInfoMethod.mo49914a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }

    private /* synthetic */ GetGoodsInfoMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
