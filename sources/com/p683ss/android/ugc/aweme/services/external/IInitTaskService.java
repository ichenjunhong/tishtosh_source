package com.p683ss.android.ugc.aweme.services.external;

import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.services.external.IInitTaskService */
public interface IInitTaskService {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: com.ss.android.ugc.aweme.services.external.IInitTaskService$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    LegoTask initTask(int i);

    Runnable initTask(int i, Object obj);
}
