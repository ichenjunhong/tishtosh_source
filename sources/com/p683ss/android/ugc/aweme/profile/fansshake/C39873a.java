package com.p683ss.android.ugc.aweme.profile.fansshake;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24530d;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.profile.fansshake.a */
public class C39873a extends FrameLayout {

    /* renamed from: a */
    private AnimatorSet f101722a;

    /* renamed from: b */
    private ObjectAnimator f101723b;

    /* renamed from: c */
    private User f101724c;

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C47718bf.m103290c(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f101723b != null && this.f101723b.isRunning()) {
            this.f101723b.end();
        }
        if (this.f101722a != null && this.f101722a.isRunning()) {
            this.f101722a.end();
        }
        C47718bf.m103291d(this);
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onProfileFollowEvent(C24530d dVar) {
        Object obj = dVar.f64952b;
        if (obj != null && (obj instanceof User) && this.f101724c != null && TextUtils.equals(((User) obj).getUid(), this.f101724c.getUid())) {
            this.f101724c.setFollowStatus(dVar.f64951a);
        }
    }
}
