package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.p683ss.android.ugc.aweme.arch.C23269c;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24806c;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24832a;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24995p.C24997a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.music.adapter.C37306l;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.BaseMusicListView */
public abstract class BaseMusicListView<T> implements C23269c<T> {

    /* renamed from: a */
    protected C26840g f66088a;

    /* renamed from: b */
    protected C24832a f66089b;

    /* renamed from: c */
    C37306l<C24806c> f66090c;

    /* renamed from: d */
    protected int f66091d;

    /* renamed from: e */
    public boolean f66092e;

    /* renamed from: f */
    protected boolean f66093f;

    /* renamed from: g */
    private Context f66094g;

    /* renamed from: h */
    private C26846a f66095h;

    /* renamed from: i */
    private int f66096i;
    public RecyclerView mRecyclerView;
    public DmtStatusView mStatusView;
    public TextTitleBar mTitleBar;
    public LinearLayout mTitleLayout;

    /* renamed from: d */
    public final C26840g mo48219d() {
        return this.f66088a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract C26840g mo50934f();

    /* renamed from: g */
    private void m60749g() {
        m60750h();
        m60752j();
        m60751i();
    }

    /* renamed from: k */
    private void m60753k() {
        if (this.mStatusView != null) {
            this.mStatusView.mo19209d();
        }
    }

    /* renamed from: a */
    public final void mo48214a() {
        if (this.f66088a != null) {
            this.f66088a.am_();
        }
    }

    /* renamed from: e */
    public final void mo50933e() {
        if (this.mStatusView != null) {
            this.mStatusView.mo19212f();
        }
    }

    /* renamed from: h */
    private void m60750h() {
        this.mTitleBar.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: b */
            public final void mo19167b(View view) {
            }

            /* renamed from: a */
            public final void mo19166a(View view) {
                if (BaseMusicListView.this.f66089b != null) {
                    BaseMusicListView.this.f66089b.mo50730r();
                }
            }
        });
        this.mTitleBar.setColorMode(0);
    }

    /* renamed from: b */
    public final void mo48216b() {
        if (this.mStatusView != null) {
            this.mStatusView.mo19214h();
        }
        if (this.f66088a != null) {
            this.f66088a.mo50303a(null);
        }
    }

    /* renamed from: i */
    private void m60751i() {
        this.f66088a = mo50934f();
        this.f66088a.f70682s = this.mRecyclerView.getResources().getColor(R.color.jl);
        this.f66088a.mo54788a(this.f66095h);
        this.mRecyclerView.setAdapter(this.f66088a);
        this.mRecyclerView.setLayoutManager(new WrapLinearLayoutManager(this.f66094g, 1, false));
    }

    /* renamed from: j */
    private void m60752j() {
        C10719a c = C10719a.m21676a(this.f66094g).mo19227a(R.string.f5o, R.string.f5k, R.string.f5u, new C24980a(this)).mo19233c(0);
        if (this.f66096i != 0) {
            c.mo19224a(this.f66096i);
        }
        this.mStatusView.setBuilder(c);
        mo50933e();
    }

    /* renamed from: c */
    public void mo48218c() {
        if (this.f66088a.f70699x) {
            this.f66088a.mo54798c(false);
            this.f66088a.mo50303a(null);
            this.f66088a.an_();
        }
        if (this.mStatusView != null) {
            this.mStatusView.mo19213g();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo50931a(View view) {
        m60753k();
        if (this.f66089b != null) {
            this.f66089b.mo50729q();
        }
    }

    /* renamed from: b */
    public final void mo48217b(List<T> list, boolean z) {
        if (this.f66088a != null) {
            this.f66092e = z;
            if (!z) {
                this.f66088a.mo54798c(false);
            } else {
                this.f66088a.ao_();
            }
            if (!C9376b.m18558a((Collection<T>) list)) {
                this.f66088a.mo50304b(list);
            }
        }
    }

    /* renamed from: a */
    public final void mo50932a(C24997a aVar, int i) {
        new C24995p(aVar, 10).mo50986a(this.mRecyclerView);
    }

    /* renamed from: a */
    public void mo48215a(List<T> list, boolean z) {
        m60753k();
        if (this.f66088a != null) {
            if (C9376b.m18558a((Collection<T>) list)) {
                mo48218c();
                return;
            }
            this.f66088a.mo54798c(true);
            this.f66092e = z;
            if (!z) {
                this.f66088a.mo54798c(false);
            } else {
                this.f66088a.ao_();
            }
            this.f66088a.mo50303a(list);
        }
    }

    BaseMusicListView(Context context, View view, C24832a aVar, int i, C26846a aVar2, C37306l<C24806c> lVar, int i2) {
        m60748a(context, view, aVar, i, aVar2, lVar, i2);
    }

    /* renamed from: a */
    private void m60748a(Context context, View view, C24832a aVar, int i, C26846a aVar2, C37306l<C24806c> lVar, int i2) {
        ButterKnife.bind((Object) this, view);
        this.f66094g = context;
        this.f66089b = aVar;
        this.f66095h = aVar2;
        this.f66090c = lVar;
        this.f66096i = i;
        this.f66091d = i2;
        m60749g();
    }

    BaseMusicListView(Context context, View view, C24832a aVar, int i, C26846a aVar2, C37306l<C24806c> lVar, int i2, boolean z) {
        this.f66093f = z;
        m60748a(context, view, aVar, i, aVar2, lVar, i2);
    }
}
