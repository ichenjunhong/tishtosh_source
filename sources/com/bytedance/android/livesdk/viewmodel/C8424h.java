package com.bytedance.android.livesdk.viewmodel;

import com.bytedance.android.live.core.rxutils.C4060h;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.api.PortalApi;
import com.bytedance.android.livesdk.chatroom.api.PortalApi.C4986a;
import com.bytedance.android.livesdk.chatroom.model.C5718ai;
import com.bytedance.android.livesdk.chatroom.model.C5719aj;
import com.bytedance.android.livesdk.chatroom.model.C5720ak;
import com.bytedance.android.livesdk.chatroom.model.C5721al;
import com.bytedance.android.livesdk.chatroom.model.C5722am;
import com.bytedance.android.livesdk.chatroom.model.C5723an;
import com.bytedance.android.livesdk.chatroom.model.C5723an.C5724a;
import com.bytedance.android.livesdk.chatroom.model.C5726ao;
import com.bytedance.android.livesdk.chatroom.model.C5757m;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5702k;
import com.bytedance.android.livesdk.p399o.C8064d;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p094l.C2180b;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.viewmodel.h */
public final class C8424h {

    /* renamed from: e */
    public static final C8425a f22871e = new C8425a(null);

    /* renamed from: a */
    public C5757m f22872a = new C5719aj();

    /* renamed from: b */
    public final C2180b<C52847n<C5757m, C5757m>> f22873b;

    /* renamed from: c */
    public final C2180b<List<C5724a>> f22874c;

    /* renamed from: d */
    public final C2180b<C52847n<Long, Long>> f22875d;

    /* renamed from: com.bytedance.android.livesdk.viewmodel.h$a */
    public static final class C8425a {
        private C8425a() {
        }

        /* renamed from: a */
        public static long m16638a() {
            return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }

