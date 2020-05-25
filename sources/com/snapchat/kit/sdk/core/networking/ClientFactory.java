package com.snapchat.kit.sdk.core.networking;

import com.google.gson.C17971f;
import com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope;
import okhttp3.C53515c;
import okhttp3.C53676u;
import okhttp3.C53682y.C53684a;
import p2666g.C53095e.C53096a;
import p2666g.C53134n.C53136a;
import p2666g.p2669b.p2670a.C53062a;
import p2666g.p2669b.p2671b.C53065a;

@SnapConnectScope
public class ClientFactory {

    /* renamed from: a */
    private final C53515c f50481a;

    /* renamed from: b */
    private final C17971f f50482b;

    /* renamed from: c */
    private final C18289e f50483c;

    /* renamed from: d */
    private final C18287c f50484d;

    public <T> T generateClient(Class<T> cls) {
        return generateClient("https://api.snapkit.com", cls);
    }

    public <T> T generateClient(String str, Class<T> cls) {
        return m44493a(this.f50483c, str, cls, C53062a.m112828a(this.f50482b));
    }

    public <T> T generateFingerprintedClient(String str, Class<T> cls) {
        return m44493a(this.f50484d, str, cls, new C53065a());
    }

    ClientFactory(C53515c cVar, C17971f fVar, C18289e eVar, C18287c cVar2) {
        this.f50481a = cVar;
        this.f50482b = fVar;
        this.f50483c = eVar;
        this.f50484d = cVar2;
    }

    /* renamed from: a */
    private <T> T m44493a(C18289e eVar, String str, Class<T> cls, C53096a aVar) {
        return new C53136a().mo110655a(str).mo110656a(new C53684a().mo111657a(this.f50481a).mo111665a((C53676u) eVar).mo111667a()).mo110654a(aVar).mo110657a().mo110651a(cls);
    }
}
