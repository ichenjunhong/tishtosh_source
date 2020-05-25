package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import com.google.android.gms.internal.ads.ada;
import com.google.android.gms.internal.ads.aer;
import com.google.android.gms.internal.ads.ama;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.ads.internal.az */
public final class C14965az extends ViewSwitcher {

    /* renamed from: a */
    public final ada f38653a;

    /* renamed from: b */
    final aer f38654b;

    /* renamed from: c */
    boolean f38655c = true;

    public C14965az(Context context, String str, String str2, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        super(context);
        this.f38653a = new ada(context);
        this.f38653a.f40272c = str;
        this.f38653a.f40273d = str2;
        if (context instanceof Activity) {
            this.f38654b = new aer((Activity) context, this, onGlobalLayoutListener, onScrollChangedListener);
        } else {
            this.f38654b = new aer(null, this, onGlobalLayoutListener, onScrollChangedListener);
        }
        this.f38654b.mo28757a();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f38655c) {
            this.f38653a.mo28705a(motionEvent);
        }
        return false;
    }

    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && (childAt instanceof ama)) {
                arrayList.add((ama) childAt);
            }
        }
        super.removeAllViews();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((ama) obj).destroy();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f38654b != null) {
            this.f38654b.mo28759c();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f38654b != null) {
            this.f38654b.mo28760d();
        }
    }
}
