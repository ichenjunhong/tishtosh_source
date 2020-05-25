package com.p683ss.android.ugc.aweme.detail.operators;

import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.base.api.p1406a.C23454a;
import com.p683ss.android.ugc.aweme.detail.operators.C27419al.C27420a;
import com.p683ss.android.ugc.aweme.detail.operators.C27419al.C27421b;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27366a;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27368b;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27380m;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30504w;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.p1807im.service.C35440f;
import com.p683ss.android.ugc.aweme.p1807im.service.C35440f.C35441a;
import com.p683ss.android.ugc.aweme.p1807im.service.C35440f.C35442b;
import com.p683ss.android.ugc.aweme.p1807im.service.C35440f.C35443c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.ak */
public final class C27414ak implements C27380m, C27419al, C27420a, C27421b, C35441a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f72163a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27414ak.class), "batchModel", "getBatchModel()Lcom/ss/android/ugc/aweme/detail/presenter/BatchDetailModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27414ak.class), "batchPresenter", "getBatchPresenter()Lcom/ss/android/ugc/aweme/detail/presenter/BatchDetailPresenter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27414ak.class), "data", "getData()Ljava/util/List;"))};

    /* renamed from: b */
    public static final C27415a f72164b = new C27415a(null);

    /* renamed from: c */
    private final C52668f f72165c = C52732g.m112285a(new C27416b(this));

    /* renamed from: d */
    private final C52668f f72166d = C52732g.m112285a(C27417c.f72179a);

    /* renamed from: e */
    private final C52668f f72167e = C52732g.m112285a(C27418d.f72180a);

    /* renamed from: f */
    private int f72168f = 1;

    /* renamed from: g */
    private C35443c f72169g;

    /* renamed from: h */
    private boolean f72170h;

    /* renamed from: i */
    private boolean f72171i;

    /* renamed from: j */
    private C27424ao f72172j;

    /* renamed from: k */
    private long f72173k;

    /* renamed from: l */
    private boolean f72174l = true;

    /* renamed from: m */
    private final C35440f f72175m;

    /* renamed from: n */
    private final Aweme f72176n;

    /* renamed from: o */
    private final boolean f72177o;

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.ak$a */
    public static final class C27415a {
        private C27415a() {
        }

        public /* synthetic */ C27415a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.ak$b */
    static final class C27416b extends C52712l implements C52670a<C27366a> {

        /* renamed from: a */
        final /* synthetic */ C27414ak f72178a;

        C27416b(C27414ak akVar) {
            this.f72178a = akVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C27366a(this.f72178a.getPageType(0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.ak$c */
    static final class C27417c extends C52712l implements C52670a<C27368b> {

        /* renamed from: a */
        public static final C27417c f72179a = new C27417c();

        C27417c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C27368b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.ak$d */
    static final class C27418d extends C52712l implements C52670a<List<Aweme>> {

        /* renamed from: a */
        public static final C27418d f72180a = new C27418d();

        C27418d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: b */
    private final C27366a m66042b() {
        return (C27366a) this.f72165c.getValue();
    }

    /* renamed from: c */
    private final C27368b m66044c() {
        return (C27368b) this.f72166d.getValue();
    }

    /* renamed from: d */
    private final List<Aweme> m66047d() {
        return (List) this.f72167e.getValue();
    }

    /* renamed from: a */
    public final boolean mo55879a() {
        return true;
    }

    public final void bindPreLoadView(C30504w wVar) {
    }

    public final boolean cannotLoadLatest() {
        return false;
    }

    public final boolean cannotLoadMore() {
        return false;
    }

    public final int getPageType(int i) {
        return 7000;
    }

    public final Object getViewModel() {
        return m66042b();
    }

    public final boolean isDataEmpty() {
        return m66047d().isEmpty();
    }

    public final void unInit() {
        this.f72172j = null;
        m66047d().clear();
        m66044c().mo46991S_();
        m66044c().aq_();
        this.f72175m.mo71167a();
    }

    public final boolean isLoading() {
        boolean z;
        StringBuilder sb = new StringBuilder("isLoading: ");
        if (this.f72170h || m66044c().mo54804o()) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        if (this.f72170h || m66044c().mo54804o()) {
            return true;
        }
        return false;
    }

    public final void setPreLoad(boolean z) {
        this.f72171i = z;
    }

    /* renamed from: d */
    private final void m66048d(C35443c cVar) {
        this.f72169g = cVar;
        this.f72170h = false;
    }

    public final boolean init(Fragment fragment) {
        C52711k.m112240b(fragment, "owner");
        if (this.f72177o && this.f72176n != null) {
            this.f72174l = true;
        }
        return true;
    }

    /* renamed from: a */
    private final long m66041a(boolean z) {
        Object g;
        long j = -1;
        if (m66047d().isEmpty()) {
            return -1;
        }
        if (z) {
            g = C52575l.m112137e(m66047d());
        } else {
            g = C52575l.m112142g(m66047d());
        }
        try {
            String aid = ((Aweme) g).getAid();
            C52711k.m112236a((Object) aid, "aweme.aid");
            j = Long.parseLong(aid);
        } catch (Exception unused) {
        }
        return j;
    }

    /* renamed from: b */
    public final void mo55880b(C35443c cVar) {
        C52711k.m112240b(cVar, "response");
        m66048d(cVar);
        if (cVar.f91109a.isEmpty()) {
            C27424ao aoVar = this.f72172j;
            if (aoVar != null) {
                aoVar.mo55806d(this.f72171i);
            }
            this.f72171i = false;
            C27424ao aoVar2 = this.f72172j;
            if (aoVar2 != null) {
                aoVar2.mo47029c(m66047d(), cVar.f91110b);
            }
        } else {
            m66044c().mo44934a_(m66046d(cVar.f91109a));
        }
    }

    public final void bindView(C27424ao aoVar) {
        C52711k.m112240b(aoVar, "detailFragmentPanel");
        this.f72172j = aoVar;
        m66044c().mo54800a(this);
        m66044c().mo54799a(m66042b());
        this.f72175m.mo71169a((C35441a) this);
    }

    /* renamed from: c */
    public final void mo55881c(C35443c cVar) {
        C52711k.m112240b(cVar, "response");
        m66048d(cVar);
        if (cVar.f91109a.isEmpty()) {
            C27424ao aoVar = this.f72172j;
            if (aoVar != null) {
                aoVar.mo55806d(this.f72171i);
            }
            this.f72171i = false;
            C27424ao aoVar2 = this.f72172j;
            if (aoVar2 != null) {
                aoVar2.mo47026b(m66047d(), cVar.f91110b);
            }
        } else {
            m66044c().mo44934a_(m66046d(cVar.f91109a));
        }
    }

    /* renamed from: c */
    private final void m66045c(List<Aweme> list) {
        boolean z;
        Collection collection = list;
        int i = 0;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int size = list.size();
            C35443c cVar = this.f72169g;
            if (cVar != null) {
                List<C35442b> list2 = cVar.f91109a;
                if (list2 != null && size == list2.size()) {
                    C35443c cVar2 = this.f72169g;
                    if (cVar2 == null) {
                        C52711k.m112234a();
                    }
                    List<C35442b> list3 = cVar2.f91109a;
                    List arrayList = new ArrayList();
                    arrayList.addAll(collection);
                    list.clear();
                    for (Object next : arrayList) {
                        int i2 = i + 1;
                        if (i < 0) {
                            C52575l.m112100b();
                        }
                        Aweme aweme = (Aweme) next;
                        Aweme aweme2 = new Aweme();
                        C35442b bVar = (C35442b) list3.get(i);
                        C52711k.m112239a((Object) aweme.getAid(), (Object) bVar.f91107a);
                        aweme2.setAid(String.valueOf(bVar.f91108b));
                        aweme2.setAwemeType(13);
                        aweme2.setForwardItem(aweme);
                        list.add(aweme2);
                        i = i2;
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private static String m66046d(List<C35442b> list) {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[");
        String str = ",";
        for (C35442b bVar : list) {
            sb.append(bVar.f91107a);
            sb.append(str);
        }
        C52830p.m112428a((CharSequence) sb, (CharSequence) str);
        sb.append("]");
        String sb2 = sb.toString();
        C52711k.m112236a((Object) sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: a */
    public final void mo55878a(C35443c cVar) {
        C52711k.m112240b(cVar, "response");
        m66048d(cVar);
        if (cVar.f91109a.isEmpty()) {
            m66047d().clear();
            C27424ao aoVar = this.f72172j;
            if (aoVar != null) {
                aoVar.mo47018a(m66047d(), cVar.f91110b);
            }
        } else {
            m66044c().mo44934a_(m66046d(cVar.f91109a));
        }
    }

    public final boolean deleteItem(String str) {
        C52711k.m112240b(str, "aid");
        this.f72175m.mo71170a(str);
        int size = m66047d().size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            Aweme forwardItem = ((Aweme) m66047d().get(i)).getForwardItem();
            C52711k.m112236a((Object) forwardItem, "realAweme");
            if (TextUtils.equals(forwardItem.getAid(), str)) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return false;
        }
        m66047d().remove(i);
        this.f72173k = System.currentTimeMillis();
        C27424ao aoVar = this.f72172j;
        if (aoVar != null) {
            aoVar.mo50466c_(i);
        }
        return true;
    }

    /* renamed from: b */
    private final void m66043b(List<Aweme> list) {
        boolean z;
        if (this.f72169g != null) {
            Iterable<Aweme> iterable = list;
            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
            for (Aweme aid : iterable) {
                arrayList.add(aid.getAid());
            }
            List e = C52575l.m112139e((Collection<? extends T>) (List) arrayList);
            List arrayList2 = new ArrayList();
            C35443c cVar = this.f72169g;
            if (cVar == null) {
                C52711k.m112234a();
            }
            arrayList2.addAll(cVar.f91109a);
            int i = 0;
            for (Object next : arrayList2) {
                int i2 = i + 1;
                if (i < 0) {
                    C52575l.m112100b();
                }
                C35442b bVar = (C35442b) next;
                int size = e.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        if (TextUtils.equals((CharSequence) e.get(i3), bVar.f91107a) && i == i3) {
                            z = true;
                            break;
                        }
                        i3++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    Aweme aweme = new Aweme();
                    AwemeStatus awemeStatus = new AwemeStatus();
                    aweme.setCanPlay(false);
                    awemeStatus.setDelete(true);
                    aweme.setStatus(awemeStatus);
                    User user = new User();
                    user.setAdFake(false);
                    aweme.setAuthor(user);
                    aweme.setAid(bVar.f91107a);
                    list.add(i, aweme);
                    e.add(i, bVar.f91107a);
                }
                i = i2;
            }
        }
    }

    /* renamed from: a */
    public final void mo55791a(Exception exc) {
        if (!(exc instanceof C23454a) || ((C23454a) exc).getErrorCode() != 2053) {
            boolean z = this.f72171i;
            this.f72169g = null;
            C27424ao aoVar = this.f72172j;
            if (aoVar != null) {
                aoVar.mo55806d(this.f72171i);
            }
            this.f72171i = false;
            if (!z) {
                switch (this.f72168f) {
                    case 1:
                        C27424ao aoVar2 = this.f72172j;
                        if (aoVar2 != null) {
                            aoVar2.mo47025b(exc);
                            break;
                        } else {
                            return;
                        }
                    case 2:
                        C27424ao aoVar3 = this.f72172j;
                        if (aoVar3 != null) {
                            aoVar3.mo47024a_(exc);
                            break;
                        } else {
                            return;
                        }
                    default:
                        C27424ao aoVar4 = this.f72172j;
                        if (aoVar4 != null) {
                            aoVar4.mo47028c(exc);
                            return;
                        }
                        break;
                }
            }
            return;
        }
        mo55793a(null);
    }

    /* renamed from: a */
    public final void mo55793a(List<Aweme> list) {
        Object obj;
        boolean z;
        StringBuilder sb = new StringBuilder("onBatchDetailSuccess: ");
        if (list != null) {
            obj = Integer.valueOf(list.size());
        } else {
            obj = null;
        }
        sb.append(obj);
        C35443c cVar = this.f72169g;
        if (cVar != null) {
            z = cVar.f91110b;
        } else {
            z = false;
        }
        C27424ao aoVar = this.f72172j;
        if (aoVar != null) {
            aoVar.mo55806d(this.f72171i);
        }
        this.f72171i = false;
        if (list == null) {
            list = new ArrayList<>();
        }
        m66043b(list);
        m66045c(list);
        this.f72169g = null;
        switch (this.f72168f) {
            case 1:
                m66047d().clear();
                m66047d().addAll(list);
                C27424ao aoVar2 = this.f72172j;
                if (aoVar2 != null) {
                    aoVar2.mo47018a(m66047d(), z);
                    break;
                } else {
                    return;
                }
            case 2:
                m66047d().addAll(0, list);
                C27424ao aoVar3 = this.f72172j;
                if (aoVar3 != null) {
                    aoVar3.mo47029c(m66047d(), !list.isEmpty());
                    break;
                } else {
                    return;
                }
            default:
                m66047d().addAll(list);
                C27424ao aoVar4 = this.f72172j;
                if (aoVar4 != null) {
                    aoVar4.mo47026b(m66047d(), z);
                    return;
                }
                break;
        }
    }

    public C27414ak(C35440f fVar, Aweme aweme, boolean z) {
        C52711k.m112240b(fVar, "provider");
        this.f72175m = fVar;
        this.f72176n = aweme;
        this.f72177o = z;
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        C52711k.m112240b(bVar, "feedParam");
        if (!isLoading() && System.currentTimeMillis() - this.f72173k >= 500) {
            C27424ao aoVar = this.f72172j;
            if (aoVar != null) {
                aoVar.mo55806d(this.f72171i);
            }
            this.f72168f = i;
            this.f72170h = true;
            if (!this.f72177o || !this.f72174l || this.f72176n == null) {
                switch (i) {
                    case 1:
                        this.f72175m.mo71172b();
                        return;
                    case 2:
                        this.f72175m.mo71173b(m66041a(true));
                        return;
                    default:
                        this.f72175m.mo71168a(m66041a(false));
                        return;
                }
            } else {
                this.f72174l = false;
                m66048d(this.f72175m.mo71171b(true));
                List arrayList = new ArrayList();
                Aweme aweme = this.f72176n;
                if (aweme == null) {
                    C52711k.m112234a();
                }
                arrayList.add(aweme);
                mo55793a(arrayList);
            }
        }
    }
}
