package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p525e.C9402b;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.google.gson.C17971f;
import com.google.p1057b.p1058a.C17429o;
import com.p683ss.android.ttve.nativePort.C20129b;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.asve.p1241e.C20396g;
import com.p683ss.android.ugc.asve.sandbox.C20652b;
import com.p683ss.android.ugc.aweme.C23951bq;
import com.p683ss.android.ugc.aweme.C24048bt;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.services.IPreloadVESoKt;
import com.p683ss.android.ugc.aweme.services.story.IStoryRecordService;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.C42423an;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43219dm;
import com.p683ss.android.ugc.aweme.shortvideo.C43220dn;
import com.p683ss.android.ugc.aweme.shortvideo.C43305e;
import com.p683ss.android.ugc.aweme.shortvideo.C43838fk;
import com.p683ss.android.ugc.aweme.shortvideo.C43854fw;
import com.p683ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p683ss.android.ugc.aweme.shortvideo.p2187e.C43306a;
import com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44403a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44986ar;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordNewActivity;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordPermissionActivity;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2245c.C45098a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2245c.C45101d;
import com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45318u;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45546c;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.p683ss.android.ugc.aweme.status.C45733a;
import com.p683ss.android.ugc.aweme.sticker.p2278b.C45841j;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45871b;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46055e;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.p683ss.android.ugc.aweme.utils.C47858ep;
import com.p683ss.android.ugc.effectmanager.common.p2437d.C48636c;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.p2656d.C52954a;
import dmt.p2652av.video.p2656d.C52959d;
import dmt.p2652av.video.p2656d.C52961f;
import dmt.p2652av.video.p2656d.C52963h;
import dmt.p2652av.video.superentrance.C53006b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p001a.C0027j;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.f */
public final class C45435f {

    /* renamed from: a */
    private static C17429o f114824a;

    /* renamed from: b */
    private static C43838fk f114825b;

