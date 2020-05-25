package com.bytedance.android.livesdk.chatroom.interact.p320i;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.i.a */
public final class C5620a extends C1352v {

    /* renamed from: a */
    public int f14716a;

    /* renamed from: b */
    public C5622a f14717b;

    /* renamed from: c */
    private final TextView f14718c;

    /* renamed from: d */
    private final ImageView f14719d;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.i.a$a */
    public interface C5622a {
        /* renamed from: a */
        void mo11116a(int i);
    }

    /* renamed from: a */
    public final void mo11506a(String str, int i) {
        this.f14718c.setText(str);
        this.f14719d.setImageResource(i);
    }

    public C5620a(View view, C5622a aVar, int i) {
        super(view);
        this.f14718c = (TextView) view.findViewById(R.id.acq);
        this.f14719d = (ImageView) view.findViewById(R.id.acp);
        this.f14717b = aVar;
        this.f14716a = i;
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                C5620a.this.f14717b.mo11116a(C5620a.this.f14716a);
            }
        });
    }
}
