package com.bytedance.android.livesdk.feed.viewmodel;

import com.bytedance.android.livesdk.feed.feed.C6944e;

/* renamed from: com.bytedance.android.livesdk.feed.viewmodel.w */
final /* synthetic */ class C7160w implements C6944e {

    /* renamed from: a */
    private final LiveFeedViewModel f19437a;

    C7160w(LiveFeedViewModel liveFeedViewModel) {
        this.f19437a = liveFeedViewModel;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0149  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13131a(java.lang.String r12, java.util.List r13, com.bytedance.android.live.base.model.feed.C2974a r14, boolean r15) {
        /*
            r11 = this;
            com.bytedance.android.livesdk.feed.viewmodel.LiveFeedViewModel r0 = r11.f19437a
            boolean r1 = com.bytedance.common.utility.C9414h.m18630a(r13)
            if (r1 != 0) goto L_0x0178
            if (r14 != 0) goto L_0x000c
            goto L_0x0178
        L_0x000c:
            r0.f19402d = r12
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            r2 = 0
            if (r1 != 0) goto L_0x0020
            android.net.Uri r12 = android.net.Uri.parse(r12)     // Catch:{ Exception -> 0x0020 }
            java.lang.String r1 = "style"
            java.lang.String r12 = r12.getQueryParameter(r1)     // Catch:{ Exception -> 0x0020 }
            goto L_0x0021
        L_0x0020:
            r12 = r2
        L_0x0021:
            r1 = 6
            if (r15 == 0) goto L_0x0149
            java.util.ListIterator r15 = r13.listIterator()
        L_0x0028:
            boolean r3 = r15.hasNext()
            r4 = 1001(0x3e9, float:1.403E-42)
            if (r3 == 0) goto L_0x004a
            java.lang.Object r3 = r15.next()
            com.bytedance.android.live.base.model.feed.FeedItem r3 = (com.bytedance.android.live.base.model.feed.FeedItem) r3
            int r5 = r3.type
            if (r5 == r4) goto L_0x0046
            int r4 = r3.type
            r5 = 1002(0x3ea, float:1.404E-42)
            if (r4 == r5) goto L_0x0046
            int r3 = r3.type
            r4 = 1003(0x3eb, float:1.406E-42)
            if (r3 != r4) goto L_0x0028
        L_0x0046:
            r15.remove()
            goto L_0x0028
        L_0x004a:
            java.util.Iterator r15 = r13.iterator()
        L_0x004e:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L_0x0078
            java.lang.Object r3 = r15.next()
            com.bytedance.android.live.base.model.feed.FeedItem r3 = (com.bytedance.android.live.base.model.feed.FeedItem) r3
            int r5 = r3.type
            if (r5 != r1) goto L_0x004e
            com.bytedance.android.live.base.model.banner.b r5 = r3.bannerContainer
            if (r5 == 0) goto L_0x0074
            com.bytedance.android.live.base.model.banner.b r5 = r3.bannerContainer
            java.util.List<com.bytedance.android.live.base.model.banner.a> r5 = r5.f8687a
            boolean r5 = com.bytedance.common.utility.p522b.C9376b.m18558a(r5)
            if (r5 == 0) goto L_0x006d
            goto L_0x0074
        L_0x006d:
            com.bytedance.android.live.base.model.banner.b r5 = r3.bannerContainer
            java.util.List<com.bytedance.android.live.base.model.banner.a> r5 = r5.f8687a
            r3.banners = r5
            goto L_0x004e
        L_0x0074:
            r15.remove()
            goto L_0x004e
        L_0x0078:
            int r15 = r13.size()
            com.bytedance.android.live.core.setting.p<java.lang.Integer> r1 = com.bytedance.android.livesdk.feed.setting.LiveFeedSettings.FEED_LIVE_BANNER_POSITION
            java.lang.Object r1 = r1.mo9431a()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3 = 1004(0x3ec, float:1.407E-42)
            r5 = 1
            r6 = 0
            if (r1 != 0) goto L_0x00c7
            com.bytedance.android.live.base.model.banner.b r1 = r14.f8718h
            if (r1 == 0) goto L_0x00c7
            com.bytedance.android.live.base.model.banner.b r1 = r14.f8718h
            java.util.List<com.bytedance.android.live.base.model.banner.a> r1 = r1.f8687a
            boolean r1 = com.bytedance.common.utility.C9414h.m18631b(r1)
            if (r1 == 0) goto L_0x00c7
            java.lang.String r1 = "5"
            boolean r1 = r1.equals(r12)
            if (r1 != 0) goto L_0x00c7
            com.bytedance.android.live.base.model.feed.FeedItem r1 = new com.bytedance.android.live.base.model.feed.FeedItem
            r1.<init>()
            r1.type = r4
            com.bytedance.android.live.base.model.banner.b r7 = r14.f8718h
            java.util.List<com.bytedance.android.live.base.model.banner.a> r7 = r7.f8687a
            r1.banners = r7
            int r7 = r13.size()
            if (r7 <= 0) goto L_0x00c3
            java.lang.Object r7 = r13.get(r6)
            com.bytedance.android.live.base.model.feed.FeedItem r7 = (com.bytedance.android.live.base.model.feed.FeedItem) r7
            int r7 = r7.type
            if (r7 != r3) goto L_0x00c3
            r7 = 1
            goto L_0x00c4
        L_0x00c3:
            r7 = 0
        L_0x00c4:
            r13.add(r7, r1)
        L_0x00c7:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r7 = r13.iterator()
        L_0x00d0:
            boolean r8 = r7.hasNext()
            r9 = 2
            if (r8 == 0) goto L_0x00e8
            java.lang.Object r8 = r7.next()
            com.bytedance.android.live.base.model.feed.FeedItem r8 = (com.bytedance.android.live.base.model.feed.FeedItem) r8
            int r10 = r8.type
            if (r10 != r9) goto L_0x00d0
            r1.add(r8)
            r7.remove()
            goto L_0x00d0
        L_0x00e8:
            boolean r7 = com.bytedance.common.utility.C9414h.m18630a(r1)
            if (r7 != 0) goto L_0x0102
            boolean r0 = r0.f19401c
            if (r0 != 0) goto L_0x0102
            com.bytedance.android.livesdk.feed.feed.c r0 = new com.bytedance.android.livesdk.feed.feed.c
            r0.<init>(r1)
            r0.type = r3
            java.lang.String r1 = ""
            r0.resId = r1
            r0.item = r2
            r13.add(r6, r0)
        L_0x0102:
            com.bytedance.android.live.core.setting.p<java.lang.Integer> r0 = com.bytedance.android.livesdk.feed.setting.LiveFeedSettings.FEED_LIVE_BANNER_POSITION
            java.lang.Object r0 = r0.mo9431a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != r5) goto L_0x0148
            com.bytedance.android.live.base.model.banner.b r0 = r14.f8718h
            if (r0 == 0) goto L_0x0148
            com.bytedance.android.live.base.model.banner.b r0 = r14.f8718h
            java.util.List<com.bytedance.android.live.base.model.banner.a> r0 = r0.f8687a
            if (r0 == 0) goto L_0x0148
            com.bytedance.android.live.base.model.banner.b r0 = r14.f8718h
            java.util.List<com.bytedance.android.live.base.model.banner.a> r0 = r0.f8687a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0148
            java.lang.String r0 = "5"
            boolean r12 = r0.equals(r12)
            if (r12 != 0) goto L_0x0148
            com.bytedance.android.live.base.model.feed.FeedItem r12 = new com.bytedance.android.live.base.model.feed.FeedItem
            r12.<init>()
            r12.type = r4
            com.bytedance.android.live.base.model.banner.b r14 = r14.f8718h
            java.util.List<com.bytedance.android.live.base.model.banner.a> r14 = r14.f8687a
            r12.banners = r14
            int r15 = r15 % r9
            if (r15 != 0) goto L_0x0140
            r13.add(r12)
            goto L_0x0177
        L_0x0140:
            int r14 = r13.size()
            int r14 = r14 - r5
            r13.add(r14, r12)
        L_0x0148:
            return
        L_0x0149:
            java.util.Iterator r12 = r13.iterator()
        L_0x014d:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0177
            java.lang.Object r13 = r12.next()
            com.bytedance.android.live.base.model.feed.FeedItem r13 = (com.bytedance.android.live.base.model.feed.FeedItem) r13
            int r14 = r13.type
            if (r14 != r1) goto L_0x014d
            com.bytedance.android.live.base.model.banner.b r14 = r13.bannerContainer
            if (r14 == 0) goto L_0x0173
            com.bytedance.android.live.base.model.banner.b r14 = r13.bannerContainer
            java.util.List<com.bytedance.android.live.base.model.banner.a> r14 = r14.f8687a
            boolean r14 = com.bytedance.common.utility.p522b.C9376b.m18558a(r14)
            if (r14 == 0) goto L_0x016c
            goto L_0x0173
        L_0x016c:
            com.bytedance.android.live.base.model.banner.b r14 = r13.bannerContainer
            java.util.List<com.bytedance.android.live.base.model.banner.a> r14 = r14.f8687a
            r13.banners = r14
            goto L_0x014d
        L_0x0173:
            r12.remove()
            goto L_0x014d
        L_0x0177:
            return
        L_0x0178:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.viewmodel.C7160w.mo13131a(java.lang.String, java.util.List, com.bytedance.android.live.base.model.feed.a, boolean):void");
    }
}
