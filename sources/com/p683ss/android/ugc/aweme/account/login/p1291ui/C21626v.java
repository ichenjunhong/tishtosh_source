package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.account.login.model.C21386a;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.v */
public final class C21626v extends C1322a<C21628a> {

    /* renamed from: a */
    public C21629b f58626a;

    /* renamed from: b */
    private List<C21386a> f58627b;

    /* renamed from: c */
    private int f58628c = R.layout.aza;

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.v$a */
    class C21628a extends C1352v {

        /* renamed from: a */
        public TextView f58631a;

        /* renamed from: b */
        public TextView f58632b;

        /* renamed from: c */
        public TextView f58633c;

        public C21628a(View view) {
            super(view);
            this.f58631a = (TextView) view.findViewById(R.id.dal);
            this.f58632b = (TextView) view.findViewById(R.id.dcn);
            this.f58633c = (TextView) view.findViewById(R.id.d83);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.v$b */
    public interface C21629b {
        /* renamed from: a */
        void mo45764a(C21386a aVar);
    }

    public final int getItemCount() {
        return this.f58627b.size();
    }

    public C21626v(List<C21386a> list, int i) {
        this.f58627b = list;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C21628a(LayoutInflater.from(viewGroup.getContext()).inflate(this.f58628c, null));
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C21628a aVar = (C21628a) vVar;
        final C21386a aVar2 = (C21386a) this.f58627b.get(i);
        if (i == 0 || !TextUtils.equals(((C21386a) this.f58627b.get(i - 1)).f58042b, aVar2.f58042b)) {
            aVar.f58631a.setVisibility(0);
            aVar.f58631a.setText(aVar2.f58042b);
        } else {
            aVar.f58631a.setVisibility(8);
        }
        aVar.f58632b.setText(aVar2.f58041a);
        aVar.f58633c.setText(aVar2.f58044d);
        aVar.itemView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C21626v.this.f58626a != null) {
                    C21626v.this.f58626a.mo45764a(aVar2);
                }
            }
        });
    }
}
