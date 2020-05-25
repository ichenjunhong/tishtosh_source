package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p942h.C13842a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43908a;

/* renamed from: com.ss.android.ugc.aweme.views.AnimateDraweeView */
public class AnimateDraweeView extends SimpleDraweeView {
    public AnimateDraweeView(Context context) {
        super(context);
    }

    public void setController(C13842a aVar) {
        super.setController(aVar);
    }

    /* renamed from: a */
    public final void mo95452a(boolean z) {
        C13842a aVar;
        try {
            aVar = getController();
        } catch (NullPointerException unused) {
            aVar = null;
        }
        if (aVar != null) {
            Animatable i = aVar.mo25749i();
            if (i != null) {
                if (z) {
                    i.start();
                } else {
                    i.stop();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        boolean z = false;
        if (i == 0) {
            if (getVisibility() == 0) {
                i = 0;
            } else {
                i = 8;
            }
        }
        if (i == 0) {
            z = true;
        }
        mo95452a(z);
    }

    /* renamed from: a */
    public final void mo95451a(String str, Config config) {
        C43908a.m96439a((SimpleDraweeView) this, str, config);
    }

    public AnimateDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        mo95452a(z);
    }

    public AnimateDraweeView(Context context, C13833a aVar) {
        super(context, aVar);
    }

    public AnimateDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
