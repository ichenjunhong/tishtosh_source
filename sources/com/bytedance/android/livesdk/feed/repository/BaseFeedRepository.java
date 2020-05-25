package com.bytedance.android.livesdk.feed.repository;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.feed.C2974a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.p222a.C3810b;
import com.bytedance.android.live.core.paging.C3945b;
import com.bytedance.android.livesdk.feed.C6804a;
import com.bytedance.android.livesdk.feed.C6804a.C6805a;
import com.bytedance.android.livesdk.feed.C6957i;
import com.bytedance.android.livesdk.feed.C7025n;
import com.bytedance.android.livesdk.feed.C7106t;
import com.bytedance.android.livesdk.feed.ItemRepository;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdkapi.C8830k;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p094l.C2180b;

public abstract class BaseFeedRepository implements ItemRepository<FeedItem>, C6804a {

    /* renamed from: a */
    final C1689b f19232a = new C1689b();

    /* renamed from: b */
    protected C7025n f19233b;

    /* renamed from: c */
    protected final C3810b<FeedDataKey, FeedItem> f19234c;

    /* renamed from: d */
    public C2180b<C7069a> f19235d = C2180b.m6534l();

    /* renamed from: e */
    public C2180b<C7069a> f19236e = C2180b.m6534l();

    /* renamed from: f */
    protected C3945b<FeedItem> f19237f;

    /* renamed from: g */
    private C6957i f19238g;

    /* renamed from: h */
    private C7106t f19239h;

    /* renamed from: com.bytedance.android.livesdk.feed.repository.BaseFeedRepository$a */
    public enum C7069a {
        START,
        SUCCESS,
        FAIL
    }

    /* renamed from: h */
    public abstract FeedDataKey mo13213h();

    /* renamed from: i */
    public C3945b<FeedItem> mo13214i() {
        return this.f19237f;
    }

    @C0200t(mo345a = C0177a.ON_CREATE)
    public void registerFeedRepository() {
        if (mo13213h() != null) {
            this.f19238g.mo13098a(mo13213h(), (ItemRepository) this);
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void unRegisterFeedRepository() {
        if (this.f19238g.mo13106b(mo13213h(), this)) {
            mo12984g();
            this.f19232a.mo6180a();
        }
    }

    /* renamed from: a */
    public final void mo13212a(C0184k kVar) {
        if (kVar != null) {
            kVar.getLifecycle().mo324a(this);
        }
    }

    /* renamed from: a */
    public final void mo12991a(C6805a aVar, String str) {
        this.f19239h = new C7106t();
        this.f19239h.mo13233a();
        if (aVar == C6805a.REFRESH) {
            this.f19235d.onNext(C7069a.START);
            if (this.f19233b != null) {
                mo13213h();
                TextUtils.equals(str, "enter_auto");
            }
        } else if (aVar == C6805a.LOAD_MORE) {
            this.f19236e.onNext(C7069a.START);
            if (this.f19239h != null) {
                this.f19239h.mo13233a();
            }
            if (this.f19233b != null) {
                mo13213h();
            }
        }
    }

    public BaseFeedRepository(C6957i iVar, C7025n nVar, C3810b<FeedDataKey, FeedItem> bVar) {
        this.f19238g = iVar;
        this.f19233b = nVar;
        this.f19234c = bVar;
    }

    /* renamed from: a */
    public final void mo12992a(C6805a aVar, String str, C2974a aVar2) {
        if (aVar == C6805a.REFRESH) {
            this.f19235d.onNext(C7069a.SUCCESS);
            if (this.f19233b != null) {
                mo13213h();
                TextUtils.equals(str, "enter_auto");
            }
            if (this.f19239h != null) {
                this.f19239h.mo13234a("refresh");
            }
        } else if (aVar == C6805a.LOAD_MORE) {
            this.f19236e.onNext(C7069a.SUCCESS);
            if (this.f19233b != null) {
                mo13213h();
            }
            if (this.f19239h != null) {
                this.f19239h.mo13234a("load_more");
            }
        }
    }

    /* renamed from: a */
    public final void mo12993a(C6805a aVar, String str, Throwable th) {
        if (aVar == C6805a.REFRESH) {
            this.f19235d.onNext(C7069a.FAIL);
            if (this.f19233b != null) {
                mo13213h();
                TextUtils.equals(str, "enter_auto");
            }
            if (this.f19239h != null && C7072a.m14738a(C8830k.m17329c())) {
                this.f19239h.mo13235a("refresh", th);
            }
        } else if (aVar == C6805a.LOAD_MORE) {
            this.f19236e.onNext(C7069a.FAIL);
            if (this.f19233b != null) {
                mo13213h();
            }
            if (this.f19239h != null && C7072a.m14738a(C8830k.m17329c())) {
                this.f19239h.mo13235a("load_more", th);
            }
        }
    }
}
