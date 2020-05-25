package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

public class AvatarIconView extends FrameLayout {

    /* renamed from: a */
    private ImageView f17981a;

    /* renamed from: b */
    private ImageView f17982b;

    /* renamed from: c */
    private ImageView f17983c;

    /* renamed from: d */
    private int f17984d;

    /* renamed from: e */
    private int f17985e;

    /* renamed from: f */
    private int f17986f;

    public AvatarIconView(Context context) {
        this(context, null);
    }

    public void setAvatar(int i) {
        C5213c.m11813a(this.f17981a, i);
    }

    public void setAvatar(ImageModel imageModel) {
        if (imageModel != null) {
            C5213c.m11826b(this.f17981a, imageModel, this.f17984d, this.f17984d, R.drawable.c2g);
        }
    }

    public void setAvatarBorder(ImageModel imageModel) {
        if (imageModel != null) {
            this.f17982b.setVisibility(0);
            C5213c.m11816a(this.f17982b, imageModel, this.f17985e, this.f17985e);
            return;
        }
        this.f17982b.setVisibility(8);
    }

    public void setIcon(ImageModel imageModel) {
        if (imageModel != null) {
            this.f17983c.setVisibility(0);
            C5213c.m11818a(this.f17983c, imageModel, this.f17986f, this.f17986f, -1);
            return;
        }
        this.f17983c.setVisibility(4);
    }

    public AvatarIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17984d = (int) C9432q.m18687b(context, 100.0f);
        this.f17986f = (int) C9432q.m18687b(context, 42.0f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a80, R.attr.a81, R.attr.a83});
            this.f17984d = obtainStyledAttributes.getDimensionPixelSize(1, this.f17984d);
            this.f17985e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f17986f = obtainStyledAttributes.getDimensionPixelSize(2, this.f17986f);
            obtainStyledAttributes.recycle();
        }
        this.f17981a = new ImageView(context);
        LayoutParams layoutParams = new LayoutParams(this.f17984d, this.f17984d);
        layoutParams.gravity = 17;
        this.f17981a.setLayoutParams(layoutParams);
        addView(this.f17981a);
        this.f17982b = new ImageView(context);
        LayoutParams layoutParams2 = new LayoutParams(this.f17985e, this.f17985e);
        layoutParams2.gravity = 17;
        this.f17982b.setLayoutParams(layoutParams2);
        addView(this.f17982b);
        this.f17983c = new ImageView(context);
        LayoutParams layoutParams3 = new LayoutParams(this.f17986f, this.f17986f);
        layoutParams3.bottomMargin = (int) C9432q.m18687b(context, 3.0f);
        layoutParams3.rightMargin = (int) C9432q.m18687b(context, 2.0f);
        layoutParams3.gravity = 8388693;
        this.f17983c.setLayoutParams(layoutParams3);
        addView(this.f17983c);
        this.f17983c.setVisibility(4);
    }
}
