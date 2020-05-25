package com.p683ss.android.ugc.aweme.commercialize.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.commercialize.model.C26131l;
import java.util.concurrent.Callable;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2666g.p2672c.C53075f;

/* renamed from: com.ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi */
public final class CommerceSettingsApi {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f67856a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommerceSettingsApi.class), "api", "getApi()Lcom/ss/android/ugc/aweme/commercialize/api/CommerceSettingsApi$IApi;"))};

    /* renamed from: b */
    public static C26131l f67857b;

    /* renamed from: c */
    public static final CommerceSettingsApi f67858c = new CommerceSettingsApi();

    /* renamed from: d */
    private static final C52668f f67859d = C52732g.m112285a(C25636a.f67860a);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi$IApi */
    interface IApi {
        @C53075f(mo110603a = "/aweme/v1/commerce/settings")
        C17832m<C26131l> getSettings();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi$a */
    static final class C25636a extends C52712l implements C52670a<IApi> {

        /* renamed from: a */
        public static final C25636a f67860a = new C25636a();

        C25636a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (IApi) C25642a.m62165a(IApi.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi$b */
    public static final class C25637b<V> implements Callable<C52860x> {

        /* renamed from: a */
        public static final C25637b f67861a = new C25637b();

        C25637b() {
        }

        public final /* synthetic */ Object call() {
            CommerceSettingsApi.f67858c.mo52790b();
            return C52860x.f131107a;
        }
    }

    private CommerceSettingsApi() {
    }

    /* renamed from: a */
    public static final C26131l m62160a() {
        return f67857b;
    }

    /* renamed from: b */
    public final synchronized void mo52790b() {
        if (f67857b == null) {
            try {
                f67857b = (C26131l) ((IApi) f67859d.getValue()).getSettings().get();
            } catch (Exception unused) {
            }
        }
    }
}
