package com.p683ss.android.ugc.aweme.sdk.iap.p2120a;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.a.a */
public final class C41346a extends C1322a<C41348b> implements OnClickListener {

    /* renamed from: a */
    public List<C41349b> f104840a = new ArrayList();

    /* renamed from: b */
    public C41347a f104841b;

    /* renamed from: com.ss.android.ugc.aweme.sdk.iap.a.a$a */
    public interface C41347a {
        /* renamed from: a */
        void mo83919a(View view, C41349b bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.sdk.iap.a.a$b */
    public class C41348b extends C1352v {

        /* renamed from: a */
        public TextView f104842a;

        /* renamed from: b */
        public TextView f104843b;

        public C41348b(View view) {
            super(view);
            this.f104842a = (TextView) view.findViewById(R.id.d84);
            this.f104843b = (TextView) view.findViewById(R.id.d85);
        }
    }

    public final int getItemCount() {
        return this.f104840a.size();
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f104841b != null) {
            this.f104841b.mo83919a(view, (C41349b) view.getTag());
        }
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a9x, viewGroup, false);
        inflate.setOnClickListener(this);
        return new C41348b(inflate);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C41349b bVar;
        C41348b bVar2 = (C41348b) vVar;
        if (i >= this.f104840a.size() || i < 0) {
            bVar = null;
        } else {
            bVar = (C41349b) this.f104840a.get(i);
        }
        if (bVar != null) {
            bVar2.f104842a.setText(bVar2.itemView.getResources().getString(R.string.b8m, new Object[]{Integer.valueOf(bVar.f104848d)}));
            bVar2.f104843b.setText(bVar.f104847c);
            bVar2.itemView.setTag(bVar);
        }
    }
}
