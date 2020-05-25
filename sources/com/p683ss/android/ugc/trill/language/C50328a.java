package com.p683ss.android.ugc.trill.language;

import android.content.Context;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.C10675b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.i18n.language.C33123c;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.trill.language.a */
public final class C50328a extends C1322a<C50331b> {

    /* renamed from: a */
    public ArrayList<C33123c> f126218a;

    /* renamed from: b */
    public C50330a f126219b;

    /* renamed from: c */
    private Context f126220c;

    /* renamed from: com.ss.android.ugc.trill.language.a$a */
    public interface C50330a {
        /* renamed from: a */
        void mo98233a(int i);
    }

    /* renamed from: com.ss.android.ugc.trill.language.a$b */
    public static class C50331b extends C1352v {

        /* renamed from: a */
        DmtTextView f126223a;

        /* renamed from: b */
        ImageView f126224b;

        public C50331b(View view) {
            int i;
            super(view);
            this.f126223a = (DmtTextView) view.findViewById(R.id.day);
            this.f126224b = (ImageView) view.findViewById(R.id.b3s);
            DmtTextView dmtTextView = this.f126223a;
            Context context = view.getContext();
            if (C10675b.m21498b(view.getContext())) {
                i = R.color.aof;
            } else {
                i = R.color.aoe;
            }
            dmtTextView.setTextColor(C0726c.m2098c(context, i));
        }
    }

    public final int getItemCount() {
        if (this.f126218a != null) {
            return this.f126218a.size();
        }
        return 0;
    }

    public C50328a(Context context, C50330a aVar) {
        this.f126220c = context;
        this.f126219b = aVar;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C50331b(LayoutInflater.from(this.f126220c).inflate(R.layout.vc, viewGroup, false));
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, final int i) {
        C50331b bVar = (C50331b) vVar;
        if (getItemCount() != 0) {
            C33123c cVar = (C33123c) this.f126218a.get(i);
            bVar.f126223a.setText(cVar.mo70148a());
            if (cVar.f85963a) {
                bVar.f126224b.setVisibility(0);
                bVar.f126224b.setImageResource(R.drawable.a8l);
            } else {
                bVar.f126224b.setVisibility(8);
            }
            bVar.itemView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (C50328a.this.f126219b != null) {
                        C50328a.this.f126219b.mo98233a(i);
                    }
                }
            });
        }
    }
}
