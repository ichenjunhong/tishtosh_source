package com.p683ss.android.ugc.aweme.services.video;

import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext.C38719a;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContextOld;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContextOld.C38721a;
import com.p683ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;

/* renamed from: com.ss.android.ugc.aweme.services.video.IVideoCoverService */
public interface IVideoCoverService {
    void getPhotoMovieCover(PhotoMovieContext photoMovieContext, C38719a aVar);

    void getPhotoMovieCover(PhotoMovieContextOld photoMovieContextOld, C38721a aVar);

    void getVideoCoverByCallback(C29059c cVar, OnVideoCoverCallback onVideoCoverCallback);

    void getVideoCoverByCallback(String str, int i, OnGetVideoCoverCallback onGetVideoCoverCallback);
}
