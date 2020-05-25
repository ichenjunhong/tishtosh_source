package com.bytedance.android.livesdk.gift.p357e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.model.C7507f;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.e.c */
public final class C7311c extends BaseAdapter {

    /* renamed from: a */
    final C7312a f19908a;

    /* renamed from: b */
    private final List<C7507f> f19909b;

    /* renamed from: com.bytedance.android.livesdk.gift.e.c$a */
    public interface C7312a {
        /* renamed from: a */
        void mo13561a(int i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getCount() {
        return this.f19909b.size();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C7507f getItem(int i) {
        return (C7507f) this.f19909b.get(i);
    }

    public C7311c(List<C7507f> list, C7312a aVar) {
        this.f19908a = aVar;
        if (list == null) {
            this.f19909b = new ArrayList();
        } else {
            this.f19909b = list;
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aly, viewGroup, false);
        }
        C7507f a = getItem(i);
        ((TextView) view).setText(String.valueOf(a.f20571a));
        view.setOnClickListener(new C7313d(this, a));
        return view;
    }
}
