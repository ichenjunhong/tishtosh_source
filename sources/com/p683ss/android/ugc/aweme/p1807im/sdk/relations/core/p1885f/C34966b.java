package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1885f;

import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1884e.C34958a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.p2629a.C52575l;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.f.b */
public final class C34966b extends C34965a<C11180b> {

    /* renamed from: b */
    public static final C34967a f89979b = new C34967a(null);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.f.b$a */
    public static final class C34967a {
        private C34967a() {
        }

        public /* synthetic */ C34967a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C34966b m79100a(C34958a aVar) {
            C52711k.m112240b(aVar, "parameters");
            return new C34966b(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.f.b$b */
    static final class C34968b<T> implements Comparator<C11180b> {

        /* renamed from: a */
        final /* synthetic */ Map f89980a;

        /* renamed from: b */
        final /* synthetic */ Map f89981b;

        C34968b(Map map, Map map2) {
            this.f89980a = map;
            this.f89981b = map2;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            C11180b bVar = (C11180b) obj;
            C11180b bVar2 = (C11180b) obj2;
            Integer num = (Integer) this.f89980a.get(bVar);
            Integer num2 = (Integer) this.f89980a.get(bVar2);
            if (!C52711k.m112239a((Object) num, (Object) num2)) {
                return C52594a.m112153a(num2, num);
            }
            return C52594a.m112153a((Long) this.f89981b.get(bVar2), (Long) this.f89981b.get(bVar));
        }
    }

    public C34966b(C34958a aVar) {
        C52711k.m112240b(aVar, "parameters");
        super(aVar);
    }

    /* renamed from: a */
    private static long m79094a(C11180b bVar) {
        long j;
        C11207p lastMessage = bVar.getLastMessage();
        if (lastMessage != null) {
            j = lastMessage.getCreatedAt();
        } else {
            j = 0;
        }
        if (bVar.isStickTop()) {
            return Math.max(j, bVar.getUpdatedTime());
        }
        return j;
    }

    /* renamed from: b */
    private final int m79095b(C11180b bVar) {
        switch (C33229c.f86227e.mo70569b()) {
            case 1:
                return m79096c(bVar);
            case 2:
                return m79097d(bVar);
            default:
                if (bVar.isStickTop()) {
                    return 50;
                }
                return 0;
        }
    }

    /* renamed from: d */
    private static int m79097d(C11180b bVar) {
        if (bVar.isStickTop()) {
            return 50;
        }
        if (bVar.isSingleChat()) {
            C11207p lastMessage = bVar.getLastMessage();
            if (lastMessage == null || lastMessage.getMsgType() != 15) {
                return 49;
            }
            return 46;
        } else if (bVar.isGroupChat()) {
            return 49;
        } else {
            return 0;
        }
    }

    /* renamed from: e */
    private static IMUser m79098e(C11180b bVar) {
        if (!bVar.isSingleChat()) {
            return null;
        }
        long a = C11190e.m22685a(bVar.getConversationId());
        if (a <= 0) {
            return null;
        }
        return C34010e.m77748a().mo71964b(String.valueOf(a));
    }

    /* renamed from: c */
    private final int m79096c(C11180b bVar) {
        if (bVar.isStickTop()) {
            return 50;
        }
        if (bVar.isSingleChat()) {
            IMUser e = m79098e(bVar);
            if (e == null) {
                return 0;
            }
            if (e.getFollowStatus() == 2) {
                C11207p lastMessage = bVar.getLastMessage();
                if (lastMessage == null || lastMessage.getMsgType() != 15) {
                    return 49;
                }
                return 46;
            } else if (e.getFollowStatus() == 1) {
                return 47;
            }
        } else if (bVar.isGroupChat()) {
            return 49;
        }
        return 0;
    }

    /* renamed from: a */
    public final List<C11180b> mo73062a(List<? extends C11180b> list) {
        C52711k.m112240b(list, "list");
        Map linkedHashMap = new LinkedHashMap();
        Map linkedHashMap2 = new LinkedHashMap();
        Iterable<C11180b> iterable = list;
        for (C11180b bVar : iterable) {
            linkedHashMap.put(bVar, Long.valueOf(m79094a(bVar)));
            linkedHashMap2.put(bVar, Integer.valueOf(m79095b(bVar)));
        }
        return C52575l.m112122a(iterable, (Comparator<? super T>) new C34968b<Object>(linkedHashMap2, linkedHashMap));
    }
}
