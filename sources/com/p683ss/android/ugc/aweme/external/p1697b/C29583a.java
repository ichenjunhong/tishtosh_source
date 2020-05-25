package com.p683ss.android.ugc.aweme.external.p1697b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.common.C26916m;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.p1361ap.p1362a.C22795c;
import com.p683ss.android.ugc.aweme.photo.C38655c;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.PhotoService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.EditConfig;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IEditService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.MediaInfo;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.MultiPhotoMedia;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.MultiVideoMedia;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.PhotoMedia;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.ShareConfig;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.VideoMedia;
import com.p683ss.android.ugc.aweme.services.photomovie.PhotoMovieService;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity.C42573a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43597g;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C52928al;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.external.b.a */
public final class C29583a implements IEditService {

    /* renamed from: a */
    public final String f77414a = "diamond_publish_share_extra";

    /* renamed from: a */
    private static String m69664a(C26916m mVar) {
        C43597g gVar = new C43597g();
        gVar.setShareContext(mVar);
        String b = C39618d.f101139C.getRetrofitFactoryGson().mo34889b(gVar);
        C52711k.m112236a((Object) b, "AVEnv.NETWORK_SERVICE.ge…).toJson(businessContext)");
        return b;
    }

    /* renamed from: a */
    private static Intent m69663a(EditConfig editConfig) {
        Intent intent = new Intent();
        intent.putExtra("creation_id", editConfig.getCreationId());
        intent.putExtra("shoot_way", editConfig.getShootway());
        String str = "av_challenge";
        AVChallenge challenge = editConfig.getChallenge();
        if (!(challenge instanceof Serializable)) {
            challenge = null;
        }
        intent.putExtra(str, challenge);
        Integer launchFlag = editConfig.getLaunchFlag();
        if (launchFlag != null) {
            intent.addFlags(launchFlag.intValue());
        }
        return intent;
    }

