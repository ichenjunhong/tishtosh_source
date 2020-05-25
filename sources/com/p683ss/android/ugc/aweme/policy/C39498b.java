package com.p683ss.android.ugc.aweme.policy;

import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Collection;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.ss.android.ugc.aweme.policy.b */
public final class C39498b implements C9382a {

    /* renamed from: a */
    public C9381g f101046a = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: b */
    public Activity f101047b;

    /* renamed from: a */
    public final void mo80526a() {
        if (this.f101047b != null) {
            PolicyApi.f101040a.acceptPrivacyPolicy().mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C1674ab<BaseResponse>() {
                public final void onComplete() {
                }

                public final void onError(Throwable th) {
                }

                public final void onSubscribe(C1690c cVar) {
                }

                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    if (baseResponse != null && baseResponse.status_code == 0) {
                        C20854a.m53167g().getCurUser().setAcceptPrivatePolicy(true);
                    }
                }
            });
        }
    }

    public C39498b(Activity activity) {
        this.f101047b = activity;
    }

    public final void handleMsg(Message message) {
        if (message.what != 0) {
            if (message.what == 2 && message.obj != null && (message.obj instanceof BaseResponse) && ((BaseResponse) message.obj).status_code == 0) {
                C20854a.m53167g().queryUser();
            }
        } else if (message.obj != null && (message.obj instanceof Policy)) {
            try {
                Policy policy = (Policy) message.obj;
                if (policy.isDisplay() && !this.f101047b.isFinishing() && !C9376b.m18558a((Collection<T>) policy.getConfigs())) {
                    new PolicyDialog(this.f101047b, (C39495b) policy.getConfigs().get(0), new C39502e(this, policy)).show();
                }
            } catch (Exception unused) {
            }
        }
    }
}
