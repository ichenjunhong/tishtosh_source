package com.p683ss.android.ugc.aweme.p1807im.sdk.providedservices;

import com.p683ss.android.ugc.aweme.p1807im.sdk.p1840h.C34373c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1840h.C34375d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1840h.C34377e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1840h.C34378f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1840h.C34379g;
import com.p683ss.android.ugc.aweme.p1807im.service.p1905g.C35446a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.providedservices.ImServiceProvider */
public final class ImServiceProvider {
    static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ImServiceProvider.class), "experimentService", "getExperimentService()Lcom/ss/android/ugc/aweme/im/service/service/IImExperimentService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ImServiceProvider.class), "relationService", "getRelationService()Lcom/ss/android/ugc/aweme/im/sdk/service/ImRelationService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ImServiceProvider.class), "shareService", "getShareService()Lcom/ss/android/ugc/aweme/im/sdk/service/ImShareService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ImServiceProvider.class), "mixBusinessService", "getMixBusinessService()Lcom/ss/android/ugc/aweme/im/sdk/service/ImMixBusinessService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ImServiceProvider.class), "notificationService", "getNotificationService()Lcom/ss/android/ugc/aweme/im/sdk/service/ImNotificationService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ImServiceProvider.class), "familiarService", "getFamiliarService()Lcom/ss/android/ugc/aweme/im/sdk/service/ImFamiliarService;"))};
    public static final ImServiceProvider INSTANCE = new ImServiceProvider();
    private static final C52668f experimentService$delegate = C52732g.m112285a(ImServiceProvider$experimentService$2.INSTANCE);
    private static final C52668f familiarService$delegate = C52732g.m112285a(ImServiceProvider$familiarService$2.INSTANCE);
    private static final C52668f mixBusinessService$delegate = C52732g.m112285a(ImServiceProvider$mixBusinessService$2.INSTANCE);
    private static final C52668f notificationService$delegate = C52732g.m112285a(ImServiceProvider$notificationService$2.INSTANCE);
    private static final C52668f relationService$delegate = C52732g.m112285a(ImServiceProvider$relationService$2.INSTANCE);
    private static final C52668f shareService$delegate = C52732g.m112285a(ImServiceProvider$shareService$2.INSTANCE);

    private ImServiceProvider() {
    }

    public final C35446a getExperimentService() {
        return (C35446a) experimentService$delegate.getValue();
    }

    public final C34373c getFamiliarService() {
        return (C34373c) familiarService$delegate.getValue();
    }

    public final C34375d getMixBusinessService() {
        return (C34375d) mixBusinessService$delegate.getValue();
    }

    public final C34377e getNotificationService() {
        return (C34377e) notificationService$delegate.getValue();
    }

    public final C34378f getRelationService() {
        return (C34378f) relationService$delegate.getValue();
    }

    public final C34379g getShareService() {
        return (C34379g) shareService$delegate.getValue();
    }
}
