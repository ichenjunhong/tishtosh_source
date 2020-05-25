package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0677p;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.PagerAdapter;
import android.support.p030v4.view.ViewPager;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.ies.C10174a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23279d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.p683ss.android.ugc.aweme.choosemusic.adapter.C24814a;
import com.p683ss.android.ugc.aweme.choosemusic.adapter.C24816b;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24804a;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24806c;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24842a;
import com.p683ss.android.ugc.aweme.choosemusic.p1506e.C24871a;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24955a;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24955a.C24961a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.p1971ab.C37249a;
import com.p683ss.android.ugc.aweme.music.p1975c.C37351d;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37518aw.C37523a;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.trill.R;
import java.util.UUID;
import leakcanary.internal.LeakCanaryFileProvider;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicWithLyricTabFragment */
public class NewMusicWithLyricTabFragment extends NewMusicTabFragment {

    /* renamed from: A */
    private boolean f65915A = true;

    /* renamed from: B */
    private String f65916B = "popular_song";

    /* renamed from: C */
    private Music f65917C;

    /* renamed from: D */
    private boolean f65918D;

    /* renamed from: E */
    private boolean f65919E;

    /* renamed from: F */
    private boolean f65920F;

    /* renamed from: G */
    private boolean f65921G;
    FrameLayout mFrameLayout;
    TextView mTextView;
    ViewPager mVpFragmentContainer;

    /* renamed from: p */
    public MusicModel f65922p;

    /* renamed from: q */
    public C24946t f65923q;

    /* renamed from: r */
    protected C24842a f65924r;

    /* renamed from: s */
    private C23279d f65925s;

    /* renamed from: t */
    private int f65926t;

    /* renamed from: u */
    private String f65927u;

    /* renamed from: v */
    private String f65928v;

    /* renamed from: w */
    private String f65929w;

    /* renamed from: x */
    private boolean f65930x;

    /* renamed from: y */
    private int f65931y;

    /* renamed from: z */
    private int f65932z;

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo50833a() {
        mo50841e();
    }

    /* renamed from: a */
    public final void mo50607a(float f, float f2) {
    }

    public final boolean ap_() {
        return false;
    }

    /* renamed from: b */
    public final void mo50613b(int i, int i2) {
    }

    /* renamed from: g */
    public final MusicModel mo50819g() {
        return this.f65922p;
    }

    /* renamed from: p */
    public final int mo50849p() {
        return this.f65931y;
    }

    /* renamed from: a */
    public final void mo50838a(boolean z) {
        this.f65918D = true;
    }

    /* renamed from: i */
    public final Activity mo50821i() {
        return getActivity();
    }

    /* renamed from: j */
    public final boolean mo50822j() {
        return isViewValid();
    }

    /* renamed from: m */
    public final void mo50845m() {
        if (this.f65888m != null) {
            this.f65888m.mo50911a();
        }
        mo50847o();
    }

