package com.p683ss.android.ugc.trill.setting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.i18n.language.C33106b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.trill.setting.b */
public final class C50393b extends C23526a implements OnClickListener {

    /* renamed from: a */
    View f126357a;

    /* renamed from: b */
    TextView f126358b;

    /* renamed from: c */
    CommonItemView f126359c;

    /* renamed from: d */
    View f126360d;

    /* renamed from: e */
    public C50394a f126361e;

    /* renamed from: com.ss.android.ugc.trill.setting.b$a */
    public interface C50394a {
        /* renamed from: a */
        void mo98285a(Bundle bundle);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.se) {
            Bundle bundle = new Bundle();
            if (this.f126361e != null) {
                this.f126361e.mo98285a(bundle);
            }
            return;
        }
        if (id == R.id.ik) {
            getActivity().finish();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f126358b.setText(R.string.bvl);
        this.f126357a.setBackgroundColor(getResources().getColor(R.color.a2j));
        this.f126359c.setRightIconRes(0);
        this.f126359c.setLeftText(C33106b.m76112c(getContext()));
        this.f126359c.setOnClickListener(this);
        this.f126360d.setOnClickListener(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.bu6, viewGroup, false);
        ButterKnife.bind(inflate);
        this.f126357a = inflate.findViewById(R.id.d1b);
        this.f126358b = (TextView) inflate.findViewById(R.id.title);
        this.f126359c = (CommonItemView) inflate.findViewById(R.id.se);
        this.f126360d = inflate.findViewById(R.id.ik);
        return inflate;
    }
}
