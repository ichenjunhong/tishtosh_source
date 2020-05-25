package com.p683ss.android.ugc.aweme.status;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0781c;
import android.text.TextUtils;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.status.p2272a.C45735b;
import com.p683ss.android.ugc.aweme.status.p2272a.C45736c;
import com.p683ss.android.ugc.aweme.status.p2273b.C45739a;
import com.p683ss.android.ugc.aweme.status.repository.Callback;
import com.p683ss.android.ugc.aweme.status.repository.StatusMusicListRepository;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48701f;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48702g;
import com.p683ss.android.ugc.gamora.recorder.p2481o.C49937f;
import com.p683ss.android.ugc.tools.utils.C50205i;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.status.c */
public final class C45741c {

    /* renamed from: a */
    C29252f f115623a;

    /* renamed from: b */
    public RecordStatusViewModel f115624b;

    /* renamed from: c */
    public Music f115625c;

    /* renamed from: d */
    public C45739a f115626d;

    /* renamed from: e */
    public boolean f115627e;

    /* renamed from: f */
    public String f115628f = "";

    /* renamed from: g */
    public String f115629g = "";

    /* renamed from: h */
    public String f115630h;

    /* renamed from: i */
    public String f115631i = "change_mode";

    /* renamed from: j */
    public FragmentActivity f115632j;

    /* renamed from: k */
    public final ShortVideoContext f115633k;

    /* renamed from: com.ss.android.ugc.aweme.status.c$a */
    public static final class C45752a implements C48701f {

        /* renamed from: a */
        final /* synthetic */ C45741c f115644a;

        /* renamed from: b */
        final /* synthetic */ C45739a f115645b;

        /* renamed from: com.ss.android.ugc.aweme.status.c$a$a */
        public static final class C45753a extends C45735b {

            /* renamed from: a */
            final /* synthetic */ C45752a f115646a;

            /* renamed from: b */
            final /* synthetic */ C45739a f115647b;

            /* renamed from: com.ss.android.ugc.aweme.status.c$a$a$a */
            static final class C45754a<V> implements Callable<String> {

                /* renamed from: a */
                final /* synthetic */ C45753a f115648a;

                C45754a(C45753a aVar) {
                    this.f115648a = aVar;
                }

                public final /* synthetic */ Object call() {
                    C45739a aVar = this.f115648a.f115647b;
                    if (aVar == null) {
                        C52711k.m112234a();
                    }
                    File file = new File(aVar.f115619c.getZipPath());
                    C45739a aVar2 = this.f115648a.f115647b;
                    if (aVar2 == null) {
                        C52711k.m112234a();
                    }
                    C50205i.m108365a(file, new File(aVar2.f115619c.getUnzipPath()));
                    C45739a aVar3 = this.f115648a.f115647b;
                    if (aVar3 == null) {
                        C52711k.m112234a();
                    }
                    String unzipPath = aVar3.f115619c.getUnzipPath();
                    C52711k.m112236a((Object) unzipPath, "statusBgEffect!!.effect.unzipPath");
                    String a = C49937f.m107756a(unzipPath);
                    if (TextUtils.isEmpty(a)) {
                        return "";
                    }
                    return a;
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.status.c$a$a$b */
            static final class C45755b<TTaskResult, TContinuationResult> implements C0011g<String, Void> {

                /* renamed from: a */
                final /* synthetic */ C45753a f115649a;

                C45755b(C45753a aVar) {
                    this.f115649a = aVar;
                }

                public final /* synthetic */ Object then(C0013i iVar) {
                    C45741c cVar = this.f115649a.f115646a.f115644a;
                    C52711k.m112236a((Object) iVar, "it");
                    cVar.f115628f = (String) iVar.mo34e();
                    C45741c cVar2 = this.f115649a.f115646a.f115644a;
                    C45739a aVar = this.f115649a.f115647b;
                    if (aVar == null) {
                        C52711k.m112234a();
                    }
                    String effectId = aVar.f115619c.getEffectId();
                    C52711k.m112236a((Object) effectId, "statusBgEffect!!.effect.effectId");
                    cVar2.f115629g = effectId;
                    this.f115649a.f115646a.f115644a.mo92208a();
                    return null;
                }
            }

            public final void onProgress(DownloadInfo downloadInfo) {
                super.onProgress(downloadInfo);
                if (downloadInfo != null) {
                    this.f115646a.f115644a.f115624b.mo92164i().setValue(Integer.valueOf(downloadInfo.getDownloadProcess() / 3));
                }
            }

            public final void onSuccessed(DownloadInfo downloadInfo) {
                super.onSuccessed(downloadInfo);
                C0013i.m16a((Callable<TResult>) new C45754a<TResult>(this)).mo20a((C0011g<TResult, TContinuationResult>) new C45755b<TResult,TContinuationResult>(this), C0013i.f25b);
                C23569o.m57776a("status_template_download_error_state", 0, (JSONObject) null);
            }

            C45753a(C45752a aVar, C45739a aVar2) {
                this.f115646a = aVar;
                this.f115647b = aVar2;
            }

            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                super.onFailed(downloadInfo, baseException);
                JSONObject jSONObject = new JSONObject();
                String str = "effectid";
                C45739a aVar = this.f115646a.f115645b;
                if (aVar == null) {
                    C52711k.m112234a();
                }
                jSONObject.put(str, aVar.f115619c.getEffectId());
                C23569o.m57776a("status_template_download_error_state", 1, jSONObject);
            }
        }

