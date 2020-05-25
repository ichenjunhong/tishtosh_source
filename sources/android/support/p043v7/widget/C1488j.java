package android.support.p043v7.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p030v4.widget.C1112l;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.j */
final class C1488j extends PopupWindow {

    /* renamed from: a */
    private static final boolean f5357a;

    /* renamed from: b */
    private boolean f5358b;

    static {
        boolean z;
        if (VERSION.SDK_INT < 21) {
            z = true;
        } else {
            z = false;
        }
        f5357a = z;
    }

    public final void showAsDropDown(View view, int i, int i2) {
        if (f5357a && this.f5358b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public C1488j(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C1451bb a = C1451bb.m5032a(context, attributeSet, new int[]{16843126, 16843465, R.attr.v1}, i, i2);
        if (a.mo5664f(2)) {
            boolean a2 = a.mo5654a(2, false);
            if (f5357a) {
                this.f5358b = a2;
            } else {
                C1112l.m3248a((PopupWindow) this, a2);
            }
        }
        setBackgroundDrawable(a.mo5652a(0));
        a.mo5653a();
    }

    public final void showAsDropDown(View view, int i, int i2, int i3) {
        if (f5357a && this.f5358b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public final void update(View view, int i, int i2, int i3, int i4) {
        if (f5357a && this.f5358b) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
