package com.toutiao.proxyserver;

/* renamed from: com.toutiao.proxyserver.b */
final class C51806b {
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01aa  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.toutiao.proxyserver.net.C51877e m111115a(com.toutiao.proxyserver.C51790a r19, java.lang.String r20, int r21, int r22, java.lang.String r23) throws java.io.IOException {
        /*
            r0 = r19
            r1 = r20
            com.toutiao.proxyserver.w r2 = r0.f129205i
            if (r2 == 0) goto L_0x000a
            r2 = 1
            goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            long r5 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r8 = ""
            java.lang.String r9 = "&source_id="
            int r9 = r1.lastIndexOf(r9)
            r10 = 2
            r11 = 3
            r12 = 0
            if (r2 == 0) goto L_0x00d1
            boolean r14 = com.p683ss.android.ugc.aweme.p1382aq.p1384b.C23223a.m57038b()
            if (r14 != 0) goto L_0x00d1
            boolean r14 = android.text.TextUtils.isEmpty(r20)
            if (r14 != 0) goto L_0x00d1
            java.lang.String r14 = r0.f129203g
            java.lang.String r14 = (java.lang.String) r14
            if (r9 <= 0) goto L_0x003b
            int r15 = r9 + 11
            int r7 = r20.length()
            if (r15 >= r7) goto L_0x003b
            java.lang.String r8 = r1.substring(r15)
        L_0x003b:
            boolean r7 = android.text.TextUtils.isEmpty(r14)
            if (r7 != 0) goto L_0x0048
            java.lang.String r7 = "_"
            java.lang.String[] r7 = r14.split(r7)
            goto L_0x0049
        L_0x0048:
            r7 = 0
        L_0x0049:
            long r14 = com.p683ss.android.ugc.aweme.feed.C30578o.f79871b
            com.p683ss.android.ugc.aweme.feed.C30578o.f79871b = r12
            com.ss.android.ugc.aweme.common.j r3 = new com.ss.android.ugc.aweme.common.j
            r3.<init>()
            java.lang.String r4 = "duration"
            int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r16 <= 0) goto L_0x005f
            long r17 = android.os.SystemClock.elapsedRealtime()
            long r14 = r17 - r14
            goto L_0x0060
        L_0x005f:
            r14 = r12
        L_0x0060:
            java.lang.String r14 = java.lang.Long.toString(r14)
            com.ss.android.ugc.aweme.common.j r3 = r3.mo54849a(r4, r14)
            java.lang.String r4 = "is_first"
            boolean r14 = com.p683ss.android.ugc.aweme.p1382aq.p1384b.C23227e.f61976a
            java.lang.String r14 = java.lang.String.valueOf(r14)
            com.ss.android.ugc.aweme.common.j r3 = r3.mo54849a(r4, r14)
            java.lang.String r4 = "group_id"
            com.ss.android.ugc.aweme.common.j r3 = r3.mo54849a(r4, r8)
            java.lang.String r4 = "bitRate"
            if (r7 == 0) goto L_0x0084
            int r14 = r7.length
            if (r14 <= r11) goto L_0x0084
            r14 = r7[r11]
            goto L_0x0086
        L_0x0084:
            java.lang.String r14 = ""
        L_0x0086:
            com.ss.android.ugc.aweme.common.j r3 = r3.mo54849a(r4, r14)
            java.lang.String r4 = "video_type"
            if (r7 == 0) goto L_0x0094
            int r14 = r7.length
            if (r14 <= r10) goto L_0x0094
            r14 = r7[r10]
            goto L_0x0096
        L_0x0094:
            java.lang.String r14 = ""
        L_0x0096:
            com.ss.android.ugc.aweme.common.j r3 = r3.mo54849a(r4, r14)
            java.lang.String r4 = "isH265"
            if (r7 == 0) goto L_0x00a5
            int r14 = r7.length
            r15 = 1
            if (r14 <= r15) goto L_0x00a5
            r14 = r7[r15]
            goto L_0x00a7
        L_0x00a5:
            java.lang.String r14 = ""
        L_0x00a7:
            com.ss.android.ugc.aweme.common.j r3 = r3.mo54849a(r4, r14)
            java.lang.String r4 = "from_size"
            java.lang.String r14 = java.lang.String.valueOf(r21)
            com.ss.android.ugc.aweme.common.j r3 = r3.mo54849a(r4, r14)
            java.lang.String r4 = "to_size"
            java.lang.String r14 = java.lang.String.valueOf(r22)
            com.ss.android.ugc.aweme.common.j r3 = r3.mo54849a(r4, r14)
            org.json.JSONObject r3 = r3.mo54850a()
            com.ss.android.ugc.aweme.aq.b.e$a r4 = new com.ss.android.ugc.aweme.aq.b.e$a
            java.lang.String r14 = "video_api_request"
            r4.<init>(r14, r3)
            p001a.C0013i.m16a(r4)
            r3 = 0
            com.p683ss.android.ugc.aweme.p1382aq.p1384b.C23227e.f61976a = r3
            goto L_0x00d3
        L_0x00d1:
            r3 = 0
            r7 = 0
        L_0x00d3:
            if (r9 <= 0) goto L_0x00e1
            if (r2 == 0) goto L_0x00e1
            boolean r4 = android.text.TextUtils.isEmpty(r20)
            if (r4 != 0) goto L_0x00e1
            java.lang.String r1 = r1.substring(r3, r9)
        L_0x00e1:
            r3 = r22
            r4 = r23
            r9 = r1
            r1 = r21
            com.toutiao.proxyserver.net.e r0 = r0.mo107277b(r9, r1, r3, r4)
            if (r0 == 0) goto L_0x0101
            boolean r4 = r0.mo107382a()
            if (r4 == 0) goto L_0x0101
            java.lang.String r4 = "Content-Length"
            java.lang.String r4 = r0.mo107380a(r4)     // Catch:{ Exception -> 0x0100 }
            if (r4 == 0) goto L_0x0101
            java.lang.Long.parseLong(r4)     // Catch:{ Exception -> 0x0100 }
            goto L_0x0101
        L_0x0100:
        L_0x0101:
            if (r2 == 0) goto L_0x01b0
            boolean r2 = com.p683ss.android.ugc.aweme.p1382aq.p1384b.C23223a.m57038b()
            if (r2 != 0) goto L_0x01b0
            com.ss.android.ugc.aweme.common.j r2 = new com.ss.android.ugc.aweme.common.j
            r2.<init>()
            java.lang.String r4 = "feed_tab"
            java.lang.String r9 = com.p683ss.android.ugc.aweme.feed.C30578o.m71569c()
            com.ss.android.ugc.aweme.common.j r2 = r2.mo54849a(r4, r9)
            java.lang.String r4 = "duration"
            long r14 = android.os.SystemClock.elapsedRealtime()
            long r14 = r14 - r5
            java.lang.String r5 = java.lang.String.valueOf(r14)
            com.ss.android.ugc.aweme.common.j r2 = r2.mo54849a(r4, r5)
            java.lang.String r4 = "is_first"
            boolean r5 = com.p683ss.android.ugc.aweme.p1382aq.p1384b.C23227e.f61977b
            java.lang.String r5 = java.lang.String.valueOf(r5)
            com.ss.android.ugc.aweme.common.j r2 = r2.mo54849a(r4, r5)
            java.lang.String r4 = "group_id"
            com.ss.android.ugc.aweme.common.j r2 = r2.mo54849a(r4, r8)
            java.lang.String r4 = "bitRate"
            if (r7 == 0) goto L_0x0143
            int r5 = r7.length
            if (r5 <= r11) goto L_0x0143
            r5 = r7[r11]
            goto L_0x0145
        L_0x0143:
            java.lang.String r5 = ""
        L_0x0145:
            com.ss.android.ugc.aweme.common.j r2 = r2.mo54849a(r4, r5)
            java.lang.String r4 = "video_type"
            if (r7 == 0) goto L_0x0153
            int r5 = r7.length
            if (r5 <= r10) goto L_0x0153
            r5 = r7[r10]
            goto L_0x0155
        L_0x0153:
            java.lang.String r5 = ""
        L_0x0155:
            com.ss.android.ugc.aweme.common.j r2 = r2.mo54849a(r4, r5)
            java.lang.String r4 = "isH265"
            if (r7 == 0) goto L_0x0164
            int r5 = r7.length
            r15 = 1
            if (r5 <= r15) goto L_0x0165
            r5 = r7[r15]
            goto L_0x0167
        L_0x0164:
            r15 = 1
        L_0x0165:
            java.lang.String r5 = ""
        L_0x0167:
            com.ss.android.ugc.aweme.common.j r2 = r2.mo54849a(r4, r5)
            java.lang.String r4 = "from_size"
            java.lang.String r1 = java.lang.String.valueOf(r21)
            com.ss.android.ugc.aweme.common.j r1 = r2.mo54849a(r4, r1)
            java.lang.String r2 = "to_size"
            java.lang.String r3 = java.lang.String.valueOf(r22)
            com.ss.android.ugc.aweme.common.j r1 = r1.mo54849a(r2, r3)
            java.lang.String r2 = "is_success"
            if (r0 == 0) goto L_0x018a
            boolean r3 = r0.mo107382a()
            if (r3 == 0) goto L_0x018a
            goto L_0x018b
        L_0x018a:
            r15 = 0
        L_0x018b:
            java.lang.String r3 = java.lang.String.valueOf(r15)
            com.ss.android.ugc.aweme.common.j r1 = r1.mo54849a(r2, r3)
            org.json.JSONObject r1 = r1.mo54850a()
            com.ss.android.ugc.aweme.aq.b.e$a r2 = new com.ss.android.ugc.aweme.aq.b.e$a
            java.lang.String r3 = "video_api_response"
            r2.<init>(r3, r1)
            p001a.C0013i.m16a(r2)
            r1 = 0
            com.p683ss.android.ugc.aweme.p1382aq.p1384b.C23227e.f61977b = r1
            long r1 = com.p683ss.android.ugc.aweme.feed.C30578o.f79872c
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x01b0
            long r1 = android.os.SystemClock.elapsedRealtime()
            com.p683ss.android.ugc.aweme.feed.C30578o.f79872c = r1
        L_0x01b0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C51806b.m111115a(com.toutiao.proxyserver.a, java.lang.String, int, int, java.lang.String):com.toutiao.proxyserver.net.e");
    }
}
