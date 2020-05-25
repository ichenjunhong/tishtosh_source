package com.bytedance.android.livesdk.feed.p338f;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0210y.C0212b;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.feed.FeedApi;
import com.bytedance.android.live.core.p222a.C3814e;
import com.bytedance.android.live.core.p222a.C3819j;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.live.core.p230g.C3868af;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout.C6792a;
import com.bytedance.android.livesdk.feed.C6828b;
import com.bytedance.android.livesdk.feed.C6859d;
import com.bytedance.android.livesdk.feed.C6910f;
import com.bytedance.android.livesdk.feed.C6950g;
import com.bytedance.android.livesdk.feed.C7005j;
import com.bytedance.android.livesdk.feed.C7012l;
import com.bytedance.android.livesdk.feed.C7067q;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p331a.C6806a;
import com.bytedance.android.livesdk.feed.p331a.C6812e;
import com.bytedance.android.livesdk.feed.p331a.C6812e.C68131;
import com.bytedance.android.livesdk.feed.p331a.C6812e.C6815a;
import com.bytedance.android.livesdk.feed.p331a.C6812e.C6816b;
import com.bytedance.android.livesdk.feed.p331a.C6817f;
import com.bytedance.android.livesdk.feed.p331a.C6818g;
import com.bytedance.android.livesdk.feed.p331a.C6819h;
import com.bytedance.android.livesdk.feed.p331a.C6820i;
import com.bytedance.android.livesdk.feed.p331a.C6821j;
import com.bytedance.android.livesdk.feed.p331a.C6822k;
import com.bytedance.android.livesdk.feed.p331a.C6823l;
import com.bytedance.android.livesdk.feed.p331a.C6824m;
import com.bytedance.android.livesdk.feed.p331a.C6825n;
import com.bytedance.android.livesdk.feed.p331a.C6826o;
import com.bytedance.android.livesdk.feed.p331a.C6827p;
import com.bytedance.android.livesdk.feed.p334c.C6856b;
import com.bytedance.android.livesdk.feed.p346n.C7026a;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.android.livesdk.feed.services.C7104d;
import com.bytedance.android.livesdk.feed.setting.LiveFeedSettings;
import com.bytedance.android.livesdk.feed.tab.p349b.C7128p;
import com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.FragmentFeedViewModel;
import com.ss.android.ugc.trill.R;
import java.util.Map.Entry;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.feed.f.a */
public abstract class C6911a extends C3846a implements C7005j, C7012l {

    /* renamed from: o */
    protected FragmentFeedViewModel f18919o;

    /* renamed from: p */
    protected C6910f f18920p;

    /* renamed from: q */
    public RecyclerView f18921q;

    /* renamed from: r */
    protected C6812e f18922r;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6815a mo13077a(C6815a aVar) {
        return aVar;
    }

    /* renamed from: a */
    public String mo13078a() {
        return "";
    }

    /* renamed from: b */
    public String mo13084b() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo13111c(FeedItem feedItem) {
    }

    /* renamed from: c */
    public long mo13110c() {
        return 0;
    }

