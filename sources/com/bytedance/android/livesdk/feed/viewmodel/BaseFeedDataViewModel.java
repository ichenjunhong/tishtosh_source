package com.bytedance.android.livesdk.feed.viewmodel;

import android.arch.lifecycle.C0198r;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.media.C2990d;
import com.bytedance.android.live.base.model.user.C3009i.C3010a;
import com.bytedance.android.live.core.paging.C3945b;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.livesdk.feed.C7005j;
import com.bytedance.android.livesdk.feed.IFeedRepository;
import com.bytedance.android.livesdk.feed.IFeedRepository.C6800a;
import com.bytedance.android.livesdk.feed.feed.C6940a;
import com.bytedance.android.livesdk.feed.feed.C6941b;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p339g.C6951a;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository.C7069a;
import com.bytedance.common.utility.C9431p;
import java.util.List;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;

public class BaseFeedDataViewModel extends PagingViewModel<FeedItem> {

    /* renamed from: A */
    protected String f19369A;

    /* renamed from: B */
    public FeedDataKey f19370B;

    /* renamed from: C */
    public C0198r<C3010a> f19371C = new C0198r<>();

    /* renamed from: D */
    private C6940a<C3945b<FeedItem>, C6941b> f19372D;

    /* renamed from: E */
    private C6941b f19373E;

    /* renamed from: F */
    private C6951a f19374F;

    /* renamed from: G */
    private long f19375G;

    /* renamed from: a */
    public IFeedRepository f19376a;

    /* renamed from: p */
    public C0198r<Integer> f19377p = new C0198r<>();

    /* renamed from: q */
    public C0198r<C2990d> f19378q = new C0198r<>();

    /* renamed from: r */
    public C0198r<Integer> f19379r = new C0198r<>();

    /* renamed from: s */
    public C0198r<Integer> f19380s = new C0198r<>();

    /* renamed from: t */
    public C0198r<List<ImageModel>> f19381t = new C0198r<>();

    /* renamed from: u */
    public C0198r<C7069a> f19382u = new C0198r<>();

    /* renamed from: v */
    public C0198r<C7069a> f19383v = new C0198r<>();

    /* renamed from: w */
    protected C3945b<FeedItem> f19384w;

    /* renamed from: x */
    protected String f19385x;

    /* renamed from: y */
    public int f19386y;

    /* renamed from: z */
    public int f19387z;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo13266e() {
        return this.f19385x;
    }

    /* renamed from: h */
    public boolean mo13269h() {
        return false;
    }

    /* renamed from: f */
    public final FeedDataKey mo13267f() {
        if (this.f19370B == null) {
            this.f19370B = mo13268g();
        }
        return this.f19370B;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public FeedDataKey mo13268g() {
        return FeedDataKey.m14536a(this.f19369A, mo13266e(), this.f19375G);
    }

    /* renamed from: b */
    public final boolean mo9356b() {
        boolean b = super.mo9356b();
        if (b) {
            this.f19377p.setValue(Integer.valueOf(0));
        }
        return b;
    }

    /* renamed from: d */
    public void mo13265d() {
        try {
            this.f19372D = this.f19376a.mo12969a(mo13266e());
            this.f19384w = (C3945b) this.f19372D.f18994a;
            this.f19373E = (C6941b) this.f19372D.f18995b;
            this.f19373E.f18996a.observeForever(new C7138a(this));
            this.f19373E.f18997b.observeForever(new C7139b(this));
            C3945b<FeedItem> bVar = this.f19384w;
            if (this.f11045h != null) {
                this.f11045h.mo9297b().removeObserver(this.f11046i);
                this.f11045h.mo9299c().removeObserver(this.f11047j);
                this.f11045h.mo9295a().removeObserver(this.f11048k);
                this.f11045h.mo9301e().removeObserver(this.f11049l);
                this.f11045h.mo9300d().removeObserver(this.f11050m);
                this.f11045h.mo9305i().removeObserver(this.f11051n);
            }
            this.f11045h = bVar;
            if (bVar != null) {
                this.f11045h.mo9297b().observeForever(this.f11046i);
                this.f11045h.mo9299c().observeForever(this.f11047j);
                this.f11045h.mo9295a().observeForever(this.f11048k);
                this.f11045h.mo9301e().observeForever(this.f11049l);
                this.f11045h.mo9300d().observeForever(this.f11050m);
                this.f11045h.mo9305i().observeForever(this.f11051n);
            }
            this.f19383v.observeForever(new C7140c(this));
            mo9390a(this.f19376a.mo12974b().mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C7141d<Object>(this), C7142e.f19419a));
            mo9390a(this.f19376a.mo12975c().mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C7143f<Object>(this), C7144g.f19421a));
            if (this.f19376a instanceof BaseFeedRepository) {
                mo9390a(((BaseFeedRepository) this.f19376a).f19235d.mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C7145h<Object>(this), C7146i.f19423a));
                mo9390a(((BaseFeedRepository) this.f19376a).f19236e.mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C7147j<Object>(this), C7148k.f19425a));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo13263a(String str) {
        this.f19376a.mo12972a(str, null);
        mo13264b(str);
        return mo9356b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo13264b(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "enter_auto") && !TextUtils.equals(str, "detail_loadmore") && this.f19374F.mo13136b()) {
            Integer num = (Integer) this.f19379r.getValue();
            if (num == null) {
                this.f19379r.setValue(Integer.valueOf(1));
            } else {
                this.f19379r.setValue(Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    /* renamed from: a */
    public final void mo13262a(String str, String str2) {
        if (!C9431p.m18664a(str)) {
            this.f19385x = str;
        }
        if (!C9431p.m18664a(str2)) {
            this.f19369A = str2;
        }
    }

    public BaseFeedDataViewModel(IFeedRepository iFeedRepository, C7005j jVar, C6951a aVar) {
        this.f19376a = iFeedRepository;
        if (jVar != null) {
            this.f19385x = jVar.mo13078a();
            this.f19386y = 10;
            this.f19387z = jVar.mo13086d();
            this.f19369A = jVar.mo13084b();
            this.f19374F = aVar;
            this.f19375G = jVar.mo13110c();
            this.f19376a.mo12971a((C6800a) new C6800a() {
                /* renamed from: a */
                public final FeedDataKey mo12978a() {
                    return BaseFeedDataViewModel.this.mo13267f();
                }

                /* renamed from: b */
                public final int mo12979b() {
                    return BaseFeedDataViewModel.this.f19386y;
                }

                /* renamed from: c */
                public final int mo12980c() {
                    return BaseFeedDataViewModel.this.f19387z;
                }
            });
        }
    }
}
