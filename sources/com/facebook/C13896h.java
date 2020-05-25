package com.facebook;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.content.C0726c;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.facebook.internal.C14345q;
import com.facebook.p909a.C13589l;
import com.ss.android.ugc.trill.R;

/* renamed from: com.facebook.h */
public abstract class C13896h extends Button {

    /* renamed from: a */
    String f36241a;

    /* renamed from: b */
    public OnClickListener f36242b;

    /* renamed from: c */
    public OnClickListener f36243c;

    /* renamed from: d */
    private String f36244d;

    /* renamed from: e */
    private boolean f36245e;

    /* renamed from: f */
    private int f36246f;

    /* renamed from: g */
    private int f36247g;

    /* renamed from: h */
    private C14345q f36248h;

    /* access modifiers changed from: protected */
    public abstract int getDefaultRequestCode();

    /* access modifiers changed from: protected */
    public int getDefaultStyleResource() {
        return 0;
    }

    public int getRequestCode() {
        return getDefaultRequestCode();
    }

    public int getCompoundPaddingLeft() {
        if (this.f36245e) {
            return this.f36246f;
        }
        return super.getCompoundPaddingLeft();
    }

    public int getCompoundPaddingRight() {
        if (this.f36245e) {
            return this.f36247g;
        }
        return super.getCompoundPaddingRight();
    }

    public Fragment getFragment() {
        if (this.f36248h != null) {
            return this.f36248h.f37324a;
        }
        return null;
    }

    public android.app.Fragment getNativeFragment() {
        if (this.f36248h != null) {
            return this.f36248h.f37325b;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Activity getActivity() {
        /*
            r3 = this;
            android.content.Context r0 = r3.getContext()
        L_0x0004:
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 != 0) goto L_0x0013
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L_0x0013
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L_0x0004
        L_0x0013:
            if (r1 == 0) goto L_0x0018
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
        L_0x0018:
            com.facebook.k r0 = new com.facebook.k
            java.lang.String r1 = "Unable to get Activity."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C13896h.getActivity():android.app.Activity");
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            new C13589l(getContext()).mo25406a(this.f36244d);
        }
    }

    /* access modifiers changed from: protected */
    public void setInternalOnClickListener(OnClickListener onClickListener) {
        this.f36243c = onClickListener;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f36242b = onClickListener;
    }

    public void setFragment(android.app.Fragment fragment) {
        this.f36248h = new C14345q(fragment);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo26051a(String str) {
        return (int) Math.ceil((double) getPaint().measureText(str));
    }

    public void setFragment(Fragment fragment) {
        this.f36248h = new C14345q(fragment);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean z;
        if ((getGravity() & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int compoundPaddingLeft = getCompoundPaddingLeft();
            int compoundPaddingRight = getCompoundPaddingRight();
            int min = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - mo26051a(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
            this.f36246f = compoundPaddingLeft - min;
            this.f36247g = compoundPaddingRight + min;
            this.f36245e = true;
        }
        super.onDraw(canvas);
        this.f36245e = false;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26052a(Context context, AttributeSet attributeSet, int i, int i2) {
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842964}, i, i2);
            try {
                if (obtainStyledAttributes.hasValue(0)) {
                    int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        setBackgroundResource(resourceId);
                    } else {
                        setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
                    }
                } else {
                    setBackgroundColor(C0726c.m2098c(context, R.color.he));
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16843119, 16843117, 16843120, 16843118, 16843121}, i, i2);
        try {
            setCompoundDrawablesWithIntrinsicBounds(obtainStyledAttributes2.getResourceId(0, 0), obtainStyledAttributes2.getResourceId(1, 0), obtainStyledAttributes2.getResourceId(2, 0), obtainStyledAttributes2.getResourceId(3, 0));
            setCompoundDrawablePadding(obtainStyledAttributes2.getDimensionPixelSize(4, 0));
            obtainStyledAttributes2.recycle();
            TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842966, 16842967, 16842968, 16842969}, i, i2);
            try {
                setPadding(obtainStyledAttributes3.getDimensionPixelSize(0, 0), obtainStyledAttributes3.getDimensionPixelSize(1, 0), obtainStyledAttributes3.getDimensionPixelSize(2, 0), obtainStyledAttributes3.getDimensionPixelSize(3, 0));
                obtainStyledAttributes3.recycle();
                TypedArray obtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842904}, i, i2);
                try {
                    setTextColor(obtainStyledAttributes4.getColorStateList(0));
                    obtainStyledAttributes4.recycle();
                    TypedArray obtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842927}, i, i2);
                    try {
                        setGravity(obtainStyledAttributes5.getInt(0, 17));
                        obtainStyledAttributes5.recycle();
                        TypedArray obtainStyledAttributes6 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842901, 16842903, 16843087}, i, i2);
                        try {
                            setTextSize(0, (float) obtainStyledAttributes6.getDimensionPixelSize(0, 0));
                            setTypeface(Typeface.defaultFromStyle(obtainStyledAttributes6.getInt(1, 1)));
                            setText(obtainStyledAttributes6.getString(2));
                            obtainStyledAttributes6.recycle();
                            super.setOnClickListener(new OnClickListener() {
                                public final void onClick(View view) {
                                    new C13589l(C13896h.this.getContext()).mo25406a(C13896h.this.f36241a);
                                    if (C13896h.this.f36243c != null) {
                                        C13896h.this.f36243c.onClick(view);
                                        return;
                                    }
                                    if (C13896h.this.f36242b != null) {
                                        C13896h.this.f36242b.onClick(view);
                                    }
                                }
                            });
                        } catch (Throwable th) {
                            obtainStyledAttributes6.recycle();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        obtainStyledAttributes5.recycle();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    obtainStyledAttributes4.recycle();
                    throw th3;
                }
            } catch (Throwable th4) {
                obtainStyledAttributes3.recycle();
                throw th4;
            }
        } catch (Throwable th5) {
            obtainStyledAttributes2.recycle();
            throw th5;
        }
    }

    protected C13896h(Context context, AttributeSet attributeSet, int i, int i2, String str, String str2) {
        super(context, null, 0);
        int defaultStyleResource = getDefaultStyleResource();
        if (defaultStyleResource == 0) {
            defaultStyleResource = R.style.ss;
        }
        mo26052a(context, null, 0, defaultStyleResource);
        this.f36244d = str;
        this.f36241a = str2;
        setClickable(true);
        setFocusable(true);
    }
}
