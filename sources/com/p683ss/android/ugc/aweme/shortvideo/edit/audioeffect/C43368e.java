package com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.infoSticker.C35586b;
import com.p683ss.android.ugc.aweme.infoSticker.C35587c;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43359c.C43360a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43359c.C43363d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43374f.C43377b;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p683ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C52970h;
import dmt.p2652av.video.C52977l;
import dmt.p2652av.video.C52977l.C52978a;
import dmt.p2652av.video.VEVideoPublishEditViewModel;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e */
public final class C43368e extends C1322a<C1352v> implements C43377b {

    /* renamed from: a */
    public boolean f109635a;

    /* renamed from: b */
    public CategoryPageModel f109636b;

    /* renamed from: c */
    public C43395l f109637c;

    /* renamed from: d */
    public final AppCompatActivity f109638d;

    /* renamed from: e */
    final VideoPublishEditModel f109639e;

    /* renamed from: f */
    private int f109640f;

    /* renamed from: g */
    private List<? extends Effect> f109641g;

    /* renamed from: h */
    private RecyclerView f109642h;

    /* renamed from: i */
    private C43377b f109643i = new C43377b(this) {

        /* renamed from: a */
        final /* synthetic */ C43368e f109647a;

        {
            this.f109647a = r1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
            if (r4 == null) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
            if (r4 == null) goto L_0x007b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0091, code lost:
            if (r4 == null) goto L_0x0093;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a9, code lost:
            if (r4 == null) goto L_0x00ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c1, code lost:
            if (r4 == null) goto L_0x00c3;
         */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0036 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0037  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo88302a(android.view.View r7, int r8) {
            /*
                r6 = this;
                java.lang.String r0 = "view"
                p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
                r7 = -1
                if (r7 != r8) goto L_0x0009
                return
            L_0x0009:
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e r7 = r6.f109647a
                r0 = 1
                r7.f109635a = r0
                if (r8 != 0) goto L_0x0016
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e r7 = r6.f109647a
                r7.mo88300a(r8)
                return
            L_0x0016:
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e r7 = r6.f109647a
                if (r8 <= 0) goto L_0x0033
                com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r0 = r7.f109636b
                if (r0 == 0) goto L_0x0033
                com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r0 = r0.getCategoryEffects()
                if (r0 == 0) goto L_0x0033
                java.util.List r0 = r0.getEffects()
                if (r0 == 0) goto L_0x0033
                int r1 = r8 + -1
                java.lang.Object r0 = r0.get(r1)
                com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r0
                goto L_0x0034
            L_0x0033:
                r0 = 0
            L_0x0034:
                if (r0 != 0) goto L_0x0037
                return
            L_0x0037:
                java.lang.String r1 = "select_voice_effect"
                com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r3 = "enter_from"
                java.lang.String r4 = "video_edit_page"
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
                java.lang.String r3 = "effect_name"
                java.lang.String r4 = r0.getName()
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
                java.lang.String r3 = "effect_id"
                java.lang.String r4 = r0.getEffectId()
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
                java.lang.String r3 = "shoot_way"
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r7.f109639e
                if (r4 == 0) goto L_0x006b
                com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r4 = r4.getAvetParameter()
                if (r4 == 0) goto L_0x006b
                java.lang.String r4 = r4.getShootWay()
                if (r4 != 0) goto L_0x006d
            L_0x006b:
                java.lang.String r4 = ""
            L_0x006d:
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
                java.lang.String r3 = "creation_id"
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r7.f109639e
                if (r4 == 0) goto L_0x007b
                java.lang.String r4 = r4.creationId
                if (r4 != 0) goto L_0x007d
            L_0x007b:
                java.lang.String r4 = ""
            L_0x007d:
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
                java.lang.String r3 = "content_source"
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r7.f109639e
                if (r4 == 0) goto L_0x0093
                com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r4 = r4.getAvetParameter()
                if (r4 == 0) goto L_0x0093
                java.lang.String r4 = r4.getContentSource()
                if (r4 != 0) goto L_0x0095
            L_0x0093:
                java.lang.String r4 = ""
            L_0x0095:
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
                java.lang.String r3 = "shoot_entrance"
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r7.f109639e
                if (r4 == 0) goto L_0x00ab
                com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r4 = r4.getAvetParameter()
                if (r4 == 0) goto L_0x00ab
                java.lang.String r4 = r4.getStoryShootEntrance()
                if (r4 != 0) goto L_0x00ad
            L_0x00ab:
                java.lang.String r4 = ""
            L_0x00ad:
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
                java.lang.String r3 = "content_type"
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r7.f109639e
                if (r4 == 0) goto L_0x00c3
                com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r4 = r4.getAvetParameter()
                if (r4 == 0) goto L_0x00c3
                java.lang.String r4 = r4.getContentType()
                if (r4 != 0) goto L_0x00c5
            L_0x00c3:
                java.lang.String r4 = ""
            L_0x00c5:
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
                java.lang.String r3 = "local_time_ms"
                long r4 = java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47827a(r3, r4)
                java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r1, r2)
                java.lang.String r1 = r0.getUnzipPath()
                if (r1 != 0) goto L_0x00e0
                java.lang.String r1 = ""
            L_0x00e0:
                com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43359c.C43360a.m95089a()
                boolean r2 = com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43359c.m95086a(r0)
                if (r2 == 0) goto L_0x0100
                java.lang.String r2 = com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43368e.m95103a(r0)
                java.lang.String r3 = com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43347a.m95071b(r0)
                r7.mo88304a(r0, r2, r3, r1)
                r7.mo88305b(r8)
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.l r7 = r7.f109637c
                if (r7 == 0) goto L_0x00ff
                r7.mo88315a(r0)
                goto L_0x012c
            L_0x00ff:
                return
            L_0x0100:
                r1 = 2
                r7.mo88301a(r8, r1)
                com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43359c.C43360a.m95089a()
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e$b r1 = new com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e$b
                r1.<init>(r7, r0, r8)
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$d r1 = (com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43359c.C43363d) r1
                java.lang.String r7 = "effect"
                p2628d.p2639f.p2641b.C52711k.m112240b(r0, r7)
                com.ss.android.ugc.aweme.effectplatform.f r7 = com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43359c.C43360a.m95090b()
                if (r7 == 0) goto L_0x012c
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$f r8 = new com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$f
                r8.<init>(r1)
                com.ss.android.ugc.effectmanager.effect.c.j r8 = (com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j) r8
                java.lang.String r1 = "effect"
                com.ss.android.ugc.aweme.effectplatform.u r8 = com.p683ss.android.ugc.aweme.effectplatform.C29272u.m68985a(r8, r1)
                com.ss.android.ugc.effectmanager.effect.c.j r8 = (com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j) r8
                r7.mo59123a(r0, r8)
                return
            L_0x012c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43368e.C433691.mo88302a(android.view.View, int):void");
        }
    };

    /* renamed from: j */
    private final VEVideoPublishEditViewModel f109644j;

    /* renamed from: k */
    private final C20347c f109645k;

    /* renamed from: l */
    private final AudioEffectParam f109646l;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e$a */
    static final class C43370a implements C35586b {

        /* renamed from: a */
        final /* synthetic */ AudioEffectParam f109648a;

        C43370a(AudioEffectParam audioEffectParam) {
            this.f109648a = audioEffectParam;
        }

        /* renamed from: a */
        public final void mo73981a(AVChallenge aVChallenge) {
            this.f109648a.setChallenge(aVChallenge);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e$b */
    public static final class C43371b implements C43363d {

        /* renamed from: a */
        final /* synthetic */ C43368e f109649a;

        /* renamed from: b */
        final /* synthetic */ Effect f109650b;

        /* renamed from: c */
        final /* synthetic */ int f109651c;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e$b$a */
        static final class C43372a<V> implements Callable<Object> {

            /* renamed from: a */
            final /* synthetic */ C43371b f109652a;

            C43372a(C43371b bVar) {
                this.f109652a = bVar;
            }

            public final /* synthetic */ Object call() {
                C10691a.m21542b((Context) this.f109652a.f109649a.f109638d, (int) R.string.ot).mo19066a();
                this.f109652a.f109649a.mo88301a(this.f109652a.f109651c, 3);
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e$b$b */
        static final class C43373b<V> implements Callable<Object> {

            /* renamed from: a */
            final /* synthetic */ C43371b f109653a;

            /* renamed from: b */
            final /* synthetic */ Effect f109654b;

            C43373b(C43371b bVar, Effect effect) {
                this.f109653a = bVar;
                this.f109654b = effect;
            }

            public final /* synthetic */ Object call() {
                CategoryPageModel categoryPageModel = this.f109653a.f109649a.f109636b;
                if (categoryPageModel != null) {
                    CategoryEffectModel categoryEffects = categoryPageModel.getCategoryEffects();
                    if (categoryEffects != null) {
                        List effects = categoryEffects.getEffects();
                        if (effects != null) {
                            effects.set(this.f109653a.f109651c - 1, this.f109654b);
                        }
                    }
                }
                this.f109653a.f109649a.mo88301a(this.f109653a.f109651c, 1);
                this.f109653a.f109649a.mo88305b(this.f109653a.f109651c);
                C43395l lVar = this.f109653a.f109649a.f109637c;
                if (lVar == null) {
                    return null;
                }
                lVar.mo88315a(this.f109653a.f109650b);
                return C52860x.f131107a;
            }
        }

        /* renamed from: a */
        public final void mo88295a(Effect effect) {
            CharSequence charSequence;
            String str;
            String str2 = null;
            if (effect != null) {
                charSequence = effect.getEffectId();
            } else {
                charSequence = null;
            }
            if (TextUtils.equals(charSequence, this.f109650b.getEffectId())) {
                C0013i.m18a((Callable<TResult>) new C43373b<TResult>(this, effect), C0013i.f25b);
                C43368e eVar = this.f109649a;
                String a = C43368e.m95103a(effect);
                if (effect != null) {
                    str = C43347a.m95071b(effect);
                } else {
                    str = null;
                }
                if (effect != null) {
                    str2 = effect.getUnzipPath();
                }
                eVar.mo88304a(effect, a, str, str2);
            }
        }

        /* renamed from: a */
        public final void mo88296a(Effect effect, C48649d dVar) {
            String str;
            C52711k.m112240b(dVar, "e");
            if (effect != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            if (TextUtils.equals(str, this.f109650b.getEffectId())) {
                C0013i.m18a((Callable<TResult>) new C43372a<TResult>(this), C0013i.f25b);
            }
        }

        C43371b(C43368e eVar, Effect effect, int i) {
            this.f109649a = eVar;
            this.f109650b = effect;
            this.f109651c = i;
        }
    }

    /* renamed from: a */
    public final void mo88299a() {
        C43357b.m95081a(this.f109639e);
    }

    public final int getItemCount() {
        int i;
        CategoryPageModel categoryPageModel = this.f109636b;
        if (categoryPageModel != null) {
            CategoryEffectModel categoryEffects = categoryPageModel.getCategoryEffects();
            if (categoryEffects != null) {
                List effects = categoryEffects.getEffects();
                if (effects != null) {
                    i = effects.size();
                    return i + 1;
                }
            }
        }
        i = 0;
        return i + 1;
    }

    /* renamed from: a */
    public static String m95103a(Effect effect) {
        if (effect == null) {
            return "";
        }
        String effectId = effect.getEffectId();
        if (effectId == null) {
            effectId = "";
        }
        return effectId;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f109642h = recyclerView;
    }

    /* renamed from: a */
    public final void mo88300a(int i) {
        boolean z;
        mo88305b(i);
        C52970h c = this.f109644j.mo110458c();
        C52711k.m112236a((Object) c, "viewModel.audioEffectOpLiveData");
        VideoPublishEditModel videoPublishEditModel = this.f109639e;
        if (videoPublishEditModel != null) {
            z = videoPublishEditModel.isReviewVideo();
        } else {
            z = false;
        }
        C52977l lVar = new C52977l("clear", true, z, null, 8, null);
        c.setValue(lVar);
        mo88299a();
    }

    /* renamed from: b */
    public final void mo88305b(int i) {
        C1352v vVar;
        int itemCount = getItemCount();
        int i2 = this.f109640f;
        C1352v vVar2 = null;
        if (i2 >= 0 && itemCount > i2) {
            RecyclerView recyclerView = this.f109642h;
            if (recyclerView != null) {
                vVar = recyclerView.mo4847f(this.f109640f);
            } else {
                vVar = null;
            }
            if (vVar instanceof C43374f) {
                ((C43374f) vVar).mo88309a(false);
            } else {
                notifyItemChanged(this.f109640f);
            }
        }
        this.f109640f = i;
        if (this.f109640f < getItemCount()) {
            RecyclerView recyclerView2 = this.f109642h;
            if (recyclerView2 != null) {
                vVar2 = recyclerView2.mo4847f(this.f109640f);
            }
            if (vVar2 instanceof C43374f) {
                ((C43374f) vVar2).mo88309a(true);
            }
        }
    }

    /* renamed from: a */
    private final void m95104a(Effect effect, AudioEffectParam audioEffectParam) {
        mo88299a();
        new C35587c(this.f109638d, C46059g.m100090n(effect)).mo73988a(new C43370a(audioEffectParam));
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "viewGroup");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C52711k.m112236a((Object) from, "LayoutInflater.from(viewGroup.context)");
        C52711k.m112240b(from, "inflater");
        C52711k.m112240b(viewGroup, "parent");
        View inflate = from.inflate(R.layout.fx, viewGroup, false);
        if (inflate != null) {
            return new C43374f((FrameLayout) inflate, this);
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    /* renamed from: a */
    public final void mo88301a(int i, int i2) {
        C1352v vVar;
        int itemCount = getItemCount();
        if (i >= 0 && itemCount > i) {
            RecyclerView recyclerView = this.f109642h;
            if (recyclerView != null) {
                vVar = recyclerView.mo4847f(i);
            } else {
                vVar = null;
            }
            if (vVar instanceof C43374f) {
                ((C43374f) vVar).mo88308a(i2);
                return;
            }
            notifyItemChanged(i);
        }
    }

    /* renamed from: a */
    public final void mo88302a(View view, int i) {
        C52711k.m112240b(view, "view");
        C43377b bVar = this.f109643i;
        if (bVar != null) {
            bVar.mo88302a(view, i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f2 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88303a(com.p683ss.android.ugc.effectmanager.effect.model.CategoryPageModel r10, boolean r11) {
        /*
            r9 = this;
            java.lang.String r0 = "model"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r0 = r9.f109636b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r10, r0)
            if (r0 == 0) goto L_0x000e
            return
        L_0x000e:
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r0 = r10.getCategoryEffects()
            if (r0 == 0) goto L_0x010b
            java.util.List r0 = r0.getEffects()
            if (r0 != 0) goto L_0x001c
            goto L_0x010b
        L_0x001c:
            r9.f109641g = r0
            r9.f109636b = r10
            r9.notifyDataSetChanged()
            boolean r10 = r9.f109635a
            if (r10 != 0) goto L_0x010a
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r10 = r9.f109646l
            r0 = 0
            if (r10 == 0) goto L_0x0031
            java.lang.String r10 = r10.getEffectPath()
            goto L_0x0032
        L_0x0031:
            r10 = r0
        L_0x0032:
            if (r10 == 0) goto L_0x010a
            com.ss.android.ugc.asve.c.c r10 = r9.f109645k
            r1 = 1
            r2 = 0
            if (r10 == 0) goto L_0x005a
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r10 = r9.f109646l
            if (r10 == 0) goto L_0x0047
            int r10 = r10.getTrackType()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            goto L_0x0048
        L_0x0047:
            r10 = r0
        L_0x0048:
            if (r10 == 0) goto L_0x005a
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r10 = r9.f109646l
            java.lang.String r10 = r10.getEffectPath()
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x005a
            r10 = 1
            goto L_0x005b
        L_0x005a:
            r10 = 0
        L_0x005b:
            if (r10 != 0) goto L_0x005f
            goto L_0x010a
        L_0x005f:
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r10 = r9.f109646l
            if (r10 != 0) goto L_0x0067
            r9.mo88305b(r2)
            return
        L_0x0067:
            r10 = -1
            java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect> r3 = r9.f109641g
            if (r3 == 0) goto L_0x00f5
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
            r10 = 0
            r4 = -1
        L_0x0074:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00f4
            java.lang.Object r5 = r3.next()
            int r6 = r10 + 1
            if (r10 >= 0) goto L_0x0085
            p2628d.p2629a.C52575l.m112100b()
        L_0x0085:
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r5
            java.lang.String r7 = r5.getUnzipPath()
            if (r7 == 0) goto L_0x00f2
            java.lang.String r7 = r5.getUnzipPath()
            boolean r7 = com.p683ss.android.ugc.tools.utils.C50200d.m108346a(r7)
            if (r7 == 0) goto L_0x00f2
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r7 = r9.f109646l
            if (r7 == 0) goto L_0x00a0
            java.lang.String r7 = r7.getEffectTag()
            goto L_0x00a1
        L_0x00a0:
            r7 = r0
        L_0x00a1:
            boolean r7 = com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43347a.m95070a(r5, r7)
            if (r7 == 0) goto L_0x00c1
            java.lang.String r7 = r5.getUnzipPath()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r8 = r9.f109646l
            if (r8 == 0) goto L_0x00b6
            java.lang.String r8 = r8.getEffectPath()
            goto L_0x00b7
        L_0x00b6:
            r8 = r0
        L_0x00b7:
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r7 = android.text.TextUtils.equals(r7, r8)
            if (r7 == 0) goto L_0x00c1
            r7 = 1
            goto L_0x00c2
        L_0x00c1:
            r7 = 0
        L_0x00c2:
            if (r7 != 0) goto L_0x00f1
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r7 = r9.f109646l
            if (r7 == 0) goto L_0x00cd
            java.lang.String r7 = r7.getEffectTag()
            goto L_0x00ce
        L_0x00cd:
            r7 = r0
        L_0x00ce:
            boolean r7 = com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43347a.m95070a(r5, r7)
            if (r7 != 0) goto L_0x00ee
            java.lang.String r5 = r5.getUnzipPath()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r7 = r9.f109646l
            if (r7 == 0) goto L_0x00e3
            java.lang.String r7 = r7.getEffectPath()
            goto L_0x00e4
        L_0x00e3:
            r7 = r0
        L_0x00e4:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r5 = android.text.TextUtils.equals(r5, r7)
            if (r5 == 0) goto L_0x00ee
            r5 = 1
            goto L_0x00ef
        L_0x00ee:
            r5 = 0
        L_0x00ef:
            if (r5 == 0) goto L_0x00f2
        L_0x00f1:
            r4 = r10
        L_0x00f2:
            r10 = r6
            goto L_0x0074
        L_0x00f4:
            r10 = r4
        L_0x00f5:
            int r10 = r10 + r1
            r9.f109640f = r10
            int r10 = r9.f109640f
            if (r10 <= 0) goto L_0x0102
            int r10 = r9.f109640f
            r9.mo88305b(r10)
            return
        L_0x0102:
            if (r11 == 0) goto L_0x0109
            int r10 = r9.f109640f
            r9.mo88300a(r10)
        L_0x0109:
            return
        L_0x010a:
            return
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43368e.mo88303a(com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel, boolean):void");
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        Effect effect;
        List list;
        boolean z;
        int i2;
        CharSequence charSequence;
        C52711k.m112240b(vVar, "viewHolder");
        if (vVar instanceof C43374f) {
            Drawable drawable = null;
            if (i > 0) {
                List<? extends Effect> list2 = this.f109641g;
                if (list2 == null) {
                    C52711k.m112234a();
                }
                effect = (Effect) list2.get(i - 1);
            } else {
                effect = null;
            }
            C43374f fVar = (C43374f) vVar;
            boolean z2 = true;
            if (fVar.mo88310a()) {
                AVDmtImageTextView aVDmtImageTextView = fVar.f109657b;
                if (aVDmtImageTextView != null) {
                    AVDmtImageTextView aVDmtImageTextView2 = fVar.f109657b;
                    if (aVDmtImageTextView2 != null) {
                        Context context = aVDmtImageTextView2.getContext();
                        if (context != null) {
                            charSequence = context.getString(R.string.cia);
                            aVDmtImageTextView.setText(charSequence);
                        }
                    }
                    charSequence = null;
                    aVDmtImageTextView.setText(charSequence);
                }
                AVDmtImageTextView aVDmtImageTextView3 = fVar.f109657b;
                if (aVDmtImageTextView3 != null) {
                    AVDmtImageTextView aVDmtImageTextView4 = fVar.f109657b;
                    if (aVDmtImageTextView4 != null) {
                        Context context2 = aVDmtImageTextView4.getContext();
                        if (context2 != null) {
                            Resources resources = context2.getResources();
                            if (resources != null) {
                                drawable = resources.getDrawable(R.drawable.ahj);
                            }
                        }
                    }
                    aVDmtImageTextView3.mo93967a(drawable);
                }
                ImageView imageView = fVar.f109656a;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                fVar.mo88309a(false);
                fVar.mo88308a(1);
            } else if (effect != null) {
                AVDmtImageTextView aVDmtImageTextView5 = fVar.f109657b;
                if (aVDmtImageTextView5 != null) {
                    aVDmtImageTextView5.setText(effect.getName());
                }
                UrlModel iconUrl = effect.getIconUrl();
                if (iconUrl != null) {
                    list = iconUrl.getUrlList();
                } else {
                    list = null;
                }
                Collection collection = list;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (C43347a.m95069a(effect)) {
                        if (list == null) {
                            C52711k.m112234a();
                        }
                        Object obj = list.get(0);
                        C52711k.m112236a(obj, "iconUrlList!![0]");
                        Integer c = C52830p.m112395c((String) obj);
                        if (c != null) {
                            i2 = c.intValue();
                        } else {
                            i2 = 0;
                        }
                        AVDmtImageTextView aVDmtImageTextView6 = fVar.f109657b;
                        if (aVDmtImageTextView6 != null) {
                            AVDmtImageTextView aVDmtImageTextView7 = fVar.f109657b;
                            if (aVDmtImageTextView7 != null) {
                                Context context3 = aVDmtImageTextView7.getContext();
                                if (context3 != null) {
                                    Resources resources2 = context3.getResources();
                                    if (resources2 != null) {
                                        drawable = resources2.getDrawable(i2);
                                    }
                                }
                            }
                            aVDmtImageTextView6.mo93967a(drawable);
                        }
                    } else {
                        AVDmtImageTextView aVDmtImageTextView8 = fVar.f109657b;
                        if (aVDmtImageTextView8 != null) {
                            if (list == null) {
                                C52711k.m112234a();
                            }
                            aVDmtImageTextView8.mo93969a((String) list.get(0));
                        }
                    }
                }
                fVar.mo88309a(false);
                C43360a.m95089a();
                fVar.mo88308a(C43359c.m95086a(effect) ? 1 : 0);
            }
            if (i != this.f109640f) {
                z2 = false;
            }
            fVar.mo88309a(z2);
        }
    }

    public C43368e(AppCompatActivity appCompatActivity, C20347c cVar, VideoPublishEditModel videoPublishEditModel, AudioEffectParam audioEffectParam) {
        C52711k.m112240b(appCompatActivity, "context");
        this.f109638d = appCompatActivity;
        this.f109645k = cVar;
        this.f109639e = videoPublishEditModel;
        this.f109646l = audioEffectParam;
        C0209x a = C0214z.m440a((FragmentActivity) this.f109638d).mo359a(VEVideoPublishEditViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(co…ditViewModel::class.java)");
        this.f109644j = (VEVideoPublishEditViewModel) a;
    }

    /* renamed from: a */
    public final void mo88304a(Effect effect, String str, String str2, String str3) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        String str4;
        if (this.f109645k != null && str3 != null) {
            boolean z3 = false;
            if (str3.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C0198r o = this.f109644j.mo110470o();
                C52711k.m112236a((Object) o, "viewModel.reverseLiveData");
                Boolean bool = (Boolean) o.getValue();
                if (bool == null) {
                    bool = Boolean.valueOf(false);
                }
                C52711k.m112236a((Object) bool, "viewModel.reverseLiveData.value ?: false");
                boolean booleanValue = bool.booleanValue();
                VideoPublishEditModel videoPublishEditModel = this.f109639e;
                if (videoPublishEditModel != null) {
                    z2 = videoPublishEditModel.isFastImport;
                } else {
                    z2 = false;
                }
                if (!booleanValue || !z2) {
                    i = C43347a.m95068a(this.f109639e);
                } else {
                    i = this.f109645k.mo43013a().f127519j;
                }
                if (!booleanValue || !z2) {
                    i2 = 0;
                } else {
                    i2 = this.f109645k.mo43013a().f127518i;
                }
                if (str2 == null) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                int k = this.f109645k.mo43071k();
                C43360a.m95089a();
                AudioEffectParam audioEffectParam = new AudioEffectParam(str, i, i2, str3, str4, 0, k, C43359c.m95087a(str3), null);
                audioEffectParam.setShowErrorToast(true);
                C52970h c = this.f109644j.mo110458c();
                C52711k.m112236a((Object) c, "viewModel.audioEffectOpLiveData");
                VideoPublishEditModel videoPublishEditModel2 = this.f109639e;
                if (videoPublishEditModel2 != null) {
                    z3 = videoPublishEditModel2.isReviewVideo();
                }
                c.setValue(C52978a.m112705a(true, z3, audioEffectParam));
                Effect effect2 = effect;
                m95104a(effect, audioEffectParam);
            }
        }
    }
}
