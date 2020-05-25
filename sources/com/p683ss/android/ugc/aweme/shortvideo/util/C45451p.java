package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39534e;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.p683ss.android.ugc.aweme.status.C45733a;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46055e;
import java.util.concurrent.Callable;
import leakcanary.internal.LeakCanaryFileProvider;
import p001a.C0027j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.p */
final /* synthetic */ class C45451p implements Callable {

    /* renamed from: a */
    private final Context f114863a;

    /* renamed from: b */
    private final String f114864b;

    /* renamed from: c */
    private final boolean f114865c;

    /* renamed from: d */
    private final C45547d f114866d;

    /* renamed from: e */
    private final C0027j f114867e;

    /* renamed from: f */
    private final int f114868f;

    C45451p(Context context, String str, boolean z, C45547d dVar, C0027j jVar, int i) {
        this.f114863a = context;
        this.f114864b = str;
        this.f114865c = z;
        this.f114866d = dVar;
        this.f114867e = jVar;
        this.f114868f = i;
    }

    public final Object call() {
        Context context = this.f114863a;
        String str = this.f114864b;
        boolean z = this.f114865c;
        C45547d dVar = this.f114866d;
        C0027j jVar = this.f114867e;
        int i = this.f114868f;
        C39529ab abVar = C39618d.f101168i;
        C454416 r2 = new C39534e(jVar, str, i, dVar, z) {

            /* renamed from: a */
            final /* synthetic */ C0027j f114838a;

            /* renamed from: b */
            final /* synthetic */ String f114839b;

            /* renamed from: c */
            final /* synthetic */ int f114840c;

            /* renamed from: d */
            final /* synthetic */ C45547d f114841d;

            /* renamed from: e */
            final /* synthetic */ boolean f114842e;

            /* renamed from: a */
            public final void mo80628a(Exception exc) {
                this.f114841d.dismiss();
                if (this.f114842e) {
                    this.f114838a.mo43a(exc);
                } else {
                    this.f114838a.mo44a(new Bundle());
                }
            }

            /* renamed from: a */
            public final void mo80629a(String str, C42482c cVar) {
                Bundle bundle = new Bundle();
                if (!C45733a.m99540a() || cVar.isCommerceMusic()) {
                    C46055e.m100053a(this.f114839b, str);
                    cVar.setMusicPriority(this.f114840c);
                    C43214dh.m94817a().mo50200a(cVar);
                    bundle.putString(LeakCanaryFileProvider.f132050j, str);
                    this.f114838a.mo44a(bundle);
                    return;
                }
                this.f114838a.mo44a(bundle);
            }

            {
                this.f114838a = r1;
                this.f114839b = r2;
                this.f114840c = r3;
                this.f114841d = r4;
                this.f114842e = r5;
            }
        };
        abVar.mo80573a(context, str, 0, z, dVar, r2);
        return null;
    }
}