        /* renamed from: a */
        public final void mo59186a(C48649d dVar) {
            this.f115644a.f115628f = "";
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("effect_panel", "status-background");
            C23569o.m57776a("status_template_list_error_state", 1, jSONObject);
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            CategoryPageModel categoryPageModel = (CategoryPageModel) obj;
            C23569o.m57776a("status_template_list_error_state", 0, (JSONObject) null);
            if (categoryPageModel != null && categoryPageModel.getCategoryEffects() != null) {
                CategoryEffectModel categoryEffects = categoryPageModel.getCategoryEffects();
                C52711k.m112236a((Object) categoryEffects, "response.categoryEffects");
                List effects = categoryEffects.getEffects();
                double random = Math.random();
                double size = (double) (effects.size() - 1);
                Double.isNaN(size);
                Effect effect = (Effect) effects.get((int) (random * size));
                C52711k.m112236a((Object) effect, "effect");
                C45739a aVar = new C45739a(1, effect, "", "", "");
                C45736c.m99543a(this.f115644a.f115632j, aVar, new C45753a(this, aVar));
            }
        }

        C45752a(C45741c cVar, C45739a aVar) {
            this.f115644a = cVar;
            this.f115645b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.c$b */
    public static final class C45756b extends C45735b {
        C45756b() {
        }

        public final void onSuccessed(DownloadInfo downloadInfo) {
            super.onSuccessed(downloadInfo);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.c$c */
    public static final class C45757c implements Callback {

        /* renamed from: a */
        final /* synthetic */ C45741c f115650a;

        C45757c(C45741c cVar) {
            this.f115650a = cVar;
        }

        public final void callback(Music music) {
            this.f115650a.f115625c = music;
            this.f115650a.mo92208a();
        }

        public final void onProgress(DownloadInfo downloadInfo) {
            if (downloadInfo != null) {
                this.f115650a.f115624b.mo92163h().setValue(Integer.valueOf(downloadInfo.getDownloadProcess() / 3));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.c$d */
    public static final class C45758d extends C45735b {

        /* renamed from: a */
        final /* synthetic */ C45741c f115651a;

        /* renamed from: b */
        final /* synthetic */ C45739a f115652b;

        /* renamed from: com.ss.android.ugc.aweme.status.c$d$a */
        static final class C45759a<V> implements Callable<Object> {

            /* renamed from: a */
            final /* synthetic */ C45758d f115653a;

            C45759a(C45758d dVar) {
                this.f115653a = dVar;
            }

            public final /* synthetic */ Object call() {
                C45739a aVar = this.f115653a.f115652b;
                if (aVar == null) {
                    C52711k.m112234a();
                }
                File file = new File(aVar.f115619c.getZipPath());
                C45739a aVar2 = this.f115653a.f115652b;
                if (aVar2 == null) {
                    C52711k.m112234a();
                }
                return C50205i.m108365a(file, new File(aVar2.f115619c.getUnzipPath()));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.status.c$d$b */
        static final class C45760b<TTaskResult, TContinuationResult> implements C0011g<Object, Void> {

            /* renamed from: a */
            final /* synthetic */ C45758d f115654a;

            C45760b(C45758d dVar) {
                this.f115654a = dVar;
            }

            public final /* synthetic */ Object then(C0013i iVar) {
                this.f115654a.f115651a.f115626d = this.f115654a.f115652b;
                this.f115654a.f115651a.mo92208a();
                return null;
            }
        }

        public final void onProgress(DownloadInfo downloadInfo) {
            super.onProgress(downloadInfo);
            if (downloadInfo != null) {
                this.f115651a.f115624b.mo92165j().setValue(Integer.valueOf(downloadInfo.getDownloadProcess() / 3));
            }
        }

        public final void onSuccessed(DownloadInfo downloadInfo) {
            super.onSuccessed(downloadInfo);
            C0013i.m16a((Callable<TResult>) new C45759a<TResult>(this)).mo20a((C0011g<TResult, TContinuationResult>) new C45760b<TResult,TContinuationResult>(this), C0013i.f25b);
            C23569o.m57776a("status_template_download_error_state", 0, (JSONObject) null);
        }

        C45758d(C45741c cVar, C45739a aVar) {
            this.f115651a = cVar;
            this.f115652b = aVar;
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            super.onFailed(downloadInfo, baseException);
            JSONObject jSONObject = new JSONObject();
            String str = "effectid";
            C45739a aVar = this.f115652b;
            if (aVar == null) {
                C52711k.m112234a();
            }
            jSONObject.put(str, aVar.f115619c.getEffectId());
            C23569o.m57776a("status_template_download_error_state", 1, jSONObject);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.c$e */
    static final class C45761e<T> implements C0781c<AVChallenge> {

        /* renamed from: a */
        final /* synthetic */ C52727e f115655a;

        C45761e(C52727e eVar) {
            this.f115655a = eVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            AVChallenge aVChallenge = (AVChallenge) obj;
            List list = (List) this.f115655a.element;
            C52711k.m112236a((Object) aVChallenge, "avChallenge");
            list.add(aVChallenge);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.c$f */
    public static final class C45762f implements C48701f {

        /* renamed from: a */
        final /* synthetic */ C45741c f115656a;

        C45762f(C45741c cVar) {
            this.f115656a = cVar;
        }

        /* renamed from: a */
        public final void mo59186a(C48649d dVar) {
            this.f115656a.f115624b.mo92159d().setValue(null);
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            this.f115656a.f115624b.mo92159d().setValue((CategoryPageModel) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.c$g */
    public static final class C45763g implements C48702g {

        /* renamed from: a */
        final /* synthetic */ C45741c f115657a;

        C45763g(C45741c cVar) {
            this.f115657a = cVar;
        }

        /* renamed from: a */
        public final void mo8637a(C48649d dVar) {
            this.f115657a.f115624b.mo92157b().postValue(null);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("effect_panel", "status-template");
            C23569o.m57776a("status_template_list_error_state", 1, jSONObject);
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
            C52711k.m112240b(effectChannelResponse, "response");
            this.f115657a.f115624b.mo92157b().postValue(effectChannelResponse);
            C23569o.m57776a("status_template_list_error_state", 0, (JSONObject) null);
        }
    }

    /* renamed from: a */
    public final void mo92208a() {
        if (this.f115627e && this.f115625c != null && !TextUtils.isEmpty(this.f115628f) && this.f115626d != null) {
            this.f115624b.mo92164i().setValue(Integer.valueOf(33));
            this.f115624b.mo92165j().setValue(Integer.valueOf(33));
            this.f115624b.mo92163h().setValue(Integer.valueOf(34));
            C45736c.m99544a(this.f115632j);
            C45739a aVar = this.f115626d;
            if (aVar == null) {
                C52711k.m112234a();
            }
            mo92210b(aVar);
        }
    }

    /* renamed from: a */
    private static String m99546a(Effect effect) {
        if (effect == null) {
            return null;
        }
        List<String> tags = effect.getTags();
        if (C9414h.m18630a(tags)) {
            return null;
        }
        for (String str : tags) {
            C52711k.m112236a((Object) str, "tag");
            if (C52830p.m112411b(str, "challenge:", false, 2, null)) {
                String substring = str.substring(10);
                C52711k.m112236a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                return substring;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo92209a(C45739a aVar) {
        if (C45777d.m99559a(this.f115632j) && aVar != null) {
            if (this.f115625c == null) {
                new StatusMusicListRepository(this.f115632j, new C45757c(this));
            } else {
                this.f115624b.mo92163h().setValue(Integer.valueOf(33));
            }
            if (this.f115626d == null) {
                C45736c.m99543a(this.f115632j, aVar, new C45758d(this, aVar));
            } else {
                this.f115624b.mo92165j().setValue(Integer.valueOf(33));
            }
            if (TextUtils.isEmpty(this.f115628f)) {
                this.f115623a.mo59134a("status-background", "wallpaper", false, 0, 0, 0, "", new C45752a(this, aVar));
            } else {
                this.f115624b.mo92164i().setValue(Integer.valueOf(34));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0253, code lost:
        if (r1 == false) goto L_0x0255;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo92210b(com.p683ss.android.ugc.aweme.status.p2273b.C45739a r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "effect"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r3 = "tab_name"
            java.lang.String r4 = r0.f115630h
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "draft_id"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r0.f115633k
            int r4 = r4.f107022A
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47826a(r3, r4)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r4 = new com.ss.android.ugc.aweme.status.StatusCreateVideoData
            r4.<init>()
            int r5 = r1.f115618b
            r4.setStatusType(r5)
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r1.f115619c
            java.lang.String r5 = r5.getEffectId()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r6 = 0
            r7 = 0
            r8 = 1
            if (r5 != 0) goto L_0x0137
            int r5 = r1.f115618b
            if (r5 != r8) goto L_0x00db
            com.google.gson.f r5 = new com.google.gson.f
            r5.<init>()
            com.ss.android.ugc.aweme.music.model.Music r9 = r0.f115625c
            java.lang.String r5 = r5.mo34889b(r9)
            java.lang.String r9 = "first_sticker_music_ids"
            r3.putExtra(r9, r5)
            com.ss.android.ugc.aweme.music.model.Music r5 = r0.f115625c
            if (r5 == 0) goto L_0x005c
            java.lang.String r5 = r5.getMid()
            goto L_0x005d
        L_0x005c:
            r5 = r6
        L_0x005d:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0081
            com.ss.android.ugc.aweme.music.model.Music r5 = r0.f115625c
            if (r5 == 0) goto L_0x006e
            java.lang.String r5 = r5.getMid()
            goto L_0x006f
        L_0x006e:
            r5 = r6
        L_0x006f:
            if (r5 != 0) goto L_0x0074
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0074:
            java.util.List r5 = p2628d.p2629a.C52575l.m112092a(r5)
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.List r5 = p2628d.p2629a.C52575l.m112139e(r5)
            r4.setMusicIds(r5)
        L_0x0081:
            java.lang.String r5 = r0.f115628f
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.setBgPath(r5)
            java.lang.String r5 = r0.f115629g
            r4.setBgId(r5)
            java.lang.String r5 = "wallpaper"
            r4.setBgFrom(r5)
            com.ss.android.ugc.aweme.music.model.Music r5 = r0.f115625c
            if (r5 == 0) goto L_0x009d
            java.lang.String r5 = r5.getPath()
            goto L_0x009e
        L_0x009d:
            r5 = r6
        L_0x009e:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.setMusicPath(r5)
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r1.f115619c
            java.lang.String r5 = r5.getUnzipPath()
            java.lang.String r9 = "effect.effect.unzipPath"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r9)
            r4.setEffectPath(r5)
            java.lang.String r5 = "emptystatusmodel"
            r4.setEffectId(r5)
            r0.f115627e = r7
            com.google.gson.f r5 = new com.google.gson.f
            r5.<init>()
            java.util.List r9 = r4.getMusicIds()
            java.lang.String r5 = r5.mo34889b(r9)
            java.lang.String r9 = "first_sticker_music_ids"
            r3.putExtra(r9, r5)
            java.lang.String r5 = "status_template_id"
            java.lang.String r9 = "emptystatusmodel"
            r2.mo47829a(r5, r9)
            java.lang.String r5 = "enter_method"
            java.lang.String r9 = "direct"
            r2.mo47829a(r5, r9)
            goto L_0x0137
        L_0x00db:
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r1.f115619c
            java.util.List r5 = r5.getMusic()
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = com.p683ss.android.ugc.aweme.base.utils.C23715d.m58202a(r5)
            if (r5 != 0) goto L_0x0137
            com.google.gson.f r5 = new com.google.gson.f
            r5.<init>()
            com.ss.android.ugc.effectmanager.effect.model.Effect r9 = r1.f115619c
            java.util.List r9 = r9.getMusic()
            java.lang.String r5 = r5.mo34889b(r9)
            java.lang.String r9 = "first_sticker_music_ids"
            r3.putExtra(r9, r5)
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r1.f115619c
            java.util.List r5 = r5.getMusic()
            if (r5 != 0) goto L_0x0108
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0108:
            r4.setMusicIds(r5)
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r1.f115619c
            java.lang.String r5 = r5.getUnzipPath()
            java.lang.String r9 = "effect.effect.unzipPath"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r9)
            r4.setEffectPath(r5)
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r1.f115619c
            java.lang.String r5 = r5.getEffectId()
            java.lang.String r9 = "effect.effect.effectId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r9)
            r4.setEffectId(r5)
            java.lang.String r5 = "status_template_id"
            java.lang.String r9 = r4.getEffectId()
            r2.mo47829a(r5, r9)
            java.lang.String r5 = "enter_method"
            java.lang.String r9 = "template"
            r2.mo47829a(r5, r9)
        L_0x0137:
            java.lang.String r5 = "create_status"
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r5, r2)
            java.lang.String r2 = "key_status_enter"
            r3.putExtra(r2, r8)
            java.lang.String r2 = "key_status_video_data"
            r5 = r4
            android.os.Parcelable r5 = (android.os.Parcelable) r5
            r3.putExtra(r2, r5)
            com.ss.android.ugc.aweme.shortvideo.j r2 = new com.ss.android.ugc.aweme.shortvideo.j
            r2.<init>()
            java.lang.String r4 = r4.getEffectId()
            r2.mStatusId = r4
            java.lang.String r4 = "av_upload_struct"
            java.io.Serializable r2 = (java.io.Serializable) r2
            r3.putExtra(r4, r2)
            d.f.b.v$e r2 = new d.f.b.v$e
            r2.<init>()
            com.ss.android.ugc.aweme.shortvideo.dh r4 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            java.lang.String r5 = "PublishManager.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.util.List<com.ss.android.ugc.aweme.shortvideo.AVChallenge> r4 = r4.f109287b
            r2.element = r4
            T r4 = r2.element
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x017e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = (java.util.List) r4
            r2.element = r4
        L_0x017e:
            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r1.f115619c
            java.lang.String r10 = m99546a(r4)
            r4 = r10
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x019d
            com.ss.android.ugc.aweme.port.in.al r9 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101163d
            r11 = 0
            r12 = 0
            r13 = 0
            com.ss.android.ugc.aweme.status.c$e r4 = new com.ss.android.ugc.aweme.status.c$e
            r4.<init>(r2)
            r14 = r4
            android.support.v4.f.c r14 = (android.support.p030v4.p038f.C0781c) r14
            r9.mo74186a(r10, r11, r12, r13, r14)
        L_0x019d:
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r4 = new com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r1.f115619c
            java.lang.String r1 = r1.getUnzipPath()
            java.lang.String r5 = "effect.effect.unzipPath"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r5)
            com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo r5 = new com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo
            r10 = 720(0x2d0, float:1.009E-42)
            r11 = 1280(0x500, float:1.794E-42)
            r12 = 0
            r14 = 30
            r15 = 0
            r16 = 16
            r17 = 0
            r9 = r5
            r9.<init>(r10, r11, r12, r14, r15, r16, r17)
            r4.<init>(r1, r6, r5)
            java.lang.String r1 = "extra_edit_preview_info"
            com.ss.android.ugc.aweme.shortvideo.edit.model.g r5 = new com.ss.android.ugc.aweme.shortvideo.edit.model.g
            r10 = 0
            r11 = 0
            r14 = 0
            r16 = 15
            r9 = r5
            r9.<init>(r10, r11, r12, r14, r16, r17)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r4 = r5.mo89103a(r4)
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            r3.putExtra(r1, r4)
            java.lang.String r1 = "challenge"
            T r2 = r2.element
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x035d
            java.io.Serializable r2 = (java.io.Serializable) r2
            r3.putExtra(r1, r2)
            java.lang.String r1 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r0.f115633k
            java.lang.String r2 = r2.f107132y
            r3.putExtra(r1, r2)
            java.lang.String r1 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r0.f115633k
            java.lang.String r2 = r2.f107131x
            r3.putExtra(r1, r2)
            java.lang.String r1 = "shoot_mode"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r0.f115633k
            int r2 = r2.f107081ag
            r3.putExtra(r1, r2)
            java.lang.String r1 = "draft_id"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r0.f115633k
            int r2 = r2.f107022A
            r3.putExtra(r1, r2)
            java.lang.String r1 = "origin"
            r3.putExtra(r1, r8)
            java.lang.String r1 = "content_type"
            java.lang.String r2 = "status"
            r3.putExtra(r1, r2)
            java.lang.String r1 = "content_source"
            java.lang.String r2 = "shoot"
            r3.putExtra(r1, r2)
            java.lang.String r1 = "task_id"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r0.f115633k
            java.lang.String r2 = r2.f107076ab
            r3.putExtra(r1, r2)
            java.lang.String r1 = "tag_id"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r0.f115633k
            java.lang.String r2 = r2.f107080af
            r3.putExtra(r1, r2)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f115633k
            java.util.ArrayList<java.lang.String> r1 = r1.f107077ac
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x023e
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x023c
            goto L_0x023e
        L_0x023c:
            r1 = 0
            goto L_0x023f
        L_0x023e:
            r1 = 1
        L_0x023f:
            if (r1 == 0) goto L_0x0255
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f115633k
            java.util.List<com.ss.android.ugc.aweme.discover.model.TaskMentionedUser> r1 = r1.f107078ad
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x0252
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0250
            goto L_0x0252
        L_0x0250:
            r1 = 0
            goto L_0x0253
        L_0x0252:
            r1 = 1
        L_0x0253:
            if (r1 != 0) goto L_0x033f
        L_0x0255:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r0.f115633k
            java.util.ArrayList<java.lang.String> r2 = r2.f107077ac
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L_0x026b
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0269
            goto L_0x026b
        L_0x0269:
            r2 = 0
            goto L_0x026c
        L_0x026b:
            r2 = 1
        L_0x026c:
            if (r2 != 0) goto L_0x0290
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r0.f115633k
            java.util.ArrayList<java.lang.String> r2 = r2.f107077ac
            java.util.Iterator r2 = r2.iterator()
        L_0x0276:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0290
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "#"
            r1.append(r5)
            r1.append(r4)
            java.lang.String r4 = " "
            r1.append(r4)
            goto L_0x0276
        L_0x0290:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r0.f115633k
            java.util.List<com.ss.android.ugc.aweme.discover.model.TaskMentionedUser> r2 = r2.f107078ad
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L_0x02a1
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x029f
            goto L_0x02a1
        L_0x029f:
            r2 = 0
            goto L_0x02a2
        L_0x02a1:
            r2 = 1
        L_0x02a2:
            if (r2 != 0) goto L_0x032e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r0.f115633k
            java.util.List<com.ss.android.ugc.aweme.discover.model.TaskMentionedUser> r4 = r4.f107078ad
            java.util.Iterator r4 = r4.iterator()
        L_0x02b1:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0327
            java.lang.Object r5 = r4.next()
            com.ss.android.ugc.aweme.discover.model.TaskMentionedUser r5 = (com.p683ss.android.ugc.aweme.discover.model.TaskMentionedUser) r5
            java.lang.String r6 = "taskMentionedUser"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            java.lang.String r6 = r5.getNickname()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x02d3
            int r6 = r6.length()
            if (r6 != 0) goto L_0x02d1
            goto L_0x02d3
        L_0x02d1:
            r6 = 0
            goto L_0x02d4
        L_0x02d3:
            r6 = 1
        L_0x02d4:
            if (r6 != 0) goto L_0x02b1
            java.lang.String r6 = r5.getUserId()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x02e7
            int r6 = r6.length()
            if (r6 != 0) goto L_0x02e5
            goto L_0x02e7
        L_0x02e5:
            r6 = 0
            goto L_0x02e8
        L_0x02e7:
            r6 = 1
        L_0x02e8:
            if (r6 != 0) goto L_0x02b1
            java.lang.String r6 = "@"
            r1.append(r6)
            java.lang.String r6 = r5.getNickname()
            r1.append(r6)
            java.lang.String r6 = " "
            r1.append(r6)
            java.lang.String r6 = r5.getNickname()
            if (r6 != 0) goto L_0x0303
            java.lang.String r6 = ""
        L_0x0303:
            int r6 = r1.indexOf(r6)
            int r6 = r6 - r8
            int r9 = r6 + 1
            java.lang.String r10 = r5.getNickname()
            if (r10 == 0) goto L_0x0315
            int r10 = r10.length()
            goto L_0x0316
        L_0x0315:
            r10 = 0
        L_0x0316:
            int r9 = r9 + r10
            java.lang.String r5 = r5.getUserId()
            if (r5 != 0) goto L_0x031f
            java.lang.String r5 = "0"
        L_0x031f:
            com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct r5 = com.p683ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper.createAtStruct(r6, r9, r5)
            r2.add(r5)
            goto L_0x02b1
        L_0x0327:
            java.lang.String r4 = "struct_list"
            java.io.Serializable r2 = (java.io.Serializable) r2
            r3.putExtra(r4, r2)
        L_0x032e:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r0.f115633k
            java.lang.String r1 = r1.toString()
            r2.f107041T = r1
            java.lang.String r1 = "video_title"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r0.f115633k
            java.lang.String r2 = r2.f107041T
            r3.putExtra(r1, r2)
        L_0x033f:
            java.lang.String r1 = "poi_data_in_tools_line"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r0.f115633k
            java.lang.String r2 = r2.f107034M
            r3.putExtra(r1, r2)
            java.lang.String r1 = "commerce_data_in_tools_line"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r0.f115633k
            java.lang.String r2 = r2.f107049aA
            r3.putExtra(r1, r2)
            com.ss.android.ugc.aweme.shortvideo.q.b r1 = com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44403a.m97196a()
            android.support.v4.app.FragmentActivity r2 = r0.f115632j
            android.content.Context r2 = (android.content.Context) r2
            r1.mo48306b(r2, r3, r8)
            return
        L_0x035d:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type java.io.Serializable"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.status.C45741c.mo92210b(com.ss.android.ugc.aweme.status.b.a):void");
    }

    public C45741c(FragmentActivity fragmentActivity, ShortVideoContext shortVideoContext) {
        C52711k.m112240b(fragmentActivity, "mActivity");
        C52711k.m112240b(shortVideoContext, "shortVideoContext");
        this.f115632j = fragmentActivity;
        this.f115633k = shortVideoContext;
        String string = this.f115632j.getString(R.string.g1_);
        C52711k.m112236a((Object) string, "mActivity.getString(R.st…eation_shoot_status_tab1)");
        this.f115630h = string;
        this.f115623a = C29242c.m68869a(this.f115632j, null);
        C0209x a = C0214z.m440a(this.f115632j).mo359a(RecordStatusViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(mA…tusViewModel::class.java)");
        this.f115624b = (RecordStatusViewModel) a;
        this.f115624b.mo92156a().observe(this.f115632j, new C0199s<Boolean>(this) {

            /* renamed from: a */
            final /* synthetic */ C45741c f115634a;

            {
                this.f115634a = r1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                Boolean bool = (Boolean) obj;
                C45741c cVar = this.f115634a;
                if (C45777d.m99559a(cVar.f115632j)) {
                    cVar.f115623a.mo59143b("status-template", false, (C48702g) new C45763g(cVar));
                }
            }
        });
        this.f115624b.mo92158c().observe(this.f115632j, new C0199s<String>(this) {

            /* renamed from: a */
            final /* synthetic */ C45741c f115637a;

            {
                this.f115637a = r1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                String str = (String) obj;
                if (str != null) {
                    C45741c cVar = this.f115637a;
                    C52711k.m112240b(str, "category");
                    if (C45777d.m99559a(cVar.f115632j)) {
                        cVar.f115623a.mo59134a("status-template", str, false, 0, 0, 0, "", new C45762f(cVar));
                    }
                }
            }
        });
        ((C0198r) this.f115624b.f115554b.getValue()).observe(this.f115632j, new C0199s<C45739a>(this) {

            /* renamed from: a */
            final /* synthetic */ C45741c f115638a;

            {
                this.f115638a = r1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                C45739a aVar = (C45739a) obj;
                if (aVar != null) {
                    C45741c cVar = this.f115638a;
                    C52711k.m112240b(aVar, "statusEffect");
                    C45736c.m99543a(cVar.f115632j, aVar, new C45756b());
                }
            }
        });
        this.f115624b.mo92160e().observe(this.f115632j, new C0199s<C45739a>(this) {

            /* renamed from: a */
            final /* synthetic */ C45741c f115639a;

            {
                this.f115639a = r1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                C45739a aVar = (C45739a) obj;
                if (aVar != null) {
                    this.f115639a.mo92210b(aVar);
                }
            }
        });
        this.f115624b.mo92161f().observe(this.f115632j, new C0199s<C45739a>(this) {

            /* renamed from: a */
            final /* synthetic */ C45741c f115640a;

            {
                this.f115640a = r1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                this.f115640a.mo92209a((C45739a) obj);
            }
        });
        this.f115624b.mo92162g().observe(this.f115632j, new C0199s<C45739a>(this) {

            /* renamed from: a */
            final /* synthetic */ C45741c f115641a;

            {
                this.f115641a = r1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                C45739a aVar = (C45739a) obj;
                if (aVar == null) {
                    this.f115641a.f115627e = false;
                    C45736c.m99544a(this.f115641a.f115632j);
                    return;
                }
                this.f115641a.f115627e = true;
                if (this.f115641a.f115625c == null || TextUtils.isEmpty(this.f115641a.f115628f) || this.f115641a.f115626d == null) {
                    this.f115641a.mo92209a(aVar);
                    return;
                }
                this.f115641a.f115624b.mo92164i().setValue(Integer.valueOf(33));
                this.f115641a.f115624b.mo92165j().setValue(Integer.valueOf(33));
                this.f115641a.f115624b.mo92163h().setValue(Integer.valueOf(34));
                C45741c cVar = this.f115641a;
                C45739a aVar2 = this.f115641a.f115626d;
                if (aVar2 == null) {
                    C52711k.m112234a();
                }
                cVar.mo92210b(aVar2);
            }
        });
        this.f115624b.mo92168m().observe(this.f115632j, new C0199s<Integer>(this) {

            /* renamed from: a */
            final /* synthetic */ C45741c f115642a;

            {
                this.f115642a = r1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                if (((Integer) obj) != null) {
                    C26890h.m65011a("enter_status_shoot_page", C23089d.m56640a().mo47829a("creation_id", this.f115642a.f115633k.f107131x).mo47829a("shoot_way", this.f115642a.f115633k.f107132y).mo47829a("content_source", "upload").mo47829a("content_type", "status").mo47826a("draft_id", this.f115642a.f115633k.f107022A).mo47829a("enter_method", this.f115642a.f115631i).f61491a);
                    this.f115642a.f115631i = "change_mode";
                }
            }
        });
        this.f115624b.mo92170o().observe(this.f115632j, new C0199s<String>(this) {

            /* renamed from: a */
            final /* synthetic */ C45741c f115643a;

            {
                this.f115643a = r1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                String str = (String) obj;
                if (str != null) {
                    C45741c cVar = this.f115643a;
                    C52711k.m112236a((Object) str, "it");
                    cVar.f115631i = str;
                }
            }
        });
        this.f115624b.mo92171p().observe(this.f115632j, new C0199s<String>(this) {

            /* renamed from: a */
            final /* synthetic */ C45741c f115635a;

            {
                this.f115635a = r1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                String str = (String) obj;
                C26890h.m65011a("enter_status_tab", C23089d.m56640a().mo47829a("creation_id", this.f115635a.f115633k.f107131x).mo47829a("shoot_way", this.f115635a.f115633k.f107132y).mo47829a("tab_name", str).f61491a);
                this.f115635a.f115630h = String.valueOf(str);
            }
        });
        this.f115624b.mo92169n().observe(this.f115632j, new C0199s<String>(this) {

            /* renamed from: a */
            final /* synthetic */ C45741c f115636a;

            {
                this.f115636a = r1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                String str = (String) obj;
                if (str != null) {
                    C26890h.m65011a("show_status_template", C23089d.m56640a().mo47829a("creation_id", this.f115636a.f115633k.f107131x).mo47829a("shoot_way", this.f115636a.f115633k.f107132y).mo47829a("tab_name", this.f115636a.f115630h).mo47829a("status_template_id", str).f61491a);
                }
            }
        });
    }
}
