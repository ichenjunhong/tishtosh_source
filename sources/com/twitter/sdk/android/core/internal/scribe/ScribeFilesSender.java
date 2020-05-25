package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.twitter.sdk.android.core.C52072e;
import com.twitter.sdk.android.core.C52188j;
import com.twitter.sdk.android.core.C52189k;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.C52114g;
import com.twitter.sdk.android.core.internal.C52119l;
import com.twitter.sdk.android.core.internal.p2617a.C52098a;
import com.twitter.sdk.android.core.internal.p2617a.C52101d;
import com.twitter.sdk.android.core.internal.p2617a.C52102e;
import com.twitter.sdk.android.core.internal.scribe.C52173r.C52177c;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53504ad;
import okhttp3.C53506ae;
import okhttp3.C53676u;
import okhttp3.C53676u.C53677a;
import okhttp3.C53682y;
import okhttp3.C53682y.C53684a;
import p2666g.C53061b;
import p2666g.C53133m;
import p2666g.C53134n.C53136a;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53080k;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53088s;

final class ScribeFilesSender implements C52172q {

    /* renamed from: a */
    static final byte[] f129781a = {44};

    /* renamed from: b */
    private static final byte[] f129782b = {91};

    /* renamed from: c */
    private static final byte[] f129783c = {93};

    /* renamed from: d */
    private final Context f129784d;

    /* renamed from: e */
    private final C52180u f129785e;

    /* renamed from: f */
    private final long f129786f;

    /* renamed from: g */
    private final TwitterAuthConfig f129787g;

    /* renamed from: h */
    private final C52189k<? extends C52188j<TwitterAuthToken>> f129788h;

    /* renamed from: i */
    private final C52072e f129789i;

    /* renamed from: j */
    private final AtomicReference<ScribeService> f129790j = new AtomicReference<>();

    /* renamed from: k */
    private final ExecutorService f129791k;

    /* renamed from: l */
    private final C52119l f129792l;

    interface ScribeService {
        @C53080k(mo110609a = {"Content-Type: application/x-www-form-urlencoded;charset=UTF-8"})
        @C53074e
        @C53084o(mo110612a = "/{version}/jot/{type}")
        C53061b<C53506ae> upload(@C53088s(mo110617a = "version") String str, @C53088s(mo110617a = "type") String str2, @C53072c(mo110600a = "log[]") String str3);

        @C53080k(mo110609a = {"Content-Type: application/x-www-form-urlencoded;charset=UTF-8"})
        @C53074e
        @C53084o(mo110612a = "/scribe/{sequence}")
        C53061b<C53506ae> uploadSequence(@C53088s(mo110617a = "sequence") String str, @C53072c(mo110600a = "log[]") String str2);
    }

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.ScribeFilesSender$a */
    static class C52142a implements C53676u {

        /* renamed from: a */
        private final C52180u f129793a;

        /* renamed from: b */
        private final C52119l f129794b;

        public final C53504ad intercept(C53677a aVar) throws IOException {
            C53499a a = aVar.mo111416a().mo111256a();
            if (!TextUtils.isEmpty(this.f129793a.f129890f)) {
                a.mo111263a("User-Agent", this.f129793a.f129890f);
            }
            if (!TextUtils.isEmpty(this.f129794b.mo108819a())) {
                a.mo111263a("X-Client-UUID", this.f129794b.mo108819a());
            }
            a.mo111263a("X-Twitter-Polling", "true");
            return aVar.mo111417a(a.mo111272c());
        }

        C52142a(C52180u uVar, C52119l lVar) {
            this.f129793a = uVar;
            this.f129794b = lVar;
        }
    }

    /* renamed from: a */
    private synchronized ScribeService m111513a() {
        boolean z;
        C53682y yVar;
        if (this.f129790j.get() == null) {
            C52188j a = this.f129788h.mo108769a(this.f129786f);
            if (a == null || a.f129901a == null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                yVar = new C53684a().mo111658a(C52102e.m111436a()).mo111665a((C53676u) new C52142a(this.f129785e, this.f129792l)).mo111665a((C53676u) new C52101d(a, this.f129787g)).mo111667a();
            } else {
                yVar = new C53684a().mo111658a(C52102e.m111436a()).mo111665a((C53676u) new C52142a(this.f129785e, this.f129792l)).mo111665a((C53676u) new C52098a(this.f129789i)).mo111667a();
            }
            this.f129790j.compareAndSet(null, new C53136a().mo110655a(this.f129785e.f129886b).mo110656a(yVar).mo110657a().mo110651a(ScribeService.class));
        }
        return (ScribeService) this.f129790j.get();
    }

    /* renamed from: b */
    private static String m111514b(List<File> list) throws IOException {
        C52173r rVar;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(PreloadTask.BYTE_UNIT_NUMBER);
        boolean[] zArr = new boolean[1];
        byteArrayOutputStream.write(f129782b);
        for (File rVar2 : list) {
            try {
                rVar = new C52173r(rVar2);
                try {
                    rVar.mo108905a((C52177c) new C52185y(zArr, byteArrayOutputStream));
                    C52114g.m111466a((Closeable) rVar);
                } catch (Throwable th) {
                    th = th;
                    C52114g.m111466a((Closeable) rVar);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                rVar = null;
                C52114g.m111466a((Closeable) rVar);
                throw th;
            }
        }
        byteArrayOutputStream.write(f129783c);
        return byteArrayOutputStream.toString("UTF-8");
    }

    /* renamed from: a */
    public final boolean mo108848a(List<File> list) {
        boolean z;
        C53133m mVar;
        if (m111513a() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                String b = m111514b(list);
                C52114g.m111464a(this.f129784d, b);
                ScribeService a = m111513a();
                if (!TextUtils.isEmpty(this.f129785e.f129889e)) {
                    mVar = a.uploadSequence(this.f129785e.f129889e, b).mo110594a();
                } else {
                    mVar = a.upload(this.f129785e.f129887c, this.f129785e.f129888d, b).mo110594a();
                }
                if (mVar.mo110644a() == 200) {
                    return true;
                }
                C52114g.m111465a(this.f129784d, "Failed sending files", (Throwable) null);
                if (mVar.mo110644a() == 500 || mVar.mo110644a() == 400) {
                    return true;
                }
            } catch (Exception e) {
                C52114g.m111465a(this.f129784d, "Failed sending files", (Throwable) e);
            }
        } else {
            C52114g.m111464a(this.f129784d, "Cannot attempt upload at this time");
        }
        return false;
    }

    ScribeFilesSender(Context context, C52180u uVar, long j, TwitterAuthConfig twitterAuthConfig, C52189k<? extends C52188j<TwitterAuthToken>> kVar, C52072e eVar, ExecutorService executorService, C52119l lVar) {
        this.f129784d = context;
        this.f129785e = uVar;
        this.f129786f = j;
        this.f129787g = twitterAuthConfig;
        this.f129788h = kVar;
        this.f129789i = eVar;
        this.f129791k = executorService;
        this.f129792l = lVar;
    }
}
