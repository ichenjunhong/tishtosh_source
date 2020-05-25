package com.p683ss.android.ugc.aweme.favorites.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.p683ss.android.ugc.aweme.favorites.adapter.C29677g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.PoiCollectListBottomViewHolder */
public final class PoiCollectListBottomViewHolder extends JediSimpleViewHolder<C29677g> {

    /* renamed from: f */
    public static final C29759b f77728f = new C29759b(null);

    /* renamed from: g */
    private final DmtStatusView f77729g;

    /* renamed from: j */
    private final ImageView f77730j;

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.PoiCollectListBottomViewHolder$a */
    public static final class C29757a {

        /* renamed from: a */
        public final int f77731a;

        /* renamed from: b */
        public final C52670a<C52860x> f77732b;

        public C29757a() {
            this(0, null, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C29757a) {
                    C29757a aVar = (C29757a) obj;
                    if (!(this.f77731a == aVar.f77731a) || !C52711k.m112239a((Object) this.f77732b, (Object) aVar.f77732b)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = this.f77731a * 31;
            C52670a<C52860x> aVar = this.f77732b;
            return i + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BottomState(state=");
            sb.append(this.f77731a);
            sb.append(", loadMore=");
            sb.append(this.f77732b);
            sb.append(")");
            return sb.toString();
        }

        public C29757a(int i, C52670a<C52860x> aVar) {
            C52711k.m112240b(aVar, "loadMore");
            this.f77731a = i;
            this.f77732b = aVar;
        }

        public /* synthetic */ C29757a(int i, C52670a aVar, int i2, C52707g gVar) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                aVar = C297581.f77733a;
            }
            this(i, aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.PoiCollectListBottomViewHolder$b */
    public static final class C29759b {
        private C29759b() {
        }

        public /* synthetic */ C29759b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.PoiCollectListBottomViewHolder$c */
    static final class C29760c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Object f77734a;

        C29760c(Object obj) {
            this.f77734a = obj;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ((C29757a) this.f77734a).f77732b.invoke();
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo22662a(Object obj) {
        C29677g gVar = (C29677g) obj;
        C52711k.m112240b(gVar, "item");
        if (gVar.f77571b instanceof C29757a) {
            Object obj2 = gVar.f77571b;
            this.itemView.setOnClickListener(null);
            switch (((C29757a) obj2).f77731a) {
                case 1:
                    this.f77729g.mo19212f();
                    this.f77730j.setVisibility(8);
                    return;
                case 2:
                    this.f77729g.mo19214h();
                    this.f77730j.setVisibility(0);
                    this.itemView.setOnClickListener(new C29760c(obj2));
                    return;
                case 3:
                    this.f77729g.mo19213g();
                    this.f77730j.setVisibility(8);
                    break;
            }
        }
    }
}
