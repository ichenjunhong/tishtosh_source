package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.abtest.AwemeAdRankAb;
import com.p683ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi;
import com.p683ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi.C25634a;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.model.AwemeAdRankSettingsModel;
import com.p683ss.android.ugc.aweme.commercialize.model.C26123g;
import com.p683ss.android.ugc.aweme.commercialize.model.C26125h;
import com.p683ss.android.ugc.aweme.commercialize.settings.AwemeAdRankSettings;
import com.p683ss.android.ugc.aweme.feed.adapter.C30013ad;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30450g;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30450g.C30451a;
import com.p683ss.android.ugc.aweme.feed.panel.C30616b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p001a.C0013i;
import p2628d.C52856t;
import p2628d.C52860x;
import p2628d.p2629a.C52549aa;
import p2628d.p2629a.C52550ab;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2647j.C52751c;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ao */
public final class C26390ao implements C26421bf {

    /* renamed from: a */
    static volatile long f69620a;

    /* renamed from: b */
    public static final C26390ao f69621b = new C26390ao();

    /* renamed from: c */
    private static Timer f69622c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static WeakReference<C30616b> f69623d;

    /* renamed from: e */
    private static volatile boolean f69624e;

    /* renamed from: f */
    private static volatile int f69625f = -1;

    /* renamed from: g */
    private static volatile int f69626g = -1;

    /* renamed from: h */
    private static final Set<Integer> f69627h = new LinkedHashSet();

    /* renamed from: i */
    private static volatile boolean f69628i;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ao$a */
    static final class C26391a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        public static final C26391a f69629a = new C26391a();

