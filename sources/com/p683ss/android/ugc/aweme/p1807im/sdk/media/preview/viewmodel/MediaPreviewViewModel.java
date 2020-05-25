package com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.viewmodel;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.viewmodel.MediaChooseViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.C34518c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.model.C34537a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.p1858b.C34517a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.p1859c.C34519a;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.viewmodel.MediaPreviewViewModel */
public final class MediaPreviewViewModel extends MediaChooseViewModel {

    /* renamed from: f */
    static final /* synthetic */ C52767h[] f89036f = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MediaPreviewViewModel.class), "currentMedia", "getCurrentMedia()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MediaPreviewViewModel.class), "lifecycleEvent", "getLifecycleEvent()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MediaPreviewViewModel.class), "mediaPlayHelper", "getMediaPlayHelper()Lcom/ss/android/ugc/aweme/im/sdk/media/preview/helper/MediaPlayHelper;"))};

    /* renamed from: i */
    public static final C34539a f89037i = new C34539a(null);

    /* renamed from: g */
    public C34537a f89038g = C34537a.DEFAULT;

    /* renamed from: h */
    public C34517a f89039h;

    /* renamed from: j */
    private final C52668f f89040j = C52732g.m112285a(C34540b.f89043a);

    /* renamed from: k */
    private final C52668f f89041k = C52732g.m112285a(C34541c.f89044a);

    /* renamed from: l */
    private final C52668f f89042l = C52732g.m112285a(C34542d.f89045a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.viewmodel.MediaPreviewViewModel$a */
    public static final class C34539a {
        private C34539a() {
        }

        public /* synthetic */ C34539a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static MediaPreviewViewModel m78480a(FragmentActivity fragmentActivity) {
            C52711k.m112240b(fragmentActivity, "activity");
            C0209x a = C0214z.m440a(fragmentActivity).mo359a(MediaPreviewViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…iewViewModel::class.java)");
            return (MediaPreviewViewModel) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.viewmodel.MediaPreviewViewModel$b */
    static final class C34540b extends C52712l implements C52670a<C23275b<C34409a>> {

        /* renamed from: a */
        public static final C34540b f89043a = new C34540b();

        C34540b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23275b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.viewmodel.MediaPreviewViewModel$c */
    static final class C34541c extends C52712l implements C52670a<C23275b<C0177a>> {

        /* renamed from: a */
        public static final C34541c f89044a = new C34541c();

        C34541c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23275b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.viewmodel.MediaPreviewViewModel$d */
    static final class C34542d extends C52712l implements C52670a<C34519a> {

        /* renamed from: a */
        public static final C34542d f89045a = new C34542d();

        C34542d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C34519a();
        }
    }

    /* renamed from: n */
    public final C23275b<C34409a> mo72558n() {
        return (C23275b) this.f89040j.getValue();
    }

    /* renamed from: o */
    public final C23275b<C0177a> mo72559o() {
        return (C23275b) this.f89041k.getValue();
    }

    /* renamed from: p */
    public final C34519a mo72560p() {
        return (C34519a) this.f89042l.getValue();
    }

    public final void onCleared() {
        super.onCleared();
        C34519a p = mo72560p();
        p.mo72532a().mo73499c();
        p.f88996b = null;
    }

    /* renamed from: l */
    public final void mo72513l() {
        if (this.f89039h instanceof C34518c) {
            C34517a aVar = this.f89039h;
            if (aVar == null) {
                C52711k.m112234a();
            }
            C52847n b = aVar.mo72530b();
            if (this.f89038g.isChooseMode()) {
                C23275b e = mo72510e();
                C34517a aVar2 = this.f89039h;
                if (aVar2 == null) {
                    C52711k.m112234a();
                }
                e.setValue(aVar2.mo72531c());
            }
            C34517a aVar3 = this.f89039h;
            if (aVar3 == null) {
                C52711k.m112234a();
            }
            C34409a a = aVar3.mo72529a();
            if (a != null) {
                mo72558n().setValue(a);
            }
            mo71926d((List) b.getFirst(), ((Boolean) b.getSecond()).booleanValue());
        }
    }
}
