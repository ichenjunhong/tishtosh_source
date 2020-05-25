package com.bytedance.android.livesdk.feed.repository;

import android.arch.lifecycle.C0162b;
import android.arch.p006a.p007a.C0040a;
import android.arch.p010b.C0065d;
import android.arch.p010b.C0065d.C0066a;
import android.arch.p010b.C0065d.C0067b;
import android.arch.p010b.C0070e;
import android.arch.p010b.C0070e.C00711;
import android.arch.p010b.C0082h;
import android.arch.p010b.C0082h.C0085a;
import android.arch.p010b.C0082h.C0088d;
import android.arch.p010b.C0082h.C0088d.C0089a;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.C2974a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.feed.FeedApi;
import com.bytedance.android.live.core.p222a.C3809a;
import com.bytedance.android.live.core.p222a.C3810b;
import com.bytedance.android.live.core.p222a.C3823n;
import com.bytedance.android.live.core.p226e.C3842b;
import com.bytedance.android.live.core.p226e.C3842b.C3843a;
import com.bytedance.android.live.core.paging.C3945b;
import com.bytedance.android.live.core.paging.C3950c;
import com.bytedance.android.live.core.paging.p237b.C3947b;
import com.bytedance.android.live.core.paging.p237b.C3948c;
import com.bytedance.android.live.core.paging.p237b.C3948c.C39491;
import com.bytedance.android.live.core.paging.p238c.C3951a;
import com.bytedance.android.live.core.paging.p238c.C3952b;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.livesdk.feed.C6804a;
import com.bytedance.android.livesdk.feed.C6804a.C6805a;
import com.bytedance.android.livesdk.feed.C6957i;
import com.bytedance.android.livesdk.feed.C7025n;
import com.bytedance.android.livesdk.feed.C7068r;
import com.bytedance.android.livesdk.feed.IFeedRepository;
import com.bytedance.android.livesdk.feed.IFeedRepository.C6800a;
import com.bytedance.android.livesdk.feed.feed.C6940a;
import com.bytedance.android.livesdk.feed.feed.C6941b;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p334c.C6856b;
import com.bytedance.android.livesdk.feed.p335d.C6860a;
import com.bytedance.android.livesdk.feed.p339g.C6951a;
import com.bytedance.android.livesdk.feed.setting.LiveFeedSettings;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p094l.C2180b;

public class FeedRepository extends BaseFeedRepository implements IFeedRepository, C6804a {

    /* renamed from: g */
    protected final FeedApi f19241g;

    /* renamed from: h */
    protected final C3809a<FeedDataKey, C2974a> f19242h;

    /* renamed from: i */
    protected C6800a f19243i;

    /* renamed from: j */
    protected C6940a<C3945b<FeedItem>, C6941b> f19244j;

    /* renamed from: k */
    protected C2180b<Object> f19245k = C2180b.m6534l();

    /* renamed from: l */
    protected C2180b<String> f19246l = C2180b.m6534l();

    /* renamed from: m */
    protected C2180b<List<ImageModel>> f19247m = C2180b.m6534l();

    /* renamed from: n */
    protected C2180b<Pair<String, String>> f19248n = C2180b.m6534l();

    /* renamed from: o */
    protected C2180b<String> f19249o = C2180b.m6534l();

    /* renamed from: p */
    protected final C6951a f19250p;

    /* renamed from: q */
    protected C3945b<FeedItem> f19251q;

    /* renamed from: r */
    protected int f19252r = -1;

    /* renamed from: s */
    protected final C3809a<Long, Integer> f19253s;

    /* renamed from: t */
    public C6957i f19254t;

    /* renamed from: u */
    public C7070a f19255u;

    /* renamed from: v */
    String f19256v;

    /* renamed from: w */
    private C6860a f19257w;

    /* renamed from: x */
    private C7068r f19258x;

    /* renamed from: y */
    private boolean f19259y = false;

    /* renamed from: com.bytedance.android.livesdk.feed.repository.FeedRepository$a */
    public static class C7070a implements C3952b<FeedItem> {

        /* renamed from: a */
        int f19260a;

        /* renamed from: b */
        public String f19261b;

