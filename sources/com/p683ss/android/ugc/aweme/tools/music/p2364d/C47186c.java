package com.p683ss.android.ugc.aweme.tools.music.p2364d;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24441j;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.music.d.c */
public class C47186c extends C1352v {

    /* renamed from: d */
    public static final C47188a f119140d = new C47188a(null);

    /* renamed from: a */
    public AVDmtImageTextView f119141a;

    /* renamed from: b */
    public SimpleDraweeView f119142b;

    /* renamed from: c */
    public final C24441j f119143c;

    /* renamed from: e */
    private Animation f119144e = new AlphaAnimation(0.0f, 1.0f);

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.c$a */
    public static final class C47188a {
        private C47188a() {
        }

        public /* synthetic */ C47188a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static View m102448a(int i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            int i2;
            C52711k.m112240b(layoutInflater, "inflater");
            C52711k.m112240b(viewGroup, "parent");
            if (i == 0) {
                i2 = R.layout.fo;
            } else {
                i2 = R.layout.fp;
            }
            View inflate = layoutInflater.inflate(i2, viewGroup, false);
            C52711k.m112236a((Object) inflate, "inflater.inflate(if (mus…music_new, parent, false)");
            return inflate;
        }
    }

    /* renamed from: a */
    public final void mo94431a() {
        AVDmtImageTextView aVDmtImageTextView = this.f119141a;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.mo93964a(0.66f);
        }
        AVDmtImageTextView aVDmtImageTextView2 = this.f119141a;
        if (aVDmtImageTextView2 != null) {
            aVDmtImageTextView2.mo93973b(true);
        }
    }

    /* renamed from: b */
    public final void mo94434b() {
        AVDmtImageTextView aVDmtImageTextView = this.f119141a;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.mo93964a(1.0f);
        }
        AVDmtImageTextView aVDmtImageTextView2 = this.f119141a;
        if (aVDmtImageTextView2 != null) {
            aVDmtImageTextView2.mo93973b(false);
        }
    }

    /* renamed from: a */
    public final void mo94433a(boolean z) {
        AVDmtImageTextView aVDmtImageTextView = this.f119141a;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.mo93970a(z);
        }
    }

    public C47186c(final View view, C24441j jVar) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f119143c = jVar;
        this.f119141a = (AVDmtImageTextView) view.findViewById(R.id.avp);
        this.f119142b = (SimpleDraweeView) view.findViewById(R.id.b5o);
        Animation animation = this.f119144e;
        if (animation != null) {
            animation.setDuration(1000);
        }
        view.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C47186c f119145a;

            {
                this.f119145a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C24441j jVar = this.f119145a.f119143c;
                if (jVar != null) {
                    jVar.mo50207a(view, this.f119145a.getAdapterPosition());
                }
            }
        });
    }

    /* renamed from: a */
    public void mo94432a(MusicModel musicModel, boolean z, boolean z2, boolean z3) {
        CharSequence charSequence;
        AVDmtImageTextView aVDmtImageTextView = this.f119141a;
        String str = null;
        if (aVDmtImageTextView != null) {
            if (musicModel != null) {
                charSequence = musicModel.getName();
            } else {
                charSequence = null;
            }
            aVDmtImageTextView.setText(charSequence);
        }
        AVDmtImageTextView aVDmtImageTextView2 = this.f119141a;
        if (aVDmtImageTextView2 != null) {
            if (musicModel != null) {
                str = musicModel.getPicPremium();
            }
            aVDmtImageTextView2.mo93969a(str);
        }
        mo94433a(z);
        if (musicModel == null) {
            SimpleDraweeView simpleDraweeView = this.f119142b;
            if (simpleDraweeView == null) {
                C52711k.m112234a();
            }
            simpleDraweeView.setVisibility(8);
        } else if (musicModel.isMvThemeMusic()) {
            SimpleDraweeView simpleDraweeView2 = this.f119142b;
            if (simpleDraweeView2 == null) {
                C52711k.m112234a();
            }
            simpleDraweeView2.setVisibility(0);
        } else {
            SimpleDraweeView simpleDraweeView3 = this.f119142b;
            if (simpleDraweeView3 == null) {
                C52711k.m112234a();
            }
            simpleDraweeView3.setVisibility(8);
        }
        if (z2) {
            AVDmtImageTextView aVDmtImageTextView3 = this.f119141a;
            if (aVDmtImageTextView3 != null) {
                aVDmtImageTextView3.mo93964a(0.66f);
            }
            AVDmtImageTextView aVDmtImageTextView4 = this.f119141a;
            if (aVDmtImageTextView4 != null) {
                aVDmtImageTextView4.mo93973b(true);
            }
        } else {
            AVDmtImageTextView aVDmtImageTextView5 = this.f119141a;
            if (aVDmtImageTextView5 != null) {
                aVDmtImageTextView5.mo93964a(1.0f);
            }
            AVDmtImageTextView aVDmtImageTextView6 = this.f119141a;
            if (aVDmtImageTextView6 != null) {
                aVDmtImageTextView6.mo93973b(false);
            }
        }
    }
}