    /* renamed from: d */
    public int mo13086d() {
        return 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo13088f() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract C6806a mo13089h();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract C1331h mo13112m();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C1332i mo13091j() {
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(mo13088f(), 1);
        staggeredGridLayoutManager.mo4731b(0);
        return staggeredGridLayoutManager;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public FragmentFeedViewModel mo13087e() {
        return (FragmentFeedViewModel) C0214z.m439a((Fragment) this, (C0212b) this.f18920p.mo13108a((C7005j) this)).mo359a(FragmentFeedViewModel.class);
    }

    public void onPause() {
        super.onPause();
        if (mo13089h() != null) {
            C6806a h = mo13089h();
            h.f18667v.onNext(C4064k.f11214a);
            h.f18659n.removeCallbacksAndMessages(null);
        }
    }

    public void onResume() {
        super.onResume();
        if (mo13089h() != null) {
            C6806a h = mo13089h();
            h.f18666u.onNext(C4064k.f11214a);
            h.f18670y = false;
        }
    }

    public void onStop() {
        super.onStop();
        if (mo13089h() != null) {
            mo13089h().mo12997c();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FeedRepository feedRepository = new FeedRepository(C7104d.m14774a(), (FeedApi) C4157e.m10322a().mo9550a(FeedApi.class), new C3814e(), new C3819j(), new C3814e(), C7104d.m14775b(), null, new C6859d(C7128p.m14812d()));
        C6910f fVar = new C6910f(feedRepository, C7128p.m14812d(), C6856b.m14397a().getApplicationContext(), new C7067q() {
        }, new C7026a());
        this.f18920p = fVar;
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (this.f18919o != null) {
            this.f18919o.mo13272a(z);
        }
        if (mo13089h() != null) {
            C6806a h = mo13089h();
            h.f18671z = z;
            if (!z) {
                h.mo12994a(h.f18661p, false);
            } else if (!(h.f18663r == null || h.f18663r.size() == 0)) {
                long a = C3868af.m9802a();
                for (Entry key : h.f18663r.entrySet()) {
                    h.f18661p.put((String) key.getKey(), Long.valueOf(a));
                }
                h.f18663r.clear();
                h.f18663r = null;
            }
            h.f18668w.onNext(Boolean.valueOf(z));
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f18919o = mo13087e();
        C6815a a = mo13077a(new C6815a().mo13004a((C0184k) this).mo13011a((BaseFeedDataViewModel) this.f18919o).mo13007a(this.f18921q).mo13009a((C6816b) new C6913b(this)).mo13008a(mo13089h()).mo13006a(mo13091j()).mo13005a(mo13112m()).mo13012a(false).mo13003a(mo13088f()).mo13010a((C7012l) this));
        if (a.f18691b != null) {
            a.f18691b.setItemAnimator(null);
            if (a.f18690a == null) {
                throw new IllegalStateException("adapter must not be null");
            } else if (a.f18692c == null) {
                throw new IllegalStateException("viewModel must not be null");
            } else if (a.f18696g != null) {
                C6812e eVar = new C6812e(a.f18696g, a.f18690a, a.f18691b, a.f18692c);
                eVar.f18678d = a.f18693d;
                if (a.f18693d instanceof StaggeredGridLayoutManager) {
                    ((StaggeredGridLayoutManager) a.f18693d).mo4672a(a.f18694e);
                }
                eVar.f18683i = a.f18699j;
                eVar.f18679e = a.f18695f;
                eVar.f18682h = a.f18697h;
                eVar.f18681g = a.f18698i;
                eVar.f18684j = a.f18700k;
                eVar.f18685k = a.f18701l;
                this.f18922r = eVar;
                C6812e eVar2 = this.f18922r;
                C6806a aVar = eVar2.f18675a;
                C68131 r1 = new C6827p() {
                    /* renamed from: b */
                    public final C6792a mo13002b() {
                        return C6812e.this.f18684j;
                    }

                    /* renamed from: a */
                    public final FeedDataKey mo13001a() {
                        return C6812e.this.f18677c.mo13267f();
                    }
                };
                aVar.f18660o = r1.mo13001a();
                aVar.f10980m = new Object[]{r1, aVar.f18665t, aVar.f18666u, aVar.f18667v, aVar.f18668w, aVar.f18669x};
                eVar2.f18676b.setAdapter(eVar2.f18675a);
                eVar2.f18676b.setLayoutManager(eVar2.f18678d);
                eVar2.f18676b.mo4801a((C1340m) new C1340m() {
                    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                        super.onScrollStateChanged(recyclerView, i);
                        if (i == 0) {
                            C6806a aVar = C6812e.this.f18675a;
                            aVar.mo12994a(aVar.f18662q, true);
                            if (C6828b.f18712a && ((Boolean) LiveFeedSettings.I18N_ZHIBOZHONG_ANIMATION_TAG.mo9431a()).booleanValue()) {
                                aVar.f18669x.onNext(C4064k.f11214a);
                            }
                            C1332i layoutManager = recyclerView.getLayoutManager();
                            if (layoutManager instanceof StaggeredGridLayoutManager) {
                                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                                int[] a = staggeredGridLayoutManager.mo5240a((int[]) null);
                                if (a[0] >= 0 && a[0] < 3) {
                                    staggeredGridLayoutManager.mo5245h();
                                }
                            }
                            return;
                        }
                        C6812e.this.f18675a.mo12995b();
                    }

                    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                        super.onScrolled(recyclerView, i, i2);
                        if (i > 0 || i2 > 0) {
                            C6812e.this.f18675a.mo12995b();
                        }
                    }
                });
                if (eVar2.f18679e != null) {
                    eVar2.f18676b.mo4798a(eVar2.f18679e);
                }
                eVar2.f18675a.mo9318a((PagingViewModel<T>) eVar2.f18677c);
                eVar2.f18675a.f18664s.mo6522a(C6817f.f18702a).mo6505a((C1710e<? super T>) new C6818g<Object>(eVar2), C6819h.f18704a);
                eVar2.f18675a.f18665t.mo6505a((C1710e<? super T>) new C6820i<Object>(eVar2), C6821j.f18706a);
                eVar2.f18675a.f18666u.mo6505a((C1710e<? super T>) new C6822k<Object>(eVar2), C6823l.f18708a);
                eVar2.f18677c.mo13265d();
                eVar2.f18677c.f19376a.mo12970a(eVar2.f18680f);
                eVar2.f18677c.f19377p.observeForever(new C6824m(eVar2));
                eVar2.f18677c.f19371C.observe(eVar2.f18680f, new C6825n(eVar2));
                eVar2.f18677c.f19382u.observe(eVar2.f18680f, new C6826o(eVar2));
                this.f18919o.mo13272a(getUserVisibleHint());
                this.f18921q.mo4801a((C1340m) new C6950g(mo13088f()));
                this.f18919o.f19381t.observe(this, new C6914c(this));
            } else {
                throw new IllegalStateException("lifecycleOwner must not be null");
            }
        } else {
            throw new IllegalStateException("recyclerView must not be null");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ak3, viewGroup, false);
        this.f18921q = (RecyclerView) inflate.findViewById(R.id.bbo);
        return inflate;
    }
}
