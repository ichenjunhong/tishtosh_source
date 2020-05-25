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

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.m */
public final class C21601m extends C1322a<C21603a> {

    /* renamed from: a */
    public C21604b f58579a;

    /* renamed from: b */
    private List<C21386a> f58580b;

    /* renamed from: c */
    private int f58581c = R.layout.aza;

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.m$a */
    class C21603a extends C1352v {

        /* renamed from: a */
        public TextView f58584a;

        /* renamed from: b */
        public TextView f58585b;

        /* renamed from: c */
        public TextView f58586c;

        public C21603a(View view) {
            super(view);
            this.f58584a = (TextView) view.findViewById(R.id.dal);
            this.f58585b = (TextView) view.findViewById(R.id.dcn);
            this.f58586c = (TextView) view.findViewById(R.id.d83);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.m$b */
    public interface C21604b {
        /* renamed from: a */
        void mo45741a(C21386a aVar);
    }

    public final int getItemCount() {
        return this.f58580b.size();
    }

    public C21601m(List<C21386a> list, int i) {
        this.f58580b = list;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C21603a(LayoutInflater.from(viewGroup.getContext()).inflate(this.f58581c, null));
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C21603a aVar = (C21603a) vVar;
        final C21386a aVar2 = (C21386a) this.f58580b.get(i);
        if (i == 0 || !TextUtils.equals(((C21386a) this.f58580b.get(i - 1)).f58042b, aVar2.f58042b)) {
            aVar.f58584a.setVisibility(0);
            aVar.f58584a.setText(aVar2.f58042b);
        } else {
            aVar.f58584a.setVisibility(8);
        }
        if (aVar2.f58042b.isEmpty()) {
            aVar.f58584a.setVisibility(8);
        }
        aVar.f58585b.setText(aVar2.f58041a);
        aVar.f58586c.setText(aVar2.f58044d);
        aVar.itemView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C21601m.this.f58579a != null) {
                    C21601m.this.f58579a.mo45741a(aVar2);
                }
            }
        });
    }
}
