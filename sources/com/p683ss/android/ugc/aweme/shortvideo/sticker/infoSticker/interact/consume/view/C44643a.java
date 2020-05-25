package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.PopupWindow.OnDismissListener;
import com.bytedance.common.utility.C9432q;
import com.google.gson.C17971f;
import com.google.gson.C18091u;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23524d;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30343l;
import com.p683ss.android.ugc.aweme.poi.widget.BubbleLayout;
import com.p683ss.android.ugc.aweme.poi.widget.C39481c;
import com.p683ss.android.ugc.aweme.poi.widget.C39481c.C39486a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44624d;
import com.p683ss.android.ugc.aweme.sticker.C46063m;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p683ss.android.ugc.aweme.sticker.p2282f.C45882b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a */
public abstract class C44643a implements C44624d {

    /* renamed from: c */
    public C39481c f112932c;

    /* renamed from: d */
    public Runnable f112933d;

    /* renamed from: e */
    public InteractStickerStruct f112934e;

    /* renamed from: f */
    public List<? extends NormalTrackTimeStamp> f112935f;

    /* renamed from: g */
    public final int f112936g;

    /* renamed from: h */
    public Context f112937h;

    /* renamed from: i */
    public final View f112938i;

    /* renamed from: j */
    public C46063m f112939j;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a$a */
    static final class C44645a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44643a f112940a;

        /* renamed from: b */
        final /* synthetic */ float f112941b;

        /* renamed from: c */
        final /* synthetic */ float f112942c;

        C44645a(C44643a aVar, float f, float f2) {
            this.f112940a = aVar;
            this.f112941b = f;
            this.f112942c = f2;
        }

