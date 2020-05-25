package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0777a;
import android.support.p030v4.p038f.C0781c;
import android.support.p030v4.p038f.C0794k;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.util.C10749b;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.facebook.common.p920d.C13696m;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p683ss.android.ugc.aweme.comment_sticker.view.CommentStickerView;
import com.p683ss.android.ugc.aweme.effect.C29218v;
import com.p683ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl;
import com.p683ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43658m;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43546a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43549b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.C43593d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.BorderLineView;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2193e.C43460a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2193e.C43460a.C43461a;
import com.p683ss.android.ugc.aweme.shortvideo.subtitle.C44858b;
import com.p683ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule;
import com.p683ss.android.ugc.aweme.shortvideo.subtitle.UtteranceWithWords;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45416bb;
import com.p683ss.android.ugc.aweme.shortvideo.widget.C45617m;
import com.p683ss.android.ugc.aweme.sticker.data.C45868a;
import com.p683ss.android.ugc.aweme.story.shootvideo.p2341c.C46669a;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C46723c;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46757l;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p683ss.android.ugc.aweme.themechange.base.C46788b;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.gamora.editor.C49391cu;
import com.p683ss.android.ugc.gamora.editor.EditCornerViewModel;
import com.p683ss.android.ugc.gamora.editor.EditInfoStickerViewModel;
import com.p683ss.android.ugc.gamora.editor.EditLyricStickerViewModel;
import com.p683ss.android.ugc.gamora.editor.EditViewModel;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.vesdk.C50751p;
import com.p683ss.android.vesdk.VESize;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C52904aa;
import dmt.p2652av.video.C53030y;
import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i */
public final class C43535i implements C43529c, C43658m {

    /* renamed from: A */
    public C43543a f110132A;

    /* renamed from: B */
    public C43487a f110133B;

    /* renamed from: C */
    public Map<C43509at, C45868a> f110134C = new C0777a();

    /* renamed from: D */
    boolean f110135D;

    /* renamed from: E */
    boolean f110136E;

    /* renamed from: F */
    public C43460a f110137F;

    /* renamed from: G */
    private View f110138G;

    /* renamed from: H */
    private AVDmtTextView f110139H;

    /* renamed from: I */
    private ImageView f110140I;

    /* renamed from: J */
    private ImageView f110141J;

    /* renamed from: K */
    private ImageView f110142K;

    /* renamed from: L */
    private TextView f110143L;

    /* renamed from: M */
    private TextView f110144M;

    /* renamed from: N */
    private ViewGroup f110145N;

    /* renamed from: O */
    private int f110146O = 30;

    /* renamed from: P */
    private C46723c f110147P;

    /* renamed from: Q */
    private View f110148Q;

    /* renamed from: R */
    private boolean f110149R;

    /* renamed from: S */
    private boolean f110150S;

    /* renamed from: T */
    private boolean f110151T;

    /* renamed from: U */
    private boolean f110152U;

    /* renamed from: V */
    private boolean f110153V;

    /* renamed from: W */
    private FrameLayout f110154W;

    /* renamed from: X */
    private int f110155X;

    /* renamed from: Y */
    private C45617m f110156Y;

    /* renamed from: Z */
    private EditCornerViewModel f110157Z;

    /* renamed from: a */
    public boolean f110158a;

    /* renamed from: b */
    public boolean f110159b;

    /* renamed from: c */
    public FragmentActivity f110160c;

    /* renamed from: d */
    public InfoStickerEditView f110161d;

    /* renamed from: e */
    public View f110162e;

    /* renamed from: f */
    VideoEditView f110163f;

    /* renamed from: g */
    public CutMultiVideoViewModel f110164g;

    /* renamed from: h */
    public View f110165h;

    /* renamed from: i */
    SeekBar f110166i;

    /* renamed from: j */
    public C20347c f110167j;

    /* renamed from: k */
    public InfoStickerViewModel f110168k;

    /* renamed from: l */
    public EditLyricStickerViewModel f110169l;

    /* renamed from: m */
    public VideoPublishEditModel f110170m;

    /* renamed from: n */
    public String f110171n;

    /* renamed from: o */
    public List<MediaModel> f110172o;

    /* renamed from: p */
    public SafeHandler f110173p;

    /* renamed from: q */
    public C49391cu f110174q;

    /* renamed from: r */
    public C0198r<Bitmap> f110175r;

    /* renamed from: s */
    public C0198r<Boolean> f110176s;

    /* renamed from: t */
    public int f110177t;

    /* renamed from: u */
    int f110178u;

    /* renamed from: v */
    public Rect f110179v;

    /* renamed from: w */
    public BorderLineView f110180w;

    /* renamed from: x */
    public Rect f110181x;

    /* renamed from: y */
    public Runnable f110182y = new Runnable() {
        public final void run() {
            if (C43535i.this.f110167j != null) {
                C43535i.this.f110164g.f107668b.setValue(Long.valueOf((long) C43535i.this.f110167j.mo43086r((int) ((long) C43535i.this.f110167j.mo43073l()))));
                C43535i.this.f110173p.postDelayed(C43535i.this.f110182y, 30);
            }
        }
    };

    /* renamed from: z */
    public C43545c f110183z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i$a */
    public interface C43543a {
        /* renamed from: a */
        void mo88679a(boolean z);

