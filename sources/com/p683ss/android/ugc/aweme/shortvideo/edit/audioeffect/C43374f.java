package com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.animation.ObjectAnimator;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.f */
public final class C43374f extends C1352v {

    /* renamed from: e */
    public static final C43376a f109655e = new C43376a(null);

    /* renamed from: a */
    ImageView f109656a = ((ImageView) this.itemView.findViewById(R.id.ay1));

    /* renamed from: b */
    AVDmtImageTextView f109657b = ((AVDmtImageTextView) this.itemView.findViewById(R.id.at9));

    /* renamed from: c */
    public final FrameLayout f109658c;

    /* renamed from: d */
    public final C43377b f109659d;

    /* renamed from: f */
    private ObjectAnimator f109660f;

    /* renamed from: g */
    private int f109661g = -1;

    /* renamed from: h */
    private long f109662h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.f$a */
    public static final class C43376a {
        private C43376a() {
        }

        public /* synthetic */ C43376a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.f$b */
    public interface C43377b {
        /* renamed from: a */
        void mo88302a(View view, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.f$c */
    static final class C43378c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C43374f f109664a;

        C43378c(C43374f fVar) {
            this.f109664a = fVar;
        }

        public final void run() {
            this.f109664a.mo88311b();
        }
    }

    /* renamed from: b */
    public final void mo88311b() {
        ImageView imageView = this.f109656a;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        m95117d();
    }

    /* renamed from: d */
    private final void m95117d() {
        ObjectAnimator objectAnimator = this.f109660f;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.f109660f;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
        }
        ImageView imageView = this.f109656a;
        if (imageView != null) {
            imageView.setRotation(0.0f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo88310a() {
        if (getAdapterPosition() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final void m95116c() {
        ImageView imageView = this.f109656a;
        if (imageView == null) {
            C52711k.m112234a();
        }
        this.f109660f = ObjectAnimator.ofFloat(imageView, "rotation", new float[]{0.0f, 360.0f});
        ObjectAnimator objectAnimator = this.f109660f;
        if (objectAnimator != null) {
            objectAnimator.setDuration(800);
        }
        ObjectAnimator objectAnimator2 = this.f109660f;
        if (objectAnimator2 != null) {
            objectAnimator2.setRepeatMode(1);
        }
        ObjectAnimator objectAnimator3 = this.f109660f;
        if (objectAnimator3 != null) {
            objectAnimator3.setRepeatCount(-1);
        }
        ObjectAnimator objectAnimator4 = this.f109660f;
        if (objectAnimator4 != null) {
            objectAnimator4.start();
        }
    }

    /* renamed from: a */
    public final void mo88309a(boolean z) {
        AVDmtImageTextView aVDmtImageTextView = this.f109657b;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.mo93970a(z);
        }
    }

    /* renamed from: a */
    public final void mo88308a(int i) {
        if (!mo88310a() && i != this.f109661g) {
            int i2 = this.f109661g;
            this.f109661g = i;
            switch (i) {
                case 0:
                case 3:
                    ImageView imageView = this.f109656a;
                    if (imageView != null) {
                        imageView.setImageResource(R.drawable.d3q);
                    }
                    ImageView imageView2 = this.f109656a;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    }
                    m95117d();
                    break;
                case 1:
                    if (2 != i2 || this.f109662h <= 0) {
                        mo88311b();
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis() - this.f109662h;
                    if (currentTimeMillis >= 100) {
                        mo88311b();
                        return;
                    } else {
                        this.itemView.postDelayed(new C43378c(this), 100 - currentTimeMillis);
                        return;
                    }
                case 2:
                    this.f109662h = System.currentTimeMillis();
                    ImageView imageView3 = this.f109656a;
                    if (imageView3 != null) {
                        imageView3.setVisibility(0);
                    }
                    ImageView imageView4 = this.f109656a;
                    if (imageView4 != null) {
                        imageView4.setImageResource(R.drawable.ed);
                    }
                    m95116c();
                    return;
            }
        }
    }

    public C43374f(FrameLayout frameLayout, C43377b bVar) {
        C52711k.m112240b(frameLayout, "parent");
        super(frameLayout);
        this.f109658c = frameLayout;
        this.f109659d = bVar;
        this.itemView.setOnClickListener(new C47687av(this) {

            /* renamed from: a */
            final /* synthetic */ C43374f f109663a;

            {
                this.f109663a = r1;
            }

            /* renamed from: a */
            public final void mo59929a(View view) {
                C52711k.m112240b(view, "v");
                C43377b bVar = this.f109663a.f109659d;
                if (bVar != null) {
                    bVar.mo88302a(view, this.f109663a.getAdapterPosition());
                }
            }
        });
    }
}
