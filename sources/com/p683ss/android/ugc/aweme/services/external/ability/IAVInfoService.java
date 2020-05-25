package com.p683ss.android.ugc.aweme.services.external.ability;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.vesdk.C50753r;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52687r;

/* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVInfoService */
public interface IAVInfoService {

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVInfoService$IFilterMedia */
    public interface IFilterMedia<T> {
        boolean filter(T t);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVInfoService$IGetInfoCallback */
    public interface IGetInfoCallback<T> {
        void finish(T t);
    }

    void audioLegal(String str, IGetInfoCallback<Integer> iGetInfoCallback);

    void audioLegal(List<? extends MusicModel> list, IFilterMedia<Integer> iFilterMedia, IGetInfoCallback<List<MusicModel>> iGetInfoCallback);

    void audioLegal(List<String> list, IGetInfoCallback<List<Integer>> iGetInfoCallback);

    void getThumbnail(boolean z, long j, long j2, boolean z2, Options options, IGetInfoCallback<Bitmap> iGetInfoCallback);

    void importLegal(Context context, String str, boolean z, int i, int i2, C52682m<? super String, ? super Long, C52860x> mVar, C52687r<? super String, ? super Long, ? super Integer, ? super String, C52860x> rVar);

    void mp3Legal(String str, IGetInfoCallback<Integer> iGetInfoCallback);

    int[] photoInfo(String str);

    void videoCover(C29059c cVar, IGetInfoCallback<Bitmap> iGetInfoCallback);

    void videoCover(PhotoMovieContext photoMovieContext, IGetInfoCallback<Bitmap> iGetInfoCallback);

    void videoFrame(String str, int[] iArr, C50753r rVar);

    void videoInfo(String str, boolean z, IGetInfoCallback<int[]> iGetInfoCallback);
}
