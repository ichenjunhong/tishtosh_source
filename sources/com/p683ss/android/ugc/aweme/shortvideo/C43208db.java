package com.p683ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.content.Intent;
import android.support.p030v4.app.JobIntentService;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.tools.policysecurity.C47334b.C47335a;
import com.p683ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService;
import com.p683ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.db */
public final class C43208db {
    /* renamed from: a */
    public static void m94806a(Context context, String str, String str2, Object obj) {
        if ((obj instanceof VideoPublishEditModel) && C39618d.f101151O.mo83117a(C40796a.UploadOriginalAudioTrack)) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            if (videoPublishEditModel.shouldUploadOriginalSound()) {
                OriginalSoundUploadTask originalSoundUploadTask = new OriginalSoundUploadTask(str, str2, videoPublishEditModel.mEncodedAudioOutputFile, System.currentTimeMillis());
                C47335a.m102704a(context).mo94619a(originalSoundUploadTask);
            }
            try {
                JobIntentService.enqueueWork(context, OriginalSoundUploadService.class, 3008, new Intent());
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
            }
        }
    }
}
