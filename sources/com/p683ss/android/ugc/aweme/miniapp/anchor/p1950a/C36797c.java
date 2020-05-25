package com.p683ss.android.ugc.aweme.miniapp.anchor.p1950a;

import android.content.SharedPreferences;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1951b.C36817d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.a.c */
public final class C36797c extends C1322a<C36798a> {

    /* renamed from: a */
    public List<String> f94056a = new ArrayList();

    /* renamed from: b */
    public C36817d f94057b;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.a.c$a */
    public class C36798a extends C1352v {

        /* renamed from: a */
        DmtTextView f94058a;

        /* renamed from: b */
        ImageView f94059b;

        public C36798a(View view) {
            super(view);
            this.f94058a = (DmtTextView) view.findViewById(R.id.ap0);
            this.f94059b = (ImageView) view.findViewById(R.id.aoz);
            this.f94059b.setOnClickListener(new OnClickListener(C36797c.this) {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C36817d dVar = C36797c.this.f94057b;
                    int adapterPosition = C36798a.this.getAdapterPosition();
                    SharedPreferences a = C35807d.m80935a(dVar.getContext(), dVar.f94098a, 0);
                    ArrayList arrayList = new ArrayList(Arrays.asList(a.getString(dVar.f94098a, "").split(",")));
                    arrayList.remove(adapterPosition);
                    if (arrayList.size() > 0) {
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < arrayList.size(); i++) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append((String) arrayList.get(i));
                            sb2.append(",");
                            sb.append(sb2.toString());
                        }
                        a.edit().putString(dVar.f94098a, sb.toString()).apply();
                    } else {
                        a.edit().clear().apply();
                    }
                    if (arrayList.size() < 3) {
                        dVar.f94109l.setVisibility(8);
                    }
                    C36797c.this.mo75990a(arrayList);
                }
            });
            view.setOnClickListener(new OnClickListener(C36797c.this) {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C36817d dVar = C36797c.this.f94057b;
                    CharSequence text = C36798a.this.f94058a.getText();
                    dVar.f94101d.setText(text);
                    dVar.f94101d.setSelection(text.length());
                    dVar.mo76007j();
                }
            });
        }
    }

    public final int getItemCount() {
        if (this.f94056a == null) {
            return 0;
        }
        return this.f94056a.size();
    }

    public C36797c(C36817d dVar) {
        this.f94057b = dVar;
    }

    /* renamed from: a */
    public final void mo75990a(List<String> list) {
        this.f94056a.clear();
        this.f94056a.addAll(list);
        notifyDataSetChanged();
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C36798a aVar = (C36798a) vVar;
        if (i >= 0 && i <= getItemCount() - 1) {
            aVar.f94058a.setText((String) this.f94056a.get(i));
        }
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C36798a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.s0, viewGroup, false));
    }
}
