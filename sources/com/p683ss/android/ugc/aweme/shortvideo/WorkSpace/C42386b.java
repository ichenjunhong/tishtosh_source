package com.p683ss.android.ugc.aweme.shortvideo.WorkSpace;

import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43668b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.WorkSpace.b */
public final class C42386b {

    /* renamed from: a */
    public static final C42386b f107190a = new C42386b();

    private C42386b() {
    }

    /* renamed from: a */
    public static Workspace m93131a(VideoPublishEditModel videoPublishEditModel) {
        C52711k.m112240b(videoPublishEditModel, "model");
        if (videoPublishEditModel.isReviewVideo()) {
            Workspace b = Workspace.m93094b(null, null, videoPublishEditModel.mMusicPath, videoPublishEditModel.reverseVideoPath());
            C52711k.m112236a((Object) b, "Workspace.createFromRevi…model.reverseVideoPath())");
            return b;
        } else if (videoPublishEditModel.isFastImport) {
            Workspace a = Workspace.m93092a(null, null, videoPublishEditModel.mMusicPath, videoPublishEditModel.reverseVideoPath());
            C52711k.m112236a((Object) a, "Workspace.createOldFromD…model.reverseVideoPath())");
            return a;
        } else if (C43668b.m95940a(videoPublishEditModel)) {
            Workspace a2 = Workspace.m93092a(null, null, videoPublishEditModel.mMusicPath, videoPublishEditModel.reverseVideoPath());
            C52711k.m112236a((Object) a2, "Workspace.createOldFromD…model.reverseVideoPath())");
            return a2;
        } else {
            Workspace a3 = Workspace.m93092a(videoPublishEditModel.getContactVideoPathAsKey(), videoPublishEditModel.getContactAudioPathAsKey(), videoPublishEditModel.mMusicPath, videoPublishEditModel.reverseVideoPath());
            C52711k.m112236a((Object) a3, "Workspace.createOldFromD…model.reverseVideoPath())");
            return a3;
        }
    }
}
