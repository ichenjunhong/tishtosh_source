package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.sharer.C42325k;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42273j;
import com.p683ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p683ss.android.ugc.aweme.utils.C47722bj;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bd */
final /* synthetic */ class C45418bd implements OnClickListener {

    /* renamed from: a */
    private final AVUploadSaveModel f114805a;

    /* renamed from: b */
    private final Activity f114806b;

    /* renamed from: c */
    private final CreateAwemeResponse f114807c;

    /* renamed from: d */
    private final C42273j f114808d;

    C45418bd(AVUploadSaveModel aVUploadSaveModel, Activity activity, CreateAwemeResponse createAwemeResponse, C42273j jVar) {
        this.f114805a = aVUploadSaveModel;
        this.f114806b = activity;
        this.f114807c = createAwemeResponse;
        this.f114808d = jVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AVUploadSaveModel aVUploadSaveModel = this.f114805a;
        Activity activity = this.f114806b;
        CreateAwemeResponse createAwemeResponse = this.f114807c;
        C42273j jVar = this.f114808d;
        if (aVUploadSaveModel.getSaveType() == 3) {
            String localFinalPath = aVUploadSaveModel.getLocalFinalPath();
            C42325k kVar = new C42325k(C47722bj.m103304a(activity, new File(localFinalPath)), localFinalPath);
            kVar.mo86232a("content_url", createAwemeResponse.aweme.getShareInfo().getShareUrl());
            kVar.mo86232a("media_type", "video/mp4");
            jVar.mo86135a(kVar, (Context) activity);
            C26890h.m65011a("share_video", C23089d.m56640a().mo47829a("scene_id", "1013").mo47829a("platform", "instagram_story").mo47829a("group_id", createAwemeResponse.aweme.getAid()).mo47829a("enter_from", "video_post_page").mo47829a("share_mode", "download_then_share").mo47829a("content_type", "video").f61491a);
        }
    }
}
