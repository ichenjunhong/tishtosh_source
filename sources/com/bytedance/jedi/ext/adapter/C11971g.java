package com.bytedance.jedi.ext.adapter;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0184k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.internal.C11979c;
import com.bytedance.jedi.ext.adapter.internal.C11979c.C11980a;
import com.bytedance.jedi.ext.adapter.internal.C11982d;
import com.bytedance.jedi.ext.adapter.internal.C11982d.C11984a;
import com.bytedance.jedi.ext.adapter.internal.C11986f;
import com.bytedance.jedi.ext.adapter.internal.C11989h;
import com.bytedance.jedi.ext.adapter.p747b.C11949e;
import com.bytedance.jedi.ext.adapter.p747b.C11954g;
import com.bytedance.widget.Widget;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.ext.adapter.g */
public final class C11971g<VH extends JediViewHolder<? extends C11796d, ?>> extends C11954g<VH> {

    /* renamed from: a */
    public final C11986f f31674a;

    /* renamed from: c */
    private final C0184k f31675c;

    /* renamed from: a */
    public final /* synthetic */ C11949e mo22694a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        return new JediInvisibleViewHolder(viewGroup);
    }

    /* renamed from: a */
    public final /* synthetic */ C11949e mo22693a(int i) {
        C11989h hVar = this.f31648b.f31694d;
        Object obj = null;
        if (hVar != null) {
            List list = (List) ((SparseArray) hVar.f31719b.getValue()).get(i);
            if (list != null && (!list.isEmpty())) {
                C1352v vVar = (C1352v) list.remove(list.size() - 1);
                if (!(vVar instanceof Object)) {
                    vVar = null;
                }
                obj = vVar;
            }
            obj = (JediViewHolder) obj;
        }
        return (C11949e) obj;
    }

    /* renamed from: a */
    public final /* synthetic */ C11949e mo22696a(C11949e eVar) {
        JediViewHolder jediViewHolder = (JediViewHolder) eVar;
        C52711k.m112240b(jediViewHolder, "holder");
        JediViewHolder jediViewHolder2 = (JediViewHolder) super.mo22696a(jediViewHolder);
        C0184k kVar = this.f31675c;
        C52711k.m112240b(kVar, "<set-?>");
        jediViewHolder2.f31629b = kVar;
        C11986f fVar = this.f31674a;
        C52711k.m112240b(fVar, "<set-?>");
        jediViewHolder2.f31630c = fVar;
        jediViewHolder2.mo22670e();
        return jediViewHolder2;
    }

    public C11971g(C0184k kVar) {
        C11982d dVar;
        C11979c cVar;
        C52711k.m112240b(kVar, "owner");
        this.f31675c = kVar;
        C0184k kVar2 = this.f31675c;
        if (kVar2 instanceof Fragment) {
            C11984a aVar = C11982d.f31703d;
            Fragment fragment = (Fragment) kVar2;
            C52711k.m112240b(fragment, "fragment");
            dVar = aVar.mo22723a((FragmentActivity) null, fragment);
        } else if (kVar2 instanceof FragmentActivity) {
            C11984a aVar2 = C11982d.f31703d;
            FragmentActivity fragmentActivity = (FragmentActivity) kVar2;
            C52711k.m112240b(fragmentActivity, "activity");
            dVar = aVar2.mo22723a(fragmentActivity, (Fragment) null);
        } else if (kVar2 instanceof Widget) {
            C11984a aVar3 = C11982d.f31703d;
            Widget widget = (Widget) kVar2;
            C52711k.m112240b(widget, "widget");
            C0176h lifecycle = widget.getLifecycle();
            C11980a aVar4 = C11979c.f31697d;
            C52711k.m112240b(widget, "widget");
            Object n = widget.mo25062n();
            if (n instanceof Fragment) {
                cVar = C11980a.m24381a(null, (Fragment) n);
            } else if (n instanceof FragmentActivity) {
                cVar = C11980a.m24381a((FragmentActivity) n, null);
            } else {
                throw new IllegalStateException();
            }
            dVar = C11984a.m24384a(lifecycle, cVar);
        } else if (kVar2 instanceof JediViewHolder) {
            StringBuilder sb = new StringBuilder("JediViewHolder:");
            sb.append(this.f31675c);
            sb.append(" is not support for now");
            throw new IllegalStateException(sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder("owner:");
            sb2.append(this.f31675c);
            sb2.append(" is not in support list ([FragmentActivity, Fragment, Widget])");
            throw new IllegalStateException(sb2.toString());
        }
        this.f31674a = new C11986f(dVar);
    }
}
