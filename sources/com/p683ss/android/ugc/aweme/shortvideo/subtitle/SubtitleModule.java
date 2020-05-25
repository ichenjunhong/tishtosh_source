package com.p683ss.android.ugc.aweme.shortvideo.subtitle;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0781c;
import android.support.p043v7.widget.C1415af;
import android.support.p043v7.widget.C1440au;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1327f;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1346r;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p667c.C10673c;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.scene.C12924i;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.base.activity.C23441t;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.effect.C29087a;
import com.p683ss.android.ugc.aweme.effect.C29218v;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.p1484bx.C24453c;
import com.p683ss.android.ugc.aweme.p1484bx.C24454d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.C43846fo;
import com.p683ss.android.ugc.aweme.shortvideo.C43852fu;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43509at;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43535i;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C43738a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2194f.C43470a;
import com.p683ss.android.ugc.aweme.shortvideo.net.C44331a;
import com.p683ss.android.ugc.aweme.shortvideo.net.NetStateReceiver;
import com.p683ss.android.ugc.aweme.shortvideo.p2266z.C45642b;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46679c;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46747d;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46747d.C46749a;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p683ss.android.ugc.aweme.themechange.base.C46788b;
import com.p683ss.android.ugc.aweme.tools.AVApi;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.gamora.editor.EditSubtitleViewModel;
import com.p683ss.android.ugc.gamora.editor.EditViewModel;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.vesdk.C50711k;
import com.p683ss.android.vesdk.C50720o;
import com.p683ss.android.vesdk.C50720o.C50743d;
import com.p683ss.android.vesdk.C50720o.C50744e;
import com.p683ss.android.vesdk.VEAudioEncodeSettings;
import com.p683ss.android.vesdk.VEAudioEncodeSettings.C50523a;
import com.p683ss.android.vesdk.VEListener.C50547k;
import com.p683ss.android.vesdk.VEListener.VEInfoStickerBufferListener;
import com.p683ss.android.vesdk.VERecordData;
import com.p683ss.android.vesdk.VEUtils;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C52904aa;
import dmt.p2652av.video.C52904aa.C52905a;
import dmt.p2652av.video.C53030y;
import dmt.p2652av.video.VEVideoPublishEditViewModel;
import java.io.File;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p001a.C0008d;
import p001a.C0010f;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52725c;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule */
public class SubtitleModule extends C12924i {

    /* renamed from: ae */
    public static ConcurrentHashMap<Integer, StickerItemModel> f113308ae = new ConcurrentHashMap<>();

    /* renamed from: af */
    public static HashMap<Integer, StickerItemModel> f113309af = new HashMap<>();

    /* renamed from: ag */
    public static String f113310ag = "";

