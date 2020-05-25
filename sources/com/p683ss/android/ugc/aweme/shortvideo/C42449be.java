package com.p683ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.google.p1057b.p1058a.C17418j;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43758o;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.p2219p.C44351b;
import com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44403a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordNewActivity;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45412b;
import com.p683ss.android.ugc.aweme.tools.C47066k;
import com.p683ss.android.ugc.aweme.utils.C47858ep;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.io.Serializable;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.be */
public final /* synthetic */ class C42449be implements C1710e {

    /* renamed from: a */
    private final GoNextFactoryFactory f107349a;

    /* renamed from: b */
    private final C47066k f107350b;

    public C42449be(GoNextFactoryFactory goNextFactoryFactory, C47066k kVar) {
        this.f107349a = goNextFactoryFactory;
        this.f107350b = kVar;
    }

    public final void accept(Object obj) {
        String str;
        String str2;
        GoNextFactoryFactory goNextFactoryFactory = this.f107349a;
        C47066k kVar = this.f107350b;
        Pair pair = (Pair) obj;
        goNextFactoryFactory.f106995a.mo91610a();
        C45412b.m98979a().step("av_video_edit", "fetchMusicBeanEnd");
        Serializable serializable = ((C17418j) pair.first).isPresent() ? (C43203d) ((C17418j) pair.first).get() : null;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = ((C17418j) pair.second).isPresent() ? (MultiEditVideoStatusRecordData) ((C17418j) pair.second).get() : null;
        int i = kVar.f118853e;
        if (!C43223dp.m94850a() || multiEditVideoStatusRecordData == null || goNextFactoryFactory.f106998d.f107134a.mo86362d()) {
            str2 = kVar.f118850b;
            str = kVar.f118851c;
        } else {
            str2 = ((MultiEditVideoSegmentRecordData) multiEditVideoStatusRecordData.curMultiEditVideoRecordData.segmentDataList.get(0)).videoPath;
            str = ((MultiEditVideoSegmentRecordData) multiEditVideoStatusRecordData.curMultiEditVideoRecordData.segmentDataList.get(0)).audioPath;
        }
        StringBuilder sb = new StringBuilder("onConcatFinished:");
        sb.append(i);
        C32458a.m75144a(sb.toString());
        ShortVideoContext shortVideoContext = goNextFactoryFactory.f106998d.f107134a;
        if (i >= 0) {
            C23569o.m57776a("aweme_concat_success_rate", 0, (JSONObject) null);
            VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) goNextFactoryFactory.f106997c.f33840g_;
            shortVideoContext.f107092ar = videoRecordNewActivity.f113766E.mo91309O().mo94324e();
            GoNextFactoryFactory.m93009a((Context) goNextFactoryFactory.f106997c.f33840g_, shortVideoContext);
            videoRecordNewActivity.mo91196f().mo97797B().mo97786a(shortVideoContext);
            Intent a = GoNextFactoryFactory.m93006a(goNextFactoryFactory.f106998d, videoRecordNewActivity.f113766E.mo91315U(), videoRecordNewActivity);
            String str3 = str;
            C23569o.m57779a("type_av_record_concat_time", C23088c.m56631a().mo47823a("duration", Long.valueOf(System.currentTimeMillis() - goNextFactoryFactory.f106999e)).mo47824a("type", "record").mo47819a("abParam", Boolean.valueOf(C39618d.f101152P.mo83103a(C40790a.EnableMultiVideoEdit))).mo47825b());
            boolean z = C39618d.f101152P.mo83104b(C40790a.RecommentMusicByAIPolicy) != 0;
            boolean z2 = z && ("direct_shoot".equals(shortVideoContext.f107132y) || "prop_page".equals(shortVideoContext.f107132y) || "challenge".equals(shortVideoContext.f107132y) || "draft_again".equals(shortVideoContext.f107132y) || "prop_reuse".equals(shortVideoContext.f107132y) || "collection_music".equals(shortVideoContext.f107132y) || "restore_crash".equals(shortVideoContext.f107132y) || "single_song".equals(shortVideoContext.f107132y) || "mp_record".equals(shortVideoContext.f107132y));
            if (serializable != null) {
                a.putExtra("music_wave_data", serializable);
            }
            if (z) {
                C43758o oVar = shortVideoContext.f107054aF;
                if (oVar != null) {
                    goNextFactoryFactory.f107002h = oVar.getAppId();
                }
                C39618d.f101168i.mo80585g().mo80591a(shortVideoContext.f107092ar, z2, shortVideoContext.f107131x, goNextFactoryFactory.f107002h, shortVideoContext.mo86372m());
                if (C44351b.m97144a() == 2) {
                    C39618d.f101168i.mo80584f();
                }
            }
            if (multiEditVideoStatusRecordData != null) {
                C43789em q = shortVideoContext.mo86376q();
                if (shortVideoContext.f107122o) {
                    multiEditVideoStatusRecordData.editSegments = q;
                    multiEditVideoStatusRecordData.isMultiEditRetake = true;
                } else {
                    multiEditVideoStatusRecordData.originalSegments = q;
                    multiEditVideoStatusRecordData.isMultiEditRetake = false;
                    multiEditVideoStatusRecordData.recordMusic = C43214dh.m94817a().mo50201b();
                    multiEditVideoStatusRecordData.originalMusicStart = shortVideoContext.f107113f;
                }
                a.putExtra("extra_multi_edit_video_data", multiEditVideoStatusRecordData);
            }
            a.putExtra("extra_edit_preview_info", GoNextFactoryFactory.m93007a(shortVideoContext, multiEditVideoStatusRecordData, str2, str3));
            if (C47858ep.f120422c && !C47858ep.m103515a()) {
                C47858ep.f120422c = false;
                C47858ep.m103517b("record_success");
            }
            C45412b.m98979a().step("av_video_edit", "startVideoEditActivity");
            if (shortVideoContext.f107055aG) {
                C44403a.m97196a().mo48308c(videoRecordNewActivity, a, 1);
            } else {
                C44403a.m97196a().mo48306b((Context) videoRecordNewActivity, a, 1);
            }
            goNextFactoryFactory.f106998d.mo86395e(false);
            goNextFactoryFactory.f106995a.mo91610a();
            return;
        }
        boolean exists = str2 != null ? new File(str2).exists() : false;
        boolean exists2 = str != null ? new File(str).exists() : false;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(goNextFactoryFactory.f106998d.f107134a.f107118k.mo86460g());
        sb2.append("1_frag_v");
        File file = new File(sb2.toString());
        C23569o.m57776a("aweme_concat_success_rate", 1, C23088c.m56631a().mo47822a("errorCode", Integer.valueOf(i)).mo47824a("videoPath", str2).mo47824a("audioPath", str).mo47824a("videoFileExists", String.valueOf(exists)).mo47824a("audioFileExists", String.valueOf(exists2)).mo47824a("firstSegmentPath", String.valueOf(file.exists())).mo47824a("firstSegmentLength", String.valueOf(file.length())).mo47824a("hardEncode", String.valueOf(shortVideoContext.f107127t)).mo47819a("abParam", Boolean.valueOf(C39618d.f101152P.mo83103a(C40790a.EnableMultiVideoEdit))).mo47825b());
        String a2 = goNextFactoryFactory.f106997c.mo24462a((int) R.string.ah1, Integer.valueOf(i));
        if (i == -10021 || i == -2000) {
            a2 = goNextFactoryFactory.f106997c.mo24461a((int) R.string.ar9);
        }
        C10691a.m21545b(goNextFactoryFactory.f106997c.mo87887i(), a2).mo19066a();
        goNextFactoryFactory.f106998d.mo86395e(false);
        StringBuilder sb3 = new StringBuilder("concat failed , ve result = ");
        sb3.append(kVar.f118853e);
        C47858ep.m103512a("record_error", "2", sb3.toString());
    }
}
