package com.p683ss.android.ugc.aweme.comment.adapter;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.p051e.C1208c.C1212c;
import android.support.p043v7.view.C1221d;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.ext.list.p744a.C11848e.C11850b;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.p683ss.android.ugc.aweme.base.arch.C23466e;
import com.p683ss.android.ugc.aweme.comment.model.GifEmoji;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.s */
public final class C25132s extends C23466e<GifEmoji> {

    /* renamed from: c */
    private final C25134u f66572c;

    /* renamed from: a */
    public final JediViewHolder<? extends C11796d, GifEmoji> mo48638a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        return new SearchGifViewHolder<>(viewGroup, this.f66572c);
    }

    /* renamed from: a_ */
    public final C1352v mo49730a_(ViewGroup viewGroup) {
        C1352v a_ = super.mo49730a_(viewGroup);
        if (viewGroup != null) {
            Context context = viewGroup.getContext();
            if (context != null) {
                View view = a_.itemView;
                if (!(view instanceof DmtStatusView)) {
                    view = null;
                }
                DmtStatusView dmtStatusView = (DmtStatusView) view;
                if (dmtStatusView != null) {
                    dmtStatusView.setLayoutParams(new LayoutParams(-2, -1));
                    int c = C0726c.m2098c(context, R.color.a8g);
                    DmtTextView dmtTextView = new DmtTextView(new C1221d(context, R.style.tf));
                    dmtTextView.setTextColor(c);
                    dmtTextView.setText(R.string.axo);
                    DmtTextView dmtTextView2 = new DmtTextView(new C1221d(context, R.style.tf));
                    dmtTextView2.setTextColor(c);
                    dmtTextView2.setText(R.string.an1);
                    dmtStatusView.setBuilder(C10719a.m21676a(context).mo19231b((View) dmtTextView2).mo19234c((View) dmtTextView));
                }
            }
        }
        C52711k.m112236a((Object) a_, "holder");
        return a_;
    }

    private C25132s(C0184k kVar, C25134u uVar, C11850b bVar) {
        C52711k.m112240b(kVar, "parent");
        C52711k.m112240b(uVar, "gifEmojiActionListener");
        super(kVar, (C1212c<T>) new C25133t<T>(), bVar);
        this.f66572c = uVar;
    }

    public /* synthetic */ C25132s(C0184k kVar, C25134u uVar, C11850b bVar, int i, C52707g gVar) {
        this(kVar, uVar, null);
    }
}