    /* renamed from: a */
    public static void m99013a(Activity activity, Intent intent) {
        Effect a = new C53006b().mo110558a();
        if (a != null) {
            String str = "";
            try {
                str = C32816h.m75716b().getSuperEntranceConfig().getEffectTip();
            } catch (C10174a unused) {
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(a.getEffectId());
            intent.putExtra("extra_camera_facing", 1);
            intent.putExtra("extra_super_entrance_pop", str);
            intent.putStringArrayListExtra("reuse_sticker_ids", arrayList);
            intent.putExtra("first_sticker", a);
        }
        if (TextUtils.isEmpty(intent.getStringExtra("shoot_way"))) {
            intent.putExtra("shoot_way", "super_entrance");
        }
        intent.putExtra("translation_type", 3);
        m99022b(activity, intent);
    }

    /* renamed from: a */
    public static void m99017a(Context context, Intent intent) {
        if (intent != null && context != null) {
            if (context instanceof Activity) {
                m99022b((Activity) context, intent);
                return;
            }
            C45101d.m98616a((C45098a) new C52954a(context));
            intent.setClass(context, VideoRecordPermissionActivity.class);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static void m99016a(Activity activity, Intent intent, boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder("startToolPermissionActivity,try to restart VideoRecordNewActivity,recreateSupport");
        sb.append(z);
        sb.append(",clearOld:");
        sb.append(z2);
        C50203g.m108358a(sb.toString());
        intent.putExtra("recreate_record_activity_support", z);
        intent.putExtra("recreate_record_and_clear", z2);
        intent.putExtra("navigate_back_to_main", z3);
        if (C43214dh.m94817a().mo87852a((Context) activity)) {
            if (C44986ar.m98333a() || !C39618d.m88212a() || !z || !VideoRecordPermissionActivity.m98264a((Context) activity)) {
                intent.setClass(activity, VideoRecordPermissionActivity.class);
            } else {
                intent.setClass(activity, VideoRecordNewActivity.class);
                if (z2 && m99023b((Context) activity, intent)) {
                    return;
                }
            }
            m99022b(activity, intent);
        }
    }

    /* renamed from: a */
    public static void m99018a(Context context, Intent intent, boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder("notifyToolPermissionActivity,try to restart VideoRecordNewActivity,recreateSupport");
        sb.append(z);
        sb.append(",clearOld:");
        sb.append(z2);
        C50203g.m108358a(sb.toString());
        intent.putExtra("recreate_record_activity_support", z);
        intent.putExtra("recreate_record_and_clear", z2);
        intent.putExtra("navigate_back_to_main", z3);
        if (C43214dh.m94817a().mo87852a(context)) {
            if (C44986ar.m98333a() || !C39618d.m88212a() || !z || !VideoRecordPermissionActivity.m98264a(context)) {
                intent.setClass(context, VideoRecordPermissionActivity.class);
            } else {
                intent.setClass(context, VideoRecordNewActivity.class);
                if (z2 && m99023b(context, intent)) {
                    return;
                }
            }
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static void m99014a(Activity activity, Intent intent, C52671b<List<Bundle>, C52860x> bVar) {
        final Activity activity2 = activity;
        Intent intent2 = intent;
        C52671b<List<Bundle>, C52860x> bVar2 = bVar;
        f114824a = C17429o.m42675b();
        C45412b.m98979a().step("av_video_record_init", "fetchData");
        String stringExtra = intent2.getStringExtra("first_face_sticker");
        String stringExtra2 = intent2.getStringExtra("music_reuse_sticker_id");
        String stringExtra3 = intent2.getStringExtra("challenge_id");
        String stringExtra4 = intent2.getStringExtra("music_id");
        String stringExtra5 = intent2.getStringExtra("extra_bind_mv_id");
        String stringExtra6 = intent2.getStringExtra("direct_use_sticker_music");
        String stringExtra7 = intent2.getStringExtra("poi_struct_in_tools_line");
        String stringExtra8 = intent2.getStringExtra("shoot_way");
        boolean booleanExtra = intent2.getBooleanExtra("enter_record_from_other_platform", false);
        Effect effect = (Effect) intent2.getParcelableExtra("first_sticker");
        f114825b = null;
        if (booleanExtra || !TextUtils.equals(stringExtra8, "task_platform")) {
            C43214dh.m94817a().mo87853c();
        }
        if (!TextUtils.isEmpty(stringExtra7)) {
            C43306a.m94992b(stringExtra7);
        }
        C43305e eVar = C43214dh.m94817a().f109288c;
        if (eVar != null && TextUtils.equals(stringExtra8, "task_platform")) {
            C43214dh.m94817a().f109290e = stringExtra8;
            if (!C9376b.m18558a((Collection<T>) eVar.getMvIds()) && !TextUtils.isEmpty((CharSequence) eVar.getMvIds().get(0))) {
                stringExtra5 = (String) eVar.getMvIds().get(0);
            }
            if (!C9376b.m18558a((Collection<T>) eVar.getConnectMusic()) && !TextUtils.isEmpty(((C42482c) eVar.getConnectMusic().get(0)).mid)) {
                stringExtra4 = ((C42482c) eVar.getConnectMusic().get(0)).mid;
                intent2.putExtra("is_forced_music_from_show_way", "task_platform");
            }
            if (eVar.getAnchor() != null) {
                String stringExtra9 = intent2.getStringExtra("has_shopping_cart_authority");
                String stringExtra10 = intent2.getStringExtra("is_limited");
                if (TextUtils.equals(stringExtra9, "1") && TextUtils.equals(stringExtra10, "0")) {
                    f114825b = eVar.getAnchor();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        C454361 r11 = new C0011g<Bundle, C0013i<Bundle>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C0013i<Bundle> then(C0013i<Bundle> iVar) throws Exception {
                if (!iVar.mo31c() && !iVar.mo33d()) {
                    return C0013i.m14a(iVar.mo34e());
                }
                if (iVar.mo33d() && iVar.mo35f() != null) {
                    if (iVar.mo35f() instanceof C48636c) {
                        C48636c cVar = (C48636c) iVar.mo35f();
                        cVar.getStatusCode();
                        int statusCode = cVar.getStatusCode();
                        String message = iVar.mo35f().getMessage();
                        switch (statusCode) {
                            case 2002:
                            case 2004:
                                message = activity2.getString(R.string.awm);
                                break;
                            case 2003:
                                message = activity2.getString(R.string.ap7);
                                break;
                            case 2006:
                                message = activity2.getString(R.string.f7_);
                                break;
                        }
                        C10691a.m21545b((Context) activity2, message).mo19066a();
                    } else {
                        C10691a.m21545b((Context) activity2, iVar.mo35f().getMessage()).mo19066a();
                    }
                }
                return C0013i.m14a(new Bundle());
            }
        };
        if (!TextUtils.isEmpty(stringExtra)) {
            arrayList.add(m99007a((Context) activity2, stringExtra, "cold_start").mo23b((C0011g<TResult, C0013i<TContinuationResult>>) r11));
        }
        boolean a = C39629l.m88232a().mo58574e().mo83117a(C40796a.EnableUpdateMoji);
        if (a && effect != null && !TextUtils.isEmpty(effect.getId()) && C45841j.m99678b(effect.getId())) {
            arrayList.add(m99006a((Context) activity2, effect.getId(), new C0027j<>(), (C45546c) null).mo23b((C0011g<TResult, C0013i<TContinuationResult>>) r11));
        }
        List<AVChallenge> list = C43214dh.m94817a().f109287b;
        if (!(C9376b.m18558a((Collection<T>) list) || list.get(0) == null || ((AVChallenge) list.get(0)).anchor == null)) {
            f114825b = C45404av.m98963a(((AVChallenge) list.get(0)).anchor);
        }
        if (a && !C9414h.m18630a(list) && !TextUtils.isEmpty(((AVChallenge) list.get(0)).stickerId)) {
            arrayList.add(m99020b((Context) activity2, ((AVChallenge) list.get(0)).stickerId).mo23b((C0011g<TResult, C0013i<TContinuationResult>>) r11));
        }
        if (intent2.getSerializableExtra("extra_open_record_challenge") != null) {
            C43214dh.m94817a().f109292g = (AVChallenge) intent2.getSerializableExtra("extra_open_record_challenge");
        }
        C24048bt a2 = C24048bt.m58876a();
        if (!TextUtils.isEmpty(stringExtra2)) {
            if (a2.enableCombineMusicAndEffectDownload()) {
                arrayList.add(m99008a(stringExtra2, intent2).mo23b((C0011g<TResult, C0013i<TContinuationResult>>) r11));
            } else {
                arrayList.add(m99004a((Context) activity2, stringExtra2).mo23b((C0011g<TResult, C0013i<TContinuationResult>>) r11));
            }
        }
        if (!TextUtils.isEmpty(stringExtra5)) {
            arrayList.add(m99026d(activity2, stringExtra5).mo23b((C0011g<TResult, C0013i<TContinuationResult>>) r11));
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            arrayList.add(m99024c((Context) activity2, stringExtra3).mo23b((C0011g<TResult, C0013i<TContinuationResult>>) r11));
        }
        if (!TextUtils.isEmpty(stringExtra4)) {
            arrayList.add(m99005a((Context) activity2, stringExtra4, 2, !TextUtils.equals(stringExtra8, "challenge")).mo23b((C0011g<TResult, C0013i<TContinuationResult>>) r11));
        }
        if (!TextUtils.isEmpty(stringExtra6)) {
            if (!a2.enableCombineMusicAndEffectDownload() || TextUtils.isEmpty(intent2.getStringExtra("sticker_with_music_file_path"))) {
                arrayList.add(m99005a((Context) activity2, stringExtra6, 2, false).mo23b((C0011g<TResult, C0013i<TContinuationResult>>) r11));
            } else {
                arrayList.add(m99021b(stringExtra6, intent2).mo23b((C0011g<TResult, C0013i<TContinuationResult>>) r11));
            }
        }
        if (C9376b.m18558a((Collection<T>) arrayList)) {
            bVar2.invoke(null);
        } else {
            C0013i.m15a((Collection<? extends C0013i<TResult>>) arrayList).mo20a((C0011g<TResult, TContinuationResult>) new C45443h<TResult,TContinuationResult>(bVar2), C0013i.f25b);
        }
    }

    /* renamed from: a */
    public static void m99015a(Activity activity, Intent intent, List<Bundle> list) {
        Activity activity2 = activity;
        Intent intent2 = intent;
        if (C44986ar.m98333a()) {
            C39618d.m88211a(VideoRecordNewActivity.class);
        } else {
            C42423an.m93188b("");
        }
        long a = f114824a.mo33754a(TimeUnit.MILLISECONDS);
        C45412b.m98979a().step("av_video_record_init", "goRecordActivity");
        Intent intent3 = new Intent(activity2, VideoRecordNewActivity.class);
        boolean booleanExtra = intent2.getBooleanExtra("show_no_splash_ad", false);
        boolean booleanExtra2 = intent2.getBooleanExtra("sticker_pannel_show", false);
        boolean booleanExtra3 = intent2.getBooleanExtra("enter_record_from_other_platform", false);
        boolean booleanExtra4 = intent2.getBooleanExtra(C20652b.m51992a(), false);
        String stringExtra = intent2.getStringExtra("shoot_way");
        String stringExtra2 = intent2.getStringExtra("creation_id");
        String stringExtra3 = intent2.getStringExtra("enter_from");
        String stringExtra4 = intent2.getStringExtra("is_forced_music_from_show_way");
        int intExtra = intent2.getIntExtra("draft_to_edit_from", 0);
        if (booleanExtra3) {
            C43214dh.m94817a().mo50200a((C42482c) null);
            C43214dh.m94817a().mo87857g();
        }
        if (booleanExtra) {
            C39618d.f101162c.mo74152a(true);
        }
        if (f114825b != null || TextUtils.equals(stringExtra, "task_platform")) {
            intent3.putExtra("commerce_data_in_tools_line", m99010a(f114825b, stringExtra3));
        }
        intent3.putExtra("sticker_pannel_show", booleanExtra2);
        intent3.putExtra("enter_record_from_other_platform", booleanExtra3);
        intent3.putExtra("draft_to_edit_from", intExtra);
        intent3.putExtra("star_atlas_object", intent2.getStringExtra("star_atlas_object"));
        intent3.putExtra("key_using_sand_box", booleanExtra4);
        if (!TextUtils.isEmpty(stringExtra4)) {
            intent3.putExtra("is_forced_music_from_show_way", stringExtra4);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            intent3.putExtra("enter_from", stringExtra3);
        }
        if (list != null) {
            for (Bundle putExtras : list) {
                intent3.putExtras(putExtras);
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent3.putExtras(extras);
        }
        if (!TextUtils.isEmpty(intent2.getStringExtra("micro_app_class"))) {
            intent3.putExtra("micro_app_class", intent2.getStringExtra("micro_app_class"));
        }
        if (TextUtils.isEmpty(stringExtra)) {
            intent3.putExtra("creation_id", "no_shoot_way");
        }
        if (TextUtils.isEmpty(stringExtra2)) {
            stringExtra2 = UUID.randomUUID().toString();
            intent3.putExtra("creation_id", stringExtra2);
        }
        if (intent3.getLongExtra("extra_start_record_time", 0) == 0) {
            intent3.putExtra("extra_start_record_time", System.currentTimeMillis());
        }
        C43220dn.m94842a(new C43219dm(stringExtra, stringExtra2, stringExtra3));
        C45318u.m98794a(stringExtra2);
        C45101d.m98616a((C45098a) new C52961f());
        intent3.putExtra("extra_start_record_download_res_time", a);
        if (!intent2.hasExtra("stitch_params")) {
            activity2.runOnUiThread(new C45445j(activity2, intent3));
        } else if (!"draft_again".equals(stringExtra)) {
            C44403a.m97196a().mo48300a(activity2, (StitchParams) intent2.getParcelableExtra("stitch_params"), stringExtra2);
        } else {
            intent3.putExtra("stitch_params", (StitchParams) intent2.getParcelableExtra("stitch_params"));
            activity2.runOnUiThread(new C45444i(activity2, intent3));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057 A[SYNTHETIC, Splitter:B:23:0x0057] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.ArrayList<com.p683ss.android.ugc.aweme.sticker.StickerWrapper> m99012a(java.util.List<java.lang.String> r6) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = com.bytedance.common.utility.C9414h.m18630a(r6)
            if (r1 == 0) goto L_0x000c
            return r0
        L_0x000c:
            java.util.Iterator r6 = r6.iterator()
        L_0x0010:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0061
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            com.google.gson.c.a r3 = new com.google.gson.c.a     // Catch:{ Exception -> 0x005b, all -> 0x0053 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x005b, all -> 0x0053 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x005b, all -> 0x0053 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x005b, all -> 0x0053 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x005b, all -> 0x0053 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x005b, all -> 0x0053 }
            com.ss.android.ugc.aweme.port.in.u r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            com.google.gson.f r1 = r1.mo58566D()     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r4 = com.p683ss.android.ugc.effectmanager.effect.model.Effect.class
            java.lang.Object r1 = r1.mo34880a(r3, r4)     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r1     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            if (r1 != 0) goto L_0x0044
        L_0x003e:
            r3.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0010
        L_0x0042:
            goto L_0x0010
        L_0x0044:
            com.ss.android.ugc.aweme.sticker.StickerWrapper r1 = com.p683ss.android.ugc.aweme.sticker.StickerWrapper.m99610a(r1, r2, r2)     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            r2 = 1
            r1.f115781c = r2     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            r0.add(r1)     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            goto L_0x003e
        L_0x004f:
            r6 = move-exception
            goto L_0x0055
        L_0x0051:
            r2 = r3
            goto L_0x005b
        L_0x0053:
            r6 = move-exception
            r3 = r2
        L_0x0055:
            if (r3 == 0) goto L_0x005a
            r3.close()     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            throw r6
        L_0x005b:
            if (r2 == 0) goto L_0x0010
            r2.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0010
        L_0x0061:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.util.C45435f.m99012a(java.util.List):java.util.ArrayList");
    }

    /* renamed from: a */
    private static IStoryRecordService m99009a() {
        Object a = C27991b.m66756a(IStoryRecordService.class);
        if (a != null) {
            return (IStoryRecordService) a;
        }
        return (IStoryRecordService) C20302a.m50070a(IStoryRecordService.class).mo42947a(new C20310d()).mo42946a().mo42948b();
    }

    /* renamed from: a */
    private static C0013i<Bundle> m99004a(Context context, String str) {
        return m99007a(context, str, "");
    }

    /* renamed from: c */
    private static C0013i<Bundle> m99024c(Context context, String str) {
        C0027j jVar = new C0027j();
        C0013i.m16a((Callable<TResult>) new C45448m<TResult>(str, context, jVar));
        return jVar.f77a;
    }

    /* renamed from: b */
    private static C0013i<Bundle> m99020b(final Context context, String str) {
        final C0027j jVar = new C0027j();
        if (TextUtils.isEmpty(str)) {
            jVar.mo44a(new Bundle());
            return jVar.f77a;
        }
        C29252f a = C29242c.m68868a(context);
        C0013i.m18a((Callable<TResult>) new C45447l<TResult>(context, a), (Executor) C23551l.f62672a);
        final C45546c a2 = C45546c.m99207a(context, context.getResources().getString(R.string.dnt));
        a.mo59132a(str, "", (C48705j) new C48705j() {
            /* renamed from: a */
            public final void mo8643a(Effect effect) {
            }

            /* renamed from: a */
            public final /* synthetic */ void mo8638a(Object obj) {
                Effect effect = (Effect) obj;
                if (effect == null || TextUtils.isEmpty(effect.getId()) || !C45841j.m99678b(effect.getId())) {
                    C47700ay.m103236b(a2);
                    jVar.mo44a(new Bundle());
                    return;
                }
                C45435f.m99006a(context, effect.getId(), jVar, a2);
            }

            /* renamed from: a */
            public final void mo8644a(Effect effect, C48649d dVar) {
                C47700ay.m103236b(a2);
                jVar.mo44a(new Bundle());
            }
        });
        return jVar.f77a;
    }

    /* renamed from: c */
    private static void m99025c(Activity activity, Intent intent) {
        C45412b.m98979a().step("av_video_record_init", "startVideoRecordActivity");
        C45101d.m98616a((C45098a) new C52963h());
        new C43854fw();
        C39618d.m88210a(C43854fw.m96287a());
        m99014a(activity, intent, (C52671b<List<Bundle>, C52860x>) new C45442g<List<Bundle>,C52860x>(activity, intent));
        C39618d.f101167h.mo74215a(activity.getApplicationContext());
    }

    /* renamed from: d */
    private static C0013i<Bundle> m99026d(Context context, final String str) {
        final C0027j jVar = new C0027j();
        if (TextUtils.isEmpty(str)) {
            jVar.mo44a(new Bundle());
            return jVar.f77a;
        }
        C29242c.m68868a(context).mo59132a(str, "", (C48705j) new C48705j() {
            /* renamed from: a */
            public final void mo8643a(Effect effect) {
            }

            /* renamed from: a */
            public final /* synthetic */ void mo8638a(Object obj) {
                Effect effect = (Effect) obj;
                Bundle bundle = new Bundle();
                bundle.putBoolean("reuse_mvtheme_enter", true);
                bundle.putString("extra_bind_mv_id", str);
                bundle.putParcelable("first_sticker", effect);
                jVar.mo44a(bundle);
            }

            /* renamed from: a */
            public final void mo8644a(Effect effect, C48649d dVar) {
                Exception exc = dVar.f122281c;
                if (exc == null) {
                    exc = new Exception("downloadBindMovieEffect Failed");
                }
                jVar.mo43a(exc);
            }
        });
        return jVar.f77a;
    }

    /* renamed from: b */
    private static C0013i<Bundle> m99021b(String str, Intent intent) {
        boolean z;
        Music music = (Music) intent.getSerializableExtra("sticker_music");
        String stringExtra = intent.getStringExtra("sticker_with_music_file_path");
        C0027j jVar = new C0027j();
        Bundle bundle = new Bundle();
        if (!C45733a.m99540a() || music.isCommercialMusic()) {
            z = true;
        } else {
            z = false;
        }
        if (music != null && z) {
            C42482c a = C39618d.f101168i.mo80566a(music.convertToMusicModel());
            C46055e.m100053a(str, stringExtra);
            a.setMusicPriority(2);
            C43214dh.m94817a().mo50200a(a);
            bundle.putString(LeakCanaryFileProvider.f132050j, stringExtra);
        }
        jVar.mo44a(bundle);
        return jVar.f77a;
    }

    /* renamed from: b */
    private static boolean m99023b(Context context, Intent intent) {
        if (!C39618d.m88212a() || !intent.getBooleanExtra("extra_clear_dialog_show_needed", true)) {
            return false;
        }
        C10643a a = new C10643a(context).mo18885a((int) R.string.dct);
        a.mo18899b((int) R.string.dcs);
        a.mo18900b((int) R.string.wf, C45449n.f114860a).mo18886a((int) R.string.ah2, (OnClickListener) new C45450o(context, intent)).mo18897a().mo18882b();
        return true;
    }

    /* renamed from: a */
    private static C0013i<Bundle> m99008a(String str, Intent intent) {
        C0027j jVar = new C0027j();
        ArrayList b = C46059g.m100073b(str);
        Bundle bundle = new Bundle();
        if (!C9414h.m18630a(b)) {
            bundle.putStringArrayList("reuse_sticker_ids", b);
            bundle.putString("event_shoot_event_track", "");
            Effect effect = (Effect) intent.getParcelableExtra("music_with_sticker_effect");
            if (effect != null) {
                bundle.putParcelable("first_sticker", effect);
                if (effect.getMusic() != null && !effect.getMusic().isEmpty()) {
                    String a = C46055e.m100052a((String) effect.getMusic().get(0));
                    if (!TextUtils.isEmpty(a)) {
                        bundle.putString(LeakCanaryFileProvider.f132050j, a);
                    }
                }
            }
        }
        jVar.mo44a(bundle);
        return jVar.f77a;
    }

    /* renamed from: b */
    public static void m99022b(Activity activity, Intent intent) {
        if (intent != null && activity != null) {
            C23951bq b = C23951bq.m58758b();
            intent.putExtra("sdk_load_ve_so_status", IPreloadVESoKt.toStatusCode(C20129b.m49679a()));
            intent.putExtra("preload_ve_so_task_status", b.getPreLoadVESoStatus().toStatusCode());
            intent.putExtra("preload_ve_so_cost_time", b.getPreLoadVESoCostTime());
            if (intent.getBooleanExtra("need_refresh_filter_data", false)) {
                C45101d.m98616a((C45098a) new C52959d());
            }
            C47858ep.m103507a("camera_start");
            C20396g.m50604a(System.currentTimeMillis());
            if (intent.getLongExtra("extra_start_record_time", 0) == 0) {
                intent.putExtra("extra_start_record_time", System.currentTimeMillis());
            }
            new C43854fw();
            C39618d.m88210a(C43854fw.m96287a());
            C45101d.m98616a((C45098a) new C52954a(activity));
            boolean booleanExtra = intent.getBooleanExtra("extra_need_permission_activity", false);
            if (!VideoRecordPermissionActivity.m98264a((Context) activity) || booleanExtra) {
                intent.setClass(activity, VideoRecordPermissionActivity.class);
                activity.startActivity(intent);
                return;
            }
            C45412b.m98979a().step("av_video_record_init", "startToolPermissionActivity");
            boolean booleanExtra2 = intent.getBooleanExtra("enter_record_directly_from_system", false);
            boolean booleanExtra3 = intent.getBooleanExtra("recreate_record_activity_support", false);
            if (booleanExtra2) {
                C47858ep.m103511a("camera_error", "2");
            } else if (!VideoRecordPermissionActivity.m98266b(intent) || !C39618d.m88212a()) {
                IStoryRecordService a = m99009a();
                if ((!C44986ar.m98333a() && !VideoRecordPermissionActivity.m98265a(intent) && !VideoRecordPermissionActivity.m98266b(intent) && C39618d.m88212a() && !booleanExtra3) || (a != null && a.isStoryRecording())) {
                    StringBuilder sb = new StringBuilder("Recording status:");
                    sb.append(C39618d.m88213b());
                    sb.append(" recreatedSupport: ");
                    sb.append(booleanExtra3);
                    C50203g.m108358a(sb.toString());
                    C23569o.m57779a("record", C23088c.m56631a().mo47824a("event", "isRecording").mo47824a("user_info", C39618d.m88213b()).mo47825b());
                    C10691a.m21542b(activity.getApplicationContext(), (int) R.string.b5p).mo19066a();
                    C47858ep.m103512a("camera_error", "2", "recording");
                } else if (!C43214dh.m94817a().mo87852a((Context) activity)) {
                    C23569o.m57779a("record", C23088c.m56631a().mo47824a("event", "isPublishing").mo47825b());
                    C47858ep.m103512a("camera_error", "2", "publishing");
                } else {
                    C26890h.m65011a("av_memory_log", C23089d.m56640a().mo47829a("creation_id", intent.getStringExtra("creation_id")).mo47829a("enter_from", intent.getStringExtra("enter_from")).mo47827a("dalvikPss", C45380af.m98935a().f114754d).mo47827a("nativePss", C45380af.m98935a().f114755e).mo47827a("otherPss", C45380af.m98935a().f114757g).mo47827a("totalPss", C45380af.m98935a().f114756f).f61491a);
                    m99025c(activity, intent);
                }
            } else {
                C47858ep.m103512a("camera_error", "2", "recording");
            }
        }
    }

    /* renamed from: a */
    private static String m99010a(C43838fk fkVar, String str) {
        if (fkVar == null && TextUtils.isEmpty(str)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("national_task_enter_from", str);
            }
            if (fkVar != null) {
                jSONObject.put("anchor_business_type", fkVar.getType());
                jSONObject.put("anchor_title", fkVar.getTitle());
                jSONObject.put("anchor_content", fkVar.getContent());
                jSONObject.put("anchor_id", fkVar.getId());
                jSONObject.put(C23060d.f61428b, fkVar.getOpenUrl());
                jSONObject.put("mp_url", fkVar.getMpUrl());
                jSONObject.put("web_url", fkVar.getWebUrl());
                jSONObject.put("source", 5);
                jSONObject.put("anchor_icon", new JSONObject(new C17971f().mo34889b(fkVar.getIcon())));
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    private static C0013i<Bundle> m99007a(Context context, String str, String str2) {
        C0027j jVar = new C0027j();
        ArrayList b = C46059g.m100073b(str);
        if (C9414h.m18630a(b)) {
            jVar.mo44a(new Bundle());
            return jVar.f77a;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("reuse_sticker_ids", b);
        bundle.putString("event_shoot_event_track", str2);
        m99019a(context, (String) b.get(0), bundle, jVar);
        return jVar.f77a;
    }

    /* renamed from: a */
    static final /* synthetic */ Void m99011a(String str, Context context, C0027j jVar) throws Exception {
        try {
            AVChallenge a = C39618d.f101163d.mo74185a(str, 0, false);
            C43214dh.m94817a().mo87850a(a);
            String challenge2str = RecordScene.challenge2str(a);
            Editor edit = C35807d.m80935a(C39629l.m88233b(), "publish", 0).edit();
            edit.putString("challenge", challenge2str);
            C9402b.m18594a(edit);
            Bundle bundle = new Bundle();
            bundle.putSerializable("challenge", a);
            if (a == null || a.getStickerId() == null) {
                jVar.mo44a(bundle);
            } else {
                m99019a(context, a.getStickerId(), bundle, jVar);
            }
        } catch (Exception e) {
            jVar.mo43a(e);
        }
        return null;
    }

    /* renamed from: a */
    private static void m99019a(Context context, String str, final Bundle bundle, final C0027j<Bundle> jVar) {
        C45871b.m99717a(C29242c.m68868a(context)).mo92470a(str, "", (C48705j) new C48705j() {
            /* renamed from: a */
            public final void mo8643a(Effect effect) {
            }

            /* renamed from: a */
            public final /* synthetic */ void mo8638a(Object obj) {
                Effect effect = (Effect) obj;
                bundle.putParcelable("first_sticker", effect);
                if (effect.getMusic() != null && !effect.getMusic().isEmpty()) {
                    String a = C46055e.m100052a((String) effect.getMusic().get(0));
                    if (!TextUtils.isEmpty(a)) {
                        bundle.putString(LeakCanaryFileProvider.f132050j, a);
                    }
                }
                jVar.mo44a(bundle);
            }

            /* renamed from: a */
            public final void mo8644a(Effect effect, C48649d dVar) {
                jVar.mo43a(dVar.f122281c);
            }
        });
    }

    /* renamed from: a */
    private static C0013i<Bundle> m99005a(Context context, String str, int i, boolean z) {
        C0027j jVar = new C0027j();
        C45547d b = C45547d.m99208b(context, context.getResources().getString(R.string.dnt));
        b.setIndeterminate(false);
        C45451p pVar = new C45451p(context, str, z, b, jVar, 2);
        C0013i.m16a((Callable<TResult>) pVar);
        return jVar.f77a;
    }

    /* renamed from: a */
    public static C0013i<Bundle> m99006a(Context context, String str, C0027j<Bundle> jVar, C45546c cVar) {
        Map b = C45841j.m99677b();
        if (b.get(str) == null) {
            jVar.mo44a(new Bundle());
            C47700ay.m103236b(cVar);
            return jVar.f77a;
        }
        C45446k kVar = new C45446k(b, str, jVar, cVar, context);
        C0013i.m16a((Callable<TResult>) kVar);
        return jVar.f77a;
    }
}
