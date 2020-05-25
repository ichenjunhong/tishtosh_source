package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.animation.ValueAnimator;
import android.arch.lifecycle.C0214z;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Message;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0654k.C0656b;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.app.services.C23165l;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel;
import com.p683ss.android.ugc.aweme.choosemusic.fragment.NewMusicListFragment.C24888b;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24805b;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24807d;
import com.p683ss.android.ugc.aweme.choosemusic.p1504c.C24840c;
import com.p683ss.android.ugc.aweme.choosemusic.p1504c.C24841d;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24866v;
import com.p683ss.android.ugc.aweme.choosemusic.p1513g.C24954a;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24982c;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24983d;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24984e;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24986g;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24987h;
import com.p683ss.android.ugc.aweme.choosemusic.view.ChooseMusicFragmentView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26917n;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.music.adapter.C37292h.C37299a;
import com.p683ss.android.ugc.aweme.music.experiment.SearchSugCompletionExperiment;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.p683ss.android.ugc.aweme.music.p1971ab.C37249a;
import com.p683ss.android.ugc.aweme.music.p1975c.C37349b;
import com.p683ss.android.ugc.aweme.music.p1975c.C37350c;
import com.p683ss.android.ugc.aweme.music.p1977e.C37375a;
import com.p683ss.android.ugc.aweme.music.presenter.C37400f;
import com.p683ss.android.ugc.aweme.music.presenter.C37431w;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import org.greenrobot.eventbus.C53771m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.c */
public final class C24923c extends C23526a implements C0656b, OnClickListener, OnEditorActionListener, C9382a, C24888b, C37400f {

    /* renamed from: A */
    private boolean f65985A;

    /* renamed from: B */
    private MusicModel f65986B;

    /* renamed from: C */
    private boolean f65987C;

    /* renamed from: D */
    private C24866v f65988D;

    /* renamed from: a */
    C37431w f65989a;

    /* renamed from: b */
    public NewMusicTabFragment f65990b;

    /* renamed from: c */
    public boolean f65991c;

    /* renamed from: d */
    ChooseMusicFragmentView f65992d;

    /* renamed from: e */
    public View f65993e;

    /* renamed from: j */
    TextView f65994j;

    /* renamed from: k */
    View f65995k;

    /* renamed from: l */
    boolean f65996l;

    /* renamed from: m */
    public C9381g f65997m = new C9381g(this);

    /* renamed from: n */
    public String f65998n;

    /* renamed from: o */
    public String f65999o;

    /* renamed from: p */
    boolean f66000p;

    /* renamed from: q */
    public MusicSearchStateViewModel f66001q;

    /* renamed from: r */
    public String f66002r;

    /* renamed from: s */
    public String f66003s;

