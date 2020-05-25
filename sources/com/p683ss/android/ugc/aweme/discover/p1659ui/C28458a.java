package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.Xfermode;
import android.os.Looper;
import android.os.Message;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.C1440au;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1327f;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1338k;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.discover.adapter.C27890f;
import com.p683ss.android.ugc.aweme.discover.adapter.C27900g;
import com.p683ss.android.ugc.aweme.discover.helper.C28201i;
import com.p683ss.android.ugc.aweme.discover.model.BarrageBean;
import com.p683ss.android.ugc.aweme.discover.viewmodel.BarrageViewModel;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52722v.C52725c;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.a */
public final class C28458a implements C0199s<String>, C9382a {

    /* renamed from: a */
    public List<BarrageBean> f74847a = new ArrayList();

    /* renamed from: b */
    public List<BarrageBean> f74848b = new ArrayList();

    /* renamed from: c */
    public C27890f f74849c;

    /* renamed from: d */
    public BarrageRecyclerView f74850d;

    /* renamed from: e */
    public BarrageViewModel f74851e;

    /* renamed from: f */
    public C9381g f74852f;

    /* renamed from: g */
    public boolean f74853g;

    /* renamed from: h */
    public boolean f74854h = true;

    /* renamed from: i */
    public boolean f74855i;

    /* renamed from: j */
    public String f74856j = "";

    /* renamed from: k */
    public boolean f74857k;

    /* renamed from: l */
    public boolean f74858l;

    /* renamed from: m */
    public C52682m<? super BarrageRecyclerView, ? super Integer, C52860x> f74859m = C28466d.f74868a;

    /* renamed from: n */
    public final View f74860n;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$a */
    public static final class C28462a extends C1340m {

        /* renamed from: a */
        final /* synthetic */ C28458a f74863a;

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$a$a */
        static final class C28463a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C28462a f74864a;

            /* renamed from: b */
            final /* synthetic */ C52725c f74865b;

            C28463a(C28462a aVar, C52725c cVar) {
                this.f74864a = aVar;
                this.f74865b = cVar;
            }

