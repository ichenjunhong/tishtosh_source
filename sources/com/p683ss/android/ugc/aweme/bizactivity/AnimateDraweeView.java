package com.p683ss.android.ugc.aweme.bizactivity;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p942h.C13842a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23711b.C23712a;

/* renamed from: com.ss.android.ugc.aweme.bizactivity.AnimateDraweeView */
public class AnimateDraweeView extends RemoteImageView {

    /* renamed from: a */
    public UrlModel f63482a;

    /* renamed from: b */
    public C23712a f63483b;

    public AnimateDraweeView(Context context) {
        super(context);
    }

    public void setController(C13842a aVar) {
        super.setController(aVar);
    }

    /* renamed from: a */
    private void m58473a(int i) {
        C13842a aVar;
        try {
            aVar = getController();
        } catch (NullPointerException unused) {
            aVar = null;
        }
        if (aVar != null) {
            Animatable i2 = aVar.mo25749i();
            if (i2 != null) {
                if (i == 0) {
                    i2.start();
                } else {
                    i2.stop();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            if (getVisibility() == 0) {
                i = 0;
            } else {
                i = 8;
            }
        }
        m58473a(i);
    }

    public AnimateDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m58473a(i);
    }

    public AnimateDraweeView(Context context, C13833a aVar) {
        super(context, aVar);
    }

    public AnimateDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
