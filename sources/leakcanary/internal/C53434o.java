package leakcanary.internal;

import android.app.Activity;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0654k.C0655a;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import leakcanary.C53362a.C53363a;
import leakcanary.C53372h;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: leakcanary.internal.o */
public final class C53434o implements C52671b<Activity, C52860x> {

    /* renamed from: a */
    public final C53372h f132141a;

    /* renamed from: b */
    public final C52670a<C53363a> f132142b;

    /* renamed from: c */
    private final C53435a f132143c = new C53435a(this);

    /* renamed from: leakcanary.internal.o$a */
    public static final class C53435a extends C0655a {

        /* renamed from: a */
        final /* synthetic */ C53434o f132144a;

        C53435a(C53434o oVar) {
            this.f132144a = oVar;
        }

        public final void onFragmentDestroyed(C0654k kVar, Fragment fragment) {
            C52711k.m112240b(kVar, "fm");
            C52711k.m112240b(fragment, "fragment");
            if (((C53363a) this.f132144a.f132142b.invoke()).f131995c) {
                this.f132144a.f132141a.mo110961a((Object) fragment);
            }
        }

        public final void onFragmentCreated(C0654k kVar, Fragment fragment, Bundle bundle) {
            C52711k.m112240b(kVar, "fm");
            C52711k.m112240b(fragment, "f");
            if (((C53363a) this.f132144a.f132142b.invoke()).f131995c) {
                this.f132144a.f132141a.mo110964b(fragment);
            }
        }
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Activity activity = (Activity) obj;
        C52711k.m112240b(activity, "activity");
        if (activity instanceof FragmentActivity) {
            ((FragmentActivity) activity).getSupportFragmentManager().mo2229a((C0655a) this.f132143c, true);
        }
        return C52860x.f131107a;
    }

    public C53434o(C53372h hVar, C52670a<C53363a> aVar) {
        C52711k.m112240b(hVar, "objectWatcher");
        C52711k.m112240b(aVar, "configProvider");
        this.f132141a = hVar;
        this.f132142b = aVar;
    }
}
