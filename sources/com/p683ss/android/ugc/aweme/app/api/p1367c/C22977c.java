package com.p683ss.android.ugc.aweme.app.api.p1367c;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.squareup.wire.Message;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.ss.android.ugc.aweme.app.api.c.c */
public class C22977c<P extends Message, J> implements C22978d, C22982e {

    /* renamed from: a */
    final J f61312a;

    /* renamed from: b */
    final P f61313b;
    @C17952c(mo34828a = "rid")

    /* renamed from: c */
    String f61314c;

    /* renamed from: d */
    private transient Long f61315d;

    public String getRequestId() {
        return this.f61314c;
    }

    public void setNetworkInfoKey(Long l) {
        this.f61315d = l;
    }

    public void setRequestId(String str) {
        this.f61314c = str;
    }

    /* renamed from: a */
    public final J mo47749a(C1711f<P, J> fVar) throws Exception {
        J j = this.f61312a;
        if (j == null) {
            j = fVar.apply(this.f61313b);
        }
        if (j instanceof C22982e) {
            ((C22982e) j).setRequestId(this.f61314c);
        }
        if (j instanceof C22978d) {
            ((C22978d) j).setNetworkInfoKey(this.f61315d);
        }
        return j;
    }

    C22977c(J j, P p) {
        if (j == null && p == null) {
            throw new IllegalArgumentException("wrong args");
        }
        this.f61312a = j;
        this.f61313b = p;
    }
}
