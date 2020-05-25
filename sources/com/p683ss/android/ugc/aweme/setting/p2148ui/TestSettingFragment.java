package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.C1160b.C1161a;
import android.text.TextUtils;
import android.text.method.ReplacementTransformationMethod;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import com.C2240a;
import com.benchmark.p124bl.C2633a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.geckox.model.CheckRequestBodyModel.GroupType;
import com.bytedance.geckox.p596b.C10048a;
import com.bytedance.geckox.p596b.C10048a.C10050a;
import com.bytedance.geckox.p596b.C10048a.C10051b;
import com.bytedance.geckox.utils.C10154d;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItem;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemBase;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemBase.C10731a;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemSwitch;
import com.bytedance.ies.geckoclient.C10885e;
import com.bytedance.ies.geckoclient.model.C10957d;
import com.bytedance.ies.safemode.p693a.C10995a;
import com.bytedance.ies.ugc.p694a.C11007b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.SmartRouterTestActivity;
import com.p683ss.android.anywheredoor_api.IAnyWhereDoor;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.config.AppConfig;
import com.p683ss.android.common.util.EventsSender;
import com.p683ss.android.deviceregister.C19034d;
import com.p683ss.android.newmedia.redbadge.C19610g;
import com.p683ss.android.newmedia.redbadge.C19611h;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.sdk.p1207a.C19718b;
import com.p683ss.android.ugc.aweme.C23855bk;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.AwemeAppData;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.C22927af;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.application.C23018b;
import com.p683ss.android.ugc.aweme.app.debug.AbTestSettingActivity;
import com.p683ss.android.ugc.aweme.app.debug.AbTestSettingCategoryActivity;
import com.p683ss.android.ugc.aweme.app.debug.AbTestSettingSearchActivity;
import com.p683ss.android.ugc.aweme.app.debug.C23074a;
import com.p683ss.android.ugc.aweme.app.debug.FlowWindowService;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.color.ColorTemplateActivity;
import com.p683ss.android.ugc.aweme.commerce.p1529a.C25484a;
import com.p683ss.android.ugc.aweme.commerce.service.C25539a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26384ak;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26389an;
import com.p683ss.android.ugc.aweme.conan.IConanService;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.crossplatform.platform.p1618rn.C27204b;
import com.p683ss.android.ugc.aweme.crossplatform.platform.p1618rn.C27210d;
import com.p683ss.android.ugc.aweme.feedback.C31280i;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.language.C35837h.C35838a;
import com.p683ss.android.ugc.aweme.legoImp.task.DelayedBaceSpeedMethodTestTask;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.local_test.LocalTest;
import com.p683ss.android.ugc.aweme.miniapp.MiniAppListH5Activity;
import com.p683ss.android.ugc.aweme.optimize.OptimizeSettingActivity;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl;
import com.p683ss.android.ugc.aweme.p1308ad.services.IAdService;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.p2375u.p2376a.C47405a;
import com.p683ss.android.ugc.aweme.p2377ug.p2378a.C47411b;
import com.p683ss.android.ugc.aweme.p2377ug.p2378a.C47411b.C47413b;
import com.p683ss.android.ugc.aweme.p2377ug.p2378a.C47411b.C47414c;
import com.p683ss.android.ugc.aweme.privacychecker.api.PrivacyCheckerService;
import com.p683ss.android.ugc.aweme.privacychecker.impl.fake.PrivacyCheckerServiceImpl;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.p683ss.android.ugc.aweme.qrcode.p2107v2.ScanQRCodeActivityV2;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p683ss.android.ugc.aweme.setting.C41556av;
import com.p683ss.android.ugc.aweme.setting.C41586be;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.setting.C41592d;
import com.p683ss.android.ugc.aweme.setting.C41623i;
import com.p683ss.android.ugc.aweme.setting.model.LocalAbTestModel;
import com.p683ss.android.ugc.aweme.setting.p2133b.C41573e;
import com.p683ss.android.ugc.aweme.setting.p2133b.C41574f;
import com.p683ss.android.ugc.aweme.ttwebview.C47367a;
import com.p683ss.android.ugc.aweme.user.C47538a;
import com.p683ss.android.ugc.aweme.user.C47549c;
import com.p683ss.android.ugc.aweme.user.C47557d;
import com.p683ss.android.ugc.aweme.user.C47557d.C47558a;
import com.p683ss.android.ugc.aweme.user.C47557d.C47561c;
import com.p683ss.android.ugc.aweme.util.C47626j;
import com.p683ss.android.ugc.aweme.util.C47631n;
import com.p683ss.android.ugc.aweme.util.C47632o;
import com.p683ss.android.ugc.aweme.utils.C47731bq;
import com.p683ss.android.ugc.aweme.utils.C47865ew;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.p683ss.android.ugc.aweme.utils.C47910gb;
import com.p683ss.android.ugc.aweme.web.C48380q;
import com.p683ss.android.ugc.aweme.zhima.C48423a;
import com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50116c;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.TestSettingFragment */
public class TestSettingFragment extends C23526a implements C10731a {

    /* renamed from: a */
    public static final boolean f105873a = false;
    SettingItemSwitch adWebCheckerSwitch;

    /* renamed from: b */
    private C23855bk f105874b;

    /* renamed from: c */
    private AwemeAppData f105875c;
    SettingItem colorTemplate;
    SettingItemSwitch cronetItem;
    EditText debugCommandInput;
    SettingItemSwitch debugWebBar;
    DmtEditText editBOELane;
    DmtEditText editPPELane;
    SettingItemSwitch enableAnrChecker;
    SettingItemSwitch enableConanChecker;
    SettingItemSwitch enableMessagePb2Json;
    SettingItemSwitch enableMicroAppItem;
    SettingItemSwitch enablePrivacyCheckerLog;
    EditText etInput;
    SettingItemSwitch geckoDebugItem;
    SettingItemSwitch geckoItem;
    SettingItem geckoTestHelperItem;
    SettingItemSwitch hostItem;
    SettingItemSwitch httpsItem;
    SettingItemSwitch iesOfflineItem;
    SettingItemSwitch interactStickerDebug;
    SettingItem itemApplyRedbadge;
    SettingItemSwitch itemBOESwitch;
    SettingItem itemClearDid;
    SettingItem itemClearMemoryCache;
    SettingItem itemDeeplinkTestPage;
    SettingItem itemEnterOptimizeSetting;
    SettingItem itemGeckoXTest;
    SettingItem itemLoadBenchmarkTest;
    SettingItemSwitch itemPPESwitch;
    SettingItem itemSearchAb;
    SettingItemSwitch itemSecUidChecker;
    SettingItemSwitch itemSecUidRequestWithCompileModeChecker;
    SettingItem itemUnbindFlipChat;
    SettingItem liveDebugItem;
    SettingItemSwitch liveMoneyItem;
    SettingItemSwitch livePressureItem;
    SettingItemSwitch liveResolutionItem;
    SettingItemSwitch logItem;
    SettingItem mAbTestItem;
    SettingItem mAutoDadian;
    SettingItemSwitch mCloseReactionOrigin;
    SettingItemSwitch mCommerceAnyDoor;
    SettingItemSwitch mCommerceNetMonitor;
    SettingItem mDmtDialogTest;
    EditText mEventHostEditText;
    Button mEventHostOkBtn;
    View mEventHostView;
    SettingItemSwitch mExoPlayerSwitch;
    SettingItemSwitch mLongVideoSwitch;
    SettingItemSwitch mMakeClientWatermark;
    LinearLayout mSettingContainer;
    EditText mSettingIntervalEditText;
    Button mSettingIntervalOkBtn;
    SettingItemSwitch mShowWatermarkInfo;
    TextView mTvDeveice;
    TextView mTvToolSdkVersion;
    SettingItemSwitch mUeTool;
    EditText mUrlInput;
    SettingItemSwitch mUseTestHost;
    EditText mWebusedefaultEditText;
    Button mWebusedefaultOkBtn;
    SettingItem mtVisitInChina;
    Button openDebugBoxButton;
    SettingItemSwitch openVEHook;
    SettingItem patchInfoItem;
    SettingItem resetSettingV2;
    SettingItemSwitch rnFallback;
    SettingItemSwitch showPLayerInfoUI;
    SettingItemSwitch showVideoBitrateInfo;
    SettingItemSwitch switchToolsDir;
    SettingItem syncModeoAuth;
    SettingItem testCookie;
    SettingItem testMemory;
    SettingItem testSafeMode;
    SettingItemSwitch ttWebViewDebugItem;
    SettingItemSwitch webOfflineDebugItem;
    SettingItem webRippleView;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestSettingFragment$a */
    static class C41807a extends ReplacementTransformationMethod {
        C41807a() {
        }

