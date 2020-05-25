package com.zego.zegoavkit2.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbConfiguration;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import java.util.concurrent.atomic.AtomicBoolean;

public final class AudioRouteMonitor extends BroadcastReceiver {
    private final int AUDIO_ROUTE_BLUETOOTH = 2;
    private final int AUDIO_ROUTE_HEADSET = 1;
    private final int AUDIO_ROUTE_RECEIVER = 3;
    private final int AUDIO_ROUTE_SPEAKER = 0;
    private final int AUDIO_ROUTE_USB_AUDIO = 4;
    public int mBluetoothOpSeq;
    private Context mContext;
    public AtomicBoolean mIsInited = new AtomicBoolean(false);
    public long mThis;

    static native void onDeviceStateChanged(long j, int i, boolean z, String str);

    static native void onDeviceStateInited(long j, boolean z, boolean z2, boolean z3);

    public final int uninit() {
        this.mIsInited.set(false);
        if (this.mContext == null) {
            return -1;
        }
        this.mContext.unregisterReceiver(this);
        this.mContext = null;
        return 0;
    }

    public final void setThis(long j) {
        this.mThis = j;
    }

    public final int init(Context context) {
        this.mContext = context;
        if (this.mContext == null) {
            return -1;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        this.mContext.registerReceiver(this, intentFilter);
        final AudioManager audioManager = (AudioManager) this.mContext.getSystemService("audio");
        final UsbManager usbManager = (UsbManager) this.mContext.getSystemService("usb");
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r11 = this;
                    com.zego.zegoavkit2.receiver.AudioRouteMonitor r0 = com.zego.zegoavkit2.receiver.AudioRouteMonitor.this
                    r1 = 0
                    r0.mBluetoothOpSeq = r1
                    com.zego.zegoavkit2.receiver.AudioRouteMonitor r0 = com.zego.zegoavkit2.receiver.AudioRouteMonitor.this
                    java.util.concurrent.atomic.AtomicBoolean r0 = r0.mIsInited
                    r2 = 1
                    r0.set(r2)
                    android.media.AudioManager r0 = r4
                    boolean r0 = r0.isWiredHeadsetOn()
                    android.bluetooth.BluetoothAdapter r3 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ Exception -> 0x0020 }
                    int r3 = r3.getProfileConnectionState(r2)     // Catch:{ Exception -> 0x0020 }
                    r4 = 2
                    if (r3 != r4) goto L_0x0020
                    r3 = 1
                    goto L_0x0021
                L_0x0020:
                    r3 = 0
                L_0x0021:
                    android.hardware.usb.UsbManager r4 = r0
                    java.util.HashMap r4 = r4.getDeviceList()
                    java.util.Set r4 = r4.entrySet()
                    java.util.Iterator r4 = r4.iterator()
                    r5 = 0
                L_0x0030:
                    boolean r6 = r4.hasNext()
                    if (r6 == 0) goto L_0x0071
                    java.lang.Object r6 = r4.next()
                    java.util.Map$Entry r6 = (java.util.Map.Entry) r6
                    java.lang.Object r6 = r6.getValue()
                    android.hardware.usb.UsbDevice r6 = (android.hardware.usb.UsbDevice) r6
                    if (r6 != 0) goto L_0x0045
                    goto L_0x0030
                L_0x0045:
                    r7 = 0
                L_0x0046:
                    if (r5 != 0) goto L_0x0030
                    int r8 = r6.getConfigurationCount()
                    if (r7 >= r8) goto L_0x0030
                    android.hardware.usb.UsbConfiguration r8 = r6.getConfiguration(r7)
                    if (r8 != 0) goto L_0x0055
                    goto L_0x006e
                L_0x0055:
                    r9 = 0
                L_0x0056:
                    int r10 = r8.getInterfaceCount()
                    if (r9 >= r10) goto L_0x006e
                    android.hardware.usb.UsbInterface r10 = r8.getInterface(r9)
                    if (r10 != 0) goto L_0x0063
                    goto L_0x006b
                L_0x0063:
                    int r10 = r10.getInterfaceClass()
                    if (r2 != r10) goto L_0x006b
                    r5 = 1
                    goto L_0x006e
                L_0x006b:
                    int r9 = r9 + 1
                    goto L_0x0056
                L_0x006e:
                    int r7 = r7 + 1
                    goto L_0x0046
                L_0x0071:
                    com.zego.zegoavkit2.receiver.AudioRouteMonitor r1 = com.zego.zegoavkit2.receiver.AudioRouteMonitor.this
                    long r1 = r1.mThis
                    com.zego.zegoavkit2.receiver.AudioRouteMonitor.onDeviceStateInited(r1, r0, r3, r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zego.zegoavkit2.receiver.AudioRouteMonitor.C524611.run():void");
            }
        });
        return 0;
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        if (this.mIsInited.get()) {
            String action = intent.getAction();
            Bundle extras = intent.getExtras();
            StringBuilder sb = new StringBuilder("action: ");
            sb.append(action);
            if (extras == null || extras.size() <= 0) {
                str = "";
            } else {
                StringBuilder sb2 = new StringBuilder(", ");
                sb2.append(extras.toString());
                str = sb2.toString();
            }
            sb.append(str);
            final String sb3 = sb.toString();
            boolean z = false;
            if ("android.intent.action.HEADSET_PLUG".equals(action)) {
                if (intent.hasExtra("state")) {
                    int intExtra = intent.getIntExtra("state", 0);
                    long j = this.mThis;
                    if (intExtra == 1) {
                        z = true;
                    }
                    onDeviceStateChanged(j, 1, z, sb3);
                }
            } else if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
                if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", DynamicTabYellowPointVersion.DEFAULT) == 10) {
                    this.mBluetoothOpSeq++;
                    onDeviceStateChanged(this.mThis, 2, false, sb3);
                }
            } else if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
                int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", DynamicTabYellowPointVersion.DEFAULT);
                if (intExtra2 == 2) {
                    this.mBluetoothOpSeq++;
                    final int i = this.mBluetoothOpSeq;
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        public void run() {
                            if (AudioRouteMonitor.this.mIsInited.get() && AudioRouteMonitor.this.mBluetoothOpSeq == i) {
                                AudioRouteMonitor.onDeviceStateChanged(AudioRouteMonitor.this.mThis, 2, true, sb3);
                            }
                        }
                    }, 1500);
                } else {
                    if (intExtra2 == 0) {
                        this.mBluetoothOpSeq++;
                        onDeviceStateChanged(this.mThis, 2, false, sb3);
                    }
                }
            } else if ("android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(action)) {
                UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra("device");
                if (usbDevice != null) {
                    int configurationCount = usbDevice.getConfigurationCount();
                    boolean z2 = false;
                    int i2 = 0;
                    while (!z2 && i2 < configurationCount) {
                        UsbConfiguration configuration = usbDevice.getConfiguration(i2);
                        if (configuration != null) {
                            int interfaceCount = configuration.getInterfaceCount();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= interfaceCount) {
                                    break;
                                }
                                UsbInterface usbInterface = configuration.getInterface(i3);
                                if (usbInterface != null && usbInterface.getInterfaceClass() == 1) {
                                    z2 = true;
                                    break;
                                }
                                i3++;
                            }
                        }
                        i2++;
                    }
                    if (z2) {
                        onDeviceStateChanged(this.mThis, 4, true, sb3);
                    }
                }
            } else if ("android.hardware.usb.action.USB_DEVICE_DETACHED".equals(action)) {
                UsbDevice usbDevice2 = (UsbDevice) intent.getParcelableExtra("device");
                if (usbDevice2 != null) {
                    int configurationCount2 = usbDevice2.getConfigurationCount();
                    boolean z3 = false;
                    int i4 = 0;
                    while (!z3 && i4 < configurationCount2) {
                        UsbConfiguration configuration2 = usbDevice2.getConfiguration(i4);
                        if (configuration2 != null) {
                            int interfaceCount2 = configuration2.getInterfaceCount();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= interfaceCount2) {
                                    break;
                                }
                                UsbInterface usbInterface2 = configuration2.getInterface(i5);
                                if (usbInterface2 != null && usbInterface2.getInterfaceClass() == 1) {
                                    z3 = true;
                                    break;
                                }
                                i5++;
                            }
                        }
                        i4++;
                    }
                    if (z3) {
                        onDeviceStateChanged(this.mThis, 4, false, sb3);
                    }
                }
            }
        }
    }
}
