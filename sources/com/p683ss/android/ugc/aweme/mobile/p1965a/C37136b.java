package com.p683ss.android.ugc.aweme.mobile.p1965a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.mobile.a.b */
public final class C37136b {

    /* renamed from: com.ss.android.ugc.aweme.mobile.a.b$a */
    public static final class C37137a {

        /* renamed from: a */
        private WeakReference<Activity> f94797a;

        /* renamed from: b */
        private WeakReference<Fragment> f94798b;

        /* renamed from: c */
        private WeakReference<Context> f94799c;

        /* renamed from: d */
        private Class<? extends Activity> f94800d;

        /* renamed from: e */
        private int f94801e;

        /* renamed from: f */
        private int f94802f;

        /* renamed from: g */
        private Bundle f94803g = new Bundle();

        /* renamed from: a */
        public final void mo76414a() {
            this.f94802f = 1;
            m83369b();
        }

        /* renamed from: c */
        private Context m83370c() {
            if (this.f94797a != null) {
                return (Context) this.f94797a.get();
            }
            if (this.f94798b != null && this.f94798b.get() != null) {
                return ((Fragment) this.f94798b.get()).getActivity();
            }
            if (this.f94799c != null) {
                return (Context) this.f94799c.get();
            }
            return null;
        }

        /* renamed from: b */
        private void m83369b() {
            Context c = m83370c();
            if (c != null) {
                boolean z = false;
                Intent intent = new Intent();
                if (this.f94800d != null) {
                    intent.setClass(c, this.f94800d);
                    z = true;
                }
                if (z) {
                    if (!this.f94803g.isEmpty()) {
                        intent.putExtras(this.f94803g);
                    }
                    if (this.f94801e == 0) {
                        if (this.f94797a != null && this.f94797a.get() != null) {
                            ((Activity) this.f94797a.get()).startActivity(intent);
                        } else if (this.f94798b != null && this.f94798b.get() != null) {
                            ((Fragment) this.f94798b.get()).startActivity(intent);
                        } else if (!(this.f94799c == null || this.f94799c.get() == null)) {
                            intent.addFlags(268435456);
                            ((Context) this.f94799c.get()).startActivity(intent);
                        }
                    } else if (this.f94797a != null && this.f94797a.get() != null) {
                        ((Activity) this.f94797a.get()).startActivityForResult(intent, this.f94801e);
                    } else if (this.f94798b != null && this.f94798b.get() != null) {
                        ((Fragment) this.f94798b.get()).startActivityForResult(intent, this.f94801e);
                    } else if (!(this.f94799c == null || this.f94799c.get() == null)) {
                        intent.addFlags(268435456);
                        ((Context) this.f94799c.get()).startActivity(intent);
                    }
                    if (this.f94802f == 1) {
                        if (this.f94797a != null && this.f94797a.get() != null) {
                            ((Activity) this.f94797a.get()).overridePendingTransition(R.anim.bm, R.anim.bv);
                        } else if (!(this.f94798b == null || this.f94798b.get() == null || ((Fragment) this.f94798b.get()).getActivity() == null)) {
                            ((Fragment) this.f94798b.get()).getActivity().overridePendingTransition(R.anim.bm, R.anim.bv);
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public final C37137a mo76413a(Class<? extends Activity> cls) {
            this.f94800d = cls;
            return this;
        }

        /* renamed from: a */
        public static C37137a m83368a(Activity activity) {
            return new C37137a(activity);
        }

        private C37137a(Activity activity) {
            this.f94797a = new WeakReference<>(activity);
        }
    }
}
