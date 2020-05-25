package com.p683ss.android.ugc.aweme.utils.p2389c;

import android.content.SharedPreferences.Editor;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.experiment.GeckoChannelStoreExperiment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.utils.c.b */
public final class C47745b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f120259a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C47745b.class), "KEVA_REPO", "getKEVA_REPO()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: b */
    public static final C47745b f120260b = new C47745b();

    /* renamed from: c */
    private static final C52668f f120261c = C52732g.m112286a(C52757k.NONE, C47746a.f120262a);

    /* renamed from: com.ss.android.ugc.aweme.utils.c.b$a */
    static final class C47746a extends C52712l implements C52670a<Keva> {

        /* renamed from: a */
        public static final C47746a f120262a = new C47746a();

        C47746a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Keva.getRepoSync("repo_gecko_channel_list", 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.c.b$b */
    public static final class C47747b extends C52712l implements C52671b<List<? extends String>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ Editor f120263a;

        public C47747b(Editor editor) {
            this.f120263a = editor;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            C52711k.m112240b(list, "it");
            SharePrefCache inst = SharePrefCache.inst();
            C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
            inst.getGeckoInitialHighPriorityChannels().mo47779b(this.f120263a, new HashSet(list));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.c.b$c */
    public static final class C47748c extends C52712l implements C52671b<String[], C52860x> {
        public static final C47748c INSTANCE = new C47748c();

        C47748c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String[] strArr = (String[]) obj;
            C52711k.m112240b(strArr, "it");
            C47745b.f120260b.mo95025a().storeStringArray("high_pri_channels", strArr);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.c.b$d */
    public static final class C47749d extends C52712l implements C52671b<List<? extends String>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ Editor f120264a;

        public C47749d(Editor editor) {
            this.f120264a = editor;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            C52711k.m112240b(list, "it");
            SharePrefCache inst = SharePrefCache.inst();
            C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
            inst.getGeckoChannels().mo47779b(this.f120264a, new HashSet(list));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.c.b$e */
    public static final class C47750e extends C52712l implements C52671b<String[], C52860x> {
        public static final C47750e INSTANCE = new C47750e();

        C47750e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String[] strArr = (String[]) obj;
            C52711k.m112240b(strArr, "it");
            C47745b.f120260b.mo95025a().storeStringArray("normal_channels", strArr);
            return C52860x.f131107a;
        }
    }

    private C47745b() {
    }

    /* renamed from: a */
    public final Keva mo95025a() {
        return (Keva) f120261c.getValue();
    }

    /* renamed from: a */
    public static void m103373a(List<String> list, C52671b<? super List<String>, C52860x> bVar, C52671b<? super String[], C52860x> bVar2) {
        boolean z;
        if (list == null) {
            list = new ArrayList<>();
        }
        bVar.invoke(list);
        if (!C10181b.m20511a().mo18172a(GeckoChannelStoreExperiment.class, true, "gecko_channel_store", 31744, false) || !(list instanceof ArrayList)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            list = null;
        }
        if (list != null) {
            if (list != null) {
                ArrayList arrayList = (ArrayList) list;
                if (arrayList != null) {
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array != null) {
                        bVar2.invoke(array);
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.String> /* = java.util.ArrayList<kotlin.String> */");
            }
        }
    }
}
