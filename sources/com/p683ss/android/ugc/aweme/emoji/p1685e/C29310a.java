package com.p683ss.android.ugc.aweme.emoji.p1685e;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29293i;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.emoji.e.a */
public final class C29310a extends C1322a<C1352v> {

    /* renamed from: b */
    public static int f76703b = 20000;

    /* renamed from: a */
    ArrayList<C29285a> f76704a = new ArrayList<>();

    /* renamed from: c */
    private C29293i f76705c;

    /* renamed from: d */
    private final View f76706d;

    /* renamed from: com.ss.android.ugc.aweme.emoji.e.a$a */
    public static final class C29311a extends C1352v implements OnClickListener {
        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }

        public C29311a(View view) {
            super(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.e.a$b */
    public static final class C29312b extends C1352v implements OnClickListener {

        /* renamed from: a */
        RemoteImageView f76707a;

        /* renamed from: b */
        C29285a f76708b;

        /* renamed from: c */
        private C29293i f76709c;

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f76708b != null) {
                this.f76709c.mo51887a(this.f76708b.f76667c, 2);
            }
        }

        public C29312b(View view, C29293i iVar) {
            super(view);
            this.f76707a = (RemoteImageView) view.findViewById(R.id.a_s);
            this.f76709c = iVar;
            this.f76707a.setOnClickListener(this);
        }
    }

    public final int getItemCount() {
        int i;
        int i2 = 0;
        if (this.f76706d == null) {
            i = 0;
        } else {
            i = 1;
        }
        if (this.f76704a != null) {
            i2 = this.f76704a.size();
        }
        return i2 + i;
    }

    public final int getItemViewType(int i) {
        if (this.f76706d != null && i == this.f76704a.size()) {
            return f76703b;
        }
        return R.layout.le;
    }

    public C29310a(C29293i iVar, View view) {
        this.f76705c = iVar;
        this.f76706d = view;
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        if (vVar instanceof C29312b) {
            C29312b bVar = (C29312b) vVar;
            C29285a aVar = (C29285a) this.f76704a.get(i);
            if (aVar != null) {
                bVar.f76708b = aVar;
                C29408b.m69343a(bVar.f76707a, aVar);
                if (!TextUtils.isEmpty(aVar.f76667c)) {
                    bVar.f76707a.setContentDescription(aVar.f76667c);
                }
            }
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == R.layout.le) {
            return new C29312b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.le, viewGroup, false), this.f76705c);
        }
        C29311a aVar = new C29311a(this.f76706d);
        aVar.setIsRecyclable(false);
        return aVar;
    }
}
