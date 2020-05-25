package com.p683ss.android.ugc.aweme.notification.newstyle.p2030g;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2021a.C38249a;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2021a.C38266h;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.g.a */
public final class C38417a extends PopupWindow {

    /* renamed from: a */
    public C38249a f97777a;

    /* renamed from: b */
    private RecyclerView f97778b;

    /* renamed from: c */
    private View f97779c;

    /* renamed from: d */
    private final Context f97780d;

    /* renamed from: e */
    private final C38266h f97781e;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.g.a$a */
    static final class C38418a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38417a f97782a;

        C38418a(C38417a aVar) {
            this.f97782a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f97782a.dismiss();
        }
    }

    public C38417a(Context context, C38266h hVar) {
        C52711k.m112240b(context, "mContext");
        C52711k.m112240b(hVar, "listener");
        super(context);
        this.f97780d = context;
        this.f97781e = hVar;
        View inflate = LayoutInflater.from(this.f97780d).inflate(R.layout.b3e, null, false);
        setContentView(inflate);
        View findViewById = inflate.findViewById(R.id.e8r);
        C52711k.m112236a((Object) findViewById, "contentView.findViewById(R.id.filter_recycler)");
        this.f97778b = (RecyclerView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.dzc);
        C52711k.m112236a((Object) findViewById2, "contentView.findViewById(R.id.blank_view)");
        this.f97779c = findViewById2;
        setWidth(-1);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(this.f97780d.getResources().getColor(R.color.a8w)));
        setFocusable(true);
        setAnimationStyle(R.style.x1);
        View view = this.f97779c;
        if (view == null) {
            C52711k.m112237a("mBlankView");
        }
        view.setOnClickListener(new C38418a(this));
        RecyclerView recyclerView = this.f97778b;
        if (recyclerView == null) {
            C52711k.m112237a("mRecyclerView");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f97780d, 1, false));
        this.f97777a = new C38249a(this.f97781e);
        C38249a aVar = this.f97777a;
        if (aVar == null) {
            C52711k.m112237a("mAdapter");
        }
        aVar.mo54798c(false);
        RecyclerView recyclerView2 = this.f97778b;
        if (recyclerView2 == null) {
            C52711k.m112237a("mRecyclerView");
        }
        C38249a aVar2 = this.f97777a;
        if (aVar2 == null) {
            C52711k.m112237a("mAdapter");
        }
        recyclerView2.setAdapter(aVar2);
    }
}
