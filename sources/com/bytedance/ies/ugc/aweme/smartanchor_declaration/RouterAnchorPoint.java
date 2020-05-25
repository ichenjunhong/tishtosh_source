package com.bytedance.ies.ugc.aweme.smartanchor_declaration;

import com.bytedance.ies.ugc.aweme.p695a.C11024a;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.C22729a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.C22730b;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.C22732d;
import com.p683ss.android.ugc.aweme.app.p1378h.C23103a;
import com.p683ss.android.ugc.aweme.donation.C29039e;
import com.p683ss.android.ugc.aweme.router.C41266a;
import com.p683ss.android.ugc.aweme.router.C41269aa;
import com.p683ss.android.ugc.aweme.router.C41274d;
import com.p683ss.android.ugc.aweme.router.C41275e;
import com.p683ss.android.ugc.aweme.router.C41278g;
import com.p683ss.android.ugc.aweme.router.C41280h;
import com.p683ss.android.ugc.aweme.router.C41281i;
import com.p683ss.android.ugc.aweme.router.C41283j;
import com.p683ss.android.ugc.aweme.router.C41284k;
import com.p683ss.android.ugc.aweme.router.C41286l;
import com.p683ss.android.ugc.aweme.router.C41289n;
import com.p683ss.android.ugc.aweme.router.C41291o;
import com.p683ss.android.ugc.aweme.router.C41292p;
import com.p683ss.android.ugc.aweme.router.C41293q;
import com.p683ss.android.ugc.aweme.router.C41295r;

public class RouterAnchorPoint implements C11024a {
    public static C11024a getPoint() {
        return new RouterAnchorPoint();
    }

    public void run(Object obj) {
        new C41283j();
        SmartRouter.addInterceptor(new C41286l());
        new C41275e();
        SmartRouter.addInterceptor(new C41269aa());
        SmartRouter.addInterceptor(new C41284k());
        SmartRouter.addInterceptor(new C41292p());
        SmartRouter.addInterceptor(new C41266a());
        new C41291o();
        SmartRouter.addInterceptor(new C23103a());
        SmartRouter.addInterceptor(new C41269aa());
        SmartRouter.addInterceptor(new C41295r());
        SmartRouter.addInterceptor(new C41284k());
        SmartRouter.addInterceptor(new C41281i());
        SmartRouter.addInterceptor(new C41293q());
        SmartRouter.addInterceptor(new C41289n());
        SmartRouter.addInterceptor(new C22730b());
        SmartRouter.addInterceptor(new C41274d());
        SmartRouter.addInterceptor(new C29039e());
        new C22729a();
        SmartRouter.addInterceptor(new C22732d());
        new C41280h();
        System.out.println("Cofig will add challenge");
        SmartRouter.addInterceptor(new C41278g());
    }
}
