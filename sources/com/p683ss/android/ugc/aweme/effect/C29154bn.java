package com.p683ss.android.ugc.aweme.effect;

import android.animation.ObjectAnimator;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.p683ss.android.ugc.aweme.effect.p1670a.C29088a;
import com.p683ss.android.ugc.aweme.effect.p1671b.C29126a;
import com.p683ss.android.ugc.aweme.sticker.C46410r;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.effect.bn */
public final class C29154bn extends C29088a<C29156b> {

    /* renamed from: a */
    public C29155a f76405a;

    /* renamed from: b */
    public int f76406b = -1;

    /* renamed from: com.ss.android.ugc.aweme.effect.bn$a */
    public interface C29155a {
        /* renamed from: a */
        void mo59026a(EffectModel effectModel, int i, int i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.bn$b */
    class C29156b extends C1352v {

        /* renamed from: a */
        AVDmtImageTextView f76407a;

        /* renamed from: b */
        AVDmtImageView f76408b;

        /* renamed from: c */
        ObjectAnimator f76409c;

        /* renamed from: d */
        int f76410d = -1;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo59027a() {
            if (this.f76409c != null && this.f76409c.isRunning()) {
                this.f76409c.cancel();
            }
            this.f76408b.setRotation(0.0f);
            this.f76408b.setImageResource(R.drawable.ec);
        }

        C29156b(View view) {
            super(view);
            this.f76407a = (AVDmtImageTextView) view.findViewById(R.id.ct2);
            this.f76408b = (AVDmtImageView) view.findViewById(R.id.b0b);
            this.f76407a.setOnClickListener(new C29157bo(this));
            this.f76407a.setOnTouchListener(new C46410r(1.1f, 100, this.f76407a));
        }
    }

    public final int getItemCount() {
        if (this.f76253c == null) {
            return 0;
        }
        return this.f76253c.size();
    }

    /* renamed from: a */
    public final void mo59025a(EffectPointModel effectPointModel) {
        if (effectPointModel == null) {
            if (this.f76406b != -1) {
                int i = this.f76406b;
                this.f76406b = -1;
                notifyItemChanged(i);
            }
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.f76253c.size()) {
                break;
            } else if (((EffectModel) this.f76253c.get(i2)).key.equals(effectPointModel.getKey())) {
                this.f76406b = i2;
                break;
            } else {
                i2++;
            }
        }
        notifyItemChanged(this.f76406b);
    }

    public C29154bn(RecyclerView recyclerView, C29126a aVar) {
        super(recyclerView, aVar);
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C29156b(((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(R.layout.a0o, viewGroup, false));
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        boolean z;
        C29156b bVar = (C29156b) vVar;
        int a = mo58933a(i);
        EffectModel effectModel = (EffectModel) C29154bn.this.f76253c.get(i);
        if (effectModel != null) {
            bVar.f76407a.mo93969a(effectModel.iconUrl);
            bVar.f76407a.setText(effectModel.name);
            AVDmtImageTextView aVDmtImageTextView = bVar.f76407a;
            if (i == C29154bn.this.f76406b) {
                z = true;
            } else {
                z = false;
            }
            aVDmtImageTextView.mo93970a(z);
            if (bVar.f76410d != a) {
                bVar.f76410d = a;
                switch (a) {
                    case 0:
                        bVar.mo59027a();
                        bVar.f76408b.setVisibility(0);
                        return;
                    case 1:
                        bVar.f76408b.setVisibility(8);
                        return;
                    case 2:
                        bVar.f76408b.setVisibility(0);
                        bVar.f76408b.setImageResource(R.drawable.ed);
                        bVar.f76409c = ObjectAnimator.ofFloat(bVar.f76408b, "rotation", new float[]{0.0f, 360.0f});
                        bVar.f76409c.setDuration(800);
                        bVar.f76409c.setRepeatMode(1);
                        bVar.f76409c.setRepeatCount(-1);
                        bVar.f76409c.setInterpolator(new LinearInterpolator());
                        bVar.f76409c.start();
                        return;
                    case 3:
                        bVar.mo59027a();
                        bVar.f76408b.setVisibility(8);
                        return;
                    case 4:
                        bVar.f76408b.setVisibility(0);
                        bVar.mo59027a();
                        break;
                }
            }
        }
    }
}
