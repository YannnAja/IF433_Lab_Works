package oop_00000105595_FabianHariyanto.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()
    println("=== STARTING SMART HOME INITIALIZATION ===")

    SmartDevice().apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }
}

