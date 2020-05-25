package com.twitter.sdk.android.core.internal;

import android.content.Context;
import com.twitter.sdk.android.core.internal.p2618b.C52106b;
import com.twitter.sdk.android.core.internal.p2618b.C52107c;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

/* renamed from: com.twitter.sdk.android.core.internal.l */
public final class C52119l {

    /* renamed from: f */
    private static final Pattern f129730f = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: g */
    private static final String f129731g = Pattern.quote("/");

    /* renamed from: a */
    public final boolean f129732a;

    /* renamed from: b */
    public final String f129733b;

    /* renamed from: c */
    C52110c f129734c;

    /* renamed from: d */
    C52104b f129735d;

    /* renamed from: e */
    boolean f129736e;

    /* renamed from: h */
    private final ReentrantLock f129737h;

    /* renamed from: i */
    private final C52106b f129738i;

    /* renamed from: a */
    public final String mo108819a() {
        String str = "";
        if (!this.f129732a) {
            return str;
        }
        String string = this.f129738i.mo108807a().getString("installation_uuid", null);
        if (string == null) {
            return m111477c();
        }
        return string;
    }

    /* renamed from: c */
    private String m111477c() {
        this.f129737h.lock();
        try {
            String str = null;
            String string = this.f129738i.mo108807a().getString("installation_uuid", null);
            if (string == null) {
                String uuid = UUID.randomUUID().toString();
                if (uuid != null) {
                    str = f129730f.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
                }
                string = str;
                this.f129738i.mo108808a(this.f129738i.mo108809b().putString("installation_uuid", string));
            }
            return string;
        } finally {
            this.f129737h.unlock();
        }
    }

    /* renamed from: b */
    public final synchronized C52104b mo108820b() {
        if (!this.f129736e) {
            C52110c cVar = this.f129734c;
            C52104b bVar = new C52104b(cVar.f129715a.mo108807a().getString("advertising_id", ""), cVar.f129715a.mo108807a().getBoolean("limit_ad_tracking_enabled", false));
            if (C52110c.m111453b(bVar)) {
                new Thread(new C52111d(cVar, bVar)).start();
            } else {
                bVar = cVar.mo108812a();
                cVar.mo108813a(bVar);
            }
            this.f129735d = bVar;
            this.f129736e = true;
        }
        return this.f129735d;
    }

    public C52119l(Context context) {
        this(context, new C52107c(context, "com.twitter.sdk.android.AdvertisingPreferences"));
    }

    private C52119l(Context context, C52106b bVar) {
        this(context, bVar, new C52110c(context, bVar));
    }

    private C52119l(Context context, C52106b bVar, C52110c cVar) {
        this.f129737h = new ReentrantLock();
        if (context != null) {
            this.f129733b = context.getPackageName();
            this.f129734c = cVar;
            this.f129738i = bVar;
            this.f129732a = C52114g.m111471a(context, "com.twitter.sdk.android.COLLECT_IDENTIFIERS_ENABLED", true);
            if (!this.f129732a) {
                new StringBuilder("Device ID collection disabled for ").append(context.getPackageName());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("appContext must not be null");
    }
}
