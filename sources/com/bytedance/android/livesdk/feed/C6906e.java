package com.bytedance.android.livesdk.feed;

import com.bytedance.android.live.base.model.feed.C2974a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.p222a.C3810b;
import com.bytedance.android.live.core.p230g.C3919w;
import com.bytedance.android.livesdk.feed.C6957i.C6958a;
import com.bytedance.android.livesdk.feed.feed.C6944e;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.common.utility.C9414h;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p064c.p065a.p094l.C2178a;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.bytedance.android.livesdk.feed.e */
public final class C6906e implements C6957i {

    /* renamed from: a */
    Map<FeedDataKey, C6908a> f18901a = new ConcurrentHashMap();

    /* renamed from: b */
    C2178a<Boolean> f18902b = C2178a.m6524a(Boolean.valueOf(false));

    /* renamed from: c */
    C2180b<FeedDataKey> f18903c = C2180b.m6534l();

    /* renamed from: d */
    C2180b<Boolean> f18904d = C2180b.m6534l();

    /* renamed from: e */
    private C3810b<FeedDataKey, FeedItem> f18905e;

    /* renamed from: f */
    private List<C6944e> f18906f = new LinkedList();

    /* renamed from: g */
    private List<C6958a> f18907g = new C3919w();

    /* renamed from: h */
    private boolean f18908h;

    /* renamed from: com.bytedance.android.livesdk.feed.e$a */
    static class C6908a {

        /* renamed from: a */
        public ItemRepository f18909a;

        /* renamed from: b */
        public int f18910b;

        private C6908a(ItemRepository itemRepository) {
            this.f18909a = itemRepository;
        }
    }

    /* renamed from: a */
    public final void mo13097a() {
        if (!this.f18908h) {
            this.f18908h = true;
            this.f18902b.onNext(Boolean.valueOf(true));
        }
    }

    /* renamed from: a */
    public final void mo13100a(C6944e eVar) {
        this.f18906f.add(eVar);
    }

    /* renamed from: b */
    public final void mo13104b(C6944e eVar) {
        this.f18906f.remove(eVar);
    }

    /* renamed from: a */
    public final ItemRepository mo13096a(FeedDataKey feedDataKey) {
        C6908a aVar = (C6908a) this.f18901a.get(feedDataKey);
        if (aVar != null) {
            return aVar.f18909a;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo13105b(C6958a aVar) {
        this.f18907g.remove(aVar);
    }

    public C6906e(C3810b<FeedDataKey, FeedItem> bVar) {
        this.f18905e = bVar;
    }

    /* renamed from: a */
    public final void mo13101a(C6958a aVar) {
        this.f18907g.add(aVar);
    }

    /* renamed from: b */
    public final FeedItem mo13103b(FeedDataKey feedDataKey, String str) {
        C6908a aVar = (C6908a) this.f18901a.get(feedDataKey);
        if (aVar != null) {
            return aVar.f18909a.mo12982c(str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo13098a(FeedDataKey feedDataKey, ItemRepository itemRepository) {
        if (feedDataKey != null && itemRepository != null) {
            C6908a aVar = (C6908a) this.f18901a.get(feedDataKey);
            if (aVar == null) {
                aVar = new C6908a(itemRepository);
                this.f18901a.put(feedDataKey, aVar);
                this.f18903c.onNext(feedDataKey);
            }
            if (aVar.f18909a != itemRepository) {
                aVar.f18909a = itemRepository;
            }
            aVar.f18910b++;
        }
    }

    /* renamed from: b */
    public final boolean mo13106b(FeedDataKey feedDataKey, ItemRepository itemRepository) {
        if (feedDataKey == null || itemRepository == null) {
            return false;
        }
        C6908a aVar = (C6908a) this.f18901a.get(feedDataKey);
        if (aVar != null) {
            aVar.f18910b--;
            if (aVar.f18910b <= 0) {
                this.f18901a.remove(feedDataKey);
            }
        }
        if (aVar == null || aVar.f18910b == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo13099a(FeedDataKey feedDataKey, String str) {
        C6908a aVar = (C6908a) this.f18901a.get(feedDataKey);
        if (aVar != null) {
            aVar.f18909a.mo12981b(str);
        }
        for (C6958a aVar2 : this.f18907g) {
            if (aVar2 != null) {
                aVar2.mo13148a(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo13102a(String str, List<FeedItem> list, C2974a aVar, boolean z) {
        if (C9414h.m18631b(this.f18906f)) {
            for (C6944e a : this.f18906f) {
                a.mo13131a(str, list, aVar, z);
            }
        }
    }
}
