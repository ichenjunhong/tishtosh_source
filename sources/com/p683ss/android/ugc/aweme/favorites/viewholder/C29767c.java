package com.p683ss.android.ugc.aweme.favorites.viewholder;

import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.c */
public final class C29767c implements C29766b {

    /* renamed from: a */
    public static boolean f77759a = false;

    /* renamed from: b */
    public static final C29767c f77760b = new C29767c();

    /* renamed from: c */
    private static WeakReference<CrossPlatformWebView> f77761c = null;

    /* renamed from: d */
    private static String f77762d = "";

    /* renamed from: e */
    private static final String f77763e = "loadMoreItem";

    /* renamed from: f */
    private static final String f77764f = "itemStateChange";

    private C29767c() {
    }

    /* renamed from: b */
    public static WeakReference<CrossPlatformWebView> m69868b() {
        return f77761c;
    }

    /* renamed from: a */
    public final boolean mo60018a() {
        if (m69868b() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m69867a(WeakReference<CrossPlatformWebView> weakReference) {
        f77761c = weakReference;
    }

    /* renamed from: a */
    public static void m69866a(String str) {
        CrossPlatformWebView crossPlatformWebView;
        C52711k.m112240b(str, "type");
        WeakReference<CrossPlatformWebView> weakReference = f77761c;
        String str2 = null;
        if (weakReference != null) {
            crossPlatformWebView = (CrossPlatformWebView) weakReference.get();
        } else {
            crossPlatformWebView = null;
        }
        if (crossPlatformWebView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", str);
                WeakReference<CrossPlatformWebView> weakReference2 = f77761c;
                if (weakReference2 != null) {
                    CrossPlatformWebView crossPlatformWebView2 = (CrossPlatformWebView) weakReference2.get();
                    if (crossPlatformWebView2 != null) {
                        String str3 = f77763e;
                        WeakReference<CrossPlatformWebView> weakReference3 = f77761c;
                        if (weakReference3 != null) {
                            CrossPlatformWebView crossPlatformWebView3 = (CrossPlatformWebView) weakReference3.get();
                            if (crossPlatformWebView3 != null) {
                                str2 = crossPlatformWebView3.getReactId();
                            }
                        }
                        crossPlatformWebView2.mo55678a(str3, jSONObject, str2);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0078 A[Catch:{ Exception -> 0x0096 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60017a(com.p683ss.android.ugc.aweme.feed.model.Aweme r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.String r7 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r7)
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView> r7 = f77761c
            r0 = 0
            if (r7 == 0) goto L_0x0011
            java.lang.Object r7 = r7.get()
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r7 = (com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r7
            goto L_0x0012
        L_0x0011:
            r7 = r0
        L_0x0012:
            if (r7 == 0) goto L_0x0097
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x0096 }
            r7.<init>()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r1 = "reactId"
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView> r2 = f77761c     // Catch:{ Exception -> 0x0096 }
            if (r2 == 0) goto L_0x002c
            java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x0096 }
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r2 = (com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r2     // Catch:{ Exception -> 0x0096 }
            if (r2 == 0) goto L_0x002c
            java.lang.String r2 = r2.getReactId()     // Catch:{ Exception -> 0x0096 }
            goto L_0x002d
        L_0x002c:
            r2 = r0
        L_0x002d:
            r7.put(r1, r2)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r1 = "awemeId"
            java.lang.String r2 = r5.getAid()     // Catch:{ Exception -> 0x0096 }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r1 = "star"
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r2 = r5.getStatistics()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r3 = "aweme.statistics"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ Exception -> 0x0096 }
            long r2 = r2.getDiggCount()     // Catch:{ Exception -> 0x0096 }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r1 = "comment"
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r2 = r5.getStatistics()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r3 = "aweme.statistics"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ Exception -> 0x0096 }
            long r2 = r2.getCommentCount()     // Catch:{ Exception -> 0x0096 }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r1 = "share"
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r5 = r5.getStatistics()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r2 = "aweme.statistics"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r2)     // Catch:{ Exception -> 0x0096 }
            long r2 = r5.getShareCount()     // Catch:{ Exception -> 0x0096 }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r5 = "from"
            r7.put(r5, r6)     // Catch:{ Exception -> 0x0096 }
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView> r5 = f77761c     // Catch:{ Exception -> 0x0096 }
            if (r5 == 0) goto L_0x0097
            java.lang.Object r5 = r5.get()     // Catch:{ Exception -> 0x0096 }
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r5 = (com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r5     // Catch:{ Exception -> 0x0096 }
            if (r5 == 0) goto L_0x0097
            java.lang.String r1 = f77764f     // Catch:{ Exception -> 0x0096 }
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView> r2 = f77761c     // Catch:{ Exception -> 0x0096 }
            if (r2 == 0) goto L_0x0092
            java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x0096 }
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r2 = (com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r2     // Catch:{ Exception -> 0x0096 }
            if (r2 == 0) goto L_0x0092
            java.lang.String r0 = r2.getReactId()     // Catch:{ Exception -> 0x0096 }
        L_0x0092:
            r5.mo55678a(r1, r7, r0)     // Catch:{ Exception -> 0x0096 }
            goto L_0x0097
        L_0x0096:
        L_0x0097:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.String r5 = "exit"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.equals(r6, r5)
            if (r5 == 0) goto L_0x00aa
            com.ss.android.ugc.aweme.ap r5 = com.p683ss.android.ugc.aweme.C23794bh.m58383I()
            r5.releaseSearchBaseModelHolder()
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.favorites.viewholder.C29767c.mo60017a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String):void");
    }
}
