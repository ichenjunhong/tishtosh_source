package com.p683ss.android.ugc.aweme.share.p2159h;

import android.net.Uri;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.ShortenUrlApi;
import com.p683ss.android.ugc.aweme.share.model.ShortenModel;
import com.p683ss.android.ugc.aweme.utils.C47891fl;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2193n;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.h.f */
public final class C42040f {

    /* renamed from: a */
    public static final C42040f f106427a = new C42040f();

    /* renamed from: com.ss.android.ugc.aweme.share.h.f$a */
    static final class C42041a<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C42041a f106428a = new C42041a();

        C42041a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ShortenModel shortenModel = (ShortenModel) obj;
            C52711k.m112240b(shortenModel, "it");
            return shortenModel.getData();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.h.f$b */
    static final class C42042b<T, R> implements C1711f<Throwable, String> {

        /* renamed from: a */
        final /* synthetic */ String f106429a;

        C42042b(String str) {
            this.f106429a = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            C52711k.m112240b((Throwable) obj, "it");
            return this.f106429a;
        }
    }

    private C42040f() {
    }

    /* renamed from: b */
    private static void m92006b(String str) {
        C41979aq.m91947b().markLocalCommand(C11010c.m22280a(), str);
    }

    /* renamed from: a */
    public final C2193n<String> mo86110a(String str) {
        C52711k.m112240b(str, "origin");
        m92006b(str);
        if (C47891fl.m103593a(str)) {
            Uri parse = Uri.parse(str);
            C52711k.m112236a((Object) parse, "uri");
            if (parse.isOpaque() || parse.getQueryParameterNames().isEmpty()) {
                C2193n<String> a = C2193n.m6560a(str);
                C52711k.m112236a((Object) a, "Maybe.just(origin)");
                return a;
            }
        }
        C2193n<String> a2 = ShortenUrlApi.m91873a(str, "trill").mo6487a((C1711f<? super T, ? extends R>) C42041a.f106428a).mo6483a(3, TimeUnit.SECONDS).mo6494b((C1711f<? super Throwable, ? extends T>) new C42042b<Object,Object>(str)).mo6482a(2).mo6484a(C2168a.m6521b());
        C52711k.m112236a((Object) a2, "ShortenUrlApi.fetchShort…scribeOn(Schedulers.io())");
        return a2;
    }
}
