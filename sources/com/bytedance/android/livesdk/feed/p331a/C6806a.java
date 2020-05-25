package com.bytedance.android.livesdk.feed.p331a;

import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.p038f.C0794k;
import android.support.p043v7.p051e.C1208c.C1212c;
import android.support.p043v7.widget.RecyclerView.C1352v;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.p230g.C3868af;
import com.bytedance.android.live.core.p235h.C3924b;
import com.bytedance.android.live.core.paging.p236a.C3944j;
import com.bytedance.android.live.core.performance.C3974b;
import com.bytedance.android.live.core.performance.C3982g;
import com.bytedance.android.live.core.performance.C3982g.C3983a;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.livesdk.feed.C6828b;
import com.bytedance.android.livesdk.feed.C6957i;
import com.bytedance.android.livesdk.feed.ItemRepository;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.setting.LiveFeedSettings;
import com.bytedance.common.utility.C9414h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.bytedance.android.livesdk.feed.a.a */
public abstract class C6806a extends C3944j<FeedItem> {

    /* renamed from: A */
    private C6957i f18658A;

    /* renamed from: n */
    public Handler f18659n;

    /* renamed from: o */
    public FeedDataKey f18660o;

    /* renamed from: p */
    public Map<String, Long> f18661p;

    /* renamed from: q */
    Map<String, Long> f18662q;

    /* renamed from: r */
    public Map<String, Long> f18663r;

    /* renamed from: s */
    public C2180b<C0794k<FeedItem, Long>> f18664s;

    /* renamed from: t */
    public C2180b<FeedItem> f18665t;

    /* renamed from: u */
    public C2180b<Object> f18666u;

    /* renamed from: v */
    public C2180b<Object> f18667v;

    /* renamed from: w */
    public C2180b<Boolean> f18668w;

    /* renamed from: x */
    public C2180b<Object> f18669x;

    /* renamed from: y */
    public boolean f18670y;

    /* renamed from: z */
    public boolean f18671z;

    /* renamed from: com.bytedance.android.livesdk.feed.a.a$a */
    static class C6808a extends C1212c<FeedItem> {
        private C6808a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo3932a(Object obj, Object obj2) {
            FeedItem feedItem = (FeedItem) obj;
            if (feedItem.type == ((FeedItem) obj2).type && feedItem.type == 1003) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ boolean mo3933b(Object obj, Object obj2) {
            FeedItem feedItem = (FeedItem) obj;
            if (feedItem.type == ((FeedItem) obj2).type && feedItem.type == 1003) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo12996c(int i) {
        return -8888;
    }

    /* renamed from: c */
    public final void mo12997c() {
        mo12994a(this.f18661p, false);
    }

    /* renamed from: d */
    public final List<FeedItem> mo12999d() {
        return this.f18658A.mo13096a(this.f18660o).mo12983f();
    }

    /* renamed from: b */
    public final void mo12995b() {
        this.f18659n.removeCallbacksAndMessages(null);
        if (C6828b.f18712a && ((Boolean) LiveFeedSettings.I18N_ZHIBOZHONG_ANIMATION_TAG.mo9431a()).booleanValue()) {
            this.f18669x.onNext(C4064k.f11214a);
        }
    }

    /* renamed from: d */
    public final FeedItem mo12998d(int i) {
        ItemRepository a = this.f18658A.mo13096a(this.f18660o);
        if (a != null && !C9414h.m18630a(a.mo12983f()) && i >= 0 && i < a.mo12983f().size() && ((FeedItem) mo12999d().get(i)).item != null) {
            return a.mo12982c(((FeedItem) mo12999d().get(i)).item.getMixId());
        }
        return null;
    }

    public void onViewAttachedToWindow(C1352v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (!this.f18670y) {
            int b = mo9319b(vVar.getAdapterPosition());
            if (b >= 0 && b < mo9319b(getItemCount())) {
                FeedItem feedItem = (FeedItem) mo144a(b);
                if (!(feedItem == null || feedItem.item == null)) {
                    String mixId = feedItem.item.getMixId();
                    if (!this.f18671z) {
                        if (this.f18663r == null) {
                            this.f18663r = new HashMap();
                        }
                        this.f18663r.put(mixId, Long.valueOf(-1));
                    } else if (this.f18661p.get(mixId) == null) {
                        this.f18661p.put(mixId, Long.valueOf(C3868af.m9802a()));
                    }
                }
            }
            C3982g.m10085a(C3983a.LiveFeedInit, C3982g.m10083a("viewholder", vVar.getClass().toString()));
            C3974b.m10061a().mo9374a(C3983a.LiveFeedInit.name());
        }
    }

    public void onViewDetachedFromWindow(C1352v vVar) {
        super.onViewDetachedFromWindow(vVar);
        int b = mo9319b(vVar.getAdapterPosition());
        if (b >= 0 && b < mo9319b(getItemCount())) {
            FeedItem feedItem = (FeedItem) mo144a(b);
            if (feedItem != null && feedItem.item != null) {
                String mixId = feedItem.item.getMixId();
                if (this.f18661p.get(mixId) != null) {
                    long longValue = ((Long) this.f18661p.get(mixId)).longValue();
                    Long l = (Long) this.f18662q.get(mixId);
                    if (l == null) {
                        l = Long.valueOf(0);
                    }
                    this.f18662q.put(mixId, Long.valueOf(l.longValue() + (C3868af.m9802a() - longValue)));
                    this.f18661p.remove(mixId);
                }
            }
        }
    }

    public C6806a(Map<Integer, C3924b> map, C6957i iVar) {
        this(new C6808a(), map, iVar);
    }

    /* renamed from: a */
    public final /* synthetic */ int mo9308a(int i, Object obj) {
        FeedItem feedItem = (FeedItem) obj;
        if (feedItem == null) {
            return -8888;
        }
        return mo12996c(feedItem.type);
    }

    /* renamed from: a */
    private void m14316a(String str, long j) {
        if (j > 0 && j >= 50) {
            FeedItem b = this.f18658A.mo13103b(this.f18660o, str);
            if (b != null) {
                this.f18664s.onNext(new C0794k(b, Long.valueOf(j)));
            }
        }
    }

    /* renamed from: a */
    public void mo12994a(Map<String, Long> map, boolean z) {
        if (map != null && map.size() != 0) {
            for (Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                long longValue = ((Long) entry.getValue()).longValue();
                if (!z && longValue > 0) {
                    longValue = C3868af.m9802a() - longValue;
                }
                m14316a(str, longValue);
            }
            map.clear();
        }
    }

    private C6806a(C1212c<FeedItem> cVar, Map<Integer, C3924b> map, C6957i iVar) {
        super(cVar, map);
        this.f18659n = new Handler(Looper.getMainLooper());
        this.f18664s = C2180b.m6534l();
        this.f18665t = C2180b.m6534l();
        this.f18666u = C2180b.m6534l();
        this.f18667v = C2180b.m6534l();
        this.f18668w = C2180b.m6534l();
        this.f18669x = C2180b.m6534l();
        this.f18671z = true;
        this.f18658A = iVar;
        this.f18661p = new HashMap();
        this.f18662q = new HashMap();
        this.f18665t.mo6505a((C1710e<? super T>) new C6809b<Object>(this), C6810c.f18673a);
    }
}
