package com.bytedance.android.livesdk.feed;

import android.app.Activity;
import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.os.SystemClock;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1324c;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.performance.C3974b;
import com.bytedance.android.live.core.performance.C3982g;
import com.bytedance.android.live.core.performance.C3982g.C3983a;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.feed.p331a.C6806a;
import com.bytedance.android.livesdk.feed.p334c.C6856b;
import com.bytedance.android.livesdk.feed.p342j.C7007b;
import com.bytedance.android.livesdk.feed.roomdetector.C7089a;
import com.bytedance.android.livesdk.feed.roomdetector.C7089a.C7090a;
import com.bytedance.android.livesdk.feed.roomdetector.C7095e;
import com.bytedance.android.livesdk.feed.setting.LiveFeedSettings;
import com.bytedance.android.livesdkapi.depend.live.C8649h;
import com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b;
import com.bytedance.android.livesdkapi.depend.live.C8649h.C8653c;
import com.bytedance.android.livesdkapi.depend.live.C8649h.C8654d;
import com.bytedance.android.livesdkapi.depend.model.live.C8706l;
import com.bytedance.android.livesdkapi.depend.model.live.C8725y.C8726a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p429a.C8604b;
import com.bytedance.android.livesdkapi.p448f.C8740a;
import com.bytedance.common.utility.C9425l;
import com.bytedance.common.utility.C9425l.C9426a;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class BaseFeedRoomPlayComponent implements C0183j, C8653c {

    /* renamed from: a */
    public final String f18610a;

    /* renamed from: b */
    public final WeakReference<C0176h> f18611b;

    /* renamed from: c */
    protected final RecyclerView f18612c;

    /* renamed from: d */
    protected final C1332i f18613d;

    /* renamed from: e */
    protected final C6806a f18614e;

    /* renamed from: f */
    protected final BannerSwipeRefreshLayout f18615f;

    /* renamed from: g */
    protected final ViewGroup f18616g;

    /* renamed from: h */
    protected final TextureView f18617h;

    /* renamed from: i */
    protected final C8649h f18618i;

    /* renamed from: j */
    protected final Activity f18619j;

    /* renamed from: k */
    protected C7089a f18620k;

    /* renamed from: l */
    protected C6799b f18621l;

    /* renamed from: m */
    protected C8604b f18622m;

    /* renamed from: n */
    public boolean f18623n;

    /* renamed from: o */
    protected boolean f18624o;

    /* renamed from: p */
    public boolean f18625p;

    /* renamed from: q */
    public boolean f18626q;

    /* renamed from: r */
    public boolean f18627r;

    /* renamed from: s */
    private final C1324c f18628s = new C1324c() {
        /* renamed from: a */
        public final void mo4984a() {
            super.mo4984a();
            m14237a(true);
        }

        /* renamed from: a */
        private void m14237a(boolean z) {
            boolean z2;
            boolean z3 = true;
            if (BaseFeedRoomPlayComponent.this.f18621l == null || BaseFeedRoomPlayComponent.this.f18621l.f18640b <= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (BaseFeedRoomPlayComponent.this.f18614e.getItemCount() > 0) {
                z3 = false;
            }
            if (BaseFeedRoomPlayComponent.this.f18622m != null) {
                if (z3 || z) {
                    BaseFeedRoomPlayComponent.this.mo12932c(false);
                }
            } else if (z2 && z3) {
                BaseFeedRoomPlayComponent.this.mo12932c(false);
            } else if (!z2 && !z3) {
                BaseFeedRoomPlayComponent.this.mo12933d();
            } else if (z2 && z) {
                BaseFeedRoomPlayComponent.this.mo12932c(false);
                BaseFeedRoomPlayComponent.this.mo12933d();
            }
        }

        /* renamed from: b */
        public final void mo4988b(int i, int i2) {
            boolean z;
            super.mo4988b(i, i2);
            if (i <= BaseFeedRoomPlayComponent.this.f18621l.f18639a) {
                z = true;
            } else {
                z = false;
            }
            m14237a(z);
        }

        /* renamed from: c */
        public final void mo4989c(int i, int i2) {
            boolean z;
            super.mo4989c(i, i2);
            if (i <= BaseFeedRoomPlayComponent.this.f18621l.f18639a) {
                z = true;
            } else {
                z = false;
            }
            m14237a(z);
        }

        /* renamed from: a */
        public final void mo4986a(int i, int i2, int i3) {
            boolean z;
            super.mo4986a(i, i2, i3);
            if (i <= BaseFeedRoomPlayComponent.this.f18621l.f18639a || i2 <= BaseFeedRoomPlayComponent.this.f18621l.f18639a) {
                z = true;
            } else {
                z = false;
            }
            m14237a(z);
        }
    };

    /* renamed from: t */
    private final Runnable f18629t = new Runnable() {
        public final void run() {
            if (!(!BaseFeedRoomPlayComponent.this.f18624o || !BaseFeedRoomPlayComponent.this.f18625p || BaseFeedRoomPlayComponent.this.f18612c == null || BaseFeedRoomPlayComponent.this.f18612c.getAdapter() == null || BaseFeedRoomPlayComponent.this.f18612c.getAdapter().getItemCount() == 0 || !BaseFeedRoomPlayComponent.this.mo12929b() || BaseFeedRoomPlayComponent.this.f18621l == null)) {
                BaseFeedRoomPlayComponent.this.f18621l.onScrollStateChanged(BaseFeedRoomPlayComponent.this.f18612c, 0);
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.feed.BaseFeedRoomPlayComponent$a */
    public interface C6798a {
        /* renamed from: a */
        RecyclerView mo12946a();

        /* renamed from: b */
        C6806a mo12947b();

        /* renamed from: c */
        BannerSwipeRefreshLayout mo12948c();

        /* renamed from: d */
        View mo12949d();

        /* renamed from: e */
        TextureView mo12950e();

        /* renamed from: f */
        C8649h mo12951f();

        /* renamed from: g */
        C0176h mo12952g();

        /* renamed from: h */
        Activity mo12953h();

        /* renamed from: i */
        String mo12954i();
    }

    /* renamed from: com.bytedance.android.livesdk.feed.BaseFeedRoomPlayComponent$b */
    abstract class C6799b extends C1340m {

        /* renamed from: a */
        int f18639a = -1;

        /* renamed from: b */
        long f18640b = -1;

        /* renamed from: c */
        protected LinkedHashMap<Long, Long> f18641c = new LinkedHashMap<>();

        /* renamed from: d */
        protected LinkedHashMap<Long, Long> f18642d = new LinkedHashMap<>();

        /* renamed from: e */
        protected LinkedHashMap<Long, Long> f18643e = new LinkedHashMap<>();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract int mo12955a(boolean z);

        /* renamed from: a */
        public abstract void mo12958a(int i, int i2);

        /* renamed from: b */
        public abstract void mo12960b();

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo12963d() {
        }

        /* renamed from: f */
        public abstract void mo12965f();

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo12966g() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int[] mo12962c() {
            return new int[]{-1, -1};
        }

        /* renamed from: h */
        public final void mo12967h() {
            this.f18641c.clear();
            this.f18642d.clear();
            this.f18643e.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final Room mo12964e() {
            FeedItem d = BaseFeedRoomPlayComponent.this.f18614e.mo12998d(this.f18639a);
            if (d == null || d.type != 1) {
                return null;
            }
            return (Room) d.item;
        }

        /* renamed from: a */
        public void mo12957a() {
            this.f18639a = -1;
            this.f18640b = -1;
            if (BaseFeedRoomPlayComponent.this.f18616g != null) {
                BaseFeedRoomPlayComponent.this.f18616g.setVisibility(4);
            }
            BaseFeedRoomPlayComponent.this.mo12928b(false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Room mo12956a(int i) {
            FeedItem d = BaseFeedRoomPlayComponent.this.f18614e.mo12998d(i);
            if (d == null || d.type != 1) {
                return null;
            }
            return (Room) d.item;
        }

        C6799b() {
        }

        /* renamed from: a */
        private void m14258a(Room room) {
            if (room != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from_merge", "live_merge");
                hashMap.put("enter_method", "live_cover");
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                hashMap.put("request_id", String.valueOf(room.getRequestId()));
                hashMap.put("room_id", String.valueOf(room.getId()));
                hashMap.put("is_success", "0");
                hashMap.put("time", String.valueOf(SystemClock.currentThreadTimeMillis() - ((Long) BaseFeedRoomPlayComponent.this.f18621l.f18643e.get(Long.valueOf(room.getId()))).longValue()));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", CustomActionPushReceiver.f104061f);
                hashMap.put("event_type", "other");
                hashMap.put("event_module", BaseFeedRoomPlayComponent.this.f18610a);
                C7007b.m14648a("live_window_show_start", (Map<String, String>) hashMap);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo12959a(int[] iArr) {
            if (BaseFeedRoomPlayComponent.this.f18624o && BaseFeedRoomPlayComponent.this.f18625p && iArr[1] >= 0) {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo12961b(int i) {
            if (BaseFeedRoomPlayComponent.this.f18624o && BaseFeedRoomPlayComponent.this.f18625p) {
                if (BaseFeedRoomPlayComponent.this.f18618i != null) {
                    BaseFeedRoomPlayComponent.this.f18618i.mo14274d(true);
                }
                C8654d dVar = null;
                if (i == this.f18639a) {
                    FeedItem d = BaseFeedRoomPlayComponent.this.f18614e.mo12998d(this.f18639a);
                    if (d != null && d.type == 1) {
                        if (BaseFeedRoomPlayComponent.this.f18622m != null) {
                            BaseFeedRoomPlayComponent.this.f18622m = null;
                        }
                        Room room = (Room) d.item;
                        this.f18640b = room.getId();
                        if (!BaseFeedRoomPlayComponent.m14222a(room)) {
                            if (BaseFeedRoomPlayComponent.this.f18618i != null) {
                                BaseFeedRoomPlayComponent.this.f18618i.mo14273d(BaseFeedRoomPlayComponent.this.f18617h.getContext());
                            }
                            if (BaseFeedRoomPlayComponent.this.f18616g != null) {
                                BaseFeedRoomPlayComponent.this.f18616g.setVisibility(4);
                            }
                            BaseFeedRoomPlayComponent.this.mo12934e();
                            BaseFeedRoomPlayComponent.this.mo12928b(false);
                            return;
                        } else if (BaseFeedRoomPlayComponent.this.f18618i.mo14281i() && m14259a(room, BaseFeedRoomPlayComponent.this.f18618i)) {
                            if (!(BaseFeedRoomPlayComponent.this.f18616g == null || BaseFeedRoomPlayComponent.this.f18616g.getVisibility() == 0)) {
                                if (BaseFeedRoomPlayComponent.this.f18618i.mo14282j()) {
                                    BaseFeedRoomPlayComponent.this.mo12928b(true);
                                    BaseFeedRoomPlayComponent.this.mo12931c(room);
                                    BaseFeedRoomPlayComponent.this.f18616g.setVisibility(0);
                                    int h = BaseFeedRoomPlayComponent.this.f18618i.mo14280h();
                                    mo12958a(65535 & h, h >> 16);
                                } else {
                                    return;
                                }
                            }
                            mo12960b();
                            return;
                        }
                    } else if (d == null || d.type != 3 || !(d.item instanceof C8706l) || ((C8706l) d.item).f23850C != 0 || ((C8706l) d.item).f23880v == null) {
                        this.f18640b = 0;
                    } else {
                        if (BaseFeedRoomPlayComponent.this.f18618i != null && BaseFeedRoomPlayComponent.this.f18618i.mo14281i()) {
                            if (BaseFeedRoomPlayComponent.this.f18618i != null) {
                                BaseFeedRoomPlayComponent.this.f18618i.mo14278f(BaseFeedRoomPlayComponent.this.f18617h.getContext());
                            }
                            if (BaseFeedRoomPlayComponent.this.f18616g != null) {
                                BaseFeedRoomPlayComponent.this.f18616g.setVisibility(4);
                            }
                            BaseFeedRoomPlayComponent.this.mo12934e();
                            BaseFeedRoomPlayComponent.this.mo12928b(false);
                        }
                        if (BaseFeedRoomPlayComponent.this.f18622m != null && BaseFeedRoomPlayComponent.this.f18622m.mo15095a() == 4 && BaseFeedRoomPlayComponent.this.f18622m.mo15096b() == d.item.getId()) {
                            if (!(BaseFeedRoomPlayComponent.this.f18616g == null || BaseFeedRoomPlayComponent.this.f18616g.getVisibility() == 0)) {
                                BaseFeedRoomPlayComponent.this.mo12928b(true);
                                BaseFeedRoomPlayComponent.this.f18616g.setVisibility(0);
                                mo12958a(((C8706l) d.item).f23880v.f23893c, ((C8706l) d.item).f23880v.f23894d);
                            }
                            mo12960b();
                            return;
                        }
                    }
                }
                if (BaseFeedRoomPlayComponent.this.f18616g != null) {
                    BaseFeedRoomPlayComponent.this.f18616g.setVisibility(4);
                }
                mo12963d();
                this.f18639a = i;
                BaseFeedRoomPlayComponent.this.mo12934e();
                FeedItem d2 = BaseFeedRoomPlayComponent.this.f18614e.mo12998d(this.f18639a);
                if (d2 == null || !(d2.type == 1 || d2.type == 3)) {
                    this.f18640b = 0;
                    return;
                }
                if (d2.type == 1) {
                    if (BaseFeedRoomPlayComponent.this.f18622m != null) {
                        BaseFeedRoomPlayComponent.this.f18622m = null;
                    }
                    Room room2 = (Room) d2.item;
                    this.f18640b = room2.getId();
                    if (!C9425l.m18651b(C3922z.m9915e())) {
                        if (C6828b.f18714c && C9425l.m18652c(C3922z.m9915e()) != C9426a.MOBILE_4G) {
                            return;
                        }
                        if (!C6828b.f18712a) {
                            if (((float) (System.currentTimeMillis() - ((Long) C8740a.f24007e.mo10345a()).longValue())) > ((Float) LiveFeedSettings.DEFAULT_DURATION_SHOW_PREVIEW_TIP.mo9431a()).floatValue() * 8.64E7f) {
                                C4204a.m10421a((Context) BaseFeedRoomPlayComponent.this.f18619j, (int) R.string.eap);
                                C8740a.f24007e.mo10346a(Long.valueOf(System.currentTimeMillis()));
                            }
                        }
                    }
                    if (room2.getStatus() == 4 || room2.getMosaicStatus() != 0 || !room2.isPullUrlValid() || room2.isLiveTypeAudio()) {
                        BaseFeedRoomPlayComponent.this.f18618i.mo14273d(BaseFeedRoomPlayComponent.this.f18617h.getContext());
                        return;
                    }
                    C8726a aVar = room2.getStreamUrlExtraSafely().f23984n;
                    try {
                        if (room2.isMultiPullDataValid()) {
                            C8649h hVar = BaseFeedRoomPlayComponent.this.f18618i;
                            String multiStreamData = room2.getMultiStreamData();
                            String multiStreamDefaultQualitySdkKey = room2.getMultiStreamDefaultQualitySdkKey();
                            TextureView textureView = BaseFeedRoomPlayComponent.this.f18617h;
                            int ordinal = room2.getStreamType().ordinal();
                            if (aVar != null) {
                                dVar = C8654d.m17099a().mo15123a(aVar.f23992a).mo15125b(aVar.f23993b).mo15122a(aVar.f23994c).mo15124a();
                            }
                            hVar.mo14269a(multiStreamData, multiStreamDefaultQualitySdkKey, textureView, ordinal, dVar, (C8653c) BaseFeedRoomPlayComponent.this);
                        } else {
                            C8649h hVar2 = BaseFeedRoomPlayComponent.this.f18618i;
                            String buildPullUrl = room2.buildPullUrl();
                            TextureView textureView2 = BaseFeedRoomPlayComponent.this.f18617h;
                            int ordinal2 = room2.getStreamType().ordinal();
                            if (aVar != null) {
                                dVar = C8654d.m17099a().mo15123a(aVar.f23992a).mo15125b(aVar.f23993b).mo15122a(aVar.f23994c).mo15124a();
                            }
                            hVar2.mo14268a(buildPullUrl, textureView2, ordinal2, dVar, (C8653c) BaseFeedRoomPlayComponent.this, room2.getSdkParams());
                        }
                        BaseFeedRoomPlayComponent.this.f18618i.mo14270a(true, BaseFeedRoomPlayComponent.this.f18617h.getContext());
                        BaseFeedRoomPlayComponent.this.mo12927b(room2);
                        this.f18643e.put(Long.valueOf(room2.getId()), Long.valueOf(SystemClock.currentThreadTimeMillis()));
                        m14258a(room2);
                        C3974b.m10061a().mo9375a(C3983a.LiveFeedPreview.name(), (C0176h) BaseFeedRoomPlayComponent.this.f18611b.get(), BaseFeedRoomPlayComponent.this.f18617h.getContext());
                        C3974b.m10061a().mo9382b(C3983a.LiveFeedPreview.name(), (C0176h) BaseFeedRoomPlayComponent.this.f18611b.get(), BaseFeedRoomPlayComponent.this.f18617h.getContext());
                        C3982g.m10091b(C3983a.LiveFeedPreview);
                    } catch (Exception unused) {
                        this.f18640b = 0;
                    }
                } else if (d2.type == 3 && (d2.item instanceof C8706l)) {
                    C8706l lVar = (C8706l) d2.item;
                    if (lVar != null && lVar.f23850C == 0) {
                        BaseFeedRoomPlayComponent.this.mo12925a(d2);
                    }
                }
            }
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && BaseFeedRoomPlayComponent.this.f18624o) {
                mo12961b(mo12955a(true));
                mo12959a(mo12962c());
            }
        }

        /* renamed from: a */
        private static boolean m14259a(Room room, C8649h hVar) {
            if (room.isMultiPullDataValid()) {
                return TextUtils.equals(hVar.mo14284l(), room.getMultiStreamData());
            }
            if (room.isPullUrlValid()) {
                return TextUtils.equals(hVar.mo14283k(), room.buildPullUrl());
            }
            return false;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (BaseFeedRoomPlayComponent.this.f18616g == null || BaseFeedRoomPlayComponent.this.f18616g.getVisibility() == 0) {
                mo12960b();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo12928b(boolean z);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract boolean mo12929b();

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract C6799b mo12930c();

    @C0200t(mo345a = C0177a.ON_CREATE)
    public void onCreate() {
        this.f18626q = true;
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        this.f18626q = false;
    }

    /* renamed from: e */
    public final void mo12934e() {
        if (this.f18620k != null) {
            this.f18620k.mo13223b();
            this.f18620k = null;
        }
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
        this.f18624o = true;
        this.f18627r = true;
        mo12933d();
    }

    /* renamed from: d */
    public final void mo12933d() {
        if (mo12929b() && this.f18624o && this.f18625p) {
            this.f18612c.removeCallbacks(this.f18629t);
            this.f18612c.postDelayed(this.f18629t, 1000);
        }
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void onPause() {
        this.f18624o = false;
        if (mo12929b() && this.f18625p) {
            mo12932c(false);
        }
        this.f18623n = false;
    }

    @C0200t(mo345a = C0177a.ON_STOP)
    public void onStop() {
        this.f18627r = false;
        if (mo12929b() && this.f18619j.isFinishing()) {
            mo12932c(true);
        }
        mo12934e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12922a() {
        /*
            r6 = this;
            boolean r0 = r6.mo12929b()
            if (r0 != 0) goto L_0x001b
            android.support.v7.widget.RecyclerView r0 = r6.f18612c
            if (r0 == 0) goto L_0x001a
            com.bytedance.android.livesdk.feed.BaseFeedRoomPlayComponent$b r0 = r6.f18621l
            if (r0 == 0) goto L_0x001a
            android.support.v7.widget.RecyclerView r0 = r6.f18612c
            com.bytedance.android.livesdk.feed.BaseFeedRoomPlayComponent$b r1 = r6.f18621l
            r0.mo4818b(r1)
            com.bytedance.android.livesdk.feed.BaseFeedRoomPlayComponent$b r0 = r6.f18621l
            r0.mo12957a()
        L_0x001a:
            return
        L_0x001b:
            android.support.v7.widget.RecyclerView r0 = r6.f18612c
            r1 = 0
            if (r0 == 0) goto L_0x005f
            com.bytedance.android.livesdk.feed.BaseFeedRoomPlayComponent$b r0 = r6.f18621l
            if (r0 == 0) goto L_0x0037
            android.support.v7.widget.RecyclerView r0 = r6.f18612c
            com.bytedance.android.livesdk.feed.BaseFeedRoomPlayComponent$b r2 = r6.f18621l
            r0.mo4818b(r2)
            com.bytedance.android.livesdk.feed.BaseFeedRoomPlayComponent$b r0 = r6.f18621l
            r0.mo12957a()
            com.bytedance.android.livesdk.feed.a.a r0 = r6.f18614e
            android.support.v7.widget.RecyclerView$c r2 = r6.f18628s
            r0.unregisterAdapterDataObserver(r2)
        L_0x0037:
            com.bytedance.android.livesdk.feed.BaseFeedRoomPlayComponent$b r0 = r6.mo12930c()
            r6.f18621l = r0
            com.bytedance.android.livesdk.feed.BaseFeedRoomPlayComponent$b r0 = r6.f18621l
            if (r0 == 0) goto L_0x005f
            android.support.v7.widget.RecyclerView r0 = r6.f18612c
            com.bytedance.android.livesdk.feed.BaseFeedRoomPlayComponent$b r2 = r6.f18621l
            r0.mo4801a(r2)
            com.bytedance.android.livesdk.feed.a.a r0 = r6.f18614e
            android.support.v7.widget.RecyclerView$c r2 = r6.f18628s
            r0.registerAdapterDataObserver(r2)
            com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout r0 = r6.f18615f
            if (r0 == 0) goto L_0x005d
            com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout r0 = r6.f18615f
            com.bytedance.android.livesdk.feed.BaseFeedRoomPlayComponent$3 r2 = new com.bytedance.android.livesdk.feed.BaseFeedRoomPlayComponent$3
            r2.<init>()
            r0.setStartEndRefreshListener(r2)
        L_0x005d:
            r0 = 1
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            if (r0 != 0) goto L_0x0063
            return
        L_0x0063:
            com.bytedance.android.livesdk.feed.BaseFeedRoomPlayComponent$b r0 = r6.f18621l
            long r2 = r0.f18640b
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0070
            r6.mo12932c(r1)
        L_0x0070:
            r6.mo12933d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.BaseFeedRoomPlayComponent.mo12922a():void");
    }

    /* renamed from: a */
    protected static boolean m14222a(Room room) {
        if (room == null || room.getMosaicStatus() != 0 || room.isLiveTypeAudio()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo12926a(boolean z) {
        if (this.f18625p != z) {
            this.f18625p = z;
            if (z) {
                mo12933d();
                return;
            }
            if (mo12929b() && this.f18624o) {
                mo12932c(false);
            }
        }
    }

    /* renamed from: b */
    public final void mo12927b(final Room room) {
        if (this.f18627r && room != null) {
            if (this.f18620k == null) {
                C7095e eVar = new C7095e(room.getId(), room.getStreamId(), true, new C7090a() {

                    /* renamed from: c */
                    private boolean f18636c = true;

                    /* renamed from: b */
                    public final void mo12944b() {
                        this.f18636c = false;
                        BaseFeedRoomPlayComponent.this.mo12923a(room.getId());
                    }

                    /* renamed from: c */
                    public final void mo12945c() {
                        this.f18636c = false;
                        BaseFeedRoomPlayComponent.this.mo12923a(room.getId());
                    }

                    /* renamed from: a */
                    public final boolean mo12943a() {
                        if (!this.f18636c || !BaseFeedRoomPlayComponent.this.f18627r || !BaseFeedRoomPlayComponent.this.f18626q) {
                            return false;
                        }
                        return true;
                    }

                    /* renamed from: a */
                    public final void mo12941a(int i) {
                        this.f18636c = false;
                        BaseFeedRoomPlayComponent.this.mo12923a(-1);
                    }

                    /* renamed from: a */
                    public final void mo12942a(long j, long j2) {
                        this.f18636c = false;
                        BaseFeedRoomPlayComponent.this.mo12924a(j, (int) j2);
                    }
                });
                this.f18620k = eVar;
            }
            this.f18620k.mo13222a();
        }
    }

    BaseFeedRoomPlayComponent(C6798a aVar) {
        this.f18616g = (ViewGroup) aVar.mo12949d();
        this.f18617h = aVar.mo12950e();
        this.f18618i = aVar.mo12951f();
        this.f18612c = aVar.mo12946a();
        this.f18613d = this.f18612c.getLayoutManager();
        this.f18614e = aVar.mo12947b();
        this.f18615f = aVar.mo12948c();
        this.f18619j = aVar.mo12953h();
        this.f18610a = aVar.mo12954i();
        aVar.mo12952g().mo324a(this);
        this.f18611b = new WeakReference<>(aVar.mo12952g());
    }

    /* renamed from: c */
    public final void mo12932c(boolean z) {
        mo12934e();
        if (this.f18612c != null) {
            this.f18612c.removeCallbacks(this.f18629t);
        }
        if (this.f18616g != null) {
            this.f18616g.setVisibility(4);
        }
        mo12928b(false);
        if (this.f18618i != null) {
            if (z) {
                this.f18618i.mo14275e(this.f18617h.getContext());
            } else {
                this.f18618i.mo14273d(this.f18617h.getContext());
            }
        }
        if (this.f18621l != null) {
            this.f18621l.mo12957a();
        }
    }

    /* renamed from: a */
    public final void mo12923a(long j) {
        if (this.f18612c != null && this.f18612c.getScrollState() == 0 && this.f18621l != null) {
            Room e = this.f18621l.mo12964e();
            if (e != null) {
                if (j == e.getId()) {
                    this.f18618i.mo14273d(this.f18617h.getContext());
                    this.f18616g.setVisibility(4);
                    mo12928b(false);
                    e.setStatus(4);
                    this.f18621l.mo12965f();
                    return;
                }
                for (FeedItem feedItem : this.f18614e.mo12999d()) {
                    if (feedItem.type == 1) {
                        Room room = (Room) feedItem.item;
                        if (room.getId() == j) {
                            room.setStatus(4);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo12931c(Room room) {
        if (room == null) {
            room = this.f18621l.mo12964e();
        }
        if (room != null) {
            Long l = (Long) this.f18621l.f18643e.get(Long.valueOf(room.getId()));
            if (l != null) {
                long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis() - l.longValue();
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from_merge", "live_merge");
                hashMap.put("enter_method", "live_cover");
                hashMap.put("is_success", "0");
                hashMap.put("time", String.valueOf(currentThreadTimeMillis));
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                hashMap.put("request_id", String.valueOf(room.getRequestId()));
                hashMap.put("room_id", String.valueOf(room.getId()));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", CustomActionPushReceiver.f104061f);
                hashMap.put("event_type", "other");
                hashMap.put("event_module", this.f18610a);
                C7007b.m14648a("live_window_show_finish", (Map<String, String>) hashMap);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12925a(final FeedItem feedItem) {
        if (feedItem != null && feedItem.item != null && (feedItem.item instanceof C8706l) && ((C8706l) feedItem.item).f23880v != null && !C9376b.m18558a((Collection<T>) ((C8706l) feedItem.item).f23880v.f23895e)) {
            if (this.f18618i != null) {
                this.f18618i.mo14278f(this.f18617h.getContext());
            }
            if (this.f18622m == null) {
                this.f18622m = C6856b.m14400c().mo13054p().mo15496a(this.f18619j, feedItem.adJSONObject);
            }
            if (this.f18622m != null) {
                new Object() {
                };
                feedItem.item.getId();
            }
        }
    }

    /* renamed from: a */
    public final void mo12924a(long j, int i) {
        if (this.f18626q && this.f18612c != null && this.f18621l != null && this.f18621l.mo12964e() != null) {
            Room e = this.f18621l.mo12964e();
            if (j == e.getId()) {
                this.f18618i.mo14273d(this.f18617h.getContext());
                this.f18616g.setVisibility(4);
                mo12928b(false);
                e.setMosaicStatus(i);
                this.f18621l.mo12965f();
                return;
            }
            for (FeedItem feedItem : this.f18614e.mo12999d()) {
                if (feedItem.type == 1) {
                    Room room = (Room) feedItem.item;
                    if (room.getId() == j) {
                        room.setMosaicStatus(i);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10922a(C8652b bVar, Object obj) {
        int i;
        if (this.f18627r) {
            if (bVar == C8652b.DISPLAYED_PLAY) {
                if (this.f18612c.getScrollState() == 0) {
                    if (!(this.f18616g == null || this.f18616g.getVisibility() == 0)) {
                        this.f18616g.setVisibility(0);
                        this.f18616g.setAlpha(0.0f);
                        this.f18616g.animate().alpha(1.0f).setDuration(100).start();
                    }
                    mo12928b(true);
                    mo12931c((Room) null);
                    int h = this.f18618i.mo14280h();
                    this.f18621l.mo12958a(h & 65535, h >> 16);
                    this.f18621l.mo12960b();
                    this.f18621l.mo12966g();
                    this.f18623n = true;
                    C3974b.m10061a().mo9374a(C3983a.LiveFeedPreview.name());
                    C3982g.m10092c(C3983a.LiveFeedPreview);
                }
            } else if (bVar == C8652b.VIDEO_SIZE_CHANGED && this.f18612c.getScrollState() == 0) {
                if (this.f18616g.getVisibility() != 0 && !this.f18623n) {
                    this.f18616g.setVisibility(0);
                    this.f18616g.setAlpha(0.0f);
                    this.f18616g.animate().alpha(1.0f).setDuration(100).start();
                }
                try {
                    i = Integer.valueOf(String.valueOf(obj)).intValue();
                } catch (Throwable unused) {
                    i = -1;
                }
                if (i >= 0) {
                    this.f18621l.mo12958a(i & 65535, i >> 16);
                    this.f18621l.mo12960b();
                }
            }
        }
    }
}
