package com.p683ss.android.ugc.aweme.p1437bj;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.port.p2082in.C39647x;
import com.p683ss.android.ugc.aweme.services.IPrivacySettingService;
import com.p683ss.android.ugc.aweme.services.IPrivacySettingService.OnPostNowClickListener;
import com.p683ss.android.ugc.aweme.shortvideo.service.PrivacySettingService;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.bj.i */
public final class C23851i implements C39647x {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f63528a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23851i.class), "service", "getService()Lcom/ss/android/ugc/aweme/services/IPrivacySettingService;"))};

    /* renamed from: b */
    private final C52668f f63529b = C52732g.m112285a(C23852a.f63530a);

    /* renamed from: com.ss.android.ugc.aweme.bj.i$a */
    static final class C23852a extends C52712l implements C52670a<IPrivacySettingService> {

        /* renamed from: a */
        public static final C23852a f63530a = new C23852a();

        C23852a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return PrivacySettingService.createIPrivacySettingServicebyMonsterPlugin();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bj.i$b */
    static final class C23853b implements OnPostNowClickListener {

        /* renamed from: a */
        final /* synthetic */ C52670a f63531a;

        C23853b(C52670a aVar) {
            this.f63531a = aVar;
        }

        public final void onPostNowClick() {
            this.f63531a.invoke();
        }
    }

    /* renamed from: a */
    private final IPrivacySettingService m58555a() {
        return (IPrivacySettingService) this.f63529b.getValue();
    }

    /* renamed from: a */
    public final boolean mo49453a(Activity activity) {
        C52711k.m112240b(activity, "activity");
        IPrivacySettingService a = m58555a();
        if (a != null) {
            return a.needShowPrivacyConfirmationDialog(activity);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo49452a(Activity activity, C52670a<C52860x> aVar) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(aVar, "onPostNowClickListener");
        IPrivacySettingService a = m58555a();
        if (a != null) {
            a.showPrivacyConfirmationDialog(activity, new C23853b(aVar));
        }
    }
}
