package com.p683ss.android.ugc.aweme.filter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.tools.view.p2509b.C50208a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.filter.f */
public final class C31458f extends C50208a {

    /* renamed from: a */
    public List<C31459g> f82321a = new ArrayList();

    /* renamed from: b */
    public boolean f82322b;

    /* renamed from: f */
    private List<C31459g> f82323f = new ArrayList();

    /* renamed from: b */
    private void m73271b() {
        notifyDataSetChanged();
    }

    public final int getCount() {
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public final List<C31459g> mo64353a() {
        if (this.f82322b) {
            return this.f82321a;
        }
        return this.f82323f;
    }

    public C31458f(Context context) {
        super(context, LayoutInflater.from(context));
    }

    /* renamed from: a */
    public final void mo64354a(List<C31459g> list) {
        if (this.f82321a.size() != list.size()) {
            this.f82321a.clear();
            this.f82321a.addAll(list);
            if (this.f82322b) {
                m73271b();
            }
        }
    }

    /* renamed from: a */
    public final void mo64356a(boolean z) {
        if (this.f82322b != z) {
            this.f82322b = z;
            m73271b();
        }
    }

    /* renamed from: a */
    public final void mo64355a(List<C31459g> list, boolean z) {
        if (this.f82323f.size() != list.size()) {
            this.f82323f.clear();
            this.f82323f.addAll(list);
            if (!this.f82322b && z) {
                m73271b();
            }
        }
    }

    /* renamed from: a */
    public final View mo64352a(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            return new View(viewGroup.getContext());
        }
        return view;
    }
}
