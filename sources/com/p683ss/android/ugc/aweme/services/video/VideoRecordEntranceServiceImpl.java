package com.p683ss.android.ugc.aweme.services.video;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.port.p2082in.C39597bg;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45435f;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl */
public final class VideoRecordEntranceServiceImpl implements IVideoRecordEntranceService {
    public static final Companion Companion = new Companion(null);
    public static final C52668f INSTANCE$delegate = C52732g.m112285a(VideoRecordEntranceServiceImpl$Companion$INSTANCE$2.INSTANCE);

    /* renamed from: com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl$Companion */
    public static final class Companion {
        static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(Companion.class), "INSTANCE", "getINSTANCE()Lcom/ss/android/ugc/aweme/services/video/VideoRecordEntranceServiceImpl;"))};

        private Companion() {
        }

        public static /* synthetic */ void INSTANCE$annotations() {
        }

        public final VideoRecordEntranceServiceImpl getINSTANCE() {
            return (VideoRecordEntranceServiceImpl) VideoRecordEntranceServiceImpl.INSTANCE$delegate.getValue();
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    private VideoRecordEntranceServiceImpl() {
    }

    public static final VideoRecordEntranceServiceImpl getINSTANCE() {
        return Companion.getINSTANCE();
    }

    public /* synthetic */ VideoRecordEntranceServiceImpl(C52707g gVar) {
        this();
    }

    public final void startSuperEntranceRecordActivity(Activity activity, Intent intent) {
        C52711k.m112240b(activity, "activity");
        C45435f.m99013a(activity, intent);
    }

    public final void startToolPermissionActivity(Context context, Intent intent) {
        C39618d.f101150N.mo80676a(context, true, new VideoRecordEntranceServiceImpl$startToolPermissionActivity$2(context, intent));
    }

    public final void startToolPermissionActivity(Activity activity, Intent intent) {
        C39618d.f101150N.mo80676a(activity, true, new VideoRecordEntranceServiceImpl$startToolPermissionActivity$1(activity, intent));
    }

    public final void notifyToolPermissionActivity(Context context, Intent intent, boolean z, boolean z2, boolean z3) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(intent, "intent");
        C39597bg bgVar = C39618d.f101150N;
        VideoRecordEntranceServiceImpl$notifyToolPermissionActivity$1 videoRecordEntranceServiceImpl$notifyToolPermissionActivity$1 = new VideoRecordEntranceServiceImpl$notifyToolPermissionActivity$1(context, intent, z, z2, z3);
        bgVar.mo80676a(context, true, videoRecordEntranceServiceImpl$notifyToolPermissionActivity$1);
    }

    public final void startToolPermissionActivity(Activity activity, Intent intent, boolean z, boolean z2, boolean z3) {
        C52711k.m112240b(activity, "context");
        C52711k.m112240b(intent, "intent");
        C39597bg bgVar = C39618d.f101150N;
        Context context = activity;
        VideoRecordEntranceServiceImpl$startToolPermissionActivity$3 videoRecordEntranceServiceImpl$startToolPermissionActivity$3 = new VideoRecordEntranceServiceImpl$startToolPermissionActivity$3(activity, intent, z, z2, z3);
        bgVar.mo80676a(context, true, videoRecordEntranceServiceImpl$startToolPermissionActivity$3);
    }
}
