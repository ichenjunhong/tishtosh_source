package com.p683ss.android.ugc.aweme.commercialize.utils.p1582c;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35464a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35465b;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.d */
public final class C26458d {

    /* renamed from: a */
    public static final C26458d f69741a = new C26458d();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.d$a */
    public static final class C26459a extends Handler {

        /* renamed from: a */
        final /* synthetic */ Aweme f69742a;

        /* renamed from: b */
        final /* synthetic */ Context f69743b;

        /* renamed from: c */
        final /* synthetic */ C35464a f69744c;

        public final void handleMessage(Message message) {
            String str;
            C52711k.m112240b(message, "msg");
            super.handleMessage(message);
            if (message.obj instanceof User) {
                C35465b bVar = new C35465b();
                bVar.commerceScene = "video";
                Aweme aweme = this.f69742a;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                bVar.objectId = str;
                IIMService a = C33194e.m76277a(false);
                Context context = this.f69743b;
                Object obj = message.obj;
                if (obj != null) {
                    a.startChatWithAdLog(context, IMUser.fromUser((User) obj), this.f69744c, bVar);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
            }
        }

        public C26459a(Aweme aweme, Context context, C35464a aVar, Looper looper) {
            this.f69742a = aweme;
            this.f69743b = context;
            this.f69744c = aVar;
            super(looper);
        }
    }

    private C26458d() {
    }
}
