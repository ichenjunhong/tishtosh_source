package com.bytedance.android.livesdk.gift.p356d;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.gift.combo.ComboTarget;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.p379a.C7490a;
import com.bytedance.android.livesdk.widget.SendGiftAnimationView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.gift.d.j */
public final class C7243j extends C7230b<C7490a> implements OnClickListener {

    /* renamed from: n */
    private View f19654n;

    /* renamed from: o */
    private C7490a f19655o;

    /* renamed from: p */
    private SendGiftAnimationView f19656p;

    /* renamed from: q */
    private boolean f19657q;

    /* renamed from: a */
    public final ComboTarget mo13462a() {
        return null;
    }

    /* renamed from: a */
    public final void mo13464a(C7490a aVar) {
        this.f19655o = aVar;
        this.f19654n = this.f19633h.findViewById(R.id.zn);
        this.f19656p = (SendGiftAnimationView) this.f19633h.findViewById(R.id.fk);
        super.mo13464a(aVar);
        if (this.f19657q) {
            if (getAdapterPosition() == 0) {
                aVar.f20514b = true;
                mo13465a(true);
                return;
            }
            this.f19633h.setAlpha(0.3f);
            this.f19633h.setEnabled(false);
        }
    }

    public final void onClick(View view) {
        if (view.getId() == R.id.fk && (view instanceof SendGiftAnimationView)) {
            ((SendGiftAnimationView) view).mo14854a(0.7f);
            if (this.f19637l != null) {
                this.f19637l.mo13467a(this, this.f19655o);
            }
        }
    }

    /* renamed from: a */
    public final void mo13465a(boolean z) {
        if (this.f19655o != null && (this.f19655o.f20516d instanceof C7505d)) {
            if (z) {
                this.f19656p.mo14853a();
                this.f19656p.mo14855a((C7505d) this.f19655o.f20516d);
                this.f19654n.setVisibility(8);
                this.f19656p.setVisibility(0);
                this.f19656p.mo14854a(1.08f);
                this.f19656p.setOnClickListener(this);
                return;
            }
            this.f19654n.setVisibility(0);
            this.f19656p.setVisibility(8);
        }
    }

    public C7243j(View view, boolean z) {
        super(view);
        this.f19657q = z;
    }
}
