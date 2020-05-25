package com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.p1347b;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.anchor.C22678i;
import com.p683ss.android.ugc.aweme.anchor.api.model.AnchorCell;
import com.p683ss.android.ugc.aweme.anchor.api.model.C22598a;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.C22601a;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.C22601a.C22602a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.anchor.b.a.b.d */
public final class C22624d extends C22601a<C22598a, C22626b> {

    /* renamed from: d */
    public static final C22625a f60781d = new C22625a(null);

    /* renamed from: com.ss.android.ugc.aweme.anchor.b.a.b.d$a */
    public static final class C22625a {
        private C22625a() {
        }

        public /* synthetic */ C22625a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.b.a.b.d$b */
    public final class C22626b extends C22602a {

        /* renamed from: b */
        final TextView f60782b;

        /* renamed from: c */
        final TextView f60783c;

        /* renamed from: d */
        final /* synthetic */ C22624d f60784d;

        /* renamed from: com.ss.android.ugc.aweme.anchor.b.a.b.d$b$a */
        static final class C22627a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C22626b f60785a;

            /* renamed from: b */
            final /* synthetic */ C22598a f60786b;

            C22627a(C22626b bVar, C22598a aVar) {
                this.f60785a = bVar;
                this.f60786b = aVar;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C22678i iVar = this.f60785a.f60784d.f60755b;
                if (iVar != null) {
                    iVar.mo46966a(this.f60786b.f60751e);
                }
            }
        }

        public C22626b(C22624d dVar, View view) {
            C52711k.m112240b(view, "itemView");
            this.f60784d = dVar;
            super(dVar, view);
            this.f60782b = (TextView) view.findViewById(R.id.f5i);
            this.f60783c = (TextView) view.findViewById(R.id.f5k);
        }
    }

    public C22624d(C22678i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C1352v mo14349a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "parent");
        View inflate = layoutInflater.inflate(R.layout.bhj, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…ently_add, parent, false)");
        return new C22626b(this, inflate);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14350a(C1352v vVar, Object obj) {
        CharSequence charSequence;
        int i;
        C22626b bVar = (C22626b) vVar;
        C22598a aVar = (C22598a) obj;
        C52711k.m112240b(bVar, "holder");
        C52711k.m112240b(aVar, "module");
        C52711k.m112240b(aVar, "module");
        TextView textView = bVar.f60783c;
        if (TextUtils.isEmpty(aVar.f60749c)) {
            charSequence = textView.getContext().getString(R.string.fwy);
        } else {
            charSequence = aVar.f60749c;
        }
        textView.setText(charSequence);
        TextView textView2 = bVar.f60782b;
        ArrayList<AnchorCell> arrayList = aVar.f60751e;
        int i2 = 0;
        if (arrayList != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        if (i <= 3) {
            i2 = 4;
        }
        textView2.setVisibility(i2);
        textView2.setOnClickListener(new C22627a(bVar, aVar));
    }
}
