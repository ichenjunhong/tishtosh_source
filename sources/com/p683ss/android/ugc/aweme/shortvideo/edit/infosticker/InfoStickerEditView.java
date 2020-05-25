package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.support.p030v4.p038f.C0794k;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.asve.p1241e.p1242a.C20382b;
import com.p683ss.android.ugc.asve.p1241e.p1242a.C20385c;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C43302dx;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43535i.C43544b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43535i.C43545c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43549b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2193e.C43460a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2227b.C44534d;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2227b.C44541f;
import com.p683ss.android.ugc.aweme.shortvideo.subtitle.C44858b;
import com.p683ss.android.ugc.aweme.shortvideo.subtitle.UtteranceWithWords;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C46722b;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.gamora.editor.EditInfoStickerViewModel;
import com.p683ss.android.ugc.gamora.editor.EditInfoStickerViewModel.C48951b;
import com.p683ss.android.ugc.gamora.editor.EditLyricStickerViewModel;
import com.p683ss.android.ugc.gamora.editor.EditLyricStickerViewModel.C48962h;
import com.p683ss.android.ugc.gamora.editor.EditViewModel;
import com.p683ss.android.vesdk.C50751p;
import com.p683ss.android.vesdk.VESize;
import java.util.Iterator;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView */
public class InfoStickerEditView extends View {

    /* renamed from: S */
    private static int f109902S = 3000;

    /* renamed from: l */
    public static int f109903l = 1;

    /* renamed from: m */
    public static int f109904m = 2;

    /* renamed from: A */
    public boolean f109905A = true;

    /* renamed from: B */
    public boolean f109906B;

    /* renamed from: C */
    public boolean f109907C;

    /* renamed from: D */
    public boolean f109908D;

    /* renamed from: E */
    public Context f109909E;

    /* renamed from: F */
    C43485c f109910F;

    /* renamed from: G */
    public boolean f109911G = false;

