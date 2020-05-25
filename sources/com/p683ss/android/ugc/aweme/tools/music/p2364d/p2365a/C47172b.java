package com.p683ss.android.ugc.aweme.tools.music.p2364d.p2365a;

import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.component.music.MusicService;
import com.p683ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39540k;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.tools.music.p2364d.p2365a.C47179c.C47180a;
import com.p683ss.android.ugc.aweme.tools.music.p2366e.C47202e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.C53199ae;
import kotlinx.coroutines.C53256be;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52848o;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52635g;
import p2628d.p2631c.p2632a.C52601b;
import p2628d.p2631c.p2633b.p2634a.C52618f;
import p2628d.p2631c.p2633b.p2634a.C52620h;
import p2628d.p2631c.p2633b.p2634a.C52624k;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.b */
public final class C47172b {

    /* renamed from: g */
    public static final C47172b f119095g = C47174b.f119103a;

    /* renamed from: h */
    public static final C47173a f119096h = new C47173a(null);

    /* renamed from: a */
    public C39540k f119097a;

    /* renamed from: b */
    public List<MusicModel> f119098b;

    /* renamed from: c */
    public boolean f119099c;

    /* renamed from: d */
    public boolean f119100d;

    /* renamed from: e */
    public int f119101e;

    /* renamed from: f */
    public boolean f119102f;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.b$a */
    public static final class C47173a {
        private C47173a() {
        }

        /* renamed from: a */
        public static C47172b m102427a() {
            return C47172b.f119095g;
        }

        public /* synthetic */ C47173a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.b$b */
    static final class C47174b {

        /* renamed from: a */
        static final C47172b f119103a = new C47172b(null);

        /* renamed from: b */
        public static final C47174b f119104b = new C47174b();

        private C47174b() {
        }
    }

