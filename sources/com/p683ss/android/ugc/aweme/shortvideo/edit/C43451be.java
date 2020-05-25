package com.p683ss.android.ugc.aweme.shortvideo.edit;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.be */
public final class C43451be {
    /* renamed from: a */
    public static final C43449bd m95243a(VideoPublishEditModel videoPublishEditModel, boolean z) {
        C43322a aVar;
        C43322a aVar2;
        C52711k.m112240b(videoPublishEditModel, "model");
        if (z) {
            if (videoPublishEditModel.isFastImport) {
                aVar2 = new C43767u(videoPublishEditModel);
            } else {
                aVar2 = new C43768v(videoPublishEditModel);
            }
            return aVar2;
        }
        if (videoPublishEditModel.isFastImport) {
            aVar = new C43649j(videoPublishEditModel);
        } else {
            aVar = new C43453c(videoPublishEditModel);
        }
        return aVar;
    }
}
