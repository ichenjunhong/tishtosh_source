package com.p683ss.android.ugc.aweme.choosemusic.viewholder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.arch.widgets.C23270a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24806c;
import com.p683ss.android.ugc.aweme.music.adapter.C37289e;
import com.p683ss.android.ugc.aweme.music.adapter.C37306l;
import com.p683ss.android.ugc.aweme.music.p1975c.C37351d;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView.C37446a;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47902fv;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52724b;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.e */
public final class C25025e extends C23270a {

    /* renamed from: u */
    public static final C25032a f66272u = new C25032a(null);

    /* renamed from: b */
    public RemoteImageView f66273b;

    /* renamed from: c */
    public RemoteImageView f66274c;

    /* renamed from: d */
    public ImageView f66275d;

    /* renamed from: e */
    public FrameLayout f66276e;

    /* renamed from: f */
    public DmtTextView f66277f;

    /* renamed from: g */
    public DmtTextView f66278g;

    /* renamed from: h */
    public RelativeLayout f66279h;

    /* renamed from: i */
    public CheckableImageView f66280i;

    /* renamed from: j */
    public LinearLayout f66281j;

    /* renamed from: k */
    public LinearLayout f66282k;

    /* renamed from: l */
    public LinearLayout f66283l;

    /* renamed from: m */
    public LinearLayout f66284m;

    /* renamed from: n */
    public C25033b f66285n;

    /* renamed from: o */
    public C37289e f66286o;

    /* renamed from: p */
    public C37306l<C24806c> f66287p;

    /* renamed from: q */
    public List<MusicModel> f66288q;

    /* renamed from: r */
    public int f66289r;

    /* renamed from: s */
    public Context f66290s;

    /* renamed from: t */
    public boolean f66291t;

    /* renamed from: v */
    private DmtTextView f66292v;

    /* renamed from: w */
    private ValueAnimator f66293w;

    /* renamed from: x */
    private Animation f66294x;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.e$a */
    public static final class C25032a {
        private C25032a() {
        }

        public /* synthetic */ C25032a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.e$b */
    public interface C25033b {
        /* renamed from: a */
        void mo51040a();
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.e$c */
    static final class C25034c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C25025e f66301a;

        /* renamed from: b */
        final /* synthetic */ C52724b f66302b;

        /* renamed from: c */
        final /* synthetic */ C52724b f66303c;

