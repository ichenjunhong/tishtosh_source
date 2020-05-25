package com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.graphics.C0803a;
import android.support.p030v4.p038f.C0781c;
import android.support.p030v4.p038f.C0794k;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C42430at;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.C43845fn;
import com.p683ss.android.ugc.aweme.shortvideo.C43862ga;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42652k;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.C42659b;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.C42660c;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.C42661d;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.ScrollInterceptedLayoutManager;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.p2184a.C43115a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.p2184a.C43117b;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.C43135a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout;
import com.p683ss.android.ugc.aweme.shortvideo.widget.C45617m;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p683ss.android.ugc.aweme.themechange.base.C46788b;
import com.p683ss.android.ugc.aweme.tools.C46811b;
import com.p683ss.android.ugc.aweme.tools.p2348b.C46813b;
import com.p683ss.android.ugc.tools.utils.C50201e;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p2628d.C52847n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView */
public class VideoEditView extends AbstractVideoEditView implements OnTouchListener {

    /* renamed from: A */
    C43113a f108830A;

    /* renamed from: B */
    C45617m f108831B;

    /* renamed from: C */
    protected float f108832C;

    /* renamed from: D */
    protected float f108833D;

    /* renamed from: E */
    protected int f108834E;

    /* renamed from: F */
    protected int f108835F;

    /* renamed from: G */
    protected int f108836G;

    /* renamed from: H */
    protected int f108837H;

    /* renamed from: I */
    protected C42660c f108838I;

    /* renamed from: J */
    protected C42661d f108839J;

    /* renamed from: K */
    protected int f108840K;

    /* renamed from: L */
    protected int f108841L;

    /* renamed from: M */
    protected int f108842M;

    /* renamed from: N */
    protected int f108843N;

    /* renamed from: O */
    protected int f108844O;

    /* renamed from: P */
    private long f108845P;

    /* renamed from: Q */
    private long f108846Q;

    /* renamed from: R */
    private float f108847R;

    /* renamed from: S */
    private float f108848S;

    /* renamed from: T */
    private float f108849T;

    /* renamed from: U */
    private boolean f108850U;

    /* renamed from: V */
    private boolean f108851V;

    /* renamed from: W */
    private C43134r f108852W;

    /* renamed from: aa */
    private long f108853aa;

    /* renamed from: ab */
    private int f108854ab;

    /* renamed from: ac */
    private int f108855ac;

    /* renamed from: ad */
    private int f108856ad;

    /* renamed from: ae */
    private boolean f108857ae;

    /* renamed from: af */
    private boolean f108858af;

    /* renamed from: ag */
    private boolean f108859ag;

    /* renamed from: ah */
    private C20347c f108860ah;

    /* renamed from: ai */
    private C0198r<Bitmap> f108861ai;

    /* renamed from: aj */
    private C0198r<Boolean> f108862aj;

    /* renamed from: ak */
    private boolean f108863ak;

    /* renamed from: al */
    private boolean f108864al;

    /* renamed from: am */
    private int f108865am;

    /* renamed from: an */
    private int f108866an;

    /* renamed from: ao */
    private int f108867ao;

    /* renamed from: ap */
    private int f108868ap;

    /* renamed from: aq */
    private int f108869aq;

    /* renamed from: ar */
    private boolean f108870ar;

    /* renamed from: as */
    private boolean f108871as;

    /* renamed from: at */
    private long f108872at;

    /* renamed from: au */
    private C1340m f108873au;

    /* renamed from: b */
    private boolean f108874b;

    /* renamed from: c */
    protected int f108875c;

    /* renamed from: d */
    FragmentActivity f108876d;

    /* renamed from: e */
    VideoEditViewModel f108877e;

    /* renamed from: f */
    CutMultiVideoViewModel f108878f;

    /* renamed from: g */
    protected C43135a f108879g;

    /* renamed from: h */
    protected C43135a f108880h;

    /* renamed from: i */
    protected TextView f108881i;

    /* renamed from: j */
    protected TextView f108882j;

    /* renamed from: k */
    protected LayoutParams f108883k;

    /* renamed from: l */
    protected LayoutParams f108884l;

    /* renamed from: m */
    protected View f108885m;

    /* renamed from: n */
    protected View f108886n;

    /* renamed from: o */
    protected View f108887o;

    /* renamed from: p */
    protected View f108888p;

    /* renamed from: q */
    protected View f108889q;

    /* renamed from: r */
    RTLLinearLayout f108890r;

    /* renamed from: s */
    ImageView f108891s;

    /* renamed from: t */
    protected boolean f108892t;

    /* renamed from: u */
    protected C42659b f108893u;

    /* renamed from: v */
    FrameLayout f108894v;

    /* renamed from: w */
    MVRecycleView f108895w;

    /* renamed from: x */
    MVRecycleView f108896x;

    /* renamed from: y */
    View f108897y;

    /* renamed from: z */
    C43113a f108898z;

    /* renamed from: a */
    public void mo87516a(List<VideoSegment> list) {
    }

    /* renamed from: a */
    public void mo87517a(boolean z) {
    }

    /* renamed from: d */
    public boolean mo87519d() {
        return false;
    }

    /* renamed from: e */
    public void mo87520e() {
    }

    /* renamed from: f */
    public void mo87521f() {
    }

    public int getEditState() {
        return this.f108835F;
    }

    public View getEndSlide() {
        return this.f108879g;
    }

    public int getFrameHeight() {
        return this.f108840K;
    }

    public int getFrameWidth() {
        return this.f108867ao;
    }

    public int getLeftRightMargin() {
        return this.f108842M;
    }

    public long getLeftSeekingValue() {
        return 0;
    }

    public long getMinVideoLength() {
        return this.f108845P;
    }

    public int getOverXScroll() {
        return this.f108834E;
    }

    public long getPlayingPosition() {
        return 0;
    }

    public long getRightSeekingValue() {
        return 0;
    }

    public View getStartSlide() {
        return this.f108880h;
    }

    public VideoEditViewModel getVideoEditViewModel() {
        return this.f108877e;
    }

    public C43134r getViewConfig() {
        return this.f108852W;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    /* renamed from: a */
    public final boolean mo87551a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, String str) {
        MediaModel mediaModel;
        this.f108878f = cutMultiVideoViewModel;
        if (cutMultiVideoViewModel.f107677k) {
            mediaModel = new MediaModel(-1);
            mediaModel.f95383b = str;
            mediaModel.f95390i = 720;
            mediaModel.f95391j = 1280;
            mediaModel.f95386e = (long) cutMultiVideoViewModel.f107678l;
        } else {
            int[] iArr = new int[10];
            if (C46813b.m101656a(str, iArr) == 0) {
                MediaModel mediaModel2 = new MediaModel(-1);
                mediaModel2.f95383b = str;
                mediaModel2.f95390i = iArr[0];
                mediaModel2.f95391j = iArr[1];
                mediaModel2.f95386e = (long) iArr[3];
                mediaModel = mediaModel2;
            } else {
                mediaModel = null;
            }
        }
        if (mediaModel == null) {
            return false;
        }
        return mo87552a(fragmentActivity, cutMultiVideoViewModel, Collections.singletonList(mediaModel));
    }

