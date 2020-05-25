package com.bytedance.android.livesdk.chatroom.p325ui;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.model.C5709ab;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ef */
public final class C6135ef extends C1322a<C6137b> implements OnClickListener {

    /* renamed from: a */
    List<C5709ab> f16445a;

    /* renamed from: b */
    int f16446b;

    /* renamed from: c */
    private LayoutInflater f16447c;

    /* renamed from: d */
    private C6136a f16448d;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ef$a */
    interface C6136a {
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ef$b */
    static class C6137b extends C1352v {

        /* renamed from: a */
        public View f16449a;

        /* renamed from: b */
        public HSImageView f16450b;

        /* renamed from: c */
        public TextView f16451c;

        /* renamed from: d */
        public TextView f16452d;

        /* renamed from: e */
        public View f16453e;

        /* renamed from: f */
        public View f16454f;

        C6137b(View view) {
            super(view);
            this.f16449a = view;
            this.f16450b = (HSImageView) view.findViewById(R.id.ar5);
            this.f16451c = (TextView) view.findViewById(R.id.title);
            this.f16452d = (TextView) view.findViewById(R.id.a4m);
            this.f16453e = view.findViewById(R.id.kk);
            this.f16454f = view.findViewById(R.id.k7);
        }
    }

    public final int getItemCount() {
        if (this.f16445a != null) {
            return this.f16445a.size();
        }
        return 0;
    }

    public final void onClick(View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue != this.f16446b) {
            int i = this.f16446b;
            this.f16446b = intValue;
            notifyItemChanged(i);
            notifyItemChanged(this.f16446b);
            this.f16445a.get(this.f16446b);
        }
    }

    C6135ef(LayoutInflater layoutInflater, C6136a aVar) {
        this.f16447c = layoutInflater;
        this.f16448d = aVar;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C6137b(this.f16447c.inflate(R.layout.aqs, viewGroup, false));
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        int i2;
        C6137b bVar = (C6137b) vVar;
        C5709ab abVar = (C5709ab) this.f16445a.get(i);
        bVar.f16449a.setTag(Integer.valueOf(i));
        bVar.f16449a.setOnClickListener(this);
        C5213c.m11820a(bVar.f16450b, abVar.f15006d);
        bVar.f16451c.setText(C3922z.m9905a((int) R.string.ezu, Integer.valueOf(abVar.f15005c)));
        bVar.f16452d.setText(abVar.f15004b);
        View view = bVar.f16453e;
        int i3 = 8;
        if (this.f16446b == i) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        View view2 = bVar.f16454f;
        if (this.f16446b == i) {
            i3 = 0;
        }
        view2.setVisibility(i3);
    }
}
