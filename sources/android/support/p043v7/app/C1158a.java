package android.support.p043v7.app;

import android.support.p030v4.widget.DrawerLayout.C1072c;
import android.support.p043v7.p046b.p047a.C1194d;
import android.view.View;

/* renamed from: android.support.v7.app.a */
public final class C1158a implements C1072c {

    /* renamed from: a */
    public C1194d f3801a;

    /* renamed from: b */
    public boolean f3802b;

    /* renamed from: c */
    public boolean f3803c;

    /* renamed from: d */
    private final C1159a f3804d;

    /* renamed from: e */
    private final int f3805e;

    /* renamed from: f */
    private final int f3806f;

    /* renamed from: android.support.v7.app.a$a */
    public interface C1159a {
        /* renamed from: a */
        void mo3714a(int i);
    }

    public final void onDrawerStateChanged(int i) {
    }

    /* renamed from: a */
    private void m3440a(int i) {
        this.f3804d.mo3714a(i);
    }

    public final void onDrawerClosed(View view) {
        m3439a(0.0f);
        if (this.f3803c) {
            m3440a(this.f3805e);
        }
    }

    public final void onDrawerOpened(View view) {
        m3439a(1.0f);
        if (this.f3803c) {
            m3440a(this.f3806f);
        }
    }

    /* renamed from: a */
    private void m3439a(float f) {
        if (f == 1.0f) {
            this.f3801a.mo3911a(true);
        } else if (f == 0.0f) {
            this.f3801a.mo3911a(false);
        }
        this.f3801a.mo3910a(f);
    }

    public final void onDrawerSlide(View view, float f) {
        if (this.f3802b) {
            m3439a(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            m3439a(0.0f);
        }
    }
}
