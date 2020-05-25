package com.bytedance.android.live.wallet;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.C0649f;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.C3008h;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.IWalletService.C4283a;
import com.bytedance.android.live.wallet.api.C4297c;
import com.bytedance.android.live.wallet.api.C4299e;
import com.bytedance.android.live.wallet.api.C4300f;
import com.bytedance.android.live.wallet.api.C4301g;
import com.bytedance.android.live.wallet.api.C4302h;
import com.bytedance.android.live.wallet.api.C4303i;
import com.bytedance.android.live.wallet.api.WalletApi;
import com.bytedance.android.live.wallet.model.FirstChargeCheck;
import com.bytedance.android.live.wallet.p260c.C4337b;
import com.bytedance.android.live.wallet.p260c.C4356i;
import com.bytedance.android.live.wallet.p261d.C4384a;
import com.bytedance.android.live.wallet.p261d.C4387b;
import com.bytedance.android.live.wallet.p262e.C4412e;
import com.bytedance.android.live.wallet.p264g.p265a.C4425a;
import com.bytedance.android.live.wallet.p264g.p265a.C4427c;
import com.bytedance.android.live.wallet.p264g.p266b.C4450a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.android.livesdkapi.depend.live.C8664n;
import com.bytedance.android.livesdkapi.depend.live.ILiveWalletService;
import com.bytedance.android.livesdkapi.depend.model.C8685b;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostWallet;
import com.bytedance.android.livesdkapi.host.IHostWallet.C8770a;
import com.bytedance.android.livesdkapi.host.IHostWallet.C8772c;
import com.bytedance.android.livesdkapi.host.IHostWallet.C8773d;
import com.bytedance.android.livesdkapi.host.IHostWallet.C8775f;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.Map;
import org.json.JSONObject;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;

public class WalletService implements IWalletService {
    private IHostWallet iHostWallet;

    private static String getBannerUrl(DataCenter dataCenter) {
        return null;
    }

    public Dialog getPayDialog(Context context, int i, Bundle bundle, ChargeDeal chargeDeal) {
        return null;
    }

    public C4311b walletCenter() {
        return C4405a.f12050a;
    }

    public String getCJAppId() {
        return this.iHostWallet.getCJAppId();
    }

    public String getCJMerchantId() {
        return this.iHostWallet.getCJMerchantId();
    }

    public Map<String, String> getHostWalletSetting() {
        return this.iHostWallet.getHostWalletSetting();
    }

    public void setCJStatisticCallback() {
        C4303i iVar = (C4303i) C4285a.m10552a(C4303i.class);
        if (iVar != null) {
            iVar.mo10074a();
        }
    }

    public int getRechargeType() {
        if (((Integer) LiveSettingKeys.LIVE_RECHARGE_DIALOG_TYPE.mo9431a()).intValue() == 0) {
            return 2;
        }
        return 3;
    }

