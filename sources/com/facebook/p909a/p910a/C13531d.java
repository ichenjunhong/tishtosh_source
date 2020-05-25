package com.facebook.p909a.p910a;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.facebook.C14533n;
import com.facebook.p909a.C13581g;
import com.facebook.p909a.p910a.p911a.C13516a;
import com.facebook.p909a.p910a.p911a.C13523e;
import com.facebook.p909a.p912b.C13551b;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.a.a.d */
public class C13531d {

    /* renamed from: a */
    private static final String f35327a = C13531d.class.getCanonicalName();

    /* renamed from: com.facebook.a.a.d$a */
    public static class C13532a implements OnTouchListener {

        /* renamed from: a */
        public boolean f35328a;

        /* renamed from: b */
        private C13516a f35329b;

        /* renamed from: c */
        private WeakReference<View> f35330c;

        /* renamed from: d */
        private WeakReference<View> f35331d;

        /* renamed from: e */
        private OnTouchListener f35332e;

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1 && this.f35329b != null) {
                final String str = this.f35329b.f35271a;
                final Bundle a = C13527c.m27348a(this.f35329b, (View) this.f35331d.get(), (View) this.f35330c.get());
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
            if (this.f35332e == null || !this.f35332e.onTouch(view, motionEvent)) {
                return false;
            }
            return true;
        }

        public C13532a(C13516a aVar, View view, View view2) {
            if (aVar != null && view != null && view2 != null) {
                this.f35332e = C13523e.m27339e(view2);
                this.f35329b = aVar;
                this.f35330c = new WeakReference<>(view2);
                this.f35331d = new WeakReference<>(view);
                this.f35328a = true;
            }
        }
    }

    /* renamed from: a */
    public static C13532a m27360a(C13516a aVar, View view, View view2) {
        return new C13532a(aVar, view, view2);
    }
}
