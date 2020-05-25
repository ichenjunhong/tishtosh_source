package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicRecommendActivity_ViewBinding */
public class MusicRecommendActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicRecommendActivity f95662a;

    public void unbind() {
        MusicRecommendActivity musicRecommendActivity = this.f95662a;
        if (musicRecommendActivity != null) {
            this.f95662a = null;
            musicRecommendActivity.txtClickUploadTv = null;
            musicRecommendActivity.llClickForUpload = null;
            musicRecommendActivity.tvContentAgreement = null;
            musicRecommendActivity.editSongLink = null;
            musicRecommendActivity.editSongName = null;
            musicRecommendActivity.ivClickUpload = null;
            musicRecommendActivity.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicRecommendActivity_ViewBinding(MusicRecommendActivity musicRecommendActivity, View view) {
        this.f95662a = musicRecommendActivity;
        musicRecommendActivity.txtClickUploadTv = (TextView) Utils.findRequiredViewAsType(view, R.id.u8, "field 'txtClickUploadTv'", TextView.class);
        musicRecommendActivity.llClickForUpload = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.u7, "field 'llClickForUpload'", LinearLayout.class);
        musicRecommendActivity.tvContentAgreement = (TextView) Utils.findRequiredViewAsType(view, R.id.zu, "field 'tvContentAgreement'", TextView.class);
        musicRecommendActivity.editSongLink = (EditText) Utils.findRequiredViewAsType(view, R.id.cq9, "field 'editSongLink'", EditText.class);
        musicRecommendActivity.editSongName = (EditText) Utils.findRequiredViewAsType(view, R.id.cq_, "field 'editSongName'", EditText.class);
        musicRecommendActivity.ivClickUpload = (ImageView) Utils.findRequiredViewAsType(view, R.id.u6, "field 'ivClickUpload'", ImageView.class);
        musicRecommendActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.d10, "field 'mTitleBar'", TextTitleBar.class);
    }
}
