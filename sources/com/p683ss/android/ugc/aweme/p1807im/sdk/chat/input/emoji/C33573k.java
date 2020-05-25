package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji;

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
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29289e;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29291g;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29292h;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.k */
public final class C33573k extends C1322a<C33574a> {

    /* renamed from: a */
    public C29292h f87023a;

    /* renamed from: b */
    public boolean f87024b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.k$a */
    public class C33574a extends C29289e<C29291g> {

        /* renamed from: a */
        public RemoteImageView f87025a;

        /* renamed from: a */
        public final void mo59235a() {
            this.f87025a = (RemoteImageView) this.itemView.findViewById(R.id.cwy);
        }

        C33574a(View view) {
            super(view);
        }

        /* renamed from: a */
        public final void mo71028a(C29291g gVar, final int i) {
            int i2;
            boolean z = false;
            this.f87025a.setPadding(0, 0, 0, 0);
            if (gVar.mo59223i() == 2) {
                int b = (int) C9432q.m18687b(this.itemView.getContext(), 4.0f);
                this.f87025a.setPadding(b, b, b, b);
                C23515d.m57677a(this.f87025a, gVar.mo59215b());
            } else {
                if (gVar.mo59223i() == 1) {
                    int b2 = (int) C9432q.m18687b(this.itemView.getContext(), 6.0f);
                    this.f87025a.setPadding(b2, b2, b2, b2);
                }
                if (gVar.mo59213a() > 0) {
                    this.f87025a.setImageResource(gVar.mo59213a());
                } else {
                    Drawable c = gVar.mo59217c();
                    if (c != null) {
                        this.f87025a.setImageDrawable(c);
                    }
                }
            }
            if (!TextUtils.isEmpty(gVar.mo59218d())) {
                C0607a.m1637a(this.f87025a, new C33576l(gVar));
            }
            if (C33573k.this.f87024b) {
                i2 = C33573k.this.f87023a.mo59240g().f76908c;
            } else {
                i2 = C33573k.this.f87023a.mo59239f().f76888c;
            }
            RemoteImageView remoteImageView = this.f87025a;
            if (i == i2) {
                z = true;
            }
            remoteImageView.setSelected(z);
            this.f87025a.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (!C33574a.this.f87025a.isSelected()) {
                        C33573k.this.f87023a.mo59238a(i);
                    }
                }
            });
        }
    }

    public final int getItemCount() {
        if (this.f87024b) {
            return this.f87023a.mo59240g().mo59350c();
        }
        return this.f87023a.mo59239f().mo59311f();
    }

    public C33573k(C29292h hVar) {
        this.f87023a = hVar;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C33574a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_0, viewGroup, false));
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C33574a aVar = (C33574a) vVar;
        if (this.f87024b) {
            aVar.mo71028a(this.f87023a.mo59240g().mo59349b(i), i);
        } else {
            aVar.mo71028a(this.f87023a.mo59239f().mo59312f(i), i);
        }
    }
}
