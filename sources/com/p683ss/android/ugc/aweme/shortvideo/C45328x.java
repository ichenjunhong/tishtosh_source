package com.p683ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.beauty.C23778b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.out.AVServiceImpl;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.mob.C43994a;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43906h;
import com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44403a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordNewActivity;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.tools.C47064i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.x */
public final class C45328x {

    /* renamed from: a */
    VideoRecordNewActivity f114607a;

    /* renamed from: b */
    AppCompatActivity f114608b;

    /* renamed from: c */
    private final C45004a f114609c;

    public final void onEvent(C47064i iVar) {
        String str;
        String str2;
        ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) C0214z.m440a((FragmentActivity) this.f114608b).mo359a(ShortVideoContextViewModel.class);
        ShortVideoContext shortVideoContext = shortVideoContextViewModel.f107134a;
        if (shortVideoContext != null && shortVideoContext.f107101b == 1 && shortVideoContext.f107048a == 0 && !shortVideoContext.f107122o) {
            C43214dh.m94817a().mo87855e();
            AVServiceImpl.createIInternalAVServicebyMonsterPlugin().draftService().enterDraftBox(this.f114608b);
        }
        if (this.f114607a.f113789o) {
            try {
                this.f114608b.startActivity(new Intent(this.f114608b, C39618d.f101162c.mo74158d()));
            } catch (Exception unused) {
                C23569o.m57779a("returnmain", C23088c.m56631a().mo47824a("event", "crash").mo47825b());
            }
        }
        if (shortVideoContext != null && shortVideoContext.f107055aG) {
            this.f114608b.setResult(-1);
        }
        if (shortVideoContext != null) {
            FaceStickerBean C = this.f114607a.mo91196f().mo97798C();
            C31459g e = ((C43906h) this.f114607a.mo91195e().mo89445c()).mo89440e();
            if (C == null) {
                str = "";
            } else {
                str = C.getId();
            }
            if (e == null) {
                str2 = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(e.f82324a);
                str2 = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C23778b.m58353b());
            C26890h.m65011a("video_shoot_page_end", C42438az.m93209a().mo86526a("creation_id", shortVideoContext.f107131x).mo86526a("shoot_way", shortVideoContext.f107132y).mo86526a("prop_list", str).mo86526a("filter_id_list", str2).mo86523a("fps", this.f114609c.mo91307M().getFPS()).mo86526a("beautify_used", sb2.toString()).mo86526a("beautify_info", C23778b.m58351a()).f107329a);
            C43994a.m96556a(shortVideoContext, this.f114609c.mo91307M().getMediaController(), this.f114607a.mo91196f().mo97798C(), this.f114607a.mo91195e(), this.f114607a.f113767F.mo86562d().mo94112k(), "exit_record_page");
        }
        if (shortVideoContext != null && shortVideoContext.f107122o) {
            Intent a = GoNextFactoryFactory.m93006a(shortVideoContextViewModel, this.f114609c.mo91315U(), null);
            String absolutePath = shortVideoContext.f107118k.mo86455c().getAbsolutePath();
            String absolutePath2 = shortVideoContext.f107118k.mo86456d().getAbsolutePath();
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = shortVideoContext.f107124q.f107016e;
            a.putExtra("extra_edit_preview_info", GoNextFactoryFactory.m93007a(shortVideoContext, multiEditVideoStatusRecordData, absolutePath, absolutePath2));
            if (multiEditVideoStatusRecordData != null) {
                a.putExtra("extra_multi_edit_video_data", multiEditVideoStatusRecordData);
                multiEditVideoStatusRecordData.isMultiEditRetake = true;
            }
            C44403a.m97196a().mo48306b((Context) this.f114608b, a, 1);
        } else if (shortVideoContext == null || !shortVideoContext.mo86362d()) {
            this.f114608b.finish();
        } else {
            if (iVar.f118845a) {
                this.f114608b.setResult(-1);
            }
            this.f114608b.finish();
        }
    }

    public C45328x(VideoRecordNewActivity videoRecordNewActivity, C45004a aVar) {
        this.f114607a = videoRecordNewActivity;
        this.f114608b = videoRecordNewActivity;
        this.f114609c = aVar;
    }
}
