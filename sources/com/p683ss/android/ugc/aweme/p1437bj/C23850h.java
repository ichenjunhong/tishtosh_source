package com.p683ss.android.ugc.aweme.p1437bj;

import com.p683ss.android.ugc.aweme.port.p2082in.C39587ba;

/* renamed from: com.ss.android.ugc.aweme.bj.h */
public final class C23850h implements C39587ba {
    /* JADX INFO: used method not loaded: d.m.y.b(java.lang.CharSequence, java.lang.CharSequence, boolean, int, java.lang.Object):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005b, code lost:
        if (p2628d.p2650m.C52830p.m112456b(r4, (java.lang.CharSequence) r3, false, 2, (java.lang.Object) null) == false) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0061 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0062  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Dialog mo49451a(com.p683ss.android.ugc.effectmanager.effect.model.Effect r7, android.content.DialogInterface.OnDismissListener r8, android.os.Handler r9, android.app.Activity r10) {
        /*
            r6 = this;
            java.lang.String r0 = "effect"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            java.lang.String r0 = "onDismissListener"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            java.lang.String r0 = "handler"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            java.lang.String r0 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            r0 = 0
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L_0x005e
            boolean r3 = com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.C46476a.f117260c
            if (r3 != 0) goto L_0x001e
            goto L_0x005e
        L_0x001e:
            android.app.Application r3 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88233b()
            android.content.Context r3 = (android.content.Context) r3
            com.ss.android.ugc.aweme.port.in.ak r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39630m.m88234a()
            com.ss.android.ugc.aweme.port.in.be r4 = r4.mo58623u()
            java.lang.String r4 = r4.mo74236a()
            com.ss.android.ugc.aweme.base.h.g r3 = com.p683ss.android.ugc.aweme.base.p1417h.C23541e.m57714a(r3, r4)
            java.lang.String r4 = "pixaloop_show"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.mo48703a(r4, r5)
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x0046
            goto L_0x005f
        L_0x0046:
            java.lang.String r5 = "showSwitch"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
            java.lang.String r3 = r7.getEffectId()
            java.lang.String r5 = "faceStickerBean.effectId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r5 = 2
            boolean r3 = p2628d.p2650m.C52830p.m112456b(r4, r3, r2, r5, r0)
            if (r3 != 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 != 0) goto L_0x0062
            return r0
        L_0x0062:
            com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.c.a r0 = new com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.c.a
            r0.<init>()
            java.util.List<java.lang.String> r1 = com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.C46476a.f117258a
            java.lang.String r2 = "urlPrefixList"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            r0.f117324d = r1
            java.lang.String r1 = "bean"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r1)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0096 }
            java.lang.String r2 = r7.getExtra()     // Catch:{ Exception -> 0x0096 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r2 = "pixaloop_text"
            java.lang.String r2 = r1.optString(r2)     // Catch:{ Exception -> 0x0096 }
            r0.f117323c = r2     // Catch:{ Exception -> 0x0096 }
            java.lang.String r2 = "pixaloop_picture_cover"
            java.lang.String r2 = r1.optString(r2)     // Catch:{ Exception -> 0x0096 }
            r0.f117321a = r2     // Catch:{ Exception -> 0x0096 }
            java.lang.String r2 = "pixaloop_video_cover"
            java.lang.String r1 = r1.optString(r2)     // Catch:{ Exception -> 0x0096 }
            r0.f117322b = r1     // Catch:{ Exception -> 0x0096 }
        L_0x0096:
            com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.c.b r1 = new com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.c.b
            android.content.Context r10 = (android.content.Context) r10
            r1.<init>(r10, r7, r0)
            java.lang.String r7 = "mainHandler"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r7)
            r1.f117327b = r9
            r1.setOnDismissListener(r8)
            android.app.Dialog r1 = (android.app.Dialog) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1437bj.C23850h.mo49451a(com.ss.android.ugc.effectmanager.effect.model.Effect, android.content.DialogInterface$OnDismissListener, android.os.Handler, android.app.Activity):android.app.Dialog");
    }
}
