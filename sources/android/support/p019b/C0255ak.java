package android.support.p019b;

import android.view.View;

/* renamed from: android.support.b.ak */
public abstract class C0255ak extends C0307p {

    /* renamed from: a */
    private static final String[] f629a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* renamed from: a */
    public final String[] mo539a() {
        return f629a;
    }

    /* renamed from: a */
    public final void mo538a(C0312s sVar) {
        View view = sVar.f771b;
        Integer num = (Integer) sVar.f770a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        sVar.f770a.put("android:visibilityPropagation:visibility", num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        sVar.f770a.put("android:visibilityPropagation:center", iArr);
    }

    /* renamed from: a */
    static int m533a(C0312s sVar, int i) {
        if (sVar == null) {
            return -1;
        }
        int[] iArr = (int[]) sVar.f770a.get("android:visibilityPropagation:center");
        if (iArr == null) {
            return -1;
        }
        return iArr[i];
    }
}
