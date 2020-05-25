package com.bytedance.jedi.ext.adapter.extension;

import android.view.ViewGroup;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.p745a.p746a.C11942a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.jedi.ext.adapter.extension.b */
public final class C11966b<T, RECEIVER extends C11796d> extends C11965a<T, C11966b<T, RECEIVER>, JediViewHolder<? extends C11796d, T>> {

    /* renamed from: a */
    public static final C11967a f31667a = new C11967a(null);

    /* renamed from: com.bytedance.jedi.ext.adapter.extension.b$a */
    public static final class C11967a {
        private C11967a() {
        }

        public /* synthetic */ C11967a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.extension.b$b */
    static final class C11968b extends C52712l implements C52671b<ViewGroup, JediAdapterBuilder$viewHolder$factory$1$1> {

        /* renamed from: a */
        final /* synthetic */ C52686q f31668a;

        /* renamed from: b */
        final /* synthetic */ int f31669b;

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "it");
            return new JediAdapterBuilder$viewHolder$factory$1$1(this, viewGroup, C11942a.m24316a(viewGroup, this.f31669b, false, 2, null));
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.extension.b$c */
    static final class C11969c extends C52712l implements C52671b<ViewGroup, JediAdapterBuilder$viewHolder$factory$2$1> {

        /* renamed from: a */
        final /* synthetic */ C52687r f31670a;

        /* renamed from: b */
        final /* synthetic */ int f31671b;

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "it");
            return new JediAdapterBuilder$viewHolder$factory$2$1(this, viewGroup, C11942a.m24316a(viewGroup, this.f31671b, false, 2, null));
        }
    }
}