        /* access modifiers changed from: protected */
        public final char[] getOriginal() {
            return new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        }

        /* access modifiers changed from: protected */
        public final char[] getReplacement() {
            return new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        }
    }

    public void qrClick() {
    }

    public void OnSettingItemClick(View view) {
        int id = view.getId();
        if (id == R.id.du9) {
            Intent intent = new Intent(getActivity(), CrossPlatformActivity.class);
            intent.setData(Uri.parse("http://aweme.snssdk.com/falcon/douyin_falcon/jsbridge_test/"));
            intent.putExtra("title", "Web测试页");
            startActivity(intent);
        } else if (id == R.id.ar1) {
            this.iesOfflineItem.setChecked(!this.iesOfflineItem.mo19319a());
            this.iesOfflineItem.mo19319a();
            SharePrefCache.inst().getIesOffline().mo47776a(Boolean.valueOf(this.iesOfflineItem.mo19319a()));
        } else if (id == R.id.axf) {
            if (C19718b.m48210a().mo41123a("flipchat")) {
                Toast makeText = Toast.makeText(getActivity(), "飞聊已经绑定，正在解绑", 1);
                if (VERSION.SDK_INT == 25) {
                    C47905fy.m103630a(makeText);
                }
                makeText.show();
                getActivity();
                new Object() {
                };
                return;
            }
            Intent authorizeActivityStartIntent = C20854a.m53165e().getAuthorizeActivityStartIntent(getActivity());
            authorizeActivityStartIntent.putExtra("platform", "flipchat");
            authorizeActivityStartIntent.putExtra("is_login", false);
            startActivityForResult(authorizeActivityStartIntent, 10005);
        } else if (id == R.id.bdq) {
            this.livePressureItem.setChecked(!this.livePressureItem.mo19319a());
            SharePrefCache.inst().mockLiveSend().mo47776a(Boolean.valueOf(this.livePressureItem.mo19319a()));
            this.livePressureItem.mo19319a();
        } else if (id == R.id.akb) {
            this.geckoItem.setChecked(!this.geckoItem.mo19319a());
            SharePrefCache.inst().getGeckoLocalTestUseOnline().mo47776a(Boolean.valueOf(this.geckoItem.mo19319a()));
        } else if (id == R.id.bdm) {
            this.liveMoneyItem.setChecked(!this.liveMoneyItem.mo19319a());
            SharePrefCache.inst().mockLiveMoney().mo47776a(Boolean.valueOf(this.liveMoneyItem.mo19319a()));
        } else if (id == R.id.be3) {
            this.liveResolutionItem.setChecked(!this.liveResolutionItem.mo19319a());
            SharePrefCache.inst().mockLiveResolution().mo47776a(Boolean.valueOf(this.liveResolutionItem.mo19319a()));
        } else if (id == R.id.acn) {
            new C1161a(getActivity()).mo3767a((CharSequence[]) new String[]{"IJK", "IJK_HARDWARE", "EXO"}, (OnClickListener) new C41862aq(this)).mo3772b().show();
        } else if (id == R.id.bjj) {
            this.mLongVideoSwitch.setChecked(!this.mLongVideoSwitch.mo19319a());
            AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().setLongVideoPermitted(this.mLongVideoSwitch.mo19319a());
        } else if (id == R.id.apx) {
            this.httpsItem.setChecked(!this.httpsItem.mo19319a());
            AppConfig.getInstance(getActivity()).setUseHttps(this.httpsItem.mo19319a());
            SharePrefCache.inst().getUseHttps().mo47776a(Boolean.valueOf(this.httpsItem.mo19319a()));
        } else if (id == R.id.apl) {
            this.hostItem.setChecked(!this.hostItem.isChecked());
            SharePrefCache.inst().getUseDefaultHost().mo47776a(Boolean.valueOf(this.hostItem.isChecked()));
            if (this.hostItem.isChecked()) {
                SharedPreferences a = C35807d.m80935a(getActivity(), "test_data", 0);
                String string = a.getString("host", "https://data.bytedance.net/et_api/logview/android_sdk_verify/");
                a.edit().putString("host", string).apply();
                EventsSender.inst().setHost(string);
                EventsSender.inst().setSenderEnable(true);
            } else {
                EventsSender.inst().setSenderEnable(false);
            }
            SharePrefCache.inst().getUseHttps().mo47776a(Boolean.valueOf(this.hostItem.isChecked()));
        } else if (id == R.id.a3o) {
            this.debugWebBar.setChecked(!this.debugWebBar.isChecked());
            SharePrefCache.inst().getDebugWebBar().mo47776a(Boolean.valueOf(this.debugWebBar.mo19319a()));
        } else if (id == R.id.cea) {
            this.rnFallback.setChecked(!this.rnFallback.isChecked());
            SharePrefCache.inst().getRnFallback().mo47776a(Boolean.valueOf(this.rnFallback.mo19319a()));
        } else if (id == R.id.a2g) {
            this.cronetItem.setChecked(!this.cronetItem.mo19319a());
            SharePrefCache.inst().getUseCronet().mo47776a(Boolean.valueOf(this.cronetItem.mo19319a()));
        } else if (id == R.id.avz) {
            if (!this.logItem.mo19319a()) {
                this.logItem.setChecked(true);
                getActivity().startService(new Intent(getActivity(), FlowWindowService.class));
            }
        } else if (id == R.id.di7) {
            this.mUseTestHost.setChecked(!this.mUseTestHost.mo19319a());
            C23859b.m58575b().mo49466a((Context) getActivity(), "is_use_test_host", this.mUseTestHost.mo19319a());
        } else if (id == R.id.co8) {
            this.showPLayerInfoUI.setChecked(!this.showPLayerInfoUI.mo19319a());
            SharePrefCache.inst().getShowPlayerInfoUI().mo47776a(Boolean.valueOf(this.showPLayerInfoUI.mo19319a()));
        } else if (id == R.id.co_) {
            this.showVideoBitrateInfo.setChecked(!this.showVideoBitrateInfo.mo19319a());
            SharePrefCache.inst().getShowVideoBitrateInfo().mo47776a(Boolean.valueOf(this.showVideoBitrateInfo.mo19319a()));
        } else if (id == R.id.aiz) {
            this.mMakeClientWatermark.setChecked(!this.mMakeClientWatermark.isChecked());
            LocalAbTestModel e = C41589c.m91432a().mo85371e();
            if (e != null) {
                e.forceMakeClientWatermark = this.mMakeClientWatermark.isChecked();
            }
        } else if (id == R.id.du1) {
            this.mShowWatermarkInfo.setChecked(!this.mShowWatermarkInfo.isChecked());
            LocalAbTestModel e2 = C41589c.m91432a().mo85371e();
            if (e2 != null) {
                e2.showWatermarkDebugInfo = this.mShowWatermarkInfo.isChecked();
            }
        } else if (id == R.id.c9f) {
            this.mCloseReactionOrigin.setChecked(!this.mCloseReactionOrigin.isChecked());
            LocalAbTestModel e3 = C41589c.m91432a().mo85371e();
            if (e3 != null) {
                e3.reactionOnlyViewVideo = this.mCloseReactionOrigin.isChecked();
            }
        } else if (id == R.id.dl4) {
            this.mUeTool.isChecked();
            this.mUeTool.setChecked(false);
        } else {
            if (id == R.id.aaf) {
                this.enableMicroAppItem.setChecked(!this.enableMicroAppItem.isChecked());
                if (this.enableMicroAppItem.isChecked()) {
                    SharePrefCache.inst().getDownloadMicroApp().mo47776a(Integer.valueOf(1));
                } else {
                    SharePrefCache.inst().getDownloadMicroApp().mo47776a(Integer.valueOf(0));
                }
            } else if (id == R.id.h6) {
                if (f105873a) {
                    try {
                        String valueOf = String.valueOf(C23018b.f61359a);
                        String str = "";
                        Class cls = Class.forName("com.ss.android.module.verify_applog.AppLogVerifyClient");
                        Method declaredMethod = cls.getDeclaredMethod("init", new Class[]{String.class, String.class, Boolean.TYPE});
                        Method declaredMethod2 = cls.getDeclaredMethod("getUserOrNull", new Class[]{Context.class});
                        cls.getDeclaredMethod("saveUser", new Class[]{Context.class, String.class});
                        Method declaredMethod3 = cls.getDeclaredMethod("beginVerifyAppLog", new Class[]{Activity.class, String.class});
                        Method declaredMethod4 = cls.getDeclaredMethod("inst", new Class[0]);
                        Method declaredMethod5 = cls.getDeclaredMethod("tryInit", new Class[]{Context.class, String.class, String.class});
                        declaredMethod.invoke(null, new Object[]{valueOf, str, Boolean.valueOf(true)});
                        declaredMethod3.invoke(null, new Object[]{getActivity(), (String) declaredMethod2.invoke(null, new Object[]{getContext()})});
                        declaredMethod5.invoke(declaredMethod4.invoke(null, new Object[0]), new Object[]{getContext(), valueOf, str});
                    } catch (Exception unused) {
                    }
                }
            } else if (id != R.id.bcl) {
                if (id == R.id.akc) {
                    C1161a aVar = new C1161a(getActivity());
                    EditText editText = new EditText(getActivity());
                    editText.setHint("请输入site包channel数字");
                    editText.setText("6734278183694106632");
                    aVar.mo3767a((CharSequence[]) new String[]{"落地页Common包是否存在", "清除落地页Common包", "card_common包是否存在", "清除card_common包", "Feed流是否存在激活Site包", "清除Feed流Site 包", "Splash是否存在激活Site包", "清除Splash Site包"}, (OnClickListener) new C41863ar(this));
                    aVar.mo3762a((View) editText);
                    aVar.mo3772b().show();
                } else if (id == R.id.ava) {
                    try {
                        C19611h.m47955a().mo40867b(getActivity(), 33);
                        C10691a.m21538a((Context) getActivity(), "红点展现成功", 1).mo19066a();
                    } catch (C19610g unused2) {
                        C10691a.m21538a((Context) getActivity(), "红点展现失败", 1).mo19066a();
                    }
                } else if (id == R.id.avd) {
                    C47910gb.m103634a(10);
                } else if (id == R.id.es2) {
                    Keva.getRepo("TTSettingData").storeLong("last_get_setting_time", 0);
                } else if (id == R.id.ezm) {
                    C10691a.m21537a((Context) getActivity(), "测试cookie watcher").mo19066a();
                } else if (id == R.id.bww) {
                    this.enableMessagePb2Json.setChecked(!this.enableMessagePb2Json.mo19319a());
                    SharePrefCache.inst().isEnableMessagePb2Json().mo47776a(Boolean.valueOf(this.enableMessagePb2Json.mo19319a()));
                } else if (id == R.id.bl3) {
                    startActivity(new Intent(getActivity(), MemoryTestActivity.class));
                } else if (id == R.id.aug) {
                    this.interactStickerDebug.setChecked(!this.interactStickerDebug.mo19319a());
                    Editor edit = C35807d.m80935a(getActivity(), "test_data", 0).edit();
                    edit.putBoolean("sp_interact_stickers_test", this.interactStickerDebug.isChecked());
                    edit.apply();
                } else if (id == R.id.cw7) {
                    this.enableAnrChecker.setChecked(!this.enableAnrChecker.mo19319a());
                    Editor edit2 = C35807d.m80935a(getActivity(), "test_data", 0).edit();
                    edit2.putBoolean("sp_key_enable_anr", this.enableAnrChecker.isChecked());
                    edit2.apply();
                } else if (id == R.id.cwa) {
                    this.openVEHook.toggle();
                    AVExternalServiceImpl.getAVServiceImpl_Monster().configService().shortVideoConfig().enableHookLibrary(this.openVEHook.mo19319a());
                } else if (id == R.id.cw8) {
                    this.enableConanChecker.setChecked(!this.enableConanChecker.mo19319a());
                    try {
                        if (this.enableConanChecker.isChecked()) {
                            Application application = getActivity().getApplication();
                            C52711k.m112240b(application, "application");
                            IConanService a2 = C47632o.m103119a();
                            if (a2 != null) {
                                a2.init(application, false);
                            }
                            if (a2 != null) {
                                a2.start();
                            }
                        }
                        IConanService a3 = C47632o.m103119a();
                        if (a3 != null) {
                            a3.stop();
                        }
                    } catch (Exception unused3) {
                    }
                } else if (id == R.id.ez3) {
                    try {
                        PrivacyCheckerService createPrivacyCheckerServicebyMonsterPlugin = PrivacyCheckerServiceImpl.createPrivacyCheckerServicebyMonsterPlugin();
                        createPrivacyCheckerServicebyMonsterPlugin.enableLog(!this.enablePrivacyCheckerLog.isChecked());
                        this.enablePrivacyCheckerLog.setChecked(createPrivacyCheckerServicebyMonsterPlugin.isLogEnabled());
                    } catch (Exception unused4) {
                    }
                } else if (id == R.id.ax7) {
                    this.itemSecUidChecker.setChecked(!this.itemSecUidChecker.mo19319a());
                    C47865ew a4 = C47865ew.m103536a();
                    a4.f120438d = this.itemSecUidChecker.mo19319a();
                    a4.f120440f.storeBoolean("strict_mode", a4.f120438d);
                } else if (id == R.id.edq) {
                    this.itemSecUidRequestWithCompileModeChecker.setChecked(!this.itemSecUidRequestWithCompileModeChecker.mo19319a());
                    C47865ew a5 = C47865ew.m103536a();
                    a5.f120439e = this.itemSecUidRequestWithCompileModeChecker.mo19319a();
                    a5.f120440f.storeBoolean("request_with_compile_mode", a5.f120439e);
                } else if (id == R.id.dxg) {
                    boolean a6 = this.adWebCheckerSwitch.mo19319a();
                    this.adWebCheckerSwitch.setChecked(!a6);
                    C26384ak akVar = C26384ak.f69607d;
                    boolean z = !a6;
                    C26384ak.f69606c = z;
                    ((Keva) C26384ak.f69605b.getValue()).storeBoolean("key_is_enable", z);
                } else if (id == R.id.aar) {
                    FragmentActivity activity = getActivity();
                    activity.startActivity(new Intent(activity, AbTestSettingSearchActivity.class));
                } else if (id == R.id.cwf) {
                    this.switchToolsDir.setChecked(!this.switchToolsDir.mo19319a());
                    Editor edit3 = C35807d.m80935a(getActivity(), "test_data", 0).edit();
                    edit3.putBoolean("sp_key_tools_dir_external", this.switchToolsDir.isChecked());
                    edit3.apply();
                } else if (id == R.id.aav) {
                    startActivity(new Intent(getActivity(), SmartRouterTestActivity.class));
                } else if (id == R.id.bwj) {
                    LocalTest.m81850a().openRobustActivity(getActivity());
                } else if (id == R.id.e26) {
                    boolean c = C19034d.m46324c(getContext());
                    C19034d.m46315a(getContext(), !c);
                    Context context = getContext();
                    String str2 = "新用户模式: %s \n请在设置页面清除所有数据";
                    Object[] objArr = new Object[1];
                    objArr[0] = c ? "关闭" : "打开";
                    C10691a.m21552c(context, C2240a.m6772a(str2, objArr), 1).mo19066a();
                    this.itemClearDid.setRightTxt(c ? "打开新用户模式" : "关闭新用户模式");
                } else if (id == R.id.ab0) {
                    startActivity(new Intent(getActivity(), OptimizeSettingActivity.class));
                } else if (id == R.id.bh4) {
                    C2633a.m7625b().mo7192a(true);
                } else if (id == R.id.e_8) {
                    this.geckoDebugItem.setChecked(true);
                    getContext();
                } else if (id == R.id.f87) {
                    this.webOfflineDebugItem.setChecked(true);
                    getContext();
                } else if (id == R.id.e2n) {
                    startActivity(new Intent(getContext(), ColorTemplateActivity.class));
                } else if (id == R.id.e7a) {
                    if (getActivity() != null) {
                        boolean isChecked = this.mCommerceNetMonitor.isChecked();
                        IAnyWhereDoor a7 = C25484a.m61998a();
                        if (a7 != null && a7.switchNetworkCounter(getActivity(), !isChecked)) {
                            this.mCommerceNetMonitor.setChecked(!isChecked);
                        }
                    }
                } else if (id == R.id.e7_) {
                    if (getActivity() != null) {
                        boolean isChecked2 = this.mCommerceAnyDoor.isChecked();
                        IAnyWhereDoor a8 = C25484a.m61998a();
                        if (a8 != null && a8.switchEnable(getActivity(), !isChecked2)) {
                            this.mCommerceAnyDoor.setChecked(!isChecked2);
                        }
                        if (isChecked2 && this.mCommerceNetMonitor != null && this.mCommerceNetMonitor.isChecked() && a8 != null && a8.switchNetworkCounter(getActivity(), false)) {
                            this.mCommerceNetMonitor.setChecked(false);
                        }
                    }
                } else if (id == R.id.f17) {
                    if (C47367a.m102736b()) {
                        this.ttWebViewDebugItem.setChecked(false);
                        C47367a.m102735a(false);
                    } else {
                        this.ttWebViewDebugItem.setChecked(true);
                        C47367a.m102735a(true);
                    }
                } else if (id == R.id.f7m) {
                    Intent intent2 = new Intent(getContext(), CrossPlatformActivity.class);
                    intent2.setData(Uri.parse("http://rock.bytedance.net/ezconfig-ab/#/tiktokVisitSwitch"));
                    startActivity(intent2);
                } else if (id == R.id.e5i) {
                    startActivity(new Intent(getActivity(), DmtDialogTestActivity.class));
                } else if (id == R.id.etq) {
                    startActivity(new Intent(getActivity(), C10995a.class));
                } else if (id == R.id.e_9) {
                    String serverDeviceId = AppLog.getServerDeviceId();
                    if (!TextUtils.isEmpty(serverDeviceId)) {
                        IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
                        String str3 = "";
                        String str4 = "";
                        if (!(createIAdServicebyMonsterPlugin == null || createIAdServicebyMonsterPlugin.getAdLandPagePreloadService() == null)) {
                            str3 = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService().mo46659e(C22858c.f61207c);
                            str4 = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService().mo46659e("splash");
                        }
                        ArrayList arrayList = new ArrayList();
                        if (!TextUtils.isEmpty(str3)) {
                            arrayList.add(new Pair(str3, C10050a.LOCAL_TEST));
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            arrayList.add(new Pair(str4, C10050a.LOCAL_TEST));
                        }
                        arrayList.add(new Pair(C48380q.m104672e().mo41210d(), C10050a.LOCAL_TEST));
                        File j = C48380q.m104672e().mo95834j();
                        C11010c.m22280a();
                        C10051b bVar = new C10051b(getActivity().getApplication());
                        bVar.f27326b = arrayList;
                        bVar.f27329e = C48380q.m104676k();
                        bVar.f27327c = Long.valueOf((long) C11010c.m22289j());
                        bVar.f27331g = C35837h.m80980e();
                        bVar.f27328d = serverDeviceId;
                        bVar.f27334j = new String[]{GroupType.NORMAL.getValue(), GroupType.HIGHPRIORITY.getValue()};
                        bVar.f27330f = j;
                        new C10048a(bVar);
                        Intent intent3 = new Intent();
                        intent3.setClassName(getActivity().getPackageName(), "com.bytedance.geckox.debugtool.ui.GeckoDebugMenuActivity");
                        startActivity(intent3);
                    }
                }
            }
        }
    }

