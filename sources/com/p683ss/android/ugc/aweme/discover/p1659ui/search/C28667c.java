package com.p683ss.android.ugc.aweme.discover.p1659ui.search;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.discover.C27940f;
import com.p683ss.android.ugc.aweme.discover.abtest.MixSearchArrangement;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.C28695c;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.c */
public final class C28667c implements C27940f {

    /* renamed from: a */
    public static boolean f75237a;

    /* renamed from: b */
    public static String f75238b = "";

    /* renamed from: c */
    public static final C28667c f75239c = new C28667c();

    /* renamed from: d */
    private static WeakReference<C28664a> f75240d;

    private C28667c() {
    }

    /* renamed from: b */
    public static boolean m67925b() {
        return f75237a;
    }

    /* renamed from: c */
    private static WeakReference<C28664a> m67926c() {
        return f75240d;
    }

    /* renamed from: a */
    public final boolean mo56350a() {
        if (m67926c() != null) {
            WeakReference c = m67926c();
            if (c == null) {
                C52711k.m112234a();
            }
            if (c.get() != null && C10181b.m20511a().mo18168a(MixSearchArrangement.class, true, "mix_search_arrangement", 31744, 0) == 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m67924a(String str) {
        C28664a aVar;
        C52711k.m112240b(str, "type");
        WeakReference<C28664a> weakReference = f75240d;
        String str2 = null;
        if (weakReference != null) {
            aVar = (C28664a) weakReference.get();
        } else {
            aVar = null;
        }
        if (aVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", str);
                WeakReference<C28664a> weakReference2 = f75240d;
                if (weakReference2 != null) {
                    C28664a aVar2 = (C28664a) weakReference2.get();
                    if (aVar2 != null) {
                        String str3 = C28695c.f75309b;
                        WeakReference<C28664a> weakReference3 = f75240d;
                        if (weakReference3 != null) {
                            C28664a aVar3 = (C28664a) weakReference3.get();
                            if (aVar3 != null) {
                                str2 = aVar3.getReactId();
                            }
                        }
                        aVar2.mo55678a(str3, jSONObject, str2);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x008f A[Catch:{ Exception -> 0x00ad }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56349a(com.p683ss.android.ugc.aweme.feed.model.Aweme r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.String r0 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            java.lang.String r0 = "state"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            java.lang.String r0 = "enterFrom"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.lang.String r0 = "from_rn_search"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r7 = android.text.TextUtils.equals(r7, r0)
            if (r7 != 0) goto L_0x001c
            return
        L_0x001c:
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.discover.ui.search.a> r7 = f75240d
            r0 = 0
            if (r7 == 0) goto L_0x0028
            java.lang.Object r7 = r7.get()
            com.ss.android.ugc.aweme.discover.ui.search.a r7 = (com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28664a) r7
            goto L_0x0029
        L_0x0028:
            r7 = r0
        L_0x0029:
            if (r7 == 0) goto L_0x00ae
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x00ad }
            r7.<init>()     // Catch:{ Exception -> 0x00ad }
            java.lang.String r1 = "reactId"
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.discover.ui.search.a> r2 = f75240d     // Catch:{ Exception -> 0x00ad }
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x00ad }
            com.ss.android.ugc.aweme.discover.ui.search.a r2 = (com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28664a) r2     // Catch:{ Exception -> 0x00ad }
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = r2.getReactId()     // Catch:{ Exception -> 0x00ad }
            goto L_0x0044
        L_0x0043:
            r2 = r0
        L_0x0044:
            r7.put(r1, r2)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r1 = "awemeId"
            java.lang.String r2 = r5.getAid()     // Catch:{ Exception -> 0x00ad }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r1 = "star"
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r2 = r5.getStatistics()     // Catch:{ Exception -> 0x00ad }
            java.lang.String r3 = "aweme.statistics"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ Exception -> 0x00ad }
            long r2 = r2.getDiggCount()     // Catch:{ Exception -> 0x00ad }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r1 = "comment"
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r2 = r5.getStatistics()     // Catch:{ Exception -> 0x00ad }
            java.lang.String r3 = "aweme.statistics"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ Exception -> 0x00ad }
            long r2 = r2.getCommentCount()     // Catch:{ Exception -> 0x00ad }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r1 = "share"
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r5 = r5.getStatistics()     // Catch:{ Exception -> 0x00ad }
            java.lang.String r2 = "aweme.statistics"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r2)     // Catch:{ Exception -> 0x00ad }
            long r2 = r5.getShareCount()     // Catch:{ Exception -> 0x00ad }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r5 = "from"
            r7.put(r5, r6)     // Catch:{ Exception -> 0x00ad }
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.discover.ui.search.a> r5 = f75240d     // Catch:{ Exception -> 0x00ad }
            if (r5 == 0) goto L_0x00ae
            java.lang.Object r5 = r5.get()     // Catch:{ Exception -> 0x00ad }
            com.ss.android.ugc.aweme.discover.ui.search.a r5 = (com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28664a) r5     // Catch:{ Exception -> 0x00ad }
            if (r5 == 0) goto L_0x00ae
            java.lang.String r1 = com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.C28695c.f75311d     // Catch:{ Exception -> 0x00ad }
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.discover.ui.search.a> r2 = f75240d     // Catch:{ Exception -> 0x00ad }
            if (r2 == 0) goto L_0x00a9
            java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x00ad }
            com.ss.android.ugc.aweme.discover.ui.search.a r2 = (com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28664a) r2     // Catch:{ Exception -> 0x00ad }
            if (r2 == 0) goto L_0x00a9
            java.lang.String r0 = r2.getReactId()     // Catch:{ Exception -> 0x00ad }
        L_0x00a9:
            r5.mo55678a(r1, r7, r0)     // Catch:{ Exception -> 0x00ad }
            goto L_0x00ae
        L_0x00ad:
        L_0x00ae:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.String r5 = "exit"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.equals(r6, r5)
            if (r5 == 0) goto L_0x00bd
            com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.detail.C28709e.m67973b()
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28667c.mo56349a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String):void");
    }
}
