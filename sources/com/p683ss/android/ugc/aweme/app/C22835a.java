package com.p683ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.C22921ac.C22923b;
import com.p683ss.android.ugc.aweme.app.C23034av.C23035a;
import com.p683ss.android.ugc.aweme.app.C23037ax.C23038a;
import com.p683ss.android.ugc.aweme.app.C23060d.C23061a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.app.p1379i.C23106a;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p683ss.android.ugc.aweme.commercialize.p1572im.C25938a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.detail.p1628ui.DetailActivity;
import com.p683ss.android.ugc.aweme.experiment.FAQExperiment;
import com.p683ss.android.ugc.aweme.feed.p1736ui.PushLandingFollowExperiment;
import com.p683ss.android.ugc.aweme.feedback.FeedbackActivity;
import com.p683ss.android.ugc.aweme.friends.p1792ui.ContactsActivity;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.live.ILiveOuterService;
import com.p683ss.android.ugc.aweme.main.C36553cd;
import com.p683ss.android.ugc.aweme.main.C36640eh;
import com.p683ss.android.ugc.aweme.mix.MixDetailActivity;
import com.p683ss.android.ugc.aweme.mix.MixDetailActivity.C36988a;
import com.p683ss.android.ugc.aweme.music.p1977e.C37382g;
import com.p683ss.android.ugc.aweme.music.p1978ui.MusicDetailActivity;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1486bz.C24476a;
import com.p683ss.android.ugc.aweme.p1803i.C33089c;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import com.p683ss.android.ugc.aweme.poi.model.C39129m;
import com.p683ss.android.ugc.aweme.profile.p2090ui.ProfileEditActivity;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.shortvideo.p1931u.C36290a;
import com.p683ss.android.ugc.aweme.shortvideo.p1931u.C36290a.C36291a;
import com.p683ss.android.ugc.aweme.shortvideo.p1931u.C36290a.C36292b;
import com.p683ss.android.ugc.aweme.shortvideo.p1931u.C36294b;
import com.p683ss.android.ugc.aweme.utils.ActivityStack;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.p2387a.C47659c;
import java.util.Collection;
import java.util.Set;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.app.a */
public class C22835a {

    /* renamed from: a */
    public static final String f61196a = f61196a;

    /* renamed from: b */
    public static final long f61197b = 1000;

    /* renamed from: c */
    public static final C22864h f61198c = new C22864h(null);