        public /* synthetic */ C8425a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m16640a(C1690c cVar, C1689b bVar) {
            C52711k.m112240b(cVar, "$this$bind");
            C52711k.m112240b(bVar, "cd");
            bVar.mo6181a(cVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
            if (r4.getId() == r9) goto L_0x002f;
         */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0012 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.List<com.bytedance.android.livesdk.chatroom.model.C5723an.C5724a> m16639a(java.util.List<? extends com.bytedance.android.livesdk.chatroom.model.C5723an.C5724a> r7, boolean r8, long r9) {
            /*
                java.lang.String r0 = "portals"
                p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Collection r0 = (java.util.Collection) r0
                java.util.Iterator r7 = r7.iterator()
            L_0x0012:
                boolean r1 = r7.hasNext()
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0036
                java.lang.Object r1 = r7.next()
                r4 = r1
                com.bytedance.android.livesdk.chatroom.model.an$a r4 = (com.bytedance.android.livesdk.chatroom.model.C5723an.C5724a) r4
                if (r8 != 0) goto L_0x002f
                com.bytedance.android.live.base.model.user.User r4 = r4.f15063c
                if (r4 == 0) goto L_0x0030
                long r4 = r4.getId()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L_0x0030
            L_0x002f:
                r2 = 1
            L_0x0030:
                if (r2 == 0) goto L_0x0012
                r0.add(r1)
                goto L_0x0012
            L_0x0036:
                java.util.List r0 = (java.util.List) r0
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Collection r7 = (java.util.Collection) r7
                java.util.Iterator r8 = r0.iterator()
            L_0x0045:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x0065
                java.lang.Object r9 = r8.next()
                r10 = r9
                com.bytedance.android.livesdk.chatroom.model.an$a r10 = (com.bytedance.android.livesdk.chatroom.model.C5723an.C5724a) r10
                int r10 = r10.f15069i
                com.bytedance.android.livesdk.chatroom.model.an$b r0 = com.bytedance.android.livesdk.chatroom.model.C5723an.C5725b.FINISHED
                int r0 = r0.ordinal()
                if (r10 == r0) goto L_0x005e
                r10 = 1
                goto L_0x005f
            L_0x005e:
                r10 = 0
            L_0x005f:
                if (r10 == 0) goto L_0x0045
                r7.add(r9)
                goto L_0x0045
            L_0x0065:
                java.util.List r7 = (java.util.List) r7
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.viewmodel.C8424h.C8425a.m16639a(java.util.List, boolean, long):java.util.List");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.h$b */
    static final class C8426b<T> implements C1710e<Long> {

        /* renamed from: a */
        final /* synthetic */ C5720ak f22876a;

        /* renamed from: b */
        final /* synthetic */ C8424h f22877b;

        /* renamed from: c */
        final /* synthetic */ C1689b f22878c;

        C8426b(C5720ak akVar, C8424h hVar, C1689b bVar) {
            this.f22876a = akVar;
            this.f22877b = hVar;
            this.f22878c = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Long l = (Long) obj;
            long a = (this.f22876a.f15042a + this.f22876a.f15043b) - C8425a.m16638a();
            if (a <= 0) {
                this.f22877b.mo14657a((C5757m) new C5719aj());
            } else {
                this.f22877b.f22875d.onNext(C52856t.m112465a(Long.valueOf(a), Long.valueOf(this.f22876a.f15043b)));
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.h$c */
    static final class C8427c<T> implements C1710e<Long> {

        /* renamed from: a */
        final /* synthetic */ C5722am f22879a;

        /* renamed from: b */
        final /* synthetic */ C8424h f22880b;

        /* renamed from: c */
        final /* synthetic */ C1689b f22881c;

        C8427c(C5722am amVar, C8424h hVar, C1689b bVar) {
            this.f22879a = amVar;
            this.f22880b = hVar;
            this.f22881c = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Long l = (Long) obj;
            long a = (this.f22879a.f15054a + this.f22879a.f15055b) - C8425a.m16638a();
            if (a <= 0) {
                this.f22880b.mo14657a((C5757m) new C5719aj());
            } else {
                this.f22880b.f22875d.onNext(C52856t.m112465a(Long.valueOf(a), Long.valueOf(this.f22879a.f15055b)));
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.h$d */
    static final class C8428d<T> implements C1710e<Long> {

        /* renamed from: a */
        final /* synthetic */ C5726ao f22882a;

        /* renamed from: b */
        final /* synthetic */ C8424h f22883b;

        /* renamed from: c */
        final /* synthetic */ C1689b f22884c;

        C8428d(C5726ao aoVar, C8424h hVar, C1689b bVar) {
            this.f22882a = aoVar;
            this.f22883b = hVar;
            this.f22884c = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Long l = (Long) obj;
            long a = (this.f22882a.f15071a + this.f22882a.f15072b) - C8425a.m16638a();
            if (a <= 0) {
                C8424h hVar = this.f22883b;
                C5722am amVar = new C5722am(C8425a.m16638a(), this.f22882a.f15073c, this.f22882a.f15074d, this.f22882a.f15075e, this.f22882a.f15076f, this.f22882a.f15077g);
                hVar.mo14657a((C5757m) amVar);
                return;
            }
            this.f22883b.f22875d.onNext(C52856t.m112465a(Long.valueOf(a), Long.valueOf(this.f22882a.f15072b)));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.h$e */
    static final class C8429e<T> implements C1710e<C4177d<C5702k>> {

        /* renamed from: a */
        final /* synthetic */ C8424h f22885a;

        /* renamed from: b */
        final /* synthetic */ C1689b f22886b;

        C8429e(C8424h hVar, C1689b bVar) {
            this.f22885a = hVar;
            this.f22886b = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            long j = ((C5702k) ((C4177d) obj).data).f14986a;
            C8064d.m16005b();
            StringBuilder sb = new StringBuilder("RECEIVE_INVITATION ping success, nextTimePing=");
            sb.append(j);
            C8064d.m9720b("ttlive_portal", sb.toString());
            if (j >= 1) {
                C1690c f = C2201v.m6592a(j, TimeUnit.SECONDS).mo6545f((C1710e<? super T>) new C1710e<Long>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C8429e f22887a;

                    {
                        this.f22887a = r1;
                    }

                    public final /* synthetic */ void accept(Object obj) {
                        Long l = (Long) obj;
                        this.f22887a.f22885a.mo14660c(this.f22887a.f22886b);
                    }
                });
                C52711k.m112236a((Object) f, "Observable.timer(nextTim…InviteState(disposable) }");
                C8425a.m16640a(f, this.f22886b);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.h$f */
    static final class C8431f<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C8424h f22888a;

        /* renamed from: b */
        final /* synthetic */ C1689b f22889b;

        C8431f(C8424h hVar, C1689b bVar) {
            this.f22888a = hVar;
            this.f22889b = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C8064d.m16005b();
            C52711k.m112236a((Object) th, "t");
            C8064d.m9718a(5, th.getStackTrace());
            C1690c f = C2201v.m6592a(10, TimeUnit.SECONDS).mo6545f((C1710e<? super T>) new C1710e<Long>(this) {

                /* renamed from: a */
                final /* synthetic */ C8431f f22890a;

                {
                    this.f22890a = r1;
                }

                public final /* synthetic */ void accept(Object obj) {
                    Long l = (Long) obj;
                    this.f22890a.f22888a.mo14660c(this.f22890a.f22889b);
                }
            });
            C52711k.m112236a((Object) f, "Observable.timer(RETRY_I…InviteState(disposable) }");
            C8425a.m16640a(f, this.f22889b);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.h$g */
    static final class C8433g<T> implements C1710e<C4177d<C5723an>> {

        /* renamed from: a */
        final /* synthetic */ C5721al f22891a;

        /* renamed from: b */
        final /* synthetic */ C8424h f22892b;

        /* renamed from: c */
        final /* synthetic */ C1689b f22893c;

        C8433g(C5721al alVar, C8424h hVar, C1689b bVar) {
            this.f22891a = alVar;
            this.f22892b = hVar;
            this.f22893c = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
            if (r4 == null) goto L_0x000e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r4) {
            /*
                r3 = this;
                com.bytedance.android.live.network.response.d r4 = (com.bytedance.android.live.network.response.C4177d) r4
                if (r4 == 0) goto L_0x000e
                java.lang.Object r4 = r4.data
                com.bytedance.android.livesdk.chatroom.model.an r4 = (com.bytedance.android.livesdk.chatroom.model.C5723an) r4
                if (r4 == 0) goto L_0x000e
                java.util.List<com.bytedance.android.livesdk.chatroom.model.an$a> r4 = r4.f15060a
                if (r4 != 0) goto L_0x0012
            L_0x000e:
                java.util.List r4 = p2628d.p2629a.C52575l.m112097a()
            L_0x0012:
                com.bytedance.android.livesdk.chatroom.model.al r0 = r3.f22891a
                boolean r0 = r0.f15052c
                com.bytedance.android.livesdk.chatroom.model.al r1 = r3.f22891a
                long r1 = r1.f15051b
                java.util.List r4 = com.bytedance.android.livesdk.viewmodel.C8424h.C8425a.m16639a(r4, r0, r1)
                boolean r0 = r4.isEmpty()
                if (r0 == 0) goto L_0x003b
                com.bytedance.android.livesdk.p399o.C8064d.m16005b()
                java.lang.String r4 = "ttlive_portal"
                java.lang.String r0 = "no visible portals"
                com.bytedance.android.livesdk.p399o.C8064d.m9719a(r4, r0)
                com.bytedance.android.livesdk.viewmodel.h r4 = r3.f22892b
                com.bytedance.android.livesdk.chatroom.model.aj r0 = new com.bytedance.android.livesdk.chatroom.model.aj
                r0.<init>()
                com.bytedance.android.livesdk.chatroom.model.m r0 = (com.bytedance.android.livesdk.chatroom.model.C5757m) r0
                r4.mo14657a(r0)
                return
            L_0x003b:
                com.bytedance.android.livesdk.viewmodel.h r0 = r3.f22892b
                c.a.l.b<java.util.List<com.bytedance.android.livesdk.chatroom.model.an$a>> r0 = r0.f22874c
                r0.onNext(r4)
                r0 = 5
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
                c.a.v r4 = p064c.p065a.C2201v.m6592a(r0, r4)
                com.bytedance.android.livesdk.viewmodel.h$g$1 r0 = new com.bytedance.android.livesdk.viewmodel.h$g$1
                r0.<init>(r3)
                c.a.d.e r0 = (p064c.p065a.p071d.C1710e) r0
                c.a.b.c r4 = r4.mo6545f(r0)
                java.lang.String r0 = "Observable.timer(POLL_IN…llOpenState(disposable) }"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
                c.a.b.b r0 = r3.f22893c
                com.bytedance.android.livesdk.viewmodel.C8424h.C8425a.m16640a(r4, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.viewmodel.C8424h.C8433g.accept(java.lang.Object):void");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.h$h */
    static final class C8435h<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C8424h f22895a;

        /* renamed from: b */
        final /* synthetic */ C1689b f22896b;

        C8435h(C8424h hVar, C1689b bVar) {
            this.f22895a = hVar;
            this.f22896b = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C8064d.m16005b();
            C52711k.m112236a((Object) th, "t");
            C8064d.m9718a(5, th.getStackTrace());
            C1690c f = C2201v.m6592a(10, TimeUnit.SECONDS).mo6545f((C1710e<? super T>) new C1710e<Long>(this) {

                /* renamed from: a */
                final /* synthetic */ C8435h f22897a;

                {
                    this.f22897a = r1;
                }

                public final /* synthetic */ void accept(Object obj) {
                    Long l = (Long) obj;
                    this.f22897a.f22895a.mo14659b(this.f22897a.f22896b);
                }
            });
            C52711k.m112236a((Object) f, "Observable.timer(RETRY_I…llOpenState(disposable) }");
            C8425a.m16640a(f, this.f22896b);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.h$i */
    static final class C8437i<T> implements C1710e<C4177d<C5702k>> {

        /* renamed from: a */
        final /* synthetic */ C8424h f22898a;

        /* renamed from: b */
        final /* synthetic */ C1689b f22899b;

        C8437i(C8424h hVar, C1689b bVar) {
            this.f22898a = hVar;
            this.f22899b = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C4177d dVar = (C4177d) obj;
            if (!((C5702k) dVar.data).f14988c) {
                C8064d.m16005b();
                C8064d.m9720b("ttlive_portal", "WAIT_REWARD ping invalid");
                this.f22898a.mo14657a((C5757m) new C5719aj());
                return;
            }
            long j = ((C5702k) dVar.data).f14986a;
            C8064d.m16005b();
            StringBuilder sb = new StringBuilder("WAIT_REWARD ping success, nextTimePing=");
            sb.append(j);
            sb.append(", luckyMoneyCountDown=");
            sb.append(((C5702k) dVar.data).f14987b);
            C8064d.m9720b("ttlive_portal", sb.toString());
            if (((C5702k) dVar.data).f14987b > 0 && j >= 1) {
                C1690c f = C2201v.m6592a(j, TimeUnit.SECONDS).mo6545f((C1710e<? super T>) new C1710e<Long>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C8437i f22900a;

                    {
                        this.f22900a = r1;
                    }

                    public final /* synthetic */ void accept(Object obj) {
                        Long l = (Long) obj;
                        this.f22900a.f22898a.mo14661d(this.f22900a.f22899b);
                    }
                });
                C52711k.m112236a((Object) f, "Observable.timer(nextTim…llWaitState(disposable) }");
                C8425a.m16640a(f, this.f22899b);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.h$j */
    static final class C8439j<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C8424h f22901a;

        /* renamed from: b */
        final /* synthetic */ C1689b f22902b;

        C8439j(C8424h hVar, C1689b bVar) {
            this.f22901a = hVar;
            this.f22902b = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C8064d.m16005b();
            C52711k.m112236a((Object) th, "t");
            C8064d.m9718a(5, th.getStackTrace());
            C1690c f = C2201v.m6592a(10, TimeUnit.SECONDS).mo6545f((C1710e<? super T>) new C1710e<Long>(this) {

                /* renamed from: a */
                final /* synthetic */ C8439j f22903a;

                {
                    this.f22903a = r1;
                }

                public final /* synthetic */ void accept(Object obj) {
                    Long l = (Long) obj;
                    this.f22903a.f22901a.mo14661d(this.f22903a.f22902b);
                }
            });
            C52711k.m112236a((Object) f, "Observable.timer(RETRY_I…llWaitState(disposable) }");
            C8425a.m16640a(f, this.f22902b);
        }
    }

    /* renamed from: a */
    public final C2201v<List<C5724a>> mo14655a() {
        C2201v<List<C5724a>> a = this.f22874c.mo6514a(C1667a.m5940a());
        C52711k.m112236a((Object) a, "_portalStatsChanged.obse…dSchedulers.mainThread())");
        return a;
    }

    /* renamed from: b */
    public final C2201v<C52847n<Long, Long>> mo14658b() {
        C2201v<C52847n<Long, Long>> a = this.f22875d.mo6514a(C1667a.m5940a());
        C52711k.m112236a((Object) a, "_countDownChanged.observ…dSchedulers.mainThread())");
        return a;
    }

    public C8424h() {
        C2180b<C52847n<C5757m, C5757m>> l = C2180b.m6534l();
        C52711k.m112236a((Object) l, "PublishSubject.create<Pa…ntext, IPortalContext>>()");
        this.f22873b = l;
        C2180b<List<C5724a>> l2 = C2180b.m6534l();
        C52711k.m112236a((Object) l2, "PublishSubject.create<Li…talStatsResult.Portal>>()");
        this.f22874c = l2;
        C2180b<C52847n<Long, Long>> l3 = C2180b.m6534l();
        C52711k.m112236a((Object) l3, "PublishSubject.create<Pair<Long, Long>>()");
        this.f22875d = l3;
    }

    /* renamed from: e */
    private final void m16627e(C1689b bVar) {
        mo14659b(bVar);
    }

    /* renamed from: f */
    private final void m16628f(C1689b bVar) {
        C5757m mVar = this.f22872a;
        if (!(mVar instanceof C5720ak)) {
            mVar = null;
        }
        C5720ak akVar = (C5720ak) mVar;
        if (akVar != null) {
            C1690c f = C4060h.f11209a.mo9417a(0, 1, TimeUnit.SECONDS).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C8426b<Object>(akVar, this, bVar));
            C52711k.m112236a((Object) f, "ObservableCompat.interva…  }\n                    }");
            C8425a.m16640a(f, bVar);
        }
        mo14660c(bVar);
    }

    /* renamed from: g */
    private final void m16629g(C1689b bVar) {
        C5757m mVar = this.f22872a;
        if (!(mVar instanceof C5726ao)) {
            mVar = null;
        }
        C5726ao aoVar = (C5726ao) mVar;
        if (aoVar != null) {
            C1690c f = C4060h.f11209a.mo9417a(0, 1, TimeUnit.SECONDS).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C8428d<Object>(aoVar, this, bVar));
            C52711k.m112236a((Object) f, "ObservableCompat.interva…  }\n                    }");
            C8425a.m16640a(f, bVar);
        }
        mo14661d(bVar);
    }

    /* renamed from: h */
    private final void m16630h(C1689b bVar) {
        C5757m mVar = this.f22872a;
        if (!(mVar instanceof C5722am)) {
            mVar = null;
        }
        C5722am amVar = (C5722am) mVar;
        if (amVar != null) {
            C1690c f = C4060h.f11209a.mo9417a(0, 1, TimeUnit.SECONDS).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C8427c<Object>(amVar, this, bVar));
            C52711k.m112236a((Object) f, "ObservableCompat.interva…  }\n                    }");
            C8425a.m16640a(f, bVar);
        }
    }

    /* renamed from: a */
    public final void mo14656a(C1689b bVar) {
        C52711k.m112240b(bVar, "disposable");
        bVar.mo6180a();
        C5757m mVar = this.f22872a;
        if (!(mVar instanceof C5719aj)) {
            if (mVar instanceof C5721al) {
                m16627e(bVar);
            } else if (mVar instanceof C5720ak) {
                m16628f(bVar);
            } else if (mVar instanceof C5726ao) {
                m16629g(bVar);
            } else if (mVar instanceof C5722am) {
                m16630h(bVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo14657a(C5757m mVar) {
        C52711k.m112240b(mVar, "input");
        C5757m mVar2 = this.f22872a;
        C5757m a = C5718ai.m12615a(mVar2, mVar);
        C8064d.m16005b();
        StringBuilder sb = new StringBuilder("input=");
        sb.append(mVar);
        sb.append(", curState=");
        sb.append(mVar2);
        sb.append(", nextState=");
        sb.append(a);
        C8064d.m9719a("ttlive_portal", sb.toString());
        this.f22872a = a;
        this.f22873b.onNext(C52856t.m112465a(mVar2, a));
    }

    /* renamed from: b */
    public final void mo14659b(C1689b bVar) {
        C5757m mVar = this.f22872a;
        if (!(mVar instanceof C5721al)) {
            mVar = null;
        }
        C5721al alVar = (C5721al) mVar;
        if (alVar != null) {
            C1690c a = ((PortalApi) C4157e.m10322a().mo9550a(PortalApi.class)).stats(alVar.f15050a).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C8433g<Object>(alVar, this, bVar), (C1710e<? super Throwable>) new C8435h<Object>(this, bVar));
            C52711k.m112236a((Object) a, "LiveClient.get().getServ…e)\n                    })");
            C8425a.m16640a(a, bVar);
        }
    }

    /* renamed from: c */
    public final void mo14660c(C1689b bVar) {
        C5757m mVar = this.f22872a;
        if (!(mVar instanceof C5720ak)) {
            mVar = null;
        }
        C5720ak akVar = (C5720ak) mVar;
        if (akVar != null) {
            C1690c a = ((PortalApi) C4157e.m10322a().mo9550a(PortalApi.class)).ping(akVar.f15047f, akVar.f15048g, C4986a.RECEIVE_INVITATION).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C8429e<Object>(this, bVar), (C1710e<? super Throwable>) new C8431f<Object>(this, bVar));
            C52711k.m112236a((Object) a, "LiveClient.get().getServ…e)\n                    })");
            C8425a.m16640a(a, bVar);
        }
    }

    /* renamed from: d */
    public final void mo14661d(C1689b bVar) {
        C5757m mVar = this.f22872a;
        if (!(mVar instanceof C5726ao)) {
            mVar = null;
        }
        C5726ao aoVar = (C5726ao) mVar;
        if (aoVar != null) {
            C1690c a = ((PortalApi) C4157e.m10322a().mo9550a(PortalApi.class)).ping(aoVar.f15076f, aoVar.f15077g, C4986a.WAIT_REWARD).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C8437i<Object>(this, bVar), (C1710e<? super Throwable>) new C8439j<Object>(this, bVar));
            C52711k.m112236a((Object) a, "LiveClient.get().getServ…e)\n                    })");
            C8425a.m16640a(a, bVar);
        }
    }
}
