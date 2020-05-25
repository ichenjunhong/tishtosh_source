package com.p683ss.android.ugc.aweme.infoSticker;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.design.widget.CoordinatorLayout.C0505d;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.common.net.C26918a;
import com.p683ss.android.ugc.aweme.infoSticker.C35608g.C35609a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.p1484bx.C24453c;
import com.p683ss.android.ugc.aweme.p1484bx.C24454d;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h.C24459a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39567as;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.net.C44332b;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44704c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44709f;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44710g;
import com.p683ss.android.ugc.aweme.sticker.p2300j.C46040a;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46747d;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46747d.C46749a;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabItemView;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.C46784a;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.aweme.utils.C47755ca;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.utils.KeyboardUtils;
import com.p683ss.android.ugc.tools.view.widget.AVStatusView;
import com.p683ss.android.ugc.tools.view.widget.AVStatusView.C50243a;
import com.p683ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import com.p683ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior.C50259a;
import com.p683ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior.C50260b;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53755c;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.InfoStickerViewImpl */
public class InfoStickerViewImpl implements C0183j, C35608g {

    /* renamed from: a */
    public FragmentActivity f91330a;

    /* renamed from: b */
    public C35609a f91331b;

    /* renamed from: c */
    public C46040a f91332c;

    /* renamed from: d */
    public VideoPublishEditModel f91333d;

    /* renamed from: e */
    public boolean f91334e;

    /* renamed from: f */
    public LinearLayout f91335f;

    /* renamed from: g */
    public SearchInfoStickerPresenter f91336g;

    /* renamed from: h */
    public EditText f91337h;

    /* renamed from: i */
    private FrameLayout f91338i;

    /* renamed from: j */
    private View f91339j;

    /* renamed from: k */
    private C35638x f91340k;

    /* renamed from: l */
    private AVDmtTabLayout f91341l;

    /* renamed from: m */
    private C35554aa f91342m;

    /* renamed from: n */
    private ViewPagerBottomSheetBehavior f91343n;

    /* renamed from: o */
    private C35584av f91344o;

    /* renamed from: b */
    public final void mo73926b() {
        if (this.f91332c != null) {
            this.f91332c.mo50223b(new C24453c());
        }
        this.f91343n.mo98151a(5);
        KeyboardUtils.m108325b(this.f91337h, this.f91330a);
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        C35635v.m80462a(this.f91330a).f91353a.f91305c.clear();
        if (C53755c.m114319a().mo112958b((Object) this)) {
            C53755c.m114319a().mo112959c((Object) this);
        }
        this.f91339j = null;
        this.f91330a = null;
    }

