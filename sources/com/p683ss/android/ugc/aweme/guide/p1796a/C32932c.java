package com.p683ss.android.ugc.aweme.guide.p1796a;

import android.app.Activity;
import android.content.Context;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.share.improve.p2162b.C42132a;
import com.p683ss.android.ugc.aweme.share.improve.p2164d.C42162b;
import com.p683ss.android.ugc.aweme.share.improve.p2165e.C42167a;
import com.p683ss.android.ugc.aweme.sharer.C42254a;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42261d;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42271i;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42301x;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42309a;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d.C42350b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage.C42326a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import p064c.p065a.p071d.C1710e;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.guide.a.c */
public final class C32932c extends PopupWindow {

    /* renamed from: d */
    public static final C32935a f85592d = new C32935a(null);

    /* renamed from: a */
    public final Activity f85593a;

    /* renamed from: b */
    public final View f85594b;

    /* renamed from: c */
    public C1710e<Boolean> f85595c;

    /* renamed from: com.ss.android.ugc.aweme.guide.a.c$a */
    public static final class C32935a {
        private C32935a() {
        }

        public /* synthetic */ C32935a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.guide.a.c$b */
    public static final class C32936b implements C42309a {

        /* renamed from: a */
        final /* synthetic */ C32932c f85598a;

        /* renamed from: a */
        public final Activity mo60818a() {
            return this.f85598a.f85593a;
        }

        C32936b(C32932c cVar) {
            this.f85598a = cVar;
        }
    }

    public C32932c(Activity activity, View view, C1710e<Boolean> eVar) {
        boolean z;
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(view, "anchor");
        this.f85593a = activity;
        this.f85594b = view;
        this.f85595c = eVar;
        List list = null;
        View inflate = LayoutInflater.from(this.f85593a).inflate(R.layout.bup, null);
        setContentView(inflate);
        inflate.measure(0, 0);
        C52711k.m112236a((Object) inflate, C42311c.f106865i);
        setWidth(inflate.getMeasuredWidth());
        setHeight(inflate.getMeasuredHeight());
        setBackgroundDrawable(C0726c.m2091a((Context) this.f85593a, (int) R.drawable.dhm));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.evl);
        Iterable iterable = C42162b.m92530a(new C42350b(), false, this.f85593a).mo86269b((Comparator<C42307b>) new C42167a<C42307b>(0)).mo86259a(new SharePackage(new C42326a().mo86236a("aweme"))).mo86266a().f106945a;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!C52575l.m112099b((Object[]) new String[]{"chat_merge", "copy", "more", "whatsapp_status"}).contains(((C42307b) next).mo86136b())) {
                arrayList.add(next);
            }
        }
        Iterable iterable2 = (List) arrayList;
        Collection arrayList2 = new ArrayList();
        for (Object next2 : iterable2) {
            if (((C42307b) next2).mo86141a(this.f85593a)) {
                arrayList2.add(next2);
            }
        }
        List e = C52575l.m112139e((Collection<? extends T>) C52575l.m112129b((Iterable<? extends T>) (List) arrayList2, 3));
        e.add(new C42132a());
        if (e.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            list = e;
        }
        if (list == null) {
            list = C52575l.m112099b((Object[]) new C42254a[]{new C42301x(), new C42261d(new C32936b(this)), new C42271i(), new C42132a()});
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f85593a, 0, false);
        C52711k.m112236a((Object) recyclerView, "this");
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new C32931b(this.f85593a, list));
        getContentView().setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C32932c f85596a;

            {
                this.f85596a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C1710e<Boolean> eVar = this.f85596a.f85595c;
                if (eVar != null) {
                    eVar.accept(Boolean.valueOf(true));
                }
                this.f85596a.f85595c = null;
                this.f85596a.dismiss();
            }
        });
        setOnDismissListener(new OnDismissListener(this) {

            /* renamed from: a */
            final /* synthetic */ C32932c f85597a;

            {
                this.f85597a = r1;
            }

            public final void onDismiss() {
                C1710e<Boolean> eVar = this.f85597a.f85595c;
                if (eVar != null) {
                    eVar.accept(Boolean.valueOf(false));
                }
            }
        });
        setAnimationStyle(R.style.a8c);
        setOutsideTouchable(true);
    }
}
