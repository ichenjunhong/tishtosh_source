package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.p305b.C4997a;
import com.bytedance.android.livesdk.p279af.C4565af;
import com.ss.android.ugc.trill.R;

public class DebugInfoView extends LinearLayout {

    /* renamed from: a */
    TextView f17995a;

    /* renamed from: b */
    TextView f17996b;

    /* renamed from: c */
    TextView f17997c;

    /* renamed from: d */
    TextView f17998d;

    /* renamed from: e */
    public TextView f17999e;

    /* renamed from: f */
    private C4997a f18000f;

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C4997a aVar = this.f18000f;
        if (C4565af.m10958a() != null) {
            C4565af.m10958a().removeMessageListener(aVar);
        }
    }

    public DebugInfoView(Context context) {
        this(context, null);
    }

    public DebugInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DebugInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(R.layout.ah4, this);
        this.f17997c = (TextView) findViewById(R.id.a5r);
        this.f17995a = (TextView) findViewById(R.id.al5);
        this.f17998d = (TextView) findViewById(R.id.bl2);
        this.f17996b = (TextView) findViewById(R.id.sp);
        this.f17999e = (TextView) findViewById(R.id.c7b);
        this.f18000f = new C4997a();
        C4997a aVar = this.f18000f;
        aVar.f13391a.add(new C6671c(this));
        this.f18000f.mo10876a(TTLiveSDKContext.getHostService().mo10315h().mo14529b());
        TextView textView = (TextView) findViewById(R.id.a5l);
        ((TextView) findViewById(R.id.dl5)).setText(String.valueOf(TTLiveSDKContext.getHostService().mo10315h().mo14529b()));
        textView.setText(TTLiveSDKContext.getHostService().mo10308a().getServerDeviceId());
    }
}
