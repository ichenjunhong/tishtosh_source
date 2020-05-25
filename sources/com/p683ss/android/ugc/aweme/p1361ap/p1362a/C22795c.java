package com.p683ss.android.ugc.aweme.p1361ap.p1362a;

import android.content.Context;
import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.p1361ap.C22817e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.ap.a.c */
public final class C22795c implements C9382a {

    /* renamed from: g */
    private static C22795c f61070g;

    /* renamed from: a */
    Context f61071a;

    /* renamed from: b */
    public final HashMap<String, MediaModel> f61072b = new HashMap<>();

    /* renamed from: c */
    final HashMap<Integer, List<MediaModel>> f61073c = new HashMap<>();

    /* renamed from: d */
    final List<MediaModel> f61074d = new ArrayList();

    /* renamed from: e */
    public final Set<C22798c> f61075e = new HashSet();

    /* renamed from: f */
    final Set<C22797b> f61076f = new HashSet();

    /* renamed from: h */
    private final Set<C22796a> f61077h = new HashSet();

    /* renamed from: com.ss.android.ugc.aweme.ap.a.c$a */
    public interface C22796a {
        /* renamed from: a */
        void mo47278a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.ap.a.c$b */
    public interface C22797b {
        /* renamed from: a */
        void mo47279a(boolean z, int i, List<MediaModel> list);
    }

    /* renamed from: com.ss.android.ugc.aweme.ap.a.c$c */
    public interface C22798c {
        /* renamed from: a */
        void mo47280a();
    }

    /* renamed from: a */
    public static C22795c m56156a() {
        return f61070g;
    }

    public final void handleMsg(Message message) {
    }

    /* renamed from: d */
    public final List<MediaModel> mo47277d() {
        return new ArrayList(this.f61074d);
    }

    /* renamed from: c */
    public final void mo47276c() {
        this.f61074d.clear();
        mo47273b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo47273b() {
        for (C22798c a : this.f61075e) {
            a.mo47280a();
        }
    }

    /* renamed from: a */
    public final void mo47269a(C22796a aVar) {
        this.f61077h.add(aVar);
    }

    /* renamed from: b */
    public final void mo47274b(C22796a aVar) {
        this.f61077h.remove(aVar);
    }

    /* renamed from: b */
    public final void mo47275b(C22797b bVar) {
        this.f61076f.remove(bVar);
    }

    /* renamed from: a */
    public static synchronized void m56157a(Context context) {
        synchronized (C22795c.class) {
            if (f61070g == null) {
                f61070g = new C22795c(context);
            }
        }
    }

    /* renamed from: b */
    public final List<MediaModel> mo47272b(int i) {
        List list = (List) this.f61073c.get(Integer.valueOf(i));
        if (list != null) {
            return new ArrayList(list);
        }
        return new ArrayList();
    }

    private C22795c(Context context) {
        this.f61071a = context;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo47266a(int i) {
        for (C22796a a : this.f61077h) {
            a.mo47278a(i);
        }
    }

    /* renamed from: a */
    public final void mo47270a(C22797b bVar) {
        this.f61076f.add(bVar);
    }

    /* renamed from: a */
    public final void mo47271a(MediaModel mediaModel) {
        if (mediaModel != null) {
            if (!this.f61074d.contains(mediaModel)) {
                this.f61074d.add(mediaModel);
            }
            mo47273b();
        }
    }

    /* renamed from: a */
    public final void mo47268a(int i, int i2, int i3, C22817e eVar) {
        mo47267a(i, 2, i2, i3, eVar);
    }

    /* renamed from: a */
    public void mo47267a(int i, int i2, int i3, int i4, C22817e eVar) {
        C0013i.m16a((Callable<TResult>) new C22799d<TResult>(this, i, i3, i4)).mo20a((C0011g<TResult, TContinuationResult>) new C22800e<TResult,TContinuationResult>(this, i2, i, eVar), C0013i.f25b);
    }
}