        C25034c(C25025e eVar, C52724b bVar, C52724b bVar2) {
            this.f66301a = eVar;
            this.f66302b = bVar;
            this.f66303c = bVar2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                RemoteImageView remoteImageView = this.f66301a.f66273b;
                if (remoteImageView != null) {
                    remoteImageView.setScaleX(floatValue);
                }
                RemoteImageView remoteImageView2 = this.f66301a.f66273b;
                if (remoteImageView2 != null) {
                    remoteImageView2.setScaleY(floatValue);
                }
                RemoteImageView remoteImageView3 = this.f66301a.f66273b;
                if (remoteImageView3 != null) {
                    remoteImageView3.setAlpha((floatValue - this.f66302b.element) / this.f66303c.element);
                }
                RemoteImageView remoteImageView4 = this.f66301a.f66274c;
                if (remoteImageView4 != null) {
                    remoteImageView4.setScaleX((this.f66302b.element + 1.0f) - floatValue);
                }
                RemoteImageView remoteImageView5 = this.f66301a.f66274c;
                if (remoteImageView5 != null) {
                    remoteImageView5.setScaleY((this.f66302b.element + 1.0f) - floatValue);
                }
                RemoteImageView remoteImageView6 = this.f66301a.f66274c;
                if (remoteImageView6 != null) {
                    remoteImageView6.setAlpha((1.0f - floatValue) / this.f66303c.element);
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.e$d */
    public static final class C25035d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C25025e f66304a;

        C25035d(C25025e eVar) {
            this.f66304a = eVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            RemoteImageView remoteImageView = this.f66304a.f66274c;
            this.f66304a.f66274c = this.f66304a.f66273b;
            this.f66304a.f66273b = remoteImageView;
            this.f66304a.mo51029a(this.f66304a.f66274c, this.f66304a.f66289r + 1);
        }
    }

    /* renamed from: c */
    public final MusicModel mo51033c() {
        List<MusicModel> list = this.f66288q;
        if (list != null) {
            MusicModel musicModel = (MusicModel) C52575l.m112118a(list, this.f66289r);
            if (musicModel != null) {
                return musicModel;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo51034d() {
        C25033b bVar = this.f66285n;
        if (bVar != null) {
            bVar.mo51040a();
        }
    }

    /* renamed from: a */
    public final void mo51027a() {
        int i;
        CheckableImageView checkableImageView = this.f66280i;
        if (checkableImageView != null) {
            if (this.f66291t) {
                i = R.drawable.a1c;
            } else {
                i = R.drawable.a1d;
            }
            checkableImageView.setImageResource(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo51032b() {
        LinearLayout linearLayout = this.f66282k;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f66283l;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        LinearLayout linearLayout3 = this.f66284m;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(0);
        }
    }

    /* renamed from: e */
    private final void m60852e() {
        C52724b bVar = new C52724b();
        bVar.element = 0.2f;
        C52724b bVar2 = new C52724b();
        bVar2.element = 1.0f - bVar.element;
        this.f66293w = ValueAnimator.ofFloat(new float[]{1.0f, bVar.element}).setDuration(150);
        RemoteImageView remoteImageView = this.f66274c;
        if (remoteImageView != null) {
            remoteImageView.setAlpha(0.0f);
        }
        RemoteImageView remoteImageView2 = this.f66274c;
        if (remoteImageView2 != null) {
            remoteImageView2.setVisibility(0);
        }
        ValueAnimator valueAnimator = this.f66293w;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new C25034c(this, bVar, bVar2));
        }
        ValueAnimator valueAnimator2 = this.f66293w;
        if (valueAnimator2 != null) {
            valueAnimator2.addListener(new C25035d(this));
        }
        ValueAnimator valueAnimator3 = this.f66293w;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    /* renamed from: a */
    private static String m60851a(MusicModel musicModel) {
        CharSequence charSequence;
        boolean z;
        CharSequence charSequence2;
        if (musicModel != null) {
            charSequence = musicModel.getPicPremium();
        } else {
            charSequence = null;
        }
        CharSequence charSequence3 = charSequence;
        boolean z2 = false;
        if (charSequence3 == null || charSequence3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (musicModel != null) {
                charSequence2 = musicModel.getPicBig();
            } else {
                charSequence2 = null;
            }
            CharSequence charSequence4 = charSequence2;
            if (charSequence4 == null || charSequence4.length() == 0) {
                z2 = true;
            }
            if (!z2 && musicModel != null) {
                return musicModel.getPicBig();
            }
        } else if (musicModel != null) {
            return musicModel.getPicPremium();
        }
        return null;
    }

    public C25025e(View view) {
        C52711k.m112240b(view, "view");
        super(view);
        this.f66290s = view.getContext();
        this.f66273b = (RemoteImageView) view.findViewById(R.id.azo);
        this.f66274c = (RemoteImageView) view.findViewById(R.id.azp);
        this.f66275d = (ImageView) view.findViewById(R.id.b4e);
        this.f66276e = (FrameLayout) view.findViewById(R.id.cdb);
        this.f66278g = (DmtTextView) view.findViewById(R.id.dg2);
        this.f66277f = (DmtTextView) view.findViewById(R.id.dcn);
        this.f66279h = (RelativeLayout) view.findViewById(R.id.cds);
        this.f66292v = (DmtTextView) view.findViewById(R.id.dcf);
        this.f66280i = (CheckableImageView) view.findViewById(R.id.b2l);
        this.f66281j = (LinearLayout) view.findViewById(R.id.bg1);
        this.f66282k = (LinearLayout) view.findViewById(R.id.bf9);
        this.f66283l = (LinearLayout) view.findViewById(R.id.bgp);
        this.f66284m = (LinearLayout) view.findViewById(R.id.bgo);
        View view2 = this.itemView;
        C52711k.m112236a((Object) view2, "itemView");
        this.f66294x = AnimationUtils.loadAnimation(view2.getContext(), R.anim.bc);
        Animation animation = this.f66294x;
        if (animation != null) {
            animation.setInterpolator(new LinearInterpolator());
        }
        LinearLayout linearLayout = this.f66282k;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C25025e f66295a;

                {
                    this.f66295a = r1;
                }

                public final void onClick(View view) {
                    MusicModel musicModel;
                    ClickInstrumentation.onClick(view);
                    C25025e eVar = this.f66295a;
                    eVar.mo51032b();
                    C37289e eVar2 = eVar.f66286o;
                    if (eVar2 != null) {
                        C1352v vVar = eVar;
                        View view2 = eVar.f66282k;
                        List<MusicModel> list = eVar.f66288q;
                        if (list != null) {
                            musicModel = (MusicModel) C52575l.m112118a(list, eVar.f66289r);
                        } else {
                            musicModel = null;
                        }
                        eVar2.mo51050a(vVar, view2, musicModel);
                    }
                }
            });
        }
        LinearLayout linearLayout2 = this.f66284m;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C25025e f66296a;

                {
                    this.f66296a = r1;
                }

                public final void onClick(View view) {
                    int i;
                    MusicModel musicModel;
                    ClickInstrumentation.onClick(view);
                    C25025e eVar = this.f66296a;
                    int i2 = eVar.f66289r + 1;
                    List<MusicModel> list = eVar.f66288q;
                    int i3 = 0;
                    if (list != null) {
                        i = list.size();
                    } else {
                        i = 0;
                    }
                    if (i2 >= i) {
                        eVar.mo51034d();
                        return;
                    }
                    List<MusicModel> list2 = eVar.f66288q;
                    if (list2 != null) {
                        i3 = list2.size();
                    }
                    if (i3 - eVar.f66289r <= 3) {
                        eVar.mo51034d();
                    }
                    eVar.f66289r++;
                    eVar.mo51028a(eVar.f66289r, true);
                    C37289e eVar2 = eVar.f66286o;
                    if (eVar2 != null) {
                        C1352v vVar = eVar;
                        View view2 = eVar.f66284m;
                        List<MusicModel> list3 = eVar.f66288q;
                        if (list3 != null) {
                            musicModel = (MusicModel) C52575l.m112118a(list3, eVar.f66289r);
                        } else {
                            musicModel = null;
                        }
                        eVar2.mo51050a(vVar, view2, musicModel);
                    }
                }
            });
        }
        LinearLayout linearLayout3 = this.f66281j;
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C25025e f66297a;

