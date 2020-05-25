package com.bytedance.android.livesdk.p330f;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.android.livesdk.f.h */
public class C6773h extends Fragment {

    /* renamed from: a */
    public static final String f18547a = C6773h.class.getCanonicalName();

    /* renamed from: b */
    public Context f18548b;

    /* renamed from: c */
    public View f18549c;

    /* renamed from: d */
    public Bundle f18550d;

    /* renamed from: e */
    private List<C6767b> f18551e = new CopyOnWriteArrayList();

    /* renamed from: f */
    private int f18552f = 0;

    public void onPause() {
        super.onPause();
        this.f18552f = 4;
        Iterator it = this.f18551e.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void onResume() {
        super.onResume();
        this.f18552f = 3;
        Iterator it = this.f18551e.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void onStart() {
        super.onStart();
        this.f18552f = 2;
        Iterator it = this.f18551e.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void onStop() {
        super.onStop();
        this.f18552f = 5;
        Iterator it = this.f18551e.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void onDestroy() {
        if (this.f18552f != 6) {
            this.f18552f = 6;
            for (C6767b a : this.f18551e) {
                a.mo12901a();
            }
            this.f18551e.clear();
            super.onDestroy();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Iterator it = this.f18551e.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f18552f = 1;
        for (C6767b a : this.f18551e) {
            a.mo12902a(this.f18548b, this.f18549c, this.f18550d);
        }
    }
}
