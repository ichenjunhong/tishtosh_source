package com.p683ss.android.ugc.aweme.shortvideo.p2225s;

import com.p683ss.android.ugc.aweme.shortvideo.C42421al;
import com.p683ss.android.ugc.aweme.shortvideo.C43907k;
import com.p683ss.android.ugc.aweme.shortvideo.C44334o;
import com.p683ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.s.t */
public final class C44507t extends C44468a {
    public final String toString() {
        return "ReviewVideoFastPublisher";
    }

    /* renamed from: e */
    public final void mo90366e() {
        throw new UnsupportedOperationException("ReviewVideoFastPublisher can't support prePublish");
    }

    /* renamed from: g */
    public final void mo90368g() {
        mo90357b();
        VideoCreation videoCreation = new VideoCreation();
        Object obj = this.f112476i;
        if (obj != null) {
            videoCreation.setMaterialId(((VideoPublishEditModel) obj).reviewVideoId);
            mo90358b(videoCreation);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
    }

    /* renamed from: f */
    public final void mo90367f() {
        Object obj = this.f112476i;
        if (obj == null) {
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        } else if (((VideoPublishEditModel) obj).isSaveLocalWithWaterMark()) {
            mo90355a(true);
        } else {
            this.f112470c = new SynthetiseResult();
            VideoCreation videoCreation = new VideoCreation();
            Object obj2 = this.f112476i;
            if (obj2 != null) {
                videoCreation.setMaterialId(((VideoPublishEditModel) obj2).reviewVideoId);
                mo90358b(videoCreation);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        }
    }

    /* renamed from: c */
    public final void mo90361c(VideoCreation videoCreation) {
        throw new UnsupportedOperationException("ReviewVideoFastPublisher can't support CreateVideo");
    }

    /* renamed from: d */
    public final void mo90364d(VideoCreation videoCreation) {
        throw new UnsupportedOperationException("ReviewVideoFastPublisher can't support UploadVideo");
    }

    public C44507t(C43907k kVar, int i, int i2, int i3, String str, boolean z, C44334o<C42421al> oVar) {
        C52711k.m112240b(kVar, "futureFactory");
        C52711k.m112240b(oVar, "callbacks");
        super(kVar, i, i2, i3, str, false, oVar);
    }
}
