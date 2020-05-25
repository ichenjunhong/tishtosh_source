package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout.C0505d;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0654k.C0656b;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.app.services.C23165l;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.choosemusic.activity.OnlineMusicFragmentActivity;
import com.p683ss.android.ugc.aweme.choosemusic.p1513g.C24954a;
import com.p683ss.android.ugc.aweme.choosemusic.view.CommerceTipsItem;
import com.p683ss.android.ugc.aweme.choosemusic.view.StarTcmItem;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26917n;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.music.adapter.C37292h;
import com.p683ss.android.ugc.aweme.music.adapter.C37292h.C37299a;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.p1971ab.C37249a;
import com.p683ss.android.ugc.aweme.music.p1975c.C37349b;
import com.p683ss.android.ugc.aweme.music.p1975c.C37350c;
import com.p683ss.android.ugc.aweme.music.p1977e.C37375a;
import com.p683ss.android.ugc.aweme.music.p1977e.C37378c;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37539bh;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37541bj;
import com.p683ss.android.ugc.aweme.music.p1978ui.MusicListFragment;
import com.p683ss.android.ugc.aweme.music.p1978ui.MusicListFragment.C37471a;
import com.p683ss.android.ugc.aweme.music.p1978ui.MusicListFragment.C37472b;
import com.p683ss.android.ugc.aweme.music.p1978ui.MusicRecommendActivity;
import com.p683ss.android.ugc.aweme.music.presenter.C37400f;
import com.p683ss.android.ugc.aweme.music.presenter.C37431w;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43804f;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.OnlineMusicFragment */
public class OnlineMusicFragment extends C23526a implements C0656b, OnClickListener, C37400f, C37472b {

    /* renamed from: a */
    public C37431w f65937a;

    /* renamed from: b */
    public C37541bj f65938b;

    /* renamed from: c */
    public boolean f65939c;
    View cancelChooseMusicContainer;
    View cancelCurrentChooseMusicTv;
    CommerceTipsItem commerceTipsItem;
    TextView currentChooseMusicNameTv;

    /* renamed from: d */
    public String f65940d;

    /* renamed from: e */
    public String f65941e;

    /* renamed from: j */
    private int f65942j;

    /* renamed from: k */
    private String f65943k;

    /* renamed from: l */
    private C37299a f65944l;
    View llRecommendMusic;

    /* renamed from: m */
    private Music f65945m;
    View mBackView;
    TextView mCancelSearch;
    LinearLayout mLinearSearch;
    View mListViewBackground;
    FrameLayout mMainLayout;
    LinearLayout mRelativeSearch;
    RelativeLayout mSearchBg;
    LinearLayout mSearchEditTextContainer;
    EditText mSearchEditView;
    LinearLayout mSearchLayout;
    TextView mSearchTextView;
    View mSkipView;
    DmtStatusView mStatusView;
    StarTcmItem starTcmItem;
    TextView txtClickRecommend;

    public void onResume() {
        super.onResume();
    }

    public void onDestroyView() {
        getChildFragmentManager().mo2233b(this);
        super.onDestroyView();
        this.f65937a.mo76940b();
    }

