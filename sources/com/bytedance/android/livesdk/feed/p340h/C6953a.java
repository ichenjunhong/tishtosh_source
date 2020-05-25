package com.bytedance.android.livesdk.feed.p340h;

import android.arch.lifecycle.C0199s;
import android.arch.p010b.C0082h;
import android.arch.p010b.C0082h.C0087c;
import android.os.Bundle;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.paging.C3945b;
import com.bytedance.android.livesdk.feed.C6957i;
import com.bytedance.android.livesdk.feed.feed.C6941b;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p450h.C8750a;
import com.bytedance.android.livesdkapi.p450h.C8758h;
import com.bytedance.android.livesdkapi.p450h.C8760j;
import com.bytedance.common.utility.C9414h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.feed.h.a */
public final class C6953a extends C8758h implements C8760j {

    /* renamed from: a */
    C0082h<FeedItem> f19027a = null;

    /* renamed from: b */
    final C0087c f19028b = new C0087c() {
        /* renamed from: a */
        private void m14555a() {
            C6953a.this.mo13147i_();
            C6953a.this.mo15419f();
        }

        /* renamed from: a */
        public final void mo83a(int i, int i2) {
            m14555a();
        }

        /* renamed from: b */
        public final void mo84b(int i, int i2) {
            m14555a();
        }
    };

    /* renamed from: c */
    private final FeedRepository f19029c;

    /* renamed from: d */
    private final List<Bundle> f19030d = new ArrayList();

    /* renamed from: e */
    private final List<Room> f19031e = new ArrayList();

    /* renamed from: f */
    private final C0199s<C0082h<FeedItem>> f19032f = new C6955b(this);

    /* renamed from: d */
    public final List<Room> mo13146d() {
        return this.f19031e;
    }

    /* renamed from: b */
    public final int mo13141b() {
        return this.f19030d.size();
    }

    /* renamed from: c */
    public final void mo13144c() {
        if (!(this.f19029c == null || this.f19029c.mo13214i() == null)) {
            this.f19029c.mo13214i().mo9295a().removeObserver(this.f19032f);
        }
        if (this.f19027a != null) {
            this.f19027a.mo122a(this.f19028b);
            this.f19027a = null;
        }
        this.f19030d.clear();
        this.f19031e.clear();
    }

    /* renamed from: i_ */
    public final void mo13147i_() {
        this.f19030d.clear();
        this.f19031e.clear();
        if (this.f19029c != null && !C9414h.m18630a(this.f19029c.mo12983f())) {
            for (FeedItem feedItem : this.f19029c.mo12983f()) {
                if (feedItem.item instanceof Room) {
                    this.f19030d.add(C8750a.m17218a((Room) feedItem.item));
                    this.f19031e.add((Room) feedItem.item);
                }
            }
        }
    }

    /* renamed from: a */
    public final Bundle mo13138a(int i) {
        return (Bundle) this.f19030d.get(i);
    }

    /* renamed from: a */
    public final void mo13140a(long j) {
        if (this.f19029c != null) {
            this.f19029c.mo12981b(String.valueOf(j));
        }
    }

    /* renamed from: a */
    public final int mo13137a(Bundle bundle) {
        long j = bundle.getLong("live.intent.extra.ROOM_ID", -1);
        for (int i = 0; i < this.f19030d.size(); i++) {
            if (((Bundle) this.f19030d.get(i)).getLong("live.intent.extra.ROOM_ID", 0) == j) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo13142b(long j) {
        for (int i = 0; i < this.f19030d.size(); i++) {
            if (((Bundle) this.f19030d.get(i)).getLong("live.intent.extra.ROOM_ID") == j) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo13143b(int i) {
        int i2;
        if (this.f19029c != null) {
            C3945b i3 = this.f19029c.mo13214i();
            if (i3 != null) {
                Boolean bool = (Boolean) i3.mo9300d().getValue();
                if (bool != null && bool.booleanValue()) {
                    this.f19029c.mo12972a(null, "detail_loadmore");
                    if (!(this.f19029c.mo13214i() == null || this.f19029c.mo13214i().mo9295a().getValue() == null || ((C0082h) this.f19029c.mo13214i().mo9295a().getValue()).isEmpty())) {
                        C0082h hVar = (C0082h) this.f19029c.mo13214i().mo9295a().getValue();
                        if (this.f19027a == null || this.f19027a.size() <= 0) {
                            i2 = i + 6;
                        } else {
                            i2 = this.f19027a.size();
                        }
                        hVar.mo129d(i2);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo13145c(long j) {
        if (this.f19029c != null) {
            FeedItem c = this.f19029c.mo12982c(String.valueOf(j));
            if (c != null) {
                int indexOf = this.f19029c.mo12983f().indexOf(c);
                if (!(indexOf < 0 || this.f19029c.mo13218j() == null || this.f19029c.mo13218j().f18995b == null)) {
                    ((C6941b) this.f19029c.mo13218j().f18995b).f18996a.setValue(Integer.valueOf(indexOf));
                }
            }
        }
    }

    public C6953a(FeedDataKey feedDataKey, C6957i iVar) {
        this.f19029c = (FeedRepository) iVar.mo13096a(feedDataKey);
        mo13147i_();
        if (this.f19029c != null && this.f19029c.mo13214i() != null) {
            this.f19029c.mo13214i().mo9295a().observeForever(this.f19032f);
        }
    }

    /* renamed from: a */
    public final void mo13139a(int i, FeedItem feedItem) {
        if (feedItem != null && i < this.f19030d.size() && i >= 0) {
            FeedItem c = this.f19029c.mo12982c(String.valueOf(mo13138a(i).getLong("live.intent.extra.ROOM_ID")));
            if (c != null) {
                int a = this.f19029c.mo13214i().mo9294a(c);
                c.banners = feedItem.banners;
                c.setRoomFrom(feedItem);
                c.item = feedItem.item;
                c.logPb = feedItem.logPb;
                c.object = feedItem.object;
                c.orderType = feedItem.orderType;
                c.repeatDisable = feedItem.repeatDisable;
                c.resId = feedItem.resId;
                c.searchId = feedItem.searchId;
                c.tags = feedItem.tags;
                c.searchReqId = feedItem.searchReqId;
                c.type = feedItem.type;
                this.f19029c.mo13214i().mo9296a(a);
            }
        }
    }
}
