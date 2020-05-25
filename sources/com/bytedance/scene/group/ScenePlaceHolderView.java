package com.bytedance.scene.group;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.bytedance.scene.C12930k;
import com.bytedance.scene.p841c.C12880l;
import com.ss.android.ugc.trill.R;

public final class ScenePlaceHolderView extends View {

    /* renamed from: a */
    private String f33748a;

    /* renamed from: b */
    private String f33749b;

    /* renamed from: c */
    private Bundle f33750c;

    /* renamed from: d */
    private C12930k f33751d;

    public final Bundle getArguments() {
        return this.f33750c;
    }

    public final C12930k getSceneComponentFactory() {
        return this.f33751d;
    }

    public final String getSceneName() {
        if (!TextUtils.isEmpty(this.f33748a)) {
            return this.f33748a;
        }
        throw new IllegalArgumentException("ScenePlaceHolderView name is empty, invoke setSceneName first");
    }

    public final String getSceneTag() {
        if (!TextUtils.isEmpty(this.f33749b)) {
            return this.f33749b;
        }
        throw new IllegalArgumentException("ScenePlaceHolderView tag is empty, invoke setSceneTag first");
    }

    public final void setArguments(Bundle bundle) {
        this.f33750c = bundle;
    }

    public final void setSceneComponentFactory(C12930k kVar) {
        this.f33751d = kVar;
    }

    public final void setSceneName(String str) {
        this.f33748a = C12880l.m25803a(str, "ScenePlaceHolderView name can't be empty");
    }

    public final void setSceneTag(String str) {
        this.f33749b = C12880l.m25803a(str, "ScenePlaceHolderView tag can't be empty");
    }

    public ScenePlaceHolderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static int m25818a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0 || mode != 1073741824) {
            return i;
        }
        return size;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(m25818a(getSuggestedMinimumWidth(), i), m25818a(getSuggestedMinimumHeight(), i2));
    }

    /* renamed from: a */
    private void m25819a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.ad6, R.attr.adm}, 0, 0);
        try {
            this.f33748a = obtainStyledAttributes.getString(0);
            this.f33749b = obtainStyledAttributes.getString(1);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public ScenePlaceHolderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m25819a(context, attributeSet);
    }

    public ScenePlaceHolderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m25819a(context, attributeSet);
    }
}
