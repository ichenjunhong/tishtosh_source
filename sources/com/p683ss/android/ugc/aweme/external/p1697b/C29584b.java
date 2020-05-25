package com.p683ss.android.ugc.aweme.external.p1697b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.external.C29610e;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.p1441bn.C23863a.C23864a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.ISDKService.SplitCallback;
import com.p683ss.android.ugc.aweme.services.SDKServiceImpl;
import com.p683ss.android.ugc.aweme.services.effect.EffectService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.CommentVideoConfig;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.DuetConfig;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.EffectConfig;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IRecordService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IRecordService.UICallback;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.MiniAppConfig;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.PoiConfig;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.ReactConfig;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.ReshootConfig;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.StickerDownloadConfig;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.XSConfig;
import com.p683ss.android.ugc.aweme.services.settings.IDmtAVSettingsService;
import com.p683ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e.C43193b;
import com.p683ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44986ar;
import com.p683ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p683ss.android.ugc.aweme.utils.C47900ft;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.superentrance.C53020f.C53021a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import leakcanary.internal.LeakCanaryFileProvider;
import p001a.C0013i;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.external.b.b */
public abstract class C29584b implements IRecordService {

    /* renamed from: a */
    public final C43214dh f77415a;

    /* renamed from: b */
    private final IDmtAVSettingsService f77416b = C29610e.m69680a();

    /* renamed from: c */
    private final SDKServiceImpl f77417c = new SDKServiceImpl();

    /* renamed from: com.ss.android.ugc.aweme.external.b.b$a */
    public static final class C29585a implements C48705j {

        /* renamed from: a */
        final /* synthetic */ StickerDownloadConfig f77418a;

        /* renamed from: b */
        final /* synthetic */ C48705j f77419b;

        /* renamed from: a */
        public final void mo8643a(Effect effect) {
            C52711k.m112240b(effect, "effect");
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            Effect effect = (Effect) obj;
            C52711k.m112240b(effect, "effect");
            this.f77418a.getOnSuccess();
            this.f77419b.mo8638a(effect);
        }

        C29585a(StickerDownloadConfig stickerDownloadConfig, C48705j jVar) {
            this.f77418a = stickerDownloadConfig;
            this.f77419b = jVar;
        }

