package com.p683ss.android.ugc.aweme.utils;

import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.detail.p1628ui.C27488ae;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p683ss.android.ugc.aweme.main.C36663h;
import com.p683ss.android.ugc.aweme.main.C36664i;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.video.IActivityNameService;

/* renamed from: com.ss.android.ugc.aweme.utils.fx */
public final class C47904fx {
    /* renamed from: a */
    public static boolean m103628a(Context context) {
        if (context != null && (context instanceof C36663h)) {
            C36663h hVar = (C36663h) context;
            if ((hVar.getCurFragment() instanceof C36664i) && ScrollSwitchStateManager.m75876a((FragmentActivity) hVar).mo69868b("page_feed")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m103629b(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof C27488ae) {
            ScrollSwitchStateManager a = ScrollSwitchStateManager.m75876a((FragmentActivity) ((C27488ae) context));
            if (!a.mo69864a() || a.mo69868b("page_feed")) {
                return true;
            }
            return false;
        }
        IActivityNameService classnameService = AVExternalServiceImpl.getAVServiceImpl_Monster().classnameService();
        if (classnameService.getVideoRecordActivityClass().isInstance(context) || classnameService.getVideoPublishPreviewActivityClass().isInstance(context)) {
            return true;
        }
        return false;
    }
}
