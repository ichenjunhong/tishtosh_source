package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.v */
final class C40394v extends C26840g<Integer> {

    /* renamed from: a */
    public boolean f103086a;

    /* renamed from: b */
    public int f103087b;

    /* renamed from: c */
    public C40397b f103088c;

    /* renamed from: d */
    public Map<Integer, Boolean> f103089d = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v$a */
    class C40396a extends C1352v {

        /* renamed from: a */
        ImageView f103090a;

        /* renamed from: b */
        ImageView f103091b;

        private C40396a(View view) {
            super(view);
            this.f103090a = (ImageView) view.findViewById(R.id.avg);
            this.f103091b = (ImageView) view.findViewById(R.id.a3r);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v$b */
    public interface C40397b {
        /* renamed from: a */
        void mo82386a(int i);
    }

    C40394v() {
    }

    /* renamed from: b */
    public final void mo82627b(int i) {
        this.f103087b = i;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        return new C40396a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.s7, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        ImageView imageView;
        C40396a aVar = (C40396a) vVar;
        if (!C9376b.m18558a((Collection<T>) C40394v.this.f70670n) && i < C40394v.this.f70670n.size()) {
            aVar.f103090a.setImageResource(((Integer) C40394v.this.f70670n.get(i)).intValue());
        }
        int i2 = 4;
        if (!C40394v.this.f103086a) {
            imageView = aVar.f103091b;
            if (C40394v.this.f103087b == i) {
                i2 = 0;
            }
        } else if (C40394v.this.f103087b != i) {
            imageView = aVar.f103091b;
        } else {
            Boolean bool = (Boolean) C40394v.this.f103089d.get(Integer.valueOf(i));
            ImageView imageView2 = aVar.f103091b;
            if (bool != null && bool.booleanValue()) {
                i2 = 0;
            }
            imageView2.setVisibility(i2);
            aVar.itemView.setOnClickListener(new C40398w(aVar, i));
        }
        imageView.setVisibility(i2);
        aVar.itemView.setOnClickListener(new C40398w(aVar, i));
    }
}
