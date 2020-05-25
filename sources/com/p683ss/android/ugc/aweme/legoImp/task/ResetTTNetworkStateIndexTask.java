package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.net.C37768e;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.ResetTTNetworkStateIndexTask */
public final class ResetTTNetworkStateIndexTask implements LegoTask {

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.ResetTTNetworkStateIndexTask$a */
    static final class C35961a<T> implements C1710e<Boolean> {

        /* renamed from: a */
        public static final C35961a f92188a = new C35961a();

        C35961a() {
        }

        public final /* synthetic */ void accept(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                C37768e.m84356a();
            }
        }
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BACKGROUND;
    }

    public final void run(Context context) {
        C11016e.m22309d().mo6545f((C1710e<? super T>) C35961a.f92188a);
    }
}