    public void openDebugbox() {
        C47626j.m103106a((Activity) getActivity());
    }

    /* renamed from: f */
    static List<String> m91816f() {
        try {
            return C32816h.m75716b().getAdLandingPageConfig().getAdCardPreloadCommonChannel();
        } catch (C10174a unused) {
            return null;
        }
    }

    public void clearUserRealNameVerify() {
        new C48423a().mo95901a();
    }

    public void douLabTestDialog() {
        C10691a.m21537a((Context) getActivity(), "MT没有该功能").mo19066a();
    }

    public void goDependencies() {
        startActivity(new Intent(getActivity(), TestDependenciesActivity.class));
    }

    public void goPlugin() {
        C41302w.m91042a().mo83858a((Activity) getActivity(), "aweme://pluginlist/");
    }

    public void languageDialogTest() {
        I18nBridgeService.getBridgeService_Monster().openLanguageTestDialog(getActivity());
    }

    public void onConfigPoiOverseas() {
        SmartRouter.buildRoute(getContext(), "//poi/debug/tools").open();
    }

    public void onDestroyView() {
        super.onDestroyView();
        C20854a.m53165e().setAuthorzieBindResult(null);
    }

    public void onEnterFreeFlowData() {
        C10691a.m21545b((Context) getActivity(), "I18n没有相关数据");
    }

