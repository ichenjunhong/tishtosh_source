package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.api.C3037b;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bx */
public final class C6007bx extends C1322a<C6010b> {

    /* renamed from: a */
    public C6009a f15925a;

    /* renamed from: b */
    public String f15926b = "";

    /* renamed from: c */
    private List<C8688c> f15927c;

    /* renamed from: d */
    private int f15928d;

    /* renamed from: e */
    private int f15929e;

    /* renamed from: f */
    private OnClickListener f15930f = new OnClickListener() {
        public final void onClick(View view) {
            if (view.getTag(R.id.ar5) instanceof C8688c) {
                C8688c cVar = (C8688c) view.getTag(R.id.ar5);
                if (!TextUtils.equals(C6007bx.this.f15926b, cVar.f23756q)) {
                    C6007bx.this.f15926b = cVar.f23756q;
                    C6007bx.this.notifyDataSetChanged();
                    if (TextUtils.equals(C6007bx.this.f15926b, "")) {
                        C6007bx.this.f15925a.mo11884b(cVar);
                    } else if (cVar.f23760u) {
                        C6007bx.this.f15925a.mo11884b(cVar);
                    } else {
                        if (!cVar.f23761v) {
                            C6007bx.this.f15925a.mo11883a(cVar);
                        }
                    }
                }
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.bx$a */
    interface C6009a {
        /* renamed from: a */
        void mo11883a(C8688c cVar);

        /* renamed from: b */
        void mo11884b(C8688c cVar);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.bx$b */
    class C6010b extends C1352v {

        /* renamed from: a */
        View f15932a;

        /* renamed from: b */
        View f15933b;

        /* renamed from: c */
        View f15934c;

        /* renamed from: d */
        HSImageView f15935d;

        /* renamed from: e */
        View f15936e;

        C6010b(View view) {
            super(view);
            this.f15932a = view.findViewById(R.id.ba6);
            this.f15933b = view.findViewById(R.id.ccp);
            this.f15934c = view.findViewById(R.id.iz);
            this.f15935d = (HSImageView) view.findViewById(R.id.ar5);
            this.f15936e = view.findViewById(R.id.bh6);
        }
    }

    public final int getItemCount() {
        if (this.f15927c == null) {
            return 0;
        }
        return this.f15927c.size();
    }

    /* renamed from: a */
    private C8688c m13103a(String str) {
        for (C8688c cVar : this.f15927c) {
            if (TextUtils.equals(str, cVar.f23756q)) {
                return cVar;
            }
        }
        return null;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C6010b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aq3, viewGroup, false));
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        boolean z;
        C6010b bVar = (C6010b) vVar;
        C8688c cVar = (C8688c) this.f15927c.get(i);
        if (TextUtils.equals(cVar.f23756q, "")) {
            bVar.f15935d.setImageResource(R.drawable.bv0);
        } else {
            C5213c.m11820a(bVar.f15935d, cVar.f23740a.mo7701a());
        }
        if (TextUtils.equals(this.f15926b, cVar.f23756q)) {
            bVar.f15934c.setVisibility(0);
        } else {
            bVar.f15934c.setVisibility(8);
        }
        bVar.f15935d.setTag(R.id.ar5, cVar);
        bVar.f15935d.setOnClickListener(this.f15930f);
        boolean z2 = true;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i != getItemCount() - 1) {
            z2 = false;
        }
        LayoutParams layoutParams = (LayoutParams) bVar.f15932a.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LayoutParams(-2, -1);
        }
        LayoutParams layoutParams2 = (LayoutParams) bVar.f15933b.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new LayoutParams(-2, -1);
        }
        ViewGroup.LayoutParams layoutParams3 = bVar.itemView.getLayoutParams();
        if (layoutParams3 == null) {
            layoutParams3 = new ViewGroup.LayoutParams(-2, -1);
        }
        if (z) {
            layoutParams.width = this.f15928d;
            layoutParams2.width = this.f15928d / 2;
        } else if (z2) {
            layoutParams.width = this.f15928d / 2;
            layoutParams2.width = this.f15928d;
        } else {
            layoutParams.width = this.f15928d / 2;
            layoutParams2.width = this.f15928d / 2;
        }
        layoutParams3.width = layoutParams.width + layoutParams2.width + this.f15929e;
        bVar.itemView.setLayoutParams(layoutParams3);
        bVar.f15932a.setLayoutParams(layoutParams);
        bVar.f15933b.setLayoutParams(layoutParams2);
        if (cVar.f23761v) {
            bVar.f15936e.setVisibility(0);
        } else {
            bVar.f15936e.setVisibility(8);
        }
    }

    C6007bx(Context context, List<C8688c> list, C6009a aVar) {
        this.f15927c = list;
        this.f15925a = aVar;
        int a = C9432q.m18670a(context);
        this.f15929e = (int) C9432q.m18687b(context, 56.0f);
        this.f15928d = (a - (this.f15929e * 5)) / 6;
    }

    /* renamed from: a */
    public final void mo12003a(String str, C8688c cVar, int i) {
        if (C3037b.f8915c.equals(str)) {
            C8688c a = m13103a(cVar.f23756q);
            if (a != null) {
                if (i == 2) {
                    a.f23761v = false;
                    a.f23760u = true;
                    if (TextUtils.equals(a.f23756q, this.f15926b)) {
                        this.f15925a.mo11884b(a);
                    }
                } else if (i == 3) {
                    a.f23761v = false;
                } else if (i == 1) {
                    a.f23761v = true;
                }
                notifyDataSetChanged();
            }
        }
    }
}
