package com.p683ss.android.ugc.aweme.net;

import com.bytedance.common.utility.C9431p;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9881f;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9881f.C9883b;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9881f.C9884c;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ttnet.p884b.C13287a;
import com.p683ss.android.account.token.C18500a;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.language.C35854p;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.utils.C47892fm;
import com.p683ss.android.ugc.network.observer.bean.C50095d;
import com.taobao.android.dexposed.ClassUtils;
import com.ttnet.org.chromium.base.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.net.e */
public final class C37768e extends C13287a {

    /* renamed from: b */
    public static final C37768e f96231b = new C37768e();

    /* renamed from: c */
    public static StringBuilder f96232c = new StringBuilder("0");

    /* renamed from: d */
    private static int f96233d = 0;

    /* renamed from: a */
    public static void m84356a() {
        f96233d = 0;
    }

    public final String getAbClient() {
        return null;
    }

    public final String getAbFeature() {
        return null;
    }

    public final String getAbFlag() {
        return "0";
    }

    public final String getStoreIdcRuleJSON() {
        return "{\"update_store_idc_path_list\": [\"/passport/*\", \"/service/*/device_register/\"], \"add_store_idc_host_list\": [\"*.tiktokv.com\", \"*.musical.ly\"]}";
    }

    public final String getAbVersion() {
        return C11010c.m22288i();
    }

    public final String getAppName() {
        return C11010c.m22283d();
    }

    public final String getCarrierRegion() {
        return C35837h.m80981f();
    }

    public final String getChannel() {
        return C11010c.m22295p();
    }

    public final String getDeviceId() {
        return AppLog.getServerDeviceId();
    }

    public final String getRegion() {
        return C35837h.m80980e();
    }

    public final String getUUID() {
        return C47892fm.m103594a();
    }

    public final String getVersionName() {
        return C11010c.m22288i();
    }

    public final String getAppId() {
        return String.valueOf(AppLog.getAppId());
    }

    public final String getManifestVersionCode() {
        return String.valueOf(C11010c.m22293n());
    }

    public final String getStoreIdc() {
        return C35854p.get().getStoreIdc();
    }

    public final String getSysRegion() {
        return I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getSysRegion();
    }

    public final String getUpdateVersionCode() {
        return String.valueOf(C11010c.m22286g());
    }

    public final String getVersionCode() {
        return String.valueOf(C11010c.m22287h());
    }

