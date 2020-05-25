package com.p683ss.android.ugc.aweme.shortvideo.widget;

import android.support.p030v4.app.FragmentActivity;
import com.bytedance.als.ApiCenter;
import com.p683ss.android.ugc.aweme.port.p2082in.C39610bo;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.p683ss.android.ugc.aweme.services.sticker.UnLockSticker;
import com.p683ss.android.ugc.aweme.sticker.C46049k;
import com.p683ss.android.ugc.aweme.sticker.types.unlock.C46609g;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import org.greenrobot.eventbus.C53755c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.j */
public final class C45612j {

    /* renamed from: a */
    FragmentActivity f115375a;

    /* renamed from: b */
    C46049k f115376b;

    /* renamed from: c */
    OnUnlockShareFinishListener f115377c = new OnUnlockShareFinishListener() {
        public final void onVKShareSucceed(Effect effect) {
        }

        public final void onShareAppFailed() {
            C39618d.f101148L.mo80684a(C45612j.this.f115375a);
        }

        public final void onShareAppSucceed(Effect effect) {
            C46609g gVar = new C46609g();
            gVar.f117594a = UnLockSticker.STICKER_UNLOCKED;
            gVar.f117595b = effect;
            gVar.f117597d = true;
            C53755c.m114319a().mo112962f(gVar);
        }
    };

    public C45612j(FragmentActivity fragmentActivity) {
        this.f115375a = fragmentActivity;
        Effect a = m99352a(fragmentActivity);
        C39610bo boVar = C39618d.f101148L;
        this.f115376b = boVar.mo80682a(boVar.mo80683a(), fragmentActivity, a, this.f115377c, true, false);
    }

    /* renamed from: a */
    static Effect m99352a(FragmentActivity fragmentActivity) {
        if (fragmentActivity != null) {
            C50048n nVar = (C50048n) ApiCenter.m7844a(fragmentActivity).mo7341b(C50048n.class);
            if (nVar != null) {
                return (Effect) nVar.mo93023h().mo92989g().mo93014b().getValue();
            }
        }
        return null;
    }
}
