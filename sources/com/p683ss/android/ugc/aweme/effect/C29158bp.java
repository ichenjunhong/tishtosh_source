package com.p683ss.android.ugc.aweme.effect;

import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.graphics.C0803a;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C42430at;
import com.p683ss.android.ugc.aweme.sticker.C46410r;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p683ss.android.ugc.aweme.themechange.base.C46788b;
import com.p683ss.android.ugc.aweme.views.CircleDraweeView;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.effect.bp */
public final class C29158bp extends C1322a<C29160b> {

    /* renamed from: a */
    public List<EffectModel> f76413a;

    /* renamed from: b */
    public C29159a f76414b;

    /* renamed from: c */
    public int f76415c;

    /* renamed from: com.ss.android.ugc.aweme.effect.bp$a */
    public interface C29159a {
        /* renamed from: a */
        boolean mo59034a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.bp$b */
    class C29160b extends C1352v {

        /* renamed from: a */
        CircleDraweeView f76416a;

        /* renamed from: b */
        AVDmtTextView f76417b;

        /* renamed from: c */
        View f76418c;

        C29160b(View view) {
            super(view);
            this.f76416a = (CircleDraweeView) view.findViewById(R.id.ct2);
            this.f76417b = (AVDmtTextView) view.findViewById(R.id.ey8);
            this.f76418c = view.findViewById(R.id.ex8);
            this.f76417b.mo1037a();
            this.f76417b.setHorizontalFadingEdgeEnabled(true);
            this.f76417b.setFadingEdgeLength((int) C9432q.m18687b(this.f76417b.getContext(), 4.0f));
            this.f76416a.setOnClickListener(new C29161bq(this));
            this.f76416a.setOnTouchListener(new C46410r(1.2f, 100, this.f76418c));
        }
    }

    public final int getItemCount() {
        return this.f76413a.size();
    }

    /* renamed from: a */
    public final void mo59029a() {
        if (this.f76415c != 0) {
            this.f76415c = 0;
            notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public final void mo59032b() {
        if (this.f76415c == 1) {
            notifyItemChanged(1);
        }
    }

    /* renamed from: c */
    public final void mo59033c() {
        if (this.f76415c == 1) {
            this.f76415c = 0;
            notifyItemRangeChanged(0, 2);
        }
    }

    /* renamed from: a */
    public final void mo59030a(int i) {
        notifyItemChanged(this.f76415c);
        this.f76415c = i;
        notifyItemChanged(this.f76415c);
    }

    /* renamed from: a */
    public final void mo59031a(boolean z) {
        this.f76413a = C29207l.m68790a();
        if (z) {
            ((EffectModel) this.f76413a.get(2)).isEnabled = false;
            ((EffectModel) this.f76413a.get(3)).isEnabled = false;
        }
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C29160b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bi5, viewGroup, false));
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C29160b bVar = (C29160b) vVar;
        EffectModel effectModel = (EffectModel) C29158bp.this.f76413a.get(i);
        Drawable drawable = bVar.f76416a.getResources().getDrawable(effectModel.imagePath);
        if (!effectModel.isEnabled) {
            drawable.setAlpha(127);
        }
        if (i == 0) {
            int b = (int) C9432q.m18687b(bVar.f76416a.getContext(), 12.0f);
            int color = bVar.itemView.getContext().getResources().getColor(R.color.auj);
            bVar.f76416a.setImageDrawable(C46788b.f118235d.mo94010a(drawable, false));
            bVar.f76416a.setPadding(b, b, b, b);
            bVar.f76416a.setBackground(C42430at.m93195a(color, color, 0));
        } else {
            bVar.f76416a.setBackground(drawable);
        }
        SpannableString spannableString = new SpannableString(effectModel.name);
        if (!effectModel.isEnabled) {
            spannableString.setSpan(new ForegroundColorSpan(C0803a.m2298b(C0726c.m2098c(C39629l.m88233b(), R.color.aso), 127)), 0, spannableString.length(), 17);
        }
        bVar.f76417b.setText(spannableString);
        if (i == C29158bp.this.f76415c) {
            bVar.f76417b.mo93997a(true);
            bVar.f76417b.setSelected(true);
            bVar.f76418c.setBackground(bVar.f76418c.getResources().getDrawable(R.drawable.cck));
            return;
        }
        bVar.f76417b.mo93997a(false);
        bVar.f76417b.setSelected(false);
        bVar.f76418c.setBackground(null);
    }
}
