package com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.widget.ImageView.ScaleType;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2199c.C43692d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43693a.C43696a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C43744a;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.g */
public final class C43731g {

    /* renamed from: a */
    public C43744a f110723a;

    /* renamed from: b */
    public C43692d f110724b;

    /* renamed from: c */
    public final C43693a f110725c = new C43693a();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.g$a */
    static final class C43732a implements C43696a {

        /* renamed from: a */
        final /* synthetic */ C43731g f110726a;

        C43732a(C43731g gVar) {
            this.f110726a = gVar;
        }

        /* renamed from: a */
        public final void mo89104a(String str, Bitmap bitmap) {
            View k = C43731g.m96053a(this.f110726a).mo89232k();
            if (k != null) {
                ((SimpleDraweeView) k).setImageBitmap(bitmap);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.g$b */
    public static final class C43733b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C43731g f110727a;

        C43733b(C43731g gVar) {
            this.f110727a = gVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            super.onAnimationEnd(animator);
            C43731g.m96053a(this.f110727a).mo89228g();
            C43731g.m96055b(this.f110727a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.g$c */
    public static final class C43734c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C43731g f110728a;

        /* renamed from: b */
        final /* synthetic */ boolean f110729b;

        /* renamed from: c */
        final /* synthetic */ boolean f110730c;

        public final void onAnimationEnd(Animator animator) {
            if (animator != null) {
                super.onAnimationEnd(animator);
            }
            C43731g.m96055b(this.f110728a).mo89129a(this.f110729b, this.f110730c);
            C43731g.m96053a(this.f110728a).mo89229h();
            C43731g.m96055b(this.f110728a).mo89130b();
        }

        C43734c(C43731g gVar, boolean z, boolean z2) {
            this.f110728a = gVar;
            this.f110729b = z;
            this.f110730c = z2;
        }
    }

    /* renamed from: a */
    private final void m96054a() {
        C43744a aVar = this.f110723a;
        if (aVar == null) {
            C52711k.m112237a("viewManager");
        }
        aVar.mo89230i();
    }

    /* renamed from: a */
    public static final /* synthetic */ C43744a m96053a(C43731g gVar) {
        C43744a aVar = gVar.f110723a;
        if (aVar == null) {
            C52711k.m112237a("viewManager");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ C43692d m96055b(C43731g gVar) {
        C43692d dVar = gVar.f110724b;
        if (dVar == null) {
            C52711k.m112237a("statusChangeListener");
        }
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo89174a(VideoSegment videoSegment) {
        if (videoSegment != null) {
            C43744a aVar = this.f110723a;
            if (aVar == null) {
                C52711k.m112237a("viewManager");
            }
            aVar.mo89231j();
            C43744a aVar2 = this.f110723a;
            if (aVar2 == null) {
                C52711k.m112237a("viewManager");
            }
            View k = aVar2.mo89232k();
            if (k != null) {
                ((SimpleDraweeView) k).setScaleType(ScaleType.CENTER_CROP);
                this.f110725c.mo89132a(videoSegment.mo86941a(false), new C43732a(this));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
    }

    /* renamed from: a */
    public final void mo89173a(FragmentActivity fragmentActivity, VideoSegment videoSegment, int i) {
        mo89174a(videoSegment);
        C43744a aVar = this.f110723a;
        if (aVar == null) {
            C52711k.m112237a("viewManager");
        }
        aVar.mo89228g();
        if (this.f110724b == null) {
            C52711k.m112237a("statusChangeListener");
        }
    }

    /* renamed from: a */
    public final void mo89172a(FragmentActivity fragmentActivity, int i, boolean z, boolean z2) {
        m96054a();
        m96056b(fragmentActivity, i, z, z2);
    }

    /* renamed from: b */
    private final void m96056b(FragmentActivity fragmentActivity, int i, boolean z, boolean z2) {
        C43744a aVar = this.f110723a;
        if (aVar == null) {
            C52711k.m112237a("viewManager");
        }
        aVar.mo89209a(fragmentActivity, i, z, z2, new C43734c(this, z, z2));
    }
}
