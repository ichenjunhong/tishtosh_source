package com.p683ss.android.ugc.aweme.memory;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemSwitch;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.memory.MemorySettingItemSwitch */
public final class MemorySettingItemSwitch extends SettingItemSwitch {
    public MemorySettingItemSwitch(Context context) {
        this(context, null, 0, 6, null);
    }

    public MemorySettingItemSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: b */
    public final void mo19308b(Context context, AttributeSet attributeSet) {
        super.mo19308b(context, attributeSet);
        this.f28757g.setBackgroundColor(-1);
        setStartTextColor(R.color.dj);
        FrameLayout frameLayout = this.f28758h;
        C52711k.m112236a((Object) frameLayout, "rightLayout");
        ViewParent parent = frameLayout.getParent();
        if (parent != null) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.width = -2;
            viewGroup.setLayoutParams(layoutParams);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public MemorySettingItemSwitch(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ MemorySettingItemSwitch(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
