package com.p683ss.android.ugc.aweme.services.storage;

import com.p683ss.android.ugc.aweme.p1445bp.p1457h.C23932a;
import com.p683ss.android.ugc.aweme.p1445bp.p1457h.C23934b;
import com.p683ss.android.ugc.aweme.p1445bp.p1457h.C23936c;
import com.p683ss.android.ugc.aweme.p1445bp.p1457h.C23937d;
import com.p683ss.android.ugc.aweme.p1445bp.p1457h.C23939f;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.services.storage.AVStorageManagerImpl */
public final class AVStorageManagerImpl implements C23932a {
    static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AVStorageManagerImpl.class), "monitor", "getMonitor()Lcom/ss/android/ugc/aweme/storage/services/IAVStorageMonitor;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AVStorageManagerImpl.class), "whiteListService", "getWhiteListService()Lcom/ss/android/ugc/aweme/storage/services/IStorageWhiteListService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AVStorageManagerImpl.class), "fileProvider", "getFileProvider()Lcom/ss/android/ugc/aweme/storage/services/IFileProvider;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AVStorageManagerImpl.class), "persistedWhiteListManager", "getPersistedWhiteListManager()Lcom/ss/android/ugc/aweme/storage/services/IPersistedWhiteListManager;"))};
    private final C52668f fileProvider$delegate = C52732g.m112285a(AVStorageManagerImpl$fileProvider$2.INSTANCE);
    private final C52668f monitor$delegate = C52732g.m112285a(AVStorageManagerImpl$monitor$2.INSTANCE);
    private final C52668f persistedWhiteListManager$delegate = C52732g.m112285a(AVStorageManagerImpl$persistedWhiteListManager$2.INSTANCE);
    private final C52668f whiteListService$delegate = C52732g.m112285a(AVStorageManagerImpl$whiteListService$2.INSTANCE);

    public final C23936c getFileProvider() {
        return (C23936c) this.fileProvider$delegate.getValue();
    }

    public final C23934b getMonitor() {
        return (C23934b) this.monitor$delegate.getValue();
    }

    public final C23937d getPersistedWhiteListManager() {
        return (C23937d) this.persistedWhiteListManager$delegate.getValue();
    }

    public final C23939f getWhiteListService() {
        return (C23939f) this.whiteListService$delegate.getValue();
    }
}
