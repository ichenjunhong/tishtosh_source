package com.p683ss.ttvideoengine.debug;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.ttvideoengine.TTVideoEngine;
import com.p683ss.ttvideoengine.log.EventLoggerSource;
import com.p683ss.ttvideoengine.model.VideoModel;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.debug.InfoHudViewHolder */
public class InfoHudViewHolder implements InfoHudViewHolderInterface {
    private StringBuilder mBuilder;
    private EventLoggerSource mDataSource;
    private InfoLayoutBinder mInfoLayoutBinder;
    private InfoHandler mInfonHandler;
    private SparseArray<View> mRowMap = new SparseArray<>();
    public volatile boolean mStop;
    private TTVideoEngine mVideoEngine;

    /* renamed from: com.ss.ttvideoengine.debug.InfoHudViewHolder$InfoHandler */
    static class InfoHandler extends Handler {
        private WeakReference<InfoHudViewHolder> holderWeakReference;

        InfoHandler(InfoHudViewHolder infoHudViewHolder) {
            this.holderWeakReference = new WeakReference<>(infoHudViewHolder);
        }

        public void handleMessage(Message message) {
            InfoHudViewHolder infoHudViewHolder;
            if (this.holderWeakReference != null) {
                infoHudViewHolder = (InfoHudViewHolder) this.holderWeakReference.get();
            } else {
                infoHudViewHolder = null;
            }
            if (infoHudViewHolder != null && message.what == 1) {
                infoHudViewHolder.showInfo();
                removeMessages(1);
                if (!infoHudViewHolder.mStop) {
                    sendEmptyMessageDelayed(1, 1000);
                }
            }
        }
    }

    private String getDnsTypeStr(int i) {
        switch (i) {
            case 0:
                return "local";
            case 1:
                return "aliHttpdns";
            case 2:
                return "ttHttpDns";
            default:
                return "";
        }
    }

