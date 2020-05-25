package com.p683ss.android.ugc.aweme.mix;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11936w;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p064c.p065a.C2200u;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.mix.MixDetailViewModel */
public final class MixDetailViewModel extends JediViewModel<MixDetailState> {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f94485d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MixDetailViewModel.class), "mMixDetailRepository", "getMMixDetailRepository()Lcom/ss/android/ugc/aweme/mix/MixDetailRepository;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MixDetailViewModel.class), "requestIdService", "getRequestIdService()Lcom/ss/android/ugc/aweme/awemeservice/api/IRequestIdService;"))};

    /* renamed from: e */
    public volatile int f94486e = 2;

    /* renamed from: f */
    public volatile C37090u f94487f;

    /* renamed from: g */
    public boolean f94488g;

    /* renamed from: h */
    public final ListMiddleware<MixDetailState, Aweme, C37094w> f94489h = new ListMiddleware<>(new C36992c(this), new C36997d(this), C36999e.f94510a, new C37000f(this));

    /* renamed from: i */
    public volatile String f94490i;

    /* renamed from: j */
    public volatile MixInfo f94491j;

    /* renamed from: k */
    public volatile boolean f94492k;

    /* renamed from: l */
    public volatile int f94493l = -1;

    /* renamed from: m */
    public volatile boolean f94494m = true;

    /* renamed from: n */
    public volatile boolean f94495n = true;

    /* renamed from: o */
    private final C52668f f94496o = C52732g.m112286a(C52757k.NONE, C36991b.f94501a);

    /* renamed from: p */
    private final C52668f f94497p = C52732g.m112285a(C37002h.f94513a);

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailViewModel$a */
    static final class C36990a<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ MixDetailViewModel f94498a;

        /* renamed from: b */
        final /* synthetic */ int f94499b;

        /* renamed from: c */
        final /* synthetic */ MixDetailState f94500c;

        C36990a(MixDetailViewModel mixDetailViewModel, int i, MixDetailState mixDetailState) {
            this.f94498a = mixDetailViewModel;
            this.f94499b = i;
            this.f94500c = mixDetailState;
        }

        public final /* synthetic */ Object apply(Object obj) {
            boolean z;
            String str;
            MixList mixList = (MixList) obj;
            C52711k.m112240b(mixList, "it");
            int i = 0;
            if (this.f94499b != 2) {
                z = ((C37094w) this.f94500c.getListState().getPayload()).f94746d;
            } else if (mixList.hasMore == 1) {
                z = true;
            } else {
                z = false;
            }
            LogPbBean logPbBean = mixList.logPb;
            if (logPbBean != null) {
                str = logPbBean.getImprId();
            } else {
                str = null;
            }
            C29981aa.m70153a().mo60162a(str, mixList.logPb);
            List<Aweme> list = mixList.awemeList;
            if (list != null) {
                for (Object next : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C52575l.m112100b();
                    }
                    Aweme aweme = (Aweme) next;
                    C52711k.m112236a((Object) aweme, "aweme");
                    aweme.setRequestId(str);
                    IRequestIdService f = this.f94498a.mo76323f();
                    StringBuilder sb = new StringBuilder();
                    sb.append(aweme.getAid());
                    sb.append(19);
                    f.setRequestIdAndIndex(sb.toString(), str, i);
                    i = i2;
                }
            }
            int min = Math.min((int) mixList.minCursor, ((C37094w) this.f94500c.getListState().getPayload()).f94745c);
            int max = Math.max((int) mixList.cursor, ((C37094w) this.f94500c.getListState().getPayload()).f31450b);
            List<Aweme> list2 = mixList.awemeList;
            if (list2 == null) {
                list2 = C52575l.m112097a();
            }
            C52847n a = C52856t.m112465a(list2, new C37094w(true, max, min, z));
            this.f94498a.mo76320a(z, (long) min);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailViewModel$b */
    static final class C36991b extends C52712l implements C52670a<C37083n> {

        /* renamed from: a */
        public static final C36991b f94501a = new C36991b();

        C36991b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C37083n();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailViewModel$c */
    static final class C36992c extends C52712l implements C52671b<MixDetailState, C2201v<C52847n<? extends List<? extends Aweme>, ? extends C37094w>>> {

        /* renamed from: a */
        final /* synthetic */ MixDetailViewModel f94502a;

        C36992c(MixDetailViewModel mixDetailViewModel) {
            this.f94502a = mixDetailViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C2201v vVar;
            final MixDetailState mixDetailState = (MixDetailState) obj;
            C52711k.m112240b(mixDetailState, "state");
            if (this.f94502a.f94491j != null) {
                vVar = C2201v.m6614b(this.f94502a.f94491j);
                C52711k.m112236a((Object) vVar, "Observable.just(cacheMixInfo)");
            } else {
                C37083n e = this.f94502a.mo76322e();
                String str = this.f94502a.f94490i;
                if (str == null) {
                    C52711k.m112234a();
                }
                C52711k.m112240b(str, "mixId");
                vVar = e.f94723a.mo22318c(new C37088s(str)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a());
                C52711k.m112236a((Object) vVar, "mMixInfoFetcher.request(…dSchedulers.mainThread())");
            }
            C2201v d = vVar.mo6540d((C1710e<? super T>) new C1710e<MixInfo>(this) {

                /* renamed from: a */
                final /* synthetic */ C36992c f94503a;

                {
                    this.f94503a = r1;
                }

                public final /* synthetic */ void accept(Object obj) {
                    final MixInfo mixInfo = (MixInfo) obj;
                    if (mixInfo == null) {
                        C52711k.m112234a();
                    }
                    this.f94503a.f94502a.f94491j = mixInfo;
                    this.f94503a.f94502a.mo22530c(new C52671b<MixDetailState, MixDetailState>() {
                        public final /* synthetic */ Object invoke(Object obj) {
                            MixDetailState mixDetailState = (MixDetailState) obj;
                            C52711k.m112240b(mixDetailState, "$receiver");
                            return MixDetailState.copy$default(mixDetailState, null, new C11936w(mixInfo), null, null, 0, 29, null);
                        }
                    });
                }
            }).mo6520a((C1711f<? super T, ? extends C2206z<? extends R>>) new C1711f<T, C2206z<? extends R>>(this) {

                /* renamed from: a */
                final /* synthetic */ C36992c f94505a;

                {
                    this.f94505a = r1;
                }

                /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
                /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
                /* JADX WARNING: Removed duplicated region for block: B:19:0x0075  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ java.lang.Object apply(java.lang.Object r11) {
                    /*
                        r10 = this;
                        r0 = r11
                        com.ss.android.ugc.aweme.mix.MixInfo r0 = (com.p683ss.android.ugc.aweme.mix.MixInfo) r0
                        if (r0 != 0) goto L_0x0008
                        p2628d.p2639f.p2641b.C52711k.m112234a()
                    L_0x0008:
                        com.ss.android.ugc.aweme.mix.MixDetailViewModel$c r1 = r10.f94505a
                        com.ss.android.ugc.aweme.mix.MixDetailViewModel r1 = r1.f94502a
                        com.ss.android.ugc.aweme.mix.MixDetailState r2 = r4
                        com.ss.android.ugc.aweme.feed.model.MixStruct r0 = r0.mixInfo
                        if (r0 == 0) goto L_0x001d
                        com.ss.android.ugc.aweme.feed.model.MixStatisStruct r0 = r0.statis
                        if (r0 == 0) goto L_0x001d
                        long r3 = r0.updatedToEpisode
                        java.lang.Long r0 = java.lang.Long.valueOf(r3)
                        goto L_0x001e
                    L_0x001d:
                        r0 = 0
                    L_0x001e:
                        int r3 = r1.f94493l
                        r4 = -1
                        r5 = 1
                        if (r3 == r4) goto L_0x0035
                        int r2 = r1.f94493l
                        int r2 = r2 + 1
                        long r2 = (long) r2
                        long r2 = com.p683ss.android.ugc.aweme.mix.MixCellStyleExperiment.m83208a(r0, r2)
                        long r2 = java.lang.Math.max(r5, r2)
                        r1.f94493l = r4
                        goto L_0x0049
                    L_0x0035:
                        java.lang.Long r1 = r2.getEnterEpisodeNum()
                        if (r1 == 0) goto L_0x0040
                        long r1 = r1.longValue()
                        goto L_0x0041
                    L_0x0040:
                        r1 = r5
                    L_0x0041:
                        long r0 = com.p683ss.android.ugc.aweme.mix.MixCellStyleExperiment.m83208a(r0, r1)
                        long r2 = java.lang.Math.max(r0, r5)
                    L_0x0049:
                        r0 = 4
                        java.lang.String r1 = "MixDetailFragment"
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder
                        java.lang.String r7 = "refresh:"
                        r4.<init>(r7)
                        com.ss.android.ugc.aweme.mix.MixDetailState r7 = r4
                        java.lang.String r7 = r7.getMixId()
                        r4.append(r7)
                        java.lang.String r7 = ",num:"
                        r4.append(r7)
                        r4.append(r2)
                        java.lang.String r4 = r4.toString()
                        com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r0, r1, r4)
                        r0 = 2
                        long r0 = r2 - r0
                        r7 = 0
                        int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                        if (r4 >= 0) goto L_0x0077
                        long r0 = r2 - r5
                    L_0x0077:
                        r4 = r0
                        com.ss.android.ugc.aweme.mix.MixDetailViewModel$c r0 = r10.f94505a
                        com.ss.android.ugc.aweme.mix.MixDetailViewModel r0 = r0.f94502a
                        com.ss.android.ugc.aweme.mix.n r2 = r0.mo76322e()
                        com.ss.android.ugc.aweme.mix.MixDetailState r0 = r4
                        java.lang.String r3 = r0.getMixId()
                        com.ss.android.ugc.aweme.mix.MixDetailState r0 = r4
                        int r6 = r0.getPullType()
                        r7 = 0
                        r8 = 8
                        r9 = 0
                        c.a.v r0 = com.p683ss.android.ugc.aweme.mix.C37083n.m83303a(r2, r3, r4, r6, r7, r8, r9)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.mix.MixDetailViewModel.C36992c.C369952.apply(java.lang.Object):java.lang.Object");
                }
            }).mo6541d((C1711f<? super T, ? extends R>) new C1711f<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C36992c f94507a;

                {
                    this.f94507a = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    String str;
                    boolean z;
                    MixList mixList = (MixList) obj;
                    C52711k.m112240b(mixList, "it");
                    LogPbBean logPbBean = mixList.logPb;
                    if (logPbBean != null) {
                        str = logPbBean.getImprId();
                    } else {
                        str = null;
                    }
                    C29981aa.m70153a().mo60162a(str, mixList.logPb);
                    List<Aweme> list = mixList.awemeList;
                    boolean z2 = false;
                    if (list != null) {
                        int i = 0;
                        for (Object next : list) {
                            int i2 = i + 1;
                            if (i < 0) {
                                C52575l.m112100b();
                            }
                            Aweme aweme = (Aweme) next;
                            C52711k.m112236a((Object) aweme, "aweme");
                            aweme.setRequestId(str);
                            IRequestIdService f = this.f94507a.f94502a.mo76323f();
                            StringBuilder sb = new StringBuilder();
                            sb.append(aweme.getAid());
                            sb.append(19);
                            f.setRequestIdAndIndex(sb.toString(), str, i);
                            i = i2;
                        }
                    }
                    List<Aweme> list2 = mixList.awemeList;
                    if (list2 == null) {
                        list2 = C52575l.m112097a();
                    }
                    int i3 = (int) mixList.cursor;
                    int i4 = (int) mixList.minCursor;
                    if (mixList.hasMore == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C52847n a = C52856t.m112465a(list2, new C37094w(true, i3, i4, z));
                    MixDetailViewModel mixDetailViewModel = this.f94507a.f94502a;
                    if (mixList.hasMore == 1) {
                        z2 = true;
                    }
                    mixDetailViewModel.mo76320a(z2, mixList.minCursor);
                    return a;
                }
            });
            C52711k.m112236a((Object) d, "mixInfo.doOnNext { info … result\n                }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailViewModel$d */
    static final class C36997d extends C52712l implements C52671b<MixDetailState, C2201v<C52847n<? extends List<? extends Aweme>, ? extends C37094w>>> {

        /* renamed from: a */
        final /* synthetic */ MixDetailViewModel f94508a;

        C36997d(MixDetailViewModel mixDetailViewModel) {
            this.f94508a = mixDetailViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            long j;
            MixDetailState mixDetailState = (MixDetailState) obj;
            C52711k.m112240b(mixDetailState, "state");
            int pullType = mixDetailState.getPullType();
            this.f94508a.f94486e = pullType;
            if (pullType != 2) {
                if (this.f94508a.f94488g) {
                    C37090u uVar = this.f94508a.f94487f;
                    if (uVar != null) {
                        uVar.mo76379d(false);
                    }
                } else {
                    C37090u uVar2 = this.f94508a.f94487f;
                    if (uVar2 != null) {
                        uVar2.mo76379d(false);
                    }
                }
                j = (long) ((C37094w) mixDetailState.getListState().getPayload()).f94745c;
            } else {
                C37090u uVar3 = this.f94508a.f94487f;
                if (uVar3 != null) {
                    uVar3.mo76379d(true);
                }
                j = (long) ((C37094w) mixDetailState.getListState().getPayload()).f31450b;
            }
            long j2 = j;
            StringBuilder sb = new StringBuilder("loadMore:pullType->");
            sb.append(pullType);
            sb.append(",cursor->");
            sb.append(j2);
            C32458a.m75141a(4, "MixDetailFragment", sb.toString());
            MixDetailViewModel mixDetailViewModel = this.f94508a;
            C2201v d = C37083n.m83303a(mixDetailViewModel.mo76322e(), mixDetailState.getMixId(), j2, pullType, 0, 8, null).mo6541d((C1711f<? super T, ? extends R>) new C36990a<Object,Object>(mixDetailViewModel, pullType, mixDetailState));
            C52711k.m112236a((Object) d, "mMixDetailRepository.get…         result\n        }");
            C2201v b = d.mo6530b((C1710e<? super C2200u<T>>) new C1710e<C2200u<C52847n<? extends List<? extends Aweme>, ? extends C37094w>>>(this) {

                /* renamed from: a */
                final /* synthetic */ C36997d f94509a;

                {
                    this.f94509a = r1;
                }

                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C2200u uVar = (C2200u) obj;
                    this.f94509a.f94508a.f94492k = false;
                }
            });
            C52711k.m112236a((Object) b, "doLoadMore(state, cursor…State()\n                }");
            return b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailViewModel$e */
    static final class C36999e extends C52712l implements C52682m<List<? extends Aweme>, List<? extends Aweme>, List<? extends Aweme>> {

        /* renamed from: a */
        public static final C36999e f94510a = new C36999e();

        C36999e() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj2;
            C52711k.m112240b((List) obj, "list");
            C52711k.m112240b(list, "refresh");
            Iterable iterable = list;
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object next : iterable) {
                if (hashSet.add(((Aweme) next).getAid())) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailViewModel$f */
    static final class C37000f extends C52712l implements C52682m<List<? extends Aweme>, List<? extends Aweme>, List<? extends Aweme>> {

        /* renamed from: a */
        final /* synthetic */ MixDetailViewModel f94511a;

        C37000f(MixDetailViewModel mixDetailViewModel) {
            this.f94511a = mixDetailViewModel;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            C52711k.m112240b(list, "list");
            C52711k.m112240b(list2, "loadMore");
            StringBuilder sb = new StringBuilder("loadMore:State:");
            sb.append(this.f94511a.f94486e);
            C32458a.m75141a(4, "MixDetailFragment", sb.toString());
            List arrayList = new ArrayList();
            if (this.f94511a.f94486e != 2) {
                arrayList.addAll(list2);
                arrayList.addAll(list);
            } else {
                arrayList.addAll(list);
                arrayList.addAll(list2);
            }
            C32458a.m75141a(4, "MixDetailFragment", "loadMore:return result!");
            Iterable iterable = arrayList;
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object next : iterable) {
                if (hashSet.add(((Aweme) next).getAid())) {
                    arrayList2.add(next);
                }
            }
            return arrayList2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailViewModel$g */
    static final class C37001g extends C52712l implements C52682m<MixDetailState, ListState<Aweme, C37094w>, MixDetailState> {

        /* renamed from: a */
        public static final C37001g f94512a = new C37001g();

        C37001g() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            MixDetailState mixDetailState = (MixDetailState) obj;
            ListState listState = (ListState) obj2;
            C52711k.m112240b(mixDetailState, "$receiver");
            C52711k.m112240b(listState, "it");
            return MixDetailState.copy$default(mixDetailState, null, null, listState, null, 0, 27, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailViewModel$h */
    static final class C37002h extends C52712l implements C52670a<IRequestIdService> {

        /* renamed from: a */
        public static final C37002h f94513a = new C37002h();

        C37002h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C23325e.m57379a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailViewModel$i */
    static final class C37003i extends C52712l implements C52671b<MixDetailState, MixDetailState> {

        /* renamed from: a */
        final /* synthetic */ int f94514a;

        C37003i(int i) {
            this.f94514a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            MixDetailState mixDetailState = (MixDetailState) obj;
            C52711k.m112240b(mixDetailState, "$receiver");
            return MixDetailState.copy$default(mixDetailState, null, null, null, null, this.f94514a, 15, null);
        }
    }

    /* renamed from: e */
    public final C37083n mo76322e() {
        return (C37083n) this.f94496o.getValue();
    }

    /* renamed from: f */
    public final IRequestIdService mo76323f() {
        return (IRequestIdService) this.f94497p.getValue();
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        MixDetailState mixDetailState = new MixDetailState(null, null, null, null, 0, 31, null);
        return mixDetailState;
    }

    /* renamed from: d */
    public final void mo22532d() {
        super.mo22532d();
        ListMiddleware<MixDetailState, Aweme, C37094w> listMiddleware = this.f94489h;
        listMiddleware.mo22635a(C37084o.f94725a, (C52682m<? super S, ? super PROP, ? extends S>) C37001g.f94512a);
        mo22525a(listMiddleware);
    }

    /* renamed from: c */
    private void m83213c(int i) {
        mo22530c(new C37003i(i));
    }

    /* renamed from: b */
    public final void mo76321b(int i) {
        m83213c(2);
        this.f94493l = i;
        this.f94494m = true;
        this.f94495n = true;
        this.f94489h.mo22565b();
    }

    /* renamed from: a */
    public final void mo76319a(int i) {
        StringBuilder sb = new StringBuilder("loadMore:");
        sb.append(i);
        sb.append("，isInLoadMore:");
        sb.append(this.f94492k);
        C32458a.m75150b("MixDetailFragment", sb.toString());
        if (!this.f94492k) {
            this.f94492k = true;
            m83213c(i);
            this.f94489h.mo22567c();
        }
    }

    /* renamed from: a */
    public final void mo76320a(boolean z, long j) {
        boolean z2;
        this.f94494m = z;
        if (j != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f94495n = z2;
    }
}
