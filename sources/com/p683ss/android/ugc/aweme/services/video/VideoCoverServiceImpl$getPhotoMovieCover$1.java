package com.p683ss.android.ugc.aweme.services.video;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import android.support.p030v4.p038f.C0781c;
import android.text.TextUtils;
import com.p683ss.android.medialib.model.CoverInfo;
import com.p683ss.android.medialib.photomovie.MovieCover;
import com.p683ss.android.ugc.aweme.photo.C38657e;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext.C38719a;
import com.p683ss.android.ugc.aweme.utils.C47804db;
import com.p683ss.android.ugc.aweme.utils.C47926h;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.video.VideoCoverServiceImpl$getPhotoMovieCover$1 */
final class VideoCoverServiceImpl$getPhotoMovieCover$1<V> implements Callable<TResult> {
    final /* synthetic */ C38719a $onPhotoMovieCover;
    final /* synthetic */ PhotoMovieContext $photoMovieContext;

    VideoCoverServiceImpl$getPhotoMovieCover$1(PhotoMovieContext photoMovieContext, C38719a aVar) {
        this.$photoMovieContext = photoMovieContext;
        this.$onPhotoMovieCover = aVar;
    }

    public final void call() {
        if (this.$photoMovieContext.mImageList != null) {
            ArrayList arrayList = new ArrayList();
            List<String> list = this.$photoMovieContext.mImageList;
            C52711k.m112236a((Object) list, "photoMovieContext.mImageList");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(this.$photoMovieContext.mImageList.get(i));
            }
            MovieCover movieCover = new MovieCover();
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                CoverInfo cover = movieCover.getCover(C47926h.m103698a((String[]) array, C47804db.IMAGE), this.$photoMovieContext.mFilterPath, this.$photoMovieContext.mPlayType, (long) (this.$photoMovieContext.mCoverStartTm * 1000.0f), 128, (int) PhotoMovieContext.PHOTO_MOVIE_COVER_HEIGHT);
                if (cover == null || cover.getData() == null) {
                    if (!TextUtils.isEmpty(this.$photoMovieContext.getPhotoMovieCover())) {
                        String photoMovieCover = this.$photoMovieContext.getPhotoMovieCover();
                        if (photoMovieCover == null) {
                            C52711k.m112234a();
                        }
                        C50181a.m108296a(C38657e.m85995a(Uri.fromFile(new File(photoMovieCover))), 128, (int) PhotoMovieContext.PHOTO_MOVIE_COVER_HEIGHT, (C0781c<Bitmap>) new C0781c<Bitmap>(this) {
                            final /* synthetic */ VideoCoverServiceImpl$getPhotoMovieCover$1 this$0;

                            {
                                this.this$0 = r1;
                            }

                            public final void accept(Bitmap bitmap) {
                                this.this$0.$onPhotoMovieCover.mo58818a(bitmap, 128, PhotoMovieContext.PHOTO_MOVIE_COVER_HEIGHT);
                            }
                        });
                    }
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(cover.getData(), cover.getWidth(), cover.getHeight(), Config.ARGB_8888);
                C52711k.m112236a((Object) createBitmap, "Bitmap.createBitmap(cove…              .ARGB_8888)");
                this.$onPhotoMovieCover.mo58818a(createBitmap, cover.getWidth(), cover.getHeight());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