    public final void startEdit(Context context, EditConfig editConfig) {
        C52711k.m112240b(editConfig, "editConfig");
        if (context != null) {
            if (editConfig.getClear()) {
                C22795c a = C22795c.m56156a();
                if (a != null) {
                    a.mo47276c();
                }
            }
            if (editConfig.getMediaInfo() != null) {
                MediaInfo mediaInfo = editConfig.getMediaInfo();
                if (mediaInfo != null) {
                    if (mediaInfo instanceof PhotoMedia) {
                        new PhotoService().toPhotoEditActivity(context, ((PhotoMedia) mediaInfo).getPhotoContext());
                    } else if (mediaInfo instanceof MultiPhotoMedia) {
                        Context context2 = context;
                        new PhotoMovieService().startPhotoMovieEditActivity(context2, ((MultiPhotoMedia) mediaInfo).getPhotoMovieContext(), new ArrayList(), null, System.currentTimeMillis());
                    } else {
                        if (mediaInfo instanceof VideoMedia) {
                            VideoMedia videoMedia = (VideoMedia) mediaInfo;
                            String filePath = videoMedia.getFilePath();
                            Intent a2 = m69663a(editConfig);
                            Bundle extraBundle = videoMedia.getExtraBundle();
                            if (extraBundle != null) {
                                a2.putExtras(extraBundle);
                            }
                            a2.putExtra("file_path", filePath);
                            if (a2.getBooleanExtra("extra_enter_from_live", false)) {
                                C42573a.m93487a(context, a2, 8);
                            } else {
                                C42573a.m93487a(context, a2, -1);
                            }
                        } else if (mediaInfo instanceof MultiVideoMedia) {
                            MultiVideoMedia multiVideoMedia = (MultiVideoMedia) mediaInfo;
                            ArrayList videoMedias = multiVideoMedia.getVideoMedias();
                            Intent a3 = m69663a(editConfig);
                            Bundle extraBundle2 = multiVideoMedia.getExtraBundle();
                            if (extraBundle2 != null) {
                                a3.putExtras(extraBundle2);
                            }
                            Integer requestCode = editConfig.getRequestCode();
                            a3.putExtra("open_sdk_import_media_list", videoMedias);
                            if (requestCode != null) {
                                C42573a.m93487a(context, a3, requestCode.intValue());
                            } else {
                                C42573a.m93487a(context, a3, -1);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void startEdit(Context context, EditConfig editConfig, ShareConfig shareConfig) {
        C52711k.m112240b(editConfig, "editConfig");
        C52711k.m112240b(shareConfig, "shareConfig");
        if (context != null) {
            AVChallenge aVChallenge = null;
            switch (shareConfig.getType()) {
                case 1:
                    PhotoService photoService = new PhotoService();
                    String file = shareConfig.getFile();
                    if (file == null) {
                        C52711k.m112234a();
                    }
                    PhotoContext compress = photoService.compress(file, new C38655c());
                    if (compress == null) {
                        C10691a.m21542b(context, (int) R.string.bqm).mo19066a();
                    } else {
                        compress.mShootWay = editConfig.getShootway();
                        compress.mainBusinessData = m69664a(shareConfig.getShareContext());
                        compress.mPhotoFrom = 3;
                        compress.challenges = editConfig.getChallenges();
                    }
                    C52711k.m112236a((Object) compress, "photoContext");
                    editConfig.setMediaInfo(new PhotoMedia(compress));
                    break;
                case 2:
                    Bundle bundle = new Bundle();
                    bundle.putString("creation_id", editConfig.getCreationId());
                    bundle.putString("shoot_way", editConfig.getShootway());
                    String str = "av_challenge";
                    AVChallenge challenge = editConfig.getChallenge();
                    if (challenge instanceof Serializable) {
                        aVChallenge = challenge;
                    }
                    bundle.putSerializable(str, aVChallenge);
                    if (editConfig.getChallenges() != null) {
                        String str2 = "av_challenge_list";
                        List challenges = editConfig.getChallenges();
                        if (challenges != null) {
                            bundle.putSerializable(str2, (Serializable) challenges);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type java.io.Serializable");
                        }
                    }
                    bundle.putBoolean("is_from_sys_share", true);
                    bundle.putString("extra_share_app_name", shareConfig.getAppName());
                    bundle.putSerializable("extra_share_context", shareConfig.getShareContext());
                    shareConfig.getShareContext();
                    String file2 = shareConfig.getFile();
                    if (file2 == null) {
                        C52711k.m112234a();
                    }
                    VideoMedia videoMedia = new VideoMedia(file2);
                    videoMedia.setExtraBundle(bundle);
                    editConfig.setMediaInfo(videoMedia);
                    break;
                case 3:
                    PhotoMovieContext photoMovieContext = new PhotoMovieContext();
                    photoMovieContext.mImageList = shareConfig.getImageList();
                    photoMovieContext.challenges = editConfig.getChallenges();
                    photoMovieContext.setMainBusinessData(m69664a(shareConfig.getShareContext()));
                    editConfig.setMediaInfo(new MultiPhotoMedia(photoMovieContext));
                    break;
                case 4:
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("shoot_way", editConfig.getShootway());
                    String str3 = "av_challenge";
                    AVChallenge challenge2 = editConfig.getChallenge();
                    if (challenge2 instanceof Serializable) {
                        aVChallenge = challenge2;
                    }
                    bundle2.putSerializable(str3, aVChallenge);
                    if (editConfig.getChallenges() != null) {
                        String str4 = "av_challenge_list";
                        List challenges2 = editConfig.getChallenges();
                        if (challenges2 != null) {
                            bundle2.putSerializable(str4, (Serializable) challenges2);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type java.io.Serializable");
                        }
                    }
                    bundle2.putBoolean("is_from_sys_share", true);
                    bundle2.putString("extra_share_app_name", shareConfig.getAppName());
                    bundle2.putSerializable("extra_share_context", shareConfig.getShareContext());
                    List<String> videoList = shareConfig.getVideoList();
                    if (videoList != null) {
                        ArrayList arrayList = new ArrayList();
                        long j = 0;
                        for (String str5 : videoList) {
                            MediaModel mediaModel = new MediaModel(j);
                            int[] a = C52928al.m112612a(str5);
                            mediaModel.f95386e = (long) a[3];
                            mediaModel.f95390i = a[0];
                            mediaModel.f95391j = a[1];
                            mediaModel.f95392k = (double) a[5];
                            mediaModel.f95393l = (double) a[4];
                            mediaModel.f95383b = str5;
                            arrayList.add(mediaModel);
                            j++;
                        }
                        MultiVideoMedia multiVideoMedia = new MultiVideoMedia(arrayList);
                        multiVideoMedia.setExtraBundle(bundle2);
                        editConfig.setMediaInfo(multiVideoMedia);
                        break;
                    }
                    break;
            }
            startEdit(context, editConfig);
        }
    }
}
