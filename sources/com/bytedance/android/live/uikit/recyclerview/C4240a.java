package com.bytedance.android.live.uikit.recyclerview;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C4239a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.uikit.recyclerview.a */
public abstract class C4240a extends C4244b {

    /* renamed from: a */
    public C4242a f11607a;

    /* renamed from: c */
    private C4243b f11608c;

    /* renamed from: com.bytedance.android.live.uikit.recyclerview.a$a */
    public interface C4242a {
        /* renamed from: a */
        void mo9858a(boolean z);
    }

    /* renamed from: com.bytedance.android.live.uikit.recyclerview.a$b */
    class C4243b extends C1352v {
        public C4243b(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public final void mo9854a() {
        if (this.f11608c != null) {
            ((LoadingStatusView) this.f11608c.itemView).mo9843b();
        }
    }

    /* renamed from: b */
    public final void mo9856b() {
        if (this.f11608c != null) {
            ((LoadingStatusView) this.f11608c.itemView).mo9842a();
        }
    }

    public final int getItemCount() {
        if (mo9862c() == 0) {
            return 0;
        }
        return super.getItemCount();
    }

    /* renamed from: a */
    public final void mo9855a(C1352v vVar) {
        boolean z;
        if (vVar instanceof C4243b) {
            C4243b bVar = (C4243b) vVar;
            if (((LoadingStatusView) bVar.itemView).f11601b == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z && C4240a.this.f11607a != null) {
                C4240a.this.f11607a.mo9858a(false);
            }
            LayoutParams layoutParams = (LayoutParams) this.f11608c.itemView.getLayoutParams();
            if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f4918b = true;
            }
            this.f11608c.itemView.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final C1352v mo9853a(ViewGroup viewGroup) {
        LoadingStatusView loadingStatusView = new LoadingStatusView(viewGroup.getContext());
        int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.ff);
        int dimensionPixelSize2 = viewGroup.getResources().getDimensionPixelSize(R.dimen.fg);
        loadingStatusView.setLayoutParams(new LayoutParams(-1, dimensionPixelSize));
        C4239a aVar = new C4239a(viewGroup.getContext());
        aVar.mo9847a(dimensionPixelSize2).mo9848a(R.string.c0c, new OnClickListener() {
            public final void onClick(View view) {
                if (C4240a.this.f11607a != null) {
                    C4240a.this.f11607a.mo9858a(true);
                }
            }
        });
        aVar.mo9849a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a_4, viewGroup, false));
        loadingStatusView.setBuilder(aVar);
        this.f11608c = new C4243b(loadingStatusView);
        return this.f11608c;
    }
}
