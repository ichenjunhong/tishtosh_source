package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.update.C47522i;
import com.p683ss.android.ugc.aweme.update.C47527j;
import com.p683ss.android.ugc.aweme.update.C47529l;
import com.p683ss.android.ugc.aweme.update.C47530m;
import com.p683ss.android.ugc.aweme.update.UpdateHelper;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.fe.method.UpdateAppVersionMethod */
public final class UpdateAppVersionMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29844a f77916a = new C29844a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.UpdateAppVersionMethod$a */
    public static final class C29844a {
        private C29844a() {
        }

        public /* synthetic */ C29844a(C52707g gVar) {
            this();
        }
    }

    public UpdateAppVersionMethod() {
        this(null, 1, null);
    }

    public UpdateAppVersionMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        Object obj = this.f77793e.get();
        if (!(obj instanceof AbsActivity)) {
            obj = null;
        }
        AbsActivity absActivity = (AbsActivity) obj;
        int i = 1;
        boolean z = false;
        if (absActivity != null) {
            C47522i iVar = new C47522i(absActivity, absActivity);
            iVar.f119904c = UpdateHelper.m102902a().mo94817y();
            C47530m mVar = iVar.f119904c;
            if (mVar.mo94834c()) {
                new C11105a(iVar.f119902a).mo20135a((int) R.string.dzz).mo20144b((int) R.string.br7).mo20136a((int) R.string.ah2, (OnClickListener) null).mo20148b();
            } else if (!C47529l.m102954a(iVar.f119902a)) {
                new C11105a(iVar.f119902a).mo20135a((int) R.string.dzz).mo20144b((int) R.string.cg1).mo20136a((int) R.string.ah2, (OnClickListener) null).mo20148b();
            } else {
                iVar.f119905d = new WeakReference<>(new C11105a(iVar.f119902a).mo20135a((int) R.string.dzz).mo20144b((int) R.string.a29).mo20141a(false).mo20148b());
                C0013i.m18a((Callable<TResult>) new C47527j<TResult>(new Runnable(mVar) {

                    /* renamed from: a */
                    final /* synthetic */ C47530m f119912a;

                    public final void run() {
                        if (!this.f119912a.mo94832a()) {
                            if (!C47528k.m102953a(C47522i.this.f119902a)) {
                                C47522i.this.f119903b.sendEmptyMessage(1);
                            } else {
                                C47522i.this.f119903b.sendEmptyMessage(2);
                            }
                        } else if (!this.f119912a.mo94833b()) {
                            C47522i.this.f119903b.sendEmptyMessage(2);
                        } else {
                            C47522i.this.f119903b.sendEmptyMessage(3);
                        }
                    }

                    {
                        this.f119912a = r2;
                    }
                }), (Executor) C24076h.m58902c());
            }
            z = true;
        }
        JSONObject jSONObject2 = new JSONObject();
        String str = "code";
        if (!z) {
            i = -1;
        }
        jSONObject2.put(str, i);
        aVar.mo60041a(jSONObject2);
    }

    private /* synthetic */ UpdateAppVersionMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
