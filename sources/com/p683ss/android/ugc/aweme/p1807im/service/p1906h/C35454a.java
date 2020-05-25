package com.p683ss.android.ugc.aweme.p1807im.service.p1906h;

import android.content.Context;
import com.bytedance.router.SmartRouter;

/* renamed from: com.ss.android.ugc.aweme.im.service.h.a */
public abstract class C35454a extends C35456b {

    /* renamed from: com.ss.android.ugc.aweme.im.service.h.a$a */
    static final class C35455a implements C35457c {

        /* renamed from: a */
        final /* synthetic */ C35454a f91113a;

        C35455a(C35454a aVar) {
            this.f91113a = aVar;
        }

        /* renamed from: a */
        public final void mo72636a(Context context, C35456b bVar, int i) {
            switch (i) {
                case 1:
                case 2:
                    this.f91113a.mo73749f();
                    SmartRouter.buildRoute(context, "aweme://notification").withParam("from_where", this.f91113a.mo73750g()).withParam("unRead_message_count", this.f91113a.f91119j).open();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: b */
    public final int mo72634b() {
        return 27;
    }

    /* renamed from: f */
    public abstract void mo73749f();

    /* renamed from: g */
    public abstract int mo73750g();

    /* renamed from: a */
    public C35457c mo72633a() {
        return new C35455a(this);
    }

    /* renamed from: d */
    public void mo72643d() {
        this.f91117h = "";
    }
}
