package dmt.p2652av.video.p2656d;

import com.p683ss.android.ugc.aweme.effectplatform.C29253g;
import com.p683ss.android.ugc.aweme.effectplatform.C29264p;
import com.p683ss.android.ugc.aweme.effectplatform.C29276x;
import com.p683ss.android.ugc.aweme.effectplatform.C29279y;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2245c.C45098a;
import java.util.Arrays;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: dmt.av.video.d.b */
public final class C52955b implements C45098a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f131364a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C52955b.class), "modelFetcher", "getModelFetcher()Lcom/ss/android/ugc/aweme/effectplatform/IModelFetcher;"))};

    /* renamed from: b */
    private final C52668f f131365b = C52732g.m112285a(C52957b.f131366a);

    /* renamed from: dmt.av.video.d.b$a */
    public static final class C52956a implements IFetchResourcesListener {
        C52956a() {
        }

        public final void onFailed(Exception exc) {
            C52711k.m112240b(exc, "e");
        }

        public final void onSuccess(String[] strArr) {
            C52711k.m112240b(strArr, "requirements");
            C29279y.m69003a(C52575l.m112099b((T[]) (String[]) Arrays.copyOf(strArr, strArr.length)));
        }
    }

    /* renamed from: dmt.av.video.d.b$b */
    static final class C52957b extends C52712l implements C52670a<C29253g> {

        /* renamed from: a */
        public static final C52957b f131366a = new C52957b();

        C52957b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C29264p().mo59193a();
        }
    }

    /* renamed from: a */
    public final void mo91293a() {
        ((C29253g) this.f131365b.getValue()).mo59188a(new C52956a());
        if (C39629l.m88232a().mo58583n().mo83103a(C40790a.PreFetchPopEffectModel)) {
            C29276x.m68998a();
        }
    }
}
