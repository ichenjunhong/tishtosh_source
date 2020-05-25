package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.arch.C23266a;
import com.p683ss.android.ugc.aweme.arch.C23266a.C23267a;
import com.p683ss.android.ugc.aweme.arch.C23269c;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23278c;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.adapter.C24816b;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24804a;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24806c;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24833b;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24842a;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24955a;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24964d;
import com.p683ss.android.ugc.aweme.music.adapter.C37306l;
import com.p683ss.android.ugc.aweme.music.p1975c.C37351d;
import com.p683ss.android.ugc.aweme.music.p1977e.C37378c;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37518aw.C37523a;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37625m;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.a */
public abstract class C24908a<T> extends C23526a implements C0199s<C23274a>, C23267a<T>, C24833b, C37306l<C24806c>, C37625m {

    /* renamed from: a */
    protected C24955a f65960a;

    /* renamed from: b */
    protected MusicModel f65961b;

    /* renamed from: c */
    public boolean f65962c = true;

    /* renamed from: d */
    protected C24842a f65963d;

    /* renamed from: e */
    public DataCenter f65964e;

    /* renamed from: j */
    protected C23269c<T> f65965j;

    /* renamed from: k */
    protected int f65966k;

    /* renamed from: l */
    private C23266a f65967l;

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo50813a(MusicModel musicModel, Exception exc) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C23269c<T> mo50872b(View view);

    /* renamed from: g */
    public final MusicModel mo50819g() {
        return this.f65961b;
    }

    /* renamed from: h */
    public final int mo50873h() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract int mo50875m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract String mo50876n();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract int mo50877o();

    /* renamed from: i */
    public final Activity mo50821i() {
        return getActivity();
    }

    /* renamed from: j */
    public final boolean mo50822j() {
        return isViewValid();
    }

    /* renamed from: k */
    public C1322a mo50874k() {
        if (this.f65965j != null) {
            return this.f65965j.mo48219d();
        }
        return null;
    }

    public void onResume() {
        super.onResume();
        if (this.f65960a != null) {
            this.f65960a.f95726n = false;
        }
    }

    /* renamed from: a */
    public void mo48207a() {
        this.f65963d = new C24842a(getContext(), this.f65964e);
    }

