package com.p683ss.android.ugc.aweme.choosemusic.p1504c;

import com.p683ss.android.ugc.aweme.music.model.MusicSearchHistory;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.a */
public abstract class C24837a implements C24839b {

    /* renamed from: a */
    public int f65734a = -1;

    /* renamed from: b */
    private List<C24838a> f65735b = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.c.a$a */
    public interface C24838a {
        /* renamed from: a */
        void mo50711a(List<MusicSearchHistory> list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo50741a(List<MusicSearchHistory> list);

    /* renamed from: a */
    public final void mo50738a() {
        m60398b((List<MusicSearchHistory>) new ArrayList<MusicSearchHistory>());
    }

    /* renamed from: a */
    public final void mo50739a(C24838a aVar) {
        this.f65735b.add(aVar);
    }

    /* renamed from: b */
    public final void mo50742b(C24838a aVar) {
        this.f65735b.remove(aVar);
    }

    /* renamed from: b */
    private void m60398b(List<MusicSearchHistory> list) {
        for (C24838a a : this.f65735b) {
            a.mo50711a(list);
        }
        mo50741a(list);
    }

    /* renamed from: a */
    public final void mo50740a(MusicSearchHistory musicSearchHistory) {
        List b = mo50744b();
        if (b == null) {
            b = new ArrayList();
        }
        b.remove(musicSearchHistory);
        m60398b(b);
    }

    /* renamed from: b */
    public final void mo50743b(MusicSearchHistory musicSearchHistory) {
        List b = mo50744b();
        if (b == null) {
            b = new ArrayList();
        }
        b.remove(musicSearchHistory);
        b.add(0, musicSearchHistory);
        if (this.f65734a > 0 && b.size() > this.f65734a) {
            b.remove(b.size() - 1);
        }
        m60398b(b);
    }
}
