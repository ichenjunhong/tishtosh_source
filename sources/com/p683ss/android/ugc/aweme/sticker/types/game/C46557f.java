package com.p683ss.android.ugc.aweme.sticker.types.game;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.p683ss.android.ugc.aweme.sticker.types.game.p2329a.C46551b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.game.f */
public final class C46557f implements C46563l {

    /* renamed from: a */
    C46551b f117466a;

    /* renamed from: b */
    private View f117467b;

    /* renamed from: c */
    private FrameLayout f117468c;

    /* renamed from: d */
    private LottieAnimationView f117469d;

    /* renamed from: e */
    private ImageView f117470e;

    /* renamed from: c */
    public final void mo93361c() {
        if (this.f117469d != null) {
            this.f117469d.mo6661f();
            this.f117469d.setVisibility(8);
        }
    }

    /* renamed from: d */
    public final void mo93362d() {
        if (this.f117469d != null) {
            this.f117469d.mo6661f();
        }
        this.f117467b.setVisibility(8);
        this.f117468c.removeView(this.f117467b);
    }

    /* renamed from: a */
    public final void mo93358a() {
        if (this.f117469d == null) {
            m101051e();
        }
        this.f117468c.removeAllViews();
        this.f117468c.addView(this.f117467b);
        this.f117467b.setVisibility(0);
        this.f117469d.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo93360b() {
        if (this.f117469d == null) {
            m101051e();
        }
        this.f117469d.setVisibility(0);
        this.f117469d.setImageAssetsFolder("start_anim/");
        this.f117469d.setAnimation("game_btn.json");
        this.f117469d.mo6654b();
    }

    /* renamed from: e */
    private void m101051e() {
        this.f117467b = LayoutInflater.from(this.f117468c.getContext()).inflate(R.layout.a1i, this.f117468c, false);
        this.f117469d = (LottieAnimationView) this.f117467b.findViewById(R.id.h8);
        this.f117470e = (ImageView) this.f117467b.findViewById(R.id.ast);
        this.f117470e.setOnClickListener(new C46558g(this));
        this.f117469d.setOnClickListener(new C46559h(this));
    }

    /* renamed from: a */
    public final void mo93359a(C46551b bVar) {
        this.f117466a = bVar;
    }

    public C46557f(FrameLayout frameLayout) {
        this.f117468c = frameLayout;
    }
}
