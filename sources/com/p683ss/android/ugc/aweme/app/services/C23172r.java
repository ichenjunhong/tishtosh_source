package com.p683ss.android.ugc.aweme.app.services;

import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p683ss.android.ugc.aweme.main.service.C36685g.C36686a;
import com.p683ss.android.ugc.aweme.music.model.Music;
import p001a.C0011g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.services.r */
public final class C23172r implements C0011g<ChallengeDetail, Object> {

    /* renamed from: a */
    private final String f61582a;

    /* renamed from: b */
    private final String f61583b;

    /* renamed from: c */
    private final Music f61584c;

    /* renamed from: d */
    private final C36686a f61585d;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object then(p001a.C0013i<com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetail> r11) throws java.lang.Exception {
        /*
            r10 = this;
            java.lang.String r0 = "task"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
            java.lang.String r0 = r10.f61583b
            com.ss.android.ugc.aweme.music.model.Music r1 = r10.f61584c
            boolean r2 = r11.mo31c()
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L_0x00a4
            boolean r2 = r11.mo33d()
            if (r2 != 0) goto L_0x00a4
            java.lang.Object r11 = r11.mo34e()
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetail r11 = (com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetail) r11
            if (r11 == 0) goto L_0x00a5
            com.ss.android.ugc.aweme.discover.model.Challenge r2 = r11.challenge
            java.lang.String r6 = "challenge"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r6)
            java.util.List r6 = r2.getConnectMusics()
            java.lang.String r7 = "challenge"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r7)
            boolean r7 = com.p683ss.android.ugc.aweme.choosemusic.p1513g.C24954a.m60698a()
            if (r7 == 0) goto L_0x0038
        L_0x0036:
            r7 = 1
            goto L_0x005a
        L_0x0038:
            com.ss.android.ugc.aweme.services.IExternalService r7 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r7 = (com.p683ss.android.ugc.aweme.services.IExternalService) r7
            com.ss.android.ugc.aweme.services.video.IAVPublishService r7 = r7.publishService()
            java.lang.String r7 = r7.getShootWay()
            boolean r8 = r2.isCommerce()
            if (r8 == 0) goto L_0x0059
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.lang.String r8 = "challenge"
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r7 = android.text.TextUtils.equals(r7, r8)
            if (r7 == 0) goto L_0x0059
            goto L_0x0036
        L_0x0059:
            r7 = 0
        L_0x005a:
            if (r7 == 0) goto L_0x008f
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = com.bytedance.common.utility.p522b.C9376b.m18558a(r7)
            if (r7 != 0) goto L_0x008f
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x006e:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0089
            java.lang.Object r8 = r6.next()
            com.ss.android.ugc.aweme.music.model.Music r8 = (com.p683ss.android.ugc.aweme.music.model.Music) r8
            java.lang.String r9 = "connectMusic"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            boolean r9 = r8.isCommercialMusic()
            if (r9 == 0) goto L_0x006e
            r7.add(r8)
            goto L_0x006e
        L_0x0089:
            r6 = r7
            java.util.List r6 = (java.util.List) r6
            r2.setConnectMusics(r6)
        L_0x008f:
            if (r6 == 0) goto L_0x00a5
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x00a5
            com.ss.android.ugc.aweme.main.service.g$a r6 = r10.f61585d
            java.lang.String r7 = r10.f61582a
            boolean r2 = r6.mo50754a(r7, r2)
            if (r2 != 0) goto L_0x00a5
            r0 = r5
            r1 = r0
            goto L_0x00a5
        L_0x00a4:
            r11 = r5
        L_0x00a5:
            if (r11 == 0) goto L_0x00cc
            com.ss.android.ugc.aweme.discover.model.Challenge r2 = r11.challenge
            if (r2 == 0) goto L_0x00cc
            com.ss.android.ugc.aweme.discover.model.Challenge r2 = r11.challenge
            java.lang.String r6 = "result.challenge"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r6)
            boolean r2 = r2.isCommerce()
            if (r2 == 0) goto L_0x00cc
            com.ss.android.ugc.aweme.discover.model.Challenge r11 = r11.challenge
            java.lang.String r2 = "result.challenge"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r2)
            java.util.List r11 = r11.getConnectMusics()
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r11 = com.bytedance.common.utility.p522b.C9376b.m18558a(r11)
            if (r11 != 0) goto L_0x00cc
            r3 = 1
        L_0x00cc:
            com.ss.android.ugc.aweme.main.service.g$a r11 = r10.f61585d
            r11.mo50753a(r0, r1, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.app.services.C23172r.then(a.i):java.lang.Object");
    }

    public C23172r(String str, String str2, Music music, C36686a aVar) {
        C52711k.m112240b(str, "dataKey");
        C52711k.m112240b(aVar, "onFetchCallback");
        this.f61582a = str;
        this.f61583b = str2;
        this.f61584c = music;
        this.f61585d = aVar;
    }
}
