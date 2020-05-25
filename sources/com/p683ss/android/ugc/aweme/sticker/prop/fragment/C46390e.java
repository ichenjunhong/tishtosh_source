package com.p683ss.android.ugc.aweme.sticker.prop.fragment;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.challenge.adapter.C24540e;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.setting.model.MigrateABTestModel;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.fragment.e */
public final class C46390e extends C24540e {
    public C46390e(View view, String str, C24579d dVar) {
        super(view, str, dVar);
    }

    /* renamed from: b */
    public final void mo50306b(Aweme aweme, int i, boolean z) {
        super.mo50306b(aweme, i, z);
        if (aweme.isEffectDesigner()) {
            this.f64975f.setText(R.string.aw7);
            this.f64975f.setVisibility(0);
        }
        C41589c.m91432a();
        if (MigrateABTestModel.getInstance().isEffectLikeShow()) {
            mo50305a(aweme);
        }
        if (aweme.isPgcShow()) {
            if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                this.f64973d.setVisibility(0);
                this.f64972c.setVisibility(8);
                m59955a(this.f64973d, (AwemeTextLabelModel) aweme.getTextTopLabels().get(0));
            }
        } else if (aweme.getOriginAuthor() != null) {
            this.f64974e.setVisibility(0);
            if (!TextUtils.isEmpty(aweme.getLabelOriginAuthorText())) {
                this.f64974e.setText(aweme.getLabelOriginAuthorText());
            }
            this.f64972c.setVisibility(4);
        } else if (aweme.getMusicStarter() == null && aweme.getOriginAuthor() == null) {
            if (aweme.getIsTop() == 1) {
                if (aweme.getTextTopLabels() == null || aweme.getTextTopLabels().size() <= 0) {
                    this.f64973d.setVisibility(8);
                    this.f64972c.setVisibility(0);
                    C23515d.m57670a(this.f64972c, aweme.getLabelTop(), (int) C9432q.m18687b(this.f64970a, 6.0f), (int) C9432q.m18687b(this.f64970a, 6.0f));
                    return;
                }
                this.f64973d.setVisibility(0);
                this.f64972c.setVisibility(8);
                m59955a(this.f64973d, (AwemeTextLabelModel) aweme.getTextTopLabels().get(0));
            }
        } else if (aweme.getIsTop() == 1) {
            if (aweme.getTextTopLabels() == null || aweme.getTextTopLabels().size() <= 0) {
                this.f64973d.setVisibility(0);
                this.f64972c.setVisibility(8);
                AwemeTextLabelModel awemeTextLabelModel = new AwemeTextLabelModel();
                awemeTextLabelModel.setTextColor("#FFFFFF");
                awemeTextLabelModel.setLabelType(8);
                awemeTextLabelModel.setBgColor("#FE2C55");
                awemeTextLabelModel.setShowSeconds(0.0f);
                awemeTextLabelModel.setLabelName(this.f64970a.getResources().getString(R.string.cld));
                m59955a(this.f64973d, awemeTextLabelModel);
            } else {
                this.f64973d.setVisibility(0);
                this.f64972c.setVisibility(8);
                m59955a(this.f64973d, (AwemeTextLabelModel) aweme.getTextTopLabels().get(0));
            }
        }
    }
}
