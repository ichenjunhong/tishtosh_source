package com.p683ss.android.ugc.aweme.share.improve.p2165e;

import com.p683ss.android.ugc.aweme.share.C41978ap;
import com.p683ss.android.ugc.aweme.share.improve.p2162b.C42136c;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42150c;
import com.p683ss.android.ugc.aweme.share.p2154e.C42006a;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42293t;
import com.p683ss.android.ugc.trill.share.data.C50448a;
import com.p683ss.android.ugc.trill.share.data.ShareDatabase;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52550ab;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.share.improve.e.a */
public final class C42167a implements Comparator<C42307b> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f106646a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C42167a.class), "shareDataBase", "getShareDataBase()Lcom/ss/android/ugc/trill/share/data/ShareDatabase;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C42167a.class), "sharePlatforms", "getSharePlatforms()Ljava/util/List;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C42167a.class), "channelTimes", "getChannelTimes()Ljava/util/Map;"))};

    /* renamed from: b */
    final C52668f f106647b = C52732g.m112285a(C42169b.f106653a);

    /* renamed from: c */
    public int f106648c = -1;

    /* renamed from: d */
    public final int f106649d;

    /* renamed from: e */
    private final C52668f f106650e = C52732g.m112285a(C42170c.f106654a);

    /* renamed from: f */
    private final C52668f f106651f = C52732g.m112285a(new C42168a(this));

    /* renamed from: com.ss.android.ugc.aweme.share.improve.e.a$a */
    static final class C42168a extends C52712l implements C52670a<Map<String, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ C42167a f106652a;

        C42168a(C42167a aVar) {
            this.f106652a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Map<String, Integer> invoke() {
            int i;
            try {
                HashMap hashMap = new HashMap();
                for (C41978ap apVar : this.f106652a.mo86150a()) {
                    Map map = hashMap;
                    C52711k.m112236a((Object) apVar, "platform");
                    String str = apVar.f106248a;
                    C52711k.m112236a((Object) str, "platform.platformId");
                    map.put(str, Integer.valueOf(0));
                }
                ShareDatabase shareDatabase = (ShareDatabase) this.f106652a.f106647b.getValue();
                if (shareDatabase == null) {
                    C52711k.m112234a();
                }
                List<C50448a> a = shareDatabase.mo98359g().mo98360a(Integer.valueOf(this.f106652a.f106649d));
                if (a.size() >= 10) {
                    this.f106652a.f106648c = ((C50448a) a.get(a.size() - 1)).f126500a;
                }
                for (C50448a aVar : a) {
                    C52711k.m112236a((Object) aVar, "record");
                    Integer num = (Integer) hashMap.get(aVar.f126502c);
                    Map map2 = hashMap;
                    String str2 = aVar.f126502c;
                    C52711k.m112236a((Object) str2, "record.channel");
                    if (num == null) {
                        i = 1;
                    } else {
                        i = num.intValue() + 1;
                    }
                    map2.put(str2, Integer.valueOf(i));
                }
                return hashMap;
            } catch (Exception unused) {
                return C52550ab.m112045a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.e.a$b */
    static final class C42169b extends C52712l implements C52670a<ShareDatabase> {

        /* renamed from: a */
        public static final C42169b f106653a = new C42169b();

        C42169b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ShareDatabase.m108764a(C42150c.m92517a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.e.a$c */
    static final class C42170c extends C52712l implements C52670a<List<C41978ap>> {

        /* renamed from: a */
        public static final C42170c f106654a = new C42170c();

        C42170c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C42006a a = C42006a.m91978a();
            C52711k.m112236a((Object) a, "I18nShareOrderUtil.getInstance()");
            List<C41978ap> list = a.f106326a;
            if (list == null) {
                return C52575l.m112097a();
            }
            return list;
        }
    }

    /* renamed from: b */
    private final Map<String, Integer> m92533b() {
        return (Map) this.f106651f.getValue();
    }

    /* renamed from: a */
    public final List<C41978ap> mo86150a() {
        return (List) this.f106650e.getValue();
    }

    public C42167a(int i) {
        this.f106649d = i;
    }

    /* renamed from: a */
    private final int m92532a(C42307b bVar) {
        for (C41978ap apVar : mo86150a()) {
            C52711k.m112236a((Object) apVar, "sharePlatform");
            if (C52711k.m112239a((Object) apVar.f106248a, (Object) bVar.mo86136b())) {
                return mo86150a().indexOf(apVar);
            }
        }
        return Integer.MAX_VALUE;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2;
        C42307b bVar = (C42307b) obj;
        C42307b bVar2 = (C42307b) obj2;
        C52711k.m112240b(bVar, "lhs");
        C52711k.m112240b(bVar2, "rhs");
        if (bVar instanceof C42293t) {
            return 1;
        }
        if ((bVar2 instanceof C42293t) || (bVar instanceof C42136c)) {
            return -1;
        }
        if (bVar2 instanceof C42136c) {
            return 1;
        }
        Integer num = (Integer) m92533b().get(bVar.mo86136b());
        if (num != null) {
            i = num.intValue();
        } else {
            Integer num2 = (Integer) m92533b().get(bVar2.mo86136b());
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = 0;
            }
            i = 0 - i2;
        }
        if (i != 0) {
            return -i;
        }
        return m92532a(bVar) - m92532a(bVar2);
    }
}
