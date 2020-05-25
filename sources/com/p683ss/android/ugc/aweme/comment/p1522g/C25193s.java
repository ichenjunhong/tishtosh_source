package com.p683ss.android.ugc.aweme.comment.p1522g;

import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.comment.g.s */
public final class C25193s extends C26851b<C25191q, C25197v> {

    /* renamed from: a */
    public static final C25194a f66769a = new C25194a(null);

    /* renamed from: com.ss.android.ugc.aweme.comment.g.s$a */
    public static final class C25194a {
        private C25194a() {
        }

        public /* synthetic */ C25194a(C52707g gVar) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44838b() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.common.e r0 = r5.f70701g
            com.ss.android.ugc.aweme.comment.g.v r0 = (com.p683ss.android.ugc.aweme.comment.p1522g.C25197v) r0
            if (r0 == 0) goto L_0x003f
            com.ss.android.ugc.aweme.common.a r1 = r5.f70700f
            com.ss.android.ugc.aweme.comment.g.q r1 = (com.p683ss.android.ugc.aweme.comment.p1522g.C25191q) r1
            r2 = 0
            if (r1 == 0) goto L_0x001c
            java.lang.Object r1 = r1.getData()
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.p683ss.android.ugc.aweme.base.api.BaseResponse) r1
            if (r1 == 0) goto L_0x001c
            int r1 = r1.error_code
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x001d
        L_0x001c:
            r1 = r2
        L_0x001d:
            com.ss.android.ugc.aweme.common.a r3 = r5.f70700f
            com.ss.android.ugc.aweme.comment.g.q r3 = (com.p683ss.android.ugc.aweme.comment.p1522g.C25191q) r3
            if (r3 == 0) goto L_0x002e
            java.lang.Object r3 = r3.getData()
            com.ss.android.ugc.aweme.base.api.BaseResponse r3 = (com.p683ss.android.ugc.aweme.base.api.BaseResponse) r3
            if (r3 == 0) goto L_0x002e
            java.lang.String r3 = r3.status_msg
            goto L_0x002f
        L_0x002e:
            r3 = r2
        L_0x002f:
            com.ss.android.ugc.aweme.common.a r4 = r5.f70700f
            com.ss.android.ugc.aweme.comment.g.q r4 = (com.p683ss.android.ugc.aweme.comment.p1522g.C25191q) r4
            if (r4 == 0) goto L_0x003b
            boolean r2 = r4.f66767d
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
        L_0x003b:
            r0.mo51450a(r1, r3, r2)
            return
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.p1522g.C25193s.mo44838b():void");
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        Boolean bool;
        if (this.f70701g != null) {
            if (exc instanceof C23459a) {
                C23459a aVar = (C23459a) exc;
                if (aVar.getErrorCode() == 13 || aVar.getErrorCode() == 5400) {
                    C25197v vVar = (C25197v) this.f70701g;
                    if (vVar != null) {
                        Integer valueOf = Integer.valueOf(aVar.getErrorCode());
                        String errorMsg = aVar.getErrorMsg();
                        C25191q qVar = (C25191q) this.f70700f;
                        if (qVar != null) {
                            bool = Boolean.valueOf(qVar.f66767d);
                        } else {
                            bool = null;
                        }
                        vVar.mo51450a(valueOf, errorMsg, bool);
                    } else {
                        return;
                    }
                }
            }
            C25197v vVar2 = (C25197v) this.f70701g;
            if (vVar2 != null) {
                vVar2.mo51451e(exc);
            }
        }
    }
}
