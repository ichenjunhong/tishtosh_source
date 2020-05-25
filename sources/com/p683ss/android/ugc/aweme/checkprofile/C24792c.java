package com.p683ss.android.ugc.aweme.checkprofile;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.checkprofile.C24790b.C24791a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.checkprofile.c */
final class C24792c extends C1352v implements OnClickListener {

    /* renamed from: a */
    TextView f65618a = ((TextView) this.itemView.findViewById(R.id.f60));

    /* renamed from: b */
    TextView f65619b = ((TextView) this.itemView.findViewById(R.id.eag));

    /* renamed from: c */
    TextView f65620c = ((TextView) this.itemView.findViewById(R.id.e83));

    /* renamed from: d */
    AvatarImageWithVerify f65621d = ((AvatarImageWithVerify) this.itemView.findViewById(R.id.f5z));

    /* renamed from: e */
    C24791a f65622e;

    /* renamed from: f */
    User f65623f;

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f65622e != null) {
            this.f65622e.mo50665a(this.f65623f);
        }
        C24790b.m60328a(getAdapterPosition(), "click");
    }

    C24792c(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.byr, viewGroup, false));
    }
}
