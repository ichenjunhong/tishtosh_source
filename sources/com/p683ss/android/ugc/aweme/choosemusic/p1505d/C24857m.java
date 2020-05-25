package com.p683ss.android.ugc.aweme.choosemusic.p1505d;

import android.app.Activity;
import android.content.Context;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.music.p1977e.C37378c;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;
import p001a.C0027j;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.d.m */
public final class C24857m {

    /* renamed from: a */
    DataCenter f65776a;

    public C24857m(DataCenter dataCenter) {
        this.f65776a = dataCenter;
    }

    /* renamed from: a */
    public final void mo50769a(WeakReference<Activity> weakReference) {
        m60424b(weakReference).mo20a((C0011g<TResult, TContinuationResult>) new C24859o<TResult,TContinuationResult>(this, weakReference, System.currentTimeMillis()), C0013i.f25b);
    }

    /* renamed from: b */
    private static C0013i<List<MusicModel>> m60424b(WeakReference<Activity> weakReference) {
        C0027j jVar = new C0027j();
        C32458a.m75150b("Local Sound", "Start Load Local Sound");
        ArrayList arrayList = new ArrayList();
        if (!(weakReference == null || weakReference.get() == null)) {
            try {
                Context context = (Context) weakReference.get();
                jVar.getClass();
                C37378c.m83697a(context, (List<MusicModel>) arrayList, (IGetInfoCallback<List<MusicModel>>) new C24858n<List<MusicModel>>(jVar));
            } catch (Exception e) {
                C32458a.m75150b("Local Sound", "Scan Music throw a Exception");
                C32458a.m75148a((Throwable) e);
            }
        }
        return jVar.f77a;
    }
}