    public void showInfo() {
        String str;
        String str2;
        String str3;
        if (!(this.mVideoEngine == null || this.mDataSource == null)) {
            Map versionInfo = this.mDataSource.versionInfo();
            if (versionInfo != null) {
                setRowValue(0, R.string.hbt, (String) versionInfo.get("sdk_version"));
                setRowValue(0, R.string.gx8, (String) versionInfo.get("pc"));
            }
            boolean isDashSource = this.mVideoEngine.isDashSource();
            if (isDashSource) {
                str = "dash";
            } else {
                str = "mp4";
            }
            setRowValue(3, R.string.gge, str);
            VideoModel videoModel = this.mVideoEngine.getVideoModel();
            if (videoModel != null) {
                setRowValue(0, R.string.hvm, videoModel.getVideoRefStr(2));
                if (isDashSource) {
                    setRowValue(3, R.string.ga_, videoModel.getDynamicType());
                } else {
                    setRowValue(3, R.string.ga_, "非dash源");
                }
            }
            setRowValue(0, R.string.gnf, this.mDataSource.getLogValueStr(5));
            setRowValue(0, R.string.fm0, this.mDataSource.getLogValueStr(3));
            setRowValue(0, R.string.fmv, this.mDataSource.getLogValueStr(29));
            setRowValue(0, R.string.cpk, this.mVideoEngine.getCurrentPlayPath());
            if (videoModel != null) {
                JSONObject jsonInfo = videoModel.getJsonInfo();
                if (jsonInfo != null) {
                    setRowValue(0, R.string.hvp, jsonInfo.toString());
                }
                setRowValue(1, R.string.g2d, this.mVideoEngine.getCurrentResolution().toString(videoModel.getVideoRefInt(7)));
            } else {
                setRowValue(0, R.string.hvp, null);
            }
            setRowValue(1, R.string.h_w, this.mDataSource.getLogValueStr(1));
            setRowValue(1, R.string.fvj, this.mDataSource.getLogValueStr(0));
            setRowValue(1, R.string.fqd, String.valueOf(this.mVideoEngine.getIntOption(54)));
            setRowValue(1, R.string.fqc, String.valueOf(this.mVideoEngine.getIntOption(41)));
            setRowValue(1, R.string.gxr, String.valueOf(this.mVideoEngine.getIntOption(55)));
            setRowValue(1, R.string.gri, String.valueOf(this.mVideoEngine.getIntOption(56)));
            setRowValue(1, R.string.sv, String.valueOf(this.mVideoEngine.getLongOption(60)));
            setRowValue(1, R.string.hwk, String.valueOf(this.mVideoEngine.getVideoWidth()));
            setRowValue(1, R.string.gi6, String.valueOf(this.mVideoEngine.getVideoHeight()));
            setRowValue(1, R.string.grj, String.valueOf(this.mVideoEngine.getIntOption(51)));
            Map bytesInfo = this.mDataSource.bytesInfo();
            if (bytesInfo != null) {
                int intValue = ((Long) bytesInfo.get("vlen")).intValue();
                int intValue2 = ((Long) bytesInfo.get("alen")).intValue();
                StringBuilder sb = new StringBuilder();
                sb.append(intValue);
                sb.append("ms");
                setRowValue(1, R.string.hvo, sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(intValue2);
                sb2.append("ms");
                setRowValue(1, R.string.fmu, sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.mVideoEngine.getFloatOption(461));
            sb3.append("B");
            setRowValue(1, R.string.hw1, sb3.toString());
            setRowValue(1, R.string.fzf, String.valueOf(this.mVideoEngine.getFloatOption(70)));
            Float valueOf = Float.valueOf(this.mVideoEngine.getFloatOption(NormalGiftView.MASK_TRANSLATE_VALUE));
            if (((double) valueOf.floatValue()) > ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
                setRowValue(1, R.string.gx4, String.valueOf(valueOf));
            }
            if (this.mDataSource.getLogValueInt(24) == 2) {
                str2 = "硬解";
            } else {
                str2 = "软解";
            }
            setRowValue(1, R.string.hvb, str2);
            if (this.mDataSource.getLogValueInt(25) == 4096) {
                str3 = "AAC";
            } else {
                str3 = "其他";
            }
            setRowValue(1, R.string.fmp, str3);
            setRowValue(1, R.string.g_t, String.valueOf(this.mVideoEngine.getIntOption(42)));
            setRowValue(1, R.string.hv7, String.valueOf(this.mDataSource.getLogValueInt(42)));
            setRowValue(1, R.string.fj1, String.valueOf(this.mDataSource.getLogValueInt(43)));
            setRowValue(1, R.string.hw2, String.valueOf(this.mDataSource.getLogValueInt(44)));
            setRowValue(1, R.string.fvh, String.valueOf(this.mDataSource.getLogValueLong(45)));
            setRowValue(0, R.string.aub, String.valueOf(this.mVideoEngine.getIntOption(50)));
            long logValueLong = this.mDataSource.getLogValueLong(41) - this.mDataSource.getLogValueLong(40);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(logValueLong);
            sb4.append("ms");
            setRowValue(2, R.string.gfl, sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.mVideoEngine.getWatchedDuration());
            sb5.append("ms");
            setRowValue(2, R.string.hw9, sb5.toString());
            setRowValue(2, R.string.gxq, TimeStamp2Date(Long.valueOf(this.mDataSource.getLogValueLong(40))));
            setRowValue(2, R.string.hw6, TimeStamp2Date(Long.valueOf(this.mDataSource.getLogValueLong(41))));
            setRowValue(2, R.string.g6e, TimeStamp2Date(Long.valueOf(this.mDataSource.getLogValueLong(7))));
            setRowValue(2, R.string.hoc, TimeStamp2Date(Long.valueOf(this.mDataSource.getLogValueLong(10))));
            setRowValue(2, R.string.hod, TimeStamp2Date(Long.valueOf(this.mDataSource.getLogValueLong(11))));
            setRowValue(2, R.string.h8i, TimeStamp2Date(Long.valueOf(this.mDataSource.getLogValueLong(12))));
            setRowValue(2, R.string.h8h, TimeStamp2Date(Long.valueOf(this.mDataSource.getLogValueLong(13))));
            setRowValue(2, R.string.hvj, TimeStamp2Date(Long.valueOf(this.mDataSource.getLogValueLong(17))));
            setRowValue(2, R.string.fms, TimeStamp2Date(Long.valueOf(this.mDataSource.getLogValueLong(16))));
            setRowValue(2, R.string.hvk, TimeStamp2Date(Long.valueOf(this.mDataSource.getLogValueLong(19))));
            setRowValue(2, R.string.fmt, TimeStamp2Date(Long.valueOf(this.mDataSource.getLogValueLong(18))));
            setRowValue(2, R.string.g37, TimeStamp2Date(Long.valueOf(this.mDataSource.getLogValueLong(14))));
            setRowValue(2, R.string.g36, TimeStamp2Date(Long.valueOf(this.mDataSource.getLogValueLong(15))));
            setRowValue(2, R.string.h3j, TimeStamp2Date(Long.valueOf(this.mDataSource.getLogValueLong(38))));
            setRowValue(0, R.string.gs4, this.mDataSource.getMediaLoaderInfo());
            setRowValue(0, R.string.gc7, this.mDataSource.getLogValueStr(46));
            setRowValue(0, R.string.gtz, this.mDataSource.getLogValueStr(4));
            setRowValue(3, R.string.hk9, this.mVideoEngine.getStringOption(477));
            setRowValue(3, R.string.g2e, String.valueOf(this.mDataSource.getLogValueInt(26)));
            setRowValue(3, R.string.gng, String.valueOf(this.mDataSource.getLogValueInt(27)));
            setRowValue(3, R.string.g31, String.valueOf(this.mVideoEngine.getIntOption(160)));
            setRowValue(3, R.string.gx5, String.valueOf(this.mVideoEngine.getIntOption(301)));
            setRowValue(3, R.string.ggd, String.valueOf(this.mVideoEngine.getIntOption(302)));
            setRowValue(3, R.string.hbh, String.valueOf(this.mVideoEngine.getIntOption(26)));
            setRowValue(3, R.string.gom, String.valueOf(this.mVideoEngine.getIntOption(4)));
            String[] strArr = {"local", "ttHttpDns"};
            int[] dNSType = TTVideoEngine.getDNSType();
            if (dNSType != null && dNSType.length > 0) {
                for (int i = 0; i < dNSType.length; i++) {
                    strArr[i] = getDnsTypeStr(dNSType[i]);
                }
            } else if (TTVideoEngine.isHttpDnsFirst()) {
                strArr[0] = "ttHttpDns";
                strArr[1] = "local";
            }
            setRowValue(3, R.string.g6g, Arrays.toString(strArr));
            setRowValue(3, R.string.g6f, this.mVideoEngine.getStringOption(462));
            setRowValue(3, R.string.g2x, String.valueOf(this.mVideoEngine.getIntOption(29)));
            setRowValue(3, R.string.foh, String.valueOf(this.mVideoEngine.getIntOption(33)));
            int intOption = this.mVideoEngine.getIntOption(313);
            setRowValue(3, R.string.gi8, String.valueOf(intOption));
            String[] strArr2 = {"local", "ttHttpDns"};
            strArr2[0] = getDnsTypeStr(this.mVideoEngine.getIntOption(424));
            strArr2[1] = getDnsTypeStr(this.mVideoEngine.getIntOption(425));
            setRowValue(3, R.string.gi9, Arrays.toString(strArr2));
            this.mBuilder = new StringBuilder();
            if (isDashSource && intOption == 0) {
                this.mBuilder.append("没有打开劫持检测开关!");
            }
            String sb6 = this.mBuilder.toString();
            if (!TextUtils.isEmpty(sb6)) {
                setRowValue(3, R.string.g3e, sb6);
                return;
            }
            setRowValue(3, R.string.g3e, "开关检测无异常");
        }
    }

    public void setVideoEngine(TTVideoEngine tTVideoEngine) {
        this.mVideoEngine = tTVideoEngine;
        this.mDataSource = tTVideoEngine.getVideoEngineDataSource();
    }

    public static String TimeStamp2Date(Long l) {
        return new SimpleDateFormat("HH:mm:ss:SSS", Locale.CHINA).format(new Date(l.longValue()));
    }

    public void monitor(boolean z) {
        this.mStop = !z;
        if (z) {
            this.mInfonHandler.sendEmptyMessageDelayed(1, 1000);
        } else {
            this.mInfonHandler.removeMessages(1);
        }
    }

    public InfoHudViewHolder(ViewGroup viewGroup) {
        this.mInfoLayoutBinder = new InfoLayoutBinder(viewGroup.getContext());
        viewGroup.addView(this.mInfoLayoutBinder.buildLayout(), new LayoutParams(-1, -1));
        this.mInfonHandler = new InfoHandler(this);
    }

    private void setRowValue(int i, int i2, String str) {
        View view = (View) this.mRowMap.get(i2);
        if (view == null) {
            this.mRowMap.put(i2, this.mInfoLayoutBinder.appendRow(i, i2, str));
            return;
        }
        this.mInfoLayoutBinder.updateText(i, view, i2, str);
    }
}
