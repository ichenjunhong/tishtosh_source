package com.p683ss.android.ugc.aweme.share;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.p1363a.p1364a.C22884a.C22885a;
import com.p683ss.android.ugc.aweme.app.p1363a.p1364a.C22886b;
import com.p683ss.android.ugc.aweme.app.p1363a.p1364a.C22887c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1417h.C23540d;
import com.p683ss.android.ugc.aweme.bridgeservice.C23980e;
import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.component.music.MusicService;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37584bs;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37609f;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37620j;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37622l;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37643s;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.p683ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.p683ss.android.ugc.aweme.services.sticker.UnLockSticker;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2231f.C44566a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2231f.C44567b;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.p683ss.android.ugc.aweme.sticker.C46049k;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.sticker.types.unlock.C46604b;
import com.p683ss.android.ugc.aweme.sticker.types.unlock.C46605c;
import com.p683ss.android.ugc.aweme.sticker.types.unlock.C46609g;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48699d;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48704i;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p001a.C0027j;

/* renamed from: com.ss.android.ugc.aweme.share.ab */
public final class C41941ab {

    /* renamed from: A */
    public C48699d f106158A;

    /* renamed from: B */
    private Music f106159B;

    /* renamed from: C */
    private C41953a f106160C;

    /* renamed from: a */
    public C29252f f106161a;

    /* renamed from: b */
    public boolean f106162b;

    /* renamed from: c */
    public ArrayList<String> f106163c;

    /* renamed from: d */
    public int f106164d;

    /* renamed from: e */
    public C45547d f106165e;

    /* renamed from: f */
    public Context f106166f;

    /* renamed from: g */
    public String f106167g;

    /* renamed from: h */
    public String f106168h;

    /* renamed from: i */
    public String f106169i;

    /* renamed from: j */
    public boolean f106170j;

    /* renamed from: k */
    public C41954b f106171k;

    /* renamed from: l */
    public C41955c f106172l;

    /* renamed from: m */
    public IAVEffectService f106173m;

    /* renamed from: n */
    public String f106174n;

    /* renamed from: o */
    public String f106175o;

    /* renamed from: p */
    public String f106176p;

    /* renamed from: q */
    public Effect f106177q;

    /* renamed from: r */
    public boolean f106178r;

    /* renamed from: s */
    public long f106179s;

    /* renamed from: t */
    public long f106180t;

    /* renamed from: u */
    public C37622l f106181u;

    /* renamed from: v */
    public String f106182v;

    /* renamed from: w */
    public C48704i f106183w;

    /* renamed from: x */
    C46049k f106184x;

    /* renamed from: y */
    OnUnlockShareFinishListener f106185y;

    /* renamed from: z */
    public C37620j f106186z;

