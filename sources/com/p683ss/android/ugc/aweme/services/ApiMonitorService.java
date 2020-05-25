package com.p683ss.android.ugc.aweme.services;

import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.services.ApiMonitorService */
public final class ApiMonitorService extends AbsApiMonitorService {
    public static final Companion Companion = new Companion(null);
    public static final C52668f instance$delegate = C52732g.m112286a(C52757k.SYNCHRONIZED, ApiMonitorService$Companion$instance$2.INSTANCE);

    /* renamed from: com.ss.android.ugc.aweme.services.ApiMonitorService$Companion */
    public static final class Companion {
        static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(Companion.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/services/ApiMonitorService;"))};

        private Companion() {
        }

        public final ApiMonitorService getInstance() {
            return (ApiMonitorService) ApiMonitorService.instance$delegate.getValue();
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    private ApiMonitorService() {
    }

    /* access modifiers changed from: protected */
    public final boolean filter(String str, Object obj) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(obj, "body");
        return false;
    }

    public /* synthetic */ ApiMonitorService(C52707g gVar) {
        this();
    }
}
