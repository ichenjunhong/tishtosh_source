package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.arch.lifecycle.C0184k;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.arch.C23266a;
import com.p683ss.android.ugc.aweme.arch.C23266a.C23267a;
import com.p683ss.android.ugc.aweme.arch.C23268b;
import com.p683ss.android.ugc.aweme.arch.C23269c;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23278c;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.p683ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24832a;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24842a;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24850f;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24993n;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.trill.R;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.z */
public final class C24953z extends C23526a implements C23267a<MusicCollectionItem>, C24832a<MusicCollectionItem>, C26846a {

    /* renamed from: a */
    protected DataCenter f66050a;

    /* renamed from: b */
    protected C23269c<MusicCollectionItem> f66051b;

    /* renamed from: c */
    protected int f66052c;

    /* renamed from: d */
    private C24842a f66053d;

    /* renamed from: e */
    private C23266a f66054e;

    /* renamed from: j */
    private final int f66055j = 20;

    /* renamed from: c */
    public final String mo48208c() {
        return "music_sheet_list";
    }

    /* renamed from: d */
    public final String mo48209d() {
        return "refresh_status_music_sheet";
    }

    /* renamed from: e */
    public final String mo48210e() {
        return "loadmore_status_music_sheet";
    }

    /* renamed from: f */
    public final DataCenter mo48211f() {
        this.f66050a = DataCenter.m57235a(C23278c.m57253a((Fragment) this), (C0184k) this);
        return this.f66050a;
    }

    /* renamed from: q */
    public final void mo50729q() {
        if (this.f66053d != null) {
            this.f66053d.mo50745a(0, 20);
        }
    }

    /* renamed from: r */
    public final void mo50730r() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    /* renamed from: a */
    public final void mo48207a() {
        this.f66053d = new C24842a(getContext(), this.f66050a);
        this.f66053d.mo50745a(0, 20);
    }

    public final void ar_() {
        if (this.f66051b != null) {
            this.f66051b.mo48214a();
        }
        if (this.f66053d != null && this.f66050a != null) {
            Object a = ((C23268b) this.f66050a.mo48229a(mo48208c())).mo48213a("list_cursor");
            int i = 0;
            if (a instanceof Long) {
                i = ((Long) a).intValue();
            } else if (a instanceof Integer) {
                i = ((Integer) a).intValue();
            }
            if (i > 0) {
                ChooseMusicApi.m60387b(i, 20).mo20a((C0011g<TResult, TContinuationResult>) new C24850f<TResult,TContinuationResult>(this.f66053d), C0013i.f25b);
            }
        }
    }

    /* renamed from: a */
    public final C23269c<MusicCollectionItem> mo48206a(View view) {
        C24993n nVar = new C24993n(getContext(), view, this, this, this.f66052c);
        nVar.mTitleBar.setTitle((int) R.string.ceg);
        this.f66051b = nVar;
        return this.f66051b;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 1;
        if (getArguments() != null) {
            i = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        }
        this.f66052c = i;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f66054e == null) {
            this.f66054e = new C23266a(this, this);
        }
        this.f66054e.mo48205a(view, bundle);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo50728a(Object obj, int i) {
        MusicCollectionItem musicCollectionItem = (MusicCollectionItem) obj;
        if (musicCollectionItem != null && !TextUtils.isEmpty(musicCollectionItem.mcId)) {
            Intent intent = new Intent(getContext(), MusicDetailListActivity.class);
            intent.putExtra("music_type", 2);
            intent.putExtra("music_class_id", musicCollectionItem.mcId);
            intent.putExtra("music_class_name", musicCollectionItem.mcName);
            intent.putExtra("music_category_is_hot", musicCollectionItem.isHot);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", this.f66052c);
            intent.putExtra("music_class_enter_method", "click_category_list");
            startActivityForResult(intent, 10001);
            C24963c.m60724a(musicCollectionItem.mcName, "click_category_list", "", "change_music_page_detail", musicCollectionItem.mcId);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.om, viewGroup, false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10001 && i2 == -1) {
            getActivity().setResult(-1, intent);
            getActivity().finish();
        }
    }
}
