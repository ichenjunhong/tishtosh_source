package android.support.design.widget;

import android.widget.ImageButton;

/* renamed from: android.support.design.widget.u */
public class C0574u extends ImageButton {

    /* renamed from: a */
    private int f2070a;

    public final int getUserSetVisibility() {
        return this.f2070a;
    }

    public void setVisibility(int i) {
        mo1773a(i, true);
    }

    /* renamed from: a */
    public final void mo1773a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f2070a = i;
        }
    }
}
