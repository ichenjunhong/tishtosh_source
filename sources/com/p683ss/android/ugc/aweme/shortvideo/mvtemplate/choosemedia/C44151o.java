package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.os.Bundle;
import android.support.p030v4.p038f.C0781c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.o */
public final class C44151o implements C44148l {

    /* renamed from: a */
    public AVChallenge f111843a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.o$a */
    static final class C44152a<T> implements C0781c<AVChallenge> {

        /* renamed from: a */
        final /* synthetic */ C44151o f111844a;

        C44152a(C44151o oVar) {
            this.f111844a = oVar;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            this.f111844a.f111843a = (AVChallenge) obj;
        }
    }

    /* renamed from: a */
    public final Bundle mo90032a() {
        if (this.f111843a == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("Key_mv_challenge", this.f111843a);
        return bundle;
    }

    /* renamed from: a */
    public final void mo90033a(Bundle bundle) {
        C52711k.m112240b(bundle, "data");
        String string = bundle.getString("Key_challenge_id");
        C52711k.m112236a((Object) string, "data.getString(MvThemeContants.KEY_CHALLENGE_ID)");
        C39618d.f101163d.mo74186a(string, null, 0, 0, new C44152a(this));
    }
}
