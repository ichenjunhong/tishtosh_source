package com.bytedance.jirafast.p748a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import android.widget.Filterable;
import android.widget.TextView;
import com.bytedance.jirafast.models.C12056f;
import com.bytedance.jirafast.p751d.C12016b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.bytedance.jirafast.a.b */
public final class C11994b extends ArrayAdapter<C12056f> implements Filterable {

    /* renamed from: a */
    public List<C12056f> f31725a = new ArrayList();

    /* renamed from: b */
    public List<C12056f> f31726b;

    /* renamed from: c */
    private int f31727c = R.layout.bjc;

    /* renamed from: com.bytedance.jirafast.a.b$a */
    static class C11996a {

        /* renamed from: a */
        TextView f31729a;

        /* renamed from: b */
        TextView f31730b;

        /* renamed from: c */
        TextView f31731c;

        public C11996a(View view) {
            this.f31729a = (TextView) view.findViewById(R.id.ehm);
            this.f31730b = (TextView) view.findViewById(R.id.ehl);
            this.f31731c = (TextView) view.findViewById(R.id.egs);
        }
    }

    public final Filter getFilter() {
        return new Filter() {
            /* access modifiers changed from: protected */
            public final FilterResults performFiltering(CharSequence charSequence) {
                FilterResults filterResults = new FilterResults();
                List arrayList = new ArrayList();
                if (charSequence != null && charSequence.length() != 0) {
                    arrayList = C12016b.m24423a().mo22760a(charSequence.toString());
                } else if (C11994b.this.f31726b != null) {
                    arrayList = C11994b.this.f31726b;
                }
                filterResults.values = arrayList;
                filterResults.count = arrayList.size();
                return filterResults;
            }

            /* access modifiers changed from: protected */
            public final void publishResults(CharSequence charSequence, FilterResults filterResults) {
                if (filterResults == null || filterResults.count <= 0) {
                    C11994b.this.notifyDataSetInvalidated();
                    return;
                }
                C11994b.this.f31725a.clear();
                C11994b.this.f31725a.addAll((Collection) filterResults.values);
                C11994b.this.notifyDataSetChanged();
            }
        };
    }

    public final int getCount() {
        if (this.f31725a == null) {
            return 0;
        }
        return this.f31725a.size();
    }

    /* renamed from: a */
    public final C12056f getItem(int i) {
        return (C12056f) this.f31725a.get(i);
    }

    public C11994b(Context context, int i) {
        super(context, R.layout.bjc);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C11996a aVar;
        C12056f a = getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(this.f31727c, viewGroup, false);
            aVar = new C11996a(view);
            view.setTag(aVar);
        } else {
            aVar = (C11996a) view.getTag();
        }
        if (a != null) {
            aVar.f31729a.setText(a.getName());
            aVar.f31730b.setText(a.getEmailAddress());
            if (!a.getName().equals(a.getDisplayName())) {
                aVar.f31731c.setText(a.getDisplayName());
            } else {
                aVar.f31731c.setText("");
            }
        }
        return view;
    }
}
