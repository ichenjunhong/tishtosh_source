package com.p683ss.android.ugc.aweme.music.presenter;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.p2425e.C48554c;
import com.p683ss.android.ugc.p2425e.p2426a.C48550e;
import com.p683ss.android.ugc.p2425e.p2427b.C48553b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.w */
public final class C37431w implements C48550e {

    /* renamed from: a */
    private C37400f f95469a;

    /* renamed from: b */
    private C37395a f95470b = new C37395a();

    /* renamed from: c */
    private List<MusicModel> f95471c = new ArrayList();

    /* renamed from: d */
    private String f95472d;

    /* renamed from: e */
    private C48554c f95473e = new C48554c();

    /* renamed from: f */
    private boolean f95474f;

    /* renamed from: a */
    public final boolean mo76939a() {
        return this.f95470b.f95407a;
    }

    /* renamed from: b */
    public final void mo76940b() {
        this.f95469a = null;
        this.f95473e.mo96050a();
    }

    /* renamed from: a */
    public final void mo76935a(int i) {
        this.f95474f = false;
        if (this.f95469a != null) {
            this.f95469a.mo50856a(null, false);
        }
    }

    public C37431w(C37400f fVar) {
        this.f95469a = fVar;
        C48554c cVar = this.f95473e;
        if (cVar.f122009a != null) {
            cVar.f122009a.f122023b = this;
        }
        this.f95474f = false;
    }

    /* renamed from: a */
    public final void mo76937a(String str, boolean z) {
        if (!this.f95474f && this.f95470b.f95407a) {
            this.f95474f = true;
            this.f95473e.mo96056a(this.f95472d, this.f95470b.mo76905a(this.f95472d, true, str, z), true);
        }
    }

    /* renamed from: a */
    public final void mo76936a(String str, String str2, boolean z) {
        this.f95474f = true;
        this.f95473e.mo96056a(str, this.f95470b.mo76905a(str, false, str2, z), false);
        this.f95472d = str;
    }

    /* renamed from: a */
    public final synchronized void mo76938a(ArrayList<C48553b> arrayList, String str, int i, boolean z) {
        this.f95474f = false;
        ArrayList a = this.f95470b.mo76906a(str);
        if (!C9376b.m18558a((Collection<T>) a)) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                MusicModel musicModel = (MusicModel) it.next();
                if (musicModel != null) {
                    musicModel.setSearchKeyWords(this.f95472d);
                }
            }
        }
        if (!z) {
            this.f95471c.clear();
        }
        if (a != null) {
            this.f95471c.addAll(a);
        }
        if (this.f95469a != null) {
            C37400f fVar = this.f95469a;
            List<MusicModel> list = this.f95471c;
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            if (list != null) {
                for (MusicModel musicModel2 : list) {
                    if (!(musicModel2 == null || musicModel2.getMusic() == null || !hashSet.add(musicModel2.getMusic().getMid()))) {
                        arrayList2.add(musicModel2);
                    }
                }
            }
            fVar.mo50856a(arrayList2, z);
        }
    }
}
