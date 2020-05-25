package com.p683ss.android.ugc.aweme.search.performance;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.p1402b.C23346d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.search.performance.a */
public final class C41443a extends LayoutInflater {
    public C41443a(Context context) {
        super(context);
    }

    public final LayoutInflater cloneInContext(Context context) {
        return LayoutInflater.from(getContext()).cloneInContext(context);
    }

    public final View inflate(int i, ViewGroup viewGroup, boolean z) {
        View view;
        Context context = getContext();
        C41457i iVar = C41457i.f105090b;
        C52711k.m112240b(context, "context");
        if (!(context instanceof C23346d) || !iVar.mo84198b()) {
            view = null;
        } else {
            view = ((C23346d) context).getInflater().mo48401a(i);
        }
        if (view == null) {
            return LayoutInflater.from(context).inflate(i, viewGroup, z);
        }
        return view;
    }
}
