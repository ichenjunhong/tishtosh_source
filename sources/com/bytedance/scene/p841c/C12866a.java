package com.bytedance.scene.p841c;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.bytedance.scene.c.a */
public final class C12866a {

    /* renamed from: com.bytedance.scene.c.a$a */
    public static class C12867a {

        /* renamed from: a */
        public final float f33690a;

        /* renamed from: b */
        public final float f33691b;

        /* renamed from: c */
        public final float f33692c;

        /* renamed from: d */
        public final float f33693d;

        /* renamed from: e */
        public final float f33694e;

        /* renamed from: f */
        public final float f33695f;

        /* renamed from: g */
        public final float f33696g;

        /* renamed from: h */
        public final float f33697h;

        public C12867a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            this.f33690a = f;
            this.f33691b = f2;
            this.f33692c = f3;
            this.f33693d = f4;
            this.f33694e = f5;
            this.f33695f = f6;
            this.f33696g = f7;
            this.f33697h = f8;
        }
    }

    /* renamed from: a */
    public static void m25780a(View view) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setAlpha(1.0f);
        view.clearAnimation();
    }

    /* renamed from: c */
    public static void m25783c(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        int indexOfChild = viewGroup.indexOfChild(view);
        if (indexOfChild >= 0 && indexOfChild != childCount - 1) {
            view.bringToFront();
        }
    }

    /* renamed from: b */
    public static C12867a m25782b(View view) {
        C12867a aVar = new C12867a(view.getTranslationX(), view.getTranslationY(), view.getScaleX(), view.getScaleY(), view.getRotation(), view.getRotationX(), view.getRotationY(), view.getAlpha());
        return aVar;
    }

    /* renamed from: a */
    public static void m25781a(View view, C12867a aVar) {
        view.setTranslationX(aVar.f33690a);
        view.setTranslationY(aVar.f33691b);
        view.setScaleX(aVar.f33692c);
        view.setScaleY(aVar.f33693d);
        view.setRotation(aVar.f33694e);
        view.setRotationX(aVar.f33695f);
        view.setRotationY(aVar.f33696g);
        view.setAlpha(aVar.f33697h);
    }
}
