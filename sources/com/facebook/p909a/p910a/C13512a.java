package com.facebook.p909a.p910a;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C14533n;
import com.facebook.p909a.C13581g;
import com.facebook.p909a.p910a.p911a.C13516a;
import com.facebook.p909a.p910a.p911a.C13523e;
import com.facebook.p909a.p912b.C13551b;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.a.a.a */
public class C13512a {

    /* renamed from: a */
    private static final String f35262a = C13512a.class.getCanonicalName();

    /* renamed from: com.facebook.a.a.a$a */
    public static class C13514a implements OnClickListener {

        /* renamed from: a */
        public boolean f35263a;

        /* renamed from: b */
        private C13516a f35264b;

        /* renamed from: c */
        private WeakReference<View> f35265c;

        /* renamed from: d */
        private WeakReference<View> f35266d;

        /* renamed from: e */
        private OnClickListener f35267e;

        public final void onClick(View view) {
            if (this.f35267e != null) {
                this.f35267e.onClick(view);
            }
            final String str = this.f35264b.f35271a;
            final Bundle a = C13527c.m27348a(this.f35264b, (View) this.f35266d.get(), (View) this.f35265c.get());
            if (a.containsKey("_valueToSum")) {
                a.putDouble("_valueToSum", C13551b.m27370a(a.getString("_valueToSum")));
            }
            a.putString("_is_fb_codeless", "1");
            C14533n.m29771e().execute(new Runnable() {
                public final void run() {
                    C13581g.m27415a(C14533n.m29773g());
                }
            });
        }

        private C13514a(C13516a aVar, View view, View view2) {
            if (aVar != null && view != null && view2 != null) {
                this.f35267e = C13523e.m27338d(view2);
                this.f35264b = aVar;
                this.f35265c = new WeakReference<>(view2);
                this.f35266d = new WeakReference<>(view);
                this.f35263a = true;
            }
        }
    }

    /* renamed from: a */
    public static C13514a m27325a(C13516a aVar, View view, View view2) {
        return new C13514a(aVar, view, view2);
    }
}
