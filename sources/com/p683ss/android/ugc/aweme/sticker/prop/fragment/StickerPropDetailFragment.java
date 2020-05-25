package com.p683ss.android.ugc.aweme.sticker.prop.fragment;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0677p;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12187e.C12189a;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.C12208t;
import com.bytedance.lighten.p766a.p770d.C12186c;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.imagepipeline.p970j.C14045f;
import com.google.p1057b.p1058a.C17432q;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.SafeHandler;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.detail.C27311a;
import com.p683ss.android.ugc.aweme.detail.C27336g;
import com.p683ss.android.ugc.aweme.detail.C27365i;
import com.p683ss.android.ugc.aweme.detail.base.C27321a;
import com.p683ss.android.ugc.aweme.detail.base.C27323c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.experiment.GreenScreenModeExperiment;
import com.p683ss.android.ugc.aweme.favorites.p1702b.C29685a;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.festival.christmas.C31357a;
import com.p683ss.android.ugc.aweme.festival.christmas.C31361b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.movie.view.C37195c;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37584bs;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView.C37446a;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23238h;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35471h;
import com.p683ss.android.ugc.aweme.p684l.C10912c;
import com.p683ss.android.ugc.aweme.poi.widget.C39481c;
import com.p683ss.android.ugc.aweme.profile.p2084b.C39805i;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.sec.SecApiImpl;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVEffectService.EffectPlatformLoader;
import com.p683ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p683ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.p683ss.android.ugc.aweme.share.C41941ab;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.ShareService;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.festival.FestivalService;
import com.p683ss.android.ugc.aweme.sticker.model.C46067b;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import com.p683ss.android.ugc.aweme.sticker.model.C46070e;
import com.p683ss.android.ugc.aweme.sticker.prop.fragment.C46403r;
import com.p683ss.android.ugc.aweme.sticker.prop.p2313a.C46357a;
import com.p683ss.android.ugc.aweme.sticker.prop.p2313a.C46358b;
import com.p683ss.android.ugc.aweme.sticker.prop.p2316c.C46366a;
import com.p683ss.android.ugc.aweme.sticker.prop.view.C46404a;
import com.p683ss.android.ugc.aweme.sticker.types.unlock.C46604b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47881fd;
import com.p683ss.android.ugc.aweme.views.C48190g;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48711p;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.greenrobot.eventbus.C53755c;
import org.greenrobot.eventbus.C53771m;
import p001a.C0011g;
import p001a.C0013i;
import p001a.C0027j;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.fragment.StickerPropDetailFragment */
public class StickerPropDetailFragment extends C27311a implements C46403r {

    /* renamed from: J */
    private String f116987J;

    /* renamed from: K */
    private C46070e f116988K;

    /* renamed from: L */
    private C46358b f116989L;

    /* renamed from: M */
    private float f116990M;

    /* renamed from: O */
    private float f116991O;

    /* renamed from: P */
    private C41941ab f116992P;

    /* renamed from: Q */
    private String f116993Q;

    /* renamed from: R */
    private C42482c f116994R;

    /* renamed from: S */
    private Serializable f116995S;

    /* renamed from: T */
    private C39481c f116996T;

    /* renamed from: U */
    private boolean f116997U;

    /* renamed from: V */
    private boolean f116998V;

    /* renamed from: W */
    private Handler f116999W = new SafeHandler(this);

    /* renamed from: X */
    private C46388d f117000X;

    /* renamed from: Y */
    private C27323c f117001Y;

    /* renamed from: Z */
    private DmtTextView f117002Z;

    /* renamed from: a */
    boolean f117003a;

    /* renamed from: aa */
    private DmtTextView f117004aa;

    /* renamed from: ab */
    private EffectPlatformLoader f117005ab = new EffectPlatformLoader() {
        public final void load(C0011g<C29252f, Void> gVar) {
            C0027j jVar = new C0027j();
            if (StickerPropDetailFragment.this.f117013k == null) {
                StickerPropDetailFragment.this.f117014l.buildEffectPlatform(StickerPropDetailFragment.this.getContext().getApplicationContext(), new C46400o(this, jVar, gVar), C46401p.f117065a);
                return;
            }
            jVar.mo44a(StickerPropDetailFragment.this.f117013k);
            jVar.f77a.mo19a(gVar);
        }
    };

    /* renamed from: ac */
    private long f117006ac = -1;
    SmartImageView activityBannerBg;
    FrameLayout activityBannerContainer;

    /* renamed from: ad */
    private boolean f117007ad = false;

    /* renamed from: b */
    public C46069d f117008b;

    /* renamed from: c */
    String f117009c;
    C46404a collapsingTextView;
    RemoteImageView coverImgView;

    /* renamed from: d */
    String f117010d;
    DmtTextView detailPageInfo;
    ViewStub disclaimerContainer;

    /* renamed from: e */
    boolean f117011e;
    GridView gridView;
    RemoteImageView imgToRecord;
    CheckableImageView ivCollect;
    ImageView ivDisclaimer;

