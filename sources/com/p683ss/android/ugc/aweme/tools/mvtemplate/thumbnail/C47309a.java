package com.p683ss.android.ugc.aweme.tools.mvtemplate.thumbnail;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.C47224a;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.a */
public final class C47309a extends C1322a<C47311b> {

    /* renamed from: f */
    public static final C47310a f119412f = new C47310a(null);

    /* renamed from: a */
    public final List<MvThemeData> f119413a = new ArrayList();

    /* renamed from: b */
    public C47224a f119414b;

    /* renamed from: c */
    public C47312c f119415c;

    /* renamed from: d */
    public boolean f119416d = true;

    /* renamed from: e */
    public boolean f119417e = true;

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.a$a */
    public static final class C47310a {
        private C47310a() {
        }

        public /* synthetic */ C47310a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.a$b */
    public static final class C47311b extends C1352v {

        /* renamed from: a */
        public final SimpleDraweeView f119418a;

        /* renamed from: b */
        public final View f119419b;

        public C47311b(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.azi);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.iv_content)");
            this.f119418a = (SimpleDraweeView) findViewById;
            View findViewById2 = view.findViewById(R.id.bhy);
            C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.loading_view)");
            this.f119419b = findViewById2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.a$c */
    public interface C47312c {
        /* renamed from: a */
        void mo94539a(int i, View view);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.a$d */
    static final class C47313d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47312c f119420a;

        /* renamed from: b */
        final /* synthetic */ C47311b f119421b;

        /* renamed from: c */
        final /* synthetic */ int f119422c;

        C47313d(C47312c cVar, C47311b bVar, int i) {
            this.f119420a = cVar;
            this.f119421b = bVar;
            this.f119422c = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C47312c cVar = this.f119420a;
            int i = this.f119422c - 1;
            C52711k.m112236a((Object) view, "it");
            cVar.mo94539a(i, view);
        }
    }

    public final int getItemCount() {
        return this.f119413a.size() + 2;
    }

    public final int getItemViewType(int i) {
        if (i == 0 || i == getItemCount() - 1) {
            return 0;
        }
        return 1;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.xj, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…toom_lidt, parent, false)");
        return new C47311b(inflate);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C47311b bVar = (C47311b) vVar;
        C52711k.m112240b(bVar, "holder");
        if (this.f119416d && getItemCount() - i <= 5) {
            C47224a aVar = this.f119414b;
            if (aVar != null) {
                aVar.mo94495a();
            }
        }
        int i2 = 0;
        if (i == 0) {
            Context context = bVar.f119418a.getContext();
            C52711k.m112236a((Object) context, "context");
            LayoutParams layoutParams = new LayoutParams((C43303dy.m94971b(context) / 2) - (C47314b.m102688a(context) / 2), 0);
            View view = bVar.itemView;
            C52711k.m112236a((Object) view, "holder.itemView");
            view.setLayoutParams(layoutParams);
        } else if (i == getItemCount() - 1) {
            Context context2 = bVar.f119418a.getContext();
            C52711k.m112236a((Object) context2, "context");
            LayoutParams layoutParams2 = new LayoutParams((C43303dy.m94971b(context2) / 2) - (C47314b.m102688a(context2) / 2), -1);
            View view2 = bVar.itemView;
            C52711k.m112236a((Object) view2, "holder.itemView");
            view2.setLayoutParams(layoutParams2);
            bVar.f119418a.setVisibility(8);
            View view3 = bVar.f119419b;
            if (!this.f119417e) {
                i2 = 8;
            }
            view3.setVisibility(i2);
        } else {
            bVar.f119418a.setImageURI(((MvThemeData) this.f119413a.get(i - 1)).mo94480g());
            C47312c cVar = this.f119415c;
            if (cVar != null) {
                bVar.f119418a.setOnClickListener(new C47313d(cVar, bVar, i));
            }
        }
    }
}
