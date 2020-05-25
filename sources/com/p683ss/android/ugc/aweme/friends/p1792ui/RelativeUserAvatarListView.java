package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.LeadingMarginSpan.Standard;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.profile.model.RelativeUserInfo;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.RelativeUserAvatarListView */
public final class RelativeUserAvatarListView extends FrameLayout {

    /* renamed from: a */
    private int f85139a;

    /* renamed from: b */
    private int f85140b;

    /* renamed from: c */
    private final int f85141c;

    public RelativeUserAvatarListView(Context context) {
        this(context, null, 0, 6, null);
    }

    public RelativeUserAvatarListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RelativeUserAvatarListView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f85139a = (int) C9432q.m18687b(context, 16.0f);
        this.f85140b = (int) C9432q.m18687b(context, 20.0f);
        this.f85141c = (int) C9432q.m18687b(context, 1.0f);
    }

    /* renamed from: a */
    private final View m75548a(RelativeUserInfo relativeUserInfo, int i, boolean z) {
        int i2;
        LayoutInflater from = LayoutInflater.from(getContext());
        if (z) {
            i2 = R.layout.bkx;
        } else {
            i2 = R.layout.bkw;
        }
        View inflate = from.inflate(i2, null);
        LayoutParams layoutParams = new LayoutParams(this.f85140b, this.f85140b);
        layoutParams.setMargins(this.f85139a * i, 0, 0, 0);
        inflate.setLayoutParams(layoutParams);
        C23515d.m57669a((RemoteImageView) inflate.findViewById(R.id.hi), relativeUserInfo.getAvatar());
        C52711k.m112236a((Object) inflate, "itemView");
        return inflate;
    }

    /* renamed from: a */
    public final void mo66274a(List<? extends RelativeUserInfo> list, TextView textView, boolean z) {
        int i;
        setVisibility(8);
        if (list != null && !list.isEmpty()) {
            setVisibility(0);
            removeAllViews();
            for (int size = list.size() - 1; size >= 0; size--) {
                addView(m75548a((RelativeUserInfo) list.get(size), size, z));
            }
        }
        if (textView != null) {
            textView.setMaxLines(2);
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            if (!TextUtils.isEmpty(textView.getText())) {
                if (i > 0) {
                    textView.setPadding(0, (int) C9432q.m18687b(getContext(), 1.0f), 0, 0);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(textView.getText());
                    spannableStringBuilder.setSpan(new Standard(this.f85140b + (this.f85139a * (i - 1)) + this.f85141c, 0), 0, spannableStringBuilder.length(), 17);
                    textView.setText(spannableStringBuilder);
                } else {
                    textView.setPadding(0, 0, 0, 0);
                }
            }
        }
    }

    public /* synthetic */ RelativeUserAvatarListView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
