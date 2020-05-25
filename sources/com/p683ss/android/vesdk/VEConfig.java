package com.p683ss.android.vesdk;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.vesdk.VEConfig */
public class VEConfig {
    public static int VE_CONFIG_ENABLE_EFFECT_CANVAS = 8;
    public static int VE_CONFIG_ENABLE_HIGH_SPEED = 9;
    public static int VE_CONFIG_INPUT_REFACTOR = 22;
    public static int VE_CONFIG_LOW_PHONE_OPT = 7;
    public static int VE_CONFIG_OPEN_EDITOR_FPS_LOG = 12;
    public static int VE_CONFIG_OPEN_PRELOAD_OPT = 2;
    public static int VE_CONFIG_OPEN_SEEKTIME_OPT = 3;
    public static int VE_CONFIG_SET_AUTO_PREPARE = 10;
    public static int VE_CONFIG_SET_EFFECT_FORCE_DETECT_FACE = 19;
    public static int VE_CONFIG_SET_ENABLE_EFFECT_TRANSITION = 17;
    public static int VE_CONFIG_SET_ENABLE_STICKER_AMAZING = 20;
    public static int VE_CONFIG_SET_FORCE_DROP_FRAME_WITHOUT_AUDIO = 14;
    public static int VE_CONFIG_SET_IMAGE_BUFFER_LIMIT = 13;
    public static int VE_CONFIG_SET_INFO_STICKER_TRANS_ENABLE = 18;
    public static int VE_CONFIG_SET_MAX_AUDIO_READER_LIMITS = 15;
    public static int VE_CONFIG_SET_MAX_VIDEOREADER_LIMITS = 11;
    public static int VE_CONFIG_SET_RESOURCE_FINDER = 21;
    public static int VE_CONFIG_SET_TEXTURE_POOL_LIMIT = 16;
    public static int VE_CONFIG_USE_GAUSSIAN_OPT = 5;
    public static int VE_CONFIG_USE_IMAGE_ALLOCATOR = 0;
    public static int VE_CONFIG_USE_MULTI_EFFECT_OPT = 4;
    public static int VE_CONFIG_USE_NEW_ENGINE_EFFECT_OPT = 6;
    public static int VE_CONFIG_USE_PLAYBACK_SEEKOPT = 1;
    private ArrayList<VEConfigItem> configs = new ArrayList<>();

    public ArrayList<VEConfigItem> getConfigs() {
        return this.configs;
    }

    public void addConfigItem(VEConfigItem vEConfigItem) {
        this.configs.add(vEConfigItem);
    }

    public boolean hasConfig(int i) {
        Iterator it = this.configs.iterator();
        while (it.hasNext()) {
            if (((VEConfigItem) it.next()).getId() == i) {
                return true;
            }
        }
        return false;
    }

    public boolean configIsOpen(int i) {
        Iterator it = this.configs.iterator();
        while (it.hasNext()) {
            VEConfigItem vEConfigItem = (VEConfigItem) it.next();
            if (vEConfigItem.getId() == i && vEConfigItem.isOpen()) {
                return true;
            }
        }
        return false;
    }
}