    /* renamed from: ah */
    public static final C44810b f113311ah = new C44810b(null);

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f113312i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SubtitleModule.class), "api", "getApi()Lcom/ss/android/ugc/aweme/shortvideo/subtitle/SubtitleApi;"))};

    /* renamed from: A */
    public VideoPublishEditModel f113313A;

    /* renamed from: B */
    EditViewModel f113314B;

    /* renamed from: C */
    public FragmentActivity f113315C;

    /* renamed from: D */
    VEVideoPublishEditViewModel f113316D;

    /* renamed from: E */
    public C20347c f113317E;

    /* renamed from: F */
    public int f113318F;

    /* renamed from: G */
    public ViewGroup f113319G;

    /* renamed from: H */
    public C29087a f113320H;

    /* renamed from: I */
    public C0198r<C53030y> f113321I;

    /* renamed from: J */
    public SafeHandler f113322J;

    /* renamed from: K */
    public SafeHandler f113323K;

    /* renamed from: L */
    InputMethodManager f113324L;

    /* renamed from: M */
    SubtitleStyleViewModel f113325M;

    /* renamed from: N */
    public RecyclerView f113326N;

    /* renamed from: O */
    public C44821d f113327O;

    /* renamed from: P */
    public int f113328P = 2;

    /* renamed from: Q */
    public ArrayList<UtteranceWithWords> f113329Q = new ArrayList<>();

    /* renamed from: R */
    public String f113330R;

    /* renamed from: S */
    C44331a f113331S;

    /* renamed from: T */
    public LinearLayout f113332T;

    /* renamed from: U */
    public View f113333U;

    /* renamed from: V */
    public boolean f113334V;

    /* renamed from: W */
    public C44822e f113335W;

    /* renamed from: X */
    int f113336X = -1;

    /* renamed from: Y */
    boolean f113337Y;

    /* renamed from: Z */
    public boolean f113338Z;

    /* renamed from: aa */
    C23441t f113339aa;

    /* renamed from: ab */
    final C23422a f113340ab = new C44772aa(this);

    /* renamed from: ac */
    final ValueAnimator f113341ac;

    /* renamed from: ad */
    public boolean f113342ad;

    /* renamed from: ai */
    private C50720o f113343ai;

    /* renamed from: aj */
    private boolean f113344aj;

    /* renamed from: ak */
    private C47687av f113345ak;

    /* renamed from: al */
    private C46747d f113346al;

    /* renamed from: am */
    private EditSubtitleViewModel f113347am;

    /* renamed from: an */
    private long f113348an;

    /* renamed from: ao */
    private final C52668f f113349ao;

    /* renamed from: j */
    public String f113350j;

    /* renamed from: k */
    public long f113351k;

    /* renamed from: l */
    public float f113352l = 0.004f;

    /* renamed from: m */
    C44826g f113353m;
    @BindView(2131493930)
    public TextView mCancelView;
    @BindView(2131493023)
    public FrameLayout mContentLayout;
    @BindView(2131493107)
    public RelativeLayout mEffectTitleLayout;
    @BindView(2131493198)
    public View mHighLightArea;
    @BindView(2131493235)
    public ImageView mIvDelete;
    @BindView(2131493236)
    public ImageView mIvEdit;
    @BindView(2131493237)
    public ImageView mIvFont;
    @BindView(2131493429)
    public LinearLayout mLoadingArea;
    @BindView(2131493431)
    public TextView mLoadingHint;
    @BindView(2131493433)
    public TextView mLoadingProgress;
    @BindView(2131493434)
    public DmtStatusView mLoadingStatusView;
    @BindView(2131493575)
    public AVDmtPanelRecyleView mRecyclerView;
    @BindView(2131493971)
    public TextView mSaveView;
    @BindView(2131493790)
    public LinearLayout mSubtitleLayout;

    /* renamed from: n */
    public C44820c f113354n;

    /* renamed from: o */
    InfoStickerModel f113355o;

    /* renamed from: p */
    public SubtitleEditTypeLayout f113356p;

    /* renamed from: q */
    public boolean f113357q;

    /* renamed from: r */
    public C0010f f113358r = new C0010f();

    /* renamed from: s */
    SubtitleTextView f113359s;

    /* renamed from: t */
    View f113360t;

    /* renamed from: u */
    View f113361u;

    /* renamed from: v */
    View f113362v;

    /* renamed from: w */
    public C43535i f113363w;

    /* renamed from: x */
    public HighLightLayoutManager f113364x;

    /* renamed from: y */
    public C44823f f113365y;

    /* renamed from: z */
    public C44863g f113366z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$HighLightLayoutManager */
    public final class HighLightLayoutManager extends LinearLayoutManager {

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$HighLightLayoutManager$a */
        public final class C44769a extends C1415af {
            /* renamed from: c */
            public final int mo5496c() {
                return -1;
            }

            /* renamed from: c */
            public final PointF mo5111c(int i) {
                return HighLightLayoutManager.this.mo4738d(i);
            }

            /* renamed from: a */
            public final float mo5490a(DisplayMetrics displayMetrics) {
                Integer num;
                float f = SubtitleModule.this.f113352l;
                if (displayMetrics != null) {
                    num = Integer.valueOf(displayMetrics.densityDpi);
                } else {
                    num = null;
                }
                if (num == null) {
                    C52711k.m112234a();
                }
                return f / ((float) num.intValue());
            }

            public C44769a(Context context) {
                super(context);
            }

            /* renamed from: a */
            public final int mo5492a(int i, int i2, int i3, int i4, int i5) {
                return (i3 - i) + ((int) C9432q.m18687b((Context) SubtitleModule.m97959d(SubtitleModule.this), 52.0f));
            }
        }

        /* renamed from: a */
        public final void mo4726a(RecyclerView recyclerView, C1349s sVar, int i) {
            Context context;
            if (recyclerView != null) {
                context = recyclerView.getContext();
            } else {
                context = null;
            }
            C44769a aVar = new C44769a(context);
            aVar.f4778g = i;
            mo5022a((C1346r) aVar);
        }

        public HighLightLayoutManager(Context context, int i, boolean z) {
            super(context, 1, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$a */
    static final class C44770a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ValueAnimator f113369a;

        /* renamed from: b */
        final /* synthetic */ SubtitleModule f113370b;

        C44770a(ValueAnimator valueAnimator, SubtitleModule subtitleModule) {
            this.f113369a = valueAnimator;
            this.f113370b = subtitleModule;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            final C52725c cVar = new C52725c();
            C52711k.m112236a((Object) valueAnimator, "animation");
            int animatedFraction = (int) (valueAnimator.getAnimatedFraction() * ((float) this.f113369a.getDuration()));
            if (animatedFraction >= 0 && 6000 >= animatedFraction) {
                cVar.element = animatedFraction / 100;
            } else if (6000 <= animatedFraction && 10000 >= animatedFraction) {
                cVar.element = ((animatedFraction - 6000) / 200) + 60;
            } else {
                cVar.element = ((animatedFraction - 10000) / 300) + 80;
            }
            SubtitleModule.m97949a(this.f113370b).post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C44770a f113371a;

                {
                    this.f113371a = r1;
                }

                public final void run() {
                    TextView textView = this.f113371a.f113370b.mLoadingProgress;
                    if (textView == null) {
                        C52711k.m112237a("mLoadingProgress");
                    }
                    textView.setText(this.f113371a.f113370b.mo24478w().getString(R.string.mx, new Object[]{Integer.valueOf(cVar.element)}));
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$aa */
    static final class C44772aa implements C23422a {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113373a;

        C44772aa(SubtitleModule subtitleModule) {
            this.f113373a = subtitleModule;
        }

        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            LinearLayout linearLayout = this.f113373a.f113332T;
            if (linearLayout == null) {
                C52711k.m112237a("mEditView");
            }
            if (linearLayout.isShown()) {
                View view = this.f113373a.f113333U;
                if (view != null) {
                    view.performClick();
                }
            } else {
                ViewGroup viewGroup = this.f113373a.f113319G;
                if (viewGroup == null) {
                    C52711k.m112237a("mSubtitleView");
                }
                if (viewGroup.isShown()) {
                    TextView textView = this.f113373a.mCancelView;
                    if (textView == null) {
                        C52711k.m112237a("mCancelView");
                    }
                    textView.performClick();
                }
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ab */
    public static final class C44773ab<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C52594a.m112153a(Integer.valueOf(((UtteranceWithWords) t).getStartTime()), Integer.valueOf(((UtteranceWithWords) t2).getStartTime()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ac */
    static final class C44774ac implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113374a;

        C44774ac(SubtitleModule subtitleModule) {
            this.f113374a = subtitleModule;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f113374a.mo90867J();
            this.f113374a.mo90865H();
            C43434az.m95208b(SubtitleModule.m97961f(this.f113374a), "click_icon");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ad */
    static final class C44775ad extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113375a;

        C44775ad(SubtitleModule subtitleModule) {
            this.f113375a = subtitleModule;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f113375a.mo90879W();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ae */
    static final class C44776ae implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113376a;

        /* renamed from: b */
        final /* synthetic */ C0013i f113377b;

        C44776ae(SubtitleModule subtitleModule, C0013i iVar) {
            this.f113376a = subtitleModule;
            this.f113377b = iVar;
        }

        public final void run() {
            if (this.f113377b == null || !this.f113377b.mo26b() || this.f113376a.f113329Q.isEmpty()) {
                this.f113376a.mo90888a((C52670a<C52860x>) new C52670a<C52860x>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C44776ae f113378a;

                    {
                        this.f113378a = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        this.f113378a.f113376a.mo90879W();
                        return C52860x.f131107a;
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$af */
    static final class C44778af<TTaskResult, TContinuationResult> implements C0011g<C44861e, C0013i<C44859c>> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113379a;

        C44778af(SubtitleModule subtitleModule) {
            this.f113379a = subtitleModule;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            this.f113379a.f113363w.mo88656e(true);
            C52711k.m112236a((Object) iVar, "task");
            if (!iVar.mo26b() || ((C44861e) iVar.mo34e()).f113530a != 0) {
                Exception f = iVar.mo35f();
                C52711k.m112236a((Object) f, "task.error");
                throw f;
            }
            SubtitleModule.f113310ag = ((C44861e) iVar.mo34e()).f113532c;
            SubtitleModule subtitleModule = this.f113379a;
            return subtitleModule.mo90882Z().queryAudio("douyin_caption", "aweme_token", ((C44861e) iVar.mo34e()).f113532c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ag */
    static final class C44779ag<TTaskResult, TContinuationResult> implements C0011g<C44859c, C52860x> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113380a;

        C44779ag(SubtitleModule subtitleModule) {
            this.f113380a = subtitleModule;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "queryTask");
            if (iVar.mo35f() != null) {
                this.f113380a.mo90880X();
                this.f113380a.mo90888a((C52670a<C52860x>) new C52670a<C52860x>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C44779ag f113381a;

                    {
                        this.f113381a = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        this.f113381a.f113380a.mo90879W();
                        return C52860x.f131107a;
                    }
                });
            } else if (!iVar.mo26b()) {
                this.f113380a.mo90880X();
                this.f113380a.mo90888a((C52670a<C52860x>) new C52670a<C52860x>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C44779ag f113383a;

                    {
                        this.f113383a = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        this.f113383a.f113380a.mo90879W();
                        return C52860x.f131107a;
                    }
                });
            } else if (((C44859c) iVar.mo34e()).f113524b == 0) {
                List<? extends UtteranceWithWords> list = ((C44859c) iVar.mo34e()).f113526d;
                if (list.isEmpty()) {
                    this.f113380a.mo90880X();
                    this.f113380a.mo90878V();
                } else {
                    this.f113380a.mo90891a(list);
                }
            } else {
                this.f113380a.mo90880X();
                this.f113380a.mo90888a((C52670a<C52860x>) new C52670a<C52860x>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C44779ag f113382a;

                    {
                        this.f113382a = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        this.f113382a.f113380a.mo90879W();
                        return C52860x.f131107a;
                    }
                });
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ah */
    static final class C44783ah implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113384a;

        /* renamed from: b */
        final /* synthetic */ C0013i f113385b;

        /* renamed from: c */
        final /* synthetic */ SubtitleApiV2 f113386c;

        C44783ah(SubtitleModule subtitleModule, C0013i iVar, SubtitleApiV2 subtitleApiV2) {
            this.f113384a = subtitleModule;
            this.f113385b = iVar;
            this.f113386c = subtitleApiV2;
        }

        public final void run() {
            if (this.f113385b == null || !this.f113385b.mo26b() || this.f113384a.f113329Q.isEmpty()) {
                if (TextUtils.isEmpty(SubtitleModule.f113310ag)) {
                    this.f113384a.mo90888a((C52670a<C52860x>) new C52670a<C52860x>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C44783ah f113387a;

                        {
                            this.f113387a = r1;
                        }

                        public final /* synthetic */ Object invoke() {
                            this.f113387a.f113384a.mo90877U();
                            return C52860x.f131107a;
                        }
                    });
                } else {
                    SubtitleModule subtitleModule = this.f113384a;
                    SubtitleApiV2 subtitleApiV2 = this.f113386c;
                    C52711k.m112236a((Object) subtitleApiV2, "uploadApi");
                    subtitleModule.mo90893b(subtitleApiV2, SubtitleModule.f113310ag);
                }
                this.f113384a.mo90889a("exceed", "");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ai */
    static final class C44785ai<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113388a;

        C44785ai(SubtitleModule subtitleModule) {
            this.f113388a = subtitleModule;
        }

        public final /* synthetic */ Object call() {
            this.f113388a.mo90875R();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$aj */
    static final class C44786aj<TTaskResult, TContinuationResult> implements C0011g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113389a;

        /* renamed from: b */
        final /* synthetic */ C43846fo f113390b;

        /* renamed from: c */
        final /* synthetic */ SubtitleApiV2 f113391c;

        /* renamed from: d */
        final /* synthetic */ C0008d f113392d;

        C44786aj(SubtitleModule subtitleModule, C43846fo foVar, SubtitleApiV2 subtitleApiV2, C0008d dVar) {
            this.f113389a = subtitleModule;
            this.f113390b = foVar;
            this.f113391c = subtitleApiV2;
            this.f113392d = dVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            String str = this.f113389a.f113330R;
            if (str == null) {
                C52711k.m112234a();
            }
            SubtitleOriginalSoundUploadTask subtitleOriginalSoundUploadTask = new SubtitleOriginalSoundUploadTask(str);
            C43846fo foVar = this.f113390b;
            C52711k.m112236a((Object) foVar, "config");
            C43852fu fuVar = foVar.f111026a;
            C52711k.m112236a((Object) fuVar, "config.uploadVideoConfig");
            return subtitleOriginalSoundUploadTask.mo90938a(fuVar).mo25b(new C0011g<SubtitleOriginalSoundUploadTask, C0013i<C44860d>>(this) {

                /* renamed from: a */
                final /* synthetic */ C44786aj f113393a;

                {
                    this.f113393a = r1;
                }

                public final /* synthetic */ Object then(C0013i iVar) {
                    boolean z;
                    C52711k.m112236a((Object) iVar, "it");
                    if (iVar.mo26b() && ((SubtitleOriginalSoundUploadTask) iVar.mo34e()).f113496a != null) {
                        String str = ((SubtitleOriginalSoundUploadTask) iVar.mo34e()).f113496a;
                        if (str == null) {
                            C52711k.m112234a();
                        }
                        if (str.length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            this.f113393a.f113389a.f113363w.mo88656e(true);
                            SubtitleApiV2 subtitleApiV2 = this.f113393a.f113391c;
                            String str2 = ((SubtitleOriginalSoundUploadTask) iVar.mo34e()).f113496a;
                            if (str2 == null) {
                                C52711k.m112234a();
                            }
                            return subtitleApiV2.submit(str2, 1, 20);
                        }
                    }
                    Exception f = iVar.mo35f();
                    C52711k.m112236a((Object) f, "it.error");
                    throw f;
                }
            }, C0013i.f24a, this.f113392d).mo21a((C0011g<TResult, TContinuationResult>) new C0011g<C44860d, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C44786aj f113394a;

                {
                    this.f113394a = r1;
                }

                public final /* synthetic */ Object then(C0013i iVar) {
                    String str;
                    boolean z;
                    C52711k.m112236a((Object) iVar, "it");
                    if (iVar.mo26b() && ((C44860d) iVar.mo34e()).f113527a == 0) {
                        if (((C44860d) iVar.mo34e()).f113528b.f113523a.length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            SubtitleModule.f113310ag = ((C44860d) iVar.mo34e()).f113528b.f113523a;
                            SubtitleModule subtitleModule = this.f113394a.f113389a;
                            SubtitleApiV2 subtitleApiV2 = this.f113394a.f113391c;
                            C52711k.m112236a((Object) subtitleApiV2, "uploadApi");
                            subtitleModule.mo90885a(subtitleApiV2, SubtitleModule.f113310ag);
                            return C52860x.f131107a;
                        }
                    }
                    this.f113394a.f113389a.mo90880X();
                    this.f113394a.f113389a.mo90888a((C52670a<C52860x>) new C52670a<C52860x>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C447882 f113395a;

                        {
                            this.f113395a = r1;
                        }

                        public final /* synthetic */ Object invoke() {
                            this.f113395a.f113394a.f113389a.mo90877U();
                            return C52860x.f131107a;
                        }
                    });
                    SubtitleModule subtitleModule2 = this.f113394a.f113389a;
                    String str2 = "error";
                    if (iVar.mo35f() != null) {
                        str = iVar.mo35f().getMessage();
                    } else if (iVar.mo34e() != null) {
                        str = String.valueOf(((C44860d) iVar.mo34e()).f113527a);
                    } else {
                        str = "";
                    }
                    subtitleModule2.mo90889a(str2, str);
                    return C52860x.f131107a;
                }
            }, C0013i.f25b, this.f113392d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ak */
    static final class C44790ak<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ SubtitleApiV2 f113396a;

        /* renamed from: b */
        final /* synthetic */ String f113397b;

        C44790ak(SubtitleApiV2 subtitleApiV2, String str) {
            this.f113396a = subtitleApiV2;
            this.f113397b = str;
        }

        public final /* synthetic */ Object call() {
            C0013i query = this.f113396a.query(this.f113397b);
            query.mo36g();
            return (C44860d) query.mo34e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$al */
    static final class C44791al<TTaskResult, TContinuationResult> implements C0011g<C44860d, C52860x> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113398a;

        /* renamed from: b */
        final /* synthetic */ SubtitleApiV2 f113399b;

        /* renamed from: c */
        final /* synthetic */ String f113400c;

        C44791al(SubtitleModule subtitleModule, SubtitleApiV2 subtitleApiV2, String str) {
            this.f113398a = subtitleModule;
            this.f113399b = subtitleApiV2;
            this.f113400c = str;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            String str;
            String str2;
            C52711k.m112236a((Object) iVar, "task");
            if (iVar.mo33d() || iVar.mo31c()) {
                this.f113398a.mo90880X();
                this.f113398a.mo90893b(this.f113399b, this.f113400c);
                SubtitleModule subtitleModule = this.f113398a;
                String str3 = "error";
                if (iVar.mo35f() != null) {
                    str = iVar.mo35f().getMessage();
                } else if (iVar.mo34e() != null) {
                    str = String.valueOf(((C44860d) iVar.mo34e()).f113527a);
                } else {
                    str = "";
                }
                subtitleModule.mo90889a(str3, str);
            } else if (iVar.mo26b()) {
                if (((C44860d) iVar.mo34e()).f113527a == 0) {
                    List<? extends UtteranceWithWords> list = ((C44860d) iVar.mo34e()).f113528b.f113526d;
                    SubtitleModule.m97947S();
                    if (list.isEmpty()) {
                        this.f113398a.mo90880X();
                        this.f113398a.mo90878V();
                        str2 = "empty";
                    } else {
                        SubtitleModule.m97957b(this.f113398a).removeCallbacksAndMessages(null);
                        this.f113398a.mo90891a(list);
                        str2 = "succeed";
                    }
                    this.f113398a.mo90889a(str2, "");
                } else {
                    this.f113398a.mo90880X();
                    if (((C44860d) iVar.mo34e()).f113527a == 2172) {
                        this.f113398a.mo90878V();
                    } else if (((C44860d) iVar.mo34e()).f113527a == 2171) {
                        this.f113398a.mo90893b(this.f113399b, this.f113400c);
                    } else {
                        this.f113398a.mo90888a((C52670a<C52860x>) new C52670a<C52860x>(this) {

                            /* renamed from: a */
                            final /* synthetic */ C44791al f113401a;

                            {
                                this.f113401a = r1;
                            }

                            public final /* synthetic */ Object invoke() {
                                this.f113401a.f113398a.mo90877U();
                                return C52860x.f131107a;
                            }
                        });
                    }
                    this.f113398a.mo90889a("error", String.valueOf(((C44860d) iVar.mo34e()).f113527a));
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$am */
    public static final class C44793am implements C17824h<Object> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113402a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$am$a */
        static final class C44794a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C44793am f113403a;

            C44794a(C44793am amVar) {
                this.f113403a = amVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                this.f113403a.f113402a.mo90876T();
                return C52860x.f131107a;
            }
        }

        C44793am(SubtitleModule subtitleModule) {
            this.f113402a = subtitleModule;
        }

        public final void onSuccess(Object obj) {
            this.f113402a.mo90877U();
        }

        public final void onFailure(Throwable th) {
            C52711k.m112240b(th, "t");
            if (this.f113402a.f113328P > 0) {
                this.f113402a.mo90876T();
                this.f113402a.f113328P--;
                return;
            }
            this.f113402a.mo90888a((C52670a<C52860x>) new C44794a<C52860x>(this));
            this.f113402a.f113328P = 2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$an */
    static final class C44795an implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113404a;

        C44795an(SubtitleModule subtitleModule) {
            this.f113404a = subtitleModule;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (this.f113404a.mo90874Q()) {
                this.f113404a.mo90865H();
            } else {
                this.f113404a.mo90864G();
            }
            this.f113404a.mo90867J();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ao */
    static final class C44796ao implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113405a;

        /* renamed from: b */
        final /* synthetic */ C44870h f113406b;

        C44796ao(SubtitleModule subtitleModule, C44870h hVar) {
            this.f113405a = subtitleModule;
            this.f113406b = hVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f113406b.mo50223b(new C24453c());
            this.f113405a.mo90867J();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ap */
    static final class C44797ap implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113407a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ap$a */
        static final class C44798a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C44797ap f113408a;

            C44798a(C44797ap apVar) {
                this.f113408a = apVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (this.f113408a.f113407a.mo90874Q()) {
                    this.f113408a.f113407a.mo90865H();
                } else {
                    this.f113408a.f113407a.mo90864G();
                }
                this.f113408a.f113407a.mo90867J();
                this.f113408a.f113407a.mo90889a("cancel", "");
            }
        }

        C44797ap(SubtitleModule subtitleModule) {
            this.f113407a = subtitleModule;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            new C10643a(SubtitleModule.m97959d(this.f113407a)).mo18899b((int) R.string.n0).mo18900b((int) R.string.nt, (OnClickListener) new C44798a(this)).mo18886a((int) R.string.n1, (OnClickListener) null).mo18897a().mo18882b().show();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$aq */
    static final class C44799aq extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113409a;

        /* renamed from: b */
        final /* synthetic */ String f113410b;

        /* renamed from: c */
        final /* synthetic */ SubtitleApiV2 f113411c;

        C44799aq(SubtitleModule subtitleModule, String str, SubtitleApiV2 subtitleApiV2) {
            this.f113409a = subtitleModule;
            this.f113410b = str;
            this.f113411c = subtitleApiV2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f113410b == null) {
                this.f113409a.mo90877U();
            } else {
                this.f113409a.mo90885a(this.f113411c, this.f113410b);
                SubtitleModule.m97957b(this.f113409a).postDelayed(new Runnable(this) {

                    /* renamed from: a */
                    final /* synthetic */ C44799aq f113412a;

                    {
                        this.f113412a = r1;
                    }

                    public final void run() {
                        if (this.f113412a.f113409a.f113329Q.isEmpty()) {
                            this.f113412a.f113409a.mo90893b(this.f113412a.f113411c, this.f113412a.f113410b);
                            this.f113412a.f113409a.mo90889a("exceed", "");
                        }
                    }
                }, 60000);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ar */
    static final class C44801ar implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113413a;

        /* renamed from: b */
        final /* synthetic */ C44870h f113414b;

        C44801ar(SubtitleModule subtitleModule, C44870h hVar) {
            this.f113413a = subtitleModule;
            this.f113414b = hVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f113414b.mo50223b(new C24453c());
            this.f113413a.mo90867J();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$as */
    static final class C44802as implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113415a;

        /* renamed from: b */
        final /* synthetic */ C44870h f113416b;

        /* renamed from: c */
        final /* synthetic */ C52670a f113417c;

        C44802as(SubtitleModule subtitleModule, C44870h hVar, C52670a aVar) {
            this.f113415a = subtitleModule;
            this.f113416b = hVar;
            this.f113417c = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f113416b.mo50223b(new C24453c());
            this.f113415a.f113358r.mo14c();
            this.f113415a.mo90892a(true);
            this.f113415a.f113350j = "retry";
            this.f113415a.f113351k = System.currentTimeMillis();
            this.f113417c.invoke();
            C26890h.m65011a("retry_auto_subtitle", this.f113415a.mo90881Y().f107329a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$at */
    public static final class C44803at<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C52594a.m112153a(Integer.valueOf(((UtteranceWithWords) t).getStartTime()), Integer.valueOf(((UtteranceWithWords) t2).getStartTime()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$au */
    static final class C44804au<T> implements C0781c<Void> {

        /* renamed from: a */
        public static final C44804au f113418a = new C44804au();

        C44804au() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$av */
    public static final class C44805av implements C44858b {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113419a;

        C44805av(SubtitleModule subtitleModule) {
            this.f113419a = subtitleModule;
        }

        /* renamed from: a */
        public final void mo90917a(int i) {
            if (!this.f113419a.f113334V) {
                this.f113419a.f113334V = true;
                if (this.f113419a.mo90899h().getAdapter() != null) {
                    int i2 = SubtitleModule.m97960e(this.f113419a).f113445a;
                    if (i2 != -1) {
                        this.f113419a.mo90883a(i2, true);
                    } else {
                        this.f113419a.f113334V = false;
                    }
                    SubtitleModule.m97962g(this.f113419a).mo90854a("", SubtitleModule.m97961f(this.f113419a).infoStickerModel.mBgMode, SubtitleModule.m97961f(this.f113419a).infoStickerModel.mColor, SubtitleModule.m97961f(this.f113419a).infoStickerModel.mAlign, SubtitleModule.m97961f(this.f113419a).infoStickerModel.mFontType, false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$aw */
    static final class C44806aw<T> implements C0199s<String> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113420a;

        C44806aw(SubtitleModule subtitleModule) {
            this.f113420a = subtitleModule;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            String str = (String) obj;
            if (str != null) {
                SubtitleModule.m97961f(this.f113420a).infoStickerModel.mFontType = str;
                this.f113420a.mo90866I();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ax */
    static final class C44807ax<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113421a;

        C44807ax(SubtitleModule subtitleModule) {
            this.f113421a = subtitleModule;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                SubtitleModule.m97961f(this.f113421a).infoStickerModel.mBgMode = num.intValue();
                this.f113421a.mo90866I();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ay */
    static final class C44808ay<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113422a;

        C44808ay(SubtitleModule subtitleModule) {
            this.f113422a = subtitleModule;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                SubtitleModule.m97961f(this.f113422a).infoStickerModel.mColor = num.intValue();
                this.f113422a.mo90866I();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$az */
    static final class C44809az<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113423a;

        C44809az(SubtitleModule subtitleModule) {
            this.f113423a = subtitleModule;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                SubtitleModule.m97961f(this.f113423a).infoStickerModel.mAlign = num.intValue();
                this.f113423a.mo90866I();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$b */
    public static final class C44810b {

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$b$a */
        public static final class C44811a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return C52594a.m112153a(Integer.valueOf(((C44876i) t).f113575a), Integer.valueOf(((C44876i) t2).f113575a));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$b$b */
        public static final class C44812b implements VEInfoStickerBufferListener {

            /* renamed from: a */
            final /* synthetic */ AbstractMap f113424a;

            /* renamed from: b */
            final /* synthetic */ VideoPublishEditModel f113425b;

            /* renamed from: c */
            final /* synthetic */ Context f113426c;

            public final Bitmap onGetBuffer(int i) {
                if (this.f113424a.get(Integer.valueOf(i)) == null) {
                    C44810b.m98014a(this.f113425b.infoStickerModel, this.f113424a);
                    if (this.f113424a.get(Integer.valueOf(i)) == null) {
                        return null;
                    }
                }
                Object obj = this.f113424a.get(Integer.valueOf(i));
                if (obj == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a(obj, "map[index]!!");
                String text = ((StickerItemModel) obj).getText();
                SubtitleTextView subtitleTextView = new SubtitleTextView(this.f113426c, null, 2, null);
                subtitleTextView.setText(text);
                subtitleTextView.setTextColor(Color.parseColor("#FFFFFF"));
                if (C46679c.m101291a().mo93632c(this.f113425b.infoStickerModel.mFontType) == null) {
                    C46679c a = C46679c.m101291a();
                    C52711k.m112236a((Object) a, "TextFontStyleManager.getInstance()");
                    a.mo93629b();
                }
                C46679c.m101291a().mo93625a(this.f113425b.infoStickerModel.mFontType, 1);
                Typeface c = C46679c.m101291a().mo93632c(this.f113425b.infoStickerModel.mFontType);
                if (c != null) {
                    subtitleTextView.setFontType(c);
                }
                subtitleTextView.mo90950a(this.f113425b.infoStickerModel.mBgMode, this.f113425b.infoStickerModel.mColor);
                subtitleTextView.setAligin(this.f113425b.infoStickerModel.mAlign);
                subtitleTextView.measure(MeasureSpec.makeMeasureSpec(640, DynamicTabYellowPointVersion.DEFAULT), MeasureSpec.makeMeasureSpec(0, 0));
                Bitmap createBitmap = Bitmap.createBitmap(subtitleTextView.getMeasuredWidth(), subtitleTextView.getMeasuredHeight(), Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                subtitleTextView.layout(0, 0, subtitleTextView.getMeasuredWidth(), subtitleTextView.getMeasuredHeight());
                subtitleTextView.draw(canvas);
                return createBitmap;
            }

            C44812b(AbstractMap abstractMap, VideoPublishEditModel videoPublishEditModel, Context context) {
                this.f113424a = abstractMap;
                this.f113425b = videoPublishEditModel;
                this.f113426c = context;
            }
        }

        private C44810b() {
        }

        /* renamed from: a */
        public static HashMap<Integer, StickerItemModel> m98012a() {
            return SubtitleModule.f113309af;
        }

        public /* synthetic */ C44810b(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m98014a(InfoStickerModel infoStickerModel, AbstractMap<Integer, StickerItemModel> abstractMap) {
            C52711k.m112240b(abstractMap, "map");
            if (infoStickerModel == null || C9414h.m18630a(infoStickerModel.stickers)) {
                return false;
            }
            abstractMap.clear();
            for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
                if (stickerItemModel != null && (stickerItemModel.isSubtitle() || stickerItemModel.isSubtitleRule())) {
                    abstractMap.put(Integer.valueOf(stickerItemModel.f91605id), stickerItemModel);
                }
            }
            return true;
        }

        /* renamed from: a */
        public final void mo90918a(String str, String str2) {
            C52711k.m112240b(str, "vid");
            C52711k.m112240b(str2, "aid");
            if (!TextUtils.isEmpty(str2) && !m98012a().isEmpty()) {
                ArrayList arrayList = new ArrayList();
                Set<Entry> entrySet = m98012a().entrySet();
                C52711k.m112236a((Object) entrySet, "subtitlesMapCompile.entries");
                for (Entry entry : entrySet) {
                    Object value = entry.getValue();
                    C52711k.m112236a(value, "it.value");
                    if (((StickerItemModel) value).isSubtitle()) {
                        Object value2 = entry.getValue();
                        C52711k.m112236a(value2, "it.value");
                        arrayList.add(new C44876i((StickerItemModel) value2));
                    }
                }
                List list = arrayList;
                if (list.size() > 1) {
                    C52575l.m112105a(list, new C44811a());
                }
                String str3 = SubtitleModule.f113310ag;
                C44857a aVar = new C44857a(str, list);
                C52711k.m112240b(str, "vid");
                C52711k.m112240b(str2, "aid");
                C52711k.m112240b(str3, "id");
                C52711k.m112240b(aVar, "body");
                IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
                AVApi createAVApibyMonsterPlugin = AVApiImpl.createAVApibyMonsterPlugin();
                C52711k.m112236a((Object) createAVApibyMonsterPlugin, "ServiceManager.get().getService(AVApi::class.java)");
                ((SubtitleApi) createIRetrofitServicebyMonsterPlugin.createNewRetrofit(createAVApibyMonsterPlugin.getAPI_URL_PREFIX_SI()).create(SubtitleApi.class)).feedback(str, str2, str3, aVar);
                m98012a().clear();
            }
        }

        /* renamed from: a */
        public static void m98013a(C20347c cVar, Context context, VideoPublishEditModel videoPublishEditModel, AbstractMap<Integer, StickerItemModel> abstractMap) {
            C52711k.m112240b(cVar, "veEditor");
            C52711k.m112240b(context, "context");
            C52711k.m112240b(videoPublishEditModel, "model");
            C52711k.m112240b(abstractMap, "map");
            if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableSubtitleRecognition) && videoPublishEditModel.hasSubtitle()) {
                int a = cVar.mo42991a((VEInfoStickerBufferListener) new C44812b(abstractMap, videoPublishEditModel, context));
                StringBuilder sb = new StringBuilder("setInfoStickerBufferCallback ret=");
                sb.append(a);
                C50203g.m108358a(sb.toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ba */
    static final class C44813ba implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113427a;

        /* renamed from: b */
        final /* synthetic */ int f113428b;

        /* renamed from: c */
        final /* synthetic */ int f113429c;

        /* renamed from: d */
        final /* synthetic */ int f113430d;

        /* renamed from: e */
        final /* synthetic */ String f113431e;

        /* renamed from: f */
        final /* synthetic */ C44870h f113432f;

        C44813ba(SubtitleModule subtitleModule, int i, int i2, int i3, String str, C44870h hVar) {
            this.f113427a = subtitleModule;
            this.f113428b = i;
            this.f113429c = i2;
            this.f113430d = i3;
            this.f113431e = str;
            this.f113432f = hVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            SubtitleModule.m97962g(this.f113427a).mo90854a("", this.f113428b, this.f113429c, this.f113430d, this.f113431e, false);
            this.f113427a.mo90886a(this.f113432f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$bb */
    static final class C44814bb implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113433a;

        /* renamed from: b */
        final /* synthetic */ C44870h f113434b;

        C44814bb(SubtitleModule subtitleModule, C44870h hVar) {
            this.f113433a = subtitleModule;
            this.f113434b = hVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f113433a.mo90886a(this.f113434b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$bc */
    public static final class C44815bc extends C24453c {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113435a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$bc$a */
        static final class C44816a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C44815bc f113436a;

            C44816a(C44815bc bcVar) {
                this.f113436a = bcVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinearLayout f = this.f113436a.f113435a.mo90898f();
                float b = C9432q.m18687b((Context) SubtitleModule.m97959d(this.f113436a.f113435a), 40.0f);
                C52711k.m112236a((Object) valueAnimator, "animation");
                f.setTranslationY(b * valueAnimator.getAnimatedFraction());
                this.f113436a.f113435a.mo90898f().setAlpha(1.0f - valueAnimator.getAnimatedFraction());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$bc$b */
        public static final class C44817b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C44815bc f113437a;

            C44817b(C44815bc bcVar) {
                this.f113437a = bcVar;
            }

            public final void onAnimationEnd(Animator animator) {
                C52711k.m112240b(animator, "animation");
                this.f113437a.f113435a.mo90898f().setVisibility(4);
            }
        }

        /* renamed from: a */
        public final void mo50217a() {
            this.f113435a.mo90895c().setVisibility(4);
            this.f113435a.mo90896d().setVisibility(4);
            this.f113435a.mo90898f().setVisibility(0);
            ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
            C52711k.m112236a((Object) duration, "animator");
            duration.setInterpolator(new C10673c());
            duration.addUpdateListener(new C44816a(this));
            duration.addListener(new C44817b(this));
            duration.start();
        }

        C44815bc(SubtitleModule subtitleModule) {
            this.f113435a = subtitleModule;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$bd */
    public static final class C44818bd implements C44331a {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113438a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$bd$a */
        static final class C44819a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C44818bd f113439a;

            C44819a(C44818bd bdVar) {
                this.f113439a = bdVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                this.f113439a.f113438a.mo90876T();
                return C52860x.f131107a;
            }
        }

        /* renamed from: a */
        public final void mo90203a(int i) {
        }

        /* renamed from: a */
        public final void mo90202a() {
            this.f113438a.mo90888a((C52670a<C52860x>) new C44819a<C52860x>(this));
        }

        C44818bd(SubtitleModule subtitleModule) {
            this.f113438a = subtitleModule;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$c */
    public final class C44820c implements Runnable {
        public final void run() {
            int i;
            if (SubtitleModule.this.mo90899h().isShown() && SubtitleModule.this.mo90899h().getAdapter() != null) {
                int k = SubtitleModule.m97958c(SubtitleModule.this).mo4750k();
                if (k != -1) {
                    if (k == 0 || k == 1) {
                        View c = SubtitleModule.m97958c(SubtitleModule.this).mo4736c(k);
                        if (c != null) {
                            i = c.getBottom();
                        } else {
                            i = 0;
                        }
                        if (i < ((int) C9432q.m18687b((Context) SubtitleModule.m97959d(SubtitleModule.this), 52.0f))) {
                            k = Math.min(k + 2, SubtitleModule.m97958c(SubtitleModule.this).mo5013A() - 1);
                        }
                    } else {
                        k = Math.min(k + 2, SubtitleModule.m97958c(SubtitleModule.this).mo5013A() - 1);
                    }
                    if (!TextUtils.isEmpty(((UtteranceWithWords) SubtitleModule.m97960e(SubtitleModule.this).f113447c.get(k)).getText())) {
                        SubtitleModule.m97960e(SubtitleModule.this).mo90927a(k);
                    }
                }
            }
            SubtitleModule.m97957b(SubtitleModule.this).post(this);
        }

        public C44820c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$d */
    public final class C44821d implements Runnable {
        public final void run() {
            if (SubtitleModule.this.mo90899h().getAdapter() != null) {
                SubtitleModule subtitleModule = SubtitleModule.this;
                int N = subtitleModule.mo90871N();
                if (N >= 0) {
                    C44823f fVar = subtitleModule.f113365y;
                    if (fVar == null) {
                        C52711k.m112237a("mSubtitleAdapter");
                    }
                    if (fVar.f113445a != N) {
                        if (N == 0) {
                            subtitleModule.f113352l = 0.004f;
                        } else {
                            subtitleModule.f113352l = 400.0f;
                        }
                        C44823f fVar2 = subtitleModule.f113365y;
                        if (fVar2 == null) {
                            C52711k.m112237a("mSubtitleAdapter");
                        }
                        if (!TextUtils.isEmpty(((UtteranceWithWords) fVar2.f113447c.get(N)).getText()) || N == 0) {
                            HighLightLayoutManager highLightLayoutManager = subtitleModule.f113364x;
                            if (highLightLayoutManager == null) {
                                C52711k.m112237a("mHighLightLayoutManager");
                            }
                            AVDmtPanelRecyleView aVDmtPanelRecyleView = subtitleModule.mRecyclerView;
                            if (aVDmtPanelRecyleView == null) {
                                C52711k.m112237a("mRecyclerView");
                            }
                            highLightLayoutManager.mo4726a(aVDmtPanelRecyleView, new C1349s(), N);
                            C44823f fVar3 = subtitleModule.f113365y;
                            if (fVar3 == null) {
                                C52711k.m112237a("mSubtitleAdapter");
                            }
                            fVar3.mo90927a(N);
                        }
                    }
                }
            }
            SubtitleModule.m97957b(SubtitleModule.this).post(this);
        }

        public C44821d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$e */
    public final class C44822e extends C1331h {

        /* renamed from: b */
        private final int f113443b;

        /* renamed from: c */
        private final int f113444c;

        public C44822e(int i, int i2) {
            this.f113443b = i;
            this.f113444c = i2;
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
            Integer num;
            C52711k.m112240b(rect, "outRect");
            C52711k.m112240b(view, "view");
            C52711k.m112240b(recyclerView, "parent");
            C52711k.m112240b(sVar, "state");
            int f = RecyclerView.m4275f(view);
            if (f == 0) {
                rect.top = this.f113443b;
            }
            C1332i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                num = Integer.valueOf(layoutManager.mo5013A() - 1);
            } else {
                num = null;
            }
            if (num != null) {
                C1332i layoutManager2 = recyclerView.getLayoutManager();
                if (layoutManager2 != null && f == layoutManager2.mo5013A() - 1) {
                    rect.bottom = this.f113444c;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$f */
    public final class C44823f extends C1322a<C44824a> {

        /* renamed from: a */
        public int f113445a = -1;

        /* renamed from: b */
        public View f113446b;

        /* renamed from: c */
        public ArrayList<UtteranceWithWords> f113447c;

        /* renamed from: d */
        final /* synthetic */ SubtitleModule f113448d;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$f$a */
        public final class C44824a extends C1352v {

            /* renamed from: a */
            public final TextView f113449a;

            /* renamed from: b */
            final /* synthetic */ C44823f f113450b;

            public C44824a(C44823f fVar, View view) {
                C52711k.m112240b(view, "itemView");
                this.f113450b = fVar;
                super(view);
                View findViewById = view.findViewById(R.id.cuy);
                C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.subtitle_item_text)");
                this.f113449a = (TextView) findViewById;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$f$b */
        static final class C44825b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C44823f f113451a;

            /* renamed from: b */
            final /* synthetic */ C44824a f113452b;

            C44825b(C44823f fVar, C44824a aVar) {
                this.f113451a = fVar;
                this.f113452b = aVar;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f113451a.f113448d.mo90883a(this.f113452b.getAdapterPosition(), false);
            }
        }

        public final int getItemCount() {
            return this.f113447c.size();
        }

        /* renamed from: a */
        public final void mo90928a(List<? extends UtteranceWithWords> list) {
            C52711k.m112240b(list, "list");
            ArrayList<UtteranceWithWords> arrayList = new ArrayList<>();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new UtteranceWithWords((UtteranceWithWords) list.get(i)));
            }
            this.f113447c = arrayList;
            notifyDataSetChanged();
        }

        /* renamed from: a */
        public final void mo90927a(int i) {
            if (i != -1 && i != this.f113445a) {
                int i2 = this.f113445a;
                this.f113445a = i;
                if (this.f113448d.mo90899h().mo4847f(i2) != null) {
                    C1352v f = this.f113448d.mo90899h().mo4847f(i2);
                    if (f != null) {
                        ((C44824a) f).f113449a.setTextColor(this.f113448d.mo24478w().getColor(R.color.asw));
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule.SubtitleAdapter.SubtitleViewHolder");
                    }
                }
                if (this.f113448d.mo90899h().mo4847f(i) != null) {
                    C1352v f2 = this.f113448d.mo90899h().mo4847f(i);
                    if (f2 != null) {
                        ((C44824a) f2).f113449a.setTextColor(this.f113448d.mo24478w().getColor(R.color.aso));
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule.SubtitleAdapter.SubtitleViewHolder");
                    }
                }
            }
        }

        public C44823f(SubtitleModule subtitleModule, ArrayList<UtteranceWithWords> arrayList) {
            C52711k.m112240b(arrayList, "list");
            this.f113448d = subtitleModule;
            this.f113447c = arrayList;
        }

        public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            C52711k.m112240b(viewGroup, "p0");
            View inflate = LayoutInflater.from(SubtitleModule.m97959d(this.f113448d)).inflate(R.layout.af9, viewGroup, false);
            C52711k.m112236a((Object) inflate, "LayoutInflater.from(mAct…subtitle_item, p0, false)");
            this.f113446b = inflate;
            View view = this.f113446b;
            if (view == null) {
                C52711k.m112237a("view");
            }
            return new C44824a(this, view);
        }

        public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
            boolean z;
            C44824a aVar = (C44824a) vVar;
            C52711k.m112240b(aVar, "p0");
            if (this.f113445a == i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                aVar.f113449a.setTextColor(this.f113448d.mo24478w().getColor(R.color.aso));
            } else {
                aVar.f113449a.setTextColor(this.f113448d.mo24478w().getColor(R.color.asw));
            }
            aVar.f113449a.setVisibility(0);
            aVar.f113449a.setText(((UtteranceWithWords) this.f113447c.get(i)).getText());
            if (!TextUtils.isEmpty(aVar.f113449a.getText())) {
                aVar.f113449a.setOnClickListener(new C44825b(this, aVar));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$g */
    public final class C44826g implements Runnable {

        /* renamed from: b */
        private int f113454b;

        /* renamed from: c */
        private final int[] f113455c = {R.string.n5, R.string.n6, R.string.n7};

        public final void run() {
            TextView textView = SubtitleModule.this.mLoadingHint;
            if (textView == null) {
                C52711k.m112237a("mLoadingHint");
            }
            int[] iArr = this.f113455c;
            int i = this.f113454b;
            this.f113454b = i + 1;
            textView.setText(iArr[i]);
            this.f113454b %= 3;
            SubtitleModule.m97949a(SubtitleModule.this).postDelayed(this, 5000);
        }

        public C44826g() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$h */
    static final class C44827h extends C52712l implements C52670a<SubtitleApi> {

        /* renamed from: a */
        public static final C44827h f113456a = new C44827h();

        C44827h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (SubtitleApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit("https://speech.bytedance.com").create(SubtitleApi.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$i */
    public static final class C44828i implements C50711k {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113457a;

        /* renamed from: b */
        final /* synthetic */ int f113458b;

        C44828i(SubtitleModule subtitleModule, int i) {
            this.f113457a = subtitleModule;
            this.f113458b = i;
        }

        public final void onCallback(int i, int i2, float f, String str) {
            if (i == 4116) {
                C32458a.m75144a("receive prepare done event in backToPlayLayout");
                C20347c cVar = this.f113457a.f113317E;
                if (cVar != null) {
                    cVar.mo42983a(this.f113458b, C50743d.EDITOR_SEEK_FLAG_LastSeek);
                }
                C20347c cVar2 = this.f113457a.f113317E;
                if (cVar2 != null) {
                    cVar2.mo43089t();
                }
                C20347c cVar3 = this.f113457a.f113317E;
                if (cVar3 != null) {
                    cVar3.mo43048c((C50711k) this);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$j */
    static final class C44829j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113459a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f113460b;

        /* renamed from: c */
        final /* synthetic */ C44870h f113461c;

        /* renamed from: d */
        final /* synthetic */ long f113462d;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$j$a */
        static final class C44830a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C44829j f113463a;

            C44830a(C44829j jVar) {
                this.f113463a = jVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f113463a.f113459a.mo90887a(this.f113463a.f113461c, (int) this.f113463a.f113462d);
            }
        }

        C44829j(SubtitleModule subtitleModule, ArrayList arrayList, C44870h hVar, long j) {
            this.f113459a = subtitleModule;
            this.f113460b = arrayList;
            this.f113461c = hVar;
            this.f113462d = j;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f113459a.mo90890a(this.f113460b);
            if (this.f113459a.f113338Z) {
                new C10643a(SubtitleModule.m97959d(this.f113459a)).mo18899b((int) R.string.mj).mo18900b((int) R.string.wf, (OnClickListener) null).mo18886a((int) R.string.ah2, (OnClickListener) new C44830a(this)).mo18897a().mo18882b().show();
            } else {
                this.f113459a.mo90887a(this.f113461c, (int) this.f113462d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$k */
    static final class C44831k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113464a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f113465b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f113466c;

        /* renamed from: d */
        final /* synthetic */ C44870h f113467d;

        C44831k(SubtitleModule subtitleModule, ArrayList arrayList, ArrayList arrayList2, C44870h hVar) {
            this.f113464a = subtitleModule;
            this.f113465b = arrayList;
            this.f113466c = arrayList2;
            this.f113467d = hVar;
        }

        public final void onClick(View view) {
            int i;
            boolean z;
            ClickInstrumentation.onClick(view);
            this.f113464a.mo90890a(this.f113465b);
            C44863g h = SubtitleModule.m97963h(this.f113464a);
            if (h.f113544j == -1) {
                i = ((UtteranceWithWords) h.f113542h.get(0)).getStartTime();
            } else {
                i = ((UtteranceWithWords) h.f113542h.get(h.f113544j)).getStartTime();
            }
            if (this.f113464a.f113338Z) {
                List a = SubtitleModule.m97963h(this.f113464a).mo90975a();
                int size = a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    int indexOf = this.f113466c.indexOf(a.get(i2));
                    if (indexOf > 0) {
                        ((UtteranceWithWords) this.f113466c.get(indexOf - 1)).setEndTime(((UtteranceWithWords) a.get(i2)).getEndTime());
                    }
                    this.f113466c.remove(a.get(i2));
                }
                int size2 = this.f113466c.size() - 1;
                Iterator it = this.f113466c.iterator();
                while (it.hasNext()) {
                    UtteranceWithWords utteranceWithWords = (UtteranceWithWords) it.next();
                    if (!(utteranceWithWords.getStartTime() == 0 && utteranceWithWords.getEndTime() == this.f113464a.f113318F) && utteranceWithWords.getStartTime() <= i && i <= utteranceWithWords.getEndTime()) {
                        size2 = this.f113466c.indexOf(utteranceWithWords);
                    }
                }
                SubtitleModule.m97960e(this.f113464a).mo90927a(size2);
                SubtitleModule.m97960e(this.f113464a).mo90928a((List<? extends UtteranceWithWords>) this.f113466c);
                SubtitleModule subtitleModule = this.f113464a;
                subtitleModule.f113363w.mo88656e(false);
                ArrayList arrayList = new ArrayList();
                C44823f fVar = subtitleModule.f113365y;
                if (fVar == null) {
                    C52711k.m112237a("mSubtitleAdapter");
                }
                ArrayList<UtteranceWithWords> arrayList2 = fVar.f113447c;
                int size3 = arrayList2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    if (((UtteranceWithWords) arrayList2.get(i3)).getText().length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        Object obj = arrayList2.get(i3);
                        C52711k.m112236a(obj, "listData[i]");
                        arrayList.add(new UtteranceWithWords((UtteranceWithWords) obj));
                    }
                }
                if (arrayList.isEmpty()) {
                    ImageView imageView = subtitleModule.mIvEdit;
                    if (imageView == null) {
                        C52711k.m112237a("mIvEdit");
                    }
                    imageView.setVisibility(8);
                }
                subtitleModule.f113363w.mo88635a((List<UtteranceWithWords>) arrayList);
                C20347c cVar = subtitleModule.f113317E;
                if (cVar != null) {
                    cVar.mo43089t();
                }
            }
            this.f113464a.mo90887a(this.f113467d, i);
            C26890h.m65011a("save_edit_subtitle", this.f113464a.mo90881Y().f107329a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$l */
    public static final class C44832l implements C46749a {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113468a;

        /* renamed from: c */
        public final void mo73972c(int i) {
        }

        C44832l(SubtitleModule subtitleModule) {
            this.f113468a = subtitleModule;
        }

        /* renamed from: b */
        public final void mo73971b(int i) {
            if (this.f113468a.f113335W != null) {
                RecyclerView i2 = SubtitleModule.m97964i(this.f113468a);
                C44822e eVar = this.f113468a.f113335W;
                if (eVar == null) {
                    C52711k.m112234a();
                }
                i2.mo4815b((C1331h) eVar);
                this.f113468a.f113335W = null;
            }
            this.f113468a.f113342ad = false;
        }

        /* renamed from: a */
        public final void mo73970a(int i) {
            if (this.f113468a.f113335W == null) {
                this.f113468a.f113335W = new C44822e(0, i);
                RecyclerView i2 = SubtitleModule.m97964i(this.f113468a);
                C44822e eVar = this.f113468a.f113335W;
                if (eVar == null) {
                    C52711k.m112234a();
                }
                i2.mo4798a((C1331h) eVar);
                C1332i layoutManager = SubtitleModule.m97964i(this.f113468a).getLayoutManager();
                if (layoutManager != null) {
                    ((LinearLayoutManager) layoutManager).mo4721a(SubtitleModule.m97963h(this.f113468a).f113544j, (int) C9432q.m18687b((Context) SubtitleModule.m97959d(this.f113468a), 100.0f));
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                }
            }
            this.f113468a.f113342ad = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$m */
    public static final class C44833m extends C24453c {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113469a;

        /* renamed from: b */
        public final void mo50221b() {
            InputMethodManager inputMethodManager = this.f113469a.f113324L;
            if (inputMethodManager == null) {
                C52711k.m112237a("mIMManager");
            }
            inputMethodManager.toggleSoftInput(0, 2);
        }

        C44833m(SubtitleModule subtitleModule) {
            this.f113469a = subtitleModule;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$n */
    public static final class C44834n implements C46749a {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113470a;

        /* renamed from: b */
        final /* synthetic */ C44870h f113471b;

        /* renamed from: c */
        final /* synthetic */ int f113472c;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$n$a */
        public static final class C44835a extends C24453c {

            /* renamed from: a */
            final /* synthetic */ C44834n f113473a;

            /* renamed from: c */
            public final void mo50224c() {
            }

            /* renamed from: d */
            public final void mo50225d() {
                this.f113473a.f113470a.mo90897d(this.f113473a.f113472c);
                if (this.f113473a.f113470a.f113335W != null) {
                    RecyclerView i = SubtitleModule.m97964i(this.f113473a.f113470a);
                    C44822e eVar = this.f113473a.f113470a.f113335W;
                    if (eVar == null) {
                        C52711k.m112234a();
                    }
                    i.mo4815b((C1331h) eVar);
                    this.f113473a.f113470a.f113335W = null;
                }
            }

            C44835a(C44834n nVar) {
                this.f113473a = nVar;
            }
        }

        /* renamed from: a */
        public final void mo73970a(int i) {
        }

        /* renamed from: c */
        public final void mo73972c(int i) {
        }

        /* renamed from: b */
        public final void mo73971b(int i) {
            this.f113471b.mo50223b(new C44835a(this));
            this.f113470a.f113342ad = false;
        }

        C44834n(SubtitleModule subtitleModule, C44870h hVar, int i) {
            this.f113470a = subtitleModule;
            this.f113471b = hVar;
            this.f113472c = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$o */
    public static final class C44836o extends C24453c {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113474a;

        /* renamed from: b */
        final /* synthetic */ int f113475b;

        /* renamed from: c */
        public final void mo50224c() {
        }

        /* renamed from: d */
        public final void mo50225d() {
            this.f113474a.mo90897d(this.f113475b);
            if (this.f113474a.f113335W != null) {
                RecyclerView i = SubtitleModule.m97964i(this.f113474a);
                C44822e eVar = this.f113474a.f113335W;
                if (eVar == null) {
                    C52711k.m112234a();
                }
                i.mo4815b((C1331h) eVar);
                this.f113474a.f113335W = null;
            }
        }

        C44836o(SubtitleModule subtitleModule, int i) {
            this.f113474a = subtitleModule;
            this.f113475b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$p */
    static final class C44837p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113476a;

        C44837p(SubtitleModule subtitleModule) {
            this.f113476a = subtitleModule;
        }

        public final void run() {
            this.f113476a.mo90878V();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$q */
    static final class C44838q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113477a;

        C44838q(SubtitleModule subtitleModule) {
            this.f113477a = subtitleModule;
        }

        public final void run() {
            this.f113477a.mo90878V();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$r */
    public static final class C44839r implements C50547k {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113478a;

        /* renamed from: b */
        final /* synthetic */ String f113479b;

        /* renamed from: c */
        final /* synthetic */ CountDownLatch f113480c;

        public final void onCompileProgress(float f) {
        }

        public final void onCompileDone() {
            this.f113478a.f113330R = this.f113479b;
            this.f113480c.countDown();
        }

        C44839r(SubtitleModule subtitleModule, String str, CountDownLatch countDownLatch) {
            this.f113478a = subtitleModule;
            this.f113479b = str;
            this.f113480c = countDownLatch;
        }

        public final void onCompileError(int i, int i2, float f, String str) {
            StringBuilder sb = new StringBuilder("subtitle mix fail, code =");
            sb.append(i);
            C50203g.m108361b(sb.toString());
            this.f113480c.countDown();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$s */
    static final class C44840s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113481a;

        C44840s(SubtitleModule subtitleModule) {
            this.f113481a = subtitleModule;
        }

        public final void run() {
            this.f113481a.mo90878V();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$t */
    public static final class C44841t implements C50547k {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113482a;

        /* renamed from: b */
        final /* synthetic */ String f113483b;

        /* renamed from: c */
        final /* synthetic */ CountDownLatch f113484c;

        public final void onCompileProgress(float f) {
        }

        public final void onCompileDone() {
            this.f113482a.f113330R = this.f113483b;
            this.f113484c.countDown();
        }

        C44841t(SubtitleModule subtitleModule, String str, CountDownLatch countDownLatch) {
            this.f113482a = subtitleModule;
            this.f113483b = str;
            this.f113484c = countDownLatch;
        }

        public final void onCompileError(int i, int i2, float f, String str) {
            StringBuilder sb = new StringBuilder("subtitle mix fail, code =");
            sb.append(i);
            C50203g.m108361b(sb.toString());
            this.f113484c.countDown();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$u */
    public static final class C44842u extends C24453c {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113485a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$u$a */
        static final class C44843a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C44842u f113486a;

            C44843a(C44842u uVar) {
                this.f113486a = uVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinearLayout f = this.f113486a.f113485a.mo90898f();
                float b = C9432q.m18687b((Context) SubtitleModule.m97959d(this.f113486a.f113485a), 40.0f);
                float b2 = 0.0f - C9432q.m18687b((Context) SubtitleModule.m97959d(this.f113486a.f113485a), 40.0f);
                C52711k.m112236a((Object) valueAnimator, "animation");
                f.setTranslationY(b + (b2 * valueAnimator.getAnimatedFraction()));
                this.f113486a.f113485a.mo90898f().setAlpha(valueAnimator.getAnimatedFraction());
            }
        }

        /* renamed from: d */
        public final void mo50225d() {
            this.f113485a.mo90895c().setVisibility(0);
            this.f113485a.mo90896d().setVisibility(0);
        }

        /* renamed from: c */
        public final void mo50224c() {
            this.f113485a.mo90898f().setVisibility(0);
            ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
            C52711k.m112236a((Object) duration, "animator");
            duration.setInterpolator(new C10673c());
            duration.addUpdateListener(new C44843a(this));
            duration.start();
        }

        C44842u(SubtitleModule subtitleModule) {
            this.f113485a = subtitleModule;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$v */
    public static final class C44844v implements C29087a {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113487a;

        /* renamed from: b */
        private boolean f113488b;

        /* renamed from: c */
        public final boolean mo58931c() {
            return this.f113488b;
        }

        /* renamed from: d */
        public final long mo58932d() {
            return 0;
        }

        /* renamed from: a */
        public final long mo58927a() {
            long j;
            C20347c cVar = this.f113487a.f113317E;
            if (cVar != null) {
                j = (long) cVar.mo43073l();
            } else {
                j = 0;
            }
            return mo58928a(j);
        }

        /* renamed from: b */
        public final boolean mo58930b() {
            Integer num;
            long a = mo58927a();
            if (!this.f113488b) {
                C20347c cVar = this.f113487a.f113317E;
                if (cVar != null) {
                    num = Integer.valueOf(cVar.mo43071k());
                } else {
                    num = null;
                }
            } else {
                num = Integer.valueOf(0);
            }
            if (num == null || a != ((long) num.intValue())) {
                return false;
            }
            return true;
        }

        C44844v(SubtitleModule subtitleModule) {
            this.f113487a = subtitleModule;
        }

        /* renamed from: a */
        public final void mo58929a(boolean z) {
            this.f113488b = z;
            C20347c cVar = this.f113487a.f113317E;
            if (cVar != null) {
                cVar.mo43043c(z);
            }
        }

        /* renamed from: a */
        public final long mo58928a(long j) {
            if (this.f113488b) {
                C20347c cVar = this.f113487a.f113317E;
                if (cVar != null) {
                    return ((long) cVar.mo43071k()) - j;
                }
                j = 0;
            }
            return j;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$w */
    static final class C44845w<T> implements C0199s<C53030y> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113489a;

        C44845w(SubtitleModule subtitleModule) {
            this.f113489a = subtitleModule;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C53030y yVar = (C53030y) obj;
            if (yVar != null) {
                if (yVar.f131507a == 0) {
                    this.f113489a.f113357q = true;
                    if (this.f113489a.mo90899h().getAdapter() != null) {
                        this.f113489a.f113327O = new C44821d();
                        SubtitleModule.m97957b(this.f113489a).post(this.f113489a.f113327O);
                    }
                } else {
                    this.f113489a.f113357q = false;
                    this.f113489a.mo90870M();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$x */
    static final class C44846x<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113490a;

        C44846x(SubtitleModule subtitleModule) {
            this.f113490a = subtitleModule;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            long j;
            int i;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                SubtitleModule subtitleModule = this.f113490a;
                boolean booleanValue = bool.booleanValue();
                if (!booleanValue) {
                    TextView textView = subtitleModule.mSaveView;
                    if (textView == null) {
                        C52711k.m112237a("mSaveView");
                    }
                    textView.setVisibility(4);
                    TextView textView2 = subtitleModule.mCancelView;
                    if (textView2 == null) {
                        C52711k.m112237a("mCancelView");
                    }
                    textView2.setVisibility(4);
                    FrameLayout frameLayout = subtitleModule.mContentLayout;
                    if (frameLayout == null) {
                        C52711k.m112237a("mContentLayout");
                    }
                    View view = subtitleModule.f113360t;
                    if (view == null) {
                        C52711k.m112237a("mEditTypeView");
                    }
                    frameLayout.removeView(view);
                    View view2 = subtitleModule.f113363w.f110162e;
                    C52711k.m112236a((Object) view2, "mInfoStickerHelper.mIvPlay");
                    view2.setVisibility(8);
                }
                FrameLayout frameLayout2 = subtitleModule.mContentLayout;
                if (frameLayout2 == null) {
                    C52711k.m112237a("mContentLayout");
                }
                View view3 = frameLayout2;
                int F = subtitleModule.mo90863F();
                ViewGroup viewGroup = subtitleModule.f113319G;
                if (viewGroup == null) {
                    C52711k.m112237a("mSubtitleView");
                }
                C29218v.m68807a(view3, booleanValue, F, (View) viewGroup, (C0781c<Void>) C44804au.f113418a);
                if (booleanValue) {
                    subtitleModule.f113350j = "origin";
                    subtitleModule.f113351k = System.currentTimeMillis();
                    FrameLayout frameLayout3 = subtitleModule.mContentLayout;
                    if (frameLayout3 == null) {
                        C52711k.m112237a("mContentLayout");
                    }
                    View view4 = subtitleModule.f113361u;
                    if (view4 == null) {
                        C52711k.m112237a("mRetryView");
                    }
                    frameLayout3.removeView(view4);
                    FrameLayout frameLayout4 = subtitleModule.mContentLayout;
                    if (frameLayout4 == null) {
                        C52711k.m112237a("mContentLayout");
                    }
                    View view5 = subtitleModule.f113362v;
                    if (view5 == null) {
                        C52711k.m112237a("mExitView");
                    }
                    frameLayout4.removeView(view5);
                    subtitleModule.f113352l = 0.004f;
                    subtitleModule.f113338Z = false;
                    subtitleModule.mo90869L();
                    C0198r<C53030y> rVar = subtitleModule.f113321I;
                    if (rVar == null) {
                        C52711k.m112237a("mPreviewControlOpLiveData");
                    }
                    C29087a aVar = subtitleModule.f113320H;
                    if (aVar == null) {
                        C52711k.m112237a("mCurrentPositionSource");
                    }
                    if (aVar.mo58931c()) {
                        C20347c cVar = subtitleModule.f113317E;
                        if (cVar != null) {
                            i = cVar.mo43071k();
                        } else {
                            i = 0;
                        }
                        j = (long) i;
                    } else {
                        j = 0;
                    }
                    rVar.setValue(C53030y.m112775b(j));
                    VideoPublishEditModel videoPublishEditModel = subtitleModule.f113313A;
                    if (videoPublishEditModel == null) {
                        C52711k.m112237a("mModel");
                    }
                    if (videoPublishEditModel.infoStickerModel == null) {
                        VideoPublishEditModel videoPublishEditModel2 = subtitleModule.f113313A;
                        if (videoPublishEditModel2 == null) {
                            C52711k.m112237a("mModel");
                        }
                        VideoPublishEditModel videoPublishEditModel3 = subtitleModule.f113313A;
                        if (videoPublishEditModel3 == null) {
                            C52711k.m112237a("mModel");
                        }
                        videoPublishEditModel2.infoStickerModel = new InfoStickerModel(videoPublishEditModel3.draftDir());
                    } else {
                        VideoPublishEditModel videoPublishEditModel4 = subtitleModule.f113313A;
                        if (videoPublishEditModel4 == null) {
                            C52711k.m112237a("mModel");
                        }
                        InfoStickerModel infoStickerModel = videoPublishEditModel4.infoStickerModel;
                        C52711k.m112236a((Object) infoStickerModel, "mModel.infoStickerModel");
                        subtitleModule.f113336X = infoStickerModel.getSubtitleRule();
                    }
                    subtitleModule.f113363w.mo88649c((C43509at) null);
                    if (subtitleModule.f113336X >= 0 && subtitleModule.f113336X < subtitleModule.f113363w.f110161d.f109932g.f110107a.size()) {
                        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = subtitleModule.f113316D;
                        if (vEVideoPublishEditViewModel == null) {
                            C52711k.m112237a("mVEVideoPublishEditViewModel");
                        }
                        C0198r r = vEVideoPublishEditViewModel.mo110473r();
                        C52711k.m112236a((Object) r, "mVEVideoPublishEditViewModel.inTimeEditView");
                        r.setValue(Boolean.valueOf(true));
                    }
                    VideoPublishEditModel videoPublishEditModel5 = subtitleModule.f113313A;
                    if (videoPublishEditModel5 == null) {
                        C52711k.m112237a("mModel");
                    }
                    if (videoPublishEditModel5.infoStickerModel.mFontType == null) {
                        VideoPublishEditModel videoPublishEditModel6 = subtitleModule.f113313A;
                        if (videoPublishEditModel6 == null) {
                            C52711k.m112237a("mModel");
                        }
                        InfoStickerModel infoStickerModel2 = videoPublishEditModel6.infoStickerModel;
                        C46679c a = C46679c.m101291a();
                        C52711k.m112236a((Object) a, "TextFontStyleManager.getInstance()");
                        infoStickerModel2.mFontType = a.mo93633c();
                        VideoPublishEditModel videoPublishEditModel7 = subtitleModule.f113313A;
                        if (videoPublishEditModel7 == null) {
                            C52711k.m112237a("mModel");
                        }
                        if (videoPublishEditModel7.infoStickerModel.mFontType == null) {
                            VideoPublishEditModel videoPublishEditModel8 = subtitleModule.f113313A;
                            if (videoPublishEditModel8 == null) {
                                C52711k.m112237a("mModel");
                            }
                            videoPublishEditModel8.infoStickerModel.mFontType = "default";
                        }
                    }
                    VideoPublishEditModel videoPublishEditModel9 = subtitleModule.f113313A;
                    if (videoPublishEditModel9 == null) {
                        C52711k.m112237a("mModel");
                    }
                    subtitleModule.f113355o = new InfoStickerModel(videoPublishEditModel9.infoStickerModel);
                    C23441t tVar = subtitleModule.f113339aa;
                    if (tVar == null) {
                        C52711k.m112237a("mListenableActivityRegistry");
                    }
                    tVar.mo48605a(subtitleModule.f113340ab);
                    VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = subtitleModule.f113316D;
                    if (vEVideoPublishEditViewModel2 == null) {
                        C52711k.m112237a("mVEVideoPublishEditViewModel");
                    }
                    C0198r g = vEVideoPublishEditViewModel2.mo110462g();
                    C52711k.m112236a((Object) g, "mVEVideoPublishEditViewM…deoPreviewScaleOpChangeV2");
                    C52905a aVar2 = C52904aa.f131229l;
                    int a2 = C46788b.f118235d.mo94007a(true, false, false, false, false);
                    int i2 = subtitleModule.mo90900i();
                    FragmentActivity fragmentActivity = subtitleModule.f113315C;
                    if (fragmentActivity == null) {
                        C52711k.m112237a("mActivity");
                    }
                    g.setValue(C52905a.m112589a(aVar2, a2, C43303dy.m94972c(fragmentActivity) + i2, subtitleModule.mo90863F(), subtitleModule.mo90872O(), C22452a.m55498d(), 0, false, false, false, false, 960, null));
                    if (subtitleModule.mo90873P() || subtitleModule.mo90874Q()) {
                        subtitleModule.mo90865H();
                        subtitleModule.mo90892a(true);
                        subtitleModule.f113329Q.clear();
                        ImageView imageView = subtitleModule.mIvEdit;
                        if (imageView == null) {
                            C52711k.m112237a("mIvEdit");
                        }
                        imageView.setVisibility(0);
                        subtitleModule.f113330R = null;
                        if (subtitleModule.f113331S == null) {
                            FragmentActivity fragmentActivity2 = subtitleModule.f113315C;
                            if (fragmentActivity2 == null) {
                                C52711k.m112237a("mActivity");
                            }
                            NetStateReceiver.m97101a((Context) fragmentActivity2);
                            subtitleModule.f113331S = new C44818bd(subtitleModule);
                            NetStateReceiver.m97102a(subtitleModule.f113331S);
                        }
                        if (subtitleModule.f113337Y) {
                            subtitleModule.mo90879W();
                        } else {
                            subtitleModule.mo90876T();
                        }
                    } else {
                        VideoPublishEditModel videoPublishEditModel10 = subtitleModule.f113313A;
                        if (videoPublishEditModel10 == null) {
                            C52711k.m112237a("mModel");
                        }
                        C44810b.m98014a(videoPublishEditModel10.infoStickerModel, (AbstractMap<Integer, StickerItemModel>) SubtitleModule.f113308ae);
                        ArrayList arrayList = new ArrayList();
                        Set<Entry> entrySet = SubtitleModule.f113308ae.entrySet();
                        C52711k.m112236a((Object) entrySet, "subtitlesMap.entries");
                        for (Entry entry : entrySet) {
                            Object value = entry.getValue();
                            C52711k.m112236a(value, "it.value");
                            if (((StickerItemModel) value).isSubtitle()) {
                                Object value2 = entry.getValue();
                                C52711k.m112236a(value2, "it.value");
                                arrayList.add(new UtteranceWithWords((StickerItemModel) value2));
                            }
                        }
                        List list = arrayList;
                        if (list.size() > 1) {
                            C52575l.m112105a(list, new C44803at());
                        }
                        subtitleModule.mo90894b(list);
                        subtitleModule.mo90892a(false);
                        subtitleModule.mo90868K();
                    }
                    subtitleModule.f113363w.mo88631a((C44858b) new C44805av(subtitleModule));
                    return;
                }
                VEVideoPublishEditViewModel vEVideoPublishEditViewModel3 = subtitleModule.f113316D;
                if (vEVideoPublishEditViewModel3 == null) {
                    C52711k.m112237a("mVEVideoPublishEditViewModel");
                }
                C0198r r2 = vEVideoPublishEditViewModel3.mo110473r();
                C52711k.m112236a((Object) r2, "mVEVideoPublishEditViewModel.inTimeEditView");
                r2.setValue(Boolean.valueOf(false));
                subtitleModule.f113363w.mo88661j();
                C23441t tVar2 = subtitleModule.f113339aa;
                if (tVar2 == null) {
                    C52711k.m112237a("mListenableActivityRegistry");
                }
                tVar2.mo48606b(subtitleModule.f113340ab);
                VEVideoPublishEditViewModel vEVideoPublishEditViewModel4 = subtitleModule.f113316D;
                if (vEVideoPublishEditViewModel4 == null) {
                    C52711k.m112237a("mVEVideoPublishEditViewModel");
                }
                C0198r g2 = vEVideoPublishEditViewModel4.mo110462g();
                C52711k.m112236a((Object) g2, "mVEVideoPublishEditViewM…deoPreviewScaleOpChangeV2");
                int color = subtitleModule.mo24478w().getColor(R.color.ip);
                int i3 = subtitleModule.mo90900i();
                FragmentActivity fragmentActivity3 = subtitleModule.f113315C;
                if (fragmentActivity3 == null) {
                    C52711k.m112237a("mActivity");
                }
                g2.setValue(C52905a.m112586a(color, i3 + C43303dy.m94972c(fragmentActivity3), subtitleModule.mo90863F(), subtitleModule.mo90872O(), C22452a.m55498d(), 0));
                subtitleModule.f113363w.mo88631a((C44858b) null);
                View view6 = subtitleModule.f113363w.f110162e;
                C52711k.m112236a((Object) view6, "mInfoStickerHelper.mIvPlay");
                view6.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$y */
    public static final class C44847y extends C47687av {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f113491a;

        C44847y(SubtitleModule subtitleModule) {
            this.f113491a = subtitleModule;
        }

        /* renamed from: a */
        public final void mo59929a(View view) {
            View view2 = view;
            C52711k.m112240b(view2, "v");
            SubtitleModule subtitleModule = this.f113491a;
            TextView textView = subtitleModule.mCancelView;
            if (textView == null) {
                C52711k.m112237a("mCancelView");
            }
            if (C52711k.m112239a((Object) view2, (Object) textView)) {
                VideoPublishEditModel videoPublishEditModel = subtitleModule.f113313A;
                if (videoPublishEditModel == null) {
                    C52711k.m112237a("mModel");
                }
                int i = videoPublishEditModel.infoStickerModel.mAlign;
                InfoStickerModel infoStickerModel = subtitleModule.f113355o;
                if (infoStickerModel == null) {
                    C52711k.m112237a("mInfoStickerModelTmp");
                }
                if (i == infoStickerModel.mAlign) {
                    VideoPublishEditModel videoPublishEditModel2 = subtitleModule.f113313A;
                    if (videoPublishEditModel2 == null) {
                        C52711k.m112237a("mModel");
                    }
                    int i2 = videoPublishEditModel2.infoStickerModel.mBgMode;
                    InfoStickerModel infoStickerModel2 = subtitleModule.f113355o;
                    if (infoStickerModel2 == null) {
                        C52711k.m112237a("mInfoStickerModelTmp");
                    }
                    if (i2 == infoStickerModel2.mBgMode) {
                        VideoPublishEditModel videoPublishEditModel3 = subtitleModule.f113313A;
                        if (videoPublishEditModel3 == null) {
                            C52711k.m112237a("mModel");
                        }
                        int i3 = videoPublishEditModel3.infoStickerModel.mColor;
                        InfoStickerModel infoStickerModel3 = subtitleModule.f113355o;
                        if (infoStickerModel3 == null) {
                            C52711k.m112237a("mInfoStickerModelTmp");
                        }
                        if (i3 == infoStickerModel3.mColor) {
                            VideoPublishEditModel videoPublishEditModel4 = subtitleModule.f113313A;
                            if (videoPublishEditModel4 == null) {
                                C52711k.m112237a("mModel");
                            }
                            String str = videoPublishEditModel4.infoStickerModel.mFontType;
                            InfoStickerModel infoStickerModel4 = subtitleModule.f113355o;
                            if (infoStickerModel4 == null) {
                                C52711k.m112237a("mInfoStickerModelTmp");
                            }
                            if (!(!C52711k.m112239a((Object) str, (Object) infoStickerModel4.mFontType))) {
                                VideoPublishEditModel videoPublishEditModel5 = subtitleModule.f113313A;
                                if (videoPublishEditModel5 == null) {
                                    C52711k.m112237a("mModel");
                                }
                                int size = videoPublishEditModel5.infoStickerModel.stickers.size();
                                InfoStickerModel infoStickerModel5 = subtitleModule.f113355o;
                                if (infoStickerModel5 == null) {
                                    C52711k.m112237a("mInfoStickerModelTmp");
                                }
                                if (size == infoStickerModel5.stickers.size() && subtitleModule.f113363w.f110134C.size() <= 1 && !subtitleModule.f113338Z && !subtitleModule.mo90874Q()) {
                                    subtitleModule.mo90867J();
                                    return;
                                }
                            }
                        }
                    }
                }
                FragmentActivity fragmentActivity = subtitleModule.f113315C;
                if (fragmentActivity == null) {
                    C52711k.m112237a("mActivity");
                }
                new C10643a(fragmentActivity).mo18899b((int) R.string.n9).mo18900b((int) R.string.wf, (OnClickListener) null).mo18886a((int) R.string.ah2, (OnClickListener) new C44795an(subtitleModule)).mo18897a().mo18882b().show();
            } else {
                TextView textView2 = subtitleModule.mSaveView;
                if (textView2 == null) {
                    C52711k.m112237a("mSaveView");
                }
                if (C52711k.m112239a((Object) view2, (Object) textView2)) {
                    subtitleModule.f113363w.f110161d.mo88448d();
                    subtitleModule.f113363w.f110134C.clear();
                    subtitleModule.mo90870M();
                    subtitleModule.f113341ac.cancel();
                    subtitleModule.f113353m = null;
                    SafeHandler safeHandler = subtitleModule.f113323K;
                    if (safeHandler == null) {
                        C52711k.m112237a("mTipsHandler");
                    }
                    safeHandler.removeCallbacksAndMessages(null);
                    EditViewModel editViewModel = subtitleModule.f113314B;
                    if (editViewModel == null) {
                        C52711k.m112237a("mEditViewModel");
                    }
                    editViewModel.mo97045o().setValue(Boolean.valueOf(true));
                    VideoPublishEditModel videoPublishEditModel6 = subtitleModule.f113313A;
                    if (videoPublishEditModel6 == null) {
                        C52711k.m112237a("mModel");
                    }
                    C43470a aVar = videoPublishEditModel6.mSubtitleMusicChangeChecker;
                    VideoPublishEditModel videoPublishEditModel7 = subtitleModule.f113313A;
                    if (videoPublishEditModel7 == null) {
                        C52711k.m112237a("mModel");
                    }
                    aVar.getData(videoPublishEditModel7);
                    C26890h.m65011a("save_subtitle", subtitleModule.mo90881Y().f107329a);
                    return;
                }
                ImageView imageView = subtitleModule.mIvFont;
                if (imageView == null) {
                    C52711k.m112237a("mIvFont");
                }
                if (C52711k.m112239a((Object) view2, (Object) imageView)) {
                    SubtitleEditTypeLayout subtitleEditTypeLayout = subtitleModule.f113356p;
                    if (subtitleEditTypeLayout == null) {
                        C52711k.m112237a("mTextStickerInputLayout");
                    }
                    String str2 = "";
                    VideoPublishEditModel videoPublishEditModel8 = subtitleModule.f113313A;
                    if (videoPublishEditModel8 == null) {
                        C52711k.m112237a("mModel");
                    }
                    int i4 = videoPublishEditModel8.infoStickerModel.mBgMode;
                    VideoPublishEditModel videoPublishEditModel9 = subtitleModule.f113313A;
                    if (videoPublishEditModel9 == null) {
                        C52711k.m112237a("mModel");
                    }
                    int i5 = videoPublishEditModel9.infoStickerModel.mColor;
                    VideoPublishEditModel videoPublishEditModel10 = subtitleModule.f113313A;
                    if (videoPublishEditModel10 == null) {
                        C52711k.m112237a("mModel");
                    }
                    int i6 = videoPublishEditModel10.infoStickerModel.mAlign;
                    VideoPublishEditModel videoPublishEditModel11 = subtitleModule.f113313A;
                    if (videoPublishEditModel11 == null) {
                        C52711k.m112237a("mModel");
                    }
                    subtitleEditTypeLayout.mo90854a(str2, i4, i5, i6, videoPublishEditModel11.infoStickerModel.mFontType, false);
                    C46679c a = C46679c.m101291a();
                    SubtitleTextView subtitleTextView = subtitleModule.f113359s;
                    if (subtitleTextView == null) {
                        C52711k.m112237a("mInvisibleEditText");
                    }
                    String a2 = a.mo93622a(subtitleTextView.getTypeface());
                    SubtitleTextView subtitleTextView2 = subtitleModule.f113359s;
                    if (subtitleTextView2 == null) {
                        C52711k.m112237a("mInvisibleEditText");
                    }
                    int bgColorMode = subtitleTextView2.getBgColorMode();
                    SubtitleTextView subtitleTextView3 = subtitleModule.f113359s;
                    if (subtitleTextView3 == null) {
                        C52711k.m112237a("mInvisibleEditText");
                    }
                    int bgColor = subtitleTextView3.getBgColor();
                    SubtitleTextView subtitleTextView4 = subtitleModule.f113359s;
                    if (subtitleTextView4 == null) {
                        C52711k.m112237a("mInvisibleEditText");
                    }
                    int align = subtitleTextView4.getAlign();
                    SubtitleStyleViewModel subtitleStyleViewModel = subtitleModule.f113325M;
                    if (subtitleStyleViewModel == null) {
                        C52711k.m112237a("mStyleViewModel");
                    }
                    C52711k.m112236a((Object) a2, "fontType");
                    C52711k.m112240b(a2, "fontType");
                    subtitleStyleViewModel.mo90946a().setValue(a2);
                    subtitleStyleViewModel.mo90947b().setValue(Integer.valueOf(bgColorMode));
                    subtitleStyleViewModel.mo90948c().setValue(Integer.valueOf(bgColor));
                    subtitleStyleViewModel.mo90949d().setValue(Integer.valueOf(align));
                    SubtitleTextView subtitleTextView5 = subtitleModule.f113359s;
                    if (subtitleTextView5 == null) {
                        C52711k.m112237a("mInvisibleEditText");
                    }
                    SubtitleStyleViewModel subtitleStyleViewModel2 = subtitleModule.f113325M;
                    if (subtitleStyleViewModel2 == null) {
                        C52711k.m112237a("mStyleViewModel");
                    }
                    subtitleTextView5.setViewModel(subtitleStyleViewModel2);
                    SubtitleStyleViewModel subtitleStyleViewModel3 = subtitleModule.f113325M;
                    if (subtitleStyleViewModel3 == null) {
                        C52711k.m112237a("mStyleViewModel");
                    }
                    C0198r a3 = subtitleStyleViewModel3.mo90946a();
                    FragmentActivity fragmentActivity2 = subtitleModule.f113315C;
                    if (fragmentActivity2 == null) {
                        C52711k.m112237a("mActivity");
                    }
                    a3.observe(fragmentActivity2, new C44806aw(subtitleModule));
                    SubtitleStyleViewModel subtitleStyleViewModel4 = subtitleModule.f113325M;
                    if (subtitleStyleViewModel4 == null) {
                        C52711k.m112237a("mStyleViewModel");
                    }
                    C0198r b = subtitleStyleViewModel4.mo90947b();
                    FragmentActivity fragmentActivity3 = subtitleModule.f113315C;
                    if (fragmentActivity3 == null) {
                        C52711k.m112237a("mActivity");
                    }
                    b.observe(fragmentActivity3, new C44807ax(subtitleModule));
                    SubtitleStyleViewModel subtitleStyleViewModel5 = subtitleModule.f113325M;
                    if (subtitleStyleViewModel5 == null) {
                        C52711k.m112237a("mStyleViewModel");
                    }
                    C0198r c = subtitleStyleViewModel5.mo90948c();
                    FragmentActivity fragmentActivity4 = subtitleModule.f113315C;
                    if (fragmentActivity4 == null) {
                        C52711k.m112237a("mActivity");
                    }
                    c.observe(fragmentActivity4, new C44808ay(subtitleModule));
                    SubtitleStyleViewModel subtitleStyleViewModel6 = subtitleModule.f113325M;
                    if (subtitleStyleViewModel6 == null) {
                        C52711k.m112237a("mStyleViewModel");
                    }
                    C0198r d = subtitleStyleViewModel6.mo90949d();
                    FragmentActivity fragmentActivity5 = subtitleModule.f113315C;
                    if (fragmentActivity5 == null) {
                        C52711k.m112237a("mActivity");
                    }
                    d.observe(fragmentActivity5, new C44809az(subtitleModule));
                    FrameLayout frameLayout = subtitleModule.mContentLayout;
                    if (frameLayout == null) {
                        C52711k.m112237a("mContentLayout");
                    }
                    ViewGroup viewGroup = frameLayout;
                    LinearLayout linearLayout = subtitleModule.mSubtitleLayout;
                    if (linearLayout == null) {
                        C52711k.m112237a("mSubtitleLayout");
                    }
                    View view3 = linearLayout;
                    View view4 = subtitleModule.f113360t;
                    if (view4 == null) {
                        C52711k.m112237a("mEditTypeView");
                    }
                    C44870h hVar = new C44870h(viewGroup, view3, view4);
                    View view5 = subtitleModule.f113360t;
                    if (view5 == null) {
                        C52711k.m112237a("mEditTypeView");
                    }
                    View findViewById = view5.findViewById(R.id.q7);
                    C44813ba baVar = new C44813ba(subtitleModule, bgColorMode, bgColor, align, a2, hVar);
                    findViewById.setOnClickListener(baVar);
                    View view6 = subtitleModule.f113360t;
                    if (view6 == null) {
                        C52711k.m112237a("mEditTypeView");
                    }
                    view6.findViewById(R.id.cv6).setOnClickListener(new C44814bb(subtitleModule, hVar));
                    C24454d bcVar = new C44815bc(subtitleModule);
                    FragmentActivity fragmentActivity6 = subtitleModule.f113315C;
                    if (fragmentActivity6 == null) {
                        C52711k.m112237a("mActivity");
                    }
                    hVar.mo90985a(bcVar, (int) C9432q.m18687b((Context) fragmentActivity6, 232.0f));
                    C26890h.m65011a("edit_text", subtitleModule.mo90881Y().mo86523a("is_subtitle", 1).f107329a);
                    return;
                }
                ImageView imageView2 = subtitleModule.mIvDelete;
                if (imageView2 == null) {
                    C52711k.m112237a("mIvDelete");
                }
                if (C52711k.m112239a((Object) view2, (Object) imageView2)) {
                    FragmentActivity fragmentActivity7 = subtitleModule.f113315C;
                    if (fragmentActivity7 == null) {
                        C52711k.m112237a("mActivity");
                    }
                    new C10643a(fragmentActivity7).mo18899b((int) R.string.mh).mo18900b((int) R.string.wf, (OnClickListener) null).mo18886a((int) R.string.ah2, (OnClickListener) new C44774ac(subtitleModule)).mo18897a().mo18882b().show();
                    return;
                }
                ImageView imageView3 = subtitleModule.mIvEdit;
                if (imageView3 == null) {
                    C52711k.m112237a("mIvEdit");
                }
                if (C52711k.m112239a((Object) view2, (Object) imageView3)) {
                    C44823f fVar = subtitleModule.f113365y;
                    if (fVar == null) {
                        C52711k.m112237a("mSubtitleAdapter");
                    }
                    if (fVar != null) {
                        C44823f fVar2 = subtitleModule.f113365y;
                        if (fVar2 == null) {
                            C52711k.m112237a("mSubtitleAdapter");
                        }
                        int i7 = fVar2.f113445a;
                        if (i7 != -1) {
                            subtitleModule.mo90883a(i7, true);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$z */
    public static final class C44848z extends C1340m {

        /* renamed from: a */
        public boolean f113492a;

        /* renamed from: b */
        public boolean f113493b;

        /* renamed from: c */
        final /* synthetic */ SubtitleModule f113494c;

        C44848z(SubtitleModule subtitleModule) {
            this.f113494c = subtitleModule;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            switch (i) {
                case 0:
                    if (this.f113493b) {
                        this.f113493b = false;
                        SubtitleModule subtitleModule = this.f113494c;
                        subtitleModule.f113354n = null;
                        SafeHandler safeHandler = subtitleModule.f113322J;
                        if (safeHandler == null) {
                            C52711k.m112237a("mSafeHandler");
                        }
                        safeHandler.removeCallbacksAndMessages(null);
                        int i2 = SubtitleModule.m97960e(this.f113494c).f113445a;
                        if (i2 != -1) {
                            SubtitleModule.m97958c(this.f113494c).mo4726a(this.f113494c.mo90899h(), new C1349s(), i2);
                            C0198r<C53030y> rVar = this.f113494c.f113321I;
                            if (rVar == null) {
                                C52711k.m112237a("mPreviewControlOpLiveData");
                            }
                            C29087a aVar = this.f113494c.f113320H;
                            if (aVar == null) {
                                C52711k.m112237a("mCurrentPositionSource");
                            }
                            rVar.setValue(C53030y.m112775b(aVar.mo58928a((long) (((UtteranceWithWords) SubtitleModule.m97960e(this.f113494c).f113447c.get(i2)).getStartTime() + 30))));
                        }
                        if (this.f113492a) {
                            this.f113492a = false;
                            this.f113494c.mo90868K();
                            break;
                        }
                    }
                    break;
                case 1:
                    if (this.f113494c.f113357q) {
                        this.f113492a = true;
                    }
                    this.f113494c.mo90869L();
                    this.f113493b = true;
                    this.f113494c.f113354n = new C44820c();
                    SubtitleModule.m97957b(this.f113494c).post(this.f113494c.f113354n);
                    return;
            }
        }
    }

    /* renamed from: a */
    public static final void m97950a(C20347c cVar, Context context, VideoPublishEditModel videoPublishEditModel, AbstractMap<Integer, StickerItemModel> abstractMap) {
        C44810b.m98013a(cVar, context, videoPublishEditModel, abstractMap);
    }

    /* renamed from: aa */
    public static final ConcurrentHashMap<Integer, StickerItemModel> m97952aa() {
        return f113308ae;
    }

    /* renamed from: ab */
    public static final HashMap<Integer, StickerItemModel> m97953ab() {
        return f113309af;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Z */
    public final SubtitleApi mo90882Z() {
        return (SubtitleApi) this.f113349ao.getValue();
    }

    /* renamed from: a */
    public final void mo90892a(boolean z) {
        if (z) {
            this.f113353m = new C44826g();
            SafeHandler safeHandler = this.f113323K;
            if (safeHandler == null) {
                C52711k.m112237a("mTipsHandler");
            }
            safeHandler.post(this.f113353m);
            this.f113341ac.start();
            LinearLayout linearLayout = this.mLoadingArea;
            if (linearLayout == null) {
                C52711k.m112237a("mLoadingArea");
            }
            linearLayout.setVisibility(0);
            LinearLayout linearLayout2 = this.mSubtitleLayout;
            if (linearLayout2 == null) {
                C52711k.m112237a("mSubtitleLayout");
            }
            linearLayout2.setVisibility(8);
            DmtStatusView dmtStatusView = this.mLoadingStatusView;
            if (dmtStatusView == null) {
                C52711k.m112237a("mLoadingStatusView");
            }
            dmtStatusView.mo19212f();
            LinearLayout linearLayout3 = this.mLoadingArea;
            if (linearLayout3 == null) {
                C52711k.m112237a("mLoadingArea");
            }
            ((Button) linearLayout3.findViewById(R.id.qa)).setOnClickListener(new C44797ap(this));
        } else {
            this.f113341ac.cancel();
            this.f113353m = null;
            SafeHandler safeHandler2 = this.f113323K;
            if (safeHandler2 == null) {
                C52711k.m112237a("mTipsHandler");
            }
            safeHandler2.removeCallbacksAndMessages(null);
            DmtStatusView dmtStatusView2 = this.mLoadingStatusView;
            if (dmtStatusView2 == null) {
                C52711k.m112237a("mLoadingStatusView");
            }
            dmtStatusView2.mo19209d();
            LinearLayout linearLayout4 = this.mLoadingArea;
            if (linearLayout4 == null) {
                C52711k.m112237a("mLoadingArea");
            }
            linearLayout4.setVisibility(8);
            LinearLayout linearLayout5 = this.mSubtitleLayout;
            if (linearLayout5 == null) {
                C52711k.m112237a("mSubtitleLayout");
            }
            linearLayout5.setVisibility(0);
            LinearLayout linearLayout6 = this.mSubtitleLayout;
            if (linearLayout6 == null) {
                C52711k.m112237a("mSubtitleLayout");
            }
            linearLayout6.setAlpha(1.0f);
        }
        View view = this.f113360t;
        if (view == null) {
            C52711k.m112237a("mEditTypeView");
        }
        view.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo90889a(String str, String str2) {
        C26890h.m65011a("auto_subtitle_end", mo90881Y().mo86523a("video_duration", this.f113318F).mo86524a("load_time", System.currentTimeMillis() - this.f113351k).mo86526a("load_status", str).mo86526a("action_type", this.f113350j).mo86526a("error_type", str2).f107329a);
    }

    /* renamed from: a */
    public final void mo90888a(C52670a<C52860x> aVar) {
        FrameLayout frameLayout = this.mContentLayout;
        if (frameLayout == null) {
            C52711k.m112237a("mContentLayout");
        }
        ViewGroup viewGroup = frameLayout;
        LinearLayout linearLayout = this.mLoadingArea;
        if (linearLayout == null) {
            C52711k.m112237a("mLoadingArea");
        }
        View view = linearLayout;
        View view2 = this.f113361u;
        if (view2 == null) {
            C52711k.m112237a("mRetryView");
        }
        C44870h hVar = new C44870h(viewGroup, view, view2);
        View view3 = this.f113361u;
        if (view3 == null) {
            C52711k.m112237a("mRetryView");
        }
        ((TextView) view3.findViewById(R.id.cuv)).setOnClickListener(new C44801ar(this, hVar));
        View view4 = this.f113361u;
        if (view4 == null) {
            C52711k.m112237a("mRetryView");
        }
        ((Button) view4.findViewById(R.id.ox)).setOnClickListener(new C44802as(this, hVar, aVar));
        hVar.mo50219a((C24454d) new C24453c());
    }

    /* renamed from: a */
    public final void mo90891a(List<? extends UtteranceWithWords> list) {
        long j;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new UtteranceWithWords((UtteranceWithWords) list.get(i)));
        }
        List list2 = arrayList;
        if (list2.size() > 1) {
            C52575l.m112105a(list2, new C44773ab());
        }
        f113308ae.clear();
        C43535i iVar = this.f113363w;
        C20347c cVar = this.f113317E;
        this.f113336X = iVar.mo88617a(new UtteranceWithWords(0, cVar != null ? cVar.mo43071k() : 0, " "));
        this.f113363w.mo88635a(list2);
        C20347c cVar2 = this.f113317E;
        if (cVar2 != null) {
            cVar2.mo43089t();
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f113316D;
        if (vEVideoPublishEditViewModel == null) {
            C52711k.m112237a("mVEVideoPublishEditViewModel");
        }
        C0198r r = vEVideoPublishEditViewModel.mo110473r();
        C52711k.m112236a((Object) r, "mVEVideoPublishEditViewModel.inTimeEditView");
        r.setValue(Boolean.valueOf(true));
        this.f113363w.mo88649c((C43509at) this.f113363w.f110161d.f109932g.f110107a.get(this.f113336X));
        SubtitleEditTypeLayout subtitleEditTypeLayout = this.f113356p;
        if (subtitleEditTypeLayout == null) {
            C52711k.m112237a("mTextStickerInputLayout");
        }
        C46679c a = C46679c.m101291a();
        C52711k.m112236a((Object) a, "TextFontStyleManager.getInstance()");
        subtitleEditTypeLayout.mo90854a("", 1, -1, 2, a.mo93633c(), true);
        VideoPublishEditModel videoPublishEditModel = this.f113313A;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
        SubtitleTextView subtitleTextView = this.f113359s;
        if (subtitleTextView == null) {
            C52711k.m112237a("mInvisibleEditText");
        }
        infoStickerModel.mAlign = subtitleTextView.getAlign();
        VideoPublishEditModel videoPublishEditModel2 = this.f113313A;
        if (videoPublishEditModel2 == null) {
            C52711k.m112237a("mModel");
        }
        InfoStickerModel infoStickerModel2 = videoPublishEditModel2.infoStickerModel;
        SubtitleTextView subtitleTextView2 = this.f113359s;
        if (subtitleTextView2 == null) {
            C52711k.m112237a("mInvisibleEditText");
        }
        infoStickerModel2.mBgMode = subtitleTextView2.getBgColorMode();
        VideoPublishEditModel videoPublishEditModel3 = this.f113313A;
        if (videoPublishEditModel3 == null) {
            C52711k.m112237a("mModel");
        }
        InfoStickerModel infoStickerModel3 = videoPublishEditModel3.infoStickerModel;
        SubtitleTextView subtitleTextView3 = this.f113359s;
        if (subtitleTextView3 == null) {
            C52711k.m112237a("mInvisibleEditText");
        }
        infoStickerModel3.mColor = subtitleTextView3.getBgColor();
        VideoPublishEditModel videoPublishEditModel4 = this.f113313A;
        if (videoPublishEditModel4 == null) {
            C52711k.m112237a("mModel");
        }
        InfoStickerModel infoStickerModel4 = videoPublishEditModel4.infoStickerModel;
        C46679c a2 = C46679c.m101291a();
        SubtitleTextView subtitleTextView4 = this.f113359s;
        if (subtitleTextView4 == null) {
            C52711k.m112237a("mInvisibleEditText");
        }
        infoStickerModel4.mFontType = a2.mo93622a(subtitleTextView4.getTypeface());
        if (this.f113317E != null) {
            C20347c cVar3 = this.f113317E;
            if (cVar3 == null) {
                C52711k.m112234a();
            }
            FragmentActivity fragmentActivity = this.f113315C;
            if (fragmentActivity == null) {
                C52711k.m112237a("mActivity");
            }
            Context context = fragmentActivity;
            VideoPublishEditModel videoPublishEditModel5 = this.f113313A;
            if (videoPublishEditModel5 == null) {
                C52711k.m112237a("mModel");
            }
            C44810b.m98013a(cVar3, context, videoPublishEditModel5, f113308ae);
        }
        mo90869L();
        C0198r<C53030y> rVar = this.f113321I;
        if (rVar == null) {
            C52711k.m112237a("mPreviewControlOpLiveData");
        }
        C29087a aVar = this.f113320H;
        if (aVar == null) {
            C52711k.m112237a("mCurrentPositionSource");
        }
        if (aVar.mo58931c()) {
            C20347c cVar4 = this.f113317E;
            j = (long) (cVar4 != null ? cVar4.mo43071k() : 0);
        } else {
            j = 0;
        }
        rVar.setValue(C53030y.m112775b(j));
        mo90892a(false);
        mo90894b(list2);
        mo90868K();
    }

    /* renamed from: a */
    public final void mo90890a(ArrayList<String> arrayList) {
        this.f113338Z = false;
        C44863g gVar = this.f113366z;
        if (gVar == null) {
            C52711k.m112237a("mSubtitleEditAdapter");
        }
        List list = gVar.f113542h;
        if (list.size() == arrayList.size()) {
            C44863g gVar2 = this.f113366z;
            if (gVar2 == null) {
                C52711k.m112237a("mSubtitleEditAdapter");
            }
            if (!(!gVar2.mo90975a().isEmpty())) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (!((String) arrayList.get(i)).equals(((UtteranceWithWords) list.get(i)).getText())) {
                        this.f113338Z = true;
                        return;
                    }
                }
                return;
            }
        }
        this.f113338Z = true;
    }

    /* renamed from: M */
    public final void mo90870M() {
        this.f113327O = null;
        SafeHandler safeHandler = this.f113322J;
        if (safeHandler == null) {
            C52711k.m112237a("mSafeHandler");
        }
        safeHandler.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public final int mo90863F() {
        FragmentActivity fragmentActivity = this.f113315C;
        if (fragmentActivity == null) {
            C52711k.m112237a("mActivity");
        }
        return (int) C9432q.m18687b((Context) fragmentActivity, 250.0f);
    }

    /* renamed from: K */
    public final void mo90868K() {
        C0198r<C53030y> rVar = this.f113321I;
        if (rVar == null) {
            C52711k.m112237a("mPreviewControlOpLiveData");
        }
        rVar.setValue(C53030y.m112772a());
        View view = this.f113363w.f110162e;
        C52711k.m112236a((Object) view, "mInfoStickerHelper.mIvPlay");
        view.setVisibility(8);
    }

    /* renamed from: L */
    public final void mo90869L() {
        C0198r<C53030y> rVar = this.f113321I;
        if (rVar == null) {
            C52711k.m112237a("mPreviewControlOpLiveData");
        }
        rVar.setValue(C53030y.m112774b());
        View view = this.f113363w.f110162e;
        C52711k.m112236a((Object) view, "mInfoStickerHelper.mIvPlay");
        view.setVisibility(0);
    }

    /* renamed from: Q */
    public final boolean mo90874Q() {
        VideoPublishEditModel videoPublishEditModel = this.f113313A;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        C43470a aVar = videoPublishEditModel.mSubtitleMusicChangeChecker;
        VideoPublishEditModel videoPublishEditModel2 = this.f113313A;
        if (videoPublishEditModel2 == null) {
            C52711k.m112237a("mModel");
        }
        return aVar.hasChanged(videoPublishEditModel2);
    }

    /* renamed from: T */
    public final void mo90876T() {
        C17825i.m43740a(new TTUploaderService(0).mo86428a(null), new C44793am(this), C0013i.f25b);
    }

    /* renamed from: c */
    public final TextView mo90895c() {
        TextView textView = this.mCancelView;
        if (textView == null) {
            C52711k.m112237a("mCancelView");
        }
        return textView;
    }

    /* renamed from: d */
    public final TextView mo90896d() {
        TextView textView = this.mSaveView;
        if (textView == null) {
            C52711k.m112237a("mSaveView");
        }
        return textView;
    }

    /* renamed from: f */
    public final LinearLayout mo90898f() {
        LinearLayout linearLayout = this.mSubtitleLayout;
        if (linearLayout == null) {
            C52711k.m112237a("mSubtitleLayout");
        }
        return linearLayout;
    }

    /* renamed from: h */
    public final AVDmtPanelRecyleView mo90899h() {
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.mRecyclerView;
        if (aVDmtPanelRecyleView == null) {
            C52711k.m112237a("mRecyclerView");
        }
        return aVDmtPanelRecyleView;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final int mo90900i() {
        FragmentActivity fragmentActivity = this.f113315C;
        if (fragmentActivity == null) {
            C52711k.m112237a("mActivity");
        }
        return (int) C9432q.m18687b((Context) fragmentActivity, 52.0f);
    }

    /* renamed from: ac */
    private final boolean m97954ac() {
        VideoPublishEditModel videoPublishEditModel = this.f113313A;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.mMusicPath)) {
            VideoPublishEditModel videoPublishEditModel2 = this.f113313A;
            if (videoPublishEditModel2 == null) {
                C52711k.m112237a("mModel");
            }
            if (C45642b.m99389a(videoPublishEditModel2.mMusicPath) == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ad */
    private final boolean m97955ad() {
        VideoPublishEditModel videoPublishEditModel = this.f113313A;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        if (videoPublishEditModel.veAudioRecorderParam != null) {
            VideoPublishEditModel videoPublishEditModel2 = this.f113313A;
            if (videoPublishEditModel2 == null) {
                C52711k.m112237a("mModel");
            }
            if (videoPublishEditModel2.veAudioRecorderParam.hasRecord() && this.f113317E != null) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: O */
    public final int mo90872O() {
        FragmentActivity fragmentActivity = this.f113315C;
        if (fragmentActivity == null) {
            C52711k.m112237a("mActivity");
        }
        int e = (C43303dy.m94974e(fragmentActivity) - mo90900i()) - mo90863F();
        FragmentActivity fragmentActivity2 = this.f113315C;
        if (fragmentActivity2 == null) {
            C52711k.m112237a("mActivity");
        }
        int c = e - C43303dy.m94972c(fragmentActivity2);
        FragmentActivity fragmentActivity3 = this.f113315C;
        if (fragmentActivity3 == null) {
            C52711k.m112237a("mActivity");
        }
        return c - C43303dy.m94973d(fragmentActivity3);
    }

    /* renamed from: P */
    public final boolean mo90873P() {
        VideoPublishEditModel videoPublishEditModel = this.f113313A;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        if (videoPublishEditModel.infoStickerModel != null) {
            VideoPublishEditModel videoPublishEditModel2 = this.f113313A;
            if (videoPublishEditModel2 == null) {
                C52711k.m112237a("mModel");
            }
            if (videoPublishEditModel2.infoStickerModel.hasSubtitle()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: X */
    public final void mo90880X() {
        SafeHandler safeHandler = this.f113322J;
        if (safeHandler == null) {
            C52711k.m112237a("mSafeHandler");
        }
        safeHandler.removeCallbacksAndMessages(null);
        this.f113341ac.cancel();
        this.f113353m = null;
        SafeHandler safeHandler2 = this.f113323K;
        if (safeHandler2 == null) {
            C52711k.m112237a("mTipsHandler");
        }
        safeHandler2.removeCallbacksAndMessages(null);
        DmtStatusView dmtStatusView = this.mLoadingStatusView;
        if (dmtStatusView == null) {
            C52711k.m112237a("mLoadingStatusView");
        }
        dmtStatusView.mo19209d();
        LinearLayout linearLayout = this.mLoadingArea;
        if (linearLayout == null) {
            C52711k.m112237a("mLoadingArea");
        }
        linearLayout.setVisibility(8);
    }

    /* renamed from: S */
    public static void m97947S() {
        StringBuilder sb = new StringBuilder();
        sb.append(C43308eb.f109491d);
        sb.append("output.aac");
        C48016e.m103947c(new File(sb.toString()).getPath());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C43308eb.f109491d);
        sb2.append("origin.aac");
        C48016e.m103947c(new File(sb2.toString()).getPath());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(C43308eb.f109491d);
        sb3.append("outputmix.aac");
        C48016e.m103947c(new File(sb3.toString()).getPath());
    }

    /* renamed from: I */
    public final void mo90866I() {
        VideoPublishEditModel videoPublishEditModel = this.f113313A;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        if (videoPublishEditModel.infoStickerModel != null) {
            int i = 0;
            C29087a aVar = this.f113320H;
            if (aVar == null) {
                C52711k.m112237a("mCurrentPositionSource");
            }
            long a = aVar.mo58927a();
            StickerItemModel stickerItemModel = null;
            VideoPublishEditModel videoPublishEditModel2 = this.f113313A;
            if (videoPublishEditModel2 == null) {
                C52711k.m112237a("mModel");
            }
            Iterator it = videoPublishEditModel2.infoStickerModel.stickers.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                StickerItemModel stickerItemModel2 = (StickerItemModel) it.next();
                C52711k.m112236a((Object) stickerItemModel2, "item");
                if (stickerItemModel2.isSubtitle() && ((long) stickerItemModel2.startTime) <= a && a <= ((long) stickerItemModel2.endTime)) {
                    i = stickerItemModel2.f91605id;
                    stickerItemModel = stickerItemModel2.dumpClonedData();
                    break;
                }
            }
            if (stickerItemModel != null) {
                this.f113363w.mo88655e(i);
                this.f113363w.mo88616a(stickerItemModel);
                C20347c cVar = this.f113317E;
                if (cVar != null) {
                    cVar.mo43089t();
                }
            }
        }
    }

    /* renamed from: J */
    public final void mo90867J() {
        this.f113363w.f110161d.mo88446b();
        mo90870M();
        this.f113341ac.cancel();
        this.f113353m = null;
        SafeHandler safeHandler = this.f113323K;
        if (safeHandler == null) {
            C52711k.m112237a("mTipsHandler");
        }
        safeHandler.removeCallbacksAndMessages(null);
        EditViewModel editViewModel = this.f113314B;
        if (editViewModel == null) {
            C52711k.m112237a("mEditViewModel");
        }
        editViewModel.mo97045o().setValue(Boolean.valueOf(false));
        this.f113358r.mo14c();
        C50720o oVar = this.f113343ai;
        if (oVar != null) {
            oVar.mo99389m();
        }
        this.f113343ai = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: N */
    public final int mo90871N() {
        long j = this.f113348an;
        C29087a aVar = this.f113320H;
        if (aVar == null) {
            C52711k.m112237a("mCurrentPositionSource");
        }
        if (j == aVar.mo58927a()) {
            return -1;
        }
        C29087a aVar2 = this.f113320H;
        if (aVar2 == null) {
            C52711k.m112237a("mCurrentPositionSource");
        }
        this.f113348an = aVar2.mo58927a();
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.mRecyclerView;
        if (aVDmtPanelRecyleView == null) {
            C52711k.m112237a("mRecyclerView");
        }
        if (aVDmtPanelRecyleView.getAdapter() == null) {
            return -1;
        }
        C44823f fVar = this.f113365y;
        if (fVar == null) {
            C52711k.m112237a("mSubtitleAdapter");
        }
        ArrayList<UtteranceWithWords> arrayList = fVar.f113447c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UtteranceWithWords utteranceWithWords = (UtteranceWithWords) it.next();
            if (!(utteranceWithWords.getStartTime() == 0 && utteranceWithWords.getEndTime() == this.f113318F) && ((long) utteranceWithWords.getStartTime()) <= this.f113348an && this.f113348an <= ((long) utteranceWithWords.getEndTime())) {
                return arrayList.indexOf(utteranceWithWords);
            }
        }
        return arrayList.size() - 1;
    }

    /* renamed from: V */
    public final void mo90878V() {
        FrameLayout frameLayout = this.mContentLayout;
        if (frameLayout == null) {
            C52711k.m112237a("mContentLayout");
        }
        ViewGroup viewGroup = frameLayout;
        LinearLayout linearLayout = this.mLoadingArea;
        if (linearLayout == null) {
            C52711k.m112237a("mLoadingArea");
        }
        View view = linearLayout;
        View view2 = this.f113362v;
        if (view2 == null) {
            C52711k.m112237a("mExitView");
        }
        C44870h hVar = new C44870h(viewGroup, view, view2);
        View view3 = this.f113362v;
        if (view3 == null) {
            C52711k.m112237a("mExitView");
        }
        ((Button) view3.findViewById(R.id.q7)).setOnClickListener(new C44796ao(this, hVar));
        hVar.mo50219a((C24454d) new C24453c());
    }

    /* renamed from: W */
    public final void mo90879W() {
        f113310ag = "";
        mo90869L();
        this.f113336X = -1;
        this.f113329Q.clear();
        f113308ae.clear();
        if (this.f113330R == null) {
            mo90875R();
            mo90888a((C52670a<C52860x>) new C44775ad<C52860x>(this));
            return;
        }
        this.f113358r = new C0010f();
        C0008d b = this.f113358r.mo13b();
        String str = this.f113330R;
        if (str == null) {
            C52711k.m112234a();
        }
        C0013i a = m97948a(str).mo25b(new C44778af(this), C0013i.f24a, b).mo21a((C0011g<TResult, TContinuationResult>) new C44779ag<TResult,TContinuationResult>(this), C0013i.f25b, b);
        SafeHandler safeHandler = this.f113322J;
        if (safeHandler == null) {
            C52711k.m112237a("mSafeHandler");
        }
        safeHandler.postDelayed(new C44776ae(this, a), 60000);
    }

    /* renamed from: Y */
    public final C42438az mo90881Y() {
        C42438az a = C42438az.m93209a().mo86526a("enter_from", "video_edit_page");
        String str = "shoot_way";
        VideoPublishEditModel videoPublishEditModel = this.f113313A;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        C42438az a2 = a.mo86526a(str, videoPublishEditModel.mShootWay);
        String str2 = "creation_id";
        VideoPublishEditModel videoPublishEditModel2 = this.f113313A;
        if (videoPublishEditModel2 == null) {
            C52711k.m112237a("mModel");
        }
        C42438az a3 = a2.mo86526a(str2, videoPublishEditModel2.creationId);
        String str3 = "content_source";
        VideoPublishEditModel videoPublishEditModel3 = this.f113313A;
        if (videoPublishEditModel3 == null) {
            C52711k.m112237a("mModel");
        }
        C42438az a4 = a3.mo86526a(str3, C43434az.m95207b(videoPublishEditModel3));
        String str4 = "content_type";
        VideoPublishEditModel videoPublishEditModel4 = this.f113313A;
        if (videoPublishEditModel4 == null) {
            C52711k.m112237a("mModel");
        }
        C42438az a5 = a4.mo86526a(str4, C43434az.m95202a(videoPublishEditModel4));
        C52711k.m112236a((Object) a5, "EventMapBuilder.newBuild…, getContentType(mModel))");
        return a5;
    }

    /* renamed from: p */
    public final void mo24469p() {
        super.mo24469p();
        mo90870M();
        this.f113341ac.cancel();
        this.f113353m = null;
        SafeHandler safeHandler = this.f113323K;
        if (safeHandler == null) {
            C52711k.m112237a("mTipsHandler");
        }
        safeHandler.removeCallbacksAndMessages(null);
        if (this.f113331S != null) {
            FragmentActivity fragmentActivity = this.f113315C;
            if (fragmentActivity == null) {
                C52711k.m112237a("mActivity");
            }
            NetStateReceiver.m97103b((Context) fragmentActivity);
            this.f113331S = null;
        }
        this.f113363w.mo88631a((C44858b) null);
        View view = this.f113363w.f110162e;
        C52711k.m112236a((Object) view, "mInfoStickerHelper.mIvPlay");
        view.setVisibility(8);
        m97947S();
    }

    /* renamed from: G */
    public final void mo90864G() {
        ArrayList arrayList = new ArrayList();
        InfoStickerModel infoStickerModel = this.f113355o;
        if (infoStickerModel == null) {
            C52711k.m112237a("mInfoStickerModelTmp");
        }
        if (infoStickerModel.stickers != null) {
            InfoStickerModel infoStickerModel2 = this.f113355o;
            if (infoStickerModel2 == null) {
                C52711k.m112237a("mInfoStickerModelTmp");
            }
            for (StickerItemModel stickerItemModel : infoStickerModel2.stickers) {
                C52711k.m112236a((Object) stickerItemModel, "item");
                if (stickerItemModel.isSubtitle()) {
                    arrayList.add(new UtteranceWithWords(stickerItemModel));
                }
            }
        }
        if (arrayList.isEmpty()) {
            this.f113363w.mo88656e(true);
        } else {
            this.f113363w.mo88656e(false);
            this.f113363w.mo88635a((List<UtteranceWithWords>) arrayList);
        }
        VideoPublishEditModel videoPublishEditModel = this.f113313A;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        InfoStickerModel infoStickerModel3 = videoPublishEditModel.infoStickerModel;
        InfoStickerModel infoStickerModel4 = this.f113355o;
        if (infoStickerModel4 == null) {
            C52711k.m112237a("mInfoStickerModelTmp");
        }
        infoStickerModel3.mAlign = infoStickerModel4.mAlign;
        VideoPublishEditModel videoPublishEditModel2 = this.f113313A;
        if (videoPublishEditModel2 == null) {
            C52711k.m112237a("mModel");
        }
        InfoStickerModel infoStickerModel5 = videoPublishEditModel2.infoStickerModel;
        InfoStickerModel infoStickerModel6 = this.f113355o;
        if (infoStickerModel6 == null) {
            C52711k.m112237a("mInfoStickerModelTmp");
        }
        infoStickerModel5.mBgMode = infoStickerModel6.mBgMode;
        VideoPublishEditModel videoPublishEditModel3 = this.f113313A;
        if (videoPublishEditModel3 == null) {
            C52711k.m112237a("mModel");
        }
        InfoStickerModel infoStickerModel7 = videoPublishEditModel3.infoStickerModel;
        InfoStickerModel infoStickerModel8 = this.f113355o;
        if (infoStickerModel8 == null) {
            C52711k.m112237a("mInfoStickerModelTmp");
        }
        infoStickerModel7.mColor = infoStickerModel8.mColor;
        VideoPublishEditModel videoPublishEditModel4 = this.f113313A;
        if (videoPublishEditModel4 == null) {
            C52711k.m112237a("mModel");
        }
        InfoStickerModel infoStickerModel9 = videoPublishEditModel4.infoStickerModel;
        InfoStickerModel infoStickerModel10 = this.f113355o;
        if (infoStickerModel10 == null) {
            C52711k.m112237a("mInfoStickerModelTmp");
        }
        infoStickerModel9.mFontType = infoStickerModel10.mFontType;
    }

    /* renamed from: H */
    public final void mo90865H() {
        this.f113329Q.clear();
        this.f113363w.mo88656e(true);
        SubtitleEditTypeLayout subtitleEditTypeLayout = this.f113356p;
        if (subtitleEditTypeLayout == null) {
            C52711k.m112237a("mTextStickerInputLayout");
        }
        C46679c a = C46679c.m101291a();
        C52711k.m112236a((Object) a, "TextFontStyleManager.getInstance()");
        subtitleEditTypeLayout.mo90854a("", 1, -1, 2, a.mo93633c(), true);
        VideoPublishEditModel videoPublishEditModel = this.f113313A;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        if (videoPublishEditModel.infoStickerModel != null) {
            VideoPublishEditModel videoPublishEditModel2 = this.f113313A;
            if (videoPublishEditModel2 == null) {
                C52711k.m112237a("mModel");
            }
            InfoStickerModel infoStickerModel = videoPublishEditModel2.infoStickerModel;
            SubtitleTextView subtitleTextView = this.f113359s;
            if (subtitleTextView == null) {
                C52711k.m112237a("mInvisibleEditText");
            }
            infoStickerModel.mAlign = subtitleTextView.getAlign();
            VideoPublishEditModel videoPublishEditModel3 = this.f113313A;
            if (videoPublishEditModel3 == null) {
                C52711k.m112237a("mModel");
            }
            InfoStickerModel infoStickerModel2 = videoPublishEditModel3.infoStickerModel;
            SubtitleTextView subtitleTextView2 = this.f113359s;
            if (subtitleTextView2 == null) {
                C52711k.m112237a("mInvisibleEditText");
            }
            infoStickerModel2.mBgMode = subtitleTextView2.getBgColorMode();
            VideoPublishEditModel videoPublishEditModel4 = this.f113313A;
            if (videoPublishEditModel4 == null) {
                C52711k.m112237a("mModel");
            }
            InfoStickerModel infoStickerModel3 = videoPublishEditModel4.infoStickerModel;
            SubtitleTextView subtitleTextView3 = this.f113359s;
            if (subtitleTextView3 == null) {
                C52711k.m112237a("mInvisibleEditText");
            }
            infoStickerModel3.mColor = subtitleTextView3.getBgColor();
            VideoPublishEditModel videoPublishEditModel5 = this.f113313A;
            if (videoPublishEditModel5 == null) {
                C52711k.m112237a("mModel");
            }
            InfoStickerModel infoStickerModel4 = videoPublishEditModel5.infoStickerModel;
            C46679c a2 = C46679c.m101291a();
            SubtitleTextView subtitleTextView4 = this.f113359s;
            if (subtitleTextView4 == null) {
                C52711k.m112237a("mInvisibleEditText");
            }
            infoStickerModel4.mFontType = a2.mo93622a(subtitleTextView4.getTypeface());
        }
    }

    /* renamed from: U */
    public final void mo90877U() {
        f113310ag = "";
        mo90869L();
        this.f113336X = -1;
        this.f113329Q.clear();
        f113308ae.clear();
        this.f113358r = new C0010f();
        C0008d b = this.f113358r.mo13b();
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
        AVApi createAVApibyMonsterPlugin = AVApiImpl.createAVApibyMonsterPlugin();
        C52711k.m112236a((Object) createAVApibyMonsterPlugin, "ServiceManager.get().getService(AVApi::class.java)");
        SubtitleApiV2 subtitleApiV2 = (SubtitleApiV2) createIRetrofitServicebyMonsterPlugin.createNewRetrofit(createAVApibyMonsterPlugin.getAPI_URL_PREFIX_SI()).create(SubtitleApiV2.class);
        String e = C39629l.m88232a().mo58574e().mo83121e(C40796a.SdkV4AuthKey);
        if (!TextUtils.isEmpty(e)) {
            C0013i a = C0013i.m16a((Callable<TResult>) new C44785ai<TResult>(this)).mo19a((C0011g<TResult, TContinuationResult>) new C44786aj<TResult,TContinuationResult>(this, (C43846fo) C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34884a(e, C43846fo.class), subtitleApiV2, b));
            SafeHandler safeHandler = this.f113322J;
            if (safeHandler == null) {
                C52711k.m112237a("mSafeHandler");
            }
            safeHandler.postDelayed(new C44783ah(this, a, subtitleApiV2), 60000);
        }
    }

    /* renamed from: R */
    public final void mo90875R() {
        String str;
        int i;
        VideoPublishEditModel videoPublishEditModel = this.f113313A;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        if (videoPublishEditModel.voiceVolume != 0.0f || m97955ad() || m97954ac()) {
            this.f113344aj = false;
            VideoPublishEditModel videoPublishEditModel2 = this.f113313A;
            if (videoPublishEditModel2 == null) {
                C52711k.m112237a("mModel");
            }
            if (videoPublishEditModel2.mUseMusicBeforeEdit) {
                if (this.f113317E != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C43308eb.f109491d);
                    sb.append("outputmix.aac");
                    String path = new File(sb.toString()).getPath();
                    if (m97954ac()) {
                        VideoPublishEditModel videoPublishEditModel3 = this.f113313A;
                        if (videoPublishEditModel3 == null) {
                            C52711k.m112237a("mModel");
                        }
                        this.f113343ai = new C50720o(videoPublishEditModel3.draftDir());
                        C50720o oVar = this.f113343ai;
                        if (oVar == null) {
                            C52711k.m112234a();
                        }
                        String[] strArr = new String[1];
                        VideoPublishEditModel videoPublishEditModel4 = this.f113313A;
                        if (videoPublishEditModel4 == null) {
                            C52711k.m112237a("mModel");
                        }
                        strArr[0] = videoPublishEditModel4.mMusicPath;
                        int[] iArr = new int[1];
                        VideoPublishEditModel videoPublishEditModel5 = this.f113313A;
                        if (videoPublishEditModel5 == null) {
                            C52711k.m112237a("mModel");
                        }
                        iArr[0] = videoPublishEditModel5.mMusicStart;
                        int[] iArr2 = new int[1];
                        VideoPublishEditModel videoPublishEditModel6 = this.f113313A;
                        if (videoPublishEditModel6 == null) {
                            C52711k.m112237a("mModel");
                        }
                        int i2 = videoPublishEditModel6.mMusicStart;
                        C20347c cVar = this.f113317E;
                        if (cVar == null) {
                            C52711k.m112234a();
                        }
                        iArr2[0] = i2 + cVar.mo43071k();
                        oVar.mo99321a(strArr, iArr, iArr2, new float[]{1.0f});
                        C50720o oVar2 = this.f113343ai;
                        if (oVar2 == null) {
                            C52711k.m112234a();
                        }
                        VideoPublishEditModel videoPublishEditModel7 = this.f113313A;
                        if (videoPublishEditModel7 == null) {
                            C52711k.m112237a("mModel");
                        }
                        oVar2.mo99333a(0, 1, videoPublishEditModel7.musicVolume);
                        C50720o oVar3 = this.f113343ai;
                        if (oVar3 == null) {
                            C52711k.m112234a();
                        }
                        oVar3.mo99361d(1);
                        VEAudioEncodeSettings a = new C50523a().mo98460a(16000).mo98463c(2).mo98462b(128000).mo98461a();
                        if (m97955ad()) {
                            C50720o oVar4 = this.f113343ai;
                            if (oVar4 == null) {
                                C52711k.m112234a();
                            }
                            VideoPublishEditModel videoPublishEditModel8 = this.f113313A;
                            if (videoPublishEditModel8 == null) {
                                C52711k.m112237a("mModel");
                            }
                            String audioUrl = videoPublishEditModel8.veAudioRecorderParam.getAudioUrl();
                            C20347c cVar2 = this.f113317E;
                            if (cVar2 == null) {
                                C52711k.m112234a();
                            }
                            oVar4.mo99308a(audioUrl, 0, cVar2.mo43071k(), false);
                        }
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        C50720o oVar5 = this.f113343ai;
                        if (oVar5 == null) {
                            C52711k.m112234a();
                        }
                        if (oVar5.mo99334a(path, a, (C50547k) new C44841t(this, path, countDownLatch))) {
                            countDownLatch.await(40000, TimeUnit.MILLISECONDS);
                        }
                        C50720o oVar6 = this.f113343ai;
                        if (oVar6 != null) {
                            oVar6.mo99389m();
                        }
                        this.f113343ai = null;
                    } else if (m97955ad()) {
                        VideoPublishEditModel videoPublishEditModel9 = this.f113313A;
                        if (videoPublishEditModel9 == null) {
                            C52711k.m112237a("mModel");
                        }
                        VEUtils.transCodeAudio(videoPublishEditModel9.veAudioRecorderParam.getAudioUrl(), path, 1, -1, 16000);
                        this.f113330R = path;
                    } else {
                        SafeHandler safeHandler = this.f113322J;
                        if (safeHandler == null) {
                            C52711k.m112237a("mSafeHandler");
                        }
                        safeHandler.post(new C44840s(this));
                        return;
                    }
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C43308eb.f109491d);
            sb2.append("output.aac");
            String path2 = new File(sb2.toString()).getPath();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(C43308eb.f109491d);
            sb3.append("outputmix.aac");
            String path3 = new File(sb3.toString()).getPath();
            VideoPublishEditModel videoPublishEditModel10 = this.f113313A;
            if (videoPublishEditModel10 == null) {
                C52711k.m112237a("mModel");
            }
            if (videoPublishEditModel10.hasOriginalSound()) {
                VideoPublishEditModel videoPublishEditModel11 = this.f113313A;
                if (videoPublishEditModel11 == null) {
                    C52711k.m112237a("mModel");
                }
                str = videoPublishEditModel11.getWavFile();
            } else {
                VideoPublishEditModel videoPublishEditModel12 = this.f113313A;
                if (videoPublishEditModel12 == null) {
                    C52711k.m112237a("mModel");
                }
                String videoPath = videoPublishEditModel12.videoPath();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(C43308eb.f109491d);
                sb4.append("origin");
                str = VEUtils.getFileBestStreamAudio(videoPath, new File(sb4.toString()).getPath());
            }
            if (str != null) {
                VideoPublishEditModel videoPublishEditModel13 = this.f113313A;
                if (videoPublishEditModel13 == null) {
                    C52711k.m112237a("mModel");
                }
                if (videoPublishEditModel13.isFastImport) {
                    VideoPublishEditModel videoPublishEditModel14 = this.f113313A;
                    if (videoPublishEditModel14 == null) {
                        C52711k.m112237a("mModel");
                    }
                    if (videoPublishEditModel14.getPreviewInfo() != null) {
                        VideoPublishEditModel videoPublishEditModel15 = this.f113313A;
                        if (videoPublishEditModel15 == null) {
                            C52711k.m112237a("mModel");
                        }
                        if (!videoPublishEditModel15.getPreviewInfo().getVideoList().isEmpty()) {
                            VideoPublishEditModel videoPublishEditModel16 = this.f113313A;
                            if (videoPublishEditModel16 == null) {
                                C52711k.m112237a("mModel");
                            }
                            if (((EditVideoSegment) videoPublishEditModel16.getPreviewInfo().getVideoList().get(0)).getVideoCutInfo() != null) {
                                VideoPublishEditModel videoPublishEditModel17 = this.f113313A;
                                if (videoPublishEditModel17 == null) {
                                    C52711k.m112237a("mModel");
                                }
                                int size = videoPublishEditModel17.getPreviewInfo().getVideoList().size();
                                String[] strArr2 = new String[size];
                                long[] jArr = new long[size];
                                long[] jArr2 = new long[size];
                                long[] jArr3 = new long[2];
                                float[] fArr = new float[size];
                                VideoPublishEditModel videoPublishEditModel18 = this.f113313A;
                                if (videoPublishEditModel18 == null) {
                                    C52711k.m112237a("mModel");
                                }
                                EditPreviewInfo previewInfo = videoPublishEditModel18.getPreviewInfo();
                                C52711k.m112236a((Object) previewInfo, "mModel.previewInfo");
                                String[] strArr3 = strArr2;
                                long[] jArr4 = jArr;
                                long[] jArr5 = jArr2;
                                m97951a(previewInfo, strArr3, jArr4, jArr5, fArr, jArr3);
                                i = VEUtils.detachAudioFromVideos(path2, strArr3, jArr4, jArr5, jArr3[0], jArr3[1], fArr, 1, 88200, 16000);
                            } else {
                                C52711k.m112236a((Object) path2, "streamAudioPath");
                                i = m97956b(str, path2);
                            }
                        }
                    }
                }
                VideoPublishEditModel videoPublishEditModel19 = this.f113313A;
                if (videoPublishEditModel19 == null) {
                    C52711k.m112237a("mModel");
                }
                if (videoPublishEditModel19.isMultiVideoEdit()) {
                    VideoPublishEditModel videoPublishEditModel20 = this.f113313A;
                    if (videoPublishEditModel20 == null) {
                        C52711k.m112237a("mModel");
                    }
                    MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel20.getCurMultiEditVideoRecordData();
                    C52711k.m112236a((Object) curMultiEditVideoRecordData, "mModel.curMultiEditVideoRecordData");
                    VERecordData a2 = C43738a.m96063a(curMultiEditVideoRecordData);
                    VideoPublishEditModel videoPublishEditModel21 = this.f113313A;
                    if (videoPublishEditModel21 == null) {
                        C52711k.m112237a("mModel");
                    }
                    MultiEditVideoRecordData curMultiEditVideoRecordData2 = videoPublishEditModel21.getCurMultiEditVideoRecordData();
                    C52711k.m112236a((Object) curMultiEditVideoRecordData2, "mModel.curMultiEditVideoRecordData");
                    Pair playInOutTime = curMultiEditVideoRecordData2.getPlayInOutTime();
                    a2.mo98589a((long) (((Number) playInOutTime.first).intValue() * 1000), (long) (((Number) playInOutTime.second).intValue() * 1000));
                    i = VEUtils.getAudioFromRecordData(path2, a2, 1, 88200, 16000);
                } else {
                    C52711k.m112236a((Object) path2, "streamAudioPath");
                    i = m97956b(str, path2);
                }
            } else {
                i = -1;
            }
            if (i != 0) {
                StringBuilder sb5 = new StringBuilder("subtitle transCodeAudio fail, code =");
                sb5.append(i);
                C50203g.m108358a(sb5.toString());
                path2 = str;
            }
            this.f113330R = path2;
            if (this.f113344aj) {
                this.f113330R = str;
            }
            VideoPublishEditModel videoPublishEditModel22 = this.f113313A;
            if (videoPublishEditModel22 == null) {
                C52711k.m112237a("mModel");
            }
            this.f113343ai = new C50720o(videoPublishEditModel22.draftDir());
            if (TextUtils.isEmpty(this.f113330R) || C45642b.m99389a(this.f113330R) != 0) {
                SafeHandler safeHandler2 = this.f113322J;
                if (safeHandler2 == null) {
                    C52711k.m112237a("mSafeHandler");
                }
                safeHandler2.post(new C44838q(this));
            }
            C50720o oVar7 = this.f113343ai;
            if (oVar7 == null) {
                C52711k.m112234a();
            }
            oVar7.mo99321a(new String[]{this.f113330R}, new int[]{0}, new int[]{-1}, new float[]{1.0f});
            C50720o oVar8 = this.f113343ai;
            if (oVar8 == null) {
                C52711k.m112234a();
            }
            VideoPublishEditModel videoPublishEditModel23 = this.f113313A;
            if (videoPublishEditModel23 == null) {
                C52711k.m112237a("mModel");
            }
            oVar8.mo99333a(0, 1, videoPublishEditModel23.voiceVolume);
            C50720o oVar9 = this.f113343ai;
            if (oVar9 == null) {
                C52711k.m112234a();
            }
            oVar9.mo99361d(1);
            int i3 = 2;
            VEAudioEncodeSettings a3 = new C50523a().mo98460a(16000).mo98463c(2).mo98462b(128000).mo98461a();
            if (m97954ac()) {
                VideoPublishEditModel videoPublishEditModel24 = this.f113313A;
                if (videoPublishEditModel24 == null) {
                    C52711k.m112237a("mModel");
                }
                int i4 = videoPublishEditModel24.mMusicEnd;
                VideoPublishEditModel videoPublishEditModel25 = this.f113313A;
                if (videoPublishEditModel25 == null) {
                    C52711k.m112237a("mModel");
                }
                if (videoPublishEditModel25.isStickPointMode && this.f113317E != null) {
                    C20347c cVar3 = this.f113317E;
                    if (cVar3 == null) {
                        C52711k.m112234a();
                    }
                    i4 = cVar3.mo43071k();
                }
                C50720o oVar10 = this.f113343ai;
                if (oVar10 == null) {
                    C52711k.m112234a();
                }
                VideoPublishEditModel videoPublishEditModel26 = this.f113313A;
                if (videoPublishEditModel26 == null) {
                    C52711k.m112237a("mModel");
                }
                String str2 = videoPublishEditModel26.mMusicPath;
                VideoPublishEditModel videoPublishEditModel27 = this.f113313A;
                if (videoPublishEditModel27 == null) {
                    C52711k.m112237a("mModel");
                }
                int a4 = oVar10.mo99308a(str2, videoPublishEditModel27.mMusicStart, i4, false);
                C50720o oVar11 = this.f113343ai;
                if (oVar11 == null) {
                    C52711k.m112234a();
                }
                VideoPublishEditModel videoPublishEditModel28 = this.f113313A;
                if (videoPublishEditModel28 == null) {
                    C52711k.m112237a("mModel");
                }
                oVar11.mo99333a(a4, 1, videoPublishEditModel28.musicVolume);
            } else {
                i3 = 1;
            }
            if (m97955ad()) {
                C50720o oVar12 = this.f113343ai;
                if (oVar12 == null) {
                    C52711k.m112234a();
                }
                VideoPublishEditModel videoPublishEditModel29 = this.f113313A;
                if (videoPublishEditModel29 == null) {
                    C52711k.m112237a("mModel");
                }
                String audioUrl2 = videoPublishEditModel29.veAudioRecorderParam.getAudioUrl();
                C20347c cVar4 = this.f113317E;
                if (cVar4 == null) {
                    C52711k.m112234a();
                }
                oVar12.mo99308a(audioUrl2, 0, cVar4.mo43071k(), false);
                i3++;
            }
            if (i3 == 1) {
                C50720o oVar13 = this.f113343ai;
                if (oVar13 != null) {
                    oVar13.mo99389m();
                    return;
                }
                return;
            }
            CountDownLatch countDownLatch2 = new CountDownLatch(1);
            C50720o oVar14 = this.f113343ai;
            if (oVar14 == null) {
                C52711k.m112234a();
            }
            if (oVar14.mo99334a(path3, a3, (C50547k) new C44839r(this, path3, countDownLatch2))) {
                countDownLatch2.await(40000, TimeUnit.MILLISECONDS);
            }
            C50720o oVar15 = this.f113343ai;
            if (oVar15 != null) {
                oVar15.mo99389m();
            }
            this.f113343ai = null;
            return;
        }
        SafeHandler safeHandler3 = this.f113322J;
        if (safeHandler3 == null) {
            C52711k.m112237a("mSafeHandler");
        }
        safeHandler3.post(new C44837p(this));
    }

    /* renamed from: a */
    public static final /* synthetic */ SafeHandler m97949a(SubtitleModule subtitleModule) {
        SafeHandler safeHandler = subtitleModule.f113323K;
        if (safeHandler == null) {
            C52711k.m112237a("mTipsHandler");
        }
        return safeHandler;
    }

    /* renamed from: b */
    public static final /* synthetic */ SafeHandler m97957b(SubtitleModule subtitleModule) {
        SafeHandler safeHandler = subtitleModule.f113322J;
        if (safeHandler == null) {
            C52711k.m112237a("mSafeHandler");
        }
        return safeHandler;
    }

    /* renamed from: c */
    public static final /* synthetic */ HighLightLayoutManager m97958c(SubtitleModule subtitleModule) {
        HighLightLayoutManager highLightLayoutManager = subtitleModule.f113364x;
        if (highLightLayoutManager == null) {
            C52711k.m112237a("mHighLightLayoutManager");
        }
        return highLightLayoutManager;
    }

    /* renamed from: d */
    public static final /* synthetic */ FragmentActivity m97959d(SubtitleModule subtitleModule) {
        FragmentActivity fragmentActivity = subtitleModule.f113315C;
        if (fragmentActivity == null) {
            C52711k.m112237a("mActivity");
        }
        return fragmentActivity;
    }

    /* renamed from: e */
    public static final /* synthetic */ C44823f m97960e(SubtitleModule subtitleModule) {
        C44823f fVar = subtitleModule.f113365y;
        if (fVar == null) {
            C52711k.m112237a("mSubtitleAdapter");
        }
        return fVar;
    }

    /* renamed from: f */
    public static final /* synthetic */ VideoPublishEditModel m97961f(SubtitleModule subtitleModule) {
        VideoPublishEditModel videoPublishEditModel = subtitleModule.f113313A;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        return videoPublishEditModel;
    }

    /* renamed from: g */
    public static final /* synthetic */ SubtitleEditTypeLayout m97962g(SubtitleModule subtitleModule) {
        SubtitleEditTypeLayout subtitleEditTypeLayout = subtitleModule.f113356p;
        if (subtitleEditTypeLayout == null) {
            C52711k.m112237a("mTextStickerInputLayout");
        }
        return subtitleEditTypeLayout;
    }

    /* renamed from: h */
    public static final /* synthetic */ C44863g m97963h(SubtitleModule subtitleModule) {
        C44863g gVar = subtitleModule.f113366z;
        if (gVar == null) {
            C52711k.m112237a("mSubtitleEditAdapter");
        }
        return gVar;
    }

    /* renamed from: i */
    public static final /* synthetic */ RecyclerView m97964i(SubtitleModule subtitleModule) {
        RecyclerView recyclerView = subtitleModule.f113326N;
        if (recyclerView == null) {
            C52711k.m112237a("mEditRecyclerView");
        }
        return recyclerView;
    }

    /* renamed from: a */
    private final C0013i<C44861e> m97948a(String str) {
        return mo90882Z().submitAudio("douyin_caption", "aweme_token", 20, 1, new TypedFile("application/octet-stream", new File(str)));
    }

    public SubtitleModule(C43535i iVar) {
        C52711k.m112240b(iVar, "infoStickerHelper");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(15400);
        ofFloat.addUpdateListener(new C44770a(ofFloat, this));
        this.f113341ac = ofFloat;
        this.f113349ao = C52732g.m112285a(C44827h.f113456a);
        this.f113363w = iVar;
    }

    /* renamed from: a */
    public final void mo90884a(EditText editText) {
        C52711k.m112240b(editText, "editText");
        InputMethodManager inputMethodManager = this.f113324L;
        if (inputMethodManager == null) {
            C52711k.m112237a("mIMManager");
        }
        inputMethodManager.showSoftInput(editText, 1);
    }

    /* renamed from: d */
    public final void mo90897d(int i) {
        C46747d dVar = this.f113346al;
        if (dVar == null) {
            C52711k.m112237a("keyBoardListener");
        }
        dVar.mo93877a();
        this.f113334V = false;
        C44828i iVar = new C44828i(this, i);
        C20347c cVar = this.f113317E;
        if (cVar != null) {
            cVar.mo43039b((C50711k) iVar);
        }
        C20347c cVar2 = this.f113317E;
        if (cVar2 != null) {
            cVar2.mo42976a(0, this.f113318F, C50744e.EDITOR_TIMERANGE_FLAG_BEFORE_SPEED);
        }
        C20347c cVar3 = this.f113317E;
        if (cVar3 != null) {
            cVar3.mo43019a(true);
        }
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.mRecyclerView;
        if (aVDmtPanelRecyleView == null) {
            C52711k.m112237a("mRecyclerView");
        }
        if (aVDmtPanelRecyleView.getAdapter() != null) {
            C44823f fVar = this.f113365y;
            if (fVar == null) {
                C52711k.m112237a("mSubtitleAdapter");
            }
            ArrayList<UtteranceWithWords> arrayList = fVar.f113447c;
            int size = arrayList.size() - 1;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                UtteranceWithWords utteranceWithWords = (UtteranceWithWords) it.next();
                if (!(utteranceWithWords.getStartTime() == 0 && utteranceWithWords.getEndTime() == this.f113318F) && utteranceWithWords.getStartTime() <= i && i <= utteranceWithWords.getEndTime()) {
                    size = arrayList.indexOf(utteranceWithWords);
                }
            }
            if (size >= 0) {
                C44823f fVar2 = this.f113365y;
                if (fVar2 == null) {
                    C52711k.m112237a("mSubtitleAdapter");
                }
                if (!TextUtils.isEmpty(((UtteranceWithWords) fVar2.f113447c.get(size)).getText()) || size == 0) {
                    HighLightLayoutManager highLightLayoutManager = this.f113364x;
                    if (highLightLayoutManager == null) {
                        C52711k.m112237a("mHighLightLayoutManager");
                    }
                    FragmentActivity fragmentActivity = this.f113315C;
                    if (fragmentActivity == null) {
                        C52711k.m112237a("mActivity");
                    }
                    highLightLayoutManager.mo4721a(size, (int) C9432q.m18687b((Context) fragmentActivity, 52.0f));
                    C44823f fVar3 = this.f113365y;
                    if (fVar3 == null) {
                        C52711k.m112237a("mSubtitleAdapter");
                    }
                    fVar3.mo90927a(size);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo90894b(List<? extends UtteranceWithWords> list) {
        this.f113329Q.clear();
        if (this.f113331S != null) {
            FragmentActivity fragmentActivity = this.f113315C;
            if (fragmentActivity == null) {
                C52711k.m112237a("mActivity");
            }
            NetStateReceiver.m97103b((Context) fragmentActivity);
            NetStateReceiver.m97104b(this.f113331S);
            this.f113331S = null;
        }
        LinearLayout linearLayout = this.mSubtitleLayout;
        if (linearLayout == null) {
            C52711k.m112237a("mSubtitleLayout");
        }
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = this.mSubtitleLayout;
        if (linearLayout2 == null) {
            C52711k.m112237a("mSubtitleLayout");
        }
        linearLayout2.setAlpha(1.0f);
        TextView textView = this.mSaveView;
        if (textView == null) {
            C52711k.m112237a("mSaveView");
        }
        textView.setVisibility(0);
        TextView textView2 = this.mCancelView;
        if (textView2 == null) {
            C52711k.m112237a("mCancelView");
        }
        textView2.setVisibility(0);
        if (!list.isEmpty()) {
            if (((UtteranceWithWords) list.get(0)).getStartTime() != 0) {
                this.f113329Q.add(new UtteranceWithWords(0, ((UtteranceWithWords) list.get(0)).getStartTime() - 1));
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i == list.size() - 1) {
                    this.f113329Q.add(new UtteranceWithWords((UtteranceWithWords) list.get(i)));
                } else {
                    this.f113329Q.add(new UtteranceWithWords((UtteranceWithWords) list.get(i)));
                    this.f113329Q.add(new UtteranceWithWords(((UtteranceWithWords) list.get(i)).getEndTime() + 1, ((UtteranceWithWords) list.get(i + 1)).getStartTime() - 1));
                }
            }
            if (((UtteranceWithWords) list.get(list.size() - 1)).getEndTime() != this.f113318F) {
                this.f113329Q.add(new UtteranceWithWords(((UtteranceWithWords) list.get(list.size() - 1)).getEndTime() + 1, this.f113318F));
            }
            ArrayList arrayList = new ArrayList();
            int size2 = this.f113329Q.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Object obj = this.f113329Q.get(i2);
                C52711k.m112236a(obj, "mSubtitleList.get(i)");
                arrayList.add(new UtteranceWithWords((UtteranceWithWords) obj));
            }
            C44823f fVar = this.f113365y;
            if (fVar == null) {
                C52711k.m112237a("mSubtitleAdapter");
            }
            fVar.mo90928a((List<? extends UtteranceWithWords>) arrayList);
            int N = mo90871N();
            if (N == -1) {
                N = 0;
            }
            HighLightLayoutManager highLightLayoutManager = this.f113364x;
            if (highLightLayoutManager == null) {
                C52711k.m112237a("mHighLightLayoutManager");
            }
            AVDmtPanelRecyleView aVDmtPanelRecyleView = this.mRecyclerView;
            if (aVDmtPanelRecyleView == null) {
                C52711k.m112237a("mRecyclerView");
            }
            highLightLayoutManager.mo4726a(aVDmtPanelRecyleView, new C1349s(), N);
            C20347c cVar = this.f113317E;
            if (cVar != null) {
                cVar.mo43019a(true);
            }
        }
    }

    /* renamed from: a */
    public final void mo90886a(C44870h hVar) {
        SubtitleStyleViewModel subtitleStyleViewModel = this.f113325M;
        if (subtitleStyleViewModel == null) {
            C52711k.m112237a("mStyleViewModel");
        }
        C0198r b = subtitleStyleViewModel.mo90947b();
        FragmentActivity fragmentActivity = this.f113315C;
        if (fragmentActivity == null) {
            C52711k.m112237a("mActivity");
        }
        b.removeObservers(fragmentActivity);
        SubtitleStyleViewModel subtitleStyleViewModel2 = this.f113325M;
        if (subtitleStyleViewModel2 == null) {
            C52711k.m112237a("mStyleViewModel");
        }
        C0198r d = subtitleStyleViewModel2.mo90949d();
        FragmentActivity fragmentActivity2 = this.f113315C;
        if (fragmentActivity2 == null) {
            C52711k.m112237a("mActivity");
        }
        d.removeObservers(fragmentActivity2);
        SubtitleStyleViewModel subtitleStyleViewModel3 = this.f113325M;
        if (subtitleStyleViewModel3 == null) {
            C52711k.m112237a("mStyleViewModel");
        }
        C0198r c = subtitleStyleViewModel3.mo90948c();
        FragmentActivity fragmentActivity3 = this.f113315C;
        if (fragmentActivity3 == null) {
            C52711k.m112237a("mActivity");
        }
        c.removeObservers(fragmentActivity3);
        SubtitleStyleViewModel subtitleStyleViewModel4 = this.f113325M;
        if (subtitleStyleViewModel4 == null) {
            C52711k.m112237a("mStyleViewModel");
        }
        C0198r a = subtitleStyleViewModel4.mo90946a();
        FragmentActivity fragmentActivity4 = this.f113315C;
        if (fragmentActivity4 == null) {
            C52711k.m112237a("mActivity");
        }
        a.removeObservers(fragmentActivity4);
        SubtitleTextView subtitleTextView = this.f113359s;
        if (subtitleTextView == null) {
            C52711k.m112237a("mInvisibleEditText");
        }
        subtitleTextView.setViewModel(null);
        hVar.mo50223b(new C44842u(this));
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        int i;
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            this.f113315C = (FragmentActivity) activity;
            FragmentActivity fragmentActivity = this.f113315C;
            if (fragmentActivity == null) {
                C52711k.m112237a("mActivity");
            }
            if (fragmentActivity != null) {
                this.f113339aa = (C23441t) fragmentActivity;
                FragmentActivity fragmentActivity2 = this.f113315C;
                if (fragmentActivity2 == null) {
                    C52711k.m112237a("mActivity");
                }
                C0209x a = C0214z.m440a(fragmentActivity2).mo359a(VEVideoPublishEditViewModel.class);
                C52711k.m112236a((Object) a, "ViewModelProviders.of(mA…ditViewModel::class.java)");
                this.f113316D = (VEVideoPublishEditViewModel) a;
                FragmentActivity fragmentActivity3 = this.f113315C;
                if (fragmentActivity3 == null) {
                    C52711k.m112237a("mActivity");
                }
                C0209x a2 = C0214z.m440a(fragmentActivity3).mo359a(EditSubtitleViewModel.class);
                C52711k.m112236a((Object) a2, "ViewModelProviders.of(mA…tleViewModel::class.java)");
                this.f113347am = (EditSubtitleViewModel) a2;
                FragmentActivity fragmentActivity4 = this.f113315C;
                if (fragmentActivity4 == null) {
                    C52711k.m112237a("mActivity");
                }
                JediViewModel a3 = C48927d.m105736a(fragmentActivity4).mo96760a(EditViewModel.class);
                C52711k.m112236a((Object) a3, "JediViewModelProviders.o…ditViewModel::class.java)");
                this.f113314B = (EditViewModel) a3;
                FragmentActivity fragmentActivity5 = this.f113315C;
                if (fragmentActivity5 == null) {
                    C52711k.m112237a("mActivity");
                }
                C0209x a4 = C0214z.m440a(fragmentActivity5).mo359a(SubtitleStyleViewModel.class);
                C52711k.m112236a((Object) a4, "ViewModelProviders.of(mA…yleViewModel::class.java)");
                this.f113325M = (SubtitleStyleViewModel) a4;
                EditViewModel editViewModel = this.f113314B;
                if (editViewModel == null) {
                    C52711k.m112237a("mEditViewModel");
                }
                this.f113313A = editViewModel.mo97035e();
                EditViewModel editViewModel2 = this.f113314B;
                if (editViewModel2 == null) {
                    C52711k.m112237a("mEditViewModel");
                }
                this.f113317E = (C20347c) editViewModel2.mo97038h().getValue();
                C20347c cVar = this.f113317E;
                if (cVar != null) {
                    i = cVar.mo43071k();
                } else {
                    i = 0;
                }
                this.f113318F = i;
                C0184k kVar = this;
                this.f113322J = new SafeHandler(kVar);
                this.f113323K = new SafeHandler(kVar);
                FragmentActivity fragmentActivity6 = this.f113315C;
                if (fragmentActivity6 == null) {
                    C52711k.m112237a("mActivity");
                }
                Object systemService = fragmentActivity6.getSystemService("input_method");
                if (systemService != null) {
                    this.f113324L = (InputMethodManager) systemService;
                    this.f113337Y = C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableSubtitleRecognitionAI);
                    C46679c a5 = C46679c.m101291a();
                    FragmentActivity fragmentActivity7 = this.f113315C;
                    if (fragmentActivity7 == null) {
                        C52711k.m112237a("mActivity");
                    }
                    a5.mo93624a((Context) fragmentActivity7);
                    View j_ = mo24467j_(R.id.che);
                    C52711k.m112236a((Object) j_, "requireViewById(R.id.scene_layout_subtitle)");
                    this.f113319G = (ViewGroup) j_;
                    ViewGroup viewGroup = this.f113319G;
                    if (viewGroup == null) {
                        C52711k.m112237a("mSubtitleView");
                    }
                    viewGroup.setVisibility(8);
                    ViewGroup viewGroup2 = this.f113319G;
                    if (viewGroup2 == null) {
                        C52711k.m112237a("mSubtitleView");
                    }
                    ButterKnife.bind((Object) this, (View) viewGroup2);
                    this.f113345ak = new C44847y(this);
                    FragmentActivity fragmentActivity8 = this.f113315C;
                    if (fragmentActivity8 == null) {
                        C52711k.m112237a("mActivity");
                    }
                    LayoutInflater from = LayoutInflater.from(fragmentActivity8);
                    FrameLayout frameLayout = this.mContentLayout;
                    if (frameLayout == null) {
                        C52711k.m112237a("mContentLayout");
                    }
                    View inflate = from.inflate(R.layout.afc, frameLayout, false);
                    C52711k.m112236a((Object) inflate, "LayoutInflater.from(mAct…t, mContentLayout, false)");
                    this.f113360t = inflate;
                    View view = this.f113360t;
                    if (view == null) {
                        C52711k.m112237a("mEditTypeView");
                    }
                    View findViewById = view.findViewById(R.id.cz9);
                    C52711k.m112236a((Object) findViewById, "mEditTypeView.findViewBy…R.id.text_sticker_layout)");
                    this.f113356p = (SubtitleEditTypeLayout) findViewById;
                    View view2 = this.f113360t;
                    if (view2 == null) {
                        C52711k.m112237a("mEditTypeView");
                    }
                    View findViewById2 = view2.findViewById(R.id.abs);
                    C52711k.m112236a((Object) findViewById2, "mEditTypeView.findViewById(R.id.et_input)");
                    this.f113359s = (SubtitleTextView) findViewById2;
                    SubtitleTextView subtitleTextView = this.f113359s;
                    if (subtitleTextView == null) {
                        C52711k.m112237a("mInvisibleEditText");
                    }
                    subtitleTextView.setVisibility(4);
                    View view3 = this.f113360t;
                    if (view3 == null) {
                        C52711k.m112237a("mEditTypeView");
                    }
                    View findViewById3 = view3.findViewById(R.id.q7);
                    C52711k.m112236a((Object) findViewById3, "mEditTypeView.findViewById<ImageView>(R.id.cancel)");
                    ((ImageView) findViewById3).setVisibility(0);
                    FragmentActivity fragmentActivity9 = this.f113315C;
                    if (fragmentActivity9 == null) {
                        C52711k.m112237a("mActivity");
                    }
                    LayoutInflater from2 = LayoutInflater.from(fragmentActivity9);
                    LinearLayout linearLayout = this.mLoadingArea;
                    if (linearLayout == null) {
                        C52711k.m112237a("mLoadingArea");
                    }
                    View inflate2 = from2.inflate(R.layout.afb, linearLayout, false);
                    C52711k.m112236a((Object) inflate2, "LayoutInflater.from(mAct…ail, mLoadingArea, false)");
                    this.f113361u = inflate2;
                    FragmentActivity fragmentActivity10 = this.f113315C;
                    if (fragmentActivity10 == null) {
                        C52711k.m112237a("mActivity");
                    }
                    LayoutInflater from3 = LayoutInflater.from(fragmentActivity10);
                    LinearLayout linearLayout2 = this.mLoadingArea;
                    if (linearLayout2 == null) {
                        C52711k.m112237a("mLoadingArea");
                    }
                    View inflate3 = from3.inflate(R.layout.afa, linearLayout2, false);
                    C52711k.m112236a((Object) inflate3, "LayoutInflater.from(mAct…pty, mLoadingArea, false)");
                    this.f113362v = inflate3;
                    TextView textView = this.mCancelView;
                    if (textView == null) {
                        C52711k.m112237a("mCancelView");
                    }
                    C47687av avVar = this.f113345ak;
                    if (avVar == null) {
                        C52711k.m112237a("debounceOnClickListener");
                    }
                    textView.setOnClickListener(avVar);
                    TextView textView2 = this.mSaveView;
                    if (textView2 == null) {
                        C52711k.m112237a("mSaveView");
                    }
                    C47687av avVar2 = this.f113345ak;
                    if (avVar2 == null) {
                        C52711k.m112237a("debounceOnClickListener");
                    }
                    textView2.setOnClickListener(avVar2);
                    ImageView imageView = this.mIvFont;
                    if (imageView == null) {
                        C52711k.m112237a("mIvFont");
                    }
                    C47687av avVar3 = this.f113345ak;
                    if (avVar3 == null) {
                        C52711k.m112237a("debounceOnClickListener");
                    }
                    imageView.setOnClickListener(avVar3);
                    ImageView imageView2 = this.mIvDelete;
                    if (imageView2 == null) {
                        C52711k.m112237a("mIvDelete");
                    }
                    C47687av avVar4 = this.f113345ak;
                    if (avVar4 == null) {
                        C52711k.m112237a("debounceOnClickListener");
                    }
                    imageView2.setOnClickListener(avVar4);
                    ImageView imageView3 = this.mIvEdit;
                    if (imageView3 == null) {
                        C52711k.m112237a("mIvEdit");
                    }
                    C47687av avVar5 = this.f113345ak;
                    if (avVar5 == null) {
                        C52711k.m112237a("debounceOnClickListener");
                    }
                    imageView3.setOnClickListener(avVar5);
                    DmtStatusView dmtStatusView = this.mLoadingStatusView;
                    if (dmtStatusView == null) {
                        C52711k.m112237a("mLoadingStatusView");
                    }
                    FragmentActivity fragmentActivity11 = this.f113315C;
                    if (fragmentActivity11 == null) {
                        C52711k.m112237a("mActivity");
                    }
                    dmtStatusView.setBuilder(C10719a.m21676a((Context) fragmentActivity11).mo19233c(1));
                    FragmentActivity fragmentActivity12 = this.f113315C;
                    if (fragmentActivity12 == null) {
                        C52711k.m112237a("mActivity");
                    }
                    this.f113364x = new HighLightLayoutManager(fragmentActivity12, 1, false);
                    this.f113365y = new C44823f(this, new ArrayList());
                    AVDmtPanelRecyleView aVDmtPanelRecyleView = this.mRecyclerView;
                    if (aVDmtPanelRecyleView == null) {
                        C52711k.m112237a("mRecyclerView");
                    }
                    HighLightLayoutManager highLightLayoutManager = this.f113364x;
                    if (highLightLayoutManager == null) {
                        C52711k.m112237a("mHighLightLayoutManager");
                    }
                    aVDmtPanelRecyleView.setLayoutManager(highLightLayoutManager);
                    C44823f fVar = this.f113365y;
                    if (fVar == null) {
                        C52711k.m112237a("mSubtitleAdapter");
                    }
                    aVDmtPanelRecyleView.setAdapter(fVar);
                    aVDmtPanelRecyleView.mo4798a((C1331h) new C44822e((int) C9432q.m18687b(aVDmtPanelRecyleView.getContext(), 52.0f), (int) C9432q.m18687b(aVDmtPanelRecyleView.getContext(), 106.0f)));
                    C1327f itemAnimator = aVDmtPanelRecyleView.getItemAnimator();
                    if (itemAnimator != null) {
                        ((C1440au) itemAnimator).f5184m = false;
                        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = this.mRecyclerView;
                        if (aVDmtPanelRecyleView2 == null) {
                            C52711k.m112237a("mRecyclerView");
                        }
                        aVDmtPanelRecyleView2.mo4801a((C1340m) new C44848z(this));
                        FragmentActivity fragmentActivity13 = this.f113315C;
                        if (fragmentActivity13 == null) {
                            C52711k.m112237a("mActivity");
                        }
                        LayoutInflater from4 = LayoutInflater.from(fragmentActivity13);
                        ViewGroup viewGroup3 = this.f113319G;
                        if (viewGroup3 == null) {
                            C52711k.m112237a("mSubtitleView");
                        }
                        View inflate4 = from4.inflate(R.layout.af8, viewGroup3, false);
                        if (inflate4 != null) {
                            this.f113332T = (LinearLayout) inflate4;
                            this.f113366z = new C44863g(this, new ArrayList(), new ArrayList(), 0);
                            LinearLayout linearLayout3 = this.f113332T;
                            if (linearLayout3 == null) {
                                C52711k.m112237a("mEditView");
                            }
                            View findViewById4 = linearLayout3.findViewById(R.id.a9n);
                            RecyclerView recyclerView = (RecyclerView) findViewById4;
                            FragmentActivity fragmentActivity14 = this.f113315C;
                            if (fragmentActivity14 == null) {
                                C52711k.m112237a("mActivity");
                            }
                            recyclerView.setLayoutManager(new LinearLayoutManager(fragmentActivity14, 1, false));
                            C44863g gVar = this.f113366z;
                            if (gVar == null) {
                                C52711k.m112237a("mSubtitleEditAdapter");
                            }
                            recyclerView.setAdapter(gVar);
                            recyclerView.mo4798a((C1331h) new C44822e((int) C9432q.m18687b(recyclerView.getContext(), 0.0f), (int) C9432q.m18687b(recyclerView.getContext(), 40.0f)));
                            C52711k.m112236a((Object) findViewById4, "mEditView.findViewById<R… 40f).toInt()))\n        }");
                            this.f113326N = recyclerView;
                            this.f113320H = new C44844v(this);
                            VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f113316D;
                            if (vEVideoPublishEditViewModel == null) {
                                C52711k.m112237a("mVEVideoPublishEditViewModel");
                            }
                            C0198r<C53030y> k = vEVideoPublishEditViewModel.mo110466k();
                            C52711k.m112236a((Object) k, "mVEVideoPublishEditViewM…el.previewControlLiveData");
                            this.f113321I = k;
                            C0198r<C53030y> rVar = this.f113321I;
                            if (rVar == null) {
                                C52711k.m112237a("mPreviewControlOpLiveData");
                            }
                            rVar.observe(kVar, new C44845w(this));
                            EditSubtitleViewModel editSubtitleViewModel = this.f113347am;
                            if (editSubtitleViewModel == null) {
                                C52711k.m112237a("mSubtitleViewModel");
                            }
                            editSubtitleViewModel.mo96969a().observe(kVar, new C44846x(this));
                            return;
                        }
                        throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout");
                    }
                    throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.SimpleItemAnimator");
                }
                throw new C52857u("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.ListenableActivityRegistry");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: b */
    private final int m97956b(String str, String str2) {
        if (!m97955ad() && !m97954ac()) {
            return VEUtils.transCodeAudio(str, str2, 1, -1, 16000);
        }
        this.f113344aj = true;
        return 0;
    }

    /* renamed from: b */
    public final void mo90893b(SubtitleApiV2 subtitleApiV2, String str) {
        mo90888a((C52670a<C52860x>) new C44799aq<C52860x>(this, str, subtitleApiV2));
    }

    /* renamed from: a */
    public final void mo90883a(int i, boolean z) {
        String str;
        boolean z2;
        this.f113338Z = false;
        mo90869L();
        C29087a aVar = this.f113320H;
        if (aVar == null) {
            C52711k.m112237a("mCurrentPositionSource");
        }
        long a = aVar.mo58927a();
        C20347c cVar = this.f113317E;
        if (cVar != null) {
            cVar.mo43019a(false);
        }
        C44823f fVar = this.f113365y;
        if (fVar == null) {
            C52711k.m112237a("mSubtitleAdapter");
        }
        ArrayList<UtteranceWithWords> arrayList = fVar.f113447c;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = arrayList.get(i3);
            C52711k.m112236a(obj, "oldList[i]");
            UtteranceWithWords utteranceWithWords = new UtteranceWithWords((UtteranceWithWords) obj);
            if (utteranceWithWords.getText().length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                arrayList3.add(utteranceWithWords);
                String text = utteranceWithWords.getText();
                if (text != null) {
                    char[] charArray = text.toCharArray();
                    C52711k.m112236a((Object) charArray, "(this as java.lang.String).toCharArray()");
                    arrayList4.add(new String(charArray));
                    if (i3 == i) {
                        i2 = arrayList3.size() - 1;
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                int i4 = i;
            }
            arrayList2.add(utteranceWithWords);
        }
        C44863g gVar = this.f113366z;
        if (gVar == null) {
            C52711k.m112237a("mSubtitleEditAdapter");
        }
        gVar.mo90977a(arrayList3, arrayList2, i2);
        RecyclerView recyclerView = this.f113326N;
        if (recyclerView == null) {
            C52711k.m112237a("mEditRecyclerView");
        }
        C1332i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            FragmentActivity fragmentActivity = this.f113315C;
            if (fragmentActivity == null) {
                C52711k.m112237a("mActivity");
            }
            linearLayoutManager.mo4721a(i2, (int) C9432q.m18687b((Context) fragmentActivity, 100.0f));
            ViewGroup viewGroup = this.f113319G;
            if (viewGroup == null) {
                C52711k.m112237a("mSubtitleView");
            }
            ViewGroup viewGroup2 = this.f113319G;
            if (viewGroup2 == null) {
                C52711k.m112237a("mSubtitleView");
            }
            View findViewById = viewGroup2.findViewById(R.id.cv3);
            LinearLayout linearLayout = this.f113332T;
            if (linearLayout == null) {
                C52711k.m112237a("mEditView");
            }
            C44870h hVar = new C44870h(viewGroup, findViewById, linearLayout);
            LinearLayout linearLayout2 = this.f113332T;
            if (linearLayout2 == null) {
                C52711k.m112237a("mEditView");
            }
            this.f113333U = linearLayout2.findViewById(R.id.q7);
            View view = this.f113333U;
            if (view == null) {
                C52711k.m112234a();
            }
            C44829j jVar = new C44829j(this, arrayList4, hVar, a);
            view.setOnClickListener(jVar);
            LinearLayout linearLayout3 = this.f113332T;
            if (linearLayout3 == null) {
                C52711k.m112237a("mEditView");
            }
            ((ImageView) linearLayout3.findViewById(R.id.cv6)).setOnClickListener(new C44831k(this, arrayList4, arrayList2, hVar));
            FragmentActivity fragmentActivity2 = this.f113315C;
            if (fragmentActivity2 == null) {
                C52711k.m112237a("mActivity");
            }
            this.f113346al = new C46747d(fragmentActivity2);
            C46747d dVar = this.f113346al;
            if (dVar == null) {
                C52711k.m112237a("keyBoardListener");
            }
            dVar.mo93878a(new C44832l(this));
            hVar.mo50219a((C24454d) new C44833m(this));
            if (z) {
                str = "click_preview";
            } else {
                str = "click_subtitle";
            }
            C44863g gVar2 = this.f113366z;
            if (gVar2 == null) {
                C52711k.m112237a("mSubtitleEditAdapter");
            }
            gVar2.mo90976a(str);
            C26890h.m65011a("enter_edit_subtitle", mo90881Y().mo86526a("enter_method", str).f107329a);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
    }

    /* renamed from: a */
    public final void mo90885a(SubtitleApiV2 subtitleApiV2, String str) {
        C0013i.m16a((Callable<TResult>) new C44790ak<TResult>(subtitleApiV2, str)).mo21a((C0011g<TResult, TContinuationResult>) new C44791al<TResult,TContinuationResult>(this, subtitleApiV2, str), C0013i.f25b, this.f113358r.mo13b());
    }

    /* renamed from: a */
    public final void mo90887a(C44870h hVar, int i) {
        if (this.f113342ad) {
            C46747d dVar = this.f113346al;
            if (dVar == null) {
                C52711k.m112237a("keyBoardListener");
            }
            dVar.mo93878a(new C44834n(this, hVar, i));
            FragmentActivity fragmentActivity = this.f113315C;
            if (fragmentActivity == null) {
                C52711k.m112237a("mActivity");
            }
            View currentFocus = fragmentActivity.getCurrentFocus();
            if (currentFocus != null) {
                InputMethodManager inputMethodManager = this.f113324L;
                if (inputMethodManager == null) {
                    C52711k.m112237a("mIMManager");
                }
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
            }
            return;
        }
        hVar.mo50223b(new C44836o(this, i));
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.aea, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…btitle, container, false)");
        return inflate;
    }

    /* renamed from: a */
    private static void m97951a(EditPreviewInfo editPreviewInfo, String[] strArr, long[] jArr, long[] jArr2, float[] fArr, long[] jArr3) {
        int size = editPreviewInfo.getVideoList().size();
        for (int i = 0; i < size; i++) {
            EditVideoSegment editVideoSegment = (EditVideoSegment) editPreviewInfo.getVideoList().get(i);
            strArr[i] = editVideoSegment.getVideoPath();
            if (editVideoSegment.getVideoCutInfo() != null) {
                VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo == null) {
                    C52711k.m112234a();
                }
                jArr[i] = videoCutInfo.getStart();
                jArr2[i] = videoCutInfo.getEnd();
                fArr[i] = videoCutInfo.getSpeed();
            } else {
                jArr[i] = -1;
                jArr2[i] = -1;
                fArr[i] = 1.0f;
            }
        }
        if (editPreviewInfo.getSceneIn() > 0 || editPreviewInfo.getSceneOut() > 0) {
            jArr3[0] = editPreviewInfo.getSceneIn();
            jArr3[1] = editPreviewInfo.getSceneOut();
            return;
        }
        jArr3[0] = -1;
        jArr3[1] = -1;
    }
}