    public C2201v<C4177d<FirstChargeCheck>> isFirstCharge() {
        return ((WalletApi) C4157e.m10322a().mo9550a(WalletApi.class)).isFirstCharge().mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a());
    }

    public C8770a getBillingClient(C8775f fVar) {
        return this.iHostWallet.getBillingClient(fVar);
    }

    public LiveActivityProxy getLiveBillingActivityProxy(FragmentActivity fragmentActivity) {
        return new LiveBillingActivityProxy(fragmentActivity);
    }

    public WalletService(IHostWallet iHostWallet2) {
        this.iHostWallet = iHostWallet2;
        C4116c.m10251a(IWalletService.class, this);
        C4116c.m10251a(ILiveWalletService.class, this);
    }

    public void startCJBackgroundTask(Context context) {
        C4303i iVar = (C4303i) C4285a.m10552a(C4303i.class);
        if (iVar != null) {
            iVar.mo10076a(context);
        }
    }

    public void openWallet(Activity activity) {
        if (((Boolean) LiveSettingKeys.LIVE_MT_USER_CAN_RECHARGE.mo9431a()).booleanValue()) {
            ((IHostApp) C4116c.m10249a(IHostApp.class)).openWallet(activity);
        }
    }

    public int isFirstConsume(C3009i iVar) {
        if (iVar.getUserHonor() == null || iVar.getUserHonor().mo8161p() == null || iVar.getUserHonor().mo8161p().size() <= 1 || iVar.getUserHonor().mo8161p().get(1) == null || ((C3008h) iVar.getUserHonor().mo8161p().get(1)).f8846d != 0) {
            return 0;
        }
        return 1;
    }

    public void openBillingProxyActivity(Context context, Bundle bundle) {
        this.iHostWallet.openBillingProxyActivity(context, bundle);
    }

    public Fragment getDiamondRechargeFragment(Context context, Bundle bundle) {
        C4387b bVar = new C4387b();
        if (bundle != null) {
            bVar.setArguments(bundle);
        }
        return bVar;
    }

    public Fragment getFirstChargeRewardFragment(int i, int i2) {
        C4384a aVar = new C4384a();
        aVar.f12004a = i;
        aVar.f12005b = i2;
        return aVar;
    }

    public void setTTCJPayHost(Context context, String str) {
        C4303i iVar = (C4303i) C4285a.m10552a(C4303i.class);
        if (iVar != null) {
            iVar.mo10077a(context, str);
        }
    }

    public C0649f getFirstChargeDealFragment(Context context, Bundle bundle) {
        C4299e eVar = (C4299e) C4285a.m10552a(C4299e.class);
        if (eVar != null) {
            return eVar.mo10072a(context, bundle);
        }
        return null;
    }

    public Fragment getWalletFragment(Context context, Bundle bundle) {
        C4300f fVar = (C4300f) C4285a.m10552a(C4300f.class);
        if (fVar != null) {
            return fVar.mo10073a(context, bundle);
        }
        return null;
    }

    public void payWithWX(Context context, C8685b bVar, C8773d dVar) {
        this.iHostWallet.payWithWX(context, bVar, dVar);
    }

    public C0649f createRechargeDialogFragment(FragmentActivity fragmentActivity, C8664n nVar, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        return C4356i.m10651a(fragmentActivity, bundle, null, null, nVar);
    }

    public void payWithAli(Activity activity, C8685b bVar, C8773d dVar) {
        if (((C4301g) C4285a.m10552a(C4301g.class)) == null) {
            this.iHostWallet.payWithAli(activity, bVar, dVar);
        }
    }

    public void verifyWithAli(Activity activity, String str, C8772c cVar) {
        if (((C4302h) C4285a.m10552a(C4302h.class)) == null) {
            this.iHostWallet.verifyWithAli(activity, str, cVar);
        }
    }

    public C0649f showRechargeDialog(FragmentActivity fragmentActivity, Bundle bundle, DataCenter dataCenter, C4335c cVar) {
        if (((Boolean) LiveSettingKeys.HIDE_CHARGE_ICON_FOR_USER.mo9431a()).booleanValue() || !((Boolean) LiveSettingKeys.LIVE_MT_USER_CAN_RECHARGE.mo9431a()).booleanValue()) {
            return null;
        }
        bundle.getString(IWalletService.KEY_BUNDLE_CHARGE_REASON);
        boolean z = true;
        if (!bundle.containsKey(IWalletService.KEY_BUNDLE_BANNER_URL) || TextUtils.isEmpty(bundle.getString(IWalletService.KEY_BUNDLE_BANNER_URL))) {
            String bannerUrl = getBannerUrl(dataCenter);
            z = true ^ TextUtils.isEmpty(bannerUrl);
            bundle.putString(IWalletService.KEY_BUNDLE_BANNER_URL, bannerUrl);
        }
        bundle.putInt(IWalletService.KEY_BUNDLE_CHARGE_TYPE, z ? 1 : 0);
        C4356i a = C4356i.m10651a(fragmentActivity, bundle, dataCenter, cVar, null);
        if (fragmentActivity.getSupportFragmentManager().mo2224a("RechargeDialog") != null) {
            return null;
        }
        a.show(fragmentActivity.getSupportFragmentManager(), "RechargeDialog");
        return a;
    }

    public Dialog getConsumeDialog(Activity activity, Bundle bundle, JSONObject jSONObject, C4283a aVar, String str) {
        C4337b bVar = new C4337b(activity, bundle.getString(IWalletService.KEY_BUNDLE_REQUEST_PAGE));
        C4383d a = new C4412e(jSONObject).mo10218a();
        if (a != null) {
            bVar.mo10125a(a);
        }
        bVar.f11888i = aVar;
        bVar.mo10129a(str);
        return bVar;
    }

    public C4425a getBasePayPresenter(Activity activity, C4297c cVar, String str, String str2, int i, C4450a aVar) {
        C4427c cVar2 = new C4427c(activity, cVar, str, str2, i);
        cVar2.mo8520a(aVar);
        return cVar2;
    }
}
