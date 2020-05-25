package com.p683ss.android.ugc.aweme.emoji.p1684d;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.p2629a.C52568f;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.emoji.d.d */
public final class C29307d {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f76694a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29307d.class), "mDefaultEmojiList", "getMDefaultEmojiList()Ljava/util/List;"))};

    /* renamed from: b */
    public static final AtomicBoolean f76695b = new AtomicBoolean(false);

    /* renamed from: c */
    public static final C29307d f76696c = new C29307d();

    /* renamed from: d */
    private static String f76697d;

    /* renamed from: e */
    private static final C17971f f76698e = new C17971f();

    /* renamed from: f */
    private static final Type f76699f = new C29308a().f49843c;

    /* renamed from: g */
    private static final C52668f f76700g = C52732g.m112286a(C52757k.NONE, C29309b.f76702a);

    /* renamed from: h */
    private static LinkedList<String> f76701h;

    /* renamed from: com.ss.android.ugc.aweme.emoji.d.d$a */
    public static final class C29308a extends C17956a<LinkedList<String>> {
        C29308a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.d.d$b */
    static final class C29309b extends C52712l implements C52670a<List<? extends String>> {

        /* renamed from: a */
        public static final C29309b f76702a = new C29309b();

        C29309b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            String[] stringArray = C11010c.m22280a().getResources().getStringArray(R.array.z);
            C52711k.m112236a((Object) stringArray, "AppContextManager.getApp…ay.mini_emoji_panel_list)");
            return C52568f.m112084e(stringArray);
        }
    }

    private C29307d() {
    }

    /* renamed from: a */
    public final List<String> mo59253a() {
        return (List) f76700g.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if ((!p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r0, (java.lang.Object) r2.getCurUserId())) != false) goto L_0x0026;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedList<java.lang.String> mo59255b() {
        /*
            r5 = this;
            java.util.LinkedList<java.lang.String> r0 = f76701h
            r1 = 1
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = f76697d
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = f76697d
            if (r0 != 0) goto L_0x0012
            java.lang.String r2 = "mUserId"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0012:
            com.ss.android.ugc.aweme.IAccountUserService r2 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r3 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.lang.String r2 = r2.getCurUserId()
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x008a
        L_0x0026:
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r2 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.lang.String r0 = r0.getCurUserId()
            java.lang.String r2 = "AccountProxyService.userService().curUserId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            f76697d = r0
            com.ss.android.ugc.aweme.app.bf r0 = new com.ss.android.ugc.aweme.app.bf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mini_emoji_panel_list_string"
            r2.<init>(r3)
            java.lang.String r3 = f76697d
            if (r3 != 0) goto L_0x004c
            java.lang.String r4 = "mUserId"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x004c:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = ""
            r0.<init>(r2, r3)
            java.lang.Object r0 = r0.mo47782d()
            java.lang.String r0 = (java.lang.String) r0
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x0083 }
            if (r2 == 0) goto L_0x006b
            int r2 = r2.length()     // Catch:{ Exception -> 0x0083 }
            if (r2 != 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r1 = 0
        L_0x006b:
            if (r1 == 0) goto L_0x0073
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ Exception -> 0x0083 }
            r0.<init>()     // Catch:{ Exception -> 0x0083 }
            goto L_0x0088
        L_0x0073:
            com.google.gson.f r1 = f76698e     // Catch:{ Exception -> 0x0083 }
            java.lang.reflect.Type r2 = f76699f     // Catch:{ Exception -> 0x0083 }
            java.lang.Object r0 = r1.mo34885a(r0, r2)     // Catch:{ Exception -> 0x0083 }
            java.lang.String r1 = "mGson.fromJson(string, mDataType)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)     // Catch:{ Exception -> 0x0083 }
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch:{ Exception -> 0x0083 }
            goto L_0x0088
        L_0x0083:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
        L_0x0088:
            f76701h = r0
        L_0x008a:
            java.util.LinkedList<java.lang.String> r0 = f76701h
            if (r0 != 0) goto L_0x0093
            java.lang.String r1 = "mCurrentUserData"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0093:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.emoji.p1684d.C29307d.mo59255b():java.util.LinkedList");
    }

    /* renamed from: a */
    public final List<String> mo59254a(int i) {
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (!g.isLogin()) {
            return mo59253a();
        }
        if (mo59255b().size() >= i) {
            return C52575l.m112129b((Iterable<? extends T>) mo59255b(), i);
        }
        ArrayList arrayList = new ArrayList(mo59255b());
        int i2 = 0;
        while (arrayList.size() < i && i2 < i && i2 < mo59253a().size()) {
            String str = (String) mo59253a().get(i2);
            if (arrayList.contains(str)) {
                i2++;
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
