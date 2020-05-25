package com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.viewmodel;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1854c.C34452a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1854c.C34454b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1854c.C34454b.C34455a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1854c.C34456c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d.C34472c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1849a.C34406a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaPanelChooseViewModel */
public final class MediaPanelChooseViewModel extends MediaChooseViewModel {

    /* renamed from: f */
    static final /* synthetic */ C52767h[] f88951f = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MediaPanelChooseViewModel.class), "mediaModelList", "getMediaModelList()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MediaPanelChooseViewModel.class), "previewChooseResult", "getPreviewChooseResult()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;"))};

    /* renamed from: h */
    public static final C34491a f88952h = new C34491a(null);

    /* renamed from: g */
    public volatile boolean f88953g;

    /* renamed from: i */
    private final C52668f f88954i = C52732g.m112285a(C34492b.f88956a);

    /* renamed from: j */
    private final C52668f f88955j = C52732g.m112285a(C34493c.f88957a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaPanelChooseViewModel$a */
    public static final class C34491a {
        private C34491a() {
        }

        public /* synthetic */ C34491a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static MediaPanelChooseViewModel m78429a(FragmentActivity fragmentActivity) {
            C52711k.m112240b(fragmentActivity, "activity");
            C0209x a = C0214z.m440a(fragmentActivity).mo359a(MediaPanelChooseViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…oseViewModel::class.java)");
            return (MediaPanelChooseViewModel) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaPanelChooseViewModel$b */
    static final class C34492b extends C52712l implements C52670a<C23275b<List<C34409a>>> {

        /* renamed from: a */
        public static final C34492b f88956a = new C34492b();

        C34492b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23275b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaPanelChooseViewModel$c */
    static final class C34493c extends C52712l implements C52670a<C23275b<C34472c>> {

        /* renamed from: a */
        public static final C34493c f88957a = new C34493c();

        C34493c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23275b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaPanelChooseViewModel$d */
    static final class C34494d<T> implements C2205y<T> {

        /* renamed from: a */
        final /* synthetic */ MediaPanelChooseViewModel f88958a;

        /* renamed from: b */
        final /* synthetic */ boolean f88959b;

        C34494d(MediaPanelChooseViewModel mediaPanelChooseViewModel, boolean z) {
            this.f88958a = mediaPanelChooseViewModel;
            this.f88959b = z;
        }

        public final void subscribe(C2204x<List<C34409a>> xVar) {
            C52711k.m112240b(xVar, "emitter");
            try {
                C34452a aVar = new C34452a();
                C34456c cVar = new C34456c();
                C52711k.m112240b(aVar, "imageSettings");
                C52711k.m112240b(cVar, "videoSettings");
                List arrayList = new ArrayList();
                arrayList.addAll(C34454b.m78391a(aVar, 50));
                arrayList.addAll(C34454b.m78392a(cVar, 50));
                if (arrayList.size() > 1) {
                    C52575l.m112105a(arrayList, new C34455a());
                }
                if (arrayList.size() >= 50) {
                    arrayList = arrayList.subList(0, 50);
                }
                if (this.f88959b) {
                    MediaPanelChooseViewModel.m78425a(arrayList);
                }
                C34406a.m78356a(xVar, arrayList);
            } catch (Throwable th) {
                C34406a.m78357a(xVar, th);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaPanelChooseViewModel$e */
    static final class C34495e<T> implements C1710e<List<C34409a>> {

        /* renamed from: a */
        final /* synthetic */ MediaPanelChooseViewModel f88960a;

        C34495e(MediaPanelChooseViewModel mediaPanelChooseViewModel) {
            this.f88960a = mediaPanelChooseViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.f88960a.mo72515n().setValue((List) obj);
            this.f88960a.f88953g = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaPanelChooseViewModel$f */
    static final class C34496f<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ MediaPanelChooseViewModel f88961a;

        C34496f(MediaPanelChooseViewModel mediaPanelChooseViewModel) {
            this.f88961a = mediaPanelChooseViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            C32458a.m75148a((Throwable) obj);
            this.f88961a.mo72515n().setValue(new ArrayList());
            this.f88961a.f88953g = false;
        }
    }

    /* renamed from: n */
    public final C23275b<List<C34409a>> mo72515n() {
        return (C23275b) this.f88954i.getValue();
    }

    /* renamed from: o */
    public final C23275b<C34472c> mo72516o() {
        return (C23275b) this.f88955j.getValue();
    }

    /* renamed from: l */
    public final void mo72513l() {
        if (!this.f88953g) {
            boolean z = true;
            this.f88953g = true;
            Collection collection = (Collection) mo72515n().getValue();
            if (collection != null && !collection.isEmpty()) {
                z = false;
            }
            C1690c a = C2201v.m6601a((C2205y<T>) new C34494d<T>(this, z)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C34495e<Object>(this), (C1710e<? super Throwable>) new C34496f<Object>(this));
            mo72512g().mo6180a();
            mo72512g().mo6181a(a);
        }
    }

    /* renamed from: a */
    public static void m78425a(List<C34409a> list) {
        if (list.size() > 4) {
            list = list.subList(0, 4);
        }
        for (C34409a accurateSize$default : list) {
            C34409a.accurateSize$default(accurateSize$default, true, null, 2, null);
        }
    }
}
