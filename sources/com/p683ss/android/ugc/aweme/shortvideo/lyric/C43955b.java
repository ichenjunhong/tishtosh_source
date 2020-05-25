package com.p683ss.android.ugc.aweme.shortvideo.lyric;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap.Config;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.effect.EffectModel;
import com.p683ss.android.ugc.aweme.effect.p1670a.C29088a;
import com.p683ss.android.ugc.aweme.effect.p1671b.C29126a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.StickerImageView;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p683ss.android.ugc.aweme.views.CircleDraweeView;
import com.p683ss.android.ugc.tools.utils.C50200d;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.b */
public final class C43955b extends C29088a<C43959c> {

    /* renamed from: d */
    public static final int f111309d = -1;

    /* renamed from: e */
    public static final C43956a f111310e = new C43956a(null);

    /* renamed from: a */
    public C43957b f111311a;

    /* renamed from: b */
    public int f111312b = f111309d;

    /* renamed from: f */
    private String f111313f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.b$a */
    public static final class C43956a {
        private C43956a() {
        }

        public /* synthetic */ C43956a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.b$b */
    public interface C43957b {

        /* renamed from: a */
        public static final C43958a f111314a = C43958a.f111316b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.b$b$a */
        public static final class C43958a {

            /* renamed from: a */
            static final int f111315a = 1;

            /* renamed from: b */
            static final /* synthetic */ C43958a f111316b = new C43958a();

            /* renamed from: c */
            private static final int f111317c = 2;

            private C43958a() {
            }
        }