            public final void run() {
                int size = this.f74864a.f74863a.f74848b.size() - 1;
                if (size > 0) {
                    int i = 1;
                    while (true) {
                        this.f74864a.f74863a.f74849c.f73261b.remove(this.f74865b.element);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
                this.f74864a.f74863a.f74849c.notifyItemRangeRemoved(this.f74865b.element, this.f74864a.f74863a.f74848b.size() - 1);
                this.f74864a.f74863a.f74849c.notifyItemRangeChanged(this.f74865b.element, this.f74864a.f74863a.f74849c.f73261b.size() - 1);
            }
        }

        C28462a(C28458a aVar) {
            this.f74863a = aVar;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C52711k.m112240b(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            C1332i layoutManager = this.f74863a.f74850d.getLayoutManager();
            if (layoutManager != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int j = linearLayoutManager.mo4749j();
                linearLayoutManager.mo4750k();
                int l = linearLayoutManager.mo4751l();
                this.f74863a.f74859m.invoke(this.f74863a.f74850d, Integer.valueOf(j));
                if (j > 0 && i2 > 0 && this.f74863a.f74849c.f73261b.size() >= this.f74863a.f74848b.size() * 2 && ((BarrageBean) this.f74863a.f74849c.f73261b.get(l)).f74681id == 0) {
                    C52725c cVar = new C52725c();
                    cVar.element = 0;
                    this.f74863a.f74850d.post(new C28463a(this, cVar));
                }
                if (this.f74863a.f74849c.f73261b.size() - 1 == linearLayoutManager.mo4752m() && this.f74863a.f74850d.getScrollState() != 1) {
                    C28458a aVar = this.f74863a;
                    if (aVar.f74849c.f73261b.size() != 0) {
                        aVar.f74850d.post(new C28464b(aVar));
                    }
                    this.f74863a.mo58125a(0, false, true);
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$b */
    static final class C28464b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C28458a f74866a;

        C28464b(C28458a aVar) {
            this.f74866a = aVar;
        }

        public final void run() {
            int i;
            int i2 = ((BarrageBean) this.f74866a.f74849c.f73261b.get(this.f74866a.f74849c.f73261b.size() - 1)).f74681id;
            if (i2 == this.f74866a.f74848b.size() - 1) {
                i = this.f74866a.f74854h;
                this.f74866a.f74853g = true;
                this.f74866a.f74858l = true;
            } else {
                i = i2 + 1;
            }
            if (i < this.f74866a.f74848b.size()) {
                this.f74866a.f74849c.f73261b.add(this.f74866a.f74848b.get(i));
                this.f74866a.f74849c.notifyItemInserted(this.f74866a.f74849c.f73261b.size() - 1);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$c */
    static final class C28465c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C28458a f74867a;

        C28465c(C28458a aVar) {
            this.f74867a = aVar;
        }

        public final void run() {
            this.f74867a.f74850d.mo4833d(Integer.MAX_VALUE);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$d */
    static final class C28466d extends C52712l implements C52682m<BarrageRecyclerView, Integer, C52860x> {

        /* renamed from: a */
        public static final C28466d f74868a = new C28466d();

        C28466d() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            BarrageRecyclerView barrageRecyclerView = (BarrageRecyclerView) obj;
            ((Number) obj2).intValue();
            C52711k.m112240b(barrageRecyclerView, "rv");
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$e */
    static final class C28467e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C28458a f74869a;

        C28467e(C28458a aVar) {
            this.f74869a = aVar;
        }

        public final void run() {
            C1332i layoutManager = this.f74869a.f74850d.getLayoutManager();
            if (layoutManager != null) {
                ((LinearLayoutManager) layoutManager).mo4721a(0, 0);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$f */
    static final class C28468f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C28458a f74870a;

        C28468f(C28458a aVar) {
            this.f74870a = aVar;
        }

        public final void run() {
            C1332i layoutManager = this.f74870a.f74850d.getLayoutManager();
            if (layoutManager != null) {
                ((LinearLayoutManager) layoutManager).mo4721a(0, 0);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        }
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
    }

    /* renamed from: c */
    private void m67581c() {
        this.f74852f.removeMessages(0, this.f74856j);
    }

    /* renamed from: b */
    public final void mo58129b() {
        this.f74855i = false;
        m67581c();
        this.f74850d.mo4848f();
    }

    /* renamed from: a */
    public final void mo58124a() {
        this.f74850d.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo58126a(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f74856j = str;
    }

    /* renamed from: a */
    public final void mo58127a(List<BarrageBean> list) {
        C52711k.m112240b(list, "data");
        this.f74853g = false;
        this.f74850d.f74714O = false;
        this.f74854h = true;
        this.f74857k = false;
        this.f74858l = false;
        LayoutParams layoutParams = this.f74850d.getLayoutParams();
        if (!C28201i.m67098b()) {
            C28201i iVar = C28201i.f74032a;
            Context context = this.f74860n.getContext();
            C52711k.m112236a((Object) context, "itemView.context");
            layoutParams.width = iVar.mo56615a(context);
        }
        layoutParams.height = -2;
        this.f74850d.setLayoutParams(layoutParams);
        this.f74848b = list;
        this.f74847a.clear();
        this.f74847a.add(this.f74848b.get(0));
        this.f74849c.mo56304a(this.f74847a);
        this.f74849c.notifyDataSetChanged();
        this.f74850d.post(new C28468f(this));
    }

    public final void handleMsg(Message message) {
        int i;
        if (message != null && message.what == 0 && TextUtils.equals(this.f74856j, message.obj.toString())) {
            this.f74857k = true;
            if (!this.f74850d.canScrollVertically(1) && message.arg1 == 0 && this.f74849c.f73261b.size() != 0) {
                int i2 = ((BarrageBean) this.f74849c.f73261b.get(this.f74849c.f73261b.size() - 1)).f74681id;
                if (i2 == this.f74848b.size() - 1) {
                    i = this.f74854h;
                    this.f74853g = true;
                } else {
                    i = i2 + 1;
                }
                if (i < this.f74848b.size()) {
                    this.f74849c.f73261b.add(this.f74848b.get(i));
                    this.f74849c.notifyItemInserted(this.f74849c.f73261b.size() - 1);
                    this.f74850d.post(new C28465c(this));
                }
            }
            this.f74850d.mo4833d(Integer.MAX_VALUE);
        }
    }

    public C28458a(View view) {
        C52711k.m112240b(view, "itemView");
        this.f74860n = view;
        View view2 = this.f74860n;
        if (view2 != null) {
            this.f74850d = (BarrageRecyclerView) view2;
            this.f74850d.setOnFlingListener(new C1338k() {
                /* renamed from: a */
                public final boolean mo5078a(int i, int i2) {
                    return true;
                }
            });
            this.f74849c = new C27890f();
            this.f74849c.f73262c = new C27900g(this) {

                /* renamed from: a */
                final /* synthetic */ C28458a f74861a;

                /* renamed from: a */
                public final void mo56308a() {
                    C28458a.m67579a(this.f74861a, 0, false, false, 6, null);
                }

                {
                    this.f74861a = r1;
                }

                /* renamed from: a */
                public final void mo56309a(String str) {
                    C52711k.m112240b(str, "cid");
                    BarrageViewModel barrageViewModel = this.f74861a.f74851e;
                    if (barrageViewModel != null) {
                        C52711k.m112240b(str, "cid");
                        barrageViewModel.f75755a.setValue(str);
                    }
                }
            };
            this.f74852f = new C9381g(Looper.getMainLooper(), this);
            Activity d = C23729p.m58270d(this.f74860n);
            if (d != null) {
                this.f74851e = (BarrageViewModel) C0214z.m440a((FragmentActivity) d).mo359a(BarrageViewModel.class);
                this.f74849c.f73260a = false;
                this.f74850d.setOnActionMoveCallback(new C28514av(this) {

                    /* renamed from: a */
                    final /* synthetic */ C28458a f74862a;

                    {
                        this.f74862a = r1;
                    }

                    /* renamed from: a */
                    public final void mo58130a(Long l) {
                        C28458a aVar = this.f74862a;
                        C52711k.m112236a((Object) l, "v");
                        C28458a.m67579a(aVar, l.longValue(), false, false, 4, null);
                    }
                });
                this.f74850d.setAdapter(this.f74849c);
                ScollLinearLayoutManager scollLinearLayoutManager = new ScollLinearLayoutManager(this.f74850d.getContext());
                scollLinearLayoutManager.mo4731b(1);
                scollLinearLayoutManager.f74806a = (1000.0f / C9432q.m18687b(this.f74860n.getContext(), 15.0f)) * scollLinearLayoutManager.f74808c.getResources().getDisplayMetrics().density;
                this.f74850d.setLayoutManager(scollLinearLayoutManager);
                BarrageRecyclerView barrageRecyclerView = this.f74850d;
                barrageRecyclerView.f74717R = new Paint();
                barrageRecyclerView.f74718S = new Paint();
                PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(Mode.DST_IN);
                PorterDuffXfermode porterDuffXfermode2 = new PorterDuffXfermode(Mode.DST_IN);
                barrageRecyclerView.f74717R.setXfermode(porterDuffXfermode);
                barrageRecyclerView.f74718S.setXfermode(porterDuffXfermode2);
                float b = C9432q.m18687b(barrageRecyclerView.getContext(), 8.0f);
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, b, new int[]{0, -16777216}, null, TileMode.CLAMP);
                barrageRecyclerView.f74720U = linearGradient;
                barrageRecyclerView.mo4798a((C1331h) new C1331h(porterDuffXfermode, porterDuffXfermode2, b) {

                    /* renamed from: a */
                    final /* synthetic */ Xfermode f74721a;

                    /* renamed from: b */
                    final /* synthetic */ Xfermode f74722b;

                    /* renamed from: c */
                    final /* synthetic */ float f74723c;

                    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
                        super.onDraw(canvas, recyclerView, sVar);
                        BarrageRecyclerView.this.f74719T = canvas.saveLayer(0.0f, 0.0f, (float) recyclerView.getWidth(), (float) recyclerView.getHeight(), null, 31);
                    }

                    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
                        super.onDrawOver(canvas, recyclerView, sVar);
                        BarrageRecyclerView.this.f74717R.setXfermode(this.f74721a);
                        BarrageRecyclerView.this.f74717R.setShader(BarrageRecyclerView.this.f74720U);
                        BarrageRecyclerView.this.f74718S.setXfermode(this.f74722b);
                        Paint paint = BarrageRecyclerView.this.f74718S;
                        LinearGradient linearGradient = new LinearGradient(0.0f, (float) recyclerView.getHeight(), 0.0f, ((float) recyclerView.getHeight()) - this.f74723c, new int[]{0, -16777216}, null, TileMode.CLAMP);
                        paint.setShader(linearGradient);
                        canvas.drawRect(0.0f, 0.0f, (float) recyclerView.getRight(), 50.0f, BarrageRecyclerView.this.f74717R);
                        canvas.drawRect(0.0f, ((float) recyclerView.getHeight()) - this.f74723c, (float) recyclerView.getRight(), (float) recyclerView.getHeight(), BarrageRecyclerView.this.f74718S);
                        BarrageRecyclerView.this.f74717R.setXfermode(null);
                        BarrageRecyclerView.this.f74718S.setXfermode(null);
                        canvas.restoreToCount(BarrageRecyclerView.this.f74719T);
                    }

                    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
                        super.getItemOffsets(rect, view, recyclerView, sVar);
                    }

                    {
                        this.f74721a = r2;
                        this.f74722b = r3;
                        this.f74723c = r4;
                    }
                });
                C1327f itemAnimator = this.f74850d.getItemAnimator();
                if (itemAnimator != null) {
                    ((C1440au) itemAnimator).f5184m = false;
                    this.f74850d.setNestedScrollingEnabled(false);
                    this.f74850d.setOnScrollListener(new C28462a(this));
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.SimpleItemAnimator");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.BarrageRecyclerView");
    }

    /* renamed from: a */
    public final void mo58128a(List<BarrageBean> list, int i) {
        int i2;
        C52711k.m112240b(list, "data");
        int i3 = 0;
        this.f74853g = false;
        this.f74850d.f74714O = false;
        this.f74854h = true;
        this.f74857k = false;
        this.f74858l = false;
        LayoutParams layoutParams = this.f74850d.getLayoutParams();
        if (!C28201i.m67098b()) {
            C28201i iVar = C28201i.f74032a;
            Context context = this.f74860n.getContext();
            C52711k.m112236a((Object) context, "itemView.context");
            layoutParams.width = iVar.mo56615a(context);
        }
        C28201i iVar2 = C28201i.f74032a;
        Context context2 = this.f74860n.getContext();
        C52711k.m112236a((Object) context2, "itemView.context");
        C52711k.m112240b(context2, "context");
        if (C28201i.m67098b()) {
            i2 = C28201i.m67095a(context2, 130);
        } else {
            i2 = C28201i.m67095a(context2, NormalGiftView.MASK_TRANSLATE_VALUE);
        }
        layoutParams.height = i2;
        this.f74850d.setLayoutParams(layoutParams);
        this.f74848b = list;
        this.f74847a.clear();
        int i4 = i - 1;
        if (i4 >= 0) {
            while (true) {
                this.f74847a.add(this.f74848b.get(i3));
                if (i3 == i4) {
                    break;
                }
                i3++;
            }
        }
        this.f74849c.mo56304a(this.f74847a);
        this.f74849c.notifyDataSetChanged();
        this.f74850d.post(new C28467e(this));
    }

    /* renamed from: a */
    public final void mo58125a(long j, boolean z, boolean z2) {
        if (!this.f74855i || !z) {
            this.f74855i = true;
            m67581c();
            Message obtain = Message.obtain();
            obtain.what = 0;
            obtain.obj = this.f74856j;
            if (z2) {
                obtain.arg1 = 1;
            } else {
                obtain.arg1 = 0;
            }
            this.f74852f.sendMessageDelayed(obtain, j);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m67579a(C28458a aVar, long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 3000;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        aVar.mo58125a(j, z, false);
    }
}