    /* renamed from: com.ss.android.ugc.aweme.share.ab$a */
    interface C41953a {
        /* renamed from: a */
        void mo86056a(C0011g<C29252f, Void> gVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ab$b */
    public interface C41954b {
        /* renamed from: a */
        void mo60019a(String str, Effect effect);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ab$c */
    public interface C41955c {
        /* renamed from: a */
        void mo83478a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ab$d */
    class C41956d implements C26874f {

        /* renamed from: a */
        Effect f106207a;

        /* renamed from: b */
        String f106208b;

        /* renamed from: b */
        public final void mo44838b() {
            C18842a.m45934b(new Runnable() {
                public final void run() {
                    C41941ab abVar = C41941ab.this;
                    Effect effect = C41956d.this.f106207a;
                    String str = C41956d.this.f106208b;
                    IStickerUtilsService stickerInfo = AVExternalServiceImpl.getAVServiceImpl_Monster().infoService().stickerInfo();
                    if (stickerInfo.hasUnlocked(effect)) {
                        C44566a.m97505a(abVar.f106174n);
                        abVar.mo86050a(effect, str);
                    } else if (!TextUtils.equals(abVar.f106174n, "prop_reuse")) {
                        C44567b bVar = new C44567b("prop_page", abVar.f106166f, effect, abVar.f106185y, false, false);
                        abVar.f106184x = bVar;
                    } else if (stickerInfo.isStickerPreviewable(effect)) {
                        C44566a.m97505a(abVar.f106174n);
                        abVar.mo86050a(effect, str);
                    } else {
                        C44567b bVar2 = new C44567b("prop_reuse", abVar.f106166f, effect, abVar.f106185y, false, false);
                        abVar.f106184x = bVar2;
                    }
                }
            });
        }

        /* renamed from: c_ */
        public final void mo44840c_(Exception exc) {
            C44566a.m97504a(C41941ab.this.f106166f);
        }

        C41956d(Effect effect, String str) {
            this.f106207a = effect;
            this.f106208b = str;
        }
    }

    /* renamed from: a */
    public final void mo86052a(ArrayList<String> arrayList, boolean z, String str, String str2, boolean z2) {
        this.f106174n = str;
        this.f106175o = str2;
        this.f106178r = !z2;
        m91893a(arrayList, false, false, z2);
    }

    /* renamed from: a */
    public final void mo86053a(ArrayList<String> arrayList, boolean z, Map<String, String> map) {
        this.f106175o = (String) map.get("scene");
        this.f106176p = (String) map.get("grade_key");
        m91893a(arrayList, false, false, false);
    }

    /* renamed from: c */
    private boolean m91897c() {
        if (!C48016e.m103957g()) {
            C10691a.m21542b(this.f106166f, (int) R.string.da8).mo19066a();
            return false;
        } else if (C48016e.m103958h() >= 20971520) {
            return true;
        } else {
            C10691a.m21542b(this.f106166f, (int) R.string.da9).mo19066a();
            return false;
        }
    }

    /* renamed from: b */
    private void m91894b() {
        if (m91897c() && C41961af.m91924a(C11010c.m22280a()) && this.f106178r) {
            if (this.f106165e == null) {
                this.f106165e = C45547d.m99208b(this.f106166f, this.f106166f.getResources().getString(R.string.au9));
                this.f106165e.setIndeterminate(false);
                return;
            }
            if ((this.f106166f instanceof Activity) && !((Activity) this.f106166f).isFinishing()) {
                this.f106165e.setProgress(1);
            }
        }
    }

    /* renamed from: a */
    public final C37622l mo86047a() {
        MusicModel musicModel;
        if (this.f106181u == null) {
            Context context = this.f106166f;
            String str = (String) this.f106163c.get(0);
            if (this.f106159B == null) {
                musicModel = null;
            } else {
                musicModel = this.f106159B.convertToMusicModel();
            }
            this.f106181u = new C37622l(context, str, musicModel);
        }
        return this.f106181u;
    }

    public C41941ab(Context context) {
        this(context, "prop_reuse");
    }

    /* renamed from: a */
    public final void mo86049a(Music music) {
        if (!C37609f.m84056a(music)) {
            this.f106159B = music;
        }
    }

    /* renamed from: a */
    public static final ArrayList<String> m91890a(String str) {
        String[] split;
        if (str == null || str.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : str.split(",")) {
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo86048a(int i) {
        if (this.f106165e != null && this.f106166f != null && (this.f106166f instanceof Activity) && !((Activity) this.f106166f).isFinishing() && this.f106165e.isShowing()) {
            this.f106165e.setProgress(i);
        }
    }

    /* renamed from: a */
    public final void mo86051a(ArrayList<String> arrayList) {
        m91892a(arrayList, true);
    }

    /* renamed from: a */
    private void m91892a(ArrayList<String> arrayList, boolean z) {
        m91893a(arrayList, true, false, false);
    }

    public C41941ab(Context context, String str) {
        this(context, str, "");
    }

    /* renamed from: c */
    public final void mo86055c(Effect effect, String str) {
        new C41956d(effect, str).mo44838b();
    }

    /* renamed from: a */
    public static void m91891a(Context context, String str) {
        C41962ag agVar = (C41962ag) C23540d.m57713a(context, C41962ag.class);
        long currentTimeMillis = System.currentTimeMillis();
        agVar.mo48478b(str);
        agVar.mo48477b(currentTimeMillis);
        agVar.mo48476b((int) C11010c.m22287h());
    }

    /* renamed from: b */
    public static void m91895b(Context context, String str) {
        C26890h.m65011a("app_update_confirm", C23089d.m56640a().mo47829a("update_type", "prop_reminder").mo47829a("prop_id", str).f61491a);
    }

    /* renamed from: c */
    public static void m91896c(Context context, String str) {
        C26890h.m65011a("app_update_cancel", C23089d.m56640a().mo47829a("update_type", "prop_reminder").mo47829a("prop_id", str).f61491a);
    }

    /* renamed from: b */
    public final void mo86054b(final Effect effect, final String str) {
        if (C20902b.m53242a().isLogin()) {
            mo86055c(effect, str);
            return;
        }
        C27965f.m66719a((Activity) this.f106166f, "prop_page", "prop_page");
        C22885a.m56355a((C22887c) new C22886b() {
            /* renamed from: a */
            public final void mo47682a() {
                if (C20854a.m53167g().isLogin()) {
                    if (!C47915gg.m103651b()) {
                        C41941ab.this.mo86055c(effect, str);
                    } else {
                        return;
                    }
                }
                C22885a.m56357b(this);
            }
        });
    }

    /* renamed from: a */
    public final void mo86050a(Effect effect, String str) {
        C44566a.m97505a(this.f106174n);
        final Builder stickerFrom = new Builder().shootWay(this.f106167g).creationId(str).startRecordTime(this.f106179s).effectDownloadDuration(System.currentTimeMillis() - this.f106179s).translationType(3).stickers(this.f106163c).prepareFilter(true).firstSticker(effect).stickerMusic(this.f106159B).stickerWithMusicFilePath(this.f106182v).stickerFrom(this.f106175o);
        if (this.f106169i != null) {
            stickerFrom.enterFrom(this.f106169i);
        }
        if (this.f106159B != null) {
            if (MusicService.createIMusicServicebyMonsterPlugin().checkValidMusic(this.f106159B.convertToMusicModel(), this.f106166f, false)) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f106159B.getId());
                stickerFrom.autoUseMusic(sb.toString());
            }
        }
        AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new AsyncServiceLoader() {
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                asyncAVService.uiService().recordService().startRecord(C41941ab.this.f106166f, stickerFrom.build());
            }
        });
    }

    public C41941ab(Context context, String str, String str2) {
        this.f106168h = "";
        this.f106173m = AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().effectService();
        this.f106174n = "";
        this.f106175o = "";
        this.f106176p = "";
        this.f106178r = true;
        this.f106160C = new C41953a() {
            /* renamed from: a */
            public final void mo86056a(final C0011g<C29252f, Void> gVar) {
                final C0027j jVar = new C0027j();
                if (C41941ab.this.f106161a == null) {
                    C41941ab.this.f106173m.buildEffectPlatform(C41941ab.this.f106166f, new IAVEffectReadyCallback<C29252f>() {
                        public final /* synthetic */ void finish(Object obj) {
                            C29252f fVar = (C29252f) obj;
                            if (fVar != null) {
                                C41941ab.this.f106161a = fVar;
                                jVar.mo44a(fVar);
                                jVar.f77a.mo19a(gVar);
                            }
                        }
                    }, C41958ac.f106211a);
                    return;
                }
                jVar.mo44a(C41941ab.this.f106161a);
                jVar.f77a.mo19a(gVar);
            }
        };
        this.f106183w = new C48704i() {
            /* renamed from: a */
            public final void mo77143a(C48649d dVar) {
                C41941ab.this.f106158A.mo8644a(null, dVar);
                if (C41941ab.this.f106165e != null) {
                    C41941ab.this.f106165e.dismiss();
                }
            }

            /* renamed from: a */
            public final /* synthetic */ void mo8638a(Object obj) {
                List list = (List) obj;
                if (C37584bs.m84027a()) {
                    C41941ab.this.mo86047a().mo77119a(C41941ab.this.f106186z, (String) C41941ab.this.f106163c.get(C41941ab.this.f106164d));
                } else {
                    AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().effectService().fetchEffectResource((String) C41941ab.this.f106163c.get(C41941ab.this.f106164d), true, C41941ab.this.f106175o, null, C41941ab.this.f106161a, C41941ab.this.f106158A);
                }
            }
        };
        this.f106185y = new OnUnlockShareFinishListener() {
            public final void onVKShareSucceed(Effect effect) {
            }

            public final void onShareAppFailed() {
                C44566a.m97504a(C41941ab.this.f106166f);
            }

            public final void onShareAppSucceed(Effect effect) {
                if (C41941ab.this.f106184x != null) {
                    C46609g gVar = new C46609g();
                    gVar.f117594a = UnLockSticker.STICKER_UNLOCKED;
                    gVar.f117595b = effect;
                    gVar.f117596c = C41941ab.this.f106174n;
                    C47718bf.m103289b(gVar);
                    C44566a.m97505a(C41941ab.this.f106174n);
                    C41941ab.this.f106177q = effect;
                    if (TextUtils.equals(C41941ab.this.f106174n, "prop_page")) {
                        C47718bf.m103288a(new C46604b());
                    } else if (TextUtils.equals(C41941ab.this.f106174n, "prop_reuse")) {
                        C47718bf.m103288a(new C46605c());
                    }
                }
            }
        };
        this.f106186z = new C37620j() {
            /* renamed from: a */
            public final void mo77133a(Effect effect) {
                C41941ab.this.f106158A.mo8643a(effect);
            }

            /* renamed from: b */
            public final void mo77134b(C37643s sVar) {
                C41941ab.this.f106158A.mo8644a(sVar.f95992e, sVar.f95994g);
            }

            /* renamed from: a */
            public final void mo77132a(C37643s sVar) {
                C41941ab.this.f106182v = sVar.f95988a;
                C41941ab.this.f106158A.mo8638a(sVar.f95992e);
            }

            /* renamed from: a */
            public final void mo77131a(int i, Effect effect, Long l) {
                C41941ab.this.f106158A.mo59191a(effect, i, l.longValue());
            }
        };
        this.f106158A = new C48699d() {
            /* renamed from: a */
            public final void mo8643a(Effect effect) {
                C41941ab.this.f106180t = 0;
            }

            /* renamed from: a */
            public final /* synthetic */ void mo8638a(Object obj) {
                String str;
                Effect effect = (Effect) obj;
                C41941ab.this.f106162b = true;
                C41941ab.this.mo86048a(100);
                C47700ay.m103236b(C41941ab.this.f106165e);
                String uuid = UUID.randomUUID().toString();
                if (C41941ab.this.f106171k != null) {
                    C41941ab.this.f106171k.mo60019a(uuid, effect);
                } else if (C41941ab.this.f106167g.equals("green_screen")) {
                    String str2 = "shoot";
                    C23089d a = C23089d.m56640a().mo47829a("shoot_way", "green_screen_reuse").mo47829a("content_type", "video").mo47829a("content_source", "shoot");
                    String str3 = "enter_from";
                    if (TextUtils.isEmpty(C41941ab.this.f106169i)) {
                        str = "homepage_hot";
                    } else {
                        str = C41941ab.this.f106169i;
                    }
                    C26890h.m65011a(str2, a.mo47829a(str3, str).mo47829a("creation_id", uuid).mo47829a("group_id", C41941ab.this.f106168h).f61491a);
                } else {
                    C26890h.m65011a("shoot", C23089d.m56640a().mo47829a("creation_id", uuid).mo47829a("shoot_way", "prop_reuse").mo47829a("prop_id", effect.getEffectId()).f61491a);
                }
                if (TextUtils.equals(C41941ab.this.f106174n, "prop_page")) {
                    FaceStickerBean.sCurPropSource = "prop_page";
                }
                if (!AVExternalServiceImpl.getAVServiceImpl_Monster().infoService().stickerInfo().isLockSticker(effect) || (!TextUtils.equals(C41941ab.this.f106174n, "prop_reuse") && !TextUtils.equals(C41941ab.this.f106174n, "prop_page"))) {
                    C41941ab.this.mo86050a(effect, uuid);
                } else if (effect.isBusiness()) {
                    C0013i.m16a((Callable<TResult>) new C41959ad<TResult>(effect)).mo20a((C0011g<TResult, TContinuationResult>) new C41960ae<TResult,TContinuationResult>(this, effect, uuid), C0013i.f25b);
                } else {
                    C41941ab.this.mo86054b(effect, uuid);
                }
                if (C41941ab.this.f106172l != null) {
                    C41941ab.this.f106172l.mo83478a(0);
                }
                AVExternalServiceImpl.getAVServiceImpl_Monster().infoService().endDownloadEffectAlog(effect, C41941ab.this.f106180t, System.currentTimeMillis() - C41941ab.this.f106179s, 0, null);
            }

            /* renamed from: a */
            public final void mo8644a(Effect effect, C48649d dVar) {
                int i = dVar.f122279a;
                if (i == 2004 || i == 2002 || i == 2003 || i == 2006) {
                    C41941ab.this.f106164d++;
                    if (!C41941ab.this.f106170j || C41941ab.this.f106164d >= C41941ab.this.f106163c.size()) {
                        if (!C41941ab.this.f106162b) {
                            if (i == 2004 || i == 2002) {
                                C10691a.m21545b(C41941ab.this.f106166f, C41941ab.this.f106166f.getResources().getString(R.string.awm)).mo19066a();
                            } else if (i == 2003) {
                                C10691a.m21545b(C41941ab.this.f106166f, C41941ab.this.f106166f.getResources().getString(R.string.ap7)).mo19066a();
                            } else if (i == 2006) {
                                if (!C32816h.m75716b().getStickerUpdateApp().booleanValue() || C9376b.m18558a((Collection<T>) C41941ab.this.f106163c) || TextUtils.isEmpty((CharSequence) C41941ab.this.f106163c.get(0))) {
                                    C10691a.m21545b(C41941ab.this.f106166f, C41941ab.this.f106166f.getResources().getString(R.string.f7_)).mo19066a();
                                    if (C41941ab.this.f106172l != null) {
                                        C41941ab.this.f106172l.mo83478a(i);
                                    }
                                } else {
                                    if (C41941ab.this.f106166f instanceof Activity) {
                                        String str = (String) C41941ab.this.f106163c.get(0);
                                        if (VERSION.SDK_INT < 21) {
                                            C10691a.m21545b(C41941ab.this.f106166f, C41941ab.this.f106166f.getResources().getString(R.string.f7_)).mo19066a();
                                        } else {
                                            Activity activity = (Activity) C41941ab.this.f106166f;
                                            C10643a aVar = new C10643a(activity);
                                            aVar.mo18885a((int) R.string.drs).mo18899b((int) R.string.drq).mo18886a((int) R.string.drt, (OnClickListener) new OnClickListener(activity, str) {

                                                /* renamed from: a */
                                                final /* synthetic */ Activity f106193a;

                                                /* renamed from: b */
                                                final /* synthetic */ String f106194b;

                                                {
                                                    this.f106193a = r1;
                                                    this.f106194b = r2;
                                                }

                                                public final void onClick(DialogInterface dialogInterface, int i) {
                                                    C23980e.m58787a().checkForUpdate(this.f106193a, true, this.f106194b);
                                                    C41941ab.m91891a((Context) this.f106193a, this.f106194b);
                                                    C41941ab.m91895b((Context) this.f106193a, this.f106194b);
                                                }
                                            }).mo18900b((int) R.string.drr, (OnClickListener) new OnClickListener(activity, str) {

                                                /* renamed from: a */
                                                final /* synthetic */ Activity f106191a;

                                                /* renamed from: b */
                                                final /* synthetic */ String f106192b;

                                                {
                                                    this.f106191a = r1;
                                                    this.f106192b = r2;
                                                }

                                                public final void onClick(DialogInterface dialogInterface, int i) {
                                                    C41941ab.m91896c((Context) this.f106191a, this.f106192b);
                                                }
                                            });
                                            Dialog c = aVar.mo18897a().mo18883c();
                                            c.setCanceledOnTouchOutside(false);
                                            if (!((Activity) C41941ab.this.f106166f).isFinishing()) {
                                                c.show();
                                            }
                                            Context context = C41941ab.this.f106166f;
                                            C26890h.m65011a("app_update_toast_show", C23089d.m56640a().mo47829a("update_type", "prop_reminder").mo47829a("prop_id", str).f61491a);
                                        }
                                    }
                                    if (C41941ab.this.f106172l != null) {
                                        C41941ab.this.f106172l.mo83478a(2006);
                                    }
                                }
                            }
                        }
                        if (!(C41941ab.this.f106172l == null || i == 2006)) {
                            C41941ab.this.f106172l.mo83478a(i);
                        }
                        AVExternalServiceImpl.getAVServiceImpl_Monster().infoService().endDownloadEffectAlog(C41941ab.this.f106177q, C41941ab.this.f106180t, System.currentTimeMillis() - C41941ab.this.f106179s, -1, dVar);
                    }
                    AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().effectService().fetchEffectResource((String) C41941ab.this.f106163c.get(C41941ab.this.f106164d), true, C41941ab.this.f106175o, null, C41941ab.this.f106161a, C41941ab.this.f106158A);
                    C41941ab.this.f106172l.mo83478a(i);
                    AVExternalServiceImpl.getAVServiceImpl_Monster().infoService().endDownloadEffectAlog(C41941ab.this.f106177q, C41941ab.this.f106180t, System.currentTimeMillis() - C41941ab.this.f106179s, -1, dVar);
                }
                C10691a.m21545b(C41941ab.this.f106166f, C41941ab.this.f106166f.getResources().getString(R.string.b04)).mo19066a();
                C47700ay.m103236b(C41941ab.this.f106165e);
                C41941ab.this.f106172l.mo83478a(i);
                AVExternalServiceImpl.getAVServiceImpl_Monster().infoService().endDownloadEffectAlog(C41941ab.this.f106177q, C41941ab.this.f106180t, System.currentTimeMillis() - C41941ab.this.f106179s, -1, dVar);
            }

            /* renamed from: a */
            public final void mo59191a(Effect effect, int i, long j) {
                C41941ab.this.mo86048a(i);
                if (C41941ab.this.f106180t == 0) {
                    C41941ab.this.f106180t = j;
                    AVExternalServiceImpl.getAVServiceImpl_Monster().infoService().startDownloadEffectAlog(effect, j);
                }
            }
        };
        this.f106166f = context;
        this.f106167g = str;
        this.f106168h = str2;
    }

    /* renamed from: a */
    private void m91893a(ArrayList<String> arrayList, boolean z, boolean z2, final boolean z3) {
        this.f106170j = z;
        this.f106179s = System.currentTimeMillis();
        AVExternalServiceImpl.getAVServiceImpl_Monster().provideAVPerformance().start("av_video_record_init", "clickReuseSticker");
        this.f106163c = arrayList;
        m91894b();
        if (this.f106163c != null && this.f106163c.size() > 0) {
            this.f106162b = false;
            this.f106160C.mo86056a(new C0011g<C29252f, Void>(false) {
                public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                    C37620j jVar;
                    if (C41941ab.this.f106161a != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("scene", C41941ab.this.f106175o);
                        if (!TextUtils.isEmpty(C41941ab.this.f106176p)) {
                            hashMap.put("grade_key", C41941ab.this.f106176p);
                        }
                        if (false) {
                            C41941ab.this.f106173m.fetchEffectListResource(C41941ab.this.f106163c, hashMap, false, C41941ab.this.f106161a, C41941ab.this.f106183w);
                        } else if (C37584bs.m84027a()) {
                            C37622l a = C41941ab.this.mo86047a();
                            if (z3) {
                                jVar = null;
                            } else {
                                jVar = C41941ab.this.f106186z;
                            }
                            a.mo77119a(jVar, (String) C41941ab.this.f106163c.get(0));
                        } else {
                            C41941ab.this.f106173m.fetchEffectResource((String) C41941ab.this.f106163c.get(0), true, C41941ab.this.f106175o, hashMap, C41941ab.this.f106161a, C41941ab.this.f106158A);
                        }
                    }
                    return null;
                }
            });
        }
    }
}
