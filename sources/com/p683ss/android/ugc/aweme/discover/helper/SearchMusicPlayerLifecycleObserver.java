package com.p683ss.android.ugc.aweme.discover.helper;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0200t;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23208an;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.SearchMusicPlayerLifecycleObserver */
public class SearchMusicPlayerLifecycleObserver implements C0183j {

    /* renamed from: a */
    public FragmentActivity f74005a;

    /* renamed from: b */
    public C45547d f74006b;

    /* renamed from: c */
    private MusicPlayHelper f74007c;

    /* renamed from: d */
    private C0199s f74008d = new C0199s<C28197f>() {
        public final /* synthetic */ void onChanged(Object obj) {
            C28197f fVar = (C28197f) obj;
            if (fVar != null) {
                switch (fVar.f74025a) {
                    case 1:
                        if (SearchMusicPlayerLifecycleObserver.this.f74006b == null) {
                            SearchMusicPlayerLifecycleObserver.this.f74006b = C45547d.m99208b(SearchMusicPlayerLifecycleObserver.this.f74005a, SearchMusicPlayerLifecycleObserver.this.f74005a.getResources().getString(R.string.cds));
                        }
                        SearchMusicPlayerLifecycleObserver.this.f74006b.setIndeterminate(false);
                        return;
                    case 2:
                        if (SearchMusicPlayerLifecycleObserver.this.f74006b == null) {
                            SearchMusicPlayerLifecycleObserver.this.f74006b = C45547d.m99208b(SearchMusicPlayerLifecycleObserver.this.f74005a, SearchMusicPlayerLifecycleObserver.this.f74005a.getResources().getString(R.string.cds));
                            SearchMusicPlayerLifecycleObserver.this.f74006b.setIndeterminate(false);
                        }
                        SearchMusicPlayerLifecycleObserver.this.f74006b.setProgress(fVar.f74026b);
                        return;
                    case 3:
                        if (SearchMusicPlayerLifecycleObserver.this.f74006b != null) {
                            SearchMusicPlayerLifecycleObserver.this.f74006b.setProgress(100);
                        }
                        SearchMusicPlayerLifecycleObserver.this.mo56593a();
                        if (!(fVar.f74028d == null || TextUtils.isEmpty(fVar.f74028d.f74052a) || fVar.f74028d.f74053b == null)) {
                            SearchMusicPlayerLifecycleObserver searchMusicPlayerLifecycleObserver = SearchMusicPlayerLifecycleObserver.this;
                            String str = fVar.f74028d.f74052a;
                            MusicModel musicModel = fVar.f74028d.f74053b;
                            C23208an.m56934a("search_result");
                            AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C28205m(searchMusicPlayerLifecycleObserver, new Builder().shootWay("search_result").translationType(3).musicPath(str).musicOrigin("search_result").build(), musicModel));
                            return;
                        }
                    case 4:
                        SearchMusicPlayerLifecycleObserver.this.mo56593a();
                        if (fVar.f74027c > 0) {
                            C10691a.m21542b((Context) SearchMusicPlayerLifecycleObserver.this.f74005a, fVar.f74027c);
                            break;
                        }
                        break;
                }
            }
        }
    };

    /* renamed from: a */
    public final void mo56593a() {
        if (this.f74006b != null) {
            this.f74006b.dismiss();
        }
        this.f74006b = null;
    }

    @C0200t(mo345a = C0177a.ON_CREATE)
    public void onCreate() {
        this.f74007c = (MusicPlayHelper) C0214z.m440a(this.f74005a).mo359a(MusicPlayHelper.class);
        this.f74007c.f73988e.mo48247a(this.f74005a, this.f74008d, false);
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        mo56593a();
        if (this.f74007c != null) {
            this.f74007c.f73988e.removeObserver(this.f74008d);
        }
    }

    public SearchMusicPlayerLifecycleObserver(FragmentActivity fragmentActivity) {
        this.f74005a = fragmentActivity;
    }
}
