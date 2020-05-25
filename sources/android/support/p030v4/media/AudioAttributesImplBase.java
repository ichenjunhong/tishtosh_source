package android.support.p030v4.media;

import java.util.Arrays;

/* renamed from: android.support.v4.media.AudioAttributesImplBase */
public final class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    int f2794a;

    /* renamed from: b */
    int f2795b;

    /* renamed from: c */
    int f2796c;

    /* renamed from: d */
    int f2797d = -1;

    AudioAttributesImplBase() {
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2795b), Integer.valueOf(this.f2796c), Integer.valueOf(this.f2794a), Integer.valueOf(this.f2797d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f2797d != -1) {
            sb.append(" stream=");
            sb.append(this.f2797d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f2794a;
        switch (i) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
            default:
                StringBuilder sb2 = new StringBuilder("unknown usage ");
                sb2.append(i);
                str = sb2.toString();
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f2795b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f2796c).toUpperCase());
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        int i;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f2795b == audioAttributesImplBase.f2795b) {
            int i2 = this.f2796c;
            int i3 = audioAttributesImplBase.f2796c;
            if (audioAttributesImplBase.f2797d == -1) {
                int i4 = audioAttributesImplBase.f2796c;
                int i5 = audioAttributesImplBase.f2794a;
                if ((i4 & 1) != 1) {
                    if ((i4 & 4) != 4) {
                        switch (i5) {
                            case 2:
                                i = 0;
                                break;
                            case 3:
                                i = 8;
                                break;
                            case 4:
                                i = 4;
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i = 5;
                                break;
                            case 6:
                                i = 2;
                                break;
                            case 11:
                                i = 10;
                                break;
                            case 13:
                                i = 1;
                                break;
                            default:
                                i = 3;
                                break;
                        }
                    } else {
                        i = 6;
                    }
                } else {
                    i = 7;
                }
            } else {
                i = audioAttributesImplBase.f2797d;
            }
            if (i == 6) {
                i3 |= 4;
            } else if (i == 7) {
                i3 |= 1;
            }
            if (i2 == (i3 & 273) && this.f2794a == audioAttributesImplBase.f2794a && this.f2797d == audioAttributesImplBase.f2797d) {
                return true;
            }
            return false;
        }
        return false;
    }
}
