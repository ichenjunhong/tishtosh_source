package com.p683ss.android.ugc.aweme.effect;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap.Config;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.effect.p1670a.C29088a;
import com.p683ss.android.ugc.aweme.effect.p1671b.C29126a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.sticker.C46410r;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtImageView;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p683ss.android.ugc.aweme.views.CircleDraweeView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.effect.aa */
public final class C29089aa extends C29088a<C29091b> {

    /* renamed from: a */
    public C29090a f76255a;

    /* renamed from: com.ss.android.ugc.aweme.effect.aa$a */
    public interface C29090a {
        /* renamed from: a */
        void mo58936a(int i, int i2, EffectModel effectModel);
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.aa$b */
    public class C29091b extends C1352v {

        /* renamed from: a */
        AVDmtImageView f76256a;

        /* renamed from: b */
        AVDmtTextView f76257b;

        /* renamed from: c */
        CircleDraweeView f76258c;

        /* renamed from: d */
        ObjectAnimator f76259d;

        /* renamed from: e */
        int f76260e = -1;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo58937a() {
            if (this.f76259d != null && this.f76259d.isRunning()) {
                this.f76259d.cancel();
            }
            this.f76256a.setRotation(0.0f);
            this.f76256a.setImageResource(R.drawable.ec);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo58938a(boolean z) {
            this.f76258c.mo95452a(z);
        }

        public C29091b(View view) {
            super(view);
            this.f76258c = (CircleDraweeView) view.findViewById(R.id.ct2);
            this.f76258c.mo95488a(true, false);
            this.f76257b = (AVDmtTextView) view.findViewById(R.id.ey8);
            this.f76257b.mo1037a();
            this.f76257b.setHorizontalFadingEdgeEnabled(true);
            this.f76257b.setFadingEdgeLength((int) C9432q.m18687b(this.f76257b.getContext(), 4.0f));
            this.f76256a = (AVDmtImageView) view.findViewById(R.id.b0b);
            this.f76258c.setOnTouchListener(new C29092ab(this));
            this.f76258c.setOnClickListener(new C29093ac(this));
        }
    }

    public final int getItemCount() {
        return this.f76253c.size();
    }

    public final int getItemViewType(int i) {
        if (C29207l.m68792a(((EffectModel) this.f76253c.get(i)).category)) {
            return 2;
        }
        return 1;
    }

    public C29089aa(RecyclerView recyclerView, C29126a aVar) {
        super(recyclerView, aVar);
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C29091b bVar = new C29091b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bi4, viewGroup, false));
        if (i == 2) {
            bVar.f76258c.setOnTouchListener(new C46410r(1.2f, 100, bVar.f76258c));
        } else {
            bVar.f76258c.setOnClickListener(null);
        }
        return bVar;
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C29091b bVar = (C29091b) vVar;
        EffectModel effectModel = (EffectModel) this.f76253c.get(i);
        int a = mo58933a(i);
        if (effectModel != null) {
            bVar.f76257b.setText(effectModel.name);
            if (!TextUtils.isEmpty(effectModel.iconUrl) && !effectModel.iconUrl.equals(bVar.f76258c.getTag())) {
                if (C29207l.m68791a(effectModel)) {
                    bVar.f76258c.setImageDrawable(bVar.f76258c.getResources().getDrawable(C39629l.m88233b().getResources().getIdentifier(effectModel.iconUrl, "drawable", C39629l.m88233b().getPackageName())));
                } else {
                    bVar.f76258c.mo95451a(effectModel.iconUrl, Config.RGB_565);
                }
                bVar.f76258c.setTag(effectModel.iconUrl);
            }
            if (bVar.f76260e != a) {
                bVar.f76260e = a;
                switch (a) {
                    case 0:
                        bVar.mo58937a();
                        bVar.f76256a.setVisibility(0);
                        return;
                    case 1:
                        bVar.f76256a.setVisibility(8);
                        return;
                    case 2:
                        bVar.f76256a.setVisibility(0);
                        bVar.f76256a.setImageResource(R.drawable.ed);
                        bVar.f76259d = ObjectAnimator.ofFloat(bVar.f76256a, "rotation", new float[]{0.0f, 360.0f});
                        bVar.f76259d.setDuration(800);
                        bVar.f76259d.setRepeatMode(1);
                        bVar.f76259d.setRepeatCount(-1);
                        bVar.f76259d.setInterpolator(new LinearInterpolator());
                        bVar.f76259d.start();
                        return;
                    case 3:
                        bVar.mo58937a();
                        bVar.f76256a.setVisibility(8);
                        return;
                    case 4:
                        bVar.f76256a.setVisibility(0);
                        bVar.mo58937a();
                        break;
                }
            }
        }
    }
}
