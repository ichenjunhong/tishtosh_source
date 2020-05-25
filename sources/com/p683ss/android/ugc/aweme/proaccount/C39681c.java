package com.p683ss.android.ugc.aweme.proaccount;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ttve.utils.C20141b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52725c;

/* renamed from: com.ss.android.ugc.aweme.proaccount.c */
public final class C39681c extends C1322a<C39682a> {

    /* renamed from: e */
    public static final C39683b f101273e = new C39683b(null);

    /* renamed from: a */
    public C39684c f101274a;

    /* renamed from: b */
    public List<Boolean> f101275b = new ArrayList();

    /* renamed from: c */
    public int f101276c = -1;

    /* renamed from: d */
    public final List<C39675a> f101277d;

    /* renamed from: f */
    private final Context f101278f;

    /* renamed from: com.ss.android.ugc.aweme.proaccount.c$a */
    public static final class C39682a extends C1352v {

        /* renamed from: a */
        public DmtTextView f101279a;

        /* renamed from: b */
        public DmtTextView f101280b;

        /* renamed from: c */
        public DmtTextView f101281c;

        /* renamed from: d */
        public View f101282d;

        public C39682a(View view) {
            C52711k.m112240b(view, "v");
            super(view);
            View findViewById = view.findViewById(R.id.d7h);
            C52711k.m112236a((Object) findViewById, "v.findViewById(R.id.tv_category_check)");
            this.f101279a = (DmtTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.d7j);
            C52711k.m112236a((Object) findViewById2, "v.findViewById(R.id.tv_category_title)");
            this.f101280b = (DmtTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.d7i);
            C52711k.m112236a((Object) findViewById3, "v.findViewById(R.id.tv_category_desc)");
            this.f101281c = (DmtTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.a6f);
            C52711k.m112236a((Object) findViewById4, "v.findViewById(R.id.divide_line)");
            this.f101282d = findViewById4;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.c$b */
    public static final class C39683b {
        private C39683b() {
        }

        public /* synthetic */ C39683b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.c$c */
    public interface C39684c {
        /* renamed from: a */
        void mo80765a(C39675a aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.c$d */
    static final class C39685d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39681c f101283a;

        /* renamed from: b */
        final /* synthetic */ C52725c f101284b;

        /* renamed from: c */
        final /* synthetic */ int f101285c;

        C39685d(C39681c cVar, C52725c cVar2, int i) {
            this.f101283a = cVar;
            this.f101284b = cVar2;
            this.f101285c = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f101284b.element != this.f101283a.f101276c) {
                this.f101283a.f101275b.set(this.f101284b.element, Boolean.valueOf(true));
                this.f101283a.notifyItemChanged(this.f101285c);
                if (this.f101283a.f101276c != -1) {
                    this.f101283a.f101275b.set(this.f101283a.f101276c, Boolean.valueOf(false));
                    this.f101283a.notifyItemChanged(this.f101283a.f101276c + 2);
                }
                this.f101283a.f101276c = this.f101284b.element;
            }
            C39684c cVar = this.f101283a.f101274a;
            if (cVar == null) {
                C52711k.m112237a("onItemClick");
            }
            cVar.mo80765a((C39675a) this.f101283a.f101277d.get(this.f101284b.element));
        }
    }

    public final int getItemCount() {
        return this.f101277d.size() + 2;
    }

    public C39681c(Context context, List<C39675a> list) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(list, "list");
        this.f101278f = context;
        this.f101277d = list;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "p0");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.yn, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C39682a(inflate);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C39682a aVar = (C39682a) vVar;
        C52711k.m112240b(aVar, "p0");
        this.f101275b.add(Boolean.valueOf(false));
        String str = null;
        switch (i) {
            case 0:
                aVar.f101279a.setVisibility(8);
                aVar.f101281c.setVisibility(8);
                aVar.f101280b.setVisibility(0);
                aVar.f101282d.setVisibility(8);
                aVar.f101280b.setFontType(C10751d.f28903b);
                DmtTextView dmtTextView = aVar.f101280b;
                Context context = this.f101278f;
                if (context != null) {
                    Resources resources = context.getResources();
                    if (resources != null) {
                        str = resources.getString(R.string.h4_);
                    }
                }
                dmtTextView.setText(str);
                return;
            case 1:
                aVar.f101279a.setVisibility(8);
                aVar.f101281c.setVisibility(0);
                aVar.f101280b.setVisibility(8);
                aVar.f101282d.setVisibility(8);
                DmtTextView dmtTextView2 = aVar.f101281c;
                Context context2 = this.f101278f;
                if (context2 != null) {
                    Resources resources2 = context2.getResources();
                    if (resources2 != null) {
                        str = resources2.getString(R.string.h4a);
                    }
                }
                dmtTextView2.setText(str);
                return;
            default:
                String str2 = "";
                C52725c cVar = new C52725c();
                cVar.element = i - 2;
                if (cVar.element < this.f101277d.size() && cVar.element >= 0) {
                    try {
                        String str3 = ((C39675a) this.f101277d.get(cVar.element)).f101256a;
                        try {
                            m88392a(aVar, str3, cVar.element);
                        } catch (C10174a unused) {
                            str2 = str3;
                        }
                    } catch (C10174a unused2) {
                        m88392a(aVar, str2, cVar.element);
                        aVar.itemView.setOnClickListener(new C39685d(this, cVar, i));
                        return;
                    }
                    aVar.itemView.setOnClickListener(new C39685d(this, cVar, i));
                    return;
                }
                return;
        }
    }

    /* renamed from: a */
    private final void m88392a(C39682a aVar, String str, int i) {
        aVar.f101279a.setVisibility(0);
        aVar.f101281c.setVisibility(8);
        aVar.f101280b.setVisibility(8);
        aVar.f101282d.setVisibility(0);
        if (((Boolean) this.f101275b.get(i)).booleanValue()) {
            Drawable a = C0726c.m2091a(this.f101278f, (int) R.drawable.asi);
            if (a == null) {
                C52711k.m112234a();
            }
            a.setBounds(0, 0, (int) C20141b.m49696a(this.f101278f, 24.0f), (int) C20141b.m49696a(this.f101278f, 24.0f));
            aVar.f101279a.setCompoundDrawablesRelative(null, null, a, null);
            aVar.f101279a.setFontType(C10751d.f28903b);
        } else {
            Drawable a2 = C0726c.m2091a(this.f101278f, (int) R.drawable.d5_);
            if (a2 == null) {
                C52711k.m112234a();
            }
            a2.setBounds(0, 0, (int) C20141b.m49696a(this.f101278f, 24.0f), (int) C20141b.m49696a(this.f101278f, 24.0f));
            aVar.f101279a.setCompoundDrawablesRelative(null, null, a2, null);
            aVar.f101279a.setFontType(C10751d.f28902a);
        }
        aVar.f101279a.setText(str);
    }
}
