package com.p683ss.android.ugc.aweme.infoSticker.category;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.category.InfoStickerTabItemView */
public final class InfoStickerTabItemView extends LinearLayout {

    /* renamed from: a */
    private SimpleDraweeView f91473a;

    /* renamed from: b */
    private AVDmtTextView f91474b;

    /* renamed from: c */
    private LinearLayout f91475c;

    /* renamed from: d */
    private int f91476d;

    public final SimpleDraweeView getIconImgView() {
        SimpleDraweeView simpleDraweeView = this.f91473a;
        if (simpleDraweeView == null) {
            C52711k.m112237a("iconImgView");
        }
        return simpleDraweeView;
    }

    public final LinearLayout getParentLayout() {
        LinearLayout linearLayout = this.f91475c;
        if (linearLayout == null) {
            C52711k.m112237a("parent");
        }
        return linearLayout;
    }

    public final void setImageAlpha(float f) {
        SimpleDraweeView simpleDraweeView = this.f91473a;
        if (simpleDraweeView == null) {
            C52711k.m112237a("iconImgView");
        }
        simpleDraweeView.setAlpha(f);
    }

    public final void setImageResId(int i) {
        SimpleDraweeView simpleDraweeView = this.f91473a;
        if (simpleDraweeView == null) {
            C52711k.m112237a("iconImgView");
        }
        simpleDraweeView.setImageResource(i);
    }

    public final void setParentBackground(Drawable drawable) {
        LinearLayout linearLayout = this.f91475c;
        if (linearLayout == null) {
            C52711k.m112237a("parent");
        }
        linearLayout.setBackground(drawable);
    }

    public final void setTextColor(int i) {
        AVDmtTextView aVDmtTextView = this.f91474b;
        if (aVDmtTextView == null) {
            C52711k.m112237a("textView");
        }
        aVDmtTextView.setTextColor(i);
    }

    public final void setTextVisibility(int i) {
        AVDmtTextView aVDmtTextView = this.f91474b;
        if (aVDmtTextView == null) {
            C52711k.m112237a("textView");
        }
        aVDmtTextView.setVisibility(i);
    }

    public final void setImageUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            SimpleDraweeView simpleDraweeView = this.f91473a;
            if (simpleDraweeView == null) {
                C52711k.m112237a("iconImgView");
            }
            C50181a.m108292a(simpleDraweeView, str);
        }
    }

    public final void setText(String str) {
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            AVDmtTextView aVDmtTextView = this.f91474b;
            if (aVDmtTextView == null) {
                C52711k.m112237a("textView");
            }
            aVDmtTextView.setText(charSequence);
        }
    }

    public InfoStickerTabItemView(Context context, int i) {
        C52711k.m112240b(context, "context");
        this(context, null, 0);
        this.f91476d = i;
    }

    public InfoStickerTabItemView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(R.layout.big, this, true);
        View findViewById = inflate.findViewById(R.id.ec6);
        C52711k.m112236a((Object) findViewById, "rootView.findViewById(R.id.info_sticker_bottom_ll)");
        this.f91475c = (LinearLayout) findViewById;
        View findViewById2 = inflate.findViewById(R.id.ec5);
        C52711k.m112236a((Object) findViewById2, "rootView.findViewById(R.id.info_sticker_bottom_iv)");
        this.f91473a = (SimpleDraweeView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.ec7);
        C52711k.m112236a((Object) findViewById3, "rootView.findViewById(R.id.info_sticker_bottom_tv)");
        this.f91474b = (AVDmtTextView) findViewById3;
    }
}