        public final void run() {
            LayoutParams layoutParams;
            if (this.f112940a.f112932c == null) {
                C44643a aVar = this.f112940a;
                Context context = this.f112940a.f112937h;
                if (context != null) {
                    aVar.f112932c = new C39481c((Activity) context, false);
                    C39481c cVar = this.f112940a.f112932c;
                    if (cVar != null) {
                        cVar.f101001p = 300;
                    }
                    C39481c cVar2 = this.f112940a.f112932c;
                    if (cVar2 != null) {
                        cVar2.mo80492a(false);
                    }
                    C39481c cVar3 = this.f112940a.f112932c;
                    if (cVar3 != null) {
                        cVar3.f100995j = true;
                    }
                    C39481c cVar4 = this.f112940a.f112932c;
                    if (cVar4 != null) {
                        cVar4.f100996k = true;
                    }
                    C39481c cVar5 = this.f112940a.f112932c;
                    if (cVar5 != null) {
                        cVar5.mo80488a(this.f112940a.mo90490c());
                    }
                    C44643a aVar2 = this.f112940a;
                    C39481c cVar6 = this.f112940a.f112932c;
                    if (cVar6 == null) {
                        C52711k.m112234a();
                    }
                    aVar2.mo90607a(cVar6);
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.app.Activity");
                }
            }
            C39481c cVar7 = this.f112940a.f112932c;
            if (cVar7 != null) {
                cVar7.mo80496b(this.f112940a.f112937h.getResources().getColor(R.color.b));
            }
            C39481c cVar8 = this.f112940a.f112932c;
            if (cVar8 != null) {
                cVar8.mo80504f();
            }
            if (this.f112940a.f112932c != null) {
                C39481c cVar9 = this.f112940a.f112932c;
                if (cVar9 == null) {
                    C52711k.m112234a();
                }
                if (((float) cVar9.mo80498c()) > ((float) C23724k.m58224b(this.f112940a.f112937h)) - C9432q.m18687b(this.f112940a.f112937h, 32.0f)) {
                    C39481c cVar10 = this.f112940a.f112932c;
                    if (cVar10 == null) {
                        C52711k.m112234a();
                    }
                    int b = (int) (((float) C23724k.m58224b(this.f112940a.f112937h)) - C9432q.m18687b(this.f112940a.f112937h, 32.0f));
                    cVar10.f100989d = b;
                    cVar10.setWidth(b);
                    BubbleLayout.f100910g = b;
                    C39481c cVar11 = this.f112940a.f112932c;
                    if (cVar11 == null) {
                        C52711k.m112234a();
                    }
                    View contentView = cVar11.getContentView();
                    if (contentView != null) {
                        View childAt = ((ViewGroup) contentView).getChildAt(0);
                        if (childAt != null) {
                            layoutParams = childAt.getLayoutParams();
                        } else {
                            layoutParams = null;
                        }
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        if (layoutParams2 != null) {
                            layoutParams2.leftMargin = (int) C9432q.m18687b(this.f112940a.f112937h, 12.0f);
                        }
                        if (layoutParams2 != null) {
                            layoutParams2.rightMargin = (int) C9432q.m18687b(this.f112940a.f112937h, 12.0f);
                        }
                        C39481c cVar12 = this.f112940a.f112932c;
                        if (cVar12 == null) {
                            C52711k.m112234a();
                        }
                        View contentView2 = cVar12.getContentView();
                        if (contentView2 != null) {
                            View childAt2 = ((ViewGroup) contentView2).getChildAt(0);
                            if (childAt2 != null) {
                                childAt2.setLayoutParams(layoutParams2);
                            }
                            C39481c cVar13 = this.f112940a.f112932c;
                            if (cVar13 != null) {
                                cVar13.mo80504f();
                            }
                        } else {
                            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                }
            }
            final int[] iArr = new int[2];
            this.f112940a.f112938i.getLocationOnScreen(iArr);
            C39481c cVar14 = this.f112940a.f112932c;
            if (cVar14 != null) {
                cVar14.f101003r = new C23524d<Point>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C44645a f112943a;

                    {
                        this.f112943a = r1;
                    }

                    /* renamed from: a */
                    public final /* synthetic */ Object mo48684a() {
                        return new Point(((int) this.f112943a.f112941b) + iArr[0], ((int) this.f112943a.f112942c) + iArr[1]);
                    }
                };
            }
            C39481c cVar15 = this.f112940a.f112932c;
            if (cVar15 != null) {
                cVar15.f101004s = new C39486a(this) {

                    /* renamed from: a */
                    final /* synthetic */ C44645a f112945a;

                    {
                        this.f112945a = r1;
                    }

                    /* renamed from: a */
                    public final void mo51196a() {
                        C39481c cVar = this.f112945a.f112940a.f112932c;
                        if (cVar != null) {
                            cVar.dismiss();
                        }
                        this.f112945a.f112940a.mo90491d();
                    }
                };
            }
            C39481c cVar16 = this.f112940a.f112932c;
            if (cVar16 != null) {
                cVar16.setOnDismissListener(new OnDismissListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C44645a f112946a;

                    {
                        this.f112946a = r1;
                    }

                    public final void onDismiss() {
                        C46063m mVar = this.f112946a.f112940a.f112939j;
                        if (mVar != null) {
                            C45882b bVar = mVar.f116228m;
                            if (bVar != null) {
                                bVar.mo60273a(this.f112946a.f112940a.mo90484a(), false);
                            }
                        }
                    }
                });
            }
            C39481c cVar17 = this.f112940a.f112932c;
            if (cVar17 != null) {
                cVar17.f100999n = -1;
            }
            C39481c cVar18 = this.f112940a.f112932c;
            if (cVar18 != null) {
                cVar18.mo80500c(this.f112940a.f112938i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a$b */
    static final class C44649b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44643a f112947a;

        C44649b(C44643a aVar) {
            this.f112947a = aVar;
        }

        public final void run() {
            C18842a.m45934b(this.f112947a.f112933d);
        }
    }

    /* renamed from: a */
    public void mo90607a(C39481c cVar) {
        C52711k.m112240b(cVar, "popWindow");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo90489b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract View mo90490c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo90491d();

    /* renamed from: e */
    public void mo90575e() {
    }

    /* renamed from: f */
    public void mo90576f() {
    }

    /* renamed from: g */
    public final InteractStickerStruct mo90578g() {
        return this.f112934e;
    }

    /* renamed from: h */
    public final int mo90579h() {
        return hashCode();
    }

    /* renamed from: a */
    public void mo90577a(InteractStickerStruct interactStickerStruct) {
        this.f112934e = interactStickerStruct;
    }

    /* renamed from: a */
    public void mo90486a(C46063m mVar) {
        C52711k.m112240b(mVar, "interactStickerParams");
        this.f112939j = mVar;
    }

    /* renamed from: b */
    public void mo90573b(int i) {
        if (this.f112933d != null) {
            C18842a.m45935c(this.f112933d);
            this.f112933d = null;
        }
        C39481c cVar = this.f112932c;
        if (cVar != null) {
            cVar.mo80501d();
        }
        this.f112932c = null;
    }

    /* renamed from: c */
    public final void mo90574c(int i) {
        if (this.f112933d != null) {
            C18842a.m45935c(this.f112933d);
            this.f112933d = null;
        }
        if (this.f112932c != null) {
            C39481c cVar = this.f112932c;
            if (cVar != null) {
                cVar.dismiss();
            }
            this.f112932c = null;
        }
        C46063m mVar = this.f112939j;
        if (mVar != null) {
            C45882b bVar = mVar.f116228m;
            if (bVar != null) {
                bVar.mo60273a(mo90484a(), false);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo90608a(float f, float f2) {
        C47718bf.m103288a(new C30343l(mo90579h()));
        C39481c cVar = this.f112932c;
        if (cVar == null || !cVar.isShowing()) {
            mo90489b();
            this.f112933d = new C44645a(this, f, f2);
            this.f112938i.post(new C44649b(this));
            return true;
        }
        C47718bf.m103288a(new C30343l());
        return false;
    }

    public C44643a(int i, Context context, View view, InteractStickerStruct interactStickerStruct, C46063m mVar) {
        String str;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(view, "contentView");
        C52711k.m112240b(interactStickerStruct, "stickerStruct");
        this.f112936g = i;
        this.f112937h = context;
        this.f112938i = view;
        this.f112939j = mVar;
        this.f112934e = interactStickerStruct;
        try {
            C17971f gson = C47759cc.m103382a().getGson();
            InteractStickerStruct interactStickerStruct2 = this.f112934e;
            if (interactStickerStruct2 != null) {
                str = interactStickerStruct2.getTrackList();
            } else {
                str = null;
            }
            this.f112935f = (List) gson.mo34885a(str, new C17956a<List<? extends NormalTrackTimeStamp>>() {
            }.f49843c);
        } catch (C18091u unused) {
        }
    }
}
