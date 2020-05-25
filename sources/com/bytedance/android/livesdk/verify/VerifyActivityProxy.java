package com.bytedance.android.livesdk.verify;

import android.support.p030v4.app.FragmentActivity;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

public class VerifyActivityProxy extends LiveActivityProxy {

    /* renamed from: a */
    C8377b f22791a;

    /* renamed from: b */
    String f22792b;

    /* renamed from: c */
    String f22793c;

    /* renamed from: e */
    private C1689b f22794e = new C1689b();

    public void onDestroy() {
        super.onDestroy();
        this.f22794e.mo6180a();
    }

    public void onCreate() {
        super.onCreate();
        this.f23571d.setContentView(R.layout.agg);
        this.f22791a = new C8377b();
        this.f22794e.mo6181a(((ZhimaVerifyApi) C4514j.m10883j().mo10321b().mo9550a(ZhimaVerifyApi.class)).getCertificationEntrance().mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C8376a<Object>(this)));
    }

    public VerifyActivityProxy(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
}