    public void onTestFreeFlowMemberUpdate() {
        C10691a.m21545b((Context) getActivity(), "I18n没有相关数据").mo19066a();
    }

    public void openAVSchemaTest() {
        AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C41865at(this));
    }

    public void openPayTest() {
        C25539a.m62079a().launchPayTest(getActivity());
    }

    public void qrAdTestClick() {
        ScanQRCodeActivityV2.m90656a(getActivity(), 1);
    }

    public void scanChange() {
        QRCodePermissionActivity.m90502a(getActivity(), true, 2);
    }

    public void testHotFix() {
        C18842a.m45932a(new Runnable() {
            public final void run() {
                new DelayedBaceSpeedMethodTestTask().run();
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo85717a() {
        if (this.mEventHostEditText != null) {
            C47631n.m103118a(this.mEventHostEditText.getEditableText().toString(), getActivity());
        }
    }

    public void clickChangeRegion() {
        C35837h.m80975a((Activity) getActivity(), C35837h.m80980e(), (C35838a) new C35838a() {
            /* renamed from: a */
            public final void mo74497a(String str) {
                TestSettingFragment.this.etInput.setText(str);
                TestSettingFragment.this.etInput.setSelection(str.length());
                TestSettingFragment.this.setCarrierRegion();
            }
        });
    }

    public void goFreshIntro() {
        try {
            startActivity(new Intent(getActivity(), Class.forName("com.ss.android.ugc.aweme.freshman.FreshmenIntroActivity")));
        } catch (ClassNotFoundException unused) {
        }
    }

    public void onEnterLivingFeed() {
        startActivity(new Intent(getActivity(), C36173w.m81665a().getDebugHandler().mo70085b()));
    }

    public void onEnterLivingSetting() {
        startActivity(new Intent(getActivity(), C36173w.m81665a().getDebugHandler().mo70084a()));
    }

    public void onEnterMicroAppList() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.startActivity(new Intent(activity, MiniAppListH5Activity.class));
        }
    }

    public void setCarrierRegion() {
        C35837h.m80976a(getActivity(), this.etInput.getText().toString(), null, null);
        C10691a.m21537a((Context) getActivity(), "保存成功, 重启后生效").mo19066a();
    }

    public void uploadAlog() {
        C31280i.m73008a();
        C10691a.m21537a((Context) getActivity(), "上传 Alog 中，请耐心等待（waiting for a while)").mo19066a();
    }

    public void onClickAppLogFloatingTest() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C26389an anVar = C26389an.f69619c;
            C52711k.m112240b(activity, "activity");
            Class<?> cls = C26389an.f69617a;
            if (cls != null) {
                try {
                    cls.getDeclaredMethod("showFloatingWindow", new Class[]{Activity.class}).invoke(C26389an.f69618b, new Object[]{activity});
                } catch (Exception unused) {
                }
            }
        }
    }

    public void onEnterLivingRoom() {
        C1161a aVar = new C1161a(getActivity());
        View inflate = getLayoutInflater().inflate(R.layout.kr, null);
        aVar.mo3762a(inflate);
        aVar.mo3774c((CharSequence) "进入直播间", (OnClickListener) new C41866au(this, (EditText) inflate.findViewById(R.id.bee)));
        aVar.mo3764a((CharSequence) "进入直播间");
        aVar.mo3772b().show();
    }

    public void runCommandClick() {
        if (this.debugCommandInput.getText() != null) {
            C47405a.m102783a(this.debugCommandInput.getText().toString());
        } else {
            C10691a.m21545b((Context) getActivity(), "input command").mo19066a();
        }
    }

    public void toAb() {
        C23074a aVar = new C23074a();
        aVar.category = getString(R.string.av);
        FragmentActivity activity = getActivity();
        Intent intent = new Intent(activity, AbTestSettingActivity.class);
        intent.putExtra("paeg_param", aVar);
        activity.startActivity(intent);
    }

    /* renamed from: e */
    public final void mo85724e() {
        if (this.mSettingIntervalEditText != null) {
            try {
                int intValue = Integer.valueOf(this.mSettingIntervalEditText.getEditableText().toString()).intValue();
                if (intValue > 0 || ((long) intValue) <= TimeUnit.DAYS.toMillis(1)) {
                    C41556av.f105263a = intValue * 1000;
                    C10691a.m21533a((Context) getActivity(), (int) R.string.d19).mo19066a();
                } else {
                    C10691a.m21542b((Context) getActivity(), (int) R.string.d16).mo19066a();
                }
            } catch (NumberFormatException unused) {
                C10691a.m21542b((Context) getActivity(), (int) R.string.d16).mo19066a();
            }
        }
    }

    public void jumpToH5() {
        String trim = this.mUrlInput.getText().toString().trim();
        if (TextUtils.isEmpty(trim) || !trim.startsWith(WebKitApi.SCHEME_HTTP)) {
            C10691a.m21542b((Context) getActivity(), (int) R.string.azv).mo19066a();
            return;
        }
        StringBuilder sb = new StringBuilder("aweme://webview/?url=");
        sb.append(trim);
        C41302w.m91042a().mo83861a(sb.toString());
    }

    public void onClickSettingBundleUrl() {
        C1161a aVar = new C1161a(getActivity());
        View inflate = getLayoutInflater().inflate(R.layout.bax, null);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        Editor edit = defaultSharedPreferences.edit();
        EditText editText = (EditText) inflate.findViewById(R.id.et8);
        editText.setText(defaultSharedPreferences.getString("rn_setting_bundle_url", ""));
        editText.setHint("ip:port");
        aVar.mo3762a(inflate);
        aVar.mo3764a((CharSequence) "Set RN bundle url");
        aVar.mo3765a((CharSequence) "confirm", (OnClickListener) new C41867av(this, edit, editText));
        aVar.mo3774c((CharSequence) "clear", (OnClickListener) new C41868aw(this, editText, edit));
        aVar.mo3772b().show();
    }

    public void onConfigReactNative() {
        C1161a aVar = new C1161a(getActivity());
        View inflate = getLayoutInflater().inflate(R.layout.qh, null);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        Editor edit = defaultSharedPreferences.edit();
        String string = defaultSharedPreferences.getString("test_schema", "aweme://reactnative?dev=1&channel_name=rn_patch&bundle_name=business&module_name=page_business");
        EditText editText = (EditText) inflate.findViewById(R.id.cen);
        editText.setText(defaultSharedPreferences.getString("debug_http_host", LocalTest.m81850a().getDefaultRNTestHost()));
        EditText editText2 = (EditText) inflate.findViewById(R.id.cem);
        editText2.setText(string);
        aVar.mo3762a(inflate);
        aVar.mo3764a((CharSequence) "React Native 测试页");
        aVar.mo3765a((CharSequence) "使用bullet打开", (OnClickListener) new C41869ax(this, editText2));
        aVar.mo3774c((CharSequence) "schema跳转", (OnClickListener) new C41870ay(edit, editText, editText2));
        aVar.mo3772b().show();
    }

    public void onJsbSettingsClick() {
        C1161a aVar = new C1161a(getActivity());
        View inflate = getLayoutInflater().inflate(R.layout.baz, null);
        EditText editText = (EditText) inflate.findViewById(R.id.eho);
        String str = C27204b.m65627a().f71832b;
        if (!TextUtils.isEmpty(str)) {
            editText.setText(str);
        }
        aVar.mo3762a(inflate);
        aVar.mo3764a((CharSequence) "Jsb 测试设置");
        aVar.mo3774c((CharSequence) "Confirm", (OnClickListener) new C41861ap(editText));
        aVar.mo3772b().show();
    }

    public void onReactNativeSettingsClick() {
        C1161a aVar = new C1161a(getActivity());
        View inflate = getLayoutInflater().inflate(R.layout.qi, null);
        EditText editText = (EditText) inflate.findViewById(R.id.ceo);
        String str = C27210d.m65634a().f71843a;
        if (!TextUtils.isEmpty(str)) {
            editText.setText(str);
        }
        aVar.mo3762a(inflate);
        aVar.mo3764a((CharSequence) "React Native 测试设置");
        aVar.mo3774c((CharSequence) "Confirm", (OnClickListener) new C41871az(editText));
        aVar.mo3772b().show();
    }

    public void praiseGuideDialogTest() {
        C10643a aVar = new C10643a(getContext());
        aVar.mo18892a("好评引导弹窗测试");
        StringBuilder sb = new StringBuilder("当前debug开关状态：");
        sb.append(C47411b.f119628a.f119651g);
        sb.append("\n 清除缓存数据将清除弹窗展示记录、按钮点击记录、App首次打开时间");
        aVar.mo18902b(sb.toString());
        aVar.mo18903b("重置debug开关", (OnClickListener) C47413b.f119632a);
        aVar.mo18893a("清除缓存数据", (OnClickListener) C47414c.f119633a);
        aVar.mo18897a().mo18883c();
    }

    public void syncModeoAuth() {
        C47558a aVar;
        Object obj;
        C47558a aVar2;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            intent.addFlags(335544320);
            intent.setComponent(new ComponentName("com.ss.android.ugc.aweme.av.test", "com.ss.android.ugc.aweme.MainActivity2"));
            C52711k.m112236a((Object) C47549c.m102974a(), "UserManager.inst()");
            if (C47549c.m102978c()) {
                C52711k.m112236a((Object) C47549c.m102974a(), "UserManager.inst()");
                String e = C47549c.m102979e();
                C52711k.m112236a((Object) e, "UserManager.inst().curUserId");
                synchronized (C47557d.m102989a()) {
                    Iterator it = C47557d.f119986b.mo94871d().iterator();
                    while (true) {
                        aVar = null;
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (C52711k.m112239a((Object) ((C47561c) obj).f120010b, (Object) e)) {
                            break;
                        }
                    }
                    C47561c cVar = (C47561c) obj;
                    if (cVar != null) {
                        C52760c a = C52728w.m112245a(C47558a.class);
                        if (C52711k.m112239a((Object) a, (Object) C52728w.m112245a(User.class))) {
                            if (cVar.mo94880a().f120001a) {
                                aVar2 = (C47558a) cVar.mo94880a().mo94876a();
                            } else {
                                aVar2 = (C47558a) cVar.mo94880a().mo94876a();
                            }
                        } else if (C52711k.m112239a((Object) a, (Object) C52728w.m112245a(C47558a.class))) {
                            aVar2 = (C47558a) cVar.mo94881b().mo94876a();
                        } else if (C52711k.m112239a((Object) a, (Object) C52728w.m112245a(C47538a.class))) {
                            aVar2 = (C47558a) cVar.mo94882c().mo94876a();
                        }
                        aVar = aVar2;
                    }
                }
                if (aVar == null) {
                    intent.putExtra("sync_model_auth.is_login", false);
                } else {
                    intent.putExtra("sync_model_auth.is_login", true);
                    intent.putExtra("sync_model_auth.app_id", C23018b.f61359a);
                    intent.putExtra("sync_model_auth.uid", aVar.f119995a);
                    intent.putExtra("sync_model_auth.sec_uid", aVar.f120000f);
                    intent.putExtra("sync_model_auth.name", aVar.f119997c);
                    intent.putExtra("sync_model_auth.session_key", aVar.f119996b);
                }
            } else {
                intent.putExtra("sync_model_auth.is_login", false);
            }
            activity.startActivity(intent);
        }
    }

    public void crash(View view) {
        throw new IllegalStateException("test a crash");
    }

    /* renamed from: a */
    private void m91813a(SettingItemBase... settingItemBaseArr) {
        for (int i = 0; i < 57; i++) {
            SettingItemBase settingItemBase = settingItemBaseArr[i];
            if (settingItemBase != null) {
                settingItemBase.setOnSettingItemClickListener(this);
            }
        }
    }

    /* renamed from: c */
    static boolean m91814c(String str) {
        if (C47731bq.m103352f()) {
            return C47731bq.m103343c(C48380q.m104672e().mo41210d(), str);
        }
        return C47731bq.m103348e().mo19666b(str);
    }

    /* renamed from: d */
    static void m91815d(String str) {
        if (C47731bq.m103352f()) {
            C0013i.m16a((Callable<TResult>) new Callable<Object>(C48380q.m104672e().mo41210d(), str) {

                /* renamed from: a */
                final /* synthetic */ String f120246a;

                /* renamed from: b */
                final /* synthetic */ String f120247b;

                public final Object call() throws Exception {
                    File filesDir = C11010c.m22280a().getFilesDir();
                    StringBuilder sb = new StringBuilder("offlineX");
                    sb.append(File.separator);
                    sb.append(this.f120246a);
                    sb.append(File.separator);
                    sb.append(this.f120247b);
                    try {
                        C10154d.m20480a(new File(filesDir, sb.toString()));
                    } catch (Throwable unused) {
                    }
                    return null;
                }

                {
                    this.f120246a = r1;
                    this.f120247b = r2;
                }
            });
        } else {
            C47731bq.m103348e().mo19656a(str, null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo85719b(String str) {
        if (C47731bq.m103352f()) {
            C10691a.m21545b((Context) getActivity(), "暂不支持GeckoX调试此功能").mo19066a();
        }
        C10885e h = C47731bq.m103355h(str);
        if (h == null || h.mo19652a().size() <= 0) {
            FragmentActivity activity = getActivity();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" Site包已经是空");
            C10691a.m21545b((Context) activity, sb.toString()).mo19066a();
            return;
        }
        C10957d dVar = (C10957d) h.mo19652a().get(0);
        h.mo19656a(dVar.f29403c, null);
        FragmentActivity activity2 = getActivity();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" 清空Channel Site包:");
        sb2.append(dVar.f29403c);
        C10691a.m21545b((Context) activity2, sb2.toString()).mo19066a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo85718a(String str) {
        if (C47731bq.m103352f()) {
            C10691a.m21545b((Context) getActivity(), "暂不支持GeckoX调试此功能").mo19066a();
        }
        C10885e h = C47731bq.m103355h(str);
        if (h == null || h.mo19652a().size() <= 0) {
            FragmentActivity activity = getActivity();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" Site包为空");
            C10691a.m21545b((Context) activity, sb.toString()).mo19066a();
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (C10957d dVar : h.mo19652a()) {
            sb2.append(dVar.f29403c);
            sb2.append("\n");
        }
        FragmentActivity activity2 = getActivity();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(" List:");
        sb3.append(sb2.toString());
        C10691a.m21545b((Context) activity2, sb3.toString()).mo19066a();
    }

    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        super.onViewCreated(view, bundle);
        SharePrefCache inst = SharePrefCache.inst();
        this.httpsItem.setChecked(((Boolean) inst.getUseHttps().mo47782d()).booleanValue());
        this.hostItem.setChecked(((Boolean) inst.getUseDefaultHost().mo47782d()).booleanValue());
        this.rnFallback.setChecked(((Boolean) inst.getRnFallback().mo47782d()).booleanValue());
        this.debugWebBar.setChecked(((Boolean) inst.getDebugWebBar().mo47782d()).booleanValue());
        this.cronetItem.setChecked(((Boolean) inst.getUseCronet().mo47782d()).booleanValue());
        this.iesOfflineItem.setChecked(((Boolean) inst.getIesOffline().mo47782d()).booleanValue());
        this.geckoItem.setChecked(((Boolean) inst.getGeckoLocalTestUseOnline().mo47782d()).booleanValue());
        this.f105875c = AwemeAppData.m47851a();
        EditText editText = this.mEventHostEditText;
        C22927af a = C22927af.m56377a();
        if (System.currentTimeMillis() - a.f61255b > TimeUnit.DAYS.toMillis(2)) {
            a.f61254a = "";
            a.f61255b = 0;
        }
        editText.setText(a.f61254a);
        this.mEventHostEditText.setOnEditorActionListener(new C41859an(this));
        this.mEventHostOkBtn = (Button) view.findViewById(R.id.apm);
        this.mEventHostOkBtn.setOnClickListener(new C41860ao(this));
        this.mWebusedefaultOkBtn = (Button) view.findViewById(R.id.dub);
        this.mWebusedefaultOkBtn.setOnClickListener(new C41864as(this));
        this.mSettingIntervalEditText.setText(String.valueOf(C41556av.f105263a / 1000));
        this.mSettingIntervalEditText.setOnEditorActionListener(new OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 6 && i != 0) {
                    return false;
                }
                TestSettingFragment.this.mo85724e();
                return true;
            }
        });
        this.mSettingIntervalOkBtn.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                TestSettingFragment.this.mo85724e();
            }
        });
        TextView textView = this.mTvDeveice;
        StringBuilder sb = new StringBuilder("\nApkInfo: ");
        sb.append(C11007b.m22276a(getActivity().getApplicationInfo().sourceDir, 1903654775));
        sb.append("\nChannel: ");
        sb.append(C11010c.m22295p());
        sb.append("\nDeviceId: ");
        sb.append(AppLog.getServerDeviceId());
        sb.append("\nFLAVOR: tiktokI18n");
        sb.append("\nFLAVOR_app: tiktok");
        sb.append("\nFLAVOR_mode: i18n");
        sb.append("\nUserId: ");
        sb.append(C20902b.m53242a().getCurUserId());
        sb.append("\nWebViewType: ");
        sb.append(C47367a.m102734a());
        textView.setText(sb.toString());
        IAVSettingsService avsettingsConfig = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig();
        TextView textView2 = this.mTvToolSdkVersion;
        StringBuilder sb2 = new StringBuilder("\nVESdk version: ");
        sb2.append(avsettingsConfig.getVESDKVersion());
        sb2.append("\nEffectSdk version: ");
        sb2.append(avsettingsConfig.getEffectVersion());
        textView2.setText(sb2.toString());
        this.livePressureItem.setChecked(((Boolean) inst.mockLiveSend().mo47782d()).booleanValue());
        this.liveMoneyItem.setChecked(((Boolean) inst.mockLiveMoney().mo47782d()).booleanValue());
        this.liveResolutionItem.setChecked(((Boolean) inst.mockLiveResolution().mo47782d()).booleanValue());
        SettingItemSwitch settingItemSwitch = this.enableMicroAppItem;
        if (((Integer) SharePrefCache.inst().getDownloadMicroApp().mo47782d()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        settingItemSwitch.setChecked(z);
        this.enableMessagePb2Json.setChecked(((Boolean) SharePrefCache.inst().isEnableMessagePb2Json().mo47782d()).booleanValue());
        this.ttWebViewDebugItem.setChecked(C47367a.m102736b());
        C50116c cVar = C50116c.Ijk;
        String str8 = "";
        if (cVar == C50116c.Ijk) {
            str8 = "IJK";
        } else if (cVar == C50116c.IjkHardware) {
            str8 = "IJK_HARDWARE";
        } else if (cVar == C50116c.EXO) {
            str8 = "EXO";
        }
        this.mExoPlayerSwitch.setStartText(str8);
        String e = C35837h.m80980e();
        this.etInput.setVisibility(0);
        this.etInput.setText(e);
        this.etInput.setSelection(e.length());
        this.etInput.setTransformationMethod(new C41807a());
        IExternalService aVServiceImpl_Monster = AVExternalServiceImpl.getAVServiceImpl_Monster();
        this.mLongVideoSwitch.setChecked(aVServiceImpl_Monster.configService().avsettingsConfig().isLongVideoPermitted());
        this.mUseTestHost.setChecked(C23859b.m58575b().mo49472b((Context) getActivity(), "is_use_test_host", false));
        this.mCommerceAnyDoor.setChecked(C23859b.m58575b().mo49472b((Context) getActivity(), "aweme_commerce_anywheredoor", false));
        this.mCommerceNetMonitor.setChecked(C23859b.m58575b().mo49472b((Context) getActivity(), "aweme_commerce_monitor", false));
        this.showPLayerInfoUI.setChecked(((Boolean) inst.getShowPlayerInfoUI().mo47782d()).booleanValue());
        this.showVideoBitrateInfo.setChecked(((Boolean) inst.getShowVideoBitrateInfo().mo47782d()).booleanValue());
        SharedPreferences a2 = C35807d.m80935a(getActivity(), "test_data", 0);
        this.interactStickerDebug.setChecked(a2.getBoolean("sp_interact_stickers_test", false));
        this.enableAnrChecker.setChecked(a2.getBoolean("sp_key_enable_anr", false));
        this.openVEHook.setChecked(aVServiceImpl_Monster.configService().shortVideoConfig().isHookLibrary());
        this.enableConanChecker.setChecked(false);
        this.enablePrivacyCheckerLog.setChecked(PrivacyCheckerServiceImpl.createPrivacyCheckerServicebyMonsterPlugin().isLogEnabled());
        this.switchToolsDir.setChecked(a2.getBoolean("sp_key_tools_dir_external", false));
        C20854a.m53165e().setAuthorzieBindResult(this.f105874b);
        SettingItem settingItem = this.itemUnbindFlipChat;
        if (C19718b.m48210a().mo41123a("flipchat")) {
            str = "已绑定";
        } else {
            str = "未绑定";
        }
        settingItem.setRightTxt(str);
        this.itemSecUidChecker.setChecked(C47865ew.m103536a().f120438d);
        this.itemSecUidRequestWithCompileModeChecker.setChecked(C47865ew.m103536a().f120439e);
        this.adWebCheckerSwitch.setChecked(C26384ak.f69606c);
        boolean c = C19034d.m46324c(getContext());
        SettingItem settingItem2 = this.itemClearDid;
        StringBuilder sb3 = new StringBuilder();
        if (c) {
            str2 = "关闭";
        } else {
            str2 = "打开";
        }
        sb3.append(str2);
        sb3.append("新用户模式");
        settingItem2.setRightTxt(sb3.toString());
        Context context = getContext();
        SettingItemSwitch settingItemSwitch2 = this.itemBOESwitch;
        StringBuilder sb4 = new StringBuilder();
        if (C41623i.m91496b()) {
            str3 = "已开启";
        } else {
            str3 = "已关闭";
        }
        sb4.append(str3);
        sb4.append("BOE环境");
        settingItemSwitch2.setStartText(sb4.toString());
        settingItemSwitch2.setChecked(C41623i.m91496b());
        settingItemSwitch2.setOnSettingItemClickListener(new C41573e(settingItemSwitch2, context));
        Context context2 = getContext();
        SettingItemSwitch settingItemSwitch3 = this.itemPPESwitch;
        StringBuilder sb5 = new StringBuilder();
        if (C41623i.m91491a()) {
            str4 = "已开启";
        } else {
            str4 = "已关闭";
        }
        sb5.append(str4);
        sb5.append("PPE环境");
        settingItemSwitch3.setStartText(sb5.toString());
        settingItemSwitch3.setChecked(C41623i.m91491a());
        settingItemSwitch3.setOnSettingItemClickListener(new C41574f(settingItemSwitch3, context2));
        DmtEditText dmtEditText = this.editBOELane;
        StringBuilder sb6 = new StringBuilder("当前BOE泳道:");
        if (TextUtils.equals(C41623i.f105345a, "prod")) {
            str5 = "默认值 prod";
        } else {
            str5 = C41623i.f105345a;
        }
        sb6.append(str5);
        dmtEditText.setHint(sb6.toString());
        DmtEditText dmtEditText2 = this.editPPELane;
        StringBuilder sb7 = new StringBuilder("当前PPE泳道:");
        if (TextUtils.equals(C41623i.f105346b, "prod")) {
            str6 = "默认值 prod";
        } else {
            str6 = C41623i.f105346b;
        }
        sb7.append(str6);
        dmtEditText2.setHint(sb7.toString());
        this.editBOELane.setOnEditorActionListener(new OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == 6) {
                    C41623i.m91490a(TestSettingFragment.this.editBOELane.getText().toString());
                    Context context = TestSettingFragment.this.getContext();
                    StringBuilder sb = new StringBuilder("BOE泳道已经被设置为");
                    sb.append(C41623i.f105345a);
                    sb.append(",重新冷启生效");
                    C10691a.m21537a(context, sb.toString()).mo19066a();
                    KeyboardUtils.m58184c(TestSettingFragment.this.editBOELane);
                }
                return true;
            }
        });
        this.editPPELane.setOnEditorActionListener(new OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == 6) {
                    C41623i.m91494b(TestSettingFragment.this.editPPELane.getText().toString());
                    Context context = TestSettingFragment.this.getContext();
                    StringBuilder sb = new StringBuilder("PPE泳道已经被设置为");
                    sb.append(C41623i.f105346b);
                    sb.append(",重新冷启生效");
                    C10691a.m21537a(context, sb.toString()).mo19066a();
                    KeyboardUtils.m58184c(TestSettingFragment.this.editPPELane);
                }
                return true;
            }
        });
        if (C41586be.m91422a(getActivity())) {
            this.syncModeoAuth.setVisibility(0);
        }
        SharedPreferences a3 = C35807d.m80935a(getActivity(), "test_data", 0);
        if (!a3.contains("host")) {
            str7 = "https://data.bytedance.net/et_api/logview/android_sdk_verify/";
        } else {
            str7 = a3.getString("host", "");
        }
        this.mEventHostEditText.setText(str7);
        m91813a(this.iesOfflineItem, this.geckoItem, this.livePressureItem, this.liveMoneyItem, this.liveResolutionItem, this.mExoPlayerSwitch, this.mLongVideoSwitch, this.showPLayerInfoUI, this.showVideoBitrateInfo, this.mUseTestHost, this.httpsItem, this.hostItem, this.rnFallback, this.debugWebBar, this.cronetItem, this.logItem, this.mMakeClientWatermark, this.mCommerceAnyDoor, this.mCommerceNetMonitor, this.mShowWatermarkInfo, this.webRippleView, this.mCloseReactionOrigin, this.mUeTool, this.enableMicroAppItem, this.testMemory, this.enableMessagePb2Json, this.mAutoDadian, this.geckoTestHelperItem, this.liveDebugItem, this.itemApplyRedbadge, this.itemClearMemoryCache, this.interactStickerDebug, this.resetSettingV2, this.testCookie, this.itemUnbindFlipChat, this.enableAnrChecker, this.openVEHook, this.enableConanChecker, this.enablePrivacyCheckerLog, this.itemSecUidChecker, this.itemSecUidRequestWithCompileModeChecker, this.adWebCheckerSwitch, this.itemSearchAb, this.itemDeeplinkTestPage, this.itemClearDid, this.switchToolsDir, this.itemEnterOptimizeSetting, this.patchInfoItem, this.itemLoadBenchmarkTest, this.geckoDebugItem, this.webOfflineDebugItem, this.colorTemplate, this.itemGeckoXTest, this.ttWebViewDebugItem, this.mtVisitInChina, this.mDmtDialogTest, this.testSafeMode);
        LinearLayout linearLayout = this.mSettingContainer;
        C0013i.m16a((Callable<TResult>) new Callable<ArrayList<View>>(linearLayout) {

            /* renamed from: a */
            final /* synthetic */ ViewGroup f105283a;

            public final /* synthetic */ Object call() throws Exception {
                String str;
                String str2;
                Context context = this.f105283a.getContext();
                LinkedHashMap<String, ArrayList<C41576h>> linkedHashMap = C41576h.f105290a;
                TreeMap treeMap = new TreeMap(new Comparator<String>(linkedHashMap) {

                    /* renamed from: a */
                    final /* synthetic */ LinkedHashMap f105279a;

                    {
                        this.f105279a = r1;
                    }

                    public final /* synthetic */ int compare(Object obj, Object obj2) {
                        int size = ((ArrayList) this.f105279a.get((String) obj)).size() - ((ArrayList) this.f105279a.get((String) obj2)).size();
                        if (size != 0) {
                            return size;
                        }
                        return 1;
                    }
                });
                if (C9376b.m18558a((Collection<T>) linkedHashMap.entrySet())) {
                    C41566c.m91405a();
                }
                treeMap.putAll(linkedHashMap);
                ArrayList arrayList = new ArrayList();
                for (Entry entry : treeMap.entrySet()) {
                    C41563a aVar = new C41563a(context);
                    String str3 = (String) entry.getKey();
                    ArrayList arrayList2 = (ArrayList) entry.getValue();
                    StringBuilder sb = new StringBuilder("AB：");
                    sb.append(str3);
                    aVar.setStartText(sb.toString());
                    int size = arrayList2.size();
                    StringBuilder sb2 = new StringBuilder();
                    if (size > 20) {
                        str2 = "😂😂😂";
                    } else {
                        str2 = "";
                    }
                    sb2.append(str2);
                    sb2.append(size);
                    sb2.append("项");
                    aVar.setRightTxt(sb2.toString());
                    aVar.setOnSettingItemClickListener(new C10731a(str3) {

                        /* renamed from: a */
                        final /* synthetic */ String f105277a;

                        public final void OnSettingItemClick(View view) {
                            C23074a aVar = new C23074a();
                            aVar.category = this.f105277a;
                            Context context = C41563a.this.getContext();
                            Intent intent = new Intent(context, AbTestSettingCategoryActivity.class);
                            intent.putExtra("paeg_param", aVar);
                            context.startActivity(intent);
                        }

                        {
                            this.f105277a = r2;
                        }
                    });
                    arrayList.add(aVar);
                }
                SettingItemSwitch settingItemSwitch = new SettingItemSwitch(context);
                boolean b = C41592d.m91454b().mo49472b(context.getApplicationContext(), "ENABLED", false);
                StringBuilder sb3 = new StringBuilder();
                if (b) {
                    str = "已开启";
                } else {
                    str = "已关闭";
                }
                sb3.append(str);
                sb3.append("A/B Test Mock");
                settingItemSwitch.setStartText(sb3.toString());
                settingItemSwitch.setChecked(b);
                settingItemSwitch.setOnSettingItemClickListener(new C41572d(settingItemSwitch, context));
                arrayList.add(settingItemSwitch);
                SettingItem settingItem = new SettingItem(context);
                settingItem.setOnSettingItemClickListener(new C10731a(context) {

                    /* renamed from: a */
                    final /* synthetic */ Context f105280a;

                    {
                        this.f105280a = r1;
                    }

                    public final void OnSettingItemClick(View view) {
                        AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new AsyncServiceLoader() {
                            public final void onLoad(AsyncAVService asyncAVService, long j) {
                                asyncAVService.uiService().schemaTestService().startABTest(C415682.this.f105280a);
                            }
                        });
                    }
                });
                settingItem.setStartText("AB 和 Setting （工具线）");
                arrayList.add(settingItem);
                return arrayList;
            }

            {
                this.f105283a = r1;
            }
        }).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<ArrayList<View>, Void>(linearLayout) {

            /* renamed from: a */
            final /* synthetic */ ViewGroup f105282a;

            {
                this.f105282a = r1;
            }

            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                Iterator it = ((ArrayList) iVar.mo34e()).iterator();
                while (it.hasNext()) {
                    this.f105282a.addView((View) it.next(), 15);
                }
                return null;
            }
        }, C0013i.f25b);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.qg, viewGroup, false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!(i == 1001 && intent != null && intent.getExtras() == null) && i == 10005) {
            if (i2 != -1 || !C19718b.m48210a().mo41123a("flipchat")) {
                C10691a.m21545b((Context) getActivity(), "飞聊绑定失败").mo19066a();
            } else {
                this.itemUnbindFlipChat.setRightTxt("已绑定");
                C10691a.m21537a((Context) getActivity(), "飞聊绑定成功").mo19066a();
            }
        }
    }
}
