package com.p683ss.android.ugc.aweme.common.p1589a;

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
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.common.a.j */
public abstract class C26844j extends C26850m {

    /* renamed from: q */
    static final String f70674q = "j";

    /* renamed from: a */
    private int f70675a;

    /* renamed from: b */
    private String f70676b;

    /* renamed from: c */
    private TextView f70677c;

    /* renamed from: d */
    private long f70678d = -1;

    /* renamed from: e */
    private RecyclerView f70679e;

    /* renamed from: f */
    private C26847b f70680f;

    /* renamed from: r */
    public int f70681r = -1;

    /* renamed from: s */
    public int f70682s;

    /* renamed from: t */
    public int f70683t;

    /* renamed from: u */
    public String f70684u;

    /* renamed from: v */
    public C26846a f70685v;

    /* renamed from: w */
    public C1302b f70686w = new C1302b() {
        /* renamed from: a */
        public final int mo4690a(int i) {
            if (i == 0 && C23751c.this.mo48641a(i) == C23751c.f63322a) {
                return 2;
            }
            return 1;
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.common.a.j$a */
    public interface C26846a {
        void ar_();
    }

    /* renamed from: com.ss.android.ugc.aweme.common.a.j$b */
    public class C26847b extends C1352v {

        /* renamed from: a */
        C26849l f70689a;

        /* renamed from: c */
        private TextView f70691c;

        /* renamed from: b */
        public final void mo54796b() {
            ((DmtStatusView) this.itemView).mo19214h();
        }

        /* renamed from: a */
        public final void mo54794a() {
            DmtStatusView dmtStatusView = (DmtStatusView) this.itemView;
            dmtStatusView.setStatus(C26844j.this.f70681r);
            if (dmtStatusView.mo19211e() && C26844j.this.f70685v != null) {
                C26844j.this.f70685v.ar_();
            }
        }

        /* renamed from: a */
        public final void mo54795a(RecyclerView recyclerView) {
            DmtStatusView dmtStatusView = (DmtStatusView) this.itemView;
            if (!TextUtils.equals(this.f70691c.getText(), this.f70691c.getResources().getString(R.string.d1_))) {
                this.f70691c.setText(R.string.d1_);
            }
            dmtStatusView.mo19214h();
            if (this.f70689a == null) {
                this.f70689a = new C26849l(recyclerView, C26844j.this.f70685v);
            }
            this.f70689a.f70693a = true;
        }

        public C26847b(View view, TextView textView) {
            super(view);
            this.f70691c = textView;
            textView.setOnClickListener(new C26848k(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo54789b(View view) {
    }

    public final void co_() {
        if (this.f70680f != null) {
            this.f70680f.mo54796b();
        }
        this.f70681r = 2;
    }

    public int getItemCount() {
        if (mo48636c() == 0) {
            return 0;
        }
        return super.getItemCount();
    }

    /* renamed from: i */
    public final void mo54793i() {
        if (this.f70679e != null) {
            mo54787a(this.f70679e, true);
        }
    }

    public void am_() {
        if (this.f70680f != null) {
            ((DmtStatusView) this.f70680f.itemView).mo19212f();
        }
        this.f70681r = 0;
        if (this.f70678d == -1) {
            this.f70678d = System.currentTimeMillis();
        }
    }

    public void an_() {
        if (this.f70680f != null) {
            ((DmtStatusView) this.f70680f.itemView).mo19213g();
        }
        this.f70681r = 1;
    }

    public void ao_() {
        if (this.f70680f != null) {
            ((DmtStatusView) this.f70680f.itemView).mo19209d();
        }
        this.f70681r = -1;
        this.f70678d = -1;
    }

    /* renamed from: a */
    public void mo54788a(C26846a aVar) {
        this.f70685v = aVar;
    }

    /* renamed from: a */
    public void mo51182a(C1352v vVar) {
        ((C26847b) vVar).mo54794a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo51179a(View view) {
        return view.getResources().getDimensionPixelSize(R.dimen.ff);
    }

    /* renamed from: b */
    public final void mo54790b(String str) {
        if (this.f70677c != null) {
            this.f70677c.setText(str);
        }
        this.f70676b = str;
    }

    /* renamed from: d */
    public final void mo54792d(int i) {
        if (this.f70677c != null) {
            this.f70677c.setText(i);
        }
        this.f70675a = i;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f70679e = recyclerView;
        C1332i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.f4526g = new C1302b() {
                /* renamed from: a */
                public final int mo4690a(int i) {
                    if (C26844j.this.getItemViewType(i) == Integer.MIN_VALUE) {
                        return gridLayoutManager.f4521b;
                    }
                    if (C26844j.this.f70686w != null) {
                        return C26844j.this.f70686w.mo4690a(i);
                    }
                    return 1;
                }
            };
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
        if (this.f70678d != -1 && !TextUtils.isEmpty(this.f70684u)) {
            C23569o.m57782b("aweme_feed_load_more_duration", this.f70684u, (float) (System.currentTimeMillis() - this.f70678d));
            this.f70678d = -1;
        }
    }

    /* renamed from: a_ */
    public C1352v mo49730a_(ViewGroup viewGroup) {
        DmtStatusView dmtStatusView = new DmtStatusView(viewGroup.getContext());
        int a = mo51179a((View) viewGroup);
        mo54789b((View) dmtStatusView);
        dmtStatusView.setLayoutParams(new RecyclerView.LayoutParams(-1, a));
        this.f70677c = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.auk, null);
        if (this.f70682s != 0) {
            this.f70677c.setTextColor(this.f70682s);
        }
        if (this.f70675a != 0) {
            this.f70677c.setText(this.f70675a);
        }
        if (this.f70676b != null) {
            this.f70677c.setText(this.f70676b);
        }
        this.f70677c.setGravity(17);
        TextView textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aum, null);
        textView.setText(R.string.c0c);
        textView.setGravity(17);
        if (this.f70683t != 0) {
            textView.setTextColor(this.f70683t);
        }
        dmtStatusView.setBuilder(C10719a.m21676a(viewGroup.getContext()).mo19231b((View) this.f70677c).mo19234c((View) textView));
        this.f70680f = new C26847b(dmtStatusView, textView);
        return this.f70680f;
    }

    /* renamed from: a */
    public final void mo54787a(RecyclerView recyclerView, boolean z) {
        if (this.f70680f != null) {
            this.f70680f.mo54795a(recyclerView);
        }
        this.f70681r = 2;
        if (z) {
            C10691a.m21542b(recyclerView.getContext(), (int) R.string.c0b).mo19066a();
        }
    }
}
