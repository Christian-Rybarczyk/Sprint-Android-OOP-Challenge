package com.rybarstudios.ageofempiressprint.viewmodel

import com.rybarstudios.ageofempiressprint.model.*

object ItemListViewModel {

    val empireDataList: MutableList<Empire> = ArrayList()
    val empireDataMap: MutableMap<String, Empire> = HashMap()

    init {
        empireDataList.add(Civilization("Aztecs", "The Conquerors", "Infantry and Monk"))
        empireDataList.add(Civilization("Britons", "Age of Kings", "Foot Archer", true))
        empireDataList.add(Units("Archer", "Quick and light. Weak at close range; excels at battle from distance", "Age of Kings", "Feudal"))
        empireDataList.add(Units("Crossbowman", "Upgraded archer", "Age of Kings", "Castle"))
        empireDataList.add(Structure("Barracks", "Age of Kings", "Dark", true))
        empireDataList.add(Structure("Dock", "Age of Kings", "Dark", true))
        empireDataList.add(Technology("Crossbowman", "Upgrade to Crossbowman", "Age of Kings", "Castle"))
        empireDataList.add(Technology("Thumb Ring", "Faster reload time (10-20%) and 100% accuracy", "Age of Kings", "Castle"))

        empireDataMap[empireDataList[0].name] = empireDataList[0]
        empireDataMap[empireDataList[1].name] = empireDataList[1]
        empireDataMap[empireDataList[2].name] = empireDataList[2]
        empireDataMap[empireDataList[3].name] = empireDataList[3]
        empireDataMap[empireDataList[4].name] = empireDataList[4]
        empireDataMap[empireDataList[5].name] = empireDataList[5]
        empireDataMap[empireDataList[6].name] = empireDataList[6]
        empireDataMap[empireDataList[7].name] = empireDataList[7]
    }
}





