package com.bytedance.android.livesdk.gift;

import com.bytedance.android.live.gift.C4128f;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.livesdk.gift.d */
public final class C7226d {

    /* renamed from: a */
    public ConcurrentHashMap<Long, Integer> f19616a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public ConcurrentHashMap<Long, List<C7220c>> f19617b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public boolean f19618c;

    /* renamed from: d */
    private boolean f19619d;

    /* renamed from: e */
    private C4128f f19620e = new C4128f() {
        /* renamed from: a */
        public final void mo9498a() {
            super.mo9498a();
            C7226d.this.f19618c = false;
        }

        /* renamed from: b */
        public final void mo8457b(List<GiftPage> list) {
            C7226d.this.f19618c = false;
            C7226d.this.mo13459a();
        }

        /* renamed from: a */
        public final void mo8456a(List<C7505d> list) {
            C7226d.this.f19618c = false;
            C7226d.this.mo13459a();
        }
    };

    /* renamed from: com.bytedance.android.livesdk.gift.d$a */
    public interface C7228a {
        /* renamed from: a */
        void mo13460a(long j);

        /* renamed from: a */
        void mo13461a(C7505d dVar);
    }

    /* renamed from: a */
    public final void mo13459a() {
        if (!this.f19618c) {
            for (Entry entry : this.f19616a.entrySet()) {
                if (((Integer) entry.getValue()).intValue() >= 3) {
                    for (C7220c cVar : (List) this.f19617b.get(Long.valueOf(((Long) entry.getKey()).longValue()))) {
                        C7505d findGiftById = GiftManager.inst().findGiftById(cVar.f19600a);
                        if (findGiftById == null) {
                            cVar.f19602c.mo13460a(cVar.f19600a);
                        } else {
                            cVar.f19602c.mo13461a(findGiftById);
                        }
                    }
                    this.f19617b.remove(entry.getKey());
                    this.f19616a.remove(entry.getKey());
                }
            }
            for (Entry value : this.f19617b.entrySet()) {
                Iterator it = ((List) value.getValue()).iterator();
                while (it.hasNext()) {
                    C7220c cVar2 = (C7220c) it.next();
                    C7505d findGiftById2 = GiftManager.inst().findGiftById(cVar2.f19600a);
                    if (findGiftById2 != null) {
                        cVar2.f19602c.mo13461a(findGiftById2);
                        it.remove();
                    }
                }
            }
            for (Entry entry2 : this.f19616a.entrySet()) {
                int intValue = ((Integer) entry2.getValue()).intValue();
                if (intValue < 3) {
                    long longValue = ((Long) entry2.getKey()).longValue();
                    entry2.setValue(Integer.valueOf(intValue + 1));
                    GiftManager.inst().syncGiftList(this.f19620e, longValue, 4, this.f19619d);
                    this.f19618c = true;
                    return;
                }
            }
        }
    }

    public C7226d(boolean z) {
        this.f19619d = z;
    }
}
