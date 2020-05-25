package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

public final class AnimationLayer extends FrameLayout {

    /* renamed from: a */
    public static final C6621a f17980a = new C6621a(null);

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.AnimationLayer$a */
    public static final class C6621a {
        private C6621a() {
        }

        public /* synthetic */ C6621a(C52707g gVar) {
            this();
        }
    }

    public AnimationLayer(Context context) {
        this(context, null, 0, 6, null);
    }

    public AnimationLayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final View mo12695a(int i) {
        View inflate = LayoutInflater.from(getContext()).inflate(i, this, false);
        addView(inflate);
        C52711k.m112236a((Object) inflate, "v");
        return inflate;
    }

    /* renamed from: a */
    public final void mo12696a(View view, View view2) {
        LayoutParams layoutParams;
        C52711k.m112240b(view, "view");
        C52711k.m112240b(view2, "anchor");
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        int min = Math.min(2, 2);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(Integer.valueOf(iArr[i] - iArr2[i]));
        }
        List list = arrayList;
        C6621a aVar = f17980a;
        int intValue = ((Number) list.get(0)).intValue();
        int intValue2 = ((Number) list.get(1)).intValue();
        C52711k.m112240b(view, "view");
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new LayoutParams(-2, -2);
        }
        if (layoutParams2 instanceof MarginLayoutParams) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams2;
            marginLayoutParams.leftMargin = intValue;
            marginLayoutParams.topMargin = intValue2;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.bottomMargin = 0;
        }
        view.setLayoutParams(layoutParams2);
        C52711k.m112240b(view, "view");
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 == null) {
            layoutParams3 = new LayoutParams(-2, -2);
        }
        if (layoutParams3 instanceof LayoutParams) {
            layoutParams = (LayoutParams) layoutParams3;
        } else {
            layoutParams = new LayoutParams(layoutParams3);
        }
        layoutParams.gravity = 51;
        view.setLayoutParams(layoutParams);
    }

    public AnimationLayer(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "ctx");
        super(context, attributeSet, i);
    }

    public /* synthetic */ AnimationLayer(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
