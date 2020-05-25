package com.p683ss.android.ugc.aweme.feed;

import com.bytedance.jedi.arch.C11939z;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.experiment.UnloginDiggShowInProfileExperiment;
import java.util.ArrayList;
import java.util.Collection;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.feed.ak */
public final class C30134ak {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f78652a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C30134ak.class), "UPLOAD_ITEM_COUNT", "getUPLOAD_ITEM_COUNT()I"))};

    /* renamed from: b */
    public static final Keva f78653b;

    /* renamed from: c */
    public static final C30134ak f78654c = new C30134ak();

    /* renamed from: d */
    private static final C52668f f78655d = C52732g.m112285a(C30135a.f78657a);

    /* renamed from: e */
    private static final ArrayList<String> f78656e;

    /* renamed from: com.ss.android.ugc.aweme.feed.ak$a */
    static final class C30135a extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C30135a f78657a = new C30135a();

        C30135a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf((UnloginDiggShowInProfileExperiment.INSTANCE.mo59616b() * 2) + 4);
        }
    }

    private C30134ak() {
    }

    /* renamed from: a */
    public final int mo60383a() {
        return ((Number) f78655d.getValue()).intValue();
    }

    /* renamed from: d */
    public static int m70715d() {
        return f78653b.getInt("should_sync", 0);
    }

    /* renamed from: e */
    public static boolean m70716e() {
        return f78653b.getBoolean("is_new_user", false);
    }

    /* renamed from: b */
    public static String[] m70712b() {
        String[] stringArray = f78653b.getStringArray("aweme_date_pair", new String[0]);
        C52711k.m112236a((Object) stringArray, "keva.getStringArray(AWEME_DATE_PAIR, arrayOf())");
        return stringArray;
    }

    /* renamed from: c */
    public static void m70713c() {
        f78656e.clear();
        f78653b.erase("should_sync");
        f78653b.erase("aweme_date_pair");
        f78653b.erase("is_new_user");
    }

    static {
        Keva repo = Keva.getRepo("unlogin_digg_keva");
        C52711k.m112236a((Object) repo, "Keva.getRepo(REPO_NAME)");
        f78653b = repo;
        ArrayList<String> arrayList = new ArrayList<>();
        f78656e = arrayList;
        Collection collection = arrayList;
        String[] stringArray = f78653b.getStringArray("aweme_date_pair", new String[0]);
        C52711k.m112236a((Object) stringArray, "keva.getStringArray(AWEME_DATE_PAIR, arrayOf())");
        C52575l.m112109a(collection, (Object[]) stringArray);
    }

    /* renamed from: a */
    public static void m70711a(int i) {
        f78653b.storeInt("should_sync", i);
    }

    /* renamed from: c */
    private static void m70714c(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : f78656e) {
            C11939z a = C30136al.m70721a(str2);
            if (a == null || C52711k.m112239a((Object) (String) a.f31624a, (Object) str)) {
                arrayList.add(str2);
            }
        }
        f78656e.removeAll(arrayList);
    }

    /* renamed from: a */
    public final void mo60384a(String str) {
        if (str != null) {
            m70714c(str);
            Keva keva = f78653b;
            String str2 = "aweme_date_pair";
            Object[] array = f78656e.toArray(new String[0]);
            if (array != null) {
                keva.storeStringArray(str2, (String[]) array);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* renamed from: b */
    public final boolean mo60386b(String str) {
        C52711k.m112240b(str, "aweme");
        for (String a : m70712b()) {
            C11939z a2 = C30136al.m70721a(a);
            if (a2 != null && C52711k.m112239a((Object) (String) a2.f31624a, (Object) str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo60385a(String str, long j, int i) {
        if (str != null) {
            m70714c(str);
            ArrayList<String> arrayList = f78656e;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("&&");
            sb.append(j);
            sb.append("&&");
            sb.append(i);
            arrayList.add(0, sb.toString());
            Keva keva = f78653b;
            String str2 = "aweme_date_pair";
            Object[] array = f78656e.toArray(new String[0]);
            if (array != null) {
                keva.storeStringArray(str2, (String[]) array);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