    /* renamed from: f */
    public DataCenter mo48211f() {
        if (this.f65964e == null) {
            this.f65964e = DataCenter.m57235a(C23278c.m57253a((Fragment) this), (C0184k) this);
        }
        this.f65964e.mo48226a("music_collect_status", (C0199s<C23274a>) this);
        return this.f65964e;
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f65960a != null) {
            this.f65960a.mo50911a();
            this.f65960a.mo50916d();
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f65960a != null) {
            this.f65960a.mo50911a();
            this.f65960a.f95726n = true;
        }
        C1322a k = mo50874k();
        if (k instanceof C24816b) {
            ((C24816b) k).mo50699b();
        }
    }

    /* renamed from: a */
    public final void mo50731a(C37523a aVar) {
        this.f65960a.f95722j = aVar;
    }

    /* renamed from: a */
    public final C23269c<T> mo48206a(View view) {
        this.f65965j = mo50872b(view);
        return this.f65965j;
    }

    /* renamed from: b */
    public final void mo50734b(MusicModel musicModel) {
        this.f65960a.f95723k = mo50876n();
        this.f65960a.mo77059b(musicModel, mo50875m());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 1;
        if (getArguments() != null) {
            i = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        }
        this.f65966k = i;
    }

    /* renamed from: a */
    public final void mo50732a(MusicModel musicModel) {
        if (this.f65960a != null) {
            this.f65960a.mo50911a();
        }
    }

    @C53771m(mo112976b = true)
    public void onMusicCollectEvent(C37351d dVar) {
        if (this.f65964e != null && dVar != null && "music_detail".equals(dVar.f95313c)) {
            C24804a aVar = new C24804a(0, dVar.f95311a, -1, -1, dVar.f95312b);
            this.f65964e.mo48228a("music_collect_status", (Object) aVar);
        }
    }

    /* renamed from: a */
    public void onChanged(C23274a aVar) {
        char c;
        int i;
        int i2;
        CollectionType collectionType;
        if (aVar != null) {
            String str = aVar.f62242a;
            if (str.hashCode() == -1635157503 && str.equals("music_collect_status")) {
                c = 0;
            } else {
                c = 65535;
            }
            if (c == 0) {
                C24804a aVar2 = (C24804a) aVar.mo48246a();
                if (!(this.f65965j == null || this.f65965j.mo48219d() == null)) {
                    List a = this.f65965j.mo48219d().mo50673a();
                    if (!C9376b.m18558a((Collection<T>) a)) {
                        if (aVar2.f65650a == 1) {
                            if (a.size() > aVar2.f65652c) {
                                this.f65965j.mo48219d().notifyItemChanged(aVar2.f65652c);
                            }
                        } else if (aVar2.f65652c == -1) {
                            MusicModel a2 = C24964d.m60736a(a, aVar2.f65654e.getMusicId());
                            if (a2 != null) {
                                if (aVar2.f65653d == 1) {
                                    collectionType = CollectionType.COLLECTED;
                                } else {
                                    collectionType = CollectionType.NOT_COLLECTED;
                                }
                                a2.setCollectionType(collectionType);
                                int indexOf = a.indexOf(a2);
                                if (indexOf >= 0 && indexOf < a.size()) {
                                    this.f65965j.mo48219d().notifyItemChanged(indexOf);
                                }
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (getUserVisibleHint()) {
                    if (aVar2.f65650a == 1) {
                        FragmentActivity activity = getActivity();
                        if (aVar2.f65653d == 1) {
                            i2 = R.string.a48;
                        } else {
                            i2 = R.string.wl;
                        }
                        C10691a.m21542b((Context) activity, i2).mo19066a();
                        return;
                    }
                    FragmentActivity activity2 = getActivity();
                    if (aVar2.f65653d == 1) {
                        i = R.string.a4d;
                    } else {
                        i = R.string.wm;
                    }
                    C10691a.m21533a((Context) activity2, i).mo19066a();
                }
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo50815a(Object obj) {
        C24806c cVar = (C24806c) obj;
        String str = cVar.f65657b;
        MusicModel musicModel = cVar.f65656a;
        if ("follow_type".equals(str)) {
            this.f65963d.mo50746a(musicModel, musicModel.getMusicId(), 1, cVar.f65658c, cVar.f65659d);
            return;
        }
        if ("unfollow_type".equals(str)) {
            this.f65963d.mo50746a(musicModel, musicModel.getMusicId(), 0, cVar.f65658c, cVar.f65659d);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f65967l == null) {
            this.f65967l = new C23266a(this, this);
        }
        this.f65967l.mo48205a(view, bundle);
        this.f65960a = new C24955a(this);
        this.f65960a.mo50915c();
        this.f65960a.mo77053a(this.f65966k);
        C1322a k = mo50874k();
        if (k instanceof C24816b) {
            this.f65960a.f66059c = ((C24816b) k).f65700f;
        }
    }

    /* renamed from: a */
    public final void mo50733a(MusicModel musicModel, C24803a aVar) {
        this.f65961b = musicModel;
        if (this.f65962c) {
            this.f65960a.mo77055a(musicModel, mo50875m());
        } else {
            this.f65960a.mo77059b(musicModel, mo50875m());
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(mo50877o(), viewGroup, false);
    }

    /* renamed from: a */
    public final void mo50816a(String str, MusicModel musicModel, String str2) {
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            C37378c.m83698a(musicModel);
            AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().setCurMusic(musicModel, Boolean.valueOf(true));
            mo50871a(str, musicModel, str2, activity);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo50871a(String str, MusicModel musicModel, String str2, Activity activity) {
        if (this.f65966k == 1) {
            Builder builder = new Builder();
            builder.musicOrigin(str2).musicModel(musicModel).musicPath(str);
            AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C24922b(activity, builder));
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(LeakCanaryFileProvider.f132050j, str);
        intent.putExtra("music_model", musicModel);
        intent.putExtra("music_origin", str2);
        activity.setResult(-1, intent);
        activity.finish();
    }
}
