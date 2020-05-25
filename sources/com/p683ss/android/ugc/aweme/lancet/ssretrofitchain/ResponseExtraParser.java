package com.p683ss.android.ugc.aweme.lancet.ssretrofitchain;

import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12685b;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.lancet.ssretrofitchain.C35823f.C35824a;
import com.p683ss.android.ugc.aweme.sec.C41474e;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser */
public final class ResponseExtraParser {

    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser$OldErrorModel */
    static class OldErrorModel {
        Data data;

        /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser$OldErrorModel$Data */
        static class Data {
            String description;
            int error_code;

            Data() {
            }
        }

        OldErrorModel() {
        }
    }

    /* renamed from: a */
    public static C35823f m80942a(C12799u uVar) {
        C35823f fVar;
        if (uVar == null) {
            return null;
        }
        T t = uVar.f33552b;
        if (t != null) {
            long j = -1;
            if (t instanceof BaseResponse) {
                BaseResponse baseResponse = (BaseResponse) t;
                if (baseResponse == null) {
                    return null;
                }
                C35824a aVar = new C35824a();
                aVar.f91998a = baseResponse.status_code;
                aVar.f91999b = baseResponse.status_msg;
                if (baseResponse.extra != null) {
                    j = baseResponse.extra.now;
                }
                return new C35823f(aVar, j);
            } else if (t instanceof String) {
                return m80943a(t.toString());
            } else {
                if (t instanceof FeedItemList) {
                    FeedItemList feedItemList = (FeedItemList) t;
                    if (feedItemList == null) {
                        return null;
                    }
                    C35824a aVar2 = new C35824a();
                    int i = feedItemList.status_code;
                    if (i == 0) {
                        i = feedItemList.error_code;
                    }
                    aVar2.f91998a = i;
                    aVar2.f91999b = feedItemList.status_msg;
                    if (feedItemList.extra != null) {
                        j = feedItemList.extra.now;
                    }
                    return new C35823f(aVar2, j);
                }
            }
        }
        if (uVar.f33551a == null || uVar.f33551a.f33350e == null) {
            return null;
        }
        C12685b a = uVar.f33551a.mo23865a("Transfer-Encoding");
        if (a != null && "chunked".equalsIgnoreCase(a.f33319b)) {
            return null;
        }
        try {
            System.currentTimeMillis();
            fVar = m80943a(C41474e.m91290a(uVar.f33551a));
        } catch (Throwable unused) {
            fVar = null;
        }
        return fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x0105 A[SYNTHETIC, Splitter:B:75:0x0105] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x010c A[SYNTHETIC, Splitter:B:83:0x010c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.p683ss.android.ugc.aweme.lancet.ssretrofitchain.C35823f m80943a(java.lang.String r12) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            com.google.gson.c.a r0 = new com.google.gson.c.a     // Catch:{ Throwable -> 0x0109, all -> 0x0101 }
            java.io.StringReader r2 = new java.io.StringReader     // Catch:{ Throwable -> 0x0109, all -> 0x0101 }
            r2.<init>(r12)     // Catch:{ Throwable -> 0x0109, all -> 0x0101 }
            r0.<init>(r2)     // Catch:{ Throwable -> 0x0109, all -> 0x0101 }
            com.google.gson.c.b r2 = r0.mo34843f()     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            com.google.gson.c.b r3 = com.google.gson.p1078c.C17960b.NULL     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            if (r2 != r3) goto L_0x0021
            r0.mo34847k()     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            r0.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0020:
            return r1
        L_0x0021:
            r2 = 1
            r0.f49847a = r2     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.f$a r3 = new com.ss.android.ugc.aweme.lancet.ssretrofitchain.f$a     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            r3.<init>()     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            r4 = -1
            r0.mo34839c()     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            r6 = 3
            r7 = 0
            r8 = r4
            r4 = 3
            r5 = 0
        L_0x0033:
            boolean r10 = r0.mo34842e()     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            if (r10 == 0) goto L_0x00d0
            if (r4 <= 0) goto L_0x00d0
            java.lang.String r10 = r0.mo34844h()     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            int r11 = r10.hashCode()     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            switch(r11) {
                case -891699686: goto L_0x006f;
                case 96965648: goto L_0x0065;
                case 248339892: goto L_0x005b;
                case 954925063: goto L_0x0051;
                case 1635686852: goto L_0x0047;
                default: goto L_0x0046;
            }     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
        L_0x0046:
            goto L_0x0079
        L_0x0047:
            java.lang.String r11 = "error_code"
            boolean r10 = r10.equals(r11)     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            if (r10 == 0) goto L_0x0079
            r10 = 0
            goto L_0x007a
        L_0x0051:
            java.lang.String r11 = "message"
            boolean r10 = r10.equals(r11)     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            if (r10 == 0) goto L_0x0079
            r10 = 4
            goto L_0x007a
        L_0x005b:
            java.lang.String r11 = "status_msg"
            boolean r10 = r10.equals(r11)     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            if (r10 == 0) goto L_0x0079
            r10 = 2
            goto L_0x007a
        L_0x0065:
            java.lang.String r11 = "extra"
            boolean r10 = r10.equals(r11)     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            if (r10 == 0) goto L_0x0079
            r10 = 3
            goto L_0x007a
        L_0x006f:
            java.lang.String r11 = "status_code"
            boolean r10 = r10.equals(r11)     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            if (r10 == 0) goto L_0x0079
            r10 = 1
            goto L_0x007a
        L_0x0079:
            r10 = -1
        L_0x007a:
            switch(r10) {
                case 0: goto L_0x00bd;
                case 1: goto L_0x00bd;
                case 2: goto L_0x00b3;
                case 3: goto L_0x008f;
                case 4: goto L_0x0081;
                default: goto L_0x007d;
            }     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
        L_0x007d:
            r0.mo34851o()     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            goto L_0x0033
        L_0x0081:
            java.lang.String r10 = r0.mo34845i()     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            java.lang.String r11 = "error"
            boolean r10 = r11.equals(r10)     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            if (r10 == 0) goto L_0x0033
            r5 = 1
            goto L_0x0033
        L_0x008f:
            r0.mo34839c()     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
        L_0x0092:
            boolean r10 = r0.mo34842e()     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            if (r10 == 0) goto L_0x00af
            java.lang.String r10 = "now"
            java.lang.String r11 = r0.mo34844h()     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            boolean r10 = r10.equals(r11)     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            if (r10 == 0) goto L_0x00ab
            long r8 = r0.mo34849m()     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            int r4 = r4 + -1
            goto L_0x0092
        L_0x00ab:
            r0.mo34851o()     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            goto L_0x0092
        L_0x00af:
            r0.mo34841d()     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            goto L_0x0033
        L_0x00b3:
            java.lang.String r10 = r0.mo34845i()     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            r3.f91999b = r10     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            int r4 = r4 + -1
            goto L_0x0033
        L_0x00bd:
            int r10 = r3.f91998a     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            if (r10 > 0) goto L_0x00cb
            int r10 = r0.mo34850n()     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            r3.f91998a = r10     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            int r4 = r4 + -1
            goto L_0x0033
        L_0x00cb:
            r0.mo34851o()     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            goto L_0x0033
        L_0x00d0:
            if (r5 == 0) goto L_0x00f6
            com.google.gson.f r2 = new com.google.gson.f     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            r2.<init>()     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            java.lang.Class<com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser$OldErrorModel> r4 = com.p683ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser.OldErrorModel.class
            java.lang.Object r12 = r2.mo34884a(r12, r4)     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser$OldErrorModel r12 = (com.p683ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser.OldErrorModel) r12     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser$OldErrorModel$Data r2 = r12.data     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            if (r2 != 0) goto L_0x00e4
            goto L_0x00e8
        L_0x00e4:
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser$OldErrorModel$Data r2 = r12.data     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            int r7 = r2.error_code     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
        L_0x00e8:
            r3.f91998a = r7     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser$OldErrorModel$Data r2 = r12.data     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            if (r2 != 0) goto L_0x00f0
            r12 = r1
            goto L_0x00f4
        L_0x00f0:
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser$OldErrorModel$Data r12 = r12.data     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            java.lang.String r12 = r12.description     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
        L_0x00f4:
            r3.f91999b = r12     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
        L_0x00f6:
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.f r12 = new com.ss.android.ugc.aweme.lancet.ssretrofitchain.f     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            r12.<init>(r3, r8)     // Catch:{ Throwable -> 0x010a, all -> 0x00ff }
            r0.close()     // Catch:{ IOException -> 0x00fe }
        L_0x00fe:
            return r12
        L_0x00ff:
            r12 = move-exception
            goto L_0x0103
        L_0x0101:
            r12 = move-exception
            r0 = r1
        L_0x0103:
            if (r0 == 0) goto L_0x0108
            r0.close()     // Catch:{ IOException -> 0x0108 }
        L_0x0108:
            throw r12
        L_0x0109:
            r0 = r1
        L_0x010a:
            if (r0 == 0) goto L_0x010f
            r0.close()     // Catch:{ IOException -> 0x010f }
        L_0x010f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser.m80943a(java.lang.String):com.ss.android.ugc.aweme.lancet.ssretrofitchain.f");
    }
}
