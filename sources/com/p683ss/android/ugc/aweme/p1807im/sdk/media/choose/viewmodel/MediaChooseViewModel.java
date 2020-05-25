package com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.viewmodel;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.common.ListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1854c.C34452a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1854c.C34454b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1854c.C34456c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d.C34463a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d.C34469b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d.C34469b.C34470a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1849a.C34406a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1851c.C34415c;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaChooseViewModel */
public class MediaChooseViewModel extends ListViewModel<C34409a> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88931a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MediaChooseViewModel.class), "albumList", "getAlbumList()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MediaChooseViewModel.class), "selectedMediaList", "getSelectedMediaList()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MediaChooseViewModel.class), "selectedAlbum", "getSelectedAlbum()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MediaChooseViewModel.class), "disposable", "getDisposable()Lio/reactivex/disposables/CompositeDisposable;"))};

    /* renamed from: d */
    public static final C34482a f88932d = new C34482a(null);

    /* renamed from: b */
    public C34469b f88933b = C34470a.m78403a();

    /* renamed from: c */
    public boolean f88934c;

    /* renamed from: f */
    private final C52668f f88935f = C52732g.m112285a(C34483b.f88939a);

    /* renamed from: g */
    private final C52668f f88936g = C52732g.m112285a(C34490i.f88950a);

    /* renamed from: h */
    private final C52668f f88937h = C52732g.m112285a(C34489h.f88949a);

    /* renamed from: i */
    private final C52668f f88938i = C52732g.m112285a(C34484c.f88940a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaChooseViewModel$a */
    public static final class C34482a {
        private C34482a() {
        }

        public /* synthetic */ C34482a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static MediaChooseViewModel m78424a(FragmentActivity fragmentActivity) {
            C52711k.m112240b(fragmentActivity, "activity");
            C0209x a = C0214z.m440a(fragmentActivity).mo359a(MediaChooseViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…oseViewModel::class.java)");
            return (MediaChooseViewModel) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaChooseViewModel$b */
    static final class C34483b extends C52712l implements C52670a<C23275b<List<C34463a>>> {

        /* renamed from: a */
        public static final C34483b f88939a = new C34483b();

        C34483b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23275b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaChooseViewModel$c */
    static final class C34484c extends C52712l implements C52670a<C1689b> {

        /* renamed from: a */
        public static final C34484c f88940a = new C34484c();

        C34484c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C1689b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaChooseViewModel$d */
    static final class C34485d<T> implements C2205y<T> {

        /* renamed from: a */
        final /* synthetic */ MediaChooseViewModel f88941a;

        C34485d(MediaChooseViewModel mediaChooseViewModel) {
            this.f88941a = mediaChooseViewModel;
        }

        public final void subscribe(C2204x<List<C34463a>> xVar) {
            C52711k.m112240b(xVar, "emitter");
            try {
                C34406a.m78356a(xVar, this.f88941a.mo72514m());
            } catch (Throwable th) {
                C34406a.m78357a(xVar, th);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaChooseViewModel$e */
    static final class C34486e<T> implements C1710e<List<C34463a>> {

        /* renamed from: a */
        final /* synthetic */ MediaChooseViewModel f88942a;

        C34486e(MediaChooseViewModel mediaChooseViewModel) {
            this.f88942a = mediaChooseViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            this.f88942a.mo72506a().setValue(list);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C34463a aVar = (C34463a) it.next();
                if (aVar.f88897b) {
                    this.f88942a.mo72511f().setValue(aVar);
                    break;
                }
            }
            if (this.f88942a.mo72511f().getValue() == null) {
                C52711k.m112236a((Object) list, "list");
                if (!list.isEmpty()) {
                    this.f88942a.mo72511f().setValue(list.get(0));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaChooseViewModel$f */
    static final class C34487f<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ MediaChooseViewModel f88943a;

        C34487f(MediaChooseViewModel mediaChooseViewModel) {
            this.f88943a = mediaChooseViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            C32458a.m75148a((Throwable) obj);
            this.f88943a.mo72506a().setValue(new ArrayList());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaChooseViewModel$g */
    static final class C34488g extends C52712l implements C52671b<Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ MediaChooseViewModel f88944a;

        /* renamed from: b */
        final /* synthetic */ List f88945b;

        /* renamed from: c */
        final /* synthetic */ C34409a f88946c;

        /* renamed from: d */
        final /* synthetic */ C52671b f88947d;

        /* renamed from: e */
        final /* synthetic */ Context f88948e;

        C34488g(MediaChooseViewModel mediaChooseViewModel, List list, C34409a aVar, C52671b bVar, Context context) {
            this.f88944a = mediaChooseViewModel;
            this.f88945b = list;
            this.f88946c = aVar;
            this.f88947d = bVar;
            this.f88948e = context;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                this.f88945b.add(this.f88946c);
                this.f88944a.mo72510e().setValue(this.f88945b);
                C52671b bVar = this.f88947d;
                Object value = this.f88944a.mo72510e().getValue();
                if (value == null) {
                    C52711k.m112234a();
                }
                bVar.invoke(Integer.valueOf(((List) value).size()));
            } else {
                C10691a.m21542b(this.f88948e, (int) R.string.gj0).mo19066a();
                this.f88947d.invoke(Integer.valueOf(-1));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaChooseViewModel$h */
    static final class C34489h extends C52712l implements C52670a<C23275b<C34463a>> {

        /* renamed from: a */
        public static final C34489h f88949a = new C34489h();

        C34489h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23275b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaChooseViewModel$i */
    static final class C34490i extends C52712l implements C52670a<C23275b<List<C34409a>>> {

        /* renamed from: a */
        public static final C34490i f88950a = new C34490i();

        C34490i() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23275b();
        }
    }

    /* renamed from: a */
    public final C23275b<List<C34463a>> mo72506a() {
        return (C23275b) this.f88935f.getValue();
    }

    /* renamed from: e */
    public final C23275b<List<C34409a>> mo72510e() {
        return (C23275b) this.f88936g.getValue();
    }

    /* renamed from: f */
    public final C23275b<C34463a> mo72511f() {
        return (C23275b) this.f88937h.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C1689b mo72512g() {
        return (C1689b) this.f88938i.getValue();
    }

    public void onCleared() {
        super.onCleared();
        mo72512g().mo6180a();
    }

    /* renamed from: l */
    public void mo72513l() {
        boolean z;
        Collection collection = (Collection) mo72506a().getValue();
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C1690c a = C2201v.m6601a((C2205y<T>) new C34485d<T>(this)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C34486e<Object>(this), (C1710e<? super Throwable>) new C34487f<Object>(this));
            mo72512g().mo6180a();
            mo72512g().mo6181a(a);
        }
    }

    /* renamed from: m */
    public final List<C34463a> mo72514m() {
        C34452a aVar = new C34452a();
        if (this.f88933b.supportGif()) {
            aVar.f88875c = true;
        }
        if (this.f88933b.isImageVideoMix()) {
            C34456c cVar = new C34456c();
            C52711k.m112240b(aVar, "imageSettings");
            C52711k.m112240b(cVar, "videoSettings");
            List arrayList = new ArrayList();
            arrayList.addAll(C34454b.m78391a(aVar, -1));
            arrayList.addAll(C34454b.m78392a(cVar, -1));
            return C34454b.f88876a.mo72471a(arrayList);
        } else if (this.f88933b.isImageOrGif()) {
            return C34454b.m78393b(aVar, -1);
        } else {
            return new ArrayList<>();
        }
    }

    /* renamed from: a */
    public final boolean mo72508a(C34409a aVar) {
        C52711k.m112240b(aVar, "mediaModel");
        if (mo72510e().getValue() == null) {
            mo72510e().setValue(new ArrayList());
        }
        Object value = mo72510e().getValue();
        if (value == null) {
            C52711k.m112234a();
        }
        return ((List) value).contains(aVar);
    }

    /* renamed from: b */
    public final int mo72509b(C34409a aVar) {
        C52711k.m112240b(aVar, "mediaModel");
        List list = (List) mo72510e().getValue();
        if (list == null) {
            list = new ArrayList();
        }
        C52711k.m112236a((Object) list, "selectedMediaList.value ?: mutableListOf()");
        if (!list.contains(aVar) && list.size() >= 9) {
            return -1;
        }
        if (!aVar.isVideo() || aVar.getDuration() <= 300000) {
            return 0;
        }
        return -2;
    }

    /* renamed from: a */
    public final void mo72507a(C34409a aVar, boolean z, C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(aVar, "mediaModel");
        C52711k.m112240b(bVar, "callback");
        Context a = C11010c.m22280a();
        switch (mo72509b(aVar)) {
            case -2:
                C10691a.m21542b(a, (int) R.string.gj1).mo19066a();
                bVar.invoke(Integer.valueOf(-1));
                return;
            case -1:
                C10691a.m21545b(a, C11010c.m22280a().getString(R.string.ftl, new Object[]{Integer.valueOf(9)})).mo19066a();
                bVar.invoke(Integer.valueOf(-1));
                return;
            default:
                List list = (List) mo72510e().getValue();
                if (list == null) {
                    list = new ArrayList();
                }
                List list2 = list;
                C52711k.m112236a((Object) list2, "selectedMediaList.value ?: mutableListOf()");
                if (!z) {
                    list2.remove(aVar);
                    mo72510e().setValue(list2);
                    bVar.invoke(Integer.valueOf(-1));
                    return;
                }
                C34415c cVar = C34415c.f88806a;
                C34488g gVar = new C34488g(this, list2, aVar, bVar, a);
                cVar.mo72447a(aVar, gVar);
                return;
        }
    }
}
