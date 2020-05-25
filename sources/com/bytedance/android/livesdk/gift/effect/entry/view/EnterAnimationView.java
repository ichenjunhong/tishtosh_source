package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.gift.C4129g;
import com.bytedance.android.livesdk.gift.effect.entry.p363a.C7373b;
import com.bytedance.android.livesdk.gift.effect.entry.p365c.C7378a;
import com.bytedance.android.livesdk.gift.effect.entry.p367e.C7394a;
import com.ss.android.ugc.trill.R;

public class EnterAnimationView extends FrameLayout {

    /* renamed from: a */
    public C7378a f20227a;

    /* renamed from: b */
    public boolean f20228b;

    /* renamed from: c */
    private C7373b f20229c;

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C7378a aVar = this.f20227a;
        aVar.f20140a.clear();
        while (aVar.f20141b.getChildCount() > 0) {
            View childAt = aVar.f20141b.getChildAt(0);
            UserEnterLevelView userEnterLevelView = (UserEnterLevelView) childAt.findViewById(R.id.drz);
            if (userEnterLevelView != null) {
                userEnterLevelView.f20241a = true;
            }
            aVar.f20141b.removeView(childAt);
        }
        if (aVar.f20144e != null) {
            aVar.f20144e.cancel();
            aVar.f20144e = null;
        }
        aVar.f20145f = 0;
        aVar.f20146g = false;
    }

    public EnterAnimationView(Context context) {
        this(context, null);
    }

    public void setChildMarginBottom(int i) {
        if (this.f20227a != null) {
            this.f20227a.f20143d = i;
        }
    }

    public void setUserEventListener(C4129g gVar) {
        if (this.f20227a != null) {
            this.f20227a.f20142c = gVar;
        }
    }

    /* renamed from: a */
    public final void mo13667a(C7394a aVar) {
        if (!this.f20228b) {
            return;
        }
        if (aVar.f20195m != null || aVar.f20193k != -1) {
            this.f20227a.mo13651a(aVar);
        }
    }

    public EnterAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f20228b = z;
    }

    public EnterAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20228b = true;
        this.f20227a = new C7378a(context, this);
        this.f20229c = new C7373b();
    }
}
