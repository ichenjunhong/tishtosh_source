package com.p683ss.android.ugc.aweme.services.photomovie;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.p030v4.app.C0643c;
import android.support.p030v4.view.C1056u;
import android.view.View;
import android.widget.ImageView;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieChooseCoverActivity;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieEditActivity;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMoviePreViewActivity;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44403a;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.services.photomovie.PhotoMovieService */
public class PhotoMovieService implements IPhotoMovieService {
    public void startPhotoMovieChooseCoverActivity(Activity activity, PhotoMovieContext photoMovieContext, int i) {
        Intent intent = new Intent(activity, PhotoMovieChooseCoverActivity.class);
        intent.putExtra(IPhotoMovieService.EXTRA_DATA_PHOTO_MOVIE, photoMovieContext);
        activity.startActivityForResult(intent, i);
        activity.overridePendingTransition(R.anim.q, R.anim.r);
    }

    public void startPhotoMovieEditDraftActivity(Context context, C29059c cVar, List<MusicModel> list) {
        PhotoMovieContext photoMovieContext = cVar.f76145c;
        if (photoMovieContext != null && cVar.f76144b != null) {
            photoMovieContext.challenges = cVar.f76144b.f76030c;
            photoMovieContext.title = cVar.f76144b.f76028a;
            photoMovieContext.structList = cVar.f76144b.f76029b;
            photoMovieContext.isPrivate = cVar.f76124B;
            photoMovieContext.mIsFromDraft = true;
            photoMovieContext.mFrom = 1;
            photoMovieContext.poiId = cVar.mo58733J();
            photoMovieContext.mSaveModel = cVar.mo58732I();
            photoMovieContext.draftEditTransferModel = new DraftEditTransferModel(cVar.mo58774ak(), null);
            C44403a.m97196a().mo48303a(context, photoMovieContext, C39618d.f101168i.mo80571a(list));
        }
    }

    public void startPhotoMoviePreviewActivity(Activity activity, ImageView imageView, PhotoMovieContext photoMovieContext, String str) {
        Intent intent = new Intent(activity, PhotoMoviePreViewActivity.class);
        intent.putExtra(IPhotoMovieService.EXTRA_DATA_PHOTO_MOVIE, photoMovieContext);
        C1056u.m3036a((View) imageView, "transition_img_name");
        activity.startActivity(intent, C0643c.m1725a(activity, (View) imageView, "transition_img_name").mo2171a());
    }

    public void startPhotoMovieEditActivity(Context context, PhotoMovieContext photoMovieContext, List<C42482c> list, String str, long j) {
        Intent intent = new Intent(context, PhotoMovieEditActivity.class);
        photoMovieContext.mShootWay = str;
        intent.putExtra(IPhotoMovieService.EXTRA_DATA_PHOTO_MOVIE, photoMovieContext);
        intent.putExtra("extra_start_enter_edit_page", j);
        intent.putExtra(IPhotoMovieService.EXTRA_DATA_PHOTO_MOVIE_MUSIC_LIST, (Serializable) list);
        context.startActivity(intent);
    }
}