    /* renamed from: j */
    public List<String> f117012j;

    /* renamed from: k */
    public C29252f f117013k;

    /* renamed from: l */
    public IAVEffectService f117014l = AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().effectService();
    RemoteImageView lockImageView;

    /* renamed from: m */
    public C17432q<IStickerUtilsService> f117015m = new C17432q<IStickerUtilsService>() {

        /* renamed from: a */
        IStickerUtilsService f117022a;

        public final /* synthetic */ Object get() {
            if (this.f117022a == null) {
                this.f117022a = AVExternalServiceImpl.getAVServiceImpl_Monster().infoService().stickerInfo();
            }
            return this.f117022a;
        }
    };
    TextView mAdNickNameTv;
    View mAdOwnerLL;
    ImageView mArrowImg;
    RemoteImageView mBgCover;
    View mBottomLineView;
    View mCollectView;
    ViewGroup mGridViewWrapper;
    View mHeadLayout;
    View mInfoView;
    ViewGroup mLayoutBottomBg;
    LinearLayout mLayoutStickerUrl;
    ImageView mLinkIconIv;
    ImageView mShareBtn;
    View mStartRecodeLayout;
    DmtStatusView mStatusView;
    ViewGroup mStickerOwnerProfileView;
    RemoteImageView mStickerPropActImgView;
    public RemoteImageView mStickerPropActImgView_i18n;
    ViewGroup mTextInfoWrapper;
    TextView mTextStickerInfo;
    TextView mTextStickerUrl;
    CheckableImageView mTitleFavoriteBtn;
    View mTopLineView;
    LinearLayout mVpExpandContainer;
    ViewStub mVsOriginalMusic;

    /* renamed from: n */
    public boolean f117016n = false;
    TextView nickNameTextView;

    /* renamed from: o */
    private C46357a f117017o;

    /* renamed from: p */
    private String f117018p;

    /* renamed from: q */
    private String f117019q;

    /* renamed from: r */
    private C46366a f117020r;
    TextView titleTextView;
    DmtTextView tvCollect;
    TextView txtDisclaimer;
    TextView usedCountTextView;

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public final String mo50606a(int i) {
        return "prop_page";
    }

    /* renamed from: n */
    public final int mo50618n() {
        return R.layout.q9;
    }

    /* renamed from: q */
    public final void mo50624q() {
    }

    /* renamed from: t */
    public final boolean mo55750t() {
        return false;
    }

    /* renamed from: a */
    public final void mo93100a(boolean z) {
        if (this.mCollectView != null) {
            this.mCollectView.setEnabled(!z);
            if (z) {
                this.mCollectView.setAlpha(0.34f);
            } else {
                this.mCollectView.setAlpha(1.0f);
            }
        }
        if (this.lockImageView != null) {
            this.lockImageView.setVisibility(z ? 0 : 8);
        }
        if (this.imgToRecord != null) {
            C23515d.m57668a(this.imgToRecord, z ? R.drawable.bcn : R.drawable.tm);
        }
    }

    /* renamed from: g */
    private void m100724g() {
        if (C37584bs.m84028a(C11010c.m22280a())) {
            m100721b(true);
        }
    }