    /* renamed from: a */
    public final boolean mo87550a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, C45617m mVar, List<MediaModel> list) {
        this.f108831B = mVar;
        return mo87552a(fragmentActivity, cutMultiVideoViewModel, list);
    }

    /* renamed from: a */
    public final boolean mo87552a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, List<MediaModel> list) {
        this.f108876d = fragmentActivity;
        this.f108835F = list.size() > 1 ? 1 : 0;
        this.f108878f = cutMultiVideoViewModel;
        this.f108877e = (VideoEditViewModel) C0214z.m440a(fragmentActivity).mo359a(VideoEditViewModel.class);
        m94473a(cutMultiVideoViewModel, list);
        m94477r();
        this.f108858af = true;
        return true;
    }

    /* renamed from: a */
    public final boolean mo87553a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, List<MediaModel> list, boolean z) {
        this.f108876d = fragmentActivity;
        this.f108835F = z ? 1 : 0;
        this.f108878f = cutMultiVideoViewModel;
        this.f108877e = (VideoEditViewModel) C0214z.m440a(fragmentActivity).mo359a(VideoEditViewModel.class);
        m94473a(cutMultiVideoViewModel, list);
        m94477r();
        this.f108858af = true;
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo87544a(Long l) {
        if (l != null) {
            this.f108853aa = l.longValue();
            int i = this.f108835F;
            long j = this.f108853aa;
            if (!this.f108892t && j != -1 && j != 1) {
                float f = 0.0f;
                if (i == 1) {
                    C42659b bVar = this.f108893u;
                    List l2 = this.f108877e.mo87634l();
                    float m = this.f108877e.mo87635m();
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < l2.size(); i2++) {
                        if (!((VideoSegment) l2.get(i2)).f107911j) {
                            arrayList.add(l2.get(i2));
                        }
                    }
                    long j2 = j;
                    int i3 = 0;
                    float f2 = 0.0f;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            i3 = 0;
                            break;
                        }
                        VideoSegment videoSegment = (VideoSegment) arrayList.get(i3);
                        if (j2 <= videoSegment.f107904c) {
                            break;
                        }
                        f2 += ((float) (videoSegment.mo86953g() - videoSegment.mo86952f())) / ((videoSegment.mo86954h() * m) * bVar.f107931e);
                        j2 -= videoSegment.f107904c;
                        i3++;
                    }
                    if (!arrayList.isEmpty()) {
                        f2 += ((float) (j2 - ((VideoSegment) arrayList.get(i3)).mo86952f())) / ((m * ((VideoSegment) arrayList.get(i3)).mo86954h()) * bVar.f107931e);
                    }
                    f = f2 - this.f108832C;
                } else if (i == 2 || i == 0) {
                    f = ((((float) j) * 1.0f) / (this.f108839J.f107943d * this.f108893u.f107931e)) - this.f108832C;
                }
                mo87541a(this.f108880h.getStartX() + f, false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo87545a(Void voidR) {
        this.f108839J.f107942c += 90;
        if (this.f108839J.f107942c >= 360) {
            this.f108839J.f107942c = 0;
        }
        if (this.f108835F == 0) {
            this.f108877e.mo87611a(this.f108839J, 0);
        }
    }

    /* renamed from: a */
    public void mo87514a(VideoSegment videoSegment) {
        this.f108835F = 1;
        this.f108877e.mo87606a(1);
        if (this.f108839J != null) {
            this.f108839J.mo86966a();
        }
        if (this.f108838I != null) {
            this.f108838I.mo86964a();
        }
        this.f108877e.mo87618b(videoSegment.mo86950e());
        this.f108893u.mo86963a(this.f108877e.mo87634l(), this.f108877e.mo87635m());
        mo87540a((float) this.f108844O, (float) ((this.f108875c - this.f108844O) - C42652k.f107892d), 0);
        mo87515a(videoSegment, 3);
    }

    /* renamed from: a */
    public final void mo87543a(C0794k<Float, Float> kVar, boolean z) {
        if (z) {
            if (kVar.f2711a != null) {
                this.f108838I.f107937a = ((Float) kVar.f2711a).floatValue();
            }
            if (kVar.f2712b != null) {
                this.f108838I.f107938b = ((Float) kVar.f2712b).floatValue();
            }
            this.f108893u.mo86963a(this.f108877e.mo87634l(), this.f108877e.mo87635m());
            mo87540a(this.f108838I.f107937a, this.f108838I.f107938b, this.f108838I.f107939c);
            return;
        }
        mo87540a(((Float) kVar.f2711a).floatValue(), ((Float) kVar.f2712b).floatValue(), 0);
        this.f108896x.postDelayed(new C43129m(this), 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo87515a(VideoSegment videoSegment, int i) {
        this.f108895w.setVisibility(0);
        this.f108896x.setVisibility(8);
        this.f108830A.mo87646b();
        if (i == 2) {
            this.f108895w.mo4814b(0);
            this.f108898z.mo87640a((C0184k) this.f108876d, this.f108893u.f107928b, this.f108835F, false);
            this.f108877e.mo87631i();
        } else if (i == 3) {
            this.f108895w.mo4814b(0);
            this.f108898z.mo87639a((C0184k) this.f108876d, videoSegment, this.f108893u.f107928b);
            this.f108877e.mo87610a(videoSegment);
        } else {
            if (i == 1) {
                this.f108877e.mo87630h();
            }
        }
    }

    /* renamed from: a */
    public void mo87513a(C0794k<Integer, Integer> kVar) {
        this.f108835F = 2;
        this.f108877e.mo87606a(2);
        this.f108837H = ((Integer) kVar.f2711a).intValue();
        this.f108836G = ((Integer) kVar.f2712b).intValue();
        VideoSegment videoSegment = (VideoSegment) this.f108877e.mo87634l().get(this.f108836G);
        if (this.f108839J == null) {
            this.f108839J = new C42661d(videoSegment);
        } else {
            this.f108839J.mo86967a(videoSegment);
        }
        this.f108893u.mo86961a(videoSegment.f107904c, videoSegment.mo86950e(), this.f108877e.mo87626e(this.f108836G).mo86954h(), this.f108835F);
        this.f108895w.setVisibility(8);
        this.f108898z.mo87646b();
        this.f108896x.setVisibility(0);
        this.f108896x.mo4814b(0);
        this.f108830A.mo87641a((C0184k) this.f108876d, this.f108893u.f107928b, videoSegment, false);
        this.f108896x.mo4795a(this.f108877e.mo87614b(this.f108836G), 0);
        this.f108838I.mo86965a(getStartSlideX(), getEndSlideX(), getOverXScroll());
        float a = C42652k.m93579a(this.f108893u, this.f108877e.mo87626e(this.f108836G), this.f108877e.mo87614b(this.f108836G), this.f108844O);
        mo87540a(a, C42652k.m93578a(this.f108876d, this.f108893u, a, this.f108877e.mo87626e(this.f108836G), this.f108844O), 0);
        this.f108877e.mo87609a(kVar);
    }

    /* renamed from: a */
    public final boolean mo87548a(int i, int i2, int i3) {
        return mo87549a(i, i2, 0, true);
    }

    /* renamed from: a */
    public final boolean mo87549a(int i, int i2, int i3, boolean z) {
        float f;
        int i4 = i2 - i;
        if (((long) Math.abs(i4)) < Math.abs(getMinVideoLength() - 100)) {
            C39629l.m88232a().mo58588s();
        }
        if (this.f108880h == null || VERSION.SDK_INT < 19 || !this.f108880h.isLaidOut() || this.f108880h.getLeft() == 0) {
            return false;
        }
        if (this.f108874b) {
            VideoSegment videoSegment = (VideoSegment) this.f108877e.mo87634l().get(this.f108836G);
            if (this.f108839J == null) {
                this.f108839J = new C42661d(videoSegment);
            } else {
                this.f108839J.mo86967a(videoSegment);
            }
            this.f108893u.mo86961a(videoSegment.f107904c, videoSegment.mo86950e(), this.f108877e.mo87626e(this.f108836G).mo86954h(), this.f108835F);
        }
        this.f108877e.mo87607a(this.f108836G, i3);
        this.f108896x.mo4814b(0);
        this.f108896x.mo4795a(i3, 0);
        VideoSegment e = this.f108877e.mo87626e(this.f108836G);
        float h = (((((float) i) * 1.0f) / (e.mo86954h() * this.f108893u.f107931e)) + ((float) this.f108844O)) - ((float) i3);
        if (((long) i2) >= e.f107904c) {
            float b = (float) ((C43303dy.m94971b(this.f108876d) - this.f108844O) - C42652k.f107892d);
            f = b;
            h = Math.max((b - ((float) C42652k.f107892d)) - (((float) i4) / this.f108893u.f107931e), (float) (this.f108844O - i3));
        } else {
            f = ((float) C42652k.f107892d) + h + (((float) i4) / this.f108893u.f107931e);
        }
        m94471a(h, f, i3, z);
        if (z) {
            setCurPointerContainerStartX((float) (this.f108844O + C42652k.f107892d));
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo87518a(String str) {
        if (str.equals("curPoint") || ((int) ((this.f108879g.getStartX() - this.f108880h.getStartX()) - ((float) C42652k.f107892d))) >= ((int) this.f108893u.f107933g) - 2) {
            return true;
        }
        m94466B();
        C42652k.m93583a((Context) this.f108876d);
        return false;
    }

    /* renamed from: a */
    public final void mo87546a(boolean z, C0794k<Float, Float> kVar) {
        float floatValue = kVar.f2711a != null ? ((Float) kVar.f2711a).floatValue() : 0.0f;
        if (floatValue <= 0.0f) {
            floatValue = (float) this.f108844O;
        }
        float floatValue2 = kVar.f2712b != null ? ((Float) kVar.f2712b).floatValue() : 0.0f;
        if (floatValue2 <= 0.0f) {
            floatValue2 = (float) ((this.f108875c - this.f108844O) - C42652k.f107892d);
        }
        if (z) {
            mo87540a(floatValue, floatValue2, 0);
            return;
        }
        this.f108835F = 1;
        this.f108877e.mo87606a(1);
        if (this.f108839J != null) {
            this.f108839J.mo86966a();
        }
        if (this.f108838I != null) {
            this.f108838I.mo86964a();
        }
        for (VideoSegment videoSegment : this.f108877e.mo87634l()) {
            this.f108893u.mo86962a(videoSegment.mo86950e(), videoSegment.mo86954h());
        }
        this.f108893u.mo86963a(this.f108877e.mo87634l(), this.f108877e.mo87635m());
        mo87540a(floatValue, floatValue2, 0);
        this.f108896x.setVisibility(8);
        this.f108830A.mo87646b();
        this.f108895w.setVisibility(0);
        this.f108895w.mo4814b(0);
        C43113a aVar = this.f108898z;
        FragmentActivity fragmentActivity = this.f108876d;
        List l = this.f108877e.mo87634l();
        HashMap<String, Float> hashMap = this.f108893u.f107928b;
        aVar.f108935f.clear();
        aVar.f108935f.addAll(l);
        aVar.mo87643a(hashMap);
    }

    /* renamed from: a */
    public final void mo87547a(final boolean z, boolean z2, final C0781c<Void> cVar) {
        if (z2) {
            AlphaAnimation alphaAnimation = z ? new AlphaAnimation(0.0f, 1.0f) : new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(200);
            alphaAnimation.setAnimationListener(new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                    if (z) {
                        VideoEditView.this.mo87557c(true);
                    }
                }

                public final void onAnimationEnd(Animation animation) {
                    if (!z) {
                        VideoEditView.this.mo87557c(false);
                    }
                    if (cVar != null) {
                        cVar.accept(null);
                    }
                }
            });
            if (this.f108880h != null) {
                this.f108880h.startAnimation(alphaAnimation);
            }
            if (this.f108879g != null) {
                this.f108879g.startAnimation(alphaAnimation);
            }
            if (this.f108885m != null) {
                this.f108885m.startAnimation(alphaAnimation);
            }
            if (this.f108886n != null) {
                this.f108886n.startAnimation(alphaAnimation);
            }
            if (this.f108889q != null) {
                this.f108889q.startAnimation(alphaAnimation);
            }
            return;
        }
        mo87557c(z);
    }

    /* renamed from: a */
    public final void mo87542a(int i) {
        if (this.f108858af) {
            long j = (long) i;
            setMaxVideoLength(j);
            List l = this.f108877e.mo87634l();
            if (!C9414h.m18630a(l)) {
                VideoSegment videoSegment = (VideoSegment) l.get(0);
                videoSegment.f107904c = j;
                videoSegment.mo86946b(j);
            }
            this.f108893u.f107934h = j;
            this.f108893u.mo86963a(this.f108877e.mo87634l(), this.f108877e.mo87635m());
            this.f108874b = true;
        }
    }

    /* renamed from: y */
    private void m94484y() {
        m94485z();
        m94465A();
    }

    public float getEndSlideX() {
        return this.f108879g.getStartX();
    }

    public long getMaxCutDuration() {
        return this.f108893u.f107932f;
    }

    public float getStartSlideX() {
        return this.f108880h.getStartX();
    }

    /* renamed from: C */
    private void m94467C() {
        if (!this.f108851V) {
            this.f108851V = true;
            C42652k.m93583a((Context) this.f108876d);
        }
    }

    public RecyclerView getCurrentFrameRecyclerView() {
        if (this.f108835F == 0) {
            return this.f108896x;
        }
        return this.f108895w;
    }

    public C0794k<Long, Long> getPlayBoundary() {
        if (this.f108835F == 1) {
            return getMultiVideoPlayBoundary();
        }
        return getSingleVideoPlayBoundary();
    }

    public long getSeekTime() {
        if (this.f108835F == 1) {
            return getMultiSeekTime();
        }
        return getSingleSeekTime();
    }

    public float getSelectedTime() {
        return (this.f108833D * this.f108893u.f107931e) / 1000.0f;
    }

    public float getSelectedTimeInMillis() {
        return this.f108833D * this.f108893u.f107931e;
    }

    public long getSingleSeekTime() {
        return (long) ((this.f108832C + ((float) C42652k.f107892d)) * this.f108893u.f107931e);
    }

    public int getCurrentRotate() {
        if (this.f108835F == 2 || this.f108835F == 0) {
            return this.f108839J.f107942c;
        }
        return 0;
    }

    public float getCurrentSpeed() {
        if (this.f108835F == 2 || this.f108835F == 0) {
            return this.f108839J.f107943d;
        }
        return this.f108877e.mo87635m();
    }

    public long getMultiSeekTime() {
        return C42659b.m93612a(this.f108877e.mo87634l(), (this.f108832C + ((float) C42652k.f107892d)) * this.f108893u.f107931e, this.f108877e.mo87635m());
    }

    public long getSinglePlayingPosition() {
        return (long) (((this.f108832C + this.f108890r.getStartX()) - this.f108880h.getStartX()) * this.f108893u.f107931e * this.f108839J.f107943d);
    }

    public C0794k<Float, Float> getSlideX() {
        return new C0794k<>(Float.valueOf(getStartSlideX()), Float.valueOf(getEndSlideX()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo87535n() {
        if (this.f108880h != null) {
            this.f108880h.setImageResource(R.drawable.cbc);
        }
        if (this.f108879g != null) {
            this.f108879g.setImageResource(R.drawable.cbb);
        }
    }

    /* renamed from: r */
    private void m94477r() {
        this.f108875c = C43303dy.m94971b(this.f108876d);
        this.f108837H = 0;
        this.f108836G = 0;
        this.f108893u = new C42659b(this.f108877e.mo87634l(), C42652k.m93585b(this.f108876d, this.f108844O));
        this.f108893u.f107934h = this.f108846Q;
        this.f108893u.f107935i = this.f108845P;
        m94478s();
        m94479t();
        m94483x();
        m94482w();
        mo87529h();
    }

    /* renamed from: v */
    private void m94481v() {
        if (this.f108889q != null) {
            int startX = (int) (this.f108880h.getStartX() + ((float) C42652k.f107892d));
            LayoutParams layoutParams = new LayoutParams(Double.valueOf(Math.ceil((double) this.f108833D)).intValue(), this.f108840K);
            layoutParams.topMargin = this.f108843N;
            layoutParams.leftMargin = startX;
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(startX);
            }
            this.f108889q.setLayoutParams(layoutParams);
        }
    }

    public long getMultiPlayingPosition() {
        return C42659b.m93612a(this.f108877e.mo87634l(), ((this.f108832C + this.f108890r.getStartX()) - this.f108880h.getStartX()) * this.f108893u.f107931e, this.f108877e.mo87635m());
    }

    public C0794k<Long, Long> getSingleVideoPlayBoundary() {
        return C0794k.m2265a(Long.valueOf((long) ((this.f108832C + ((float) C42652k.f107892d)) * this.f108893u.f107931e * this.f108839J.f107943d)), Long.valueOf((long) ((this.f108832C + ((float) C42652k.f107892d) + this.f108833D) * this.f108893u.f107931e * this.f108839J.f107943d)));
    }

    /* renamed from: i */
    public void mo87530i() {
        if (this.f108887o != null) {
            float startX = this.f108880h.getStartX();
            int max = Math.max((this.f108844O + C42652k.f107892d) - this.f108834E, 0);
            LayoutParams layoutParams = new LayoutParams(Math.max((int) (startX - ((float) max)), 0), this.f108840K);
            layoutParams.topMargin = this.f108843N;
            layoutParams.leftMargin = max;
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(max);
            }
            layoutParams.gravity = 8388611;
            this.f108887o.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: k */
    public void mo87532k() {
        this.f108835F = 1;
        this.f108877e.mo87606a(1);
        if (this.f108839J != null) {
            this.f108839J.mo86966a();
        }
        this.f108893u.mo86963a(this.f108877e.mo87634l(), this.f108877e.mo87635m());
        mo87540a(this.f108838I.f107937a, this.f108838I.f107938b, this.f108838I.f107939c);
        mo87515a((VideoSegment) null, 1);
    }

    /* renamed from: l */
    public void mo87533l() {
        this.f108835F = 1;
        this.f108877e.mo87606a(1);
        mo87534m();
        if (this.f108838I != null) {
            this.f108838I.mo86964a();
        }
        this.f108893u.mo86963a(this.f108877e.mo87634l(), this.f108877e.mo87635m());
        mo87540a((float) this.f108844O, (float) ((this.f108875c - this.f108844O) - C42652k.f107892d), 0);
        mo87515a((VideoSegment) null, 2);
    }

    /* renamed from: A */
    private void m94465A() {
        this.f108889q = new View(this.f108876d);
        this.f108889q.setTag("block");
        this.f108889q.setOnTouchListener(this);
        this.f108889q.setBackgroundColor(this.f108855ac);
        this.f108889q.setVisibility(4);
        LayoutParams layoutParams = new LayoutParams((int) this.f108833D, this.f108840K);
        layoutParams.topMargin = (int) C9432q.m18687b((Context) this.f108876d, 7.0f);
        layoutParams.leftMargin = this.f108844O + C42652k.f107892d;
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(this.f108844O + C42652k.f107892d);
        }
        this.f108889q.setLayoutParams(layoutParams);
        this.f108894v.addView(this.f108889q);
        this.f108890r.bringToFront();
    }

    /* renamed from: B */
    private void m94466B() {
        if (System.currentTimeMillis() - this.f108872at >= 2000) {
            if (this.f108835F == 2) {
                C50275d.m108533a((Context) this.f108876d, getResources().getString(R.string.f87, new Object[]{Float.valueOf(0.5f)})).mo98174a();
                this.f108872at = System.currentTimeMillis();
                return;
            }
            C50275d.m108533a((Context) this.f108876d, getResources().getString(R.string.f87, new Object[]{Float.valueOf(1.0f)})).mo98174a();
            this.f108872at = System.currentTimeMillis();
        }
    }

    /* renamed from: s */
    private void m94478s() {
        View inflate = View.inflate(this.f108876d, R.layout.atk, this);
        this.f108890r = (RTLLinearLayout) inflate.findViewById(R.id.a2r);
        this.f108891s = (ImageView) inflate.findViewById(R.id.a2q);
        this.f108894v = (FrameLayout) inflate.findViewById(R.id.ajo);
        this.f108895w = (MVRecycleView) inflate.findViewById(R.id.ajp);
        this.f108896x = (MVRecycleView) inflate.findViewById(R.id.coq);
        this.f108897y = inflate.findViewById(R.id.zr);
    }

    /* renamed from: t */
    private void m94479t() {
        if (this.f108835F == 1) {
            this.f108838I = new C42660c();
            this.f108893u.mo86963a(this.f108877e.mo87634l(), this.f108877e.mo87635m());
        } else {
            VideoSegment videoSegment = (VideoSegment) this.f108877e.mo87634l().get(0);
            this.f108839J = new C42661d(videoSegment);
            this.f108893u.mo86961a(videoSegment.f107904c, videoSegment.mo86950e(), videoSegment.mo86954h(), this.f108835F);
        }
        this.f108833D = (float) ((this.f108875c - (this.f108844O * 2)) - (C42652k.f107892d * 2));
        this.f108832C = (float) (-C42652k.f107892d);
    }

    /* renamed from: u */
    private void m94480u() {
        if (this.f108863ak) {
            C0794k playBoundary = getPlayBoundary();
            Long l = (Long) playBoundary.f2711a;
            Long l2 = (Long) playBoundary.f2712b;
            if (!(l == null || l2 == null)) {
                String a = C2240a.m6773a(Locale.getDefault(), "%.1fs", new Object[]{Float.valueOf(((float) Math.max(0, l.longValue())) / 1000.0f)});
                String a2 = C2240a.m6773a(Locale.getDefault(), "%.1fs", new Object[]{Float.valueOf(((float) l2.longValue()) / 1000.0f)});
                C43862ga.m96323a(this.f108882j, (CharSequence) a);
                C43862ga.m96323a(this.f108881i, (CharSequence) a2);
            }
            mo87584p();
        }
    }

    /* renamed from: b */
    public final void mo87554b() {
        this.f108833D = (this.f108879g.getStartX() - this.f108880h.getStartX()) - ((float) C42652k.f107892d);
        this.f108832C = (((float) (this.f108834E - C42652k.f107892d)) + this.f108880h.getStartX()) - ((float) this.f108844O);
        if (!(1 == this.f108835F || this.f108839J == null)) {
            C0794k singleVideoPlayBoundary = getSingleVideoPlayBoundary();
            this.f108839J.f107940a = ((Long) singleVideoPlayBoundary.f2711a).longValue();
            this.f108839J.f107941b = ((Long) singleVideoPlayBoundary.f2712b).longValue();
            if (this.f108854ab != 2 && this.f108835F == 0) {
                this.f108877e.mo87611a(this.f108839J, 0);
            }
        }
        m94468D();
        m94480u();
    }

    /* renamed from: c */
    public final void mo87556c() {
        this.f108893u.mo86963a(this.f108877e.mo87634l(), this.f108877e.mo87635m());
        mo87540a((float) this.f108844O, (float) ((this.f108875c - this.f108844O) - C42652k.f107892d), 0);
        this.f108895w.mo4814b(0);
        ArrayList arrayList = new ArrayList();
        for (VideoSegment videoSegment : this.f108877e.mo87634l()) {
            if (!videoSegment.f107911j) {
                arrayList.add(videoSegment);
            }
        }
        this.f108898z.mo87644a((List<VideoSegment>) arrayList);
    }

    /* renamed from: g */
    public final boolean mo87559g() {
        VideoSegment videoSegment = (VideoSegment) this.f108877e.mo87634l().get(this.f108837H);
        boolean z = false;
        if (!(videoSegment == null || this.f108839J == null)) {
            if (Math.abs(videoSegment.mo86952f() - this.f108839J.f107940a) > 100 || Math.abs(videoSegment.mo86953g() - this.f108839J.f107941b) > 100) {
                return true;
            }
            if (videoSegment.mo86954h() != this.f108839J.f107943d) {
                z = true;
            }
            if (videoSegment.f107912k != this.f108839J.f107942c) {
                z = true;
            }
        }
        return z;
    }

    public List<String> getFinalPathes() {
        C42659b bVar = this.f108893u;
        List l = this.f108877e.mo87634l();
        float f = (this.f108832C + ((float) C42652k.f107892d)) * this.f108893u.f107931e;
        float f2 = (this.f108832C + ((float) C42652k.f107892d) + this.f108833D) * this.f108893u.f107931e;
        float m = this.f108877e.mo87635m();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < l.size(); i++) {
            if (!((VideoSegment) l.get(i)).f107911j) {
                arrayList2.add(l.get(i));
            }
        }
        int b = C42659b.m93613b(arrayList2, f2, m);
        for (int b2 = C42659b.m93613b(arrayList2, f, m); b2 <= b; b2++) {
            arrayList.add(((VideoSegment) arrayList2.get(b2)).mo86950e());
        }
        return arrayList;
    }

    public C0794k<Long, Long> getMultiVideoPlayBoundary() {
        return C0794k.m2265a(Long.valueOf(C42659b.m93612a(this.f108877e.mo87634l(), (this.f108832C + ((float) C42652k.f107892d)) * this.f108893u.f107931e, this.f108877e.mo87635m())), Long.valueOf(C42659b.m93612a(this.f108877e.mo87634l(), (this.f108832C + ((float) C42652k.f107892d) + this.f108833D) * this.f108893u.f107931e, this.f108877e.mo87635m())));
    }

    /* renamed from: h */
    public void mo87529h() {
        this.f108878f.f107668b.observe(this.f108876d, new C43122f(this));
        if (this.f108871as) {
            this.f108878f.f107670d.observe(this.f108876d, new C43123g(this));
            this.f108878f.f107671e.observe(this.f108876d, new C43124h(this));
            this.f108878f.f107672f.observe(this.f108876d, new C43125i(this));
            this.f108878f.f107673g.observe(this.f108876d, new C43126j(this));
            this.f108878f.f107674h.observe(this.f108876d, new C43127k(this));
            this.f108878f.f107675i.observe(this.f108876d, new C43128l(this));
        }
    }

    /* renamed from: j */
    public void mo87531j() {
        if (this.f108888p != null) {
            int startX = (int) ((((float) this.f108875c) - this.f108879g.getStartX()) - ((float) C42652k.f107892d));
            int max = Math.max(Math.min((int) ((((((float) this.f108893u.mo86960a(this.f108835F)) / this.f108893u.f107931e) - this.f108832C) - ((float) (C42652k.f107892d * 2))) - this.f108833D), startX), 0);
            LayoutParams layoutParams = new LayoutParams(max, this.f108840K);
            int i = startX - max;
            layoutParams.rightMargin = i;
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginEnd(i);
            }
            layoutParams.topMargin = this.f108843N;
            layoutParams.gravity = 8388613;
            this.f108888p.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo87534m() {
        this.f108877e.mo87611a(this.f108839J, this.f108836G);
        this.f108877e.mo87607a(this.f108836G, getOverXScroll());
        this.f108893u.mo86962a(((VideoSegment) this.f108877e.mo87634l().get(this.f108836G)).mo86950e(), this.f108839J.f107943d);
        this.f108878f.mo86801a(((VideoSegment) this.f108877e.mo87634l().get(this.f108836G)).mo86950e());
    }

    /* renamed from: o */
    public final void mo87582o() {
        if (this.f108893u != null && this.f108877e != null && !C50201e.m108355a(this.f108877e.mo87634l())) {
            if (this.f108835F == 1) {
                this.f108893u.mo86963a(this.f108877e.mo87634l(), this.f108877e.mo87635m());
                return;
            }
            VideoSegment videoSegment = (VideoSegment) this.f108877e.mo87634l().get(0);
            this.f108893u.mo86961a(videoSegment.f107904c, videoSegment.mo86950e(), videoSegment.mo86954h(), this.f108835F);
        }
    }

    /* renamed from: p */
    public final void mo87584p() {
        boolean z;
        if (this.f108863ak) {
            this.f108882j.setX(m94469a((View) this.f108880h, (View) this.f108882j));
            this.f108881i.setX(m94469a((View) this.f108879g, (View) this.f108881i));
            float f = 0.0f;
            if (Math.abs(this.f108882j.getX() - this.f108881i.getX()) - (((float) (this.f108882j.getWidth() + this.f108881i.getWidth())) / 2.0f) > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f = 1.0f;
            }
            if (this.f108882j.getAlpha() != f) {
                this.f108882j.animate().alpha(f).setDuration(150).start();
                this.f108881i.animate().alpha(f).setDuration(150).start();
            }
        }
    }

    /* renamed from: q */
    public final void mo87585q() {
        this.f108880h.setStartX((float) this.f108844O);
        this.f108879g.setStartX((float) ((this.f108875c - this.f108844O) - C42652k.f107892d));
        m94472a((int) this.f108880h.getStartX(), (int) this.f108879g.getStartX());
        getCurrentFrameRecyclerView().scrollBy(-this.f108834E, 0);
        this.f108834E = 0;
        mo87554b();
        mo87530i();
        m94481v();
        mo87531j();
        this.f108877e.mo87628f();
        this.f108877e.mo87629g();
        this.f108877e.mo87624d();
        this.f108877e.mo87621c();
    }

    /* renamed from: D */
    private void m94468D() {
        String str;
        String a = C2240a.m6773a(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf((this.f108833D * this.f108893u.f107931e) / 1000.0f)});
        String str2 = "";
        if (!(this.f108890r == null || this.f108880h == null || this.f108878f.f107668b.getValue() == null)) {
            str2 = C2240a.m6773a(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(((float) ((Long) this.f108878f.f107668b.getValue()).longValue()) / 1000.0f)});
        }
        if (this.f108878f.f107667a.getValue() == null) {
            str = "";
        } else {
            str = ((C0794k) this.f108878f.f107667a.getValue()).toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getResources().getString(R.string.c8j, new Object[]{a}));
        sb.append(";curPointer:");
        sb.append(str2);
        sb.append("s;Totalspeed:");
        sb.append(this.f108877e.mo87635m());
        sb.append(";mOneWidthDur:");
        sb.append(this.f108893u.f107931e);
        sb.append("\npair:");
        sb.append(str);
        sb.append(";curOriginIndex:");
        sb.append(this.f108836G);
        sb.append(";curEditIndex:");
        sb.append(this.f108837H);
        sb.append("\n");
    }

    /* renamed from: z */
    private void m94485z() {
        this.f108887o = new View(this.f108876d);
        this.f108888p = new View(this.f108876d);
        this.f108887o.setBackgroundColor(this.f108856ad);
        this.f108888p.setBackgroundColor(this.f108856ad);
        int max = Math.max(this.f108834E - C42652k.f107892d, 0);
        LayoutParams layoutParams = new LayoutParams(max, this.f108840K);
        layoutParams.topMargin = (int) C9432q.m18687b((Context) this.f108876d, 7.0f);
        layoutParams.gravity = 8388611;
        layoutParams.leftMargin = this.f108844O - max;
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(this.f108844O - max);
        }
        this.f108887o.setLayoutParams(layoutParams);
        int max2 = Math.max((int) ((((((float) this.f108893u.mo86960a(this.f108835F)) / this.f108893u.f107931e) - ((float) this.f108834E)) - this.f108833D) - ((float) C42652k.f107892d)), 0);
        int i = this.f108844O;
        int min = Math.min(max2, i);
        LayoutParams layoutParams2 = new LayoutParams(min, this.f108840K);
        layoutParams2.topMargin = (int) C9432q.m18687b((Context) this.f108876d, 7.0f);
        int i2 = i - min;
        layoutParams2.rightMargin = i2;
        if (VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginEnd(i2);
        }
        layoutParams2.gravity = 8388613;
        this.f108888p.setLayoutParams(layoutParams2);
        this.f108894v.addView(this.f108887o);
        this.f108894v.addView(this.f108888p);
    }

    /* renamed from: x */
    private void m94483x() {
        int i;
        View view = this.f108897y;
        if (this.f108870ar) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        int i2 = this.f108844O + C42652k.f107892d;
        this.f108897y.setBackground(C42430at.m93196a(C46788b.f118235d.mo94011b(false), 0, (int) C9432q.m18687b(getContext(), 1.0f), 0));
        LayoutParams layoutParams = (LayoutParams) this.f108897y.getLayoutParams();
        layoutParams.topMargin = this.f108843N;
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(i2);
            layoutParams.setMarginEnd(i2);
        }
        this.f108897y.setLayoutParams(layoutParams);
        LayoutParams layoutParams2 = (LayoutParams) this.f108896x.getLayoutParams();
        layoutParams2.topMargin = this.f108843N;
        this.f108896x.setLayoutParams(layoutParams2);
        this.f108896x.setPadding(this.f108844O + C42652k.f107892d, 0, this.f108844O + C42652k.f107892d, 0);
        LayoutParams layoutParams3 = (LayoutParams) this.f108895w.getLayoutParams();
        layoutParams3.topMargin = this.f108843N;
        this.f108895w.setLayoutParams(layoutParams3);
        this.f108895w.setPadding(this.f108844O + C42652k.f107892d, 0, this.f108844O + C42652k.f107892d, 0);
        if (this.f108831B != null) {
            C43113a aVar = new C43113a(this.f108876d, new int[]{this.f108867ao, this.f108840K}, this.f108877e.mo87634l(), this.f108893u.f107928b, 2, this.f108831B);
            this.f108830A = aVar;
            this.f108830A.mo87645a(this.f108852W.f108973b);
        } else {
            C43113a aVar2 = new C43113a(this.f108876d, new int[]{this.f108867ao, this.f108840K}, this.f108877e.mo87634l(), this.f108893u.f107928b, 2);
            this.f108830A = aVar2;
        }
        this.f108830A.mo87647b(this.f108864al);
        this.f108896x.setAdapter(this.f108830A);
        this.f108896x.setLayoutManager(new MVLinearLayoutManager(this.f108876d, 0, false));
        this.f108896x.mo4801a(this.f108873au);
        this.f108896x.setflingScale(0.12d);
        if (this.f108831B != null) {
            C43113a aVar3 = new C43113a(this.f108876d, new int[]{this.f108867ao, this.f108840K}, this.f108877e.mo87634l(), this.f108893u.f107928b, 1, this.f108831B);
            this.f108898z = aVar3;
            this.f108898z.mo87645a(this.f108852W.f108973b);
        } else {
            C43113a aVar4 = new C43113a(this.f108876d, new int[]{this.f108867ao, this.f108840K}, this.f108877e.mo87634l(), this.f108893u.f107928b, 1);
            this.f108898z = aVar4;
        }
        this.f108898z.mo87647b(this.f108864al);
        this.f108895w.setAdapter(this.f108898z);
        this.f108895w.setLayoutManager(new ScrollInterceptedLayoutManager(this.f108876d, 0, false));
        this.f108895w.setflingScale(0.12d);
        this.f108895w.mo4801a(this.f108873au);
        if (this.f108835F == 0) {
            this.f108896x.setVisibility(0);
            this.f108895w.setVisibility(8);
            if (this.f108878f.f107677k) {
                this.f108830A.f108942m = true;
                this.f108830A.f108943n = this.f108860ah;
            }
            this.f108830A.f108938i = this.f108862aj;
            this.f108830A.f108937h = this.f108861ai;
        } else {
            this.f108896x.setVisibility(8);
            this.f108895w.setVisibility(0);
        }
        if (this.f108859ag) {
            mo87538a();
        }
        this.f108891s.setImageDrawable(C42430at.m93196a(0, -1, 1, this.f108865am / 2));
    }

    /* renamed from: w */
    private void m94482w() {
        this.f108880h = new C43135a(this.f108876d);
        this.f108880h.setScaleType(ScaleType.FIT_XY);
        this.f108883k = new LayoutParams(C42652k.f107892d, this.f108841L);
        this.f108883k.topMargin = this.f108868ap;
        this.f108883k.leftMargin = this.f108844O;
        if (VERSION.SDK_INT >= 17) {
            this.f108883k.setMarginStart(this.f108844O);
        }
        this.f108880h.setLayoutParams(this.f108883k);
        if (C46811b.m101654a(this.f108876d)) {
            this.f108880h.setLeft(this.f108875c - this.f108844O);
        } else {
            this.f108880h.setLeft(this.f108883k.leftMargin);
        }
        this.f108880h.setOnTouchListener(this);
        this.f108880h.setTag("startSlide");
        this.f108894v.addView(this.f108880h);
        this.f108882j = m94470a((Context) this.f108876d);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.topMargin = (int) (((float) (this.f108883k.topMargin + this.f108883k.height)) + C9432q.m18687b((Context) this.f108876d, 4.0f));
        layoutParams.leftMargin = this.f108844O;
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(this.f108844O);
        }
        this.f108882j.setLayoutParams(layoutParams);
        this.f108882j.setTag("startSlideTime");
        this.f108894v.addView(this.f108882j);
        this.f108882j.addTextChangedListener(new C43121e() {
            public final void afterTextChanged(Editable editable) {
                super.afterTextChanged(editable);
                VideoEditView.this.f108882j.post(new C43131o(this));
            }
        });
        this.f108879g = new C43135a(this.f108876d);
        this.f108879g.setScaleType(ScaleType.FIT_XY);
        this.f108884l = new LayoutParams(C42652k.f107892d + C42652k.f107896h, this.f108841L);
        this.f108884l.topMargin = this.f108868ap;
        this.f108884l.leftMargin = (this.f108875c - this.f108844O) - C42652k.f107892d;
        if (VERSION.SDK_INT >= 17) {
            this.f108884l.setMarginStart((this.f108875c - this.f108844O) - C42652k.f107892d);
        }
        this.f108879g.setLayoutParams(this.f108884l);
        if (C46811b.m101654a(this.f108876d)) {
            this.f108879g.setLeft(this.f108844O);
        } else {
            this.f108879g.setLeft(this.f108884l.leftMargin);
        }
        this.f108879g.setOnTouchListener(this);
        this.f108879g.setPadding(0, 0, C42652k.f107896h, 0);
        if (VERSION.SDK_INT >= 17) {
            this.f108879g.setPaddingRelative(0, 0, C42652k.f107896h, 0);
        }
        this.f108879g.setTag("endSlide");
        this.f108894v.addView(this.f108879g);
        this.f108881i = m94470a((Context) this.f108876d);
        LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        layoutParams2.topMargin = (int) (((float) (this.f108884l.topMargin + this.f108884l.height)) + C9432q.m18687b((Context) this.f108876d, 4.0f));
        layoutParams2.leftMargin = (this.f108875c - this.f108844O) - C42652k.f107892d;
        if (VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart(this.f108844O);
        }
        this.f108881i.setLayoutParams(layoutParams2);
        this.f108881i.setTag("endSlideTime");
        this.f108894v.addView(this.f108881i);
        this.f108881i.addTextChangedListener(new C43121e() {
            public final void afterTextChanged(Editable editable) {
                super.afterTextChanged(editable);
                VideoEditView.this.f108881i.post(new C43132p(this));
            }
        });
        mo87535n();
        this.f108885m = new View(this.f108876d);
        this.f108886n = new View(this.f108876d);
        this.f108885m.setBackgroundColor(this.f108876d.getResources().getColor(R.color.a3_));
        this.f108886n.setBackgroundColor(this.f108876d.getResources().getColor(R.color.a3_));
        this.f108894v.addView(this.f108885m);
        this.f108894v.addView(this.f108886n);
        m94472a(this.f108844O, (this.f108875c - this.f108844O) - C42652k.f107892d);
        LayoutParams layoutParams3 = (LayoutParams) this.f108890r.getLayoutParams();
        layoutParams3.leftMargin = this.f108844O + C42652k.f107892d;
        layoutParams3.height = this.f108866an;
        if (VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart(this.f108844O + C42652k.f107892d);
        }
        this.f108890r.setLayoutParams(layoutParams3);
        this.f108890r.setTag("curPoint");
        this.f108890r.setOnTouchListener(this);
        if (this.f108890r != null) {
            this.f108894v.removeView(this.f108890r);
            this.f108894v.addView(this.f108890r);
        }
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f108891s.getLayoutParams();
        layoutParams4.width = this.f108865am;
        this.f108891s.setLayoutParams(layoutParams4);
        m94476e(this.f108863ak);
        m94484y();
    }

    /* renamed from: a */
    public final void mo87538a() {
        if (this.f108877e != null) {
            if (this.f108835F == 0) {
                if (this.f108830A != null) {
                    this.f108830A.mo87644a(this.f108877e.mo87634l());
                }
            } else if (this.f108898z != null) {
                this.f108898z.mo87644a(this.f108877e.mo87634l());
            }
        }
    }

    public void setCanEdit(boolean z) {
        this.f108871as = z;
    }

    public void setExtractFramesInRoughMode(boolean z) {
        this.f108864al = z;
    }

    public void setFirstFrameBitmapLiveData(C0198r<Bitmap> rVar) {
        this.f108861ai = rVar;
    }

    public void setFirstFrameVisibleLiveData(C0198r<Boolean> rVar) {
        this.f108862aj = rVar;
    }

    public void setLoadThumbnailDirectly(boolean z) {
        this.f108859ag = z;
    }

    public void setMaxVideoLength(long j) {
        this.f108846Q = j;
    }

    public void setMinVideoLength(long j) {
        this.f108845P = j;
    }

    public void setPointerType(int i) {
        this.f108854ab = i;
    }

    public void setVeEditor(C20347c cVar) {
        this.f108860ah = cVar;
    }

    public void setViewConfig(C43134r rVar) {
        this.f108852W = rVar;
    }

    public VideoEditView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public final void mo87555b(boolean z) {
        if (this.f108830A != null) {
            this.f108830A.mo87648c(z);
        }
    }

    public void setEnableBoundaryText(boolean z) {
        if (z != this.f108863ak) {
            m94476e(z);
        }
        this.f108863ak = z;
    }

    /* renamed from: e */
    private void m94476e(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.f108882j.setVisibility(i);
        this.f108881i.setVisibility(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo87558d(boolean z) {
        if (z) {
            setCurPointerContainerStartX(this.f108880h.getStartX() + ((float) C42652k.f107892d));
        }
        mo87530i();
        m94481v();
        mo87531j();
    }

    public void setEnabled(boolean z) {
        this.f108857ae = z;
        if (this.f108895w.getLayoutManager() instanceof ScrollInterceptedLayoutManager) {
            ((ScrollInterceptedLayoutManager) this.f108895w.getLayoutManager()).f107901a = z;
        }
    }

    /* renamed from: a */
    private TextView m94470a(Context context) {
        AVDmtTextView aVDmtTextView = new AVDmtTextView(context);
        aVDmtTextView.setTextColor(C46788b.f118235d.mo94011b(false));
        aVDmtTextView.setTextSize(11.0f);
        aVDmtTextView.setClickable(true);
        aVDmtTextView.mo93998b();
        aVDmtTextView.setOnTouchListener(this);
        return aVDmtTextView;
    }

    private void setCurPointerContainerStartX(float f) {
        float f2;
        RTLLinearLayout rTLLinearLayout = this.f108890r;
        if (f <= ((float) (this.f108844O + C42652k.f107892d))) {
            f2 = (float) ((this.f108844O + C42652k.f107892d) - C42652k.f107895g);
        } else if (f >= ((float) (((this.f108875c - this.f108844O) - C42652k.f107892d) - C42652k.f107893e))) {
            f2 = (float) ((((this.f108875c - this.f108844O) - C42652k.f107892d) - C42652k.f107893e) + C42652k.f107895g);
        } else {
            f2 = f + (((float) C42652k.f107895g) * (((2.0f * f) / ((float) ((this.f108875c - this.f108844O) - C42652k.f107892d))) - 4.0f));
        }
        rTLLinearLayout.setStartX(f2);
    }

    /* renamed from: b */
    private void m94474b(float f) {
        Iterator it = this.f108852W.f108972a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C43117b bVar = (C43117b) it.next();
            C43115a a = bVar.mo59041a(f, C42652k.f107892d, this.f108844O, this.f108880h.getStartX(), this.f108893u.f107931e);
            if (!a.mo87651a()) {
                if (!a.mo87652b()) {
                    if (a.mo87653c()) {
                        f = ((Float) a.f108950a).floatValue();
                    } else {
                        StringBuilder sb = new StringBuilder("illegal intercept result, result = ");
                        sb.append(a.toString());
                        sb.append(", interceptor = ");
                        sb.append(bVar.mo59043a());
                        throw new IllegalStateException(sb.toString());
                    }
                }
            } else {
                return;
            }
        }
        if (f > ((float) ((this.f108875c - this.f108844O) - C42652k.f107892d))) {
            f = (float) ((this.f108875c - this.f108844O) - C42652k.f107892d);
            if (this.f108880h.getStartX() == ((float) this.f108844O)) {
                m94467C();
            }
        }
        if ((f - this.f108880h.getStartX()) - ((float) C42652k.f107892d) < this.f108893u.f107933g) {
            m94466B();
            m94467C();
            f = this.f108880h.getStartX() + this.f108893u.f107933g + ((float) C42652k.f107892d);
        }
        this.f108879g.setStartX(f);
        setCurPointerContainerStartX(this.f108879g.getStartX() - ((float) this.f108891s.getWidth()));
        m94472a((int) this.f108880h.getStartX(), (int) this.f108879g.getStartX());
        mo87554b();
        this.f108877e.mo87615b();
        mo87531j();
        m94481v();
    }

    /* renamed from: c */
    public final void mo87557c(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 4;
        if (this.f108880h != null) {
            C43135a aVar = this.f108880h;
            if (z) {
                i8 = 0;
            } else {
                i8 = 4;
            }
            aVar.setVisibility(i8);
        }
        if (this.f108882j != null && this.f108863ak) {
            TextView textView = this.f108882j;
            if (z) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            textView.setVisibility(i7);
        }
        if (this.f108879g != null) {
            C43135a aVar2 = this.f108879g;
            if (z) {
                i6 = 0;
            } else {
                i6 = 4;
            }
            aVar2.setVisibility(i6);
        }
        if (this.f108881i != null && this.f108863ak) {
            TextView textView2 = this.f108881i;
            if (z) {
                i5 = 0;
            } else {
                i5 = 4;
            }
            textView2.setVisibility(i5);
        }
        if (this.f108885m != null) {
            View view = this.f108885m;
            if (z) {
                i4 = 0;
            } else {
                i4 = 4;
            }
            view.setVisibility(i4);
        }
        if (this.f108886n != null) {
            View view2 = this.f108886n;
            if (z) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            view2.setVisibility(i3);
        }
        if (this.f108887o != null) {
            View view3 = this.f108887o;
            if (z) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            view3.setVisibility(i2);
        }
        if (this.f108888p != null) {
            View view4 = this.f108888p;
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            view4.setVisibility(i);
        }
        if (this.f108889q != null) {
            View view5 = this.f108889q;
            if (z) {
                i9 = 0;
            }
            view5.setVisibility(i9);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo87539a(float f) {
        if (this.f108835F == 1) {
            this.f108877e.mo87622c(f);
        } else {
            this.f108839J.f107943d = f;
            if (this.f108835F == 0) {
                this.f108877e.mo87611a(this.f108839J, 0);
            }
        }
        if (this.f108835F == 1) {
            this.f108893u.mo86963a(this.f108877e.mo87634l(), this.f108877e.mo87635m());
            this.f108898z.mo87640a((C0184k) this.f108876d, this.f108893u.f107928b, this.f108835F, true);
            this.f108895w.mo4814b(0);
        } else {
            this.f108893u.mo86961a(((VideoSegment) this.f108877e.mo87634l().get(this.f108836G)).f107904c, ((VideoSegment) this.f108877e.mo87634l().get(this.f108836G)).mo86950e(), this.f108839J.f107943d, this.f108835F);
            this.f108830A.mo87641a((C0184k) this.f108876d, this.f108893u.f107928b, (VideoSegment) this.f108877e.mo87634l().get(this.f108836G), true);
            this.f108896x.mo4814b(0);
        }
        mo87540a((float) this.f108844O, (float) ((this.f108875c - this.f108844O) - C42652k.f107892d), 0);
        m94468D();
        if (this.f108835F == 0) {
            this.f108893u.mo86962a(((VideoSegment) this.f108877e.mo87634l().get(this.f108836G)).mo86950e(), this.f108839J.f107943d);
        }
        this.f108877e.mo87616b(f);
    }

    public VideoEditView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static float m94469a(View view, View view2) {
        return (view.getX() + (((float) (view.getMeasuredWidth() - view.getPaddingRight())) / 2.0f)) - (((float) view2.getMeasuredWidth()) / 2.0f);
    }

    /* renamed from: a */
    private void m94472a(int i, int i2) {
        if (this.f108885m != null && this.f108886n != null) {
            int i3 = C42652k.f107892d + i;
            int b = ((i2 - i) - C42652k.f107892d) + ((int) C9432q.m18687b((Context) this.f108876d, 1.0f));
            LayoutParams layoutParams = new LayoutParams(b, this.f108869aq);
            layoutParams.leftMargin = i3;
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(i3);
            }
            layoutParams.topMargin = this.f108868ap;
            this.f108885m.setLayoutParams(layoutParams);
            LayoutParams layoutParams2 = new LayoutParams(b, this.f108869aq);
            layoutParams2.leftMargin = i3;
            if (VERSION.SDK_INT >= 17) {
                layoutParams2.setMarginStart(i3);
            }
            layoutParams2.topMargin = (this.f108868ap + this.f108841L) - this.f108869aq;
            this.f108886n.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: a */
    private void m94473a(CutMultiVideoViewModel cutMultiVideoViewModel, List<MediaModel> list) {
        if (cutMultiVideoViewModel.f107677k) {
            for (MediaModel mediaModel : list) {
                mediaModel.f95386e = (long) cutMultiVideoViewModel.f107678l;
                mediaModel.f95390i = 720;
                mediaModel.f95391j = 1280;
            }
        }
        this.f108877e.mo87612a(list);
    }

    /* renamed from: b */
    private void m94475b(float f, boolean z) {
        float f2;
        boolean z2;
        float f3;
        Iterator it = this.f108852W.f108972a.iterator();
        while (true) {
            f2 = 0.0f;
            if (!it.hasNext()) {
                z2 = false;
                f3 = 0.0f;
                break;
            }
            C43117b bVar = (C43117b) it.next();
            C43115a a = bVar.mo59042a(f, z, this.f108880h.getStartX(), this.f108879g.getStartX());
            if (!a.mo87651a()) {
                if (!a.mo87652b()) {
                    if (a.mo87653c()) {
                        z2 = true;
                        f3 = ((Float) ((C52847n) a.f108950a).getFirst()).floatValue();
                        f2 = ((Float) ((C52847n) a.f108950a).getSecond()).floatValue();
                    } else {
                        StringBuilder sb = new StringBuilder("illegal intercept result, result = ");
                        sb.append(a.toString());
                        sb.append(", interceptor = ");
                        sb.append(bVar.mo59043a());
                        throw new IllegalStateException(sb.toString());
                    }
                }
            } else {
                return;
            }
        }
        if (!z2) {
            if (z) {
                f3 = f + this.f108880h.getStartX();
                f2 = this.f108879g.getStartX() + f;
            } else {
                f2 = f + this.f108879g.getStartX();
                f3 = f + this.f108880h.getStartX();
            }
        }
        if (z) {
            if (f3 < ((float) this.f108844O)) {
                m94467C();
                return;
            }
        } else if (f2 > ((float) ((this.f108875c - this.f108844O) - C42652k.f107892d))) {
            m94467C();
            return;
        }
        this.f108880h.setStartX(f3);
        this.f108879g.setStartX(f2);
        setCurPointerContainerStartX(f3 + ((float) C42652k.f107892d));
        m94472a((int) this.f108880h.getStartX(), (int) this.f108879g.getStartX());
        mo87554b();
        this.f108877e.f108914i.setValue(null);
        mo87531j();
        mo87530i();
        m94481v();
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r2v37 */
    /* JADX WARNING: type inference failed for: r2v38, types: [boolean] */
    /* JADX WARNING: type inference failed for: r2v39 */
    /* JADX WARNING: type inference failed for: r2v40 */
    /* JADX WARNING: type inference failed for: r2v41 */
    /* JADX WARNING: type inference failed for: r2v42 */
    /* JADX WARNING: type inference failed for: r2v43 */
    /* JADX WARNING: type inference failed for: r2v44 */
    /* JADX WARNING: type inference failed for: r2v45 */
    /* JADX WARNING: type inference failed for: r2v46 */
    /* JADX WARNING: type inference failed for: r2v47 */
    /* JADX WARNING: type inference failed for: r2v48 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (r1.equals("endSlide") != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b0, code lost:
        if (r1.equals("endSlide") != false) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x023a, code lost:
        if (r1.equals("curPoint") != false) goto L_0x0266;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[int, boolean, short, byte, char], ?[boolean, int, float, short, byte, char], ?[int, float, short, byte, char]]
      uses: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[int, boolean, short, byte, char], boolean]
      mth insns count: 268
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r19, android.view.MotionEvent r20) {
        /*
            r18 = this;
            r0 = r18
            boolean r1 = r0.f108857ae
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            java.lang.Object r1 = r19.getTag()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0011
            return r2
        L_0x0011:
            boolean r3 = r0.mo87518a(r1)
            if (r3 != 0) goto L_0x0018
            return r2
        L_0x0018:
            int r3 = r20.getAction()
            r4 = 3
            r5 = 5
            r6 = 2
            r7 = 4
            r8 = -1
            r9 = 1
            switch(r3) {
                case 0: goto L_0x0216;
                case 1: goto L_0x019e;
                case 2: goto L_0x0030;
                case 3: goto L_0x0027;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x029e
        L_0x0027:
            android.widget.ImageView r1 = r0.f108891s
            r2 = 1065353216(0x3f800000, float:1.0)
            com.p683ss.android.ugc.aweme.shortvideo.util.C45430bl.m99001a(r1, r2)
            goto L_0x029e
        L_0x0030:
            r0.f108892t = r9
            float r3 = r20.getRawX()
            float r10 = r0.f108847R
            float r10 = r3 - r10
            float r11 = r0.f108848S
            float r11 = r11 + r10
            android.support.v4.app.FragmentActivity r10 = r0.f108876d
            boolean r10 = com.p683ss.android.ugc.aweme.tools.C46811b.m101654a(r10)
            if (r10 == 0) goto L_0x004a
            int r10 = r0.f108875c
            float r10 = (float) r10
            float r11 = r10 - r11
        L_0x004a:
            int r10 = r1.hashCode()
            switch(r10) {
                case -1584466321: goto L_0x0083;
                case -1207688829: goto L_0x0079;
                case -1150816804: goto L_0x006f;
                case 93832333: goto L_0x0065;
                case 544295728: goto L_0x005b;
                case 1714230678: goto L_0x0052;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x008d
        L_0x0052:
            java.lang.String r5 = "endSlide"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x008d
            goto L_0x008e
        L_0x005b:
            java.lang.String r4 = "curPoint"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x008d
            r4 = 0
            goto L_0x008e
        L_0x0065:
            java.lang.String r4 = "block"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x008d
            r4 = 5
            goto L_0x008e
        L_0x006f:
            java.lang.String r4 = "startSlideTime"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x008d
            r4 = 2
            goto L_0x008e
        L_0x0079:
            java.lang.String r4 = "endSlideTime"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x008d
            r4 = 4
            goto L_0x008e
        L_0x0083:
            java.lang.String r4 = "startSlide"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x008d
            r4 = 1
            goto L_0x008e
        L_0x008d:
            r4 = -1
        L_0x008e:
            switch(r4) {
                case 0: goto L_0x0190;
                case 1: goto L_0x00b2;
                case 2: goto L_0x00b2;
                case 3: goto L_0x00ad;
                case 4: goto L_0x00ad;
                case 5: goto L_0x0093;
                default: goto L_0x0091;
            }
        L_0x0091:
            goto L_0x019a
        L_0x0093:
            float r1 = r0.f108849T
            float r1 = r3 - r1
            r4 = 0
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x009d
            r2 = 1
        L_0x009d:
            android.support.v4.app.FragmentActivity r4 = r0.f108876d
            boolean r4 = com.p683ss.android.ugc.aweme.tools.C46811b.m101654a(r4)
            if (r4 == 0) goto L_0x00a8
            r2 = r2 ^ 1
            float r1 = -r1
        L_0x00a8:
            r0.m94475b(r1, r2)
            goto L_0x019a
        L_0x00ad:
            r0.m94474b(r11)
            goto L_0x019a
        L_0x00b2:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.r r1 = r0.f108852W
            java.util.List<com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.b> r1 = r1.f108972a
            java.util.Iterator r1 = r1.iterator()
        L_0x00ba:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x011b
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.b r2 = (com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.p2184a.C43117b) r2
            int r14 = com.p683ss.android.ugc.aweme.shortvideo.cut.C42652k.f107892d
            int r15 = r0.f108844O
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r4 = r0.f108879g
            float r16 = r4.getStartX()
            com.ss.android.ugc.aweme.shortvideo.cut.model.b r4 = r0.f108893u
            float r4 = r4.f107931e
            r12 = r2
            r13 = r11
            r17 = r4
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.a r4 = r12.mo59044b(r13, r14, r15, r16, r17)
            boolean r5 = r4.mo87651a()
            if (r5 != 0) goto L_0x019a
            boolean r5 = r4.mo87652b()
            if (r5 != 0) goto L_0x00ba
            boolean r1 = r4.mo87653c()
            if (r1 == 0) goto L_0x00f7
            T r1 = r4.f108950a
            java.lang.Float r1 = (java.lang.Float) r1
            float r11 = r1.floatValue()
            goto L_0x011b
        L_0x00f7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "illegal intercept result, result = "
            r3.<init>(r5)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.String r4 = ", interceptor = "
            r3.append(r4)
            java.lang.String r2 = r2.mo59043a()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x011b:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r1 = r0.f108879g
            float r1 = r1.getStartX()
            float r1 = r1 - r11
            int r2 = com.p683ss.android.ugc.aweme.shortvideo.cut.C42652k.f107892d
            float r2 = (float) r2
            float r1 = r1 - r2
            com.ss.android.ugc.aweme.shortvideo.cut.model.b r2 = r0.f108893u
            float r2 = r2.f107933g
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0144
            r18.m94466B()
            r18.m94467C()
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r1 = r0.f108879g
            float r1 = r1.getStartX()
            int r2 = com.p683ss.android.ugc.aweme.shortvideo.cut.C42652k.f107892d
            float r2 = (float) r2
            float r1 = r1 - r2
            com.ss.android.ugc.aweme.shortvideo.cut.model.b r2 = r0.f108893u
            float r2 = r2.f107933g
            float r11 = r1 - r2
        L_0x0144:
            int r1 = r0.f108844O
            float r1 = (float) r1
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0164
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r1 = r0.f108879g
            float r1 = r1.getStartX()
            int r2 = r0.f108875c
            int r4 = r0.f108844O
            int r2 = r2 - r4
            int r4 = com.p683ss.android.ugc.aweme.shortvideo.cut.C42652k.f107892d
            int r2 = r2 - r4
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0161
            r18.m94467C()
        L_0x0161:
            int r1 = r0.f108844O
            float r11 = (float) r1
        L_0x0164:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r1 = r0.f108880h
            r1.setStartX(r11)
            int r1 = com.p683ss.android.ugc.aweme.shortvideo.cut.C42652k.f107892d
            float r1 = (float) r1
            float r11 = r11 + r1
            r0.setCurPointerContainerStartX(r11)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r1 = r0.f108880h
            float r1 = r1.getStartX()
            int r1 = (int) r1
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r2 = r0.f108879g
            float r2 = r2.getStartX()
            int r2 = (int) r2
            r0.m94472a(r1, r2)
            r18.mo87554b()
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r1 = r0.f108877e
            r1.mo87604a()
            r18.mo87530i()
            r18.m94481v()
            goto L_0x019a
        L_0x0190:
            r0.f108850U = r9
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r1 = r0.f108877e
            r1.mo87613a(r9)
            r0.mo87541a(r11, r9)
        L_0x019a:
            r0.f108849T = r3
            goto L_0x029e
        L_0x019e:
            r0.f108892t = r2
            r0.f108851V = r2
            int r3 = r1.hashCode()
            switch(r3) {
                case -1584466321: goto L_0x01db;
                case -1207688829: goto L_0x01d1;
                case -1150816804: goto L_0x01c7;
                case 93832333: goto L_0x01bd;
                case 544295728: goto L_0x01b3;
                case 1714230678: goto L_0x01aa;
                default: goto L_0x01a9;
            }
        L_0x01a9:
            goto L_0x01e5
        L_0x01aa:
            java.lang.String r3 = "endSlide"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01e5
            goto L_0x01e6
        L_0x01b3:
            java.lang.String r3 = "curPoint"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01e5
            r4 = 0
            goto L_0x01e6
        L_0x01bd:
            java.lang.String r3 = "block"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01e5
            r4 = 5
            goto L_0x01e6
        L_0x01c7:
            java.lang.String r3 = "startSlideTime"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01e5
            r4 = 2
            goto L_0x01e6
        L_0x01d1:
            java.lang.String r3 = "endSlideTime"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01e5
            r4 = 4
            goto L_0x01e6
        L_0x01db:
            java.lang.String r3 = "startSlide"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01e5
            r4 = 1
            goto L_0x01e6
        L_0x01e5:
            r4 = -1
        L_0x01e6:
            switch(r4) {
                case 0: goto L_0x020d;
                case 1: goto L_0x0201;
                case 2: goto L_0x0201;
                case 3: goto L_0x01f5;
                case 4: goto L_0x01f5;
                case 5: goto L_0x01eb;
                default: goto L_0x01e9;
            }
        L_0x01e9:
            goto L_0x029e
        L_0x01eb:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r1 = r0.f108877e
            android.arch.lifecycle.r<java.lang.Void> r1 = r1.f108915j
            r2 = 0
            r1.setValue(r2)
            goto L_0x029e
        L_0x01f5:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r1 = r0.f108877e
            r1.mo87624d()
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r1 = r0.f108877e
            r1.mo87627e()
            goto L_0x029e
        L_0x0201:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r1 = r0.f108877e
            r1.mo87621c()
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r1 = r0.f108877e
            r1.mo87627e()
            goto L_0x029e
        L_0x020d:
            r0.f108850U = r2
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r1 = r0.f108877e
            r1.mo87613a(r2)
            goto L_0x029e
        L_0x0216:
            r0.f108892t = r9
            float r3 = r20.getRawX()
            r0.f108847R = r3
            float r3 = r0.f108847R
            r0.f108849T = r3
            int r3 = r1.hashCode()
            switch(r3) {
                case -1584466321: goto L_0x025b;
                case -1207688829: goto L_0x0251;
                case -1150816804: goto L_0x0247;
                case 93832333: goto L_0x023d;
                case 544295728: goto L_0x0234;
                case 1714230678: goto L_0x022a;
                default: goto L_0x0229;
            }
        L_0x0229:
            goto L_0x0265
        L_0x022a:
            java.lang.String r2 = "endSlide"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0265
            r2 = 3
            goto L_0x0266
        L_0x0234:
            java.lang.String r3 = "curPoint"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0265
            goto L_0x0266
        L_0x023d:
            java.lang.String r2 = "block"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0265
            r2 = 5
            goto L_0x0266
        L_0x0247:
            java.lang.String r2 = "startSlideTime"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0265
            r2 = 2
            goto L_0x0266
        L_0x0251:
            java.lang.String r2 = "endSlideTime"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0265
            r2 = 4
            goto L_0x0266
        L_0x025b:
            java.lang.String r2 = "startSlide"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0265
            r2 = 1
            goto L_0x0266
        L_0x0265:
            r2 = -1
        L_0x0266:
            switch(r2) {
                case 0: goto L_0x028f;
                case 1: goto L_0x0286;
                case 2: goto L_0x0286;
                case 3: goto L_0x027d;
                case 4: goto L_0x027d;
                case 5: goto L_0x026a;
                default: goto L_0x0269;
            }
        L_0x0269:
            goto L_0x029e
        L_0x026a:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r1 = r0.f108880h
            float r1 = r1.getLeftX()
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r2 = r0.f108879g
            float r2 = r2.getLeftX()
            float r1 = r1 + r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            r0.f108848S = r1
            goto L_0x029e
        L_0x027d:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r1 = r0.f108879g
            float r1 = r1.getLeftX()
            r0.f108848S = r1
            goto L_0x029e
        L_0x0286:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r1 = r0.f108880h
            float r1 = r1.getLeftX()
            r0.f108848S = r1
            goto L_0x029e
        L_0x028f:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout r1 = r0.f108890r
            float r1 = r1.getLeftX()
            r0.f108848S = r1
            r0.f108850U = r9
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r1 = r0.f108877e
            r1.mo87613a(r9)
        L_0x029e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo87541a(float f, boolean z) {
        if (this.f108854ab == 2) {
            f = Math.min(Math.max((float) (this.f108844O + C42652k.f107892d), f), (float) (((this.f108875c - this.f108844O) - C42652k.f107892d) - C42652k.f107893e));
        } else {
            if (f < this.f108880h.getStartX() + ((float) C42652k.f107892d)) {
                f = this.f108880h.getStartX() + ((float) C42652k.f107892d);
            }
            if (f > this.f108879g.getStartX() - ((float) this.f108891s.getWidth())) {
                f = this.f108879g.getStartX() - ((float) this.f108891s.getWidth());
            }
        }
        setCurPointerContainerStartX(f);
        this.f108877e.mo87605a(this.f108833D);
        if (z) {
            if (this.f108835F == 2) {
                this.f108877e.mo87608a(getSinglePlayingPosition());
                return;
            }
            this.f108877e.mo87608a(getMultiPlayingPosition());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo87540a(float f, float f2, int i) {
        m94471a(f, f2, i, true);
    }

    public VideoEditView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f108852W = new C43134r();
        this.f108854ab = 1;
        this.f108857ae = true;
        this.f108858af = false;
        this.f108859ag = true;
        this.f108863ak = false;
        this.f108867ao = C42652k.f107890b;
        this.f108840K = C42652k.f107889a;
        this.f108844O = C43845fn.m96282a(36.0d, getContext());
        this.f108871as = true;
        this.f108873au = new C1340m() {

            /* renamed from: b */
            private boolean f108902b;

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo87599a() {
                VideoEditView.this.f108892t = false;
            }

            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i == 0) {
                    if (this.f108902b) {
                        VideoEditView.this.f108877e.mo87629g();
                        this.f108902b = false;
                    }
                    recyclerView.postDelayed(new C43133q(this), 100);
                } else {
                    VideoEditView.this.f108892t = true;
                }
                super.onScrollStateChanged(recyclerView, i);
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (i != 0) {
                    this.f108902b = true;
                    VideoEditView videoEditView = VideoEditView.this;
                    int i3 = videoEditView.f108834E;
                    if (C46811b.m101654a(recyclerView.getContext())) {
                        i = -i;
                    }
                    videoEditView.f108834E = i3 + i;
                    VideoEditView.this.mo87554b();
                    VideoEditView.this.mo87530i();
                    VideoEditView.this.mo87531j();
                    VideoEditView.this.f108877e.mo87628f();
                }
            }
        };
        this.f108869aq = (int) C9432q.m18687b(context, 2.0f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ip, R.attr.iq, R.attr.j6, R.attr.j7, R.attr.mi, R.attr.mj, R.attr.s7, R.attr.acz, R.attr.ad0, R.attr.vq, R.attr.a1z, R.attr.adk, R.attr.adl});
            this.f108855ac = obtainStyledAttributes.getColor(7, 0);
            this.f108855ac = C0803a.m2298b(this.f108855ac, (int) (obtainStyledAttributes.getFloat(8, 1.0f) * 255.0f));
            this.f108856ad = obtainStyledAttributes.getColor(12, C46788b.f118235d.mo94007a(false, false, true, false, false));
            this.f108854ab = obtainStyledAttributes.getInt(9, 1);
            this.f108867ao = Math.round(obtainStyledAttributes.getDimension(5, (float) C42652k.f107890b));
            this.f108840K = Math.round(obtainStyledAttributes.getDimension(4, (float) C42652k.f107889a));
            this.f108865am = Math.round(obtainStyledAttributes.getDimension(3, 0.0f));
            this.f108866an = Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
            this.f108842M = Math.round(obtainStyledAttributes.getDimension(6, 0.0f));
            this.f108870ar = obtainStyledAttributes.getBoolean(10, false);
            C42652k.f107891c = this.f108840K + (this.f108869aq * 2);
            this.f108841L = C42652k.f107891c;
            this.f108844O = Math.round(obtainStyledAttributes.getDimension(11, (float) (this.f108842M - C42652k.f107892d)));
            this.f108868ap = (this.f108866an - C42652k.f107891c) / 2;
            this.f108843N = (this.f108866an - this.f108840K) / 2;
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void m94471a(float f, float f2, int i, boolean z) {
        this.f108880h.setStartX(f);
        this.f108879g.setStartX(f2);
        m94472a((int) this.f108880h.getStartX(), (int) this.f108879g.getStartX());
        this.f108834E = i;
        mo87554b();
        post(new C43130n(this, z));
    }
}
