package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.C18091u;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel;
import com.p683ss.android.ugc.aweme.sticker.C46062l;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.p2282f.C45881a;
import com.p683ss.android.ugc.aweme.sticker.p2282f.C45882b;
import com.p683ss.android.ugc.aweme.sticker.p2282f.C45883c;
import com.p683ss.android.ugc.aweme.sticker.p2282f.C45885d;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import com.p683ss.android.ugc.aweme.video.C47989ai;
import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.playerkit.videoview.C50158g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a */
public final class C44576a {

    /* renamed from: o */
    public static final String f112775o = f112775o;

    /* renamed from: p */
    public static final String f112776p = f112776p;

    /* renamed from: q */
    public static final String f112777q = f112777q;

    /* renamed from: r */
    public static final String f112778r = f112778r;

    /* renamed from: s */
    public static final String f112779s = f112779s;

    /* renamed from: t */
    public static final C44577a f112780t = new C44577a(null);

    /* renamed from: a */
    public Aweme f112781a;

    /* renamed from: b */
    public DataCenter f112782b;

    /* renamed from: c */
    public C45882b f112783c;

    /* renamed from: d */
    public C45883c f112784d;

    /* renamed from: e */
    public C46062l f112785e;

    /* renamed from: f */
    public C48021h f112786f;

    /* renamed from: g */
    public C50158g f112787g;

    /* renamed from: h */
    public C45885d f112788h;

    /* renamed from: i */
    public boolean f112789i = true;

    /* renamed from: j */
    public InteractStickerViewModel f112790j;

    /* renamed from: k */
    public boolean f112791k;

    /* renamed from: l */
    public C45881a f112792l;

    /* renamed from: m */
    public AbsInteractStickerWidget f112793m;

    /* renamed from: n */
    public final C44586b f112794n;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a$a */
    public static final class C44577a {
        private C44577a() {
        }

        public /* synthetic */ C44577a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a$b */
    static final class C44578b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C44576a f112795a;

        C44578b(C44576a aVar) {
            this.f112795a = aVar;
        }

