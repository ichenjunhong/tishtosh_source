package com.p683ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.FragmentActivity;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.p780m.C12361b;
import com.bytedance.scene.group.C12896b;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.framework.services.IStickerService.FaceSticker;
import com.p683ss.android.ugc.aweme.port.internal.C39657f;
import com.p683ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.C43866a.C43867a;
import com.p683ss.android.ugc.aweme.shortvideo.p2177b.C42443a;
import com.p683ss.android.ugc.aweme.shortvideo.p2185d.p2186a.C43205b;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44880c;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44882e;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordNewActivity;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.C44525b;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.tools.C47064i;
import com.p683ss.android.ugc.aweme.tools.C47093m;
import com.p683ss.android.ugc.aweme.tools.C47336q;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.recorder.p2474h.C49822a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dr */
public abstract class C43225dr extends C12896b implements IRecordingOperationPanel {

    /* renamed from: r */
    public static final String f109315r = "dr";

    /* renamed from: k */
    private ShortVideoContextViewModel f109316k;

    /* renamed from: s */
    public Effect f109317s;

    /* renamed from: t */
    public Effect f109318t;

    /* renamed from: u */
    public Runnable f109319u;

    /* renamed from: c */
    public abstract C12361b mo86790c();

    /* renamed from: d */
    public abstract C42443a mo86791d();

    /* renamed from: i */
    public final Context mo87887i() {
        return this.f33840g_;
    }

    /* renamed from: I */
    public final FragmentActivity mo87882I() {
        return (FragmentActivity) this.f33840g_;
    }

    /* renamed from: K */
    public final ShortVideoContext mo87884K() {
        return mo87883J().f107134a;
    }

    /* renamed from: f */
    private C49822a mo86792f() {
        return (C49822a) mo86790c().mo23372a(C49822a.class);
    }

    /* renamed from: H */
    public final void mo24386H() {
        super.mo24386H();
        if (this.f109319u != null) {
            this.f109319u.run();
        }
    }

    /* renamed from: M */
    public final boolean mo87886M() {
        return getLifecycle().mo323a().equals(C0178b.DESTROYED);
    }

    public C0654k fragmentManager() {
        return mo87882I().getSupportFragmentManager();
    }

    /* renamed from: J */
    public final ShortVideoContextViewModel mo87883J() {
        if (this.f109316k == null) {
            this.f109316k = (ShortVideoContextViewModel) C0214z.m440a(mo87882I()).mo359a(ShortVideoContextViewModel.class);
        }
        return this.f109316k;
    }

    /* renamed from: L */
    public final FaceStickerBean mo87885L() {
        if (this.f33840g_ instanceof VideoRecordNewActivity) {
            return ((VideoRecordNewActivity) this.f33840g_).mo91196f().mo97798C();
        }
        return FaceStickerBean.NONE;
    }

    public RemoteImageView backgroundView() {
        if (this.f33834b != null) {
            return (RemoteImageView) this.f33834b.findViewById(R.id.ca0);
        }
        return null;
    }

    public void closeRecording() {
        if (this.f33840g_ != null) {
            ((VideoRecordNewActivity) mo24477v()).f113766E.mo91328a(new C47064i());
        }
    }

    public C20489b effectController() {
        if (this.f33840g_ instanceof C39657f) {
            return ((C39657f) this.f33840g_).ck_();
        }
        return null;
    }

    public C44880c filterModule() {
        if (!(this.f33840g_ instanceof VideoRecordNewActivity) || !(((VideoRecordNewActivity) this.f33840g_).mo91195e() instanceof C44880c)) {
            return null;
        }
        return ((VideoRecordNewActivity) this.f33840g_).mo91195e();
    }

    public int getCameraPos() {
        if (VERSION.SDK_INT < 19) {
            return 0;
        }
        Activity activity = this.f33840g_;
        activity.getClass();
        return ((VideoRecordNewActivity) activity).f113766E.mo91315U();
    }

    public C44882e videoRecorder() {
        if (this.f33840g_ instanceof C39657f) {
            return ((C39657f) this.f33840g_).cj_();
        }
        return null;
    }

    public void updateLiveBackgroundView() {
        LayoutParams layoutParams;
        RemoteImageView backgroundView = backgroundView();
        VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) this.f33840g_;
        if (videoRecordNewActivity.f113785k == null) {
            layoutParams = null;
        } else {
            layoutParams = (LayoutParams) videoRecordNewActivity.f113785k.getLayoutParams();
        }
        if (backgroundView != null && layoutParams != null) {
            LayoutParams layoutParams2 = (LayoutParams) backgroundView.getLayoutParams();
            layoutParams2.width = layoutParams.width;
            layoutParams2.height = layoutParams.height;
            layoutParams2.topMargin = layoutParams.topMargin;
            layoutParams2.bottomMargin = layoutParams.bottomMargin;
            backgroundView.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: b */
    private static boolean m94852b(String str) {
        if ("xssticker".equals(str) || "xsbeauty".equals(str) || "livestreaming".equals(str)) {
            return true;
        }
        return false;
    }

    public void onHidePanel(String str) {
        if (m94852b(str)) {
            C47336q qVar = new C47336q(4);
            qVar.f119490b = true;
            mo86791d().mo86534a(qVar);
        }
    }

    public void onShowPanel(String str) {
        if (m94852b(str)) {
            C47336q qVar = new C47336q(0);
            qVar.f119490b = true;
            mo86791d().mo86534a(qVar);
        }
    }

    public void setCameraPos(int i) {
        C47093m mVar;
        if (this.f33840g_ != null) {
            if (i == 1) {
                mVar = C47093m.m102238a();
            } else {
                mVar = C47093m.m102239b();
            }
            ((VideoRecordNewActivity) mo24477v()).f113766E.mo91321a(mVar);
        }
    }

    public void onGameStickerChosen(FaceSticker faceSticker, String str) {
        if (this.f33840g_ != null && (this.f33840g_ instanceof VideoRecordNewActivity)) {
            mo86792f().mo97667a(new C43867a());
        }
    }

    public void onStickerCancel(FaceSticker faceSticker, String str) {
        if (this.f33840g_ != null && (this.f33840g_ instanceof VideoRecordNewActivity)) {
            mo86792f().mo97667a(new C43867a());
        }
    }

    public void onStickerChosen(FaceSticker faceSticker, String str) {
        if (this.f33840g_ != null && (this.f33840g_ instanceof VideoRecordNewActivity) && "livestreaming".equals(str)) {
            C49822a f = mo86792f();
            if (!C9190h.m18253a(faceSticker.tags) && faceSticker.tags.contains("transfer_touch")) {
                f.mo97667a(new C44525b(this.f33840g_, videoRecorder()));
            } else if (!C9190h.m18253a(faceSticker.types) && faceSticker.types.contains("AR")) {
                Point H = ((VideoRecordNewActivity) this.f33840g_).f113766E.mo91302H();
                f.mo97667a(new C43205b(videoRecorder()).mo87836a(H.x, H.y));
            } else if (C9190h.m18253a(faceSticker.types) || !faceSticker.types.contains("TouchGes")) {
                f.mo97667a(new C43867a());
            } else {
                Point H2 = ((VideoRecordNewActivity) this.f33840g_).f113766E.mo91302H();
                f.mo97667a(new C43205b(videoRecorder()).mo87836a(H2.x, H2.y));
            }
        }
    }
}