    @C52618f(mo110254b = "CollectMusicManager.kt", mo110255c = {}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.aweme.tools.music.music.collect.CollectMusicManager$initCollectMusicList$1")
    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.b$c */
    static final class C47175c extends C52624k implements C52682m<C53199ae, C52625c<? super C52860x>, Object> {

        /* renamed from: a */
        int f119105a;

        /* renamed from: b */
        final /* synthetic */ C47172b f119106b;

        /* renamed from: c */
        private C53199ae f119107c;

        C47175c(C47172b bVar, C52625c cVar) {
            this.f119106b = bVar;
            super(2, cVar);
        }

        public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
            C52711k.m112240b(cVar, "completion");
            C47175c cVar2 = new C47175c(this.f119106b, cVar);
            cVar2.f119107c = (C53199ae) obj;
            return cVar2;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C47175c) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.f119105a == 0) {
                C0013i userCollectedMusicList = MusicService.createIMusicServicebyMonsterPlugin().userCollectedMusicList(0, 12);
                if (userCollectedMusicList != null) {
                    userCollectedMusicList.mo19a((C0011g<TResult, TContinuationResult>) new C0011g<TResult, TContinuationResult>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C47175c f119108a;

                        {
                            this.f119108a = r1;
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:47:0x016b  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final /* synthetic */ java.lang.Object then(p001a.C0013i r6) {
                            /*
                                r5 = this;
                                java.lang.String r0 = "task"
                                p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
                                boolean r0 = r6.mo33d()
                                r1 = 10
                                r2 = 0
                                if (r0 != 0) goto L_0x0104
                                boolean r0 = r6.mo26b()
                                if (r0 == 0) goto L_0x0104
                                java.lang.Object r0 = r6.mo34e()
                                if (r0 == 0) goto L_0x00ec
                                com.ss.android.ugc.aweme.tools.music.d.a.b$c r0 = r5.f119108a
                                com.ss.android.ugc.aweme.tools.music.d.a.b r0 = r0.f119106b
                                java.lang.Object r3 = r6.mo34e()
                                java.lang.String r4 = "task.result"
                                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                                com.ss.android.ugc.aweme.music.model.CollectedMusicList r3 = (com.p683ss.android.ugc.aweme.music.model.CollectedMusicList) r3
                                int r3 = r3.cursor
                                r0.f119101e = r3
                                com.ss.android.ugc.aweme.tools.music.d.a.b$c r0 = r5.f119108a
                                com.ss.android.ugc.aweme.tools.music.d.a.b r0 = r0.f119106b
                                java.lang.Object r3 = r6.mo34e()
                                java.lang.String r4 = "task.result"
                                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                                com.ss.android.ugc.aweme.music.model.CollectedMusicList r3 = (com.p683ss.android.ugc.aweme.music.model.CollectedMusicList) r3
                                boolean r3 = r3.isHasMore()
                                r0.f119102f = r3
                                java.lang.Object r0 = r6.mo34e()
                                java.lang.String r3 = "task.result"
                                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
                                com.ss.android.ugc.aweme.music.model.CollectedMusicList r0 = (com.p683ss.android.ugc.aweme.music.model.CollectedMusicList) r0
                                java.util.List<com.ss.android.ugc.aweme.music.model.Music> r0 = r0.items
                                if (r0 == 0) goto L_0x00d3
                                java.lang.Object r0 = r6.mo34e()
                                java.lang.String r3 = "task.result"
                                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
                                com.ss.android.ugc.aweme.music.model.CollectedMusicList r0 = (com.p683ss.android.ugc.aweme.music.model.CollectedMusicList) r0
                                java.util.List<com.ss.android.ugc.aweme.music.model.Music> r0 = r0.items
                                int r0 = r0.size()
                                if (r0 <= 0) goto L_0x00d3
                                java.lang.Object r0 = r6.mo34e()
                                java.lang.String r3 = "task.result"
                                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
                                com.ss.android.ugc.aweme.music.model.CollectedMusicList r0 = (com.p683ss.android.ugc.aweme.music.model.CollectedMusicList) r0
                                com.p683ss.android.ugc.aweme.tools.music.p2364d.p2365a.C47172b.m102421a(r0)
                                com.ss.android.ugc.aweme.tools.music.d.a.b$c r0 = r5.f119108a
                                com.ss.android.ugc.aweme.tools.music.d.a.b r0 = r0.f119106b
                                java.lang.Object r6 = r6.mo34e()
                                java.lang.String r3 = "task.result"
                                p2628d.p2639f.p2641b.C52711k.m112236a(r6, r3)
                                com.ss.android.ugc.aweme.music.model.CollectedMusicList r6 = (com.p683ss.android.ugc.aweme.music.model.CollectedMusicList) r6
                                java.util.List<com.ss.android.ugc.aweme.music.model.Music> r6 = r6.items
                                java.lang.String r3 = "task.result.items"
                                p2628d.p2639f.p2641b.C52711k.m112236a(r6, r3)
                                java.lang.Iterable r6 = (java.lang.Iterable) r6
                                java.util.ArrayList r3 = new java.util.ArrayList
                                int r1 = p2628d.p2629a.C52575l.m112104a(r6, r1)
                                r3.<init>(r1)
                                java.util.Collection r3 = (java.util.Collection) r3
                                java.util.Iterator r6 = r6.iterator()
                            L_0x0099:
                                boolean r1 = r6.hasNext()
                                if (r1 == 0) goto L_0x00ad
                                java.lang.Object r1 = r6.next()
                                com.ss.android.ugc.aweme.music.model.Music r1 = (com.p683ss.android.ugc.aweme.music.model.Music) r1
                                com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r1.convertToMusicModel()
                                r3.add(r1)
                                goto L_0x0099
                            L_0x00ad:
                                java.util.List r3 = (java.util.List) r3
                                java.util.Collection r3 = (java.util.Collection) r3
                                java.util.List r6 = p2628d.p2629a.C52575l.m112139e(r3)
                                r0.mo94419a(r6)
                                com.ss.android.ugc.aweme.tools.music.d.a.b$c r6 = r5.f119108a
                                com.ss.android.ugc.aweme.tools.music.d.a.b r6 = r6.f119106b
                                com.ss.android.ugc.aweme.port.in.ab$k r6 = r6.f119097a
                                if (r6 == 0) goto L_0x00d2
                                com.ss.android.ugc.aweme.tools.music.d.a.b$c r0 = r5.f119108a
                                com.ss.android.ugc.aweme.tools.music.d.a.b r0 = r0.f119106b
                                java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r0 = r0.f119098b
                                com.ss.android.ugc.aweme.tools.music.d.a.b$c r1 = r5.f119108a
                                com.ss.android.ugc.aweme.tools.music.d.a.b r1 = r1.f119106b
                                boolean r1 = r1.f119102f
                                r6.mo80647a(r0, r1)
                                d.x r6 = p2628d.C52860x.f131107a
                                return r6
                            L_0x00d2:
                                return r2
                            L_0x00d3:
                                com.ss.android.ugc.aweme.tools.music.d.a.b$c r6 = r5.f119108a
                                com.ss.android.ugc.aweme.tools.music.d.a.b r6 = r6.f119106b
                                java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r6 = r6.f119098b
                                r6.clear()
                                com.ss.android.ugc.aweme.tools.music.d.a.b$c r6 = r5.f119108a
                                com.ss.android.ugc.aweme.tools.music.d.a.b r6 = r6.f119106b
                                com.ss.android.ugc.aweme.port.in.ab$k r6 = r6.f119097a
                                if (r6 == 0) goto L_0x00eb
                                r6.mo80646a()
                                d.x r2 = p2628d.C52860x.f131107a
                                goto L_0x0171
                            L_0x00eb:
                                return r2
                            L_0x00ec:
                                com.ss.android.ugc.aweme.tools.music.d.a.b$c r6 = r5.f119108a
                                com.ss.android.ugc.aweme.tools.music.d.a.b r6 = r6.f119106b
                                java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r6 = r6.f119098b
                                r6.clear()
                                com.ss.android.ugc.aweme.tools.music.d.a.b$c r6 = r5.f119108a
                                com.ss.android.ugc.aweme.tools.music.d.a.b r6 = r6.f119106b
                                com.ss.android.ugc.aweme.port.in.ab$k r6 = r6.f119097a
                                if (r6 == 0) goto L_0x0103
                                r6.mo80646a()
                                d.x r2 = p2628d.C52860x.f131107a
                                goto L_0x0171
                            L_0x0103:
                                return r2
                            L_0x0104:
                                com.ss.android.ugc.aweme.music.model.CollectedMusicList r6 = com.p683ss.android.ugc.aweme.tools.music.p2364d.p2365a.C47172b.m102422d()
                                if (r6 == 0) goto L_0x0137
                                java.util.List<com.ss.android.ugc.aweme.music.model.Music> r6 = r6.items
                                if (r6 == 0) goto L_0x0137
                                java.lang.Iterable r6 = (java.lang.Iterable) r6
                                java.util.ArrayList r0 = new java.util.ArrayList
                                int r1 = p2628d.p2629a.C52575l.m112104a(r6, r1)
                                r0.<init>(r1)
                                java.util.Collection r0 = (java.util.Collection) r0
                                java.util.Iterator r6 = r6.iterator()
                            L_0x011f:
                                boolean r1 = r6.hasNext()
                                if (r1 == 0) goto L_0x0133
                                java.lang.Object r1 = r6.next()
                                com.ss.android.ugc.aweme.music.model.Music r1 = (com.p683ss.android.ugc.aweme.music.model.Music) r1
                                com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r1.convertToMusicModel()
                                r0.add(r1)
                                goto L_0x011f
                            L_0x0133:
                                r6 = r0
                                java.util.List r6 = (java.util.List) r6
                                goto L_0x0138
                            L_0x0137:
                                r6 = r2
                            L_0x0138:
                                if (r6 == 0) goto L_0x0163
                                boolean r0 = r6.isEmpty()
                                if (r0 != 0) goto L_0x0163
                                com.ss.android.ugc.aweme.tools.music.d.a.b$c r0 = r5.f119108a
                                com.ss.android.ugc.aweme.tools.music.d.a.b r0 = r0.f119106b
                                java.util.Collection r6 = (java.util.Collection) r6
                                java.util.List r6 = p2628d.p2629a.C52575l.m112139e(r6)
                                r0.mo94419a(r6)
                                com.ss.android.ugc.aweme.tools.music.d.a.b$c r6 = r5.f119108a
                                com.ss.android.ugc.aweme.tools.music.d.a.b r6 = r6.f119106b
                                com.ss.android.ugc.aweme.port.in.ab$k r6 = r6.f119097a
                                if (r6 == 0) goto L_0x0162
                                com.ss.android.ugc.aweme.tools.music.d.a.b$c r0 = r5.f119108a
                                com.ss.android.ugc.aweme.tools.music.d.a.b r0 = r0.f119106b
                                java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r0 = r0.f119098b
                                r1 = 0
                                r6.mo80647a(r0, r1)
                                d.x r6 = p2628d.C52860x.f131107a
                                return r6
                            L_0x0162:
                                return r2
                            L_0x0163:
                                com.ss.android.ugc.aweme.tools.music.d.a.b$c r6 = r5.f119108a
                                com.ss.android.ugc.aweme.tools.music.d.a.b r6 = r6.f119106b
                                com.ss.android.ugc.aweme.port.in.ab$k r6 = r6.f119097a
                                if (r6 == 0) goto L_0x0171
                                r6.mo80649c()
                                d.x r6 = p2628d.C52860x.f131107a
                                return r6
                            L_0x0171:
                                return r2
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.music.p2364d.p2365a.C47172b.C47175c.C471761.then(a.i):java.lang.Object");
                        }
                    });
                }
                this.f119106b.f119099c = false;
                return C52860x.f131107a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.b$d */
    static final class C47177d<TTaskResult, TContinuationResult> implements C0011g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ C52625c f119109a;

        /* renamed from: b */
        final /* synthetic */ C47172b f119110b;

        /* renamed from: c */
        final /* synthetic */ int f119111c;

        /* renamed from: d */
        final /* synthetic */ int f119112d;

        C47177d(C52625c cVar, C47172b bVar, int i, int i2) {
            this.f119109a = cVar;
            this.f119110b = bVar;
            this.f119111c = i;
            this.f119112d = i2;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "it");
            if (iVar.mo33d() || !iVar.mo26b()) {
                if (this.f119110b.f119099c) {
                    CollectedMusicList d = C47172b.m102422d();
                    if (d != null) {
                        d.setHasMore(false);
                    }
                    this.f119109a.resumeWith(C52848o.m114620constructorimpl(d));
                } else {
                    this.f119109a.resumeWith(C52848o.m114620constructorimpl(null));
                }
            } else if (iVar.mo34e() != null) {
                this.f119109a.resumeWith(C52848o.m114620constructorimpl(iVar.mo34e()));
                if (this.f119111c == 0) {
                    Object e = iVar.mo34e();
                    C52711k.m112236a(e, "it.result");
                    C47172b.m102421a((CollectedMusicList) e);
                }
            } else {
                this.f119109a.resumeWith(C52848o.m114620constructorimpl(null));
            }
            return C52860x.f131107a;
        }
    }

    @C52618f(mo110254b = "CollectMusicManager.kt", mo110255c = {82}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.aweme.tools.music.music.collect.CollectMusicManager$loadMoreCollectMusic$1")
    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.b$e */
    static final class C47178e extends C52624k implements C52682m<C53199ae, C52625c<? super C52860x>, Object> {

        /* renamed from: a */
        Object f119113a;

        /* renamed from: b */
        int f119114b;

        /* renamed from: c */
        final /* synthetic */ C47172b f119115c;

        /* renamed from: d */
        private C53199ae f119116d;

        C47178e(C47172b bVar, C52625c cVar) {
            this.f119115c = bVar;
            super(2, cVar);
        }

        public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
            C52711k.m112240b(cVar, "completion");
            C47178e eVar = new C47178e(this.f119115c, cVar);
            eVar.f119116d = (C53199ae) obj;
            return eVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C47178e) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
        }

        public final Object invokeSuspend(Object obj) {
            Object a = C52601b.m112157a();
            switch (this.f119114b) {
                case 0:
                    C53199ae aeVar = this.f119116d;
                    C47172b bVar = this.f119115c;
                    int i = this.f119115c.f119101e;
                    this.f119113a = aeVar;
                    this.f119114b = 1;
                    C52635g gVar = new C52635g(C52601b.m112154a(this));
                    C52625c cVar = gVar;
                    C0013i userCollectedMusicList = MusicService.createIMusicServicebyMonsterPlugin().userCollectedMusicList(i, 12);
                    if (userCollectedMusicList != null) {
                        userCollectedMusicList.mo19a((C0011g<TResult, TContinuationResult>) new C47177d<TResult,TContinuationResult>(cVar, bVar, i, 12));
                    }
                    obj = gVar.mo110263a();
                    if (obj == C52601b.m112157a()) {
                        C52620h.m112171b(this);
                    }
                    if (obj == a) {
                        return a;
                    }
                    break;
                case 1:
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CollectedMusicList collectedMusicList = (CollectedMusicList) obj;
            if (collectedMusicList != null) {
                this.f119115c.f119101e = collectedMusicList.cursor;
                this.f119115c.f119102f = collectedMusicList.isHasMore();
                if (collectedMusicList.items != null && collectedMusicList.items.size() > 0) {
                    List<Music> list = collectedMusicList.items;
                    C52711k.m112236a((Object) list, "collectedMusicList.items");
                    Iterable<Music> iterable = list;
                    Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                    for (Music convertToMusicModel : iterable) {
                        arrayList.add(convertToMusicModel.convertToMusicModel());
                    }
                    this.f119115c.f119098b.addAll((List) arrayList);
                }
                C39540k kVar = this.f119115c.f119097a;
                if (kVar != null) {
                    kVar.mo80647a(this.f119115c.f119098b, this.f119115c.f119102f);
                }
            } else {
                C39540k kVar2 = this.f119115c.f119097a;
                if (kVar2 != null) {
                    kVar2.mo80647a(this.f119115c.f119098b, false);
                }
            }
            this.f119115c.f119100d = true;
            return C52860x.f131107a;
        }
    }

    private C47172b() {
        this.f119098b = new ArrayList();
    }

    /* renamed from: a */
    public final void mo94418a() {
        this.f119099c = true;
        this.f119101e = 0;
        C53301g.m113291a(C53256be.f131885a, null, null, new C47175c(this, null), 3, null);
    }

    /* renamed from: b */
    public final void mo94420b() {
        if (!this.f119099c) {
            mo94418a();
            return;
        }
        C39540k kVar = this.f119097a;
        if (kVar != null) {
            kVar.mo80648b();
        }
    }

    /* renamed from: c */
    public final void mo94421c() {
        this.f119100d = true;
        C53301g.m113291a(C53256be.f131885a, null, null, new C47178e(this, null), 3, null);
    }

    /* renamed from: d */
    public static CollectedMusicList m102422d() {
        boolean z;
        String string = C47180a.m102428a().f119119a.getString("collect_music_list", "");
        CharSequence charSequence = string;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                return (CollectedMusicList) C47202e.m102460a().mo34884a(string, CollectedMusicList.class);
            } catch (Exception unused) {
                Editor edit = C47180a.m102428a().f119119a.edit();
                edit.remove("collect_music_list");
                edit.commit();
            }
        }
        return null;
    }

    public /* synthetic */ C47172b(C52707g gVar) {
        this();
    }

    /* renamed from: a */
    public final void mo94419a(List<MusicModel> list) {
        C52711k.m112240b(list, "<set-?>");
        this.f119098b = list;
    }

    /* renamed from: a */
    public static void m102421a(CollectedMusicList collectedMusicList) {
        C47179c a = C47180a.m102428a();
        String b = C47202e.m102460a().mo34889b(collectedMusicList);
        C52711k.m112236a((Object) b, "GSON.toJson(collectMusicList)");
        C52711k.m112240b(b, "musicListString");
        Editor edit = a.f119119a.edit();
        edit.putString("collect_music_list", b);
        edit.commit();
    }
}
