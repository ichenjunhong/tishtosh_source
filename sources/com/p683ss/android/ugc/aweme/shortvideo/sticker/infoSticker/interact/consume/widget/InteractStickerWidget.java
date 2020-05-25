package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30343l;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44594d.C44595a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C44600a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C44602c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2237e.C44620a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44621a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44624d;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44625e;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44626f;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44627g;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44660f;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.InteractStickerParent;
import com.p683ss.android.ugc.aweme.sticker.C46063m;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.p2282f.C45882b;
import com.p683ss.android.ugc.aweme.sticker.p2282f.C45883c;
import com.p683ss.android.ugc.aweme.sticker.p2282f.C45883c.C45884a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.greenrobot.eventbus.C53755c;
import org.greenrobot.eventbus.C53771m;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.p2629a.C52550ab;
import p2628d.p2629a.C52575l;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget */
public final class InteractStickerWidget extends AbsInteractStickerWidget implements C0199s<C23274a>, C44621a, C44627g {

    /* renamed from: h */
    public C46063m f113057h;

    /* renamed from: i */
    public InteractStickerParent f113058i;

    /* renamed from: j */
    public C44626f f113059j;

    /* renamed from: k */
    public Aweme f113060k;

    /* renamed from: l */
    private C44620a f113061l;

    /* renamed from: m */
    private List<? extends InteractStickerStruct> f113062m;

    /* renamed from: n */
    private List<? extends InteractStickerStruct> f113063n;

    /* renamed from: o */
    private InteractStickerViewModel f113064o;

    /* renamed from: p */
    private List<C44600a> f113065p = new ArrayList();

    /* renamed from: q */
    private C44602c f113066q;

    /* renamed from: r */
    private boolean f113067r;

    /* renamed from: s */
    private final Map<Integer, Integer> f113068s = C52550ab.m112050a(new C52847n(Integer.valueOf(1), Integer.valueOf(0)), new C52847n(Integer.valueOf(6), Integer.valueOf(1)), new C52847n(Integer.valueOf(4), Integer.valueOf(2)), new C52847n(Integer.valueOf(3), Integer.valueOf(3)));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$a */
    public interface C44689a {
        /* renamed from: a */
        C44624d mo90674a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$b */
    public static final class C44690b implements C44689a {

        /* renamed from: a */
        final /* synthetic */ InteractStickerStruct f113069a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerWidget f113070b;

        /* renamed from: a */
        public final C44624d mo90674a() {
            C44660f fVar;
            float f;
            Context context = this.f113070b.f62235b;
            C52711k.m112236a((Object) context, "mContext");
            C46063m mVar = this.f113070b.f113057h;
            InteractStickerStruct interactStickerStruct = this.f113069a;
            InteractStickerParent interactStickerParent = this.f113070b.f113058i;
            if (interactStickerParent == null) {
                C52711k.m112234a();
            }
            View view = interactStickerParent;
            C44626f fVar2 = this.f113070b.f113059j;
            C52711k.m112240b(context, "context");
            C52711k.m112240b(interactStickerStruct, "interactStickerStruct");
            C52711k.m112240b(view, "rootView");
            C45884a aVar = null;
            if (!PoiServiceImpl.createIPoiServicebyMonsterPlugin().isSupportPoiStickers()) {
                fVar = null;
            } else {
                if (mVar != null) {
                    C45883c cVar = mVar.f116227l;
                    if (cVar != null) {
                        aVar = cVar.mo60449a();
                    }
                }
                float f2 = 0.0f;
                if (mVar != null) {
                    if (aVar != null) {
                        f = (float) aVar.f115899a;
                    } else {
                        f = 0.0f;
                    }
                    mVar.mo92610a(f);
                }
                if (mVar != null) {
                    if (aVar != null) {
                        f2 = (float) aVar.f115900b;
                    }
                    mVar.mo92621b(f2);
                }
                fVar = new C44660f(interactStickerStruct.getType(), context, view, interactStickerStruct, mVar);
            }
            return fVar;
        }