    /* renamed from: H */
    public boolean f109912H = C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableStickerFunctionalities);

    /* renamed from: I */
    public C44534d f109913I = new C44534d(this, new C43483a());

    /* renamed from: J */
    public PointF f109914J = new PointF();

    /* renamed from: K */
    EditInfoStickerViewModel f109915K;

    /* renamed from: L */
    public EditLyricStickerViewModel f109916L;

    /* renamed from: M */
    InfoStickerViewModel f109917M;

    /* renamed from: N */
    public EditViewModel f109918N;

    /* renamed from: O */
    C43460a f109919O;

    /* renamed from: P */
    public boolean f109920P = false;

    /* renamed from: Q */
    public C43549b f109921Q;

    /* renamed from: R */
    Runnable f109922R = new Runnable() {
        public final void run() {
            if (InfoStickerEditView.this.f109932g != null) {
                if (!(InfoStickerEditView.this.f109937n == null || InfoStickerEditView.this.f109937n.f109956a == null || !InfoStickerEditView.this.f109937n.f109956a.f110004e)) {
                    InfoStickerEditView.this.f109908D = false;
                    InfoStickerEditView.this.f109937n.f109956a.f110004e = false;
                    InfoStickerEditView.this.f109932g.mo88604b();
                    if (InfoStickerEditView.this.f109912H) {
                        InfoStickerEditView.this.f109913I.mo90465a();
                    }
                    InfoStickerEditView.this.invalidate();
                }
                if (InfoStickerEditView.this.f109937n != null && InfoStickerEditView.this.f109937n.f109956a != null && InfoStickerEditView.this.f109937n.f109956a.f110020x && InfoStickerEditView.this.f109912H) {
                    InfoStickerEditView.this.f109913I.mo90465a();
                }
            }
        }
    };

    /* renamed from: T */
    private Point f109923T;

    /* renamed from: U */
    private C23371a<C43501am> f109924U;

    /* renamed from: V */
    private C43529c f109925V;

    /* renamed from: a */
    public int f109926a;

    /* renamed from: b */
    public int f109927b;

    /* renamed from: c */
    public int f109928c;

    /* renamed from: d */
    public int f109929d;

    /* renamed from: e */
    public C20347c f109930e;

    /* renamed from: f */
    SafeHandler f109931f;

    /* renamed from: g */
    public C43530d f109932g;

    /* renamed from: h */
    VideoPublishEditModel f109933h;

    /* renamed from: i */
    public boolean f109934i = true;

    /* renamed from: j */
    C23371a<C43501am> f109935j;

    /* renamed from: k */
    public int f109936k;

    /* renamed from: n */
    public C43486d f109937n = new C43486d();

    /* renamed from: o */
    public int f109938o;

    /* renamed from: p */
    public boolean f109939p;

    /* renamed from: q */
    public long f109940q;

    /* renamed from: r */
    public boolean f109941r;

    /* renamed from: s */
    public boolean f109942s;

    /* renamed from: t */
    public float f109943t;

    /* renamed from: u */
    public float f109944u;

    /* renamed from: v */
    public float f109945v;

    /* renamed from: w */
    public float f109946w;

    /* renamed from: x */
    public C43545c f109947x;

    /* renamed from: y */
    C43544b f109948y;

    /* renamed from: z */
    public boolean f109949z = true;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView$a */
    class C43483a implements C44541f {
        /* renamed from: a */
        public final void mo88478a() {
            InfoStickerEditView.this.mo88455h();
        }

        /* renamed from: b */
        public final void mo88479b() {
            InfoStickerEditView.this.mo88451g();
        }

        /* renamed from: d */
        public final void mo88481d() {
            InfoStickerEditView infoStickerEditView = InfoStickerEditView.this;
            infoStickerEditView.f109932g.mo88597a(infoStickerEditView.f109937n.f109956a);
            C43434az.m95208b(infoStickerEditView.f109933h, "click_menu");
        }

        /* renamed from: e */
        public final void mo88482e() {
            C43530d dVar = InfoStickerEditView.this.f109932g;
            if (dVar.f110116j instanceof VEVideoPublishEditActivity) {
                ((VEVideoPublishEditActivity) dVar.f110116j).f109568w.mo97194c(false);
            }
        }

        /* renamed from: c */
        public final void mo88480c() {
            InfoStickerEditView infoStickerEditView = InfoStickerEditView.this;
            if (infoStickerEditView.f109937n.f109956a == null) {
                infoStickerEditView.setShowHelpBox(false);
                return;
            }
            infoStickerEditView.f109938o = 1;
            infoStickerEditView.f109937n.f109956a.f110004e = false;
            infoStickerEditView.f109932g.mo88607c();
            if (infoStickerEditView.f109935j != null) {
                infoStickerEditView.f109935j.run(infoStickerEditView.f109937n.f109956a);
            }
            C47702b.f120193a.mo94984a("prop_pin", C23089d.m56640a().mo47829a("enter_from", "video_edit_page").mo47829a("shoot_way", infoStickerEditView.f109933h.mShootWay).mo47829a("creation_id", infoStickerEditView.f109933h.creationId).mo47829a("content_type", infoStickerEditView.f109933h.getAvetParameter().getContentType()).mo47829a("content_source", infoStickerEditView.f109933h.getAvetParameter().getContentSource()).mo47829a("prop_id", infoStickerEditView.f109937n.f109956a.f110003d.stickerId).f61491a);
        }

        private C43483a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView$b */
    public interface C43484b {
        /* renamed from: a */
        float mo88483a(float f);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView$c */
    class C43485c extends C46722b {
        private C43485c() {
        }

        /* renamed from: a */
        public final boolean mo87819a(float f) {
            if (!InfoStickerEditView.this.f109934i) {
                return false;
            }
            if (InfoStickerEditView.this.f109937n.f109956a != null && InfoStickerEditView.this.mo88450f() && InfoStickerEditView.this.f109937n.f109956a.f110003d.isLyric()) {
                return false;
            }
            InfoStickerEditView.this.mo88458k();
            return false;
        }

        /* renamed from: b */
        public final void mo88486b(C20382b bVar) {
            if (InfoStickerEditView.this.f109934i) {
                if (InfoStickerEditView.this.f109937n.f109956a == null || !InfoStickerEditView.this.mo88450f() || !InfoStickerEditView.this.f109937n.f109956a.f110003d.isLyric()) {
                    InfoStickerEditView.this.f109947x.mo88666a(InfoStickerEditView.this.f109937n.f109956a, true, false);
                    InfoStickerEditView.this.mo88458k();
                }
            }
        }

        /* renamed from: c */
        public final boolean mo87831c(float f) {
            if (!InfoStickerEditView.this.f109934i) {
                return false;
            }
            if (InfoStickerEditView.this.f109937n.f109956a != null && InfoStickerEditView.this.mo88450f() && InfoStickerEditView.this.f109937n.f109956a.f110003d.isLyric()) {
                return false;
            }
            InfoStickerEditView.this.mo88458k();
            InfoStickerEditView.this.f109947x.mo88666a(InfoStickerEditView.this.f109937n.f109956a, true, true);
            return false;
        }

        /* renamed from: a */
        public final boolean mo87822a(ScaleGestureDetector scaleGestureDetector) {
            if (!InfoStickerEditView.this.f109934i) {
                return false;
            }
            if (InfoStickerEditView.this.f109937n.f109956a != null && InfoStickerEditView.this.mo88450f() && InfoStickerEditView.this.f109937n.f109956a.f110003d.isLyric()) {
                return false;
            }
            InfoStickerEditView.this.mo88439a(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            if (InfoStickerEditView.this.f109937n.f109956a == null) {
                return false;
            }
            InfoStickerEditView.this.f109907C = InfoStickerEditView.this.f109908D;
            InfoStickerEditView.this.f109932g.mo88604b();
            InfoStickerEditView.this.f109932g.mo88601a(InfoStickerEditView.this.f109937n.f109956a, true);
            InfoStickerEditView.this.f109937n.f109956a.f110004e = false;
            InfoStickerEditView.this.f109932g.mo88605b(InfoStickerEditView.this.f109937n.f109956a);
            InfoStickerEditView.this.invalidate();
            return true;
        }

        /* renamed from: b */
        public final boolean mo87826b(float f) {
            if (!InfoStickerEditView.this.f109934i) {
                return false;
            }
            if (InfoStickerEditView.this.f109937n.f109956a != null && InfoStickerEditView.this.mo88450f() && InfoStickerEditView.this.f109937n.f109956a.f110003d.isLyric()) {
                return false;
            }
            if (InfoStickerEditView.this.f109937n.f109956a == null) {
                return super.mo87826b(f);
            }
            InfoStickerEditView.this.f109938o = 2;
            float degrees = (float) Math.toDegrees((double) f);
            if (Math.abs(degrees) > 10.0f) {
                degrees = 0.0f;
            }
            if (4 == InfoStickerEditView.this.f109947x.mo88666a(InfoStickerEditView.this.f109937n.f109956a, false, true)) {
                degrees = InfoStickerEditView.this.f109947x.mo88668a(degrees).floatValue();
            }
            InfoStickerEditView.this.f109932g.mo88598a(InfoStickerEditView.this.f109937n.f109956a, -degrees);
            InfoStickerEditView.this.invalidate();
            return true;
        }

        /* renamed from: e */
        public final boolean mo88487e(MotionEvent motionEvent) {
            boolean z;
            if (InfoStickerEditView.this.f109941r) {
                InfoStickerEditView.this.f109941r = false;
                return true;
            } else if (!InfoStickerEditView.this.f109942s) {
                if (InfoStickerEditView.this.f109932g != null) {
                    float y = motionEvent.getY() - ((float) C22452a.m55498d());
                    C43530d dVar = InfoStickerEditView.this.f109932g;
                    int x = (int) motionEvent.getX();
                    int i = (int) y;
                    if (dVar.f110107a != null && dVar.f110107a.size() != 0) {
                        Iterator it = dVar.f110107a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C43501am) it.next()).f110008i.contains((float) x, (float) i)) {
                                    z = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        return true;
                    }
                }
                return false;
            } else if (!InfoStickerEditView.this.f109908D) {
                return false;
            } else {
                InfoStickerEditView.this.f109908D = false;
                return true;
            }
        }

        /* renamed from: a */
        public final boolean mo87823a(C20385c cVar) {
            if (!InfoStickerEditView.this.f109934i) {
                return false;
            }
            if (InfoStickerEditView.this.f109937n.f109956a != null && InfoStickerEditView.this.mo88450f() && InfoStickerEditView.this.f109937n.f109956a.f110003d.isLyric()) {
                return false;
            }
            InfoStickerEditView.this.mo88439a(cVar.f55902i, cVar.f55903j);
            if (InfoStickerEditView.this.f109937n.f109956a == null) {
                return super.mo87823a(cVar);
            }
            InfoStickerEditView.this.f109907C = InfoStickerEditView.this.f109908D;
            InfoStickerEditView.this.f109932g.mo88604b();
            InfoStickerEditView.this.f109932g.mo88601a(InfoStickerEditView.this.f109937n.f109956a, true);
            InfoStickerEditView.this.f109937n.f109956a.f110004e = false;
            InfoStickerEditView.this.f109932g.mo88605b(InfoStickerEditView.this.f109937n.f109956a);
            InfoStickerEditView.this.invalidate();
            return true;
        }

        /* renamed from: b */
        public final boolean mo87829b(ScaleGestureDetector scaleGestureDetector) {
            if (!InfoStickerEditView.this.f109934i) {
                return false;
            }
            if (InfoStickerEditView.this.f109937n.f109956a != null && InfoStickerEditView.this.mo88450f() && InfoStickerEditView.this.f109937n.f109956a.f110003d.isLyric()) {
                return false;
            }
            if (InfoStickerEditView.this.f109937n.f109956a == null) {
                return super.mo87829b(scaleGestureDetector);
            }
            InfoStickerEditView.this.f109938o = 2;
            InfoStickerEditView.this.f109932g.mo88606b(InfoStickerEditView.this.f109937n.f109956a, scaleGestureDetector.getScaleFactor());
            InfoStickerEditView.this.invalidate();
            return true;
        }

        /* renamed from: a */
        public final boolean mo88484a(C20382b bVar) {
            boolean z;
            C0794k kVar;
            int i;
            boolean z2;
            C20382b bVar2 = bVar;
            if (!InfoStickerEditView.this.f109934i) {
                return false;
            }
            float f = bVar2.f55897i.x;
            float f2 = bVar2.f55897i.y;
            float f3 = InfoStickerEditView.this.f109943t + f;
            float f4 = InfoStickerEditView.this.f109944u + f2;
            float abs = Math.abs(f3 - InfoStickerEditView.this.f109945v);
            float abs2 = Math.abs(f4 - InfoStickerEditView.this.f109946w);
            if ((abs < 5.0f && abs2 < 5.0f) || InfoStickerEditView.this.f109937n.f109956a == null || InfoStickerEditView.this.f109937n.f109956a.f110003d.isSubtitleRule() || ((InfoStickerEditView.this.f109936k == InfoStickerEditView.f109904m && !InfoStickerEditView.this.f109937n.f109956a.f110020x) || ((InfoStickerEditView.this.f109936k == InfoStickerEditView.f109903l && InfoStickerEditView.this.f109937n.f109956a.f110020x) || (InfoStickerEditView.this.mo88450f() && InfoStickerEditView.this.f109937n.f109956a.f110003d.isLyric())))) {
                return false;
            }
            C43534h hVar = null;
            C43545c cVar = InfoStickerEditView.this.f109947x;
            C43501am amVar = InfoStickerEditView.this.f109937n.f109956a;
            if (InfoStickerEditView.this.f109937n.f109957b == 3) {
                z = true;
            } else {
                z = false;
            }
            int a = cVar.mo88666a(amVar, false, z);
            if (3 == a) {
                PointF a2 = InfoStickerEditView.this.f109947x.mo88667a(InfoStickerEditView.this.f109937n.f109956a, f, f2);
                f = a2.x;
                float f5 = a2.y;
                float f6 = InfoStickerEditView.this.f109943t + a2.x;
                float f7 = f6;
                f4 = a2.y + InfoStickerEditView.this.f109944u;
                f2 = f5;
                f3 = f7;
            } else if (4 == a) {
                hVar = new C43534h(this);
            }
            if (InfoStickerEditView.this.f109937n.f109957b == 0 || InfoStickerEditView.this.f109937n.f109957b == 3) {
                if (InfoStickerEditView.this.f109947x != null) {
                    if (InfoStickerEditView.this.f109937n.f109956a.f110004e) {
                        InfoStickerEditView.this.f109907C = true;
                    }
                    C43545c cVar2 = InfoStickerEditView.this.f109947x;
                    C43501am amVar2 = InfoStickerEditView.this.f109937n.f109956a;
                    int i2 = (int) f3;
                    int i3 = (int) f4;
                    if (InfoStickerEditView.this.f109937n.f109957b == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cVar2.mo88669a(amVar2, i2, i3, false, z2, null);
                }
                InfoStickerEditView.this.f109943t = f3;
                InfoStickerEditView.this.f109944u = f4;
            }
            InfoStickerEditView.this.f109938o = 2;
            if (InfoStickerEditView.this.f109937n.f109957b == 3) {
                C43530d dVar = InfoStickerEditView.this.f109932g;
                C43501am amVar3 = InfoStickerEditView.this.f109937n.f109956a;
                amVar3.f110016t = System.currentTimeMillis();
                float centerX = amVar3.f110006g.centerX();
                float centerY = amVar3.f110006g.centerY();
                float centerX2 = amVar3.f110013q.centerX();
                float centerY2 = amVar3.f110013q.centerY();
                float f8 = f + centerX2;
                float f9 = f2 + centerY2;
                float f10 = centerX2 - centerX;
                float f11 = centerY2 - centerY;
                float f12 = f8 - centerX;
                float f13 = f9 - centerY;
                float sqrt = (float) Math.sqrt((double) ((f10 * f10) + (f11 * f11)));
                float sqrt2 = (float) Math.sqrt((double) ((f12 * f12) + (f13 * f13)));
                float f14 = sqrt2 / sqrt;
                double d = (double) (((f10 * f12) + (f11 * f13)) / (sqrt * sqrt2));
                if (d > 1.0d || d < -1.0d) {
                    kVar = C0794k.m2265a(Float.valueOf(f14), Float.valueOf(0.0f));
                } else {
                    float degrees = (float) Math.toDegrees(Math.acos(d));
                    if ((f10 * f13) - (f12 * f11) > 0.0f) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    float f15 = ((float) i) * degrees;
                    if (hVar != null) {
                        f15 = hVar.mo88483a(f15);
                    }
                    kVar = C0794k.m2265a(Float.valueOf(f14), Float.valueOf(f15));
                }
                dVar.mo88606b(amVar3, ((Float) kVar.f2711a).floatValue());
                dVar.mo88598a(amVar3, ((Float) kVar.f2712b).floatValue());
            } else if (InfoStickerEditView.this.f109937n.f109957b == 0) {
                InfoStickerEditView.this.f109932g.mo88599a(InfoStickerEditView.this.f109937n.f109956a, f, f2);
            }
            InfoStickerEditView.this.f109932g.mo88595a();
            InfoStickerEditView.this.invalidate();
            return true;
        }

        /* renamed from: c */
        public final boolean mo87832c(MotionEvent motionEvent) {
            int i;
            InfoStickerEditView.this.f109939p = false;
            float y = motionEvent.getY() - ((float) C22452a.m55498d());
            InfoStickerEditView.this.f109943t = motionEvent.getX();
            InfoStickerEditView.this.f109944u = y;
            InfoStickerEditView.this.f109945v = motionEvent.getX();
            InfoStickerEditView.this.f109946w = y;
            InfoStickerEditView.this.f109940q = System.currentTimeMillis();
            InfoStickerEditView.this.f109938o = -1;
            InfoStickerEditView.this.f109937n.mo88488a();
            if (InfoStickerEditView.this.f109934i) {
                InfoStickerEditView infoStickerEditView = InfoStickerEditView.this;
                float x = motionEvent.getX();
                if (infoStickerEditView.f109936k == InfoStickerEditView.f109904m || !C9414h.m18630a(infoStickerEditView.f109932g.f110107a)) {
                    for (C43501am amVar : infoStickerEditView.f109932g.f110107a) {
                        if (amVar.f110003d.isPin) {
                            infoStickerEditView.mo88440a(amVar);
                        }
                    }
                    int l = infoStickerEditView.f109930e.mo43073l();
                    for (C43501am amVar2 : infoStickerEditView.f109932g.f110107a) {
                        if (!amVar2.f110003d.isSubtitleRule() && ((infoStickerEditView.f109936k != InfoStickerEditView.f109904m || amVar2.f110020x) && ((infoStickerEditView.f109936k != InfoStickerEditView.f109903l || !amVar2.f110020x) && infoStickerEditView.f109932g.mo88603a(amVar2, l) && !infoStickerEditView.f109932g.mo88612e(amVar2)))) {
                            if (!infoStickerEditView.f109912H) {
                                if (amVar2.f110004e) {
                                    if (amVar2.f110014r.contains(x, y)) {
                                        i = 1;
                                    } else if (amVar2.f110015s.contains(x, y)) {
                                        i = 2;
                                    } else if (amVar2.f110013q.contains(x, y)) {
                                        i = 3;
                                    }
                                    if (i >= 0 && (infoStickerEditView.f109937n.f109956a == null || C43530d.m95498a(amVar2, infoStickerEditView.f109937n.f109956a) > 0)) {
                                        infoStickerEditView.f109937n.f109956a = amVar2;
                                        infoStickerEditView.f109937n.f109957b = i;
                                        infoStickerEditView.f109937n.f109958c = true;
                                    }
                                }
                                i = -1;
                                infoStickerEditView.f109937n.f109956a = amVar2;
                                infoStickerEditView.f109937n.f109957b = i;
                                infoStickerEditView.f109937n.f109958c = true;
                            }
                            if (infoStickerEditView.mo88445a(amVar2, x, y) && (infoStickerEditView.f109937n.f109956a == null || C43530d.m95498a(amVar2, infoStickerEditView.f109937n.f109956a) > 0)) {
                                infoStickerEditView.f109937n.f109956a = amVar2;
                                infoStickerEditView.f109937n.f109957b = 0;
                                infoStickerEditView.f109937n.f109958c = amVar2.f110004e;
                            }
                        }
                    }
                    if (!(infoStickerEditView.f109937n.f109956a == null || infoStickerEditView.f109919O == null)) {
                        if (infoStickerEditView.f109937n.f109956a.f110003d.isPin) {
                            C43460a aVar = infoStickerEditView.f109919O;
                            C43501am amVar3 = infoStickerEditView.f109937n.f109956a;
                            C52711k.m112240b(amVar3, "item");
                            aVar.f109858k.mo43076m(amVar3.f110003d.f91605id);
                            infoStickerEditView.mo88440a(infoStickerEditView.f109937n.f109956a);
                            infoStickerEditView.f109937n.f109956a.f110003d.setPin(false);
                            C48016e.m103947c(infoStickerEditView.f109937n.f109956a.f110003d.pinAlgorithmFile);
                            infoStickerEditView.f109937n.f109956a.f110003d.setPinAlgorithmFile(null);
                        } else if (!TextUtils.isEmpty(infoStickerEditView.f109937n.f109956a.f110003d.pinAlgorithmFile) && C48016e.m103944b(infoStickerEditView.f109937n.f109956a.f110003d.pinAlgorithmFile)) {
                            C48016e.m103947c(infoStickerEditView.f109937n.f109956a.f110003d.pinAlgorithmFile);
                            infoStickerEditView.f109937n.f109956a.f110003d.setPinAlgorithmFile(null);
                        }
                    }
                    if (infoStickerEditView.f109936k == InfoStickerEditView.f109904m && infoStickerEditView.f109937n.f109956a == null) {
                        infoStickerEditView.f109948y.mo88497a();
                    }
                    if (infoStickerEditView.f109937n.f109956a == null || !((Boolean) infoStickerEditView.f109917M.f109961c.getValue()).booleanValue() || !infoStickerEditView.f109937n.f109956a.f110003d.isLyric()) {
                        infoStickerEditView.f109932g.mo88610d(infoStickerEditView.f109937n.f109956a);
                    }
                    if (!(infoStickerEditView.f109937n == null || infoStickerEditView.f109937n.f109956a == null)) {
                        infoStickerEditView.f109921Q = infoStickerEditView.mo88459l();
                    }
                }
            }
            if ((InfoStickerEditView.this.f109937n.f109956a == null || !InfoStickerEditView.this.mo88450f() || !InfoStickerEditView.this.f109937n.f109956a.f110003d.isLyric()) && InfoStickerEditView.this.f109937n != null && InfoStickerEditView.this.f109937n.f109956a != null && InfoStickerEditView.this.f109937n.f109956a.f110003d.isLyric()) {
                InfoStickerEditView.this.f109930e.mo42987a(InfoStickerEditView.this.f109937n.f109956a.f110003d.f91605id, true);
                InfoStickerEditView.this.f109911G = true;
            }
            return false;
        }

        /* renamed from: d */
        public final boolean mo87834d(MotionEvent motionEvent) {
            boolean z;
            boolean z2 = false;
            InfoStickerEditView.this.f109920P = false;
            InfoStickerEditView.this.f109914J.set(motionEvent.getRawX(), motionEvent.getRawY());
            if (!InfoStickerEditView.this.f109934i) {
                return false;
            }
            if (InfoStickerEditView.this.f109937n.f109956a != null && InfoStickerEditView.this.mo88450f() && InfoStickerEditView.this.f109937n.f109956a.f110003d.isLyric()) {
                return false;
            }
            if (InfoStickerEditView.this.f109937n.f109956a != null && InfoStickerEditView.this.f109937n.f109956a.f110003d.isLyric()) {
                InfoStickerEditView.this.f109930e.mo42987a(InfoStickerEditView.this.f109937n.f109956a.f110003d.f91605id, false);
                InfoStickerEditView.this.f109911G = false;
            }
            if (InfoStickerEditView.this.f109937n.f109956a != null && InfoStickerEditView.this.f109937n.f109956a.f110003d.isLyric() && InfoStickerEditView.this.f109916L.mo96879f().getValue() != null && ((Boolean) InfoStickerEditView.this.f109916L.mo96879f().getValue()).booleanValue()) {
                return true;
            }
            if (!(InfoStickerEditView.this.f109947x == null || InfoStickerEditView.this.f109937n.f109956a == null || (InfoStickerEditView.this.f109937n.f109957b != 0 && InfoStickerEditView.this.f109937n.f109957b != 3))) {
                C43545c cVar = InfoStickerEditView.this.f109947x;
                C43501am amVar = InfoStickerEditView.this.f109937n.f109956a;
                int i = (int) InfoStickerEditView.this.f109943t;
                int i2 = (int) InfoStickerEditView.this.f109944u;
                if (InfoStickerEditView.this.f109937n.f109957b == 3) {
                    z = true;
                } else {
                    z = false;
                }
                cVar.mo88669a(amVar, i, i2, true, z, InfoStickerEditView.this.f109921Q);
                if ((InfoStickerEditView.this.f109937n.f109956a == null || (InfoStickerEditView.this.f109937n.f109956a != null && !InfoStickerEditView.this.f109937n.f109956a.f110003d.isLyric())) && InfoStickerEditView.this.f109907C) {
                    InfoStickerEditView.this.f109907C = false;
                    if (!InfoStickerEditView.this.f109912H) {
                        InfoStickerEditView.this.setShowHelpBox(true);
                    }
                }
            }
            if (System.currentTimeMillis() - InfoStickerEditView.this.f109940q < 200) {
                if (InfoStickerEditView.this.f109937n.f109956a == null) {
                    InfoStickerEditView infoStickerEditView = InfoStickerEditView.this;
                    C43530d dVar = InfoStickerEditView.this.f109932g;
                    if (dVar.f110108b != null) {
                        z2 = true;
                    }
                    dVar.mo88604b();
                    infoStickerEditView.f109942s = z2;
                    if (InfoStickerEditView.this.f109912H) {
                        InfoStickerEditView.this.f109913I.mo90467b();
                    }
                    InfoStickerEditView.this.invalidate();
                } else {
                    InfoStickerEditView.this.f109942s = false;
                    switch (InfoStickerEditView.this.f109937n.f109957b) {
                        case 0:
                            InfoStickerEditView.this.mo88451g();
                            break;
                        case 1:
                            InfoStickerEditView.this.f109941r = true;
                            InfoStickerEditView.this.f109938o = 1;
                            InfoStickerEditView.this.f109932g.mo88597a(InfoStickerEditView.this.f109937n.f109956a);
                            break;
                        case 2:
                            InfoStickerEditView.this.mo88455h();
                            break;
                    }
                    InfoStickerEditView.this.f109932g.mo88595a();
                    InfoStickerEditView.this.mo88458k();
                    InfoStickerEditView.this.invalidate();
                }
                if (!InfoStickerEditView.this.f109908D) {
                    InfoStickerEditView.this.mo88456i();
                    if (!(InfoStickerEditView.this.f109937n == null || InfoStickerEditView.this.f109937n.f109956a == null)) {
                        InfoStickerEditView.this.f109937n.mo88488a();
                    }
                }
                if (InfoStickerEditView.this.f109909E instanceof VEVideoPublishEditActivity) {
                    VEVideoPublishEditActivity vEVideoPublishEditActivity = (VEVideoPublishEditActivity) InfoStickerEditView.this.f109909E;
                    if (!(InfoStickerEditView.this.f109916L == null || InfoStickerEditView.this.f109916L.mo96879f().getValue() == null || !((Boolean) InfoStickerEditView.this.f109916L.mo96879f().getValue()).booleanValue())) {
                        vEVideoPublishEditActivity.f109568w.mo97168O().f123748t.mo89535G();
                        InfoStickerEditView.this.f109920P = true;
                    }
                }
                return true;
            }
            if (!InfoStickerEditView.this.f109908D) {
                InfoStickerEditView.this.mo88456i();
                if (!(InfoStickerEditView.this.f109937n == null || InfoStickerEditView.this.f109937n.f109956a == null)) {
                    InfoStickerEditView.this.f109937n.mo88488a();
                }
            }
            return super.mo87834d(motionEvent);
        }

        /* renamed from: a */
        public final boolean mo88485a(C20382b bVar, float f, float f2) {
            float d = f2 - ((float) C22452a.m55498d());
            if (!InfoStickerEditView.this.f109934i) {
                return false;
            }
            if (InfoStickerEditView.this.f109937n.f109956a != null && InfoStickerEditView.this.mo88450f() && InfoStickerEditView.this.f109937n.f109956a.f110003d.isLyric()) {
                return false;
            }
            if (InfoStickerEditView.this.f109937n.f109956a == null) {
                InfoStickerEditView.this.mo88439a(f, d);
            }
            if (InfoStickerEditView.this.f109937n.f109956a == null) {
                return false;
            }
            if (InfoStickerEditView.this.f109937n.f109957b == 3 || InfoStickerEditView.this.f109937n.f109957b == 0) {
                InfoStickerEditView.this.f109907C = InfoStickerEditView.this.f109908D;
                InfoStickerEditView.this.f109932g.mo88604b();
                if (InfoStickerEditView.this.f109912H) {
                    InfoStickerEditView.this.f109913I.mo90467b();
                }
                InfoStickerEditView.this.f109932g.mo88601a(InfoStickerEditView.this.f109937n.f109956a, true);
                InfoStickerEditView.this.f109937n.f109956a.f110004e = false;
                InfoStickerEditView.this.f109932g.mo88605b(InfoStickerEditView.this.f109937n.f109956a);
            }
            InfoStickerEditView.this.invalidate();
            return true;
        }

        /* renamed from: a */
        public final boolean mo87821a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (InfoStickerEditView.this.f109934i && InfoStickerEditView.this.f109937n.f109956a != null) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo87828b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z;
            if (!InfoStickerEditView.this.f109934i) {
                return false;
            }
            if (InfoStickerEditView.this.f109937n.f109956a != null && InfoStickerEditView.this.mo88450f() && InfoStickerEditView.this.f109937n.f109956a.f110003d.isLyric()) {
                return false;
            }
            StringBuilder sb = new StringBuilder("onFling: ");
            if (InfoStickerEditView.this.f109937n.f109956a == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            if (InfoStickerEditView.this.f109939p) {
                InfoStickerEditView.this.f109939p = false;
                return true;
            } else if (InfoStickerEditView.this.f109937n.f109956a != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView$d */
    static class C43486d {

        /* renamed from: a */
        C43501am f109956a;

        /* renamed from: b */
        int f109957b;

        /* renamed from: c */
        boolean f109958c;

        C43486d() {
        }

        /* renamed from: a */
        public final void mo88488a() {
            this.f109956a = null;
        }
    }

    /* renamed from: b */
    public final void mo88446b() {
        mo88447c();
    }

    /* renamed from: d */
    public final void mo88448d() {
        mo88447c();
    }

    public C43485c getGestureListener() {
        return this.f109910F;
    }

    public C43460a getPinHelper() {
        return this.f109919O;
    }

    /* renamed from: j */
    public final void mo88457j() {
        this.f109921Q = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo88445a(C43501am amVar, float f, float f2) {
        if (amVar == null || amVar.f110008i == null) {
            return false;
        }
        if (this.f109923T == null) {
            this.f109923T = new Point(0, 0);
        }
        this.f109923T.set((int) f, (int) f2);
        if (amVar.f110003d.isLyric() && !this.f109911G) {
            try {
                float[] h = this.f109930e.mo43065h(amVar.f110003d.f91605id);
                VESize b = this.f109930e.mo43037b();
                RectF rectF = new RectF();
                rectF.set(h[0] * ((float) b.width), h[3] * ((float) b.height), h[2] * ((float) b.width), h[1] * ((float) b.height));
                float[] fArr = new float[2];
                this.f109930e.mo42988a(amVar.f110003d.f91605id, fArr);
                int i = this.f109928c;
                int i2 = this.f109929d;
                int i3 = this.f109926a;
                int i4 = this.f109927b;
                float f3 = fArr[0];
                float f4 = fArr[1];
                float width = rectF.width();
                float height = rectF.height();
                amVar.f110019w = 1.0f;
                float f5 = ((((float) i) * f3) - (width / 2.0f)) + ((float) i3);
                float f6 = ((((float) i2) * f4) - (height / 2.0f)) + ((float) i4);
                amVar.f110006g = new RectF(f5, f6, f5 + width, f6 + height);
                amVar.f110009j = new Matrix();
                if (amVar.f110020x) {
                    amVar.f110001b = 0.5f;
                    amVar.f110002c = 3.0f;
                } else {
                    amVar.f110001b = Math.max(C43501am.f109993a / width, C43501am.f109993a / height);
                }
                amVar.f110008i = new RectF(amVar.f110006g);
                amVar.mo88510b();
                amVar.mo88507a(amVar.f110008i);
                RectF rectF2 = amVar.f110008i;
                rectF2.centerX();
                rectF2.centerY();
                this.f109932g.f110118l = fArr;
            } catch (C50751p unused) {
                StringBuilder sb = new StringBuilder("getInfoStickerBoundingBox error in detectInItemContent, index is ");
                sb.append(amVar.f110003d.f91605id);
                sb.append(" veState is ");
                sb.append(this.f109930e.mo43063g().getValue());
                C45407ay.m98971b(sb.toString());
                return false;
            }
        }
        Point point = this.f109923T;
        float centerX = amVar.f110008i.centerX();
        float centerY = amVar.f110008i.centerY();
        double d = (double) (-amVar.mo88518f());
        float sin = (float) Math.sin(Math.toRadians(d));
        float cos = (float) Math.cos(Math.toRadians(d));
        point.set((int) ((((((float) point.x) - centerX) * cos) + centerX) - ((((float) point.y) - centerY) * sin)), (int) (centerY + ((((float) point.y) - centerY) * cos) + ((((float) point.x) - centerX) * sin)));
        return amVar.f110008i.contains((float) this.f109923T.x, (float) this.f109923T.y);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo88447c() {
        this.f109932g.mo88611e();
        invalidate();
    }

    /* renamed from: k */
    public final void mo88458k() {
        this.f109931f.postDelayed(new C43533g(this), 300);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f109913I.mo90471f();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f109913I.mo90472g();
    }

    /* renamed from: e */
    public final void mo88449e() {
        this.f109908D = false;
        for (C43501am amVar : this.f109932g.f110107a) {
            amVar.f110004e = false;
        }
        invalidate();
    }

    public int getStickNumber() {
        int i = 0;
        for (C43501am amVar : this.f109932g.f110107a) {
            if (!amVar.f110020x) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public C43549b mo88459l() {
        StickerItemModel stickerItemModel = this.f109937n.f109956a.f110003d;
        return new C43549b(stickerItemModel.rotateAngle, stickerItemModel.scale, stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY);
    }

    /* renamed from: f */
    public final boolean mo88450f() {
        boolean z;
        boolean z2;
        if (this.f109917M == null || this.f109917M.f109961c == null) {
            z = false;
        } else {
            z = ((Boolean) this.f109917M.f109961c.getValue()).booleanValue();
        }
        if (!z) {
            if (this.f109917M == null || this.f109917M.f109962d == null) {
                z2 = false;
            } else {
                z2 = ((Boolean) this.f109917M.f109962d.getValue()).booleanValue();
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public final void mo88455h() {
        if (this.f109937n.f109956a == null) {
            setShowHelpBox(false);
            return;
        }
        if (this.f109949z) {
            this.f109938o = 1;
            C43530d dVar = this.f109932g;
            this.f109937n.f109956a.f110004e = false;
            dVar.mo88604b();
            C43502an.m95361a().setValue(Integer.valueOf(0));
            this.f109932g.mo88607c();
            if (this.f109924U != null) {
                this.f109924U.run(this.f109937n.f109956a);
            }
        }
    }

    /* renamed from: i */
    public final boolean mo88456i() {
        if (this.f109938o == 1) {
            return true;
        }
        if (!(this.f109937n == null || this.f109937n.f109956a == null || this.f109937n.f109957b == 1)) {
            if (this.f109937n.f109958c) {
                this.f109932g.mo88601a(this.f109937n.f109956a, true);
                invalidate();
            } else {
                this.f109932g.mo88608c(this.f109937n.f109956a);
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo88438a() {
        int i;
        if ((this.f109928c == 0 || this.f109929d == 0) && this.f109930e != null) {
            VESize b = this.f109930e.mo43037b();
            this.f109928c = b.width;
            this.f109929d = b.height;
            this.f109926a = (C43303dy.m94971b(getContext()) - this.f109928c) >> 1;
            if (C43302dx.m94966a(this.f109928c, this.f109929d)) {
                i = 0;
            } else {
                i = (((C43303dy.m94974e(getContext()) - C22452a.m55500f()) - C22452a.m55498d()) - this.f109929d) / 2;
            }
            this.f109927b = i;
        }
    }

    /* renamed from: g */
    public final void mo88451g() {
        boolean z;
        boolean z2;
        StringBuilder sb = new StringBuilder(" onClickContent");
        if (this.f109937n.f109956a == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(" ");
        if (this.f109937n.f109956a == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sb.append(z2);
        sb.append(" ");
        sb.append(!this.f109937n.f109956a.f110003d.isLyric());
        if (this.f109937n.f109956a == null || !this.f109937n.f109956a.f110003d.isLyric()) {
            if (this.f109913I != null) {
                this.f109913I.f112687a = this.f109937n.f109956a.f110020x;
                if (this.f109937n.f109956a.f110020x) {
                    VideoPublishEditModel videoPublishEditModel = this.f109933h;
                    C52711k.m112240b(videoPublishEditModel, "model");
                    C26890h.m65011a("click_subtitle_menu", C23089d.m56640a().mo47829a("enter_from", "video_edit_page").mo47829a("shoot_way", videoPublishEditModel.mShootWay).mo47829a("creation_id", videoPublishEditModel.creationId).mo47829a("content_source", C43434az.m95207b(videoPublishEditModel)).mo47829a("content_type", C43434az.m95202a(videoPublishEditModel)).f61491a);
                }
            }
            setShowHelpBox(true);
        }
        this.f109938o = 1;
        C43530d dVar = this.f109932g;
        C43501am amVar = this.f109937n.f109956a;
        if (!amVar.f110003d.isLyric()) {
            if (amVar.f110020x) {
                if (dVar.f110108b != amVar) {
                    dVar.mo88604b();
                }
                if (dVar.f110114h != null && !amVar.f110003d.isSubtitleRule()) {
                    dVar.f110114h.mo90917a(amVar.f110003d.f91605id);
                }
            } else {
                if (dVar.f110113g != null) {
                    dVar.f110113g.mo93592a(false);
                }
                if (dVar.f110108b != amVar) {
                    dVar.mo88604b();
                    dVar.f110108b = amVar;
                }
                dVar.f110108b.f110004e = dVar.f110108b.mo88508a();
                dVar.f110111e.mo43029b(dVar.f110108b.f110003d.f91605id, 0, dVar.f110109c);
            }
        }
        EditInfoStickerViewModel editInfoStickerViewModel = this.f109915K;
        StickerItemModel stickerItemModel = this.f109937n.f109956a.f110003d;
        C52711k.m112240b(stickerItemModel, "item");
        editInfoStickerViewModel.mo22530c(new C48951b(stickerItemModel));
    }

    public void setHavePinEdit(boolean z) {
        this.f109905A = z;
    }

    public void setHaveTimeEdit(boolean z) {
        this.f109949z = z;
    }

    public void setITimeEditListener(C43529c cVar) {
        this.f109925V = cVar;
    }

    public void setOnInfoStickerPinEditClick(C23371a<C43501am> aVar) {
        this.f109935j = aVar;
    }

    public void setOnInfoStickerTimeEdit(C23371a<C43501am> aVar) {
        this.f109924U = aVar;
    }

    public void setPinHelper(C43460a aVar) {
        this.f109919O = aVar;
    }

    public void setStickerOnMoveListener(C43545c cVar) {
        this.f109947x = cVar;
    }

    public void setStickerOnPlayListener(C43544b bVar) {
        this.f109948y = bVar;
    }

    public void setStickerDataChangeListener(C43510b bVar) {
        this.f109932g.f110112f = bVar;
    }

    public void setSubtitleCallBack(C44858b bVar) {
        this.f109932g.f110114h = bVar;
    }

    /* renamed from: a */
    public final void mo88443a(boolean z) {
        if (z) {
            this.f109932g.mo88611e();
        } else {
            this.f109932g.mo88607c();
        }
    }

    public void setDefaultColor(int i) {
        this.f109916L.mo96877b(Integer.valueOf(i));
    }

    public void setLyricItem(C43501am amVar) {
        this.f109916L.mo22530c(new C48962h(amVar));
    }

    /* renamed from: a */
    public final int mo88436a(StickerItemModel stickerItemModel) {
        C43530d dVar = this.f109932g;
        if (stickerItemModel == null) {
            return -1;
        }
        int u = dVar.f110111e.mo43091u();
        dVar.f110111e.mo43029b(u, stickerItemModel.startTime, stickerItemModel.endTime);
        stickerItemModel.f91605id = u;
        dVar.mo88593a(u, stickerItemModel);
        return u;
    }

    public InfoStickerEditView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final int mo88437a(UtteranceWithWords utteranceWithWords) {
        C43530d dVar = this.f109932g;
        int u = dVar.f110111e.mo43091u();
        dVar.f110111e.mo43029b(u, utteranceWithWords.getStartTime(), utteranceWithWords.getEndTime());
        StickerItemModel a = dVar.mo88592a(u, utteranceWithWords.getStartTime(), utteranceWithWords.getEndTime(), utteranceWithWords.getInitWidth(), utteranceWithWords.getInitHeight(), "subtitle_rule", utteranceWithWords.getText(), 1.0f, 0.75f);
        if (a == null) {
            return -1;
        }
        return dVar.f110107a.indexOf(dVar.mo88593a(u, a));
    }

    public void setShowHelpBox(boolean z) {
        boolean z2;
        this.f109908D = z;
        if (!(this.f109937n == null || this.f109937n.f109956a == null || this.f109937n.f109956a.f110020x)) {
            C43501am amVar = this.f109937n.f109956a;
            if (!this.f109937n.f109956a.mo88508a() || !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            amVar.f110004e = z2;
        }
        if (!(this.f109922R == null || this.f109931f == null)) {
            this.f109931f.removeCallbacks(this.f109922R);
        }
        if (z && this.f109931f != null) {
            this.f109931f.postDelayed(this.f109922R, (long) f109902S);
        }
        if (this.f109912H) {
            if (!z) {
                this.f109913I.mo90467b();
            } else if (this.f109925V != null && !this.f109925V.mo88590a() && !this.f109925V.mo88591b()) {
                this.f109913I.mo90466a(this.f109937n.f109956a.f110008i, (int) this.f109914J.x, (int) this.f109914J.y, this.f109937n.f109956a.mo88518f());
            }
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (C43501am amVar : this.f109932g.f110107a) {
            amVar.f110017u = this.f109949z;
            if (!(amVar.f110008i == null || amVar.f110010n == null || amVar.f110011o == null || amVar.f110012p == null)) {
                int d = C22452a.m55498d();
                RectF rectF = amVar.f110008i;
                float f = (float) d;
                rectF.top += f;
                amVar.f110008i.bottom += f;
                amVar.f110010n.top += f;
                amVar.f110010n.bottom += f;
                amVar.f110011o.top += f;
                amVar.f110011o.bottom += f;
                amVar.f110012p.top += f;
                amVar.f110012p.bottom += f;
                if (amVar.f110004e) {
                    canvas.save();
                    canvas.rotate(amVar.f110003d.rotateAngle, amVar.f110008i.centerX(), amVar.f110008i.centerY());
                    if (amVar.f110021y) {
                        canvas.drawRect(amVar.f110008i, amVar.f110005f);
                    } else {
                        canvas.drawRect(amVar.f110008i, amVar.f110005f);
                        canvas.drawBitmap(C43501am.f109994k, amVar.f110007h, amVar.f110010n, null);
                        canvas.drawBitmap(C43501am.f109995l, amVar.f110007h, amVar.f110011o, null);
                        if (amVar.f110017u) {
                            canvas.drawBitmap(C43501am.f109996m, amVar.f110007h, amVar.f110012p, null);
                        }
                    }
                    canvas.restore();
                    amVar.f110016t = System.currentTimeMillis();
                }
                float width = amVar.f110006g.width() / 2.0f;
                float height = amVar.f110006g.height() / 2.0f;
                float centerX = amVar.f110006g.centerX();
                float centerY = amVar.f110006g.centerY();
                float f2 = centerX - width;
                float f3 = centerY - height;
                amVar.f110018v[0].set(f2, f3);
                float f4 = centerX + width;
                amVar.f110018v[1].set(f4, f3);
                float f5 = centerY + height;
                amVar.f110018v[2].set(f4, f5);
                amVar.f110018v[3].set(f2, f5);
                amVar.f110008i.top -= f;
                amVar.f110008i.bottom -= f;
                amVar.f110010n.top -= f;
                amVar.f110010n.bottom -= f;
                amVar.f110011o.top -= f;
                amVar.f110011o.bottom -= f;
                amVar.f110012p.top -= f;
                amVar.f110012p.bottom -= f;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo88440a(C43501am amVar) {
        try {
            float[] g = this.f109930e.mo43064g(amVar.f110003d.f91605id);
            float f = -this.f109930e.mo43081p(amVar.f110003d.f91605id);
            float o = this.f109930e.mo43079o(amVar.f110003d.f91605id);
            if (o > 0.0f) {
                amVar.f110003d.scale = o;
                amVar.mo88511b(o / amVar.f110019w);
            }
            amVar.f110003d.rotateAngle = f;
            amVar.mo88505a(f - amVar.mo88518f());
            RectF rectF = amVar.f110006g;
            float centerX = (((((g[2] - g[0]) / 2.0f) + g[0]) * ((float) this.f109928c)) + ((float) this.f109926a)) - rectF.centerX();
            float centerY = (((((g[1] - g[3]) / 2.0f) + g[3]) * ((float) this.f109929d)) + ((float) this.f109927b)) - rectF.centerY();
            amVar.mo88506a(centerX, centerY);
            amVar.f110003d.currentOffsetX += centerX / ((float) this.f109928c);
            amVar.f110003d.currentOffsetY += centerY / ((float) this.f109929d);
            this.f109930e.mo42969a(amVar.f110003d.f91605id, amVar.f110003d.currentOffsetX, amVar.f110003d.currentOffsetY);
        } catch (C50751p e) {
            C32458a.m75148a((Throwable) new RuntimeException("restorePinStickerPositionImpl: ", e));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88442a(java.util.List<com.p683ss.android.ugc.aweme.shortvideo.subtitle.UtteranceWithWords> r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.d r12 = r0.f109932g
            java.util.concurrent.ConcurrentHashMap r2 = com.p683ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule.m97952aa()
            int r2 = r2.size()
            r3 = 1
            if (r2 != r3) goto L_0x0046
            java.util.concurrent.ConcurrentHashMap r2 = com.p683ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule.m97952aa()
            java.util.Set r3 = r2.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x001d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0046
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r2.get(r4)
            com.ss.android.ugc.aweme.infosticker.StickerItemModel r4 = (com.p683ss.android.ugc.aweme.infosticker.StickerItemModel) r4
            if (r4 == 0) goto L_0x001d
            boolean r5 = r4.isSubtitleRule()
            if (r5 == 0) goto L_0x001d
            float r2 = r4.scale
            float r3 = r4.currentOffsetY
            r13 = r2
            r14 = r3
            goto L_0x004e
        L_0x0046:
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1061158912(0x3f400000, float:0.75)
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 1061158912(0x3f400000, float:0.75)
        L_0x004e:
            r2 = 0
            r15 = 0
        L_0x0050:
            int r2 = r17.size()
            if (r15 >= r2) goto L_0x00bc
            com.ss.android.ugc.asve.c.c r2 = r12.f110111e
            int r11 = r2.mo43091u()
            com.ss.android.ugc.asve.c.c r2 = r12.f110111e
            java.lang.Object r3 = r1.get(r15)
            com.ss.android.ugc.aweme.shortvideo.subtitle.UtteranceWithWords r3 = (com.p683ss.android.ugc.aweme.shortvideo.subtitle.UtteranceWithWords) r3
            int r3 = r3.getStartTime()
            java.lang.Object r4 = r1.get(r15)
            com.ss.android.ugc.aweme.shortvideo.subtitle.UtteranceWithWords r4 = (com.p683ss.android.ugc.aweme.shortvideo.subtitle.UtteranceWithWords) r4
            int r4 = r4.getEndTime()
            r2.mo43029b(r11, r3, r4)
            java.lang.Object r2 = r1.get(r15)
            com.ss.android.ugc.aweme.shortvideo.subtitle.UtteranceWithWords r2 = (com.p683ss.android.ugc.aweme.shortvideo.subtitle.UtteranceWithWords) r2
            int r4 = r2.getStartTime()
            java.lang.Object r2 = r1.get(r15)
            com.ss.android.ugc.aweme.shortvideo.subtitle.UtteranceWithWords r2 = (com.p683ss.android.ugc.aweme.shortvideo.subtitle.UtteranceWithWords) r2
            int r5 = r2.getEndTime()
            java.lang.Object r2 = r1.get(r15)
            com.ss.android.ugc.aweme.shortvideo.subtitle.UtteranceWithWords r2 = (com.p683ss.android.ugc.aweme.shortvideo.subtitle.UtteranceWithWords) r2
            int r6 = r2.getInitWidth()
            java.lang.Object r2 = r1.get(r15)
            com.ss.android.ugc.aweme.shortvideo.subtitle.UtteranceWithWords r2 = (com.p683ss.android.ugc.aweme.shortvideo.subtitle.UtteranceWithWords) r2
            int r7 = r2.getInitHeight()
            java.lang.String r8 = "subtitle"
            java.lang.Object r2 = r1.get(r15)
            com.ss.android.ugc.aweme.shortvideo.subtitle.UtteranceWithWords r2 = (com.p683ss.android.ugc.aweme.shortvideo.subtitle.UtteranceWithWords) r2
            java.lang.String r9 = r2.getText()
            r2 = r12
            r3 = r11
            r10 = r13
            r0 = r11
            r11 = r14
            com.ss.android.ugc.aweme.infosticker.StickerItemModel r2 = r2.mo88592a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r2 == 0) goto L_0x00bc
            r12.mo88593a(r0, r2)
            int r15 = r15 + 1
            r0 = r16
            goto L_0x0050
        L_0x00bc:
            r16.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView.mo88442a(java.util.List):void");
    }

    public InfoStickerEditView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo88439a(float f, float f2) {
        if (!C9414h.m18630a(this.f109932g.f110107a)) {
            int l = this.f109930e.mo43073l();
            for (C43501am amVar : this.f109932g.f110107a) {
                if (!amVar.f110003d.isSubtitleRule() && ((this.f109936k != f109904m || amVar.f110020x) && ((this.f109936k != f109903l || !amVar.f110020x) && this.f109932g.mo88603a(amVar, l) && !this.f109932g.mo88612e(amVar) && mo88445a(amVar, f, f2)))) {
                    if (this.f109937n.f109956a == null || C43530d.m95498a(amVar, this.f109937n.f109956a) > 0) {
                        this.f109937n.f109956a = amVar;
                        this.f109937n.f109957b = 0;
                        this.f109937n.f109958c = amVar.f110004e;
                    }
                }
            }
            this.f109932g.mo88610d(this.f109937n.f109956a);
            if (!(this.f109937n == null || this.f109937n.f109956a == null)) {
                this.f109921Q = mo88459l();
            }
        }
    }

    /* renamed from: a */
    public final void mo88444a(boolean z, boolean z2) {
        C43530d dVar = this.f109932g;
        if (!C9414h.m18630a(dVar.f110107a)) {
            Iterator it = dVar.f110107a.iterator();
            while (it.hasNext()) {
                C43501am amVar = (C43501am) it.next();
                if (z || !amVar.f110003d.isLyric()) {
                    dVar.f110111e.mo43058f(amVar.f110003d.f91605id);
                    it.remove();
                    if (dVar.f110112f != null && z2) {
                        dVar.f110112f.mo88528b(amVar.f110003d);
                    }
                }
            }
            dVar.f110108b = null;
        }
    }

    /* renamed from: a */
    public final void mo88441a(C43501am amVar, int i, int i2) {
        this.f109932g.mo88600a(amVar, i, i2, true);
    }

    public InfoStickerEditView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public InfoStickerEditView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