        /* renamed from: a */
        public final void mo8644a(Effect effect, C48649d dVar) {
            C52711k.m112240b(dVar, "e");
            C52671b onFail = this.f77418a.getOnFail();
            if (onFail != null) {
                onFail.invoke(Integer.valueOf(dVar.f122279a));
            }
            this.f77419b.mo8644a(effect, dVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b.b$b */
    public static final class C29586b implements SplitCallback {

        /* renamed from: a */
        final /* synthetic */ C29584b f77420a;

        /* renamed from: b */
        final /* synthetic */ DuetConfig f77421b;

        /* renamed from: c */
        final /* synthetic */ RecordConfig f77422c;

        /* renamed from: d */
        final /* synthetic */ Context f77423d;

        /* renamed from: e */
        final /* synthetic */ UICallback f77424e;

        /* renamed from: com.ss.android.ugc.aweme.external.b.b$b$a */
        public static final class C29587a implements C48705j {

            /* renamed from: a */
            final /* synthetic */ C29586b f77425a;

            /* renamed from: b */
            final /* synthetic */ Intent f77426b;

            /* renamed from: a */
            public final void mo8643a(Effect effect) {
                C52711k.m112240b(effect, "effect");
            }

            /* renamed from: a */
            public final /* synthetic */ void mo8638a(Object obj) {
                final Effect effect = (Effect) obj;
                C52711k.m112240b(effect, "effect");
                C0013i.m18a((Callable<TResult>) new Callable<C52860x>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C29587a f77427a;

                    {
                        this.f77427a = r1;
                    }

                    public final /* synthetic */ Object call() {
                        UICallback uICallback = this.f77427a.f77425a.f77424e;
                        if (uICallback != null) {
                            uICallback.preSuccess();
                        }
                        this.f77427a.f77425a.f77420a.f77415a.mo50200a((C42482c) null);
                        this.f77427a.f77425a.f77420a.f77415a.mo87857g();
                        MusicModel musicModel = this.f77427a.f77425a.f77422c.getMusicModel();
                        if (musicModel != null) {
                            this.f77427a.f77425a.f77420a.f77415a.mo50200a(C39618d.f101168i.mo80566a(musicModel));
                        }
                        Intent intent = this.f77427a.f77426b;
                        Effect effect = effect;
                        Integer duetGameScore = this.f77427a.f77425a.f77421b.getDuetGameScore();
                        if (duetGameScore == null) {
                            C52711k.m112234a();
                        }
                        intent.putExtras(C29584b.m69667a(effect, duetGameScore.intValue()));
                        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(this.f77427a.f77425a.f77423d, this.f77427a.f77426b);
                        UICallback uICallback2 = this.f77427a.f77425a.f77424e;
                        if (uICallback2 == null) {
                            return null;
                        }
                        uICallback2.postSuccess();
                        return C52860x.f131107a;
                    }
                }, (Executor) C23551l.f62672a);
            }

            C29587a(C29586b bVar, Intent intent) {
                this.f77425a = bVar;
                this.f77426b = intent;
            }

            /* renamed from: a */
            public final void mo8644a(Effect effect, C48649d dVar) {
                C52711k.m112240b(dVar, "e");
                UICallback uICallback = this.f77425a.f77424e;
                if (uICallback != null) {
                    uICallback.preFail(-2);
                }
                C18842a.m45934b(new Runnable(this) {

                    /* renamed from: a */
                    final /* synthetic */ C29587a f77429a;

                    {
                        this.f77429a = r1;
                    }

                    public final void run() {
                        C10691a.m21542b(this.f77429a.f77425a.f77423d.getApplicationContext(), (int) R.string.b06).mo19066a();
                    }
                });
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.external.b.b$b$b */
        static final class C29590b<V> implements Callable<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C29586b f77430a;

            /* renamed from: b */
            final /* synthetic */ Intent f77431b;

            C29590b(C29586b bVar, Intent intent) {
                this.f77430a = bVar;
                this.f77431b = intent;
            }

            public final /* synthetic */ Object call() {
                UICallback uICallback = this.f77430a.f77424e;
                if (uICallback != null) {
                    uICallback.preSuccess();
                }
                this.f77430a.f77420a.f77415a.mo50200a(C39618d.f101168i.mo80566a(this.f77430a.f77422c.getMusicModel()));
                this.f77430a.f77420a.f77415a.mo87857g();
                VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(this.f77430a.f77423d, this.f77431b);
                return C52860x.f131107a;
            }
        }

        public final void onFail() {
            UICallback uICallback = this.f77424e;
            if (uICallback != null) {
                uICallback.preFail(-1);
            }
        }

        public final void onSuccess(int i, int i2) {
            this.f77421b.setDuetVideoWidth(C29584b.m69665a(i));
            this.f77421b.setDuetVideoHeight(C29584b.m69665a(i2));
            Intent a = C29584b.m69666a(this.f77422c);
            DuetConfig duetConfig = this.f77421b;
            Bundle bundle = new Bundle();
            bundle.putString("duet_hash_tag", duetConfig.getDuetChallenge());
            bundle.putString("duet_video_path", duetConfig.getMp4Path());
            bundle.putString("duet_audio_path", duetConfig.getWavPath());
            bundle.putInt("duet_video_width", duetConfig.getDuetVideoWidth());
            bundle.putInt("duet_video_height", duetConfig.getDuetVideoHeight());
            bundle.putString("duet_from", duetConfig.getDuetFrom());
            bundle.putSerializable("duet_author", duetConfig.getAuthor());
            MusicWaveBean musicWaveBean = (MusicWaveBean) C39618d.f101145I.mo58604b().mo80569a(C43191e.f109217h.mo87802a(duetConfig.getWavPath()));
            if (musicWaveBean != null) {
                bundle.putSerializable("music_wave_data", musicWaveBean);
            }
            a.putExtras(bundle);
            if (this.f77421b.getMStickerDownloadConfig() != null) {
                StickerDownloadConfig mStickerDownloadConfig = this.f77421b.getMStickerDownloadConfig();
                if (mStickerDownloadConfig != null) {
                    C29584b.m69670a(this.f77423d, mStickerDownloadConfig, new C29587a(this, a));
                }
            } else {
                C0013i.m18a((Callable<TResult>) new C29590b<TResult>(this, a), (Executor) C23551l.f62672a);
            }
        }

        C29586b(C29584b bVar, DuetConfig duetConfig, RecordConfig recordConfig, Context context, UICallback uICallback) {
            this.f77420a = bVar;
            this.f77421b = duetConfig;
            this.f77422c = recordConfig;
            this.f77423d = context;
            this.f77424e = uICallback;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b.b$c */
    public static final class C29591c implements SplitCallback {

        /* renamed from: a */
        final /* synthetic */ C29584b f77432a;

        /* renamed from: b */
        final /* synthetic */ ReactConfig f77433b;

        /* renamed from: c */
        final /* synthetic */ RecordConfig f77434c;

        /* renamed from: d */
        final /* synthetic */ UICallback f77435d;

        /* renamed from: e */
        final /* synthetic */ Context f77436e;

        /* renamed from: com.ss.android.ugc.aweme.external.b.b$c$a */
        static final class C29592a<V> implements Callable<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C29591c f77437a;

            C29592a(C29591c cVar) {
                this.f77437a = cVar;
            }

            public final /* synthetic */ Object call() {
                Intent a = C29584b.m69666a(this.f77437a.f77434c);
                ReactionParams params = this.f77437a.f77433b.getParams();
                Bundle bundle = new Bundle();
                String str = "reaction_params";
                if (params != null) {
                    bundle.putParcelable(str, params);
                    C39529ab b = C39618d.f101145I.mo58604b();
                    C43193b bVar = C43191e.f109217h;
                    String str2 = params.wavPath;
                    C52711k.m112236a((Object) str2, "reactionParams.wavPath");
                    MusicWaveBean musicWaveBean = (MusicWaveBean) b.mo80569a(bVar.mo87802a(str2));
                    if (musicWaveBean != null) {
                        bundle.putSerializable("music_wave_data", musicWaveBean);
                    }
                    a.putExtras(bundle);
                    UICallback uICallback = this.f77437a.f77435d;
                    if (uICallback != null) {
                        uICallback.preSuccess();
                    }
                    this.f77437a.f77432a.f77415a.mo50200a(C39618d.f101168i.mo80566a(this.f77437a.f77434c.getMusicModel()));
                    this.f77437a.f77432a.f77415a.mo87857g();
                    VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(this.f77437a.f77436e, a);
                    return C52860x.f131107a;
                }
                throw new C52857u("null cannot be cast to non-null type android.os.Parcelable");
            }
        }

        public final void onFail() {
            UICallback uICallback = this.f77435d;
            if (uICallback != null) {
                uICallback.preFail(-1);
            }
        }

        public final void onSuccess(int i, int i2) {
            this.f77433b.getParams().videoWidth = C29584b.m69665a(i);
            this.f77433b.getParams().videoHeight = C29584b.m69665a(i2);
            C0013i.m18a((Callable<TResult>) new C29592a<TResult>(this), (Executor) C23551l.f62672a);
        }

        C29591c(C29584b bVar, ReactConfig reactConfig, RecordConfig recordConfig, UICallback uICallback, Context context) {
            this.f77432a = bVar;
            this.f77433b = reactConfig;
            this.f77434c = recordConfig;
            this.f77435d = uICallback;
            this.f77436e = context;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b.b$d */
    static final class C29593d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C29584b f77438a;

        /* renamed from: b */
        final /* synthetic */ Intent f77439b;

        /* renamed from: c */
        final /* synthetic */ StitchParams f77440c;

        /* renamed from: d */
        final /* synthetic */ Context f77441d;

        C29593d(C29584b bVar, Intent intent, StitchParams stitchParams, Context context) {
            this.f77438a = bVar;
            this.f77439b = intent;
            this.f77440c = stitchParams;
            this.f77441d = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(this.f77441d, C29584b.m69666a(new Builder().shootWay("stitch").stitchParams(this.f77440c).creationId(this.f77439b.getStringExtra("creation_id")).build()));
            return C52860x.f131107a;
        }
    }

    public C29584b() {
        C43214dh a = C43214dh.m94817a();
        C52711k.m112236a((Object) a, "PublishManager.inst()");
        this.f77415a = a;
        C29610e eVar = (C29610e) C29610e.f77464b.getValue();
    }

    /* renamed from: a */
    public static int m69665a(int i) {
        double d = (double) i;
        Double.isNaN(d);
        return ((int) Math.round((d * 1.0d) / 16.0d)) * 16;
    }

    /* renamed from: a */
    protected static Intent m69666a(RecordConfig recordConfig) {
        String str;
        C52711k.m112240b(recordConfig, "config");
        Intent intent = new Intent();
        String shootway = recordConfig.getShootway();
        if (shootway != null) {
            intent.putExtra("shoot_way", shootway);
        }
        String enterFrom = recordConfig.getEnterFrom();
        if (enterFrom != null) {
            intent.putExtra("enter_from", enterFrom);
        }
        String creationId = recordConfig.getCreationId();
        if (creationId != null) {
            intent.putExtra("creation_id", creationId);
        }
        intent.putExtra("restore", recordConfig.getRestoreType());
        String musicOrigin = recordConfig.getMusicOrigin();
        if (musicOrigin != null) {
            intent.putExtra("music_origin", musicOrigin);
        }
        intent.putExtra("need_refresh_filter_data", recordConfig.getPrepareFilter());
        C52847n mentionUser = recordConfig.getMentionUser();
        if (mentionUser != null) {
            intent.putExtra("extra_mention_uid", (String) mentionUser.getFirst());
            intent.putExtra("extra_mention_user_name", (String) mentionUser.getSecond());
        }
        String previousPage = recordConfig.getPreviousPage();
        if (previousPage != null) {
            intent.putExtra("extra_previous_page", previousPage);
        }
        String commerceData = recordConfig.getCommerceData();
        if (commerceData != null) {
            intent.putExtra("commerce_data_in_tools_line", commerceData);
        }
        String sticker = recordConfig.getSticker();
        if (sticker != null) {
            intent.putExtra("sticker_id", sticker);
        }
        String isFilterBusniessSticker = recordConfig.isFilterBusniessSticker();
        if (isFilterBusniessSticker != null) {
            intent.putExtra("filter_business_sticker", isFilterBusniessSticker);
        }
        Long videoDownloadDuration = recordConfig.getVideoDownloadDuration();
        if (videoDownloadDuration != null) {
            intent.putExtra("video_download_duration", videoDownloadDuration.longValue());
        }
        Long effectDownloadDuration = recordConfig.getEffectDownloadDuration();
        if (effectDownloadDuration != null) {
            intent.putExtra("effect_download_duration", effectDownloadDuration.longValue());
        }
        Long musicDownloadDuration = recordConfig.getMusicDownloadDuration();
        if (musicDownloadDuration != null) {
            intent.putExtra("music_download_duration", musicDownloadDuration.longValue());
        }
        Long startRecordTime = recordConfig.getStartRecordTime();
        if (startRecordTime != null) {
            intent.putExtra("extra_start_record_time", startRecordTime.longValue());
        }
        Long decompressTime = recordConfig.getDecompressTime();
        if (decompressTime != null) {
            intent.putExtra("extra_decompress_time", decompressTime.longValue());
        }
        Boolean presetSticker = recordConfig.getPresetSticker();
        if (presetSticker != null) {
            intent.putExtra("use_preset_sticker_at_first", presetSticker.booleanValue());
        }
        Integer translationType = recordConfig.getTranslationType();
        if (translationType != null) {
            intent.putExtra("translation_type", translationType.intValue());
        }
        Boolean permissionActivityRequired = recordConfig.getPermissionActivityRequired();
        if (permissionActivityRequired != null) {
            intent.putExtra("extra_need_permission_activity", permissionActivityRequired.booleanValue());
        }
        if (C52711k.m112239a((Object) recordConfig.getFromMain(), (Object) Boolean.valueOf(true))) {
            intent.putExtra("from", "main");
        }
        Boolean fromSystem = recordConfig.getFromSystem();
        if (fromSystem != null) {
            intent.putExtra("enter_record_directly_from_system", fromSystem.booleanValue());
        }
        Boolean fromOtherPlatform = recordConfig.getFromOtherPlatform();
        if (fromOtherPlatform != null) {
            intent.putExtra("enter_record_from_other_platform", fromOtherPlatform.booleanValue());
        }
        ArrayList stickers = recordConfig.getStickers();
        if (stickers != null) {
            intent.putStringArrayListExtra("reuse_sticker_ids", stickers);
        }
        String musicPath = recordConfig.getMusicPath();
        if (musicPath != null) {
            intent.putExtra(LeakCanaryFileProvider.f132050j, musicPath);
        }
        String musicSticker = recordConfig.getMusicSticker();
        if (musicSticker != null) {
            intent.putExtra("music_reuse_sticker_id", musicSticker);
        }
        String stickerWithMusicFilePath = recordConfig.getStickerWithMusicFilePath();
        if (stickerWithMusicFilePath != null) {
            intent.putExtra("sticker_with_music_file_path", stickerWithMusicFilePath);
        }
        Effect musicWithStickerEffect = recordConfig.getMusicWithStickerEffect();
        if (musicWithStickerEffect != null) {
            String str2 = "music_with_sticker_effect";
            if (musicWithStickerEffect != null) {
                intent.putExtra(str2, musicWithStickerEffect);
            } else {
                throw new C52857u("null cannot be cast to non-null type android.os.Parcelable");
            }
        }
        Music stickerMusic = recordConfig.getStickerMusic();
        if (stickerMusic != null) {
            intent.putExtra("sticker_music", stickerMusic);
        }
        String musicId = recordConfig.getMusicId();
        if (musicId != null) {
            intent.putExtra("music_id", musicId);
        }
        String challengeId = recordConfig.getChallengeId();
        if (challengeId != null) {
            intent.putExtra("challenge_id", challengeId);
        }
        String autoUseMusic = recordConfig.getAutoUseMusic();
        if (autoUseMusic != null) {
            intent.putExtra("direct_use_sticker_music", autoUseMusic);
        }
        String autoUseSticker = recordConfig.getAutoUseSticker();
        if (autoUseSticker != null) {
            intent.putExtra("first_face_sticker", autoUseSticker);
        }
        Effect mvSticker = recordConfig.getMvSticker();
        if (mvSticker != null) {
            intent.putExtra("reuse_mvtheme_enter", true);
            intent.putExtra("extra_bind_mv_id", mvSticker.getEffectId());
            String str3 = "first_sticker";
            if (mvSticker != null) {
                intent.putExtra(str3, mvSticker);
            } else {
                throw new C52857u("null cannot be cast to non-null type android.os.Parcelable");
            }
        }
        String mvStickerId = recordConfig.getMvStickerId();
        if (mvStickerId != null) {
            intent.putExtra("extra_bind_mv_id", mvStickerId);
        }
        MiniAppConfig miniAppConfig = recordConfig.getMiniAppConfig();
        if (miniAppConfig != null) {
            intent.putExtra("sticker_id", miniAppConfig.getStickerId());
            intent.putExtra("micro_app_info", miniAppConfig.getAppInfo());
            intent.putExtra("micro_app_class", miniAppConfig.getAppClass());
        }
        CommentVideoConfig commentVideoConfig = recordConfig.getCommentVideoConfig();
        if (commentVideoConfig != null) {
            intent.putExtra("comment_video_model", commentVideoConfig.getCommentVideoModel());
        }
        Effect firstSticker = recordConfig.getFirstSticker();
        if (firstSticker != null) {
            String str4 = "first_sticker";
            if (firstSticker != null) {
                intent.putExtra(str4, firstSticker);
            } else {
                throw new C52857u("null cannot be cast to non-null type android.os.Parcelable");
            }
        }
        String stickerFrom = recordConfig.getStickerFrom();
        if (stickerFrom != null) {
            intent.putExtra("extra_sticker_from", stickerFrom);
        }
        PoiConfig poiSticker = recordConfig.getPoiSticker();
        if (poiSticker != null) {
            intent.putExtra("poi_struct_in_tools_line", poiSticker.getStruct());
            intent.putExtra("first_face_sticker", poiSticker.getEffect());
            intent.putExtra("challenge_id", poiSticker.getChallengeId());
        }
        String donationId = recordConfig.getDonationId();
        if (donationId != null) {
            intent.putExtra("donation_id", donationId);
        }
        Integer defaultTab = recordConfig.getDefaultTab();
        if (defaultTab != null && defaultTab.intValue() == 1) {
            intent.putExtra("extra_to_status", true);
        } else if (defaultTab != null && defaultTab.intValue() == 2) {
            intent.putExtra("to_live", true);
        } else if (defaultTab != null && defaultTab.intValue() == 3) {
            intent.putExtra("extra_to_xs", true);
            XSConfig xsConfig = recordConfig.getXsConfig();
            if (xsConfig != null) {
                intent.putExtra("extra_to_xs_from_click", xsConfig.getFromClick());
                String str5 = "xs_enter_from";
                String str6 = null;
                if (xsConfig != null) {
                    str = xsConfig.getEnterFrom();
                } else {
                    str = null;
                }
                intent.putExtra(str5, str);
                String str7 = "xs_city";
                if (xsConfig != null) {
                    str6 = xsConfig.getCity();
                }
                intent.putExtra(str7, str6);
            }
        }
        if (recordConfig.getShowStickerPanel()) {
            intent.putExtra("sticker_pannel_show", true);
        }
        HashMap starAtlasConfig = recordConfig.getStarAtlasConfig();
        if (starAtlasConfig != null) {
            Set<Entry> entrySet = starAtlasConfig.entrySet();
            if (entrySet != null) {
                for (Entry entry : entrySet) {
                    intent.putExtra((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        HashMap taskPlatformConfig = recordConfig.getTaskPlatformConfig();
        if (taskPlatformConfig != null) {
            Set<Entry> entrySet2 = taskPlatformConfig.entrySet();
            if (entrySet2 != null) {
                for (Entry entry2 : entrySet2) {
                    intent.putExtra((String) entry2.getKey(), (String) entry2.getValue());
                }
            }
        }
        EffectConfig effectConfig = recordConfig.getEffectConfig();
        if (effectConfig != null) {
            intent.putExtra("effect_meta_info", effectConfig.getEffectMetaInfo());
            intent.putExtra("effect_image", effectConfig.getEffectImage());
        }
        StitchParams stitchParams = recordConfig.getStitchParams();
        if (stitchParams != null) {
            String str8 = "stitch_params";
            if (stitchParams != null) {
                intent.putExtra(str8, stitchParams);
            } else {
                throw new C52857u("null cannot be cast to non-null type android.os.Parcelable");
            }
        }
        Boolean fromSpecialPlus = recordConfig.getFromSpecialPlus();
        if (fromSpecialPlus != null) {
            intent.putExtra("from_special_plus", fromSpecialPlus.booleanValue());
        }
        return intent;
    }

    public void startRecord(Context context, Intent intent) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(intent, "intent");
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(context, intent);
    }

    /* renamed from: a */
    public static Bundle m69667a(Effect effect, int i) {
        long j;
        Bundle bundle = new Bundle();
        GameDuetResource gameDuetResource = new GameDuetResource(i, effect);
        try {
            String effectId = effect.getEffectId();
            C52711k.m112236a((Object) effectId, "bean.effectId");
            j = Long.parseLong(effectId);
        } catch (Exception unused) {
            j = 0;
        }
        bundle.putParcelable("duet_sticker_game", gameDuetResource);
        bundle.putLong("first_face_sticker", j);
        return bundle;
    }

    public void startRecord(Context context, RecordConfig recordConfig) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(recordConfig, "recordConfig");
        Intent a = m69666a(recordConfig);
        if (recordConfig.getReshootConfig().getEnableReshoot()) {
            m69669a(context, a, null, recordConfig.getKeepChallenges(), recordConfig.getReshootConfig());
            return;
        }
        m69668a(context, a, null, recordConfig.getKeepChallenges());
    }

    public void startSuperEntrace(Activity activity, RecordConfig recordConfig) {
        C52711k.m112240b(activity, "context");
        C52711k.m112240b(recordConfig, "recordConfig");
        recordConfig.setPrepareFilter(false);
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startSuperEntranceRecordActivity(activity, m69666a(recordConfig));
        C53021a.m112748a().setSuperEntranceRecordClicked(activity, true);
    }

    public void startSpecialPlusEntrance(Activity activity, RecordConfig recordConfig) {
        C52711k.m112240b(activity, "context");
        C52711k.m112240b(recordConfig, "recordConfig");
        String specialPlusOpenUrl = C23864a.m58580a().getSpecialPlusOpenUrl();
        if (specialPlusOpenUrl != null) {
            if (!(!TextUtils.isEmpty(specialPlusOpenUrl))) {
                specialPlusOpenUrl = null;
            }
            String str = specialPlusOpenUrl;
            if (str != null) {
                Uri parse = Uri.parse(str);
                C52711k.m112236a((Object) parse, "uri");
                if (TextUtils.equals(parse.getHost(), "openRecord")) {
                    String a = C52830p.m112401a(str, "aweme://", "snssdk1128://", false, 4, (Object) null);
                    Intent intent = new Intent();
                    Uri.Builder buildUpon = Uri.parse(a).buildUpon();
                    buildUpon.appendQueryParameter("from_special_plus", "1");
                    if (TextUtils.isEmpty(parse.getQueryParameter("enter_from"))) {
                        buildUpon.appendQueryParameter("enter_from", "super_entrance");
                    }
                    intent.setData(buildUpon.build());
                    activity.startActivity(intent);
                    C23864a.m58580a().setSpecialPlusClicked();
                }
            }
        }
    }

    public void startStitch(Context context, Intent intent, StitchParams stitchParams) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(intent, "intent");
        C52711k.m112240b(stitchParams, "stitchParams");
        C47900ft.m103619a(0, new C29593d(this, intent, stitchParams, context));
    }

    public void startRecord(Context context, RecordConfig recordConfig, Uri uri) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(recordConfig, "recordConfig");
        C52711k.m112240b(uri, "extraUri");
        Intent a = m69666a(recordConfig);
        if (uri.isHierarchical()) {
            for (String str : uri.getQueryParameterNames()) {
                a.putExtra(str, uri.getQueryParameter(str));
            }
        }
        if (recordConfig.getReshootConfig().getEnableReshoot()) {
            m69669a(context, a, null, recordConfig.getKeepChallenges(), recordConfig.getReshootConfig());
            return;
        }
        m69668a(context, a, null, recordConfig.getKeepChallenges());
    }

    /* renamed from: a */
    protected static void m69670a(Context context, StickerDownloadConfig stickerDownloadConfig, C48705j jVar) {
        C29252f fVar;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(stickerDownloadConfig, "stickerDownloadConfig");
        C52711k.m112240b(jVar, "listener");
        Integer type = stickerDownloadConfig.getType();
        boolean z = true;
        if (type == null || type.intValue() != 1) {
            Integer type2 = stickerDownloadConfig.getType();
            if (type2 == null || type2.intValue() != 3) {
                Integer type3 = stickerDownloadConfig.getType();
                if (type3 == null || type3.intValue() != 4) {
                    z = false;
                }
            }
        }
        if (z) {
            fVar = EffectService.getInstance().createMvEffectPlatform(context, stickerDownloadConfig.getRegion(), stickerDownloadConfig.getHttpClient());
        } else {
            fVar = EffectService.getInstance().createEffectPlatform(context, stickerDownloadConfig.getRegion(), stickerDownloadConfig.getHttpClient());
        }
        fVar.mo59132a(stickerDownloadConfig.getStickerId(), (String) null, (C48705j) new C29585a(stickerDownloadConfig, jVar));
    }

    /* renamed from: a */
    private final void m69668a(Context context, Intent intent, UICallback uICallback, Boolean bool) {
        this.f77415a.mo50200a((C42482c) null);
        if (true ^ C52711k.m112239a((Object) bool, (Object) Boolean.valueOf(true))) {
            this.f77415a.mo87857g();
        }
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(context, intent);
    }

    public void startDuet(Context context, RecordConfig recordConfig, DuetConfig duetConfig, UICallback uICallback) {
        Context context2 = context;
        C52711k.m112240b(context2, "context");
        RecordConfig recordConfig2 = recordConfig;
        C52711k.m112240b(recordConfig2, "config");
        DuetConfig duetConfig2 = duetConfig;
        C52711k.m112240b(duetConfig2, "duetConfig");
        SDKServiceImpl sDKServiceImpl = this.f77417c;
        int minDuration = duetConfig.getMinDuration();
        String outputDir = duetConfig.getOutputDir();
        String originVideo = duetConfig.getOriginVideo();
        String wavPath = duetConfig.getWavPath();
        String mp4Path = duetConfig.getMp4Path();
        boolean enableDuetReactVEEditor = this.f77416b.enableDuetReactVEEditor();
        C29586b bVar = new C29586b(this, duetConfig2, recordConfig2, context, uICallback);
        sDKServiceImpl.split(context2, minDuration, outputDir, originVideo, wavPath, mp4Path, enableDuetReactVEEditor, bVar);
    }

    public void startReact(Context context, RecordConfig recordConfig, ReactConfig reactConfig, UICallback uICallback) {
        Context context2 = context;
        C52711k.m112240b(context2, "context");
        RecordConfig recordConfig2 = recordConfig;
        C52711k.m112240b(recordConfig2, "config");
        ReactConfig reactConfig2 = reactConfig;
        C52711k.m112240b(reactConfig2, "reactConfig");
        SDKServiceImpl sDKServiceImpl = this.f77417c;
        int minDuration = reactConfig.getMinDuration();
        String outputDir = reactConfig.getOutputDir();
        String originVideo = reactConfig.getOriginVideo();
        String str = reactConfig.getParams().wavPath;
        C52711k.m112236a((Object) str, "reactConfig.params.wavPath");
        String str2 = reactConfig.getParams().videoPath;
        C52711k.m112236a((Object) str2, "reactConfig.params.videoPath");
        boolean enableDuetReactVEEditor = this.f77416b.enableDuetReactVEEditor();
        C29591c cVar = new C29591c(this, reactConfig2, recordConfig2, uICallback, context);
        sDKServiceImpl.split(context2, minDuration, outputDir, originVideo, str, str2, enableDuetReactVEEditor, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startRecord(android.app.Activity r8, com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig r9, com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel r10, boolean r11) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            java.lang.String r0 = "recordConfig"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            java.lang.String r0 = "musicModel"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            android.content.Intent r3 = m69666a(r9)
            java.lang.String r0 = "direct_shoot"
            com.ss.android.ugc.aweme.shortvideo.dh r1 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            java.lang.String r2 = "PublishManager.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.String r1 = r1.f109290e
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0038
            r0 = 2
            com.ss.android.ugc.aweme.shortvideo.dh r4 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            java.lang.String r5 = "PublishManager.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            int r4 = r4.f109291f
            if (r0 != r4) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "extra_clear_dialog_show_needed"
            com.ss.android.ugc.aweme.shortvideo.dh r4 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r4 = r4.mo50201b()
            if (r4 == 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r1 = 0
        L_0x0049:
            r3.putExtra(r0, r1)
        L_0x004c:
            com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean r0 = r10.getMusicWaveBean()
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = "music_wave_data"
            com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean r1 = r10.getMusicWaveBean()
            java.io.Serializable r1 = (java.io.Serializable) r1
            r3.putExtra(r0, r1)
        L_0x005d:
            com.ss.android.ugc.aweme.shortvideo.dh r0 = r7.f77415a
            com.ss.android.ugc.aweme.port.in.ab r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101168i
            com.ss.android.ugc.aweme.shortvideo.c r1 = r1.mo80566a(r10)
            r0.mo50200a(r1)
            com.ss.android.ugc.aweme.music.model.Music r0 = r10.getMusic()
            java.lang.String r1 = "musicModel.music"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r0.getChallenge()
            if (r11 == 0) goto L_0x009d
            if (r0 == 0) goto L_0x009d
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            java.lang.String r1 = "challenge"
            com.ss.android.ugc.aweme.tools.music.e.a r4 = new com.ss.android.ugc.aweme.tools.music.e.a
            r4.<init>()
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r4 = com.p683ss.android.ugc.aweme.tools.music.p2366e.C47195a.m102452a(r0)
            java.io.Serializable r4 = (java.io.Serializable) r4
            r11.putSerializable(r1, r4)
            r3.putExtras(r11)
            com.ss.android.ugc.aweme.shortvideo.dh r11 = r7.f77415a
            com.ss.android.ugc.aweme.port.in.ab r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101168i
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r0 = r1.mo80565a(r0)
            r11.mo87850a(r0)
            goto L_0x00a2
        L_0x009d:
            com.ss.android.ugc.aweme.shortvideo.dh r11 = r7.f77415a
            r11.mo87857g()
        L_0x00a2:
            java.lang.String r11 = "music_model"
            java.io.Serializable r10 = (java.io.Serializable) r10
            r3.putExtra(r11, r10)
            com.ss.android.ugc.aweme.services.external.ui.ReshootConfig r10 = r9.getReshootConfig()
            boolean r10 = r10.getEnableReshoot()
            if (r10 == 0) goto L_0x00e0
            com.ss.android.ugc.aweme.services.external.ui.ReshootConfig r9 = r9.getReshootConfig()
            com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl$Companion r10 = com.p683ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl.Companion
            com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl r1 = r10.getINSTANCE()
            boolean r4 = r9.getEnableReshoot()
            java.lang.Boolean r10 = r9.getReshootClear()
            if (r10 == 0) goto L_0x00cd
            boolean r10 = r10.booleanValue()
            r5 = r10
            goto L_0x00ce
        L_0x00cd:
            r5 = 0
        L_0x00ce:
            java.lang.Boolean r9 = r9.getBackMain()
            if (r9 == 0) goto L_0x00da
            boolean r9 = r9.booleanValue()
            r6 = r9
            goto L_0x00db
        L_0x00da:
            r6 = 0
        L_0x00db:
            r2 = r8
            r1.startToolPermissionActivity(r2, r3, r4, r5, r6)
            return
        L_0x00e0:
            com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl$Companion r9 = com.p683ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl.Companion
            com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl r9 = r9.getINSTANCE()
            r9.startToolPermissionActivity(r8, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.external.p1697b.C29584b.startRecord(android.app.Activity, com.ss.android.ugc.aweme.services.external.ui.RecordConfig, com.ss.android.ugc.aweme.shortvideo.model.MusicModel, boolean):void");
    }

    public void startRecord(Context context, RecordConfig recordConfig, Challenge challenge, Bundle bundle) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(recordConfig, "recordConfig");
        C52711k.m112240b(challenge, "challenge");
        recordConfig.setPrepareFilter(false);
        AVChallenge a = C39618d.f101168i.mo80565a(challenge);
        this.f77415a.mo87850a(a);
        this.f77415a.mo50200a((C42482c) null);
        Intent a2 = m69666a(recordConfig);
        if (bundle != null) {
            a2.putExtras(bundle);
        }
        if (a != null) {
            String str = "extra_open_record_challenge";
            if (a != null) {
                a2.putExtra(str, a);
            } else {
                throw new C52857u("null cannot be cast to non-null type java.io.Serializable");
            }
        }
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(context, a2);
    }

    /* renamed from: a */
    private final void m69669a(Context context, Intent intent, UICallback uICallback, Boolean bool, ReshootConfig reshootConfig) {
        boolean z;
        boolean z2;
        this.f77415a.mo50200a((C42482c) null);
        if (!C52711k.m112239a((Object) bool, (Object) Boolean.valueOf(true))) {
            this.f77415a.mo87857g();
        }
        Boolean backMain = reshootConfig.getBackMain();
        if (backMain != null) {
            z = backMain.booleanValue();
        } else {
            z = C39618d.m88212a();
        }
        if (!z || C44986ar.m98333a()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (context instanceof Activity) {
            VideoRecordEntranceServiceImpl instance = VideoRecordEntranceServiceImpl.Companion.getINSTANCE();
            Activity activity = (Activity) context;
            boolean enableReshoot = reshootConfig.getEnableReshoot();
            Boolean reshootClear = reshootConfig.getReshootClear();
            if (reshootClear == null) {
                C52711k.m112234a();
            }
            instance.startToolPermissionActivity(activity, intent, enableReshoot, reshootClear.booleanValue(), z2);
            return;
        }
        VideoRecordEntranceServiceImpl instance2 = VideoRecordEntranceServiceImpl.Companion.getINSTANCE();
        boolean enableReshoot2 = reshootConfig.getEnableReshoot();
        Boolean reshootClear2 = reshootConfig.getReshootClear();
        if (reshootClear2 == null) {
            C52711k.m112234a();
        }
        instance2.notifyToolPermissionActivity(context, intent, enableReshoot2, reshootClear2.booleanValue(), z2);
    }
}
