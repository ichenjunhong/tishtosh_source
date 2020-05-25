package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.PublishSettingItem */
public class PublishSettingItem extends LinearLayout {

    /* renamed from: a */
    private RemoteImageView f113674a;

    /* renamed from: b */
    private ImageView f113675b;

    /* renamed from: c */
    TextView f113676c;

    /* renamed from: d */
    TextView f113677d;

    /* renamed from: e */
    View f113678e;

    /* renamed from: f */
    TextView f113679f;

    /* renamed from: g */
    View f113680g;

    /* renamed from: h */
    protected ImageView f113681h;

    /* renamed from: i */
    protected SmartImageView f113682i;

    /* renamed from: j */
    public boolean f113683j;

    /* renamed from: k */
    private FrameLayout f113684k;

    public ImageView getIconRight() {
        return this.f113681h;
    }

    public RemoteImageView getLeftDrawableView() {
        return this.f113674a;
    }

    /* renamed from: b */
    public void mo91061b() {
        this.f113684k.setClickable(false);
    }

    public void setEnable(boolean z) {
        this.f113683j = z;
    }

    public PublishSettingItem(Context context) {
        this(context, null);
    }

    public void setDrawableLeft(int i) {
        this.f113674a.setImageResource(i);
    }

    public void setDrawableRight(int i) {
        this.f113681h.setImageResource(i);
    }

    public void setRightIconListener(OnClickListener onClickListener) {
        this.f113684k.setOnClickListener(onClickListener);
    }

    public void setSubtitle(int i) {
        this.f113679f.setText(i);
    }

    public void setSubtitleAlpha(float f) {
        this.f113679f.setAlpha(f);
    }

    public void setTitle(int i) {
        this.f113676c.setText(i);
    }

    public void setTitleSpannable(SpannableString spannableString) {
        this.f113676c.setText(spannableString);
    }

    /* renamed from: a */
    public final void mo91092a(boolean z) {
        int i;
        ImageView imageView = this.f113675b;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public void setDrawableLeft(Drawable drawable) {
        this.f113674a.setImageDrawable(drawable);
    }

    public void setDrawableRight(Drawable drawable) {
        this.f113681h.setImageDrawable(drawable);
    }

    public void setSubtitle(String str) {
        this.f113679f.setText(str);
    }

    public void setTitle(String str) {
        this.f113676c.setText(str);
    }

    public void setSingleLine(boolean z) {
        if (z) {
            this.f113676c.setSingleLine(true);
        } else {
            this.f113676c.setSingleLine(false);
        }
        this.f113676c.setEllipsize(TruncateAt.END);
    }

    public void setSubtitleMaxWidth(int i) {
        this.f113679f.setSingleLine();
        this.f113679f.setEllipsize(TruncateAt.END);
        this.f113679f.setMaxWidth(i);
    }

    public void setTagText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f113677d.setVisibility(0);
            this.f113677d.setText(str);
            this.f113678e.setVisibility(0);
            return;
        }
        this.f113677d.setVisibility(8);
        this.f113678e.setVisibility(8);
    }

    public void setTextHighlight(boolean z) {
        int i;
        if (z) {
            i = C0726c.m2098c(getContext(), R.color.a1k);
        } else {
            i = C0726c.m2098c(getContext(), R.color.a1o);
        }
        this.f113676c.setTextColor(i);
        this.f113679f.setTextColor(i);
    }

    public PublishSettingItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PublishSettingItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f113683j = true;
        this.f113680g = LayoutInflater.from(context).inflate(R.layout.yv, this);
        this.f113674a = (RemoteImageView) findViewById(R.id.c56);
        this.f113676c = (TextView) findViewById(R.id.c53);
        this.f113677d = (TextView) findViewById(R.id.c59);
        this.f113678e = findViewById(R.id.c52);
        this.f113679f = (TextView) findViewById(R.id.c58);
        this.f113675b = (ImageView) findViewById(R.id.c55);
        this.f113681h = (ImageView) findViewById(R.id.aqr);
        this.f113682i = (SmartImageView) findViewById(R.id.byh);
        this.f113684k = (FrameLayout) findViewById(R.id.ccf);
    }
}
