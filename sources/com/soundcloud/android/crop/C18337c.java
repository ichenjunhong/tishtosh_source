package com.soundcloud.android.crop;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.soundcloud.android.crop.c */
abstract class C18337c extends Activity {

    /* renamed from: a */
    private final ArrayList<C18339b> f50646a = new ArrayList<>();

    /* renamed from: com.soundcloud.android.crop.c$a */
    public static class C18338a implements C18339b {
        /* renamed from: a */
        public void mo36766a(C18337c cVar) {
        }

        /* renamed from: b */
        public void mo36767b(C18337c cVar) {
        }

        /* renamed from: c */
        public void mo36768c(C18337c cVar) {
        }
    }

    /* renamed from: com.soundcloud.android.crop.c$b */
    public interface C18339b {
        /* renamed from: a */
        void mo36766a(C18337c cVar);

        /* renamed from: b */
        void mo36767b(C18337c cVar);

        /* renamed from: c */
        void mo36768c(C18337c cVar);
    }

    C18337c() {
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        Iterator it = this.f50646a.iterator();
        while (it.hasNext()) {
            ((C18339b) it.next()).mo36766a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        Iterator it = this.f50646a.iterator();
        while (it.hasNext()) {
            ((C18339b) it.next()).mo36768c(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        Iterator it = this.f50646a.iterator();
        while (it.hasNext()) {
            ((C18339b) it.next()).mo36767b(this);
        }
    }

    /* renamed from: a */
    public void mo36731a(C18339b bVar) {
        this.f50646a.remove(bVar);
    }

    /* renamed from: b */
    public void mo36733b(C18339b bVar) {
        if (!this.f50646a.contains(bVar)) {
            this.f50646a.add(bVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Iterator it = this.f50646a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