        /* renamed from: b */
        void mo88680b(boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i$b */
    public interface C43544b {
        /* renamed from: a */
        void mo88497a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i$c */
    public interface C43545c {
        /* renamed from: a */
        int mo88666a(C43501am amVar, boolean z, boolean z2);

        /* renamed from: a */
        PointF mo88667a(C43501am amVar, float f, float f2);

        /* renamed from: a */
        Float mo88668a(float f);

        /* renamed from: a */
        void mo88669a(C43501am amVar, int i, int i2, boolean z, boolean z2, C43549b bVar);
    }

    /* renamed from: a */
    public final void mo88628a(C43509at atVar) {
        mo88629a(atVar, 0);
    }

    /* renamed from: a */
    public final void mo88627a(C43487a aVar, boolean z) {
        if (!z) {
            this.f110133B = null;
        } else if (aVar != this.f110133B) {
            this.f110133B = aVar;
        } else {
            return;
        }
        mo88650c(!z);
        if (this.f110132A != null) {
            this.f110132A.mo88679a(z);
        }
    }

    /* renamed from: a */
    public final void mo88629a(C43509at atVar, int i) {
        if (atVar != this.f110133B) {
            if (atVar != null) {
                if (!this.f110134C.containsKey(atVar)) {
                    this.f110134C.put(atVar, atVar.mo52072c());
                }
                atVar.setAlpha(true);
                if (m95527b((C43487a) atVar)) {
                    this.f110173p.post(new C43494af(this));
                }
                if (this.f110150S && i == 0) {
                    m95530f(atVar);
                }
                if (this.f110133B != null) {
                    switch (i) {
                        case 0:
                            if (this.f110150S) {
                                this.f110133B.setAlpha(false);
                                break;
                            }
                            break;
                        case 1:
                            if (this.f110149R) {
                                this.f110133B.setAlpha(false);
                                break;
                            }
                            break;
                    }
                    if (m95527b(this.f110133B)) {
                        this.f110167j.mo43089t();
                    }
                }
                if (i == 0) {
                    m95529e(atVar);
                }
                if (i == 1) {
                    m95528d(atVar);
                }
            } else {
                for (Entry entry : this.f110134C.entrySet()) {
                    C43509at atVar2 = (C43509at) entry.getKey();
                    C45868a aVar = (C45868a) entry.getValue();
                    if (!(atVar2 == null || aVar == null)) {
                        atVar2.mo52068a(aVar, this.f110161d.f109928c, this.f110161d.f109929d);
                    }
                }
                this.f110134C.clear();
            }
            this.f110133B = atVar;
        }
    }

    /* renamed from: a */
    public final void mo88636a(boolean z) {
        InfoStickerEditView infoStickerEditView = this.f110161d;
        infoStickerEditView.f109934i = z;
        if (!z && infoStickerEditView.f109932g.f110108b != null) {
            infoStickerEditView.f109932g.mo88604b();
            if (infoStickerEditView.f109912H) {
                infoStickerEditView.f109913I.mo90467b();
                infoStickerEditView.f109932g.mo88595a();
            }
            infoStickerEditView.invalidate();
        }
        if (!z && infoStickerEditView.f109937n != null && infoStickerEditView.f109913I != null && infoStickerEditView.f109913I.f112687a && infoStickerEditView.f109912H) {
            infoStickerEditView.f109913I.mo90467b();
        }
    }

    /* renamed from: a */
    public final void mo88625a(C20347c cVar, VideoPublishEditModel videoPublishEditModel) {
        this.f110167j = cVar;
        this.f110170m = videoPublishEditModel;
    }

    /* renamed from: a */
    public final boolean mo88590a() {
        C0198r<Boolean> rVar = this.f110168k.f109961c;
        if (rVar == null || rVar.getValue() == null) {
            return false;
        }
        return ((Boolean) rVar.getValue()).booleanValue();
    }

    /* renamed from: a */
    public final void mo88624a(FrameLayout frameLayout) {
        if (this.f110167j != null && frameLayout != null) {
            this.f110154W.post(new C43495ag(this, frameLayout));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88623a(View view) {
        this.f110161d.mo88447c();
        this.f110134C.clear();
        C43501am amVar = (this.f110133B == null || !(this.f110133B instanceof C43501am)) ? null : (C43501am) this.f110133B;
        if (amVar != null) {
            C43460a aVar = this.f110137F;
            C52711k.m112240b(amVar, "item");
            aVar.f109848a = amVar.f110003d.path;
            aVar.f109849b = amVar.f110003d.f91605id;
            aVar.f109851d = amVar;
            aVar.f109858k.mo43019a(false);
            aVar.f109858k.mo43039b(aVar.f109857j);
            C43461a aVar2 = aVar.f109853f;
            if (aVar2 != null) {
                aVar2.mo88395a();
            }
        }
        C47702b.f120193a.mo94984a("prop_pin_confirm", C23089d.m56640a().mo47829a("enter_from", "video_edit_page").mo47829a("shoot_way", this.f110170m.mShootWay).mo47829a("creation_id", this.f110170m.creationId).mo47829a("content_type", this.f110170m.getAvetParameter().getContentType()).mo47829a("content_source", this.f110170m.getAvetParameter().getContentSource()).mo47829a("prop_id", mo88647c()).f61491a);
    }

    /* renamed from: a */
    public final void mo88630a(C43510b bVar) {
        this.f110161d.setStickerDataChangeListener(bVar);
    }

    /* renamed from: a */
    public final void mo88632a(C46669a aVar) {
        if (this.f110161d != null && this.f110161d.f109932g != null) {
            this.f110161d.f109932g.f110113g = aVar;
        }
    }

    /* renamed from: a */
    public final void mo88634a(String str, String str2, String str3, int i) {
        if (this.f110161d.getStickNumber() >= this.f110146O) {
            C10691a.m21543b(this.f110161d.getContext(), (int) R.string.bre, 0).mo19066a();
            return;
        }
        InfoStickerEditView infoStickerEditView = this.f110161d;
        infoStickerEditView.f109932g.mo88594a(str, str2, str3, i, false, false);
        infoStickerEditView.invalidate();
    }

    /* renamed from: a */
    public final void mo88635a(List<UtteranceWithWords> list) {
        this.f110161d.mo88442a(list);
    }

    /* renamed from: a */
    public final void mo88631a(C44858b bVar) {
        this.f110161d.setSubtitleCallBack(bVar);
    }

    /* renamed from: a */
    public final boolean mo88640a(boolean z, boolean z2) {
        int i = z ? 1 : 0;
        if (z2) {
            i++;
        }
        if (this.f110161d.getStickNumber() + i < this.f110146O) {
            return false;
        }
        C10691a.m21543b(this.f110161d.getContext(), (int) R.string.bre, 0).mo19066a();
        return true;
    }

    /* renamed from: a */
    public final void mo88626a(InfoStickerModel infoStickerModel) {
        InfoStickerEditView infoStickerEditView = this.f110161d;
        if (infoStickerEditView.f109928c == 0 || infoStickerEditView.f109929d == 0) {
            infoStickerEditView.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(infoStickerModel) {

                /* renamed from: a */
                boolean f109950a;

                /* renamed from: b */
                final /* synthetic */ InfoStickerModel f109951b;

                public final void onGlobalLayout() {
                    InfoStickerEditView.this.mo88438a();
                    if (InfoStickerEditView.this.f109928c > 0 && InfoStickerEditView.this.f109929d > 0 && !this.f109950a) {
                        InfoStickerEditView.this.f109932g.mo88596a(this.f109951b);
                        this.f109950a = true;
                        InfoStickerEditView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                }

                {
                    this.f109951b = r2;
                }
            });
        } else {
            infoStickerEditView.f109932g.mo88596a(infoStickerModel);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo88637a(boolean z, C43509at atVar, boolean z2) {
        boolean z3 = z;
        this.f110136E = z3;
        m95531f(!z3);
        m95533o();
        mo88650c(!z3);
        mo88629a(atVar, 1);
        this.f110155X = this.f110165h.getHeight();
        if (this.f110155X == 0) {
            this.f110155X = (int) C9432q.m18687b((Context) this.f110160c, 120.0f);
        }
        this.f110166i.setProgress((int) ((((float) this.f110167j.mo43073l()) * 100.0f) / ((float) this.f110167j.mo43071k())));
        C29218v.m68807a(this.f110165h, z3, this.f110155X, this.f110165h, (C0781c<Void>) new C43646x<Void>(this, z3, z2));
        if (this.f110132A != null) {
            this.f110132A.mo88679a(z3);
        }
        if (z3) {
            this.f110168k.mo88490b().setValue(C52904aa.m112577a(C46788b.f118235d.mo94007a(true, false, false, false, false), 0, this.f110155X, m95538t(), C22452a.m55498d(), 0, true, false, z2));
            this.f110142K.setImageDrawable(this.f110142K.getContext().getResources().getDrawable(R.drawable.tz));
            this.f110142K.setEnabled(true);
            return;
        }
        this.f110142K.setEnabled(false);
        this.f110173p.removeCallbacks(this.f110182y);
        this.f110168k.mo88489a().setValue(C53030y.m112774b());
        this.f110168k.mo88490b().setValue(C52904aa.m112576a(this.f110161d.getResources().getColor(R.color.ip), C43303dy.m94972c(this.f110160c), this.f110155X, m95538t(), C22452a.m55498d(), 0, z2, true));
        this.f110153V = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo88638a(int i, int i2, int i3, C43509at atVar) {
        boolean a = this.f110163f.mo87548a(i, i2, 0);
        if (a && atVar != null) {
            this.f110164g.f107668b.setValue(Long.valueOf((long) atVar.mo52063a(0)));
            this.f110168k.mo88489a().setValue(C53030y.m112775b((long) atVar.mo52063a(0)));
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo88639a(RectF rectF) {
        if (!this.f110170m.hasInfoStickers()) {
            return false;
        }
        VESize b = this.f110167j.mo43037b();
        RectF rectF2 = new RectF();
        for (StickerItemModel stickerItemModel : this.f110170m.infoStickerModel.stickers) {
            if (stickerItemModel.isSubtitleRule()) {
                try {
                    float[] g = this.f110167j.mo43064g(stickerItemModel.f91605id);
                    rectF2.set(g[0] * ((float) b.width), g[3] * ((float) b.height), g[2] * ((float) b.width), g[1] * ((float) b.height));
                    m95525b(rectF2);
                    if (rectF2.top < rectF.top || rectF2.bottom > rectF.bottom) {
                        return true;
                    }
                } catch (C50751p unused) {
                    StringBuilder sb = new StringBuilder("getInfoStickerBoundingBox of subtitle error, index is ");
                    sb.append(stickerItemModel.f91605id);
                    sb.append(" veState is ");
                    sb.append(this.f110167j.mo43063g().getValue());
                    C45407ay.m98971b(sb.toString());
                    return false;
                }
            } else if (!stickerItemModel.isSubtitle()) {
                try {
                    float[] g2 = this.f110167j.mo43064g(stickerItemModel.f91605id);
                    rectF2.set(g2[0] * ((float) b.width), g2[3] * ((float) b.height), g2[2] * ((float) b.width), g2[1] * ((float) b.height));
                    if (rectF2.top < rectF.top || rectF2.bottom > rectF.bottom) {
                        return true;
                    }
                } catch (C50751p unused2) {
                    StringBuilder sb2 = new StringBuilder("getInfoStickerBoundingBox error, index is ");
                    sb2.append(stickerItemModel.f91605id);
                    sb2.append(" veState is ");
                    sb2.append(this.f110167j.mo43063g().getValue());
                    C45407ay.m98971b(sb2.toString());
                    return false;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo88633a(C52847n<Integer, Integer> nVar) {
        Integer num = (Integer) nVar.getFirst();
        Integer num2 = (Integer) nVar.getSecond();
        if (this.f110161d != null) {
            this.f110161d.f109932g.f110109c = num2.intValue();
        }
        if (this.f110150S) {
            if (this.f110164g != null) {
                this.f110164g.f107678l = num.intValue();
            }
            this.f110163f.mo87542a(num.intValue());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo88647c() {
        return m95522a(this.f110133B);
    }

    /* renamed from: g */
    public final void mo88658g() {
        if (this.f110153V) {
            mo88657f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo88660i() {
        m95524a(false, (C43509at) null);
    }

    /* renamed from: j */
    public final void mo88661j() {
        m95526b(false, (C43509at) null);
    }

    /* renamed from: k */
    public final boolean mo88662k() {
        if (this.f110161d != null) {
            return this.f110161d.f109949z;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean mo88663l() {
        if (this.f110161d != null) {
            return this.f110161d.f109905A;
        }
        return false;
    }

    /* renamed from: m */
    public final void mo88664m() {
        if (this.f110174q != null) {
            this.f110174q.cp_();
        }
    }

    /* renamed from: q */
    private boolean m95535q() {
        if (this.f110133B instanceof C43501am) {
            return true;
        }
        return (!(this.f110133B instanceof C46757l) && !(this.f110133B instanceof CommentStickerView) && (this.f110133B instanceof C43593d)) ? false : false;
    }

    /* renamed from: s */
    private int m95537s() {
        return ((C43303dy.m94974e(this.f110160c) - this.f110155X) - C43303dy.m94972c(this.f110160c)) - C43303dy.m94973d(this.f110160c);
    }

    /* renamed from: t */
    private int m95538t() {
        return (C43303dy.m94974e(this.f110160c) - this.f110155X) - C43303dy.m94973d(this.f110160c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo88654e() {
        if (this.f110135D) {
            mo88658g();
            mo88620a(0, this.f110167j.mo43071k());
            this.f110168k.mo88489a().setValue(C53030y.m112773a((long) this.f110167j.mo43088s(((Long) this.f110163f.getPlayBoundary().f2711a).intValue())));
        }
    }

    /* renamed from: o */
    private void m95533o() {
        if (!this.f110149R) {
            this.f110149R = true;
            this.f110144M.setTypeface(C10749b.m21787a().mo19435a(C10751d.f28908g));
            this.f110143L.setTypeface(C10749b.m21787a().mo19435a(C10751d.f28908g));
            this.f110143L.setOnClickListener(new C43496ah(this));
            this.f110144M.setOnClickListener(new C43497ai(this));
            m95532n();
            this.f110166i.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
                public final void onStartTrackingTouch(SeekBar seekBar) {
                }

                public final void onStopTrackingTouch(SeekBar seekBar) {
                }

                public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    long j;
                    if (z) {
                        C43535i iVar = C43535i.this;
                        if (iVar.f110136E && iVar.f110133B != null && (iVar.f110133B instanceof C43509at)) {
                            int i2 = 0;
                            float a = ((float) ((C43509at) iVar.f110133B).mo52063a(0)) + (((float) ((((C43509at) iVar.f110133B).mo52069b(iVar.f110167j.mo43071k()) - ((C43509at) iVar.f110133B).mo52063a(0)) * i)) / 100.0f);
                            C0198r a2 = iVar.f110168k.mo88489a();
                            List l = iVar.f110163f.getVideoEditViewModel().mo87634l();
                            float m = iVar.f110163f.getVideoEditViewModel().mo87635m();
                            ArrayList arrayList = new ArrayList();
                            for (int i3 = 0; i3 < l.size(); i3++) {
                                if (!((VideoSegment) l.get(i3)).f107911j) {
                                    arrayList.add(l.get(i3));
                                }
                            }
                            long j2 = 0;
                            float f = a;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= arrayList.size()) {
                                    break;
                                }
                                VideoSegment videoSegment = (VideoSegment) arrayList.get(i4);
                                j2 += videoSegment.f107904c;
                                if (f <= ((float) (videoSegment.mo86953g() - videoSegment.mo86952f())) / (videoSegment.mo86954h() * m)) {
                                    i2 = i4;
                                    break;
                                } else {
                                    f -= ((float) (videoSegment.mo86953g() - videoSegment.mo86952f())) / (videoSegment.mo86954h() * m);
                                    i4++;
                                }
                            }
                            if (i4 == arrayList.size()) {
                                j = (j2 - ((VideoSegment) arrayList.get(i2)).f107904c) + ((VideoSegment) arrayList.get(i2)).mo86953g();
                            } else {
                                j = (long) (((float) ((j2 - ((VideoSegment) arrayList.get(i2)).f107904c) + ((VideoSegment) arrayList.get(i2)).mo86952f())) + (f * ((VideoSegment) arrayList.get(i2)).mo86954h() * m));
                            }
                            a2.setValue(C53030y.m112773a(j));
                        }
                    }
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo88651d() {
        if (this.f110135D) {
            C0794k playBoundary = this.f110163f.getPlayBoundary();
            this.f110168k.mo88489a().setValue(C53030y.m112773a((long) this.f110167j.mo43088s(((Long) playBoundary.f2711a).intValue())));
            mo88620a(Math.max(((Long) playBoundary.f2711a).intValue() - 30, 0), Math.min(((Long) playBoundary.f2712b).intValue() + NormalGiftView.MASK_TRANSLATE_VALUE, this.f110167j.mo43071k()));
        }
    }

    /* renamed from: h */
    public final boolean mo88659h() {
        InfoStickerEditView infoStickerEditView = this.f110161d;
        if (infoStickerEditView.f109912H) {
            infoStickerEditView.f109913I.mo90467b();
        }
        if (this.f110161d == null || this.f110161d.f109932g == null || this.f110161d.f109932g.f110107a == null || this.f110161d.f109932g.f110107a.size() <= 0) {
            return false;
        }
        boolean z = false;
        for (C43501am amVar : this.f110161d.f109932g.f110107a) {
            if (amVar.f110004e) {
                amVar.f110004e = false;
                z = true;
            }
        }
        if (z) {
            this.f110161d.f109908D = false;
            this.f110161d.invalidate();
        }
        return z;
    }

    /* renamed from: n */
    private void m95532n() {
        C45617m mVar;
        if (!this.f110151T) {
            this.f110151T = true;
            int k = this.f110167j.mo43071k();
            this.f110164g = (CutMultiVideoViewModel) C0214z.m440a(this.f110160c).mo359a(CutMultiVideoViewModel.class);
            boolean z = false;
            this.f110163f.setCanEdit(false);
            this.f110163f.setMinVideoLength(1000);
            this.f110163f.setMaxVideoLength((long) k);
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f110164g;
            if (this.f110170m.isMvThemeVideoType() || this.f110170m.isStatusVideoType()) {
                z = true;
            }
            cutMultiVideoViewModel.f107677k = z;
            this.f110164g.f107678l = k;
            this.f110163f.setFirstFrameVisibleLiveData(this.f110176s);
            this.f110163f.setFirstFrameBitmapLiveData(this.f110175r);
            this.f110163f.setVeEditor(this.f110167j);
            int frameWidth = this.f110163f.getFrameWidth();
            int frameHeight = this.f110163f.getFrameHeight();
            int ceil = (int) Math.ceil((double) (((float) (C9432q.m18670a((Context) this.f110160c) - (this.f110163f.getLeftRightMargin() * 2))) / (((float) frameWidth) * 1.0f)));
            if (this.f110170m.isMultiVideoEdit()) {
                int i = ceil + 2;
                VEMultiEditVideoCoverGeneratorImpl vEMultiEditVideoCoverGeneratorImpl = new VEMultiEditVideoCoverGeneratorImpl(this.f110167j, this.f110160c, i, this.f110167j.mo43071k(), (int) this.f110170m.getMultiEditVideoStartTime());
                mVar = new C45617m(vEMultiEditVideoCoverGeneratorImpl, frameWidth, frameHeight, i);
            } else {
                mVar = new C45617m(new VEVideoCoverGeneratorImpl(this.f110167j, this.f110160c, ceil, "sticker_select_time"), frameWidth, frameHeight, ceil);
            }
            this.f110156Y = mVar;
            if (this.f110172o == null || this.f110172o.isEmpty()) {
                this.f110163f.mo87551a(this.f110160c, this.f110164g, this.f110171n);
            } else {
                this.f110163f.mo87550a(this.f110160c, this.f110164g, this.f110156Y, this.f110172o);
            }
            this.f110163f.setEnableBoundaryText(true);
            this.f110163f.setPointerType(2);
        }
    }

    /* renamed from: p */
    private void m95534p() {
        if (!this.f110150S) {
            this.f110150S = true;
            this.f110140I.setOnClickListener(new C43634l(this));
            this.f110141J.setOnClickListener(new C43635m(this));
            this.f110142K.setOnClickListener(new C43636n(this));
            m95532n();
            VideoEditViewModel videoEditViewModel = this.f110163f.getVideoEditViewModel();
            videoEditViewModel.f108908c.observe(this.f110160c, new C43637o(this));
            videoEditViewModel.f108911f.observe(this.f110160c, new C43638p(this));
            videoEditViewModel.f108916k.observe(this.f110160c, new C43639q(this));
            videoEditViewModel.f108914i.observe(this.f110160c, new C43640r(this));
            videoEditViewModel.f108915j.observe(this.f110160c, new C43641s(this));
            videoEditViewModel.f108912g.observe(this.f110160c, new C43642t(this));
            videoEditViewModel.f108913h.observe(this.f110160c, new C43643u(this));
            videoEditViewModel.f108910e.observe(this.f110160c, new C43645w(this));
        }
    }

    /* renamed from: r */
    private void m95536r() {
        CharSequence charSequence;
        boolean z;
        String str;
        if (this.f110153V) {
            charSequence = this.f110139H.getContext().getResources().getString(R.string.dvt);
        } else {
            float selectedTime = this.f110163f.getSelectedTime();
            if (1000.0f * selectedTime * 0.99f < ((float) this.f110163f.getMinVideoLength())) {
                z = true;
            } else {
                z = false;
            }
            String a = C2240a.m6773a(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(selectedTime)});
            try {
                str = this.f110139H.getContext().getResources().getString(R.string.brh, new Object[]{a});
            } catch (FormatFlagsConversionMismatchException e) {
                String string = this.f110139H.getContext().getResources().getString(R.string.brg, new Object[]{a});
                m95523a(e, string);
                str = string;
            }
            if (z) {
                charSequence = C45416bb.m98984a(new SpannableString(str), str.indexOf(a), str.indexOf(a) + a.length(), this.f110139H.getResources().getColor(R.color.a6j));
            } else {
                charSequence = str;
            }
        }
        this.f110139H.setText(charSequence);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo88657f() {
        this.f110153V = !this.f110153V;
        mo88650c(this.f110153V);
        m95536r();
        if (this.f110132A != null) {
            this.f110132A.mo88680b(this.f110153V);
        }
        if (!this.f110153V) {
            this.f110142K.setImageDrawable(this.f110160c.getResources().getDrawable(R.drawable.tz));
            this.f110168k.mo88489a().setValue(C53030y.m112773a((long) this.f110167j.mo43073l()));
            this.f110168k.mo88489a().setValue(C53030y.m112774b());
            this.f110173p.removeCallbacks(this.f110182y);
            if (this.f110133B != null) {
                this.f110133B.setAlpha(true);
            }
        } else {
            this.f110142K.setImageDrawable(this.f110160c.getResources().getDrawable(R.drawable.ty));
            this.f110173p.post(this.f110182y);
            this.f110168k.mo88489a().setValue(C53030y.m112772a());
        }
        this.f110163f.mo87557c(true ^ this.f110153V);
    }

    /* renamed from: b */
    public final boolean mo88591b() {
        C0198r<Boolean> rVar = this.f110168k.f109962d;
        if (rVar == null || rVar.getValue() == null) {
            return false;
        }
        return ((Boolean) rVar.getValue()).booleanValue();
    }

    /* renamed from: b */
    private static boolean m95527b(C43487a aVar) {
        return aVar instanceof C43501am;
    }

    /* renamed from: a */
    public final int mo88616a(StickerItemModel stickerItemModel) {
        return this.f110161d.mo88436a(stickerItemModel);
    }

    /* renamed from: b */
    public final void mo88644b(C43509at atVar) {
        m95524a(true, atVar);
    }

    /* renamed from: d */
    public final void mo88653d(boolean z) {
        mo88646b(z, true);
    }

    /* renamed from: f */
    private void m95531f(boolean z) {
        if (this.f110157Z != null) {
            this.f110157Z.mo96810a(z);
        }
    }

    /* renamed from: a */
    public final int mo88617a(UtteranceWithWords utteranceWithWords) {
        return this.f110161d.mo88437a(utteranceWithWords);
    }

    /* renamed from: b */
    public final void mo88641b(int i) {
        this.f110161d.f109932g.f110111e.mo43055e(i, C43502an.m95363c());
    }

    /* renamed from: c */
    public final void mo88648c(int i) {
        this.f110161d.f109932g.f110111e.mo43055e(i, C43502an.f110022a);
    }

    /* renamed from: e */
    public final void mo88656e(boolean z) {
        if (this.f110161d != null) {
            this.f110161d.f109932g.mo88602a(z);
        }
    }

    /* renamed from: a */
    private static String m95522a(C43487a aVar) {
        if (m95527b(aVar)) {
            return ((C43501am) aVar).f110003d.stickerId;
        }
        if (aVar instanceof C46757l) {
            return "text_sticker";
        }
        return "";
    }

    /* renamed from: c */
    public final void mo88649c(C43509at atVar) {
        m95526b(true, atVar);
    }

    /* renamed from: d */
    private void m95528d(C43509at atVar) {
        this.f110166i.setProgress((int) ((((float) (this.f110167j.mo43073l() - atVar.mo52063a(0))) / ((float) (atVar.mo52069b(this.f110167j.mo43071k()) - atVar.mo52063a(0)))) * 100.0f));
    }

    /* renamed from: f */
    private void m95530f(C43509at atVar) {
        int c = atVar.mo52071c(0);
        int d = atVar.mo52073d(this.f110167j.mo42966A());
        if (c >= 0 && d >= 0 && !mo88638a(c, d, 0, atVar)) {
            this.f110173p.postDelayed(new C43489aa(this, c, d, atVar), 300);
        }
        m95536r();
    }

    /* renamed from: b */
    public final void mo88645b(boolean z) {
        mo88637a(false, (C43509at) null, z);
    }

    /* renamed from: c */
    public final void mo88650c(boolean z) {
        this.f110161d.mo88443a(z);
        if (this.f110133B != null && m95535q()) {
            this.f110133B.setAlpha(true);
        }
    }

    /* renamed from: b */
    private void m95525b(RectF rectF) {
        for (StickerItemModel stickerItemModel : this.f110170m.infoStickerModel.stickers) {
            if (stickerItemModel.isSubtitle() && stickerItemModel.getText().length() >= 16) {
                rectF.top -= (rectF.bottom - rectF.top) / 2.0f;
                rectF.bottom += (rectF.bottom - rectF.top) / 2.0f;
                return;
            }
        }
    }

    /* renamed from: e */
    private void m95529e(C43509at atVar) {
        String str;
        String str2;
        if (atVar != null) {
            C47702b bVar = C47702b.f120193a;
            String str3 = "prop_time_set";
            C23089d a = C23089d.m56640a().mo47829a("prop_id", m95522a((C43487a) atVar)).mo47829a("creation_id", this.f110170m.creationId);
            String str4 = "method";
            if (this.f110133B == null) {
                str = "click";
            } else {
                str = "change";
            }
            C23089d a2 = a.mo47829a(str4, str).mo47826a("draft_id", this.f110170m.draftId).mo47829a("content_type", this.f110170m.getAvetParameter().getContentType()).mo47829a("content_source", this.f110170m.getAvetParameter().getContentSource()).mo47829a("shoot_entrance", this.f110170m.mShootWay);
            String str5 = "enter_from";
            if (this.f110158a) {
                str2 = "edit_post_page";
            } else {
                str2 = "video_edit_page";
            }
            bVar.mo94984a(str3, a2.mo47829a(str5, str2).f61491a);
        }
    }

    /* renamed from: d */
    public final void mo88652d(int i) {
        C43530d dVar = this.f110161d.f109932g;
        C43501am amVar = null;
        for (C43501am amVar2 : dVar.f110107a) {
            if (amVar2.f110003d.f91605id == i) {
                amVar = amVar2;
            }
        }
        if (amVar != null) {
            dVar.mo88597a(amVar);
        }
    }

    /* renamed from: e */
    public final void mo88655e(int i) {
        C43530d dVar = this.f110161d.f109932g;
        if (i != -1) {
            dVar.f110111e.mo43058f(i);
            SubtitleModule.m97952aa().remove(Integer.valueOf(i));
            C43501am amVar = null;
            for (C43501am amVar2 : dVar.f110107a) {
                if (amVar2.f110003d.f91605id == i) {
                    amVar = amVar2;
                }
            }
            if (amVar != null) {
                dVar.f110107a.remove(amVar);
                dVar.f110108b = null;
                if (dVar.f110112f != null) {
                    dVar.f110112f.mo88528b(amVar.f110003d);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo88619a(int i) {
        this.f110146O = i;
        if (this.f110146O == 0) {
            this.f110146O = 30;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo88643b(View view) {
        this.f110161d.mo88447c();
        mo88645b(false);
        C47702b.f120193a.mo94984a("prop_pin_cancel", C23089d.m56640a().mo47829a("enter_from", "video_edit_page").mo47829a("shoot_way", this.f110170m.mShootWay).mo47829a("creation_id", this.f110170m.creationId).mo47829a("content_type", this.f110170m.getAvetParameter().getContentType()).mo47829a("content_source", this.f110170m.getAvetParameter().getContentSource()).mo47829a("prop_id", mo88647c()).f61491a);
    }

    /* renamed from: b */
    public final void mo88642b(int i, int i2) {
        this.f110161d.f109932g.f110111e.mo43062g(i, i2);
    }

    /* renamed from: a */
    private void m95523a(FormatFlagsConversionMismatchException formatFlagsConversionMismatchException, String str) {
        try {
            StringBuilder sb = new StringBuilder("normal_str=");
            sb.append(str);
            sb.append(", error_str=");
            sb.append(this.f110139H.getContext().getResources().getString(R.string.brh));
            C23569o.m57779a("info_sticker_string_format_event", C42437ay.m93202a().mo86521a("exception", C13696m.m27668c(formatFlagsConversionMismatchException)).mo86521a("event", sb.toString()).mo86522b());
        } catch (Exception e) {
            C45407ay.m98971b(e.getLocalizedMessage());
        }
    }

    /* renamed from: a */
    private void m95524a(boolean z, C43509at atVar) {
        this.f110135D = z;
        m95531f(!z);
        m95534p();
        mo88650c(!z);
        mo88628a(atVar);
        this.f110155X = this.f110138G.getHeight();
        if (this.f110155X == 0) {
            this.f110155X = ((int) C9432q.m18687b((Context) this.f110160c, 210.0f)) + 84;
        }
        C29218v.m68807a(this.f110138G, z, this.f110155X, this.f110138G, (C0781c<Void>) new C43647y<Void>(this, z));
        if (this.f110132A != null) {
            this.f110132A.mo88679a(z);
        }
        if (z) {
            this.f110168k.mo88490b().setValue(C52904aa.m112575a(C46788b.f118235d.mo94007a(true, false, false, false, false), C43303dy.m94972c(this.f110160c), this.f110155X, m95537s(), C22452a.m55498d(), 0));
            this.f110142K.setImageDrawable(this.f110142K.getContext().getResources().getDrawable(R.drawable.tz));
            this.f110142K.setEnabled(true);
            this.f110163f.setEnabled(true);
            this.f110163f.mo87557c(true);
            this.f110168k.mo88489a().setValue(C53030y.m112775b(0));
            return;
        }
        this.f110142K.setEnabled(false);
        this.f110163f.setEnabled(false);
        this.f110173p.removeCallbacks(this.f110182y);
        this.f110168k.mo88489a().setValue(C53030y.m112774b());
        this.f110168k.mo88490b().setValue(C52904aa.m112578b(this.f110161d.getResources().getColor(R.color.ip), C43303dy.m94972c(this.f110160c), this.f110155X, m95537s(), C22452a.m55498d(), 0));
        this.f110153V = false;
    }

    /* renamed from: b */
    private void m95526b(boolean z, C43509at atVar) {
        this.f110135D = z;
        mo88628a(atVar);
        this.f110155X = this.f110138G.getHeight();
        if (this.f110155X == 0) {
            this.f110155X = ((int) C9432q.m18687b((Context) this.f110160c, 210.0f)) + 84;
        }
        boolean z2 = !z;
        int i = 0;
        if (z) {
            this.f110152U = this.f110150S;
            this.f110150S = false;
            this.f110161d.f109936k = InfoStickerEditView.f109904m;
            this.f110161d.f109932g.mo88609d();
            this.f110162e.setOnClickListener(new C43648z(this));
        } else {
            this.f110150S = this.f110152U;
            this.f110161d.f109936k = 0;
            this.f110162e.setVisibility(8);
            this.f110162e.setOnClickListener(null);
        }
        InfoStickerEditView infoStickerEditView = this.f110161d;
        if (!z2) {
            i = 4;
        }
        infoStickerEditView.setVisibility(i);
        if (z2) {
            this.f110161d.mo88449e();
        }
        if (this.f110132A != null) {
            this.f110132A.mo88679a(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo88620a(int i, int i2) {
        m95536r();
        if (this.f110133B != null) {
            int s = this.f110167j.mo43088s(i);
            int s2 = this.f110167j.mo43088s(i2);
            if (m95535q()) {
                this.f110161d.mo88441a((C43501am) this.f110133B, s, s2);
            } else if (this.f110133B instanceof C46757l) {
                TextStickerData data = ((C46757l) this.f110133B).getData();
                if (data != null) {
                    data.setStartTime(s);
                    data.setEndTime(s2);
                    data.setUiStartTime(i);
                    data.setUiEndTime(i2);
                }
            } else if (this.f110133B instanceof CommentStickerView) {
                CommentVideoModel data2 = ((CommentStickerView) this.f110133B).getData();
                if (data2 != null) {
                    data2.setStartTime(s);
                    data2.setEndTime(s2);
                }
            } else {
                if (this.f110133B instanceof C43593d) {
                    ((C43593d) this.f110133B).setStartTime(s);
                    ((C43593d) this.f110133B).setEndTime(s2);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo88646b(boolean z, boolean z2) {
        if (this.f110161d != null) {
            this.f110161d.mo88444a(z, z2);
        }
    }

    /* renamed from: a */
    public final void mo88621a(int i, int i2, int[] iArr) {
        if (this.f110167j != null) {
            this.f110154W.post(new C43490ab(this, i, i2, iArr));
        }
    }

    /* renamed from: a */
    public final void mo88622a(FragmentActivity fragmentActivity, View view, List<MediaModel> list, boolean z) {
        this.f110160c = fragmentActivity;
        this.f110172o = list;
        this.f110171n = ((MediaModel) list.get(0)).f95383b;
        this.f110159b = z;
        this.f110173p = new SafeHandler(fragmentActivity);
        this.f110168k = (InfoStickerViewModel) C0214z.m440a(fragmentActivity).mo359a(InfoStickerViewModel.class);
        this.f110169l = (EditLyricStickerViewModel) C48927d.m105736a(fragmentActivity).mo96760a(EditLyricStickerViewModel.class);
        this.f110148Q = view;
        this.f110154W = (FrameLayout) this.f110148Q.findViewById(R.id.cfl);
        this.f110161d = (InfoStickerEditView) this.f110148Q.findViewById(R.id.au0);
        this.f110162e = this.f110148Q.findViewById(R.id.b37);
        this.f110138G = this.f110148Q.findViewById(R.id.zr);
        this.f110139H = (AVDmtTextView) this.f110148Q.findViewById(R.id.cz6);
        this.f110163f = (VideoEditView) this.f110148Q.findViewById(R.id.dp7);
        this.f110140I = (ImageView) this.f110148Q.findViewById(R.id.q7);
        this.f110141J = (ImageView) this.f110148Q.findViewById(R.id.cgp);
        this.f110142K = (ImageView) this.f110148Q.findViewById(R.id.or);
        this.f110165h = this.f110148Q.findViewById(R.id.eop);
        this.f110143L = (TextView) this.f110148Q.findViewById(R.id.eoo);
        this.f110144M = (TextView) this.f110148Q.findViewById(R.id.eos);
        this.f110166i = (SeekBar) this.f110148Q.findViewById(R.id.eoq);
        this.f110145N = (ViewGroup) this.f110148Q.findViewById(R.id.eor);
        this.f110157Z = (EditCornerViewModel) C48927d.m105736a(this.f110160c).mo96760a(EditCornerViewModel.class);
        this.f110137F = new C43460a(this.f110167j, this.f110160c);
        this.f110137F.f109853f = new C43461a() {
            /* renamed from: a */
            public final void mo88395a() {
                C43535i.this.mo88645b(true);
            }

            /* renamed from: a */
            public final void mo88397a(boolean z) {
                C43535i.this.f110161d.post(new C43499ak(this, true));
            }

            /* renamed from: a */
            public final void mo88396a(String str, C43501am amVar) {
                C43535i.this.f110161d.post(new C43498aj(this, amVar, str));
            }
        };
        if (this.f110145N != null) {
            this.f110145N.setOnTouchListener(new C43632j(this));
        }
        this.f110161d.f109906B = this.f110158a;
        this.f110161d.setVisibility(0);
        InfoStickerEditView infoStickerEditView = this.f110161d;
        FragmentActivity fragmentActivity2 = this.f110160c;
        SafeHandler safeHandler = this.f110173p;
        C20347c cVar = this.f110167j;
        VideoPublishEditModel videoPublishEditModel = this.f110170m;
        View view2 = this.f110148Q;
        infoStickerEditView.f109930e = cVar;
        infoStickerEditView.f109931f = safeHandler;
        infoStickerEditView.f109933h = videoPublishEditModel;
        infoStickerEditView.f109909E = fragmentActivity2;
        infoStickerEditView.f109932g = new C43530d(fragmentActivity2, infoStickerEditView, infoStickerEditView.f109930e, view2);
        infoStickerEditView.f109932g.f110117k = videoPublishEditModel;
        infoStickerEditView.f109910F = new C43485c();
        infoStickerEditView.f109915K = (EditInfoStickerViewModel) C48927d.m105736a(fragmentActivity2).mo96760a(EditInfoStickerViewModel.class);
        infoStickerEditView.f109916L = (EditLyricStickerViewModel) C48927d.m105736a(fragmentActivity2).mo96760a(EditLyricStickerViewModel.class);
        infoStickerEditView.f109917M = (InfoStickerViewModel) C0214z.m440a(fragmentActivity2).mo359a(InfoStickerViewModel.class);
        infoStickerEditView.f109918N = (EditViewModel) C48927d.m105736a(fragmentActivity2).mo96760a(EditViewModel.class);
        infoStickerEditView.f109913I.f112701h = videoPublishEditModel;
        infoStickerEditView.mo88438a();
        if (this.f110147P != null) {
            C46723c cVar2 = this.f110147P;
            cVar2.f117867c.add(this.f110161d.getGestureListener());
        }
        this.f110138G.setVisibility(8);
        this.f110161d.setOnInfoStickerTimeEdit(new C43633k(this));
        this.f110161d.setOnInfoStickerPinEditClick(new C43644v(this));
        this.f110161d.setITimeEditListener(this);
        this.f110161d.setPinHelper(this.f110137F);
        this.f110154W.getViewTreeObserver().addOnGlobalLayoutListener(new C43491ac(this));
        if (this.f110147P != null) {
            this.f110174q = this.f110147P.getDeleteView();
        }
        if (this.f110158a) {
            this.f110174q.mo93815a();
        }
        if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableSubtitleRecognition)) {
            this.f110161d.setStickerOnPlayListener(new C43492ad(this));
        }
        this.f110161d.setStickerOnMoveListener(new C43545c() {
            /* renamed from: a */
            public final Float mo88668a(float f) {
                if (C43535i.this.f110180w != null) {
                    return BorderLineView.m95792a(f);
                }
                return Float.valueOf(f);
            }

            /* renamed from: a */
            public final int mo88666a(C43501am amVar, boolean z, boolean z2) {
                if (C43535i.this.f110180w == null) {
                    return -1;
                }
                if (z) {
                    C43535i.this.f110180w.mo88856a();
                } else if (amVar != null && !C43535i.this.mo88590a() && !C43535i.this.mo88591b()) {
                    return C43535i.this.f110180w.mo88854a(amVar.mo88513c((float) C43535i.this.f110177t), z2, false);
                }
                return -1;
            }

            /* renamed from: a */
            public final PointF mo88667a(C43501am amVar, float f, float f2) {
                if (C43535i.this.f110180w == null || amVar == null) {
                    return new PointF(0.0f, 0.0f);
                }
                PointF[] c = amVar.mo88513c((float) C43535i.this.f110177t);
                int length = c.length;
                for (int i = 0; i < length; i++) {
                    PointF pointF = c[i];
                    pointF.x += f;
                    pointF.y += f2;
                }
                return C43535i.this.f110180w.mo88855a(c, f, f2, false);
            }

            /* renamed from: a */
            public final void mo88669a(C43501am amVar, int i, int i2, boolean z, boolean z2, C43549b bVar) {
                boolean z3;
                boolean z4;
                boolean z5;
                boolean z6;
                String str;
                final C43501am amVar2 = amVar;
                int i3 = i;
                int i4 = i2;
                boolean z7 = z;
                C43549b bVar2 = bVar;
                float f = (float) (-C22452a.m55498d());
                boolean b = C43546a.m95606b(C43535i.this.f110181x, amVar2.mo88512b((float) C43535i.this.f110177t, f));
                if (!z2) {
                    if (z7 && ((C43535i.this.f110161d.f109936k == InfoStickerEditView.f109903l && !amVar2.f110020x) || (C43535i.this.f110161d.f109936k == InfoStickerEditView.f109904m && amVar2.f110020x))) {
                        C43535i.this.f110167j.mo43041c(amVar2.f110003d.f91605id, 1.0f);
                    }
                    if (C43535i.this.f110168k.f109961c == null || !((Boolean) C43535i.this.f110168k.f109961c.getValue()).booleanValue()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (C43535i.this.f110168k.f109962d == null || !((Boolean) C43535i.this.f110168k.f109962d.getValue()).booleanValue()) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (C43535i.this.f110169l.mo96879f().getValue() == null || !((Boolean) C43535i.this.f110169l.mo96879f().getValue()).booleanValue()) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (C43535i.this.f110168k == null || (!z3 && !z4 && !z5)) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (!z6) {
                        boolean a = C43546a.m95605a(C43535i.this.f110179v, amVar2.mo88512b((float) C43535i.this.f110177t, f));
                        if (C43535i.this.f110174q != null) {
                            int a2 = C43535i.this.f110174q.mo93814a(i3, i4, z7, a);
                            C43535i iVar = C43535i.this;
                            if (a2 == 1) {
                                if (iVar.f110167j != null) {
                                    iVar.f110167j.mo43041c(amVar2.f110003d.f91605id, 0.3137255f);
                                }
                            } else if (a2 == 3) {
                                if (iVar.f110161d != null) {
                                    InfoStickerEditView infoStickerEditView = iVar.f110161d;
                                    if (infoStickerEditView.f109937n != null) {
                                        infoStickerEditView.f109937n.mo88488a();
                                    }
                                    if (iVar.f110161d.f109932g != null) {
                                        iVar.f110161d.f109932g.mo88597a(amVar2);
                                        if (amVar2.f110003d != null) {
                                            C47702b bVar3 = C47702b.f120193a;
                                            String str2 = "prop_delete";
                                            C23089d a3 = C23089d.m56640a().mo47829a("creation_id", iVar.f110170m.creationId).mo47826a("draft_id", iVar.f110170m.draftId);
                                            String str3 = "enter_from";
                                            if (iVar.f110158a) {
                                                str = "edit_post_page";
                                            } else {
                                                str = "video_edit_page";
                                            }
                                            bVar3.mo94984a(str2, a3.mo47829a(str3, str).mo47829a("prop_id", amVar2.f110003d.stickerId).mo47829a("shoot_way", iVar.f110170m.mShootWay).f61491a);
                                        }
                                        iVar.f110161d.f109939p = true;
                                        if (amVar2 != null && amVar2.f110020x) {
                                            C43434az.m95208b(iVar.f110170m, "top_delete");
                                        }
                                    }
                                }
                            } else if (a2 == 4 && iVar.f110167j != null) {
                                iVar.f110167j.mo43041c(amVar2.f110003d.f91605id, 1.0f);
                            }
                        }
                    }
                }
                if (C43535i.this.f110174q != null) {
                    C43535i.this.f110174q.mo93816b(i3, i4, z7, b);
                    if (b) {
                        if (C43535i.this.f110167j != null) {
                            C43535i.this.f110167j.mo43041c(amVar2.f110003d.f91605id, 0.3137255f);
                        }
                    } else if (C43535i.this.f110167j != null) {
                        C43535i.this.f110167j.mo43041c(amVar2.f110003d.f91605id, 1.0f);
                    }
                }
                if (z7 && b) {
                    if (amVar2 == null || bVar2 == null) {
                        C43535i.this.f110161d.mo88457j();
                    } else {
                        StickerItemModel stickerItemModel = amVar2.f110003d;
                        final float f2 = (stickerItemModel.currentOffsetX - bVar2.f110203c) * ((float) C43535i.this.f110161d.f109928c);
                        final float f3 = (stickerItemModel.currentOffsetY - bVar2.f110204d) * ((float) C43535i.this.f110161d.f109929d);
                        final float f4 = bVar2.f110201a - stickerItemModel.rotateAngle;
                        final float f5 = bVar2.f110202b / stickerItemModel.scale;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                        ofFloat.setDuration(300).setInterpolator(new C43500al(1.8f));
                        C435381 r13 = r0;
                        final C43501am amVar3 = amVar;
                        C435381 r0 = new AnimatorUpdateListener() {

                            /* renamed from: a */
                            float f110186a;

                            /* renamed from: b */
                            float f110187b;

                            /* renamed from: c */
                            float f110188c;

                            /* renamed from: d */
                            float f110189d = 1.0f;

                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                float f = (-((Float) valueAnimator.getAnimatedValue()).floatValue()) * f2;
                                float f2 = (f3 * f) / f2;
                                C43535i.this.f110161d.f109932g.mo88599a(amVar3, f - this.f110186a, f2 - this.f110187b);
                                this.f110186a = f;
                                this.f110187b = f2;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f4;
                                C43535i.this.f110161d.f109932g.mo88598a(amVar3, floatValue - this.f110188c);
                                this.f110188c = floatValue;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f5;
                                if (floatValue2 != 0.0f) {
                                    C43530d dVar = C43535i.this.f110161d.f109932g;
                                    C43501am amVar = amVar3;
                                    float f3 = floatValue2 / this.f110189d;
                                    float f4 = amVar.f110003d.scale * f3;
                                    dVar.f110111e.mo43026b(amVar.f110003d.f91605id, f3);
                                    amVar.f110003d.scale = f4;
                                    amVar.mo88511b(f3);
                                    this.f110189d = floatValue2;
                                }
                            }
                        };
                        ofFloat.addUpdateListener(r13);
                        ofFloat.addListener(new AnimatorListener() {
                            public final void onAnimationCancel(Animator animator) {
                            }

                            public final void onAnimationRepeat(Animator animator) {
                            }

                            public final void onAnimationStart(Animator animator) {
                            }

                            public final void onAnimationEnd(Animator animator) {
                                C43535i.this.f110161d.mo88457j();
                            }
                        });
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.3137255f, 1.0f});
                        ofFloat2.setDuration(150).setInterpolator(new C43500al(1.8f));
                        ofFloat2.addUpdateListener(new AnimatorUpdateListener() {
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                C43535i.this.f110167j.mo43041c(amVar2.f110003d.f91605id, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                            }
                        });
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                        animatorSet.start();
                    }
                }
                if (C43535i.this.f110183z != null) {
                    C43535i.this.f110183z.mo88669a(amVar, i, i2, z, z2, null);
                }
                if (C43535i.this.mo88590a() || C43535i.this.mo88591b()) {
                    C43535i.this.f110167j.mo43089t();
                }
            }
        });
        this.f110161d.f109932g.f110119m = new C43493ae(this);
    }

    /* renamed from: a */
    public final C43501am mo88618a(String str, String str2, String str3, String str4, int i, String str5) {
        InfoStickerEditView infoStickerEditView = this.f110161d;
        C43530d dVar = infoStickerEditView.f109932g;
        C43501am a = dVar.mo88594a(str, str2, str4, 3, true, true);
        if (a != null) {
            dVar.f110111e.mo42977a(a.f110003d.f91605id, i, str5);
            if (!TextUtils.isEmpty(str3)) {
                dVar.f110111e.mo43031b(a.f110003d.f91605id, str3);
            }
        }
        infoStickerEditView.invalidate();
        return a;
    }
}
