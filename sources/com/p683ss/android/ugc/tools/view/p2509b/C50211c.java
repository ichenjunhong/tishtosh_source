package com.p683ss.android.ugc.tools.view.p2509b;

import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.GridLayoutManager.C1302b;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.tools.view.widget.AVStatusView;
import com.p683ss.android.ugc.tools.view.widget.AVStatusView.C50243a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.tools.view.b.c */
public abstract class C50211c extends C50217f {

    /* renamed from: n */
    static final String f125766n = "c";

    /* renamed from: a */
    private int f125767a;

    /* renamed from: b */
    private String f125768b;

    /* renamed from: c */
    private TextView f125769c;

    /* renamed from: d */
    private long f125770d = -1;

    /* renamed from: e */
    private RecyclerView f125771e;

    /* renamed from: f */
    private C50214b f125772f;

    /* renamed from: o */
    public int f125773o = -1;

    /* renamed from: p */
    public int f125774p = this.f91396c.getResources().getColor(R.color.b25);

    /* renamed from: q */
    public String f125775q;

    /* renamed from: r */
    public C50213a f125776r;

    /* renamed from: s */
    public C1302b f125777s;

    /* renamed from: com.ss.android.ugc.tools.view.b.c$a */
    public interface C50213a {
        /* renamed from: a */
        void mo73964a();
    }

    /* renamed from: com.ss.android.ugc.tools.view.b.c$b */
    protected class C50214b extends C1352v {

        /* renamed from: a */
        C50216e f125780a;

        /* renamed from: c */
        private TextView f125782c;

        /* renamed from: a */
        public final void mo97987a() {
            ((AVStatusView) this.itemView).mo98095b();
        }

        /* renamed from: b */
        public final void mo97988b() {
            ((AVStatusView) this.itemView).mo98098d();
        }

        /* renamed from: c */
        public final void mo97989c() {
            ((AVStatusView) this.itemView).mo98097c();
        }

        /* renamed from: d */
        public final void mo97990d() {
            ((AVStatusView) this.itemView).mo98093a();
        }

        public C50214b(View view, TextView textView) {
            super(view);
            this.f125782c = textView;
            textView.setOnClickListener(new C50215d(this));
        }
    }

    /* renamed from: e */
    public final void mo97984e() {
        if (this.f125772f != null) {
            this.f125772f.mo97988b();
        }
        this.f125773o = 2;
    }

    /* renamed from: f */
    public final void mo97985f() {
        if (this.f125772f != null) {
            this.f125772f.mo97989c();
        }
        this.f125773o = 1;
    }

    public int getItemCount() {
        if (mo64314a() == 0) {
            return 0;
        }
        return super.getItemCount();
    }

    /* renamed from: d */
    public final void mo97983d() {
        if (this.f125772f != null) {
            this.f125772f.mo97987a();
        }
        this.f125773o = 0;
        if (this.f125770d == -1) {
            this.f125770d = System.currentTimeMillis();
        }
    }

    /* renamed from: g */
    public final void mo97986g() {
        if (this.f125772f != null) {
            this.f125772f.mo97990d();
        }
        this.f125773o = -1;
        this.f125770d = -1;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f125771e = recyclerView;
        C1332i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.f4526g = new C1302b() {
                /* renamed from: a */
                public final int mo4690a(int i) {
                    if (C50211c.this.getItemViewType(i) == Integer.MIN_VALUE) {
                        return gridLayoutManager.f4521b;
                    }
                    if (C50211c.this.f125777s != null) {
                        return C50211c.this.f125777s.mo4690a(i);
                    }
                    return 1;
                }
            };
        }
    }

    /* renamed from: a */
    public final void mo97982a(C1352v vVar) {
        boolean z;
        C50214b bVar = (C50214b) vVar;
        AVStatusView aVStatusView = (AVStatusView) bVar.itemView;
        aVStatusView.setStatus(C50211c.this.f125773o);
        if (aVStatusView.f125946b == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z && C50211c.this.f125776r != null) {
            C50211c.this.f125776r.mo73964a();
        }
    }

    public void onViewAttachedToWindow(C1352v vVar) {
        boolean z;
        super.onViewAttachedToWindow(vVar);
        LayoutParams layoutParams = vVar.itemView.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
            if (getItemViewType(vVar.getLayoutPosition()) == Integer.MIN_VALUE) {
                z = true;
            } else {
                z = false;
            }
            layoutParams2.f4918b = z;
        }
    }

    public void onViewDetachedFromWindow(C1352v vVar) {
        super.onViewDetachedFromWindow(vVar);
        if (this.f125770d != -1 && !TextUtils.isEmpty(this.f125775q)) {
            C39629l.m88232a().mo58567E().mo49429a("aweme_feed_load_more_duration", this.f125775q, (float) (System.currentTimeMillis() - this.f125770d));
            this.f125770d = -1;
        }
    }

    /* renamed from: a */
    public final C1352v mo97981a(ViewGroup viewGroup) {
        AVStatusView aVStatusView = new AVStatusView(viewGroup.getContext());
        aVStatusView.setLayoutParams(new RecyclerView.LayoutParams(-1, viewGroup.getResources().getDimensionPixelSize(R.dimen.ff)));
        this.f125769c = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.auk, null);
        if (this.f125774p != 0) {
            this.f125769c.setTextColor(this.f125774p);
        }
        if (this.f125767a != 0) {
            this.f125769c.setText(this.f125767a);
        }
        if (this.f125768b != null) {
            this.f125769c.setText(this.f125768b);
        }
        this.f125769c.setGravity(17);
        TextView textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bv3, null);
        textView.setText(R.string.c0c);
        textView.setGravity(17);
        aVStatusView.setBuilder(C50243a.m108469a(viewGroup.getContext()).mo98105a((View) this.f125769c).mo98107b((View) textView));
        this.f125772f = new C50214b(aVStatusView, textView);
        return this.f125772f;
    }
}
