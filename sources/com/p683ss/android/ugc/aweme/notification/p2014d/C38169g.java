package com.p683ss.android.ugc.aweme.notification.p2014d;

import android.os.Bundle;
import com.p683ss.android.ugc.aweme.message.p1949b.C36782d;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p2108r.p2109a.C41049a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.notification.d.g */
final /* synthetic */ class C38169g implements Callable {

    /* renamed from: a */
    private final C38163a f97209a;

    C38169g(C38163a aVar) {
        this.f97209a = aVar;
    }

    public final Object call() {
        C38163a aVar = this.f97209a;
        IIMService a = C41049a.m90715a(false);
        if (a != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("unread_count", C36782d.m82775a().mo75940c(11));
            a.onNewNoticeArrived(1, bundle);
        }
        aVar.mo78162a();
        aVar.mo78164b();
        aVar.mo78165c();
        aVar.mo78166d();
        return null;
    }
}
