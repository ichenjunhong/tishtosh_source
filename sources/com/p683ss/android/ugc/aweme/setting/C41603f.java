package com.p683ss.android.ugc.aweme.setting;

import com.p683ss.android.ugc.aweme.setting.C41549aq.C41551a;

/* renamed from: com.ss.android.ugc.aweme.setting.f */
public class C41603f implements C41551a {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0012  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44361a(com.p683ss.android.ugc.aweme.setting.model.AwemeSettings r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x000a
            com.ss.android.ugc.aweme.setting.model.AwemeSettings$AwemeFEConfigs r1 = r5.feConfigs
            if (r1 == 0) goto L_0x000a
            com.ss.android.ugc.aweme.setting.model.AwemeSettings$LinkPlan r1 = r1.linkPlan
            goto L_0x000b
        L_0x000a:
            r1 = r0
        L_0x000b:
            com.ss.android.ugc.aweme.commercialize.link.d$a r2 = com.p683ss.android.ugc.aweme.commercialize.link.C25953d.f68529b
            if (r1 == 0) goto L_0x0012
            java.lang.String r3 = r1.publish
            goto L_0x0013
        L_0x0012:
            r3 = r0
        L_0x0013:
            r2.mo53302a(r3)
            com.ss.android.ugc.aweme.commercialize.link.d$a r2 = com.p683ss.android.ugc.aweme.commercialize.link.C25953d.f68530c
            if (r1 == 0) goto L_0x001c
            java.lang.String r0 = r1.settings
        L_0x001c:
            r2.mo53302a(r0)
            if (r5 == 0) goto L_0x003f
            java.util.List<java.lang.String> r0 = r5.adLinkPriority
            if (r0 == 0) goto L_0x003f
            java.util.List<java.lang.String> r0 = r5.adLinkPriority
            java.lang.String r1 = "it.adLinkPriority"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x003f
            java.util.List<java.lang.String> r0 = r5.adLinkPriority
            java.lang.String r1 = "it.adLinkPriority"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.p683ss.android.ugc.aweme.commercialize.link.C25973h.f68562a = r0
        L_0x003f:
            if (r5 == 0) goto L_0x0045
            int r0 = r5.adWebContainer
            com.p683ss.android.ugc.aweme.commercialize.utils.C26386al.f69609a = r0
        L_0x0045:
            com.ss.android.ugc.aweme.setting.model.AwemeSettings$GeckoConfig r5 = r5.mGeckoConfig
            if (r5 == 0) goto L_0x00ae
            java.util.List<java.lang.String> r0 = r5.mInitChannels
            boolean r0 = com.bytedance.common.utility.p522b.C9376b.m18558a(r0)
            if (r0 != 0) goto L_0x00ae
            java.util.List<java.lang.String> r0 = r5.mInitChannels
            java.util.List<java.lang.String> r1 = r5.initialHighPriorityChannels
            java.util.List<java.lang.String> r5 = r5.mDynamicChannels
            if (r0 == 0) goto L_0x0062
            com.ss.android.ugc.aweme.utils.c.c r2 = com.p683ss.android.ugc.aweme.utils.p2389c.C47751c.m103375a()
            com.ss.android.ugc.aweme.utils.c.d<java.lang.String> r2 = r2.f120267a
            r2.mo95027a(r0)
        L_0x0062:
            boolean r0 = com.bytedance.common.utility.p522b.C9376b.m18558a(r1)
            if (r0 != 0) goto L_0x0071
            com.ss.android.ugc.aweme.utils.c.c r0 = com.p683ss.android.ugc.aweme.utils.p2389c.C47751c.m103375a()
            com.ss.android.ugc.aweme.utils.c.d<java.lang.String> r0 = r0.f120268b
            r0.mo95027a(r1)
        L_0x0071:
            boolean r0 = com.bytedance.common.utility.p522b.C9376b.m18558a(r5)
            if (r0 != 0) goto L_0x0080
            com.ss.android.ugc.aweme.utils.c.c r0 = com.p683ss.android.ugc.aweme.utils.p2389c.C47751c.m103375a()
            com.ss.android.ugc.aweme.utils.c.d<java.lang.String> r0 = r0.f120269c
            r0.mo95027a(r5)
        L_0x0080:
            java.lang.String r5 = com.p683ss.android.ugc.aweme.utils.C47731bq.f120241c
            if (r5 == 0) goto L_0x00ae
            com.ss.android.ugc.aweme.web.d r5 = com.p683ss.android.ugc.aweme.web.C48274d.m104575a()
            com.ss.android.ugc.aweme.web.d r5 = (com.p683ss.android.ugc.aweme.web.C48274d) r5
            if (r5 == 0) goto L_0x00ae
            com.ss.android.ugc.aweme.web.q r0 = com.p683ss.android.ugc.aweme.web.C48380q.m104672e()
            java.lang.String r0 = r0.mo41210d()
            com.bytedance.ies.geckoclient.e r1 = r5.mo95780a(r0)
            if (r1 != 0) goto L_0x00ae
            java.lang.String r1 = com.p683ss.android.ugc.aweme.utils.C47731bq.f120241c
            com.bytedance.ies.geckoclient.e r1 = com.p683ss.android.ugc.aweme.utils.C47731bq.m103336b(r1, r0)
            if (r1 == 0) goto L_0x00a5
            r5.mo95783b(r0, r1)
        L_0x00a5:
            java.lang.String r1 = com.p683ss.android.ugc.aweme.utils.C47731bq.f120241c
            com.bytedance.ies.geckoclient.e r1 = com.p683ss.android.ugc.aweme.utils.C47731bq.m103329a(r1, r0)
            r5.mo95781a(r0, r1)
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.setting.C41603f.mo44361a(com.ss.android.ugc.aweme.setting.model.AwemeSettings):void");
    }
}