        /* renamed from: c */
        String f19262c = "enter_auto";

        /* renamed from: d */
        String f19263d = "feed_loadmore";

        /* renamed from: e */
        C6957i f19264e;

        /* renamed from: f */
        C2180b<String> f19265f;

        /* renamed from: g */
        C2180b<String> f19266g;

        /* renamed from: h */
        long f19267h;

        /* renamed from: i */
        C6804a f19268i;

        /* renamed from: j */
        C2180b<List<ImageModel>> f19269j;

        /* renamed from: k */
        final C1689b f19270k = new C1689b();

        /* renamed from: l */
        private FeedApi f19271l;

        /* renamed from: m */
        private C6951a f19272m;

        /* renamed from: n */
        private C7071a f19273n;

        /* renamed from: o */
        private C6860a f19274o;

        /* renamed from: p */
        private FeedDataKey f19275p;

        /* renamed from: q */
        private C7068r f19276q;

        /* renamed from: com.bytedance.android.livesdk.feed.repository.FeedRepository$a$a */
        interface C7071a {
        }

        /* renamed from: a */
        private void m14736a(C1690c cVar) {
            this.f19270k.mo6181a(cVar);
        }

        /* renamed from: a */
        public final C2201v<Pair<List<FeedItem>, C2974a>> mo9343a(boolean z, Long l, int i) {
            C2201v vVar;
            m14736a(C2201v.m6614b(Integer.valueOf(1)).mo6539d(3000, TimeUnit.MILLISECONDS).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C7081j<Object>(this), C7082k.f19286a));
            if (z) {
                this.f19268i.mo12991a(C6805a.REFRESH, this.f19262c);
                if (this.f19267h > 0) {
                    vVar = this.f19271l.feed(this.f19261b, 0, "push");
                } else {
                    if (((Boolean) LiveFeedSettings.REFRESH_SHOW_SANDBOX_ROOM.mo9431a()).booleanValue() && C6856b.m14400c().mo13039a().getChannel().equals("local_test")) {
                        this.f19262c = "feed_refresh_local_test";
                    }
                    vVar = this.f19271l.feed(this.f19261b, 0, this.f19262c);
                }
                this.f19265f.onNext(this.f19262c);
            } else {
                this.f19268i.mo12991a(C6805a.LOAD_MORE, this.f19263d);
                vVar = this.f19271l.feed(this.f19261b, l.longValue(), this.f19263d);
                this.f19265f.onNext(this.f19263d);
                this.f19266g.onNext(this.f19263d);
            }
            return vVar.mo6541d((C1711f<? super T, ? extends R>) new C7083l<Object,Object>(this, z)).mo6540d((C1710e<? super T>) new C7084m<Object>(this)).mo6540d((C1710e<? super T>) new C7085n<Object>(this)).mo6540d(C7086o.f19291a).mo6540d((C1710e<? super T>) new C7087p<Object>(this)).mo6535c((C1710e<? super Throwable>) new C7088q<Object>(this, z));
        }

