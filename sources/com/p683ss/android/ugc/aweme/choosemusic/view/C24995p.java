package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.os.Build.VERSION;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.view.View;
import android.view.View.OnScrollChangeListener;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.p */
public final class C24995p {

    /* renamed from: a */
    public int f66170a;

    /* renamed from: b */
    int f66171b;

    /* renamed from: c */
    int f66172c;

    /* renamed from: d */
    int f66173d;

    /* renamed from: e */
    public int f66174e;

    /* renamed from: f */
    public int f66175f;

    /* renamed from: g */
    public boolean f66176g = true;

    /* renamed from: h */
    private C24997a f66177h;

    /* renamed from: i */
    private int f66178i;

    /* renamed from: j */
    private boolean f66179j = true;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.p$a */
    public interface C24997a {
        /* renamed from: a */
        void mo50879a(int i, int i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.p$b */
    class C24998b implements OnScrollChangeListener {
        private C24998b() {
        }

        public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
            if (view instanceof RecyclerView) {
                C24995p.this.mo50987b((RecyclerView) view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.p$c */
    class C24999c extends C1340m {
        private C24999c() {
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            C24995p.this.mo50987b(recyclerView);
        }
    }

    /* renamed from: a */
    public final void mo50986a(RecyclerView recyclerView) {
        if (VERSION.SDK_INT >= 23) {
            recyclerView.setOnScrollChangeListener(new C24998b());
        } else {
            recyclerView.setOnScrollListener(new C24999c());
        }
    }

    /* renamed from: b */
    public final void mo50987b(RecyclerView recyclerView) {
        if (this.f66176g) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            this.f66172c = recyclerView.getChildCount();
            this.f66173d = linearLayoutManager.mo5013A();
            this.f66171b = linearLayoutManager.mo4749j();
            if (this.f66173d < this.f66170a) {
                this.f66175f = this.f66174e;
                this.f66170a = this.f66173d;
                if (this.f66173d == 0) {
                    this.f66179j = true;
                }
            }
            if (this.f66179j && this.f66173d > this.f66170a) {
                this.f66179j = false;
                this.f66170a = this.f66173d;
                this.f66175f++;
            }
            if (!this.f66179j && this.f66173d - this.f66172c <= this.f66171b + this.f66178i) {
                if (this.f66177h != null) {
                    this.f66177h.mo50879a(this.f66175f + 1, this.f66173d);
                }
                this.f66179j = true;
            }
        }
    }

    public C24995p(C24997a aVar, int i) {
        this.f66177h = aVar;
        this.f66178i = i;
    }
}
