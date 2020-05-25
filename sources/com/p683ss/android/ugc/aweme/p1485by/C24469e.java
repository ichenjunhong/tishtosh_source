package com.p683ss.android.ugc.aweme.p1485by;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.base.utils.C23727n;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.p1485by.C24465d.C24466a;
import com.p683ss.android.ugc.aweme.setting.p2148ui.SettingNewVersionActivity;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.by.e */
public final class C24469e {

    /* renamed from: a */
    public static final C24469e f64850a = new C24469e();

    /* renamed from: com.ss.android.ugc.aweme.by.e$a */
    public static final class C24470a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52670a f64851a;

        public C24470a(C52670a aVar) {
            this.f64851a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f64851a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.by.e$b */
    public static final class C24471b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52670a f64852a;

        public C24471b(C52670a aVar) {
            this.f64852a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f64852a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.by.e$c */
    public static final class C24472c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ SettingNewVersionActivity f64853a;

        /* renamed from: b */
        final /* synthetic */ HashSet f64854b;

        public C24472c(SettingNewVersionActivity settingNewVersionActivity, HashSet hashSet) {
            this.f64853a = settingNewVersionActivity;
            this.f64854b = hashSet;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C27965f.m66722a((Activity) this.f64853a, "settings_page", "click_setting", (C23505g) new C23505g(this) {

                /* renamed from: a */
                final /* synthetic */ C24472c f64855a;

                {
                    this.f64855a = r1;
                }

                /* renamed from: a */
                public final void mo46280a(Bundle bundle) {
                }

                /* renamed from: a */
                public final void mo46279a() {
                    View findViewById = this.f64855a.f64853a.findViewById(R.id.dry);
                    C52711k.m112236a((Object) findViewById, "activity.findViewById<View>(R.id.view_unlogin)");
                    findViewById.setVisibility(8);
                    if (!this.f64855a.f64854b.isEmpty()) {
                        Iterator it = this.f64855a.f64854b.iterator();
                        while (it.hasNext()) {
                            View view = (View) it.next();
                            C52711k.m112236a((Object) view, "view");
                            view.setVisibility(0);
                        }
                        this.f64855a.f64854b.clear();
                    }
                    C47718bf.m103288a(new C24462b());
                    C23727n.m58239a(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C244731 f64856a;

                        {
                            this.f64856a = r1;
                        }

                        public final void run() {
                            if (!this.f64856a.f64855a.f64853a.isFinishing()) {
                                this.f64856a.f64855a.f64853a.finish();
                            }
                        }
                    }, 500);
                }
            });
            C24466a.m59867a("settings_page", "click_setting");
            return C52860x.f131107a;
        }
    }

    private C24469e() {
    }

    /* renamed from: a */
    public static List<String> m59870a() {
        return C52830p.m112452b(C24463c.f64842b.mo50237a().mo75727c(), new String[]{","}, false, 0, 6, (Object) null);
    }
}