        C7070a(String str, FeedApi feedApi, C6951a aVar, C6957i iVar, C2180b<Pair<String, String>> bVar, C6804a aVar2, C2180b<String> bVar2, C2180b<String> bVar3, String str2, C7071a aVar3, C6860a aVar4, FeedDataKey feedDataKey, C2180b<List<ImageModel>> bVar4, C7068r rVar) {
            this.f19261b = str;
            this.f19271l = feedApi;
            this.f19273n = aVar3;
            this.f19264e = iVar;
            this.f19272m = aVar;
            this.f19274o = aVar4;
            this.f19275p = feedDataKey;
            this.f19265f = bVar2;
            this.f19268i = aVar2;
            this.f19266g = bVar3;
            this.f19262c = str2;
            m14736a(bVar.mo6505a((C1710e<? super T>) new C7078g<Object>(this), C7079h.f19283a));
            this.f19269j = bVar4;
            this.f19276q = rVar;
        }
    }

    /* renamed from: a */
    public final C2180b<Object> mo12968a() {
        return this.f19245k;
    }

    /* renamed from: b */
    public final C2201v<String> mo12974b() {
        return this.f19246l;
    }

    /* renamed from: c */
    public final C2201v<List<ImageModel>> mo12975c() {
        return this.f19247m;
    }

    /* renamed from: e */
    public final C6957i mo12977e() {
        return this.f19254t;
    }

    /* renamed from: i */
    public final C3945b<FeedItem> mo13214i() {
        return this.f19251q;
    }

    /* renamed from: j */
    public final C6940a<C3945b<FeedItem>, C6941b> mo13218j() {
        return this.f19244j;
    }

    /* renamed from: f */
    public final List<FeedItem> mo12983f() {
        return this.f19234c.mo9185a(mo13213h());
    }

    /* renamed from: k */
    private int m14718k() {
        if (this.f19243i == null || this.f19243i.mo12979b() <= 0) {
            return 12;
        }
        return this.f19243i.mo12979b();
    }

    /* renamed from: d */
    public final void mo12976d() {
        if (this.f19233b != null) {
            mo13213h();
            TextUtils.equals(this.f19256v, "enter_auto");
            mo13213h();
        }
    }

    /* renamed from: g */
    public final void mo12984g() {
        this.f19234c.mo9191c(mo13213h());
        if (this.f19255u != null) {
            this.f19255u.f19270k.mo6180a();
        }
    }

    /* renamed from: h */
    public final FeedDataKey mo13213h() {
        if (this.f19243i != null) {
            return this.f19243i.mo12978a();
        }
        throw new IllegalStateException("not call init() or params be null");
    }

    /* renamed from: a */
    public final void mo12971a(C6800a aVar) {
        this.f19243i = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13217a(C3842b bVar) {
        boolean z;
        if (bVar != null) {
            if (bVar.f10823a == C3843a.SUCCESS) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.f19245k != null) {
                this.f19245k.onNext(C4064k.f11214a);
            }
        }
    }

    /* renamed from: b */
    public final void mo12981b(String str) {
        FeedItem c = mo12982c(str);
        if (c != null) {
            this.f19234c.mo9188a(mo13213h(), c);
        }
        if (this.f19251q != null) {
            this.f19251q.mo9304h();
        }
    }

    /* renamed from: c */
    public final FeedItem mo12982c(String str) {
        return (FeedItem) this.f19234c.mo9184a(mo13213h(), (C3823n<V>) new C7077f<V>(str));
    }

    /* renamed from: a */
    public final void mo12973a(boolean z) {
        this.f19259y = z;
    }

    /* renamed from: a */
    public final C6940a<C3945b<FeedItem>, C6941b> mo12969a(String str) {
        String str2;
        int i;
        FeedApi feedApi = this.f19241g;
        C6951a aVar = this.f19250p;
        C6957i iVar = this.f19254t;
        C2180b<Pair<String, String>> bVar = this.f19248n;
        C2180b<String> bVar2 = this.f19249o;
        C2180b<String> bVar3 = this.f19246l;
        if (this.f19259y) {
            str2 = "enter_auto_from_room";
        } else {
            str2 = "enter_auto";
        }
        String str3 = str2;
        C7075d dVar = new C7075d(this);
        C6860a aVar2 = this.f19257w;
        FeedDataKey a = this.f19243i.mo12978a();
        C2180b<List<ImageModel>> bVar4 = this.f19247m;
        C7068r rVar = this.f19258x;
        C7070a aVar3 = r0;
        C7070a aVar4 = new C7070a(str, feedApi, aVar, iVar, bVar, this, bVar2, bVar3, str3, dVar, aVar2, a, bVar4, rVar);
        this.f19255u = aVar3;
        C3948c cVar = new C3948c();
        cVar.f10992i = this.f19255u;
        cVar.f10988e = this.f19243i.mo12978a();
        C3810b<CacheKey, V> bVar5 = this.f19234c;
        C3809a<FeedDataKey, C2974a> aVar5 = this.f19242h;
        cVar.f10989f = bVar5;
        cVar.f10990g = aVar5;
        C0089a a2 = new C0089a().mo141a(false).mo140a(m14718k());
        a2.f228a = m14718k();
        if (this.f19243i == null || this.f19243i.mo12980c() <= 0) {
            i = 4;
        } else {
            i = this.f19243i.mo12980c();
        }
        cVar.f10991h = a2.mo143b(i).mo142a();
        C39491 r2 = new C0066a<Long, V>() {
            /* renamed from: a */
            public final C0065d<Long, V> mo109a() {
                return new C3951a(C3948c.this);
            }
        };
        C3947b bVar6 = new C3947b(cVar.f10984a, cVar.f10985b);
        C0070e eVar = new C0070e(r2, cVar.f10991h);
        eVar.f169d = bVar6;
        Key key = eVar.f166a;
        C0088d dVar2 = eVar.f167b;
        C0085a aVar6 = eVar.f169d;
        C0066a<Key, Value> aVar7 = eVar.f168c;
        Executor b = C0040a.m63b();
        Executor executor = eVar.f170e;
        C00711 r6 = new C0162b<C0082h<Value>>(executor, key, aVar7, dVar2, b, executor, aVar6) {

            /* renamed from: g */
            final /* synthetic */ Object f171g;

            /* renamed from: h */
            final /* synthetic */ C0066a f172h;

            /* renamed from: i */
            final /* synthetic */ C0088d f173i;

            /* renamed from: j */
            final /* synthetic */ Executor f174j;

            /* renamed from: k */
            final /* synthetic */ Executor f175k;

            /* renamed from: l */
            final /* synthetic */ C0085a f176l;

            /* renamed from: m */
            private C0082h<Value> f177m;

            /* renamed from: n */
            private C0065d<Key, Value> f178n;

            /* renamed from: o */
            private final C0067b f179o = new C0067b() {
                /* renamed from: c_ */
                public final void mo110c_() {
                    C0040a.m62a().mo60c(C00711.this.f416f);
                }
            };

            /* JADX WARNING: type inference failed for: r1v9, types: [android.arch.b.h<Value>] */
            /* JADX WARNING: type inference failed for: r3v3, types: [android.arch.b.c] */
            /* JADX WARNING: type inference failed for: r3v7, types: [android.arch.b.n] */
            /* JADX WARNING: type inference failed for: r3v8, types: [android.arch.b.c] */
            /* JADX WARNING: type inference failed for: r3v9, types: [android.arch.b.n] */
            /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v8, types: [android.arch.b.c]
              assigns: [android.arch.b.c, android.arch.b.n]
              uses: [android.arch.b.c, android.arch.b.h<Value>, android.arch.b.n]
              mth insns count: 77
            	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
             */
            /* JADX WARNING: Unknown variable types count: 3 */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Object mo115a() {
                /*
                    r11 = this;
                    java.lang.Object r0 = r11.f171g
                    android.arch.b.h<Value> r1 = r11.f177m
                    if (r1 == 0) goto L_0x000c
                    android.arch.b.h<Value> r0 = r11.f177m
                    java.lang.Object r0 = r0.mo100c()
                L_0x000c:
                    android.arch.b.d<Key, Value> r1 = r11.f178n
                    if (r1 == 0) goto L_0x0017
                    android.arch.b.d<Key, Value> r1 = r11.f178n
                    android.arch.b.d$b r2 = r11.f179o
                    r1.mo107b(r2)
                L_0x0017:
                    android.arch.b.d$a r1 = r11.f172h
                    android.arch.b.d r1 = r1.mo109a()
                    r11.f178n = r1
                    android.arch.b.d<Key, Value> r1 = r11.f178n
                    android.arch.b.d$b r2 = r11.f179o
                    r1.mo105a(r2)
                    android.arch.b.h$b r1 = new android.arch.b.h$b
                    android.arch.b.d<Key, Value> r2 = r11.f178n
                    android.arch.b.h$d r3 = r11.f173i
                    r1.<init>(r2, r3)
                    java.util.concurrent.Executor r2 = r11.f174j
                    r1.f220c = r2
                    java.util.concurrent.Executor r2 = r11.f175k
                    r1.f221d = r2
                    android.arch.b.h$a r2 = r11.f176l
                    r1.f222e = r2
                    r1.f223f = r0
                    java.util.concurrent.Executor r2 = r1.f220c
                    if (r2 == 0) goto L_0x00ab
                    java.util.concurrent.Executor r2 = r1.f221d
                    if (r2 == 0) goto L_0x00a3
                    android.arch.b.d<Key, Value> r2 = r1.f218a
                    java.util.concurrent.Executor r5 = r1.f220c
                    java.util.concurrent.Executor r6 = r1.f221d
                    android.arch.b.h$a r7 = r1.f222e
                    android.arch.b.h$d r8 = r1.f219b
                    Key r9 = r1.f223f
                    boolean r1 = r2.mo90a()
                    if (r1 != 0) goto L_0x0072
                    boolean r1 = r8.f226c
                    if (r1 != 0) goto L_0x005c
                    goto L_0x0072
                L_0x005c:
                    android.arch.b.n r1 = new android.arch.b.n
                    r4 = r2
                    android.arch.b.l r4 = (android.arch.p010b.C0097l) r4
                    if (r9 == 0) goto L_0x006b
                    java.lang.Integer r9 = (java.lang.Integer) r9
                    int r2 = r9.intValue()
                    r9 = r2
                    goto L_0x006d
                L_0x006b:
                    r2 = 0
                    r9 = 0
                L_0x006d:
                    r3 = r1
                    r3.<init>(r4, r5, r6, r7, r8, r9)
                    goto L_0x0096
                L_0x0072:
                    r1 = -1
                    boolean r3 = r2.mo90a()
                    if (r3 != 0) goto L_0x008b
                    android.arch.b.l r2 = (android.arch.p010b.C0097l) r2
                    android.arch.b.l$a r3 = new android.arch.b.l$a
                    r3.<init>(r2)
                    if (r9 == 0) goto L_0x008c
                    r1 = r9
                    java.lang.Integer r1 = (java.lang.Integer) r1
                    int r1 = r1.intValue()
                    r10 = r1
                    goto L_0x008d
                L_0x008b:
                    r3 = r2
                L_0x008c:
                    r10 = -1
                L_0x008d:
                    r4 = r3
                    android.arch.b.b r4 = (android.arch.p010b.C0060b) r4
                    android.arch.b.c r1 = new android.arch.b.c
                    r3 = r1
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                L_0x0096:
                    r11.f177m = r1
                    android.arch.b.h<Value> r1 = r11.f177m
                    boolean r1 = r1.mo132f()
                    if (r1 != 0) goto L_0x000c
                    android.arch.b.h<Value> r0 = r11.f177m
                    return r0
                L_0x00a3:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.String r1 = "BackgroundThreadExecutor required"
                    r0.<init>(r1)
                    throw r0
                L_0x00ab:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.String r1 = "MainThreadExecutor required"
                    r0.<init>(r1)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: android.arch.p010b.C0070e.C00711.mo115a():java.lang.Object");
            }

            {
                this.f171g = r2;
                this.f172h = r3;
                this.f173i = r4;
                this.f174j = r5;
                this.f175k = r6;
                this.f176l = r7;
            }
        };
        C3950c cVar2 = new C3950c(cVar, r6.f412b);
        this.f19244j = new C6940a<>(cVar2, new C6941b());
        this.f19251q = cVar2;
        cVar2.mo9299c().observeForever(new C7076e(this));
        return this.f19244j;
    }

    /* renamed from: a */
    public final void mo12972a(String str, String str2) {
        this.f19248n.onNext(new Pair(str, str2));
    }

    public FeedRepository(C6957i iVar, FeedApi feedApi, C3809a<FeedDataKey, C2974a> aVar, C3810b<FeedDataKey, FeedItem> bVar, C3809a<Long, Integer> aVar2, C6951a aVar3, C7025n nVar, C6860a aVar4) {
        super(iVar, null, bVar);
        this.f19254t = iVar;
        this.f19241g = feedApi;
        this.f19242h = aVar;
        this.f19253s = aVar2;
        this.f19250p = aVar3;
        this.f19257w = aVar4;
        this.f19232a.mo6181a(this.f19249o.mo6505a((C1710e<? super T>) new C7073b<Object>(this), C7074c.f19278a));
    }
}
