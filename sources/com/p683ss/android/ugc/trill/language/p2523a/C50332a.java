package com.p683ss.android.ugc.trill.language.p2523a;

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

/* renamed from: com.ss.android.ugc.trill.language.a.a */
public final class C50332a extends C1322a<C50335b> {

    /* renamed from: a */
    public ArrayList<C33123c> f126225a;

    /* renamed from: b */
    public C50334a f126226b;

    /* renamed from: c */
    private Context f126227c;

    /* renamed from: com.ss.android.ugc.trill.language.a.a$a */
    public interface C50334a {
        /* renamed from: a */
        void mo98235a(int i);
    }

    /* renamed from: com.ss.android.ugc.trill.language.a.a$b */
    public static class C50335b extends C1352v {

        /* renamed from: a */
        DmtTextView f126230a;

        /* renamed from: b */
        ImageView f126231b;

        public C50335b(View view) {
            int i;
            super(view);
            this.f126230a = (DmtTextView) view.findViewById(R.id.day);
            this.f126231b = (ImageView) view.findViewById(R.id.b3s);
            DmtTextView dmtTextView = this.f126230a;
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
        if (this.f126225a != null) {
            return this.f126225a.size();
        }
        return 0;
    }

    public C50332a(Context context, C50334a aVar) {
        this.f126227c = context;
        this.f126226b = aVar;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C50335b(LayoutInflater.from(this.f126227c).inflate(R.layout.bue, viewGroup, false));
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, final int i) {
        C50335b bVar = (C50335b) vVar;
        if (getItemCount() != 0) {
            C33123c cVar = (C33123c) this.f126225a.get(i);
            bVar.f126230a.setText(cVar.mo70148a());
            if (cVar.f85963a) {
                bVar.f126231b.setVisibility(0);
                bVar.f126231b.setImageResource(R.drawable.dwe);
            } else {
                bVar.f126231b.setVisibility(8);
            }
            bVar.itemView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (C50332a.this.f126226b != null) {
                        C50332a.this.f126226b.mo98235a(i);
                    }
                }
            });
        }
    }
}
