package com.p683ss.android.ugc.aweme.external;

import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.external.IInitTaskService;
import p2628d.C52857u;

/* renamed from: com.ss.android.ugc.aweme.external.h */
public final class C29629h implements IInitTaskService {

    /* renamed from: com.ss.android.ugc.aweme.external.h$a */
    static final class C29630a implements Runnable {

        /* renamed from: a */
        public static final C29630a f77485a = new C29630a();

        C29630a() {
        }

        public final void run() {
            C39618d.f101177r.invalidate();
            C39618d.f101176q.invalidate();
        }
    }

    public final LegoTask initTask(int i) {
        if (i == 1) {
            return new AVCleanStorageTask();
        }
        switch (i) {
            case 4:
                return new AVCameraInitTask();
            case 5:
                return new DownloadSuperEntranceResTask();
            default:
                return null;
        }
    }

    public final Runnable initTask(int i, Object obj) {
        switch (i) {
            case 2:
                C39529ab abVar = C39618d.f101168i;
                if (obj != null) {
                    abVar.mo80581c((String) obj);
                    break;
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.String");
                }
            case 3:
                return C29630a.f77485a;
        }
        return null;
    }
}