        C44690b(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f113069a = interactStickerStruct;
            this.f113070b = interactStickerWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$c */
    public static final class C44691c implements C44689a {

        /* renamed from: a */
        final /* synthetic */ InteractStickerStruct f113071a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerWidget f113072b;

        /* renamed from: a */
        public final C44624d mo90674a() {
            Context context = this.f113072b.f62235b;
            C52711k.m112236a((Object) context, "mContext");
            C46063m mVar = this.f113072b.f113057h;
            InteractStickerStruct interactStickerStruct = this.f113071a;
            InteractStickerParent interactStickerParent = this.f113072b.f113058i;
            if (interactStickerParent == null) {
                C52711k.m112234a();
            }
            return C44595a.m97547a(context, mVar, interactStickerStruct, interactStickerParent, this.f113072b.f113059j, this.f113072b.f113060k);
        }

        C44691c(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f113071a = interactStickerStruct;
            this.f113072b = interactStickerWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$d */
    public static final class C44692d implements C44689a {

        /* renamed from: a */
        final /* synthetic */ InteractStickerStruct f113073a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerWidget f113074b;

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44624d mo90674a() {
            /*
                r8 = this;
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget r0 = r8.f113074b
                android.content.Context r3 = r0.f62235b
                java.lang.String r0 = "mContext"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r0)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget r0 = r8.f113074b
                com.ss.android.ugc.aweme.sticker.m r6 = r0.f113057h
                com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r5 = r8.f113073a
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget r0 = r8.f113074b
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.InteractStickerParent r0 = r0.f113058i
                if (r0 != 0) goto L_0x0018
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0018:
                r4 = r0
                android.view.View r4 = (android.view.View) r4
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget r0 = r8.f113074b
                r7 = r0
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.g r7 = (com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44627g) r7
                java.lang.String r0 = "context"
                p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
                java.lang.String r0 = "interactStickerStruct"
                p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
                java.lang.String r0 = "rootView"
                p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
                java.lang.String r0 = "iVoteDetailSaveData"
                p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
                if (r6 == 0) goto L_0x003f
                com.ss.android.ugc.aweme.sticker.f.c r0 = r6.f116227l
                if (r0 == 0) goto L_0x003f
                com.ss.android.ugc.aweme.sticker.f.c$a r0 = r0.mo60449a()
                goto L_0x0040
            L_0x003f:
                r0 = 0
            L_0x0040:
                r1 = 0
                if (r6 == 0) goto L_0x004d
                if (r0 == 0) goto L_0x0049
                int r2 = r0.f115899a
                float r2 = (float) r2
                goto L_0x004a
            L_0x0049:
                r2 = 0
            L_0x004a:
                r6.mo92610a(r2)
            L_0x004d:
                if (r6 == 0) goto L_0x0057
                if (r0 == 0) goto L_0x0054
                int r0 = r0.f115900b
                float r1 = (float) r0
            L_0x0054:
                r6.mo92621b(r1)
            L_0x0057:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j r0 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j
                int r2 = r5.getType()
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.d r0 = (com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44624d) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.C44692d.mo90674a():com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.d");
        }

        C44692d(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f113073a = interactStickerStruct;
            this.f113074b = interactStickerWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$e */
    public static final class C44693e implements C44689a {

        /* renamed from: a */
        final /* synthetic */ InteractStickerStruct f113075a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerWidget f113076b;

        /* renamed from: a */
        public final C44624d mo90674a() {
            IBridgeService bridgeService_Monster = I18nBridgeService.getBridgeService_Monster();
            Context context = this.f113076b.f62235b;
            C46063m mVar = this.f113076b.f113057h;
            InteractStickerStruct interactStickerStruct = this.f113075a;
            InteractStickerParent interactStickerParent = this.f113076b.f113058i;
            if (interactStickerParent == null) {
                C52711k.m112234a();
            }
            return bridgeService_Monster.createCommentStickerView(context, mVar, interactStickerStruct, interactStickerParent, this.f113076b.f113059j);
        }

        C44693e(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f113075a = interactStickerStruct;
            this.f113076b = interactStickerWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$f */
    public static final class C44694f implements C44689a {

        /* renamed from: a */
        final /* synthetic */ InteractStickerStruct f113077a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerWidget f113078b;

        /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44624d mo90674a() {
            /*
                r7 = this;
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget r0 = r7.f113078b
                android.content.Context r3 = r0.f62235b
                java.lang.String r0 = "mContext"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r0)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget r0 = r7.f113078b
                com.ss.android.ugc.aweme.sticker.m r6 = r0.f113057h
                com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r5 = r7.f113077a
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget r0 = r7.f113078b
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.InteractStickerParent r0 = r0.f113058i
                if (r0 != 0) goto L_0x0018
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0018:
                r4 = r0
                android.view.View r4 = (android.view.View) r4
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget r0 = r7.f113078b
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.f r0 = r0.f113059j
                java.lang.String r0 = "context"
                p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
                java.lang.String r0 = "interactStickerStruct"
                p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
                java.lang.String r0 = "rootView"
                p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
                if (r6 == 0) goto L_0x0039
                com.ss.android.ugc.aweme.sticker.f.c r0 = r6.f116227l
                if (r0 == 0) goto L_0x0039
                com.ss.android.ugc.aweme.sticker.f.c$a r0 = r0.mo60449a()
                goto L_0x003a
            L_0x0039:
                r0 = 0
            L_0x003a:
                r1 = 0
                if (r6 == 0) goto L_0x0047
                if (r0 == 0) goto L_0x0043
                int r2 = r0.f115899a
                float r2 = (float) r2
                goto L_0x0044
            L_0x0043:
                r2 = 0
            L_0x0044:
                r6.mo92610a(r2)
            L_0x0047:
                if (r6 == 0) goto L_0x0051
                if (r0 == 0) goto L_0x004e
                int r0 = r0.f115900b
                float r1 = (float) r0
            L_0x004e:
                r6.mo92621b(r1)
            L_0x0051:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h
                int r2 = r5.getType()
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.d r0 = (com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44624d) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.C44694f.mo90674a():com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.d");
        }

        C44694f(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f113077a = interactStickerStruct;
            this.f113078b = interactStickerWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$g */
    public static final class C44695g implements C44689a {

        /* renamed from: a */
        final /* synthetic */ InteractStickerStruct f113079a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerWidget f113080b;

        /* renamed from: a */
        public final C44624d mo90674a() {
            IBridgeService bridgeService_Monster = I18nBridgeService.getBridgeService_Monster();
            Context context = this.f113080b.f62235b;
            C46063m mVar = this.f113080b.f113057h;
            InteractStickerStruct interactStickerStruct = this.f113079a;
            InteractStickerParent interactStickerParent = this.f113080b.f113058i;
            if (interactStickerParent == null) {
                C52711k.m112234a();
            }
            return bridgeService_Monster.createDonationStickerView(context, mVar, interactStickerStruct, interactStickerParent, this.f113080b.f113059j);
        }

        C44695g(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f113079a = interactStickerStruct;
            this.f113080b = interactStickerWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$h */
    public static final class C44696h<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C52594a.m112153a(Integer.valueOf(((InteractStickerStruct) t).getIndex()), Integer.valueOf(((InteractStickerStruct) t2).getIndex()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$i */
    public static final class C44697i<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ InteractStickerWidget f113081a;

        public C44697i(InteractStickerWidget interactStickerWidget) {
            this.f113081a = interactStickerWidget;
        }

        public final int compare(T t, T t2) {
            return C52594a.m112153a(Integer.valueOf(this.f113081a.mo90670a(((InteractStickerStruct) t).getType())), Integer.valueOf(this.f113081a.mo90670a(((InteractStickerStruct) t2).getType())));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget$j */
    public static final class C44698j implements C44625e {

        /* renamed from: a */
        final /* synthetic */ C44600a f113082a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerWidget f113083b;

        /* renamed from: c */
        final /* synthetic */ long f113084c;

        /* renamed from: d */
        final /* synthetic */ MotionEvent f113085d;

        /* renamed from: a */
        public final void mo90580a(boolean z) {
            float f;
            float f2;
            C46063m mVar = this.f113083b.f113057h;
            if (mVar != null) {
                C45882b bVar = mVar.f116228m;
                if (bVar != null) {
                    int a = this.f113082a.f112827d.mo90484a();
                    View a2 = this.f113082a.f112827d.mo90485a(this.f113082a.f112827d.mo90484a());
                    MotionEvent motionEvent = this.f113085d;
                    if (motionEvent != null) {
                        f = motionEvent.getX();
                    } else {
                        f = 0.0f;
                    }
                    MotionEvent motionEvent2 = this.f113085d;
                    if (motionEvent2 != null) {
                        f2 = motionEvent2.getY();
                    } else {
                        f2 = 0.0f;
                    }
                    bVar.mo60272a(a, a2, f, f2, this.f113082a.f112827d.mo90578g(), z);
                }
            }
            C46063m mVar2 = this.f113083b.f113057h;
            if (mVar2 != null) {
                C45882b bVar2 = mVar2.f116228m;
                if (bVar2 != null) {
                    bVar2.mo60273a(this.f113082a.f112827d.mo90484a(), true);
                }
            }
        }

        C44698j(C44600a aVar, InteractStickerWidget interactStickerWidget, long j, MotionEvent motionEvent) {
            this.f113082a = aVar;
            this.f113083b = interactStickerWidget;
            this.f113084c = j;
            this.f113085d = motionEvent;
        }
    }

    /* renamed from: a */
    public final int mo48238a() {
        return R.layout.awr;
    }

    /* renamed from: b */
    public final C44602c mo90582b() {
        return this.f113066q;
    }

    /* renamed from: a */
    public final void mo90664a(C44626f fVar) {
        C52711k.m112240b(fVar, "videoDataGetter");
        this.f113059j = fVar;
    }

    /* renamed from: a */
    public final void mo90581a(C44602c cVar) {
        C52711k.m112240b(cVar, "data");
        this.f113066q = cVar;
    }

    public final void onDestroy() {
        super.onDestroy();
        C53755c.m114319a().mo112959c((Object) this);
    }

    /* renamed from: d */
    public final InteractStickerViewModel mo90665d() {
        if (this.f113064o == null) {
            this.f113064o = new InteractStickerViewModel();
            InteractStickerViewModel interactStickerViewModel = this.f113064o;
            if (interactStickerViewModel != null) {
                interactStickerViewModel.f113049a = this;
            }
        }
        InteractStickerViewModel interactStickerViewModel2 = this.f113064o;
        if (interactStickerViewModel2 == null) {
            C52711k.m112234a();
        }
        return interactStickerViewModel2;
    }

    public final void onPause() {
        super.onPause();
        for (C44600a aVar : this.f113065p) {
            aVar.f112827d.mo90576f();
        }
    }

    public final void onResume() {
        super.onResume();
        for (C44600a aVar : this.f113065p) {
            aVar.f112827d.mo90575e();
        }
    }

    /* renamed from: e */
    public final void mo90671e() {
        for (C44600a aVar : this.f113065p) {
            aVar.f112827d.mo90574c(aVar.f112827d.mo90484a());
        }
    }

    /* renamed from: f */
    public final void mo90672f() {
        for (C44600a aVar : this.f113065p) {
            aVar.f112827d.mo90573b(aVar.f112827d.mo90484a());
        }
    }

    public final void onCreate() {
        super.onCreate();
        if (this.f62238e != null) {
            C0199s sVar = this;
            this.f62238e.mo48226a("interact_sticker_data", sVar);
            this.f62238e.mo48226a("interact_sticker_video_data", sVar);
            this.f62238e.mo48226a("interact_sticker_aweme_data", sVar);
            this.f62238e.mo48226a("interact_sticker_clear_data", sVar);
            this.f62238e.mo48226a("action_is_landscape", sVar);
            return;
        }
        C0199s sVar2 = this;
        mo90665d().mo90666a("interact_sticker_data", sVar2);
        mo90665d().mo90666a("interact_sticker_video_data", sVar2);
        mo90665d().mo90666a("interact_sticker_aweme_data", sVar2);
        mo90665d().mo90666a("interact_sticker_clear_data", sVar2);
        mo90665d().mo90666a("action_is_landscape", sVar2);
    }

    /* renamed from: a */
    public final void mo90663a(Aweme aweme) {
        this.f113060k = aweme;
    }

    @C53771m
    public final void onDissmissInteractWindow(C30343l lVar) {
        C52711k.m112240b(lVar, "event");
        int i = lVar.f79257a;
        for (C44600a aVar : this.f113065p) {
            if (aVar.f112827d.mo90579h() != i) {
                aVar.f112827d.mo90574c(aVar.f112827d.mo90484a());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m97747a(com.p683ss.android.ugc.aweme.sticker.C46063m r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x000b
            com.ss.android.ugc.aweme.sticker.f.c r0 = r6.f116227l
            if (r0 == 0) goto L_0x000b
            com.ss.android.ugc.aweme.sticker.f.c$a r0 = r0.mo60449a()
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r1 = 0
            if (r6 == 0) goto L_0x0019
            if (r0 == 0) goto L_0x0015
            int r2 = r0.f115899a
            float r2 = (float) r2
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            r6.mo92610a(r2)
        L_0x0019:
            if (r6 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0020
            int r1 = r0.f115900b
            float r1 = (float) r1
        L_0x0020:
            r6.mo92621b(r1)
        L_0x0023:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.InteractStickerParent r1 = r5.f113058i
            if (r1 == 0) goto L_0x0030
            if (r6 == 0) goto L_0x002c
            boolean r2 = r6.f116226k
            goto L_0x002d
        L_0x002c:
            r2 = 1
        L_0x002d:
            r1.setNeedConsumeEvent(r2)
        L_0x0030:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.a r1 = r5.f113061l
            if (r1 == 0) goto L_0x0036
            r1.f112897q = r6
        L_0x0036:
            if (r6 == 0) goto L_0x0060
            java.util.List<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a> r1 = r5.f113065p
            java.util.Iterator r1 = r1.iterator()
        L_0x003e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0060
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a r2 = (com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C44600a) r2
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.d r3 = r2.f112827d
            r3.mo90486a(r6)
            android.view.View r2 = r2.f112825b
            r3 = 0
            if (r0 == 0) goto L_0x0057
            int r4 = r0.f115901c
            goto L_0x0058
        L_0x0057:
            r4 = 0
        L_0x0058:
            if (r0 == 0) goto L_0x005c
            int r3 = r0.f115902d
        L_0x005c:
            m97745a(r2, r4, r3)
            goto L_0x003e
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.m97747a(com.ss.android.ugc.aweme.sticker.m):void");
    }

    public final /* synthetic */ void onChanged(Object obj) {
        String str;
        C23274a aVar = (C23274a) obj;
        if (aVar != null) {
            str = aVar.f62242a;
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1862975153:
                    if (str.equals("action_is_landscape")) {
                        Object a = aVar.mo48246a();
                        C52711k.m112236a(a, "kvData.getData()");
                        this.f113067r = ((Boolean) a).booleanValue();
                        break;
                    }
                    break;
                case -1213045287:
                    if (str.equals("interact_sticker_video_data")) {
                        this.f113063n = (List) aVar.mo48246a();
                        m97748a(null, this.f113063n);
                        return;
                    }
                    break;
                case -949174003:
                    if (str.equals("interact_sticker_aweme_data")) {
                        this.f113062m = (List) aVar.mo48246a();
                        m97748a(this.f113062m, null);
                        return;
                    }
                    break;
                case -328001721:
                    if (str.equals("interact_sticker_clear_data")) {
                        InteractStickerParent interactStickerParent = this.f113058i;
                        if (interactStickerParent != null) {
                            interactStickerParent.removeAllViews();
                        }
                        this.f113062m = null;
                        this.f113063n = null;
                        this.f113065p = new ArrayList();
                        return;
                    }
                    break;
                case -153749291:
                    if (str.equals("interact_sticker_data")) {
                        this.f113057h = (C46063m) aVar.mo48246a();
                        m97747a(this.f113057h);
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    public final int mo90670a(int i) {
        for (Entry entry : this.f113068s.entrySet()) {
            if (((Number) entry.getKey()).intValue() == i) {
                return ((Number) entry.getValue()).intValue();
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo48241a(View view) {
        InteractStickerParent interactStickerParent;
        super.mo48241a(view);
        C53755c.m114319a().mo112955a((Object) this);
        if (view != null) {
            interactStickerParent = (InteractStickerParent) view.findViewById(R.id.cfc);
        } else {
            interactStickerParent = null;
        }
        this.f113058i = interactStickerParent;
        if (VERSION.SDK_INT >= 17) {
            InteractStickerParent interactStickerParent2 = this.f113058i;
            if (interactStickerParent2 != null) {
                interactStickerParent2.setLayoutDirection(0);
            }
        }
        Activity c = mo48242c();
        C52711k.m112236a((Object) c, "activity");
        C44620a aVar = new C44620a(c, this.f113065p, this.f113057h, this.f113059j, this);
        this.f113061l = aVar;
        InteractStickerParent interactStickerParent3 = this.f113058i;
        if (interactStickerParent3 != null) {
            interactStickerParent3.setOnTouchListener(this.f113061l);
        }
        if (this.f62238e != null) {
            this.f113057h = (C46063m) this.f62238e.mo48229a("interact_sticker_data");
            this.f113062m = (List) this.f62238e.mo48229a("interact_sticker_aweme_data");
            this.f113063n = (List) this.f62238e.mo48229a("interact_sticker_video_data");
        } else {
            this.f113057h = (C46063m) mo90665d().mo90668a("interact_sticker_data");
            this.f113062m = (List) mo90665d().mo90668a("interact_sticker_aweme_data");
            this.f113063n = (List) mo90665d().mo90668a("interact_sticker_video_data");
        }
        m97747a(this.f113057h);
        m97748a(this.f113062m, this.f113063n);
    }

    /* renamed from: a */
    private final void m97746a(InteractStickerStruct interactStickerStruct, C44689a aVar) {
        if (C9376b.m18558a((Collection<T>) this.f113065p)) {
            C44624d a = aVar.mo90674a();
            if (a != null) {
                View a2 = a.mo90485a(a.mo90484a());
                if (a2 == null) {
                    C52711k.m112234a();
                }
                m97744a(0, a2, interactStickerStruct, a, false);
            }
        } else {
            int i = 0;
            for (C44600a aVar2 : this.f113065p) {
                if (C52711k.m112239a((Object) aVar2.f112826c, (Object) interactStickerStruct)) {
                    aVar2.f112827d.mo90577a(interactStickerStruct);
                    return;
                } else if (interactStickerStruct.getType() != 5 && aVar2.f112826c.getType() == interactStickerStruct.getType()) {
                    C44624d a3 = aVar.mo90674a();
                    if (a3 != null) {
                        View a4 = a3.mo90485a(a3.mo90484a());
                        if (a4 == null) {
                            C52711k.m112234a();
                        }
                        m97744a(i, a4, interactStickerStruct, a3, true);
                    }
                    return;
                } else if (i == this.f113065p.size() - 1 || mo90670a(interactStickerStruct.getType()) >= mo90670a(aVar2.f112826c.getType())) {
                    if (i == this.f113065p.size() - 1 && mo90670a(interactStickerStruct.getType()) < mo90670a(aVar2.f112826c.getType())) {
                        i++;
                    }
                    int i2 = i;
                    C44624d a5 = aVar.mo90674a();
                    if (a5 != null) {
                        View a6 = a5.mo90485a(a5.mo90484a());
                        if (a6 == null) {
                            C52711k.m112234a();
                        }
                        m97744a(i2, a6, interactStickerStruct, a5, false);
                    }
                    return;
                } else {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m97748a(List<? extends InteractStickerStruct> list, List<? extends InteractStickerStruct> list2) {
        Collection collection;
        List list3;
        Collection collection2;
        int i;
        int i2;
        boolean z;
        boolean z2;
        ArrayList<InteractStickerStruct> arrayList = new ArrayList<>();
        C45884a aVar = null;
        if (list != null) {
            Iterable iterable = list;
            Collection arrayList2 = new ArrayList();
            for (Object next : iterable) {
                InteractStickerStruct interactStickerStruct = (InteractStickerStruct) next;
                if (interactStickerStruct.getType() == 5 || interactStickerStruct.getType() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList2.add(next);
                }
            }
            collection = C52575l.m112122a((Iterable<? extends T>) (List) arrayList2, (Comparator<? super T>) new C44696h<Object>());
        } else {
            collection = null;
        }
        if (list != null) {
            Iterable iterable2 = list;
            Collection arrayList3 = new ArrayList();
            for (Object next2 : iterable2) {
                InteractStickerStruct interactStickerStruct2 = (InteractStickerStruct) next2;
                if (interactStickerStruct2.getType() == 5 || interactStickerStruct2.getType() == 1) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    arrayList3.add(next2);
                }
            }
            list3 = C52575l.m112122a((Iterable<? extends T>) (List) arrayList3, (Comparator<? super T>) new C44697i<Object>(this));
        } else {
            list3 = null;
        }
        if (list2 == null) {
            list2 = C52575l.m112097a();
        }
        arrayList.addAll(list2);
        if (collection != null) {
            collection2 = collection;
        } else {
            collection2 = C52575l.m112097a();
        }
        arrayList.addAll(collection2);
        if (list3 == null) {
            list3 = C52575l.m112097a();
        }
        arrayList.addAll(list3);
        for (InteractStickerStruct interactStickerStruct3 : arrayList) {
            switch (interactStickerStruct3.getType()) {
                case 1:
                    m97746a(interactStickerStruct3, (C44689a) new C44690b(interactStickerStruct3, this));
                    break;
                case 2:
                    m97746a(interactStickerStruct3, (C44689a) new C44691c(interactStickerStruct3, this));
                    break;
                case 3:
                    m97746a(interactStickerStruct3, (C44689a) new C44692d(interactStickerStruct3, this));
                    break;
                case 4:
                    m97746a(interactStickerStruct3, (C44689a) new C44693e(interactStickerStruct3, this));
                    break;
                case 5:
                    m97746a(interactStickerStruct3, (C44689a) new C44694f(interactStickerStruct3, this));
                    break;
                case 6:
                    m97746a(interactStickerStruct3, (C44689a) new C44695g(interactStickerStruct3, this));
                    break;
            }
        }
        C44620a aVar2 = this.f113061l;
        if (aVar2 != null) {
            aVar2.mo90569a(this.f113065p);
        }
        C46063m mVar = this.f113057h;
        if (mVar != null) {
            C45883c cVar = mVar.f116227l;
            if (cVar != null) {
                aVar = cVar.mo60449a();
            }
        }
        for (C44600a aVar3 : this.f113065p) {
            View view = aVar3.f112825b;
            if (aVar != null) {
                i = aVar.f115901c;
            } else {
                i = 0;
            }
            if (aVar != null) {
                i2 = aVar.f115902d;
            } else {
                i2 = 0;
            }
            m97745a(view, i, i2);
        }
    }

    /* renamed from: a */
    public final void mo90572a(long j, MotionEvent motionEvent) {
        float f;
        float f2;
        for (C44600a aVar : this.f113065p) {
            if (!this.f113067r || !(aVar.f112826c.getType() == 1 || aVar.f112826c.getType() == 2)) {
                C44624d dVar = aVar.f112827d;
                int a = aVar.f112827d.mo90484a();
                if (motionEvent != null) {
                    f = motionEvent.getX();
                } else {
                    f = 0.0f;
                }
                if (motionEvent != null) {
                    f2 = motionEvent.getY();
                } else {
                    f2 = 0.0f;
                }
                long j2 = j;
                C44698j jVar = new C44698j(aVar, this, j2, motionEvent);
                if (dVar.mo90488a(j2, a, f, f2, jVar)) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo90571a(long j, int i, MotionEvent motionEvent) {
        mo90572a(j, motionEvent);
    }

    /* renamed from: a */
    private static void m97745a(View view, int i, int i2) {
        if (view != null) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.leftMargin = i;
                layoutParams2.topMargin = i2;
                view.setLayoutParams(layoutParams2);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    /* renamed from: a */
    private final void m97744a(int i, View view, InteractStickerStruct interactStickerStruct, C44624d dVar, boolean z) {
        if (i >= 0 && i < this.f113065p.size() && z) {
            try {
                this.f113065p.remove(i);
                InteractStickerParent interactStickerParent = this.f113058i;
                if (interactStickerParent != null) {
                    interactStickerParent.removeViewAt(i);
                }
            } catch (Exception unused) {
                return;
            }
        }
        this.f113065p.add(i, new C44600a(i, view, interactStickerStruct, dVar));
        InteractStickerParent interactStickerParent2 = this.f113058i;
        if (interactStickerParent2 != null) {
            interactStickerParent2.addView(view, i);
        }
    }
}
