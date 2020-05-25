package com.p683ss.android.ugc.aweme.profile.util;

import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.profile.util.c */
public final class C40542c {
    /* renamed from: a */
    private static String m89955a(int i) {
        if (i == 0) {
            return "aweme/v1/aweme/post";
        }
        if (i == 1) {
            return "aweme/v1/aweme/favorite";
        }
        StringBuilder sb = new StringBuilder("urlTagByType/");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m89956a(int i, String str) {
        C0013i.m18a((Callable<TResult>) new C40547h<TResult>(i, str), (Executor) C26890h.m65003a());
    }

    /* renamed from: b */
    static final /* synthetic */ Object m89961b(int i, String str) throws Exception {
        try {
            C23089d a = C23089d.m56640a().mo47826a("request_type", i).mo47829a("to_user_id", str);
            C26890h.m65011a("aweme_profile_list_request_data", a.f61491a);
            StringBuilder sb = new StringBuilder("request:");
            sb.append(m89955a(i));
            C32458a.m75141a(4, sb.toString(), a.f61491a.toString());
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static void m89957a(int i, String str, FeedItemList feedItemList) {
        C0013i.m18a((Callable<TResult>) new C40546g<TResult>(i, str, feedItemList), (Executor) C26890h.m65003a());
    }

    /* renamed from: b */
    static final /* synthetic */ Object m89963b(int i, boolean z, int i2) throws Exception {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("request", "request");
            jSONObject.put("pageType", i);
            jSONObject.put("loadMore", z);
            jSONObject.put("curCount", i2);
            jSONObject2.put("success", 1);
            jSONObject2.put("errorResponse", jSONObject);
        } catch (JSONException unused) {
        }
        C23131p.m57779a("aweme_favorite_list_data_log", jSONObject2);
        return null;
    }

    /* renamed from: a */
    public static void m89958a(int i, boolean z, int i2) {
        C0013i.m18a((Callable<TResult>) new C40545f<TResult>(i, z, i2), (Executor) C26890h.m65003a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065 A[Catch:{ Exception -> 0x0081 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ java.lang.Object m89962b(int r4, java.lang.String r5, com.p683ss.android.ugc.aweme.feed.model.FeedItemList r6) throws java.lang.Exception {
        /*
            r0 = 0
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "request_type"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47826a(r2, r4)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "to_user_id"
            com.ss.android.ugc.aweme.app.f.d r5 = r1.mo47829a(r2, r5)     // Catch:{ Exception -> 0x0081 }
            if (r6 == 0) goto L_0x003a
            java.util.List r1 = r6.getItems()     // Catch:{ Exception -> 0x0081 }
            if (r1 != 0) goto L_0x001a
            goto L_0x003a
        L_0x001a:
            java.lang.String r1 = "size"
            java.util.List r2 = r6.getItems()     // Catch:{ Exception -> 0x0081 }
            int r2 = r2.size()     // Catch:{ Exception -> 0x0081 }
            com.ss.android.ugc.aweme.app.f.d r1 = r5.mo47826a(r1, r2)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.feed.model.LogPbBean r3 = r6.logPb     // Catch:{ Exception -> 0x0081 }
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47828a(r2, r3)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "request_id"
            java.lang.String r3 = r6.getRequestId()     // Catch:{ Exception -> 0x0081 }
            r1.mo47829a(r2, r3)     // Catch:{ Exception -> 0x0081 }
            goto L_0x005c
        L_0x003a:
            java.lang.String r1 = "is_empty"
            java.lang.String r2 = "true"
            com.ss.android.ugc.aweme.app.f.d r1 = r5.mo47829a(r1, r2)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "request_id"
            if (r6 == 0) goto L_0x004b
            java.lang.String r3 = r6.getRequestId()     // Catch:{ Exception -> 0x0081 }
            goto L_0x004d
        L_0x004b:
            java.lang.String r3 = ""
        L_0x004d:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "log_pb"
            if (r6 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.feed.model.LogPbBean r3 = r6.logPb     // Catch:{ Exception -> 0x0081 }
            goto L_0x0059
        L_0x0058:
            r3 = r0
        L_0x0059:
            r1.mo47828a(r2, r3)     // Catch:{ Exception -> 0x0081 }
        L_0x005c:
            java.lang.String r1 = "aweme_profile_list_response_data"
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.f61491a     // Catch:{ Exception -> 0x0081 }
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r1, r2)     // Catch:{ Exception -> 0x0081 }
            if (r6 == 0) goto L_0x0081
            r6 = 4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "response:"
            r1.<init>(r2)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r4 = m89955a(r4)     // Catch:{ Exception -> 0x0081 }
            r1.append(r4)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x0081 }
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f61491a     // Catch:{ Exception -> 0x0081 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0081 }
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r6, r4, r5)     // Catch:{ Exception -> 0x0081 }
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.util.C40542c.m89962b(int, java.lang.String, com.ss.android.ugc.aweme.feed.model.FeedItemList):java.lang.Object");
    }

    /* renamed from: b */
    static final /* synthetic */ Object m89964b(int i, boolean z, Exception exc) throws Exception {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("pageType", i);
            jSONObject.put("loadMore", z);
            String str3 = "errorMsg";
            if (exc instanceof C23459a) {
                str2 = ((C23459a) exc).getResponse();
            } else {
                str2 = exc.toString();
            }
            jSONObject.put(str3, str2);
            jSONObject2.put("success", 0);
            jSONObject2.put("errorResponse", jSONObject);
        } catch (JSONException unused) {
        }
        C23131p.m57779a("aweme_favorite_list_data_log", jSONObject2);
        StringBuilder sb = new StringBuilder("response:fail:");
        sb.append(m89955a(i));
        String sb2 = sb.toString();
        C23089d a = C23089d.m56640a().mo47828a("loadMore", (Object) Boolean.valueOf(z));
        String str4 = "errorMsg";
        if (exc instanceof C23459a) {
            str = ((C23459a) exc).getResponse();
        } else {
            str = exc.toString();
        }
        C32458a.m75141a(4, sb2, a.mo47829a(str4, str).f61491a.toString());
        return null;
    }

    /* renamed from: a */
    public static void m89960a(int i, boolean z, Exception exc) {
        C0013i.m18a((Callable<TResult>) new C40544e<TResult>(i, z, exc), (Executor) C26890h.m65003a());
    }

    /* renamed from: a */
    static final /* synthetic */ Object m89954a(int i, int i2, boolean z, int i3, long j, long j2, int i4) throws Exception {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("status_code", i);
            jSONObject.put("pageType", i2);
            jSONObject.put("loadMore", z);
            jSONObject.put("hasMore", String.valueOf(i3));
            jSONObject.put("maxCursor", String.valueOf(j));
            jSONObject.put("minCursor", String.valueOf(j2));
            jSONObject.put("listCount", String.valueOf(i4));
            jSONObject2.put("success", 1);
            jSONObject2.put("errorResponse", jSONObject.toString());
        } catch (JSONException unused) {
        }
        C23131p.m57779a("aweme_favorite_list_data_log", jSONObject2);
        return null;
    }

    /* renamed from: a */
    public static void m89959a(int i, boolean z, int i2, int i3, long j, long j2, int i4) {
        C40543d dVar = new C40543d(0, i, z, i3, j, j2, i4);
        C0013i.m18a((Callable<TResult>) dVar, (Executor) C26890h.m65003a());
    }
}
