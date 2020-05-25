package com.p683ss.android.ugc.aweme.shortvideo.edit;

import com.p683ss.android.ugc.aweme.services.publish.PublishOutput;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bc */
public final class C43448bc {
    /* renamed from: a */
    public static final PublishOutput m95233a(VideoPublishEditModel videoPublishEditModel) {
        C52711k.m112240b(videoPublishEditModel, "$this$toPublishOutput");
        PublishOutput publishOutput = new PublishOutput(videoPublishEditModel.creationId, videoPublishEditModel.getContactVideoPathAsKey(), videoPublishEditModel.musicId, videoPublishEditModel.isCommercialMusic(), videoPublishEditModel.isOriginalSound());
        return publishOutput;
    }
}
