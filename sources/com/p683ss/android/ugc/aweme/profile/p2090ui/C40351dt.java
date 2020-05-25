package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.profile.model.SelelctCityModel;
import com.p683ss.android.ugc.aweme.profile.p2090ui.WheelPicker.C40198a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39949aa;
import com.p683ss.android.ugc.aweme.profile.presenter.C39982p;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.dt */
public final class C40351dt extends PopupWindow implements C39982p, C40198a {

    /* renamed from: a */
    WheelPicker f103006a;

    /* renamed from: b */
    WheelPicker f103007b;

    /* renamed from: c */
    public C39949aa f103008c = new C39949aa();

    /* renamed from: d */
    public String f103009d;

    /* renamed from: e */
    public int f103010e;

    /* renamed from: f */
    public C40353a f103011f;

    /* renamed from: g */
    private TextView f103012g;

    /* renamed from: h */
    private Activity f103013h;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.dt$a */
    public interface C40353a {
        /* renamed from: a */
        void mo49946a(boolean z, String str);
    }

    /* renamed from: a */
    public final void mo82599a() {
        if (!C40354du.m89723a(this.f103013h)) {
            C10691a.m21545b((Context) this.f103013h, this.f103013h.getResources().getString(R.string.cfw)).mo19066a();
            return;
        }
        if (this.f103013h != null && !this.f103013h.isFinishing() && !isShowing()) {
            showAtLocation(this.f103013h.getWindow().getDecorView(), 80, 0, 0);
        }
    }

    public C40351dt(Activity activity) {
        super(activity);
        this.f103013h = activity;
        View inflate = ((LayoutInflater) AwemeApplication.m56199a().getSystemService("layout_inflater")).inflate(R.layout.acp, null);
        setContentView(inflate);
        setWidth(C9432q.m18670a((Context) AwemeApplication.m56199a()));
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(this.f103013h.getResources().getColor(R.color.arz)));
        setFocusable(true);
        setOutsideTouchable(true);
        setAnimationStyle(R.style.ww);
        update();
        this.f103012g = (TextView) inflate.findViewById(R.id.dd3);
        this.f103006a = (WheelPicker) inflate.findViewById(R.id.bjy);
        this.f103006a.setOnItemSelectedListener(this);
        this.f103007b = (WheelPicker) inflate.findViewById(R.id.bjz);
        this.f103007b.setOnItemSelectedListener(this);
        this.f103012g.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                boolean z;
                ClickInstrumentation.onClick(view);
                if (C40351dt.this.f103011f != null) {
                    C40353a aVar = C40351dt.this.f103011f;
                    boolean z2 = false;
                    if (C40351dt.this.f103010e != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.mo49946a(z, C40351dt.this.f103009d);
                    if (C40351dt.this.f103010e != 0) {
                        z2 = true;
                    }
                    SelelctCityModel.uploadLocation(z2);
                }
                C40351dt.this.dismiss();
            }
        });
        this.f103008c.mo54800a(this);
        this.f103008c.mo44934a_(new Object[0]);
    }

    /* renamed from: a */
    public final void mo81906a(List<String> list, List<String> list2) {
        if (this.f103006a != null && this.f103007b != null && list != null && list2 != null) {
            this.f103006a.setData(list);
            this.f103007b.setData(list2);
        }
    }

    /* renamed from: a */
    public final void mo82440a(WheelPicker wheelPicker, Object obj, int i) {
        int id = wheelPicker.getId();
        if (id == R.id.bjy) {
            this.f103010e = i;
            this.f103007b.setData(((SelelctCityModel) this.f103008c.mo54803n()).getCityData(i));
            this.f103007b.setSelectedItemPosition(0);
            this.f103009d = String.valueOf(this.f103007b.getData().get(0));
            return;
        }
        if (id == R.id.bjz) {
            this.f103009d = String.valueOf(obj);
        }
    }
}
