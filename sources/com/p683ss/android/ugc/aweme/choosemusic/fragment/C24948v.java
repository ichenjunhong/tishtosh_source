package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.ies.dmt.p664ui.titlebar.AbstractTitleBar;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.imagepipeline.p970j.C14045f;
import com.p683ss.android.ugc.aweme.app.services.C23165l;
import com.p683ss.android.ugc.aweme.arch.C23268b;
import com.p683ss.android.ugc.aweme.arch.C23269c;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24832a;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24833b;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24842a;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24852h;
import com.p683ss.android.ugc.aweme.choosemusic.p1513g.C24954a;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.choosemusic.view.BaseMusicListView;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24992m;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24995p.C24997a;
import com.p683ss.android.ugc.aweme.commercialize.model.C26140t;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.p1971ab.C37249a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.v */
public final class C24948v extends C24908a implements C24832a<Music>, C26846a {

    /* renamed from: l */
    public String f66040l;

    /* renamed from: m */
    C26140t f66041m;

    /* renamed from: n */
    private String f66042n;

    /* renamed from: o */
    private String f66043o;

    /* renamed from: p */
    private boolean f66044p;

    /* renamed from: q */
    private String f66045q;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50728a(Object obj, int i) {
    }

    /* renamed from: c */
    public final String mo48208c() {
        return "music_list";
    }

    /* renamed from: d */
    public final String mo48209d() {
        return "refresh_status_music_list";
    }

    /* renamed from: e */
    public final String mo48210e() {
        return "loadmore_status_music_list";
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final int mo50875m() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final String mo50876n() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final int mo50877o() {
        return R.layout.om;
    }

    /* renamed from: a */
    public final void mo48207a() {
        super.mo48207a();
        this.f65963d.mo50747a(this.f66042n, 0, 30);
    }

    /* renamed from: q */
    public final void mo50729q() {
        if (this.f65963d != null) {
            this.f65963d.mo50747a(this.f66042n, 0, 30);
        }
    }

    /* renamed from: r */
    public final void mo50730r() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    public final void ar_() {
        if (this.f65963d != null && this.f65964e != null) {
            C23268b bVar = (C23268b) this.f65964e.mo48229a(mo48208c());
            if ((this.f65965j instanceof BaseMusicListView) && ((BaseMusicListView) this.f65965j).f66092e) {
                if (this.f65965j != null) {
                    this.f65965j.mo48214a();
                }
                C24842a aVar = this.f65963d;
                String str = this.f66042n;
                int intValue = ((Integer) bVar.mo48213a("list_cursor")).intValue();
                if (!aVar.f65743f) {
                    aVar.f65743f = true;
                    ChooseMusicApi.m60385a(str, intValue, 16).mo20a((C0011g<TResult, TContinuationResult>) new C24852h<TResult,TContinuationResult>(aVar), C0013i.f25b);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C23269c mo50872b(View view) {
        C24992m mVar;
        if (C24954a.m60699b()) {
            mVar = new C24992m(getContext(), view, this, R.string.fx3, this, this, this.f65966k);
        } else {
            mVar = new C24992m(getContext(), view, this, R.string.chg, this, this, this.f65966k);
        }
        mVar.mTitleBar.setTitle((CharSequence) this.f66040l);
        mVar.mo50984a(this.f66044p);
        mVar.mo50983a((C24833b) this);
        C24803a aVar = new C24803a(this.f66043o, this.f66040l, this.f66045q, C24963c.m60726b());
        aVar.f65645e = this.f66042n;
        mVar.mo50982a(aVar);
        mVar.mo50932a((C24997a) new C24951x(this), 10);
        return mVar;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f66042n = arguments.getString("music_class_id");
            this.f66040l = arguments.getString("music_class_name");
            this.f66043o = arguments.getString("music_class_enter_from");
            this.f66044p = arguments.getBoolean("music_class_is_hot", false);
            this.f66045q = arguments.getString("music_class_enter_method");
        }
        this.f66041m = C23165l.m56764c().mo47878a(this.f66042n);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo50909a(int i, int i2) {
        ar_();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f66041m != null && this.f66041m.f69027b != null && C37249a.m83514e() != 0) {
            ((AbstractTitleBar) view.findViewById(R.id.d10)).mo19128a(false);
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.d0x);
            final RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.d0y);
            viewGroup.setVisibility(0);
            C23515d.m57672a(remoteImageView, this.f66041m.f69027b.f69039a, (C13791d<C14045f>) new C13790c<C14045f>() {
                public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                    C14045f fVar = (C14045f) obj;
                    double width = (double) fVar.getWidth();
                    double height = (double) fVar.getHeight();
                    Double.isNaN(width);
                    Double.isNaN(height);
                    double d = width / height;
                    double a = (double) C23728o.m58241a(21.0d);
                    Double.isNaN(a);
                    double d2 = d * a;
                    LayoutParams layoutParams = remoteImageView.getLayoutParams();
                    layoutParams.width = (int) d2;
                    layoutParams.height = (int) a;
                    remoteImageView.setLayoutParams(layoutParams);
                    HashMap hashMap = new HashMap();
                    hashMap.put("enter_from", "change_music_page");
                    hashMap.put("category_name", C24948v.this.f66040l);
                    C26890h.m65011a("show_ad_sticker", (Map<String, String>) hashMap);
                }
            });
            viewGroup.setOnClickListener(new C24950w(this));
        }
    }
}
