package com.twitter.sdk.android.core;

import com.google.gson.C17978g;
import com.google.gson.C18097x;
import com.twitter.sdk.android.core.internal.C52136q;
import com.twitter.sdk.android.core.internal.p2617a.C52098a;
import com.twitter.sdk.android.core.internal.p2617a.C52099b;
import com.twitter.sdk.android.core.internal.p2617a.C52100c;
import com.twitter.sdk.android.core.internal.p2617a.C52101d;
import com.twitter.sdk.android.core.internal.p2617a.C52102e;
import com.twitter.sdk.android.core.models.BindingValuesAdapter;
import com.twitter.sdk.android.core.models.C52196c;
import com.twitter.sdk.android.core.models.SafeListAdapter;
import com.twitter.sdk.android.core.models.SafeMapAdapter;
import com.twitter.sdk.android.core.services.AccountService;
import com.twitter.sdk.android.core.services.FavoriteService;
import com.twitter.sdk.android.core.services.MediaService;
import com.twitter.sdk.android.core.services.StatusesService;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.C53676u;
import okhttp3.C53682y;
import okhttp3.C53682y.C53684a;
import p2666g.C53095e.C53096a;
import p2666g.C53134n;
import p2666g.C53134n.C53136a;
import p2666g.p2669b.p2670a.C53062a;

/* renamed from: com.twitter.sdk.android.core.m */
public final class C52191m {

    /* renamed from: a */
    final ConcurrentHashMap<Class, Object> f129912a;

    /* renamed from: b */
    final C53134n f129913b;

    /* renamed from: a */
    public final AccountService mo108921a() {
        return (AccountService) m111623a(AccountService.class);
    }

    /* renamed from: b */
    public final FavoriteService mo108922b() {
        return (FavoriteService) m111623a(FavoriteService.class);
    }

    /* renamed from: c */
    public final StatusesService mo108923c() {
        return (StatusesService) m111623a(StatusesService.class);
    }

    /* renamed from: d */
    public final MediaService mo108924d() {
        return (MediaService) m111623a(MediaService.class);
    }

    public C52191m() {
        C52072e c = C52225r.m111638a().mo108950c();
        C53684a a = new C53684a().mo111658a(C52102e.m111436a());
        a.f133234r = new C52100c(c);
        this(a.mo111665a((C53676u) new C52098a(c)).mo111670b((C53676u) new C52099b()).mo111667a(), new C52136q());
    }

    /* renamed from: a */
    private <T> T m111623a(Class<T> cls) {
        if (!this.f129912a.contains(cls)) {
            this.f129912a.putIfAbsent(cls, this.f129913b.mo110651a(cls));
        }
        return this.f129912a.get(cls);
    }

    public C52191m(C52231v vVar) {
        TwitterAuthConfig twitterAuthConfig = C52225r.m111638a().f130052e;
        if (vVar != null) {
            this(new C53684a().mo111658a(C52102e.m111436a()).mo111665a((C53676u) new C52101d(vVar, twitterAuthConfig)).mo111667a(), new C52136q());
            return;
        }
        throw new IllegalArgumentException("Session must not be null.");
    }

    private C52191m(C53682y yVar, C52136q qVar) {
        this.f129912a = new ConcurrentHashMap<>();
        this.f129913b = new C53136a().mo110656a(yVar).mo110655a(qVar.f129776a).mo110654a((C53096a) C53062a.m112828a(new C17978g().mo34894a((C18097x) new SafeListAdapter()).mo34894a((C18097x) new SafeMapAdapter()).mo34896a((Type) C52196c.class, (Object) new BindingValuesAdapter()).mo34900d())).mo110657a();
    }
}
