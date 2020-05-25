package com.p683ss.android.ugc.aweme.account.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.account.p1307ui.C22240g;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.fragment.a */
public abstract class C20971a extends C22240g {

    /* renamed from: a */
    DmtTextView f57082a;

    /* renamed from: a */
    public abstract void mo44971a();

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f57082a.setTextColor(getResources().getColor(R.color.a82));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ayq, viewGroup, false);
        this.f58511m = inflate.findViewById(R.id.bf4);
        this.f58512n = (TextView) inflate.findViewById(R.id.d91);
        this.f58513o = (EditText) inflate.findViewById(R.id.a9k);
        this.f58514p = inflate.findViewById(R.id.bxg);
        this.f57082a = (DmtTextView) inflate.findViewById(R.id.cz3);
        if (this.f57082a != null) {
            this.f57082a.setOnClickListener(new C20972b(this));
        }
        return inflate;
    }
}
