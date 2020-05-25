package com.p683ss.android.ugc.aweme.external;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.p043v7.app.C1160b;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.draft.C29050a;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.draft.model.C29061d;
import com.p683ss.android.ugc.aweme.external.p1697b.C29594c;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p683ss.android.ugc.aweme.services.draft.IDraftService;
import com.p683ss.android.ugc.aweme.services.draft.IDraftService.DraftListener;
import com.p683ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener;
import com.p683ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;
import com.p683ss.android.ugc.aweme.services.external.IAVDraftService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.tools.C46797a;
import com.p683ss.android.ugc.aweme.tools.draft.C47017s;
import com.p683ss.android.ugc.aweme.tools.draft.C47019u;
import com.p683ss.android.ugc.aweme.tools.draft.p2359e.C46994b;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.p2654b.C52938f;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.external.b */
public final class C29577b implements IAVDraftService {

    /* renamed from: com.ss.android.ugc.aweme.external.b$a */
    public static final class C29578a implements C29050a {

        /* renamed from: a */
        final /* synthetic */ boolean f77406a;

        /* renamed from: b */
        final /* synthetic */ String f77407b;

        /* renamed from: a */
        public final boolean mo49521a(C29059c cVar) {
            C52711k.m112240b(cVar, "draft");
            if (this.f77406a || !TextUtils.equals(cVar.mo58774ak(), this.f77407b)) {
                return true;
            }
            return false;
        }

        C29578a(boolean z, String str) {
            this.f77406a = z;
            this.f77407b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b$b */
    static final class C29579b extends C52712l implements C52682m<Boolean, Long, C52860x> {

        /* renamed from: a */
        final /* synthetic */ Context f77408a;

        /* renamed from: b */
        final /* synthetic */ C29059c f77409b;

        C29579b(Context context, C29059c cVar) {
            this.f77408a = context;
            this.f77409b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ((Number) obj2).longValue();
            if (booleanValue) {
                C52938f.f131308b.mo110536b();
                C47019u.m102111a(this.f77408a, this.f77409b, 1, System.currentTimeMillis());
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b$c */
    static final class C29580c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OnClickListener f77410a;

        C29580c(OnClickListener onClickListener) {
            this.f77410a = onClickListener;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f77410a.onClick(dialogInterface, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b$d */
    static final class C29581d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OnClickListener f77411a;

        /* renamed from: b */
        final /* synthetic */ Activity f77412b;

        C29581d(OnClickListener onClickListener, Activity activity) {
            this.f77411a = onClickListener;
            this.f77412b = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f77411a.onClick(dialogInterface, i);
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
            C52711k.m112236a((Object) createIAVServiceProxybyMonsterPlugin, "ServiceManager.get().get…ServiceProxy::class.java)");
            createIAVServiceProxybyMonsterPlugin.getDecompressService().mo74198a(true, new C52682m<Boolean, Long, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C29581d f77413a;

                {
                    this.f77413a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    long longValue = ((Number) obj2).longValue();
                    if (booleanValue) {
                        C52938f.f131308b.mo110536b();
                        Builder builder = new Builder();
                        builder.shootWay("restore_crash").restoreType(2).creationId(UUID.randomUUID().toString()).decompressTime(longValue);
                        new C29594c().startRecord((Context) this.f77413a.f77412b, builder.build());
                    }
                    return C52860x.f131107a;
                }
            });
        }
    }

    public final ExecutorService executor() {
        return C46797a.m101642a();
    }

    public final void registerListener(DraftListener draftListener) {
        C52711k.m112240b(draftListener, "draftListener");
        C46994b.m102064a().registerDraftListener(draftListener);
    }

    public final long saveDraft(C29059c cVar) {
        C52711k.m112240b(cVar, "draft");
        return C47017s.m102091a().mo94309c(cVar);
    }

    public final void unregisterListener(DraftListener draftListener) {
        C52711k.m112240b(draftListener, "draftListener");
        C46994b.m102064a().unregisterDraftListener(draftListener);
    }

    public final List<C29059c> draftList(boolean z) {
        C43214dh a = C43214dh.m94817a();
        C52711k.m112236a((Object) a, "PublishManager.inst()");
        String f = a.mo87856f();
        C52711k.m112236a((Object) f, "PublishManager.inst().publishingDraftKey");
        List<C29059c> a2 = C47017s.m102091a().mo94303a((C29050a) new C29578a(z, f));
        C52711k.m112236a((Object) a2, "DraftDBHelper.getInstanc…\n            }\n        })");
        return a2;
    }

    public final void loadAwemeDraftThumbCover(C29059c cVar, OnVideoCoverCallback onVideoCoverCallback) {
        C52711k.m112240b(cVar, "draft");
        C52711k.m112240b(onVideoCoverCallback, "callback");
        C29061d.m68496a(cVar, onVideoCoverCallback);
    }

    public final void deleteDraft(int i, C29059c cVar) {
        C52711k.m112240b(cVar, "draft");
        if (i != 2) {
            C46994b.m102064a().delete(cVar);
        } else {
            C46994b.m102064a().deleteDraftForPoiRate(cVar);
        }
    }

    public final void editDraft(Context context, C29059c cVar) {
        if (context != null && cVar != null) {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
            C52711k.m112236a((Object) createIAVServiceProxybyMonsterPlugin, "ServiceManager.get().get…ServiceProxy::class.java)");
            createIAVServiceProxybyMonsterPlugin.getDecompressService().mo74198a(true, new C29579b(context, cVar));
        }
    }

    public final C29059c queryDraft(int i, String str) {
        C52711k.m112240b(str, "key");
        switch (i) {
            case 1:
                return C47017s.m102091a().mo94306b(str);
            case 2:
                return C46994b.m102064a().getPoiRateDraft(str);
            default:
                return null;
        }
    }

    public final void saveDraftForLocalFile(String str, Intent intent, DraftSaveListener draftSaveListener) {
        C52711k.m112240b(str, "file");
        C52711k.m112240b(intent, "intent");
        C52711k.m112240b(draftSaveListener, "listener");
        C46994b.m102064a().saveDraftForLocalFile(str, intent, draftSaveListener);
    }

    public final Dialog restoreDialog(Activity activity, OnClickListener onClickListener, OnClickListener onClickListener2) {
        int i;
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(onClickListener, "cancelListener");
        C52711k.m112240b(onClickListener2, "confirm");
        IDraftService a = C46994b.m102064a();
        C52711k.m112236a((Object) a, "DraftService.getInstance()");
        if (a.isPoiOrderRate()) {
            i = R.string.cs7;
        } else {
            i = R.string.fbn;
        }
        C1160b a2 = C47700ay.m103234a(activity, i, R.string.wf, new C29580c(onClickListener), R.string.ah2, new C29581d(onClickListener2, activity));
        C52711k.m112236a((Object) a2, "DialogUtils.showDialog(a…\n            }\n        })");
        return a2;
    }
}
