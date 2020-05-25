package com.p683ss.android.ugc.aweme.commercialize.views.bottomdialog;

import android.graphics.Color;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.commercialize.model.C26106aa;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.c */
public final class C26663c extends C1322a<C26677e> {

    /* renamed from: e */
    public static final C26665b f70264e = new C26665b(null);

    /* renamed from: a */
    public int f70265a = -1;

    /* renamed from: b */
    public C26664a f70266b;

    /* renamed from: c */
    public final List<C26106aa> f70267c;

    /* renamed from: d */
    public final boolean f70268d;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.c$a */
    public interface C26664a {
        /* renamed from: a */
        void mo54489a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.c$b */
    public static final class C26665b {
        private C26665b() {
        }

        public /* synthetic */ C26665b(C52707g gVar) {
            this();
        }
    }

    public final int getItemCount() {
        return this.f70267c.size();
    }

    /* renamed from: a */
    public final void mo54488a(int i) {
        if (this.f70265a != i) {
            if (this.f70265a != -1) {
                notifyItemChanged(this.f70265a);
            }
            this.f70265a = i;
            notifyItemChanged(i);
            C26664a aVar = this.f70266b;
            if (aVar != null) {
                aVar.mo54489a(i);
            }
        } else {
            this.f70265a = -1;
            notifyItemChanged(i);
            C26664a aVar2 = this.f70266b;
            if (aVar2 != null) {
                aVar2.mo54489a(-1);
            }
        }
    }

    public C26663c(List<C26106aa> list, boolean z) {
        C52711k.m112240b(list, "dataList");
        this.f70267c = list;
        this.f70268d = z;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bis, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…st_picker, parent, false)");
        return new C26677e(inflate);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        boolean z;
        String str;
        C26677e eVar = (C26677e) vVar;
        C52711k.m112240b(eVar, "holder");
        boolean z2 = this.f70268d;
        C52711k.m112240b(this, "adapter");
        C26106aa aaVar = (C26106aa) this.f70267c.get(i);
        int i2 = 0;
        if (i == this.f70265a) {
            z = true;
        } else {
            z = false;
        }
        if (z2) {
            FrameLayout a = eVar.mo54494a();
            if (a != null) {
                a.setVisibility(0);
                DmtTextView dmtTextView = (DmtTextView) a.findViewById(R.id.ew2);
                if (dmtTextView != null) {
                    dmtTextView.setText(aaVar.f68911a);
                }
                ImageView imageView = (ImageView) a.findViewById(R.id.ew0);
                if (imageView != null) {
                    if (!z) {
                        i2 = 4;
                    }
                    imageView.setVisibility(i2);
                }
            }
            LinearLayout b = eVar.mo54495b();
            if (b != null) {
                b.setVisibility(8);
            }
        } else {
            FrameLayout a2 = eVar.mo54494a();
            if (a2 != null) {
                a2.setVisibility(8);
            }
            LinearLayout b2 = eVar.mo54495b();
            if (b2 != null) {
                b2.setVisibility(0);
                DmtTextView dmtTextView2 = (DmtTextView) b2.findViewById(R.id.em1);
                if (dmtTextView2 != null) {
                    dmtTextView2.setText(aaVar.f68911a);
                    if (z) {
                        str = "#fe2c55";
                    } else {
                        str = "#e6161823";
                    }
                    dmtTextView2.setTextColor(Color.parseColor(str));
                }
            }
        }
        eVar.itemView.setOnClickListener(new C26679b(this, i));
    }
}
