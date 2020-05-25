package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.C27100a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OnBackPressedMethod */
public final class OnBackPressedMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29814a f77853a = new C29814a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OnBackPressedMethod$a */
    public static final class C29814a {
        private C29814a() {
        }

        public /* synthetic */ C29814a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OnBackPressedMethod$b */
    static final class C29815b implements C27100a {

        /* renamed from: a */
        final /* synthetic */ OnBackPressedMethod f77854a;

        /* renamed from: b */
        final /* synthetic */ int f77855b;

        C29815b(OnBackPressedMethod onBackPressedMethod, int i) {
            this.f77854a = onBackPressedMethod;
            this.f77855b = i;
        }

        /* renamed from: a */
        public final boolean mo55388a() {
            this.f77854a.mo60037b("onBackPressed_event", new JSONObject(), 3);
            if (this.f77855b == 1) {
                return true;
            }
            return false;
        }
    }

    public OnBackPressedMethod() {
        this(null, 1, null);
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        Context context;
        WeakReference weakReference = this.f77793e;
        if (weakReference != null) {
            context = (Context) weakReference.get();
        } else {
            context = null;
        }
        if (!(context instanceof CrossPlatformActivity)) {
            context = null;
        }
        CrossPlatformActivity crossPlatformActivity = (CrossPlatformActivity) context;
        if (crossPlatformActivity != null) {
            crossPlatformActivity.f71480d = null;
        }
    }

    public OnBackPressedMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final BaseCommonJavaMethod mo60035a(WeakReference<Context> weakReference) {
        C52711k.m112240b(weakReference, "contextRef");
        Context context = (Context) weakReference.get();
        if (context instanceof C0184k) {
            ((C0184k) context).getLifecycle().mo324a(this);
        }
        BaseCommonJavaMethod a = super.mo60035a(weakReference);
        C52711k.m112236a((Object) a, "super.attach(contextRef)");
        return a;
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        Context context;
        if (jSONObject != null) {
            WeakReference weakReference = this.f77793e;
            if (weakReference != null) {
                context = (Context) weakReference.get();
            } else {
                context = null;
            }
            if (!(context instanceof CrossPlatformActivity)) {
                context = null;
            }
            CrossPlatformActivity crossPlatformActivity = (CrossPlatformActivity) context;
            if (crossPlatformActivity != null) {
                int optInt = jSONObject.optInt("actionType", 0);
                if (optInt == 0) {
                    crossPlatformActivity.f71480d = null;
                } else {
                    crossPlatformActivity.f71480d = new C29815b(this, optInt);
                }
            }
        }
    }

    private /* synthetic */ OnBackPressedMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
