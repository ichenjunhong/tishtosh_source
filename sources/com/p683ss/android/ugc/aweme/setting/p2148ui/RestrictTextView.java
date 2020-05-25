package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.C2240a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.setting.model.RestrictInfo;
import com.p683ss.android.ugc.aweme.setting.model.RestrictInfoModel;
import com.p683ss.android.ugc.aweme.setting.p2139h.C41614e;
import com.p683ss.android.ugc.aweme.setting.p2139h.C41617h;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.RestrictTextView */
public class RestrictTextView extends DmtTextView implements C41614e {

    /* renamed from: b */
    private C41617h f105765b;

    /* renamed from: c */
    private String f105766c;

    public RestrictTextView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo85685a(String str) {
        this.f105766c = str;
        this.f105765b.mo85379a(str);
    }

    /* renamed from: a */
    public final void mo85376a(RestrictInfo restrictInfo) {
        if (TextUtils.equals(restrictInfo.awemeId, this.f105766c)) {
            setVisibility(0);
            setText(C2240a.m6772a("Review time:%s \nReview AllFriends:%s ", new Object[]{restrictInfo.reviewTime, restrictInfo.reviewResult}));
        }
    }

    public RestrictTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public RestrictTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f105765b = new C41617h(new RestrictInfoModel(), this);
    }
}
