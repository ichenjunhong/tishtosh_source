package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.arch.C23269c;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.adapter.C24816b;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24832a;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24833b;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24857m;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.choosemusic.view.BaseMusicListView;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24990k;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.C26990b.C26991a;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.s */
public final class C24943s extends C24908a<MusicModel> implements C24832a<MusicModel>, C26991a {

    /* renamed from: l */
    public static final C24944a f66033l = new C24944a(null);

    /* renamed from: m */
    private C24857m f66034m;

    /* renamed from: n */
    private C24803a f66035n;

    /* renamed from: o */
    private long f66036o;

    /* renamed from: p */
    private HashMap f66037p;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.s$a */
    public static final class C24944a {
        private C24944a() {
        }

        public /* synthetic */ C24944a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.s$b */
    static final class C24945b implements C23364b {

        /* renamed from: a */
        final /* synthetic */ C24943s f66038a;

        C24945b(C24943s sVar) {
            this.f66038a = sVar;
        }

        /* renamed from: a */
        public final void mo40906a(String[] strArr, int[] iArr) {
            if (iArr[0] == 0) {
                this.f66038a.mo50907p();
            }
        }
    }

    /* renamed from: c */
    public final String mo48208c() {
        return "local_music_list_data";
    }

    /* renamed from: d */
    public final String mo48209d() {
        return "local_music_list_status";
    }

    /* renamed from: e */
    public final String mo48210e() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final int mo50875m() {
        return 5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final String mo50876n() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final int mo50877o() {
        return R.layout.on;
    }

    /* renamed from: a */
    public final void mo48207a() {
        super.mo48207a();
        this.f66034m = new C24857m(this.f65964e);
        mo50907p();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f66037p != null) {
            this.f66037p.clear();
        }
    }

    /* renamed from: l */
    public final View mo50471l() {
        if (this.f65965j == null) {
            return null;
        }
        C23269c cVar = this.f65965j;
        if (cVar != null) {
            return ((BaseMusicListView) cVar).mRecyclerView;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.view.BaseMusicListView<*>");
    }

    /* renamed from: q */
    public final void mo50729q() {
        if (this.f66034m != null) {
            C24857m mVar = this.f66034m;
            if (mVar == null) {
                C52711k.m112234a();
            }
            mVar.mo50769a(new WeakReference(getActivity()));
        }
    }

    /* renamed from: r */
    public final void mo50730r() {
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            activity.onBackPressed();
        }
    }

    /* renamed from: p */
    public final void mo50907p() {
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            if (C0726c.m2090a((Context) activity, "android.permission.WRITE_EXTERNAL_STORAGE") != 0 || this.f66034m == null) {
                C23361b.m57419a(getActivity(), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C24945b(this));
                return;
            }
            C24857m mVar = this.f66034m;
            if (mVar == null) {
                C52711k.m112234a();
            }
            mVar.mo50769a(new WeakReference(getActivity()));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f66036o = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C23269c<MusicModel> mo50872b(View view) {
        C52711k.m112240b(view, "view");
        Context context = getContext();
        if (context != null) {
            C52711k.m112236a((Object) context, "ctx");
            C24990k kVar = new C24990k(context, view, this, this, mo50873h());
            kVar.f66157g = this.f66036o;
            kVar.mo50978a((C24833b) this);
            this.f66035n = new C24803a("change_music_page_detail", "local_music", "click_button", C24963c.m60726b());
            C24803a aVar = this.f66035n;
            if (aVar == null) {
                C52711k.m112234a();
            }
            kVar.mo50977a(aVar);
            kVar.mo50979a(false);
            return kVar;
        }
        throw new IllegalStateException("Context is null");
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z && (mo50471l() instanceof RecyclerView)) {
            View l = mo50471l();
            if (l != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((RecyclerView) l).getLayoutManager();
                if (linearLayoutManager != null) {
                    int l2 = linearLayoutManager.mo4751l();
                    C23269c cVar = this.f65965j;
                    C52711k.m112236a((Object) cVar, "mIViewHolder");
                    C26840g d = cVar.mo48219d();
                    if (d != null && (d instanceof C24816b)) {
                        List a = ((C24816b) d).mo50673a();
                        if (!C9376b.m18558a((Collection<T>) a)) {
                            for (int j = linearLayoutManager.mo4749j(); j < l2; j++) {
                                if (j >= 0 && j < a.size()) {
                                    MusicModel musicModel = (MusicModel) a.get(j);
                                    if (musicModel != null) {
                                        C24963c.m60718a(this.f66035n, musicModel.getMusicId(), j, true);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.RecyclerView");
            }
        }
        C23269c cVar2 = this.f65965j;
        if (!(cVar2 instanceof C24990k)) {
            cVar2 = null;
        }
        C24990k kVar = (C24990k) cVar2;
        if (kVar != null) {
            kVar.mo50979a(z);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo50728a(Object obj, int i) {
        C52711k.m112240b((MusicModel) obj, "data");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50871a(String str, MusicModel musicModel, String str2, Activity activity) {
        String str3;
        String str4;
        C52711k.m112240b(str, "musicPath");
        C52711k.m112240b(str2, "musicOrigin");
        C52711k.m112240b(activity, "activity");
        Intent intent = new Intent();
        intent.putExtra(LeakCanaryFileProvider.f132050j, str);
        intent.putExtra("music_model", musicModel);
        intent.putExtra("music_origin", str2);
        String str5 = "local_music_name";
        if (musicModel == null) {
            str3 = "";
        } else {
            str3 = musicModel.getName();
        }
        intent.putExtra(str5, str3);
        String str6 = "local_music_path";
        if (musicModel == null) {
            str4 = "";
        } else {
            str4 = musicModel.getLocalPath();
        }
        intent.putExtra(str6, str4);
        activity.setResult(-1, intent);
        activity.finish();
    }
}