    public final String getBypassBOEJSON() {
        JSONObject jSONObject = new JSONObject();
        String str = "bypass_boe_host_list";
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("awemelark.bytedance.com");
            jSONObject.put(str, jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final String getOpenUdid() {
        HashMap hashMap = new HashMap();
        AppLog.getSSIDs(hashMap);
        String str = (String) hashMap.get("openudid");
        if (C9431p.m18664a(str)) {
            return "";
        }
        return str;
    }

    public final String getUserId() {
        String userId = AppLog.getUserId();
        if (!C9431p.m18664a(userId) && !userId.equals("0")) {
            return userId;
        }
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        if (baseUserService_Monster != null) {
            return baseUserService_Monster.getCurrentUserID();
        }
        return userId;
    }

    public final boolean loggerDebug() {
        if (Logger.debug() || "local_test".equals(C11010c.m22295p())) {
            return true;
        }
        return false;
    }

    public final String getGetDomainDefaultJSON() {
        String e = C35837h.m80980e();
        if ("BD".equalsIgnoreCase(e)) {
            return "{\n  \"data\": {\n    \"chromium_open\": 1,\n    \"frontier_urls\": [\n      \"wss://frontier.musical.ly/ws/v2\"\n    ],\n    \"hs_open\": 1,\n    \"ok_http3_open\": 1,\n    \"ok_http_open\": 1,\n    \"send_tnc_host_arrays\": [\n      \"dm16.tiktokv.com\",\n      \"161.117.93.65\",\n      \"dm-sg-quic.byteoversea.com\",\n      \"dm16.musical.ly\"\n    ],\n    \"share_cookie_host_list\": \".musical.ly,.snssdk.com,.tiktok.com,.byteoversea.com,.tiktokv.com,.toutiao50.com,.xzcs3zlph.com,.mzfvozqybf.com,.qfyf1toi.com\",\n    \"ttnet_dispatch_actions\": [\n      {\n        \"act_priority\": 1,\n        \"action\": \"dispatch\",\n        \"param\": {\n          \"contain_group\": [\n            \"/service/2/device_sdk/stats_collect/\"\n          ],\n          \"dispatch_strategy\": 1,\n          \"host_group\": [\n            \"ib.snssdk.com\"\n          ],\n          \"service_name\": \"drop_device_sdk\",\n          \"strategy_info\": {\n            \"ib.snssdk.com\": \"unavailable.musical.ly\"\n          }\n        }\n      },\n      {\n        \"act_priority\": 2,\n        \"action\": \"dispatch\",\n        \"param\": {\n          \"contain_group\": [\n            \"/\"\n          ],\n          \"dispatch_strategy\": 1,\n          \"host_group\": [\n            \"ib.snssdk.com\",\n            \"i.snssdk.com\",\n            \"aweme.snssdk.com\",\n            \"amfr.snssdk.com\",\n            \"is.snssdk.com\",\n            \"mon.snssdk.com\"\n          ],\n          \"service_name\": \"regular_reqs\",\n          \"strategy_info\": {\n            \"amfr.snssdk.com\": \"api2.musical.ly\",\n            \"aweme.snssdk.com\": \"api2.musical.ly\",\n            \"i.snssdk.com\": \"api2.musical.ly\",\n            \"ib.snssdk.com\": \"api2.musical.ly\",\n            \"is.snssdk.com\": \"api2.musical.ly\",\n            \"mon.snssdk.com\": \"mon.musical.ly\"\n          }\n        }\n      },\n      {\n        \"act_priority\": 3,\n        \"action\": \"dispatch\",\n        \"param\": {\n          \"equal_group\": [\n            \"/ies/speed/\"\n          ],\n          \"host_group\": [\n            \"*\"\n          ]\n        },\n        \"service_name\": \"speed\",\n        \"set_req_priority\": 1000\n      },\n      {\n        \"act_priority\": 4,\n        \"action\": \"dispatch\",\n        \"param\": {\n          \"dispatch_strategy\": 1,\n          \"host_group\": [\n            \"mon.snssdk.com\",\n            \"ib.snssdk.com\"\n          ],\n          \"pattern_group\": [\n            \"/monitor/collect/\",\n            \"/monitor/appmonitor/v2/settings\",\n            \"/service/\\\\d+/device_sdk/stats_collect/\"\n          ],\n          \"service_name\": \"regular_reqs\",\n          \"strategy_info\": {\n            \"ib.snssdk.com\": \"unavailable.musical.ly\",\n            \"mon.snssdk.com\": \"mon.musical.ly\"\n          }\n        }\n      },\n      {\n        \"act_priority\": 5,\n        \"action\": \"dispatch\",\n        \"param\": {\n          \"contain_group\": [\n            \"/\"\n          ],\n          \"dispatch_strategy\": 1,\n          \"host_group\": [\n            \"api2.musical.ly\",\n            \"api2-16-h2.musical.ly\",\n            \"api2-19-h2.musical.ly\",\n            \"log2.musical.ly\",\n            \"applog.musical.ly\"\n          ],\n          \"service_name\": \"default\",\n          \"strategy_info\": {\n            \"api2-16-h2.musical.ly\": \"0pbxmo.xzcs3zlph.com\",\n            \"api2-19-h2.musical.ly\": \"0pbxmo.xzcs3zlph.com\",\n            \"api2.musical.ly\": \"0pbxmo.xzcs3zlph.com\",\n            \"applog.musical.ly\": \"log.xzcs3zlph.com\",\n            \"log2.musical.ly\": \"log.xzcs3zlph.com\"\n          }\n        }\n      }\n    ],\n    \"ttnet_enable_br\": 1,\n    \"ttnet_enable_cronet_request_report\": 1,\n    \"ttnet_h2_config\": {\n      \"ping_keepalive_hosts\": [\n        \"0pbxmo.xzcs3zlph.com:443\",\n        \"log.xzcs3zlph.com:443\"\n      ],\n      \"ping_keepalive_interval\": 60,\n      \"ping_probe_timeout\": 5\n    },\n    \"ttnet_http_dns_addr\": {\n      \"0pbxmo.xzcs3zlph.com\": \"199.103.24.2,199.103.24.4,199.103.24.6,199.103.24.8,130.44.212.132\"\n    },\n    \"ttnet_http_dns_enabled\": 1,\n    \"ttnet_http_dns_google\": 1,\n    \"ttnet_http_dns_prefer\": 0,\n    \"ttnet_local_dns_time_out\": 2,\n    \"ttnet_preconnect_urls\": {\n      \"http://p16.muscdn.com\": 3,\n      \"https://0pbxmo.xzcs3zlph.com\": 1,\n      \"https://dns.google\": 1\n    },\n    \"ttnet_prefer_dns_addr\": {\n      \"dns.google\": \"8.8.4.4,2001:4860:4860::8844,8.8.8.8,2001:4860:4860::8888\",\n      \"dns.google.com\": \"8.8.4.4,2001:4860:4860::8844,8.8.8.8,2001:4860:4860::8888\"\n    },\n    \"ttnet_request_retry_delay_interval_ms\": 500,\n    \"ttnet_request_retry_error_list\": [\n      -21,\n      -106,\n      -109,\n      -7,\n      -126\n    ],\n    \"ttnet_request_retry_max_attempts\": 20,\n    \"ttnet_socket_pool_param\": {\n      \"max_sockets_per_group\": 20,\n      \"used_idle_socket_timeout\": 90\n    },\n    \"ttnet_url_dispatcher_enabled\": 1\n  },\n  \"message\": \"success\"\n}";
        }
        if ("IN".equalsIgnoreCase(e) || "NP".equalsIgnoreCase(e) || "PK".equalsIgnoreCase(e) || "LK".equalsIgnoreCase(e)) {
            return "{\n  \"data\": {\n    \"chromium_open\": 1,\n    \"frontier_urls\": [\n      \"wss://frontier.tiktokv.com/ws/v2\"\n    ],\n    \"hs_open\": 1,\n    \"ok_http3_open\": 1,\n    \"ok_http_open\": 1,\n    \"send_tnc_host_arrays\": [\n      \"dm16.tiktokv.com\",\n      \"161.117.93.65\",\n      \"dm-sg-quic.byteoversea.com\",\n      \"dm16.musical.ly\"\n    ],\n    \"share_cookie_host_list\": \".musical.ly,.snssdk.com,.tiktok.com,.byteoversea.com,.tiktokv.com,.toutiao50.com,.xzcs3zlph.com,.mzfvozqybf.com,.qfyf1toi.com\",\n    \"ttnet_dispatch_actions\": [\n      {\n        \"act_priority\": 1,\n        \"action\": \"dispatch\",\n        \"param\": {\n          \"contain_group\": [\n            \"/service/2/device_sdk/stats_collect/\"\n          ],\n          \"dispatch_strategy\": 1,\n          \"host_group\": [\n            \"ib.snssdk.com\"\n          ],\n          \"service_name\": \"drop_device_sdk\",\n          \"strategy_info\": {\n            \"ib.snssdk.com\": \"unavailable.musical.ly\"\n          }\n        }\n      },\n      {\n        \"act_priority\": 2,\n        \"action\": \"dispatch\",\n        \"param\": {\n          \"contain_group\": [\n            \"/\"\n          ],\n          \"dispatch_strategy\": 1,\n          \"host_group\": [\n            \"ib.snssdk.com\",\n            \"i.snssdk.com\",\n            \"aweme.snssdk.com\",\n            \"amfr.snssdk.com\",\n            \"is.snssdk.com\",\n            \"mon.snssdk.com\"\n          ],\n          \"service_name\": \"regular_reqs\",\n          \"strategy_info\": {\n            \"amfr.snssdk.com\": \"api2.musical.ly\",\n            \"aweme.snssdk.com\": \"api2.musical.ly\",\n            \"i.snssdk.com\": \"api2.musical.ly\",\n            \"ib.snssdk.com\": \"api2.musical.ly\",\n            \"is.snssdk.com\": \"api2.musical.ly\",\n            \"mon.snssdk.com\": \"mon.musical.ly\"\n          }\n        }\n      },\n      {\n        \"act_priority\": 10000000,\n        \"action\": \"dispatch\",\n        \"param\": {\n          \"contain_group\": [\n            \"/api/ad/\",\n            \"/service/2/app_log/\"\n          ],\n          \"host_group\": [\n            \"*\"\n          ]\n        },\n        \"set_req_priority\": -1\n      },\n      {\n        \"act_priority\": 1,\n        \"action\": \"dispatch\",\n        \"param\": {\n          \"equal_group\": [\n            \"/ies/speed/\"\n          ],\n          \"host_group\": [\n            \"*\"\n          ]\n        },\n        \"service_name\": \"speed\",\n        \"set_req_priority\": 1000\n      },\n      {\n        \"act_priority\": 101,\n        \"action\": \"dispatch\",\n        \"param\": {\n          \"dispatch_strategy\": 5,\n          \"host_group\": [\n            \"api.tiktokv.com\",\n            \"api-h2.tiktokv.com\"\n          ],\n          \"pattern_group\": [\n            \"/aweme/v\\\\d+/feed/.*\",\n            \"/aweme/.*\",\n            \"/feedback/\\\\d+/list/.*\",\n            \"/feedback/\\\\d+/common_feedback_list/.*\",\n            \"/feedback/\\\\d+/post_message/.*\",\n            \"/2/data/upload_image/.*\",\n            \"/tfe/api/request_combine/v\\\\d+/\"\n          ],\n          \"service_name\": \"mt_dispatch\",\n          \"strategy_info\": {\n            \"candidates\": [\n              {\n                \"host\": \"api21-h2.tiktokv.com\",\n                \"weight\": 0\n              },\n              {\n                \"host\": \"api-h2.tiktokv.com\",\n                \"weight\": 0\n              }\n            ],\n            \"scheme_option\": 1,\n            \"working_mode\": 1\n          }\n        },\n        \"set_req_priority\": 1000\n      },\n      {\n        \"act_priority\": 102,\n        \"action\": \"dispatch\",\n        \"param\": {\n          \"dispatch_strategy\": 5,\n          \"host_group\": [\n            \"api2.musical.ly\",\n            \"aweme.snssdk.com\"\n          ],\n          \"pattern_group\": [\n            \"/aweme/v\\\\d+/feed/.*\",\n            \"/aweme/.*\",\n            \"/feedback/\\\\d+/list/.*\",\n            \"/feedback/\\\\d+/common_feedback_list/.*\",\n            \"/feedback/\\\\d+/post_message/.*\",\n            \"/2/data/upload_image/.*\",\n            \"/tfe/api/request_combine/v\\\\d+/\"\n          ],\n          \"service_name\": \"mt_dispatch\",\n          \"strategy_info\": {\n            \"candidates\": [\n              {\n                \"host\": \"api2-21-h2.musical.ly\",\n                \"weight\": 0\n              },\n              {\n                \"host\": \"api2-16-h2.musical.ly\",\n                \"weight\": 0\n              }\n            ],\n            \"scheme_option\": 1,\n            \"working_mode\": 1\n          }\n        },\n        \"set_req_priority\": 1000\n      },\n      {\n        \"act_priority\": 1001,\n        \"action\": \"dispatch\",\n        \"param\": {\n          \"contain_group\": [\n            \"/\"\n          ],\n          \"dispatch_strategy\": 1,\n          \"host_group\": [\n            \"api2.musical.ly\",\n            \"api.tiktokv.com\"\n          ],\n          \"service_name\": \"default\",\n          \"strategy_info\": {\n            \"api.tiktokv.com\": \"api-h2.tiktokv.com\",\n            \"api2.musical.ly\": \"api2-16-h2.musical.ly\"\n          }\n        }\n      },\n      {\n        \"act_priority\": 1002,\n        \"action\": \"dispatch\",\n        \"param\": {\n          \"dispatch_strategy\": 5,\n          \"host_group\": [\n            \"*.tiktokv.com\"\n          ],\n          \"pattern_group\": [\n            \"/aweme/v\\\\d+/feed/\",\n            \"/aweme/v\\\\d+/follow/feed/\",\n            \"/aweme/v\\\\d+/aweme/post/\",\n            \"/aweme/v\\\\d+/aweme/stats/\",\n            \"/aweme/v\\\\d+/user/\",\n            \"/aweme/v\\\\d+/user/profile/self/\",\n            \"/aweme/v\\\\d+/user/profile/other/\",\n            \"/aweme/v\\\\d+/create/aweme/\"\n          ],\n          \"service_name\": \"core_dispatch\",\n          \"strategy_info\": {\n            \"candidates\": [\n              {\n                \"host\": \"api-h2-eagle.tiktokv.com\",\n                \"weight\": 0\n              },\n              {\n                \"host\": \"api21-h2-eagle.tiktokv.com\",\n                \"weight\": 0\n              }\n            ],\n            \"scheme_option\": 1,\n            \"working_mode\": 1\n          }\n        }\n      },\n      {\n        \"act_priority\": 1003,\n        \"action\": \"dispatch\",\n        \"param\": {\n          \"dispatch_strategy\": 5,\n          \"host_group\": [\n            \"*.musical.ly\"\n          ],\n          \"pattern_group\": [\n            \"/aweme/v\\\\d+/feed/\",\n            \"/aweme/v\\\\d+/follow/feed/\",\n            \"/aweme/v\\\\d+/aweme/post/\",\n            \"/aweme/v\\\\d+/aweme/stats/\",\n            \"/aweme/v\\\\d+/user/\",\n            \"/aweme/v\\\\d+/user/profile/self/\",\n            \"/aweme/v\\\\d+/user/profile/other/\",\n            \"/aweme/v\\\\d+/create/aweme/\"\n          ],\n          \"service_name\": \"core_dispatch\",\n          \"strategy_info\": {\n            \"candidates\": [\n              {\n                \"host\": \"api2-16-h2-eagle.musical.ly\",\n                \"weight\": 0\n              },\n              {\n                \"host\": \"api2-21-h2-eagle.musical.ly\",\n                \"weight\": 0\n              }\n            ],\n            \"scheme_option\": 1,\n            \"working_mode\": 1\n          }\n        }\n      }\n    ],\n    \"ttnet_enable_br\": 1,\n    \"ttnet_enable_cronet_request_report\": 1,\n    \"ttnet_h2_config\": {\n      \"ping_keepalive_hosts\": [\n        \"api2-16-h2-eagle.musical.ly:443\",\n        \"api2-19-h2-eagle.musical.ly:443\",\n        \"api2-21-h2-eagle.musical.ly:443\",\n        \"api2-16-h2-eagle-useast2a.musical.ly:443\",\n        \"api2-19-h2-eagle-useast2a.musical.ly:443\",\n        \"api2-21-h2-eagle-useast2a.musical.ly:443\",\n        \"api-h2-eagle.tiktokv.com:443\",\n        \"api21-h2-eagle.tiktokv.com:443\"\n      ],\n      \"ping_keepalive_interval\": 60,\n      \"ping_probe_timeout\": 5\n    },\n    \"ttnet_http_dns_addr\": {\n      \"api-h2-eagle.tiktokv.com\": \"161.117.248.111,161.117.171.141,161.117.250.146\",\n      \"api-h2.tiktokv.com\": \"161.117.250.213,161.117.250.238,161.117.171.142,161.117.171.140\",\n      \"api.tiktokv.com\": \"161.117.250.213,161.117.250.238,161.117.171.142,161.117.171.140\",\n      \"api2-16-h2-eagle.musical.ly\": \"130.44.212.185,130.44.212.187\",\n      \"api2-16-h2.musical.ly\": \"47.252.73.241,47.252.81.112\",\n      \"api2-19-h2-eagle.musical.ly\": \"130.44.212.185,130.44.212.187\",\n      \"api2-19-h2.musical.ly\": \"47.252.50.157,47.252.50.101,47.252.50.100\",\n      \"api2.musical.ly\": \"47.252.50.157,47.252.50.101,47.252.50.100\",\n      \"api21-h2-eagle.tiktokv.com\": \"161.117.248.111,161.117.171.141,161.117.250.146\",\n      \"api21-h2.tiktokv.com\": \"161.117.250.213,161.117.250.238,161.117.171.142,161.117.171.140\",\n      \"applog.musical.ly\": \"47.252.50.157,47.252.50.101,47.252.50.100\",\n      \"i.byteoversea.com\": \"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\",\n      \"ichannel.musical.ly\": \"47.252.50.157,47.252.50.101,47.252.50.100\",\n      \"log.byteoversea.com\": \"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\",\n      \"log2.musical.ly\": \"65.222.200.18,204.237.142.195,23.221.72.17\"\n    },\n    \"ttnet_http_dns_enabled\": 1,\n    \"ttnet_http_dns_google\": 1,\n    \"ttnet_http_dns_prefer\": 0,\n    \"ttnet_local_dns_time_out\": 2,\n    \"ttnet_preconnect_urls\": {\n      \"http://p16.muscdn.com\": 3,\n      \"https://api-h2-eagle.tiktokv.com\": 1,\n      \"https://api-h2.tiktokv.com\": 1,\n      \"https://api2-16-h2-eagle.musical.ly\": 1,\n      \"https://api2-16-h2.musical.ly\": 1,\n      \"https://api2-19-h2-eagle.musical.ly\": 1,\n      \"https://api2-19-h2.musical.ly\": 1,\n      \"https://api2.musical.ly\": 1,\n      \"https://api21-h2-eagle.tiktokv.com\": 1,\n      \"https://api21-h2.tiktokv.com\": 1,\n      \"https://dns.google\": 1\n    },\n    \"ttnet_prefer_dns_addr\": {\n      \"dns.google\": \"8.8.4.4,2001:4860:4860::8844,8.8.8.8,2001:4860:4860::8888\",\n      \"dns.google.com\": \"8.8.4.4,2001:4860:4860::8844,8.8.8.8,2001:4860:4860::8888\"\n    },\n    \"ttnet_request_retry_delay_interval_ms\": 500,\n    \"ttnet_request_retry_error_list\": [\n      -21,\n      -106,\n      -109,\n      -7,\n      -126\n    ],\n    \"ttnet_request_retry_max_attempts\": 20,\n    \"ttnet_socket_pool_param\": {\n      \"max_sockets_per_group\": 20,\n      \"used_idle_socket_timeout\": 90\n    },\n    \"ttnet_url_dispatcher_enabled\": 1\n  },\n  \"message\": \"success\"\n}";
        }
        return "{\n  \"data\": {\n    \"chromium_open\": 1,\n    \"frontier_urls\": [\n      \"wss://frontier.byteoversea.com/ws/v2\"\n    ],\n    \"hs_open\": 1,\n    \"ok_http3_open\": 1,\n    \"ok_http_open\": 1,\n    \"send_tnc_host_arrays\": [\n      \"dm16.tiktokv.com\",\n      \"161.117.93.65\",\n      \"dm-sg-quic.byteoversea.com\",\n      \"dm16.musical.ly\"\n    ],\n    \"share_cookie_host_list\": \".tiktokv.com,.snssdk.com,.byteoversea.com,.tiktok.com,.toutiao50.com,.xzcs3zlph.com,.mzfvozqybf.com,.qfyf1toi.com,.musical.ly\",\n    \"ttnet_dispatch_actions\": [\n      {\n        \"act_priority\": 1,\n        \"action\": \"dispatch\",\n        \"param\": {\n          \"contain_group\": [\n            \"/service/2/device_sdk/stats_collect/\"\n          ],\n          \"dispatch_strategy\": 1,\n          \"host_group\": [\n            \"ib.snssdk.com\"\n          ],\n          \"service_name\": \"drop_device_sdk\",\n          \"strategy_info\": {\n            \"ib.snssdk.com\": \"unavailable.tiktokv.com\"\n          }\n        }\n      },\n      {\n        \"act_priority\": 2,\n        \"action\": \"dispatch\",\n        \"param\": {\n          \"contain_group\": [\n            \"/\"\n          ],\n          \"dispatch_strategy\": 1,\n          \"host_group\": [\n            \"ib.snssdk.com\",\n            \"i.snssdk.com\",\n            \"aweme.snssdk.com\",\n            \"amfr.snssdk.com\",\n            \"mon.snssdk.com\"\n          ],\n          \"service_name\": \"regular_reqs\",\n          \"strategy_info\": {\n            \"amfr.snssdk.com\": \"api.tiktokv.com\",\n            \"aweme.snssdk.com\": \"api.tiktokv.com\",\n            \"i.snssdk.com\": \"api.tiktokv.com\",\n            \"ib.snssdk.com\": \"api.tiktokv.com\",\n            \"mon.snssdk.com\": \"mon.tiktokv.com\"\n          }\n        }\n      },\n      {\n        \"act_priority\": 100002,\n        \"action\": \"dispatch\",\n        \"param\": {\n          \"dispatch_strategy\": 5,\n          \"host_group\": [\n            \"*\"\n          ],\n          \"pattern_group\": [\n            \"/aweme/v\\\\d+/feed/\",\n            \"/aweme/v\\\\d+/follow/feed/\",\n            \"/aweme/v\\\\d+/aweme/post/\",\n            \"/aweme/v\\\\d+/aweme/stats/\",\n            \"/aweme/v\\\\d+/user/\",\n            \"/aweme/v\\\\d+/user/profile/self/\",\n            \"/aweme/v\\\\d+/user/profile/other/\",\n            \"/aweme/v\\\\d+/create/aweme/\"\n          ],\n          \"service_name\": \"core_dispatch\",\n          \"strategy_info\": {\n            \"candidates\": [\n              {\n                \"host\": \"api21-h2-eagle.tiktokv.com\",\n                \"weight\": 0\n              },\n              {\n                \"host\": \"api-h2-eagle.tiktokv.com\",\n                \"weight\": 0\n              }\n            ],\n            \"scheme_option\": 1,\n            \"working_mode\": 1\n          }\n        }\n      },\n      {\n        \"act_priority\": 1,\n        \"action\": \"dispatch\",\n        \"param\": {\n          \"equal_group\": [\n            \"/ies/speed/\"\n          ],\n          \"host_group\": [\n            \"*\"\n          ]\n        },\n        \"service_name\": \"speed\",\n        \"set_req_priority\": 1000\n      },\n      {\n        \"act_priority\": 100,\n        \"action\": \"dispatch\",\n        \"param\": {\n          \"contain_group\": [\n            \"/\"\n          ],\n          \"dispatch_strategy\": 1,\n          \"host_group\": [\n            \"api.tiktokv.com\"\n          ],\n          \"strategy_info\": {\n            \"api.tiktokv.com\": \"api-h2.tiktokv.com\"\n          }\n        },\n        \"service_name\": \"default\",\n        \"set_req_priority\": 100\n      },\n      {\n        \"act_priority\": 101,\n        \"action\": \"dispatch\",\n        \"param\": {\n          \"dispatch_strategy\": 5,\n          \"host_group\": [\n            \"aweme.snssdk.com\",\n            \"api.amemv.com\",\n            \"api.tiktokv.com\",\n            \"api-h2.tiktokv.com\"\n          ],\n          \"pattern_group\": [\n            \"/aweme/v\\\\d+/feed/.*\",\n            \"/aweme/.*\",\n            \"/feedback/\\\\d+/list/.*\",\n            \"/feedback/\\\\d+/common_feedback_list/.*\",\n            \"/feedback/\\\\d+/post_message/.*\",\n            \"/2/data/upload_image/.*\",\n            \"/tfe/api/request_combine/v\\\\d+/\"\n          ],\n          \"service_name\": \"mt_dispatch\",\n          \"strategy_info\": {\n            \"candidates\": [\n              {\n                \"host\": \"api-h2.tiktokv.com\",\n                \"weight\": 0\n              },\n              {\n                \"host\": \"api21-h2.tiktokv.com\",\n                \"weight\": 0\n              }\n            ],\n            \"scheme_option\": 1,\n            \"working_mode\": 1\n          }\n        },\n        \"set_req_priority\": 1000\n      },\n      {\n        \"act_priority\": 103,\n        \"action\": \"dispatch\",\n        \"param\": {\n          \"dispatch_strategy\": 5,\n          \"host_group\": [\n            \"log.snssdk.com\",\n            \"api.tiktokv.com\",\n            \"aweme.snssdk.com\",\n            \"api.amemv.com\",\n            \"api-h2.tiktokv.com\"\n          ],\n          \"pattern_group\": [\n            \"/service/2/app_log/.*\"\n          ],\n          \"service_name\": \"mt_dispatch\",\n          \"strategy_info\": {\n            \"candidates\": [\n              {\n                \"host\": \"log16.byteoversea.com\",\n                \"weight\": 100\n              },\n              {\n                \"host\": \"log.byteoversea.com\",\n                \"weight\": 0\n              }\n            ],\n            \"scheme_option\": 1,\n            \"working_mode\": 1\n          }\n        },\n        \"set_req_priority\": 1000\n      }\n    ],\n    \"ttnet_enable_br\": 1,\n    \"ttnet_enable_cronet_request_report\": 1,\n    \"ttnet_h2_config\": {\n      \"ping_keepalive_hosts\": [\n        \"api21-h2-eagle.tiktokv.com:443\",\n        \"api-h2-eagle.tiktokv.com:443\"\n      ],\n      \"ping_keepalive_interval\": 60,\n      \"ping_probe_timeout\": 5\n    },\n    \"ttnet_http_dns_addr\": {\n      \"api-h2-eagle.tiktokv.com\": \"161.117.248.111,161.117.171.141,161.117.250.146\",\n      \"api-h2.tiktokv.com\": \"161.117.250.213,161.117.250.238,161.117.171.142,161.117.171.140\",\n      \"api.tiktokv.com\": \"161.117.250.213,161.117.250.238,161.117.171.142,161.117.171.140\",\n      \"api21-h2-eagle.tiktokv.com\": \"161.117.248.111,161.117.171.141,161.117.250.146\",\n      \"api21-h2.tiktokv.com\": \"161.117.250.213,161.117.250.238,161.117.171.142,161.117.171.140\",\n      \"i.byteoversea.com\": \"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\",\n      \"log.byteoversea.com\": \"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\"\n    },\n    \"ttnet_http_dns_enabled\": 1,\n    \"ttnet_http_dns_google\": 1,\n    \"ttnet_http_dns_prefer\": 0,\n    \"ttnet_local_dns_time_out\": 2,\n    \"ttnet_preconnect_urls\": {\n      \"https://api-h2-eagle.tiktokv.com\": 1,\n      \"https://api-h2.tiktokv.com\": 1,\n      \"https://api.tiktokv.com\": 3,\n      \"https://api21-h2-eagle.tiktokv.com\": 1,\n      \"https://api21-h2.tiktokv.com\": 1,\n      \"https://dns.google\": 1,\n      \"https://i.byteoversea.com\": 1,\n      \"https://log.byteoversea.com\": 1\n    },\n    \"ttnet_prefer_dns_addr\": {\n      \"dns.google\": \"8.8.4.4,2001:4860:4860::8844,8.8.8.8,2001:4860:4860::8888\",\n      \"dns.google.com\": \"8.8.4.4,2001:4860:4860::8844,8.8.8.8,2001:4860:4860::8888\"\n    },\n    \"ttnet_request_retry_delay_interval_ms\": 500,\n    \"ttnet_request_retry_error_list\": [\n      -21,\n      -106,\n      -109,\n      -7,\n      -126\n    ],\n    \"ttnet_request_retry_max_attempts\": 20,\n    \"ttnet_socket_pool_param\": {\n      \"max_sockets_per_group\": 20,\n      \"used_idle_socket_timeout\": 90\n    },\n    \"ttnet_url_dispatcher_enabled\": 1\n  },\n  \"message\": \"success\"\n}";
    }

    /* renamed from: a */
    public final void mo24892a(int i) {
        super.mo24892a(i);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i);
            jSONObject.put("counter", f96233d);
            jSONObject.put("event", "tt_network_status");
            jSONObject.put("scene", "network");
        } catch (JSONException unused) {
        }
        AppLog.recordMiscLog(C11010c.m22280a(), "app_perf", jSONObject);
        f96233d++;
    }

