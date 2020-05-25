package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.UpdateAvatarDialog_ViewBinding */
public class UpdateAvatarDialog_ViewBinding extends UpdateUserInfoDialog_ViewBinding {

    /* renamed from: a */
    private UpdateAvatarDialog f102592a;

    public void unbind() {
        UpdateAvatarDialog updateAvatarDialog = this.f102592a;
        if (updateAvatarDialog != null) {
            this.f102592a = null;
            updateAvatarDialog.mPolicyDes = null;
            updateAvatarDialog.mAvatarImageView = null;
            updateAvatarDialog.txtDisclaimer = null;
            updateAvatarDialog.ivDisclaimer = null;
            updateAvatarDialog.mVpExpandContainer = null;
            updateAvatarDialog.mAvatarContainer = null;
            updateAvatarDialog.mAvatarDecoration = null;
            updateAvatarDialog.mDecorationRecyclerView = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public UpdateAvatarDialog_ViewBinding(UpdateAvatarDialog updateAvatarDialog, View view) {
        super(updateAvatarDialog, view);
        this.f102592a = updateAvatarDialog;
        updateAvatarDialog.mPolicyDes = (TextView) Utils.findRequiredViewAsType(view, R.id.c3i, "field 'mPolicyDes'", TextView.class);
        updateAvatarDialog.mAvatarImageView = (AvatarImageView) Utils.findRequiredViewAsType(view, R.id.c5a, "field 'mAvatarImageView'", AvatarImageView.class);
        updateAvatarDialog.txtDisclaimer = (TextView) Utils.findRequiredViewAsType(view, R.id.act, "field 'txtDisclaimer'", TextView.class);
        updateAvatarDialog.ivDisclaimer = (ImageView) Utils.findRequiredViewAsType(view, R.id.acs, "field 'ivDisclaimer'", ImageView.class);
        updateAvatarDialog.mVpExpandContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.acr, "field 'mVpExpandContainer'", ViewGroup.class);
        updateAvatarDialog.mAvatarContainer = Utils.findRequiredView(view, R.id.hr, "field 'mAvatarContainer'");
        updateAvatarDialog.mAvatarDecoration = (ImageView) Utils.findRequiredViewAsType(view, R.id.c5b, "field 'mAvatarDecoration'", ImageView.class);
        updateAvatarDialog.mDecorationRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.hw, "field 'mDecorationRecyclerView'", RecyclerView.class);
    }
}
