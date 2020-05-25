package com.p683ss.android.ugc.aweme.emoji.emojichoose;

import android.graphics.drawable.Drawable;
import android.support.p030v4.app.C0607a;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29289e;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29291g;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29292h;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.q */
public final class C29362q extends C1322a<C29363a> {

    /* renamed from: a */
    public C29292h f76912a;

    /* renamed from: b */
    public boolean f76913b;

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.q$a */
    public class C29363a extends C29289e<C29291g> {

        /* renamed from: a */
        public RemoteImageView f76914a;

        /* renamed from: a */
        public final void mo59235a() {
            this.f76914a = (RemoteImageView) this.itemView.findViewById(R.id.cwy);
        }

        C29363a(View view) {
            super(view);
        }

        /* renamed from: a */
        public final void mo59351a(C29291g gVar, final int i) {
            int i2;
            boolean z;
            if (gVar.mo59223i() == 2) {
                C23515d.m57677a(this.f76914a, gVar.mo59215b());
            } else if (gVar.mo59213a() > 0) {
                this.f76914a.setImageResource(gVar.mo59213a());
            } else {
                Drawable c = gVar.mo59217c();
                if (c != null) {
                    this.f76914a.setImageDrawable(c);
                }
            }
            if (!TextUtils.isEmpty(gVar.mo59218d())) {
                C0607a.m1637a(this.f76914a, new C29365r(gVar));
            }
            if (C29362q.this.f76913b) {
                i2 = C29362q.this.f76912a.mo59240g().f76908c;
            } else {
                i2 = C29362q.this.f76912a.mo59239f().f76888c;
            }
            RemoteImageView remoteImageView = this.f76914a;
            if (i == i2) {
                z = true;
            } else {
                z = false;
            }
            remoteImageView.setSelected(z);
            this.f76914a.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (!C29363a.this.f76914a.isSelected()) {
                        C29362q.this.f76912a.mo59238a(i);
                    }
                }
            });
        }
    }

    public final int getItemCount() {
        if (this.f76913b) {
            return this.f76912a.mo59240g().mo59350c();
        }
        return this.f76912a.mo59239f().mo59311f();
    }

    public C29362q(C29292h hVar) {
        this.f76912a = hVar;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C29363a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lh, viewGroup, false));
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C29363a aVar = (C29363a) vVar;
        if (this.f76913b) {
            aVar.mo59351a(this.f76912a.mo59240g().mo59349b(i), i);
        } else {
            aVar.mo59351a(this.f76912a.mo59239f().mo59312f(i), i);
        }
    }
}
