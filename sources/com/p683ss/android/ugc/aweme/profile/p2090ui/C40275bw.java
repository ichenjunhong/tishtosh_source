package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.bw */
public final class C40275bw extends BaseAdapter {

    /* renamed from: a */
    public SparseArray f102814a;

    /* renamed from: b */
    private Context f102815b;

    /* renamed from: c */
    private List<C40276a> f102816c;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bw$a */
    public static class C40276a {

        /* renamed from: a */
        public String f102817a;

        /* renamed from: b */
        boolean f102818b;

        public C40276a(String str, boolean z) {
            this.f102817a = str;
            this.f102818b = z;
        }
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final int getCount() {
        return this.f102816c.size();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C40276a getItem(int i) {
        return (C40276a) this.f102816c.get(i);
    }

    public C40275bw(Context context, List<C40276a> list) {
        this.f102815b = context;
        this.f102816c = list;
        this.f102814a = new SparseArray(list.size());
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        if (view == null) {
            view = View.inflate(this.f102815b, R.layout.bol, null);
        }
        C40276a a = getItem(i);
        TextView textView = (TextView) view.findViewById(R.id.das);
        this.f102814a.put(i, a.f102817a);
        View findViewById = view.findViewById(R.id.bna);
        textView.setText(a.f102817a);
        if (a.f102818b) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
        return view;
    }
}
