package com.p683ss.android.ugc.aweme.photomovie;

import com.p683ss.android.medialib.photomovie.PhotoMovie;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback;
import p001a.C0027j;

/* renamed from: com.ss.android.ugc.aweme.photomovie.g */
final /* synthetic */ class C38799g implements IProcessCallback {

    /* renamed from: a */
    private final PhotoMovie f98731a;

    /* renamed from: b */
    private final PhotoMovieContext f98732b;

    /* renamed from: c */
    private final C0027j f98733c;

    C38799g(PhotoMovie photoMovie, PhotoMovieContext photoMovieContext, C0027j jVar) {
        this.f98731a = photoMovie;
        this.f98732b = photoMovieContext;
        this.f98733c = jVar;
    }

    public final void finish(Object obj) {
        PhotoMovie photoMovie = this.f98731a;
        PhotoMovieContext photoMovieContext = this.f98732b;
        C0027j jVar = this.f98733c;
        photoMovie.setMarkParam((String[]) obj, photoMovieContext.getLocalTempPath(), false, 2, 0, photoMovieContext.mSaveModel.getSaveType() == 2 ? 1 : -1, 0, 16, 20);
        jVar.mo44a(null);
    }
}