    /* renamed from: a */
    public final void mo73924a() {
        this.f91338i.removeAllViews();
        boolean z = true;
        if (this.f91339j == null) {
            this.f91330a.getLifecycle().mo324a(this);
            C53755c.m114319a().mo112955a((Object) this);
            this.f91339j = LayoutInflater.from(this.f91330a).inflate(R.layout.gg, this.f91338i, false);
            FrameLayout frameLayout = (FrameLayout) this.f91339j.findViewById(R.id.csz);
            this.f91341l = (AVDmtTabLayout) this.f91339j.findViewById(R.id.cte);
            this.f91341l.setTabMargin(0);
            this.f91341l.setSupportCustomIndicator(false);
            final ViewPager viewPager = (ViewPager) this.f91339j.findViewById(R.id.ds2);
            if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableSearchGIF)) {
                RelativeLayout relativeLayout = (RelativeLayout) this.f91339j.findViewById(R.id.atu);
                relativeLayout.setVisibility(0);
                this.f91335f = (LinearLayout) this.f91339j.findViewById(R.id.att);
                this.f91337h = (EditText) this.f91339j.findViewById(R.id.dfb);
                TextView textView = (TextView) this.f91339j.findViewById(R.id.dfd);
                this.f91337h.setCursorVisible(false);
                this.f91337h.clearFocus();
                this.f91336g = new SearchInfoStickerPresenter(this.f91339j, this.f91330a);
                SearchInfoStickerPresenter searchInfoStickerPresenter = this.f91336g;
                C35574ap apVar = searchInfoStickerPresenter.f91361b;
                apVar.f91438l = searchInfoStickerPresenter;
                apVar.f91427a = (TextView) apVar.f91439m.findViewById(R.id.dfd);
                apVar.f91432f = (AVStatusView) apVar.f91439m.findViewById(R.id.csv);
                apVar.f91428b = (FrameLayout) apVar.f91439m.findViewById(R.id.cdx);
                apVar.f91429c = (EditText) apVar.f91439m.findViewById(R.id.dfb);
                apVar.f91431e = (FrameLayout) apVar.f91439m.findViewById(R.id.atw);
                apVar.f91433g = (RelativeLayout) apVar.f91439m.findViewById(R.id.cj0);
                apVar.f91430d = (ImageButton) apVar.f91439m.findViewById(R.id.nh);
                apVar.f91429c.setOnEditorActionListener(apVar.f91438l);
                apVar.f91429c.addTextChangedListener(apVar.f91437k);
                apVar.f91428b.setOnClickListener(apVar.f91438l);
                apVar.f91427a.setOnClickListener(apVar.f91438l);
                apVar.f91430d.setOnClickListener(apVar.f91438l);
                apVar.f91432f.setBuilder(C50243a.m108469a((Context) apVar.f91435i).mo98104a(R.string.f5o, R.string.f5k, R.string.f5u, new C35576aq(apVar)).mo98103a(R.string.f5w, R.string.f5x).mo98106b(1));
                apVar.f91442p = new C46749a() {
                    /* renamed from: c */
                    public final void mo73972c(int i) {
                    }

                    /* renamed from: a */
                    public final void mo73970a(int i) {
                        LayoutParams layoutParams = (LayoutParams) C35574ap.this.f91432f.getLayoutParams();
                        layoutParams.bottomMargin = i;
                        C35574ap.this.f91432f.setLayoutParams(layoutParams);
                    }

                    /* renamed from: b */
                    public final void mo73971b(int i) {
                        LayoutParams layoutParams = (LayoutParams) C35574ap.this.f91432f.getLayoutParams();
                        layoutParams.bottomMargin = 0;
                        C35574ap.this.f91432f.setLayoutParams(layoutParams);
                    }
                };
                apVar.f91434h = new C35560ag();
                apVar.f91436j = apVar.f91435i.getSupportFragmentManager();
                searchInfoStickerPresenter.f91361b.f91434h.f91400d = new C35569ak(searchInfoStickerPresenter);
                this.f91336g.f91362c = new C35548a() {
                    /* renamed from: a */
                    public final void mo73930a() {
                        InfoStickerViewImpl.this.f91337h.setCursorVisible(false);
                        InfoStickerViewImpl.this.f91337h.clearFocus();
                        InfoStickerViewImpl.this.f91335f.setVisibility(0);
                        InfoStickerViewImpl.this.mo73925a(false);
                    }
                };
                this.f91342m = new C35554aa(this.f91330a, relativeLayout, textView);
                this.f91337h.setOnTouchListener(new OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        String str;
                        if (motionEvent.getAction() == 1) {
                            InfoStickerViewImpl.this.f91335f.setVisibility(4);
                            SearchInfoStickerPresenter searchInfoStickerPresenter = InfoStickerViewImpl.this.f91336g;
                            if (!searchInfoStickerPresenter.f91363d) {
                                searchInfoStickerPresenter.f91363d = true;
                                C35574ap apVar = searchInfoStickerPresenter.f91361b;
                                apVar.f91429c.post(new C35578as(apVar));
                                apVar.f91431e.setVisibility(0);
                                apVar.f91441o = new C46747d(apVar.f91435i);
                                apVar.f91441o.mo93878a(apVar.f91442p);
                                searchInfoStickerPresenter.mo73940a(0);
                            }
                            InfoStickerViewImpl.this.f91337h.requestFocus();
                            InfoStickerViewImpl.this.f91337h.setCursorVisible(true);
                            InfoStickerViewImpl.this.mo73925a(true);
                            C39567as E = C39629l.m88232a().mo58567E();
                            String str2 = "sticker_search_keyword";
                            C42438az a = new C42438az().mo86526a("creation_id", InfoStickerViewImpl.this.f91333d.creationId).mo86526a("shoot_way", InfoStickerViewImpl.this.f91333d.mShootWay).mo86526a("content_source", InfoStickerViewImpl.this.f91333d.getAvetParameter().getContentSource()).mo86526a("content_type", InfoStickerViewImpl.this.f91333d.getAvetParameter().getContentType());
                            String str3 = "enter_from";
                            if (InfoStickerViewImpl.this.f91334e) {
                                str = "edit_post_page";
                            } else {
                                str = "video_edit_page";
                            }
                            E.mo49430a(str2, a.mo86526a(str3, str).mo86526a("tab_name", "贴图").f107329a);
                        }
                        return false;
                    }
                });
            }
            this.f91340k = new C35638x(this.f91330a.getSupportFragmentManager(), viewPager, this.f91344o);
            this.f91340k.f91596b = this.f91334e;
            viewPager.setAdapter(this.f91340k);
            viewPager.setOffscreenPageLimit(3);
            viewPager.addOnPageChangeListener(new C44710g(this.f91341l));
            this.f91341l.mo90683a(new C44704c() {
                /* renamed from: b */
                public final void mo64264b(C44709f fVar) {
                }

                /* renamed from: c */
                public final void mo64265c(C44709f fVar) {
                }

                /* renamed from: a */
                public final void mo64263a(C44709f fVar) {
                    String str;
                    String str2;
                    C47702b bVar = C47702b.f120193a;
                    String str3 = "click_prop_tab";
                    C42438az a = C42438az.m93209a().mo86523a("scene_id", (int) BaseNotice.CHECK_PROFILE).mo86526a("creation_id", InfoStickerViewImpl.this.f91333d.creationId).mo86526a("shoot_way", InfoStickerViewImpl.this.f91333d.mShootWay).mo86523a("draft_id", InfoStickerViewImpl.this.f91333d.draftId);
                    String str4 = "tab_name";
                    if (fVar.f113161e == 0) {
                        str = "表情";
                    } else {
                        str = "emoji";
                    }
                    C42438az a2 = a.mo86526a(str4, str);
                    String str5 = "enter_from";
                    if (InfoStickerViewImpl.this.f91334e) {
                        str2 = "edit_post_page";
                    } else {
                        str2 = "video_edit_page";
                    }
                    bVar.mo94984a(str3, a2.mo86526a(str5, str2).f107329a);
                    viewPager.setCurrentItem(fVar.f113161e, true);
                }
            });
            C35638x xVar = this.f91340k;
            this.f91341l.mo90692b();
            this.f91341l.setMaxTabModeForCount(xVar.getCount());
            for (int i = 0; i < xVar.getCount(); i++) {
                AVDmtTabLayout aVDmtTabLayout = this.f91341l;
                C44709f a = this.f91341l.mo90678a();
                AVDmtTabItemView a2 = C46784a.m101615a(xVar.f91595a.getContext(), true);
                a2.setText(xVar.f91598d.mo73982a(i));
                a2.setOnClickListener(new C35639y(xVar, i));
                aVDmtTabLayout.mo90684a(a.mo90742a((View) a2));
            }
            viewPager.setCurrentItem(0);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams instanceof C0505d) {
                Behavior behavior = ((C0505d) layoutParams).f1693a;
                if (behavior instanceof ViewPagerBottomSheetBehavior) {
                    this.f91343n = (ViewPagerBottomSheetBehavior) behavior;
                    this.f91343n.f126019k = new C50259a() {
                        /* renamed from: a */
                        public final void mo73929a(View view, int i) {
                            if (i == 4) {
                                if (InfoStickerViewImpl.this.f91332c != null) {
                                    InfoStickerViewImpl.this.f91332c.mo92589e();
                                }
                            } else if (i == 1) {
                                KeyboardUtils.m108325b(InfoStickerViewImpl.this.f91337h, InfoStickerViewImpl.this.f91330a);
                            }
                        }
                    };
                    viewPager.addOnPageChangeListener(new C50260b(viewPager, this.f91343n));
                    this.f91332c = new C46040a(this.f91338i, this.f91339j, frameLayout);
                    this.f91332c.mo50220a((C24458h) new C24459a() {
                        /* renamed from: a */
                        public final void mo50217a() {
                            if (InfoStickerViewImpl.this.f91331b != null) {
                                InfoStickerViewImpl.this.f91331b.mo74015a();
                            }
                            if (InfoStickerViewImpl.this.f91336g != null) {
                                InfoStickerViewImpl.this.f91336g.mo73943a(true);
                            }
                            if (C44332b.m97108b(InfoStickerViewImpl.this.f91330a) && InfoStickerViewImpl.this.f91330a != null) {
                                C35635v.m80462a(InfoStickerViewImpl.this.f91330a).mo73937b();
                            }
                        }

                        /* renamed from: d */
                        public final void mo50225d() {
                            if (InfoStickerViewImpl.this.f91331b != null) {
                                InfoStickerViewImpl.this.f91331b.mo74017b();
                            }
                            if (InfoStickerViewImpl.this.f91336g != null) {
                                InfoStickerViewImpl.this.f91336g.mo73943a(false);
                            }
                            if (InfoStickerViewImpl.this.f91330a != null) {
                                C35635v.m80462a(InfoStickerViewImpl.this.f91330a).mo73935a();
                            }
                        }
                    });
                    this.f91339j.findViewById(R.id.ctg).setOnClickListener(new C47755ca() {
                        /* renamed from: a */
                        public final void mo58980a(View view) {
                            InfoStickerViewImpl.this.f91332c.mo50223b(new C24453c());
                        }
                    });
                    C35635v.m80462a(this.f91330a).mo73938c().observe(this.f91330a, new C0199s<Effect>() {
                        public final /* synthetic */ void onChanged(Object obj) {
                            char c;
                            Effect effect = (Effect) obj;
                            if (InfoStickerViewImpl.this.f91331b != null) {
                                if (effect.getTags().contains("weather")) {
                                    c = 2;
                                } else if (effect.getTags().contains("time")) {
                                    c = 3;
                                } else if (effect.getTags().contains("date")) {
                                    c = 4;
                                } else {
                                    c = 1;
                                }
                                switch (c) {
                                    case 2:
                                        InfoStickerViewImpl.this.f91331b.mo74016a(effect, String.valueOf(C35635v.m80462a(InfoStickerViewImpl.this.f91330a).f91354b));
                                        return;
                                    case 3:
                                    case 4:
                                        InfoStickerViewImpl.this.f91331b.mo74016a(effect, String.valueOf(System.currentTimeMillis() / 1000));
                                        return;
                                    default:
                                        InfoStickerViewImpl.this.f91331b.mo74016a(effect, null);
                                        break;
                                }
                            }
                        }
                    });
                } else {
                    throw new IllegalArgumentException("The view is not associated with ViewPagerBottomSheetBehavior");
                }
            } else {
                throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
            }
        }
        C35638x xVar2 = this.f91340k;
        if (this.f91333d.isStickPointMode || this.f91333d.isReaction() || this.f91333d.isDuet() || this.f91333d.isReviewVideo() || TextUtils.equals(this.f91333d.mShootWay, "im_story")) {
            z = false;
        }
        xVar2.f91597c = z;
        this.f91332c.mo50219a((C24454d) new C24453c());
        this.f91343n.mo98151a(3);
    }

    /* renamed from: a */
    public final void mo73925a(boolean z) {
        if (z) {
            this.f91342m.mo73956a(true);
        } else {
            this.f91342m.mo73956a(false);
        }
    }

    @C53771m
    public void onEvent(C26918a aVar) {
        if (C44332b.m97108b(this.f91330a)) {
            C35635v.m80462a(this.f91330a).mo73937b();
        } else {
            C35635v.m80462a(this.f91330a).mo73935a();
        }
    }

    public InfoStickerViewImpl(FragmentActivity fragmentActivity, FrameLayout frameLayout, VideoPublishEditModel videoPublishEditModel, C35584av avVar, C35609a aVar) {
        this.f91344o = avVar;
        this.f91330a = fragmentActivity;
        this.f91338i = frameLayout;
        this.f91331b = aVar;
        this.f91333d = videoPublishEditModel;
    }
}
