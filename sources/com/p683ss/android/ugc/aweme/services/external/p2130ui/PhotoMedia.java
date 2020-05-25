package com.p683ss.android.ugc.aweme.services.external.p2130ui;

import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.PhotoMedia */
public final class PhotoMedia implements MediaInfo {
    private final PhotoContext photoContext;

    public final PhotoContext getPhotoContext() {
        return this.photoContext;
    }

    public PhotoMedia(PhotoContext photoContext2) {
        C52711k.m112240b(photoContext2, "photoContext");
        this.photoContext = photoContext2;
    }
}