        C26391a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            WeakReference a = C26390ao.f69623d;
            if (a != null) {
                C30616b bVar = (C30616b) a.get();
                if (bVar != null) {
                    long j = 0;
                    if (C26390ao.f69620a != 0) {
                        j = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - C26390ao.f69620a);
                    }
                    if (j > C26390ao.m63844a().getRequestPeriod()) {
                        C26390ao aoVar = C26390ao.f69621b;
                        C52711k.m112236a((Object) bVar, "it");
                        int al = bVar.mo60520al();
                        C30013ad V = bVar.mo60500V();
                        C52711k.m112236a((Object) V, "it.adapter");
                        if (aoVar.mo54111a(al, new ArrayList(V.mo60286c()))) {
                            C26390ao.m63846c();
                            C26390ao.f69621b.mo54112b();
                        }
                    }
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ao$b */
    public static final class C26392b implements C25634a {

        /* renamed from: a */
        final /* synthetic */ List f69630a;

        /* renamed from: b */
        final /* synthetic */ Map f69631b;

        /* renamed from: c */
        final /* synthetic */ int f69632c;

        /* renamed from: d */
        final /* synthetic */ long f69633d;

        /* renamed from: e */
        final /* synthetic */ int f69634e;

        /* renamed from: f */
        final /* synthetic */ int f69635f;

        /* renamed from: g */
        final /* synthetic */ List f69636g;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ao$b$a */
        static final class C26393a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C26392b f69637a;

            /* renamed from: b */
            final /* synthetic */ List f69638b;

            /* renamed from: c */
            final /* synthetic */ String f69639c;

            C26393a(C26392b bVar, List list, String str) {
                this.f69637a = bVar;
                this.f69638b = list;
                this.f69639c = str;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                C30616b bVar;
                WeakReference a = C26390ao.f69623d;
                if (a != null) {
                    bVar = (C30616b) a.get();
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    if (this.f69637a.f69634e == bVar.mo60520al()) {
                        if (!(bVar instanceof C30450g)) {
                            bVar = null;
                        }
                        C30450g gVar = (C30450g) bVar;
                        if (gVar != null) {
                            gVar.mo60877a(this.f69638b, this.f69637a.f69632c, this.f69637a.f69635f, new C30451a(this) {

                                /* renamed from: a */
                                final /* synthetic */ C26393a f69640a;

                                {
                                    this.f69640a = r1;
                                }

                                /* renamed from: a */
                                public final void mo54115a(String str, Exception exc) {
                                    if (C26390ao.f69621b.mo54114e()) {
                                        String str2 = "fail";
                                        String valueOf = String.valueOf(str);
                                        Iterable<Aweme> iterable = this.f69640a.f69637a.f69636g;
                                        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                                        for (Aweme aid : iterable) {
                                            arrayList.add(aid.getAid());
                                        }
                                        C26396ap.m63858a(str2, valueOf, (List) arrayList, null, this.f69640a.f69639c);
                                    }
                                }
                            });
                        } else if (C26390ao.f69621b.mo54114e()) {
                            String str = "fail";
                            String str2 = "unsupported_page";
                            Iterable<Aweme> iterable = this.f69637a.f69636g;
                            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                            for (Aweme aid : iterable) {
                                arrayList.add(aid.getAid());
                            }
                            C26396ap.m63858a(str, str2, (List) arrayList, null, this.f69639c);
                        }
                    } else if (C26390ao.f69621b.mo54114e()) {
                        String str3 = "fail";
                        String str4 = "current_item_changed";
                        Iterable<Aweme> iterable2 = this.f69637a.f69636g;
                        Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable2, 10));
                        for (Aweme aid2 : iterable2) {
                            arrayList2.add(aid2.getAid());
                        }
                        C26396ap.m63858a(str3, str4, (List) arrayList2, null, this.f69639c);
                    }
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: a */
        public final void mo52787a(String str) {
            C52711k.m112240b(str, "msg");
            if (C26390ao.f69621b.mo54114e()) {
                String str2 = "fail";
                Iterable<Aweme> iterable = this.f69636g;
                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                for (Aweme aid : iterable) {
                    arrayList.add(aid.getAid());
                }
                C26396ap.m63858a(str2, str, (List) arrayList, null, null);
            }
        }

        /* renamed from: a */
        public final void mo52789a(List<C26123g> list, String str) {
            C52711k.m112240b(list, "awemeAdRankList");
            List<Aweme> e = C52575l.m112139e((Collection<? extends T>) this.f69630a);
            Iterable<C26123g> iterable = list;
            for (C26123g gVar : iterable) {
                Aweme repackAweme = gVar.getRepackAweme();
                if (repackAweme != null && repackAweme.isAd()) {
                    C26088l.m63311b(C11010c.m22280a(), gVar.getRepackAweme());
                }
            }
            Collection arrayList = new ArrayList();
            for (C26123g gVar2 : iterable) {
                Aweme repackAweme2 = gVar2.getRepackAweme();
                if (repackAweme2 == null) {
                    repackAweme2 = (Aweme) this.f69631b.get(gVar2.getAwemeId());
                }
                if (repackAweme2 != null) {
                    arrayList.add(repackAweme2);
                }
            }
            List list2 = (List) arrayList;
            int i = 0;
            for (Object next : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    C52575l.m112100b();
                }
                Aweme aweme = (Aweme) next;
                aweme.awemePosition = this.f69632c + i;
                aweme.setFeedCount(this.f69633d);
                if (aweme.isAd()) {
                    e.remove(aweme);
                }
                i = i2;
            }
            for (Aweme aweme2 : e) {
                Context a = C11010c.m22280a();
                C26088l.m63322b(a, "delete", aweme2, C26088l.m63373m(a, aweme2, "delete"));
            }
            C25945k.m62925p().mo53224a(list2);
            C52670a aVar = new C26393a(this, list2, str);
            C52711k.m112240b(aVar, "block");
            C0013i.m18a((Callable<TResult>) new C26398a<TResult>(aVar), C0013i.f25b);
        }

        /* renamed from: a */
        public final void mo52788a(String str, Exception exc, String str2) {
            String str3;
            C52711k.m112240b(str, "msg");
            if (C26390ao.f69621b.mo54114e()) {
                String str4 = "fail";
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(' ');
                if (exc != null) {
                    str3 = exc.getMessage();
                } else {
                    str3 = null;
                }
                sb.append(str3);
                String sb2 = sb.toString();
                Iterable<Aweme> iterable = this.f69636g;
                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                for (Aweme aid : iterable) {
                    arrayList.add(aid.getAid());
                }
                C26396ap.m63858a(str4, sb2, (List) arrayList, null, str2);
            }
        }

        C26392b(List list, Map map, int i, long j, int i2, int i3, List list2) {
            this.f69630a = list;
            this.f69631b = map;
            this.f69632c = i;
            this.f69633d = j;
            this.f69634e = i2;
            this.f69635f = i3;
            this.f69636g = list2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ao$c */
    public static final class C26395c extends TimerTask {
        C26395c() {
        }

        public final void run() {
            WeakReference a = C26390ao.f69623d;
            if (a != null) {
                C30616b bVar = (C30616b) a.get();
                if (bVar != null) {
                    C26390ao aoVar = C26390ao.f69621b;
                    C52711k.m112236a((Object) bVar, "it");
                    int al = bVar.mo60520al();
                    C30013ad V = bVar.mo60500V();
                    C52711k.m112236a((Object) V, "it.adapter");
                    aoVar.mo54111a(al, new ArrayList(V.mo60286c()));
                }
            }
        }
    }

    private C26390ao() {
    }

    /* renamed from: a */
    public static C26125h m63844a() {
        return AwemeAdRankAb.m62127a();
    }

    /* renamed from: f */
    private static AwemeAdRankSettingsModel m63847f() {
        return AwemeAdRankSettings.get();
    }

    /* renamed from: c */
    public static void m63846c() {
        Timer timer = f69622c;
        if (timer != null) {
            timer.cancel();
        }
        f69622c = null;
    }

    /* renamed from: g */
    private final boolean m63848g() {
        return m63847f().getEnabled();
    }

    /* renamed from: e */
    public final boolean mo54114e() {
        if (m63847f().getEnableUploadRerankResult()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo54113d() {
        if (m63848g() && f69628i) {
            f69623d = null;
            f69628i = false;
            f69625f = -1;
            f69626g = -1;
            f69627h.clear();
            m63846c();
        }
    }

    /* renamed from: b */
    public final void mo54112b() {
        long millis = TimeUnit.SECONDS.toMillis(m63844a().getRequestPeriod());
        f69622c = new Timer();
        C26395c cVar = new C26395c();
        Timer timer = f69622c;
        if (timer != null) {
            timer.schedule(cVar, millis, millis);
        }
    }

    /* renamed from: a */
    public final boolean mo54111a(int i, List<? extends Aweme> list) {
        boolean z;
        boolean z2;
        int i2 = i;
        List<? extends Aweme> list2 = list;
        C52711k.m112240b(list2, "items");
        if (!f69624e || i2 == f69625f || i2 < f69626g || f69627h.contains(Integer.valueOf(i)) || (list.size() - i2) - 1 <= 2) {
            return false;
        }
        long b = C26511e.m64103b();
        if (b <= 0) {
            return false;
        }
        if (C26397aq.m63859a((Aweme) list2.get(i2 + 1)) || C26397aq.m63859a((Aweme) list2.get(i2 + 2)) || b < m63844a().getVisitAdMaxInterval() - 1) {
            z = false;
        } else {
            z = true;
        }
        int i3 = i2 + 2;
        if (!C26397aq.m63859a((Aweme) list2.get(i3)) || b > m63844a().getVisitAdMinInterval() + 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            f69625f = i2;
            f69627h.add(Integer.valueOf(i));
            f69620a = System.currentTimeMillis();
            int size = list.size() - 1;
            long feedCount = ((Aweme) list2.get(i3)).getFeedCount();
            Iterable<Aweme> iterable = list2;
            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
            for (Aweme aweme : iterable) {
                arrayList.add(C52856t.m112465a(aweme.getAid(), aweme));
            }
            Map a = C52550ab.m112048a((Iterable) (List) arrayList);
            Iterable cVar = new C52751c(i3, size);
            Collection arrayList2 = new ArrayList(C52575l.m112104a(cVar, 10));
            Iterator it = cVar.iterator();
            while (it.hasNext()) {
                arrayList2.add((Aweme) list2.get(((C52549aa) it).mo110114a()));
            }
            List list3 = (List) arrayList2;
            Iterable iterable2 = list3;
            Collection arrayList3 = new ArrayList();
            for (Object next : iterable2) {
                if (((Aweme) next).isAd()) {
                    arrayList3.add(next);
                }
            }
            List list4 = (List) arrayList3;
            AwemeAdRankApi awemeAdRankApi = AwemeAdRankApi.f67852a;
            C26392b bVar = new C26392b(list4, a, i3, feedCount, i, size, list3);
            awemeAdRankApi.mo52785a(list3, b, bVar);
            return true;
        }
        StringBuilder sb = new StringBuilder("condition not satisfied: tooLongToSeeAds=");
        sb.append(false);
        sb.append(", tooShortToSeeAds=false");
        return false;
    }

    /* renamed from: a */
    public final void mo54110a(Object obj, int i, Aweme aweme) {
        boolean z;
        C52711k.m112240b(obj, "fragmentPanel");
        f69626g = Math.max(f69626g, i);
        if (m63848g()) {
            if (!f69628i) {
                if (!(obj instanceof C30616b)) {
                    z = false;
                } else {
                    f69623d = new WeakReference<>(obj);
                    z = true;
                }
                f69628i = z;
                if (z) {
                    mo54112b();
                } else {
                    return;
                }
            }
            C52670a aVar = C26391a.f69629a;
            C52711k.m112240b(aVar, "block");
            C0013i.m16a((Callable<TResult>) new C26399ar<TResult>(aVar));
        }
    }
}
