package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.C42231s;
import com.p683ss.android.ugc.aweme.sharer.C42325k;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42271i;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42273j;
import com.p683ss.android.ugc.aweme.shortvideo.C42421al;
import com.p683ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p683ss.android.ugc.aweme.utils.C47722bj;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import java.io.File;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bc */
public final class C45417bc {
    /* renamed from: a */
    public static boolean m98986a(C42421al alVar, Activity activity) {
        new C45417bc();
        return m98987b(alVar, activity);
    }

    /* renamed from: b */
    private static boolean m98987b(C42421al alVar, Activity activity) {
        if (alVar == null || !(alVar instanceof CreateAwemeResponse)) {
            return false;
        }
        CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) alVar;
        AVUploadSaveModel aVUploadSaveModel = createAwemeResponse.mSaveModel;
        if (aVUploadSaveModel == null || !aVUploadSaveModel.isSaveLocal() || !new File(aVUploadSaveModel.getLocalFinalPath()).exists()) {
            return false;
        }
        String str = "instagram_story";
        if (aVUploadSaveModel.getSaveType() == 2) {
            str = "instagram";
        }
        if (C42231s.m92666a(createAwemeResponse.aweme, str)) {
            String localFinalPath = aVUploadSaveModel.getLocalFinalPath();
            File file = new File(localFinalPath);
            StringBuilder sb = new StringBuilder();
            sb.append(File.separator);
            sb.append("temp");
            sb.append(File.separator);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(file.getParent());
            sb3.append(sb2);
            sb3.append(file.getName());
            String sb4 = sb3.toString();
            C48016e.m103948c(localFinalPath, sb4);
            C0013i a = C42231s.m92665a(sb4, localFinalPath);
            try {
                a.mo36g();
                C48016e.m103947c(sb4);
                if (((Integer) a.mo34e()).intValue() != 0) {
                    C41979aq.m91947b().monitorMuteAudioFailedForUpload((Integer) a.mo34e());
                    C10691a.m21542b((Context) activity, (int) R.string.a9b).mo19066a();
                    return false;
                }
            } catch (InterruptedException unused) {
            }
        }
        if (aVUploadSaveModel.getSaveType() == 2) {
            C42271i iVar = new C42271i();
            if (iVar.mo86141a(activity)) {
                String localFinalPath2 = aVUploadSaveModel.getLocalFinalPath();
                iVar.mo86135a(new C42325k(C47722bj.m103304a(activity, new File(localFinalPath2)), localFinalPath2), (Context) activity);
                C26890h.m65011a("share_video", C23089d.m56640a().mo47829a("scene_id", "1013").mo47829a("platform", "instagram").mo47829a("group_id", createAwemeResponse.aweme.getAid()).mo47829a("enter_from", "video_post_page").mo47829a("share_mode", "download_then_share").mo47829a("content_type", "video").f61491a);
            }
            return true;
        }
        C42273j jVar = new C42273j();
        if (aVUploadSaveModel.getSaveType() != 3 || !jVar.mo86141a(activity)) {
            return false;
        }
        new C10643a(activity).mo18885a((int) R.string.oa).mo18899b((int) R.string.o_).mo18900b((int) R.string.vj, (OnClickListener) null).mo18886a((int) R.string.d0t, (OnClickListener) new C45418bd(aVUploadSaveModel, activity, createAwemeResponse, jVar)).mo18897a().mo18882b();
        C26890h.m65011a("share_notice_after_post", C23089d.m56640a().mo47829a("enter_from", "video_post_page").mo47829a("platform", "instagram_story").f61491a);
        return true;
    }
}