                {
                    this.f66297a = r1;
                }

                public final void onClick(View view) {
                    MusicModel musicModel;
                    ClickInstrumentation.onClick(view);
                    C25025e eVar = this.f66297a;
                    LinearLayout linearLayout = eVar.f66282k;
                    if (linearLayout != null && linearLayout.getVisibility() == 0) {
                        eVar.mo51032b();
                    }
                    C37289e eVar2 = eVar.f66286o;
                    if (eVar2 != null) {
                        C1352v vVar = eVar;
                        View view2 = eVar.f66281j;
                        List<MusicModel> list = eVar.f66288q;
                        if (list != null) {
                            musicModel = (MusicModel) C52575l.m112118a(list, eVar.f66289r);
                        } else {
                            musicModel = null;
                        }
                        eVar2.mo51050a(vVar, view2, musicModel);
                    }
                }
            });
        }
        LinearLayout linearLayout4 = this.f66283l;
        if (linearLayout4 != null) {
            linearLayout4.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C25025e f66298a;

                {
                    this.f66298a = r1;
                }

                public final void onClick(View view) {
                    MusicModel musicModel;
                    ClickInstrumentation.onClick(view);
                    C25025e eVar = this.f66298a;
                    C37289e eVar2 = eVar.f66286o;
                    if (eVar2 != null) {
                        C1352v vVar = eVar;
                        View view2 = eVar.f66283l;
                        List<MusicModel> list = eVar.f66288q;
                        if (list != null) {
                            musicModel = (MusicModel) C52575l.m112118a(list, eVar.f66289r);
                        } else {
                            musicModel = null;
                        }
                        eVar2.mo51050a(vVar, view2, musicModel);
                    }
                }
            });
        }
        CheckableImageView checkableImageView = this.f66280i;
        if (checkableImageView != null) {
            checkableImageView.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C25025e f66299a;

                {
                    this.f66299a = r1;
                }

                public final void onClick(View view) {
                    MusicModel musicModel;
                    ClickInstrumentation.onClick(view);
                    C25025e eVar = this.f66299a;
                    C37289e eVar2 = eVar.f66286o;
                    if (eVar2 != null) {
                        C1352v vVar = eVar;
                        View view2 = eVar.f66280i;
                        List<MusicModel> list = eVar.f66288q;
                        if (list != null) {
                            musicModel = (MusicModel) C52575l.m112118a(list, eVar.f66289r);
                        } else {
                            musicModel = null;
                        }
                        eVar2.mo51050a(vVar, view2, musicModel);
                    }
                }
            });
        }
        CheckableImageView checkableImageView2 = this.f66280i;
        if (checkableImageView2 != null) {
            checkableImageView2.setOnStateChangeListener(new C37446a(this) {

                /* renamed from: a */
                final /* synthetic */ C25025e f66300a;

                /* renamed from: a */
                public final void mo50574a() {
                    MusicModel musicModel;
                    C25025e eVar = this.f66300a;
                    boolean z = eVar.f66291t;
                    List<MusicModel> list = eVar.f66288q;
                    if (list != null) {
                        musicModel = (MusicModel) C52575l.m112118a(list, eVar.f66289r);
                    } else {
                        musicModel = null;
                    }
                    C47718bf.m103288a(new C37351d(z ? 1 : 0, musicModel));
                }

                {
                    this.f66300a = r1;
                }

                /* renamed from: a */
                public final void mo50575a(int i) {
                    if (i == 1) {
                        this.f66300a.mo51027a();
                    }
                }
            });
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r0 == false) goto L_0x0027;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51030a(java.util.List<? extends com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel> r4) {
        /*
            r3 = this;
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r0 = r3.f66288q
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r0 = 0
            goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            if (r0 == 0) goto L_0x0026
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r0 = 0
            goto L_0x0023
        L_0x0022:
            r0 = 1
        L_0x0023:
            if (r0 != 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r0 = r3.f66288q
            if (r0 != 0) goto L_0x0034
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r3.f66288q = r0
        L_0x0034:
            if (r4 == 0) goto L_0x003f
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r0 = r3.f66288q
            if (r0 == 0) goto L_0x003f
            java.util.Collection r4 = (java.util.Collection) r4
            r0.addAll(r4)
        L_0x003f:
            if (r1 == 0) goto L_0x0046
            int r4 = r3.f66289r
            r3.mo51028a(r4, r2)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.choosemusic.viewholder.C25025e.mo51030a(java.util.List):void");
    }

    /* renamed from: a */
    public final void mo51029a(RemoteImageView remoteImageView, int i) {
        int i2;
        MusicModel musicModel;
        List<MusicModel> list = this.f66288q;
        boolean z = false;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (i < i2) {
            List<MusicModel> list2 = this.f66288q;
            if (list2 != null) {
                musicModel = (MusicModel) list2.get(i);
            } else {
                musicModel = null;
            }
            String a = m60851a(musicModel);
            CharSequence charSequence = a;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            }
            if (z) {
                C23515d.m57668a(remoteImageView, (int) R.color.io);
            } else {
                C23515d.m57677a(remoteImageView, a);
            }
        }
    }

    /* renamed from: a */
    public final void mo51028a(int i, boolean z) {
        int i2;
        MusicModel musicModel;
        int i3;
        CharSequence charSequence;
        boolean z2;
        String singer;
        CharSequence charSequence2;
        List<MusicModel> list = this.f66288q;
        boolean z3 = false;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (i < i2) {
            List<MusicModel> list2 = this.f66288q;
            CollectionType collectionType = null;
            if (list2 != null) {
                musicModel = (MusicModel) list2.get(i);
            } else {
                musicModel = null;
            }
            DmtTextView dmtTextView = this.f66277f;
            if (dmtTextView != null) {
                if (musicModel != null) {
                    charSequence2 = musicModel.getName();
                } else {
                    charSequence2 = null;
                }
                dmtTextView.setText(charSequence2);
            }
            DmtTextView dmtTextView2 = this.f66278g;
            if (dmtTextView2 != null) {
                if (musicModel != null) {
                    charSequence = musicModel.getSinger();
                } else {
                    charSequence = null;
                }
                CharSequence charSequence3 = charSequence;
                if (charSequence3 == null || charSequence3.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    DmtTextView dmtTextView3 = this.f66278g;
                    if (dmtTextView3 != null) {
                        Context context = dmtTextView3.getContext();
                        if (context != null) {
                            singer = context.getString(R.string.f76);
                            dmtTextView2.setText(singer);
                        }
                    }
                } else if (musicModel != null) {
                    singer = musicModel.getSinger();
                    dmtTextView2.setText(singer);
                }
                singer = null;
                dmtTextView2.setText(singer);
            }
            DmtTextView dmtTextView4 = this.f66292v;
            if (dmtTextView4 != null) {
                if (musicModel != null) {
                    i3 = musicModel.getPresenterDuration();
                } else {
                    i3 = 0;
                }
                dmtTextView4.setText(C47902fv.m103621a(i3));
            }
            CollectionType collectionType2 = CollectionType.COLLECTED;
            if (musicModel != null) {
                collectionType = musicModel.getCollectionType();
            }
            if (collectionType2 == collectionType) {
                z3 = true;
            }
            this.f66291t = z3;
            mo51027a();
            if (!z) {
                mo51029a(this.f66273b, i);
                mo51029a(this.f66274c, i + 1);
                return;
            }
            m60852e();
        }
    }

    /* renamed from: a */
    public final void mo51031a(boolean z, boolean z2) {
        ImageView imageView = this.f66275d;
        if (imageView != null) {
            imageView.clearAnimation();
        }
        if (z && z2) {
            C25025e eVar = this;
            ImageView imageView2 = eVar.f66275d;
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.apj);
            }
            ImageView imageView3 = eVar.f66275d;
            if (imageView3 != null) {
                imageView3.startAnimation(eVar.f66294x);
            }
        } else if (!z || z2) {
            ImageView imageView4 = this.f66275d;
            if (imageView4 != null) {
                imageView4.setImageResource(R.drawable.a_c);
            }
        } else {
            ImageView imageView5 = this.f66275d;
            if (imageView5 != null) {
                imageView5.setImageResource(R.drawable.aa1);
            }
        }
    }
}
