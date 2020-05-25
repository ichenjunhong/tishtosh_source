package com.p683ss.android.ugc.aweme.p1389au;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.photo.publish.PhotoPublishActivity;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMoviePublishActivity;
import com.p683ss.android.ugc.aweme.services.photomovie.IPhotoMovieService;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity.C42573a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity.C44037b;
import com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44404b;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoPublishActivity;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordNewActivity;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordPermissionActivity;
import com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity;
import com.p683ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.au.a */
public final class C23292a implements C44404b {
    /* renamed from: a */
    public final void mo48303a(Context context, PhotoMovieContext photoMovieContext, List<? extends C42482c> list) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(photoMovieContext, "model");
        C52711k.m112240b(list, "musicList");
        if (photoMovieContext != null) {
            Intent intent = new Intent();
            intent.setClass(context, PhotoMoviePublishActivity.class);
            intent.putExtra("shoot_way", "edit_draft");
            intent.putExtra(IPhotoMovieService.EXTRA_DATA_PHOTO_MOVIE_MUSIC_LIST, (Serializable) list);
            intent.putExtra(IPhotoMovieService.EXTRA_DATA_PHOTO_MOVIE, photoMovieContext);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public final void mo48295a(Activity activity, Intent intent) {
        C52711k.m112240b(activity, "context");
        C52711k.m112240b(intent, "intent");
        intent.setClass(activity, VideoRecordPermissionActivity.class);
    }

    /* renamed from: b */
    public final void mo48304b(Activity activity, Intent intent) {
        C52711k.m112240b(activity, "context");
        C52711k.m112240b(intent, "intent");
        intent.setClass(activity, VideoRecordNewActivity.class);
        activity.startActivity(intent);
    }

    /* renamed from: c */
    public final void mo48307c(Activity activity, Intent intent) {
        C52711k.m112240b(activity, "context");
        C52711k.m112240b(intent, "intent");
        intent.setClass(activity, DraftBoxActivity.class);
        activity.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo48301a(Context context, Intent intent) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(intent, "intent");
        intent.setClass(context, VideoPublishActivity.class);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo48302a(Context context, Intent intent, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(intent, "intent");
        C42573a.m93487a(context, intent, i);
    }

    /* renamed from: b */
    public final void mo48306b(Context context, Intent intent, int i) {
        C52711k.m112240b(context, "ctx");
        C52711k.m112240b(intent, "it");
        VEVideoPublishEditActivity.m95011a(context, intent, 1);
    }

    /* renamed from: c */
    public final void mo48308c(Activity activity, Intent intent, int i) {
        C52711k.m112240b(activity, "ctx");
        C52711k.m112240b(intent, "it");
        VEVideoPublishEditActivity.m95010a(activity, intent, 1);
    }

    /* renamed from: a */
    public final void mo48296a(Activity activity, Intent intent, int i) {
        C52711k.m112240b(activity, "context");
        C52711k.m112240b(intent, "intent");
        intent.setClass(activity, VideoPublishActivity.class);
        activity.startActivityForResult(intent, i);
    }

    /* renamed from: b */
    public final void mo48305b(Activity activity, Intent intent, int i) {
        C52711k.m112240b(activity, "context");
        C52711k.m112240b(intent, "intent");
        intent.setClass(activity, VideoRecordNewActivity.class);
        activity.startActivityForResult(intent, BaseNotice.CHECK_PROFILE);
    }

    /* renamed from: a */
    public final void mo48298a(Activity activity, PhotoContext photoContext, int i) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(photoContext, "model");
        Intent intent = new Intent();
        intent.setClass(activity, PhotoPublishActivity.class);
        intent.putExtra("photo_model", photoContext);
        activity.startActivityForResult(intent, 1);
    }

    /* renamed from: a */
    public final void mo48299a(Activity activity, PhotoMovieContext photoMovieContext, int i) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(photoMovieContext, "model");
        Intent intent = new Intent();
        intent.setClass(activity, PhotoMoviePublishActivity.class);
        intent.putExtra(IPhotoMovieService.EXTRA_DATA_PHOTO_MOVIE, photoMovieContext);
        activity.startActivityForResult(intent, 1);
    }

    /* renamed from: a */
    public final void mo48300a(Activity activity, StitchParams stitchParams, String str) {
        C52711k.m112240b(activity, "ctx");
        C52711k.m112240b(stitchParams, "params");
        Context context = activity;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(stitchParams, "params");
        Intent intent = new Intent();
        intent.setClass(context, StitchTrimmingActivity.class);
        intent.putExtra("stitch_params", stitchParams);
        String str2 = "creation_id";
        if (str == null) {
            str = UUID.randomUUID().toString();
        }
        intent.putExtra(str2, str);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo48297a(Activity activity, Bundle bundle, int i, int i2) {
        C52711k.m112240b(activity, "context");
        C52711k.m112240b(bundle, "bundle");
        C44037b.m96620a(activity, bundle, 2, 1001);
    }
}
