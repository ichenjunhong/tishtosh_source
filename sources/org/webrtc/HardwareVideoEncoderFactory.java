package org.webrtc;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build.VERSION;
import com.p683ss.android.ugc.aweme.services.IFoundationAVService;
import java.util.ArrayList;
import org.webrtc.EglBase14.Context;

public class HardwareVideoEncoderFactory {
    private Context sharedContext;

    public RXVideoCodecDesc[] getSupportedCodecs() {
        if (VERSION.SDK_INT < 19) {
            return new RXVideoCodecDesc[0];
        }
        ArrayList arrayList = new ArrayList();
        RXVideoCodecStandard[] rXVideoCodecStandardArr = {RXVideoCodecStandard.H264};
        for (int i = 0; i <= 0; i++) {
            RXVideoCodecStandard rXVideoCodecStandard = rXVideoCodecStandardArr[0];
            MediaCodecInfo findCodecForType = findCodecForType(rXVideoCodecStandard);
            if (findCodecForType != null) {
                if (rXVideoCodecStandard == RXVideoCodecStandard.H264 && isH264HighProfileSupported(findCodecForType)) {
                    arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.ProfileHigh));
                }
                arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.ProfileBaseline));
            }
        }
        return (RXVideoCodecDesc[]) arrayList.toArray(new RXVideoCodecDesc[arrayList.size()]);
    }

    private boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo) {
        if (VERSION.SDK_INT > 23) {
            return true;
        }
        return false;
    }

    public void setHardwareContext(EglBase.Context context) {
        if (context instanceof Context) {
            this.sharedContext = (Context) context;
        }
    }

    private MediaCodecInfo findCodecForType(RXVideoCodecStandard rXVideoCodecStandard) {
        MediaCodecInfo mediaCodecInfo;
        for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
            } catch (IllegalArgumentException unused) {
                mediaCodecInfo = null;
            }
            if (mediaCodecInfo != null && mediaCodecInfo.isEncoder() && isSupportedCodec(mediaCodecInfo, rXVideoCodecStandard)) {
                return mediaCodecInfo;
            }
        }
        return null;
    }

    private int getKeyFrameIntervalSec(RXVideoCodecStandard rXVideoCodecStandard) {
        switch (rXVideoCodecStandard) {
            case H264:
                return 20;
            case H265:
                return 20;
            case VP8:
            case VP9:
                return 100;
            default:
                StringBuilder sb = new StringBuilder("Unsupported VideoCodecType ");
                sb.append(rXVideoCodecStandard);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    private boolean isHardwareSupportedInCurrentSdkH264(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.")) {
            if (VERSION.SDK_INT >= 19) {
                return true;
            }
            return false;
        } else if (name.startsWith("OMX.Exynos.")) {
            if (VERSION.SDK_INT >= 21) {
                return true;
            }
            return false;
        } else if (VERSION.SDK_INT >= 21) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isHardwareSupportedInCurrentSdkH265(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if ((!name.startsWith("OMX.qcom.") || VERSION.SDK_INT < 19) && (!name.startsWith("OMX.Exynos.") || VERSION.SDK_INT < 21)) {
            return false;
        }
        return true;
    }

    public VideoEncoder createEncoder(RXVideoCodecDesc rXVideoCodecDesc) {
        if (VERSION.SDK_INT < 19) {
            return null;
        }
        RXVideoCodecStandard standard = rXVideoCodecDesc.getStandard();
        MediaCodecInfo findCodecForType = findCodecForType(standard);
        if (findCodecForType == null) {
            return null;
        }
        String name = findCodecForType.getName();
        String mimeType = standard.mimeType();
        RXVideoCodecDesc rXVideoCodecDesc2 = rXVideoCodecDesc;
        HardwareVideoEncoder hardwareVideoEncoder = new HardwareVideoEncoder(new MediaCodecWrapperFactoryImpl(), name, rXVideoCodecDesc2, MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, findCodecForType.getCapabilitiesForType(mimeType)), MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, findCodecForType.getCapabilitiesForType(mimeType)), getKeyFrameIntervalSec(standard), getForcedKeyFrameIntervalMs(standard, name), this.sharedContext);
        return hardwareVideoEncoder;
    }

    private boolean isHardwareSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard) {
        switch (rXVideoCodecStandard) {
            case H264:
                return isHardwareSupportedInCurrentSdkH264(mediaCodecInfo);
            case H265:
                return isHardwareSupportedInCurrentSdkH265(mediaCodecInfo);
            default:
                return false;
        }
    }

    private boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard) {
        if (!MediaCodecUtils.codecSupportsType(mediaCodecInfo, rXVideoCodecStandard)) {
            return false;
        }
        try {
            if (MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(rXVideoCodecStandard.mimeType())) == null) {
                return false;
            }
            return isHardwareSupportedInCurrentSdk(mediaCodecInfo, rXVideoCodecStandard);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    private int getForcedKeyFrameIntervalMs(RXVideoCodecStandard rXVideoCodecStandard, String str) {
        if (rXVideoCodecStandard == RXVideoCodecStandard.VP8 && str.startsWith("OMX.qcom.")) {
            if (VERSION.SDK_INT == 21 || VERSION.SDK_INT == 22) {
                return IFoundationAVService.MUSIC_LENGTH_FOR_COPYRIGHT;
            }
            if (VERSION.SDK_INT == 23) {
                return 20000;
            }
            if (VERSION.SDK_INT > 23) {
                return IFoundationAVService.MUSIC_LENGTH_FOR_COPYRIGHT;
            }
        }
        return 0;
    }
}
