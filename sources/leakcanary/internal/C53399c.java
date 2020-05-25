package leakcanary.internal;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentManager.FragmentLifecycleCallbacks;
import android.os.Bundle;
import leakcanary.C53362a.C53363a;
import leakcanary.C53372h;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: leakcanary.internal.c */
public final class C53399c implements C52671b<Activity, C52860x> {

    /* renamed from: a */
    public final C53372h f132068a;

    /* renamed from: b */
    public final C52670a<C53363a> f132069b;

    /* renamed from: c */
    private final C53400a f132070c = new C53400a(this);

    /* renamed from: leakcanary.internal.c$a */
    public static final class C53400a extends FragmentLifecycleCallbacks {

        /* renamed from: a */
        final /* synthetic */ C53399c f132071a;

        C53400a(C53399c cVar) {
            this.f132071a = cVar;
        }

        public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
            C52711k.m112240b(fragmentManager, "fm");
            C52711k.m112240b(fragment, "fragment");
            if (((C53363a) this.f132071a.f132069b.invoke()).f131995c) {
                this.f132071a.f132068a.mo110961a((Object) fragment);
            }
        }

        public final void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
            if (((C53363a) this.f132071a.f132069b.invoke()).f131995c && fragment != null) {
                this.f132071a.f132068a.mo110964b(fragment);
            }
        }
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Activity activity = (Activity) obj;
        C52711k.m112240b(activity, "activity");
        activity.getFragmentManager().registerFragmentLifecycleCallbacks(this.f132070c, true);
        return C52860x.f131107a;
    }

    public C53399c(C53372h hVar, C52670a<C53363a> aVar) {
        C52711k.m112240b(hVar, "objectWatcher");
        C52711k.m112240b(aVar, "configProvider");
        this.f132068a = hVar;
        this.f132069b = aVar;
    }
}
