package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.i */
final /* synthetic */ class C43571i implements Callable {

    /* renamed from: a */
    private final C43570h f110268a;

    /* renamed from: b */
    private final int f110269b;

    /* renamed from: c */
    private final int f110270c;

    /* renamed from: d */
    private final View f110271d;

    /* renamed from: e */
    private final View f110272e;

    /* renamed from: f */
    private final int f110273f;

    /* renamed from: g */
    private final int f110274g;

    C43571i(C43570h hVar, int i, int i2, View view, View view2, int i3, int i4) {
        this.f110268a = hVar;
        this.f110269b = i;
        this.f110270c = i2;
        this.f110271d = view;
        this.f110272e = view2;
        this.f110273f = i3;
        this.f110274g = i4;
    }

    public final Object call() {
        C43570h hVar = this.f110268a;
        int i = this.f110269b;
        int i2 = this.f110270c;
        View view = this.f110271d;
        View view2 = this.f110272e;
        int i3 = this.f110273f;
        int i4 = this.f110274g;
        if (i == 0) {
            i = C39629l.m88232a().mo58578i().getVideoWidth();
        }
        if (i2 == 0) {
            i2 = C39629l.m88232a().mo58578i().getVideoHeight();
        }
        ViewGroup viewGroup = (ViewGroup) view;
        C43573k kVar = new C43573k(i, i2, i3, i4);
        View[] viewArr = new View[viewGroup.getChildCount()];
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            if (viewGroup.getChildAt(childCount) != view2) {
                viewArr[childCount] = viewGroup.getChildAt(childCount);
                viewGroup.removeViewAt(childCount);
            }
        }
        int visibility = view2.getVisibility();
        if (visibility != 0) {
            view2.setVisibility(0);
        }
        view2.invalidate();
        viewGroup.invalidate();
        Object a = kVar.mo48683a(viewGroup);
        if (visibility != 0) {
            view2.setVisibility(visibility);
        }
        for (int i5 = 0; i5 < viewArr.length; i5++) {
            View view3 = viewArr[i5];
            if (view3 != null) {
                viewGroup.addView(view3, i5);
            }
        }
        return new C43574l((Bitmap) a, Integer.valueOf(viewGroup.indexOfChild(view2)));
    }
}