    /* renamed from: f */
    private static boolean m60544f() {
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

    /* renamed from: g */
    private void m60545g() {
        if (getActivity() != null) {
            this.mSearchEditView.post(new Runnable() {
                public final void run() {
                    if (OnlineMusicFragment.this.mSearchEditView != null) {
                        OnlineMusicFragment.this.mSearchEditView.requestFocus();
                        C23089d a = C23089d.m56640a();
                        a.mo47829a("label", "popular_song");
                        a.mo47829a("value", "0");
                        a.mo47829a("ext_value", "0");
                        if (C24954a.m60699b()) {
                            a.mo47829a("is_commercial", "1");
                        }
                        C26890h.m65011a("enter_search", a.f61491a);
                        KeyboardUtils.m58182a(OnlineMusicFragment.this.mSearchEditView);
                        C47718bf.m103288a(new C37349b(false));
                    }
                }
            });
        }
    }

    /* renamed from: e */
    public final void mo50858e() {
        if (this.mSearchLayout != null) {
            this.mSearchLayout.setVisibility(8);
            this.mMainLayout.setVisibility(0);
            this.mCancelSearch.setVisibility(0);
            this.mSearchTextView.setVisibility(4);
            this.f65938b.mo77004k();
        }
    }

    /* renamed from: a */
    public final void mo2251a() {
        ViewGroup a = m60543a(getView());
        Fragment a2 = getChildFragmentManager().mo2222a((int) R.id.zs);
        if (a2 != null) {
            this.mLinearSearch.setVisibility(0);
            this.mRelativeSearch.setVisibility(8);
            if (a != null) {
                ViewPagerBottomSheetBehavior.m57784a(a).mo48766b(a2.getView());
            }
        } else {
            this.mLinearSearch.setVisibility(8);
            this.llRecommendMusic.setVisibility(8);
            this.mRelativeSearch.setVisibility(0);
            if (a != null) {
                ViewPagerBottomSheetBehavior.m57784a(a).mo48766b((View) null);
            }
        }
    }

    public void dismiss() {
        this.f65939c = false;
        this.mSearchEditView.setText("");
        this.mSearchTextView.setVisibility(0);
        this.mCancelSearch.setVisibility(4);
        KeyboardUtils.m58184c(this.mSearchEditView);
        C47718bf.m103288a(new C37349b(true));
        MusicListFragment musicListFragment = (MusicListFragment) getChildFragmentManager().mo2222a((int) R.id.zs);
        if (musicListFragment != null) {
            musicListFragment.mo77004k();
        }
        try {
            getChildFragmentManager().mo2236d();
        } catch (Exception unused) {
        }
        C47718bf.m103289b(new C37350c(null));
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    /* renamed from: a */
    private ViewGroup m60543a(View view) {
        while (view != null) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutParams layoutParams = viewGroup.getLayoutParams();
            if ((layoutParams instanceof C0505d) && (((C0505d) layoutParams).f1693a instanceof ViewPagerBottomSheetBehavior)) {
                return viewGroup;
            }
            view = (View) parent;
        }
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f65942j = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0);
            this.f65943k = getArguments().getString("challenge");
            this.f65945m = (Music) getArguments().getSerializable("sticker_music");
            this.f65944l = (C37299a) getArguments().getSerializable("music_style");
            this.f65940d = getArguments().getString("creation_id");
            this.f65941e = getArguments().getString("shoot_way");
        }
    }

    /* renamed from: a */
    public final void mo50855a(String str) {
        String str2;
        if (getActivity() != null) {
            if (C9431p.m18664a(str)) {
                C10691a.m21542b((Context) getActivity(), (int) R.string.ay3).mo19066a();
                return;
            }
            this.mSearchLayout.setVisibility(0);
            this.mMainLayout.setVisibility(8);
            this.mSearchTextView.setVisibility(0);
            this.mCancelSearch.setVisibility(4);
            KeyboardUtils.m58184c(this.mSearchEditView);
            this.mStatusView.mo19212f();
            C37431w wVar = this.f65937a;
            if (C24954a.m60699b()) {
                str2 = "ad_music";
            } else {
                str2 = "video_music";
            }
            wVar.mo76936a(str, str2, false);
            this.f65938b.mo77004k();
            MusicListFragment musicListFragment = (MusicListFragment) getChildFragmentManager().mo2222a((int) R.id.zs);
            if (musicListFragment != null) {
                if (musicListFragment.f95620c != null) {
                    musicListFragment.f95620c.mo76601f();
                }
                musicListFragment.mo77002b(new ArrayList(), 2);
            }
            C47718bf.m103289b(new C37350c("search_result"));
            C26890h.onEvent(MobClick.obtain().setEventName("search").setLabelName("popular_song").setJsonObject(new C23088c().mo47824a("keyword", str).mo47825b()));
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.cdv) {
            if (AccountService.createIAccountServicebyMonsterPlugin().userService().isChildrenMode()) {
                C10691a.m21548c(getContext(), (int) R.string.a2a).mo19066a();
                return;
            }
            this.f65939c = true;
            C0654k childFragmentManager = getChildFragmentManager();
            final MusicListFragment musicListFragment = (MusicListFragment) childFragmentManager.mo2222a((int) R.id.zs);
            if (musicListFragment == null) {
                int i = this.f65942j;
                C37299a aVar = this.f65944l;
                boolean f = m60544f();
                MusicListFragment musicListFragment2 = new MusicListFragment();
                Bundle bundle = new Bundle();
                bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
                bundle.putSerializable("music_style", aVar);
                bundle.putBoolean("show_local_music", f);
                musicListFragment2.setArguments(bundle);
                musicListFragment2.f95623j = 2;
                C0679r a = childFragmentManager.mo2225a();
                a.mo2176a(R.id.zs, musicListFragment2, "search_result_list_tag");
                a.mo2179a((String) null);
                a.mo2195c();
                musicListFragment = musicListFragment2;
            }
            musicListFragment.f95626m = new C37471a() {
                /* renamed from: a */
                public final void mo50864a() {
                    if (OnlineMusicFragment.this.f65937a.mo76939a()) {
                        if (musicListFragment.f95620c != null) {
                            musicListFragment.f95620c.am_();
                        }
                        OnlineMusicFragment.this.f65937a.mo76937a("video_music", false);
                    }
                }
            };
            musicListFragment.f95622e = this;
            m60545g();
            mo50858e();
            this.f65938b.mo77004k();
        } else if (view.getId() == R.id.bfs) {
            dismiss();
        } else if (view.getId() == R.id.dfd) {
            mo50855a(this.mSearchEditView.getText().toString());
        } else if (view.getId() == R.id.dff) {
            dismiss();
        } else if (view.getId() == R.id.cdx) {
            m60545g();
        } else if (view.getId() == R.id.ik) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        } else if (view.getId() == R.id.cp5) {
            FragmentActivity activity2 = getActivity();
            if (this.f65942j == 0) {
                activity2.onBackPressed();
                return;
            }
            C18898c.m46009a(getActivity(), "music_skip", "music_library");
            if (activity2 != null) {
                AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C24919ak(activity2));
            }
        } else {
            if (view.getId() == R.id.u5) {
                final FragmentActivity activity3 = getActivity();
                if (activity3 != null) {
                    C23361b.m57419a(activity3, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C23364b() {
                        /* renamed from: a */
                        public final void mo40906a(String[] strArr, int[] iArr) {
                            if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
                                activity3.startActivity(new Intent(activity3, MusicRecommendActivity.class));
                                C26890h.onEvent(MobClick.obtain().setEventName("recommend_music").setLabelName("music_library_search"));
                            }
                        }
                    });
                }
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C0654k childFragmentManager = getChildFragmentManager();
        Fragment a = childFragmentManager.mo2222a((int) R.id.zt);
        if (a != null) {
            this.f65938b = (C37541bj) a;
        } else {
            int i = this.f65942j;
            String str = this.f65943k;
            Music music = this.f65945m;
            C37299a aVar = this.f65944l;
            boolean f = m60544f();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
            if (!TextUtils.isEmpty(str)) {
                bundle2.putString("challenge", str);
            }
            if (music != null) {
                bundle2.putSerializable("sticker_music", music);
            }
            bundle2.putSerializable("music_style", aVar);
            bundle2.putBoolean("show_local_music", f);
            C37541bj bjVar = new C37541bj();
            bjVar.setArguments(bundle2);
            this.f65938b = bjVar;
            C0679r a2 = childFragmentManager.mo2225a();
            a2.mo2175a((int) R.id.zt, (Fragment) this.f65938b);
            a2.mo2195c();
        }
        this.f65938b.f95619b.observe(this, new C0199s<RecyclerView>() {

            /* renamed from: b */
            private ArrayList<RecyclerView> f65949b = new ArrayList<>();

            public final /* synthetic */ void onChanged(Object obj) {
                RecyclerView recyclerView = (RecyclerView) obj;
                if (recyclerView != null && !this.f65949b.contains(recyclerView)) {
                    this.f65949b.add(recyclerView);
                    recyclerView.mo4801a((C1340m) new C1340m() {
                        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                            super.onScrolled(recyclerView, i, i2);
                            if (recyclerView.computeVerticalScrollOffset() != 0) {
                                OnlineMusicFragment.this.starTcmItem.mo50957a();
                            } else {
                                OnlineMusicFragment.this.starTcmItem.mo50958b();
                            }
                        }
                    });
                }
            }
        });
        getChildFragmentManager().mo2230a((C0656b) this);
        this.f65937a = new C37431w(this);
        this.mRelativeSearch.setOnClickListener(this);
        if (getActivity() != null) {
            final C42482c curMusic = AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().getCurMusic();
            if (curMusic == null) {
                this.cancelChooseMusicContainer.setVisibility(8);
            } else {
                this.cancelChooseMusicContainer.setVisibility(0);
                this.currentChooseMusicNameTv.setText(getActivity().getString(R.string.a2w, new Object[]{curMusic.getMusicName()}));
                this.cancelCurrentChooseMusicTv.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        FragmentActivity activity = OnlineMusicFragment.this.getActivity();
                        if (activity instanceof OnlineMusicFragmentActivity) {
                            ((OnlineMusicFragmentActivity) activity).f65670d = true;
                        }
                        OnlineMusicFragment.this.cancelChooseMusicContainer.setClickable(false);
                        Animation loadAnimation = AnimationUtils.loadAnimation(OnlineMusicFragment.this.getContext(), R.anim.ad);
                        loadAnimation.setAnimationListener(new AnimationListener() {
                            public final void onAnimationRepeat(Animation animation) {
                            }

                            public final void onAnimationStart(Animation animation) {
                            }

                            public final void onAnimationEnd(Animation animation) {
                                OnlineMusicFragment.this.cancelChooseMusicContainer.setVisibility(8);
                            }
                        });
                        OnlineMusicFragment.this.cancelChooseMusicContainer.startAnimation(loadAnimation);
                        C26890h.m65011a("unselect_music", C23089d.m56640a().mo47829a("creation_id", OnlineMusicFragment.this.f65940d).mo47829a("enter_from", "change_music_page").mo47829a("shoot_way", OnlineMusicFragment.this.f65941e).mo47829a("music_id", curMusic.getMusicId()).f61491a);
                        C43804f aVNationalTaskTips = AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().getAVNationalTaskTips();
                        if (aVNationalTaskTips != null && !aVNationalTaskTips.f110929f) {
                            aVNationalTaskTips.f110929f = true;
                        }
                    }
                });
            }
        }
        if (this.f65942j == 0) {
            this.mSkipView.setVisibility(8);
        }
        this.mSearchEditView.setFilters(new InputFilter[]{new C26917n()});
        this.mSearchEditView.setOnEditorActionListener(new OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 3) {
                    return false;
                }
                OnlineMusicFragment.this.mo50855a(OnlineMusicFragment.this.mSearchEditView.getText().toString());
                return true;
            }
        });
        this.mSearchEditView.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                if (C9431p.m18664a(editable.toString())) {
                    OnlineMusicFragment.this.mo50858e();
                    return;
                }
                OnlineMusicFragment.this.mCancelSearch.setVisibility(4);
                OnlineMusicFragment.this.mSearchTextView.setVisibility(0);
            }
        });
        this.mListViewBackground.setOnClickListener(this);
        this.mSearchEditTextContainer.setOnClickListener(this);
        this.mSearchTextView.setOnClickListener(this);
        this.mCancelSearch.setOnClickListener(this);
        this.mBackView.setOnClickListener(this);
        this.mSkipView.setOnClickListener(this);
        this.txtClickRecommend.setOnClickListener(this);
        this.mStatusView.setBuilder(C10719a.m21676a((Context) getActivity()).mo19227a(R.string.f5o, R.string.f5k, R.string.f5u, new C24918aj(this)).mo19225a(R.string.f5w, R.string.ced).mo19233c(0));
        if (!C24954a.m60699b() || !C37375a.m83684a("show_commerce_tips", Boolean.valueOf(true), "music_sp")) {
            this.commerceTipsItem.setVisibility(8);
        } else {
            this.commerceTipsItem.setVisibility(0);
        }
        this.commerceTipsItem.setUnderView(this.mMainLayout);
        if (!C37375a.m83684a("show_tcm_info", Boolean.valueOf(true), "music_sp") || C23165l.m56764c().mo47881b() || this.commerceTipsItem.getVisibility() == 0) {
            this.starTcmItem.setVisibility(8);
        } else {
            this.starTcmItem.setVisibility(0);
        }
        this.starTcmItem.setUnderView(this.mMainLayout);
    }

    /* renamed from: a */
    public final void mo50856a(List<MusicModel> list, boolean z) {
        String str;
        LogPbBean logPbBean;
        if (list == null) {
            this.mStatusView.mo19214h();
        } else if (isViewValid()) {
            C23089d a = C23089d.m56640a().mo47829a("search_type", "music").mo47829a("enter_method", "creation").mo47829a("search_keyword", this.mSearchEditView.getText().toString());
            String str2 = "enter_from";
            if (this.f65942j == 0) {
                str = "video_edit_page";
            } else {
                str = "video_shoot_page";
            }
            C23089d a2 = a.mo47829a(str2, str).mo47829a("trigger_reason", "cold_launch");
            String str3 = "log_pb";
            if (C9376b.m18558a((Collection<T>) list)) {
                logPbBean = null;
            } else {
                logPbBean = ((MusicModel) list.get(0)).getLogPb();
            }
            C23089d a3 = a2.mo47828a(str3, (Object) logPbBean);
            if (C24954a.m60699b()) {
                a3.mo47829a("is_commercial", "1");
            }
            C26890h.m65014b("search_music", C37539bh.m83960a(a3.f61491a));
            if (list.size() > 0) {
                for (MusicModel musicModel : list) {
                    musicModel.setDataType(1);
                    if (musicModel.getMusic() == null) {
                        musicModel.setMusic(musicModel.convertToMusic());
                    }
                }
                MusicListFragment musicListFragment = (MusicListFragment) getChildFragmentManager().mo2222a((int) R.id.zs);
                if (!(musicListFragment == null || musicListFragment.f95620c == null)) {
                    C37292h hVar = musicListFragment.f95620c;
                    String obj = this.mSearchEditView.getText().toString();
                    hVar.f95179a = obj;
                    if (hVar.f95195y != null) {
                        hVar.f95195y.f95161a = obj;
                    }
                    musicListFragment.mo77002b(list, 2);
                    C37378c.f95366a = this.mSearchEditView.getText().toString();
                    if (this.f65937a.mo76939a()) {
                        musicListFragment.f95620c.ao_();
                    } else {
                        musicListFragment.f95620c.an_();
                    }
                }
                this.mStatusView.mo19209d();
            } else {
                if (getActivity() != null) {
                    C26894c.m65021a(getActivity(), this.mSearchEditView);
                    if (C24921am.m60578a(getContext())) {
                        this.mStatusView.mo19213g();
                    } else {
                        this.mStatusView.mo19214h();
                    }
                }
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.oy, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo50854a(MusicListFragment musicListFragment, String str, MusicModel musicModel, String str2) {
        FragmentActivity activity = getActivity();
        if (musicListFragment.mo77006m() == 0 || musicListFragment.mo77006m() == 2) {
            Intent intent = new Intent();
            intent.putExtra(LeakCanaryFileProvider.f132050j, str);
            intent.putExtra("music_model", musicModel);
            intent.putExtra("music_origin", str2);
            activity.setResult(-1, intent);
            activity.finish();
            return;
        }
        C37378c.m83698a(musicModel);
        C26890h.m65011a("shoot", C23089d.m56640a().mo47829a("shoot_way", "search_result").f61491a);
        Builder builder = new Builder();
        builder.shootWay("search_result").musicPath(str).musicModel(musicModel).musicOrigin(str2);
        AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C24920al(activity, builder, musicModel));
    }
}
