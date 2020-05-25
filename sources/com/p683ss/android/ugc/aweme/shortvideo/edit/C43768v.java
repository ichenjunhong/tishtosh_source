package com.p683ss.android.ugc.aweme.shortvideo.edit;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.v */
public final class C43768v extends C43322a {

    /* renamed from: b */
    public final VideoPublishEditModel f110832b;

    /* renamed from: a */
    public final int mo88379a() {
        return this.f110832b.videoWidth();
    }

    /* renamed from: b */
    public final int mo88380b() {
        return this.f110832b.videoHeight();
    }

    /* renamed from: c */
    public final int mo88381c() {
        if (this.f109583a) {
            return mo88379a();
        }
        return this.f110832b.videoWidth();
    }

    /* renamed from: d */
    public final int mo88382d() {
        if (this.f109583a) {
            return mo88380b();
        }
        return this.f110832b.videoHeight();
    }

    public C43768v(VideoPublishEditModel videoPublishEditModel) {
        C52711k.m112240b(videoPublishEditModel, "editModel");
        super(videoPublishEditModel);
        this.f110832b = videoPublishEditModel;
    }
}
