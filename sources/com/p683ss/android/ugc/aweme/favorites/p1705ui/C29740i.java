package com.p683ss.android.ugc.aweme.favorites.p1705ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1411c.C23481a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.favorites.adapter.C29671c;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29691e;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.model.MusicCategory;
import com.p683ss.android.ugc.aweme.music.p1975c.C37351d;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37518aw;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37625m;
import com.p683ss.android.ugc.aweme.music.presenter.C37411m;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47875fa;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.i */
public final class C29740i extends C29716a implements C29691e, C37625m {

    /* renamed from: l */
    private C37518aw f77675l;

    /* renamed from: m */
    private MusicModel f77676m;

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo50813a(MusicModel musicModel, Exception exc) {
    }

    public final void aJ_() {
        super.aJ_();
    }

    /* renamed from: g */
    public final MusicModel mo50819g() {
        return this.f77676m;
    }

    /* renamed from: i */
    public final Activity mo50821i() {
        return getActivity();
    }

    /* renamed from: j */
    public final boolean mo50822j() {
        return isViewValid();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final C26840g mo59986o() {
        return new C29671c(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo59985n() {
        if (this.f77639k != null) {
            this.f77639k.mo54799a(new C37411m());
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.f77675l != null) {
            this.f77675l.f95726n = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo59983k() {
        if (this.f77639k != null) {
            this.f77639k.mo44934a_(Integer.valueOf(1));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo59984m() {
        if (this.f77639k != null) {
            this.f77639k.mo44934a_(Integer.valueOf(4));
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        if (this.f77675l != null) {
            this.f77675l.mo50911a();
            this.f77675l.mo50916d();
        }
    }

    public final void onPause() {
        super.onPause();
        if (this.f77675l != null) {
            this.f77675l.mo50911a();
            this.f77675l.f95726n = true;
        }
        if (this.f77635c != null) {
            ((C29671c) this.f77635c).mo59930g();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final View mo59989r() {
        if (getActivity() == null) {
            return null;
        }
        View a = C47875fa.m103567a(getActivity(), getContext(), R.string.b1a, R.string.b19);
        if (a != null) {
            return a;
        }
        return super.mo59989r();
    }

    /* renamed from: a */
    public final void mo59958a(MusicModel musicModel) {
        if (musicModel != null) {
            this.f77676m = musicModel;
            this.f77675l.mo77055a(musicModel, 1);
        }
    }

    /* renamed from: b */
    public final void mo59960b(MusicModel musicModel) {
        super.onPause();
        if (this.f77675l != null) {
            this.f77675l.mo50911a();
        }
    }

    @C53771m
    public final void onAntiCrawlerEvent(C23481a aVar) {
        String str = aVar.f62554a;
        if (str != null && str.contains("/aweme/v1/user/music/collect/?")) {
            C47718bf.m103293f(aVar);
            mo59983k();
        }
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z && this.f77635c != null) {
            ((C29671c) this.f77635c).mo59930g();
        }
    }

    @C53771m
    public final void onMusicCollectEvent(C37351d dVar) {
        if (isViewValid()) {
            List items = ((C26875a) this.f77639k.mo54803n()).getItems();
            MusicModel musicModel = dVar.f95312b;
            if (musicModel != null) {
                int size = items.size();
                Music music = musicModel.getMusic();
                if (music != null && music.getCollectStatus() != 1) {
                    if (!(this.f77639k == null || this.f77639k.mo54803n() == null || items == null || items.size() <= 0)) {
                        Iterator it = items.iterator();
                        while (it.hasNext()) {
                            Music music2 = (Music) it.next();
                            if (music2 != null && !TextUtils.isEmpty(music.getMid()) && music.getMid().equals(music2.getMid())) {
                                it.remove();
                            }
                        }
                    }
                    if (size != items.size()) {
                        this.f77635c.notifyDataSetChanged();
                    }
                }
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f77675l.mo50915c();
    }

    /* renamed from: a */
    public final void mo59959a(MusicModel musicModel, int i) {
        if (this.f77675l != null) {
            this.f77675l.f95723k = "music_collection";
            this.f77675l.f95725m = i;
            this.f77675l.f95724l = new MusicCategory("favorite_song");
            this.f77675l.mo77059b(musicModel, 7);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f77675l = new C37518aw(this);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* renamed from: a */
    public final void mo50816a(String str, MusicModel musicModel, String str2) {
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            String uuid = UUID.randomUUID().toString();
            AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C29741j(activity, new Builder().creationId(uuid).shootWay("collection_music").musicPath(str).musicOrigin(str2), musicModel));
            C26890h.m65011a("shoot", new C23089d().mo47829a("creation_id", uuid).mo47829a("enter_from", "personal_homepage").mo47829a("content_source", "shoot").mo47829a("shoot_way", "collection_music").mo47829a("music_id", musicModel.getMusicId()).f61491a);
        }
    }
}
