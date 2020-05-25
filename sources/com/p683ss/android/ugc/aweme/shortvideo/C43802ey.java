package com.p683ss.android.ugc.aweme.shortvideo;

import android.animation.ValueAnimator;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import com.bytedance.als.ApiCenter;
import com.p683ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.beauty.C23778b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45017b;
import com.p683ss.android.ugc.aweme.shortvideo.p2255v.C45474a;
import com.p683ss.android.ugc.aweme.shortvideo.p2255v.C45475b;
import com.p683ss.android.ugc.aweme.shortvideo.record.p2223a.C44442a;
import com.p683ss.android.ugc.aweme.shortvideo.record.p2223a.C44445c;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45412b;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45416bb;
import com.p683ss.android.ugc.aweme.sticker.model.C46066a;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.tools.C47351z;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.recorder.p2478l.C49860a;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ey */
public final class C43802ey {

    /* renamed from: a */
    final C45017b f110919a;

    /* renamed from: b */
    final ShortVideoContext f110920b;

    /* renamed from: c */
    private final AppCompatActivity f110921c;

    /* renamed from: d */
    private final ASCameraView f110922d;

    /* renamed from: a */
    private Effect m96241a() {
        if (this.f110921c != null) {
            C50048n nVar = (C50048n) ApiCenter.m7844a((FragmentActivity) this.f110921c).mo7341b(C50048n.class);
            if (nVar != null) {
                return (Effect) nVar.mo93023h().mo92989g().mo93014b().getValue();
            }
        }
        return null;
    }

    public final void onEvent(C47351z zVar) {
        List list;
        List list2;
        C46066a aVar;
        ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) C0214z.m440a((FragmentActivity) this.f110921c).mo359a(ShortVideoContextViewModel.class);
        if (!shortVideoContextViewModel.mo86391c()) {
            if (this.f110920b.mo86366g() && this.f110919a.mo91304J() != null) {
                C44442a J = this.f110919a.mo91304J();
                if (J.f112432e != null) {
                    J.f112432e.cancel();
                }
                J.f112432e = ValueAnimator.ofFloat(new float[]{1.0f, 0.66f}).setDuration(150);
                J.f112432e.addUpdateListener(new C44445c(J));
                J.f112432e.start();
            }
            C47625i.m103103a("set hasStopped to true");
            shortVideoContextViewModel.mo86393d(true);
            this.f110919a.mo91309O().mo94320a(false);
            C45412b.m98979a().start("av_video_stop_record", "stopRecordAsync");
            long endFrameTimeUS = this.f110922d.getEndFrameTimeUS() / 1000;
            this.f110922d.mo43629a((C52671b<? super Integer, C52860x>) new C43803ez<Object,C52860x>(this));
            C47625i.m103103a("stopRecord() called");
            shortVideoContextViewModel.mo86384a(0);
            if (this.f110920b.f107122o) {
                ((C49860a) ApiCenter.m7844a((FragmentActivity) this.f110921c).mo7339a(C49860a.class)).mo97684a(0);
            }
            if (endFrameTimeUS >= 0) {
                C43789em p = this.f110920b.mo86375p();
                if (C46059g.m100082f(m96241a())) {
                    list = this.f110919a.mo91392ao();
                } else {
                    list = null;
                }
                if (C46059g.m100083g(m96241a())) {
                    list2 = this.f110919a.mo91392ao();
                } else {
                    list2 = null;
                }
                if (this.f110921c != null) {
                    aVar = ((ShortVideoContextViewModel) C0214z.m440a((FragmentActivity) this.f110921c).mo359a(ShortVideoContextViewModel.class)).f107134a.f107126s;
                } else {
                    aVar = null;
                }
                this.f110920b.mo86357a(this.f110920b.mo86372m() + p.end(endFrameTimeUS, null, list, list2, aVar));
            } else {
                m96242a("end_duration", endFrameTimeUS, this.f110920b);
            }
            this.f110919a.f114032j.mo7350a(zVar);
            if (C45474a.m99107a(this.f110922d)) {
                C45475b bVar = new C45475b(this.f110921c);
                bVar.mo91753a(R.raw.shutter_sound_stop, bVar.f114899a.getStreamMaxVolume(3), bVar.f114899a.getStreamVolume(3), null);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C23778b.m58353b());
            C26890h.m65011a("video_record_end", C42438az.m93209a().mo86526a("creation_id", this.f110920b.f107131x).mo86526a("shoot_way", this.f110920b.f107132y).mo86526a("content_type", "video").mo86526a("prop_list", RecordScene.getStickerIdsByModel(this.f110920b.f107119l)).mo86526a("filter_id_list", this.f110920b.f107083ai.toString()).mo86523a("fps", this.f110919a.mo91307M().getFPS()).mo86527a("reshoot", this.f110920b.f107122o).mo86526a("beautify_used", sb.toString()).mo86526a("beautify_info", C23778b.m58351a()).f107329a);
        }
    }

    /* renamed from: a */
    static void m96242a(String str, long j, ShortVideoContext shortVideoContext) {
        C23088c a = C23088c.m56631a();
        a.mo47824a("error_type", str);
        a.mo47823a("error_duration", Long.valueOf(j));
        a.mo47822a("segment_count", Integer.valueOf(shortVideoContext.f107119l.size()));
        File g = shortVideoContext.f107118k.mo86460g();
        if (g.isDirectory()) {
            a.mo47824a("file_path", C45416bb.m98985a(g.list(), ","));
        }
        C23569o.m57779a("aweme_draft_edit_error", a.mo47825b());
    }

    public C43802ey(AppCompatActivity appCompatActivity, ASCameraView aSCameraView, C45017b bVar, ShortVideoContext shortVideoContext) {
        this.f110921c = appCompatActivity;
        this.f110922d = aSCameraView;
        this.f110919a = bVar;
        this.f110920b = shortVideoContext;
    }
}