    /* renamed from: com.ss.android.ugc.aweme.app.a$a */
    public static final class C22836a extends C22863g {
        /* renamed from: a */
        public final String mo47674a(Uri uri) {
            C52711k.m112240b(uri, "uri");
            return "friend_recommend";
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return C52711k.m112239a((Object) sb.toString(), (Object) "user/find_friends");
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            String queryParameter = uri.getQueryParameter("inviteType");
            String queryParameter2 = uri.getQueryParameter("puid");
            String a = C22835a.f61198c.mo47680a(queryParameter2, uri, true);
            IBridgeService bridgeService_Monster = I18nBridgeService.getBridgeService_Monster();
            Context context = activity;
            Integer valueOf = Integer.valueOf(queryParameter);
            C52711k.m112236a((Object) valueOf, "Integer.valueOf(inviteType)");
            Intent addFriendsActivityIntent = bridgeService_Monster.getAddFriendsActivityIntent(context, 0, valueOf.intValue(), "", "push");
            addFriendsActivityIntent.putExtra("bundle_puid", queryParameter2);
            addFriendsActivityIntent.putExtra("bundle_sec_puid", a);
            return addFriendsActivityIntent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$aa */
    public static final class C22837aa extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            if (!C52830p.m112406a("chatting", str, true) || !C52830p.m112406a("/message", str2, true)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final void mo47676a(Activity activity, Uri uri, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C25938a.m62896a(activity, uri.getQueryParameter("uid"), uri.getQueryParameter("ext"), null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$ab */
    public static final class C22838ab extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            if (!C52830p.m112406a("mix_video", str, true) || !C52830p.m112410b(str2, "/detail", true)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final void mo47676a(Activity activity, Uri uri, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            String queryParameter = uri.getQueryParameter("mix_id");
            if (queryParameter == null) {
                queryParameter = uri.getLastPathSegment();
            }
            if (queryParameter == null) {
                queryParameter = "";
            }
            String str = queryParameter;
            C36988a aVar = MixDetailActivity.f94482a;
            C36988a.m83211a(activity, str, "", "", "", "direct_click", new Bundle(), null, null, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$ac */
    public static final class C22839ac extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            if (!C52830p.m112406a("user", str, true) || !C52830p.m112406a("/favorite/", str2, true)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final void mo47676a(Activity activity, Uri uri, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            String queryParameter = uri.getQueryParameter("tab_name");
            if (queryParameter == null) {
                queryParameter = "";
            }
            String queryParameter2 = uri.getQueryParameter("mix_ids");
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            StringBuilder sb = new StringBuilder("aweme://favorite?");
            sb.append("tab_name=");
            sb.append(queryParameter);
            sb.append("&push_ids=");
            sb.append(queryParameter2);
            C41302w.m91042a().mo83861a(sb.toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$ad */
    public static final class C22840ad extends C22863g {
        /* renamed from: a */
        public final String mo47674a(Uri uri) {
            C52711k.m112240b(uri, "uri");
            return "poi_page";
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) str, (Object) "poi");
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            Class poiDetailActivityClass = PoiServiceImpl.createIPoiServicebyMonsterPlugin().getPoiDetailActivityClass();
            String queryParameter = uri.getQueryParameter("id");
            Intent intent = new Intent(activity, poiDetailActivityClass);
            intent.putExtra("poi_bundle", new C39129m().mo79718a(queryParameter).mo79713a());
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$ae */
    public static final class C22841ae extends C22863g {
        /* renamed from: a */
        public final String mo47674a(Uri uri) {
            C52711k.m112240b(uri, "uri");
            return "others_homepage";
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) str, (Object) "profile");
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            C23041b.f61395b.mo47764a("personal_homepage", uri, z);
            Intent intent = new Intent(activity, UserProfileActivity.class);
            intent.putExtra("uid", uri.getQueryParameter("id"));
            intent.putExtra("sec_user_id", C22835a.f61198c.mo47680a(uri.getQueryParameter("id"), uri, true));
            intent.putExtra("poi_id", uri.getQueryParameter("poi_id"));
            intent.putExtra("enter_from", uri.getQueryParameter("enter_from"));
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$af */
    public static final class C22842af extends C22863g {
        /* renamed from: a */
        public final String mo47674a(Uri uri) {
            C52711k.m112240b(uri, "uri");
            return "profile_edit";
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) str, (Object) "profileEdit");
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            return new Intent(activity, ProfileEditActivity.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$ag */
    public static final class C22843ag extends C22863g {

        /* renamed from: com.ss.android.ugc.aweme.app.a$ag$a */
        static final class C22844a extends C52712l implements C52682m<Boolean, Long, C52860x> {

            /* renamed from: a */
            final /* synthetic */ Activity f61199a;

            /* renamed from: b */
            final /* synthetic */ Uri f61200b;

            C22844a(Activity activity, Uri uri) {
                this.f61199a = activity;
                this.f61200b = uri;
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ((Number) obj2).longValue();
                if (booleanValue) {
                    Context context = this.f61199a;
                    Uri uri = this.f61200b;
                    C23038a aVar = C23038a.REVIEW_VIDEO;
                    C52711k.m112240b(context, "context");
                    C52711k.m112240b(uri, "routeUri");
                    C52711k.m112240b(aVar, "type");
                    Intent intent = new Intent(context, C23037ax.class);
                    intent.putExtra("route_uri", uri.toString());
                    intent.putExtra("jump_type", aVar);
                    context.startActivity(intent);
                    if (context instanceof Activity) {
                        ((Activity) context).overridePendingTransition(0, 0);
                    }
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: a */
        public final String mo47677a() {
            return AVExternalServiceImpl.getAVServiceImpl_Monster().classnameService().getVideoPublishActivityClass().getName();
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) str, (Object) "publishVideo");
        }

        /* renamed from: a */
        public final void mo47676a(Activity activity, Uri uri, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
            C52711k.m112236a((Object) createIAVServiceProxybyMonsterPlugin, "ServiceManager.get().get…ServiceProxy::class.java)");
            createIAVServiceProxybyMonsterPlugin.getDecompressService().mo74198a(true, new C22844a(activity, uri));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$ah */
    public static final class C22845ah extends C22863g {
        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            return null;
        }

        /* renamed from: a */
        public final String mo47677a() {
            return AVExternalServiceImpl.getAVServiceImpl_Monster().classnameService().getVideoRecordActivityClass().getName();
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            if (!C52711k.m112239a((Object) str, (Object) "openRecord")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                if (!C52830p.m112411b(sb.toString(), "studio/task/create", false, 2, null)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(str2);
                    if (!C52830p.m112411b(sb2.toString(), "studio/create", false, 2, null)) {
                        return false;
                    }
                }
            }
            return true;
        }

        /* renamed from: a */
        public final void mo47676a(Activity activity, Uri uri, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            if (activity.getIntent().getBooleanExtra("from_tile_service", false)) {
                C23111k a = C23111k.m56679a();
                C52711k.m112236a((Object) a, "AppLifeCircleCacheManager.getInstance()");
                C26890h.m65011a("launch_from_notificationbar", C23089d.m56640a().mo47829a("launch_method", "click_shoot_notificationbar").mo47826a("is_cold_launch", a.f61537b ? 1 : 0).f61491a);
            }
            if (z) {
                C36290a aVar = C36290a.f92886a;
                C52711k.m112240b(activity, "activity");
                C52711k.m112240b(uri, "uri");
                Builder enterFrom = new Builder().shootWay("push").enterFrom("push");
                aVar.mo75122a(activity, enterFrom, uri);
                enterFrom.permissionActivityRequired(true);
                if (AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().needLoginBeforeRecord()) {
                    C23137q a2 = C23137q.m56698a();
                    C52711k.m112236a((Object) a2, "AwemeRuntime.inst()");
                    boolean c = a2.mo47855c();
                    Context context = activity;
                    Intent intent = new Intent(context, PushLoginActivity.class);
                    intent.putExtra("EXTRA_AV_RECORD_CONFIG", enterFrom.build());
                    if (c) {
                        activity.startActivity(intent);
                    } else {
                        activity.startActivities(new Intent[]{C47659c.m103160a(context), intent});
                    }
                } else {
                    AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C36291a(true, activity, enterFrom, uri));
                }
            } else {
                C36290a aVar2 = C36290a.f92886a;
                C52711k.m112240b(activity, "activity");
                C52711k.m112240b(uri, "routeUri");
                C23137q a3 = C23137q.m56698a();
                C52711k.m112236a((Object) a3, "AwemeRuntime.inst()");
                boolean c2 = a3.mo47855c();
                Builder builder = new Builder();
                aVar2.mo75122a(activity, builder, uri);
                builder.permissionActivityRequired(true);
                if (c2) {
                    AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C36292b(true, activity, builder, uri));
                    return;
                }
                Intent intent2 = new Intent();
                intent2.setFlags(C36294b.m81936a(activity, intent2, intent2.getFlags()));
                new Bundle();
                intent2.putExtra("EXTRA_AV_RECORD_CONFIG", builder.build());
                intent2.putExtras(intent2.putExtra("enter_record_from_other_platform", true));
                activity.startActivity(intent2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$ai */
    public static final class C22846ai extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            if (!C52711k.m112239a((Object) str, (Object) "search")) {
                CharSequence charSequence = str;
                if ((!C52830p.m112456b(charSequence, (CharSequence) C22858c.f61205a, false, 2, (Object) null) && !C52830p.m112456b(charSequence, (CharSequence) "local", false, 2, (Object) null)) || !C52830p.m112456b((CharSequence) str2, (CharSequence) "spot", false, 2, (Object) null)) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x00ed  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x010b  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x010e  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0122  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0132  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0139  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0149  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0155  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0169  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0180  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0183  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0192  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x01ad  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x01f2  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01fe  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x0211  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.Intent mo47673a(android.app.Activity r21, android.net.Uri r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, boolean r26) {
            /*
                r20 = this;
                r0 = r21
                r1 = r22
                r2 = r23
                java.lang.String r3 = "activity"
                p2628d.p2639f.p2641b.C52711k.m112240b(r0, r3)
                java.lang.String r3 = "uri"
                p2628d.p2639f.p2641b.C52711k.m112240b(r1, r3)
                java.lang.String r3 = "host"
                p2628d.p2639f.p2641b.C52711k.m112240b(r2, r3)
                java.lang.String r3 = "path"
                r4 = r24
                p2628d.p2639f.p2641b.C52711k.m112240b(r4, r3)
                java.lang.String r3 = "fromTokenType"
                r4 = r25
                p2628d.p2639f.p2641b.C52711k.m112240b(r4, r3)
                java.lang.String r3 = "keyword"
                java.lang.String r3 = r1.getQueryParameter(r3)
                java.lang.String r4 = "display_keyword"
                java.lang.String r4 = r1.getQueryParameter(r4)
                r5 = r4
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                boolean r5 = android.text.TextUtils.isEmpty(r5)
                if (r5 == 0) goto L_0x003e
                java.lang.String r4 = "displayKeyword"
                java.lang.String r4 = r1.getQueryParameter(r4)
            L_0x003e:
                java.lang.String r5 = "force_to_hot_spot"
                java.lang.String r5 = r1.getQueryParameter(r5)
                if (r5 == 0) goto L_0x0049
                java.lang.Boolean.parseBoolean(r5)
            L_0x0049:
                java.lang.String r5 = "isTrending"
                java.lang.String r5 = r1.getQueryParameter(r5)
                r6 = 0
                if (r5 == 0) goto L_0x0057
                int r5 = java.lang.Integer.parseInt(r5)
                goto L_0x0058
            L_0x0057:
                r5 = 0
            L_0x0058:
                java.lang.String r7 = "from"
                java.lang.String r7 = r1.getQueryParameter(r7)
                java.lang.String r8 = "previous_page"
                java.lang.String r8 = r1.getQueryParameter(r8)
                java.lang.String r9 = "enter_method"
                java.lang.String r9 = r1.getQueryParameter(r9)
                java.lang.String r10 = "is_ad"
                boolean r10 = r1.getBooleanQueryParameter(r10, r6)
                java.lang.String r11 = "item_id_list"
                java.lang.String r11 = r1.getQueryParameter(r11)
                java.lang.String r12 = "refer"
                java.lang.String r12 = r1.getQueryParameter(r12)
                java.lang.String r13 = "log_extra"
                java.lang.String r13 = r1.getQueryParameter(r13)
                org.json.JSONObject r14 = new org.json.JSONObject
                r14.<init>()
                org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ Exception -> 0x008d }
                r15.<init>(r13)     // Catch:{ Exception -> 0x008d }
                r14 = r15
            L_0x008d:
                java.util.Iterator r13 = r14.keys()
                java.util.HashMap r15 = new java.util.HashMap
                r15.<init>()
            L_0x0096:
                boolean r16 = r13.hasNext()
                if (r16 == 0) goto L_0x00c9
                java.lang.Object r16 = r13.next()
                r6 = r16
                java.lang.String r6 = (java.lang.String) r6
                r17 = r12
                java.lang.String r12 = r14.optString(r6)
                r13.remove()
                r18 = r13
                r13 = r15
                java.util.Map r13 = (java.util.Map) r13
                r19 = r14
                java.lang.String r14 = "key"
                p2628d.p2639f.p2641b.C52711k.m112236a(r6, r14)
                java.lang.String r14 = "value"
                p2628d.p2639f.p2641b.C52711k.m112236a(r12, r14)
                r13.put(r6, r12)
                r12 = r17
                r13 = r18
                r14 = r19
                r6 = 0
                goto L_0x0096
            L_0x00c9:
                r17 = r12
                java.lang.String r6 = "wordType"
                java.lang.String r6 = r1.getQueryParameter(r6)
                if (r6 == 0) goto L_0x00de
                java.lang.Integer r6 = p2628d.p2650m.C52830p.m112395c(r6)
                if (r6 == 0) goto L_0x00de
                int r6 = r6.intValue()
                goto L_0x00df
            L_0x00de:
                r6 = 0
            L_0x00df:
                com.ss.android.ugc.aweme.search.model.e r12 = new com.ss.android.ugc.aweme.search.model.e
                r12.<init>()
                r13 = r4
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                boolean r13 = android.text.TextUtils.isEmpty(r13)
                if (r13 == 0) goto L_0x00ee
                r4 = r3
            L_0x00ee:
                com.ss.android.ugc.aweme.search.model.e r4 = r12.setKeyword(r4)
                com.ss.android.ugc.aweme.search.model.e r3 = r4.setRealSearchWord(r3)
                com.ss.android.ugc.aweme.search.model.e r3 = r3.setWordType(r6)
                com.ss.android.ugc.aweme.search.model.e r3 = r3.setAd(r10)
                com.ss.android.ugc.aweme.search.model.e r3 = r3.setLogExtra(r15)
                r4 = r7
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                boolean r6 = android.text.TextUtils.isEmpty(r4)
                if (r6 == 0) goto L_0x010e
                java.lang.String r6 = "push"
                goto L_0x010f
            L_0x010e:
                r6 = r7
            L_0x010f:
                com.ss.android.ugc.aweme.search.model.e r3 = r3.setEnterFrom(r6)
                java.lang.String r6 = "back_to"
                java.lang.String r6 = r1.getQueryParameter(r6)
                r10 = r6
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                boolean r10 = android.text.TextUtils.isEmpty(r10)
                if (r10 != 0) goto L_0x012a
                java.lang.String r10 = "param"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r10)
                r3.setBackTo(r6)
            L_0x012a:
                java.lang.String r6 = "push"
                boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r6)
                if (r6 == 0) goto L_0x0136
                r6 = 7
                r3.setSearchFrom(r6)
            L_0x0136:
                r6 = 1
                if (r5 != r6) goto L_0x0140
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
                r3.setTrending(r5)
            L_0x0140:
                r5 = r8
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                boolean r5 = android.text.TextUtils.isEmpty(r5)
                if (r5 != 0) goto L_0x014c
                r3.setPreviousPage(r8)
            L_0x014c:
                r5 = r9
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                boolean r5 = android.text.TextUtils.isEmpty(r5)
                if (r5 != 0) goto L_0x0158
                r3.setEnterMethod(r9)
            L_0x0158:
                r5 = r11
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                if (r5 == 0) goto L_0x0166
                int r5 = r5.length()
                if (r5 != 0) goto L_0x0164
                goto L_0x0166
            L_0x0164:
                r5 = 0
                goto L_0x0167
            L_0x0166:
                r5 = 1
            L_0x0167:
                if (r5 != 0) goto L_0x0171
                java.lang.String r5 = "param"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
                r3.setItemIdList(r11)
            L_0x0171:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                java.lang.String r5 = "local"
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                r8 = 2
                r9 = 0
                r10 = 0
                boolean r5 = p2628d.p2650m.C52830p.m112456b(r2, r5, r10, r8, r9)
                if (r5 == 0) goto L_0x0183
                java.lang.String r12 = "homepage_fresh_topic"
                goto L_0x0185
            L_0x0183:
                r12 = r17
            L_0x0185:
                r3.setRefer(r12)
                java.lang.String r5 = "hot"
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                boolean r5 = android.text.TextUtils.equals(r2, r5)
                if (r5 != 0) goto L_0x0199
                java.lang.String r5 = "local"
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                android.text.TextUtils.equals(r2, r5)
            L_0x0199:
                java.lang.String r2 = "enter_from"
                java.lang.String r2 = r1.getQueryParameter(r2)
                if (r4 == 0) goto L_0x01aa
                int r4 = r4.length()
                if (r4 != 0) goto L_0x01a8
                goto L_0x01aa
            L_0x01a8:
                r4 = 0
                goto L_0x01ab
            L_0x01aa:
                r4 = 1
            L_0x01ab:
                if (r4 == 0) goto L_0x01c7
                r4 = r2
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                if (r4 == 0) goto L_0x01bb
                int r4 = r4.length()
                if (r4 != 0) goto L_0x01b9
                goto L_0x01bb
            L_0x01b9:
                r4 = 0
                goto L_0x01bc
            L_0x01bb:
                r4 = 1
            L_0x01bc:
                if (r4 != 0) goto L_0x01c7
                java.lang.String r4 = "param"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                r3.setEnterFrom(r2)
                goto L_0x01c8
            L_0x01c7:
                r2 = r7
            L_0x01c8:
                java.lang.String r4 = "group_id"
                java.lang.String r4 = r1.getQueryParameter(r4)
                java.lang.String r5 = "author_id"
                java.lang.String r1 = r1.getQueryParameter(r5)
                com.ss.android.ugc.aweme.search.k r5 = com.p683ss.android.ugc.aweme.search.C41431k.f105004a
                android.content.Context r0 = (android.content.Context) r0
                java.lang.String r7 = "param"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r7)
                android.content.Intent r0 = r5.makeSearchResultActivityIntent(r0, r3)
                java.lang.String r5 = "searchParam"
                java.io.Serializable r3 = (java.io.Serializable) r3
                r0.putExtra(r5, r3)
                java.lang.String r3 = "enter_from"
                r0.putExtra(r3, r2)
                r2 = r1
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                if (r2 == 0) goto L_0x01fb
                int r2 = r2.length()
                if (r2 != 0) goto L_0x01f9
                goto L_0x01fb
            L_0x01f9:
                r2 = 0
                goto L_0x01fc
            L_0x01fb:
                r2 = 1
            L_0x01fc:
                if (r2 != 0) goto L_0x0203
                java.lang.String r2 = "author_id"
                r0.putExtra(r2, r1)
            L_0x0203:
                r1 = r4
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                if (r1 == 0) goto L_0x020e
                int r1 = r1.length()
                if (r1 != 0) goto L_0x020f
            L_0x020e:
                r10 = 1
            L_0x020f:
                if (r10 != 0) goto L_0x0216
                java.lang.String r1 = "group_id"
                r0.putExtra(r1, r4)
            L_0x0216:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.app.C22835a.C22846ai.mo47673a(android.app.Activity, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.Intent");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$aj */
    public static final class C22847aj extends C22863g {
        /* renamed from: a */
        public final String mo47674a(Uri uri) {
            C52711k.m112240b(uri, "uri");
            return "prop_detail";
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) str, (Object) "stickers");
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00a6  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.Intent mo47673a(android.app.Activity r4, android.net.Uri r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9) {
            /*
                r3 = this;
                java.lang.String r0 = "activity"
                p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
                java.lang.String r0 = "uri"
                p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
                java.lang.String r0 = "host"
                p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
                java.lang.String r6 = "path"
                p2628d.p2639f.p2641b.C52711k.m112240b(r7, r6)
                java.lang.String r6 = "fromTokenType"
                p2628d.p2639f.p2641b.C52711k.m112240b(r8, r6)
                r6 = r7
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                r8 = 1
                r0 = 0
                r1 = 0
                if (r6 != 0) goto L_0x0030
                java.lang.String r6 = "/detail/"
                r2 = 2
                boolean r6 = p2628d.p2650m.C52830p.m112411b(r7, r6, r1, r2, r0)
                if (r6 == 0) goto L_0x0030
                r6 = 1
                goto L_0x0031
            L_0x0030:
                r6 = 0
            L_0x0031:
                if (r6 == 0) goto L_0x00c6
                java.lang.String r6 = r5.getLastPathSegment()
                r7 = r6
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                boolean r2 = android.text.TextUtils.isEmpty(r7)
                if (r2 != 0) goto L_0x00ae
                if (r6 != 0) goto L_0x0045
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0045:
                java.lang.String r6 = ","
                d.m.l r0 = new d.m.l
                r0.<init>(r6)
                java.util.List r6 = r0.split(r7, r1)
                boolean r7 = r6.isEmpty()
                if (r7 != 0) goto L_0x0083
                int r7 = r6.size()
                java.util.ListIterator r7 = r6.listIterator(r7)
            L_0x005e:
                boolean r0 = r7.hasPrevious()
                if (r0 == 0) goto L_0x0083
                java.lang.Object r0 = r7.previous()
                java.lang.String r0 = (java.lang.String) r0
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                int r0 = r0.length()
                if (r0 != 0) goto L_0x0074
                r0 = 1
                goto L_0x0075
            L_0x0074:
                r0 = 0
            L_0x0075:
                if (r0 != 0) goto L_0x005e
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                int r7 = r7.nextIndex()
                int r7 = r7 + r8
                java.util.List r6 = p2628d.p2629a.C52575l.m112129b(r6, r7)
                goto L_0x0087
            L_0x0083:
                java.util.List r6 = p2628d.p2629a.C52575l.m112097a()
            L_0x0087:
                java.util.Collection r6 = (java.util.Collection) r6
                java.lang.String[] r7 = new java.lang.String[r1]
                java.lang.Object[] r6 = r6.toArray(r7)
                if (r6 == 0) goto L_0x00a6
                java.lang.String[] r6 = (java.lang.String[]) r6
                int r7 = r6.length
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
                java.lang.String[] r6 = (java.lang.String[]) r6
                java.util.List r6 = java.util.Arrays.asList(r6)
                java.util.Collection r6 = (java.util.Collection) r6
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
                goto L_0x00ae
            L_0x00a6:
                d.u r4 = new d.u
                java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
                r4.<init>(r5)
                throw r4
            L_0x00ae:
                android.content.Intent r6 = new android.content.Intent
                android.content.Context r4 = (android.content.Context) r4
                java.lang.Class<com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity> r7 = com.p683ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity.class
                r6.<init>(r4, r7)
                java.lang.String r4 = "extra_stickers"
                java.io.Serializable r0 = (java.io.Serializable) r0
                r6.putExtra(r4, r0)
                com.ss.android.ugc.aweme.app.b$a r4 = com.p683ss.android.ugc.aweme.app.C23041b.f61395b
                java.lang.String r7 = "prop_detail"
                r4.mo47764a(r7, r5, r9)
                return r6
            L_0x00c6:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.app.C22835a.C22847aj.mo47673a(android.app.Activity, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.Intent");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$ak */
    public static final class C22848ak extends C22863g {

        /* renamed from: com.ss.android.ugc.aweme.app.a$ak$a */
        public static final class C22849a implements AsyncServiceLoader {

            /* renamed from: a */
            final /* synthetic */ Activity f61201a;

            C22849a(Activity activity) {
                this.f61201a = activity;
            }

            public final void onLoad(AsyncAVService asyncAVService, long j) {
                C52711k.m112240b(asyncAVService, "service");
                asyncAVService.uiService().recordService().startRecord((Context) this.f61201a, new Builder().shootWay("upload_anchor").build());
            }
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            if (!C52830p.m112406a("studio", str, true) || !C52830p.m112406a("/upload", str2, true)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final void mo47676a(Activity activity, Uri uri, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C22849a(activity));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$al */
    public static final class C22850al extends C22863g {
        /* renamed from: a */
        public final String mo47674a(Uri uri) {
            C52711k.m112240b(uri, "uri");
            return "others_homepage";
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return C52830p.m112411b(sb.toString(), "user/profile/", false, 2, null);
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            String queryParameter = uri.getQueryParameter("gd_label");
            String queryParameter2 = uri.getQueryParameter("multi_account_push_uid");
            String lastPathSegment = uri.getLastPathSegment();
            String a = C22835a.f61198c.mo47680a(lastPathSegment, uri, true);
            CharSequence charSequence = queryParameter;
            if (TextUtils.equals(charSequence, "click_push_fr")) {
                C26890h.m65011a("enter_personal_detail", C23089d.m56640a().mo47829a("enter_from", "push").mo47829a("enter_method", "click_push").mo47829a("to_user_id", lastPathSegment).f61491a);
            }
            if (TextUtils.equals(charSequence, "user_recommend")) {
                C26890h.m65011a("follow_card", C23089d.m56640a().mo47829a("enter_from", "follow_card_push").mo47829a("event_type", "enter_profile").mo47829a("rec_uid", lastPathSegment).f61491a);
                C26890h.m65011a("enter_personal_detail", C23089d.m56640a().mo47829a("enter_from", "follow_card_push").mo47829a("to_user_id", lastPathSegment).f61491a);
            }
            CharSequence charSequence2 = lastPathSegment;
            IAccountUserService a2 = C20902b.m53242a();
            C52711k.m112236a((Object) a2, "AccountUserProxyService.get()");
            if (TextUtils.equals(charSequence2, a2.getCurUserId())) {
                C23041b.f61395b.mo47764a("personal_homepage", uri, z);
            } else {
                C23041b.f61395b.mo47764a("others_homepage", uri, z);
            }
            Intent intent = new Intent(activity, UserProfileActivity.class);
            String queryParameter3 = uri.getQueryParameter("from");
            intent.putExtra("uid", lastPathSegment);
            intent.putExtra("sec_user_id", a);
            intent.putExtra("type", uri.getQueryParameter("type"));
            intent.putExtra("source_aid", uri.getQueryParameter("source_aid"));
            intent.putExtra("from_micro_app", queryParameter3);
            IAccountUserService a3 = C20902b.m53242a();
            C52711k.m112236a((Object) a3, "AccountUserProxyService.get()");
            if (a3.isLogin() || !C52711k.m112239a((Object) "click_push_follow_approve", (Object) queryParameter)) {
                return intent;
            }
            return C23035a.m56552a(activity, intent, queryParameter2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$am */
    public static final class C22851am extends C22863g {
        /* renamed from: a */
        public final String mo47674a(Uri uri) {
            C52711k.m112240b(uri, "uri");
            return "others_homepage";
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            if (C52711k.m112239a((Object) sb.toString(), (Object) "user/profile") || C52711k.m112239a((Object) str, (Object) "profile")) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            String queryParameter = uri.getQueryParameter("id");
            if (queryParameter == null) {
                queryParameter = uri.getQueryParameter("uid");
            }
            String queryParameter2 = uri.getQueryParameter("unique_id");
            String a = C22835a.f61198c.mo47680a(queryParameter, uri, true);
            Intent intent = new Intent(activity, UserProfileActivity.class);
            intent.putExtra("uid", queryParameter);
            intent.putExtra("sec_user_id", a);
            intent.putExtra("unique_id", queryParameter2);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$an */
    public static final class C22852an extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) str, (Object) "verify");
        }

        /* renamed from: a */
        public final void mo47676a(Activity activity, Uri uri, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C47718bf.m103288a(new C24476a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$ao */
    public static final class C22853ao extends C22863g {
        /* renamed from: a */
        public final String mo47674a(Uri uri) {
            C52711k.m112240b(uri, "uri");
            return C22858c.f61208d;
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return C52711k.m112239a((Object) sb.toString(), (Object) "user/video");
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            Intent intent = new Intent(activity, DetailActivity.class);
            intent.putExtra("enter_from", "push");
            intent.putExtra("refer", "push");
            intent.putExtra("id", uri.getQueryParameter("id"));
            intent.putExtra("cid", uri.getQueryParameter("commentId"));
            C23041b.f61395b.mo47764a(C22858c.f61208d, uri, z);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$ap */
    public static final class C22854ap extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52830p.m112411b(str, "wallet_index", false, 2, null);
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            return SmartRouter.buildRoute((Context) activity, uri.buildUpon().scheme("aweme").build().toString()).buildIntent();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$aq */
    public static final class C22855aq extends C22863g {

        /* renamed from: a */
        private final int f61202a = 3;

        /* renamed from: b */
        private final long f61203b = -1;

        /* renamed from: c */
        private boolean f61204c;

        /* renamed from: a */
        public final String mo47674a(Uri uri) {
            C52711k.m112240b(uri, "uri");
            return CustomActionPushReceiver.f104061f;
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            if (C52711k.m112239a((Object) str, (Object) "sign") || C52711k.m112239a((Object) str, (Object) "webcast_room") || C52711k.m112239a((Object) str, (Object) "webcast_profile") || C52711k.m112239a((Object) str, (Object) "webcast_webview") || C52711k.m112239a((Object) str, (Object) "webcast_feed")) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: type inference failed for: r1v1 */
        /* JADX WARNING: type inference failed for: r1v2, types: [com.ss.android.ugc.aweme.live.d] */
        /* JADX WARNING: type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.live.d] */
        /* JADX WARNING: type inference failed for: r1v14, types: [java.lang.String] */
        /* JADX WARNING: type inference failed for: r1v20, types: [java.lang.String] */
        /* JADX WARNING: type inference failed for: r1v21 */
        /* JADX WARNING: type inference failed for: r1v22 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v1
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.lang.String, com.ss.android.ugc.aweme.live.d]
          uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], com.ss.android.ugc.aweme.live.d, java.lang.String]
          mth insns count: 179
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo47676a(android.app.Activity r6, android.net.Uri r7, boolean r8) {
            /*
                r5 = this;
                java.lang.String r0 = "activity"
                p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
                java.lang.String r0 = "uri"
                p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
                java.lang.String r0 = r7.getHost()
                java.lang.String r1 = "webcast_feed"
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                r1 = 0
                if (r0 == 0) goto L_0x018e
                java.util.HashMap r8 = new java.util.HashMap
                r8.<init>()
                java.util.Set r0 = r7.getQueryParameterNames()
                if (r0 == 0) goto L_0x003a
                java.util.Iterator r0 = r0.iterator()
            L_0x0026:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x003a
                java.lang.Object r2 = r0.next()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r3 = r7.getQueryParameter(r2)
                r8.put(r2, r3)
                goto L_0x0026
            L_0x003a:
                r7 = r8
                java.util.Map r7 = (java.util.Map) r7     // Catch:{ Exception -> 0x017b }
                java.lang.String r0 = "gd_label"
                r7.containsKey(r0)     // Catch:{ Exception -> 0x017b }
                com.ss.android.ugc.aweme.live.ILiveOuterService r7 = com.p683ss.android.ugc.aweme.live.C36173w.m81665a()     // Catch:{ Exception -> 0x017b }
                java.lang.String r0 = "ServiceManager.get().get…OuterService::class.java)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)     // Catch:{ Exception -> 0x017b }
                com.ss.android.ugc.aweme.live.ILiveOuterService r7 = (com.p683ss.android.ugc.aweme.live.ILiveOuterService) r7     // Catch:{ Exception -> 0x017b }
                com.ss.android.ugc.aweme.live.f r7 = r7.getLiveInitService()     // Catch:{ Exception -> 0x017b }
                boolean r7 = r7.mo74819b()     // Catch:{ Exception -> 0x017b }
                r0 = 1
                r2 = 0
                if (r7 != 0) goto L_0x005b
                goto L_0x00eb
            L_0x005b:
                com.bytedance.android.livesdkapi.service.d r7 = com.bytedance.android.livesdkapi.C8830k.m17331e()     // Catch:{ Exception -> 0x017b }
                if (r7 == 0) goto L_0x00e4
                com.bytedance.android.livesdkapi.service.d r7 = com.bytedance.android.livesdkapi.C8830k.m17331e()     // Catch:{ Exception -> 0x017b }
                com.bytedance.android.livesdkapi.host.b r7 = r7.mo13055q()     // Catch:{ Exception -> 0x017b }
                if (r7 != 0) goto L_0x006d
                goto L_0x00e4
            L_0x006d:
                com.bytedance.android.livesdkapi.service.d r7 = com.bytedance.android.livesdkapi.C8830k.m17331e()     // Catch:{ Exception -> 0x017b }
                com.bytedance.android.livesdkapi.host.b r7 = r7.mo13055q()     // Catch:{ Exception -> 0x017b }
                long r3 = r5.f61203b     // Catch:{ Exception -> 0x017b }
                java.util.Map r7 = r7.mo13238a(r3)     // Catch:{ Exception -> 0x017b }
                if (r7 != 0) goto L_0x007f
                goto L_0x00eb
            L_0x007f:
                java.lang.String r3 = "feed_url"
                java.lang.Object r3 = r7.get(r3)     // Catch:{ Exception -> 0x017b }
                boolean r3 = r3 instanceof java.lang.String     // Catch:{ Exception -> 0x017b }
                if (r3 == 0) goto L_0x009c
                java.lang.String r1 = "feed_url"
                java.lang.Object r1 = r7.get(r1)     // Catch:{ Exception -> 0x017b }
                if (r1 == 0) goto L_0x0094
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x017b }
                goto L_0x009c
            L_0x0094:
                d.u r7 = new d.u     // Catch:{ Exception -> 0x017b }
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
                r7.<init>(r0)     // Catch:{ Exception -> 0x017b }
                throw r7     // Catch:{ Exception -> 0x017b }
            L_0x009c:
                java.lang.String r3 = "feed_style"
                java.lang.Object r3 = r7.get(r3)     // Catch:{ Exception -> 0x017b }
                boolean r3 = r3 instanceof java.lang.Integer     // Catch:{ Exception -> 0x017b }
                if (r3 == 0) goto L_0x00bd
                java.lang.String r3 = "feed_style"
                java.lang.Object r7 = r7.get(r3)     // Catch:{ Exception -> 0x017b }
                if (r7 == 0) goto L_0x00b5
                java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Exception -> 0x017b }
                int r7 = r7.intValue()     // Catch:{ Exception -> 0x017b }
                goto L_0x00be
            L_0x00b5:
                d.u r7 = new d.u     // Catch:{ Exception -> 0x017b }
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
                r7.<init>(r0)     // Catch:{ Exception -> 0x017b }
                throw r7     // Catch:{ Exception -> 0x017b }
            L_0x00bd:
                r7 = 0
            L_0x00be:
                boolean r1 = com.bytedance.common.utility.C9431p.m18664a(r1)     // Catch:{ Exception -> 0x017b }
                if (r1 != 0) goto L_0x00eb
                int r1 = r5.f61202a     // Catch:{ Exception -> 0x017b }
                if (r7 == r1) goto L_0x00c9
                goto L_0x00eb
            L_0x00c9:
                com.bytedance.android.livesdkapi.service.e r7 = com.bytedance.android.livesdkapi.C8830k.m17330d()     // Catch:{ Exception -> 0x017b }
                if (r7 == 0) goto L_0x00eb
                com.bytedance.android.livesdkapi.service.e r7 = com.bytedance.android.livesdkapi.C8830k.m17330d()     // Catch:{ Exception -> 0x017b }
                if (r7 != 0) goto L_0x00d8
                p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x017b }
            L_0x00d8:
                java.lang.String r1 = "TTLiveSDK.getLiveService()!!"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r1)     // Catch:{ Exception -> 0x017b }
                com.bytedance.android.livesdkapi.depend.live.q r7 = r7.mo15058k()     // Catch:{ Exception -> 0x017b }
                if (r7 != 0) goto L_0x00ea
                goto L_0x00eb
            L_0x00e4:
                boolean r7 = r5.f61204c     // Catch:{ Exception -> 0x017b }
                if (r7 != 0) goto L_0x00eb
                r5.f61204c = r0     // Catch:{ Exception -> 0x017b }
            L_0x00ea:
                r2 = 1
            L_0x00eb:
                if (r2 == 0) goto L_0x017b
                java.lang.String r7 = "gd_label"
                java.lang.Object r7 = r8.get(r7)     // Catch:{ Exception -> 0x017b }
                java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x017b }
                java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x017b }
                r0.<init>()     // Catch:{ Exception -> 0x017b }
                r1 = r0
                java.util.Map r1 = (java.util.Map) r1     // Catch:{ Exception -> 0x017b }
                java.lang.String r2 = "enter_from_merge"
                java.lang.String r3 = "inner_ad"
                r1.put(r2, r3)     // Catch:{ Exception -> 0x017b }
                r1 = r0
                java.util.Map r1 = (java.util.Map) r1     // Catch:{ Exception -> 0x017b }
                java.lang.String r2 = "_param_live_platform"
                java.lang.String r3 = "live"
                r1.put(r2, r3)     // Catch:{ Exception -> 0x017b }
                if (r7 == 0) goto L_0x0118
                r1 = r0
                java.util.Map r1 = (java.util.Map) r1     // Catch:{ Exception -> 0x017b }
                java.lang.String r2 = "gd_label"
                r1.put(r2, r7)     // Catch:{ Exception -> 0x017b }
            L_0x0118:
                java.lang.String r7 = "livesdk_enter_live_merge"
                java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x017b }
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r7, r0)     // Catch:{ Exception -> 0x017b }
                com.bytedance.android.livesdkapi.service.e r7 = com.bytedance.android.livesdkapi.C8830k.m17330d()     // Catch:{ Exception -> 0x017b }
                if (r7 == 0) goto L_0x017a
                com.bytedance.android.livesdkapi.service.e r7 = com.bytedance.android.livesdkapi.C8830k.m17330d()     // Catch:{ Exception -> 0x017b }
                if (r7 != 0) goto L_0x012e
                p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x017b }
            L_0x012e:
                java.lang.String r0 = "TTLiveSDK.getLiveService()!!"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)     // Catch:{ Exception -> 0x017b }
                com.bytedance.android.livesdkapi.depend.live.q r7 = r7.mo15058k()     // Catch:{ Exception -> 0x017b }
                if (r7 == 0) goto L_0x017a
                java.util.HashMap r7 = new java.util.HashMap     // Catch:{ Exception -> 0x017b }
                r7.<init>()     // Catch:{ Exception -> 0x017b }
                java.lang.String r0 = "intercept"
                java.lang.String r1 = "new_style"
                r7.put(r0, r1)     // Catch:{ Exception -> 0x017b }
                java.lang.String r0 = "gd_label"
                java.lang.Object r0 = r8.get(r0)     // Catch:{ Exception -> 0x017b }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x017b }
                if (r0 == 0) goto L_0x0154
                java.lang.String r1 = "gd_label"
                r7.put(r1, r0)     // Catch:{ Exception -> 0x017b }
            L_0x0154:
                java.lang.String r0 = "enter_from_merge"
                java.lang.Object r0 = r8.get(r0)     // Catch:{ Exception -> 0x017b }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x017b }
                if (r0 == 0) goto L_0x0163
                java.lang.String r1 = "enter_from_merge"
                r7.put(r1, r0)     // Catch:{ Exception -> 0x017b }
            L_0x0163:
                com.bytedance.android.livesdkapi.service.e r0 = com.bytedance.android.livesdkapi.C8830k.m17330d()     // Catch:{ Exception -> 0x017b }
                if (r0 != 0) goto L_0x016c
                p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x017b }
            L_0x016c:
                java.lang.String r1 = "TTLiveSDK.getLiveService()!!"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)     // Catch:{ Exception -> 0x017b }
                com.bytedance.android.livesdkapi.depend.live.q r0 = r0.mo15058k()     // Catch:{ Exception -> 0x017b }
                java.util.Map r7 = (java.util.Map) r7     // Catch:{ Exception -> 0x017b }
                r0.mo10302a(r7)     // Catch:{ Exception -> 0x017b }
            L_0x017a:
                return
            L_0x017b:
                com.ss.android.ugc.aweme.live.ILiveOuterService r7 = com.p683ss.android.ugc.aweme.live.C36173w.m81665a()
                java.lang.String r0 = "ServiceManager.get().get…OuterService::class.java)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
                com.ss.android.ugc.aweme.live.ILiveOuterService r7 = (com.p683ss.android.ugc.aweme.live.ILiveOuterService) r7
                com.ss.android.ugc.aweme.live.d r7 = r7.getLive()
                r7.mo74829a(r6, r8)
                return
            L_0x018e:
                java.lang.String r0 = r7.toString()     // Catch:{ Throwable -> 0x01af }
                android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Throwable -> 0x01af }
                android.net.Uri$Builder r0 = r0.buildUpon()     // Catch:{ Throwable -> 0x01af }
                java.lang.String r2 = "is_from_push"
                java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Throwable -> 0x01af }
                android.net.Uri$Builder r8 = r0.appendQueryParameter(r2, r8)     // Catch:{ Throwable -> 0x01af }
                android.net.Uri r8 = r8.build()     // Catch:{ Throwable -> 0x01af }
                java.lang.String r0 = "Uri.parse(uri.toString()…ation.toString()).build()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)     // Catch:{ Throwable -> 0x01af }
                r7 = r8
                goto L_0x01b3
            L_0x01af:
                r8 = move-exception
                com.bytedance.p502b.p503a.p506b.p508b.C9220a.m18311a(r8)
            L_0x01b3:
                com.ss.android.ugc.aweme.live.ILiveOuterService r8 = com.p683ss.android.ugc.aweme.live.C36173w.m81665a()     // Catch:{ Throwable -> 0x01ca }
                com.ss.android.ugc.aweme.live.ILiveOuterService r8 = (com.p683ss.android.ugc.aweme.live.ILiveOuterService) r8     // Catch:{ Throwable -> 0x01ca }
                if (r8 == 0) goto L_0x01bf
                com.ss.android.ugc.aweme.live.d r1 = r8.getLive()     // Catch:{ Throwable -> 0x01ca }
            L_0x01bf:
                if (r1 != 0) goto L_0x01c4
                p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Throwable -> 0x01ca }
            L_0x01c4:
                android.content.Context r6 = (android.content.Context) r6     // Catch:{ Throwable -> 0x01ca }
                r1.mo15045a(r6, r7)     // Catch:{ Throwable -> 0x01ca }
                return
            L_0x01ca:
                r6 = move-exception
                com.bytedance.p502b.p503a.p506b.p508b.C9220a.m18311a(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.app.C22835a.C22855aq.mo47676a(android.app.Activity, android.net.Uri, boolean):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$ar */
    public static final class C22856ar extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) str, (Object) C23060d.f61427a);
        }

        /* renamed from: a */
        public final void mo47676a(Activity activity, Uri uri, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            if (!I18nBridgeService.getBridgeService_Monster().tryOpenPolarisPage(activity, uri.toString()) && !TextUtils.isEmpty(uri.getQueryParameter("rn_schema"))) {
                String uri2 = uri.toString();
                C52711k.m112236a((Object) uri2, "uri.toString()");
                String uri3 = C37382g.m83707a(C52830p.m112401a(uri2, C23057c.f61426d.mo47787b(), "aweme", false, 4, (Object) null)).mo76658a().toString();
                C52711k.m112236a((Object) uri3, "RnSchemeHelper.parseRnSc…mpUrl).build().toString()");
                C41302w.m91042a().mo83861a(uri3);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0077  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.Intent mo47673a(android.app.Activity r3, android.net.Uri r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8) {
            /*
                r2 = this;
                java.lang.String r0 = "activity"
                p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
                java.lang.String r0 = "uri"
                p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
                java.lang.String r0 = "host"
                p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
                java.lang.String r5 = "path"
                p2628d.p2639f.p2641b.C52711k.m112240b(r6, r5)
                java.lang.String r5 = "fromTokenType"
                p2628d.p2639f.p2641b.C52711k.m112240b(r7, r5)
                com.ss.android.ugc.aweme.bridgeservice.IBridgeService r5 = com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService.getBridgeService_Monster()
                com.ss.android.ugc.aweme.bridgeservice.IBridgeService r5 = (com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService) r5
                java.lang.String r6 = r4.toString()
                boolean r5 = r5.judgeIsPolarisUrl(r6)
                r6 = 0
                if (r5 == 0) goto L_0x002b
                return r6
            L_0x002b:
                java.lang.String r5 = "rn_schema"
                java.lang.String r5 = r4.getQueryParameter(r5)
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                boolean r5 = android.text.TextUtils.isEmpty(r5)
                if (r5 != 0) goto L_0x003a
                return r6
            L_0x003a:
                android.content.Context r3 = (android.content.Context) r3
                r5 = r8 ^ 1
                android.content.Intent r3 = com.p683ss.android.ugc.aweme.app.C23060d.C23061a.m56597a(r3, r4, r5)
                if (r8 == 0) goto L_0x007e
                if (r4 == 0) goto L_0x004d
                java.lang.String r5 = "url"
                java.lang.String r5 = r4.getQueryParameter(r5)
                goto L_0x004e
            L_0x004d:
                r5 = r6
            L_0x004e:
                r7 = 0
                if (r5 == 0) goto L_0x006b
                java.lang.String r5 = "url"
                java.lang.String r5 = r4.getQueryParameter(r5)
                if (r5 != 0) goto L_0x005c
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x005c:
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                java.lang.String r0 = "referral"
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r1 = 2
                boolean r5 = p2628d.p2650m.C52830p.m112456b(r5, r0, r7, r1, r6)
                if (r5 == 0) goto L_0x006b
                r5 = 1
                goto L_0x006c
            L_0x006b:
                r5 = 0
            L_0x006c:
                if (r5 != 0) goto L_0x0075
                if (r3 == 0) goto L_0x0075
                java.lang.String r5 = "hide_more"
                r3.putExtra(r5, r7)
            L_0x0075:
                if (r3 == 0) goto L_0x007e
                java.lang.String r5 = "enter_from"
                java.lang.String r6 = "notification"
                r3.putExtra(r5, r6)
            L_0x007e:
                com.ss.android.ugc.aweme.app.b$a r5 = com.p683ss.android.ugc.aweme.app.C23041b.f61395b
                java.lang.String r6 = "h5"
                r5.mo47764a(r6, r4, r8)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.app.C22835a.C22856ar.mo47673a(android.app.Activity, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.Intent");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$b */
    public static final class C22857b extends C22863g {
        /* renamed from: a */
        public final boolean mo47678a(String str, String str2, String str3) {
            C52711k.m112240b(str, "scheme");
            C52711k.m112240b(str2, "host");
            C52711k.m112240b(str3, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) str2, (Object) "anywhere");
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            return SmartRouter.buildRoute((Context) activity, uri.toString()).buildIntent();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$c */
    public static final class C22858c extends C22863g {

        /* renamed from: a */
        public static final String f61205a = f61205a;

        /* renamed from: b */
        public static final String f61206b = f61206b;

        /* renamed from: c */
        public static final String f61207c = f61207c;

        /* renamed from: d */
        public static final String f61208d = f61208d;

        /* renamed from: e */
        public static final String f61209e = f61209e;

        /* renamed from: f */
        public static final C22859a f61210f = new C22859a(null);

        /* renamed from: com.ss.android.ugc.aweme.app.a$c$a */
        public static final class C22859a {
            private C22859a() {
            }

            public /* synthetic */ C22859a(C52707g gVar) {
                this();
            }
        }

        /* renamed from: a */
        private static Intent m56278a(Activity activity) {
            C52711k.m112240b(activity, "activity");
            Intent a = C47659c.m103160a(activity);
            a.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            a.putExtra("tab", 1);
            return a;
        }

        /* renamed from: a */
        private static Intent m56279a(Activity activity, Uri uri) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            Intent intent = new Intent(activity, DetailActivity.class);
            intent.putExtra("from_adsapp_activity", true);
            intent.putExtra("from_uid", uri.getQueryParameter("from_uid"));
            return intent;
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return C52711k.m112239a((Object) sb.toString(), (Object) "aweme/push_detail");
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            Intent intent;
            String str4;
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            JSONObject jSONObject = new JSONObject();
            C23137q a = C23137q.m56698a();
            C52711k.m112236a((Object) a, "AwemeRuntime.inst()");
            if (a.mo47855c()) {
                if (TextUtils.equals(uri.getQueryParameter(f61205a), f61207c)) {
                    intent = m56278a(activity);
                } else {
                    intent = m56279a(activity, uri);
                }
            } else if (TextUtils.equals(uri.getQueryParameter(f61206b), f61207c)) {
                intent = m56278a(activity);
            } else {
                intent = m56279a(activity, uri);
            }
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str3, "fromTokenType");
            if (intent != null) {
                String queryParameter = uri.getQueryParameter(f61209e);
                if (!TextUtils.isEmpty(queryParameter)) {
                    intent.putExtra("ids", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("from");
                CharSequence charSequence = queryParameter2;
                if (!TextUtils.isEmpty(charSequence)) {
                    intent.putExtra("from_micro_app", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("label");
                if (TextUtils.isEmpty(queryParameter3)) {
                    queryParameter3 = "web";
                }
                if (!TextUtils.isEmpty(str3)) {
                    queryParameter3 = str3;
                }
                if (!TextUtils.isEmpty(charSequence)) {
                    queryParameter3 = "mp_page";
                }
                intent.putExtra("refer", queryParameter3);
                intent.putExtra("gd_label", uri.getQueryParameter("gd_label"));
                String queryParameter4 = uri.getQueryParameter("push_params");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    intent.putExtra("push_params", queryParameter4);
                }
                if (TextUtils.equals(uri.getQueryParameter(f61206b), "nearby_detail")) {
                    C23137q a2 = C23137q.m56698a();
                    C52711k.m112236a((Object) a2, "AwemeRuntime.inst()");
                    if (!a2.mo47855c()) {
                        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NEARBY");
                    }
                }
            }
            String str5 = "is_cold_launch";
            try {
                C23137q a3 = C23137q.m56698a();
                C52711k.m112236a((Object) a3, "AwemeRuntime.inst()");
                jSONObject.put(str5, a3.mo47855c() ^ true ? 1 : 0);
                String str6 = "landing_page";
                C23137q a4 = C23137q.m56698a();
                C52711k.m112236a((Object) a4, "AwemeRuntime.inst()");
                if (a4.mo47855c()) {
                    str4 = f61205a;
                } else {
                    str4 = f61206b;
                }
                jSONObject.put(str6, uri.getQueryParameter(str4));
                String str7 = "rule_id";
                String queryParameter5 = uri.getQueryParameter("push_id");
                if (queryParameter5 == null) {
                    queryParameter5 = "";
                }
                jSONObject.put(str7, queryParameter5);
                String str8 = "group_id";
                String queryParameter6 = uri.getQueryParameter(f61209e);
                if (queryParameter6 == null) {
                    queryParameter6 = "";
                }
                jSONObject.put(str8, queryParameter6);
                Activity[] activityStack = ActivityStack.getActivityStack();
                if (activityStack == null || activityStack.length <= 1) {
                    jSONObject.put("last_page_path", "");
                } else {
                    jSONObject.put("last_page_path", activityStack[activityStack.length - 1].getClass().getSimpleName());
                }
                String str9 = "push_label";
                String queryParameter7 = uri.getQueryParameter("gd_label");
                if (queryParameter7 == null) {
                    queryParameter7 = "";
                }
                jSONObject.put(str9, queryParameter7);
                C26890h.m65012a("hot_search_video_push", jSONObject);
            } catch (Exception unused) {
            }
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$d */
    public static final class C22860d extends C22863g {
        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            return null;
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            if (C52711k.m112239a((Object) str, (Object) "mobile") || C52711k.m112239a((Object) str, (Object) "bind_phone")) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo47676a(Activity activity, Uri uri, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C20854a.m53165e().bindMobile(activity, "scheme", null, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$e */
    public static final class C22861e extends C22863g {
        /* renamed from: a */
        public final String mo47674a(Uri uri) {
            C52711k.m112240b(uri, "uri");
            return "challenge_detail";
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) str, (Object) "challenge");
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00a3  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00a8  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.Intent mo47673a(android.app.Activity r9, android.net.Uri r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, boolean r14) {
            /*
                r8 = this;
                java.lang.String r0 = "activity"
                p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
                java.lang.String r0 = "uri"
                p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
                java.lang.String r0 = "host"
                p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
                java.lang.String r11 = "path"
                p2628d.p2639f.p2641b.C52711k.m112240b(r12, r11)
                java.lang.String r11 = "fromTokenType"
                p2628d.p2639f.p2641b.C52711k.m112240b(r13, r11)
                java.lang.String r11 = "is_commerce"
                java.lang.String r11 = r10.getQueryParameter(r11)
                java.lang.String r0 = "show_tab"
                java.lang.String r0 = r10.getQueryParameter(r0)
                r1 = 0
                if (r0 == 0) goto L_0x0033
                java.lang.Integer r0 = p2628d.p2650m.C52830p.m112395c(r0)
                if (r0 == 0) goto L_0x0033
                int r0 = r0.intValue()
                goto L_0x0034
            L_0x0033:
                r0 = 0
            L_0x0034:
                r2 = 1
                int r0 = r0 - r2
                java.lang.String r3 = "enter_from"
                java.lang.String r3 = r10.getQueryParameter(r3)
                java.lang.String r4 = "extra_challenge_from"
                java.lang.String r4 = r10.getQueryParameter(r4)
                r5 = r11
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                java.lang.String r6 = "1"
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                boolean r5 = android.text.TextUtils.equals(r5, r6)
                if (r5 != 0) goto L_0x0057
                java.lang.String r5 = "true"
                boolean r11 = p2628d.p2650m.C52830p.m112406a(r5, r11, r2)
                if (r11 == 0) goto L_0x0060
            L_0x0057:
                java.lang.String r11 = "id"
                java.lang.String r11 = r10.getQueryParameter(r11)
                com.p683ss.android.ugc.aweme.commercialize.utils.C26403au.m63864a(r11)
            L_0x0060:
                java.lang.String r11 = "group"
                java.lang.String r11 = r10.getQueryParameter(r11)
                r5 = r12
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                boolean r5 = android.text.TextUtils.isEmpty(r5)
                r6 = 0
                if (r5 != 0) goto L_0x007a
                java.lang.String r5 = "/detail/"
                r7 = 2
                boolean r12 = p2628d.p2650m.C52830p.m112411b(r12, r5, r1, r7, r6)
                if (r12 == 0) goto L_0x007a
                r1 = 1
            L_0x007a:
                java.lang.String r12 = "0"
                boolean r11 = p2628d.p2639f.p2641b.C52711k.m112239a(r12, r11)
                if (r11 != 0) goto L_0x0086
                if (r1 == 0) goto L_0x0085
                goto L_0x0086
            L_0x0085:
                return r6
            L_0x0086:
                if (r1 == 0) goto L_0x008d
                java.lang.String r11 = r10.getLastPathSegment()
                goto L_0x0093
            L_0x008d:
                java.lang.String r11 = "id"
                java.lang.String r11 = r10.getQueryParameter(r11)
            L_0x0093:
                com.p683ss.android.ugc.aweme.commercialize.utils.C26403au.m63861a(r10, r11)
                android.content.Intent r12 = new android.content.Intent
                android.content.Context r9 = (android.content.Context) r9
                java.lang.Class<com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity> r5 = com.p683ss.android.ugc.aweme.challenge.p1500ui.ChallengeDetailActivity.class
                r12.<init>(r9, r5)
                java.lang.String r9 = "id"
                if (r1 == 0) goto L_0x00a8
                java.lang.String r1 = r10.getLastPathSegment()
                goto L_0x00ae
            L_0x00a8:
                java.lang.String r1 = "id"
                java.lang.String r1 = r10.getQueryParameter(r1)
            L_0x00ae:
                r12.putExtra(r9, r1)
                java.lang.String r9 = "from_token"
                r12.putExtra(r9, r13)
                java.lang.String r9 = "show_tab_index"
                r12.putExtra(r9, r0)
                java.lang.String r9 = "enter_from"
                r12.putExtra(r9, r3)
                java.lang.String r9 = "extra_challenge_from"
                r12.putExtra(r9, r4)
                java.lang.String r9 = "cid"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r9)     // Catch:{ NumberFormatException -> 0x00ce }
                java.lang.Long.parseLong(r11)     // Catch:{ NumberFormatException -> 0x00ce }
                goto L_0x00d3
            L_0x00ce:
                java.lang.String r9 = "extra_challenge_is_hashtag"
                r12.putExtra(r9, r2)
            L_0x00d3:
                com.ss.android.ugc.aweme.app.b$a r9 = com.p683ss.android.ugc.aweme.app.C23041b.f61395b
                java.lang.String r11 = "challenge_detail"
                r9.mo47764a(r11, r10, r14)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.app.C22835a.C22861e.mo47673a(android.app.Activity, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.Intent");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$f */
    public static final class C22862f extends C22863g {
        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            return null;
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) str, (Object) "change_phone");
        }

        /* renamed from: a */
        public final void mo47676a(Activity activity, Uri uri, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C20854a.m53165e().modifyMobile(activity, "scheme", null, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$g */
    public static abstract class C22863g {
        /* renamed from: a */
        public Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            return null;
        }

        /* renamed from: a */
        public String mo47677a() {
            return null;
        }

        /* renamed from: a */
        public void mo47676a(Activity activity, Uri uri, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
        }

        /* renamed from: a */
        public boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return false;
        }

        /* renamed from: a */
        public String mo47674a(Uri uri) {
            C52711k.m112240b(uri, "uri");
            if (TextUtils.isEmpty(uri.getHost())) {
                return "homepage_hot";
            }
            String host = uri.getHost();
            C52711k.m112236a((Object) host, "uri.host");
            return host;
        }

        /* renamed from: a */
        public boolean mo47678a(String str, String str2, String str3) {
            C52711k.m112240b(str, "scheme");
            C52711k.m112240b(str2, "host");
            C52711k.m112240b(str3, LeakCanaryFileProvider.f132050j);
            return mo47675a(str2, str3);
        }

        /* renamed from: a */
        public Intent mo47679a(Activity activity, Uri uri, String str, String str2, String str3, boolean z, boolean z2) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            return mo47673a(activity, uri, str, str2, str3, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$h */
    public static final class C22864h {
        private C22864h() {
        }

        /* renamed from: a */
        private static long m56298a() {
            return C22835a.f61197b;
        }

        public /* synthetic */ C22864h(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m56300a(Uri uri, Intent intent, boolean z) {
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(intent, "intent");
            try {
                int parseInt = Integer.parseInt(uri.getQueryParameter("tab"));
                intent.putExtra("tab", parseInt);
                if (parseInt == 1) {
                    C23041b.f61395b.mo47764a("discovery", uri, z);
                    return;
                }
                if (parseInt == 5) {
                    C23041b.f61395b.mo47764a("follow", uri, z);
                }
            } catch (Exception unused) {
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
            if (r9 == null) goto L_0x0034;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo47680a(java.lang.String r8, android.net.Uri r9, boolean r10) {
            /*
                r7 = this;
                if (r9 == 0) goto L_0x0009
                java.lang.String r0 = com.p683ss.android.ugc.aweme.app.C22835a.f61196a
                java.lang.String r0 = r9.getQueryParameter(r0)
                goto L_0x000a
            L_0x0009:
                r0 = 0
            L_0x000a:
                r1 = r8
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L_0x0023
                r1 = r0
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L_0x0023
                com.ss.android.ugc.aweme.utils.ew r1 = com.p683ss.android.ugc.aweme.utils.C47865ew.m103536a()
                r1.mo95077a(r8, r0)
            L_0x0023:
                if (r10 == 0) goto L_0x0040
                com.ss.android.ugc.aweme.utils.ew r1 = com.p683ss.android.ugc.aweme.utils.C47865ew.m103536a()
                if (r9 == 0) goto L_0x0034
                java.lang.String r9 = r9.toString()
                if (r9 != 0) goto L_0x0032
                goto L_0x0034
            L_0x0032:
                r2 = r9
                goto L_0x0037
            L_0x0034:
                java.lang.String r9 = ""
                goto L_0x0032
            L_0x0037:
                long r5 = m56298a()
                r3 = r8
                r4 = r0
                r1.mo95078a(r2, r3, r4, r5)
            L_0x0040:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.app.C22835a.C22864h.mo47680a(java.lang.String, android.net.Uri, boolean):java.lang.String");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$i */
    public static final class C22865i extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            if (C52711k.m112239a((Object) sb.toString(), (Object) "user/addressbook/list") || C52711k.m112239a((Object) str, (Object) "friendRecommend") || C52711k.m112239a((Object) str, (Object) "newFriendRecommend")) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            return ContactsActivity.m75414a(activity, null, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$j */
    public static final class C22866j extends C22863g {

        /* renamed from: a */
        private final String f61211a = "click_push_videoat";

        /* renamed from: b */
        private final String f61212b = "follow_card_push_publish";

        /* renamed from: a */
        public final String mo47674a(Uri uri) {
            C52711k.m112240b(uri, "uri");
            return C22858c.f61208d;
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            if (!C52830p.m112411b(sb.toString(), "aweme/detail/", false, 2, null)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(str2);
                if (!C52830p.m112411b(sb2.toString(), "tuwen/detail/", false, 2, null)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            Intent intent;
            boolean z2;
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            String queryParameter = uri.getQueryParameter("gd_label");
            String queryParameter2 = uri.getQueryParameter("commentId");
            if (!TextUtils.isEmpty(queryParameter2)) {
                Intent intent2 = new Intent(activity, DetailActivity.class);
                intent2.putExtra("enter_from", "push");
                intent2.putExtra("refer", "push");
                intent2.putExtra("id", uri.getLastPathSegment());
                intent2.putExtra("cid", queryParameter2);
                C23041b.f61395b.mo47764a(C22858c.f61208d, uri, z);
                return intent2;
            }
            int i = 0;
            if (!C10181b.m20511a().mo18172a(PushLandingFollowExperiment.class, true, "post_push_landing_following", 31744, false) || !activity.isTaskRoot() || !TextUtils.equals(queryParameter, "click_push_newvideo")) {
                Context context = activity;
                Intent intent3 = new Intent(context, DetailActivity.class);
                String queryParameter3 = uri.getQueryParameter("label");
                String queryParameter4 = uri.getQueryParameter("from");
                if (TextUtils.isEmpty(queryParameter3)) {
                    queryParameter3 = "web";
                }
                intent3.putExtra("refer", queryParameter3);
                intent3.putExtra("id", uri.getLastPathSegment());
                CharSequence queryParameter5 = uri.getQueryParameter("is_friend");
                if (TextUtils.isEmpty(queryParameter5) || !TextUtils.equals("1", queryParameter5)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2 && z && (!C52711k.m112239a((Object) "tuwen", (Object) str))) {
                    C23111k a = C23111k.m56679a();
                    C52711k.m112236a((Object) a, "AppLifeCircleCacheManager.getInstance()");
                    if (a.f61536a || activity.isTaskRoot()) {
                        intent = C47659c.m103160a(context);
                        C52711k.m112236a((Object) intent, "StartMainActivityUtils.g…nActivityIntent(activity)");
                        intent.putExtra("id", uri.getLastPathSegment());
                        intent.putExtra("extra_story_is_friend", 0);
                    }
                }
                intent = new Intent(context, DetailActivity.class);
                String queryParameter6 = uri.getQueryParameter("label");
                if (TextUtils.isEmpty(queryParameter6)) {
                    queryParameter6 = "web";
                }
                if (!TextUtils.isEmpty(str3)) {
                    queryParameter6 = str3;
                }
                if (!TextUtils.isEmpty(queryParameter4)) {
                    queryParameter6 = "mp_page";
                }
                intent.putExtra("from_micro_app", queryParameter4);
                intent.putExtra("from_adsapp_activity", true);
                intent.putExtra("refer", queryParameter6);
                intent.putExtra("id", uri.getLastPathSegment());
                intent.putExtra("from_uid", uri.getQueryParameter("from_uid"));
                if (TextUtils.equals(queryParameter6, this.f61212b)) {
                    intent.putExtra("from_recommend_card", 1);
                }
                String queryParameter7 = uri.getQueryParameter("pop_type");
                if (queryParameter7 != null && queryParameter7.hashCode() == 403708324 && queryParameter7.equals("share_panel")) {
                    i = 3;
                }
                intent.putExtra("task_type", i);
                if (z2) {
                    C23111k a2 = C23111k.m56679a();
                    C52711k.m112236a((Object) a2, "AppLifeCircleCacheManager.getInstance()");
                    if (a2.f61536a) {
                        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "DISCOVER");
                        intent.putExtra("extra_story_is_friend", 1);
                    }
                }
            } else {
                intent = C47659c.m103160a(activity);
                C52711k.m112236a((Object) intent, "StartMainActivityUtils.g…nActivityIntent(activity)");
                String queryParameter8 = uri.getQueryParameter("label");
                if (TextUtils.isEmpty(queryParameter8)) {
                    queryParameter8 = "web";
                }
                intent.putExtra("id", uri.getLastPathSegment());
                intent.putExtra("refer", queryParameter8);
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
                String queryParameter9 = uri.getQueryParameter("is_friend");
                String a3 = C36640eh.m82544a(uri.getQueryParameter("tab_index"));
                if (TextUtils.equals(queryParameter9, "1") && TextUtils.equals(a3, "DISCOVER") && C36553cd.m82446b()) {
                    a3 = "FAMILIAR";
                }
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", a3);
                intent.putExtra("tab", 0);
                intent.putExtra("gd_label", queryParameter);
            }
            if (C52711k.m112239a((Object) uri.getQueryParameter("show_donation"), (Object) "1")) {
                intent.putExtra("show_donation", true);
            }
            C23041b.f61395b.mo47764a(C22858c.f61208d, uri, z);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$k */
    public static final class C22867k extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) str, (Object) C22858c.f61208d);
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            String str4;
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            Intent intent = new Intent(activity, DetailActivity.class);
            if (!TextUtils.isEmpty(str3)) {
                str4 = str3;
            } else {
                str4 = "web";
            }
            intent.putExtra("refer", str4);
            intent.putExtra("from_token", str3);
            intent.putExtra("id", uri.getQueryParameter("id"));
            C23041b.f61395b.mo47764a(C22858c.f61208d, uri, z);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$l */
    public static final class C22868l extends C22863g {
        /* renamed from: a */
        public final String mo47674a(Uri uri) {
            C52711k.m112240b(uri, "uri");
            return C22858c.f61208d;
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            if (!C52830p.m112411b(sb.toString(), "aweme/detail_list", false, 2, null)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(str2);
                if (!C52830p.m112411b(sb2.toString(), "tuwen/detail_list", false, 2, null)) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00ba  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.Intent mo47673a(android.app.Activity r5, android.net.Uri r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10) {
            /*
                r4 = this;
                java.lang.String r0 = "activity"
                p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
                java.lang.String r0 = "uri"
                p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
                java.lang.String r0 = "host"
                p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
                java.lang.String r0 = "path"
                p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
                java.lang.String r8 = "fromTokenType"
                p2628d.p2639f.p2641b.C52711k.m112240b(r9, r8)
                java.lang.String r8 = "label"
                java.lang.String r8 = r6.getQueryParameter(r8)
                r0 = r8
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x002a
                java.lang.String r8 = "web"
            L_0x002a:
                java.lang.String r0 = "gids"
                java.lang.String r0 = r6.getQueryParameter(r0)
                java.lang.String r1 = "push_params"
                java.lang.String r1 = r6.getQueryParameter(r1)
                java.lang.String r2 = "tuwen"
                boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r7)
                r2 = 1
                r7 = r7 ^ r2
                if (r7 == 0) goto L_0x005f
                com.ss.android.ugc.aweme.app.k r7 = com.p683ss.android.ugc.aweme.app.C23111k.m56679a()
                java.lang.String r3 = "AppLifeCircleCacheManager.getInstance()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r3)
                boolean r7 = r7.f61536a
                if (r7 != 0) goto L_0x0053
                boolean r7 = r5.isTaskRoot()
                if (r7 == 0) goto L_0x005f
            L_0x0053:
                android.content.Context r5 = (android.content.Context) r5
                android.content.Intent r5 = com.p683ss.android.ugc.aweme.utils.p2387a.C47659c.m103160a(r5)
                java.lang.String r7 = "StartMainActivityUtils.g…nActivityIntent(activity)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
                goto L_0x0088
            L_0x005f:
                android.content.Intent r7 = new android.content.Intent
                android.content.Context r5 = (android.content.Context) r5
                java.lang.Class<com.ss.android.ugc.aweme.detail.ui.DetailActivity> r3 = com.p683ss.android.ugc.aweme.detail.p1628ui.DetailActivity.class
                r7.<init>(r5, r3)
                r5 = r9
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                boolean r5 = android.text.TextUtils.isEmpty(r5)
                if (r5 != 0) goto L_0x0072
                r8 = r9
            L_0x0072:
                java.lang.String r5 = "from_adsapp_activity"
                r7.putExtra(r5, r2)
                java.lang.String r5 = "refer"
                r7.putExtra(r5, r8)
                java.lang.String r5 = "from_uid"
                java.lang.String r8 = "from_uid"
                java.lang.String r8 = r6.getQueryParameter(r8)
                r7.putExtra(r5, r8)
                r5 = r7
            L_0x0088:
                r7 = r0
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                boolean r8 = android.text.TextUtils.isEmpty(r7)
                if (r8 != 0) goto L_0x00b1
                java.lang.String r8 = "from"
                java.lang.String r8 = r6.getQueryParameter(r8)
                r9 = r8
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                boolean r9 = android.text.TextUtils.isEmpty(r9)
                if (r9 != 0) goto L_0x00ac
                java.lang.String r9 = "from_micro_app"
                r5.putExtra(r9, r8)
                java.lang.String r8 = "refer"
                java.lang.String r9 = "mp_page"
                r5.putExtra(r8, r9)
            L_0x00ac:
                java.lang.String r8 = "ids"
                r5.putExtra(r8, r0)
            L_0x00b1:
                r8 = r1
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                boolean r9 = android.text.TextUtils.isEmpty(r8)
                if (r9 != 0) goto L_0x00bf
                java.lang.String r9 = "push_params"
                r5.putExtra(r9, r1)
            L_0x00bf:
                java.lang.String r9 = "push_id"
                r6.getQueryParameter(r9)
                boolean r7 = android.text.TextUtils.isEmpty(r7)
                if (r7 == 0) goto L_0x00da
                boolean r7 = android.text.TextUtils.isEmpty(r8)
                if (r7 != 0) goto L_0x00da
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00da }
                r7.<init>(r1)     // Catch:{ JSONException -> 0x00da }
                java.lang.String r8 = "gids"
                r7.getString(r8)     // Catch:{ JSONException -> 0x00da }
            L_0x00da:
                com.ss.android.ugc.aweme.app.b$a r7 = com.p683ss.android.ugc.aweme.app.C23041b.f61395b
                java.lang.String r8 = "detail"
                r7.mo47764a(r8, r6, r10)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.app.C22835a.C22868l.mo47673a(android.app.Activity, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.Intent");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$m */
    public static final class C22869m extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) "discovery", (Object) str);
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            Intent a = C47659c.m103160a(activity);
            a.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "DISCOVER");
            C52711k.m112236a((Object) a, "intent");
            C22864h.m56300a(uri, a, z);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$n */
    public static final class C22870n extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) str, (Object) "feedback_input");
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            String str4;
            boolean z2;
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            String queryParameter = uri.getQueryParameter("feedback_id");
            String queryParameter2 = uri.getQueryParameter("enter_from");
            String queryParameter3 = uri.getQueryParameter("img_url");
            String str5 = "";
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                FeedbackConf feedbackConf = b.getFeedbackConf();
                C52711k.m112236a((Object) feedbackConf, "SettingsReader.get().feedbackConf");
                str4 = feedbackConf.getFeHelp();
                C52711k.m112236a((Object) str4, "SettingsReader.get().feedbackConf.feHelp");
                z2 = true;
            } catch (C10174a unused) {
                str4 = str5;
                z2 = false;
            }
            if (!z2 || C10181b.m20511a().mo18168a(FAQExperiment.class, true, "feedback_post_page_style", 31744, 0) == 0) {
                IBridgeService bridgeService_Monster = I18nBridgeService.getBridgeService_Monster();
                C52711k.m112236a((Object) bridgeService_Monster, "ServiceManager.get().get…ridgeService::class.java)");
                Intent intent = new Intent(activity, bridgeService_Monster.getSubmitFeedbackActivity());
                if (!TextUtils.isEmpty(queryParameter)) {
                    intent.putExtra("feedback_id", queryParameter);
                    intent.putExtra("enter_from", queryParameter2);
                }
                intent.putExtra("img_url", queryParameter3);
                return intent;
            }
            if (!TextUtils.isEmpty(queryParameter)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str4);
                sb.append("%26feedback_id%3D");
                sb.append(queryParameter);
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append("%26enter_from%3D");
                sb3.append(queryParameter2);
                str4 = sb3.toString();
            }
            return C23061a.m56597a((Context) activity, Uri.parse(str4), false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$o */
    public static final class C22871o extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) str, (Object) "feedback_record");
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            String queryParameter = uri.getQueryParameter("enter_from");
            Intent intent = new Intent(activity, FeedbackActivity.class);
            intent.putExtra("enter_from", queryParameter);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$p */
    public static final class C22872p extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) "modern_feed", (Object) str);
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            Intent a = C47659c.m103160a(activity);
            a.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "DISCOVER");
            C52711k.m112236a((Object) a, "intent");
            C22864h.m56300a(uri, a, z);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$q */
    public static final class C22873q extends C22863g {
        /* renamed from: a */
        public final String mo47674a(Uri uri) {
            C52711k.m112240b(uri, "uri");
            return CustomActionPushReceiver.f104061f;
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return C52830p.m112411b(sb.toString(), "hotlive/feed", false, 2, null);
        }

        /* renamed from: a */
        public final void mo47676a(Activity activity, Uri uri, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            Bundle bundle = new Bundle();
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (!C9376b.m18558a((Collection<T>) queryParameterNames)) {
                for (String str : queryParameterNames) {
                    bundle.putString(str, uri.getQueryParameter(str));
                }
            }
            ILiveOuterService a = C36173w.m81665a();
            C52711k.m112236a((Object) a, "ServiceManager.get().get…OuterService::class.java)");
            C33089c liveWatcherUtils = a.getLiveWatcherUtils();
            if (liveWatcherUtils != null) {
                liveWatcherUtils.mo70089a(activity, bundle);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$r */
    public static final class C22874r extends C22863g {
        /* renamed from: a */
        public final boolean mo47678a(String str, String str2, String str3) {
            C52711k.m112240b(str, "scheme");
            C52711k.m112240b(str2, "host");
            C52711k.m112240b(str3, LeakCanaryFileProvider.f132050j);
            if (C52711k.m112239a((Object) str, (Object) WebKitApi.SCHEME_HTTP) || C52711k.m112239a((Object) str, (Object) WebKitApi.SCHEME_HTTPS)) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            Intent intent = new Intent(activity, CrossPlatformActivity.class);
            String uri2 = uri.toString();
            C52711k.m112236a((Object) uri2, "uri.toString()");
            intent.setData(Uri.parse(C23106a.m56673a(uri2, "push")));
            if (z) {
                intent.putExtra("hide_more", false);
                intent.putExtra("enter_from", "notification");
            }
            C23041b.f61395b.mo47764a("h5", uri, z);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$s */
    public static final class C22875s extends C22863g {
        /* renamed from: a */
        public final String mo47674a(Uri uri) {
            C52711k.m112240b(uri, "uri");
            return "notification";
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return C52711k.m112239a((Object) sb.toString(), (Object) "user/imfans");
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            return SmartRouter.buildRoute((Context) activity, "//notification").withParam("from_where", 0).buildIntent();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$t */
    public static final class C22876t extends C22863g {
        /* renamed from: a */
        public final String mo47674a(Uri uri) {
            C52711k.m112240b(uri, "uri");
            return C22858c.f61208d;
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            if (C52711k.m112239a((Object) str, (Object) "item") || C52711k.m112239a((Object) str, (Object) "musical")) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            Intent intent = new Intent(activity, DetailActivity.class);
            intent.putExtra("refer", "web");
            intent.putExtra("id", uri.getQueryParameter("id"));
            C23041b.f61395b.mo47764a(C22858c.f61208d, uri, z);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$u */
    public static final class C22877u extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) str, (Object) "login");
        }

        /* renamed from: a */
        public final void mo47676a(Activity activity, Uri uri, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            if (!a.isLogin()) {
                C23137q a2 = C23137q.m56698a();
                C52711k.m112236a((Object) a2, "AwemeRuntime.inst()");
                if (a2.mo47855c()) {
                    activity.startActivity(new Intent(activity, PushLoginActivity.class));
                    return;
                }
                Intent[] intentArr = new Intent[2];
                Context context = activity;
                intentArr[0] = C47659c.m103160a(context);
                Intent intent = new Intent(context, PushLoginActivity.class);
                long a3 = C10181b.m20511a().mo18169a(PushLogInPauseVideoExperiment.class, true, "push_login_activity_cold_start_pause", 31744, 5000);
                if (a3 != 0) {
                    intent.putExtra("should_pause_main", a3);
                }
                intentArr[1] = intent;
                activity.startActivities(intentArr);
                return;
            }
            activity.startActivity(C47659c.m103160a(activity));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$v */
    public static final class C22878v extends C22863g {
        /* renamed from: a */
        public final String mo47674a(Uri uri) {
            C52711k.m112240b(uri, "uri");
            return "music_detail";
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            if (C52711k.m112239a((Object) str, (Object) "music") || C52711k.m112239a((Object) str, (Object) "song")) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            if (C52711k.m112239a((Object) str, (Object) "song")) {
                Intent intent = new Intent(activity, MusicDetailActivity.class);
                intent.putExtra("id", uri.getQueryParameter("trackId"));
                C23041b.f61395b.mo47764a("music_detail", uri, z);
                return intent;
            }
            String queryParameter = uri.getQueryParameter("group");
            boolean z2 = false;
            if (!TextUtils.isEmpty(str2) && C52830p.m112411b(str2, "/detail/", false, 2, null)) {
                z2 = true;
            }
            if (!C52711k.m112239a((Object) "0", (Object) queryParameter) && !z2) {
                return null;
            }
            Intent intent2 = new Intent(activity, MusicDetailActivity.class);
            String queryParameter2 = uri.getQueryParameter("id");
            if (TextUtils.isEmpty(queryParameter2)) {
                queryParameter2 = uri.getLastPathSegment();
            }
            if (C52711k.m112239a((Object) C22858c.f61208d, (Object) queryParameter2) || C52711k.m112239a((Object) "0", (Object) queryParameter2)) {
                queryParameter2 = null;
            }
            intent2.putExtra("id", queryParameter2);
            intent2.putExtra("from_token", str3);
            intent2.putExtra("partnerName", uri.getQueryParameter("partnerName"));
            intent2.putExtra("partnerMusicId", uri.getQueryParameter("partnerMusicId"));
            C23041b.f61395b.mo47764a("music_detail", uri, z);
            return intent2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$w */
    public static final class C22879w extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return C52830p.m112411b(sb.toString(), "assmusic/category", false, 2, null);
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            return SmartRouter.buildRoute((Context) activity, uri.buildUpon().scheme("aweme").build().toString()).buildIntent();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$x */
    public static final class C22880x extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) str, (Object) "collection");
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            if (C52711k.m112239a((Object) "0", (Object) uri.getQueryParameter("group"))) {
                return SmartRouter.buildRoute((Context) activity, "aweme://music/category/").withParam("mc_id", uri.getQueryParameter("id")).withParam("title_name", uri.getQueryParameter("collection_name")).withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1).buildIntent();
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$y */
    public static final class C22881y extends C22863g {
        /* renamed from: a */
        public final String mo47674a(Uri uri) {
            C52711k.m112240b(uri, "uri");
            return "personal_homepage";
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            if (!C52711k.m112239a((Object) "mine", (Object) str)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                if (!C52711k.m112239a((Object) sb.toString(), (Object) "user/homepage")) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        public final Intent mo47679a(Activity activity, Uri uri, String str, String str2, String str3, boolean z, boolean z2) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            if (a.isLogin() || z2) {
                Intent a2 = C47659c.m103160a(activity);
                C52711k.m112236a((Object) a2, "StartMainActivityUtils.g…nActivityIntent(activity)");
                a2.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "USER");
                C23041b.f61395b.mo47764a("mine", uri, z);
                return a2;
            }
            Intent a3 = C47659c.m103160a(activity);
            C52711k.m112236a((Object) a3, "StartMainActivityUtils.g…nActivityIntent(activity)");
            return a3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a$z */
    public static final class C22882z extends C22863g {
        /* renamed from: a */
        public final String mo47674a(Uri uri) {
            C52711k.m112240b(uri, "uri");
            return "nearby";
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) "nearby", (Object) str);
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0057  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.Intent mo47679a(android.app.Activity r1, android.net.Uri r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6, boolean r7) {
            /*
                r0 = this;
                java.lang.String r6 = "activity"
                p2628d.p2639f.p2641b.C52711k.m112240b(r1, r6)
                java.lang.String r6 = "uri"
                p2628d.p2639f.p2641b.C52711k.m112240b(r2, r6)
                java.lang.String r6 = "host"
                p2628d.p2639f.p2641b.C52711k.m112240b(r3, r6)
                java.lang.String r3 = "path"
                p2628d.p2639f.p2641b.C52711k.m112240b(r4, r3)
                java.lang.String r3 = "fromTokenType"
                p2628d.p2639f.p2641b.C52711k.m112240b(r5, r3)
                android.content.Context r1 = (android.content.Context) r1
                android.content.Intent r1 = com.p683ss.android.ugc.aweme.utils.p2387a.C47659c.m103160a(r1)
                java.lang.String r3 = "StartMainActivityUtils.g…nActivityIntent(activity)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
                java.lang.String r3 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB"
                java.lang.String r4 = "NEARBY"
                r1.putExtra(r3, r4)
                java.lang.String r3 = "com.ss.android.ugc.aweme.intent.extra.FEED_TYPE"
                java.lang.String r4 = "feed_type"
                java.lang.String r4 = r2.getQueryParameter(r4)
                if (r4 == 0) goto L_0x0040
                java.lang.Integer r4 = p2628d.p2650m.C52830p.m112395c(r4)
                if (r4 == 0) goto L_0x0040
                int r4 = r4.intValue()
                goto L_0x0041
            L_0x0040:
                r4 = 0
            L_0x0041:
                r1.putExtra(r3, r4)
                java.lang.String r3 = "insert_fresh_aweme_ids"
                java.lang.String r3 = r2.getQueryParameter(r3)
                java.lang.String r4 = "insert_fresh_type"
                java.lang.String r2 = r2.getQueryParameter(r4)
                if (r2 == 0) goto L_0x0057
                java.lang.Integer r2 = p2628d.p2650m.C52830p.m112395c(r2)
                goto L_0x0058
            L_0x0057:
                r2 = 0
            L_0x0058:
                r4 = r3
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                boolean r4 = android.text.TextUtils.isEmpty(r4)
                if (r4 != 0) goto L_0x0071
                if (r2 == 0) goto L_0x0071
                java.lang.String r4 = "insert_aweme_ids"
                r1.putExtra(r4, r3)
                java.lang.String r3 = "insert_type"
                int r2 = r2.intValue()
                r1.putExtra(r3, r2)
            L_0x0071:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.app.C22835a.C22882z.mo47679a(android.app.Activity, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):android.content.Intent");
        }
    }

    /* renamed from: a */
    public static final void m56224a(Uri uri, String str) {
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(str, "clazz");
        if (TextUtils.equals(uri.getQueryParameter("gd_label"), "retarget")) {
            String queryParameter = uri.getQueryParameter("toast");
            if (queryParameter != null) {
                C22923b.m56373a(str, queryParameter);
            }
        }
    }
}
