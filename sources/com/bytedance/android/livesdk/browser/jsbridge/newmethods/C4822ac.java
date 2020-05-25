package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.chatroom.event.C5157ac;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.ies.p675g.p677b.C10779d;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ac */
public final class C4822ac extends C10779d<C4823a, Object> {

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ac$a */
    public static final class C4823a {
        @C17952c(mo34828a = "type")

        /* renamed from: a */
        public final String f13042a;

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f13042a, (java.lang.Object) ((com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4822ac.C4823a) r2).f13042a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4822ac.C4823a
                if (r0 == 0) goto L_0x0013
                com.bytedance.android.livesdk.browser.jsbridge.newmethods.ac$a r2 = (com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4822ac.C4823a) r2
                java.lang.String r0 = r1.f13042a
                java.lang.String r2 = r2.f13042a
                boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4822ac.C4823a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f13042a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(type=");
            sb.append(this.f13042a);
            sb.append(")");
            return sb.toString();
        }
    }

    public final void onTerminate() {
    }

    public final /* synthetic */ void invoke(Object obj, C10783f fVar) {
        C4823a aVar = (C4823a) obj;
        C52711k.m112240b(aVar, "params");
        C52711k.m112240b(fVar, "context");
        String str = aVar.f13042a;
        if (str.hashCode() == -990193242 && str.equals("anchor_submit_success")) {
            C4495a.m10823a().mo10301a((Object) new C5157ac());
            finishWithSuccess();
            return;
        }
        finishWithFailure();
    }
}