    /* renamed from: o */
    public final String mo50619o() {
        if (this.f117008b != null) {
            return this.f117008b.f116246id;
        }
        return "";
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f117013k != null) {
            this.f117013k.destroy();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo93094a() {
        if (this.mStatusView.mo19210d(true)) {
            this.f117020r.mo44934a_(this.f116987J, Integer.valueOf(0));
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f116992P != null) {
            C41941ab abVar = this.f116992P;
            if (abVar.f106181u != null) {
                abVar.f106181u.mo77117a();
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.f117006ac = System.currentTimeMillis();
        if (this.f117007ad) {
            C41941ab abVar = this.f116992P;
            if (abVar.f106177q != null) {
                abVar.mo86050a(abVar.f106177q, UUID.randomUUID().toString());
            }
            this.f117007ad = false;
            this.f117016n = false;
        }
        mo93100a(this.f117016n);
    }

    /* renamed from: f */
    private ArrayList<String> m100723f() {
        if (this.f116988K == null || this.f116988K.mStickers == null || this.f116988K.mStickers.size() == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>(this.f116988K.mStickers.size());
        for (C46069d dVar : this.f116988K.mStickers) {
            if (!dVar.mIsSelect) {
                arrayList.add(dVar.f116246id);
            } else {
                arrayList.add(0, dVar.f116246id);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo93103e() {
        String str;
        if (this.f117008b != null) {
            this.f116997U = false;
            this.f116998V = false;
            if (!C20854a.m53167g().isLogin()) {
                C27965f.m66721a((Activity) getActivity(), "prop_page", "click_favorite_prop", (Bundle) null, (C23505g) new C46399n(this));
                return;
            }
            if (this.f117008b.isFavorite) {
                str = "cancel_favorite_prop";
            } else {
                str = "favourite_prop";
            }
            C26890h.m65011a(str, C23089d.m56640a().mo47829a("enter_from", "prop_page").mo47829a("prop_id", this.f117008b.f116246id).f61491a);
            C46366a aVar = this.f117020r;
            getActivity();
            C46069d dVar = this.f117008b;
            dVar.isFavorite = !dVar.isFavorite;
            aVar.f116980a.load(new C0011g<C29252f, Void>(dVar) {

                /* renamed from: a */
                final /* synthetic */ C46069d f116982a;

                public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                    ((C29252f) iVar.mo34e()).mo59135a("default", Collections.singletonList(this.f116982a.f116246id), Boolean.valueOf(this.f116982a.isFavorite), (C48711p) new C48711p() {
                        /* renamed from: a */
                        public final /* synthetic */ void mo8638a(Object obj) {
                            List list = (List) obj;
                            if (C46366a.this.f70701g != null) {
                                ((C46403r) C46366a.this.f70701g).mo93101b(C463682.this.f116982a);
                            }
                        }

                        /* renamed from: a */
                        public final void mo92558a(C48649d dVar) {
                            if (C46366a.this.f70701g != null) {
                                C463682.this.f116982a.isFavorite = !C463682.this.f116982a.isFavorite;
                                ((C46403r) C46366a.this.f70701g).mo93097a(C463682.this.f116982a, dVar);
                            }
                        }
                    });
                    return null;
                }

                {
                    this.f116982a = r2;
                }
            });
        }
    }

    public void onStop() {
        String str;
        if (this.f117008b == null) {
            str = "";
        } else {
            str = this.f117008b.f116246id;
        }
        this.f72043I = -1;
        super.onStop();
        mo55751u();
        if (this.f117006ac != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f117006ac;
            StringBuilder sb = new StringBuilder();
            sb.append(currentTimeMillis);
            C26890h.m65011a("stay_time", C23089d.m56640a().mo47829a("prop_id", str).mo47829a("enter_from", "prop_page").mo47829a("duration", sb.toString()).mo47829a("group_id", this.f117010d).mo47829a("log_pb", this.f117009c).f61491a);
            this.f117006ac = -1;
        }
    }

    /* renamed from: r */
    public final C0677p mo50625r() {
        boolean z;
        C46070e eVar = this.f116988K;
        this.f72039E = new ArrayList(eVar.mStickers.size() - 1);
        for (C46069d dVar : eVar.mStickers) {
            C0654k childFragmentManager = getChildFragmentManager();
            StringBuilder sb = new StringBuilder();
            sb.append(C27311a.f72034s);
            sb.append(dVar.f116246id);
            Object obj = (C27336g) childFragmentManager.mo2224a(sb.toString());
            if (obj == 0) {
                String str = dVar.f116246id;
                String str2 = this.f117018p;
                C46387c cVar = new C46387c();
                C46386b bVar = new C46386b();
                Bundle bundle = new Bundle();
                bundle.putInt(C37195c.f94956x, 15);
                bundle.putString(C37195c.f94957y, "sticker_prop_detail");
                bundle.putString(C37195c.f94958z, str);
                bundle.putString(C37195c.f94954A, str2);
                bVar.setArguments(bundle);
                bVar.f65156u = cVar;
                obj = bVar;
            }
            if (obj instanceof C46386b) {
                C46386b bVar2 = (C46386b) obj;
                if (this.f72037C == 0) {
                    z = true;
                } else {
                    z = false;
                }
                bVar2.f65150o = z;
                bVar2.f65151p = true;
            }
            this.f72039E.add(obj);
        }
        List list = this.f72039E;
        ArrayList arrayList = new ArrayList();
        for (C23526a add : this.f72039E) {
            arrayList.add(add);
        }
        this.f117017o = new C46357a(getChildFragmentManager(), arrayList);
        return this.f117017o;
    }

    @C53771m
    public void receiveJumpMessage(C46604b bVar) {
        this.f117007ad = true;
    }

    /* renamed from: a */
    public final C27365i mo55746a(ViewGroup viewGroup) {
        return this.f117001Y.mo55767a(viewGroup);
    }

    @C53771m
    public void onEvent(C35471h hVar) {
        if (isViewValid() && TextUtils.equals("sticker", hVar.itemType)) {
            C47881fd.m103578a(getActivity(), this.mHeadLayout, hVar);
        }
    }

    /* renamed from: a */
    public final void mo55748a(View view) {
        super.mo55748a(view);
        this.f117000X = new C46385a();
        this.f117001Y = new C27321a(getContext(), R.drawable.tm);
    }

    /* renamed from: b */
    public final void mo93101b(C46069d dVar) {
        C47718bf.m103288a(new C39805i());
        C53755c.m114319a().mo112960d(new C29685a(dVar));
        if (dVar.isFavorite) {
            this.f116997U = true;
            if (this.f117003a) {
            }
        } else {
            C10691a.m21533a((Context) C11016e.m22312g(), (int) R.string.wm).mo19066a();
        }
    }

    /* renamed from: b */
    private void m100721b(boolean z) {
        if (this.f116992P == null) {
            if (this.f117011e) {
                this.f116992P = new C41941ab(getActivity(), "green_screen", this.f117010d);
            } else {
                this.f116992P = new C41941ab(getActivity(), "prop_page");
            }
        }
        this.f116992P.f106171k = new C46398m(this);
        ArrayList f = m100723f();
        if (f != null && f.size() != 0) {
            if (this.f116995S instanceof Music) {
                this.f116992P.mo86049a((Music) this.f116995S);
            }
            this.f116992P.mo86052a(f, false, "prop_page", this.f117019q, z);
        }
    }

    /* renamed from: a */
    public final void mo50609a(Bundle bundle) {
        if (bundle != null) {
            this.f117010d = bundle.getString("aweme_id");
            this.f117009c = bundle.getString("extra_log_pb");
            this.f117011e = bundle.getBoolean("is_green_screen_mode", false);
            this.f117018p = bundle.getString("extra_music_from");
            this.f117019q = bundle.getString("extra_sticker_from");
            this.f116994R = (C42482c) bundle.getSerializable("sticker_music");
            this.f116995S = bundle.getSerializable("music_model");
            this.f117012j = bundle.getStringArrayList("extra_stickers");
            StringBuilder sb = new StringBuilder();
            if (this.f117012j != null && this.f117012j.size() > 0) {
                this.f116993Q = (String) this.f117012j.get(0);
                for (String str : this.f117012j) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(",");
                    sb.append(sb2.toString());
                }
            }
            if (sb.toString().endsWith(",")) {
                this.f116987J = sb.toString().substring(0, sb.toString().length() - 1);
            }
            this.f72041G = bundle.getString("sticker_id");
            this.f72038D = false;
        }
    }

    /* renamed from: a */
    public final void mo93096a(C46069d dVar) {
        int i;
        int i2;
        if (dVar != null && this.tvCollect != null && this.ivCollect != null) {
            CheckableImageView checkableImageView = this.ivCollect;
            boolean z = dVar.isFavorite;
            int i3 = R.drawable.ag3;
            if (z) {
                i = R.drawable.ag3;
            } else {
                i = R.drawable.dg0;
            }
            checkableImageView.setImageResource(i);
            if (this.mTitleFavoriteBtn != null) {
                CheckableImageView checkableImageView2 = this.mTitleFavoriteBtn;
                if (!dVar.isFavorite) {
                    i3 = R.drawable.cu4;
                }
                checkableImageView2.setImageResource(i3);
            }
            DmtTextView dmtTextView = this.tvCollect;
            if (dVar.isFavorite) {
                i2 = R.string.cdg;
            } else {
                i2 = R.string.drc;
            }
            dmtTextView.setText(i2);
            if (!dVar.isFavorite && this.f116996T != null && this.f116996T.isShowing()) {
                this.f116996T.dismiss();
            }
            if (dVar.isFavorite) {
                this.f116998V = true;
            }
        }
    }

    public void click(View view) {
        int id = view.getId();
        if (id == R.id.ik) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
            return;
        }
        List list = null;
        if (id == R.id.csb) {
            if (TimeLockRuler.isTeenModeON()) {
                C10691a.m21548c((Context) getActivity(), (int) R.string.dw2).mo19066a();
            } else if (!((IStickerUtilsService) this.f117015m.get()).showCommerceStickerDialog(view.getContext(), this.f117008b, "prop_collection")) {
                IAVSettingsService avsettingsConfig = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig();
                if (avsettingsConfig == null || !avsettingsConfig.needLoginBeforeRecord()) {
                    m100721b(false);
                    return;
                }
                C27965f.m66721a((Activity) getActivity(), "prop_page", "prop_reuse_icon", (Bundle) null, (C23505g) null);
            }
        } else if (id == R.id.ct8) {
            this.f117003a = true;
            mo93103e();
            this.ivCollect.mo76959b();
        } else if (id == R.id.cmr) {
            C23238h e = new C23238h().mo48086d("prop_page").mo48088e("prop_page");
            e.f62023b = this.f117008b.f116246id;
            e.f62025d = C29981aa.m70153a().mo60161a(C23198ae.m56872j(this.f117010d));
            C23238h g = e.mo48090g(this.f117010d);
            g.f62024c = 1009;
            g.mo48076e();
            SecApiImpl.createISecApibyMonsterPlugin().reportData("share");
            ShareService a = C41979aq.m91946a();
            FragmentActivity activity2 = getActivity();
            C46069d dVar = this.f117008b;
            String str = this.f117010d;
            C27336g gVar = (C27336g) this.f72039E.get(this.f72037C);
            if (gVar instanceof DetailAwemeListFragment) {
                list = ((DetailAwemeListFragment) gVar).mo50480p();
            }
            a.shareSticker(activity2, dVar, str, list, this.f117009c);
        } else if (id == R.id.b9z && this.f117008b != null && !TextUtils.isEmpty(this.f117008b.ownerId) && !TextUtils.isEmpty(this.f117008b.ownerName)) {
            C26890h.m65011a("enter_personal_detail", C23089d.m56640a().mo47829a("prop_id", this.f117008b.f116246id).mo47829a("to_user_id", this.f117008b.ownerId).mo47829a("enter_from", "prop_page").mo47829a("enter_method", "click_name").f61491a);
            C41302w a2 = C41302w.m91042a();
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(this.f117008b.ownerId);
            a2.mo83861a(C41311y.m91065a(sb.toString()).mo83870a("sec_user_id", this.f117008b.mSecUid).mo83870a("enter_from", "prop_page").mo83871a());
        }
    }

    /* renamed from: c */
    private void m100722c(C46069d dVar) {
        ArrayList arrayList;
        if (dVar != null) {
            C23515d.m57669a(this.coverImgView, dVar.iconUrl);
            C46067b bVar = dVar.commerceSticker;
            if (bVar != null) {
                C23515d.m57669a(this.coverImgView, dVar.iconUrl);
                this.coverImgView.setVisibility(0);
                this.lockImageView.setVisibility(8);
                this.mTextInfoWrapper.setVisibility(0);
                String detailDesc = bVar.getDetailDesc();
                if (detailDesc == null || detailDesc.isEmpty()) {
                    this.mTextStickerInfo.setVisibility(8);
                } else {
                    this.mTextStickerInfo.setVisibility(0);
                    this.mTextStickerInfo.setTextColor(getResources().getColor(R.color.a1a));
                    this.txtDisclaimer.setTextColor(getResources().getColor(R.color.a19));
                    FestivalService.createIFestivalServicebyMonsterPlugin().setTextForChallengeDesc(detailDesc, this.mTextStickerInfo, this.mVpExpandContainer, this.txtDisclaimer, this.ivDisclaimer, true);
                }
                this.mBottomLineView.setVisibility(0);
                String detailLetters = bVar.getDetailLetters();
                if (TextUtils.isEmpty(detailLetters)) {
                    this.mLayoutStickerUrl.setVisibility(8);
                } else {
                    C26890h.m65011a("show_link", new C23089d().mo47829a("enter_from", "prop_page").mo47829a("type", "web_link").mo47829a("prop_id", bVar.getId()).f61491a);
                    this.mLayoutStickerUrl.setVisibility(0);
                    this.mTextStickerUrl.setText(detailLetters);
                    this.mLinkIconIv.setImageResource(R.drawable.d56);
                    this.mTextStickerUrl.setTextColor(getResources().getColor(R.color.ja));
                    if (this.mTextStickerUrl instanceof DmtTextView) {
                        ((DmtTextView) this.mTextStickerUrl).setFontType(C10751d.f28908g);
                    }
                    this.mTextStickerUrl.setOnClickListener(new C46396k(this, bVar));
                }
                String adOwnerName = bVar.getAdOwnerName();
                if (TextUtils.isEmpty(adOwnerName)) {
                    this.mAdOwnerLL.setVisibility(8);
                    if (!(bVar.getDisclaimer() == null || bVar.getDisclaimer().getTitle() == null || bVar.getDisclaimer().getContent() == null)) {
                        View inflate = this.disclaimerContainer.inflate();
                        this.f117002Z = (DmtTextView) inflate.findViewById(R.id.ex6);
                        this.f117004aa = (DmtTextView) inflate.findViewById(R.id.ex5);
                        this.f117002Z.setText(bVar.getDisclaimer().getTitle());
                        this.f117004aa.setText(bVar.getDisclaimer().getContent());
                    }
                } else {
                    C26890h.m65011a("show_aduser_head", new C23089d().mo47829a("enter_from", "prop_page").mo47829a("to_user_id", bVar.getAdOwnerId()).mo47829a("prop_id", bVar.getId()).f61491a);
                    this.mAdOwnerLL.setVisibility(0);
                    this.mAdNickNameTv.setText(adOwnerName);
                    this.mAdNickNameTv.setOnClickListener(new C46397l(bVar));
                }
            } else {
                this.mTextInfoWrapper.setVisibility(8);
                this.lockImageView.setVisibility(8);
                this.mTextStickerInfo.setVisibility(8);
                this.mLayoutStickerUrl.setVisibility(8);
                this.mAdOwnerLL.setVisibility(8);
            }
            this.titleTextView.setText(dVar.name);
            if (!TextUtils.isEmpty(dVar.ownerName)) {
                this.nickNameTextView.setText(dVar.ownerName);
                this.mStickerOwnerProfileView.setVisibility(0);
                this.mArrowImg.setVisibility(0);
                if (!TextUtils.equals(dVar.ownerId, "96972139640")) {
                    TextUtils.isEmpty(dVar.ownerId);
                }
            } else {
                this.mStickerOwnerProfileView.setVisibility(8);
            }
            this.usedCountTextView.setText(C2240a.m6772a(getActivity().getString(R.string.cev), new Object[]{C33095b.m76071b(dVar.userCount)}));
            this.f72047v.setText(dVar.name);
            this.f117008b = dVar;
            this.f72049x.setCurrentItem(this.f116989L.f116955b);
            C46386b bVar2 = (C46386b) this.f72039E.get(this.f116989L.f116955b);
            bVar2.mo50473n();
            if (this.f116988K == null || this.f116988K.mStickers == null || this.f116988K.mStickers.size() == 0) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(this.f116988K.mStickers.size());
                for (C46069d dVar2 : this.f116988K.mStickers) {
                    if (!dVar2.mIsSelect) {
                        arrayList.add(dVar2);
                    } else {
                        arrayList.add(0, dVar2);
                    }
                }
            }
            bVar2.f117048v = arrayList;
            bVar2.f117049w = this.f117010d;
            mo93096a(dVar);
            C26890h.m65011a("prop_select", C23089d.m56640a().mo47829a("prop_id", dVar.f116246id).mo47829a("enter_from", "prop_page").f61491a);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mInfoView, "alpha", new float[]{0.0f, 1.0f});
            ofFloat.setDuration(500);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.start();
        }
    }

    /* renamed from: a */
    public final void mo93098a(C46070e eVar) {
        boolean z;
        if (isViewValid()) {
            if (eVar == null || eVar.mStickers == null || eVar.mStickers.size() == 0) {
                this.mStatusView.mo19208c(false);
                this.mStatusView.mo19213g();
                return;
            }
            this.f116988K = eVar;
            if (this.f116988K.mStickerShootType != 1 || !GreenScreenModeExperiment.m69597a()) {
                z = false;
            } else {
                z = true;
            }
            this.f117011e = z;
            if (this.f117011e) {
                this.mCollectView.setVisibility(8);
                this.mShareBtn.setVisibility(8);
            }
            super.mo50624q();
            String str = (String) SharePrefCache.inst().getStickerArtlistUrl().mo47782d();
            boolean booleanValue = ((Boolean) SharePrefCache.inst().getStickerArtEntry().mo47782d()).booleanValue();
            String str2 = "";
            try {
                str2 = C32816h.m75716b().getStickerArtistIconUrl();
            } catch (C10174a unused) {
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && booleanValue) {
                this.mStickerPropActImgView_i18n.setVisibility(0);
                this.mStickerPropActImgView_i18n.setController(((C13773e) ((C13773e) C13771c.m27870a().mo25759b(this.mStickerPropActImgView_i18n.getController())).mo25751a((C13791d<? super INFO>) new C13791d<C14045f>() {
                    public final void onFailure(String str, Throwable th) {
                    }

                    public final void onIntermediateImageFailed(String str, Throwable th) {
                    }

                    public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
                    }

                    public final void onRelease(String str) {
                    }

                    public final void onSubmit(String str, Object obj) {
                    }

                    public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                        C14045f fVar = (C14045f) obj;
                        if (StickerPropDetailFragment.this.getContext() != null && fVar != null && fVar.getWidth() != 0 && fVar.getHeight() != 0) {
                            StickerPropDetailFragment.this.mStickerPropActImgView_i18n.setLayoutParams(new LayoutParams((int) ((C9432q.m18687b(StickerPropDetailFragment.this.getContext(), 25.0f) * ((float) fVar.getWidth())) / ((float) fVar.getHeight())), (int) C9432q.m18687b(StickerPropDetailFragment.this.getContext(), 25.0f)));
                        }
                    }
                })).mo25725b(Uri.parse(str2)).mo25763d());
            }
            this.mStickerPropActImgView_i18n.setOnClickListener(new C46395j(this));
            m100722c((C46069d) eVar.mStickers.get(0));
            ((C46069d) eVar.mStickers.get(0)).mIsSelect = true;
            if (eVar.mStickers.size() == 1) {
                this.gridView.setVisibility(8);
                this.mTopLineView.setVisibility(8);
                if (this.mGridViewWrapper != null) {
                    this.mGridViewWrapper.setVisibility(8);
                }
            } else {
                if (this.mGridViewWrapper != null) {
                    this.mGridViewWrapper.setVisibility(0);
                }
                this.gridView.setVisibility(0);
                this.mTopLineView.setVisibility(0);
                C46358b bVar = this.f116989L;
                List<C46069d> list = eVar.mStickers;
                if (!(list == null || list.size() == 0)) {
                    bVar.f116954a.clear();
                    bVar.f116954a.addAll(list);
                    bVar.notifyDataSetChanged();
                }
                this.gridView.setNumColumns(eVar.mStickers.size());
                int b = (int) C9432q.m18687b((Context) getActivity(), 42.0f);
                int b2 = (int) C9432q.m18687b((Context) getActivity(), 16.0f);
                int size = eVar.mStickers.size();
                this.gridView.setLayoutParams(new LinearLayout.LayoutParams((b * size) + ((size - 1) * b2) + (b2 * 2), -2));
            }
            m100724g();
            this.mStatusView.mo19208c(true);
            if (this.mShareBtn != null && !this.f117011e) {
                this.mShareBtn.setVisibility(0);
            }
            mo93100a(this.f117016n);
            final C46069d dVar = (C46069d) eVar.mStickers.get(0);
            if (C31357a.m73095a()) {
                final C10912c e = C31357a.m73104e();
                if (!(e == null || e.f29318s == null || e.f29309j == null || !e.f29309j.contains(dVar.f116246id))) {
                    if (!TextUtils.isEmpty(e.f29313n)) {
                        this.detailPageInfo.setVisibility(0);
                        this.activityBannerContainer.setVisibility(0);
                        this.detailPageInfo.setText(e.f29313n);
                    } else {
                        this.detailPageInfo.setVisibility(8);
                    }
                    this.activityBannerBg.setVisibility(0);
                    C12208t a = C12203q.m24646a(e.f29318s.f29321a).mo23118a("StickerPropDetailFragment");
                    Context context = getContext();
                    a.mo23115a(new C12189a().mo23107b(C12186c.m24630a(context, 2.0f)).mo23103a(C12186c.m24630a(context, 0.0f)).mo23106a()).mo23116a((C12197k) this.activityBannerBg).mo23121a();
                    C26890h.m65011a("xmas_banner_show", C23089d.m56640a().mo47829a("enter_from", "prop_page").mo47829a("gen", C31357a.m73100c()).mo47829a("prop_id", dVar.f116246id).f61491a);
                    this.activityBannerContainer.setOnClickListener(new OnClickListener() {
                        public final void onClick(View view) {
                            ClickInstrumentation.onClick(view);
                            C31361b.m73110a(StickerPropDetailFragment.this.getContext(), e.f29318s.f29322b);
                            C26890h.m65011a("xmas_banner_click", C23089d.m56640a().mo47829a("enter_from", "prop_page").mo47829a("gen", C31357a.m73100c()).mo47829a("prop_id", dVar.f116246id).f61491a);
                        }
                    });
                    this.activityBannerContainer.setVisibility(0);
                }
                return;
            }
            this.activityBannerContainer.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo93099a(Exception exc) {
        C32458a.m75148a((Throwable) exc);
        if (isViewValid()) {
            this.mStatusView.mo19204a(true);
        }
        if (this.mShareBtn != null) {
            this.mShareBtn.setVisibility(8);
        }
        mo93100a(this.f117016n);
    }

    /* renamed from: b */
    public final void mo50613b(int i, int i2) {
        super.mo50613b(i, i2);
        if (this.f116996T != null && this.f116996T.isShowing()) {
            this.f116996T.dismiss();
        }
        if (this.f116991O == 0.0f) {
            if (this.mStickerOwnerProfileView.getVisibility() == 0) {
                this.f116991O = (float) (this.mStickerOwnerProfileView.getBottom() - this.f72048w.getBottom());
            } else if (this.titleTextView.getVisibility() == 0) {
                this.f116991O = (float) (this.titleTextView.getBottom() - this.f72048w.getBottom());
            }
        }
        if (this.f116990M == 0.0f) {
            this.f116990M = (float) (this.mHeadLayout.getBottom() - this.f72048w.getBottom());
        }
        float f = (float) i;
        float f2 = (f - this.f116991O) / (this.f116990M - this.f116991O);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.f72048w.setAlpha(f2);
        this.f72047v.setAlpha(f2);
        this.mHeadLayout.setAlpha(1.0f - (f / this.f116990M));
        this.f72047v.setTypeface(Typeface.DEFAULT_BOLD);
        this.mStickerPropActImgView_i18n.setAlpha(1.0f - f2);
        if (this.mTitleFavoriteBtn != null) {
            if (((double) f2) != 1.0d || this.f117011e) {
                this.mTitleFavoriteBtn.setVisibility(8);
            } else {
                this.mTitleFavoriteBtn.setVisibility(0);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        LayoutInflater.from(getContext()).inflate(R.layout.af5, (ViewGroup) view.findViewById(R.id.ao4), true);
        this.f117001Y.mo55768a((RelativeLayout) view.findViewById(R.id.eww));
        super.onViewCreated(view, bundle);
        if (!C46402q.m100757a(getActivity())) {
            C10691a.m21542b((Context) getActivity(), (int) R.string.cg1).mo19066a();
        }
        this.f117020r = new C46366a(this.f117005ab, this.f117011e);
        this.f117020r.mo54800a(this);
        MtEmptyView a = MtEmptyView.m21697a(getContext());
        a.setStatus(new C10723a(getContext()).mo19277a((int) R.drawable.yw).mo19280b((int) R.string.awl).mo19282c(R.string.awk).f28711a);
        this.mStatusView.setBuilder(C10719a.m21676a(getContext()).mo19231b((View) a).mo19232b(C48190g.m104428a(getContext(), new C46391f(this))));
        if (!this.f117011e) {
            this.mCollectView.setVisibility(0);
        }
        this.ivCollect.setOnStateChangeListener(new C37446a() {
            /* renamed from: a */
            public final void mo50574a() {
            }

            /* renamed from: a */
            public final void mo50575a(int i) {
                if (i == 1) {
                    StickerPropDetailFragment.this.mo93096a(StickerPropDetailFragment.this.f117008b);
                }
            }
        });
        if (this.mTitleFavoriteBtn != null) {
            this.mTitleFavoriteBtn.setOnStateChangeListener(new C37446a() {
                /* renamed from: a */
                public final void mo50574a() {
                }

                /* renamed from: a */
                public final void mo50575a(int i) {
                    if (i == 1) {
                        StickerPropDetailFragment.this.mo93096a(StickerPropDetailFragment.this.f117008b);
                    }
                }
            });
            this.mTitleFavoriteBtn.setOnClickListener(new C46392g(this));
        }
        this.mBottomLineView.setVisibility(0);
        this.f72047v.setAlpha(0.0f);
        this.f72047v.setOnClickListener(new C46393h(this));
        this.f116989L = new C46358b(getActivity(), this.f117000X);
        this.gridView.setAdapter(this.f116989L);
        this.gridView.setOnItemClickListener(new C46394i(this));
        this.mStartRecodeLayout.setVisibility(8);
        this.mLayoutBottomBg.setBackground(null);
        mo93094a();
        this.f117005ab.load(new C0011g<C29252f, Void>() {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                ((C29252f) iVar.mo34e()).mo59132a((String) StickerPropDetailFragment.this.f117012j.get(0), (String) null, (C48705j) new C48705j() {
                    /* renamed from: a */
                    public final void mo8643a(Effect effect) {
                    }

                    /* renamed from: a */
                    public final /* synthetic */ void mo8638a(Object obj) {
                        Effect effect = (Effect) obj;
                        if (StickerPropDetailFragment.this.mStartRecodeLayout != null) {
                            StickerPropDetailFragment.this.mStartRecodeLayout.setVisibility(0);
                        }
                        if (!((IStickerUtilsService) StickerPropDetailFragment.this.f117015m.get()).isLockSticker(effect)) {
                            return;
                        }
                        if ((!C20854a.m53167g().isLogin() && !((IStickerUtilsService) StickerPropDetailFragment.this.f117015m.get()).isCommerceLockSticker(effect)) || !((IStickerUtilsService) StickerPropDetailFragment.this.f117015m.get()).hasUnlocked(effect)) {
                            StickerPropDetailFragment.this.f117016n = true;
                            StickerPropDetailFragment.this.mo93100a(StickerPropDetailFragment.this.f117016n);
                        }
                    }

                    /* renamed from: a */
                    public final void mo8644a(Effect effect, C48649d dVar) {
                        if (StickerPropDetailFragment.this.mStartRecodeLayout != null) {
                            StickerPropDetailFragment.this.mStartRecodeLayout.setVisibility(0);
                        }
                    }
                });
                return null;
            }
        });
        if (this.f117011e) {
            C26890h.m65011a("enter_green_detail", C23089d.m56640a().mo47829a("log_pb", this.f117009c).mo47829a("group_id", this.f117010d).mo47829a("enter_from", "green_screen_page").f61491a);
        }
    }

    /* renamed from: a */
    public final void mo93097a(C46069d dVar, C48649d dVar2) {
        if (getActivity() != null) {
            C53755c.m114319a().mo112960d(new C29685a(dVar));
            mo93096a(dVar);
            int i = dVar2.f122279a;
            if (i == 2004 || i == 2002) {
                C10691a.m21545b((Context) getActivity(), getResources().getString(R.string.b06)).mo19066a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo93095a(AdapterView adapterView, View view, int i, long j) {
        if (i != this.f116989L.f116955b) {
            C46358b bVar = this.f116989L;
            if (bVar.f116954a != null && i < bVar.f116954a.size()) {
                for (C46069d dVar : bVar.f116954a) {
                    dVar.mIsSelect = false;
                }
                ((C46069d) bVar.f116954a.get(i)).mIsSelect = true;
                bVar.f116955b = i;
                bVar.notifyDataSetChanged();
            }
            m100722c((C46069d) this.f116989L.f116954a.get(i));
            if (((IStickerUtilsService) this.f117015m.get()).isLockCommerceFaceSticker((C46069d) this.f116989L.f116954a.get(i))) {
                this.f117016n = true;
            } else {
                this.f117016n = false;
            }
            mo93100a(this.f117016n);
        }
    }
}
