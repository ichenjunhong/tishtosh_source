package com.p683ss.android.ugc.aweme.share;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;
import java.util.StringTokenizer;

/* renamed from: com.ss.android.ugc.aweme.share.BottomShareItem */
public class BottomShareItem extends LinearLayout {

    /* renamed from: a */
    protected ImageView f106082a = ((ImageView) findViewById(R.id.cmi));

    /* renamed from: b */
    protected TextView f106083b = ((TextView) findViewById(R.id.cmj));

    /* renamed from: c */
    protected View f106084c = findViewById(R.id.m9);

    public int getLayoutResource() {
        return R.layout.gy;
    }

    public ImageView getShareImageView() {
        return this.f106082a;
    }

    public TextView getShareTextView() {
        return this.f106083b;
    }

    public void setIcon(int i) {
        this.f106082a.setImageResource(i);
    }

    public void setIconAlpha(float f) {
        this.f106082a.setAlpha(f);
    }

    public void setText(int i) {
        this.f106083b.setText(i);
    }

    public void setTextAlpha(float f) {
        this.f106083b.setAlpha(f);
    }

    public void setTextSize(float f) {
        this.f106083b.setTextSize(f);
    }

    public void setIcon(Drawable drawable) {
        this.f106082a.setImageDrawable(drawable);
    }

    public void setTextColor(int i) {
        this.f106083b.setTextColor(getResources().getColor(i));
    }

    public void setText(String str) {
        int i;
        TextView textView = this.f106083b;
        if (str.contains(" ")) {
            i = 2;
        } else {
            i = 1;
        }
        textView.setMaxLines(i);
        TextView textView2 = this.f106083b;
        StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
        StringBuilder sb = new StringBuilder();
        sb.append(stringTokenizer.nextToken());
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.length() >= 8) {
                sb.append(" \n");
                sb.append(nextToken);
            } else {
                sb.append(" ");
                sb.append(nextToken);
            }
        }
        textView2.setText(sb.toString());
    }

    public BottomShareItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(getLayoutResource(), this);
        if (this.f106084c != null) {
            this.f106084c.setVisibility(8);
        }
        setClipChildren(false);
        setClipToPadding(false);
        setOrientation(1);
        setGravity(1);
    }
}
