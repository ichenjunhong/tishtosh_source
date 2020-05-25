package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel */
public final class InteractStickerViewModel extends C0209x {

    /* renamed from: a */
    public C0184k f113049a;

    /* renamed from: b */
    private final HashMap<String, Object> f113050b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, C23275b<C23274a>> f113051c = new HashMap<>();

    /* renamed from: d */
    private Thread f113052d;

    /* renamed from: e */
    private final Handler f113053e = new Handler(Looper.getMainLooper());

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel$a */
    static final class C44688a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InteractStickerViewModel f113054a;

        /* renamed from: b */
        final /* synthetic */ String f113055b;

        /* renamed from: c */
        final /* synthetic */ Object f113056c;

        C44688a(InteractStickerViewModel interactStickerViewModel, String str, Object obj) {
            this.f113054a = interactStickerViewModel;
            this.f113055b = str;
            this.f113056c = obj;
        }

        public final void run() {
            this.f113054a.mo90667a(this.f113055b, this.f113056c);
        }
    }

    public final void onCleared() {
        this.f113050b.clear();
        this.f113051c.clear();
        this.f113049a = null;
    }

    /* renamed from: a */
    private final boolean m97740a() {
        if (this.f113052d == null) {
            this.f113052d = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == this.f113052d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final <T> T mo90668a(String str) {
        C52711k.m112240b(str, "key");
        T t = this.f113050b.get(str);
        if (t != null) {
            return t;
        }
        return null;
    }

    /* renamed from: a */
    public final InteractStickerViewModel mo90667a(String str, Object obj) {
        C52711k.m112240b(str, "key");
        if (!m97740a()) {
            this.f113053e.post(new C44688a(this, str, obj));
            return this;
        }
        this.f113050b.put(str, obj);
        C23275b bVar = (C23275b) this.f113051c.get(str);
        if (bVar != null) {
            bVar.setValue(new C23274a(str, obj));
        }
        return this;
    }

    /* renamed from: a */
    public final InteractStickerViewModel mo90666a(String str, C0199s<C23274a> sVar) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(sVar, "observer");
        C52711k.m112240b(str, "key");
        if (TextUtils.isEmpty(str) || sVar == null) {
            return this;
        }
        C23275b bVar = (C23275b) this.f113051c.get(str);
        if (bVar == null) {
            bVar = new C23275b();
            if (this.f113050b.containsKey(str)) {
                bVar.setValue(new C23274a(str, this.f113050b.get(str)));
            }
            this.f113051c.put(str, bVar);
        }
        C0184k kVar = this.f113049a;
        if (kVar == null) {
            C52711k.m112234a();
        }
        bVar.mo48247a(kVar, sVar, false);
        return this;
    }
}
