package com.p683ss.android.ugc.aweme.shortvideo.lyric;

import android.arch.lifecycle.C0199s;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.p051e.C1208c;
import android.support.p043v7.p051e.C1208c.C1211b;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.ugc.aweme.effect.C29207l;
import com.p683ss.android.ugc.aweme.effect.C29213r;
import com.p683ss.android.ugc.aweme.effect.EffectModel;
import com.p683ss.android.ugc.aweme.effect.p1671b.C29126a;
import com.p683ss.android.ugc.aweme.effect.p1671b.C29126a.C29128b;
import com.p683ss.android.ugc.aweme.effect.p1671b.p1672a.C29137b;
import com.p683ss.android.ugc.aweme.effect.p1671b.p1672a.C29138c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a;
import com.p683ss.android.ugc.aweme.shortvideo.lyric.C43955b.C43957b;
import com.p683ss.android.ugc.aweme.shortvideo.lyric.C43961c.C43967f;
import com.p683ss.android.ugc.aweme.shortvideo.lyric.C43961c.C43968g;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48702g;
import com.p683ss.android.ugc.gamora.editor.C49394cw;
import com.p683ss.android.ugc.gamora.editor.EditLyricStickerViewModel;
import com.p683ss.android.ugc.gamora.editor.EditLyricStickerViewModel.C48959e;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.d */
public final class C43969d implements C29137b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f111340a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C43969d.class), "mDownloadController", "getMDownloadController()Lcom/ss/android/ugc/aweme/effect/download/EffectDownloadController;"))};

    /* renamed from: b */
    View f111341b;

    /* renamed from: c */
    AppCompatActivity f111342c;

    /* renamed from: d */
    AVDmtPanelRecyleView f111343d;

    /* renamed from: e */
    C43955b f111344e;

    /* renamed from: f */
    DmtStatusView f111345f;

    /* renamed from: g */
    List<EffectModel> f111346g = new ArrayList();

    /* renamed from: h */
    public C43961c f111347h;

    /* renamed from: i */
    LyricEffectViewModel f111348i;

    /* renamed from: j */
    public EditLyricStickerViewModel f111349j;

    /* renamed from: k */
    String f111350k;

    /* renamed from: l */
    public final C43974e f111351l = new C43974e(this);

    /* renamed from: m */
    private long f111352m;

    /* renamed from: n */
    private final C52668f f111353n = C52732g.m112285a(new C43973d(this));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.d$a */
    static final class C43970a<T> implements C0199s<C37721a<List<? extends Effect>>> {

        /* renamed from: a */
        final /* synthetic */ C43969d f111354a;

        C43970a(C43969d dVar) {
            this.f111354a = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C37722a aVar;
            Object obj2;
            boolean z;
            boolean z2;
            C37721a aVar2 = (C37721a) obj;
            if (aVar2 != null) {
                aVar = aVar2.f96126b;
            } else {
                aVar = null;
            }
            if (aVar != null && C43975e.f111359a[aVar.ordinal()] == 1) {
                List list = (List) aVar2.f96125a;
                if (list != null) {
                    C52711k.m112236a((Object) list, "it");
                    if (!(!list.isEmpty())) {
                        list = null;
                    }
                    if (list != null) {
                        C52711k.m112236a((Object) list, "effectList");
                        int i = 0;
                        for (Object next : list) {
                            int i2 = i + 1;
                            if (i < 0) {
                                C52575l.m112100b();
                            }
                            Effect effect = (Effect) next;
                            C43969d dVar = this.f111354a;
                            EffectModel a = C29207l.m68788a(i, effect, "");
                            C52711k.m112236a((Object) a, "EffectDataProvider.cover…tModel(index, effect, \"\")");
                            List<EffectModel> list2 = dVar.f111346g;
                            List<EffectModel> e = C52575l.m112139e((Collection<? extends T>) dVar.f111346g);
                            Iterator it = dVar.f111346g.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it.next();
                                EffectModel effectModel = (EffectModel) obj2;
                                if (effectModel.imagePath != a.imagePath || effectModel.type != a.type || effectModel.color != a.color || effectModel.duration != a.duration || !C52711k.m112239a((Object) effectModel.name, (Object) a.name) || !C52711k.m112239a((Object) effectModel.hint, (Object) a.hint) || !C52711k.m112239a((Object) effectModel.key, (Object) a.key) || !C52711k.m112239a((Object) effectModel.resDir, (Object) a.resDir) || !C52711k.m112239a((Object) effectModel.category, (Object) a.category) || !C52711k.m112239a((Object) effectModel.extra, (Object) a.extra)) {
                                    z2 = false;
                                    continue;
                                } else {
                                    z2 = true;
                                    continue;
                                }
                                if (z2) {
                                    break;
                                }
                            }
                            if (((EffectModel) obj2) == null) {
                                Boolean.valueOf(e.add(a));
                            }
                            C1211b a2 = C1208c.m3655a(new C29213r(list2, e), true);
                            C52711k.m112236a((Object) a2, "DiffUtil.calculateDiff(E…(oldList, newList), true)");
                            C43955b bVar = dVar.f111344e;
                            if (bVar == null) {
                                C52711k.m112234a();
                            }
                            a2.mo3931a((C1322a) bVar);
                            dVar.f111346g = e;
                            C43955b bVar2 = dVar.f111344e;
                            if (bVar2 == null) {
                                C52711k.m112234a();
                            }
                            bVar2.mo58935a(dVar.f111346g);
                            C43955b bVar3 = dVar.f111344e;
                            if (bVar3 == null) {
                                C52711k.m112234a();
                            }
                            bVar3.mo89521a(dVar.f111350k);
                            AVDmtPanelRecyleView aVDmtPanelRecyleView = dVar.f111343d;
                            if (aVDmtPanelRecyleView == null) {
                                C52711k.m112237a("mLyricEffectRecyclerView");
                            }
                            if (aVDmtPanelRecyleView.getVisibility() == 8) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                aVDmtPanelRecyleView = null;
                            }
                            if (aVDmtPanelRecyleView != null) {
                                dVar.mo89532a(false);
                            }
                            i = i2;
                        }
                        this.f111354a.mo89530a().mo58999a(C52575l.m112097a());
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.d$b */
    static final class C43971b<T> implements C0199s<C37721a<List<? extends Effect>>> {

        /* renamed from: a */
        final /* synthetic */ C43969d f111355a;

        C43971b(C43969d dVar) {
            this.f111355a = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C37722a aVar;
            C37721a aVar2 = (C37721a) obj;
            if (aVar2 != null) {
                aVar = aVar2.f96126b;
            } else {
                aVar = null;
            }
            if (aVar != null && C43975e.f111360b[aVar.ordinal()] == 1) {
                List list = (List) aVar2.f96125a;
                if (list != null) {
                    C52711k.m112236a((Object) list, "it");
                    if (!(!list.isEmpty())) {
                        list = null;
                    }
                    if (list != null) {
                        this.f111355a.mo89530a().mo58999a(C52575l.m112097a());
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.d$c */
    public static final class C43972c implements C43957b {

        /* renamed from: b */
        final /* synthetic */ C43969d f111356b;

        C43972c(C43969d dVar) {
            this.f111356b = dVar;
        }

        /* renamed from: a */
        public final void mo89522a(EffectModel effectModel, int i, int i2) {
            C52711k.m112240b(effectModel, "model");
            if (i == 1) {
                C43961c cVar = this.f111356b.f111347h;
                if (cVar == null) {
                    C52711k.m112234a();
                }
                if (i2 < cVar.f111325b.size()) {
                    C43961c cVar2 = this.f111356b.f111347h;
                    if (cVar2 == null) {
                        C52711k.m112234a();
                    }
                    Effect effect = (Effect) cVar2.f111325b.get(i2);
                    Effect b = this.f111356b.mo89533b(effect);
                    if (this.f111356b.mo89530a() != null) {
                        C29252f a = C29126a.m68614a();
                        if (a != null && a.mo59142a(effect)) {
                            if (this.f111356b.mo89530a() != null) {
                                C29252f a2 = C29126a.m68614a();
                                if (a2 != null && a2.mo59142a(b)) {
                                    EditLyricStickerViewModel editLyricStickerViewModel = this.f111356b.f111349j;
                                    if (editLyricStickerViewModel == null) {
                                        C52711k.m112237a("editLyricStickerViewModel");
                                    }
                                    editLyricStickerViewModel.mo22530c(new C48959e(new C49394cw(effect, b)));
                                }
                            }
                            C29126a a3 = this.f111356b.mo89530a();
                            if (a3 != null) {
                                a3.mo58997a(effect);
                                return;
                            }
                            return;
                        }
                    }
                    C29126a a4 = this.f111356b.mo89530a();
                    if (a4 != null) {
                        a4.mo58997a(effect);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.d$d */
    static final class C43973d extends C52712l implements C52670a<C29126a> {

        /* renamed from: a */
        final /* synthetic */ C43969d f111357a;

        C43973d(C43969d dVar) {
            this.f111357a = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C29128b().mo59004a(Integer.valueOf(3)).mo59003a((C29138c) this.f111357a.f111351l).mo59005a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.d$e */
    public static final class C43974e implements C29138c {

        /* renamed from: a */
        final /* synthetic */ C43969d f111358a;

        /* renamed from: a */
        public final boolean mo59012a() {
            return true;
        }

        C43974e(C43969d dVar) {
            this.f111358a = dVar;
        }

        /* renamed from: a */
        public final Effect mo59011a(Queue<Effect> queue) {
            C52711k.m112240b(queue, "queue");
            C43961c cVar = this.f111358a.f111347h;
            if (cVar == null) {
                C52711k.m112234a();
            }
            int size = cVar.f111325b.size();
            for (int i = 0; i < size; i++) {
                C43961c cVar2 = this.f111358a.f111347h;
                if (cVar2 == null) {
                    C52711k.m112234a();
                }
                Effect effect = (Effect) cVar2.f111325b.get(i);
                this.f111358a.mo89530a();
                C29252f a = C29126a.m68614a();
                if (a == null) {
                    C52711k.m112234a();
                }
                boolean a2 = a.mo59142a(effect);
                boolean contains = queue.contains(effect);
                Effect b = this.f111358a.mo89533b(effect);
                this.f111358a.mo89530a();
                C29252f a3 = C29126a.m68614a();
                if (a3 == null) {
                    C52711k.m112234a();
                }
                boolean a4 = a3.mo59142a(b);
                boolean contains2 = queue.contains(b);
                if (!a2 && !contains) {
                    return effect;
                }
                if (!a4 && !contains2) {
                    return b;
                }
                if (a2 && a4) {
                    this.f111358a.mo89530a().mo58998a(effect, effect, false);
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public final C29126a mo89530a() {
        return (C29126a) this.f111353n.getValue();
    }

    /* renamed from: b */
    public final Effect mo89533b(Effect effect) {
        C52711k.m112240b(effect, "lyricEffect");
        C43961c cVar = this.f111347h;
        if (cVar != null) {
            return cVar.mo89526a(effect);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo59013a(Effect effect) {
        C52711k.m112240b(effect, "rawEffect");
        this.f111352m = System.currentTimeMillis();
        int c = m96521c(effect);
        if (c >= 0) {
            C43955b bVar = this.f111344e;
            if (bVar == null) {
                C52711k.m112234a();
            }
            bVar.mo58934a(c, 2);
        }
    }

    /* renamed from: a */
    public final void mo89531a(FragmentActivity fragmentActivity) {
        C52711k.m112240b(fragmentActivity, "context");
        if (this.f111347h == null) {
            this.f111347h = new C43961c(fragmentActivity);
        }
        C43961c cVar = this.f111347h;
        if (cVar == null) {
            C52711k.m112234a();
        }
        cVar.mo89525a().mo59143b("lyricstyle", true, (C48702g) new C43967f(cVar));
        cVar.mo89525a().mo59143b("lyricstylefont", true, (C48702g) new C43968g(cVar));
    }

    /* renamed from: c */
    private final int m96521c(Effect effect) {
        C43961c cVar = this.f111347h;
        if (cVar == null) {
            C52711k.m112234a();
        }
        int indexOf = cVar.f111325b.indexOf(effect);
        if (indexOf >= 0) {
            return indexOf;
        }
        C43961c cVar2 = this.f111347h;
        if (cVar2 == null) {
            C52711k.m112234a();
        }
        int size = cVar2.f111325b.size();
        for (int i = 0; i < size; i++) {
            String extra = effect.getExtra();
            C43961c cVar3 = this.f111347h;
            if (cVar3 == null) {
                C52711k.m112234a();
            }
            if (C52711k.m112239a((Object) extra, (Object) ((Effect) cVar3.f111325b.get(i)).getExtra())) {
                return i;
            }
        }
        return indexOf;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo89532a(boolean z) {
        if (z) {
            View view = this.f111341b;
            if (view == null) {
                C52711k.m112234a();
            }
            View findViewById = view.findViewById(R.id.bh_);
            C52711k.m112236a((Object) findViewById, "mView!!.findViewById<View>(R.id.loading_area)");
            findViewById.setVisibility(0);
            AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f111343d;
            if (aVDmtPanelRecyleView == null) {
                C52711k.m112237a("mLyricEffectRecyclerView");
            }
            aVDmtPanelRecyleView.setVisibility(8);
            DmtStatusView dmtStatusView = this.f111345f;
            if (dmtStatusView == null) {
                C52711k.m112237a("mStatusView");
            }
            dmtStatusView.mo19212f();
            return;
        }
        DmtStatusView dmtStatusView2 = this.f111345f;
        if (dmtStatusView2 == null) {
            C52711k.m112237a("mStatusView");
        }
        dmtStatusView2.mo19209d();
        View view2 = this.f111341b;
        if (view2 == null) {
            C52711k.m112234a();
        }
        View findViewById2 = view2.findViewById(R.id.bh_);
        C52711k.m112236a((Object) findViewById2, "mView!!.findViewById<View>(R.id.loading_area)");
        findViewById2.setVisibility(8);
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = this.f111343d;
        if (aVDmtPanelRecyleView2 == null) {
            C52711k.m112237a("mLyricEffectRecyclerView");
        }
        aVDmtPanelRecyleView2.setVisibility(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r1 == null) goto L_0x001a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59014a(com.p683ss.android.ugc.effectmanager.effect.model.Effect r11, com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d r12) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x0013
            int r0 = r10.m96521c(r11)
            if (r0 < 0) goto L_0x0013
            com.ss.android.ugc.aweme.shortvideo.lyric.b r1 = r10.f111344e
            if (r1 != 0) goto L_0x000f
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x000f:
            r2 = 4
            r1.mo58934a(r0, r2)
        L_0x0013:
            r0 = 0
            if (r12 == 0) goto L_0x001a
            java.lang.String r1 = r12.f122280b
            if (r1 != 0) goto L_0x003c
        L_0x001a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r12 == 0) goto L_0x0031
            int r2 = r12.f122279a
            r3 = -1
            if (r2 != r3) goto L_0x0031
            java.lang.Exception r2 = r12.f122281c
            if (r2 == 0) goto L_0x002f
            java.lang.StackTraceElement[] r2 = r2.getStackTrace()
            goto L_0x0033
        L_0x002f:
            r2 = r0
            goto L_0x0033
        L_0x0031:
            java.lang.String r2 = ""
        L_0x0033:
            java.io.Serializable r2 = (java.io.Serializable) r2
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L_0x003c:
            java.lang.String r2 = "aweme_type_download_font_rate"
            r3 = 1
            com.ss.android.ugc.aweme.shortvideo.ay r4 = com.p683ss.android.ugc.aweme.shortvideo.C42437ay.m93202a()
            java.lang.String r5 = "duration"
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r10.f111352m
            long r6 = r6 - r8
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            com.ss.android.ugc.aweme.shortvideo.ay r4 = r4.mo86520a(r5, r6)
            java.lang.String r5 = "effect_id"
            if (r11 == 0) goto L_0x005d
            java.lang.String r6 = r11.getEffectId()
            goto L_0x005e
        L_0x005d:
            r6 = r0
        L_0x005e:
            com.ss.android.ugc.aweme.shortvideo.ay r4 = r4.mo86521a(r5, r6)
            java.lang.String r5 = "id"
            if (r11 == 0) goto L_0x006b
            java.lang.String r11 = r11.getId()
            goto L_0x006c
        L_0x006b:
            r11 = r0
        L_0x006c:
            com.ss.android.ugc.aweme.shortvideo.ay r11 = r4.mo86521a(r5, r11)
            java.lang.String r4 = "errorCode"
            if (r12 == 0) goto L_0x007a
            int r12 = r12.f122279a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
        L_0x007a:
            java.lang.String r12 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.shortvideo.ay r11 = r11.mo86521a(r4, r12)
            java.lang.String r12 = "errorMsg"
            com.ss.android.ugc.aweme.shortvideo.ay r11 = r11.mo86521a(r12, r1)
            org.json.JSONObject r11 = r11.mo86522b()
            com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r2, r3, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.lyric.C43969d.mo59014a(com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.effectmanager.common.g.d):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59015a(com.p683ss.android.ugc.effectmanager.effect.model.Effect r8, com.p683ss.android.ugc.effectmanager.effect.model.Effect r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r10 = "rawEffect"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r10)
            int r8 = r7.m96521c(r8)
            r10 = 0
            if (r8 >= 0) goto L_0x0068
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "lyric effect is not ready, effect_id:"
            r0.<init>(r1)
            if (r9 == 0) goto L_0x001a
            java.lang.String r1 = r9.getEffectId()
            goto L_0x001b
        L_0x001a:
            r1 = r10
        L_0x001b:
            r0.append(r1)
            java.lang.String r1 = "  position="
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay.m98971b(r8)
            java.lang.String r8 = "aweme_type_download_font_rate"
            r0 = 11
            com.ss.android.ugc.aweme.shortvideo.ay r1 = com.p683ss.android.ugc.aweme.shortvideo.C42437ay.m93202a()
            java.lang.String r2 = "duration"
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r7.f111352m
            long r3 = r3 - r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            com.ss.android.ugc.aweme.shortvideo.ay r1 = r1.mo86520a(r2, r3)
            java.lang.String r2 = "effect_id"
            if (r9 == 0) goto L_0x004f
            java.lang.String r3 = r9.getEffectId()
            goto L_0x0050
        L_0x004f:
            r3 = r10
        L_0x0050:
            com.ss.android.ugc.aweme.shortvideo.ay r1 = r1.mo86521a(r2, r3)
            java.lang.String r2 = "id"
            if (r9 == 0) goto L_0x005c
            java.lang.String r10 = r9.getId()
        L_0x005c:
            com.ss.android.ugc.aweme.shortvideo.ay r9 = r1.mo86521a(r2, r10)
            org.json.JSONObject r9 = r9.mo86522b()
            com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r8, r0, r9)
            return
        L_0x0068:
            r7.mo89530a()
            com.ss.android.ugc.aweme.effectplatform.f r0 = com.p683ss.android.ugc.aweme.effect.p1671b.C29126a.m68614a()
            if (r0 != 0) goto L_0x0074
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0074:
            com.ss.android.ugc.aweme.shortvideo.lyric.c r1 = r7.f111347h
            if (r1 != 0) goto L_0x007b
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x007b:
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = r1.f111325b
            java.lang.Object r1 = r1.get(r8)
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r1
            boolean r0 = r0.mo59142a(r1)
            if (r0 == 0) goto L_0x00ba
            r7.mo89530a()
            com.ss.android.ugc.aweme.effectplatform.f r0 = com.p683ss.android.ugc.aweme.effect.p1671b.C29126a.m68614a()
            if (r0 != 0) goto L_0x0095
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0095:
            com.ss.android.ugc.aweme.shortvideo.lyric.c r1 = r7.f111347h
            if (r1 != 0) goto L_0x009c
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x009c:
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = r1.f111325b
            java.lang.Object r1 = r1.get(r8)
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r1
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r7.mo89533b(r1)
            boolean r0 = r0.mo59142a(r1)
            if (r0 == 0) goto L_0x00ba
            com.ss.android.ugc.aweme.shortvideo.lyric.b r0 = r7.f111344e
            if (r0 != 0) goto L_0x00b5
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00b5:
            r1 = 3
            r0.mo58934a(r8, r1)
            goto L_0x00d3
        L_0x00ba:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "lyric effect is not ready, effect_id:"
            r8.<init>(r0)
            if (r9 == 0) goto L_0x00c8
            java.lang.String r0 = r9.getEffectId()
            goto L_0x00c9
        L_0x00c8:
            r0 = r10
        L_0x00c9:
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay.m98971b(r8)
        L_0x00d3:
            java.lang.String r8 = "aweme_type_download_font_rate"
            r0 = 0
            com.ss.android.ugc.aweme.shortvideo.ay r1 = com.p683ss.android.ugc.aweme.shortvideo.C42437ay.m93202a()
            java.lang.String r2 = "duration"
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r7.f111352m
            long r3 = r3 - r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            com.ss.android.ugc.aweme.shortvideo.ay r1 = r1.mo86520a(r2, r3)
            java.lang.String r2 = "effect_id"
            if (r9 == 0) goto L_0x00f4
            java.lang.String r3 = r9.getEffectId()
            goto L_0x00f5
        L_0x00f4:
            r3 = r10
        L_0x00f5:
            com.ss.android.ugc.aweme.shortvideo.ay r1 = r1.mo86521a(r2, r3)
            java.lang.String r2 = "id"
            if (r9 == 0) goto L_0x0101
            java.lang.String r10 = r9.getId()
        L_0x0101:
            com.ss.android.ugc.aweme.shortvideo.ay r9 = r1.mo86521a(r2, r10)
            org.json.JSONObject r9 = r9.mo86522b()
            com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r8, r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.lyric.C43969d.mo59015a(com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.effectmanager.effect.model.Effect, boolean):void");
    }
}
