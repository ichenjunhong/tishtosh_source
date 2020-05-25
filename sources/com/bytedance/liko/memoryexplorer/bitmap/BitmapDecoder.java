package com.bytedance.liko.memoryexplorer.bitmap;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

public class BitmapDecoder {
    protected static final Map<String, BitmapExtractor> SUPPORTED_FORMATS;

    static class ALPHA8BitmapExtractor implements BitmapExtractor {
        private ALPHA8BitmapExtractor() {
        }

        public BufferedImage getImage(int i, int i2, byte[] bArr) {
            BufferedImage bufferedImage = new BufferedImage(i, i2, 2);
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i3 * i;
                for (int i5 = 0; i5 < i; i5++) {
                    bufferedImage.setRGB(i5, i3, (bArr[i4 + i5] << 24) | 16711680 | 65280 | NormalGiftView.ALPHA_255);
                }
            }
            return bufferedImage;
        }
    }

    static class ARGB8888BitmapExtractor implements BitmapExtractor {
        private ARGB8888BitmapExtractor() {
        }

        public BufferedImage getImage(int i, int i2, byte[] bArr) {
            int i3 = i;
            int i4 = i2;
            BufferedImage bufferedImage = new BufferedImage(i3, i4, 2);
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = i5 * i3;
                for (int i7 = 0; i7 < i3; i7++) {
                    int i8 = (i6 + i7) * 4;
                    bufferedImage.setRGB(i7, i5, (int) ((0 | ((((long) bArr[i8]) & 255) << 16) | ((((long) bArr[i8 + 1]) & 255) << 8) | (((long) bArr[i8 + 2]) & 255) | ((((long) bArr[i8 + 3]) & 255) << 24)) & 4294967295L));
                }
            }
            return bufferedImage;
        }
    }

    public interface BitmapDataProvider {
        String getBitmapConfigName();

        Dimension getDimension();

        byte[] getPixelBytes();
    }

    interface BitmapExtractor {
        BufferedImage getImage(int i, int i2, byte[] bArr);
    }

    static class RGB565BitmapExtractor implements BitmapExtractor {
        private RGB565BitmapExtractor() {
        }

        public BufferedImage getImage(int i, int i2, byte[] bArr) {
            BufferedImage bufferedImage = new BufferedImage(i, i2, 2);
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i3 * i;
                for (int i5 = 0; i5 < i; i5++) {
                    int i6 = (i4 + i5) * 2;
                    byte b = ((bArr[i6 + 1] << 8) & 65280) | (bArr[i6] & 255);
                    bufferedImage.setRGB(i5, i3, (((b & 31) * 255) / 31) | (((((b >>> 11) & 31) * NormalGiftView.ALPHA_255) / 31) << 16) | -16777216 | (((((b >>> 5) & 63) * NormalGiftView.ALPHA_255) / 63) << 8));
                }
            }
            return bufferedImage;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        SUPPORTED_FORMATS = hashMap;
        hashMap.put("ARGB_8888", new ARGB8888BitmapExtractor());
        SUPPORTED_FORMATS.put("RGB_565", new RGB565BitmapExtractor());
        SUPPORTED_FORMATS.put("ALPHA_8", new ALPHA8BitmapExtractor());
    }

    public static BufferedImage decode(BitmapDataProvider bitmapDataProvider) {
        String bitmapConfigName = bitmapDataProvider.getBitmapConfigName();
        if (bitmapConfigName != null) {
            BitmapExtractor bitmapExtractor = (BitmapExtractor) SUPPORTED_FORMATS.get(bitmapConfigName);
            if (bitmapExtractor != null) {
                Dimension dimension = bitmapDataProvider.getDimension();
                if (dimension != null) {
                    if (dimension.width > 1024 || dimension.height > 1024) {
                        dimension = bitmapDataProvider.getDimension();
                        if (dimension == null) {
                            throw new RuntimeException("Unable to obtained scaled bitmap's dimensions");
                        }
                    }
                    return bitmapExtractor.getImage(dimension.width, dimension.height, bitmapDataProvider.getPixelBytes());
                }
                throw new RuntimeException("Unable to determine image dimensions.");
            }
            StringBuilder sb = new StringBuilder("Unsupported bitmap configuration: ");
            sb.append(bitmapConfigName);
            throw new RuntimeException(sb.toString());
        }
        throw new RuntimeException("Unable to determine bitmap configuration");
    }
}