        /* renamed from: a */
        void mo89522a(EffectModel effectModel, int i, int i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.b$c */
    public final class C43959c extends C1352v {

        /* renamed from: a */
        public AVDmtImageTextView f111318a;

        /* renamed from: b */
        public ImageView f111319b;

        /* renamed from: c */
        ObjectAnimator f111320c;

        /* renamed from: d */
        int f111321d = -1;

        /* renamed from: e */
        final /* synthetic */ C43955b f111322e;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo89523a() {
            if (this.f111320c != null) {
                ObjectAnimator objectAnimator = this.f111320c;
                if (objectAnimator == null) {
                    C52711k.m112234a();
                }
                if (objectAnimator.isRunning()) {
                    ObjectAnimator objectAnimator2 = this.f111320c;
                    if (objectAnimator2 == null) {
                        C52711k.m112234a();
                    }
                    objectAnimator2.cancel();
                }
            }
            this.f111319b.setRotation(0.0f);
            this.f111319b.setImageResource(R.drawable.ec);
        }

        public C43959c(C43955b bVar, View view) {
            C52711k.m112240b(view, "itemView");
            this.f111322e = bVar;
            super(view);
            View findViewById = view.findViewById(R.id.el3);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.lyric_img_view)");
            this.f111318a = (AVDmtImageTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.b0b);
            C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.iv_effect_download)");
            this.f111319b = (ImageView) findViewById2;
            this.f111318a.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C43959c f111323a;

                {
                    this.f111323a = r1;
                }

                public final void onClick(View view) {
                    int i;
                    ClickInstrumentation.onClick(view);
                    int adapterPosition = this.f111323a.getAdapterPosition();
                    if (!(adapterPosition == -1 || this.f111323a.f111322e.f111312b == adapterPosition)) {
                        C43955b bVar = this.f111323a.f111322e;
                        if (C50200d.m108346a(((EffectModel) this.f111323a.f111322e.f76253c.get(adapterPosition)).resDir)) {
                            i = adapterPosition;
                        } else {
                            i = C43955b.f111309d;
                        }
                        bVar.f111312b = i;
                        int i2 = C43958a.f111315a;
                        C43957b bVar2 = this.f111323a.f111322e.f111311a;
                        if (bVar2 != null) {
                            bVar2.mo89522a((EffectModel) this.f111323a.f111322e.f76253c.get(this.f111323a.getAdapterPosition()), i2, adapterPosition);
                            this.f111323a.f111322e.notifyDataSetChanged();
                        }
                    }
                }
            });
        }
    }

    public final int getItemCount() {
        if (this.f76253c == null) {
            return 0;
        }
        return this.f76253c.size();
    }

    /* renamed from: a */
    public final void mo89521a(String str) {
        this.f111313f = str;
        if (this.f111313f == null) {
            if (this.f111312b != f111309d) {
                int i = this.f111312b;
                this.f111312b = f111309d;
                notifyItemChanged(i);
            }
            return;
        }
        int i2 = 0;
        this.f111312b = 0;
        int size = this.f76253c.size();
        while (true) {
            if (i2 >= size) {
                break;
            } else if (C52711k.m112239a((Object) ((EffectModel) this.f76253c.get(i2)).key, (Object) this.f111313f)) {
                this.f111312b = i2;
                break;
            } else {
                i2++;
            }
        }
        notifyItemChanged(this.f111312b);
    }

    public C43955b(RecyclerView recyclerView, C29126a aVar) {
        C52711k.m112240b(recyclerView, "recyclerView");
        super(recyclerView, aVar);
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        Object systemService = viewGroup.getContext().getSystemService("layout_inflater");
        if (systemService != null) {
            View inflate = ((LayoutInflater) systemService).inflate(R.layout.bio, viewGroup, false);
            C52711k.m112236a((Object) inflate, "itemView");
            return new C43959c(this, inflate);
        }
        throw new C52857u("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        boolean z;
        C43959c cVar = (C43959c) vVar;
        C52711k.m112240b(cVar, "holder");
        int a = mo58933a(i);
        EffectModel effectModel = (EffectModel) cVar.f111322e.f76253c.get(i);
        if (effectModel != null) {
            AVDmtImageTextView aVDmtImageTextView = cVar.f111318a;
            String str = effectModel.iconUrl;
            C52711k.m112236a((Object) str, "model.iconUrl");
            Config config = Config.ARGB_8888;
            C52711k.m112240b(str, "url");
            if (!TextUtils.isEmpty(str) && config != null) {
                StickerImageView stickerImageView = aVDmtImageTextView.f118163a;
                if (stickerImageView == null) {
                    C52711k.m112237a("imageView");
                }
                stickerImageView.mo90449a(str, config);
            }
            cVar.f111318a.setText(effectModel.name);
            AVDmtImageTextView aVDmtImageTextView2 = cVar.f111318a;
            if (i == cVar.f111322e.f111312b) {
                z = true;
            } else {
                z = false;
            }
            aVDmtImageTextView2.mo93970a(z);
            StickerImageView stickerImageView2 = cVar.f111318a.f118163a;
            if (stickerImageView2 == null) {
                C52711k.m112237a("imageView");
            }
            if (!stickerImageView2.f112646b) {
                CircleDraweeView circleDraweeView = stickerImageView2.f112645a;
                if (circleDraweeView == null) {
                    C52711k.m112237a("iconImageView");
                }
                circleDraweeView.mo95488a(true, false);
            }
            if (cVar.f111321d != a) {
                cVar.f111321d = a;
                switch (a) {
                    case 0:
                        cVar.mo89523a();
                        cVar.f111319b.setVisibility(0);
                        return;
                    case 1:
                        cVar.f111319b.setVisibility(8);
                        return;
                    case 2:
                        cVar.f111319b.setVisibility(0);
                        cVar.f111319b.setImageResource(R.drawable.ed);
                        cVar.f111320c = ObjectAnimator.ofFloat(cVar.f111319b, "rotation", new float[]{0.0f, 360.0f});
                        ObjectAnimator objectAnimator = cVar.f111320c;
                        if (objectAnimator == null) {
                            C52711k.m112234a();
                        }
                        objectAnimator.setDuration(800);
                        ObjectAnimator objectAnimator2 = cVar.f111320c;
                        if (objectAnimator2 == null) {
                            C52711k.m112234a();
                        }
                        objectAnimator2.setRepeatMode(1);
                        ObjectAnimator objectAnimator3 = cVar.f111320c;
                        if (objectAnimator3 == null) {
                            C52711k.m112234a();
                        }
                        objectAnimator3.setRepeatCount(-1);
                        ObjectAnimator objectAnimator4 = cVar.f111320c;
                        if (objectAnimator4 == null) {
                            C52711k.m112234a();
                        }
                        objectAnimator4.start();
                        return;
                    case 3:
                        cVar.mo89523a();
                        cVar.f111319b.setVisibility(8);
                        return;
                    case 4:
                        cVar.f111319b.setVisibility(0);
                        cVar.mo89523a();
                        break;
                }
            }
        }
    }
}
