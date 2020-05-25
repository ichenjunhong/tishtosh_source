package com.p683ss.android.ugc.aweme.shortvideo.util;

import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b;
import com.p683ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p683ss.android.ugc.aweme.services.publish.PublishOutput;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ao */
public final class C45397ao {

    /* renamed from: a */
    public static final C45397ao f114782a = new C45397ao();

    private C45397ao() {
    }

    /* renamed from: a */
    public static boolean m98954a(PublishOutput publishOutput, AVPublishContentType aVPublishContentType) {
        C52711k.m112240b(publishOutput, "publishOutput");
        C52711k.m112240b(aVPublishContentType, "contentType");
        if (!C24678b.m60182a(publishOutput.getMusicId()) || aVPublishContentType != AVPublishContentType.Video || publishOutput.isCommercialMusic() || publishOutput.isOriginalSound()) {
            return false;
        }
        return true;
    }
}