    public final void onServerConfigUpdated(String str) {
        super.onServerConfigUpdated(str);
        try {
            String[] split = new JSONObject(str).getJSONObject("data").getString("share_cookie_host_list").split(",");
            ArrayList arrayList = new ArrayList();
            for (String str2 : split) {
                if (str2.startsWith(ClassUtils.PACKAGE_SEPARATOR)) {
                    str2 = str2.substring(1);
                }
                arrayList.add(str2);
            }
            C18500a.m44770a((Collection<String>) arrayList);
            f96232c.append(str);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final void mo24893a(C9881f fVar) {
        int i;
        int i2;
        if (fVar.f26890a == 0) {
            Iterator it = fVar.f26896g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = 0;
                    i2 = 0;
                    break;
                }
                C9884c cVar = (C9884c) it.next();
                if (cVar != null) {
                    C9883b bVar = (C9883b) cVar;
                    if (bVar.f26914b == 200) {
                        i = 1;
                        i2 = bVar.f26921i;
                        break;
                    }
                }
            }
            C0013i.m16a((Callable<TResult>) new C37770f<TResult>(i, i2));
            C37793m.f96257c = false;
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m84355a(int i, int i2) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("detect_source", 0);
        jSONObject.put("network_status", i);
        jSONObject.put("detect_cost", i2);
        jSONObject.put(C50095d.f125472b, C37793m.f96258d);
        C26890h.m65014b("network_detect_result", jSONObject);
        return null;
    }

    public final void sendAppMonitorEvent(String str, String str2) {
        try {
            if (Logger.debug()) {
                StringBuilder sb = new StringBuilder("Get monitor json = ");
                sb.append(str);
                sb.append(" logType = ");
                sb.append(str2);
                Logger.m111346d("CronetDependAdapter", sb.toString());
            }
            C23131p.m57779a(str2, new JSONObject(str));
        } catch (Throwable unused) {
        }
    }
}