        public final /* synthetic */ Object call() {
            String str;
            C44576a aVar = this.f112795a;
            ArrayList<InteractStickerStruct> e = aVar.mo90515e();
            if (!C9376b.m18558a((Collection<T>) e)) {
                List arrayList = new ArrayList();
                if (e != null) {
                    for (InteractStickerStruct interactStickerStruct : e) {
                        if (interactStickerStruct != null) {
                            str = interactStickerStruct.getAttr();
                        } else {
                            str = null;
                        }
                        C52711k.m112236a((Object) str, "it?.attr");
                        if (!aVar.mo90511a(str)) {
                            arrayList.add(interactStickerStruct);
                        }
                    }
                }
                if (e != null) {
                    e.removeAll(arrayList);
                }
            }
            return e;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a$c */
    static final class C44579c<TTaskResult, TContinuationResult> implements C0011g<ArrayList<InteractStickerStruct>, Object> {

        /* renamed from: a */
        final /* synthetic */ C44576a f112796a;

        C44579c(C44576a aVar) {
            this.f112796a = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C44576a aVar = this.f112796a;
            C52711k.m112236a((Object) iVar, "it");
            ArrayList arrayList = (ArrayList) iVar.mo34e();
            if (aVar.f112793m != null) {
                aVar.mo90510a(arrayList);
            } else if (!C9376b.m18558a((Collection<T>) arrayList)) {
                aVar.mo90516f();
                aVar.mo90510a(arrayList);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a$d */
    public static final class C44580d extends C17956a<ArrayList<InteractStickerStruct>> {
        C44580d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a$e */
    public static final class C44581e<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C52594a.m112153a(Integer.valueOf(((InteractStickerStruct) t).getIndex()), Integer.valueOf(((InteractStickerStruct) t2).getIndex()));
        }
    }

    /* renamed from: g */
    public final void mo90517g() {
        AbsInteractStickerWidget absInteractStickerWidget = this.f112793m;
        if (absInteractStickerWidget != null) {
            absInteractStickerWidget.mo90671e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo90516f() {
        InteractStickerViewModel interactStickerViewModel;
        this.f112793m = this.f112794n.mo60212ac();
        AbsInteractStickerWidget absInteractStickerWidget = this.f112793m;
        if (absInteractStickerWidget != null) {
            absInteractStickerWidget.mo90663a(this.f112781a);
        }
        AbsInteractStickerWidget absInteractStickerWidget2 = this.f112793m;
        if (absInteractStickerWidget2 != null) {
            interactStickerViewModel = absInteractStickerWidget2.mo90665d();
        } else {
            interactStickerViewModel = null;
        }
        this.f112790j = interactStickerViewModel;
        mo90506a();
    }

    /* renamed from: c */
    public final void mo90513c() {
        Aweme aweme = this.f112781a;
        if (aweme == null || !aweme.isProhibited()) {
            C0013i.m16a((Callable<TResult>) new C44578b<TResult>(this)).mo20a((C0011g<TResult, TContinuationResult>) new C44579c<TResult,TContinuationResult>(this), C0013i.f25b);
            return;
        }
        if (this.f112782b != null) {
            DataCenter dataCenter = this.f112782b;
            if (dataCenter != null) {
                dataCenter.mo48228a("interact_sticker_video_data", (Object) new ArrayList());
            }
        } else if (this.f112790j != null) {
            InteractStickerViewModel interactStickerViewModel = this.f112790j;
            if (interactStickerViewModel != null) {
                interactStickerViewModel.mo90667a("interact_sticker_video_data", (Object) new ArrayList());
            }
        }
    }

    /* renamed from: d */
    public final void mo90514d() {
        if (this.f112793m != null) {
            if (this.f112782b != null) {
                DataCenter dataCenter = this.f112782b;
                if (dataCenter != null) {
                    dataCenter.mo48228a("interact_sticker_clear_data", (Object) null);
                }
                DataCenter dataCenter2 = this.f112782b;
                if (dataCenter2 != null) {
                    dataCenter2.mo48228a("interact_sticker_aweme_data", (Object) null);
                }
                DataCenter dataCenter3 = this.f112782b;
                if (dataCenter3 != null) {
                    dataCenter3.mo48228a("interact_sticker_video_data", (Object) null);
                }
            } else {
                InteractStickerViewModel interactStickerViewModel = this.f112790j;
                if (interactStickerViewModel != null) {
                    interactStickerViewModel.mo90667a("interact_sticker_clear_data", (Object) null);
                }
                InteractStickerViewModel interactStickerViewModel2 = this.f112790j;
                if (interactStickerViewModel2 != null) {
                    interactStickerViewModel2.mo90667a("interact_sticker_aweme_data", (Object) null);
                }
                InteractStickerViewModel interactStickerViewModel3 = this.f112790j;
                if (interactStickerViewModel3 != null) {
                    interactStickerViewModel3.mo90667a("interact_sticker_video_data", (Object) null);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x005c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90506a() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.sticker.m r0 = new com.ss.android.ugc.aweme.sticker.m
            r0.<init>()
            com.ss.android.ugc.aweme.sticker.f.b r1 = r6.f112783c
            com.ss.android.ugc.aweme.sticker.m r1 = r0.mo92615a(r1)
            com.ss.android.ugc.aweme.sticker.f.c r2 = r6.f112784d
            com.ss.android.ugc.aweme.sticker.m r1 = r1.mo92616a(r2)
            com.ss.android.ugc.aweme.sticker.f.d r2 = r6.f112788h
            com.ss.android.ugc.aweme.sticker.m r1 = r1.mo92617a(r2)
            com.ss.android.ugc.aweme.sticker.f.a r2 = r6.f112792l
            com.ss.android.ugc.aweme.sticker.m r1 = r1.mo92614a(r2)
            com.ss.android.ugc.aweme.sticker.l r2 = r6.f112785e
            com.ss.android.ugc.aweme.sticker.m r1 = r1.mo92618a(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f112781a
            com.ss.android.ugc.aweme.profile.model.User r2 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c.m97542b(r2)
            com.ss.android.ugc.aweme.sticker.m r1 = r1.mo92613a(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f112781a
            java.lang.String r2 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c.m97537a(r2)
            com.ss.android.ugc.aweme.sticker.m r1 = r1.mo92619a(r2)
            boolean r2 = r6.f112789i
            com.ss.android.ugc.aweme.sticker.m r1 = r1.mo92620a(r2)
            boolean r2 = r6.f112791k
            com.ss.android.ugc.aweme.sticker.m r1 = r1.mo92624b(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f112781a
            r3 = 0
            if (r2 == 0) goto L_0x0053
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x0053
            java.lang.String r2 = r2.getLogExtra()
            goto L_0x0054
        L_0x0053:
            r2 = r3
        L_0x0054:
            com.ss.android.ugc.aweme.sticker.m r1 = r1.mo92623b(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f112781a
            if (r2 == 0) goto L_0x0067
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x0067
            java.lang.String r2 = r2.getPageFrom()
            goto L_0x0068
        L_0x0067:
            r2 = r3
        L_0x0068:
            com.ss.android.ugc.aweme.sticker.m r1 = r1.mo92625c(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f112781a
            if (r2 == 0) goto L_0x0081
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x0081
            java.lang.Long r2 = r2.getCreativeId()
            if (r2 == 0) goto L_0x0081
            long r4 = r2.longValue()
            goto L_0x0083
        L_0x0081:
            r4 = 0
        L_0x0083:
            com.ss.android.ugc.aweme.sticker.m r1 = r1.mo92611a(r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f112781a
            if (r2 != 0) goto L_0x008e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x008e:
            long r4 = com.p683ss.android.ugc.aweme.commercialize.log.C26050aq.m63096a(r2)
            com.ss.android.ugc.aweme.sticker.m r1 = r1.mo92622b(r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f112781a
            if (r2 == 0) goto L_0x009f
            com.ss.android.ugc.aweme.feed.model.VideoReplyStruct r2 = r2.getVideoReplyStruct()
            goto L_0x00a0
        L_0x009f:
            r2 = r3
        L_0x00a0:
            com.ss.android.ugc.aweme.sticker.m r1 = r1.mo92612a(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f112781a
            java.lang.String r2 = m97518b(r2)
            com.ss.android.ugc.aweme.sticker.m r1 = r1.mo92626d(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f112781a
            if (r2 == 0) goto L_0x00b6
            java.lang.String r3 = r2.getRequestId()
        L_0x00b6:
            r1.mo92627e(r3)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget r1 = r6.f112793m
            if (r1 == 0) goto L_0x00da
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r6.f112782b
            if (r1 == 0) goto L_0x00cc
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r6.f112782b
            if (r1 == 0) goto L_0x00cb
            java.lang.String r2 = "interact_sticker_data"
            r1.mo48228a(r2, r0)
            goto L_0x00da
        L_0x00cb:
            return
        L_0x00cc:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel r1 = r6.f112790j
            if (r1 == 0) goto L_0x00da
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel r1 = r6.f112790j
            if (r1 == 0) goto L_0x00da
            java.lang.String r2 = "interact_sticker_data"
            r1.mo90667a(r2, r0)
            return
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44576a.mo90506a():void");
    }

    /* renamed from: b */
    public final void mo90512b() {
        List list;
        Aweme aweme = this.f112781a;
        if (aweme != null) {
            list = aweme.getInteractStickerStructs();
        } else {
            list = null;
        }
        if (list != null) {
            Aweme aweme2 = this.f112781a;
            if (aweme2 == null) {
                C52711k.m112234a();
            }
            ArrayList arrayList = new ArrayList(aweme2.getInteractStickerStructs());
            Aweme aweme3 = this.f112781a;
            if (aweme3 != null && aweme3.isProhibited()) {
                arrayList = new ArrayList();
            }
            if (!C9376b.m18558a((Collection<T>) arrayList)) {
                if (this.f112793m == null) {
                    mo90516f();
                }
                m97519b(arrayList);
            } else if (this.f112793m != null) {
                m97519b(new ArrayList<>());
            }
        } else if (this.f112793m != null) {
            m97519b(new ArrayList<>());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final ArrayList<InteractStickerStruct> mo90515e() {
        String str;
        String str2;
        ArrayList<InteractStickerStruct> arrayList;
        if (this.f112786f != null) {
            C48021h hVar = this.f112786f;
            if (hVar == null) {
                C52711k.m112234a();
            }
            str = hVar.mo95301b(f112775o);
            if (str == null) {
                C48021h hVar2 = this.f112786f;
                if (hVar2 == null) {
                    C52711k.m112234a();
                }
                str = hVar2.mo95301b(f112776p);
            }
            if (str == null) {
                C48021h hVar3 = this.f112786f;
                if (hVar3 == null) {
                    C52711k.m112234a();
                }
                str = hVar3.mo95301b(f112777q);
            }
        } else if (this.f112787g != null) {
            String a = C47989ai.m103824a(this.f112787g, f112775o);
            if (a == null) {
                a = C47989ai.m103824a(this.f112787g, f112776p);
            }
            if (str == null) {
                str = C47989ai.m103824a(this.f112787g, f112777q);
            }
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            str2 = new JSONObject(new JSONObject(str).getString(f112778r)).getString(f112779s);
        } catch (Exception unused) {
            str2 = null;
        }
        try {
            arrayList = (ArrayList) C47759cc.m103382a().getGson().mo34885a(str2, new C44580d().f49843c);
        } catch (C18091u unused2) {
            arrayList = null;
        }
        return arrayList;
    }

    public C44576a(C44586b bVar) {
        C52711k.m112240b(bVar, "widgetFactory");
        this.f112794n = bVar;
    }

    /* renamed from: a */
    public final void mo90508a(Aweme aweme) {
        this.f112781a = aweme;
        AbsInteractStickerWidget absInteractStickerWidget = this.f112793m;
        if (absInteractStickerWidget != null) {
            absInteractStickerWidget.mo90663a(aweme);
        }
    }

    /* renamed from: b */
    private final void m97519b(ArrayList<InteractStickerStruct> arrayList) {
        if (this.f112782b != null) {
            DataCenter dataCenter = this.f112782b;
            if (dataCenter != null) {
                dataCenter.mo48228a("interact_sticker_aweme_data", (Object) arrayList);
            }
        } else if (this.f112790j != null) {
            InteractStickerViewModel interactStickerViewModel = this.f112790j;
            if (interactStickerViewModel != null) {
                interactStickerViewModel.mo90667a("interact_sticker_aweme_data", (Object) arrayList);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo90510a(ArrayList<InteractStickerStruct> arrayList) {
        if (this.f112782b != null) {
            DataCenter dataCenter = this.f112782b;
            if (dataCenter != null) {
                dataCenter.mo48228a("interact_sticker_video_data", (Object) arrayList);
            }
        } else if (this.f112790j != null) {
            InteractStickerViewModel interactStickerViewModel = this.f112790j;
            if (interactStickerViewModel != null) {
                interactStickerViewModel.mo90667a("interact_sticker_video_data", (Object) arrayList);
            }
        }
    }

    /* renamed from: b */
    private static String m97518b(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        String str = "";
        if (C9376b.m18558a((Collection<T>) aweme.getTextExtra())) {
            return str;
        }
        try {
            Iterator it = aweme.getTextExtra().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                TextExtraStruct textExtraStruct = (TextExtraStruct) it.next();
                C52711k.m112236a((Object) textExtraStruct, "textExtra");
                if (textExtraStruct.getSubtype() == 2) {
                    if (textExtraStruct.getUserId() != null) {
                        String userId = textExtraStruct.getUserId();
                        C52711k.m112236a((Object) userId, "textExtra.userId");
                        str = userId;
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return str;
    }

    /* renamed from: a */
    public final boolean mo90511a(String str) {
        BusinessExtraData businessExtraData;
        C52711k.m112240b(str, "attr");
        List list = null;
        try {
            businessExtraData = (BusinessExtraData) C47759cc.m103382a().getGson().mo34884a(new JSONObject(str).getString("interaction_extra"), BusinessExtraData.class);
        } catch (Exception unused) {
            businessExtraData = null;
        }
        if (businessExtraData == null) {
            return false;
        }
        Aweme aweme = this.f112781a;
        if (aweme != null) {
            String stickerIDs = aweme.getStickerIDs();
            if (stickerIDs != null) {
                list = C52830p.m112452b((CharSequence) stickerIDs, new String[]{","}, false, 0, 6, (Object) null);
            }
        }
        if (C9376b.m18558a((Collection<T>) list)) {
            return false;
        }
        if (list == null) {
            C52711k.m112234a();
        }
        return list.contains(businessExtraData.getStickerId());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0201, code lost:
        if (r7 == null) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ce, code lost:
        if (r2 == null) goto L_0x00d0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0140  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90507a(android.content.Context r12) {
        /*
            r11 = this;
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget r0 = r11.f112793m
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f112781a
            r1 = 0
            if (r0 == 0) goto L_0x0014
            java.util.List r0 = r0.getInteractStickerStructs()
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 != 0) goto L_0x001d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x002f
        L_0x001d:
            java.util.ArrayList r0 = new java.util.ArrayList
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r11.f112781a
            if (r2 != 0) goto L_0x0026
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0026:
            java.util.List r2 = r2.getInteractStickerStructs()
            java.util.Collection r2 = (java.util.Collection) r2
            r0.<init>(r2)
        L_0x002f:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a$e r2 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a$e
            r2.<init>()
            java.util.Comparator r2 = (java.util.Comparator) r2
            java.util.List r0 = p2628d.p2629a.C52575l.m112122a(r0, r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0042:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0252
            java.lang.Object r2 = r0.next()
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r2 = (com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r2
            int r3 = r2.getType()
            r4 = 1
            if (r3 == r4) goto L_0x014d
            switch(r3) {
                case 3: goto L_0x00e9;
                case 4: goto L_0x0059;
                default: goto L_0x0058;
            }
        L_0x0058:
            goto L_0x0042
        L_0x0059:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r11.f112782b
            if (r2 == 0) goto L_0x006a
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r11.f112782b
            if (r2 == 0) goto L_0x007b
            java.lang.String r3 = "interact_sticker_data"
            java.lang.Object r2 = r2.mo48229a(r3)
            com.ss.android.ugc.aweme.sticker.m r2 = (com.p683ss.android.ugc.aweme.sticker.C46063m) r2
            goto L_0x007c
        L_0x006a:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel r2 = r11.f112790j
            if (r2 == 0) goto L_0x007b
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel r2 = r11.f112790j
            if (r2 == 0) goto L_0x007b
            java.lang.String r3 = "interact_sticker_data"
            java.lang.Object r2 = r2.mo90668a(r3)
            com.ss.android.ugc.aweme.sticker.m r2 = (com.p683ss.android.ugc.aweme.sticker.C46063m) r2
            goto L_0x007c
        L_0x007b:
            r2 = r1
        L_0x007c:
            java.lang.String r3 = "comment_sticker_show"
            com.ss.android.ugc.aweme.app.f.d r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r5 = "enter_from"
            if (r2 == 0) goto L_0x008d
            com.ss.android.ugc.aweme.sticker.l r6 = r2.f116231p
            if (r6 == 0) goto L_0x008d
            java.lang.String r6 = r6.f116212b
            goto L_0x008e
        L_0x008d:
            r6 = r1
        L_0x008e:
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
            java.lang.String r5 = "group_id"
            if (r2 == 0) goto L_0x009d
            com.ss.android.ugc.aweme.sticker.l r6 = r2.f116231p
            if (r6 == 0) goto L_0x009d
            java.lang.String r6 = r6.f116214d
            goto L_0x009e
        L_0x009d:
            r6 = r1
        L_0x009e:
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
            java.lang.String r5 = "log_pb"
            if (r2 == 0) goto L_0x00ad
            com.ss.android.ugc.aweme.sticker.l r6 = r2.f116231p
            if (r6 == 0) goto L_0x00ad
            java.lang.String r6 = r6.f116215e
            goto L_0x00ae
        L_0x00ad:
            r6 = r1
        L_0x00ae:
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
            java.lang.String r5 = "author_id"
            if (r2 == 0) goto L_0x00bd
            com.ss.android.ugc.aweme.sticker.l r6 = r2.f116231p
            if (r6 == 0) goto L_0x00bd
            java.lang.String r6 = r6.f116213c
            goto L_0x00be
        L_0x00bd:
            r6 = r1
        L_0x00be:
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
            java.lang.String r5 = "reply_comment_id"
            if (r2 == 0) goto L_0x00d0
            com.ss.android.ugc.aweme.feed.model.VideoReplyStruct r2 = r2.f116232q
            if (r2 == 0) goto L_0x00d0
            java.lang.String r2 = r2.getCommentId()
            if (r2 != 0) goto L_0x00d2
        L_0x00d0:
            java.lang.String r2 = ""
        L_0x00d2:
            com.ss.android.ugc.aweme.app.f.d r2 = r4.mo47829a(r5, r2)
            java.lang.String r4 = "reply_user_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r11.f112781a
            java.lang.String r5 = m97518b(r5)
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r4, r5)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r2)
            goto L_0x0042
        L_0x00e9:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r11.f112781a
            if (r2 == 0) goto L_0x00f6
            boolean r2 = r2.isAd()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x00f7
        L_0x00f6:
            r2 = r1
        L_0x00f7:
            if (r2 != 0) goto L_0x00fc
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00fc:
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0042
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r11.f112781a
            if (r2 == 0) goto L_0x0112
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x0112
            java.lang.String r2 = r2.getLogExtra()
            r4 = r2
            goto L_0x0113
        L_0x0112:
            r4 = r1
        L_0x0113:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r11.f112781a
            if (r2 == 0) goto L_0x0123
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x0123
            java.lang.String r2 = r2.getPageFrom()
            r5 = r2
            goto L_0x0124
        L_0x0123:
            r5 = r1
        L_0x0124:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r11.f112781a
            if (r2 == 0) goto L_0x012d
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            goto L_0x012e
        L_0x012d:
            r2 = r1
        L_0x012e:
            if (r2 != 0) goto L_0x0133
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0133:
            java.lang.String r3 = "aweme?.awemeRawAd!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.lang.String r6 = com.p683ss.android.ugc.aweme.commercialize.log.C26050aq.m63097a(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r11.f112781a
            if (r2 != 0) goto L_0x0143
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0143:
            long r7 = com.p683ss.android.ugc.aweme.commercialize.log.C26050aq.m63096a(r2)
            r3 = r12
            com.p683ss.android.ugc.aweme.commercialize.log.C26050aq.m63100a(r3, r4, r5, r6, r7)
            goto L_0x0042
        L_0x014d:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r11.f112781a
            if (r3 == 0) goto L_0x015a
            boolean r3 = r3.isAd()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x015b
        L_0x015a:
            r3 = r1
        L_0x015b:
            if (r3 != 0) goto L_0x0160
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0160:
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x01bc
            com.ss.android.ugc.aweme.sticker.data.PoiStruct r3 = r2.getPoiStruct()
            if (r3 == 0) goto L_0x0172
            java.lang.String r3 = r3.getPoiId()
            r5 = r3
            goto L_0x0173
        L_0x0172:
            r5 = r1
        L_0x0173:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r11.f112781a
            if (r3 == 0) goto L_0x0183
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            if (r3 == 0) goto L_0x0183
            java.lang.String r3 = r3.getLogExtra()
            r6 = r3
            goto L_0x0184
        L_0x0183:
            r6 = r1
        L_0x0184:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r11.f112781a
            if (r3 == 0) goto L_0x0194
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            if (r3 == 0) goto L_0x0194
            java.lang.String r3 = r3.getPageFrom()
            r7 = r3
            goto L_0x0195
        L_0x0194:
            r7 = r1
        L_0x0195:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r11.f112781a
            if (r3 == 0) goto L_0x019e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            goto L_0x019f
        L_0x019e:
            r3 = r1
        L_0x019f:
            if (r3 != 0) goto L_0x01a4
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01a4:
            java.lang.String r4 = "aweme?.awemeRawAd!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.lang.String r8 = com.p683ss.android.ugc.aweme.commercialize.log.C26050aq.m63097a(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r11.f112781a
            if (r3 != 0) goto L_0x01b4
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01b4:
            long r9 = com.p683ss.android.ugc.aweme.commercialize.log.C26050aq.m63096a(r3)
            r4 = r12
            com.p683ss.android.ugc.aweme.commercialize.log.C26050aq.m63101a(r4, r5, r6, r7, r8, r9)
        L_0x01bc:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r3 = r11.f112782b
            if (r3 == 0) goto L_0x01cd
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r3 = r11.f112782b
            if (r3 == 0) goto L_0x01de
            java.lang.String r4 = "interact_sticker_data"
            java.lang.Object r3 = r3.mo48229a(r4)
            com.ss.android.ugc.aweme.sticker.m r3 = (com.p683ss.android.ugc.aweme.sticker.C46063m) r3
            goto L_0x01df
        L_0x01cd:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel r3 = r11.f112790j
            if (r3 == 0) goto L_0x01de
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel r3 = r11.f112790j
            if (r3 == 0) goto L_0x01de
            java.lang.String r4 = "interact_sticker_data"
            java.lang.Object r3 = r3.mo90668a(r4)
            com.ss.android.ugc.aweme.sticker.m r3 = (com.p683ss.android.ugc.aweme.sticker.C46063m) r3
            goto L_0x01df
        L_0x01de:
            r3 = r1
        L_0x01df:
            java.lang.String r4 = "poi_sticker_show"
            com.ss.android.ugc.aweme.app.f.d r5 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r6 = "enter_from"
            if (r3 == 0) goto L_0x01f0
            com.ss.android.ugc.aweme.sticker.l r7 = r3.f116231p
            if (r7 == 0) goto L_0x01f0
            java.lang.String r7 = r7.f116212b
            goto L_0x01f1
        L_0x01f0:
            r7 = r1
        L_0x01f1:
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r7)
            java.lang.String r6 = "prop_id"
            com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct r7 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c.m97546c(r2)
            if (r7 == 0) goto L_0x0203
            java.lang.String r7 = r7.getPoiStickerId()
            if (r7 != 0) goto L_0x0205
        L_0x0203:
            java.lang.String r7 = ""
        L_0x0205:
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r7)
            java.lang.String r6 = "group_id"
            if (r3 == 0) goto L_0x0214
            com.ss.android.ugc.aweme.sticker.l r7 = r3.f116231p
            if (r7 == 0) goto L_0x0214
            java.lang.String r7 = r7.f116214d
            goto L_0x0215
        L_0x0214:
            r7 = r1
        L_0x0215:
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r7)
            java.lang.String r6 = "log_pb"
            if (r3 == 0) goto L_0x0224
            com.ss.android.ugc.aweme.sticker.l r7 = r3.f116231p
            if (r7 == 0) goto L_0x0224
            java.lang.String r7 = r7.f116215e
            goto L_0x0225
        L_0x0224:
            r7 = r1
        L_0x0225:
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r7)
            java.lang.String r6 = "author_id"
            if (r3 == 0) goto L_0x0234
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x0234
            java.lang.String r3 = r3.f116213c
            goto L_0x0235
        L_0x0234:
            r3 = r1
        L_0x0235:
            com.ss.android.ugc.aweme.app.f.d r3 = r5.mo47829a(r6, r3)
            java.lang.String r5 = "poi_id"
            com.ss.android.ugc.aweme.sticker.data.PoiStruct r2 = r2.getPoiStruct()
            if (r2 == 0) goto L_0x0246
            java.lang.String r2 = r2.getPoiId()
            goto L_0x0247
        L_0x0246:
            r2 = r1
        L_0x0247:
            com.ss.android.ugc.aweme.app.f.d r2 = r3.mo47829a(r5, r2)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r2)
            goto L_0x0042
        L_0x0252:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44576a.mo90507a(android.content.Context):void");
    }

    /* renamed from: a */
    public final void mo90509a(String str, boolean z) {
        C52711k.m112240b(str, "key");
        if (this.f112793m != null) {
            AbsInteractStickerWidget absInteractStickerWidget = this.f112793m;
            if (absInteractStickerWidget != null) {
                InteractStickerViewModel d = absInteractStickerWidget.mo90665d();
                if (d != null) {
                    d.mo90667a(str, (Object) Boolean.valueOf(z));
                }
            }
        }
    }
}
