package com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.content.Context;
import com.bytedance.apm.p501q.C9190h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2181a.C42989b;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2182b.C43000a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43020d;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43026j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.g */
public final class C43040g {

    /* renamed from: a */
    public static final C43040g f108647a = new C43040g();

    /* renamed from: b */
    public static final C43041a f108648b = new C43041a(null);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.g$a */
    public static final class C43041a {
        private C43041a() {
        }

        /* renamed from: a */
        public static C43040g m94322a() {
            return C43040g.f108647a;
        }

        public /* synthetic */ C43041a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.g$b */
    static final class C43042b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ int f108649a;

        /* renamed from: b */
        final /* synthetic */ String f108650b;

        C43042b(int i, String str) {
            this.f108649a = i;
            this.f108650b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<C42482c> call() {
            try {
                return C39630m.m88234a().mo58604b().mo80570a(this.f108649a, this.f108650b);
            } catch (Exception e) {
                C43048i.m94340a(false, e);
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.g$c */
    static final class C43043c<TTaskResult, TContinuationResult> implements C0011g<List<? extends C42482c>, Object> {

        /* renamed from: a */
        final /* synthetic */ C43040g f108651a;

        /* renamed from: b */
        final /* synthetic */ C43020d f108652b;

        /* renamed from: c */
        final /* synthetic */ int f108653c;

        C43043c(C43040g gVar, C43020d dVar, int i) {
            this.f108651a = gVar;
            this.f108652b = dVar;
            this.f108653c = i;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            if (iVar == null || iVar.mo34e() == null) {
                C43020d dVar = this.f108652b;
                if (dVar != null) {
                    dVar.mo87298a(new Exception());
                }
            } else if (C9190h.m18253a((List) iVar.mo34e())) {
                C43020d dVar2 = this.f108652b;
                if (dVar2 != null) {
                    dVar2.mo87298a(new Exception());
                }
            } else {
                Object e = iVar.mo34e();
                C52711k.m112236a(e, "task.result");
                List<C42482c> e2 = C52575l.m112139e((Collection) e);
                for (C42482c a : e2) {
                    C43036f.f108637b.mo87416a(a);
                }
                C43020d dVar3 = this.f108652b;
                if (dVar3 != null) {
                    dVar3.mo87299a(this.f108651a.mo87421a(e2, this.f108653c));
                }
                C43048i.m94340a(true, null);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.g$d */
    public static final class C43044d implements IFetchResourcesListener {

        /* renamed from: a */
        final /* synthetic */ C43040g f108654a;

        /* renamed from: b */
        final /* synthetic */ C43026j f108655b;

        /* renamed from: c */
        final /* synthetic */ int f108656c;

        /* renamed from: d */
        final /* synthetic */ String f108657d;

        /* renamed from: e */
        final /* synthetic */ Context f108658e;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.g$d$a */
        public static final class C43045a implements C43020d {

            /* renamed from: a */
            final /* synthetic */ C43044d f108659a;

            /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.g$d$a$a */
            public static final class C43046a extends C42989b {

                /* renamed from: a */
                final /* synthetic */ C43045a f108660a;

                C43046a(C43045a aVar) {
                    this.f108660a = aVar;
                }

                /* renamed from: a */
                public final void mo87296a(C42482c cVar, boolean z) {
                    if (!z) {
                        C43026j jVar = this.f108660a.f108659a.f108655b;
                        if (jVar != null) {
                            jVar.mo87398a(cVar, null);
                        }
                    }
                }

                /* renamed from: b */
                public final void mo87297b(C42482c cVar, boolean z) {
                    if (z) {
                        C43026j jVar = this.f108660a.f108659a.f108655b;
                        if (jVar != null) {
                            jVar.mo87397a(cVar);
                        }
                    } else {
                        C43026j jVar2 = this.f108660a.f108659a.f108655b;
                        if (jVar2 != null) {
                            jVar2.mo87401b(cVar, null);
                        }
                    }
                }
            }

            C43045a(C43044d dVar) {
                this.f108659a = dVar;
            }

            /* renamed from: a */
            public final void mo87298a(Exception exc) {
                C43026j jVar = this.f108659a.f108655b;
                if (jVar != null) {
                    jVar.mo87402b(exc);
                }
            }

            /* renamed from: a */
            public final void mo87299a(List<? extends C42482c> list) {
                C42482c cVar = null;
                if (C9190h.m18253a(list)) {
                    C43026j jVar = this.f108659a.f108655b;
                    if (jVar != null) {
                        jVar.mo87402b(null);
                        return;
                    }
                    return;
                }
                C43026j jVar2 = this.f108659a.f108655b;
                if (jVar2 != null) {
                    jVar2.mo87400a(list);
                }
                Context context = this.f108659a.f108658e;
                if (list != null) {
                    cVar = (C42482c) list.get(0);
                }
                C43000a.f108582a.mo87390a(context, cVar, new C43046a(this));
            }
        }

        public final void onFailed(Exception exc) {
            C52711k.m112240b(exc, "e");
            C43026j jVar = this.f108655b;
            if (jVar != null) {
                jVar.mo87399a(exc);
            }
        }

        public final void onSuccess(String[] strArr) {
            C52711k.m112240b(strArr, "requirements");
            C43026j jVar = this.f108655b;
            if (jVar != null) {
                jVar.mo87396a();
            }
            this.f108654a.mo87422a(this.f108656c, this.f108657d, new C43045a(this));
        }

        C43044d(C43040g gVar, C43026j jVar, int i, String str, Context context) {
            this.f108654a = gVar;
            this.f108655b = jVar;
            this.f108656c = i;
            this.f108657d = str;
            this.f108658e = context;
        }
    }

    private C43040g() {
    }

    /* renamed from: b */
    private static List<C42482c> m94319b(List<? extends C42482c> list, int i) {
        int i2;
        int i3;
        if (!C9190h.m18253a(list)) {
            if (list == null) {
                C52711k.m112234a();
            }
            if (list.size() > 10) {
                Collections.shuffle(list);
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    i2 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    C42482c cVar = (C42482c) it.next();
                    if (cVar.getStickPointMusicAlg() == null) {
                        i3 = 0;
                    } else {
                        i3 = cVar.getStickPointMusicAlg().getMinSeg();
                    }
                    if (cVar.getStickPointMusicAlg() != null) {
                        i2 = cVar.getStickPointMusicAlg().getMaxSeg();
                    }
                    if (i2 <= 0 && i3 <= 0) {
                        arrayList.add(cVar);
                    } else if (i3 <= i && i2 >= i) {
                        arrayList.add(cVar);
                    }
                }
                if (arrayList.size() <= 10) {
                    return arrayList;
                }
                ArrayList arrayList2 = new ArrayList(10);
                while (i2 < 10) {
                    arrayList2.add(arrayList.get(i2));
                    i2++;
                }
                return arrayList2;
            }
        }
        return list;
    }

    /* renamed from: a */
    public final List<C42482c> mo87421a(List<C42482c> list, int i) {
        C42482c cVar;
        C42482c b = C43214dh.m94817a().mo50201b();
        List<C42482c> list2 = null;
        if (b != null) {
            C43036f.f108637b.mo87416a(b);
            if (C9190h.m18253a(list)) {
                list2 = new ArrayList<>();
            } else {
                if (list == null) {
                    C52711k.m112234a();
                }
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        cVar = null;
                        break;
                    }
                    cVar = (C42482c) it.next();
                    if (cVar.getId() == b.getId()) {
                        break;
                    }
                }
                if (cVar != null) {
                    list.remove(cVar);
                }
                List b2 = m94319b(list, i);
                if (b2 != null) {
                    list2 = C52575l.m112139e((Collection<? extends T>) b2);
                }
            }
            if (list2 == null) {
                C52711k.m112234a();
            }
            list2.add(0, b);
            return list2;
        } else if (C9190h.m18253a(list)) {
            return null;
        } else {
            List b3 = m94319b(list, i);
            if (b3 != null) {
                list2 = C52575l.m112139e((Collection<? extends T>) b3);
            }
            return list2;
        }
    }

    /* renamed from: a */
    public final void mo87422a(int i, String str, C43020d dVar) {
        C0013i.m16a((Callable<TResult>) new C43042b<TResult>(i, str)).mo20a((C0011g<TResult, TContinuationResult>) new C43043c<TResult,TContinuationResult>(this, dVar, i), C0013i.f25b);
    }
}
