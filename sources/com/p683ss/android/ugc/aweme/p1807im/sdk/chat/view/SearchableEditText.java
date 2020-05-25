package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v4.p037e.C0776f;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.ss.android.ugc.trill.R;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.view.SearchableEditText */
public class SearchableEditText extends FixedEditText {

    /* renamed from: c */
    public boolean f87492c;

    /* renamed from: d */
    private Drawable f87493d;

    /* renamed from: e */
    private Drawable f87494e;

    public SearchableEditText(Context context) {
        this(context, null);
    }

    public void setSearchable(boolean z) {
        Drawable drawable;
        this.f87492c = z;
        if (this.f87492c) {
            drawable = this.f87494e;
        } else {
            drawable = null;
        }
        if (VERSION.SDK_INT >= 17) {
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
            return;
        }
        Drawable[] compoundDrawables = getCompoundDrawables();
        setCompoundDrawablesWithIntrinsicBounds(drawable, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }

    /* renamed from: a */
    private void m77238a(boolean z) {
        Drawable drawable;
        if (!this.f87492c || !z) {
            drawable = null;
        } else {
            drawable = this.f87493d;
        }
        if (VERSION.SDK_INT >= 17) {
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawablesRelative[0], compoundDrawablesRelative[1], drawable, compoundDrawablesRelative[3]);
            return;
        }
        Drawable[] compoundDrawables = getCompoundDrawables();
        setCompoundDrawablesWithIntrinsicBounds(compoundDrawables[0], compoundDrawables[1], drawable, compoundDrawables[3]);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (VERSION.SDK_INT >= 17) {
                Drawable drawable = getCompoundDrawablesRelative()[2];
                if (C0776f.m2189a(Locale.getDefault()) != 1) {
                    m77237a(drawable, motionEvent);
                } else if (drawable != null && motionEvent.getX() >= ((float) (getLeft() + getPaddingLeft())) && motionEvent.getX() <= ((float) (getLeft() + getPaddingLeft() + drawable.getBounds().width()))) {
                    setText("");
                }
            } else {
                m77237a(getCompoundDrawables()[2], motionEvent);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public SearchableEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m77237a(Drawable drawable, MotionEvent motionEvent) {
        if (drawable != null && motionEvent.getX() <= ((float) (getWidth() - getPaddingRight())) && motionEvent.getX() >= ((float) ((getWidth() - getPaddingRight()) - drawable.getBounds().width()))) {
            setText("");
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        boolean z2;
        super.onFocusChanged(z, i, rect);
        if (!z || getText().length() <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        m77238a(z2);
    }

    public SearchableEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f87493d = getResources().getDrawable(R.drawable.d8q);
        this.f87494e = getResources().getDrawable(R.drawable.d_5);
        if (VERSION.SDK_INT >= 19) {
            this.f87493d.setAutoMirrored(true);
            this.f87494e.setAutoMirrored(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        super.onTextChanged(charSequence, i, i2, i3);
        if (!isFocused() || charSequence.length() <= 0) {
            z = false;
        } else {
            z = true;
        }
        m77238a(z);
    }
}
