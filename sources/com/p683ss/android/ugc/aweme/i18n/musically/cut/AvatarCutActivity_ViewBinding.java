package com.p683ss.android.ugc.aweme.i18n.musically.cut;

import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity_ViewBinding */
public class AvatarCutActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AvatarCutActivity f86029a;

    public void unbind() {
        AvatarCutActivity avatarCutActivity = this.f86029a;
        if (avatarCutActivity != null) {
            this.f86029a = null;
            avatarCutActivity.mStatusBarView = null;
            avatarCutActivity.mSurfaceViewWrapper = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AvatarCutActivity_ViewBinding(AvatarCutActivity avatarCutActivity, View view) {
        this.f86029a = avatarCutActivity;
        avatarCutActivity.mStatusBarView = Utils.findRequiredView(view, R.id.csm, "field 'mStatusBarView'");
        avatarCutActivity.mSurfaceViewWrapper = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.eyt, "field 'mSurfaceViewWrapper'", FrameLayout.class);
    }
}
