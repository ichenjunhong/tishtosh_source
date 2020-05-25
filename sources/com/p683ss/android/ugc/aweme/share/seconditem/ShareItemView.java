package com.p683ss.android.ugc.aweme.share.seconditem;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.share.BottomShareItem;

/* renamed from: com.ss.android.ugc.aweme.share.seconditem.ShareItemView */
public class ShareItemView extends BottomShareItem {
    private ShareItemView(Context context) {
        this(context, null);
    }

    public ShareItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShareItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public static ShareItemView m92667a(Context context, String str, Drawable drawable, OnClickListener onClickListener) {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        int b = (int) C9432q.m18687b(context, 10.0f);
        layoutParams.leftMargin = b;
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(b);
        }
        ShareItemView shareItemView = new ShareItemView(context);
        shareItemView.setLayoutParams(layoutParams);
        shareItemView.setOnClickListener(onClickListener);
        if (str != null) {
            shareItemView.setText(str);
        }
        if (drawable != null) {
            shareItemView.setIcon(drawable);
        }
        return shareItemView;
    }
}
