package com.p683ss.android.ugc.aweme.photomovie.edit.player;

import android.view.View;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.p1484bx.C24454d;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.player.b */
public final class C38795b implements C24454d {

    /* renamed from: a */
    public C24458h f98718a;

    /* renamed from: b */
    private FrameLayout f98719b;

    /* renamed from: c */
    private View f98720c;

    /* renamed from: d */
    private View f98721d;

    /* renamed from: e */
    private View f98722e;

    /* renamed from: f */
    private int f98723f;

    /* renamed from: g */
    private int f98724g;

    /* renamed from: h */
    private float f98725h;

    /* renamed from: i */
    private int f98726i = C43303dy.m94972c(this.f98720c.getContext());

    /* renamed from: b */
    public final void mo50221b() {
    }

    /* renamed from: c */
    public final void mo50224c() {
    }

    /* renamed from: a */
    public final void mo50217a() {
        if (this.f98721d != null) {
            this.f98721d.setVisibility(4);
        }
        if (this.f98722e != null) {
            this.f98722e.setVisibility(4);
        }
        if (this.f98718a != null) {
            this.f98718a.mo50217a();
        }
    }

    /* renamed from: d */
    public final void mo50225d() {
        if (this.f98721d != null) {
            this.f98721d.setVisibility(0);
        }
        if (this.f98722e != null) {
            this.f98722e.setVisibility(0);
        }
        if (this.f98718a != null) {
            this.f98718a.mo50225d();
        }
    }

    /* renamed from: a */
    private void m86197a(int i) {
        if (this.f98723f == 0) {
            this.f98723f = this.f98720c.getHeight();
            this.f98724g = this.f98720c.getWidth();
            this.f98720c.setPivotX((float) (this.f98724g / 2));
            this.f98725h = (((float) ((this.f98723f - i) - this.f98726i)) * 1.0f) / ((float) this.f98723f);
            this.f98720c.setPivotY(((float) this.f98726i) / (1.0f - this.f98725h));
        }
    }

    C38795b(FrameLayout frameLayout, View view) {
        this.f98719b = frameLayout;
        this.f98720c = view;
        this.f98721d = frameLayout.findViewById(R.id.bxr);
        this.f98722e = frameLayout.findViewById(R.id.bxq);
    }

    /* renamed from: a */
    public final void mo50218a(float f, int i, int i2) {
        m86197a(i2);
        m86198c(f, i, i2);
    }

    /* renamed from: b */
    public final void mo50222b(float f, int i, int i2) {
        m86197a(i2);
        m86198c(1.0f - f, i, i2);
    }

    /* renamed from: c */
    private void m86198c(float f, int i, int i2) {
        this.f98720c.setScaleY(((((float) this.f98723f) - (((float) (i2 + this.f98726i)) * f)) * 1.0f) / ((float) this.f98723f));
        this.f98720c.setScaleX(((((float) this.f98724g) - ((((float) this.f98724g) * (1.0f - this.f98725h)) * f)) * 1.0f) / ((float) this.f98724g));
    }
}
