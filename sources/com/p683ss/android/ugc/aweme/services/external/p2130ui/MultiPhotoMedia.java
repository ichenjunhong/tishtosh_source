package com.p683ss.android.ugc.aweme.services.external.p2130ui;

import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.MultiPhotoMedia */
public final class MultiPhotoMedia implements MediaInfo {
    private final PhotoMovieContext photoMovieContext;

    public final PhotoMovieContext getPhotoMovieContext() {
        return this.photoMovieContext;
    }

    public MultiPhotoMedia(PhotoMovieContext photoMovieContext2) {
        C52711k.m112240b(photoMovieContext2, "photoMovieContext");
        this.photoMovieContext = photoMovieContext2;
    }
}