    /* renamed from: s */
    private static boolean m60514s() {
        boolean z;
        boolean z2 = false;
        try {
            z = C32816h.m75716b().getEnableLocalMusicEntrance().booleanValue();
        } catch (C10174a unused) {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (C37249a.m83512c() != 0) {
            z2 = true;
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo50841e() {
        mo50842f();
        if (this.f65927u != null) {
            this.f65924r.mo50748a(this.f65927u, false, this.f65928v, this.f65917C);
        } else {
            this.f65924r.mo50749a(false, this.f65928v, this.f65917C, false);
        }
    }

    /* renamed from: n */
    public final C1322a mo50846n() {
        if (this.f65926t == 0) {
            return this.f65923q.mo50874k();
        }
        throw new IllegalStateException("Just has one type of View.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo50847o() {
        C1322a n = mo50846n();
        if (n != null) {
            if (n instanceof C24816b) {
                ((C24816b) n).mo50699b();
                return;
            }
            if (n instanceof C24814a) {
                ((C24814a) n).mo50695b();
            }
        }
    }

    /* renamed from: c */
    public final void mo50737c(int i) {
        this.f65932z = i;
    }

    /* renamed from: a */
    public final void mo50834a(int i) {
        this.f65932z = 0;
    }

    /* renamed from: b */
    public final void mo50734b(MusicModel musicModel) {
        this.f65888m.f95723k = this.f65916B;
        this.f65888m.mo77059b(musicModel, this.f65932z);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("KEY_CURRENT_TAB", this.f65926t);
    }

    /* renamed from: a */
    public final void mo50731a(C37523a aVar) {
        this.f65888m.f95722j = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo50840b(int i) {
        if (i == 0) {
            this.mVpFragmentContainer.setCurrentItem(0);
        }
        this.f65926t = i;
        if (this.f65926t == 0) {
            this.f65932z = 0;
        }
    }

    /* renamed from: a */
    public final void onChanged(C23274a aVar) {
        char c;
        String str = aVar.f62242a;
        if (str.hashCode() == -2080369200 && str.equals("pick_status")) {
            c = 0;
        } else {
            c = 65535;
        }
        if (c == 0) {
            if (((Integer) aVar.mo48246a()).intValue() == 1) {
                mo50844k();
            } else {
                mo50843h();
                this.mFrameLayout.setVisibility(0);
            }
        }
    }

    @C53771m(mo112976b = true)
    public void onMusicCollectEvent(C37351d dVar) {
        if (this.f65883d != null && dVar != null && "music_detail".equals(dVar.f95313c)) {
            C24804a aVar = new C24804a(0, dVar.f95311a, -1, -1, dVar.f95312b);
            this.f65883d.mo48228a("music_collect_status", (Object) aVar);
        }
    }

    /* renamed from: a */
    public final void mo50815a(C24806c cVar) {
        String str = cVar.f65657b;
        MusicModel musicModel = cVar.f65656a;
        if ("follow_type".equals(str)) {
            this.f65924r.mo50746a(musicModel, musicModel.getMusicId(), 1, cVar.f65658c, cVar.f65659d);
            return;
        }
        if ("unfollow_type".equals(str)) {
            this.f65924r.mo50746a(musicModel, musicModel.getMusicId(), 0, cVar.f65658c, cVar.f65659d);
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        boolean z;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("challenge")) {
            this.f65927u = arguments.getString("challenge");
        }
        Music music = null;
        this.f65928v = arguments.getString("first_sticker_music_ids", null);
        this.f65930x = arguments.getBoolean("is_busi_sticker", false);
        this.f65929w = arguments.getString("first_sticker_id", null);
        if (arguments != null) {
            i = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        } else {
            i = 0;
        }
        this.f65931y = i;
        if (arguments != null) {
            music = (Music) arguments.getSerializable("sticker_music");
        }
        this.f65917C = music;
        boolean z2 = true;
        if (arguments == null || !arguments.getBoolean("show_lyric_tip", false)) {
            z = false;
        } else {
            z = true;
        }
        this.f65921G = z;
        this.f65919E = m60514s();
        if (C37249a.m83512c() != 2) {
            z2 = false;
        }
        this.f65920F = z2;
    }

    /* renamed from: a */
    public final void mo50732a(MusicModel musicModel) {
        mo50845m();
    }

    /* renamed from: a */
    public final void mo50733a(MusicModel musicModel, C24803a aVar) {
        this.f65922p = musicModel;
        if (this.f65915A) {
            this.f65888m.f66059c = aVar;
            if (aVar != null && aVar.f65648h) {
                this.f65883d.mo48228a("last_play_music_id", (Object) musicModel.getMusicId());
            }
            this.f65888m.mo50913a(musicModel, this.f65932z, false);
            return;
        }
        this.f65888m.mo77059b(musicModel, this.f65932z);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PagerAdapter pagerAdapter;
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.bar, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        this.mFrameLayout.setVisibility(4);
        TextView textView = this.mTextView;
        if (!this.f65921G) {
            i = 8;
        }
        textView.setVisibility(i);
        this.f65883d = DataCenter.m57235a(C0214z.m438a((Fragment) this), (C0184k) this);
        this.f65883d.mo48226a("pick_status", (C0199s<C23274a>) this).mo48226a("music_collect_status", (C0199s<C23274a>) this);
        this.f65883d.mo48228a("key_choose_music_type", (Object) Integer.valueOf(this.f65931y));
        this.f65883d.mo48228a("sticker_id", (Object) this.f65929w);
        this.f65883d.mo48228a("challenge_id", (Object) this.f65927u);
        this.f65883d.mo48228a("mvtheme_music_type", (Object) Boolean.valueOf(this.f65918D));
        this.f65883d.mo48228a("is_busi_sticker", (Object) Boolean.valueOf(this.f65930x));
        this.f65925s = C23279d.m57256a((Fragment) this, inflate);
        this.f65925s.mo48252a(this.f65883d);
        this.f65924r = new C24842a(getContext(), this.f65883d);
        C0654k childFragmentManager = getChildFragmentManager();
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(R.id.erc);
        sb.append(":0");
        this.f65923q = (C24946t) childFragmentManager.mo2224a(sb.toString());
        if (this.f65923q == null) {
            int i2 = this.f65931y;
            C24946t tVar = new C24946t();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
            tVar.setArguments(bundle2);
            this.f65923q = tVar;
        }
        this.f65888m = new C24955a(this, new C24961a() {
            /* renamed from: a */
            public final void mo50851a() {
                if (NewMusicWithLyricTabFragment.this.f65922p != null) {
                    NewMusicWithLyricTabFragment.this.f65883d.mo48228a("play_compeleted", (Object) NewMusicWithLyricTabFragment.this.f65922p.getMusicId());
                }
            }

            /* renamed from: a */
            public final void mo50852a(int i, int i2) {
                if (NewMusicWithLyricTabFragment.this.f65922p != null) {
                    NewMusicWithLyricTabFragment.this.f65883d.mo48228a("play_error", (Object) NewMusicWithLyricTabFragment.this.f65922p.getMusicId());
                }
            }
        });
        this.f65888m.mo50915c();
        this.f65888m.mo77053a(this.f65931y);
        this.f65882b = new C24871a(getContext());
        boolean z = this.f65919E;
        this.mVpFragmentContainer.setOffscreenPageLimit(1);
        ViewPager viewPager = this.mVpFragmentContainer;
        if (this.f65919E) {
            pagerAdapter = new C0677p(getChildFragmentManager()) {
                public final int getCount() {
                    return 1;
                }

                /* renamed from: a */
                public final Fragment mo2309a(int i) {
                    return NewMusicWithLyricTabFragment.this.f65923q;
                }
            };
        } else {
            pagerAdapter = new C0677p(getChildFragmentManager()) {
                public final int getCount() {
                    return 1;
                }

                /* renamed from: a */
                public final Fragment mo2309a(int i) {
                    return NewMusicWithLyricTabFragment.this.f65923q;
                }
            };
        }
        viewPager.setAdapter(pagerAdapter);
        LayoutParams layoutParams = (LayoutParams) this.mFrameLayout.getLayoutParams();
        layoutParams.topMargin = C23728o.m58241a(44.0d);
        this.mFrameLayout.setLayoutParams(layoutParams);
        mo50840b(this.f65926t);
        mo50833a();
        Activity i3 = mo50821i();
        if (i3 instanceof ChooseMusicActivity) {
            ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = ((ChooseMusicActivity) i3).f65663c;
            if (viewPagerBottomSheetBehavior != null) {
                viewPagerBottomSheetBehavior.mo48762a(this.mVpFragmentContainer);
            }
        }
        return inflate;
    }

    /* renamed from: a */
    public final void mo50816a(String str, MusicModel musicModel, String str2) {
        FragmentActivity activity = getActivity();
        if (mo50849p() == 0 || mo50849p() == 2) {
            Intent intent = new Intent();
            intent.putExtra(LeakCanaryFileProvider.f132050j, str);
            intent.putExtra("music_model", musicModel);
            intent.putExtra("music_origin", str2);
            activity.setResult(-1, intent);
            activity.finish();
            return;
        }
        String string = getArguments().getString("shoot_way");
        Builder builder = new Builder();
        builder.shootWay(string).creationId(UUID.randomUUID().toString()).musicPath(str).musicModel(musicModel).musicOrigin(str2);
        AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C24917ai(activity, builder));
    }
}
