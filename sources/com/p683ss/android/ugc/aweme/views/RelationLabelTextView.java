package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.feed.model.RelationDynamicLabel;

/* renamed from: com.ss.android.ugc.aweme.views.RelationLabelTextView */
public class RelationLabelTextView extends DmtTextView {

    /* renamed from: b */
    private RelationDynamicLabel f121148b;

    public RelationLabelTextView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo95566a(RelationDynamicLabel relationDynamicLabel) {
        this.f121148b = relationDynamicLabel;
        if (this.f121148b == null || TextUtils.isEmpty(this.f121148b.getLabelInfo())) {
            setVisibility(8);
            return;
        }
        setText(this.f121148b.getLabelInfo());
        setVisibility(0);
    }

    public RelationLabelTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RelationLabelTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
