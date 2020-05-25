package com.p683ss.android.ugc.aweme.choosemusic.p1505d;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.arch.C23268b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37539bh;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.d.o */
final /* synthetic */ class C24859o implements C0011g {

    /* renamed from: a */
    private final C24857m f65778a;

    /* renamed from: b */
    private final WeakReference f65779b;

    /* renamed from: c */
    private final long f65780c;

    C24859o(C24857m mVar, WeakReference weakReference, long j) {
        this.f65778a = mVar;
        this.f65779b = weakReference;
        this.f65780c = j;
    }

    public final Object then(C0013i iVar) {
        C24857m mVar = this.f65778a;
        WeakReference weakReference = this.f65779b;
        long j = this.f65780c;
        if (!(weakReference == null || ((Activity) weakReference.get()) == null)) {
            long currentTimeMillis = System.currentTimeMillis() - j;
            HashMap hashMap = new HashMap();
            hashMap.put("tab_name", "local_song");
            hashMap.put("read_duration", String.valueOf(currentTimeMillis));
            C26890h.m65012a("local_music_read_duration", C37539bh.m83960a(hashMap));
            if (iVar.mo33d()) {
                mVar.f65776a.mo48228a("local_music_list_status", (Object) Integer.valueOf(1));
                C32458a.m75150b("Local Sound", "Load Local Sound Task Failed");
            } else if (iVar.mo26b()) {
                C32458a.m75150b("Local Sound", "Load Local Sound Task Succeed");
                mVar.f65776a.mo48228a("local_music_list_status", (Object) Integer.valueOf(0));
                C23268b bVar = new C23268b();
                bVar.mo48212a("list_data", iVar.mo34e()).mo48212a("list_hasmore", Boolean.valueOf(false)).mo48212a("action_type", Integer.valueOf(1));
                mVar.f65776a.mo48228a("local_music_list_data", (Object) bVar);
            }
        }
        return null;
    }
}
