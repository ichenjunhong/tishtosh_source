package com.p683ss.android.ugc.aweme.sticker.panel.newpanel;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import com.bytedance.common.utility.C9432q;
import java.util.LinkedList;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.k */
public final class C46249k {

    /* renamed from: i */
    public static float f116686i = 0.04f;

    /* renamed from: j */
    public static final C46250a f116687j = new C46250a(null);

    /* renamed from: a */
    public boolean f116688a;

    /* renamed from: b */
    boolean f116689b = true;

    /* renamed from: c */
    float f116690c;

    /* renamed from: d */
    final LinkedList<C46247i> f116691d = new LinkedList<>();

    /* renamed from: e */
    final C46251b f116692e = new C46251b(this);

    /* renamed from: f */
    final Context f116693f;

    /* renamed from: g */
    final RecyclerView f116694g;

    /* renamed from: h */
    final int f116695h = 112;

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.k$a */
    public static final class C46250a {
        private C46250a() {
        }

        /* renamed from: a */
        public static float m100430a() {
            if (C46249k.f116686i <= 0.0f) {
                C46249k.f116686i = 0.04f;
            }
            return C46249k.f116686i;
        }

        public /* synthetic */ C46250a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.k$b */
    public static final class C46251b extends C1340m {

        /* renamed from: a */
        final /* synthetic */ C46249k f116696a;

        C46251b(C46249k kVar) {
            this.f116696a = kVar;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            if (i == 0) {
                this.f116696a.mo92949a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.k$c */
    static final class C46252c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C46249k f116697a;

        C46252c(C46249k kVar) {
            this.f116697a = kVar;
        }

        public final void run() {
            this.f116697a.mo92949a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.k$d */
    static final class C46253d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C46249k f116698a;

        C46253d(C46249k kVar) {
            this.f116698a = kVar;
        }

        public final void run() {
            this.f116698a.mo92949a();
        }
    }

    /* renamed from: b */
    private final void m100428b() {
        if (this.f116690c > 0.0f) {
            f116686i = this.f116690c;
        }
    }

    /* renamed from: a */
    public final void mo92949a() {
        if (!this.f116691d.isEmpty()) {
            C46247i iVar = (C46247i) this.f116691d.poll();
            int i = iVar.f116682a;
            int i2 = iVar.f116683b;
            if (1 == i) {
                this.f116694g.mo4814b(i2);
                this.f116694g.post(new C46252c(this));
            } else if (i == 0) {
                this.f116694g.mo4833d(i2);
            } else {
                if (2 == i) {
                    float b = C9432q.m18687b(this.f116693f, 8.0f);
                    C1332i layoutManager = this.f116694g.getLayoutManager();
                    if (!(layoutManager instanceof LinearLayoutManager)) {
                        layoutManager = null;
                    }
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    if (linearLayoutManager != null) {
                        linearLayoutManager.mo4721a(i2, (int) b);
                    }
                    this.f116694g.post(new C46253d(this));
                }
            }
        } else {
            this.f116694g.mo4818b((C1340m) this.f116692e);
            this.f116688a = false;
            m100428b();
        }
    }

    public C46249k(Context context, RecyclerView recyclerView, int i) {
        C52711k.m112240b(context, "mHost");
        C52711k.m112240b(recyclerView, "mScrollerList");
        this.f116693f = context;
        this.f116694g = recyclerView;
    }
}