    /* renamed from: t */
    TextWatcher f66004t = new TextWatcher() {
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            String obj = editable.toString();
            C24923c.this.f66002r = obj;
            if (!TextUtils.equals(C24923c.this.f66003s, obj)) {
                C24923c.this.f66003s = obj;
                if (TextUtils.isEmpty(obj)) {
                    ChooseMusicFragmentView chooseMusicFragmentView = C24923c.this.f65992d;
                    chooseMusicFragmentView.mCancelSearch.setVisibility(0);
                    chooseMusicFragmentView.mSearchTextView.setVisibility(4);
                    C24923c.this.mo50886f();
                } else if (C24923c.this.f66001q.mo50682f() != 0) {
                    ChooseMusicFragmentView chooseMusicFragmentView2 = C24923c.this.f65992d;
                    chooseMusicFragmentView2.mCancelSearch.setVisibility(4);
                    chooseMusicFragmentView2.mSearchTextView.setVisibility(0);
                    if (C37249a.m83511b()) {
                        C24923c.this.f65997m.removeMessages(1);
                        Message obtain = Message.obtain();
                        obtain.what = 1;
                        obtain.obj = obj;
                        C24923c.this.f65997m.sendMessageDelayed(obtain, 200);
                        return;
                    }
                    C24923c.this.mo50887g();
                }
            }
        }
    };

    /* renamed from: u */
    private int f66005u;

    /* renamed from: v */
    private String f66006v;

    /* renamed from: w */
    private C37299a f66007w;

    /* renamed from: x */
    private Music f66008x;

    /* renamed from: y */
    private String f66009y;

    /* renamed from: z */
    private String f66010z;

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: h */
    static String m60580h() {
        if (C24954a.m60699b()) {
            return "ad_music";
        }
        return "video_music";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public NewMusicListFragment mo50885e() {
        return (NewMusicListFragment) getChildFragmentManager().mo2222a((int) R.id.zs);
    }

    /* renamed from: f */
    public final void mo50886f() {
        this.f66001q.mo50677a().setValue(Integer.valueOf(1));
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f65997m.removeCallbacksAndMessages(null);
    }

    /* renamed from: g */
    public final void mo50887g() {
        if (!this.f66000p) {
            this.f66001q.mo50678b().setValue(this.f66002r);
            this.f66001q.mo50677a().setValue(Integer.valueOf(2));
        }
    }

    public final void onDestroyView() {
        getChildFragmentManager().mo2233b(this);
        super.onDestroyView();
        if (this.f65989a != null) {
            this.f65989a.mo76940b();
        }
    }

    public final void dismiss() {
        this.f65991c = false;
        ChooseMusicFragmentView chooseMusicFragmentView = this.f65992d;
        chooseMusicFragmentView.mSearchEditView.setText("");
        chooseMusicFragmentView.mMainLayout.setVisibility(0);
        chooseMusicFragmentView.mSearchLayout.setVisibility(8);
        KeyboardUtils.m58184c(chooseMusicFragmentView.mSearchEditView);
        C47718bf.m103288a(new C37349b(true));
        NewMusicListFragment newMusicListFragment = (NewMusicListFragment) getChildFragmentManager().mo2222a((int) R.id.zs);
        if (newMusicListFragment != null) {
            newMusicListFragment.mo50827o();
        }
        try {
            getChildFragmentManager().mo2236d();
        } catch (Exception unused) {
        }
        C47718bf.m103289b(new C37350c(null));
    }

    /* renamed from: a */
    public final void mo2251a() {
        Fragment a = getChildFragmentManager().mo2222a((int) R.id.zs);
        ChooseMusicFragmentView chooseMusicFragmentView = this.f65992d;
        ViewGroup a2 = chooseMusicFragmentView.mo50938a(chooseMusicFragmentView.f66106a.getView());
        if (a != null) {
            chooseMusicFragmentView.mLinearSearch.setVisibility(0);
            chooseMusicFragmentView.mRelativeSearch.setVisibility(8);
            chooseMusicFragmentView.endTextContainer.measure(0, 0);
            int measuredWidth = chooseMusicFragmentView.endTextContainer.getMeasuredWidth();
            LayoutParams layoutParams = chooseMusicFragmentView.mSearchEditTextContainer.getLayoutParams();
            if (chooseMusicFragmentView.f66110e == null) {
                chooseMusicFragmentView.f66110e = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                chooseMusicFragmentView.f66110e.addUpdateListener(new C24986g(chooseMusicFragmentView, measuredWidth, layoutParams));
                chooseMusicFragmentView.f66110e.setDuration(250);
            }
            if (chooseMusicFragmentView.f66110e.isRunning()) {
                chooseMusicFragmentView.f66110e.end();
            }
            chooseMusicFragmentView.f66110e.start();
            if (a2 != null) {
                ViewPagerBottomSheetBehavior.m57784a(a2).mo48766b(a.getView());
            }
        } else {
            int measuredWidth2 = chooseMusicFragmentView.endTextContainer.getMeasuredWidth();
            LayoutParams layoutParams2 = chooseMusicFragmentView.mSearchEditTextContainer.getLayoutParams();
            if (chooseMusicFragmentView.f66111f == null) {
                chooseMusicFragmentView.f66111f = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                chooseMusicFragmentView.f66111f.addUpdateListener(new C24987h(chooseMusicFragmentView, measuredWidth2, layoutParams2));
                chooseMusicFragmentView.f66111f.setDuration(250);
            }
            if (chooseMusicFragmentView.f66111f.isRunning()) {
                chooseMusicFragmentView.f66111f.end();
            }
            chooseMusicFragmentView.f66111f.start();
            if (a2 != null) {
                ViewPagerBottomSheetBehavior.m57784a(a2).mo48766b((View) null);
            }
        }
    }

    @C53771m
    public final void onSugCompletionEvent(C24807d dVar) {
        if (!(!isViewValid() || dVar == null || this.f65992d == null)) {
            this.f65992d.mo50940a((CharSequence) dVar.f65660a);
            this.f65992d.mo50939a();
        }
    }

    public final void handleMsg(Message message) {
        if (message.what == 1) {
            m60579a(new C24866v().mo50771a(1).mo50774b("normal_search").mo50772a((String) message.obj).mo50773a(true));
        }
    }

    @C53771m
    public final void onInnerMusicSearchEvent(C24805b bVar) {
        if (isViewValid() && bVar != null) {
            m60579a(bVar.f65655a);
            if (this.f66000p && bVar.f65655a.f65799b == 2) {
                C24963c.m60722a(bVar.f65655a.f65800c, "history");
            }
        }
    }

    /* renamed from: a */
    private void m60579a(C24866v vVar) {
        if (isViewValid() && vVar != null && !TextUtils.isEmpty(vVar.f65800c)) {
            this.f65988D = vVar;
            this.f66001q.mo50679c().setValue(vVar);
            this.f66001q.mo50677a().setValue(Integer.valueOf(0));
            if (this.f65992d != null) {
                this.f65992d.mo50940a((CharSequence) vVar.f65800c);
            }
            NewMusicListFragment e = mo50885e();
            if (!vVar.f65801d) {
                KeyboardUtils.m58184c(this.f65995k);
                if (e != null) {
                    e.mo50820h();
                }
                if (this.f66000p) {
                    C24840c.m60407c().mo50743b(new MusicSearchHistory(vVar.f65800c));
                } else {
                    C24841d.m60410c().mo50743b(new MusicSearchHistory(vVar.f65800c));
                }
            }
            if (e != null) {
                e.mo50826n();
            }
            this.f65989a.mo76936a(vVar.f65800c, m60580h(), this.f66000p);
            C47718bf.m103289b(new C37350c("search_result"));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f66005u = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            this.f66006v = getArguments().getString("challenge");
            this.f65998n = getArguments().getString("creation_id");
            this.f65999o = getArguments().getString("shoot_way");
            this.f66007w = (C37299a) getArguments().getSerializable("music_style");
            this.f66008x = (Music) getArguments().getSerializable("sticker_music");
            this.f66009y = getArguments().getString("first_sticker_music_ids", null);
            this.f65985A = getArguments().getBoolean("is_busi_sticker", false);
            this.f66010z = getArguments().getString("first_sticker_id", null);
            this.f65986B = (MusicModel) getArguments().getSerializable("music_model");
            this.f65996l = getArguments().getBoolean("music_allow_clear", false);
            this.f66000p = getArguments().getBoolean("has_lyric", false);
            this.f65987C = getArguments().getBoolean("show_lyric_tip", false);
        }
        this.f66001q = (MusicSearchStateViewModel) C0214z.m440a(getActivity()).mo359a(MusicSearchStateViewModel.class);
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.cdv) {
            if (AccountService.createIAccountServicebyMonsterPlugin().userService().isChildrenMode()) {
                C10691a.m21548c(getContext(), (int) R.string.a2a).mo19066a();
                return;
            }
            this.f65991c = true;
            C0654k childFragmentManager = getChildFragmentManager();
            NewMusicListFragment newMusicListFragment = (NewMusicListFragment) childFragmentManager.mo2222a((int) R.id.zs);
            if (newMusicListFragment == null) {
                int i = this.f66005u;
                C37299a aVar = this.f66007w;
                boolean z = this.f66000p;
                NewMusicListFragment newMusicListFragment2 = new NewMusicListFragment();
                Bundle bundle = new Bundle();
                bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
                bundle.putSerializable("music_style", aVar);
                bundle.putBoolean("has_lyric", z);
                newMusicListFragment2.setArguments(bundle);
                newMusicListFragment2.f65861l = 2;
                newMusicListFragment2.f65869t = new C24927d(this);
                newMusicListFragment2.f65867r = new C24928e(this);
                C0679r a = childFragmentManager.mo2225a();
                a.mo2176a(R.id.zs, newMusicListFragment2, "search_result_list_tag");
                a.mo2179a((String) null);
                a.mo2195c();
                newMusicListFragment = newMusicListFragment2;
            }
            newMusicListFragment.f65868s = new C24929f(this);
            newMusicListFragment.f65860k = this;
            this.f65992d.mo50939a();
            ChooseMusicFragmentView chooseMusicFragmentView = this.f65992d;
            if (chooseMusicFragmentView.mSearchLayout != null) {
                chooseMusicFragmentView.mSearchLayout.setVisibility(0);
                chooseMusicFragmentView.mMainLayout.setVisibility(8);
                chooseMusicFragmentView.mCancelSearch.setVisibility(0);
                chooseMusicFragmentView.mSearchTextView.setVisibility(4);
            }
            this.f65990b.mo50845m();
            C24963c.m60734f();
        } else if (view.getId() == R.id.dfd) {
            m60579a(new C24866v().mo50772a(this.f66002r).mo50774b("normal_search").mo50771a(1));
            if (this.f66000p) {
                C24963c.m60722a(this.f65992d.mo50941b(), "new");
            }
        } else if (view.getId() == R.id.dff) {
            dismiss();
        } else {
            if (view.getId() != R.id.cdx) {
                if (view.getId() == R.id.ik) {
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        activity.onBackPressed();
                    }
                } else if (view.getId() == R.id.cp5) {
                    FragmentActivity activity2 = getActivity();
                    if (this.f66005u == 0) {
                        activity2.onBackPressed();
                        return;
                    }
                    C18898c.m46009a(getActivity(), "music_skip", "music_library");
                    if (activity2 != null) {
                        Builder builder = new Builder();
                        builder.keepChallenge(true);
                        AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C24930g(activity2, builder));
                    }
                } else if (view.getId() == R.id.u5) {
                    FragmentActivity activity3 = getActivity();
                    if (activity3 != null) {
                        C23361b.m57419a(activity3, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C24931h(activity3));
                    }
                }
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        NewMusicTabFragment newMusicTabFragment;
        View view2 = view;
        super.onViewCreated(view, bundle);
        this.f65989a = new C37431w(this);
        C0654k childFragmentManager = getChildFragmentManager();
        Fragment a = childFragmentManager.mo2222a((int) R.id.zt);
        if (a != null) {
            this.f65990b = (NewMusicTabFragment) a;
        } else {
            int i = this.f66005u;
            String str = this.f66006v;
            Music music = this.f66008x;
            String str2 = this.f66009y;
            String str3 = this.f66010z;
            boolean z = this.f65985A;
            boolean z2 = this.f66000p;
            boolean z3 = this.f65987C;
            String str4 = this.f65999o;
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
            if (!TextUtils.isEmpty(str)) {
                bundle2.putString("challenge", str);
            }
            if (music != null) {
                bundle2.putSerializable("sticker_music", music);
            }
            if (str2 != null) {
                bundle2.putString("first_sticker_music_ids", str2);
            }
            if (str3 != null) {
                bundle2.putString("first_sticker_id", str3);
            }
            bundle2.putBoolean("is_busi_sticker", z);
            bundle2.putBoolean("show_lyric_tip", z3);
            if (z2) {
                newMusicTabFragment = new NewMusicWithLyricTabFragment();
            } else {
                newMusicTabFragment = new NewMusicTabFragment();
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle2.putString("shoot_way", str4);
            }
            newMusicTabFragment.setArguments(bundle2);
            this.f65990b = newMusicTabFragment;
            this.f65990b.mo50834a(0);
            if (this.f65986B != null && this.f65986B.isMvThemeMusic()) {
                this.f65990b.mo50838a(true);
            }
            C0679r a2 = childFragmentManager.mo2225a();
            a2.mo2175a((int) R.id.zt, (Fragment) this.f65990b);
            a2.mo2195c();
        }
        if (this.f65996l) {
            this.f65993e = view2.findViewById(R.id.qc);
            this.f65994j = (TextView) view2.findViewById(R.id.a2o);
            this.f65995k = view2.findViewById(R.id.qd);
        }
        getChildFragmentManager().mo2230a((C0656b) this);
        ChooseMusicFragmentView chooseMusicFragmentView = this.f65992d;
        chooseMusicFragmentView.mRelativeSearch.setOnClickListener(chooseMusicFragmentView.f66106a);
        if (chooseMusicFragmentView.f66107b == 0) {
            chooseMusicFragmentView.mSkipView.setVisibility(8);
        }
        chooseMusicFragmentView.mSearchEditView.setOnEditorActionListener(chooseMusicFragmentView.f66106a);
        chooseMusicFragmentView.mSearchEditView.addTextChangedListener(chooseMusicFragmentView.f66108c);
        chooseMusicFragmentView.mSearchEditView.setOnTouchListener(new C24982c(chooseMusicFragmentView));
        chooseMusicFragmentView.mSearchEditView.setFilters(new InputFilter[]{new C26917n()});
        chooseMusicFragmentView.mSearchEditTextContainer.setOnClickListener(chooseMusicFragmentView.f66106a);
        chooseMusicFragmentView.mSearchTextView.setOnClickListener(chooseMusicFragmentView.f66106a);
        chooseMusicFragmentView.mCancelSearch.setOnClickListener(chooseMusicFragmentView.f66106a);
        chooseMusicFragmentView.mBackView.setOnClickListener(chooseMusicFragmentView.f66106a);
        chooseMusicFragmentView.mSkipView.setOnClickListener(chooseMusicFragmentView.f66106a);
        chooseMusicFragmentView.txtClickRecommend.setOnClickListener(chooseMusicFragmentView.f66106a);
        chooseMusicFragmentView.mClearView.setOnClickListener(new C24983d(chooseMusicFragmentView));
        chooseMusicFragmentView.mSearchEditView.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                if (TextUtils.isEmpty(editable.toString())) {
                    ChooseMusicFragmentView.this.mClearView.setVisibility(8);
                } else {
                    ChooseMusicFragmentView.this.mClearView.setVisibility(0);
                }
            }
        });
        if (!C24954a.m60699b() || !C37375a.m83684a("show_commerce_tips", Boolean.valueOf(true), "music_sp")) {
            chooseMusicFragmentView.commerceTipsItem.setVisibility(8);
        } else {
            chooseMusicFragmentView.commerceTipsItem.setVisibility(0);
        }
        chooseMusicFragmentView.commerceTipsItem.setUnderView(chooseMusicFragmentView.mMainLayout);
        chooseMusicFragmentView.f66106a.f65990b.f65881a = new C24940p() {
            /* renamed from: a */
            public final void mo50904a() {
                View a = ChooseMusicFragmentView.this.commerceTipsItem.mo50945a(R.id.e37);
                C52711k.m112236a((Object) a, "commerceTipsSpace");
                a.setVisibility(0);
            }

            /* renamed from: b */
            public final void mo50905b() {
                View a = ChooseMusicFragmentView.this.commerceTipsItem.mo50945a(R.id.e37);
                C52711k.m112236a((Object) a, "commerceTipsSpace");
                a.setVisibility(8);
            }
        };
        if (!C37375a.m83684a("show_tcm_info", Boolean.valueOf(true), "music_sp") || C23165l.m56764c().mo47881b() || chooseMusicFragmentView.commerceTipsItem.getVisibility() == 0) {
            chooseMusicFragmentView.starTcmItem.setVisibility(8);
        } else {
            chooseMusicFragmentView.starTcmItem.setVisibility(0);
        }
        chooseMusicFragmentView.starTcmItem.setUnderView(chooseMusicFragmentView.mMainLayout);
        chooseMusicFragmentView.f66106a.f65990b.f65881a = new C24940p() {
            /* renamed from: a */
            public final void mo50904a() {
                ChooseMusicFragmentView.this.starTcmItem.mo50958b();
            }

            /* renamed from: b */
            public final void mo50905b() {
                ChooseMusicFragmentView.this.starTcmItem.mo50957a();
            }
        };
        chooseMusicFragmentView.mSearchLayout.setOnDispatchTouchEventListener(new C24984e(chooseMusicFragmentView, C10181b.m20511a().mo18172a(SearchSugCompletionExperiment.class, true, "search_sug_completion", 31744, false)));
    }

    /* renamed from: a */
    public final void mo50856a(List<MusicModel> list, boolean z) {
        String str;
        String str2;
        String str3;
        Object obj;
        if (isViewValid() && !TextUtils.isEmpty(this.f65992d.mo50941b()) && this.f66001q.mo50682f() == 0) {
            NewMusicListFragment e = mo50885e();
            if (list != null) {
                if (!z) {
                    C23089d a = C23089d.m56640a();
                    C23089d a2 = a.mo47829a("search_type", "music");
                    String str4 = "enter_method";
                    if (this.f65988D != null) {
                        str = this.f65988D.f65798a;
                    } else {
                        str = "normal_search";
                    }
                    C23089d a3 = a2.mo47829a(str4, str);
                    String str5 = "search_keyword";
                    ChooseMusicFragmentView chooseMusicFragmentView = this.f65992d;
                    if (chooseMusicFragmentView.mSearchEditView == null) {
                        str2 = "";
                    } else {
                        str2 = chooseMusicFragmentView.mSearchEditView.getText().toString();
                    }
                    C23089d a4 = a3.mo47829a(str5, str2).mo47829a("creation_id", this.f65998n);
                    String str6 = "enter_from";
                    if (this.f66005u == 0) {
                        str3 = "video_edit_page";
                    } else {
                        str3 = "video_shoot_page";
                    }
                    C23089d a5 = a4.mo47829a(str6, str3).mo47829a("trigger_reason", "cold_launch");
                    String str7 = "log_pb";
                    if (C9376b.m18558a((Collection<T>) list)) {
                        obj = "";
                    } else {
                        obj = ((MusicModel) list.get(0)).getLogPb();
                    }
                    a5.mo47828a(str7, obj);
                    if (C24954a.m60699b()) {
                        a.mo47829a("is_commercial", "1");
                    }
                    C26890h.m65011a("search_music", a.f61491a);
                }
                if (list.size() > 0) {
                    for (MusicModel musicModel : list) {
                        musicModel.setDataType(1);
                        if (musicModel.getMusic() == null) {
                            musicModel.setMusic(musicModel.convertToMusic());
                        }
                    }
                    if (!(e == null || e.f65855b == null)) {
                        e.f65855b.f65706l = this.f65988D;
                        e.f65855b.f65699e = this.f65992d.mo50941b();
                        if (e.f65855b != null && !z) {
                            e.f65855b.mo50699b();
                        }
                        if (e.isViewValid() && e.f65855b != null) {
                            if (z) {
                                e.f65855b.mo50304b(list);
                            } else {
                                e.f65855b.mo50303a(list);
                            }
                            if (e.mListView.getAdapter() != e.f65855b) {
                                e.mListView.setAdapter(e.f65855b);
                            }
                            e.f65862m = list;
                            e.f65861l = 2;
                            if (C9414h.m18630a(list)) {
                                e.mo50823k();
                            } else {
                                e.mo50818f();
                            }
                            if (e.f65858e != null) {
                                e.f65858e.f66176g = true;
                            }
                        }
                        C24963c.f66069a = this.f65992d.mo50941b();
                        if (this.f65989a.mo76939a()) {
                            e.f65855b.ao_();
                        } else {
                            e.f65855b.an_();
                        }
                    }
                } else if (getActivity() != null) {
                    if (!C37249a.m83511b()) {
                        ChooseMusicFragmentView chooseMusicFragmentView2 = this.f65992d;
                        C26894c.m65021a(chooseMusicFragmentView2.f66106a.getActivity(), chooseMusicFragmentView2.mSearchEditView);
                    }
                    if (e != null) {
                        if (C24933j.m60591a(getContext())) {
                            e.mo50823k();
                            if (this.f66000p) {
                                C26890h.m65011a("search_lyricsticker_song_empty", C24963c.m60735g().mo47829a("search_keyword", this.f65992d.mo50941b()).f61491a);
                            }
                        } else {
                            e.mo50824l();
                        }
                    }
                }
            } else if (e != null) {
                e.mo50824l();
            }
        }
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        m60579a(new C24866v().mo50771a(1).mo50774b("normal_search").mo50772a(this.f66002r));
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.oy, viewGroup, false);
        if (this.f66000p) {
            inflate.findViewById(R.id.cdv).setBackgroundResource(R.drawable.cnq);
            ((ImageView) inflate.findViewById(R.id.b3y)).setImageResource(R.drawable.d2w);
            ((TextView) inflate.findViewById(R.id.eua)).setTextColor(Color.parseColor("#57ffffff"));
            inflate.findViewById(R.id.bg8).setBackgroundResource(R.color.a8w);
            inflate.findViewById(R.id.cdx).setBackgroundResource(R.drawable.cnq);
            ((ImageView) inflate.findViewById(R.id.b3z)).setImageResource(R.drawable.d2w);
            EditText editText = (EditText) inflate.findViewById(R.id.dfc);
            editText.setTextColor(Color.parseColor("#ffffff"));
            editText.setHintTextColor(Color.parseColor("#57ffffff"));
            ((ImageView) inflate.findViewById(R.id.az5)).setImageResource(R.drawable.d2v);
            ((TextView) inflate.findViewById(R.id.dff)).setTextColor(Color.parseColor("#ffffff"));
        }
        C24963c.f66071c = this.f65999o;
        C24963c.f66070b = this.f65998n;
        this.f65992d = new ChooseMusicFragmentView(inflate, this, this.f66005u, this.f66004t);
        return inflate;
    }

    /* renamed from: a */
    public final void mo50831a(int i, String str, MusicModel musicModel, String str2) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (i == 0 || i == 2) {
                Intent intent = new Intent();
                intent.putExtra(LeakCanaryFileProvider.f132050j, str);
                intent.putExtra("music_model", musicModel);
                intent.putExtra("music_origin", str2);
                activity.setResult(-1, intent);
                activity.finish();
                return;
            }
            C26890h.m65011a("shoot", C23089d.m56640a().mo47829a("shoot_way", "search_result").f61491a);
            Builder builder = new Builder();
            builder.shootWay("search_result").musicPath(str).musicModel(musicModel).musicOrigin(str2);
            AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C24932i(activity, builder, musicModel));
        }
    }
}
