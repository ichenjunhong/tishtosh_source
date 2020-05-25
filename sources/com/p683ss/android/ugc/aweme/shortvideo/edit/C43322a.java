package com.p683ss.android.ugc.aweme.shortvideo.edit;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.a */
public abstract class C43322a implements C43449bd {

    /* renamed from: a */
    public boolean f109583a;

    /* renamed from: b */
    private final VideoPublishEditModel f109584b;

    /* renamed from: a */
    public static int m95061a(int i) {
        return ((i + 16) - 1) & -16;
    }

    public C43322a(VideoPublishEditModel videoPublishEditModel) {
        C52711k.m112240b(videoPublishEditModel, "editModel");
        this.f109584b = videoPublishEditModel;
    }

    /* renamed from: a */
    public final int mo88243a(boolean z) {
        if (z) {
            return this.f109584b.videoWidth();
        }
        return this.f109584b.sourceVideoWidth();
    }

    /* renamed from: b */
    public final int mo88244b(boolean z) {
        if (z) {
            return this.f109584b.videoHeight();
        }
        return this.f109584b.sourceVideoHeight();
    }

    /* renamed from: c */
    public final void mo88245c(boolean z) {
        this.f109583a = z;
        this.f109584b.mVideoCanvasWidth = mo88379a();
        this.f109584b.mVideoCanvasHeight = mo88380b();
        this.f109584b.mOutVideoWidth = mo88381c();
        this.f109584b.mOutVideoHeight = mo88382d();
    }
}
