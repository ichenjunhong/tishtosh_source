package com.bytedance.android.livesdk.p422w;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.kickout.C7715a;
import com.bytedance.android.livesdk.kickout.C7722b;
import com.bytedance.android.livesdk.kickout.p389a.C7721b;
import com.bytedance.android.livesdk.kickout.p390b.C7723a;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.w.a */
public final class C8442a extends Dialog implements OnClickListener, C7722b {

    /* renamed from: a */
    private TextView f22904a;

    /* renamed from: b */
    private TextView f22905b;

    /* renamed from: c */
    private C7715a f22906c;

    /* renamed from: d */
    private long f22907d;

    /* renamed from: e */
    private long f22908e;

    /* renamed from: f */
    private long f22909f;

    /* renamed from: g */
    private Context f22910g;

    /* renamed from: a */
    public final void mo14064a() {
    }

    /* renamed from: a */
    public final void mo14065a(C7723a aVar, Exception exc) {
    }

    /* renamed from: b */
    public final void mo14067b() {
    }

    /* renamed from: c */
    private Map<String, String> m16643c() {
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(this.f22908e));
        hashMap.put("room_id", String.valueOf(this.f22907d));
        hashMap.put("user_id", String.valueOf(this.f22909f));
        return hashMap;
    }

    /* renamed from: b */
    public final void mo14068b(boolean z) {
        if (isShowing()) {
            dismiss();
            C4495a.m10823a().mo10301a((Object) new C8444c(0));
        }
        C4495a.m10823a().mo10301a((Object) new C7721b(true, this.f22909f));
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.ain, null));
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
            window.setLayout(-2, -2);
        }
        this.f22904a = (TextView) findViewById(R.id.d7g);
        this.f22905b = (TextView) findViewById(R.id.dat);
        this.f22904a.setOnClickListener(this);
        this.f22905b.setOnClickListener(this);
        this.f22906c = new C7715a();
        this.f22906c.f21222a = this;
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.dat) {
            if (!C8443b.m16649a(this.f22910g)) {
                C4204a.m10421a(this.f22910g, (int) R.string.e77);
            } else {
                this.f22906c.mo14059a(true, this.f22907d, this.f22909f);
            }
            C8049c.m15979a().mo14202a("blacklist_toast_click", m16643c(), new C8059j().mo14214b("relation").mo14218f("click").mo14217e("live_detail").mo14219g("yes"));
            return;
        }
        if (id == R.id.d7g) {
            C8049c.m15979a().mo14202a("blacklist_toast_click", m16643c(), new C8059j().mo14214b("relation").mo14218f("click").mo14217e("live_detail").mo14219g("no"));
            if (isShowing()) {
                dismiss();
            }
            C4495a.m10823a().mo10301a((Object) new C8444c(1));
        }
    }

    /* renamed from: a */
    public final void mo14066a(boolean z, Exception exc) {
        C4602l.m11046a(getContext(), exc);
        if (isShowing()) {
            dismiss();
            C4495a.m10823a().mo10301a((Object) new C8444c(0));
        }
    }

    public C8442a(Context context, long j, long j2, long j3) {
        super(context, R.style.yy);
        this.f22910g = context;
        this.f22907d = j;
        this.f22908e = j2;
        this.f22909f = j3;
    }
}
