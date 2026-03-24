package oop_00000105595_FabianHariyanto.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV '$name' menyala.")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV '$name' dimatikan.")
        stopRecord()
    }

    override fun startRecord() {
        println("CCTV mulai merekam video ke penyimpanan lokal.")
    }
}