package oop_00000105595_FabianHariyanto.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat ${device.name} ditambahkan ke Hub.")
    }

    fun turnOffAllSwitches() {
        println("\n Mematikan semua saklar pintar.")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
    fun activateSecurityMode() {
        println("\n=> Mengaktifkan Mode Keamanan...")
        for (device in devices) {
            if (device is Recordable) {
                device.startRecord()
            }
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}