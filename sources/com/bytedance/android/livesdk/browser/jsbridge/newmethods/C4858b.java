package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.DialogInterface.OnClickListener;
import android.support.p043v7.app.C1160b;
import android.support.p043v7.app.C1160b.C1161a;
import android.text.TextUtils;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.ies.p675g.p677b.C10779d;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.google.gson.p1076a.C17952c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.b */
public final class C4858b extends C10779d<C4860a, C4861b> {

    /* renamed from: a */
    private C1160b f13084a;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.b$a */
    static final class C4860a {
        @C17952c(mo34828a = "title")

        /* renamed from: a */
        String f13085a;
        @C17952c(mo34828a = "content")

        /* renamed from: b */
        String f13086b;
        @C17952c(mo34828a = "confirmText")

        /* renamed from: c */
        String f13087c;
        @C17952c(mo34828a = "showCancel")

        /* renamed from: d */
        boolean f13088d;
        @C17952c(mo34828a = "cancelText")

        /* renamed from: e */
        String f13089e;

        C4860a() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.b$b */
    static final class C4861b {
        @C17952c(mo34828a = "data")

        /* renamed from: a */
        C4862a f13090a;

        /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.b$b$a */
        static final class C4862a {
            @C17952c(mo34828a = "confirm")

            /* renamed from: a */
            boolean f13091a;
            @C17952c(mo34828a = "cancel")

            /* renamed from: b */
            boolean f13092b;

            C4862a(boolean z) {
                this.f13091a = z;
                this.f13092b = !z;
            }
        }

        private C4861b(boolean z) {
            this.f13090a = new C4862a(z);
        }
    }

    public final void onTerminate() {
        if (this.f13084a != null) {
            this.f13084a.dismiss();
        }
        this.f13084a = null;
    }

    public final /* synthetic */ void invoke(Object obj, C10783f fVar) throws Exception {
        String str;
        String str2;
        C4860a aVar = (C4860a) obj;
        C1161a aVar2 = new C1161a(fVar.f28972a);
        aVar2.mo3770b((CharSequence) aVar.f13086b);
        if (!TextUtils.isEmpty(aVar.f13085a)) {
            aVar2.mo3764a((CharSequence) aVar.f13085a);
        }
        if (TextUtils.isEmpty(aVar.f13087c)) {
            str = C3922z.m9903a((int) R.string.exh);
        } else {
            str = aVar.f13087c;
        }
        aVar2.mo3765a((CharSequence) str, (OnClickListener) new C4893c(this));
        if (aVar.f13088d) {
            if (TextUtils.isEmpty(aVar.f13089e)) {
                str2 = C3922z.m9903a((int) R.string.e45);
            } else {
                str2 = aVar.f13089e;
            }
            aVar2.mo3771b((CharSequence) str2, (OnClickListener) new C4894d(this));
        }
        this.f13084a = aVar2.mo3772b();
        this.f13084a.show();
    }
}
