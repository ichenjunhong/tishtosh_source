package com.p683ss.android.ugc.aweme.profile.presenter;

import android.net.Uri;
import android.net.Uri.Builder;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.profile.service.C40026s;
import java.util.Arrays;
import java.util.concurrent.Callable;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.ab */
public final class C39950ab extends C26851b<C26832a<C39953ac>, C39983q> {

    /* renamed from: a */
    public final String f101831a;

    /* renamed from: com.ss.android.ugc.aweme.profile.presenter.ab$a */
    public static final class C39951a extends C26832a<C39953ac> {

        /* renamed from: a */
        final /* synthetic */ C39950ab f101832a;

        /* renamed from: com.ss.android.ugc.aweme.profile.presenter.ab$a$a */
        static final class C39952a<V> implements Callable<Object> {

            /* renamed from: a */
            final /* synthetic */ Builder f101833a;

            C39952a(Builder builder) {
                this.f101833a = builder;
            }

            public final /* synthetic */ Object call() {
                return (C39953ac) C40026s.f101964a.apiExecuteGetJSONObject(this.f101833a.toString(), C39953ac.class, "", true, null);
            }
        }

        C39951a(C39950ab abVar) {
            this.f101832a = abVar;
        }

        public final boolean checkParams(Object... objArr) {
            C52711k.m112240b(objArr, "params");
            if (objArr.length == 1) {
                return true;
            }
            return false;
        }

        public final boolean sendRequest(Object... objArr) {
            C52711k.m112240b(objArr, "params");
            if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
                return false;
            }
            String str = objArr[0];
            if (str != null) {
                String str2 = str;
                Builder buildUpon = Uri.parse(this.f101832a.f101831a).buildUpon();
                buildUpon.appendQueryParameter("id", str2);
                C23566n.m57766a().mo48750a(this.mHandler, new C39952a(buildUpon), 0);
                return true;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.String");
        }
    }

    public C39950ab() {
        StringBuilder sb = new StringBuilder();
        sb.append(C18845b.f52040e);
        sb.append("/aweme/v1/user/uniqueid");
        this.f101831a = sb.toString();
        mo54799a(new C39951a(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44838b() {
        /*
            r3 = this;
            super.mo44838b()
            com.ss.android.ugc.aweme.common.a r0 = r3.f70700f
            r1 = 0
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r0.getData()
            com.ss.android.ugc.aweme.profile.presenter.ac r0 = (com.p683ss.android.ugc.aweme.profile.presenter.C39953ac) r0
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r0.f101834a
            goto L_0x0014
        L_0x0013:
            r0 = r1
        L_0x0014:
            com.ss.android.ugc.aweme.common.a r2 = r3.f70700f
            if (r2 == 0) goto L_0x0022
            java.lang.Object r2 = r2.getData()
            com.ss.android.ugc.aweme.profile.presenter.ac r2 = (com.p683ss.android.ugc.aweme.profile.presenter.C39953ac) r2
            if (r2 == 0) goto L_0x0022
            java.lang.String r1 = r2.f101835b
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            if (r1 == 0) goto L_0x002d
            com.ss.android.ugc.aweme.common.e r2 = r3.f70701g
            com.ss.android.ugc.aweme.profile.presenter.q r2 = (com.p683ss.android.ugc.aweme.profile.presenter.C39983q) r2
            r2.mo81908a(r0, r1)
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.presenter.C39950ab.mo44838b():void");
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        super.mo44840c_(exc);
        ((C39983q) this.f70701g).mo81907a();
    }
}
