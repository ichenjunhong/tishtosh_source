package com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.viewmodel;

import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.p702im.core.p706c.C11203l;
import com.bytedance.p702im.core.p706c.C11205n;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p706c.C11210q;
import com.bytedance.p702im.core.p706c.C11238s;
import com.bytedance.p702im.core.p706c.C11241u;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33888y;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.OnlyPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryVideoContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.common.C33992a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.common.C33999d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.common.ListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.C34707b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.DragViewInfo;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.p1871b.C34710a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.DragView.IViewInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p2628d.C52668f;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel */
public final class MediaBrowserViewModel extends ListViewModel<C34710a<BaseContent>> implements C33992a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f89458a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MediaBrowserViewModel.class), "unInitializerError", "getUnInitializerError()Ljava/lang/Exception;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MediaBrowserViewModel.class), "initialData", "getInitialData()Ljava/util/List;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MediaBrowserViewModel.class), "serverCommand", "getServerCommand()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MediaBrowserViewModel.class), "clientList", "getClientList()Ljava/util/List;"))};

    /* renamed from: c */
    public static final C34734a f89459c = new C34734a(null);

    /* renamed from: b */
    public long f89460b = -1;

    /* renamed from: d */
    private boolean f89461d;

    /* renamed from: f */
    private final C52668f f89462f = C34747e.m78779a(C34741h.f89474a);

    /* renamed from: g */
    private final C52668f f89463g = C34747e.m78779a(C34736c.f89471a);

    /* renamed from: h */
    private final List<Integer> f89464h = C52575l.m112101c(Integer.valueOf(30), Integer.valueOf(27), Integer.valueOf(2));

    /* renamed from: i */
    private C11210q f89465i;

    /* renamed from: j */
    private C34707b f89466j;

    /* renamed from: k */
    private IViewInfo f89467k;

    /* renamed from: l */
    private final C52668f f89468l = C34747e.m78779a(C34740g.f89473a);

    /* renamed from: m */
    private final C52668f f89469m = C34747e.m78779a(C34735b.f89470a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel$a */
    public static final class C34734a {
        private C34734a() {
        }

        public /* synthetic */ C34734a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static MediaBrowserViewModel m78773a(FragmentActivity fragmentActivity) {
            C52711k.m112240b(fragmentActivity, "activity");
            C0209x a = C0214z.m440a(fragmentActivity).mo359a(MediaBrowserViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…serViewModel::class.java)");
            return (MediaBrowserViewModel) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel$b */
    static final class C34735b extends C52712l implements C52670a<List<C34744b>> {

        /* renamed from: a */
        public static final C34735b f89470a = new C34735b();

        C34735b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel$c */
    static final class C34736c extends C52712l implements C52670a<List<C34710a<BaseContent>>> {

        /* renamed from: a */
        public static final C34736c f89471a = new C34736c();

        C34736c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel$d */
    public static final class C34737d extends C52712l implements C52671b<C34744b, C52860x> {
        public static final C34737d INSTANCE = new C34737d();

        C34737d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C34744b bVar = (C34744b) obj;
            C52711k.m112240b(bVar, "it");
            bVar.mo72778h();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel$e */
    public static final class C34738e extends C52712l implements C52671b<C34744b, C52860x> {
        public static final C34738e INSTANCE = new C34738e();

        C34738e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C34744b bVar = (C34744b) obj;
            C52711k.m112240b(bVar, "it");
            bVar.mo72777g();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel$f */
    public static final class C34739f<T> implements C0199s<C34748f> {

        /* renamed from: a */
        final /* synthetic */ C34745c f89472a;

        public C34739f(C34745c cVar) {
            this.f89472a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C34748f fVar = (C34748f) obj;
            if (fVar != null) {
                switch (C34746d.f89479a[fVar.ordinal()]) {
                    case 1:
                        return;
                    case 2:
                        this.f89472a.mo72758k();
                        break;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel$g */
    static final class C34740g extends C52712l implements C52670a<C23275b<C34748f>> {

        /* renamed from: a */
        public static final C34740g f89473a = new C34740g();

        C34740g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23275b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel$h */
    static final class C34741h extends C52712l implements C52670a<Exception> {

        /* renamed from: a */
        public static final C34741h f89474a = new C34741h();

        C34741h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new Exception("ViewModel unInitialized");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel$i */
    public static final class C34742i extends C52712l implements C52671b<C34744b, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34743a f89475a;

        public C34742i(C34743a aVar) {
            this.f89475a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C34744b bVar = (C34744b) obj;
            C52711k.m112240b(bVar, "it");
            bVar.mo72771a(this.f89475a);
            return C52860x.f131107a;
        }
    }

    /* renamed from: l */
    private final Exception m78752l() {
        return (Exception) this.f89462f.getValue();
    }

    /* renamed from: m */
    private final List<C34710a<BaseContent>> m78753m() {
        return (List) this.f89463g.getValue();
    }

    /* renamed from: a */
    public final void mo20721a(int i, C11207p pVar) {
    }

    /* renamed from: a */
    public final void mo20722a(int i, C11238s sVar) {
    }

    /* renamed from: a */
    public final void mo20723a(int i, C11241u uVar) {
    }

    /* renamed from: a */
    public final void mo20724a(C11207p pVar) {
    }

    /* renamed from: a */
    public final void mo20725a(C11207p pVar, Map<String, List<C11205n>> map, Map<String, List<C11205n>> map2) {
    }

    /* renamed from: a */
    public final void mo20726a(List<C11207p> list, int i) {
    }

    /* renamed from: a */
    public final void mo20727a(boolean z) {
    }

    /* renamed from: b */
    public final void mo20728b(int i, C11207p pVar) {
    }

    /* renamed from: b */
    public final void mo20729b(C11207p pVar) {
    }

    /* renamed from: c */
    public final void mo20730c(List<C11207p> list) {
    }

    /* renamed from: e */
    public final void mo20732e(List<C11207p> list) {
    }

    /* renamed from: f */
    public final C23275b<C34748f> mo72803f() {
        return (C23275b) this.f89468l.getValue();
    }

    /* renamed from: f */
    public final void mo20733f(List<C11241u> list) {
    }

    /* renamed from: g */
    public final List<C34744b> mo72804g() {
        return (List) this.f89469m.getValue();
    }

    public final void onCleared() {
        super.onCleared();
        C11210q qVar = this.f89465i;
        if (qVar == null) {
            C52711k.m112237a("model");
        }
        qVar.mo20828a();
    }

    /* renamed from: e */
    public final void mo72802e() {
        if (!this.f89461d) {
            mo71928h().mo71936a((Throwable) m78752l());
            return;
        }
        StringBuilder sb = new StringBuilder("loadLatest: ");
        C11210q qVar = this.f89465i;
        if (qVar == null) {
            C52711k.m112237a("model");
        }
        sb.append(qVar.f30215d.size());
        mo71925d().mo71937a(true);
        C11210q qVar2 = this.f89465i;
        if (qVar2 == null) {
            C52711k.m112237a("model");
        }
        qVar2.mo20830b();
    }

    /* renamed from: a */
    public final void mo72799a() {
        if (!this.f89461d) {
            mo71924c().mo71936a((Throwable) m78752l());
            return;
        }
        m78749a(m78753m());
        mo71924c().f87916b = false;
        mo71924c().mo71938b(true);
    }

    /* renamed from: a */
    private final void m78749a(List<C34710a<BaseContent>> list) {
        Object value = mo71922b().getValue();
        if (value == null) {
            C52711k.m112234a();
        }
        List list2 = (List) value;
        list2.clear();
        if (list != null) {
            list2.addAll(C52575l.m112132c((Iterable<? extends T>) list));
        }
    }

    /* renamed from: a */
    private final IViewInfo m78748a(long j) {
        C34707b bVar = this.f89466j;
        if (bVar == null) {
            C52711k.m112237a("param");
        }
        ArrayList<DragViewInfo> arrayList = bVar.f89408d;
        if (arrayList != null) {
            for (DragViewInfo dragViewInfo : arrayList) {
                if (dragViewInfo.f89367a == j && dragViewInfo.f89368b != null) {
                    IViewInfo iViewInfo = dragViewInfo.f89368b;
                    if (iViewInfo == null) {
                        C52711k.m112234a();
                    }
                    return iViewInfo;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private final List<C11207p> m78750b(List<C11207p> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C52575l.m112097a();
        }
        Iterable iterable = list;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (this.f89464h.contains(Integer.valueOf(((C11207p) next).getMsgType()))) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    /* renamed from: d */
    public final void mo20731d(List<C11207p> list) {
        Integer num;
        boolean z;
        StringBuilder sb = new StringBuilder("onLoadMore: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        sb.append(num);
        sb.append(", ");
        C11210q qVar = this.f89465i;
        if (qVar == null) {
            C52711k.m112237a("model");
        }
        sb.append(qVar.f30215d.size());
        C11210q qVar2 = this.f89465i;
        if (qVar2 == null) {
            C52711k.m112237a("model");
        }
        m78749a(m78751g(qVar2.mo20831c()));
        C33999d d = mo71925d();
        Collection collection = list;
        boolean z2 = false;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && list.size() >= 20) {
            z2 = true;
        }
        d.f87916b = z2;
        mo71925d().mo71938b(true);
    }

    /* renamed from: g */
    private final List<C34710a<BaseContent>> m78751g(List<C11207p> list) {
        boolean z;
        boolean z2;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C52575l.m112097a();
        }
        Iterable<C11207p> b = m78750b(list);
        Collection arrayList = new ArrayList(C52575l.m112104a(b, 10));
        for (C11207p pVar : b) {
            BaseContent parse = C33888y.valueOf(pVar).parse(pVar);
            C52711k.m112236a((Object) parse, "MessageViewType.valueOf(it).parse(it)");
            arrayList.add(new C34710a(parse, pVar, m78748a(pVar.getIndex())));
        }
        Iterable iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList();
        for (Object next : iterable) {
            BaseContent baseContent = (BaseContent) ((C34710a) next).f89410a;
            if ((baseContent instanceof StoryVideoContent) || (baseContent instanceof StoryPictureContent) || (baseContent instanceof OnlyPictureContent)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                arrayList2.add(next);
            }
        }
        return (List) arrayList2;
    }

    /* renamed from: a */
    public final void mo72801a(C52671b<? super C34744b, C52860x> bVar) {
        for (C34744b invoke : mo72804g()) {
            bVar.invoke(invoke);
        }
    }

    /* renamed from: a */
    public final void mo72800a(C34707b bVar, IViewInfo iViewInfo) {
        C52711k.m112240b(bVar, "param");
        C52711k.m112240b(iViewInfo, "defaultViewInfo");
        List b = m78750b(bVar.f89407c);
        this.f89466j = bVar;
        this.f89467k = iViewInfo;
        this.f89465i = new C11210q(bVar.f89405a, C52575l.m112134c((Collection<Integer>) this.f89464h), 20);
        C11210q qVar = this.f89465i;
        if (qVar == null) {
            C52711k.m112237a("model");
        }
        qVar.mo20829a((C11203l) this);
        C11210q qVar2 = this.f89465i;
        if (qVar2 == null) {
            C52711k.m112237a("model");
        }
        qVar2.f30215d.addAll(b);
        C34707b bVar2 = this.f89466j;
        if (bVar2 == null) {
            C52711k.m112237a("param");
        }
        C11207p pVar = bVar2.f89406b;
        if (pVar != null) {
            this.f89460b = pVar.getIndex();
        }
        m78753m().clear();
        m78753m().addAll(m78751g(b));
        mo71922b().setValue(new ArrayList());
        this.f89461d = true;
    }
}
